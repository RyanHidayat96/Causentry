package com.bpjstku.data.scholarship.model.response;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H×\u0001¢\u0006\u0004\b\u0012\u0010\u0013R*\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\b\"\u0004\b\u0017\u0010\u0006"}, d2 = {"Lcom/bpjstku/data/scholarship/model/response/ScholarshipBenefitListResponse;", "", "", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipBenefitPersonForList;", "p0", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/bpjstku/data/scholarship/model/response/ScholarshipBenefitListResponse;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "personBenefitList", "Ljava/util/List;", "getPersonBenefitList", "setPersonBenefitList"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ScholarshipBenefitListResponse {
    public static final int $stable = 8;

    @SerializedName("dataDaftarPenerimaBeasiswa")
    private List<ScholarshipBenefitPersonForList> personBenefitList;

    public ScholarshipBenefitListResponse(List<ScholarshipBenefitPersonForList> list) {
        this.personBenefitList = list;
    }

    public final List<ScholarshipBenefitPersonForList> getPersonBenefitList() {
        return this.personBenefitList;
    }

    public final void setPersonBenefitList(List<ScholarshipBenefitPersonForList> list) {
        this.personBenefitList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ScholarshipBenefitListResponse copy$default(ScholarshipBenefitListResponse scholarshipBenefitListResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = scholarshipBenefitListResponse.personBenefitList;
        }
        return scholarshipBenefitListResponse.copy(list);
    }

    public final List<ScholarshipBenefitPersonForList> component1() {
        return this.personBenefitList;
    }

    public final ScholarshipBenefitListResponse copy(List<ScholarshipBenefitPersonForList> p0) {
        return new ScholarshipBenefitListResponse(p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof ScholarshipBenefitListResponse) && Intrinsics.areEqual(this.personBenefitList, ((ScholarshipBenefitListResponse) p0).personBenefitList);
    }

    public final int hashCode() {
        List<ScholarshipBenefitPersonForList> list = this.personBenefitList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        List<ScholarshipBenefitPersonForList> list = this.personBenefitList;
        StringBuilder sb = new StringBuilder("ScholarshipBenefitListResponse(personBenefitList=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
