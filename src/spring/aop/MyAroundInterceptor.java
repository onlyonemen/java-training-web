package spring.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAroundInterceptor implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		//����Ŀ�귽��֮ǰִ�еĶ���
        System.out.println("���÷���֮ǰ: invocation����[" + invocation + "]");
        //����Ŀ�귽��
        Object rval = invocation.proceed();
        //����Ŀ�귽��֮��ִ�еĶ���
        System.out.println("���ý���...");
        return rval;

	}

}
