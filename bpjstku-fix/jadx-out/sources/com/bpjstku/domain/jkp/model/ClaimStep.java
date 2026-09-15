package com.bpjstku.domain.jkp.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bpjstku.util.enums.TrackingStatusEnum;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a"}, d2 = {"Lcom/bpjstku/domain/jkp/model/ClaimStep;", "Landroid/os/Parcelable;", "Lcom/bpjstku/util/enums/TrackingStatusEnum;", "p0", "", "p1", "p2", "<init>", "(Lcom/bpjstku/util/enums/TrackingStatusEnum;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/bpjstku/util/enums/TrackingStatusEnum;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ClaimStep implements Parcelable {
    public static final Parcelable.Creator<ClaimStep> CREATOR = new TuitionPaymentFragmentspecialinlinedviewModeldefault1();

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final String b;
    public final TrackingStatusEnum TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ClaimStep(TrackingStatusEnum trackingStatusEnum, String str, String str2) {
        Intrinsics.checkNotNullParameter(trackingStatusEnum, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = trackingStatusEnum;
        this.TuitionPaymentFragmentbindingInflater1 = str;
        this.b = str2;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ClaimStep)) {
            return false;
        }
        ClaimStep claimStep = (ClaimStep) p0;
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == claimStep.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, claimStep.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.b, claimStep.b);
    }

    public final int hashCode() {
        return (((this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode() * 31) + this.TuitionPaymentFragmentbindingInflater1.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        TrackingStatusEnum trackingStatusEnum = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str = this.TuitionPaymentFragmentbindingInflater1;
        String str2 = this.b;
        StringBuilder sb = new StringBuilder("ClaimStep(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(trackingStatusEnum);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(str);
        sb.append(", b=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.name());
        p0.writeString(this.TuitionPaymentFragmentbindingInflater1);
        p0.writeString(this.b);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Parcelable.Creator<ClaimStep> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ClaimStep createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ClaimStep(TrackingStatusEnum.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ClaimStep[] newArray(int i) {
            return new ClaimStep[i];
        }
    }
}
