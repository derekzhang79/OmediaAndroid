package org.tsinghua.omedia.annotation.json;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.tsinghua.omedia.data.Jsonable;

/**
 * 
 * @author xuhongfeng
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface JsonArray {

    String name();
    Class<? extends Jsonable> type();
}
