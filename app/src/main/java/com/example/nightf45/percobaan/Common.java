package com.example.nightf45.percobaan;

import com.example.nightf45.percobaan.Remote.IGoogleAPIService;
import com.example.nightf45.percobaan.Remote.RetrofitClient;

public class Common {
    private static final String GOOGLE_API_URL ="https://maps.googleapis.com/";

    public static IGoogleAPIService getGooleAPIService()
    {
        return RetrofitClient.getClient(GOOGLE_API_URL).create(IGoogleAPIService.class);
    }
}
