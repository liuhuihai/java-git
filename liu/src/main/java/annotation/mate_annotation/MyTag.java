package annotation.mate_annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Documented
@Target(ElementType.METHOD)
public @interface MyTag {

    String name() default "";
    String age() default  "5000";
}
