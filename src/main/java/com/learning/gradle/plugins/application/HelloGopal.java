package com.learning.gradle.pluins.application;

import org.apache.commons.lang.StringUtils;

public class HelloGopal {
	public static void main(String[] args){
		String name= "gopal";
		if (args.length>0) {
			name=args[0];
		}
		System.out.println("Hello " + StringUtils.capitalize(name));
	}
}