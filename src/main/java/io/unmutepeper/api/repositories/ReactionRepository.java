package io.unmutepeper.api.repositories;

import io.unmutepeper.api.entities.Reaction;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by Guyl Bastien on 10/06/2017.
 */
@RepositoryRestResource(collectionResourceRel = "reactions", path = "reactions")
public interface ReactionRepository extends PagingAndSortingRepository<Reaction, Long> {

    List<Reaction> findBySmile(@Param("smile") float smile);

}