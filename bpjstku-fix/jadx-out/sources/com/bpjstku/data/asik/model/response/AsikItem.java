package com.bpjstku.data.asik.model.response;

import com.bpjstku.data.lib.model.BaseHeaderItem;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0013\u0010\bR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/bpjstku/data/asik/model/response/AsikItem;", "Lcom/bpjstku/data/lib/model/BaseHeaderItem;", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/asik/model/response/AsikItem;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "submissionCode", "Ljava/lang/String;", "getSubmissionCode", "officeCode", "getOfficeCode"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AsikItem extends BaseHeaderItem {
    public static final int $stable = 0;

    @SerializedName("officeCode")
    private final String officeCode;

    @SerializedName("submissionCode")
    private final String submissionCode;

    public final String getSubmissionCode() {
        return this.submissionCode;
    }

    public final String getOfficeCode() {
        return this.officeCode;
    }

    public AsikItem(String str, String str2) {
        this.submissionCode = str;
        this.officeCode = str2;
    }

    public static /* synthetic */ AsikItem copy$default(AsikItem asikItem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = asikItem.submissionCode;
        }
        if ((i & 2) != 0) {
            str2 = asikItem.officeCode;
        }
        return asikItem.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSubmissionCode() {
        return this.submissionCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOfficeCode() {
        return this.officeCode;
    }

    public final AsikItem copy(String p0, String p1) {
        return new AsikItem(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AsikItem)) {
            return false;
        }
        AsikItem asikItem = (AsikItem) p0;
        return Intrinsics.areEqual(this.submissionCode, asikItem.submissionCode) && Intrinsics.areEqual(this.officeCode, asikItem.officeCode);
    }

    public final int hashCode() {
        String str = this.submissionCode;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.officeCode;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.submissionCode;
        String str2 = this.officeCode;
        StringBuilder sb = new StringBuilder("AsikItem(submissionCode=");
        sb.append(str);
        sb.append(", officeCode=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
