package com.bpjstku.data.payment.model.request;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ<\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000eJ\u0010\u0010\u0016\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u001c\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\u001f\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u000e"}, d2 = {"Lcom/bpjstku/data/payment/model/request/EwalletAccount;", "", "", "p0", "p1", "", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;II)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;II)Lcom/bpjstku/data/payment/model/request/EwalletAccount;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "name", "Ljava/lang/String;", "getName", "accountDetails", "getAccountDetails", "balance", "I", "getBalance", "pointBalance", "getPointBalance"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class EwalletAccount {
    public static final int $stable = 0;

    @SerializedName("account_details")
    private final String accountDetails;

    @SerializedName("balance")
    private final int balance;

    @SerializedName("name")
    private final String name;

    @SerializedName("pointBalance")
    private final int pointBalance;

    public EwalletAccount(String str, String str2, int i, int i2) {
        this.name = str;
        this.accountDetails = str2;
        this.balance = i;
        this.pointBalance = i2;
    }

    public final String getName() {
        return this.name;
    }

    public final String getAccountDetails() {
        return this.accountDetails;
    }

    public final int getBalance() {
        return this.balance;
    }

    public final int getPointBalance() {
        return this.pointBalance;
    }

    public static /* synthetic */ EwalletAccount copy$default(EwalletAccount ewalletAccount, String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = ewalletAccount.name;
        }
        if ((i3 & 2) != 0) {
            str2 = ewalletAccount.accountDetails;
        }
        if ((i3 & 4) != 0) {
            i = ewalletAccount.balance;
        }
        if ((i3 & 8) != 0) {
            i2 = ewalletAccount.pointBalance;
        }
        return ewalletAccount.copy(str, str2, i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAccountDetails() {
        return this.accountDetails;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getBalance() {
        return this.balance;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getPointBalance() {
        return this.pointBalance;
    }

    public final EwalletAccount copy(String p0, String p1, int p2, int p3) {
        return new EwalletAccount(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof EwalletAccount)) {
            return false;
        }
        EwalletAccount ewalletAccount = (EwalletAccount) p0;
        return Intrinsics.areEqual(this.name, ewalletAccount.name) && Intrinsics.areEqual(this.accountDetails, ewalletAccount.accountDetails) && this.balance == ewalletAccount.balance && this.pointBalance == ewalletAccount.pointBalance;
    }

    public final int hashCode() {
        String str = this.name;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.accountDetails;
        return (((((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.balance)) * 31) + Integer.hashCode(this.pointBalance);
    }

    public final String toString() {
        String str = this.name;
        String str2 = this.accountDetails;
        int i = this.balance;
        int i2 = this.pointBalance;
        StringBuilder sb = new StringBuilder("EwalletAccount(name=");
        sb.append(str);
        sb.append(", accountDetails=");
        sb.append(str2);
        sb.append(", balance=");
        sb.append(i);
        sb.append(", pointBalance=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }
}
