package com.google.mlkit.common;

import android.content.Context;
import com.google.mlkit.common.sdkinternal.MlKitContext;

/* JADX INFO: loaded from: classes6.dex */
public class MlKit {
    public static void initialize(Context context) {
        MlKitContext.zza(context);
    }

    private MlKit() {
    }
}
