package co.com.bancolombia.jpa.embargos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface EmbargosDataRepository extends CrudRepository<EmbargosData,Long>, QueryByExampleExecutor<EmbargosData> {

}
