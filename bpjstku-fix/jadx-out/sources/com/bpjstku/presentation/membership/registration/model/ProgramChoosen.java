package com.bpjstku.presentation.membership.registration.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\nJ\u0010\u0010\u0010\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/bpjstku/presentation/membership/registration/model/ProgramChoosen;", "Landroid/os/Parcelable;", "", "p0", "", "p1", "p2", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;I)V", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/Integer;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ProgramChoosen implements Parcelable {
    public static final Parcelable.Creator<ProgramChoosen> CREATOR = new b();

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Integer TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ProgramChoosen(Integer num, String str, int i) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = num;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ProgramChoosen)) {
            return false;
        }
        ProgramChoosen programChoosen = (ProgramChoosen) p0;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, programChoosen.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, programChoosen.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == programChoosen.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public final int hashCode() {
        Integer num = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        return (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + Integer.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    public final String toString() {
        Integer num = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        StringBuilder sb = new StringBuilder("ProgramChoosen(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(num);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(str);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(i);
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
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        p0.writeInt(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    public static final class b implements Parcelable.Creator<ProgramChoosen> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ProgramChoosen createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ProgramChoosen(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ProgramChoosen[] newArray(int i) {
            return new ProgramChoosen[i];
        }
    }
}
