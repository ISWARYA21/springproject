package com.sprintaws;
//import javax.print.Doc;
import springfox.documentation.builders.PathSelectors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
@Component
@Configuration
public class SwaggerConfiguration{
@Bean
    public Docket api() { 
		return new Docket(DocumentationType.OAS_30)  
          .select()                                  
          .apis(RequestHandlerSelectors.basePackage("com.sprintaws")) 
    .paths(PathSelectors.any())                          
          .build().apiInfo(apiEndPointInfo());                         
    }
private ApiInfo apiEndPointInfo() {
    return new ApiInfoBuilder()
            .title("OnlineFoodDelivery1")
            .description("API Example")
          .contact(new Contact ("ishu",null,null))
            .license("Apache License Version 2.0")
            .licenseUrl("http://www.apache.org/license/LICENSE-2.0.html")
            .version("0.0.1-SNAPSHOT")
            .build();
}
}
