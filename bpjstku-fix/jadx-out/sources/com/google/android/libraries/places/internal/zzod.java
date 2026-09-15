package com.google.android.libraries.places.internal;

import android.content.Context;
import android.content.res.TypedArray;
import com.google.android.libraries.places.R;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zzod {
    @JvmStatic
    public static final int zza(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        int[] iArr = R.styleable.PlacesMaterialThemeAttrs;
        Intrinsics.checkNotNullExpressionValue(iArr, "");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, iArr);
        int i2 = typedArrayObtainStyledAttributes.getInt((typedArrayObtainStyledAttributes.getResources().getConfiguration().uiMode & 48) == 32 ? R.styleable.PlacesMaterialThemeAttrs_placesColorAttributionDarkTheme : R.styleable.PlacesMaterialThemeAttrs_placesColorAttributionLightTheme, -1);
        zzoe zzoeVar = zzoe.WHITE;
        if (i2 != zzoeVar.zza()) {
            zzoeVar = zzoe.GRAY;
            if (i2 != zzoeVar.zza()) {
                zzoe zzoeVar2 = zzoe.BLACK;
                if (i2 == zzoeVar2.zza()) {
                    zzoeVar = zzoeVar2;
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return context.getColor(zzoeVar.zzb());
    }
}
