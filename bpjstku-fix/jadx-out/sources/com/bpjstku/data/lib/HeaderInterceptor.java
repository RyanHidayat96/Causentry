package com.bpjstku.data.lib;

import com.bpjstku.di.ApiModuleKt;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B3\u0012\"\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\nH\u0017¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013R0\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/bpjstku/data/lib/HeaderInterceptor;", "Lokhttp3/Interceptor;", "Ljava/util/HashMap;", "", "Lkotlin/collections/TuitionPaymentFragmentbindingInflater1;", "p0", "Lcom/bpjstku/data/lib/PreferenceManager;", "p1", "<init>", "(Ljava/util/HashMap;Lcom/bpjstku/data/lib/PreferenceManager;)V", "Lokhttp3/Interceptor$Chain;", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "", "mapAccessToken", "()V", "Lokhttp3/Request;", "mapHeaders", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Request;", "headers", "Ljava/util/HashMap;", "preferenceManager", "Lcom/bpjstku/data/lib/PreferenceManager;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HeaderInterceptor implements Interceptor {
    public static final int $stable = 8;
    private final HashMap<String, String> headers;
    private final PreferenceManager preferenceManager;

    public HeaderInterceptor(HashMap<String, String> map, PreferenceManager preferenceManager) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(preferenceManager, "");
        this.headers = map;
        this.preferenceManager = preferenceManager;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain p0) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        mapAccessToken();
        Intrinsics.checkNotNullExpressionValue(new URL(ApiModuleKt.getMainSubdomain()).getHost(), "");
        return p0.proceed(mapHeaders(p0));
    }

    private final void mapAccessToken() {
        String strConcat;
        HashMap<String, String> map = this.headers;
        if (this.preferenceManager.getString("USER_ACCESS_TOKEN", "").length() > 0) {
            strConcat = "Bearer ".concat(String.valueOf(PreferenceManager.getString$default(this.preferenceManager, "USER_ACCESS_TOKEN", null, 2, null)));
        } else {
            strConcat = "EMPTY";
        }
        map.put("Authorization", strConcat);
    }

    private final Request mapHeaders(Interceptor.Chain p0) {
        Request.Builder builderNewBuilder = p0.request().newBuilder();
        List list = MapsKt.toList(this.headers);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!StringsKt.equals((String) ((Pair) obj).getSecond(), "EMPTY", true)) {
                arrayList.add(obj);
            }
        }
        for (Map.Entry entry : MapsKt.toMap(arrayList).entrySet()) {
            builderNewBuilder.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        return builderNewBuilder.build();
    }
}
