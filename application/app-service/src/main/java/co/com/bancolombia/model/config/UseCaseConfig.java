package co.com.bancolombia.model.config;

import co.com.bancolombia.model.embargos.gateways.EmbargosRepository;
import co.com.bancolombia.usecase.embargos.EmbargosUseCase;
import org.reactivecommons.utils.ObjectMapper;
import org.reactivecommons.utils.ObjectMapperImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public EmbargosUseCase createEmbargosUseCase(EmbargosRepository embargosRepository){
        return new EmbargosUseCase(embargosRepository);
    }

    @Bean
    public ObjectMapper objectMapper(){
        return new ObjectMapperImp();
    }
}
