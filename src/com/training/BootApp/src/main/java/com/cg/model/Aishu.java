package com.cg.model;

import java.lang.annotation.Annotation;

public class Aishu {

	public static void main(String[] args)
	{
		Aishwarya ash = new Aishwarya();
		Class c=ash.getClass();
		Annotation an = c.getAnnotation(Horoscope.class);
		Horoscope obj = (Horoscope) an;
		System.out.println(obj.zodiac());
		System.out.println(obj.month());
		System.out.println(ash.name);
		System.out.println(ash.age);
	}
}
