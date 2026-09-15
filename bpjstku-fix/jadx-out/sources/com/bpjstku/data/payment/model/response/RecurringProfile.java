package com.bpjstku.data.payment.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000fJ\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJx\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\"\u0010\u000fJ\u001d\u0010%\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020#2\u0006\u0010\u0004\u001a\u00020\u001a¢\u0006\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u000fR\u001c\u0010*\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010\u000fR\u001c\u0010,\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010\u000fR\u001c\u0010.\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010(\u001a\u0004\b/\u0010\u000fR\u001a\u00100\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010(\u001a\u0004\b1\u0010\u000fR\u001c\u00102\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010(\u001a\u0004\b3\u0010\u000fR\u001c\u00104\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010(\u001a\u0004\b5\u0010\u000fR\u001c\u00106\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010(\u001a\u0004\b7\u0010\u000fR\u001c\u00108\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010(\u001a\u0004\b9\u0010\u000f"}, d2 = {"Lcom/bpjstku/data/payment/model/response/RecurringProfile;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/payment/model/response/RecurringProfile;", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "tglLahir", "Ljava/lang/String;", "getTglLahir", "tipeRekening", "getTipeRekening", "namaLengkap", "getNamaLengkap", "recurringAktif", "getRecurringAktif", "petugasRekam", "getPetugasRekam", "tglAktifRecurring", "getTglAktifRecurring", "nik", "getNik", "kodePaket", "getKodePaket", "nominal", "getNominal"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class RecurringProfile implements Parcelable {

    @SerializedName("kodePaket")
    private final String kodePaket;

    @SerializedName("namaLengkap")
    private final String namaLengkap;

    @SerializedName("nik")
    private final String nik;

    @SerializedName("nominal")
    private final String nominal;

    @SerializedName("petugasRekam")
    private final String petugasRekam;

    @SerializedName("recurringAktif")
    private final String recurringAktif;

    @SerializedName("tglAktifRecurring")
    private final String tglAktifRecurring;

    @SerializedName("tglLahir")
    private final String tglLahir;

    @SerializedName("tipeRekening")
    private final String tipeRekening;
    public static final Parcelable.Creator<RecurringProfile> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RecurringProfile> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringProfile createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new RecurringProfile(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringProfile[] newArray(int i) {
            return new RecurringProfile[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public RecurringProfile(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.tglLahir = str;
        this.tipeRekening = str2;
        this.namaLengkap = str3;
        this.recurringAktif = str4;
        this.petugasRekam = str5;
        this.tglAktifRecurring = str6;
        this.nik = str7;
        this.kodePaket = str8;
        this.nominal = str9;
    }

    public final String getTglLahir() {
        return this.tglLahir;
    }

    public final String getTipeRekening() {
        return this.tipeRekening;
    }

    public final String getNamaLengkap() {
        return this.namaLengkap;
    }

    public final String getRecurringAktif() {
        return this.recurringAktif;
    }

    public final String getPetugasRekam() {
        return this.petugasRekam;
    }

    public final String getTglAktifRecurring() {
        return this.tglAktifRecurring;
    }

    public final String getNik() {
        return this.nik;
    }

    public final String getKodePaket() {
        return this.kodePaket;
    }

    public final String getNominal() {
        return this.nominal;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTglLahir() {
        return this.tglLahir;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTipeRekening() {
        return this.tipeRekening;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNamaLengkap() {
        return this.namaLengkap;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRecurringAktif() {
        return this.recurringAktif;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPetugasRekam() {
        return this.petugasRekam;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTglAktifRecurring() {
        return this.tglAktifRecurring;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getNik() {
        return this.nik;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getKodePaket() {
        return this.kodePaket;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getNominal() {
        return this.nominal;
    }

    public final RecurringProfile copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p4, "");
        return new RecurringProfile(p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof RecurringProfile)) {
            return false;
        }
        RecurringProfile recurringProfile = (RecurringProfile) p0;
        return Intrinsics.areEqual(this.tglLahir, recurringProfile.tglLahir) && Intrinsics.areEqual(this.tipeRekening, recurringProfile.tipeRekening) && Intrinsics.areEqual(this.namaLengkap, recurringProfile.namaLengkap) && Intrinsics.areEqual(this.recurringAktif, recurringProfile.recurringAktif) && Intrinsics.areEqual(this.petugasRekam, recurringProfile.petugasRekam) && Intrinsics.areEqual(this.tglAktifRecurring, recurringProfile.tglAktifRecurring) && Intrinsics.areEqual(this.nik, recurringProfile.nik) && Intrinsics.areEqual(this.kodePaket, recurringProfile.kodePaket) && Intrinsics.areEqual(this.nominal, recurringProfile.nominal);
    }

    public final int hashCode() {
        int iHashCode = this.tglLahir.hashCode();
        String str = this.tipeRekening;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.namaLengkap;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.recurringAktif;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        int iHashCode5 = this.petugasRekam.hashCode();
        String str4 = this.tglAktifRecurring;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.nik;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.kodePaket;
        int iHashCode8 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.nominal;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        String str = this.tglLahir;
        String str2 = this.tipeRekening;
        String str3 = this.namaLengkap;
        String str4 = this.recurringAktif;
        String str5 = this.petugasRekam;
        String str6 = this.tglAktifRecurring;
        String str7 = this.nik;
        String str8 = this.kodePaket;
        String str9 = this.nominal;
        StringBuilder sb = new StringBuilder("RecurringProfile(tglLahir=");
        sb.append(str);
        sb.append(", tipeRekening=");
        sb.append(str2);
        sb.append(", namaLengkap=");
        sb.append(str3);
        sb.append(", recurringAktif=");
        sb.append(str4);
        sb.append(", petugasRekam=");
        sb.append(str5);
        sb.append(", tglAktifRecurring=");
        sb.append(str6);
        sb.append(", nik=");
        sb.append(str7);
        sb.append(", kodePaket=");
        sb.append(str8);
        sb.append(", nominal=");
        sb.append(str9);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.tglLahir);
        p0.writeString(this.tipeRekening);
        p0.writeString(this.namaLengkap);
        p0.writeString(this.recurringAktif);
        p0.writeString(this.petugasRekam);
        p0.writeString(this.tglAktifRecurring);
        p0.writeString(this.nik);
        p0.writeString(this.kodePaket);
        p0.writeString(this.nominal);
    }
}
