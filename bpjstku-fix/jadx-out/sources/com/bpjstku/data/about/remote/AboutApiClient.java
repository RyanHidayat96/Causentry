package com.bpjstku.data.about.remote;

import com.bpjstku.data.about.model.response.AboutItem;
import defpackage.deriveCodec;
import defpackage.lambdasubmitStillCaptureRequests2;
import kotlin.Metadata;
import retrofit2.Response;
import retrofit2.http.GET;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/about/remote/AboutApiClient;", "", "LderiveCodec;", "Lretrofit2/Response;", "LlambdasubmitStillCaptureRequests2;", "Lcom/bpjstku/data/about/model/response/AboutItem;", "getAboutEvent", "()LderiveCodec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AboutApiClient {
    @GET("5bfcfb53310000290039bfeb")
    deriveCodec<Response<lambdasubmitStillCaptureRequests2<AboutItem>>> getAboutEvent();
}
