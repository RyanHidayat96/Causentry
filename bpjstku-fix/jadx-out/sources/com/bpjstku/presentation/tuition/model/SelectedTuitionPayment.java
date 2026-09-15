package com.bpjstku.presentation.tuition.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0016\u0010\u0016\u001a\u00020\u00058\u0007@\u0007X\u0087\f¢\u0006\u0006\n\u0004\b\u0018\u0010\u001b"}, d2 = {"Lcom/bpjstku/presentation/tuition/model/SelectedTuitionPayment;", "Landroid/os/Parcelable;", "", "p0", "p1", "", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "", "describeContents", "()I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SelectedTuitionPayment implements Parcelable {
    public static final Parcelable.Creator<SelectedTuitionPayment> CREATOR = new TuitionPaymentFragmentbindingInflater1();

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public boolean TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public SelectedTuitionPayment(String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str2;
        this.TuitionPaymentFragmentbindingInflater1 = z;
    }

    public /* synthetic */ SelectedTuitionPayment(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? false : z);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SelectedTuitionPayment)) {
            return false;
        }
        SelectedTuitionPayment selectedTuitionPayment = (SelectedTuitionPayment) p0;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, selectedTuitionPayment.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, selectedTuitionPayment.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && this.TuitionPaymentFragmentbindingInflater1 == selectedTuitionPayment.TuitionPaymentFragmentbindingInflater1;
    }

    public final int hashCode() {
        return (((this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode() * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode()) * 31) + Boolean.hashCode(this.TuitionPaymentFragmentbindingInflater1);
    }

    public final String toString() {
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        boolean z = this.TuitionPaymentFragmentbindingInflater1;
        StringBuilder sb = new StringBuilder("SelectedTuitionPayment(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(str);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(str2);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        p0.writeInt(this.TuitionPaymentFragmentbindingInflater1 ? 1 : 0);
    }

    public static final class TuitionPaymentFragmentbindingInflater1 implements Parcelable.Creator<SelectedTuitionPayment> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SelectedTuitionPayment createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SelectedTuitionPayment(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SelectedTuitionPayment[] newArray(int i) {
            return new SelectedTuitionPayment[i];
        }
    }
}
