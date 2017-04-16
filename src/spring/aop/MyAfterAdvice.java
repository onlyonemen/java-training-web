package spring.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class MyAfterAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method m, Object[] args,
			Object target) throws Throwable {
		System.out.println("方法调用结束...");
		System.out.println("目标方法的返回值是 : " + returnValue);
		System.out.println("目标方法是 : " + m);
		System.out.println("目标方法的参数是 : " + args);
		System.out.println("目标对象是 : " + target);

	}

}
