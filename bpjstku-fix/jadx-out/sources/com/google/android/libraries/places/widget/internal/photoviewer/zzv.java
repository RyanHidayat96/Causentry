package com.google.android.libraries.places.widget.internal.photoviewer;

import android.content.Context;
import android.content.res.TypedArray;
import com.google.android.libraries.places.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
final class zzv {
    private final Context zza;
    private final int zzb;

    private final float zzc(int i, int i2) {
        int[] iArr = R.styleable.PlacesMaterialThemeAttrs;
        Intrinsics.checkNotNullExpressionValue(iArr, "");
        Context context = this.zza;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(this.zzb, iArr);
        float dimension = typedArrayObtainStyledAttributes.getDimension(i, context.getResources().getDimensionPixelSize(i2));
        typedArrayObtainStyledAttributes.recycle();
        return dimension;
    }

    public final float zza() {
        return zzc(R.styleable.PlacesMaterialThemeAttrs_placesSpacingMedium, R.dimen.gmp_sys_measurement_spacing_medium);
    }

    public final float zzb() {
        return zzc(R.styleable.PlacesMaterialThemeAttrs_placesSpacingLarge, R.dimen.gmp_sys_measurement_spacing_large);
    }

    public zzv(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        this.zza = context;
        this.zzb = i;
    }
}
