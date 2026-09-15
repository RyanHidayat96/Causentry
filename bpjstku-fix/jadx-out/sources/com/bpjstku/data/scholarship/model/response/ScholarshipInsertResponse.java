package com.bpjstku.data.scholarship.model.response;

import com.bpjstku.data.scholarship.model.request.ScholarshipDataDocumentForInsert;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJL\u0010\u0014\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cH×\u0001¢\u0006\u0004\b\u001d\u0010\u001eR*\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010#R$\u0010$\u001a\u0004\u0018\u00010\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0010\"\u0004\b'\u0010(R$\u0010)\u001a\u0004\u0018\u00010\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0012\"\u0004\b,\u0010-R\"\u0010.\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010 \u001a\u0004\b/\u0010\u000e"}, d2 = {"Lcom/bpjstku/data/scholarship/model/response/ScholarshipInsertResponse;", "", "", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipInsertConfirmResult;", "p0", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipInsertPerson;", "p1", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipTemplateEmail;", "p2", "Lcom/bpjstku/data/scholarship/model/request/ScholarshipDataDocumentForInsert;", "p3", "<init>", "(Ljava/util/List;Lcom/bpjstku/data/scholarship/model/response/ScholarshipInsertPerson;Lcom/bpjstku/data/scholarship/model/response/ScholarshipTemplateEmail;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/bpjstku/data/scholarship/model/response/ScholarshipInsertPerson;", "component3", "()Lcom/bpjstku/data/scholarship/model/response/ScholarshipTemplateEmail;", "component4", "copy", "(Ljava/util/List;Lcom/bpjstku/data/scholarship/model/response/ScholarshipInsertPerson;Lcom/bpjstku/data/scholarship/model/response/ScholarshipTemplateEmail;Ljava/util/List;)Lcom/bpjstku/data/scholarship/model/response/ScholarshipInsertResponse;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "confirmResult", "Ljava/util/List;", "getConfirmResult", "setConfirmResult", "(Ljava/util/List;)V", "dataSiswa", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipInsertPerson;", "getDataSiswa", "setDataSiswa", "(Lcom/bpjstku/data/scholarship/model/response/ScholarshipInsertPerson;)V", "templateEmail", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipTemplateEmail;", "getTemplateEmail", "setTemplateEmail", "(Lcom/bpjstku/data/scholarship/model/response/ScholarshipTemplateEmail;)V", "documentBeasiswa", "getDocumentBeasiswa"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ScholarshipInsertResponse {
    public static final int $stable = 8;

    @SerializedName("dataInsertKonfirmasiBeasiswa")
    private List<ScholarshipInsertConfirmResult> confirmResult;

    @SerializedName("dataSiswa")
    private ScholarshipInsertPerson dataSiswa;

    @SerializedName("dataDokumenBeasiswa")
    private final List<ScholarshipDataDocumentForInsert> documentBeasiswa;

    @SerializedName("templateEmail")
    private ScholarshipTemplateEmail templateEmail;

    public ScholarshipInsertResponse(List<ScholarshipInsertConfirmResult> list, ScholarshipInsertPerson scholarshipInsertPerson, ScholarshipTemplateEmail scholarshipTemplateEmail, List<ScholarshipDataDocumentForInsert> list2) {
        this.confirmResult = list;
        this.dataSiswa = scholarshipInsertPerson;
        this.templateEmail = scholarshipTemplateEmail;
        this.documentBeasiswa = list2;
    }

    public /* synthetic */ ScholarshipInsertResponse(List list, ScholarshipInsertPerson scholarshipInsertPerson, ScholarshipTemplateEmail scholarshipTemplateEmail, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : scholarshipInsertPerson, (i & 4) != 0 ? null : scholarshipTemplateEmail, (i & 8) != 0 ? null : list2);
    }

    public final List<ScholarshipInsertConfirmResult> getConfirmResult() {
        return this.confirmResult;
    }

    public final void setConfirmResult(List<ScholarshipInsertConfirmResult> list) {
        this.confirmResult = list;
    }

    public final ScholarshipInsertPerson getDataSiswa() {
        return this.dataSiswa;
    }

    public final void setDataSiswa(ScholarshipInsertPerson scholarshipInsertPerson) {
        this.dataSiswa = scholarshipInsertPerson;
    }

    public final ScholarshipTemplateEmail getTemplateEmail() {
        return this.templateEmail;
    }

    public final void setTemplateEmail(ScholarshipTemplateEmail scholarshipTemplateEmail) {
        this.templateEmail = scholarshipTemplateEmail;
    }

    public final List<ScholarshipDataDocumentForInsert> getDocumentBeasiswa() {
        return this.documentBeasiswa;
    }

    public ScholarshipInsertResponse() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ScholarshipInsertResponse copy$default(ScholarshipInsertResponse scholarshipInsertResponse, List list, ScholarshipInsertPerson scholarshipInsertPerson, ScholarshipTemplateEmail scholarshipTemplateEmail, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = scholarshipInsertResponse.confirmResult;
        }
        if ((i & 2) != 0) {
            scholarshipInsertPerson = scholarshipInsertResponse.dataSiswa;
        }
        if ((i & 4) != 0) {
            scholarshipTemplateEmail = scholarshipInsertResponse.templateEmail;
        }
        if ((i & 8) != 0) {
            list2 = scholarshipInsertResponse.documentBeasiswa;
        }
        return scholarshipInsertResponse.copy(list, scholarshipInsertPerson, scholarshipTemplateEmail, list2);
    }

    public final List<ScholarshipInsertConfirmResult> component1() {
        return this.confirmResult;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ScholarshipInsertPerson getDataSiswa() {
        return this.dataSiswa;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ScholarshipTemplateEmail getTemplateEmail() {
        return this.templateEmail;
    }

    public final List<ScholarshipDataDocumentForInsert> component4() {
        return this.documentBeasiswa;
    }

    public final ScholarshipInsertResponse copy(List<ScholarshipInsertConfirmResult> p0, ScholarshipInsertPerson p1, ScholarshipTemplateEmail p2, List<ScholarshipDataDocumentForInsert> p3) {
        return new ScholarshipInsertResponse(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ScholarshipInsertResponse)) {
            return false;
        }
        ScholarshipInsertResponse scholarshipInsertResponse = (ScholarshipInsertResponse) p0;
        return Intrinsics.areEqual(this.confirmResult, scholarshipInsertResponse.confirmResult) && Intrinsics.areEqual(this.dataSiswa, scholarshipInsertResponse.dataSiswa) && Intrinsics.areEqual(this.templateEmail, scholarshipInsertResponse.templateEmail) && Intrinsics.areEqual(this.documentBeasiswa, scholarshipInsertResponse.documentBeasiswa);
    }

    public final int hashCode() {
        List<ScholarshipInsertConfirmResult> list = this.confirmResult;
        int iHashCode = list == null ? 0 : list.hashCode();
        ScholarshipInsertPerson scholarshipInsertPerson = this.dataSiswa;
        int iHashCode2 = scholarshipInsertPerson == null ? 0 : scholarshipInsertPerson.hashCode();
        ScholarshipTemplateEmail scholarshipTemplateEmail = this.templateEmail;
        int iHashCode3 = scholarshipTemplateEmail == null ? 0 : scholarshipTemplateEmail.hashCode();
        List<ScholarshipDataDocumentForInsert> list2 = this.documentBeasiswa;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        List<ScholarshipInsertConfirmResult> list = this.confirmResult;
        ScholarshipInsertPerson scholarshipInsertPerson = this.dataSiswa;
        ScholarshipTemplateEmail scholarshipTemplateEmail = this.templateEmail;
        List<ScholarshipDataDocumentForInsert> list2 = this.documentBeasiswa;
        StringBuilder sb = new StringBuilder("ScholarshipInsertResponse(confirmResult=");
        sb.append(list);
        sb.append(", dataSiswa=");
        sb.append(scholarshipInsertPerson);
        sb.append(", templateEmail=");
        sb.append(scholarshipTemplateEmail);
        sb.append(", documentBeasiswa=");
        sb.append(list2);
        sb.append(")");
        return sb.toString();
    }
}
