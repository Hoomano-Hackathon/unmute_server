package io.unmutepeper.api.repositories;

import io.unmutepeper.api.entities.Joke;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "jokes", path = "jokes")
public interface JokeRepository extends PagingAndSortingRepository<Joke, Long> {

    List<Joke> findById(@Param("id") float id);

}