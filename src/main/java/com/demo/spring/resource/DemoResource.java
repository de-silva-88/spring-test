package com.demo.spring.resource;

import com.demo.spring.bean.TestBean;
import com.demo.spring.bean.config.AppConfig;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
@Path("/serv")
//@Produces(MediaType.APPLICATION_JSON)
public class DemoResource {

    @GET
    public String sayHi() {
        log.info("[SERVICE TESTING]");
        ApplicationContext appContext = new ClassPathXmlApplicationContext(AppConfig.SPRING_CONFIG.getAppContextConfigFile());
        TestBean testBean = appContext.getBean("testBean", TestBean.class);
        return testBean.sendHi();
    }
}
