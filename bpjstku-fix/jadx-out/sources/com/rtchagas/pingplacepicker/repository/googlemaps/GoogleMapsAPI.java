package com.rtchagas.pingplacepicker.repository.googlemaps;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.rtchagas.pingplacepicker.model.SearchResult;
import defpackage.deriveCodec;
import kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\b"}, d2 = {"Lcom/rtchagas/pingplacepicker/repository/googlemaps/GoogleMapsAPI;", "", "", "p0", "p1", "LderiveCodec;", "Lcom/rtchagas/pingplacepicker/model/SearchResult;", "findByLocation", "(Ljava/lang/String;Ljava/lang/String;)LderiveCodec;", "searchNearby"}, k = 1, mv = {2, 3, 0})
public interface GoogleMapsAPI {
    @GET("geocode/json")
    deriveCodec<SearchResult> findByLocation(@Query("latlng") String p0, @Query("key") String p1);

    @GET("place/nearbysearch/json?rankby=distance")
    deriveCodec<SearchResult> searchNearby(@Query(FirebaseAnalytics.Param.LOCATION) String p0, @Query("key") String p1);
}
