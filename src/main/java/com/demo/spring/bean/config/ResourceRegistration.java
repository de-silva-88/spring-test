package com.demo.spring.bean.config;

import com.demo.spring.resource.DemoResource;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

    
@ApplicationPath("/")
public class ResourceRegistration extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        final Set<Class<?>> classes = new HashSet<Class<?>>();
        classes.add(DemoResource.class);
        return classes;
    }
}
