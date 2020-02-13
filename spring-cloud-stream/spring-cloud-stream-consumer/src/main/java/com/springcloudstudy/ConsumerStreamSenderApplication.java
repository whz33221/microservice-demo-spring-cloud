package com.springcloudstudy;


import com.springcloudstudy.stream.MySink;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 该注解启动自动装配，会根据本地class文件夹中，进行分析，通过spring.factories，
 * 对需要加载的类进行实例化
 * 本例中路径：
 * @EnableAutoConfiguration --》 通过AutoConfigurationImportSelector帅选spring.factories中的类 --》
 * 加载 WebAutoConfiguration --》 加载@Import（中的WebConfiguration）
 */
@SpringBootApplication
@EnableBinding({MySink.class})
@EnableRabbit
@EnableDiscoveryClient
public class ConsumerStreamSenderApplication {


    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(ConsumerStreamSenderApplication.class, args);
    }



}
