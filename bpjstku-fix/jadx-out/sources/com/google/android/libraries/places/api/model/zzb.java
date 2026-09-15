package com.google.android.libraries.places.api.model;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import defpackage.initSession;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzb extends AccessibilityOptions {
    private final Place.BooleanPlaceAttributeValue zza;
    private final Place.BooleanPlaceAttributeValue zzb;
    private final Place.BooleanPlaceAttributeValue zzc;
    private final Place.BooleanPlaceAttributeValue zzd;

    zzb(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue2, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue3, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue4) {
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null wheelchairAccessibleParking");
        }
        this.zza = booleanPlaceAttributeValue;
        if (booleanPlaceAttributeValue2 == null) {
            throw new NullPointerException("Null wheelchairAccessibleEntrance");
        }
        this.zzb = booleanPlaceAttributeValue2;
        if (booleanPlaceAttributeValue3 == null) {
            throw new NullPointerException("Null wheelchairAccessibleRestroom");
        }
        this.zzc = booleanPlaceAttributeValue3;
        if (booleanPlaceAttributeValue4 == null) {
            throw new NullPointerException("Null wheelchairAccessibleSeating");
        }
        this.zzd = booleanPlaceAttributeValue4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AccessibilityOptions)) {
            return false;
        }
        AccessibilityOptions accessibilityOptions = (AccessibilityOptions) obj;
        return this.zza.equals(accessibilityOptions.getWheelchairAccessibleParking()) && this.zzb.equals(accessibilityOptions.getWheelchairAccessibleEntrance()) && this.zzc.equals(accessibilityOptions.getWheelchairAccessibleRestroom()) && this.zzd.equals(accessibilityOptions.getWheelchairAccessibleSeating());
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode();
        int iHashCode2 = this.zzb.hashCode();
        return ((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ this.zzc.hashCode()) * 1000003) ^ this.zzd.hashCode();
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String string2 = this.zzb.toString();
        int length2 = string2.length();
        String string3 = this.zzc.toString();
        int length3 = string3.length();
        String string4 = this.zzd.toString();
        StringBuilder sb = new StringBuilder(length + 80 + length2 + 31 + length3 + 30 + string4.length() + 1);
        sb.append("AccessibilityOptions{wheelchairAccessibleParking=");
        sb.append(string);
        sb.append(", wheelchairAccessibleEntrance=");
        sb.append(string2);
        sb.append(", wheelchairAccessibleRestroom=");
        sb.append(string3);
        sb.append(", wheelchairAccessibleSeating=");
        sb.append(string4);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.AccessibilityOptions
    public final Place.BooleanPlaceAttributeValue getWheelchairAccessibleSeating() throws IllegalAccessException {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 46400), 39 - TextUtils.lastIndexOf("", '0', 0), 19 - View.MeasureSpec.getSize(0), 1513912262, false, "b", null);
        }
        int i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37836 - (ViewConfiguration.getEdgeSlop() >> 16)), (ViewConfiguration.getTapTimeout() >> 16) + 59, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 18, 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
        }
        int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
        long j = i2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Process.getGidForName("") + 37837), MotionEvent.axisFromString("") + 60, TextUtils.indexOf((CharSequence) "", '0', 0) + 19, 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
        long j2 = -55;
        long j3 = (j2 * 479212841614015443L) + (j2 * 5040040655545770796L);
        long j4 = 56;
        long elapsedCpuTime = (int) Process.getElapsedCpuTime();
        long j5 = -1;
        long j6 = j3 + ((((elapsedCpuTime | 479212841614015443L) ^ j5) | 5040040655545770796L) * j4) + (((long) (-56)) * (5185846385701125119L ^ j5)) + (j4 * ((j5 ^ ((elapsedCpuTime ^ j5) | 5040040655545770796L)) | 479212841614015443L));
        int i4 = 0;
        while (true) {
            for (int i5 = 0; i5 != 8; i5++) {
                i3 = (((((int) (j >> i5)) & 255) + (i3 << 6)) + (i3 << 16)) - i3;
            }
            if (i4 != 0) {
                break;
            }
            i4++;
            j = j6;
        }
        if (i3 != i) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46400 - View.MeasureSpec.getSize(0)), Color.red(0) + 40, (ViewConfiguration.getEdgeSlop() >> 16) + 19, -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
            throw new RuntimeException(String.valueOf(i2));
        }
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.AccessibilityOptions
    public final Place.BooleanPlaceAttributeValue getWheelchairAccessibleEntrance() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.AccessibilityOptions
    public final Place.BooleanPlaceAttributeValue getWheelchairAccessibleParking() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.AccessibilityOptions
    public final Place.BooleanPlaceAttributeValue getWheelchairAccessibleRestroom() {
        return this.zzc;
    }
}
