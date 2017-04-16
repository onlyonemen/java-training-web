package spring.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

public class SpringMain {
	public static void main(String[] args) {
		// 装载定义Bean的配置文件
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring/example/applicationContext-*.xml");
//		ApplicationContext context = new XmlWebApplicationContext();
		// 通过配置文件来getBean
		DIShow dIShow = (DIShow) context.getBean("DIShow");//注意，这里没有new来实例化对象
		// 调用其中的sayHello方法
		dIShow.sayHello();
	}
}
