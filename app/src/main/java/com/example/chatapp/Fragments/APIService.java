package com.example.chatapp.Fragments;

import com.example.chatapp.Notifications.MyResponse;
import com.example.chatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAHXrSbsk:APA91bHOtJpVeVXMt0IfMaZcQQleDX2DDc9o4ToyXeoxoAZSmOlRDn9n-cE5LQDsffBK54eVSORaUWCUt85h9KqWgajba-sn34ev6EaPXnw1I5LFRY_ZWqIKHDyLPxvUXZPEJ7-vhXmi"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
