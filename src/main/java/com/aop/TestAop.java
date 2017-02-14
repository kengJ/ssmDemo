package com.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TestAop {

	@Pointcut(value="execution(public * com.dao.impl..*.*(..))")
	public void DaoCut(){}
}
