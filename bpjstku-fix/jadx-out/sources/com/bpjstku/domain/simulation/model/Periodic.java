package com.bpjstku.domain.simulation.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u0011H×\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/bpjstku/domain/simulation/model/Periodic;", "Landroid/os/Parcelable;", "Lcom/bpjstku/domain/simulation/model/PeriodicSummary;", "p0", "", "Lcom/bpjstku/domain/simulation/model/PeriodicDetail;", "p1", "<init>", "(Lcom/bpjstku/domain/simulation/model/PeriodicSummary;Ljava/util/List;)V", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/bpjstku/domain/simulation/model/PeriodicSummary;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Periodic implements Parcelable {
    public static final Parcelable.Creator<Periodic> CREATOR = new TuitionPaymentFragmentspecialinlinedviewModeldefault3();

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final PeriodicSummary b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final List<PeriodicDetail> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public Periodic(PeriodicSummary periodicSummary, List<PeriodicDetail> list) {
        Intrinsics.checkNotNullParameter(periodicSummary, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.b = periodicSummary;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = list;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof Periodic)) {
            return false;
        }
        Periodic periodic = (Periodic) p0;
        return Intrinsics.areEqual(this.b, periodic.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, periodic.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
    }

    public final String toString() {
        PeriodicSummary periodicSummary = this.b;
        List<PeriodicDetail> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        StringBuilder sb = new StringBuilder("Periodic(b=");
        sb.append(periodicSummary);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.b.writeToParcel(p0, p1);
        List<PeriodicDetail> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        p0.writeInt(list.size());
        Iterator<PeriodicDetail> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(p0, p1);
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Parcelable.Creator<Periodic> {
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Periodic createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            PeriodicSummary periodicSummaryCreateFromParcel = PeriodicSummary.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(PeriodicDetail.CREATOR.createFromParcel(parcel));
            }
            return new Periodic(periodicSummaryCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Periodic[] newArray(int i) {
            return new Periodic[i];
        }
    }
}
