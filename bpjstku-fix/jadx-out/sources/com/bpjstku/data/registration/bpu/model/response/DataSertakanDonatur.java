package com.bpjstku.data.registration.bpu.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJp\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\u0002H×\u0001¢\u0006\u0004\b \u0010\u000eJ\u001d\u0010#\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020!2\u0006\u0010\u0004\u001a\u00020\u0018¢\u0006\u0004\b#\u0010$R\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u000eR\u001c\u0010(\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b)\u0010\u000eR\u001c\u0010*\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010\u000eR\u001c\u0010,\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010&\u001a\u0004\b-\u0010\u000eR\u001c\u0010.\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010&\u001a\u0004\b/\u0010\u000eR\u001c\u00100\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010&\u001a\u0004\b1\u0010\u000eR\u001c\u00102\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010&\u001a\u0004\b3\u0010\u000eR\u001c\u00104\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010&\u001a\u0004\b5\u0010\u000e"}, d2 = {"Lcom/bpjstku/data/registration/bpu/model/response/DataSertakanDonatur;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/registration/bpu/model/response/DataSertakanDonatur;", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "idSertakan", "Ljava/lang/String;", "getIdSertakan", "kodeKantor", "getKodeKantor", "kodeKepesertaan", "getKodeKepesertaan", "kodePerusahaan", "getKodePerusahaan", "message", "getMessage", "nikBayar", "getNikBayar", "npp", "getNpp", "urlSertakan", "getUrlSertakan"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DataSertakanDonatur implements Parcelable {

    @SerializedName("idSertakan")
    private final String idSertakan;

    @SerializedName("kodeKantor")
    private final String kodeKantor;

    @SerializedName("kodeKepesertaan")
    private final String kodeKepesertaan;

    @SerializedName("kodePerusahaan")
    private final String kodePerusahaan;

    @SerializedName("message")
    private final String message;

    @SerializedName("nikBayar")
    private final String nikBayar;

    @SerializedName("npp")
    private final String npp;

    @SerializedName("urlSertakan")
    private final String urlSertakan;
    public static final Parcelable.Creator<DataSertakanDonatur> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DataSertakanDonatur> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DataSertakanDonatur createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DataSertakanDonatur(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DataSertakanDonatur[] newArray(int i) {
            return new DataSertakanDonatur[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public DataSertakanDonatur(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.idSertakan = str;
        this.kodeKantor = str2;
        this.kodeKepesertaan = str3;
        this.kodePerusahaan = str4;
        this.message = str5;
        this.nikBayar = str6;
        this.npp = str7;
        this.urlSertakan = str8;
    }

    public /* synthetic */ DataSertakanDonatur(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) == 0 ? str8 : "");
    }

    public final String getIdSertakan() {
        return this.idSertakan;
    }

    public final String getKodeKantor() {
        return this.kodeKantor;
    }

    public final String getKodeKepesertaan() {
        return this.kodeKepesertaan;
    }

    public final String getKodePerusahaan() {
        return this.kodePerusahaan;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getNikBayar() {
        return this.nikBayar;
    }

    public final String getNpp() {
        return this.npp;
    }

    public final String getUrlSertakan() {
        return this.urlSertakan;
    }

    public DataSertakanDonatur() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIdSertakan() {
        return this.idSertakan;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKodeKantor() {
        return this.kodeKantor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getKodeKepesertaan() {
        return this.kodeKepesertaan;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getKodePerusahaan() {
        return this.kodePerusahaan;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getNikBayar() {
        return this.nikBayar;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getNpp() {
        return this.npp;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getUrlSertakan() {
        return this.urlSertakan;
    }

    public final DataSertakanDonatur copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7) {
        return new DataSertakanDonatur(p0, p1, p2, p3, p4, p5, p6, p7);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof DataSertakanDonatur)) {
            return false;
        }
        DataSertakanDonatur dataSertakanDonatur = (DataSertakanDonatur) p0;
        return Intrinsics.areEqual(this.idSertakan, dataSertakanDonatur.idSertakan) && Intrinsics.areEqual(this.kodeKantor, dataSertakanDonatur.kodeKantor) && Intrinsics.areEqual(this.kodeKepesertaan, dataSertakanDonatur.kodeKepesertaan) && Intrinsics.areEqual(this.kodePerusahaan, dataSertakanDonatur.kodePerusahaan) && Intrinsics.areEqual(this.message, dataSertakanDonatur.message) && Intrinsics.areEqual(this.nikBayar, dataSertakanDonatur.nikBayar) && Intrinsics.areEqual(this.npp, dataSertakanDonatur.npp) && Intrinsics.areEqual(this.urlSertakan, dataSertakanDonatur.urlSertakan);
    }

    public final int hashCode() {
        String str = this.idSertakan;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.kodeKantor;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.kodeKepesertaan;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.kodePerusahaan;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.message;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.nikBayar;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.npp;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.urlSertakan;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        String str = this.idSertakan;
        String str2 = this.kodeKantor;
        String str3 = this.kodeKepesertaan;
        String str4 = this.kodePerusahaan;
        String str5 = this.message;
        String str6 = this.nikBayar;
        String str7 = this.npp;
        String str8 = this.urlSertakan;
        StringBuilder sb = new StringBuilder("DataSertakanDonatur(idSertakan=");
        sb.append(str);
        sb.append(", kodeKantor=");
        sb.append(str2);
        sb.append(", kodeKepesertaan=");
        sb.append(str3);
        sb.append(", kodePerusahaan=");
        sb.append(str4);
        sb.append(", message=");
        sb.append(str5);
        sb.append(", nikBayar=");
        sb.append(str6);
        sb.append(", npp=");
        sb.append(str7);
        sb.append(", urlSertakan=");
        sb.append(str8);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.idSertakan);
        p0.writeString(this.kodeKantor);
        p0.writeString(this.kodeKepesertaan);
        p0.writeString(this.kodePerusahaan);
        p0.writeString(this.message);
        p0.writeString(this.nikBayar);
        p0.writeString(this.npp);
        p0.writeString(this.urlSertakan);
    }
}
