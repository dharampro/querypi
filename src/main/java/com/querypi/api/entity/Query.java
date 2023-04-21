package com.querypi.api.entity;

import com.querypi.api.constant.QueryType;
import com.querypi.api.dto.GroupBy;
import com.querypi.api.dto.OrderBy;
import com.querypi.api.dto.Where;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document("query")
public class Query implements Serializable {
    @Id
    private String id;
    private String query;
    private QueryType queryType;

}
