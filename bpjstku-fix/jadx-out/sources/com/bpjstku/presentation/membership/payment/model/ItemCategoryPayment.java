package com.bpjstku.presentation.membership.payment.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001a\u001a\u00020\u00078\u0007@\u0007X\u0087\f¢\u0006\u0006\n\u0004\b\u0019\u0010\u001e"}, d2 = {"Lcom/bpjstku/presentation/membership/payment/model/ItemCategoryPayment;", "Landroid/os/Parcelable;", "", "p0", "p1", "", "p2", "", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;IZ)V", "describeContents", "()I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "I", "b", "Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ItemCategoryPayment implements Parcelable {
    public static final Parcelable.Creator<ItemCategoryPayment> CREATOR = new TuitionPaymentFragmentspecialinlinedviewModeldefault2();

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public boolean TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final int b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ItemCategoryPayment(String str, String str2, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str2;
        this.b = i;
        this.TuitionPaymentFragmentbindingInflater1 = z;
    }

    public /* synthetic */ ItemCategoryPayment(String str, String str2, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, (i2 & 8) != 0 ? false : z);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ItemCategoryPayment)) {
            return false;
        }
        ItemCategoryPayment itemCategoryPayment = (ItemCategoryPayment) p0;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, itemCategoryPayment.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, itemCategoryPayment.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && this.b == itemCategoryPayment.b && this.TuitionPaymentFragmentbindingInflater1 == itemCategoryPayment.TuitionPaymentFragmentbindingInflater1;
    }

    public final int hashCode() {
        return (((((this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode() * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode()) * 31) + Integer.hashCode(this.b)) * 31) + Boolean.hashCode(this.TuitionPaymentFragmentbindingInflater1);
    }

    public final String toString() {
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i = this.b;
        boolean z = this.TuitionPaymentFragmentbindingInflater1;
        StringBuilder sb = new StringBuilder("ItemCategoryPayment(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(str);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(str2);
        sb.append(", b=");
        sb.append(i);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        p0.writeInt(this.b);
        p0.writeInt(this.TuitionPaymentFragmentbindingInflater1 ? 1 : 0);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements Parcelable.Creator<ItemCategoryPayment> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ItemCategoryPayment createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ItemCategoryPayment(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ItemCategoryPayment[] newArray(int i) {
            return new ItemCategoryPayment[i];
        }
    }
}
