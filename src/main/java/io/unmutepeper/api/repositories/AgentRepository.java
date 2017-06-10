package io.unmutepeper.api.repositories;

import io.unmutepeper.api.entities.Agent;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "agents", path = "agents")
public interface AgentRepository extends PagingAndSortingRepository<Agent, Long> {

    List<Agent> findById(@Param("id") float id);

}
