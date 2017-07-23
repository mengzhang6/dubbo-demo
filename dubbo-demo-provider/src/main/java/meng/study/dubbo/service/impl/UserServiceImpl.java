package meng.study.dubbo.service.impl;

import javax.annotation.Resource;

import meng.study.dubbo.dao.UserDao;
import meng.study.dubbo.entity.User;
import meng.study.dubbo.service.UserService;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

	 @Resource
	 private UserDao userDao;

	public User getUserById(int id) {
		// User user = new User();
		// user.setId(id);
		// user.setName("mengzhang6");
		// return user;
		return userDao.getUserById(id);
	}

}
