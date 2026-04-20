package com.virtualtrader.backend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootTest
class BackendApplicationTests {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    @DisplayName("Context loads")
    void contextLoads() {
        Assertions.assertNotNull(applicationContext);
    }

    @Test
    @DisplayName("Bean presence")
    void testBeanPresence() {
        String[] beanNames = applicationContext.getBeanDefinitionNames();
        Assertions.assertTrue(beanNames.length > 0);

        boolean hasController = Arrays.stream(beanNames)
                .anyMatch(name -> name.toLowerCase().contains("controller"));

        Assertions.assertTrue(hasController);
    }

    @Test
    @DisplayName("Context integrity")
    void testContextIntegrity() {
        int beanCount = applicationContext.getBeanDefinitionCount();
        Assertions.assertTrue(beanCount > 5);

        String[] beans = applicationContext.getBeanNamesForType(Object.class);
        Assertions.assertNotNull(beans);
        Assertions.assertTrue(beans.length > 0);
    }

    @Test
    @DisplayName("Environment access")
    void testEnvironment() {
        Assertions.assertNotNull(applicationContext.getEnvironment());

        String appName = applicationContext.getEnvironment().getProperty("spring.application.name");

        if (appName != null) {
            Assertions.assertFalse(appName.isEmpty());
        }
    }
}