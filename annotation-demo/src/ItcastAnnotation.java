import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
public @interface ItcastAnnotation {
    String color() default "blue";
    String value() default "abc";
    int[] arrayAttr() default {3,4,4};
    MetaAnnotation annotationAttr() default @MetaAnnotation("lhm");
}
