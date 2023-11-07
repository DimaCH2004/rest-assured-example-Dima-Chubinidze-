package com.koroyan.restassuredexample.repository;

import com.koroyan.restassuredexample.pojos.response.GetListWithNameResult;

public class NameSearchRepositoryImpl implements NameSearchRepository {
    @Override
    public GetListWithNameResult findByName(String name) {
        return NameSearchResult.getPersonByName(name);
    }
}