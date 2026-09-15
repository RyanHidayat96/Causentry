package com.bpjstku.data.promo.model.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ@\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0016\u0010\nR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\nR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\n"}, d2 = {"Lcom/bpjstku/data/promo/model/response/SyaratItem;", "", "", "p0", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/promo/model/response/SyaratItem;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "kodeSyaratKetentuan", "Ljava/lang/String;", "getKodeSyaratKetentuan", "namaSyaratKetentuan", "getNamaSyaratKetentuan", "isiSyaratKetentuan", "getIsiSyaratKetentuan", "kodeComarSyarat", "getKodeComarSyarat"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SyaratItem {
    public static final int $stable = 0;

    @SerializedName("isiSyaratKetentuan")
    private final String isiSyaratKetentuan;

    @SerializedName("kodeComarSyarat")
    private final String kodeComarSyarat;

    @SerializedName("kodeSyaratKetentuan")
    private final String kodeSyaratKetentuan;

    @SerializedName("namaSyaratKetentuan")
    private final String namaSyaratKetentuan;

    public SyaratItem(String str, String str2, String str3, String str4) {
        this.kodeSyaratKetentuan = str;
        this.namaSyaratKetentuan = str2;
        this.isiSyaratKetentuan = str3;
        this.kodeComarSyarat = str4;
    }

    public final String getKodeSyaratKetentuan() {
        return this.kodeSyaratKetentuan;
    }

    public final String getNamaSyaratKetentuan() {
        return this.namaSyaratKetentuan;
    }

    public final String getIsiSyaratKetentuan() {
        return this.isiSyaratKetentuan;
    }

    public final String getKodeComarSyarat() {
        return this.kodeComarSyarat;
    }

    public static /* synthetic */ SyaratItem copy$default(SyaratItem syaratItem, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = syaratItem.kodeSyaratKetentuan;
        }
        if ((i & 2) != 0) {
            str2 = syaratItem.namaSyaratKetentuan;
        }
        if ((i & 4) != 0) {
            str3 = syaratItem.isiSyaratKetentuan;
        }
        if ((i & 8) != 0) {
            str4 = syaratItem.kodeComarSyarat;
        }
        return syaratItem.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKodeSyaratKetentuan() {
        return this.kodeSyaratKetentuan;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNamaSyaratKetentuan() {
        return this.namaSyaratKetentuan;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIsiSyaratKetentuan() {
        return this.isiSyaratKetentuan;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getKodeComarSyarat() {
        return this.kodeComarSyarat;
    }

    public final SyaratItem copy(String p0, String p1, String p2, String p3) {
        return new SyaratItem(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SyaratItem)) {
            return false;
        }
        SyaratItem syaratItem = (SyaratItem) p0;
        return Intrinsics.areEqual(this.kodeSyaratKetentuan, syaratItem.kodeSyaratKetentuan) && Intrinsics.areEqual(this.namaSyaratKetentuan, syaratItem.namaSyaratKetentuan) && Intrinsics.areEqual(this.isiSyaratKetentuan, syaratItem.isiSyaratKetentuan) && Intrinsics.areEqual(this.kodeComarSyarat, syaratItem.kodeComarSyarat);
    }

    public final int hashCode() {
        String str = this.kodeSyaratKetentuan;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.namaSyaratKetentuan;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.isiSyaratKetentuan;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.kodeComarSyarat;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.kodeSyaratKetentuan;
        String str2 = this.namaSyaratKetentuan;
        String str3 = this.isiSyaratKetentuan;
        String str4 = this.kodeComarSyarat;
        StringBuilder sb = new StringBuilder("SyaratItem(kodeSyaratKetentuan=");
        sb.append(str);
        sb.append(", namaSyaratKetentuan=");
        sb.append(str2);
        sb.append(", isiSyaratKetentuan=");
        sb.append(str3);
        sb.append(", kodeComarSyarat=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }
}
