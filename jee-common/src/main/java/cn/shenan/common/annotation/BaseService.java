package cn.shenan.common.annotation;

import java.lang.annotation.*;

/**
 * 初始化继承BaseService的service
 * Created by shenan on 2017/2/11.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface BaseService {
}
