package com.bpjstku.data.tuition.model.request;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJB\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u001a\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u000bR\u001a\u0010 \u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u000bR\u001a\u0010\"\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u000b"}, d2 = {"Lcom/bpjstku/data/tuition/model/request/BpuOneMonthTuitionRequest;", "", "", "p0", "p1", "p2", "p3", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/tuition/model/request/BpuOneMonthTuitionRequest;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "chId", "Ljava/lang/String;", "getChId", "jmlBulan", "getJmlBulan", "kodePaket", "getKodePaket", "upah", "getUpah", "customField", "getCustomField"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BpuOneMonthTuitionRequest {
    public static final int $stable = 0;

    @SerializedName("chId")
    private final String chId;

    @SerializedName("customField")
    private final String customField;

    @SerializedName("jmlBulan")
    private final String jmlBulan;

    @SerializedName("kodePaket")
    private final String kodePaket;

    @SerializedName("upah")
    private final String upah;

    public BpuOneMonthTuitionRequest(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.chId = str;
        this.jmlBulan = str2;
        this.kodePaket = str3;
        this.upah = str4;
        this.customField = str5;
    }

    public final String getChId() {
        return this.chId;
    }

    public final String getJmlBulan() {
        return this.jmlBulan;
    }

    public final String getKodePaket() {
        return this.kodePaket;
    }

    public final String getUpah() {
        return this.upah;
    }

    public final String getCustomField() {
        return this.customField;
    }

    public static /* synthetic */ BpuOneMonthTuitionRequest copy$default(BpuOneMonthTuitionRequest bpuOneMonthTuitionRequest, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bpuOneMonthTuitionRequest.chId;
        }
        if ((i & 2) != 0) {
            str2 = bpuOneMonthTuitionRequest.jmlBulan;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = bpuOneMonthTuitionRequest.kodePaket;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = bpuOneMonthTuitionRequest.upah;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = bpuOneMonthTuitionRequest.customField;
        }
        return bpuOneMonthTuitionRequest.copy(str, str6, str7, str8, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChId() {
        return this.chId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getJmlBulan() {
        return this.jmlBulan;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getKodePaket() {
        return this.kodePaket;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUpah() {
        return this.upah;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCustomField() {
        return this.customField;
    }

    public final BpuOneMonthTuitionRequest copy(String p0, String p1, String p2, String p3, String p4) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        return new BpuOneMonthTuitionRequest(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof BpuOneMonthTuitionRequest)) {
            return false;
        }
        BpuOneMonthTuitionRequest bpuOneMonthTuitionRequest = (BpuOneMonthTuitionRequest) p0;
        return Intrinsics.areEqual(this.chId, bpuOneMonthTuitionRequest.chId) && Intrinsics.areEqual(this.jmlBulan, bpuOneMonthTuitionRequest.jmlBulan) && Intrinsics.areEqual(this.kodePaket, bpuOneMonthTuitionRequest.kodePaket) && Intrinsics.areEqual(this.upah, bpuOneMonthTuitionRequest.upah) && Intrinsics.areEqual(this.customField, bpuOneMonthTuitionRequest.customField);
    }

    public final int hashCode() {
        return (((((((this.chId.hashCode() * 31) + this.jmlBulan.hashCode()) * 31) + this.kodePaket.hashCode()) * 31) + this.upah.hashCode()) * 31) + this.customField.hashCode();
    }

    public final String toString() {
        String str = this.chId;
        String str2 = this.jmlBulan;
        String str3 = this.kodePaket;
        String str4 = this.upah;
        String str5 = this.customField;
        StringBuilder sb = new StringBuilder("BpuOneMonthTuitionRequest(chId=");
        sb.append(str);
        sb.append(", jmlBulan=");
        sb.append(str2);
        sb.append(", kodePaket=");
        sb.append(str3);
        sb.append(", upah=");
        sb.append(str4);
        sb.append(", customField=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }
}
