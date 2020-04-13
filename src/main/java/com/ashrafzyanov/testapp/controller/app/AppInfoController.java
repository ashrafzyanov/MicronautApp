package com.ashrafzyanov.testapp.controller.app;

import com.ashrafzyanov.testapp.service.AppInfoService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.validation.Validated;
import io.reactivex.Single;

import javax.inject.Inject;
import javax.validation.constraints.NotBlank;


@Controller("/app")
@Validated
public class AppInfoController {

    @Inject
    private AppInfoService appInfoService;

    @Get(uri = "/info")
    public Single<String> info() {
        return Single.just(appInfoService.getAppInfo());
    }

}
