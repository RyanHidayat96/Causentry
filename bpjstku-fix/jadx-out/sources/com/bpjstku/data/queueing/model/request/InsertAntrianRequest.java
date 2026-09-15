package com.bpjstku.data.queueing.model.request;

import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0016\u0010\u0012J\u0010\u0010\u0017\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0018\u0010\u0012J\u0010\u0010\u0019\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0019\u0010\u0012J\u0010\u0010\u001a\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001a\u0010\u0012J\u0010\u0010\u001b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001b\u0010\u0012J\u0010\u0010\u001c\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001c\u0010\u0012J\u0010\u0010\u001d\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001d\u0010\u0012J\u0088\u0001\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010\u0003\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b'\u0010\u0012R\u001a\u0010(\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0012R\u001a\u0010+\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b,\u0010\u0012R\u001a\u0010-\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b.\u0010\u0012R\u001a\u0010/\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010)\u001a\u0004\b0\u0010\u0012R\u001a\u00101\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010)\u001a\u0004\b2\u0010\u0012R\u001a\u00103\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010)\u001a\u0004\b4\u0010\u0012R\u001a\u00105\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010)\u001a\u0004\b6\u0010\u0012R\u001a\u00107\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010)\u001a\u0004\b8\u0010\u0012R\u001a\u00109\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010)\u001a\u0004\b:\u0010\u0012R\u001a\u0010;\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010)\u001a\u0004\b<\u0010\u0012R\u001a\u0010=\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010)\u001a\u0004\b>\u0010\u0012R\u001a\u0010?\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010)\u001a\u0004\b@\u0010\u0012"}, d2 = {"Lcom/bpjstku/data/queueing/model/request/InsertAntrianRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/queueing/model/request/InsertAntrianRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "nik", "Ljava/lang/String;", "getNik", "tempatLahir", "getTempatLahir", "tglLahir", "getTglLahir", "kodeSegmen", "getKodeSegmen", "alamat", "getAlamat", "tglBooking", "getTglBooking", "kodeKantor", "getKodeKantor", "shift", "getShift", "waktu", "getWaktu", "longitude", "getLongitude", "latitude", "getLatitude", "activity", "getActivity"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class InsertAntrianRequest extends BaseRequest {
    public static final int $stable = 0;

    @SerializedName("activity")
    private final String activity;

    @SerializedName("alamat")
    private final String alamat;

    @SerializedName("kodeKantor")
    private final String kodeKantor;

    @SerializedName("kodeSegmen")
    private final String kodeSegmen;

    @SerializedName("latitude")
    private final String latitude;

    @SerializedName("longitude")
    private final String longitude;

    @SerializedName("nik")
    private final String nik;

    @SerializedName("shift")
    private final String shift;

    @SerializedName("tempatLahir")
    private final String tempatLahir;

    @SerializedName("tglBooking")
    private final String tglBooking;

    @SerializedName("tglLahir")
    private final String tglLahir;

    @SerializedName("waktu")
    private final String waktu;

    public final String getNik() {
        return this.nik;
    }

    public final String getTempatLahir() {
        return this.tempatLahir;
    }

    public final String getTglLahir() {
        return this.tglLahir;
    }

    public /* synthetic */ InsertAntrianRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? "PU" : str4, str5, str6, str7, str8, str9, str10, str11, str12);
    }

    public final String getKodeSegmen() {
        return this.kodeSegmen;
    }

    public final String getAlamat() {
        return this.alamat;
    }

    public final String getTglBooking() {
        return this.tglBooking;
    }

    public final String getKodeKantor() {
        return this.kodeKantor;
    }

    public final String getShift() {
        return this.shift;
    }

    public final String getWaktu() {
        return this.waktu;
    }

    public final String getLongitude() {
        return this.longitude;
    }

    public final String getLatitude() {
        return this.latitude;
    }

    public final String getActivity() {
        return this.activity;
    }

    public InsertAntrianRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        this.nik = str;
        this.tempatLahir = str2;
        this.tglLahir = str3;
        this.kodeSegmen = str4;
        this.alamat = str5;
        this.tglBooking = str6;
        this.kodeKantor = str7;
        this.shift = str8;
        this.waktu = str9;
        this.longitude = str10;
        this.latitude = str11;
        this.activity = str12;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNik() {
        return this.nik;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getLongitude() {
        return this.longitude;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getActivity() {
        return this.activity;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTempatLahir() {
        return this.tempatLahir;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTglLahir() {
        return this.tglLahir;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getKodeSegmen() {
        return this.kodeSegmen;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAlamat() {
        return this.alamat;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTglBooking() {
        return this.tglBooking;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getKodeKantor() {
        return this.kodeKantor;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getShift() {
        return this.shift;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getWaktu() {
        return this.waktu;
    }

    public final InsertAntrianRequest copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10, String p11) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p5, "");
        Intrinsics.checkNotNullParameter(p6, "");
        Intrinsics.checkNotNullParameter(p7, "");
        Intrinsics.checkNotNullParameter(p8, "");
        Intrinsics.checkNotNullParameter(p9, "");
        Intrinsics.checkNotNullParameter(p10, "");
        Intrinsics.checkNotNullParameter(p11, "");
        return new InsertAntrianRequest(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof InsertAntrianRequest)) {
            return false;
        }
        InsertAntrianRequest insertAntrianRequest = (InsertAntrianRequest) p0;
        return Intrinsics.areEqual(this.nik, insertAntrianRequest.nik) && Intrinsics.areEqual(this.tempatLahir, insertAntrianRequest.tempatLahir) && Intrinsics.areEqual(this.tglLahir, insertAntrianRequest.tglLahir) && Intrinsics.areEqual(this.kodeSegmen, insertAntrianRequest.kodeSegmen) && Intrinsics.areEqual(this.alamat, insertAntrianRequest.alamat) && Intrinsics.areEqual(this.tglBooking, insertAntrianRequest.tglBooking) && Intrinsics.areEqual(this.kodeKantor, insertAntrianRequest.kodeKantor) && Intrinsics.areEqual(this.shift, insertAntrianRequest.shift) && Intrinsics.areEqual(this.waktu, insertAntrianRequest.waktu) && Intrinsics.areEqual(this.longitude, insertAntrianRequest.longitude) && Intrinsics.areEqual(this.latitude, insertAntrianRequest.latitude) && Intrinsics.areEqual(this.activity, insertAntrianRequest.activity);
    }

    public final int hashCode() {
        return (((((((((((((((((((((this.nik.hashCode() * 31) + this.tempatLahir.hashCode()) * 31) + this.tglLahir.hashCode()) * 31) + this.kodeSegmen.hashCode()) * 31) + this.alamat.hashCode()) * 31) + this.tglBooking.hashCode()) * 31) + this.kodeKantor.hashCode()) * 31) + this.shift.hashCode()) * 31) + this.waktu.hashCode()) * 31) + this.longitude.hashCode()) * 31) + this.latitude.hashCode()) * 31) + this.activity.hashCode();
    }

    public final String toString() {
        String str = this.nik;
        String str2 = this.tempatLahir;
        String str3 = this.tglLahir;
        String str4 = this.kodeSegmen;
        String str5 = this.alamat;
        String str6 = this.tglBooking;
        String str7 = this.kodeKantor;
        String str8 = this.shift;
        String str9 = this.waktu;
        String str10 = this.longitude;
        String str11 = this.latitude;
        String str12 = this.activity;
        StringBuilder sb = new StringBuilder("InsertAntrianRequest(nik=");
        sb.append(str);
        sb.append(", tempatLahir=");
        sb.append(str2);
        sb.append(", tglLahir=");
        sb.append(str3);
        sb.append(", kodeSegmen=");
        sb.append(str4);
        sb.append(", alamat=");
        sb.append(str5);
        sb.append(", tglBooking=");
        sb.append(str6);
        sb.append(", kodeKantor=");
        sb.append(str7);
        sb.append(", shift=");
        sb.append(str8);
        sb.append(", waktu=");
        sb.append(str9);
        sb.append(", longitude=");
        sb.append(str10);
        sb.append(", latitude=");
        sb.append(str11);
        sb.append(", activity=");
        sb.append(str12);
        sb.append(")");
        return sb.toString();
    }
}
