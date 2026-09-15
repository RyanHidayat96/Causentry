package com.bpjstku.presentation.membership.payment.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\nJ\u0010\u0010\u0010\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017"}, d2 = {"Lcom/bpjstku/presentation/membership/payment/model/UrlAuthentication;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class UrlAuthentication implements Parcelable {
    public static final Parcelable.Creator<UrlAuthentication> CREATOR = new TuitionPaymentFragmentspecialinlinedviewModeldefault1();

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentbindingInflater1;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public UrlAuthentication(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
        this.TuitionPaymentFragmentbindingInflater1 = str2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str3;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof UrlAuthentication)) {
            return false;
        }
        UrlAuthentication urlAuthentication = (UrlAuthentication) p0;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, urlAuthentication.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, urlAuthentication.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, urlAuthentication.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    public final int hashCode() {
        return (((this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode() * 31) + this.TuitionPaymentFragmentbindingInflater1.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
    }

    public final String toString() {
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str2 = this.TuitionPaymentFragmentbindingInflater1;
        String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        StringBuilder sb = new StringBuilder("UrlAuthentication(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(str);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(str2);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        p0.writeString(this.TuitionPaymentFragmentbindingInflater1);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Parcelable.Creator<UrlAuthentication> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ UrlAuthentication createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new UrlAuthentication(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ UrlAuthentication[] newArray(int i) {
            return new UrlAuthentication[i];
        }
    }
}
