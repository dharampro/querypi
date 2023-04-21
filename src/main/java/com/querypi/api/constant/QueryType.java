package com.querypi.api.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@AllArgsConstructor
public enum QueryType {
    SELECT("SELECT"), UPDATE("UPDATE"), CREATE("CREATE"), DELETE("DELETE");
    private String queryType;
}
