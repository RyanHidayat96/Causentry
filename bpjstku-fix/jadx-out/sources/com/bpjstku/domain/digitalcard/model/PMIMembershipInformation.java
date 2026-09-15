package com.bpjstku.domain.digitalcard.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0010J\u0010\u0010\u0016\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u001c\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010\u001dR\u0014\u0010\"\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001dR\u0014\u0010#\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0014\u0010%\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001dR\u0014\u0010 \u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001dR\u0014\u0010!\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001dR\u0014\u0010&\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001d"}, d2 = {"Lcom/bpjstku/domain/digitalcard/model/PMIMembershipInformation;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "asBinder", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "asInterface", "g", "a"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class PMIMembershipInformation implements Parcelable {
    public static final Parcelable.Creator<PMIMembershipInformation> CREATOR = new TuitionPaymentFragmentspecialinlinedviewModeldefault1();

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final String a;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String d;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final String b;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final String g;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String asBinder;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentbindingInflater1;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public PMIMembershipInformation(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str2;
        this.TuitionPaymentFragmentbindingInflater1 = str3;
        this.b = str4;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str5;
        this.g = str6;
        this.d = str7;
        this.asBinder = str8;
        this.a = str9;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof PMIMembershipInformation)) {
            return false;
        }
        PMIMembershipInformation pMIMembershipInformation = (PMIMembershipInformation) p0;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, pMIMembershipInformation.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, pMIMembershipInformation.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, pMIMembershipInformation.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.b, pMIMembershipInformation.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, pMIMembershipInformation.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.g, pMIMembershipInformation.g) && Intrinsics.areEqual(this.d, pMIMembershipInformation.d) && Intrinsics.areEqual(this.asBinder, pMIMembershipInformation.asBinder) && Intrinsics.areEqual(this.a, pMIMembershipInformation.a);
    }

    public final int hashCode() {
        return (((((((((((((((this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode() * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode()) * 31) + this.TuitionPaymentFragmentbindingInflater1.hashCode()) * 31) + this.b.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode()) * 31) + this.g.hashCode()) * 31) + this.d.hashCode()) * 31) + this.asBinder.hashCode()) * 31) + this.a.hashCode();
    }

    public final String toString() {
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str3 = this.TuitionPaymentFragmentbindingInflater1;
        String str4 = this.b;
        String str5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str6 = this.g;
        String str7 = this.d;
        String str8 = this.asBinder;
        String str9 = this.a;
        StringBuilder sb = new StringBuilder("PMIMembershipInformation(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(str);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(str2);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(str3);
        sb.append(", b=");
        sb.append(str4);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(str5);
        sb.append(", g=");
        sb.append(str6);
        sb.append(", d=");
        sb.append(str7);
        sb.append(", asBinder=");
        sb.append(str8);
        sb.append(", a=");
        sb.append(str9);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        p0.writeString(this.TuitionPaymentFragmentbindingInflater1);
        p0.writeString(this.b);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        p0.writeString(this.g);
        p0.writeString(this.d);
        p0.writeString(this.asBinder);
        p0.writeString(this.a);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Parcelable.Creator<PMIMembershipInformation> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PMIMembershipInformation createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PMIMembershipInformation(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PMIMembershipInformation[] newArray(int i) {
            return new PMIMembershipInformation[i];
        }
    }
}
