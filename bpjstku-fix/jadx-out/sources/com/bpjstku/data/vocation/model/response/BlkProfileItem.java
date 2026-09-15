package com.bpjstku.data.vocation.model.response;

import androidx.autofill.HintConstants;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001B±\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0017J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0017J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0017J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0017J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0017J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0017J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0017J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0017J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u0017J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u0017JÜ\u0001\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020*2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b0\u0010\u0017R\u001c\u00101\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u0017R\u001c\u00104\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u00102\u001a\u0004\b5\u0010\u0017R\u001c\u00106\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u00102\u001a\u0004\b7\u0010\u0017R\u001c\u00108\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u00102\u001a\u0004\b9\u0010\u0017R\u001c\u0010:\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u00102\u001a\u0004\b;\u0010\u0017R\u001c\u0010<\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u00102\u001a\u0004\b=\u0010\u0017R\u001c\u0010>\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u00102\u001a\u0004\b?\u0010\u0017R\u001c\u0010@\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b@\u00102\u001a\u0004\bA\u0010\u0017R\u001c\u0010B\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u00102\u001a\u0004\bC\u0010\u0017R\u001c\u0010D\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bD\u00102\u001a\u0004\bE\u0010\u0017R\u001c\u0010F\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bF\u00102\u001a\u0004\bG\u0010\u0017R\u001c\u0010H\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bH\u00102\u001a\u0004\bI\u0010\u0017R\u001c\u0010J\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bJ\u00102\u001a\u0004\bK\u0010\u0017R\u001c\u0010L\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bL\u00102\u001a\u0004\bM\u0010\u0017R\u001c\u0010N\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bN\u00102\u001a\u0004\bO\u0010\u0017R\u001c\u0010P\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bP\u00102\u001a\u0004\bQ\u0010\u0017R\u001c\u0010R\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bR\u00102\u001a\u0004\bS\u0010\u0017"}, d2 = {"Lcom/bpjstku/data/vocation/model/response/BlkProfileItem;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "p16", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/vocation/model/response/BlkProfileItem;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", PlaceTypes.ADDRESS, "Ljava/lang/String;", "getAddress", "bankCode", "getBankCode", "email", "getEmail", "contactNumber", "getContactNumber", "operationalPermit", "getOperationalPermit", "blkCode", "getBlkCode", "ownershipCode", "getOwnershipCode", "permitExpiration", "getPermitExpiration", "bankName", "getBankName", "blkName", "getBlkName", "accountName", "getAccountName", "contactName", "getContactName", "ownerName", "getOwnerName", "accountNumber", "getAccountNumber", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "getPhoneNumber", "npp", "getNpp", "npwp", "getNpwp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BlkProfileItem {
    public static final int $stable = 0;

    @SerializedName("namaDalamRekening")
    private final String accountName;

    @SerializedName("noRekening")
    private final String accountNumber;

    @SerializedName("alamat")
    private final String address;

    @SerializedName("bankRekening")
    private final String bankCode;

    @SerializedName("namaBankRekening")
    private final String bankName;

    @SerializedName("kodeBlk")
    private final String blkCode;

    @SerializedName("namaBlk")
    private final String blkName;

    @SerializedName("namaKontak")
    private final String contactName;

    @SerializedName("handphoneKontak")
    private final String contactNumber;

    @SerializedName("email")
    private final String email;

    @SerializedName("npp")
    private final String npp;

    @SerializedName("npwp")
    private final String npwp;

    @SerializedName("izinOperasional")
    private final String operationalPermit;

    @SerializedName("namaPemilik")
    private final String ownerName;

    @SerializedName("kodeKepemilikan")
    private final String ownershipCode;

    @SerializedName("masaBerlakuIjin")
    private final String permitExpiration;

    @SerializedName("noTelpon")
    private final String phoneNumber;

    public BlkProfileItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17) {
        this.address = str;
        this.bankCode = str2;
        this.email = str3;
        this.contactNumber = str4;
        this.operationalPermit = str5;
        this.blkCode = str6;
        this.ownershipCode = str7;
        this.permitExpiration = str8;
        this.bankName = str9;
        this.blkName = str10;
        this.accountName = str11;
        this.contactName = str12;
        this.ownerName = str13;
        this.accountNumber = str14;
        this.phoneNumber = str15;
        this.npp = str16;
        this.npwp = str17;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getBankCode() {
        return this.bankCode;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getContactNumber() {
        return this.contactNumber;
    }

    public final String getOperationalPermit() {
        return this.operationalPermit;
    }

    public final String getBlkCode() {
        return this.blkCode;
    }

    public final String getOwnershipCode() {
        return this.ownershipCode;
    }

    public final String getPermitExpiration() {
        return this.permitExpiration;
    }

    public final String getBankName() {
        return this.bankName;
    }

    public final String getBlkName() {
        return this.blkName;
    }

    public final String getAccountName() {
        return this.accountName;
    }

    public final String getContactName() {
        return this.contactName;
    }

    public final String getOwnerName() {
        return this.ownerName;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final String getNpp() {
        return this.npp;
    }

    public final String getNpwp() {
        return this.npwp;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getBlkName() {
        return this.blkName;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getAccountName() {
        return this.accountName;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getContactName() {
        return this.contactName;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getOwnerName() {
        return this.ownerName;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getNpp() {
        return this.npp;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getNpwp() {
        return this.npwp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBankCode() {
        return this.bankCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getContactNumber() {
        return this.contactNumber;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOperationalPermit() {
        return this.operationalPermit;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBlkCode() {
        return this.blkCode;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getOwnershipCode() {
        return this.ownershipCode;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPermitExpiration() {
        return this.permitExpiration;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getBankName() {
        return this.bankName;
    }

    public final BlkProfileItem copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10, String p11, String p12, String p13, String p14, String p15, String p16) {
        return new BlkProfileItem(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof BlkProfileItem)) {
            return false;
        }
        BlkProfileItem blkProfileItem = (BlkProfileItem) p0;
        return Intrinsics.areEqual(this.address, blkProfileItem.address) && Intrinsics.areEqual(this.bankCode, blkProfileItem.bankCode) && Intrinsics.areEqual(this.email, blkProfileItem.email) && Intrinsics.areEqual(this.contactNumber, blkProfileItem.contactNumber) && Intrinsics.areEqual(this.operationalPermit, blkProfileItem.operationalPermit) && Intrinsics.areEqual(this.blkCode, blkProfileItem.blkCode) && Intrinsics.areEqual(this.ownershipCode, blkProfileItem.ownershipCode) && Intrinsics.areEqual(this.permitExpiration, blkProfileItem.permitExpiration) && Intrinsics.areEqual(this.bankName, blkProfileItem.bankName) && Intrinsics.areEqual(this.blkName, blkProfileItem.blkName) && Intrinsics.areEqual(this.accountName, blkProfileItem.accountName) && Intrinsics.areEqual(this.contactName, blkProfileItem.contactName) && Intrinsics.areEqual(this.ownerName, blkProfileItem.ownerName) && Intrinsics.areEqual(this.accountNumber, blkProfileItem.accountNumber) && Intrinsics.areEqual(this.phoneNumber, blkProfileItem.phoneNumber) && Intrinsics.areEqual(this.npp, blkProfileItem.npp) && Intrinsics.areEqual(this.npwp, blkProfileItem.npwp);
    }

    public final int hashCode() {
        String str = this.address;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.bankCode;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.email;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.contactNumber;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.operationalPermit;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.blkCode;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.ownershipCode;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.permitExpiration;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.bankName;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.blkName;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.accountName;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.contactName;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.ownerName;
        int iHashCode13 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.accountNumber;
        int iHashCode14 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.phoneNumber;
        int iHashCode15 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.npp;
        int iHashCode16 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.npwp;
        return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + (str17 != null ? str17.hashCode() : 0);
    }

    public final String toString() {
        String str = this.address;
        String str2 = this.bankCode;
        String str3 = this.email;
        String str4 = this.contactNumber;
        String str5 = this.operationalPermit;
        String str6 = this.blkCode;
        String str7 = this.ownershipCode;
        String str8 = this.permitExpiration;
        String str9 = this.bankName;
        String str10 = this.blkName;
        String str11 = this.accountName;
        String str12 = this.contactName;
        String str13 = this.ownerName;
        String str14 = this.accountNumber;
        String str15 = this.phoneNumber;
        String str16 = this.npp;
        String str17 = this.npwp;
        StringBuilder sb = new StringBuilder("BlkProfileItem(address=");
        sb.append(str);
        sb.append(", bankCode=");
        sb.append(str2);
        sb.append(", email=");
        sb.append(str3);
        sb.append(", contactNumber=");
        sb.append(str4);
        sb.append(", operationalPermit=");
        sb.append(str5);
        sb.append(", blkCode=");
        sb.append(str6);
        sb.append(", ownershipCode=");
        sb.append(str7);
        sb.append(", permitExpiration=");
        sb.append(str8);
        sb.append(", bankName=");
        sb.append(str9);
        sb.append(", blkName=");
        sb.append(str10);
        sb.append(", accountName=");
        sb.append(str11);
        sb.append(", contactName=");
        sb.append(str12);
        sb.append(", ownerName=");
        sb.append(str13);
        sb.append(", accountNumber=");
        sb.append(str14);
        sb.append(", phoneNumber=");
        sb.append(str15);
        sb.append(", npp=");
        sb.append(str16);
        sb.append(", npwp=");
        sb.append(str17);
        sb.append(")");
        return sb.toString();
    }
}
