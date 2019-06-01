package annotation.mate_annotation;

import java.lang.annotation.*;

@Inherited
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Inheritable1 {
}
