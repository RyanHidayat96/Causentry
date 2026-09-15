package com.bpjstku.domain.asik.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/bpjstku/domain/asik/model/UpdateDocument;", "Landroid/os/Parcelable;", "", "p0", "", "p1", "<init>", "(ZLjava/lang/String;)V", "", "describeContents", "()I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Z", "TuitionPaymentFragmentbindingInflater1", "b", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class UpdateDocument implements Parcelable {
    public static final Parcelable.Creator<UpdateDocument> CREATOR = new TuitionPaymentFragmentspecialinlinedviewModeldefault2();

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final boolean TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public UpdateDocument(boolean z, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.TuitionPaymentFragmentbindingInflater1 = z;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof UpdateDocument)) {
            return false;
        }
        UpdateDocument updateDocument = (UpdateDocument) p0;
        return this.TuitionPaymentFragmentbindingInflater1 == updateDocument.TuitionPaymentFragmentbindingInflater1 && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, updateDocument.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final int hashCode() {
        return (Boolean.hashCode(this.TuitionPaymentFragmentbindingInflater1) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
    }

    public final String toString() {
        boolean z = this.TuitionPaymentFragmentbindingInflater1;
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        StringBuilder sb = new StringBuilder("UpdateDocument(TuitionPaymentFragmentbindingInflater1=");
        sb.append(z);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeInt(this.TuitionPaymentFragmentbindingInflater1 ? 1 : 0);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements Parcelable.Creator<UpdateDocument> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ UpdateDocument createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new UpdateDocument(parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ UpdateDocument[] newArray(int i) {
            return new UpdateDocument[i];
        }
    }
}
