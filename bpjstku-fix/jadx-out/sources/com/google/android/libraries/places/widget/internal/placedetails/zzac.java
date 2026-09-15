package com.google.android.libraries.places.widget.internal.placedetails;

import java.time.DayOfWeek;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zzac {
    public static final /* synthetic */ int[] zza;
    public static final /* synthetic */ int[] zzb;

    static {
        int[] iArr = new int[zzab.values().length];
        try {
            iArr[zzab.OPEN_NOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[zzab.CLOSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[zzab.OPEN_24_HOURS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[zzab.TEMPORARILY_CLOSED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[zzab.PERMANENTLY_CLOSED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[zzab.UNKNOWN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        zza = iArr;
        int[] iArr2 = new int[DayOfWeek.values().length];
        try {
            iArr2[DayOfWeek.MONDAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[DayOfWeek.TUESDAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[DayOfWeek.WEDNESDAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[DayOfWeek.THURSDAY.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[DayOfWeek.FRIDAY.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[DayOfWeek.SATURDAY.ordinal()] = 6;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[DayOfWeek.SUNDAY.ordinal()] = 7;
        } catch (NoSuchFieldError unused13) {
        }
        zzb = iArr2;
    }
}
