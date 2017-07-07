package com.example.demo;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.ServerSetting;

@RestController
@SpringBootApplication
//@MapperScan("com.example.demo.mapper")
public class DemoApplication {
	
	@Autowired
	private ServerSetting setting;
	
	@Value("${server.port}")
	public String port;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@RequestMapping("/hello/{name}")
	void index(@PathVariable String name,HttpServletResponse res){
		try {
			res.getOutputStream().print("hello"+ name + " !,port:"+setting.getPort()+",contextPath:"+setting.getContextPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}