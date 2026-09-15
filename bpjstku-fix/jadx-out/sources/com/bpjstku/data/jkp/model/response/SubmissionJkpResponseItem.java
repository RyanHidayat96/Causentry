package com.bpjstku.data.jkp.model.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/bpjstku/data/jkp/model/response/SubmissionJkpResponseItem;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/jkp/model/response/SubmissionJkpResponseItem;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "statusKelayakan", "Ljava/lang/String;", "getStatusKelayakan", "kodePesan", "getKodePesan"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SubmissionJkpResponseItem {
    public static final int $stable = 0;

    @SerializedName("kodePesan")
    private final String kodePesan;

    @SerializedName("statusKelayakan")
    private final String statusKelayakan;

    public SubmissionJkpResponseItem(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.statusKelayakan = str;
        this.kodePesan = str2;
    }

    public final String getStatusKelayakan() {
        return this.statusKelayakan;
    }

    public final String getKodePesan() {
        return this.kodePesan;
    }

    public static /* synthetic */ SubmissionJkpResponseItem copy$default(SubmissionJkpResponseItem submissionJkpResponseItem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = submissionJkpResponseItem.statusKelayakan;
        }
        if ((i & 2) != 0) {
            str2 = submissionJkpResponseItem.kodePesan;
        }
        return submissionJkpResponseItem.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatusKelayakan() {
        return this.statusKelayakan;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKodePesan() {
        return this.kodePesan;
    }

    public final SubmissionJkpResponseItem copy(String p0, String p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        return new SubmissionJkpResponseItem(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SubmissionJkpResponseItem)) {
            return false;
        }
        SubmissionJkpResponseItem submissionJkpResponseItem = (SubmissionJkpResponseItem) p0;
        return Intrinsics.areEqual(this.statusKelayakan, submissionJkpResponseItem.statusKelayakan) && Intrinsics.areEqual(this.kodePesan, submissionJkpResponseItem.kodePesan);
    }

    public final int hashCode() {
        return (this.statusKelayakan.hashCode() * 31) + this.kodePesan.hashCode();
    }

    public final String toString() {
        String str = this.statusKelayakan;
        String str2 = this.kodePesan;
        StringBuilder sb = new StringBuilder("SubmissionJkpResponseItem(statusKelayakan=");
        sb.append(str);
        sb.append(", kodePesan=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
