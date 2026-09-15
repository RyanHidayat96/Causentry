package com.bpjstku.data.payment.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.bpjstku.data.lib.model.BaseItem;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÇ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÇ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0003HÇ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0003HÇ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0010\u0010\u0012\u001a\u00020\u0003HÇ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJZ\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0019J\u0010\u0010\u001f\u001a\u00020\u0003H×\u0001¢\u0006\u0004\b\u001f\u0010\u000eJ\u001d\u0010\"\u001a\u00020!2\u0006\u0010\u0004\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u0017¢\u0006\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u000eR\u001a\u0010'\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b(\u0010\u000eR\u001a\u0010)\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010\u000eR\u001a\u0010+\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b,\u0010\u000eR\u001a\u0010-\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010%\u001a\u0004\b.\u0010\u000eR\u001c\u0010/\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010%\u001a\u0004\b0\u0010\u000eR\u001c\u00101\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010%\u001a\u0004\b2\u0010\u000e"}, d2 = {"Lcom/bpjstku/data/payment/model/response/SubmitAutodebitBniAutopayResponse;", "Lcom/bpjstku/data/lib/model/BaseItem;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/payment/model/response/SubmitAutodebitBniAutopayResponse;", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "nik", "Ljava/lang/String;", "getNik", NotificationCompat.CATEGORY_MESSAGE, "getMsg", "chargeToken", "getChargeToken", "referenceNo", "getReferenceNo", "confirmPhoneNumber", "getConfirmPhoneNumber", "nomorRekening", "getNomorRekening", "nomorKartu", "getNomorKartu"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SubmitAutodebitBniAutopayResponse extends BaseItem implements Parcelable {

    @SerializedName("chargeToken")
    private final String chargeToken;

    @SerializedName("confirmPhoneNumber")
    private final String confirmPhoneNumber;

    @SerializedName("namaLengkap")
    private final String msg;

    @SerializedName("nik")
    private final String nik;

    @SerializedName("nomorKartu")
    private final String nomorKartu;

    @SerializedName("nomorRekening")
    private final String nomorRekening;

    @SerializedName("referenceNo")
    private final String referenceNo;
    public static final Parcelable.Creator<SubmitAutodebitBniAutopayResponse> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SubmitAutodebitBniAutopayResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SubmitAutodebitBniAutopayResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SubmitAutodebitBniAutopayResponse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SubmitAutodebitBniAutopayResponse[] newArray(int i) {
            return new SubmitAutodebitBniAutopayResponse[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ SubmitAutodebitBniAutopayResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7);
    }

    public final String getNik() {
        return this.nik;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final String getChargeToken() {
        return this.chargeToken;
    }

    public final String getReferenceNo() {
        return this.referenceNo;
    }

    public final String getConfirmPhoneNumber() {
        return this.confirmPhoneNumber;
    }

    public final String getNomorRekening() {
        return this.nomorRekening;
    }

    public final String getNomorKartu() {
        return this.nomorKartu;
    }

    public SubmitAutodebitBniAutopayResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.nik = str;
        this.msg = str2;
        this.chargeToken = str3;
        this.referenceNo = str4;
        this.confirmPhoneNumber = str5;
        this.nomorRekening = str6;
        this.nomorKartu = str7;
    }

    public static /* synthetic */ SubmitAutodebitBniAutopayResponse copy$default(SubmitAutodebitBniAutopayResponse submitAutodebitBniAutopayResponse, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = submitAutodebitBniAutopayResponse.nik;
        }
        if ((i & 2) != 0) {
            str2 = submitAutodebitBniAutopayResponse.msg;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = submitAutodebitBniAutopayResponse.chargeToken;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = submitAutodebitBniAutopayResponse.referenceNo;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = submitAutodebitBniAutopayResponse.confirmPhoneNumber;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = submitAutodebitBniAutopayResponse.nomorRekening;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = submitAutodebitBniAutopayResponse.nomorKartu;
        }
        return submitAutodebitBniAutopayResponse.copy(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNik() {
        return this.nik;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getChargeToken() {
        return this.chargeToken;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getReferenceNo() {
        return this.referenceNo;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getConfirmPhoneNumber() {
        return this.confirmPhoneNumber;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getNomorRekening() {
        return this.nomorRekening;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getNomorKartu() {
        return this.nomorKartu;
    }

    public final SubmitAutodebitBniAutopayResponse copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        return new SubmitAutodebitBniAutopayResponse(p0, p1, p2, p3, p4, p5, p6);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SubmitAutodebitBniAutopayResponse)) {
            return false;
        }
        SubmitAutodebitBniAutopayResponse submitAutodebitBniAutopayResponse = (SubmitAutodebitBniAutopayResponse) p0;
        return Intrinsics.areEqual(this.nik, submitAutodebitBniAutopayResponse.nik) && Intrinsics.areEqual(this.msg, submitAutodebitBniAutopayResponse.msg) && Intrinsics.areEqual(this.chargeToken, submitAutodebitBniAutopayResponse.chargeToken) && Intrinsics.areEqual(this.referenceNo, submitAutodebitBniAutopayResponse.referenceNo) && Intrinsics.areEqual(this.confirmPhoneNumber, submitAutodebitBniAutopayResponse.confirmPhoneNumber) && Intrinsics.areEqual(this.nomorRekening, submitAutodebitBniAutopayResponse.nomorRekening) && Intrinsics.areEqual(this.nomorKartu, submitAutodebitBniAutopayResponse.nomorKartu);
    }

    public final int hashCode() {
        int iHashCode = this.nik.hashCode();
        int iHashCode2 = this.msg.hashCode();
        int iHashCode3 = this.chargeToken.hashCode();
        int iHashCode4 = this.referenceNo.hashCode();
        int iHashCode5 = this.confirmPhoneNumber.hashCode();
        String str = this.nomorRekening;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        String str2 = this.nomorKartu;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.nik;
        String str2 = this.msg;
        String str3 = this.chargeToken;
        String str4 = this.referenceNo;
        String str5 = this.confirmPhoneNumber;
        String str6 = this.nomorRekening;
        String str7 = this.nomorKartu;
        StringBuilder sb = new StringBuilder("SubmitAutodebitBniAutopayResponse(nik=");
        sb.append(str);
        sb.append(", msg=");
        sb.append(str2);
        sb.append(", chargeToken=");
        sb.append(str3);
        sb.append(", referenceNo=");
        sb.append(str4);
        sb.append(", confirmPhoneNumber=");
        sb.append(str5);
        sb.append(", nomorRekening=");
        sb.append(str6);
        sb.append(", nomorKartu=");
        sb.append(str7);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.nik);
        p0.writeString(this.msg);
        p0.writeString(this.chargeToken);
        p0.writeString(this.referenceNo);
        p0.writeString(this.confirmPhoneNumber);
        p0.writeString(this.nomorRekening);
        p0.writeString(this.nomorKartu);
    }
}
