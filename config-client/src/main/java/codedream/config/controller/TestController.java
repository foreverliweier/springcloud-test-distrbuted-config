package codedream.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author alice
 * @time 2023-06-01 14:28
 **/
@RefreshScope
@RestController
public class TestController {
    @Value("${info.desc}")
    private String desc;
    @Value("${info.profile}")
    private String info;

    @RequestMapping("/desc")
    public String desc() {
        return this.desc;
    }

    @RequestMapping("/info")
    public String info() {
        return this.info;
    }
}
