package com.bpjstku.domain.ewallet.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u0005H×\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00058\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\f¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/bpjstku/domain/ewallet/model/EWalletService;", "Landroid/os/Parcelable;", "", "p0", "p1", "", "p2", "p3", "<init>", "(IILjava/lang/String;Ljava/lang/Integer;)V", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "TuitionPaymentFragmentbindingInflater1", "I", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/lang/Integer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class EWalletService implements Parcelable {
    public static final Parcelable.Creator<EWalletService> CREATOR = new TuitionPaymentFragmentbindingInflater1();

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public Integer TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final int TuitionPaymentFragmentbindingInflater1;
    public String b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public EWalletService(int i, int i2, String str, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
        this.TuitionPaymentFragmentbindingInflater1 = i2;
        this.b = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = num;
    }

    public /* synthetic */ EWalletService(int i, int i2, String str, Integer num, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, str, (i3 & 8) != 0 ? null : num);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof EWalletService)) {
            return false;
        }
        EWalletService eWalletService = (EWalletService) p0;
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == eWalletService.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && this.TuitionPaymentFragmentbindingInflater1 == eWalletService.TuitionPaymentFragmentbindingInflater1 && Intrinsics.areEqual(this.b, eWalletService.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, eWalletService.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        int iHashCode2 = Integer.hashCode(this.TuitionPaymentFragmentbindingInflater1);
        int iHashCode3 = this.b.hashCode();
        Integer num = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i2 = this.TuitionPaymentFragmentbindingInflater1;
        String str = this.b;
        Integer num = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        StringBuilder sb = new StringBuilder("EWalletService(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(i);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(i2);
        sb.append(", b=");
        sb.append(str);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(num);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeInt(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        p0.writeInt(this.TuitionPaymentFragmentbindingInflater1);
        p0.writeString(this.b);
        Integer num = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (num == null) {
            iIntValue = 0;
        } else {
            p0.writeInt(1);
            iIntValue = num.intValue();
        }
        p0.writeInt(iIntValue);
    }

    public static final class TuitionPaymentFragmentbindingInflater1 implements Parcelable.Creator<EWalletService> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EWalletService createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EWalletService(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EWalletService[] newArray(int i) {
            return new EWalletService[i];
        }
    }
}
