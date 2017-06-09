package io.unmutepeper.api.repositories;

import io.unmutepeper.api.entities.Joke;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by Guyl Bastien on 10/06/2017.
 */

@RepositoryRestResource(collectionResourceRel = "joke", path = "jokes")
public interface JokeRepository extends PagingAndSortingRepository<Joke, Long> {

    List<Joke> findByTitle(@Param("title") String title);

}