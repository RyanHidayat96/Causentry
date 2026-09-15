package com.bpjstku.data.bsu.model.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0018\u0010\nJ\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\nR\u001a\u0010 \u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\nR\u001a\u0010\"\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\nR\u001a\u0010$\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010\n"}, d2 = {"Lcom/bpjstku/data/bsu/model/request/DataRekening;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/bsu/model/request/DataRekening;", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "kodeBank", "Ljava/lang/String;", "getKodeBank", "namaBank", "getNamaBank", "namaRekening", "getNamaRekening", "nomorRekening", "getNomorRekening"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DataRekening implements Parcelable {

    @SerializedName("kodeBank")
    private final String kodeBank;

    @SerializedName("namaBank")
    private final String namaBank;

    @SerializedName("namaRekening")
    private final String namaRekening;

    @SerializedName("nomorRekening")
    private final String nomorRekening;
    public static final Parcelable.Creator<DataRekening> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DataRekening> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DataRekening createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DataRekening(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DataRekening[] newArray(int i) {
            return new DataRekening[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public DataRekening(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.kodeBank = str;
        this.namaBank = str2;
        this.namaRekening = str3;
        this.nomorRekening = str4;
    }

    public final String getKodeBank() {
        return this.kodeBank;
    }

    public final String getNamaBank() {
        return this.namaBank;
    }

    public final String getNamaRekening() {
        return this.namaRekening;
    }

    public final String getNomorRekening() {
        return this.nomorRekening;
    }

    public static /* synthetic */ DataRekening copy$default(DataRekening dataRekening, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dataRekening.kodeBank;
        }
        if ((i & 2) != 0) {
            str2 = dataRekening.namaBank;
        }
        if ((i & 4) != 0) {
            str3 = dataRekening.namaRekening;
        }
        if ((i & 8) != 0) {
            str4 = dataRekening.nomorRekening;
        }
        return dataRekening.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKodeBank() {
        return this.kodeBank;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNamaBank() {
        return this.namaBank;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNamaRekening() {
        return this.namaRekening;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNomorRekening() {
        return this.nomorRekening;
    }

    public final DataRekening copy(String p0, String p1, String p2, String p3) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        return new DataRekening(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof DataRekening)) {
            return false;
        }
        DataRekening dataRekening = (DataRekening) p0;
        return Intrinsics.areEqual(this.kodeBank, dataRekening.kodeBank) && Intrinsics.areEqual(this.namaBank, dataRekening.namaBank) && Intrinsics.areEqual(this.namaRekening, dataRekening.namaRekening) && Intrinsics.areEqual(this.nomorRekening, dataRekening.nomorRekening);
    }

    public final int hashCode() {
        return (((((this.kodeBank.hashCode() * 31) + this.namaBank.hashCode()) * 31) + this.namaRekening.hashCode()) * 31) + this.nomorRekening.hashCode();
    }

    public final String toString() {
        String str = this.kodeBank;
        String str2 = this.namaBank;
        String str3 = this.namaRekening;
        String str4 = this.nomorRekening;
        StringBuilder sb = new StringBuilder("DataRekening(kodeBank=");
        sb.append(str);
        sb.append(", namaBank=");
        sb.append(str2);
        sb.append(", namaRekening=");
        sb.append(str3);
        sb.append(", nomorRekening=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.kodeBank);
        p0.writeString(this.namaBank);
        p0.writeString(this.namaRekening);
        p0.writeString(this.nomorRekening);
    }
}
