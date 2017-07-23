package meng.study.dubbo.consumer;

import meng.study.dubbo.entity.User;
import meng.study.dubbo.service.UserService;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		context.start();
		UserService userService = (UserService) context.getBean("userService");
		User user = userService.getUserById(2);
		System.out.println("获取姓名 ==> " + user.getName());
		System.out.println("获取住址 ==> " + user.getAddress());
		context.destroy();
	}
}
