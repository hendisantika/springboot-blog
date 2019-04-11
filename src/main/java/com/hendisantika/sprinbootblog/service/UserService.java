package com.hendisantika.sprinbootblog.service;

import com.hendisantika.sprinbootblog.model.User;

import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 * Project : sprinboot-blog
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-04-12
 * Time: 05:31
 */
public interface UserService {

    Optional<User> findByUsername(String username);

    Optional<User> findByEmail(String email);

    User save(User user);
}