package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author liutao liutao2017年4月19日
 */
// 这个注解是让Spring Boot猜测 你想怎么配置Spring，但实际上，它是根据你添加到classpath中的依赖来判断的
// @EnableAutoConfiguration
@SpringBootApplication
// @RestController是一类特殊的@Controller，它的返回值直接作为HTTP Response的Body部分返回给浏览器
@RestController
public class HelloWorldController {

	@Value("${server.ip}")
	private String serverIp;

	@Autowired
	private Env env;

	// @RequestMapping注解表明该方法处理那些URL对应的HTTP请求，也就是我们常说的URL路由（routing)，请求的分发工作是有Spring完成的
	@RequestMapping("/hello")
	public String hello() {
		return "Hello World" + serverIp;
	}

	@RequestMapping("/index")
	public String index() {
		return "Index Page" + " " + env.getFtpUserName() + "," + env.getPassWord();
	}
	
	@RequestMapping("/ok")
	public String ok() {
		return "ok";
	}

}