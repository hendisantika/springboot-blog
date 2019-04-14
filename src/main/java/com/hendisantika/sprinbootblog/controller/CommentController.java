package com.hendisantika.sprinbootblog.controller;

import com.hendisantika.sprinbootblog.service.CommentService;
import com.hendisantika.sprinbootblog.service.PostService;
import com.hendisantika.sprinbootblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by IntelliJ IDEA.
 * Project : sprinboot-blog
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-04-15
 * Time: 06:10
 */
@Controller
public class CommentController {
    private final PostService postService;
    private final UserService userService;
    private final CommentService commentService;

    @Autowired
    public CommentController(PostService postService, UserService userService, CommentService commentService) {
        this.postService = postService;
        this.userService = userService;
        this.commentService = commentService;
    }
}
