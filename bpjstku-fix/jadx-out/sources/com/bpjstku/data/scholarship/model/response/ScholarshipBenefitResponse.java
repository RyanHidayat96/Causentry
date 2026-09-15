package com.bpjstku.data.scholarship.model.response;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÇ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0015\u0010\nR$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\n\"\u0004\b\u0019\u0010\u001aR*\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/bpjstku/data/scholarship/model/response/ScholarshipBenefitResponse;", "", "", "p0", "", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipBenefitPerson;", "p1", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/bpjstku/data/scholarship/model/response/ScholarshipBenefitResponse;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "statusDesc", "Ljava/lang/String;", "getStatusDesc", "setStatusDesc", "(Ljava/lang/String;)V", "personBenefitList", "Ljava/util/List;", "getPersonBenefitList", "setPersonBenefitList", "(Ljava/util/List;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ScholarshipBenefitResponse {
    public static final int $stable = 8;

    @SerializedName("dataPenerimaManfaatBeasiswa")
    private List<ScholarshipBenefitPerson> personBenefitList;

    @SerializedName("statusDesc")
    private String statusDesc;

    public ScholarshipBenefitResponse(String str, List<ScholarshipBenefitPerson> list) {
        this.statusDesc = str;
        this.personBenefitList = list;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final void setStatusDesc(String str) {
        this.statusDesc = str;
    }

    public final List<ScholarshipBenefitPerson> getPersonBenefitList() {
        return this.personBenefitList;
    }

    public final void setPersonBenefitList(List<ScholarshipBenefitPerson> list) {
        this.personBenefitList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ScholarshipBenefitResponse copy$default(ScholarshipBenefitResponse scholarshipBenefitResponse, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = scholarshipBenefitResponse.statusDesc;
        }
        if ((i & 2) != 0) {
            list = scholarshipBenefitResponse.personBenefitList;
        }
        return scholarshipBenefitResponse.copy(str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final List<ScholarshipBenefitPerson> component2() {
        return this.personBenefitList;
    }

    public final ScholarshipBenefitResponse copy(String p0, List<ScholarshipBenefitPerson> p1) {
        return new ScholarshipBenefitResponse(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ScholarshipBenefitResponse)) {
            return false;
        }
        ScholarshipBenefitResponse scholarshipBenefitResponse = (ScholarshipBenefitResponse) p0;
        return Intrinsics.areEqual(this.statusDesc, scholarshipBenefitResponse.statusDesc) && Intrinsics.areEqual(this.personBenefitList, scholarshipBenefitResponse.personBenefitList);
    }

    public final int hashCode() {
        String str = this.statusDesc;
        int iHashCode = str == null ? 0 : str.hashCode();
        List<ScholarshipBenefitPerson> list = this.personBenefitList;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        String str = this.statusDesc;
        List<ScholarshipBenefitPerson> list = this.personBenefitList;
        StringBuilder sb = new StringBuilder("ScholarshipBenefitResponse(statusDesc=");
        sb.append(str);
        sb.append(", personBenefitList=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
