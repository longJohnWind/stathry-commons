/*
 * Copyright © PING AN INSURANCE (GROUP) COMPANY OF CHINA ，LTD. All Rights Reserved
 */
package com.pingan.commons.components.convert;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import com.pingan.commons.components.annotation.validation.VDate;

/**
 * @author dongdaiming911@pingan.com
 * @date 2017年5月21日
 */
public class Bean3 {
	@VDate
	@Email
	private String birth;
	
	@NotEmpty
	private String name;

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}