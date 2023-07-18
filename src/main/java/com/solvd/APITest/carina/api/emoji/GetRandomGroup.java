package com.solvd.APITest.carina.api.emoji;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${base_url}/random/group/${group}", methodType = HttpMethodType.GET)
public class GetRandomGroup extends AbstractApiMethodV2 {
    public GetRandomGroup(String group){
        replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url"));
        replaceUrlPlaceholder("group", group);
    }
}
