package codedream.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author alice
 * @time 2023-05-30 14:26
 **/
@EnableConfigServer
@SpringBootApplication
@EnableDiscoveryClient
public class DistributedConfigApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(
                DistributedConfigApplication.class).web(true).run(args);

    }
}
