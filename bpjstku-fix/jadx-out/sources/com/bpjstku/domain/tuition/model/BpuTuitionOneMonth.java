package com.bpjstku.domain.tuition.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0013\u001a\u00020\u0007H×\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/bpjstku/domain/tuition/model/BpuTuitionOneMonth;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "p3", "", "p4", "<init>", "(DDDDLjava/lang/String;)V", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "D", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentbindingInflater1", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BpuTuitionOneMonth implements Parcelable {
    public static final Parcelable.Creator<BpuTuitionOneMonth> CREATOR = new TuitionPaymentFragmentbindingInflater1();

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final double b;
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final double TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final double TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final double TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public BpuTuitionOneMonth(double d, double d2, double d3, double d4, String str) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = d;
        this.TuitionPaymentFragmentbindingInflater1 = d2;
        this.b = d3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = d4;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof BpuTuitionOneMonth)) {
            return false;
        }
        BpuTuitionOneMonth bpuTuitionOneMonth = (BpuTuitionOneMonth) p0;
        return Double.compare(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, bpuTuitionOneMonth.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == 0 && Double.compare(this.TuitionPaymentFragmentbindingInflater1, bpuTuitionOneMonth.TuitionPaymentFragmentbindingInflater1) == 0 && Double.compare(this.b, bpuTuitionOneMonth.b) == 0 && Double.compare(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, bpuTuitionOneMonth.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == 0 && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, bpuTuitionOneMonth.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    public final int hashCode() {
        int iHashCode = Double.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        int iHashCode2 = Double.hashCode(this.TuitionPaymentFragmentbindingInflater1);
        int iHashCode3 = Double.hashCode(this.b);
        int iHashCode4 = Double.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        double d = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        double d2 = this.TuitionPaymentFragmentbindingInflater1;
        double d3 = this.b;
        double d4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        StringBuilder sb = new StringBuilder("BpuTuitionOneMonth(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(d);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(d2);
        sb.append(", b=");
        sb.append(d3);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(d4);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeDouble(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        p0.writeDouble(this.TuitionPaymentFragmentbindingInflater1);
        p0.writeDouble(this.b);
        p0.writeDouble(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    public static final class TuitionPaymentFragmentbindingInflater1 implements Parcelable.Creator<BpuTuitionOneMonth> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BpuTuitionOneMonth createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BpuTuitionOneMonth(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BpuTuitionOneMonth[] newArray(int i) {
            return new BpuTuitionOneMonth[i];
        }
    }
}
