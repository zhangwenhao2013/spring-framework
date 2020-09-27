/*
 * Copyright (C) 2011-2020 ShenZhen iBOXCHAIN Information Technology Co.,Ltd.
 *
 * All right reserved.
 *
 * This software is the confidential and proprietary
 * information of iBOXCHAIN Company of China.
 * ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only
 * in accordance with the terms of the contract agreement
 * you entered into with iBOXCHAIN inc.
 *
 */

package com.iz.study.aoptest;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;

/**
 * @author zhangwenhao
 * @since 2020/9/27
 */
public class MethodLogInterceptor implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Method method = invocation.getMethod();
		String name = method.getName();
		System.out.println(" MethodLogInterceptor 执行之前 " + name);
		Object proceed = invocation.proceed();
		System.out.println(" MethodLogInterceptor 执行之后 " + name);
		return proceed;
	}
}
