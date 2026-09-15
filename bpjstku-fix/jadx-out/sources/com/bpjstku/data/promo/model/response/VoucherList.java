package com.bpjstku.data.promo.model.response;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.gson.annotations.SerializedName;
import defpackage.initSession;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b-\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001B§\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b \u0010\u001aJ\u0010\u0010!\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b$\u0010\u001aJ\u0010\u0010%\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b%\u0010\u001aJ\u0010\u0010&\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b&\u0010\u001aJ\u0010\u0010'\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b'\u0010\u001aJ\u0010\u0010(\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b(\u0010\u001aJ\u0010\u0010)\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b)\u0010\u001aJ\u0010\u0010*\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b*\u0010\u001aJ\u0010\u0010+\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b+\u0010\u001aJ\u0010\u0010,\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b,\u0010\u001aJ\u0010\u0010-\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b-\u0010\u001aJØ\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00101\u001a\u0002002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00104\u001a\u000203HÖ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b6\u0010\u001aR\u001a\u00107\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010\u001aR\u001a\u0010:\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u00108\u001a\u0004\b;\u0010\u001aR\u001a\u0010<\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u00108\u001a\u0004\b=\u0010\u001aR\u001a\u0010>\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u00108\u001a\u0004\b?\u0010\u001aR\u001a\u0010@\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b@\u00108\u001a\u0004\bA\u0010\u001aR\u001a\u0010B\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u00108\u001a\u0004\bC\u0010\u001aR\u001a\u0010D\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bD\u00108\u001a\u0004\bE\u0010\u001aR\u001a\u0010F\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bF\u00108\u001a\u0004\bG\u0010\u001aR\u001a\u0010H\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bH\u00108\u001a\u0004\bI\u0010\u001aR\u001a\u0010J\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bJ\u00108\u001a\u0004\bK\u0010\u001aR\u001a\u0010L\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bL\u00108\u001a\u0004\bM\u0010\u001aR\u001a\u0010N\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bN\u00108\u001a\u0004\bO\u0010\u001aR\u001a\u0010P\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bP\u00108\u001a\u0004\bQ\u0010\u001aR\u001a\u0010R\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bR\u00108\u001a\u0004\bS\u0010\u001aR\u001a\u0010T\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bT\u00108\u001a\u0004\bU\u0010\u001aR\u001a\u0010V\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bV\u00108\u001a\u0004\bW\u0010\u001aR\u001a\u0010X\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bX\u00108\u001a\u0004\bY\u0010\u001aR\u001a\u0010Z\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bZ\u00108\u001a\u0004\b[\u0010\u001aR\u001a\u0010\\\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\\\u00108\u001a\u0004\b\\\u0010\u001aR\u001a\u0010]\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b]\u00108\u001a\u0004\b^\u0010\u001a"}, d2 = {"Lcom/bpjstku/data/promo/model/response/VoucherList;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "p16", "p17", "p18", "p19", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/promo/model/response/VoucherList;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "kodeJenisProduk", "Ljava/lang/String;", "getKodeJenisProduk", "kodeDivisi", "getKodeDivisi", "namaProduk", "getNamaProduk", "tglPromo", "getTglPromo", "kodePks", "getKodePks", "kodePerusahaan", "getKodePerusahaan", "namaJenisKategori", "getNamaJenisKategori", "kodePengajuanPromo", "getKodePengajuanPromo", "statusPromo", "getStatusPromo", "tglApproval", "getTglApproval", "fileThumbnail", "getFileThumbnail", "kodeProgram", "getKodeProgram", "tglAwalPromo", "getTglAwalPromo", "shortDesc", "getShortDesc", "fileBanner", "getFileBanner", "tglBerakhirPromo", "getTglBerakhirPromo", "lokasiComar", "getLokasiComar", "namaPropinsi", "getNamaPropinsi", "isWebview", "urlWebview", "getUrlWebview"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class VoucherList {
    public static final int $stable = 0;

    @SerializedName("fileBanner")
    private final String fileBanner;

    @SerializedName("fileThumbnail")
    private final String fileThumbnail;

    @SerializedName("isWebview")
    private final String isWebview;

    @SerializedName("kodeDivisi")
    private final String kodeDivisi;

    @SerializedName("kodeJenisProduk")
    private final String kodeJenisProduk;

    @SerializedName("kodePengajuanPromo")
    private final String kodePengajuanPromo;

    @SerializedName("kodePerusahaan")
    private final String kodePerusahaan;

    @SerializedName("kodePks")
    private final String kodePks;

    @SerializedName("kodeProgram")
    private final String kodeProgram;

    @SerializedName("lokasiComar")
    private final String lokasiComar;

    @SerializedName("namaJenisKategori")
    private final String namaJenisKategori;

    @SerializedName("namaProduk")
    private final String namaProduk;

    @SerializedName("namaPropinsi")
    private final String namaPropinsi;

    @SerializedName("shortDesc")
    private final String shortDesc;

    @SerializedName("statusPromo")
    private final String statusPromo;

    @SerializedName("tglApproval")
    private final String tglApproval;

    @SerializedName("tglAwalPromo")
    private final String tglAwalPromo;

    @SerializedName("tglBerakhirPromo")
    private final String tglBerakhirPromo;

    @SerializedName("tglPromo")
    private final String tglPromo;

    @SerializedName("urlWebview")
    private final String urlWebview;

    public VoucherList(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20) {
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
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        this.kodeJenisProduk = str;
        this.kodeDivisi = str2;
        this.namaProduk = str3;
        this.tglPromo = str4;
        this.kodePks = str5;
        this.kodePerusahaan = str6;
        this.namaJenisKategori = str7;
        this.kodePengajuanPromo = str8;
        this.statusPromo = str9;
        this.tglApproval = str10;
        this.fileThumbnail = str11;
        this.kodeProgram = str12;
        this.tglAwalPromo = str13;
        this.shortDesc = str14;
        this.fileBanner = str15;
        this.tglBerakhirPromo = str16;
        this.lokasiComar = str17;
        this.namaPropinsi = str18;
        this.isWebview = str19;
        this.urlWebview = str20;
    }

    public final String getKodeJenisProduk() {
        return this.kodeJenisProduk;
    }

    public final String getKodeDivisi() {
        return this.kodeDivisi;
    }

    public final String getNamaProduk() {
        return this.namaProduk;
    }

    public final String getTglPromo() {
        return this.tglPromo;
    }

    public final String getKodePks() {
        return this.kodePks;
    }

    public final String getKodePerusahaan() {
        return this.kodePerusahaan;
    }

    public final String getNamaJenisKategori() {
        return this.namaJenisKategori;
    }

    public final String getKodePengajuanPromo() {
        return this.kodePengajuanPromo;
    }

    public final String getStatusPromo() {
        return this.statusPromo;
    }

    public final String getTglApproval() {
        return this.tglApproval;
    }

    public final String getFileThumbnail() {
        return this.fileThumbnail;
    }

    public final String getKodeProgram() {
        return this.kodeProgram;
    }

    public final String getTglAwalPromo() {
        return this.tglAwalPromo;
    }

    public final String getShortDesc() {
        return this.shortDesc;
    }

    public final String getFileBanner() {
        return this.fileBanner;
    }

    public final String getTglBerakhirPromo() {
        return this.tglBerakhirPromo;
    }

    public final String getLokasiComar() {
        return this.lokasiComar;
    }

    public final String getNamaPropinsi() {
        return this.namaPropinsi;
    }

    public final String isWebview() {
        return this.isWebview;
    }

    public final String getUrlWebview() {
        return this.urlWebview;
    }

    public final int hashCode() throws IllegalAccessException {
        int iHashCode = ((((((((((((((((((((((((((((((((((this.kodeJenisProduk.hashCode() * 31) + this.kodeDivisi.hashCode()) * 31) + this.namaProduk.hashCode()) * 31) + this.tglPromo.hashCode()) * 31) + this.kodePks.hashCode()) * 31) + this.kodePerusahaan.hashCode()) * 31) + this.namaJenisKategori.hashCode()) * 31) + this.kodePengajuanPromo.hashCode()) * 31) + this.statusPromo.hashCode()) * 31) + this.tglApproval.hashCode()) * 31) + this.fileThumbnail.hashCode()) * 31) + this.kodeProgram.hashCode()) * 31) + this.tglAwalPromo.hashCode()) * 31) + this.shortDesc.hashCode()) * 31) + this.fileBanner.hashCode()) * 31) + this.tglBerakhirPromo.hashCode()) * 31) + this.lokasiComar.hashCode()) * 31) + this.namaPropinsi.hashCode()) * 31;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 46400), 40 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.getTrimmedLength("") + 19, 1513912262, false, "b", null);
        }
        int i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37836 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), TextUtils.getCapsMode("", 0, 0) + 59, 18 - TextUtils.getCapsMode("", 0, 0), 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
        }
        int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
        long j = i2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (37836 - View.MeasureSpec.getMode(0)), 59 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 18 - Gravity.getAbsoluteGravity(0, 0), 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
        long j2 = 367;
        long j3 = (j2 * 2554310817559722435L) + (j2 * 2964942679600063804L);
        long j4 = -366;
        long j5 = -1;
        long j6 = j5 ^ 2964942679600063804L;
        long jIdentityHashCode = System.identityHashCode(this);
        long j7 = j3 + (3132182828477185535L * j4) + (j4 * (((j6 | jIdentityHashCode) ^ j5) | 2554310817559722435L)) + (((long) 366) * ((((j5 ^ 2554310817559722435L) | 2964942679600063804L) ^ j5) | (j5 ^ (jIdentityHashCode | (j6 | 2554310817559722435L)))));
        int i4 = 0;
        while (true) {
            for (int i5 = 0; i5 != 8; i5++) {
                i3 = (((((int) (j >> i5)) & 255) + (i3 << 6)) + (i3 << 16)) - i3;
            }
            if (i4 != 0) {
                break;
            }
            i4++;
            j = j7;
        }
        if (i3 != i) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0) + 46401), Drawable.resolveOpacity(0, 0) + 40, 19 - View.resolveSizeAndState(0, 0, 0), -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
            int[] iArr = new int[i2];
            int i6 = i2 - 1;
            iArr[i6] = 1;
            Toast.makeText((Context) null, iArr[((i2 * i6) % 2) - 1], 1).show();
        }
        return ((iHashCode + this.isWebview.hashCode()) * 31) + this.urlWebview.hashCode();
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKodeJenisProduk() {
        return this.kodeJenisProduk;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTglApproval() {
        return this.tglApproval;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getFileThumbnail() {
        return this.fileThumbnail;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getKodeProgram() {
        return this.kodeProgram;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getTglAwalPromo() {
        return this.tglAwalPromo;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getShortDesc() {
        return this.shortDesc;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getFileBanner() {
        return this.fileBanner;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getTglBerakhirPromo() {
        return this.tglBerakhirPromo;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getLokasiComar() {
        return this.lokasiComar;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getNamaPropinsi() {
        return this.namaPropinsi;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getIsWebview() {
        return this.isWebview;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKodeDivisi() {
        return this.kodeDivisi;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getUrlWebview() {
        return this.urlWebview;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNamaProduk() {
        return this.namaProduk;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTglPromo() {
        return this.tglPromo;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getKodePks() {
        return this.kodePks;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getKodePerusahaan() {
        return this.kodePerusahaan;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getNamaJenisKategori() {
        return this.namaJenisKategori;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getKodePengajuanPromo() {
        return this.kodePengajuanPromo;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getStatusPromo() {
        return this.statusPromo;
    }

    public final VoucherList copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10, String p11, String p12, String p13, String p14, String p15, String p16, String p17, String p18, String p19) {
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
        Intrinsics.checkNotNullParameter(p10, "");
        Intrinsics.checkNotNullParameter(p11, "");
        Intrinsics.checkNotNullParameter(p12, "");
        Intrinsics.checkNotNullParameter(p13, "");
        Intrinsics.checkNotNullParameter(p14, "");
        Intrinsics.checkNotNullParameter(p15, "");
        Intrinsics.checkNotNullParameter(p16, "");
        Intrinsics.checkNotNullParameter(p17, "");
        Intrinsics.checkNotNullParameter(p18, "");
        Intrinsics.checkNotNullParameter(p19, "");
        return new VoucherList(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof VoucherList)) {
            return false;
        }
        VoucherList voucherList = (VoucherList) p0;
        return Intrinsics.areEqual(this.kodeJenisProduk, voucherList.kodeJenisProduk) && Intrinsics.areEqual(this.kodeDivisi, voucherList.kodeDivisi) && Intrinsics.areEqual(this.namaProduk, voucherList.namaProduk) && Intrinsics.areEqual(this.tglPromo, voucherList.tglPromo) && Intrinsics.areEqual(this.kodePks, voucherList.kodePks) && Intrinsics.areEqual(this.kodePerusahaan, voucherList.kodePerusahaan) && Intrinsics.areEqual(this.namaJenisKategori, voucherList.namaJenisKategori) && Intrinsics.areEqual(this.kodePengajuanPromo, voucherList.kodePengajuanPromo) && Intrinsics.areEqual(this.statusPromo, voucherList.statusPromo) && Intrinsics.areEqual(this.tglApproval, voucherList.tglApproval) && Intrinsics.areEqual(this.fileThumbnail, voucherList.fileThumbnail) && Intrinsics.areEqual(this.kodeProgram, voucherList.kodeProgram) && Intrinsics.areEqual(this.tglAwalPromo, voucherList.tglAwalPromo) && Intrinsics.areEqual(this.shortDesc, voucherList.shortDesc) && Intrinsics.areEqual(this.fileBanner, voucherList.fileBanner) && Intrinsics.areEqual(this.tglBerakhirPromo, voucherList.tglBerakhirPromo) && Intrinsics.areEqual(this.lokasiComar, voucherList.lokasiComar) && Intrinsics.areEqual(this.namaPropinsi, voucherList.namaPropinsi) && Intrinsics.areEqual(this.isWebview, voucherList.isWebview) && Intrinsics.areEqual(this.urlWebview, voucherList.urlWebview);
    }

    public final String toString() {
        String str = this.kodeJenisProduk;
        String str2 = this.kodeDivisi;
        String str3 = this.namaProduk;
        String str4 = this.tglPromo;
        String str5 = this.kodePks;
        String str6 = this.kodePerusahaan;
        String str7 = this.namaJenisKategori;
        String str8 = this.kodePengajuanPromo;
        String str9 = this.statusPromo;
        String str10 = this.tglApproval;
        String str11 = this.fileThumbnail;
        String str12 = this.kodeProgram;
        String str13 = this.tglAwalPromo;
        String str14 = this.shortDesc;
        String str15 = this.fileBanner;
        String str16 = this.tglBerakhirPromo;
        String str17 = this.lokasiComar;
        String str18 = this.namaPropinsi;
        String str19 = this.isWebview;
        String str20 = this.urlWebview;
        StringBuilder sb = new StringBuilder("VoucherList(kodeJenisProduk=");
        sb.append(str);
        sb.append(", kodeDivisi=");
        sb.append(str2);
        sb.append(", namaProduk=");
        sb.append(str3);
        sb.append(", tglPromo=");
        sb.append(str4);
        sb.append(", kodePks=");
        sb.append(str5);
        sb.append(", kodePerusahaan=");
        sb.append(str6);
        sb.append(", namaJenisKategori=");
        sb.append(str7);
        sb.append(", kodePengajuanPromo=");
        sb.append(str8);
        sb.append(", statusPromo=");
        sb.append(str9);
        sb.append(", tglApproval=");
        sb.append(str10);
        sb.append(", fileThumbnail=");
        sb.append(str11);
        sb.append(", kodeProgram=");
        sb.append(str12);
        sb.append(", tglAwalPromo=");
        sb.append(str13);
        sb.append(", shortDesc=");
        sb.append(str14);
        sb.append(", fileBanner=");
        sb.append(str15);
        sb.append(", tglBerakhirPromo=");
        sb.append(str16);
        sb.append(", lokasiComar=");
        sb.append(str17);
        sb.append(", namaPropinsi=");
        sb.append(str18);
        sb.append(", isWebview=");
        sb.append(str19);
        sb.append(", urlWebview=");
        sb.append(str20);
        sb.append(")");
        return sb.toString();
    }
}
