package co.com.bancolombia.jpa.embargos;

import co.com.bancolombia.jpa.adapter.AdapterOperation;
import co.com.bancolombia.model.embargos.Embargos;
import co.com.bancolombia.model.embargos.gateways.EmbargosRepository;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmbargosRepositoryAdapter extends AdapterOperation<Embargos,EmbargosData,Long,EmbargosDataRepository> implements EmbargosRepository {

    public EmbargosRepositoryAdapter(EmbargosDataRepository repository, ObjectMapper mapper){
        super(repository, mapper, d -> mapper.mapBuilder(d, Embargos.EmbargosBuilder.class).build());
    }

    @Override
    public List<Embargos> findAllembargos() {
        return super.findAll();
    }
}
