package com.zhangqi.duck.demo;

import java.util.HashMap;
import java.util.Map;

import com.zhangqi.duck.shape.Shape;

/**
 * ҰѼ
 * 
 * @author Administrator
 * 
 */
public class MallardDuck extends Duck {
	public MallardDuck() {
		Map<String, String> m = new HashMap<String, String>();
		m.put(Shape.HEAD.getCode(), "��ɫ");
		this.display = m;
	}

}
