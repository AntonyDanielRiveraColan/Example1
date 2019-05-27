package com.example.demo.utility;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
/**
 * Usar version de swager 1.5.14 swagger anotation swagger model
 * http://localhost:8080/swagger-ui.html#/
 * @Api es la notacion que se utiliza para nombrar en swagger a una clase controlador
 */
public class SwaggerConfiguration {

  /**
   * Investigar el siguiente metodo y que es lo que realiza.
   * @return retorna un objeto
   */

  public Docket documentation() {
    return new Docket(DocumentationType.SWAGGER_2).select()
        .apis(RequestHandlerSelectors.withMethodAnnotation(RestController.class))
        .paths(PathSelectors.any()).build();
  }

}
