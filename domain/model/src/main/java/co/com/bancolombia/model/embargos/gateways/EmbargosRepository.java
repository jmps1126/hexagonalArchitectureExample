package co.com.bancolombia.model.embargos.gateways;

import co.com.bancolombia.model.embargos.Embargos;

import java.util.List;

public interface EmbargosRepository {

    List<Embargos> findAllembargos();
}
