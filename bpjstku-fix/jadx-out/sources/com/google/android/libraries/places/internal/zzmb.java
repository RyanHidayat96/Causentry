package com.google.android.libraries.places.internal;

import android.content.Context;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/* JADX INFO: loaded from: classes3.dex */
public final class zzmb implements zzbep {
    public static RequestQueue zza(Context context) {
        RequestQueue requestQueueNewRequestQueue = Volley.newRequestQueue(context);
        zzber.zza(requestQueueNewRequestQueue);
        return requestQueueNewRequestQueue;
    }

    @Override // com.google.android.libraries.places.internal.zzcbd
    public final /* synthetic */ Object zzb() {
        throw null;
    }
}
