package com.bpjstku.domain.jp.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\fJ\u0010\u0010\u0012\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/bpjstku/domain/jp/model/GetCountClaimJp;", "Landroid/os/Parcelable;", "", "p0", "", "p1", "", "Lcom/bpjstku/domain/jp/model/JpDataTk;", "p2", "<init>", "(Ljava/lang/String;ILjava/util/List;)V", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentbindingInflater1", "I", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/util/List;", "b"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class GetCountClaimJp implements Parcelable {
    public static final Parcelable.Creator<GetCountClaimJp> CREATOR = new b();
    public final int TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final List<JpDataTk> b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public GetCountClaimJp(String str, int i, List<JpDataTk> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
        this.TuitionPaymentFragmentbindingInflater1 = i;
        this.b = list;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof GetCountClaimJp)) {
            return false;
        }
        GetCountClaimJp getCountClaimJp = (GetCountClaimJp) p0;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, getCountClaimJp.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && this.TuitionPaymentFragmentbindingInflater1 == getCountClaimJp.TuitionPaymentFragmentbindingInflater1 && Intrinsics.areEqual(this.b, getCountClaimJp.b);
    }

    public final int hashCode() {
        return (((this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode() * 31) + Integer.hashCode(this.TuitionPaymentFragmentbindingInflater1)) * 31) + this.b.hashCode();
    }

    public final String toString() {
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i = this.TuitionPaymentFragmentbindingInflater1;
        List<JpDataTk> list = this.b;
        StringBuilder sb = new StringBuilder("GetCountClaimJp(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(str);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(i);
        sb.append(", b=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        p0.writeInt(this.TuitionPaymentFragmentbindingInflater1);
        List<JpDataTk> list = this.b;
        p0.writeInt(list.size());
        Iterator<JpDataTk> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(p0, p1);
        }
    }

    public static final class b implements Parcelable.Creator<GetCountClaimJp> {
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ GetCountClaimJp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(JpDataTk.CREATOR.createFromParcel(parcel));
            }
            return new GetCountClaimJp(string, i, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ GetCountClaimJp[] newArray(int i) {
            return new GetCountClaimJp[i];
        }
    }
}
