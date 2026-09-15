package com.bpjstku.data.asik.model.request;

import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0018\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bHÇ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J^\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bHÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0003\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001e\u0010\u000eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000eR\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u000eR\u001c\u0010$\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\u000eR\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\u000eR\u001c\u0010(\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\u000eR\"\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0014"}, d2 = {"Lcom/bpjstku/data/asik/model/request/AsikFirstStepRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "p4", "", "Lcom/bpjstku/data/asik/model/request/EmployeeKpjRequest;", "p5", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/bpjstku/data/asik/model/request/AsikFirstStepRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "identityNumber", "Ljava/lang/String;", "getIdentityNumber", "fullName", "getFullName", "birthdate", "getBirthdate", "birthplace", "getBirthplace", "transactionId", "getTransactionId", "kpj", "Ljava/util/List;", "getKpj"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AsikFirstStepRequest extends BaseRequest {
    public static final int $stable = 8;

    @SerializedName("birthdate")
    private final String birthdate;

    @SerializedName("birthplace")
    private final String birthplace;

    @SerializedName("fullName")
    private final String fullName;

    @SerializedName("identityNumber")
    private final String identityNumber;

    @SerializedName("kpj")
    private final List<EmployeeKpjRequest> kpj;

    @SerializedName("transactionId")
    private final String transactionId;

    public final String getIdentityNumber() {
        return this.identityNumber;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final String getBirthdate() {
        return this.birthdate;
    }

    public final String getBirthplace() {
        return this.birthplace;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public final List<EmployeeKpjRequest> getKpj() {
        return this.kpj;
    }

    public AsikFirstStepRequest(String str, String str2, String str3, String str4, String str5, List<EmployeeKpjRequest> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.identityNumber = str;
        this.fullName = str2;
        this.birthdate = str3;
        this.birthplace = str4;
        this.transactionId = str5;
        this.kpj = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AsikFirstStepRequest copy$default(AsikFirstStepRequest asikFirstStepRequest, String str, String str2, String str3, String str4, String str5, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = asikFirstStepRequest.identityNumber;
        }
        if ((i & 2) != 0) {
            str2 = asikFirstStepRequest.fullName;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = asikFirstStepRequest.birthdate;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = asikFirstStepRequest.birthplace;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = asikFirstStepRequest.transactionId;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            list = asikFirstStepRequest.kpj;
        }
        return asikFirstStepRequest.copy(str, str6, str7, str8, str9, list);
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
    public final String getBirthdate() {
        return this.birthdate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBirthplace() {
        return this.birthplace;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    public final List<EmployeeKpjRequest> component6() {
        return this.kpj;
    }

    public final AsikFirstStepRequest copy(String p0, String p1, String p2, String p3, String p4, List<EmployeeKpjRequest> p5) {
        Intrinsics.checkNotNullParameter(p5, "");
        return new AsikFirstStepRequest(p0, p1, p2, p3, p4, p5);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AsikFirstStepRequest)) {
            return false;
        }
        AsikFirstStepRequest asikFirstStepRequest = (AsikFirstStepRequest) p0;
        return Intrinsics.areEqual(this.identityNumber, asikFirstStepRequest.identityNumber) && Intrinsics.areEqual(this.fullName, asikFirstStepRequest.fullName) && Intrinsics.areEqual(this.birthdate, asikFirstStepRequest.birthdate) && Intrinsics.areEqual(this.birthplace, asikFirstStepRequest.birthplace) && Intrinsics.areEqual(this.transactionId, asikFirstStepRequest.transactionId) && Intrinsics.areEqual(this.kpj, asikFirstStepRequest.kpj);
    }

    public final int hashCode() {
        String str = this.identityNumber;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.fullName;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.birthdate;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.birthplace;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.transactionId;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str5 != null ? str5.hashCode() : 0)) * 31) + this.kpj.hashCode();
    }

    public final String toString() {
        String str = this.identityNumber;
        String str2 = this.fullName;
        String str3 = this.birthdate;
        String str4 = this.birthplace;
        String str5 = this.transactionId;
        List<EmployeeKpjRequest> list = this.kpj;
        StringBuilder sb = new StringBuilder("AsikFirstStepRequest(identityNumber=");
        sb.append(str);
        sb.append(", fullName=");
        sb.append(str2);
        sb.append(", birthdate=");
        sb.append(str3);
        sb.append(", birthplace=");
        sb.append(str4);
        sb.append(", transactionId=");
        sb.append(str5);
        sb.append(", kpj=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
