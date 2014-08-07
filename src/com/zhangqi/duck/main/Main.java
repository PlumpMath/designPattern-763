package com.zhangqi.duck.main;

import com.zhangqi.duck.demo.MallardDuck;
import com.zhangqi.duck.demo.RubberDuck;
import com.zhangqi.duck.inf.impl.FlyNoWay;
import com.zhangqi.duck.inf.impl.FlyWithWings;

public class Main {
	public static void main(String[] args) {
		MallardDuck d = new MallardDuck();
		System.out.println(d.display);
		d.f = new FlyWithWings();
		d.f.fly();
		d.f = new FlyNoWay();
		d.f.fly();
		// d.fly();

		RubberDuck r = new RubberDuck();
		// d.fly();
	}
}
