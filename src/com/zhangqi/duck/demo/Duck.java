package com.zhangqi.duck.demo;

import java.util.Map;

import com.zhangqi.duck.inf.Flyable;

public abstract class Duck {

	/**
	 * ���ɽ�
	 */
	public void quack() {
		System.out.println("���ɽ�");
	}

	/**
	 * ��Ӿ
	 */
	public void swim() {
		System.out.println("��Ӿ");
	}

	public Map<String, String> display;

	public Flyable f;
}
