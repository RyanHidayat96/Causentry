package com.bpjstku.presentation.ewallet.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bpjstku.domain.ewallet.model.EWalletService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fH×\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/bpjstku/presentation/ewallet/model/DataEwalletDetail;", "Landroid/os/Parcelable;", "", "Lcom/bpjstku/domain/ewallet/model/EWalletService;", "p0", "<init>", "(Ljava/util/List;)V", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "p1", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "Ljava/util/List;", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DataEwalletDetail implements Parcelable {
    public static final Parcelable.Creator<DataEwalletDetail> CREATOR = new TuitionPaymentFragmentspecialinlinedviewModeldefault3();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final List<EWalletService> TuitionPaymentFragmentbindingInflater1;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public DataEwalletDetail(List<EWalletService> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.TuitionPaymentFragmentbindingInflater1 = list;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof DataEwalletDetail) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, ((DataEwalletDetail) p0).TuitionPaymentFragmentbindingInflater1);
    }

    public final int hashCode() {
        return this.TuitionPaymentFragmentbindingInflater1.hashCode();
    }

    public final String toString() {
        List<EWalletService> list = this.TuitionPaymentFragmentbindingInflater1;
        StringBuilder sb = new StringBuilder("DataEwalletDetail(TuitionPaymentFragmentbindingInflater1=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        List<EWalletService> list = this.TuitionPaymentFragmentbindingInflater1;
        p0.writeInt(list.size());
        Iterator<EWalletService> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(p0, p1);
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Parcelable.Creator<DataEwalletDetail> {
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DataEwalletDetail createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(EWalletService.CREATOR.createFromParcel(parcel));
            }
            return new DataEwalletDetail(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DataEwalletDetail[] newArray(int i) {
            return new DataEwalletDetail[i];
        }
    }
}
