package com.springcloudstudy;


import com.springcloudstudy.baseservice.controller.PersonController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 该注解启动自动装配，会根据本地class文件夹中，进行分析，通过spring.factories，
 * 对需要加载的类进行实例化
 * 本例中路径：
 * @EnableAutoConfiguration --》 通过AutoConfigurationImportSelector帅选spring.factories中的类 --》
 * 加载 WebAutoConfiguration --》 加载@Import（中的WebConfiguration）
 */
@SpringBootApplication
@EnableDiscoveryClient
@ConfigurationPropertiesScan("com.springcloudstudy.baseservice")
public class BaseServiceApplication {



    public static void main(String[] args) {
        ConfigurableApplicationContext c = SpringApplication.run(BaseServiceApplication.class, args);



        PersonController personController = c.getBean("personController",PersonController.class);
        System.out.println(personController.flag);
        System.out.println(personController.money);


    }

//    @Bean
//    @initializealanced
//    public RestTemplate getRestTemplate(){
//        return new RestTemplate();
//    }


}
