package com.koroyan.restassuredexample.repository;

import com.koroyan.restassuredexample.pojos.response.GetListWithNameResult;
import com.koroyan.restassuredexample.pojos.response.PersonIdentification;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NameSearchResult {
    private static List<PersonIdentification> personIdentificationList;


    private static void initializeDatabase() {
        personIdentificationList = new ArrayList<>();
        personIdentificationList.add(new PersonIdentification(12, "Xavier", "555-55-5555", "2001-20-1"));
        personIdentificationList.add(new PersonIdentification(88, "Xavier", "111-11-1111", "2002-21-2"));
        personIdentificationList.add(new PersonIdentification(45, "Xavier", "222-22-2222", "2003-22-3"));
        personIdentificationList.add(new PersonIdentification(128, "Xavier", "333-33-3333", "2004-23-4"));
    }

    public static GetListWithNameResult getPersonByName(String name) {
        initializeDatabase();
        List<PersonIdentification> filteredPersonIdentificationList = personIdentificationList.stream()
                .filter(person -> person.getName().contains(name))
                .collect(Collectors.toList());
        return new GetListWithNameResult(filteredPersonIdentificationList);
    }
}
