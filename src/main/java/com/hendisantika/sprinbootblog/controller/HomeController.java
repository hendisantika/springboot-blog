package com.hendisantika.sprinbootblog.controller;

import com.hendisantika.sprinbootblog.model.Post;
import com.hendisantika.sprinbootblog.service.PostService;
import com.hendisantika.sprinbootblog.util.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by IntelliJ IDEA.
 * Project : sprinboot-blog
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-04-15
 * Time: 06:12
 */
@Controller
public class HomeController {

    private final PostService postService;

    @Autowired
    public HomeController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/home")
    public String home(@RequestParam(defaultValue = "0") int page,
                       Model model) {

        Page<Post> posts = postService.findAllOrderedByDatePageable(page);
        Pager pager = new Pager(posts);

        model.addAttribute("pager", pager);

        return "/home";
    }
}