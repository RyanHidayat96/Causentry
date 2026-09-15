package com.bpjstku.data.programinfo.model.response;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0011J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0011Jj\u0010\u0017\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÇ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005H×\u0001¢\u0006\u0004\b\u001f\u0010\u0011R\"\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000fR\u001c\u0010#\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0011R\u001c\u0010&\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u0011R\u001c\u0010(\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010\u0011R\u001c\u0010*\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010$\u001a\u0004\b+\u0010\u0011R\u001c\u0010,\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010$\u001a\u0004\b-\u0010\u0011R\u001c\u0010.\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010$\u001a\u0004\b/\u0010\u0011"}, d2 = {"Lcom/bpjstku/data/programinfo/model/response/Data;", "", "", "Lcom/bpjstku/data/programinfo/model/response/Benefit;", "p0", "", "p1", "p2", "p3", "p4", "p5", "p6", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/programinfo/model/response/Data;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "benefits", "Ljava/util/List;", "getBenefits", "besarIuranBpu", "Ljava/lang/String;", "getBesarIuranBpu", "besarIuranJakon", "getBesarIuranJakon", "besarIuranPmi", "getBesarIuranPmi", "besarIuranPu", "getBesarIuranPu", "deskripsi", "getDeskripsi", "title", "getTitle"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Data {
    public static final int $stable = 8;

    @SerializedName("benefits")
    private final List<Benefit> benefits;

    @SerializedName("besarIuranBpu")
    private final String besarIuranBpu;

    @SerializedName("besarIuranJakon")
    private final String besarIuranJakon;

    @SerializedName("besarIuranPmi")
    private final String besarIuranPmi;

    @SerializedName("besarIuranPu")
    private final String besarIuranPu;

    @SerializedName("deskripsi")
    private final String deskripsi;

    @SerializedName("title")
    private final String title;

    public Data(List<Benefit> list, String str, String str2, String str3, String str4, String str5, String str6) {
        this.benefits = list;
        this.besarIuranBpu = str;
        this.besarIuranJakon = str2;
        this.besarIuranPmi = str3;
        this.besarIuranPu = str4;
        this.deskripsi = str5;
        this.title = str6;
    }

    public final List<Benefit> getBenefits() {
        return this.benefits;
    }

    public final String getBesarIuranBpu() {
        return this.besarIuranBpu;
    }

    public final String getBesarIuranJakon() {
        return this.besarIuranJakon;
    }

    public final String getBesarIuranPmi() {
        return this.besarIuranPmi;
    }

    public final String getBesarIuranPu() {
        return this.besarIuranPu;
    }

    public final String getDeskripsi() {
        return this.deskripsi;
    }

    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Data copy$default(Data data, List list, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            list = data.benefits;
        }
        if ((i & 2) != 0) {
            str = data.besarIuranBpu;
        }
        String str7 = str;
        if ((i & 4) != 0) {
            str2 = data.besarIuranJakon;
        }
        String str8 = str2;
        if ((i & 8) != 0) {
            str3 = data.besarIuranPmi;
        }
        String str9 = str3;
        if ((i & 16) != 0) {
            str4 = data.besarIuranPu;
        }
        String str10 = str4;
        if ((i & 32) != 0) {
            str5 = data.deskripsi;
        }
        String str11 = str5;
        if ((i & 64) != 0) {
            str6 = data.title;
        }
        return data.copy(list, str7, str8, str9, str10, str11, str6);
    }

    public final List<Benefit> component1() {
        return this.benefits;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBesarIuranBpu() {
        return this.besarIuranBpu;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBesarIuranJakon() {
        return this.besarIuranJakon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBesarIuranPmi() {
        return this.besarIuranPmi;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBesarIuranPu() {
        return this.besarIuranPu;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDeskripsi() {
        return this.deskripsi;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final Data copy(List<Benefit> p0, String p1, String p2, String p3, String p4, String p5, String p6) {
        return new Data(p0, p1, p2, p3, p4, p5, p6);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof Data)) {
            return false;
        }
        Data data = (Data) p0;
        return Intrinsics.areEqual(this.benefits, data.benefits) && Intrinsics.areEqual(this.besarIuranBpu, data.besarIuranBpu) && Intrinsics.areEqual(this.besarIuranJakon, data.besarIuranJakon) && Intrinsics.areEqual(this.besarIuranPmi, data.besarIuranPmi) && Intrinsics.areEqual(this.besarIuranPu, data.besarIuranPu) && Intrinsics.areEqual(this.deskripsi, data.deskripsi) && Intrinsics.areEqual(this.title, data.title);
    }

    public final int hashCode() {
        List<Benefit> list = this.benefits;
        int iHashCode = list == null ? 0 : list.hashCode();
        String str = this.besarIuranBpu;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.besarIuranJakon;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.besarIuranPmi;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.besarIuranPu;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.deskripsi;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.title;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        List<Benefit> list = this.benefits;
        String str = this.besarIuranBpu;
        String str2 = this.besarIuranJakon;
        String str3 = this.besarIuranPmi;
        String str4 = this.besarIuranPu;
        String str5 = this.deskripsi;
        String str6 = this.title;
        StringBuilder sb = new StringBuilder("Data(benefits=");
        sb.append(list);
        sb.append(", besarIuranBpu=");
        sb.append(str);
        sb.append(", besarIuranJakon=");
        sb.append(str2);
        sb.append(", besarIuranPmi=");
        sb.append(str3);
        sb.append(", besarIuranPu=");
        sb.append(str4);
        sb.append(", deskripsi=");
        sb.append(str5);
        sb.append(", title=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }
}
