package spring.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MyBeforeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method m, Object[] args, Object target) throws Throwable {
		System.out.println("��������֮ǰ...");
		System.out.println("�����Ƿ������õ���Ϣ��");
		System.out.println("��ִ�еķ�����:" + m);
		System.out.println("���÷����Ĳ����ǣ�" + args);
		System.out.println("Ŀ������ǣ�" + target);

	}

}
