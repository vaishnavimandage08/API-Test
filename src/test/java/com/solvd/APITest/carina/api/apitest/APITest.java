package com.solvd.APITest.carina.api.apitest;


import com.solvd.APITest.carina.api.emoji.GetCategory;
import com.solvd.APITest.carina.api.emoji.GetGroups;

import com.solvd.APITest.carina.api.emoji.GetRandomCategory;
import com.solvd.APITest.carina.api.emoji.GetRandomGroup;
import com.zebrunner.carina.api.apitools.validation.JsonCompareKeywords;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.core.IAbstractTest;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.lang.invoke.MethodHandles;

import static org.hamcrest.Matchers.is;

public class APITest implements IAbstractTest {
    private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Test
    public void testGetAllGroups() {
        GetGroups getGroups = new GetGroups();
        getGroups.callAPIExpectSuccess();
        getGroups.validateResponse(JSONCompareMode.NON_EXTENSIBLE, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
    }

    @Test
    public void testGetAllCategory(){
        GetCategory getCategory = new GetCategory();
        getCategory.callAPIExpectSuccess();
        getCategory.validateResponse(JSONCompareMode.NON_EXTENSIBLE, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
    }

    @Test
    public void testGetRandomCategory_success() {
        String category = "flags";
        GetRandomCategory api = new GetRandomCategory(category);
        api.expectResponseStatus(HttpResponseStatusType.OK_200);
        api.callAPI();
        api.expectResponseContains(is(category));
    }

    @Test
    public void testGetRandomCategory_failure() {
        String category = "abc";
        GetRandomCategory api = new GetRandomCategory(category);
        api.expectResponseStatus(HttpResponseStatusType.NOT_FOUND_404);
        api.callAPI();
        api.expectResponseContains(is("emojis with this category do not exist"));
    }

    @Test
    public void testRandomCategoryJSONSchema()
    {
        GetRandomCategory api = new GetRandomCategory("food-and-drink");
        api.expectResponseStatus(HttpResponseStatusType.OK_200);
        api.callAPI();
        api.validateResponseAgainstSchema("api/category/random_rs.schema");
    }
    @Test
    public void testRandomGroupJSONSchema()
    {
        GetRandomGroup api = new GetRandomGroup("animal-bird");
        api.expectResponseStatus(HttpResponseStatusType.OK_200);
        api.callAPI();
        api.validateResponseAgainstSchema("api/groups/random_rs.schema");
    }

    @Test
    public void testGetRandomGroups_success() {
        String group = "activities";
        GetRandomGroup api = new GetRandomGroup(group);
        api.expectResponseStatus(HttpResponseStatusType.OK_200);
        api.callAPI();
        api.expectResponseContains(is(group));
    }
    @Test
    public void testGetRandomGroups_failure() {
        String group = "abc";
        GetRandomGroup api = new GetRandomGroup(group);
        api.expectResponseStatus(HttpResponseStatusType.NOT_FOUND_404);
        api.callAPI();
        api.expectResponseContains(is("emojis with this category do not exist"));
    }
}
