package chap06.textbook.s061504;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {
	String value() default "-";
	int number() default 15;
}


// 스킵 1권에선 9번, 11번은(얘는 배운건만)






//15 18 13 12 순으로배움
//
//14 16은 쌤한테안배움