package meng.study.dubbo.provider;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	/**
	 * 启动服务
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		context.start();
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
			context.close();
		}
	}

}
