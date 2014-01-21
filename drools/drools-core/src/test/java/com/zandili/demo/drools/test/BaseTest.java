package com.zandili.demo.drools.test;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit38.AbstractJUnit38SpringContextTests;

@SuppressWarnings("deprecation")
@ContextConfiguration(locations = { "classpath*:applicationContext.xml" })
public class BaseTest extends AbstractJUnit38SpringContextTests {
	public void testBase() {
		System.out.println("--spring test success--");
	}

}
