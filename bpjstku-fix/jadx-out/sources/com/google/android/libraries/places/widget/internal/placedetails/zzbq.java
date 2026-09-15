package com.google.android.libraries.places.widget.internal.placedetails;

import kotlin.ranges.OpenEndRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbq {
    public static final zzbr zza(double d) {
        int i = (int) d;
        if (i <= 0 || i >= 5) {
            return i == 5 ? new zzbr(5, false) : new zzbr(0, false);
        }
        OpenEndRange<Double> openEndRangeRangeUntil = RangesKt.rangeUntil(0.0d, 0.25d);
        Double dValueOf = Double.valueOf(d - ((double) i));
        if (openEndRangeRangeUntil.contains(dValueOf)) {
            return new zzbr(i, false);
        }
        return RangesKt.rangeUntil(0.25d, 0.75d).contains(dValueOf) ? new zzbr(i, true) : new zzbr(i + 1, false);
    }
}
