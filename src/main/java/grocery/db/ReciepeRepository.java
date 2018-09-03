package grocery.db;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@CrossOrigin(origins = "http://localhost:8888")
@RepositoryRestResource(collectionResourceRel = "reciepe", path = "reciepe")
public interface ReciepeRepository extends MongoRepository<Reciepe, String> {

	List<Reciepe> findByName(@Param("name") String name);
}
