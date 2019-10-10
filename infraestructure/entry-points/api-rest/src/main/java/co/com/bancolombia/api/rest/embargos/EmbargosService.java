package co.com.bancolombia.api.rest.embargos;

import co.com.bancolombia.model.embargos.Embargos;
import co.com.bancolombia.usecase.embargos.EmbargosUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/embargos", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class EmbargosService {

    private final EmbargosUseCase embargosUseCase;

    @GetMapping
    @RequestMapping(path = "/getEmbargos")
    public List<Embargos> getEmbargos(){
        return embargosUseCase.findAllEmbargos();
    }
}
