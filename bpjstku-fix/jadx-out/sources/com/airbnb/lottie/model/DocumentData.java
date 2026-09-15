package com.airbnb.lottie.model;

/* JADX INFO: loaded from: classes5.dex */
public final class DocumentData {
    public final float TuitionPaymentFragmentbindingInflater1;
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final float TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f362a;
    public final float asBinder;
    public final float asInterface;
    public final Justification b;
    public final int cancel;
    public final int d;
    public final String g;

    public enum Justification {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public DocumentData(String str, String str2, float f, Justification justification, int i, float f2, float f3, int i2, int i3, float f4, boolean z) {
        this.g = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str2;
        this.asBinder = f;
        this.b = justification;
        this.cancel = i;
        this.TuitionPaymentFragmentbindingInflater1 = f2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = f3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2;
        this.d = i3;
        this.asInterface = f4;
        this.f362a = z;
    }

    public final int hashCode() {
        int iHashCode = (int) ((((this.g.hashCode() * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode()) * 31) + this.asBinder);
        int iOrdinal = this.b.ordinal();
        int i = this.cancel;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.TuitionPaymentFragmentbindingInflater1);
        return (((((((iHashCode * 31) + iOrdinal) * 31) + i) * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }
}
