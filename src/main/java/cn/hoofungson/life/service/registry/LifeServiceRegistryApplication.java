package cn.hoofungson.life.service.registry;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@Slf4j
@EnableEurekaServer
@SpringBootApplication
public class LifeServiceRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(LifeServiceRegistryApplication.class, args);
        log.info("============ LifeServiceRegistryApplication启动成功 ============");
    }

}
