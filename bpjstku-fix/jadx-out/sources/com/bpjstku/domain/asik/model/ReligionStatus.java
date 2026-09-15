package com.bpjstku.domain.asik.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00048\u0007@\u0007X\u0087\f¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/bpjstku/domain/asik/model/ReligionStatus;", "Landroid/os/Parcelable;", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;Z)V", "", "describeContents", "()I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ReligionStatus implements Parcelable {
    public static final Parcelable.Creator<ReligionStatus> CREATOR = new TuitionPaymentFragmentspecialinlinedviewModeldefault2();

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentbindingInflater1;
    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ReligionStatus(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.TuitionPaymentFragmentbindingInflater1 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = z;
    }

    public /* synthetic */ ReligionStatus(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ReligionStatus)) {
            return false;
        }
        ReligionStatus religionStatus = (ReligionStatus) p0;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, religionStatus.TuitionPaymentFragmentbindingInflater1) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == religionStatus.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public final int hashCode() {
        return (this.TuitionPaymentFragmentbindingInflater1.hashCode() * 31) + Boolean.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final String toString() {
        String str = this.TuitionPaymentFragmentbindingInflater1;
        boolean z = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        StringBuilder sb = new StringBuilder("ReligionStatus(TuitionPaymentFragmentbindingInflater1=");
        sb.append(str);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.TuitionPaymentFragmentbindingInflater1);
        p0.writeInt(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ? 1 : 0);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements Parcelable.Creator<ReligionStatus> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ReligionStatus createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ReligionStatus(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ReligionStatus[] newArray(int i) {
            return new ReligionStatus[i];
        }
    }
}
