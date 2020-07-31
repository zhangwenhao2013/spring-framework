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

package com.iz.study.pojo;

import org.springframework.stereotype.Component;

/**
 * @author zhangwenhao
 * @since 2020/7/31
 */

@Component
public class User {
	private String name = "zzz";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
