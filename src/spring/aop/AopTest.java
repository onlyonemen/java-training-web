package spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {
	public static void main(String[] args) throws Exception {
		// ����Spring����
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/aop/bean.xml");
		// ��ȡ�������
		Person p = (Person) ctx.getBean("person");
		// ִ��info����
		p.info();
		System.out.println("===========================================");
		// ִ��run����
		p.run();
	}

}
