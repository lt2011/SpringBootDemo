/**
 * 
 */
package com.example;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author liutao liutao2017年11月20日
 */
@Component
@ConfigurationProperties(prefix = "ftp")
public class Env {
	private String ftpUserName;
	private String passWord;

	public Env() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Env(String ftpUserName, String passWord) {
		super();
		this.ftpUserName = ftpUserName;
		this.passWord = passWord;
	}

	public String getFtpUserName() {
		return ftpUserName;
	}

	public void setFtpUserName(String ftpUserName) {
		this.ftpUserName = ftpUserName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

}
