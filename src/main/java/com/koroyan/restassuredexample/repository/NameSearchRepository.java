package com.koroyan.restassuredexample.repository;

import com.koroyan.restassuredexample.pojos.response.GetListWithNameResult;

public interface NameSearchRepository {
    GetListWithNameResult findByName(String name);
}