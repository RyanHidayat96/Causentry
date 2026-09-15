package com.bpjstku.domain.report.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00048\u0007@\u0007X\u0087\f¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/bpjstku/domain/report/model/ReportStatus;", "Landroid/os/Parcelable;", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;Z)V", "", "describeContents", "()I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ReportStatus implements Parcelable {
    public static final Parcelable.Creator<ReportStatus> CREATOR = new TuitionPaymentFragmentbindingInflater1();

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ReportStatus(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = z;
    }

    public /* synthetic */ ReportStatus(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ReportStatus)) {
            return false;
        }
        ReportStatus reportStatus = (ReportStatus) p0;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, reportStatus.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == reportStatus.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public final int hashCode() {
        return (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode() * 31) + Boolean.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    public final String toString() {
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        boolean z = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        StringBuilder sb = new StringBuilder("ReportStatus(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(str);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        p0.writeInt(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 ? 1 : 0);
    }

    public static final class TuitionPaymentFragmentbindingInflater1 implements Parcelable.Creator<ReportStatus> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ReportStatus createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ReportStatus(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ReportStatus[] newArray(int i) {
            return new ReportStatus[i];
        }
    }
}
