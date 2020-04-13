package com.ashrafzyanov.testapp.service;

import javax.inject.Singleton;

@Singleton
public class AppInfoServiceImpl implements AppInfoService {

    @Override
    public String getAppInfo() {
        return "App by Ashrafzyanov";
    }

}
