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

import com.iz.study.config.Phone;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhangwenhao
 * @since 2020/9/27
 */
public class Test {


	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
	/*	Calculate calculate = context.getBean("getCalculateProxyFactoryBean", Calculate.class);
		calculate.add(1, 9);

		System.out.println("============");

		calculate.sub(1, 9);*/

/*
		Calculate calculate = context.getBean("getCalculateProxyFactoryBeanAdvisor", Calculate.class);
		calculate.add(1, 9);

		System.out.println("============");

		calculate.sub(1, 9);*/


//		Calculate calculate = context.getBean("getMyCalculate", Calculate.class);
//		calculate.add(1, 9);
//
//		System.out.println("============");
//
//		calculate.sub(1, 9);

		Phone phone = context.getBean(Phone.class);
		System.out.println(phone.getPhoneNum());


	}


}
