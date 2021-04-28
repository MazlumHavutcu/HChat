package com.example.hchat.api;

import com.example.hchat.notification.ApiResponse;
import com.example.hchat.notification.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Authorization: key=AAAAiJIXZzU:APA91bEnCcsg-2MocF9EulfZyfGAjk23F3Z7MP2dkus_FtcFclmfhRzpRnP4PZoBfpiRGjv7kwISA_i-unG7oiYXd1khH_jYaFp5EdDc-PgWNo2vuq6hGL3kRQwrvwQSiuYTBbUzPY0e",
                    "Content-Type:application/json"
            }
    )

    @POST("fcm/send")
    Call<ApiResponse> sendNotification(@Body Sender body);
}
