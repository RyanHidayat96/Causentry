package com.bpjstku.data.vocation.model.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJL\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u000bR\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u000bR\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u000b"}, d2 = {"Lcom/bpjstku/data/vocation/model/response/IksBlkItem;", "", "", "p0", "p1", "p2", "p3", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/vocation/model/response/IksBlkItem;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "iksEnd", "Ljava/lang/String;", "getIksEnd", "iksStart", "getIksStart", "blkIksCode", "getBlkIksCode", "iksNumber", "getIksNumber", "activeStatus", "getActiveStatus"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class IksBlkItem {
    public static final int $stable = 0;

    @SerializedName("statusAktif")
    private final String activeStatus;

    @SerializedName("kodeIksBlk")
    private final String blkIksCode;

    @SerializedName("akhirIks")
    private final String iksEnd;

    @SerializedName("nomorIks")
    private final String iksNumber;

    @SerializedName("awalIks")
    private final String iksStart;

    public IksBlkItem(String str, String str2, String str3, String str4, String str5) {
        this.iksEnd = str;
        this.iksStart = str2;
        this.blkIksCode = str3;
        this.iksNumber = str4;
        this.activeStatus = str5;
    }

    public final String getIksEnd() {
        return this.iksEnd;
    }

    public final String getIksStart() {
        return this.iksStart;
    }

    public final String getBlkIksCode() {
        return this.blkIksCode;
    }

    public final String getIksNumber() {
        return this.iksNumber;
    }

    public final String getActiveStatus() {
        return this.activeStatus;
    }

    public static /* synthetic */ IksBlkItem copy$default(IksBlkItem iksBlkItem, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = iksBlkItem.iksEnd;
        }
        if ((i & 2) != 0) {
            str2 = iksBlkItem.iksStart;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = iksBlkItem.blkIksCode;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = iksBlkItem.iksNumber;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = iksBlkItem.activeStatus;
        }
        return iksBlkItem.copy(str, str6, str7, str8, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIksEnd() {
        return this.iksEnd;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIksStart() {
        return this.iksStart;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBlkIksCode() {
        return this.blkIksCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIksNumber() {
        return this.iksNumber;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getActiveStatus() {
        return this.activeStatus;
    }

    public final IksBlkItem copy(String p0, String p1, String p2, String p3, String p4) {
        return new IksBlkItem(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof IksBlkItem)) {
            return false;
        }
        IksBlkItem iksBlkItem = (IksBlkItem) p0;
        return Intrinsics.areEqual(this.iksEnd, iksBlkItem.iksEnd) && Intrinsics.areEqual(this.iksStart, iksBlkItem.iksStart) && Intrinsics.areEqual(this.blkIksCode, iksBlkItem.blkIksCode) && Intrinsics.areEqual(this.iksNumber, iksBlkItem.iksNumber) && Intrinsics.areEqual(this.activeStatus, iksBlkItem.activeStatus);
    }

    public final int hashCode() {
        String str = this.iksEnd;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.iksStart;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.blkIksCode;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.iksNumber;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.activeStatus;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        String str = this.iksEnd;
        String str2 = this.iksStart;
        String str3 = this.blkIksCode;
        String str4 = this.iksNumber;
        String str5 = this.activeStatus;
        StringBuilder sb = new StringBuilder("IksBlkItem(iksEnd=");
        sb.append(str);
        sb.append(", iksStart=");
        sb.append(str2);
        sb.append(", blkIksCode=");
        sb.append(str3);
        sb.append(", iksNumber=");
        sb.append(str4);
        sb.append(", activeStatus=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }
}
