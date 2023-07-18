package com.solvd.APITest.carina.api.emoji;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.RequestTemplatePath;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${base_url}/all/category/travel-and-places", methodType = HttpMethodType.GET)
//@RequestTemplatePath(path = "api/groups/rq.json")
@ResponseTemplatePath(path = "api/groups/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)

public class GetGroups extends AbstractApiMethodV2{
    public GetGroups(){
        replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url"));
    }
}
