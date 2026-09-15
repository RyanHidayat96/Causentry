package com.bpjstku.data.asik.model.request;

import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0015\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\t"}, d2 = {"Lcom/bpjstku/data/asik/model/request/AccountBankRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/asik/model/request/AccountBankRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "identityNumber", "Ljava/lang/String;", "getIdentityNumber", "fullName", "getFullName", "birthDate", "getBirthDate"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AccountBankRequest extends BaseRequest {
    public static final int $stable = 0;

    @SerializedName("birthDate")
    private final String birthDate;

    @SerializedName("fullName")
    private final String fullName;

    @SerializedName("identityNumber")
    private final String identityNumber;

    public final String getIdentityNumber() {
        return this.identityNumber;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final String getBirthDate() {
        return this.birthDate;
    }

    public AccountBankRequest(String str, String str2, String str3) {
        this.identityNumber = str;
        this.fullName = str2;
        this.birthDate = str3;
    }

    public static /* synthetic */ AccountBankRequest copy$default(AccountBankRequest accountBankRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountBankRequest.identityNumber;
        }
        if ((i & 2) != 0) {
            str2 = accountBankRequest.fullName;
        }
        if ((i & 4) != 0) {
            str3 = accountBankRequest.birthDate;
        }
        return accountBankRequest.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIdentityNumber() {
        return this.identityNumber;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBirthDate() {
        return this.birthDate;
    }

    public final AccountBankRequest copy(String p0, String p1, String p2) {
        return new AccountBankRequest(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AccountBankRequest)) {
            return false;
        }
        AccountBankRequest accountBankRequest = (AccountBankRequest) p0;
        return Intrinsics.areEqual(this.identityNumber, accountBankRequest.identityNumber) && Intrinsics.areEqual(this.fullName, accountBankRequest.fullName) && Intrinsics.areEqual(this.birthDate, accountBankRequest.birthDate);
    }

    public final int hashCode() {
        String str = this.identityNumber;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.fullName;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.birthDate;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.identityNumber;
        String str2 = this.fullName;
        String str3 = this.birthDate;
        StringBuilder sb = new StringBuilder("AccountBankRequest(identityNumber=");
        sb.append(str);
        sb.append(", fullName=");
        sb.append(str2);
        sb.append(", birthDate=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
