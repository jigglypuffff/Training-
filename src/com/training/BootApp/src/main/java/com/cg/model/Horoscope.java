package com.cg.model;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/*@Constraint(validatedBy=AishwaryaImpl.class)*/
@Retention(RUNTIME)
@Target({ TYPE, FIELD, METHOD })
public @interface Horoscope {

	
	 String month() default "April";
	 String zodiac() default "Taurus";
	
	
	
}
