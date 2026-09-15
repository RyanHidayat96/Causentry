package com.bpjstku.presentation.report.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00068\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/bpjstku/presentation/report/model/NearestPlkk;", "Landroid/os/Parcelable;", "", "p0", "", "p1", "", "p2", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Z)V", "describeContents", "()I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/Integer;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/lang/String;", "b", "Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class NearestPlkk implements Parcelable {
    public static final Parcelable.Creator<NearestPlkk> CREATOR = new TuitionPaymentFragmentspecialinlinedviewModeldefault3();

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Integer TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentbindingInflater1;
    public boolean b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public NearestPlkk(Integer num, String str, boolean z) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = num;
        this.TuitionPaymentFragmentbindingInflater1 = str;
        this.b = z;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof NearestPlkk)) {
            return false;
        }
        NearestPlkk nearestPlkk = (NearestPlkk) p0;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, nearestPlkk.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, nearestPlkk.TuitionPaymentFragmentbindingInflater1) && this.b == nearestPlkk.b;
    }

    public final int hashCode() {
        Integer num = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.TuitionPaymentFragmentbindingInflater1;
        return (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.b);
    }

    public final String toString() {
        Integer num = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str = this.TuitionPaymentFragmentbindingInflater1;
        boolean z = this.b;
        StringBuilder sb = new StringBuilder("NearestPlkk(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(num);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(str);
        sb.append(", b=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(p0, "");
        Integer num = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (num == null) {
            iIntValue = 0;
        } else {
            p0.writeInt(1);
            iIntValue = num.intValue();
        }
        p0.writeInt(iIntValue);
        p0.writeString(this.TuitionPaymentFragmentbindingInflater1);
        p0.writeInt(this.b ? 1 : 0);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Parcelable.Creator<NearestPlkk> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ NearestPlkk createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new NearestPlkk(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ NearestPlkk[] newArray(int i) {
            return new NearestPlkk[i];
        }
    }
}
