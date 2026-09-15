package com.bpjstku.domain.tuition.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0013\u001a\u00020\u0006H×\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0014\u0010\u0019\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001fR\u0014\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001a"}, d2 = {"Lcom/bpjstku/domain/tuition/model/TuitionPayment;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "", "p3", "p4", "<init>", "(DDDLjava/lang/String;D)V", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "D", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class TuitionPayment implements Parcelable {
    public static final Parcelable.Creator<TuitionPayment> CREATOR = new TuitionPaymentFragmentspecialinlinedviewModeldefault2();

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final double TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final double TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final double TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final String b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final double TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public TuitionPayment(double d, double d2, double d3, String str, double d4) {
        Intrinsics.checkNotNullParameter(str, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = d;
        this.TuitionPaymentFragmentbindingInflater1 = d2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = d3;
        this.b = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = d4;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof TuitionPayment)) {
            return false;
        }
        TuitionPayment tuitionPayment = (TuitionPayment) p0;
        return Double.compare(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, tuitionPayment.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == 0 && Double.compare(this.TuitionPaymentFragmentbindingInflater1, tuitionPayment.TuitionPaymentFragmentbindingInflater1) == 0 && Double.compare(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, tuitionPayment.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == 0 && Intrinsics.areEqual(this.b, tuitionPayment.b) && Double.compare(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, tuitionPayment.TuitionPaymentFragmentspecialinlinedviewModeldefault1) == 0;
    }

    public final int hashCode() {
        return (((((((Double.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) * 31) + Double.hashCode(this.TuitionPaymentFragmentbindingInflater1)) * 31) + Double.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) * 31) + this.b.hashCode()) * 31) + Double.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    public final String toString() {
        double d = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        double d2 = this.TuitionPaymentFragmentbindingInflater1;
        double d3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str = this.b;
        double d4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        StringBuilder sb = new StringBuilder("TuitionPayment(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(d);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(d2);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(d3);
        sb.append(", b=");
        sb.append(str);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(d4);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeDouble(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        p0.writeDouble(this.TuitionPaymentFragmentbindingInflater1);
        p0.writeDouble(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        p0.writeString(this.b);
        p0.writeDouble(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements Parcelable.Creator<TuitionPayment> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TuitionPayment createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TuitionPayment(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readString(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TuitionPayment[] newArray(int i) {
            return new TuitionPayment[i];
        }
    }
}
