package com.bpjstku.domain.user.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\bJ\u0010\u0010\u000e\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/bpjstku/domain/user/model/UserAccessToken;", "Landroid/os/Parcelable;", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "p1", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class UserAccessToken implements Parcelable {
    public static final Parcelable.Creator<UserAccessToken> CREATOR = new b();

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public UserAccessToken(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof UserAccessToken) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, ((UserAccessToken) p0).TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final int hashCode() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
    }

    public final String toString() {
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        StringBuilder sb = new StringBuilder("UserAccessToken(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public static final class b implements Parcelable.Creator<UserAccessToken> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ UserAccessToken createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new UserAccessToken(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ UserAccessToken[] newArray(int i) {
            return new UserAccessToken[i];
        }
    }
}
