package com.google.android.libraries.places.api.net;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FetchPhotoResponse {
    public static FetchPhotoResponse newInstance(Bitmap bitmap) {
        return new zzc(bitmap);
    }

    public abstract Bitmap getBitmap();
}
