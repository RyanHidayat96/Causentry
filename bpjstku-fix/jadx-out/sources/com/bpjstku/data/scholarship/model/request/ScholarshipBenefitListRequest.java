package com.bpjstku.data.scholarship.model.request;

import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0015\u0010\tR\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\t"}, d2 = {"Lcom/bpjstku/data/scholarship/model/request/ScholarshipBenefitListRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/scholarship/model/request/ScholarshipBenefitListRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "nikPelapor", "Ljava/lang/String;", "getNikPelapor", "namaPelapor", "getNamaPelapor", "nikPenerima", "getNikPenerima"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ScholarshipBenefitListRequest extends BaseRequest {
    public static final int $stable = 0;

    @SerializedName("namaPelapor")
    private final String namaPelapor;

    @SerializedName("nikPelapor")
    private final String nikPelapor;

    @SerializedName("nikPenerima")
    private final String nikPenerima;

    public final String getNikPelapor() {
        return this.nikPelapor;
    }

    public final String getNamaPelapor() {
        return this.namaPelapor;
    }

    public final String getNikPenerima() {
        return this.nikPenerima;
    }

    public ScholarshipBenefitListRequest(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.nikPelapor = str;
        this.namaPelapor = str2;
        this.nikPenerima = str3;
    }

    public static /* synthetic */ ScholarshipBenefitListRequest copy$default(ScholarshipBenefitListRequest scholarshipBenefitListRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = scholarshipBenefitListRequest.nikPelapor;
        }
        if ((i & 2) != 0) {
            str2 = scholarshipBenefitListRequest.namaPelapor;
        }
        if ((i & 4) != 0) {
            str3 = scholarshipBenefitListRequest.nikPenerima;
        }
        return scholarshipBenefitListRequest.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNikPelapor() {
        return this.nikPelapor;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNamaPelapor() {
        return this.namaPelapor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNikPenerima() {
        return this.nikPenerima;
    }

    public final ScholarshipBenefitListRequest copy(String p0, String p1, String p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        return new ScholarshipBenefitListRequest(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ScholarshipBenefitListRequest)) {
            return false;
        }
        ScholarshipBenefitListRequest scholarshipBenefitListRequest = (ScholarshipBenefitListRequest) p0;
        return Intrinsics.areEqual(this.nikPelapor, scholarshipBenefitListRequest.nikPelapor) && Intrinsics.areEqual(this.namaPelapor, scholarshipBenefitListRequest.namaPelapor) && Intrinsics.areEqual(this.nikPenerima, scholarshipBenefitListRequest.nikPenerima);
    }

    public final int hashCode() {
        return (((this.nikPelapor.hashCode() * 31) + this.namaPelapor.hashCode()) * 31) + this.nikPenerima.hashCode();
    }

    public final String toString() {
        String str = this.nikPelapor;
        String str2 = this.namaPelapor;
        String str3 = this.nikPenerima;
        StringBuilder sb = new StringBuilder("ScholarshipBenefitListRequest(nikPelapor=");
        sb.append(str);
        sb.append(", namaPelapor=");
        sb.append(str2);
        sb.append(", nikPenerima=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
