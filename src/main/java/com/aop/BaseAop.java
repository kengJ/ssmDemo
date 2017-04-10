package com.aop;

import java.util.Date;
import java.util.List;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
/**
 * 基础aop
 * @author keng
 *主要执行大范围的拦截
 */
@Component
@Aspect
public class BaseAop {

	@Pointcut(value="execution(* com.dao..*(..))")
	public void DaoCut(){}
	
	@Around("DaoCut()")
	public Object DaoNullException(ProceedingJoinPoint joinPoint){
		String ClassName = joinPoint.getThis().toString();
		String methodName = joinPoint.getSignature().getName();//方法名
		System.out.println(new Date()+"Dao环绕通知:"+ClassName+"=>"+methodName+"= start");
		List<Object> result=null;
		
		try {
			result = (List<Object>) joinPoint.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println(new Date()+"Dao环绕通知异常:"+ClassName+"=>"+methodName);
		}
		//判断非空
		if(result.size()==0){
			result= null;
		}
		System.out.println("结果："+result);
		System.out.println(new Date()+"Dao环绕通知:"+ClassName+"=>"+methodName+"= end");
		return result;
	}
}
