package com.bpjstku.data.menu.remote;

import com.bpjstku.data.menu.model.response.AvailabilityMenuResponse;
import defpackage.deriveCodec;
import kotlin.Metadata;
import retrofit2.Response;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/menu/remote/MenuApiClient;", "", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/menu/model/response/AvailabilityMenuResponse;", "getMenuAvailability", "()LderiveCodec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface MenuApiClient {
    @POST("menu/find")
    deriveCodec<Response<AvailabilityMenuResponse>> getMenuAvailability();
}
