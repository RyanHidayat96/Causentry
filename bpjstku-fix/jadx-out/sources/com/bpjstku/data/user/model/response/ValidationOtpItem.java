package com.bpjstku.data.user.model.response;

import com.bpjstku.data.lib.model.BaseItem;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0013\u0010\bR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/bpjstku/data/user/model/response/ValidationOtpItem;", "Lcom/bpjstku/data/lib/model/BaseItem;", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/user/model/response/ValidationOtpItem;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "signature", "Ljava/lang/String;", "getSignature", "checkSum", "getCheckSum"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ValidationOtpItem extends BaseItem {
    public static final int $stable = 0;

    @SerializedName("checkSum")
    private final String checkSum;

    @SerializedName("signature")
    private final String signature;

    public final String getSignature() {
        return this.signature;
    }

    public final String getCheckSum() {
        return this.checkSum;
    }

    public ValidationOtpItem(String str, String str2) {
        this.signature = str;
        this.checkSum = str2;
    }

    public static /* synthetic */ ValidationOtpItem copy$default(ValidationOtpItem validationOtpItem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = validationOtpItem.signature;
        }
        if ((i & 2) != 0) {
            str2 = validationOtpItem.checkSum;
        }
        return validationOtpItem.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSignature() {
        return this.signature;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCheckSum() {
        return this.checkSum;
    }

    public final ValidationOtpItem copy(String p0, String p1) {
        return new ValidationOtpItem(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ValidationOtpItem)) {
            return false;
        }
        ValidationOtpItem validationOtpItem = (ValidationOtpItem) p0;
        return Intrinsics.areEqual(this.signature, validationOtpItem.signature) && Intrinsics.areEqual(this.checkSum, validationOtpItem.checkSum);
    }

    public final int hashCode() {
        String str = this.signature;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.checkSum;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.signature;
        String str2 = this.checkSum;
        StringBuilder sb = new StringBuilder("ValidationOtpItem(signature=");
        sb.append(str);
        sb.append(", checkSum=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
