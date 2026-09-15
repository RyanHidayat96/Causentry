package com.bpjstku.domain.promo.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016"}, d2 = {"Lcom/bpjstku/domain/promo/model/ProvinceMerchant;", "Landroid/os/Parcelable;", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ProvinceMerchant implements Parcelable {
    public static final Parcelable.Creator<ProvinceMerchant> CREATOR = new TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentbindingInflater1;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ProvinceMerchant(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.TuitionPaymentFragmentbindingInflater1 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str2;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ProvinceMerchant)) {
            return false;
        }
        ProvinceMerchant provinceMerchant = (ProvinceMerchant) p0;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, provinceMerchant.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, provinceMerchant.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    public final int hashCode() {
        return (this.TuitionPaymentFragmentbindingInflater1.hashCode() * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
    }

    public final String toString() {
        String str = this.TuitionPaymentFragmentbindingInflater1;
        String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        StringBuilder sb = new StringBuilder("ProvinceMerchant(TuitionPaymentFragmentbindingInflater1=");
        sb.append(str);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.TuitionPaymentFragmentbindingInflater1);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Parcelable.Creator<ProvinceMerchant> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ProvinceMerchant createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ProvinceMerchant(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ProvinceMerchant[] newArray(int i) {
            return new ProvinceMerchant[i];
        }
    }
}
