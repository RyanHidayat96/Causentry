package com.google.android.libraries.places.widget.internal.placedetails;

import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbb {
    public static final zzbc zza(boolean z, List list, Context context) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(context, "");
        float f = context.getResources().getDisplayMetrics().density;
        int i = (int) (context.getResources().getConfiguration().screenWidthDp * f);
        int i2 = (int) (context.getResources().getConfiguration().screenHeightDp * f);
        return new zzbc(z, list, Math.min(i, i2), Math.max(i, i2));
    }
}
