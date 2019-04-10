import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnotation.class)
public @interface MyAnnotation {
    String str() default "Test";
    int val() default 100;
}
