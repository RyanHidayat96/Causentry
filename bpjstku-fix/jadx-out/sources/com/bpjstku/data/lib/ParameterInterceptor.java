package com.bpjstku.data.lib;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Response;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/bpjstku/data/lib/ParameterInterceptor;", "Lokhttp3/Interceptor;", "Ljava/util/HashMap;", "", "p0", "<init>", "(Ljava/util/HashMap;)V", "Lokhttp3/Interceptor$Chain;", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "Lokhttp3/HttpUrl;", "mapParameters", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/HttpUrl;", "params", "Ljava/util/HashMap;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ParameterInterceptor implements Interceptor {
    public static final int $stable = 8;
    private final HashMap<String, String> params;

    public ParameterInterceptor(HashMap<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.params = map;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain p0) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        return p0.proceed(p0.request().newBuilder().url(mapParameters(p0)).build());
    }

    private final HttpUrl mapParameters(Interceptor.Chain p0) {
        HttpUrl.Builder builderNewBuilder = p0.request().url().newBuilder();
        for (Map.Entry<String, String> entry : this.params.entrySet()) {
            builderNewBuilder.addQueryParameter(entry.getKey(), entry.getValue());
        }
        return builderNewBuilder.build();
    }
}
