package com.education.tp4;
import java.lang.annotation.*;


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Programmer {
    abstract int id();
    String name();
}
