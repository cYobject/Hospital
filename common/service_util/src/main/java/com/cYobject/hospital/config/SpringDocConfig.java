package com.cYobject.hospital.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SpringDocConfig {

    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("医院挂号 API")
                        .description("Spring shop sample application")
                        .version("v0.0.1")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                        .description("SpringShop Wiki Documentation")
                        .url("https://springshop.wiki.github.org/docs"));
    }

    //    @Bean
//    public Docket webApiConfig() {
//
//        return new Docket(DocumentationType.OAS_30)
//                .apiInfo(webApiInfo())
//                .select()
//                //只显示api路径下的页面
//                .paths(PathSelectors.ant("/api/.*"))
//                .build();
//
//    }
    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("springshop-public")
                .pathsToMatch("/api/.*")
                .build();
    }

    @Bean
    public GroupedOpenApi adminApi() {
        return GroupedOpenApi.builder()
                .group("hospital")
                .pathsToMatch("/hospital/**")
//                .addMethodFilter(method -> method.isAnnotationPresent(Admin.class))
                .build();
    }


//    @Bean
//    public Docket adminApiConfig() {
//
//        return new Docket(DocumentationType.SWAGGER_2)
//                .groupName("adminApi")
//                .apiInfo(adminApiInfo())
//                .select()
//                //只显示admin路径下的页面
//                .paths(PathSelectors.ant("/admin/.*"))
//                .build();
//
//    }

//    private ApiInfo webApiInfo() {
//
//        return new ApiInfoBuilder()
//                .title("网站-API文档")
//                .description("本文档描述了网站微服务接口定义")
//                .version("1.0")
//                .contact(new Contact("atguigu", "http://atguigu.com", "493211102@qq.com"))
//                .build();
//    }
//
//    private ApiInfo adminApiInfo() {
//
//        return new ApiInfoBuilder()
//                .title("后台管理系统-API文档")
//                .description("本文档描述了后台管理系统微服务接口定义")
//                .version("1.0")
//                .contact(new Contact("atguigu", "http://atguigu.com", "49321112@qq.com"))
//                .build();
//    }


}
