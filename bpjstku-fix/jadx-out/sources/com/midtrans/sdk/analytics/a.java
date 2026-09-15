package com.midtrans.sdk.analytics;

import com.google.firebase.messaging.Constants;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes4.dex */
public interface a {
    @GET("/track")
    Call<Integer> a(@Query(Constants.ScionAnalytics.MessageType.DATA_MESSAGE) String str);
}
