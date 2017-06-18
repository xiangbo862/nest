package com.jovezhao.nest.test.appservices;

import com.jovezhao.nest.ddd.builder.IBuilder;
import com.jovezhao.nest.ddd.builder.RepositoryLoader;
import com.jovezhao.nest.starter.AppService;
import com.jovezhao.nest.test.api.UserService;
import com.jovezhao.nest.test.models.User;
import org.springframework.stereotype.Service;

/**
 * Created by zhaofujun on 2017/6/16.
 */
@AppService
public class UserServiceImpl implements UserService {
    @Override
    public String changeName(String name) {
        IBuilder<User> builder = new RepositoryLoader<User>(User.class);
        User user = builder.build("aaa");
        user.setName(name);
        return user.getName() + user.getId();
    }


//    @Autowired
//    private UserService userService;

}
