package co.com.bancolombia.usecase.embargos;

import co.com.bancolombia.model.embargos.Embargos;
import co.com.bancolombia.model.embargos.gateways.EmbargosRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class EmbargosUseCase {

    private final EmbargosRepository embargosRepository;

    public List<Embargos> findAllEmbargos(){

        return embargosRepository.findAllembargos();
    }
}
