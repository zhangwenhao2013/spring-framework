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
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.aop.support.NameMatchMethodPointcutAdvisor;
import org.springframework.aop.support.RegexpMethodPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author zhangwenhao
 * @since 2020/9/27
 */
@Configuration
@Import({ImportConfig.class})
public class BeanConfig {
	@Bean
	public Calculate getMyCalculate() {
		return new MyCalculate();
	}

	@Bean
	public MethodLogAdvice getMethodLogAdvice() {
		return new MethodLogAdvice();
	}

	@Bean
	public MethodInterceptor getMethodInterceptor() {
		return new MethodLogInterceptor();
	}

//	@Bean
//	public ProxyFactoryBean getCalculateProxyFactoryBean() {
//		ProxyFactoryBean bean = new ProxyFactoryBean();
//		bean.setInterceptorNames("getMethodLogAdvice", "getMethodInterceptor");
//		bean.setTarget(getMyCalculate());
//		return bean;
//	}

	/**
	 * 使用 advisor 的方式
	 *
	 * @return
	 */
//	@Bean
//	public NameMatchMethodPointcutAdvisor nameMatchMethodPointcutAdvisor() {
//		NameMatchMethodPointcutAdvisor advisor = new NameMatchMethodPointcutAdvisor();
//		advisor.addMethodName("add");
//		advisor.setAdvice(getMethodLogAdvice());
//		return advisor;
//	}

	@Bean
	public RegexpMethodPointcutAdvisor regexpMethodPointcutAdvisor() {
		RegexpMethodPointcutAdvisor advisor = new RegexpMethodPointcutAdvisor();
		advisor.setPattern("com.iz.study.aoptest.*");
		advisor.setAdvice(getMethodLogAdvice());
		return advisor;
	}

	@Bean
	public ProxyFactoryBean getCalculateProxyFactoryBeanAdvisor() {
		ProxyFactoryBean bean = new ProxyFactoryBean();
		bean.setInterceptorNames("nameMatchMethodPointcutAdvisor");
		bean.setTarget(getMyCalculate());
		return bean;
	}


//	/**
//	 * 使用 自动代理 autoproxy
//	 *
//	 * 使用的时候 不用关心代理类  只需要关系需要的bean
//	 */
//	@Bean
//	public BeanNameAutoProxyCreator autoProxyCreator() {
//		/**
//		 * 根据名字匹配的 自动代理
//		 */
//		BeanNameAutoProxyCreator autoProxyCreator = new BeanNameAutoProxyCreator();
//		/**
//		 * 有点类似 切面
//		 */
//		autoProxyCreator.setBeanNames("getMyCalculate*");
//		/**
//		 * 有点类似 切点
//		 */
//		autoProxyCreator.setInterceptorNames("getMethodInterceptor");
//		return autoProxyCreator;
//	}


	/**
	 * 使用 自动代理 autoproxy
	 *
	 * 使用的时候 不用关心代理类  只需要关系需要的bean
	 */
	@Bean
	public DefaultAdvisorAutoProxyCreator autoProxyCreator() {

		DefaultAdvisorAutoProxyCreator autoProxyCreator = new DefaultAdvisorAutoProxyCreator();

		return autoProxyCreator;
	}



}
