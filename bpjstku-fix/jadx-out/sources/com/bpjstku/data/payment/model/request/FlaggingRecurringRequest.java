package com.bpjstku.data.payment.model.request;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0016\u0010\nR\u001a\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\nR\u001a\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\n"}, d2 = {"Lcom/bpjstku/data/payment/model/request/FlaggingRecurringRequest;", "", "", "p0", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/payment/model/request/FlaggingRecurringRequest;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "reqId", "Ljava/lang/String;", "getReqId", "nik", "getNik", "kodeIuran", "getKodeIuran", "trxId", "getTrxId"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class FlaggingRecurringRequest {
    public static final int $stable = 0;

    @SerializedName("kodeIuran")
    private final String kodeIuran;

    @SerializedName("nik")
    private final String nik;

    @SerializedName("reqId")
    private final String reqId;

    @SerializedName("trxId")
    private final String trxId;

    public FlaggingRecurringRequest(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.reqId = str;
        this.nik = str2;
        this.kodeIuran = str3;
        this.trxId = str4;
    }

    public final String getReqId() {
        return this.reqId;
    }

    public final String getNik() {
        return this.nik;
    }

    public final String getKodeIuran() {
        return this.kodeIuran;
    }

    public final String getTrxId() {
        return this.trxId;
    }

    public static /* synthetic */ FlaggingRecurringRequest copy$default(FlaggingRecurringRequest flaggingRecurringRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = flaggingRecurringRequest.reqId;
        }
        if ((i & 2) != 0) {
            str2 = flaggingRecurringRequest.nik;
        }
        if ((i & 4) != 0) {
            str3 = flaggingRecurringRequest.kodeIuran;
        }
        if ((i & 8) != 0) {
            str4 = flaggingRecurringRequest.trxId;
        }
        return flaggingRecurringRequest.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getReqId() {
        return this.reqId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNik() {
        return this.nik;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getKodeIuran() {
        return this.kodeIuran;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTrxId() {
        return this.trxId;
    }

    public final FlaggingRecurringRequest copy(String p0, String p1, String p2, String p3) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        return new FlaggingRecurringRequest(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof FlaggingRecurringRequest)) {
            return false;
        }
        FlaggingRecurringRequest flaggingRecurringRequest = (FlaggingRecurringRequest) p0;
        return Intrinsics.areEqual(this.reqId, flaggingRecurringRequest.reqId) && Intrinsics.areEqual(this.nik, flaggingRecurringRequest.nik) && Intrinsics.areEqual(this.kodeIuran, flaggingRecurringRequest.kodeIuran) && Intrinsics.areEqual(this.trxId, flaggingRecurringRequest.trxId);
    }

    public final int hashCode() {
        return (((((this.reqId.hashCode() * 31) + this.nik.hashCode()) * 31) + this.kodeIuran.hashCode()) * 31) + this.trxId.hashCode();
    }

    public final String toString() {
        String str = this.reqId;
        String str2 = this.nik;
        String str3 = this.kodeIuran;
        String str4 = this.trxId;
        StringBuilder sb = new StringBuilder("FlaggingRecurringRequest(reqId=");
        sb.append(str);
        sb.append(", nik=");
        sb.append(str2);
        sb.append(", kodeIuran=");
        sb.append(str3);
        sb.append(", trxId=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }
}
