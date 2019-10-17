/**
 * 
 */
package test.ypl.jk;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huancs
 *
 */
@RestController
@EnableAutoConfiguration
public class HelloController {
    @RequestMapping("/")
    public String sayHello() {
        return "huancs,测试:hello,jenkins";
    }
}
