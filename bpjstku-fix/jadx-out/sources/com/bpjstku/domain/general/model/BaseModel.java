package com.bpjstku.domain.general.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/bpjstku/domain/general/model/BaseModel;", "Landroid/os/Parcelable;", "", "p0", "", "p1", "<init>", "(ZLjava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "isSuccessful", "Z", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()Z", "message", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "()Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class BaseModel implements Parcelable {
    private final boolean isSuccessful;
    private final String message;
    public static final Parcelable.Creator<BaseModel> CREATOR = new TuitionPaymentFragmentbindingInflater1();
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public BaseModel(boolean z, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isSuccessful = z;
        this.message = str;
    }

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from getter */
    public String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from getter */
    public boolean getIsSuccessful() {
        return this.isSuccessful;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeInt(this.isSuccessful ? 1 : 0);
        p0.writeString(this.message);
    }

    public static final class TuitionPaymentFragmentbindingInflater1 implements Parcelable.Creator<BaseModel> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BaseModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BaseModel(parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BaseModel[] newArray(int i) {
            return new BaseModel[i];
        }
    }
}
