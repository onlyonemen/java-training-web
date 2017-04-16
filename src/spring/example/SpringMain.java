package spring.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

public class SpringMain {
	public static void main(String[] args) {
		// װ�ض���Bean�������ļ�
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring/example/applicationContext-*.xml");
//		ApplicationContext context = new XmlWebApplicationContext();
		// ͨ�������ļ���getBean
		DIShow dIShow = (DIShow) context.getBean("DIShow");//ע�⣬����û��new��ʵ��������
		// �������е�sayHello����
		dIShow.sayHello();
	}
}
