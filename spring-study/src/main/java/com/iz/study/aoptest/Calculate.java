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
public interface Calculate {

	/**
	 * 加法
	 * @param numa
	 * @param numb
	 * @return
	 */
	int add(int numa, int numb);

	/**
	 * 减法
	 * @param numa
	 * @param numb
	 * @return
	 */
	int sub(int numa, int numb);

	/**
	 * 乘法
	 * @param numa
	 * @param numb
	 * @return
	 */
	int mutli(int numa, int numb);

	/**
	 * 除法
	 * @param numa
	 * @param numb
	 * @return
	 */
	int div(int numa, int numb);

	/**
	 * 求模
	 * @param numa
	 * @param numb
	 * @return
	 */
	int mod(int numa, int numb);
}
