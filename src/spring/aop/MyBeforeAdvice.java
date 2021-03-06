package spring.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MyBeforeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method m, Object[] args, Object target) throws Throwable {
		System.out.println("方法调用之前...");
		System.out.println("下面是方法调用的信息：");
		System.out.println("所执行的方法是:" + m);
		System.out.println("调用方法的参数是：" + args);
		System.out.println("目标对象是：" + target);

	}

}
