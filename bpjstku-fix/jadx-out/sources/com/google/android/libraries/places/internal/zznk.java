package com.google.android.libraries.places.internal;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class zznk {
    public static int zza(int i, int i2, int i3) {
        return zzb(i, i2, i3) ? i3 : i2;
    }

    public static boolean zzb(int i, int i2, int i3) {
        double dZze = zze(i);
        double dZzd = zzd(zze(i2), dZze);
        return dZzd <= 3.0d && dZzd <= zzd(zze(i3), dZze);
    }

    public static void zzc(ImageView imageView, int i) {
        Drawable drawable = imageView.getDrawable();
        int iRgb = Color.rgb(Color.red(i), Color.green(i), Color.blue(i));
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setColorFilter(iRgb, PorterDuff.Mode.SRC_ATOP);
        drawableMutate.setAlpha(Color.alpha(i));
    }

    private static double zzd(double d, double d2) {
        return Math.round(((Math.max(d, d2) + 0.05d) / (Math.min(d, d2) + 0.05d)) * 100.0d) / 100.0d;
    }

    private static double zze(int i) {
        return (zzf(((double) Color.red(i)) / 255.0d) * 0.2126d) + (zzf(((double) Color.green(i)) / 255.0d) * 0.7152d) + (zzf(((double) Color.blue(i)) / 255.0d) * 0.0722d);
    }

    private static double zzf(double d) {
        return d <= 0.03928d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
    }
}
