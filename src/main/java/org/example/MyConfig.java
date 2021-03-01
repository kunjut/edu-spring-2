package org.example;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:app.properties")
public class MyConfig {

    @Bean
    @Scope("singleton")
    public Pet catBean() {
        return new Cat();
    }

    @Bean
    public Person personBean() {
        return new Person(catBean());
    }
}
