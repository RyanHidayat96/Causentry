package com.google.android.libraries.places.api.net;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FetchResolvedPhotoUriResponse {
    public abstract Uri getUri();

    public static FetchResolvedPhotoUriResponse newInstance(Uri uri) {
        return new zzi(uri);
    }
}
