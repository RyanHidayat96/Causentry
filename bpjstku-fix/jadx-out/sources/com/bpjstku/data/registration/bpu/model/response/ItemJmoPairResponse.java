package com.bpjstku.data.registration.bpu.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0010J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0010J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0010J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0010J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0010J\u0088\u0001\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b$\u0010\u0010J\u001d\u0010'\u001a\u00020&2\u0006\u0010\u0003\u001a\u00020%2\u0006\u0010\u0004\u001a\u00020\u001c¢\u0006\u0004\b'\u0010(R\u001c\u0010)\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0010R\u001c\u0010,\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b-\u0010\u0010R\u001c\u0010.\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u0010\u0010R\u001c\u00100\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010*\u001a\u0004\b1\u0010\u0010R\u001c\u00102\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010*\u001a\u0004\b3\u0010\u0010R\u001c\u00104\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010*\u001a\u0004\b5\u0010\u0010R\u001c\u00106\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010*\u001a\u0004\b7\u0010\u0010R\u001c\u00108\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010*\u001a\u0004\b9\u0010\u0010R\u001c\u0010:\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010*\u001a\u0004\b;\u0010\u0010R\u001c\u0010<\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010*\u001a\u0004\b=\u0010\u0010"}, d2 = {"Lcom/bpjstku/data/registration/bpu/model/response/ItemJmoPairResponse;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/registration/bpu/model/response/ItemJmoPairResponse;", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "nikBayar", "Ljava/lang/String;", "getNikBayar", "emailJmo", "getEmailJmo", "tglRekam", "getTglRekam", "kodePaket", "getKodePaket", "kodeIuran", "getKodeIuran", "nikJmo", "getNikJmo", "jmlBln", "getJmlBln", "paymentGateway", "getPaymentGateway", "user", "getUser", "paymentMethod", "getPaymentMethod"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ItemJmoPairResponse implements Parcelable {

    @SerializedName("emailJmo")
    private final String emailJmo;

    @SerializedName("jmlBln")
    private final String jmlBln;

    @SerializedName("kodeIuran")
    private final String kodeIuran;

    @SerializedName("kodePaket")
    private final String kodePaket;

    @SerializedName("nikBayar")
    private final String nikBayar;

    @SerializedName("nikJmo")
    private final String nikJmo;

    @SerializedName("paymentGateway")
    private final String paymentGateway;

    @SerializedName("paymentMethod")
    private final String paymentMethod;

    @SerializedName("tglRekam")
    private final String tglRekam;

    @SerializedName("user")
    private final String user;
    public static final Parcelable.Creator<ItemJmoPairResponse> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ItemJmoPairResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ItemJmoPairResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ItemJmoPairResponse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ItemJmoPairResponse[] newArray(int i) {
            return new ItemJmoPairResponse[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ItemJmoPairResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.nikBayar = str;
        this.emailJmo = str2;
        this.tglRekam = str3;
        this.kodePaket = str4;
        this.kodeIuran = str5;
        this.nikJmo = str6;
        this.jmlBln = str7;
        this.paymentGateway = str8;
        this.user = str9;
        this.paymentMethod = str10;
    }

    public /* synthetic */ ItemJmoPairResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) == 0 ? str10 : "");
    }

    public final String getNikBayar() {
        return this.nikBayar;
    }

    public final String getEmailJmo() {
        return this.emailJmo;
    }

    public final String getTglRekam() {
        return this.tglRekam;
    }

    public final String getKodePaket() {
        return this.kodePaket;
    }

    public final String getKodeIuran() {
        return this.kodeIuran;
    }

    public final String getNikJmo() {
        return this.nikJmo;
    }

    public final String getJmlBln() {
        return this.jmlBln;
    }

    public final String getPaymentGateway() {
        return this.paymentGateway;
    }

    public final String getUser() {
        return this.user;
    }

    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    public ItemJmoPairResponse() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNikBayar() {
        return this.nikBayar;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEmailJmo() {
        return this.emailJmo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTglRekam() {
        return this.tglRekam;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getKodePaket() {
        return this.kodePaket;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getKodeIuran() {
        return this.kodeIuran;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getNikJmo() {
        return this.nikJmo;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getJmlBln() {
        return this.jmlBln;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPaymentGateway() {
        return this.paymentGateway;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getUser() {
        return this.user;
    }

    public final ItemJmoPairResponse copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9) {
        return new ItemJmoPairResponse(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ItemJmoPairResponse)) {
            return false;
        }
        ItemJmoPairResponse itemJmoPairResponse = (ItemJmoPairResponse) p0;
        return Intrinsics.areEqual(this.nikBayar, itemJmoPairResponse.nikBayar) && Intrinsics.areEqual(this.emailJmo, itemJmoPairResponse.emailJmo) && Intrinsics.areEqual(this.tglRekam, itemJmoPairResponse.tglRekam) && Intrinsics.areEqual(this.kodePaket, itemJmoPairResponse.kodePaket) && Intrinsics.areEqual(this.kodeIuran, itemJmoPairResponse.kodeIuran) && Intrinsics.areEqual(this.nikJmo, itemJmoPairResponse.nikJmo) && Intrinsics.areEqual(this.jmlBln, itemJmoPairResponse.jmlBln) && Intrinsics.areEqual(this.paymentGateway, itemJmoPairResponse.paymentGateway) && Intrinsics.areEqual(this.user, itemJmoPairResponse.user) && Intrinsics.areEqual(this.paymentMethod, itemJmoPairResponse.paymentMethod);
    }

    public final int hashCode() {
        String str = this.nikBayar;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.emailJmo;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.tglRekam;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.kodePaket;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.kodeIuran;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.nikJmo;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.jmlBln;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.paymentGateway;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.user;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.paymentMethod;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str10 != null ? str10.hashCode() : 0);
    }

    public final String toString() {
        String str = this.nikBayar;
        String str2 = this.emailJmo;
        String str3 = this.tglRekam;
        String str4 = this.kodePaket;
        String str5 = this.kodeIuran;
        String str6 = this.nikJmo;
        String str7 = this.jmlBln;
        String str8 = this.paymentGateway;
        String str9 = this.user;
        String str10 = this.paymentMethod;
        StringBuilder sb = new StringBuilder("ItemJmoPairResponse(nikBayar=");
        sb.append(str);
        sb.append(", emailJmo=");
        sb.append(str2);
        sb.append(", tglRekam=");
        sb.append(str3);
        sb.append(", kodePaket=");
        sb.append(str4);
        sb.append(", kodeIuran=");
        sb.append(str5);
        sb.append(", nikJmo=");
        sb.append(str6);
        sb.append(", jmlBln=");
        sb.append(str7);
        sb.append(", paymentGateway=");
        sb.append(str8);
        sb.append(", user=");
        sb.append(str9);
        sb.append(", paymentMethod=");
        sb.append(str10);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.nikBayar);
        p0.writeString(this.emailJmo);
        p0.writeString(this.tglRekam);
        p0.writeString(this.kodePaket);
        p0.writeString(this.kodeIuran);
        p0.writeString(this.nikJmo);
        p0.writeString(this.jmlBln);
        p0.writeString(this.paymentGateway);
        p0.writeString(this.user);
        p0.writeString(this.paymentMethod);
    }
}
