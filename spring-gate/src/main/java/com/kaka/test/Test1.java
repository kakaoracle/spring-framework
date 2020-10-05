package com.kaka.test;

import com.kaka.app.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
* 工程构建时用来确定是否构建成功
*
* */
public class Test1 {
	public static void main(String[] args) {
		System.out.println("");
		// 初始化spring容器
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("============构建成功");
	}
}

