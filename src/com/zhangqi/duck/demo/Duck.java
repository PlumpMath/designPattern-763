package com.zhangqi.duck.demo;

import java.util.Map;

import com.zhangqi.duck.inf.Flyable;
/*
 * Ôö¼Ó×¢ÊÍ
 */

public abstract class Duck {

	/**
	 * ßÉßÉ½Ğ
	 */
	public void quack() {
		System.out.println("ßÉßÉ½Ğ");
	}

	/**
	 * ÓÎÓ¾
	 */
	public void swim() {
		System.out.println("ÓÎÓ¾");
	}

	public Map<String, String> display;

	public Flyable f;
}
