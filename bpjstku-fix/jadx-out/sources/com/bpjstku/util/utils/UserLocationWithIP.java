package com.bpjstku.util.utils;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u0005H×\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/bpjstku/util/utils/UserLocationWithIP;", "Landroid/os/Parcelable;", "", "p0", "p1", "", "p2", "<init>", "(DDLjava/lang/String;)V", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "D", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class UserLocationWithIP implements Parcelable {
    public static final Parcelable.Creator<UserLocationWithIP> CREATOR = new b();

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final double TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final double TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public UserLocationWithIP(double d, double d2, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = d;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = d2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof UserLocationWithIP)) {
            return false;
        }
        UserLocationWithIP userLocationWithIP = (UserLocationWithIP) p0;
        return Double.compare(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, userLocationWithIP.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == 0 && Double.compare(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, userLocationWithIP.TuitionPaymentFragmentspecialinlinedviewModeldefault1) == 0 && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, userLocationWithIP.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    public final int hashCode() {
        return (((Double.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) * 31) + Double.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
    }

    public final String toString() {
        double d = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        double d2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        StringBuilder sb = new StringBuilder("UserLocationWithIP(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(d);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(d2);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeDouble(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        p0.writeDouble(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    public static final class b implements Parcelable.Creator<UserLocationWithIP> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ UserLocationWithIP createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new UserLocationWithIP(parcel.readDouble(), parcel.readDouble(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ UserLocationWithIP[] newArray(int i) {
            return new UserLocationWithIP[i];
        }
    }
}
