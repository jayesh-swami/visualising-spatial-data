package com.jayesh.visualisingspatialdata.domain.spatial;

import com.jayesh.visualisingspatialdata.domain.spatial.enums.SpatialDataNodeType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("spatialNode")
public class SpatialDataNode implements SpatialData {

    @Id
    String id;
    String name;

    List<SpatialDataNode> spatialDataNodes;
    SpatialDataNodeType nodeType;

    @Override
    public String toString() {
        return this.name + " of type: " + this.nodeType.toString();
    }
}
