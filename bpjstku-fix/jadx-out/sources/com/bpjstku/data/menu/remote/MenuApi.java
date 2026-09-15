package com.bpjstku.data.menu.remote;

import com.bpjstku.data.menu.model.response.AvailabilityMenuResponse;
import defpackage.deriveCodec;
import defpackage.unbindChildren;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0017¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/bpjstku/data/menu/remote/MenuApi;", "LunbindChildren;", "Lcom/bpjstku/data/menu/remote/MenuApiClient;", "p0", "<init>", "(Lcom/bpjstku/data/menu/remote/MenuApiClient;)V", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/menu/model/response/AvailabilityMenuResponse;", "getMenuAvailability", "()LderiveCodec;", "apiClient", "Lcom/bpjstku/data/menu/remote/MenuApiClient;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MenuApi implements unbindChildren, MenuApiClient {
    public static final int $stable = 8;
    private final MenuApiClient apiClient;

    public MenuApi(MenuApiClient menuApiClient) {
        Intrinsics.checkNotNullParameter(menuApiClient, "");
        this.apiClient = menuApiClient;
    }

    @Override // com.bpjstku.data.menu.remote.MenuApiClient
    public final deriveCodec<Response<AvailabilityMenuResponse>> getMenuAvailability() {
        return this.apiClient.getMenuAvailability();
    }
}
