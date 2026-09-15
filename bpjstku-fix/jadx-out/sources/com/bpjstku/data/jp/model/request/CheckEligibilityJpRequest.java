package com.bpjstku.data.jp.model.request;

import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0017\u0010\nR\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u001d\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\nR\u001a\u0010\u001f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\n"}, d2 = {"Lcom/bpjstku/data/jp/model/request/CheckEligibilityJpRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/jp/model/request/CheckEligibilityJpRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "nikPelapor", "Ljava/lang/String;", "getNikPelapor", "namaPelapor", "getNamaPelapor", "kodeKlaim", "getKodeKlaim", "email", "getEmail"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CheckEligibilityJpRequest extends BaseRequest {
    public static final int $stable = 0;

    @SerializedName("email")
    private final String email;

    @SerializedName("kodeKlaim")
    private final String kodeKlaim;

    @SerializedName("namaPelapor")
    private final String namaPelapor;

    @SerializedName("nikPelapor")
    private final String nikPelapor;

    public final String getNikPelapor() {
        return this.nikPelapor;
    }

    public final String getNamaPelapor() {
        return this.namaPelapor;
    }

    public final String getKodeKlaim() {
        return this.kodeKlaim;
    }

    public final String getEmail() {
        return this.email;
    }

    public CheckEligibilityJpRequest(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.nikPelapor = str;
        this.namaPelapor = str2;
        this.kodeKlaim = str3;
        this.email = str4;
    }

    public static /* synthetic */ CheckEligibilityJpRequest copy$default(CheckEligibilityJpRequest checkEligibilityJpRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkEligibilityJpRequest.nikPelapor;
        }
        if ((i & 2) != 0) {
            str2 = checkEligibilityJpRequest.namaPelapor;
        }
        if ((i & 4) != 0) {
            str3 = checkEligibilityJpRequest.kodeKlaim;
        }
        if ((i & 8) != 0) {
            str4 = checkEligibilityJpRequest.email;
        }
        return checkEligibilityJpRequest.copy(str, str2, str3, str4);
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
    public final String getKodeKlaim() {
        return this.kodeKlaim;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    public final CheckEligibilityJpRequest copy(String p0, String p1, String p2, String p3) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        return new CheckEligibilityJpRequest(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof CheckEligibilityJpRequest)) {
            return false;
        }
        CheckEligibilityJpRequest checkEligibilityJpRequest = (CheckEligibilityJpRequest) p0;
        return Intrinsics.areEqual(this.nikPelapor, checkEligibilityJpRequest.nikPelapor) && Intrinsics.areEqual(this.namaPelapor, checkEligibilityJpRequest.namaPelapor) && Intrinsics.areEqual(this.kodeKlaim, checkEligibilityJpRequest.kodeKlaim) && Intrinsics.areEqual(this.email, checkEligibilityJpRequest.email);
    }

    public final int hashCode() {
        return (((((this.nikPelapor.hashCode() * 31) + this.namaPelapor.hashCode()) * 31) + this.kodeKlaim.hashCode()) * 31) + this.email.hashCode();
    }

    public final String toString() {
        String str = this.nikPelapor;
        String str2 = this.namaPelapor;
        String str3 = this.kodeKlaim;
        String str4 = this.email;
        StringBuilder sb = new StringBuilder("CheckEligibilityJpRequest(nikPelapor=");
        sb.append(str);
        sb.append(", namaPelapor=");
        sb.append(str2);
        sb.append(", kodeKlaim=");
        sb.append(str3);
        sb.append(", email=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }
}
