package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;

/* JADX INFO: loaded from: classes6.dex */
public final class zbaz {
    public static ApiMetadata zba(Context context) {
        zbax.zba();
        return ApiMetadata.fromComplianceOptions(ComplianceOptions.newBuilder(context).build());
    }
}
