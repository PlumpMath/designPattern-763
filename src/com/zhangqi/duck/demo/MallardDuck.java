package com.zhangqi.duck.demo;

import java.util.HashMap;
import java.util.Map;

import com.zhangqi.duck.shape.Shape;

/**
 * р╟я╪
 * 
 * @author Administrator
 * 
 */
public class MallardDuck extends Duck {
	public MallardDuck() {
		Map<String, String> m = new HashMap<String, String>();
		m.put(Shape.HEAD.getCode(), "бли╚");
		this.display = m;
	}

}
