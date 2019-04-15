package com.hendisantika.springbootblog.repository;

import com.hendisantika.springbootblog.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : sprinboot-blog
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-04-11
 * Time: 21:32
 */
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
