package com.bpjstku.util.utils;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fH×\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017"}, d2 = {"Lcom/bpjstku/util/utils/UserLocation;", "Landroid/os/Parcelable;", "", "p0", "p1", "<init>", "(DD)V", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "TuitionPaymentFragmentbindingInflater1", "D", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class UserLocation implements Parcelable {
    public static final Parcelable.Creator<UserLocation> CREATOR = new TuitionPaymentFragmentbindingInflater1();

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final double TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final double b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public UserLocation(double d, double d2) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = d;
        this.b = d2;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof UserLocation)) {
            return false;
        }
        UserLocation userLocation = (UserLocation) p0;
        return Double.compare(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, userLocation.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == 0 && Double.compare(this.b, userLocation.b) == 0;
    }

    public final int hashCode() {
        return (Double.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) * 31) + Double.hashCode(this.b);
    }

    public final String toString() {
        double d = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        double d2 = this.b;
        StringBuilder sb = new StringBuilder("UserLocation(TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(d);
        sb.append(", b=");
        sb.append(d2);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeDouble(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        p0.writeDouble(this.b);
    }

    public static final class TuitionPaymentFragmentbindingInflater1 implements Parcelable.Creator<UserLocation> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ UserLocation createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new UserLocation(parcel.readDouble(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ UserLocation[] newArray(int i) {
            return new UserLocation[i];
        }
    }
}
