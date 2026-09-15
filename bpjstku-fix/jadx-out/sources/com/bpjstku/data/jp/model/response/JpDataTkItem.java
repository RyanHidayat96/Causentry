package com.bpjstku.data.jp.model.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0016\u0010\nR\u001a\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\nR\u001a\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\n"}, d2 = {"Lcom/bpjstku/data/jp/model/response/JpDataTkItem;", "", "", "p0", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/jp/model/response/JpDataTkItem;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "kpjPekerjan", "Ljava/lang/String;", "getKpjPekerjan", "nikPekerja", "getNikPekerja", "namaLengkapPekerja", "getNamaLengkapPekerja", "kodeKlaim", "getKodeKlaim"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class JpDataTkItem {
    public static final int $stable = 0;

    @SerializedName("kodeKlaim")
    private final String kodeKlaim;

    @SerializedName("kpjPekerjan")
    private final String kpjPekerjan;

    @SerializedName("namaLengkapPekerja")
    private final String namaLengkapPekerja;

    @SerializedName("nikPekerja")
    private final String nikPekerja;

    public JpDataTkItem(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.kpjPekerjan = str;
        this.nikPekerja = str2;
        this.namaLengkapPekerja = str3;
        this.kodeKlaim = str4;
    }

    public final String getKpjPekerjan() {
        return this.kpjPekerjan;
    }

    public final String getNikPekerja() {
        return this.nikPekerja;
    }

    public final String getNamaLengkapPekerja() {
        return this.namaLengkapPekerja;
    }

    public final String getKodeKlaim() {
        return this.kodeKlaim;
    }

    public static /* synthetic */ JpDataTkItem copy$default(JpDataTkItem jpDataTkItem, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jpDataTkItem.kpjPekerjan;
        }
        if ((i & 2) != 0) {
            str2 = jpDataTkItem.nikPekerja;
        }
        if ((i & 4) != 0) {
            str3 = jpDataTkItem.namaLengkapPekerja;
        }
        if ((i & 8) != 0) {
            str4 = jpDataTkItem.kodeKlaim;
        }
        return jpDataTkItem.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKpjPekerjan() {
        return this.kpjPekerjan;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNikPekerja() {
        return this.nikPekerja;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNamaLengkapPekerja() {
        return this.namaLengkapPekerja;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getKodeKlaim() {
        return this.kodeKlaim;
    }

    public final JpDataTkItem copy(String p0, String p1, String p2, String p3) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        return new JpDataTkItem(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof JpDataTkItem)) {
            return false;
        }
        JpDataTkItem jpDataTkItem = (JpDataTkItem) p0;
        return Intrinsics.areEqual(this.kpjPekerjan, jpDataTkItem.kpjPekerjan) && Intrinsics.areEqual(this.nikPekerja, jpDataTkItem.nikPekerja) && Intrinsics.areEqual(this.namaLengkapPekerja, jpDataTkItem.namaLengkapPekerja) && Intrinsics.areEqual(this.kodeKlaim, jpDataTkItem.kodeKlaim);
    }

    public final int hashCode() {
        return (((((this.kpjPekerjan.hashCode() * 31) + this.nikPekerja.hashCode()) * 31) + this.namaLengkapPekerja.hashCode()) * 31) + this.kodeKlaim.hashCode();
    }

    public final String toString() {
        String str = this.kpjPekerjan;
        String str2 = this.nikPekerja;
        String str3 = this.namaLengkapPekerja;
        String str4 = this.kodeKlaim;
        StringBuilder sb = new StringBuilder("JpDataTkItem(kpjPekerjan=");
        sb.append(str);
        sb.append(", nikPekerja=");
        sb.append(str2);
        sb.append(", namaLengkapPekerja=");
        sb.append(str3);
        sb.append(", kodeKlaim=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }
}
