package com.xh.comm.entry;

import org.hibernate.validator.constraints.NotBlank;

public class UserBean {

	/**
	 * 用户名
	 */
	@NotBlank(message = "{login.username.notblank}")
	private String username;

	/**
	 * 密码
	 */
	@NotBlank(message = "{login.password.notblank}")
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
