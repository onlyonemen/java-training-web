package spring.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class MyAfterAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method m, Object[] args,
			Object target) throws Throwable {
		System.out.println("�������ý���...");
		System.out.println("Ŀ�귽���ķ���ֵ�� : " + returnValue);
		System.out.println("Ŀ�귽���� : " + m);
		System.out.println("Ŀ�귽���Ĳ����� : " + args);
		System.out.println("Ŀ������� : " + target);

	}

}
