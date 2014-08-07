package com.zhangqi.duck.demo;

import java.util.Map;

import com.zhangqi.duck.inf.Flyable;

public abstract class Duck {

	/**
	 * ﬂ…ﬂ…Ω–
	 */
	public void quack() {
		System.out.println("ﬂ…ﬂ…Ω–");
	}

	/**
	 * ”Œ”æ
	 */
	public void swim() {
		System.out.println("”Œ”æ");
	}

	public Map<String, String> display;

	public Flyable f;
}
