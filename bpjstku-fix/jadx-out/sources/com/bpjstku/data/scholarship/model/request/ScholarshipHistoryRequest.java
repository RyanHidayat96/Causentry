package com.bpjstku.data.scholarship.model.request;

import android.os.Process;
import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0013\u0010\bR\u001a\u0010\u0014\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/bpjstku/data/scholarship/model/request/ScholarshipHistoryRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/scholarship/model/request/ScholarshipHistoryRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "email", "Ljava/lang/String;", "getEmail", "nikPenerima", "getNikPenerima"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ScholarshipHistoryRequest extends BaseRequest {
    public static final int $stable = 0;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public static int b;

    @SerializedName("email")
    private final String email;

    @SerializedName("nikPenerima")
    private final String nikPenerima;

    public final String getEmail() {
        return this.email;
    }

    public final String getNikPenerima() {
        return this.nikPenerima;
    }

    public ScholarshipHistoryRequest(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.email = str;
        this.nikPenerima = str2;
    }

    public static /* synthetic */ ScholarshipHistoryRequest copy$default(ScholarshipHistoryRequest scholarshipHistoryRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = scholarshipHistoryRequest.email;
        }
        if ((i & 2) != 0) {
            str2 = scholarshipHistoryRequest.nikPenerima;
        }
        return scholarshipHistoryRequest.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNikPenerima() {
        return this.nikPenerima;
    }

    public final ScholarshipHistoryRequest copy(String p0, String p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        return new ScholarshipHistoryRequest(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ScholarshipHistoryRequest)) {
            return false;
        }
        ScholarshipHistoryRequest scholarshipHistoryRequest = (ScholarshipHistoryRequest) p0;
        return Intrinsics.areEqual(this.email, scholarshipHistoryRequest.email) && Intrinsics.areEqual(this.nikPenerima, scholarshipHistoryRequest.nikPenerima);
    }

    public final int hashCode() {
        return (this.email.hashCode() * 31) + this.nikPenerima.hashCode();
    }

    public final String toString() {
        String str = this.email;
        String str2 = this.nikPenerima;
        StringBuilder sb = new StringBuilder("ScholarshipHistoryRequest(email=");
        sb.append(str);
        sb.append(", nikPenerima=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public static int b() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i2 = i % 7703307;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i + 1;
        if (i2 != 0) {
            return b;
        }
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        b = startUptimeMillis;
        return startUptimeMillis;
    }
}
