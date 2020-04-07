package com.visionvera.annotation;

import java.lang.annotation.*;

@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface UnifiedInterfaceMeetingLog {
    String description()  default "";
}
