package org.sedlakovi.celery;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Target;

@Inherited
@Target(ElementType.METHOD)
public @interface Task {

}
