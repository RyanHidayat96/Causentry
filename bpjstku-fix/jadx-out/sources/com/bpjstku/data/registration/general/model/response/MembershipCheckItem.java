package com.bpjstku.data.registration.general.model.response;

import com.bpjstku.data.lib.model.BaseItem;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0015\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\t"}, d2 = {"Lcom/bpjstku/data/registration/general/model/response/MembershipCheckItem;", "Lcom/bpjstku/data/lib/model/BaseItem;", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/registration/general/model/response/MembershipCheckItem;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "checkSum", "Ljava/lang/String;", "getCheckSum", "signature", "getSignature", "activationCheckSum", "getActivationCheckSum"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MembershipCheckItem extends BaseItem {
    public static final int $stable = 0;

    @SerializedName("activationCheckSum")
    private final String activationCheckSum;

    @SerializedName("checkSum")
    private final String checkSum;

    @SerializedName("signature")
    private final String signature;

    public final String getCheckSum() {
        return this.checkSum;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final String getActivationCheckSum() {
        return this.activationCheckSum;
    }

    public MembershipCheckItem(String str, String str2, String str3) {
        this.checkSum = str;
        this.signature = str2;
        this.activationCheckSum = str3;
    }

    public static /* synthetic */ MembershipCheckItem copy$default(MembershipCheckItem membershipCheckItem, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = membershipCheckItem.checkSum;
        }
        if ((i & 2) != 0) {
            str2 = membershipCheckItem.signature;
        }
        if ((i & 4) != 0) {
            str3 = membershipCheckItem.activationCheckSum;
        }
        return membershipCheckItem.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCheckSum() {
        return this.checkSum;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSignature() {
        return this.signature;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getActivationCheckSum() {
        return this.activationCheckSum;
    }

    public final MembershipCheckItem copy(String p0, String p1, String p2) {
        return new MembershipCheckItem(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof MembershipCheckItem)) {
            return false;
        }
        MembershipCheckItem membershipCheckItem = (MembershipCheckItem) p0;
        return Intrinsics.areEqual(this.checkSum, membershipCheckItem.checkSum) && Intrinsics.areEqual(this.signature, membershipCheckItem.signature) && Intrinsics.areEqual(this.activationCheckSum, membershipCheckItem.activationCheckSum);
    }

    public final int hashCode() {
        String str = this.checkSum;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.signature;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.activationCheckSum;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.checkSum;
        String str2 = this.signature;
        String str3 = this.activationCheckSum;
        StringBuilder sb = new StringBuilder("MembershipCheckItem(checkSum=");
        sb.append(str);
        sb.append(", signature=");
        sb.append(str2);
        sb.append(", activationCheckSum=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
