package com.google.android.libraries.places.api.auth;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes3.dex */
public interface PlacesAppCheckTokenProvider {
    ListenableFuture<String> fetchAppCheckToken();
}
