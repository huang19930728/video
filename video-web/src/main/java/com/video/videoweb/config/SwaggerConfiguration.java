package com.video.videoweb.config;

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 说明：
 *
 * @author liw@suncd.com
 * @date 2018/11/2 11:34
 */
@Configuration
@EnableSwagger2
@EnableSwaggerBootstrapUI
public class SwaggerConfiguration {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.video"))
                .paths(PathSelectors.any())
                .build();
    }


    private ApiInfo apiInfo() {

        return new ApiInfoBuilder()
                .title("事件处置")
                .description("事件处置接口")
                //.termsOfServiceUrl("http://localhost:8080/")
                //.contact("developer@mail.com")
                .version("1.0")
                .build();

    }
}
