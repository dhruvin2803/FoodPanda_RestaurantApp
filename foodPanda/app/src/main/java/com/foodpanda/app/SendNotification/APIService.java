package com.foodpanda.app.SendNotification;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAnHN50xM:APA91bFi00b6-jbiM4U0rLtDSaSA6aL05sbgu8aggMfDflf64GiiTHYI2hc8hh7_G1OFquUrEUuZGEsJ1gq3kQkrfOhkuc3Zgxm_uo530t57e04iCKXDaeloY6i-rrSdR8wFxZWSQuDa"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body NotificationSender body);
}
