package com.bpjstku.data.vocation.model.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ@\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0016\u0010\nR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\nR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\n"}, d2 = {"Lcom/bpjstku/data/vocation/model/response/BankItem;", "", "", "p0", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/vocation/model/response/BankItem;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "bankCode", "Ljava/lang/String;", "getBankCode", "centralBankCode", "getCentralBankCode", "bankName", "getBankName", "transferType", "getTransferType"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BankItem {
    public static final int $stable = 0;

    @SerializedName("kodeBank")
    private final String bankCode;

    @SerializedName("namaBank")
    private final String bankName;

    @SerializedName("kodeBankBi")
    private final String centralBankCode;

    @SerializedName("tipeTrf")
    private final String transferType;

    public BankItem(String str, String str2, String str3, String str4) {
        this.bankCode = str;
        this.centralBankCode = str2;
        this.bankName = str3;
        this.transferType = str4;
    }

    public final String getBankCode() {
        return this.bankCode;
    }

    public final String getCentralBankCode() {
        return this.centralBankCode;
    }

    public final String getBankName() {
        return this.bankName;
    }

    public final String getTransferType() {
        return this.transferType;
    }

    public static /* synthetic */ BankItem copy$default(BankItem bankItem, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bankItem.bankCode;
        }
        if ((i & 2) != 0) {
            str2 = bankItem.centralBankCode;
        }
        if ((i & 4) != 0) {
            str3 = bankItem.bankName;
        }
        if ((i & 8) != 0) {
            str4 = bankItem.transferType;
        }
        return bankItem.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBankCode() {
        return this.bankCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCentralBankCode() {
        return this.centralBankCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBankName() {
        return this.bankName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTransferType() {
        return this.transferType;
    }

    public final BankItem copy(String p0, String p1, String p2, String p3) {
        return new BankItem(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof BankItem)) {
            return false;
        }
        BankItem bankItem = (BankItem) p0;
        return Intrinsics.areEqual(this.bankCode, bankItem.bankCode) && Intrinsics.areEqual(this.centralBankCode, bankItem.centralBankCode) && Intrinsics.areEqual(this.bankName, bankItem.bankName) && Intrinsics.areEqual(this.transferType, bankItem.transferType);
    }

    public final int hashCode() {
        String str = this.bankCode;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.centralBankCode;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.bankName;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.transferType;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.bankCode;
        String str2 = this.centralBankCode;
        String str3 = this.bankName;
        String str4 = this.transferType;
        StringBuilder sb = new StringBuilder("BankItem(bankCode=");
        sb.append(str);
        sb.append(", centralBankCode=");
        sb.append(str2);
        sb.append(", bankName=");
        sb.append(str3);
        sb.append(", transferType=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }
}
