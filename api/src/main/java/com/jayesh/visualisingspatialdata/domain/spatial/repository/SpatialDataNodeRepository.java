package com.jayesh.visualisingspatialdata.domain.spatial.repository;

import com.jayesh.visualisingspatialdata.domain.spatial.SpatialDataNode;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface SpatialDataNodeRepository extends MongoRepository<SpatialDataNode, String> {

    @Query("{name:'?0'}")
    List<SpatialDataNode> findNodesByName(String name);

}
