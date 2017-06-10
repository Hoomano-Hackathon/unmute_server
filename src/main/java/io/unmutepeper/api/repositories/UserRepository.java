package io.unmutepeper.api.repositories;

import io.unmutepeper.api.entities.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by Guyl Bastien on 10/06/2017.
 */
@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

    List<User> findBySmile(@Param("smile") float smile);

}