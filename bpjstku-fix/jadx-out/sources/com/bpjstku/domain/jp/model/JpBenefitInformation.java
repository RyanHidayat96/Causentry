package com.bpjstku.domain.jp.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0003\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0014J\u0010\u0010\u001a\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010 \u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010!R\u0014\u0010&\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010(R\u0014\u0010,\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010(R\u0014\u0010*\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010(R\u0014\u0010-\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010!R\u0014\u0010'\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010!R\u0014\u0010.\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010!R\u0014\u0010/\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010(R\u0014\u00100\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010!"}, d2 = {"Lcom/bpjstku/domain/jp/model/JpBenefitInformation;", "Landroid/os/Parcelable;", "", "p0", "p1", "", "p2", "", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "<init>", "(Ljava/lang/String;Ljava/lang/String;IDDDDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;)V", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "cancelAll", "onTransact", "I", "b", "asInterface", "D", "TuitionPaymentFragmentbindingInflater1", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "g", "a", "d", "INotificationSideChannel", "notify"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class JpBenefitInformation implements Parcelable {
    public static final Parcelable.Creator<JpBenefitInformation> CREATOR = new b();

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final String a;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final double INotificationSideChannel;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final String asInterface;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String notify;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    public final double TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    public final double TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final double g;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final String d;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final double asBinder;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private final int b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public JpBenefitInformation(String str, String str2, int i, double d, double d2, double d3, double d4, String str3, String str4, String str5, double d5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str2;
        this.b = i;
        this.TuitionPaymentFragmentbindingInflater1 = d;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = d2;
        this.g = d3;
        this.asBinder = d4;
        this.a = str3;
        this.asInterface = str4;
        this.d = str5;
        this.INotificationSideChannel = d5;
        this.notify = str6;
    }

    public /* synthetic */ JpBenefitInformation(String str, String str2, int i, double d, double d2, double d3, double d4, String str3, String str4, String str5, double d5, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? 0.0d : d, (i2 & 16) != 0 ? 0.0d : d2, (i2 & 32) != 0 ? 0.0d : d3, (i2 & 64) != 0 ? 0.0d : d4, (i2 & 128) != 0 ? "" : str3, (i2 & 256) != 0 ? "" : str4, (i2 & 512) != 0 ? "" : str5, (i2 & 1024) != 0 ? 0.0d : d5, (i2 & 2048) != 0 ? "" : str6);
    }

    public static final class b implements Parcelable.Creator<JpBenefitInformation> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ JpBenefitInformation createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new JpBenefitInformation(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ JpBenefitInformation[] newArray(int i) {
            return new JpBenefitInformation[i];
        }
    }

    public JpBenefitInformation() {
        this(null, null, 0, 0.0d, 0.0d, 0.0d, 0.0d, null, null, null, 0.0d, null, 4095, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof JpBenefitInformation)) {
            return false;
        }
        JpBenefitInformation jpBenefitInformation = (JpBenefitInformation) p0;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, jpBenefitInformation.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, jpBenefitInformation.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && this.b == jpBenefitInformation.b && Double.compare(this.TuitionPaymentFragmentbindingInflater1, jpBenefitInformation.TuitionPaymentFragmentbindingInflater1) == 0 && Double.compare(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, jpBenefitInformation.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == 0 && Double.compare(this.g, jpBenefitInformation.g) == 0 && Double.compare(this.asBinder, jpBenefitInformation.asBinder) == 0 && Intrinsics.areEqual(this.a, jpBenefitInformation.a) && Intrinsics.areEqual(this.asInterface, jpBenefitInformation.asInterface) && Intrinsics.areEqual(this.d, jpBenefitInformation.d) && Double.compare(this.INotificationSideChannel, jpBenefitInformation.INotificationSideChannel) == 0 && Intrinsics.areEqual(this.notify, jpBenefitInformation.notify);
    }

    public final int hashCode() {
        return (((((((((((((((((((((this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode() * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode()) * 31) + Integer.hashCode(this.b)) * 31) + Double.hashCode(this.TuitionPaymentFragmentbindingInflater1)) * 31) + Double.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) * 31) + Double.hashCode(this.g)) * 31) + Double.hashCode(this.asBinder)) * 31) + this.a.hashCode()) * 31) + this.asInterface.hashCode()) * 31) + this.d.hashCode()) * 31) + Double.hashCode(this.INotificationSideChannel)) * 31) + this.notify.hashCode();
    }

    public final String toString() {
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i = this.b;
        double d = this.TuitionPaymentFragmentbindingInflater1;
        double d2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        double d3 = this.g;
        double d4 = this.asBinder;
        String str3 = this.a;
        String str4 = this.asInterface;
        String str5 = this.d;
        double d5 = this.INotificationSideChannel;
        String str6 = this.notify;
        StringBuilder sb = new StringBuilder("JpBenefitInformation(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(str);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(str2);
        sb.append(", b=");
        sb.append(i);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(d);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(d2);
        sb.append(", g=");
        sb.append(d3);
        sb.append(", asBinder=");
        sb.append(d4);
        sb.append(", a=");
        sb.append(str3);
        sb.append(", asInterface=");
        sb.append(str4);
        sb.append(", d=");
        sb.append(str5);
        sb.append(", INotificationSideChannel=");
        sb.append(d5);
        sb.append(", notify=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        p0.writeInt(this.b);
        p0.writeDouble(this.TuitionPaymentFragmentbindingInflater1);
        p0.writeDouble(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        p0.writeDouble(this.g);
        p0.writeDouble(this.asBinder);
        p0.writeString(this.a);
        p0.writeString(this.asInterface);
        p0.writeString(this.d);
        p0.writeDouble(this.INotificationSideChannel);
        p0.writeString(this.notify);
    }
}
