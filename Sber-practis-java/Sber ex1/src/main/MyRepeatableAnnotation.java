package main;

import java.lang.annotation.Repeatable;

@Repeatable(MyRepeatableAnnotations.class)
public @interface MyRepeatableAnnotation {
    int clocks();
    int priority();
    String description();
}