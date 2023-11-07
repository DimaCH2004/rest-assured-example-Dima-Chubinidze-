package com.koroyan.restassuredexample;
import com.koroyan.restassuredexample.data.NameSearchData;
import com.koroyan.restassuredexample.repository.NameSearchRepository;
import com.koroyan.restassuredexample.repository.NameSearchRepositoryImpl;
import com.koroyan.restassuredexample.steps.Step;
import org.json.JSONException;
import org.skyscreamer.jsonassert.JSONAssert;
import org.testng.annotations.Test;

public class NameSearchTest {
    private Step step = new Step();
    private NameSearchRepository nameSearchRepository = new NameSearchRepositoryImpl();;

    @Test
    public void testPersonListByName() throws JSONException {
        JSONAssert.assertEquals(step.GetByName(NameSearchData.SEARCH_NAME).toString(),
                nameSearchRepository.findByName(NameSearchData.SEARCH_NAME).toString(),
                false);
    }
}