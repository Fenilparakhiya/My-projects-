package org.fenil.photo.Gallery.album.api.config;

import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.*;

 
@Configuration
@OpenAPIDefinition(
  info =@Info(
    title = "Photo Gallery API",
    version = "Verions 1.0",
    contact = @Contact(
      name = "Fenil Parakhiya", email = "fenilparakhiy@gmail.com", url = "http://localhost:8080/swagger-ui/index.html"
    ),
    license = @License(
      name = "Apache 2.0", url = "https://www.apache.org/licenses/LICENSE-2.0"
    ),
    termsOfService = "localhost:3000",
    description = "Photo Gallery Api by Fenil"
)
)
public class SwaggerConfig {
}
