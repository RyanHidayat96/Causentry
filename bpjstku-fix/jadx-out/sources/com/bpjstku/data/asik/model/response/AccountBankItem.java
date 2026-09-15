package com.bpjstku.data.asik.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJL\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0003\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0014J\u0010\u0010\u001a\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001a\u0010\u000bJ\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u00020\u0012¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000bR\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u000bR\u001c\u0010$\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\u000bR\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\u000bR\u001c\u0010(\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\u000b"}, d2 = {"Lcom/bpjstku/data/asik/model/response/AccountBankItem;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "p3", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/asik/model/response/AccountBankItem;", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "bankCode", "Ljava/lang/String;", "getBankCode", "accountName", "getAccountName", "bankName", "getBankName", "accountBankNumber", "getAccountBankNumber", "accountBankName", "getAccountBankName"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AccountBankItem implements Parcelable {

    @SerializedName("accountBankName")
    private final String accountBankName;

    @SerializedName("accountBankNumber")
    private final String accountBankNumber;

    @SerializedName("accountName")
    private final String accountName;

    @SerializedName("bankCode")
    private final String bankCode;

    @SerializedName("bankName")
    private final String bankName;
    public static final Parcelable.Creator<AccountBankItem> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AccountBankItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountBankItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AccountBankItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountBankItem[] newArray(int i) {
            return new AccountBankItem[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public AccountBankItem(String str, String str2, String str3, String str4, String str5) {
        this.bankCode = str;
        this.accountName = str2;
        this.bankName = str3;
        this.accountBankNumber = str4;
        this.accountBankName = str5;
    }

    public final String getBankCode() {
        return this.bankCode;
    }

    public final String getAccountName() {
        return this.accountName;
    }

    public final String getBankName() {
        return this.bankName;
    }

    public final String getAccountBankNumber() {
        return this.accountBankNumber;
    }

    public final String getAccountBankName() {
        return this.accountBankName;
    }

    public static /* synthetic */ AccountBankItem copy$default(AccountBankItem accountBankItem, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountBankItem.bankCode;
        }
        if ((i & 2) != 0) {
            str2 = accountBankItem.accountName;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = accountBankItem.bankName;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = accountBankItem.accountBankNumber;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = accountBankItem.accountBankName;
        }
        return accountBankItem.copy(str, str6, str7, str8, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBankCode() {
        return this.bankCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAccountName() {
        return this.accountName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBankName() {
        return this.bankName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAccountBankNumber() {
        return this.accountBankNumber;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAccountBankName() {
        return this.accountBankName;
    }

    public final AccountBankItem copy(String p0, String p1, String p2, String p3, String p4) {
        return new AccountBankItem(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AccountBankItem)) {
            return false;
        }
        AccountBankItem accountBankItem = (AccountBankItem) p0;
        return Intrinsics.areEqual(this.bankCode, accountBankItem.bankCode) && Intrinsics.areEqual(this.accountName, accountBankItem.accountName) && Intrinsics.areEqual(this.bankName, accountBankItem.bankName) && Intrinsics.areEqual(this.accountBankNumber, accountBankItem.accountBankNumber) && Intrinsics.areEqual(this.accountBankName, accountBankItem.accountBankName);
    }

    public final int hashCode() {
        String str = this.bankCode;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.accountName;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.bankName;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.accountBankNumber;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.accountBankName;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        String str = this.bankCode;
        String str2 = this.accountName;
        String str3 = this.bankName;
        String str4 = this.accountBankNumber;
        String str5 = this.accountBankName;
        StringBuilder sb = new StringBuilder("AccountBankItem(bankCode=");
        sb.append(str);
        sb.append(", accountName=");
        sb.append(str2);
        sb.append(", bankName=");
        sb.append(str3);
        sb.append(", accountBankNumber=");
        sb.append(str4);
        sb.append(", accountBankName=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.bankCode);
        p0.writeString(this.accountName);
        p0.writeString(this.bankName);
        p0.writeString(this.accountBankNumber);
        p0.writeString(this.accountBankName);
    }
}
