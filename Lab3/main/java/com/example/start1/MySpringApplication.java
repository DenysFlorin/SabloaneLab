package com.example.start1;

import      com.example.start1.difexample.ClientComponent;
import com.example.start1.difexample.SingletonComponent;
import com.example.start1.difexample.TransientComponent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MySpringApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MySpringApplication.class, args);
        TransientComponent transientBean = context.getBean(TransientComponent.class);
        transientBean.operation();

        transientBean = context.getBean(TransientComponent.class);
        transientBean.operation();

        SingletonComponent singletonBean = context.getBean(SingletonComponent.class);
        singletonBean.operation();

        singletonBean = context.getBean(SingletonComponent.class);
        singletonBean.operation();

        ClientComponent clientBean = context.getBean(ClientComponent.class);
        clientBean.operation();

        clientBean = (ClientComponent) context.getBean("clientComponent");
        clientBean.operation();
    }

}
