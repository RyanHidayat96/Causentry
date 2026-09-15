package com.bpjstku.data.jht.model.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0015\u0010\u0010J\u0010\u0010\u0016\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0016\u0010\u0010J\u0010\u0010\u0017\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0017\u0010\u0010J\u0010\u0010\u0018\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0018\u0010\u0010J\u0010\u0010\u0019\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0019\u0010\u0010Jt\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\"\u0010\u0010R\u001a\u0010#\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0010R\u001a\u0010&\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u0010R\u001a\u0010(\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010\u0010R\u001a\u0010*\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010$\u001a\u0004\b+\u0010\u0010R\u001a\u0010,\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010$\u001a\u0004\b-\u0010\u0010R\u001a\u0010.\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010$\u001a\u0004\b/\u0010\u0010R\u001a\u00100\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010$\u001a\u0004\b1\u0010\u0010R\u001a\u00102\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010$\u001a\u0004\b3\u0010\u0010R\u001a\u00104\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010$\u001a\u0004\b5\u0010\u0010R\u001a\u00106\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010$\u001a\u0004\b7\u0010\u0010"}, d2 = {"Lcom/bpjstku/data/jht/model/response/InfoPraClaimItem;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/jht/model/response/InfoPraClaimItem;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "btlh", "Ljava/lang/String;", "getBtlh", "nominalContribution", "getNominalContribution", "statusUpdateData", "getStatusUpdateData", "statusMembership", "getStatusMembership", "statusNpwp", "getStatusNpwp", "statusRsjht", "getStatusRsjht", "statusMaksimumBalanceJht", "getStatusMaksimumBalanceJht", "maximumBalanceJht", "getMaximumBalanceJht", "statusPensiun", "getStatusPensiun", "flagMaxSaldo", "getFlagMaxSaldo"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class InfoPraClaimItem {
    public static final int $stable = 0;

    @SerializedName("btlh")
    private final String btlh;

    @SerializedName("flagMaxSaldo")
    private final String flagMaxSaldo;

    @SerializedName("maximumBalanceJht")
    private final String maximumBalanceJht;

    @SerializedName("nominalContribution")
    private final String nominalContribution;

    @SerializedName("statusMaksimumBalanceJht")
    private final String statusMaksimumBalanceJht;

    @SerializedName("statusMembership")
    private final String statusMembership;

    @SerializedName("statusNpwp")
    private final String statusNpwp;

    @SerializedName("statusPensiun")
    private final String statusPensiun;

    @SerializedName("statusRsjht")
    private final String statusRsjht;

    @SerializedName("statusUpdateData")
    private final String statusUpdateData;

    public InfoPraClaimItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.btlh = str;
        this.nominalContribution = str2;
        this.statusUpdateData = str3;
        this.statusMembership = str4;
        this.statusNpwp = str5;
        this.statusRsjht = str6;
        this.statusMaksimumBalanceJht = str7;
        this.maximumBalanceJht = str8;
        this.statusPensiun = str9;
        this.flagMaxSaldo = str10;
    }

    public final String getBtlh() {
        return this.btlh;
    }

    public final String getNominalContribution() {
        return this.nominalContribution;
    }

    public final String getStatusUpdateData() {
        return this.statusUpdateData;
    }

    public final String getStatusMembership() {
        return this.statusMembership;
    }

    public final String getStatusNpwp() {
        return this.statusNpwp;
    }

    public final String getStatusRsjht() {
        return this.statusRsjht;
    }

    public final String getStatusMaksimumBalanceJht() {
        return this.statusMaksimumBalanceJht;
    }

    public final String getMaximumBalanceJht() {
        return this.maximumBalanceJht;
    }

    public final String getStatusPensiun() {
        return this.statusPensiun;
    }

    public final String getFlagMaxSaldo() {
        return this.flagMaxSaldo;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBtlh() {
        return this.btlh;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getFlagMaxSaldo() {
        return this.flagMaxSaldo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNominalContribution() {
        return this.nominalContribution;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatusUpdateData() {
        return this.statusUpdateData;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStatusMembership() {
        return this.statusMembership;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStatusNpwp() {
        return this.statusNpwp;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStatusRsjht() {
        return this.statusRsjht;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getStatusMaksimumBalanceJht() {
        return this.statusMaksimumBalanceJht;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMaximumBalanceJht() {
        return this.maximumBalanceJht;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getStatusPensiun() {
        return this.statusPensiun;
    }

    public final InfoPraClaimItem copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p5, "");
        Intrinsics.checkNotNullParameter(p6, "");
        Intrinsics.checkNotNullParameter(p7, "");
        Intrinsics.checkNotNullParameter(p8, "");
        Intrinsics.checkNotNullParameter(p9, "");
        return new InfoPraClaimItem(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof InfoPraClaimItem)) {
            return false;
        }
        InfoPraClaimItem infoPraClaimItem = (InfoPraClaimItem) p0;
        return Intrinsics.areEqual(this.btlh, infoPraClaimItem.btlh) && Intrinsics.areEqual(this.nominalContribution, infoPraClaimItem.nominalContribution) && Intrinsics.areEqual(this.statusUpdateData, infoPraClaimItem.statusUpdateData) && Intrinsics.areEqual(this.statusMembership, infoPraClaimItem.statusMembership) && Intrinsics.areEqual(this.statusNpwp, infoPraClaimItem.statusNpwp) && Intrinsics.areEqual(this.statusRsjht, infoPraClaimItem.statusRsjht) && Intrinsics.areEqual(this.statusMaksimumBalanceJht, infoPraClaimItem.statusMaksimumBalanceJht) && Intrinsics.areEqual(this.maximumBalanceJht, infoPraClaimItem.maximumBalanceJht) && Intrinsics.areEqual(this.statusPensiun, infoPraClaimItem.statusPensiun) && Intrinsics.areEqual(this.flagMaxSaldo, infoPraClaimItem.flagMaxSaldo);
    }

    public final int hashCode() {
        return (((((((((((((((((this.btlh.hashCode() * 31) + this.nominalContribution.hashCode()) * 31) + this.statusUpdateData.hashCode()) * 31) + this.statusMembership.hashCode()) * 31) + this.statusNpwp.hashCode()) * 31) + this.statusRsjht.hashCode()) * 31) + this.statusMaksimumBalanceJht.hashCode()) * 31) + this.maximumBalanceJht.hashCode()) * 31) + this.statusPensiun.hashCode()) * 31) + this.flagMaxSaldo.hashCode();
    }

    public final String toString() {
        String str = this.btlh;
        String str2 = this.nominalContribution;
        String str3 = this.statusUpdateData;
        String str4 = this.statusMembership;
        String str5 = this.statusNpwp;
        String str6 = this.statusRsjht;
        String str7 = this.statusMaksimumBalanceJht;
        String str8 = this.maximumBalanceJht;
        String str9 = this.statusPensiun;
        String str10 = this.flagMaxSaldo;
        StringBuilder sb = new StringBuilder("InfoPraClaimItem(btlh=");
        sb.append(str);
        sb.append(", nominalContribution=");
        sb.append(str2);
        sb.append(", statusUpdateData=");
        sb.append(str3);
        sb.append(", statusMembership=");
        sb.append(str4);
        sb.append(", statusNpwp=");
        sb.append(str5);
        sb.append(", statusRsjht=");
        sb.append(str6);
        sb.append(", statusMaksimumBalanceJht=");
        sb.append(str7);
        sb.append(", maximumBalanceJht=");
        sb.append(str8);
        sb.append(", statusPensiun=");
        sb.append(str9);
        sb.append(", flagMaxSaldo=");
        sb.append(str10);
        sb.append(")");
        return sb.toString();
    }
}
