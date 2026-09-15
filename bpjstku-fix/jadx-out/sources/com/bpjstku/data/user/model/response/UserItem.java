package com.bpjstku.data.user.model.response;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.gson.annotations.SerializedName;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b,\b\u0087\b\u0018\u00002\u00020\u0001BÏ\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\n¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001dJ\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001dJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001dJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001dJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001dJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001dJ\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u001dJ\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\u001dJ\u0012\u0010-\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010\u001dJ\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010\u001dJ\u0016\u00101\u001a\b\u0012\u0004\u0012\u00020\u00180\nHÇ\u0003¢\u0006\u0004\b1\u0010%Jþ\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\nHÇ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00105\u001a\u0002042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00108\u001a\u000207HÖ\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b:\u0010\u001dR\u001c\u0010;\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010\u001dR\u001c\u0010>\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010<\u001a\u0004\b?\u0010\u001dR\u001c\u0010@\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010<\u001a\u0004\bA\u0010\u001dR\u001c\u0010B\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010<\u001a\u0004\bC\u0010\u001dR\u001c\u0010D\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010<\u001a\u0004\bE\u0010\u001dR\u001c\u0010F\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010<\u001a\u0004\bG\u0010\u001dR\u001c\u0010H\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010<\u001a\u0004\bI\u0010\u001dR\"\u0010J\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010%R\u001c\u0010M\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010<\u001a\u0004\bN\u0010\u001dR\u001c\u0010O\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010<\u001a\u0004\bP\u0010\u001dR\u001c\u0010Q\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bQ\u0010<\u001a\u0004\bR\u0010\u001dR\u001c\u0010S\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bS\u0010<\u001a\u0004\bT\u0010\u001dR\u001c\u0010U\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bU\u0010<\u001a\u0004\bV\u0010\u001dR\u001c\u0010W\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bW\u0010<\u001a\u0004\bX\u0010\u001dR\u001c\u0010Y\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bY\u0010<\u001a\u0004\bZ\u0010\u001dR\u001c\u0010[\u001a\u0004\u0018\u00010\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010.R\u001c\u0010^\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b^\u0010<\u001a\u0004\b_\u0010\u001dR\u001c\u0010`\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b`\u0010<\u001a\u0004\ba\u0010\u001dR \u0010b\u001a\b\u0012\u0004\u0012\u00020\u00180\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bb\u0010K\u001a\u0004\bc\u0010%"}, d2 = {"Lcom/bpjstku/data/user/model/response/UserItem;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "", "Lcom/bpjstku/data/user/model/response/Kpj;", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "Lcom/bpjstku/data/user/model/response/EligibleRaya;", "p15", "p16", "p17", "Lcom/bpjstku/data/user/model/response/FiturList;", "p18", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bpjstku/data/user/model/response/EligibleRaya;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Ljava/util/List;", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "()Lcom/bpjstku/data/user/model/response/EligibleRaya;", "component17", "component18", "component19", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bpjstku/data/user/model/response/EligibleRaya;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/bpjstku/data/user/model/response/UserItem;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "alamat", "Ljava/lang/String;", "getAlamat", "displayPict", "getDisplayPict", "email", "getEmail", "jenisKelamin", "getJenisKelamin", "kabupaten", "getKabupaten", "kecamatan", "getKecamatan", "kodePos", "getKodePos", "kpj", "Ljava/util/List;", "getKpj", "msisdn", "getMsisdn", "namaLengkap", "getNamaLengkap", "nik", "getNik", "noKk", "getNoKk", "propinsi", "getPropinsi", "tempatLahir", "getTempatLahir", "tglLahir", "getTglLahir", "eligibleRaya", "Lcom/bpjstku/data/user/model/response/EligibleRaya;", "getEligibleRaya", "statusPelapor", "getStatusPelapor", "statusPeserta", "getStatusPeserta", "listFitur", "getListFitur"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class UserItem {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable = 8;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int b;

    @SerializedName("alamat")
    private final String alamat;

    @SerializedName("displayPict")
    private final String displayPict;

    @SerializedName("isEligibleRaya")
    private final EligibleRaya eligibleRaya;

    @SerializedName("email")
    private final String email;

    @SerializedName("jenisKelamin")
    private final String jenisKelamin;

    @SerializedName("kabupaten")
    private final String kabupaten;

    @SerializedName("kecamatan")
    private final String kecamatan;

    @SerializedName("kodePos")
    private final String kodePos;

    @SerializedName("kpj")
    private final List<Kpj> kpj;

    @SerializedName("listFitur")
    private final List<FiturList> listFitur;

    @SerializedName("msisdn")
    private final String msisdn;

    @SerializedName("namaLengkap")
    private final String namaLengkap;

    @SerializedName("nik")
    private final String nik;

    @SerializedName("noKk")
    private final String noKk;

    @SerializedName("propinsi")
    private final String propinsi;

    @SerializedName("statusPelapor")
    private final String statusPelapor;

    @SerializedName("statusPeserta")
    private final String statusPeserta;

    @SerializedName("tempatLahir")
    private final String tempatLahir;

    @SerializedName("tglLahir")
    private final String tglLahir;
    private static final byte[] $$d = {53, -70, 9, -72, 14, 0, -61, 56, -1, 21, -17, 5, 13, -6, -55, 53, 15, -8, 16, -1, -4, -3, -52, 70, 5, -6, -61, 65, 4, -9, 3, 9, -60, 32, 37, 1, -5, -17, 15, 20, -6, -36, 51, -15, 11, 8, -78, 77, 1, -24, 32, -15, 15, 7, -16, 4, 19, -78, 64};
    private static final int $$e = 89;
    private static final byte[] $$a = {33, -59, 107, -108, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 217;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;

    private static void a(short s, int i, byte b2, Object[] objArr) {
        byte[] bArr = $$a;
        int i2 = 98 - (b2 * 14);
        int i3 = (s * 52) + 4;
        byte[] bArr2 = new byte[i + 1];
        int i4 = -1;
        if (bArr == null) {
            i4 = -1;
            i2 = (i + (-i3)) - 10;
            i3++;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i2;
            if (i5 == i) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i6 = i2;
            i4 = i5;
            i2 = (i6 + (-bArr[i3])) - 10;
            i3++;
        }
    }

    private static void d(short s, int i, byte b2, Object[] objArr) {
        int i2 = 99 - s;
        int i3 = b2 * 55;
        int i4 = 59 - (i * 55);
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            i4++;
            i2 = (i3 + i2) - 2;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            if (i5 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                byte b3 = bArr[i4];
                i4++;
                i2 = (i2 + b3) - 2;
            }
        }
    }

    public UserItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<Kpj> list, String str8, String str9, String str10, String str11, String str12, String str13, String str14, EligibleRaya eligibleRaya, String str15, String str16, List<FiturList> list2) {
        Intrinsics.checkNotNullParameter(list2, "");
        this.alamat = str;
        this.displayPict = str2;
        this.email = str3;
        this.jenisKelamin = str4;
        this.kabupaten = str5;
        this.kecamatan = str6;
        this.kodePos = str7;
        this.kpj = list;
        this.msisdn = str8;
        this.namaLengkap = str9;
        this.nik = str10;
        this.noKk = str11;
        this.propinsi = str12;
        this.tempatLahir = str13;
        this.tglLahir = str14;
        this.eligibleRaya = eligibleRaya;
        this.statusPelapor = str15;
        this.statusPeserta = str16;
        this.listFitur = list2;
    }

    public final String getAlamat() {
        String str;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        if (i2 % 2 != 0) {
            str = this.alamat;
            int i4 = 34 / 0;
        } else {
            str = this.alamat;
        }
        int i5 = i3 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getDisplayPict() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.displayPict;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getEmail() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.email;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getJenisKelamin() {
        String str;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 73;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.jenisKelamin;
            int i4 = 3 / 0;
        } else {
            str = this.jenisKelamin;
        }
        int i5 = i2 + 125;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getKabupaten() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        String str = this.kabupaten;
        int i5 = i3 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getKecamatan() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.kecamatan;
        int i5 = i2 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getKodePos() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.kodePos;
        }
        throw null;
    }

    public final List<Kpj> getKpj() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 39;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        List<Kpj> list = this.kpj;
        int i5 = i3 + 41;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 57;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.msisdn;
        int i5 = i2 + 113;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 93 / 0;
        }
        return str;
    }

    public final String getNamaLengkap() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.namaLengkap;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getNik() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        String str = this.nik;
        int i5 = i3 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getNoKk() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 25;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.noKk;
        int i4 = i3 + 83;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getPropinsi() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        String str = this.propinsi;
        int i5 = i3 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getTempatLahir() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.tempatLahir;
        }
        throw null;
    }

    public final String getTglLahir() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        String str = this.tglLahir;
        int i5 = i3 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final EligibleRaya getEligibleRaya() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        EligibleRaya eligibleRaya = this.eligibleRaya;
        if (i3 == 0) {
            int i4 = 26 / 0;
        }
        return eligibleRaya;
    }

    public final String getStatusPelapor() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 37;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.statusPelapor;
        int i5 = i2 + 29;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 39 / 0;
        }
        return str;
    }

    public final String getStatusPeserta() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.statusPeserta;
        int i5 = i2 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<FiturList> getListFitur() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 89;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        List<FiturList> list = this.listFitur;
        int i5 = i2 + 49;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = $10 + 23;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 2624 - Drawable.resolveOpacity(0, 0), 13 - Gravity.getAbsoluteGravity(0, 0), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() | TuitionPaymentFragmentspecialinlinedviewModeldefault2 | 9053247990562531611L;
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 39421), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 481, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = getrealtimecapturelatency.b;
                Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.getOffsetAfter("", 0) + 19472), 2624 - View.MeasureSpec.getSize(0), KeyEvent.normalizeMetaState(0) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ 9053247990562531611L);
                Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (39421 - TextUtils.indexOf((CharSequence) "", '0')), (ViewConfiguration.getFadingEdgeLength() >> 16) + 481, 37 - View.resolveSize(0, 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (ExpandableListView.getPackedPositionType(0L) + 39422), 481 - KeyEvent.keyCodeFromString(""), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 36, 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
        int i6 = $11 + 81;
        $10 = i6 % 128;
        int i7 = i6 % 2;
    }

    public final String component18() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 31534);
            int iResolveOpacity = 921 - Drawable.resolveOpacity(0, 0);
            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 28;
            byte b2 = $$a[80];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            a(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, iResolveOpacity, tapTimeout, -1048449946, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{18729, 16589, 23290, 21755, 28299, 30902, 29358, 3083, 1663, 4216, 10824, 9218, 15925, 51668, 50150, 56808, 55189, 57744, 64418, 62806, 36727, 39268}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2539, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{18733, 65165, 9851, 28611, 38815, 57184, 1242, 19589, 62565, 15832, 26046, 44415, 53965, 6832, 16915}, 47017 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char edgeSlop = (char) (31533 - (ViewConfiguration.getEdgeSlop() >> 16));
            int iGreen = 921 - Color.green(0);
            int iKeyCodeFromString = 28 - KeyEvent.keyCodeFromString("");
            byte[] bArr = $$a;
            byte b4 = bArr[80];
            Object[] objArr5 = new Object[1];
            a(b4, (byte) (b4 | 52), bArr[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(edgeSlop, iGreen, iKeyCodeFromString, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cBlue = (char) (31533 - Color.blue(0));
                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 921;
                int deadChar = 28 - KeyEvent.getDeadChar(0, 0);
                byte b5 = $$a[7];
                byte b6 = b5;
                Object[] objArr6 = new Object[1];
                a(b6, (byte) (b6 | 36), b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cBlue, offsetBefore, deadChar, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i4 = ~((-709042205) | iFreeMemory);
            int i5 = ~iFreeMemory;
            int i6 = 1708380563 + ((i4 | (~((-20448865) | i5))) * 920) + (((~((-1044588576) | i5)) | 709042204) * 920) + (((~(iFreeMemory | (-20448865))) | (~((-709042205) | i5)) | (~((-335546372) | iFreeMemory))) * 920) + 1996474358;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{18729, 59863, 2254, 44009, 51939, 28052, 35978, 12273, 20129, 57665, 'R', 41789, 49733, 25878, 33810, 10046, 17966, 63776, 6606, 47314, 56264, 31461, 40332, 15498, 24497, 65189}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 41201, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{18731, 13012, 48872, 14977, 42633, 8875, 44618, 10838, 38512, 4617, 40510, 6690, 34759, 1020, 36738, 2950, 63415, 29535}, 31721 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i9 = TuitionPaymentFragmentbindingInflater1 + 67;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
                if (i9 % 2 == 0) {
                    boolean z = applicationContext instanceof ContextWrapper;
                    obj.hashCode();
                    throw null;
                }
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{18722, 19134, 19984, 17388, 18234, 22743, 23715, 20487, 21911, 26921, 27389, 28236, 25135, 26519, 31599, 31996}, 918 - TextUtils.lastIndexOf("", '0'), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{18721, 37913, 62279, 57017, 15848, 6952, 26114, 17730, 41128, 36852, 60713, 51303, 6007, 29334, 20938, 48950}, 56629 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 1996474358};
                byte[] bArr2 = $$d;
                byte b7 = bArr2[5];
                byte b8 = bArr2[35];
                Object[] objArr13 = new Object[1];
                d(b7, b8, b8, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b9 = bArr2[35];
                byte b10 = bArr2[5];
                Object[] objArr14 = new Object[1];
                d(b9, b10, b10, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char mode = (char) (31533 - View.MeasureSpec.getMode(0));
                    int iRgb = (-16776295) - Color.rgb(0, 0, 0);
                    int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 28;
                    byte b11 = $$a[7];
                    byte b12 = b11;
                    Object[] objArr16 = new Object[1];
                    a(b12, (byte) (b12 | 36), b11, objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(mode, iRgb, touchSlop, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    c(new char[]{18729, 16589, 23290, 21755, 28299, 30902, 29358, 3083, 1663, 4216, 10824, 9218, 15925, 51668, 50150, 56808, 55189, 57744, 64418, 62806, 36727, 39268}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2538, objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    c(new char[]{18733, 65165, 9851, 28611, 38815, 57184, 1242, 19589, 62565, 15832, 26046, 44415, 53965, 6832, 16915}, 47017 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char scrollDefaultDelay = (char) (31533 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                        int iRgb2 = (-16776295) - Color.rgb(0, 0, 0);
                        int iMyPid = (Process.myPid() >> 22) + 28;
                        byte[] bArr3 = $$a;
                        byte b13 = bArr3[80];
                        Object[] objArr19 = new Object[1];
                        a(b13, (byte) (b13 | 52), bArr3[7], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollDefaultDelay, iRgb2, iMyPid, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cMyPid = (char) ((Process.myPid() >> 22) + 31533);
                        int iLastIndexOf = 920 - TextUtils.lastIndexOf("", '0', 0, 0);
                        int iIndexOf = 27 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        byte b14 = $$a[80];
                        byte b15 = b14;
                        Object[] objArr20 = new Object[1];
                        a(b14, b15, b15, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMyPid, iLastIndexOf, iIndexOf, -1048449946, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
                    TuitionPaymentFragmentbindingInflater1 = i10 % 128;
                    int i11 = i10 % 2;
                    objArr = objArr15;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i12 = ((int[]) objArr[1])[0];
        int i13 = ((int[]) objArr[3])[0];
        if (i13 == i12) {
            int i14 = TuitionPaymentFragmentbindingInflater1 + 125;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
            int i15 = i14 % 2;
            int i16 = ((int[]) objArr[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iMyPid2 = Process.myPid();
            int i17 = (-1319836923) + ((iMyPid2 | 684301964) * (-50));
            int i18 = ~((-12619789) | iMyPid2);
            int i19 = ~iMyPid2;
            int i20 = i16 + i17 + ((i18 | (~((-1077157892) | i19))) * 50) + (((~(i19 | 684301964)) | (~((-1089777680) | i19)) | 1077157891) * 50);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr21[0])[0] = i22 ^ (i22 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i23 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
                TuitionPaymentFragmentbindingInflater1 = i23 % 128;
                int i24 = i23 % 2 != 0 ? 1 : 0;
                while (i24 < strArr.length) {
                    int i25 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
                    TuitionPaymentFragmentbindingInflater1 = i25 % 128;
                    if (i25 % 2 != 0) {
                        arrayList.add(strArr[i24]);
                        i24 += 103;
                    } else {
                        arrayList.add(strArr[i24]);
                        i24++;
                    }
                }
            }
            int[] iArr = new int[i13];
            int i26 = i13 - 1;
            iArr[i26] = 1;
            Toast.makeText((Context) null, iArr[((i13 * i26) % 2) - 1], 1).show();
            int i27 = ((int[]) objArr[0])[0];
            Object[] objArr22 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i28 = i27 + (((34604071 + (((~((-1101323798) | iIdentityHashCode)) | (-672755847)) * (-948))) + ((~((~iIdentityHashCode) | (-20485))) * (-948))) - 358488744);
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr22[0])[0] = i30 ^ (i30 << 5);
        }
        return this.statusPeserta;
    }

    static {
        b = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 33;
        b = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserItem copy$default(UserItem userItem, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, String str8, String str9, String str10, String str11, String str12, String str13, String str14, EligibleRaya eligibleRaya, String str15, String str16, List list2, int i, Object obj) {
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        int i2 = 2 % 2;
        String str22 = (i & 1) != 0 ? userItem.alamat : str;
        String str23 = (i & 2) != 0 ? userItem.displayPict : str2;
        if ((i & 4) != 0) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            int i4 = i3 % 2;
            str17 = userItem.email;
        } else {
            str17 = str3;
        }
        if ((i & 8) != 0) {
            int i5 = TuitionPaymentFragmentbindingInflater1 + 81;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            if (i5 % 2 == 0) {
                str18 = userItem.jenisKelamin;
                int i6 = 73 / 0;
            } else {
                str18 = userItem.jenisKelamin;
            }
        } else {
            str18 = str4;
        }
        String str24 = (i & 16) != 0 ? userItem.kabupaten : str5;
        String str25 = (i & 32) != 0 ? userItem.kecamatan : str6;
        String str26 = (i & 64) != 0 ? userItem.kodePos : str7;
        List list3 = (i & 128) != 0 ? userItem.kpj : list;
        String str27 = (i & 256) != 0 ? userItem.msisdn : str8;
        String str28 = (i & 512) != 0 ? userItem.namaLengkap : str9;
        String str29 = (i & 1024) != 0 ? userItem.nik : str10;
        if ((i & 2048) != 0) {
            int i7 = TuitionPaymentFragmentbindingInflater1 + 45;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
            int i8 = i7 % 2;
            str19 = userItem.noKk;
        } else {
            str19 = str11;
        }
        String str30 = (i & 4096) != 0 ? userItem.propinsi : str12;
        if ((i & 8192) != 0) {
            int i9 = TuitionPaymentFragmentbindingInflater1 + 25;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
            if (i9 % 2 == 0) {
                String str31 = userItem.tempatLahir;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str20 = userItem.tempatLahir;
        } else {
            str20 = str13;
        }
        String str32 = (i & 16384) != 0 ? userItem.tglLahir : str14;
        EligibleRaya eligibleRaya2 = (i & 32768) != 0 ? userItem.eligibleRaya : eligibleRaya;
        String str33 = (i & 65536) != 0 ? userItem.statusPelapor : str15;
        if ((i & 131072) != 0) {
            int i10 = TuitionPaymentFragmentbindingInflater1 + 59;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
            int i11 = i10 % 2;
            str21 = userItem.statusPeserta;
        } else {
            str21 = str16;
        }
        return userItem.copy(str22, str23, str17, str18, str24, str25, str26, list3, str27, str28, str29, str19, str30, str20, str32, eligibleRaya2, str33, str21, (i & 262144) != 0 ? userItem.listFitur : list2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.alamat;
        int i4 = i3 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 28 / 0;
        }
        return str;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.namaLengkap;
        }
        throw null;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.nik;
        }
        throw null;
    }

    public final String component12() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.noKk;
        int i4 = i3 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component13() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.propinsi;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component14() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.tempatLahir;
        int i5 = i2 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component15() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 125;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.tglLahir;
        int i5 = i2 + 15;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final EligibleRaya component16() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 7;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        EligibleRaya eligibleRaya = this.eligibleRaya;
        int i5 = i3 + 107;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return eligibleRaya;
    }

    public final String component17() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 39;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.statusPelapor;
        int i5 = i2 + 11;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final List<FiturList> component19() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<FiturList> list = this.listFitur;
        int i4 = i3 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 31;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.displayPict;
        int i4 = i2 + 83;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 99;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        String str = this.email;
        int i5 = i3 + 41;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.jenisKelamin;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        String str = this.kabupaten;
        int i5 = i3 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component6() {
        String str;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.kecamatan;
            int i4 = 8 / 0;
        } else {
            str = this.kecamatan;
        }
        int i5 = i2 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 67 / 0;
        }
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 67;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        String str = this.kodePos;
        int i5 = i3 + 51;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<Kpj> component8() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 51;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<Kpj> list = this.kpj;
        int i4 = i3 + 67;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.msisdn;
        int i5 = i2 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final UserItem copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, List<Kpj> p7, String p8, String p9, String p10, String p11, String p12, String p13, String p14, EligibleRaya p15, String p16, String p17, List<FiturList> p18) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p18, "");
        UserItem userItem = new UserItem(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        return userItem;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 71;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof UserItem)) {
            int i4 = i2 + 23;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            return i4 % 2 != 0;
        }
        UserItem userItem = (UserItem) p0;
        if ((!Intrinsics.areEqual(this.alamat, userItem.alamat)) || !Intrinsics.areEqual(this.displayPict, userItem.displayPict)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.email, userItem.email)) {
            int i5 = TuitionPaymentFragmentbindingInflater1 + 31;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.jenisKelamin, userItem.jenisKelamin) || !Intrinsics.areEqual(this.kabupaten, userItem.kabupaten) || !Intrinsics.areEqual(this.kecamatan, userItem.kecamatan) || !Intrinsics.areEqual(this.kodePos, userItem.kodePos)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.kpj, userItem.kpj)) {
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
            TuitionPaymentFragmentbindingInflater1 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.msisdn, userItem.msisdn) || !Intrinsics.areEqual(this.namaLengkap, userItem.namaLengkap) || !Intrinsics.areEqual(this.nik, userItem.nik)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.noKk, userItem.noKk)) {
            int i9 = TuitionPaymentFragmentbindingInflater1 + 67;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
            return i9 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.propinsi, userItem.propinsi)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.tempatLahir, userItem.tempatLahir)) {
            int i10 = TuitionPaymentFragmentbindingInflater1 + 87;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
            return i10 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.tglLahir, userItem.tglLahir) || !Intrinsics.areEqual(this.eligibleRaya, userItem.eligibleRaya)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.statusPelapor, userItem.statusPelapor)) {
            int i11 = TuitionPaymentFragmentbindingInflater1 + 41;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.statusPeserta, userItem.statusPeserta)) {
            return false;
        }
        if (Intrinsics.areEqual(this.listFitur, userItem.listFitur)) {
            return true;
        }
        int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
        TuitionPaymentFragmentbindingInflater1 = i13 % 128;
        int i14 = i13 % 2;
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int iHashCode6;
        int i = 2 % 2;
        String str = this.alamat;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        String str2 = this.displayPict;
        int iHashCode8 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.email;
        if (str3 == null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str3.hashCode();
        }
        String str4 = this.jenisKelamin;
        int iHashCode9 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.kabupaten;
        if (str5 == null) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str5.hashCode();
        }
        String str6 = this.kecamatan;
        int iHashCode10 = 1;
        if (str6 == null) {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
            TuitionPaymentFragmentbindingInflater1 = i6 % 128;
            iHashCode3 = i6 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode3 = str6.hashCode();
        }
        String str7 = this.kodePos;
        int iHashCode11 = str7 == null ? 0 : str7.hashCode();
        List<Kpj> list = this.kpj;
        if (list == null) {
            int i7 = TuitionPaymentFragmentbindingInflater1 + 41;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
            iHashCode4 = i7 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode4 = list.hashCode();
        }
        String str8 = this.msisdn;
        if (str8 == null) {
            int i8 = TuitionPaymentFragmentbindingInflater1 + 25;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
            if (i8 % 2 != 0) {
                iHashCode10 = 0;
            }
        } else {
            iHashCode10 = str8.hashCode();
        }
        String str9 = this.namaLengkap;
        int iHashCode12 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.nik;
        int iHashCode13 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.noKk;
        int iHashCode14 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.propinsi;
        int iHashCode15 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.tempatLahir;
        int iHashCode16 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.tglLahir;
        int iHashCode17 = str14 == null ? 0 : str14.hashCode();
        EligibleRaya eligibleRaya = this.eligibleRaya;
        if (eligibleRaya == null) {
            int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
            TuitionPaymentFragmentbindingInflater1 = i9 % 128;
            int i10 = i9 % 2;
            iHashCode5 = 0;
        } else {
            iHashCode5 = eligibleRaya.hashCode();
        }
        String str15 = this.statusPelapor;
        int iHashCode18 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.statusPeserta;
        if (str16 != null) {
            int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
            TuitionPaymentFragmentbindingInflater1 = i11 % 128;
            int i12 = i11 % 2;
            iHashCode6 = str16.hashCode();
        } else {
            iHashCode6 = 0;
        }
        return (((((((((((((((((((((((((((((((((((iHashCode7 * 31) + iHashCode8) * 31) + iHashCode) * 31) + iHashCode9) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode11) * 31) + iHashCode4) * 31) + iHashCode10) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode5) * 31) + iHashCode18) * 31) + iHashCode6) * 31) + this.listFitur.hashCode();
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.alamat;
        String str2 = this.displayPict;
        String str3 = this.email;
        String str4 = this.jenisKelamin;
        String str5 = this.kabupaten;
        String str6 = this.kecamatan;
        String str7 = this.kodePos;
        List<Kpj> list = this.kpj;
        String str8 = this.msisdn;
        String str9 = this.namaLengkap;
        String str10 = this.nik;
        String str11 = this.noKk;
        String str12 = this.propinsi;
        String str13 = this.tempatLahir;
        String str14 = this.tglLahir;
        EligibleRaya eligibleRaya = this.eligibleRaya;
        String str15 = this.statusPelapor;
        String str16 = this.statusPeserta;
        List<FiturList> list2 = this.listFitur;
        StringBuilder sb = new StringBuilder("UserItem(alamat=");
        sb.append(str);
        sb.append(", displayPict=");
        sb.append(str2);
        sb.append(", email=");
        sb.append(str3);
        sb.append(", jenisKelamin=");
        sb.append(str4);
        sb.append(", kabupaten=");
        sb.append(str5);
        sb.append(", kecamatan=");
        sb.append(str6);
        sb.append(", kodePos=");
        sb.append(str7);
        sb.append(", kpj=");
        sb.append(list);
        sb.append(", msisdn=");
        sb.append(str8);
        sb.append(", namaLengkap=");
        sb.append(str9);
        sb.append(", nik=");
        sb.append(str10);
        sb.append(", noKk=");
        sb.append(str11);
        sb.append(", propinsi=");
        sb.append(str12);
        sb.append(", tempatLahir=");
        sb.append(str13);
        sb.append(", tglLahir=");
        sb.append(str14);
        sb.append(", eligibleRaya=");
        sb.append(eligibleRaya);
        sb.append(", statusPelapor=");
        sb.append(str15);
        sb.append(", statusPeserta=");
        sb.append(str16);
        sb.append(", listFitur=");
        sb.append(list2);
        sb.append(")");
        String string = sb.toString();
        int i2 = TuitionPaymentFragmentbindingInflater1 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return string;
        }
        throw null;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 3526438257309638739L;
    }
}
