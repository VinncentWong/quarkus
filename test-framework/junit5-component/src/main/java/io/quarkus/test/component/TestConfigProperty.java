package io.quarkus.test.component;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import io.quarkus.test.component.TestConfigProperty.TestConfigProperties;

/**
 * Set a configuration property for the test.
 *
 * @see QuarkusComponentTest
 * @see QuarkusComponentTestExtension#configProperty(String, String)
 */
@Retention(RUNTIME)
@Target(TYPE)
@Repeatable(TestConfigProperties.class)
public @interface TestConfigProperty {

    String key();

    String value();

    @Retention(RUNTIME)
    @Target(TYPE)
    @interface TestConfigProperties {

        TestConfigProperty[] value();

    }

}
