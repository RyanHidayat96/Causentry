package com.bpjstku.data.scholarship.model.response;

import com.bpjstku.data.lib.model.BaseItem;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0004\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0018\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J^\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00042\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0004HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0003\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001e\u0010\u000fR$\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000f\"\u0004\b\"\u0010#R*\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0011\"\u0004\b'\u0010(R$\u0010)\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010 \u001a\u0004\b*\u0010\u000f\"\u0004\b+\u0010#R*\u0010,\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010%\u001a\u0004\b-\u0010\u0011\"\u0004\b.\u0010(R*\u0010/\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u0010%\u001a\u0004\b0\u0010\u0011\"\u0004\b1\u0010("}, d2 = {"Lcom/bpjstku/data/scholarship/model/response/ScholarshipEligibleResponse;", "Lcom/bpjstku/data/lib/model/BaseItem;", "", "p0", "", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipDataEligible;", "p1", "p2", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipBenefitPerson;", "p3", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipBenefitPersonForList;", "p4", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/bpjstku/data/scholarship/model/response/ScholarshipEligibleResponse;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "statusDesc", "Ljava/lang/String;", "getStatusDesc", "setStatusDesc", "(Ljava/lang/String;)V", "eligibles", "Ljava/util/List;", "getEligibles", "setEligibles", "(Ljava/util/List;)V", "signature", "getSignature", "setSignature", "choosenScholarDetail", "getChoosenScholarDetail", "setChoosenScholarDetail", "choosenScholar", "getChoosenScholar", "setChoosenScholar"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ScholarshipEligibleResponse extends BaseItem {
    public static final int $stable = 8;

    @SerializedName("dataDaftarPenerimaBeasiswa")
    private List<ScholarshipBenefitPersonForList> choosenScholar;

    @SerializedName("dataPenerimaManfaatBeasiswa")
    private List<ScholarshipBenefitPerson> choosenScholarDetail;

    @SerializedName("eligibleData")
    private List<ScholarshipDataEligible> eligibles;

    @SerializedName("signature")
    private String signature;

    @SerializedName("statusDesc")
    private String statusDesc;

    public /* synthetic */ ScholarshipEligibleResponse(String str, List list, String str2, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? "" : str2, list2, list3);
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final void setStatusDesc(String str) {
        this.statusDesc = str;
    }

    public final List<ScholarshipDataEligible> getEligibles() {
        return this.eligibles;
    }

    public final void setEligibles(List<ScholarshipDataEligible> list) {
        this.eligibles = list;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final void setSignature(String str) {
        this.signature = str;
    }

    public final List<ScholarshipBenefitPerson> getChoosenScholarDetail() {
        return this.choosenScholarDetail;
    }

    public final void setChoosenScholarDetail(List<ScholarshipBenefitPerson> list) {
        this.choosenScholarDetail = list;
    }

    public final List<ScholarshipBenefitPersonForList> getChoosenScholar() {
        return this.choosenScholar;
    }

    public final void setChoosenScholar(List<ScholarshipBenefitPersonForList> list) {
        this.choosenScholar = list;
    }

    public ScholarshipEligibleResponse(String str, List<ScholarshipDataEligible> list, String str2, List<ScholarshipBenefitPerson> list2, List<ScholarshipBenefitPersonForList> list3) {
        this.statusDesc = str;
        this.eligibles = list;
        this.signature = str2;
        this.choosenScholarDetail = list2;
        this.choosenScholar = list3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ScholarshipEligibleResponse copy$default(ScholarshipEligibleResponse scholarshipEligibleResponse, String str, List list, String str2, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = scholarshipEligibleResponse.statusDesc;
        }
        if ((i & 2) != 0) {
            list = scholarshipEligibleResponse.eligibles;
        }
        List list4 = list;
        if ((i & 4) != 0) {
            str2 = scholarshipEligibleResponse.signature;
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            list2 = scholarshipEligibleResponse.choosenScholarDetail;
        }
        List list5 = list2;
        if ((i & 16) != 0) {
            list3 = scholarshipEligibleResponse.choosenScholar;
        }
        return scholarshipEligibleResponse.copy(str, list4, str3, list5, list3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final List<ScholarshipDataEligible> component2() {
        return this.eligibles;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSignature() {
        return this.signature;
    }

    public final List<ScholarshipBenefitPerson> component4() {
        return this.choosenScholarDetail;
    }

    public final List<ScholarshipBenefitPersonForList> component5() {
        return this.choosenScholar;
    }

    public final ScholarshipEligibleResponse copy(String p0, List<ScholarshipDataEligible> p1, String p2, List<ScholarshipBenefitPerson> p3, List<ScholarshipBenefitPersonForList> p4) {
        return new ScholarshipEligibleResponse(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ScholarshipEligibleResponse)) {
            return false;
        }
        ScholarshipEligibleResponse scholarshipEligibleResponse = (ScholarshipEligibleResponse) p0;
        return Intrinsics.areEqual(this.statusDesc, scholarshipEligibleResponse.statusDesc) && Intrinsics.areEqual(this.eligibles, scholarshipEligibleResponse.eligibles) && Intrinsics.areEqual(this.signature, scholarshipEligibleResponse.signature) && Intrinsics.areEqual(this.choosenScholarDetail, scholarshipEligibleResponse.choosenScholarDetail) && Intrinsics.areEqual(this.choosenScholar, scholarshipEligibleResponse.choosenScholar);
    }

    public final int hashCode() {
        String str = this.statusDesc;
        int iHashCode = str == null ? 0 : str.hashCode();
        List<ScholarshipDataEligible> list = this.eligibles;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        String str2 = this.signature;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        List<ScholarshipBenefitPerson> list2 = this.choosenScholarDetail;
        int iHashCode4 = list2 == null ? 0 : list2.hashCode();
        List<ScholarshipBenefitPersonForList> list3 = this.choosenScholar;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.statusDesc;
        List<ScholarshipDataEligible> list = this.eligibles;
        String str2 = this.signature;
        List<ScholarshipBenefitPerson> list2 = this.choosenScholarDetail;
        List<ScholarshipBenefitPersonForList> list3 = this.choosenScholar;
        StringBuilder sb = new StringBuilder("ScholarshipEligibleResponse(statusDesc=");
        sb.append(str);
        sb.append(", eligibles=");
        sb.append(list);
        sb.append(", signature=");
        sb.append(str2);
        sb.append(", choosenScholarDetail=");
        sb.append(list2);
        sb.append(", choosenScholar=");
        sb.append(list3);
        sb.append(")");
        return sb.toString();
    }
}
