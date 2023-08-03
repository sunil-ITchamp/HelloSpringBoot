package com.sk.first.mycamel;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ReadMyFile extends RouteBuilder {

    @Value("${spring.application.name}")
    String appName;

    @Override
    public void configure() throws Exception {
        from("file:D:/SpringBootWork/BIGtest/source?readLock=changed")
                .routeId("route" + appName)
                .log("AppName:" + appName + " File is read - contents = ${body}")
                .to("file:D:/SpringBootWork/BIGtest/target")
                .log("AppName:" + appName + " File is moved to target - contents = ${body}");
    }
}
