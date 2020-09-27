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

/**
 * @author zhangwenhao
 * @since 2020/9/27
 */
public class MyCalculate implements Calculate {
	@Override
	public int add(int numa, int numb) {
		System.out.println("add 方法");
		return numa + numb;
	}

	@Override
	public int sub(int numa, int numb) {
		System.out.println("sub 方法");
		return numa - numb;
	}

	@Override
	public int mutli(int numa, int numb) {
		System.out.println("mutli 方法");
		return numa * numb;
	}

	@Override
	public int div(int numa, int numb) {
		System.out.println("div 方法");
		return numa / numb;
	}

	@Override
	public int mod(int numa, int numb) {
		System.out.println("mod 方法");
		return numa % numb;
	}
}
