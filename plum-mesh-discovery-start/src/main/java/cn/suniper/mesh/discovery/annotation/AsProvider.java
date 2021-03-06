package cn.suniper.mesh.discovery.annotation;

import cn.suniper.mesh.discovery.commons.KvSource;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates that this is a service consumer,
 * then PlumApplication will initialize a dynamic
 * service list through the Registry and initialize the
 * corresponding load balancing client according to the configuration.
 *
 * @author Rao Mengnan
 *         on 2018/7/5.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface AsProvider {
    KvSource.Provider kv() default KvSource.Provider.AUTO;
}
