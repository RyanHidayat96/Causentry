package com.bpjstku.domain.complaint.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\fJ\u0010\u0010\u0012\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/bpjstku/domain/complaint/model/TrackingComplaint;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "Lcom/bpjstku/domain/complaint/model/TindakLanjut;", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bpjstku/domain/complaint/model/TindakLanjut;)V", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentbindingInflater1", "b", "Lcom/bpjstku/domain/complaint/model/TindakLanjut;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class TrackingComplaint implements Parcelable {
    public static final Parcelable.Creator<TrackingComplaint> CREATOR = new b();
    public final String TuitionPaymentFragmentbindingInflater1;
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final TindakLanjut b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public TrackingComplaint(String str, String str2, String str3, TindakLanjut tindakLanjut) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str2;
        this.TuitionPaymentFragmentbindingInflater1 = str3;
        this.b = tindakLanjut;
    }

    public /* synthetic */ TrackingComplaint(String str, String str2, String str3, TindakLanjut tindakLanjut, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : tindakLanjut);
    }

    public static final class b implements Parcelable.Creator<TrackingComplaint> {
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TrackingComplaint createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TrackingComplaint(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : TindakLanjut.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TrackingComplaint[] newArray(int i) {
            return new TrackingComplaint[i];
        }
    }

    public TrackingComplaint() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof TrackingComplaint)) {
            return false;
        }
        TrackingComplaint trackingComplaint = (TrackingComplaint) p0;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, trackingComplaint.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, trackingComplaint.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, trackingComplaint.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.b, trackingComplaint.b);
    }

    public final int hashCode() {
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.TuitionPaymentFragmentbindingInflater1;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        TindakLanjut tindakLanjut = this.b;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (tindakLanjut != null ? tindakLanjut.hashCode() : 0);
    }

    public final String toString() {
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str3 = this.TuitionPaymentFragmentbindingInflater1;
        TindakLanjut tindakLanjut = this.b;
        StringBuilder sb = new StringBuilder("TrackingComplaint(TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(str);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(str2);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(str3);
        sb.append(", b=");
        sb.append(tindakLanjut);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        p0.writeString(this.TuitionPaymentFragmentbindingInflater1);
        TindakLanjut tindakLanjut = this.b;
        if (tindakLanjut == null) {
            p0.writeInt(0);
        } else {
            p0.writeInt(1);
            tindakLanjut.writeToParcel(p0, p1);
        }
    }
}
