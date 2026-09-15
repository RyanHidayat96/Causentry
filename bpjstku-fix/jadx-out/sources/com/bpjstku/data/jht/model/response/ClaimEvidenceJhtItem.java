package com.bpjstku.data.jht.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000fJ\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJ|\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\"\u0010\u000fJ\u001d\u0010%\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020#2\u0006\u0010\u0004\u001a\u00020\u001a¢\u0006\u0004\b%\u0010&R\u001c\u0010'\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u000fR\u001c\u0010*\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010\u000fR\u001c\u0010,\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010\u000fR\u001c\u0010.\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010(\u001a\u0004\b/\u0010\u000fR\u001c\u00100\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010(\u001a\u0004\b1\u0010\u000fR\u001c\u00102\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010(\u001a\u0004\b3\u0010\u000fR\u001c\u00104\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010(\u001a\u0004\b5\u0010\u000fR\u001c\u00106\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010(\u001a\u0004\b7\u0010\u000fR\u001c\u00108\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010(\u001a\u0004\b9\u0010\u000f"}, d2 = {"Lcom/bpjstku/data/jht/model/response/ClaimEvidenceJhtItem;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/jht/model/response/ClaimEvidenceJhtItem;", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "kodeKlaim", "Ljava/lang/String;", "getKodeKlaim", "namaBank", "getNamaBank", "namaPenerima", "getNamaPenerima", "nomorRekening", "getNomorRekening", "kpj", "getKpj", "jmlTransfer", "getJmlTransfer", "paymentDate", "getPaymentDate", NotificationCompat.CATEGORY_STATUS, "getStatus", "kodeBayar", "getKodeBayar"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ClaimEvidenceJhtItem implements Parcelable {

    @SerializedName("jmlTransfer")
    private final String jmlTransfer;

    @SerializedName("kodeBayar")
    private final String kodeBayar;

    @SerializedName("kodeKlaim")
    private final String kodeKlaim;

    @SerializedName("kpj")
    private final String kpj;

    @SerializedName("namaBank")
    private final String namaBank;

    @SerializedName("namaPenerima")
    private final String namaPenerima;

    @SerializedName("nomorRekening")
    private final String nomorRekening;

    @SerializedName("paymentDate")
    private final String paymentDate;

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private final String status;
    public static final Parcelable.Creator<ClaimEvidenceJhtItem> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ClaimEvidenceJhtItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ClaimEvidenceJhtItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ClaimEvidenceJhtItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ClaimEvidenceJhtItem[] newArray(int i) {
            return new ClaimEvidenceJhtItem[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ClaimEvidenceJhtItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.kodeKlaim = str;
        this.namaBank = str2;
        this.namaPenerima = str3;
        this.nomorRekening = str4;
        this.kpj = str5;
        this.jmlTransfer = str6;
        this.paymentDate = str7;
        this.status = str8;
        this.kodeBayar = str9;
    }

    public final String getKodeKlaim() {
        return this.kodeKlaim;
    }

    public final String getNamaBank() {
        return this.namaBank;
    }

    public final String getNamaPenerima() {
        return this.namaPenerima;
    }

    public final String getNomorRekening() {
        return this.nomorRekening;
    }

    public final String getKpj() {
        return this.kpj;
    }

    public final String getJmlTransfer() {
        return this.jmlTransfer;
    }

    public final String getPaymentDate() {
        return this.paymentDate;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getKodeBayar() {
        return this.kodeBayar;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKodeKlaim() {
        return this.kodeKlaim;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNamaBank() {
        return this.namaBank;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNamaPenerima() {
        return this.namaPenerima;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNomorRekening() {
        return this.nomorRekening;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getKpj() {
        return this.kpj;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getJmlTransfer() {
        return this.jmlTransfer;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPaymentDate() {
        return this.paymentDate;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getKodeBayar() {
        return this.kodeBayar;
    }

    public final ClaimEvidenceJhtItem copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8) {
        return new ClaimEvidenceJhtItem(p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ClaimEvidenceJhtItem)) {
            return false;
        }
        ClaimEvidenceJhtItem claimEvidenceJhtItem = (ClaimEvidenceJhtItem) p0;
        return Intrinsics.areEqual(this.kodeKlaim, claimEvidenceJhtItem.kodeKlaim) && Intrinsics.areEqual(this.namaBank, claimEvidenceJhtItem.namaBank) && Intrinsics.areEqual(this.namaPenerima, claimEvidenceJhtItem.namaPenerima) && Intrinsics.areEqual(this.nomorRekening, claimEvidenceJhtItem.nomorRekening) && Intrinsics.areEqual(this.kpj, claimEvidenceJhtItem.kpj) && Intrinsics.areEqual(this.jmlTransfer, claimEvidenceJhtItem.jmlTransfer) && Intrinsics.areEqual(this.paymentDate, claimEvidenceJhtItem.paymentDate) && Intrinsics.areEqual(this.status, claimEvidenceJhtItem.status) && Intrinsics.areEqual(this.kodeBayar, claimEvidenceJhtItem.kodeBayar);
    }

    public final int hashCode() {
        String str = this.kodeKlaim;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.namaBank;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.namaPenerima;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.nomorRekening;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.kpj;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.jmlTransfer;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.paymentDate;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.status;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.kodeBayar;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        String str = this.kodeKlaim;
        String str2 = this.namaBank;
        String str3 = this.namaPenerima;
        String str4 = this.nomorRekening;
        String str5 = this.kpj;
        String str6 = this.jmlTransfer;
        String str7 = this.paymentDate;
        String str8 = this.status;
        String str9 = this.kodeBayar;
        StringBuilder sb = new StringBuilder("ClaimEvidenceJhtItem(kodeKlaim=");
        sb.append(str);
        sb.append(", namaBank=");
        sb.append(str2);
        sb.append(", namaPenerima=");
        sb.append(str3);
        sb.append(", nomorRekening=");
        sb.append(str4);
        sb.append(", kpj=");
        sb.append(str5);
        sb.append(", jmlTransfer=");
        sb.append(str6);
        sb.append(", paymentDate=");
        sb.append(str7);
        sb.append(", status=");
        sb.append(str8);
        sb.append(", kodeBayar=");
        sb.append(str9);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.kodeKlaim);
        p0.writeString(this.namaBank);
        p0.writeString(this.namaPenerima);
        p0.writeString(this.nomorRekening);
        p0.writeString(this.kpj);
        p0.writeString(this.jmlTransfer);
        p0.writeString(this.paymentDate);
        p0.writeString(this.status);
        p0.writeString(this.kodeBayar);
    }
}
