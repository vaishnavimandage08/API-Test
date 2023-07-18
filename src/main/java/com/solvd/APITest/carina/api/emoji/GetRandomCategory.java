package com.solvd.APITest.carina.api.emoji;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${base_url}/random/category/${category}", methodType = HttpMethodType.GET)
public class GetRandomCategory extends AbstractApiMethodV2 {
    public GetRandomCategory(String category){
        replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url"));
        replaceUrlPlaceholder("category", category);
    }
}
