package com.bpjstku.data.asik.model.request;

import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0015\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\t"}, d2 = {"Lcom/bpjstku/data/asik/model/request/AsikListKpjRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/asik/model/request/AsikListKpjRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "identityNumber", "Ljava/lang/String;", "getIdentityNumber", "name", "getName", "dateOfBirth", "getDateOfBirth"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AsikListKpjRequest extends BaseRequest {
    public static final int $stable = 0;

    @SerializedName("dateOfBirth")
    private final String dateOfBirth;

    @SerializedName("identityNumber")
    private final String identityNumber;

    @SerializedName("name")
    private final String name;

    public final String getIdentityNumber() {
        return this.identityNumber;
    }

    public final String getName() {
        return this.name;
    }

    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public AsikListKpjRequest(String str, String str2, String str3) {
        this.identityNumber = str;
        this.name = str2;
        this.dateOfBirth = str3;
    }

    public static /* synthetic */ AsikListKpjRequest copy$default(AsikListKpjRequest asikListKpjRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = asikListKpjRequest.identityNumber;
        }
        if ((i & 2) != 0) {
            str2 = asikListKpjRequest.name;
        }
        if ((i & 4) != 0) {
            str3 = asikListKpjRequest.dateOfBirth;
        }
        return asikListKpjRequest.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIdentityNumber() {
        return this.identityNumber;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final AsikListKpjRequest copy(String p0, String p1, String p2) {
        return new AsikListKpjRequest(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AsikListKpjRequest)) {
            return false;
        }
        AsikListKpjRequest asikListKpjRequest = (AsikListKpjRequest) p0;
        return Intrinsics.areEqual(this.identityNumber, asikListKpjRequest.identityNumber) && Intrinsics.areEqual(this.name, asikListKpjRequest.name) && Intrinsics.areEqual(this.dateOfBirth, asikListKpjRequest.dateOfBirth);
    }

    public final int hashCode() {
        String str = this.identityNumber;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.name;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.dateOfBirth;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.identityNumber;
        String str2 = this.name;
        String str3 = this.dateOfBirth;
        StringBuilder sb = new StringBuilder("AsikListKpjRequest(identityNumber=");
        sb.append(str);
        sb.append(", name=");
        sb.append(str2);
        sb.append(", dateOfBirth=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
