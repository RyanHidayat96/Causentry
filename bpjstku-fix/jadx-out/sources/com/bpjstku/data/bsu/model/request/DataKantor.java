package com.bpjstku.data.bsu.model.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJB\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0003\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0014J\u0010\u0010\u001a\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001a\u0010\u000bJ\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u00020\u0012¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000bR\u001a\u0010\"\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u000bR\u001a\u0010$\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\u000bR\u001a\u0010&\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\u000bR\u001a\u0010(\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\u000b"}, d2 = {"Lcom/bpjstku/data/bsu/model/request/DataKantor;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "p3", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/bsu/model/request/DataKantor;", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "kodeDivisi", "Ljava/lang/String;", "getKodeDivisi", "kodeKepesertaan", "getKodeKepesertaan", "kodePerusahaan", "getKodePerusahaan", "kodeTk", "getKodeTk", "kpj", "getKpj"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DataKantor implements Parcelable {

    @SerializedName("kodeDivisi")
    private final String kodeDivisi;

    @SerializedName("kodeKepesertaan")
    private final String kodeKepesertaan;

    @SerializedName("kodePerusahaan")
    private final String kodePerusahaan;

    @SerializedName("kodeTk")
    private final String kodeTk;

    @SerializedName("kpj")
    private final String kpj;
    public static final Parcelable.Creator<DataKantor> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DataKantor> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DataKantor createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DataKantor(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DataKantor[] newArray(int i) {
            return new DataKantor[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public DataKantor(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.kodeDivisi = str;
        this.kodeKepesertaan = str2;
        this.kodePerusahaan = str3;
        this.kodeTk = str4;
        this.kpj = str5;
    }

    public final String getKodeDivisi() {
        return this.kodeDivisi;
    }

    public final String getKodeKepesertaan() {
        return this.kodeKepesertaan;
    }

    public final String getKodePerusahaan() {
        return this.kodePerusahaan;
    }

    public final String getKodeTk() {
        return this.kodeTk;
    }

    public final String getKpj() {
        return this.kpj;
    }

    public static /* synthetic */ DataKantor copy$default(DataKantor dataKantor, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dataKantor.kodeDivisi;
        }
        if ((i & 2) != 0) {
            str2 = dataKantor.kodeKepesertaan;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = dataKantor.kodePerusahaan;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = dataKantor.kodeTk;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = dataKantor.kpj;
        }
        return dataKantor.copy(str, str6, str7, str8, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKodeDivisi() {
        return this.kodeDivisi;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKodeKepesertaan() {
        return this.kodeKepesertaan;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getKodePerusahaan() {
        return this.kodePerusahaan;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getKodeTk() {
        return this.kodeTk;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getKpj() {
        return this.kpj;
    }

    public final DataKantor copy(String p0, String p1, String p2, String p3, String p4) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        return new DataKantor(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof DataKantor)) {
            return false;
        }
        DataKantor dataKantor = (DataKantor) p0;
        return Intrinsics.areEqual(this.kodeDivisi, dataKantor.kodeDivisi) && Intrinsics.areEqual(this.kodeKepesertaan, dataKantor.kodeKepesertaan) && Intrinsics.areEqual(this.kodePerusahaan, dataKantor.kodePerusahaan) && Intrinsics.areEqual(this.kodeTk, dataKantor.kodeTk) && Intrinsics.areEqual(this.kpj, dataKantor.kpj);
    }

    public final int hashCode() {
        return (((((((this.kodeDivisi.hashCode() * 31) + this.kodeKepesertaan.hashCode()) * 31) + this.kodePerusahaan.hashCode()) * 31) + this.kodeTk.hashCode()) * 31) + this.kpj.hashCode();
    }

    public final String toString() {
        String str = this.kodeDivisi;
        String str2 = this.kodeKepesertaan;
        String str3 = this.kodePerusahaan;
        String str4 = this.kodeTk;
        String str5 = this.kpj;
        StringBuilder sb = new StringBuilder("DataKantor(kodeDivisi=");
        sb.append(str);
        sb.append(", kodeKepesertaan=");
        sb.append(str2);
        sb.append(", kodePerusahaan=");
        sb.append(str3);
        sb.append(", kodeTk=");
        sb.append(str4);
        sb.append(", kpj=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.kodeDivisi);
        p0.writeString(this.kodeKepesertaan);
        p0.writeString(this.kodePerusahaan);
        p0.writeString(this.kodeTk);
        p0.writeString(this.kpj);
    }
}
