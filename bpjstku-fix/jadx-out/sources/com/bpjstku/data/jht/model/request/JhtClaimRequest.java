package com.bpjstku.data.jht.model.request;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import defpackage.SessionProcessor;
import defpackage.createCameraSelectorById;
import defpackage.initSession;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b1\b\u0087\b\u0018\u00002\u00020\u0001BÁ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b#\u0010!J\u0010\u0010$\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b$\u0010!J\u0010\u0010%\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b%\u0010!J\u0010\u0010&\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b&\u0010!J\u0010\u0010'\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b'\u0010!J\u0010\u0010(\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b(\u0010!J\u0010\u0010)\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b)\u0010!J\u0010\u0010*\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b*\u0010!J\u0010\u0010+\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b+\u0010!J\u0010\u0010,\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b,\u0010!J\u0010\u0010-\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b-\u0010!J\u0010\u0010.\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b.\u0010!J\u0010\u0010/\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b/\u0010!J\u0010\u00100\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b0\u0010!J\u0012\u00101\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b3\u00102J\u0012\u00104\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b4\u00102J\u0012\u00105\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b5\u00102J\u0010\u00106\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b6\u0010!J\u0010\u00107\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b7\u0010!Jô\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b8\u00109J\u001a\u0010<\u001a\u00020;2\b\u0010\u0003\u001a\u0004\u0018\u00010:HÖ\u0003¢\u0006\u0004\b<\u0010=J\u0010\u0010?\u001a\u00020>HÖ\u0001¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u0002H×\u0001¢\u0006\u0004\bA\u0010!R\u001a\u0010B\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010!R\u001a\u0010E\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010C\u001a\u0004\bF\u0010!R\u001a\u0010G\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010C\u001a\u0004\bH\u0010!R\u001a\u0010I\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010C\u001a\u0004\bJ\u0010!R\u001a\u0010K\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010C\u001a\u0004\bL\u0010!R\u001a\u0010M\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010C\u001a\u0004\bN\u0010!R\u001a\u0010O\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010C\u001a\u0004\bP\u0010!R\u001a\u0010Q\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bQ\u0010C\u001a\u0004\bR\u0010!R\u001a\u0010S\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bS\u0010C\u001a\u0004\bT\u0010!R\u001a\u0010U\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bU\u0010C\u001a\u0004\bV\u0010!R\u001a\u0010W\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bW\u0010C\u001a\u0004\bX\u0010!R\u001a\u0010Y\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bY\u0010C\u001a\u0004\bZ\u0010!R\u001a\u0010[\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b[\u0010C\u001a\u0004\b\\\u0010!R\u001a\u0010]\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b]\u0010C\u001a\u0004\b^\u0010!R\u001a\u0010_\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b_\u0010C\u001a\u0004\b`\u0010!R\u001a\u0010a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\ba\u0010C\u001a\u0004\bb\u0010!R\u001c\u0010c\u001a\u0004\u0018\u00010\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u00102R\u001c\u0010f\u001a\u0004\u0018\u00010\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\bf\u0010d\u001a\u0004\bg\u00102R\u001c\u0010h\u001a\u0004\u0018\u00010\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\bh\u0010d\u001a\u0004\bi\u00102R\u001c\u0010j\u001a\u0004\u0018\u00010\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\bj\u0010d\u001a\u0004\bk\u00102R\u001a\u0010l\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bl\u0010C\u001a\u0004\bm\u0010!R\u001a\u0010n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bn\u0010C\u001a\u0004\bo\u0010!"}, d2 = {"Lcom/bpjstku/data/jht/model/request/JhtClaimRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "Ljava/io/File;", "p16", "p17", "p18", "p19", "p20", "p21", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/io/File;Ljava/io/File;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V", "", "Lokhttp3/RequestBody;", "getPartMap", "()Ljava/util/Map;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "()Ljava/io/File;", "component18", "component19", "component20", "component21", "component22", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/io/File;Ljava/io/File;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/jht/model/request/JhtClaimRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "kpj", "Ljava/lang/String;", "getKpj", "kodeSebabKlaim", "getKodeSebabKlaim", "nik", "getNik", "namaLengkap", "getNamaLengkap", "tglLahir", "getTglLahir", "jenisKelamin", "getJenisKelamin", "npwp", "getNpwp", "nomorHp", "getNomorHp", "email", "getEmail", "namaIbuKandung", "getNamaIbuKandung", "kodeKantor", "getKodeKantor", "transferVia", "getTransferVia", "kodeBank", "getKodeBank", "namaBank", "getNamaBank", "nomorRekening", "getNomorRekening", "namaRekening", "getNamaRekening", "fotoKpj", "Ljava/io/File;", "getFotoKpj", "fotoKtp", "getFotoKtp", "fotoParklaring", "getFotoParklaring", "fotoKk", "getFotoKk", "fotoSelfie", "getFotoSelfie", "signature", "getSignature"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class JhtClaimRequest extends BaseRequest {
    public static final int $stable = 8;
    private static long TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int b;

    @SerializedName("email")
    private final String email;

    @SerializedName("fotoKk")
    private final File fotoKk;

    @SerializedName("fotoKpj")
    private final File fotoKpj;

    @SerializedName("fotoKtp")
    private final File fotoKtp;

    @SerializedName("fotoParklaring")
    private final File fotoParklaring;

    @SerializedName("file")
    private final String fotoSelfie;

    @SerializedName("jenisKelamin")
    private final String jenisKelamin;

    @SerializedName("kodeBank")
    private final String kodeBank;

    @SerializedName("kodeKantor")
    private final String kodeKantor;

    @SerializedName("kodeSebabKlaim")
    private final String kodeSebabKlaim;

    @SerializedName("kpj")
    private final String kpj;

    @SerializedName("namaBank")
    private final String namaBank;

    @SerializedName("namaIbuKandung")
    private final String namaIbuKandung;

    @SerializedName("namaLengkap")
    private final String namaLengkap;

    @SerializedName("namaRekening")
    private final String namaRekening;

    @SerializedName("nik")
    private final String nik;

    @SerializedName("nomorHp")
    private final String nomorHp;

    @SerializedName("nomorRekening")
    private final String nomorRekening;

    @SerializedName("npwp")
    private final String npwp;

    @SerializedName("signature")
    private final String signature;

    @SerializedName("tglLahir")
    private final String tglLahir;

    @SerializedName("transferVia")
    private final String transferVia;
    private static final byte[] $$c = {70, -114, 113, 8};
    private static final int $$f = 98;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {88, ByteCompanionObject.MAX_VALUE, -112, -47, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -54, -3, -3, 72, -56, -2, -3, 18, -10, 7, 16, -8, 65, -60, 11, 7, -15, 1, 6, 16, -5, 11, -6, -3, 73, -73, 3, 16, -1, -30, 15, -8, 14, -3, 4, 33, -14, -21, 15, 11, -6, -3, 49, -41, 20, -3, -3, 11, -6, -3, 4, 6, 14, 5, -3, 11, -8, 6, -2, 5, 6, -2, 12, 4, -15, 16, 7, -15, 45, -31, 14, 2, -4, 11, 2, 2, 8, -17, 12, -5, 69};
    private static final int $$e = 59;
    private static final byte[] $$a = {84, 10, 24, -102, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 233;
    private static int asBinder = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f389a = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;

    private static void c(byte b2, short s, short s2, Object[] objArr) {
        byte[] bArr = $$a;
        int i = 55 - (s2 * 52);
        int i2 = (b2 * 14) + 84;
        byte[] bArr2 = new byte[53 - s];
        int i3 = 52 - s;
        int i4 = -1;
        if (bArr == null) {
            i2 = (i + (-i2)) - 10;
            i = i;
            i4 = -1;
        }
        while (true) {
            int i5 = i + 1;
            int i6 = i4 + 1;
            bArr2[i6] = (byte) i2;
            if (i6 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i2 = (i2 + (-bArr[i5])) - 10;
            i = i5;
            i4 = i6;
        }
    }

    private static void e(short s, short s2, int i, Object[] objArr) {
        int i2 = 50 - (i * 47);
        int i3 = s2 * 5;
        byte[] bArr = $$d;
        int i4 = 99 - (s * 15);
        byte[] bArr2 = new byte[53 - i3];
        int i5 = 52 - i3;
        int i6 = -1;
        if (bArr == null) {
            i4 = i2 + (-i4) + 3;
            i6 = -1;
        }
        while (true) {
            int i7 = i2;
            int i8 = i4;
            int i9 = i6 + 1;
            bArr2[i9] = (byte) i8;
            if (i9 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i10 = i7 + 1;
            i2 = i10;
            i4 = i8 + (-bArr[i10]) + 3;
            i6 = i9;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ JhtClaimRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, File file, File file2, File file3, File file4, String str17, String str18, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str19;
        if ((i & 2048) != 0) {
            int i2 = f389a + 65;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 12 / 0;
            }
            int i4 = 2 % 2;
            str19 = "BANK";
        } else {
            str19 = str12;
        }
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str19, str13, str14, str15, str16, file, file2, file3, file4, str17, str18);
    }

    public JhtClaimRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, File file, File file2, File file3, File file4, String str17, String str18) {
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
        this.kpj = str;
        this.kodeSebabKlaim = str2;
        this.nik = str3;
        this.namaLengkap = str4;
        this.tglLahir = str5;
        this.jenisKelamin = str6;
        this.npwp = str7;
        this.nomorHp = str8;
        this.email = str9;
        this.namaIbuKandung = str10;
        this.kodeKantor = str11;
        this.transferVia = str12;
        this.kodeBank = str13;
        this.namaBank = str14;
        this.nomorRekening = str15;
        this.namaRekening = str16;
        this.fotoKpj = file;
        this.fotoKtp = file2;
        this.fotoParklaring = file3;
        this.fotoKk = file4;
        this.fotoSelfie = str17;
        this.signature = str18;
    }

    private static void d(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i3 = $11 + 69;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (8329 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 1234 - TextUtils.lastIndexOf("", '0', 0), 35 - View.resolveSize(0, 0), -653973969, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
                    int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 2764;
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 15;
                    byte b4 = (byte) ($$f & 15);
                    byte b5 = (byte) (b4 - 3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, iIndexOf, iLastIndexOf, 1504416861, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), MotionEvent.axisFromString("") + 254, ExpandableListView.getPackedPositionType(0L) + 22, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 1;
                    byte b7 = (byte) (-b6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (65200 - (ViewConfiguration.getScrollBarSize() >> 8)), 2891 - View.getDefaultSize(0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 17, 2012627446, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentbindingInflater1 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) b) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
        int i5 = $11 + 23;
        $10 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getKpj() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cBlue = (char) (Color.blue(0) + 31533);
            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 921;
            int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 28;
            byte b2 = $$a[7];
            Object[] objArr2 = new Object[1];
            c(b2, (byte) 52, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cBlue, doubleTapTimeout, iIndexOf, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        d(new char[]{17318, 12201, 28425, 29119}, new char[]{25885, 29083, 51145, 60348}, (char) View.resolveSizeAndState(0, 0, 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new char[]{8733, 48617, 21301, 3881, 33762, 10971, 22567, 9098, 38709, 14582, 59272, 40188, 41806, 63456, 57027, 9832, 21820, 53968, 29342, 7786, 56611, 49762}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        d(new char[]{17318, 12201, 28425, 29119}, new char[]{48301, 5329, 28129, 59650}, (char) (621 - Color.argb(0, 0, 0, 0)), (-518729283) + Process.getGidForName(""), new char[]{7491, 44588, 58339, 34631, 30049, 31707, 46935, 65518, 51888, 5015, 65311, 9622, 38318, 640, 8733}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char minimumFlingVelocity = (char) (31533 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
            int iResolveSize = 921 - View.resolveSize(0, 0);
            int scrollBarSize = 28 - (ViewConfiguration.getScrollBarSize() >> 8);
            byte[] bArr = $$a;
            byte b3 = bArr[80];
            Object[] objArr5 = new Object[1];
            c(b3, b3, bArr[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(minimumFlingVelocity, iResolveSize, scrollBarSize, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cMakeMeasureSpec = (char) (31533 - View.MeasureSpec.makeMeasureSpec(0, 0));
                int iIndexOf2 = 921 - TextUtils.indexOf("", "");
                int deadChar = 28 - KeyEvent.getDeadChar(0, 0);
                byte[] bArr2 = $$a;
                byte b4 = bArr2[80];
                Object[] objArr6 = new Object[1];
                c(b4, (byte) (-bArr2[33]), b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMakeMeasureSpec, iIndexOf2, deadChar, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i2 = 2106421723 + (((~((-1590205732) | iIdentityHashCode)) | 180392224) * 576) + (((~((~iIdentityHashCode) | (-1409813508))) | 3481688) * 576) + 1224304210;
            int i3 = (i2 << 13) ^ i2;
            int i4 = i3 ^ (i3 >>> 17);
            ((int[]) objArr[0])[0] = i4 ^ (i4 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            d(new char[]{17318, 12201, 28425, 29119}, new char[]{65510, 52268, 9085, 50050}, (char) (33316 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), TextUtils.getCapsMode("", 0, 0), new char[]{56990, 42297, 41429, 15054, 43576, 21823, 19308, 63249, 36558, 34034, 56429, 40295, 39787, 16467, 35803, 13132, 65050, 32247, 33677, 62198, 29630, 61426, 7764, 19084, 18800, 16393}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            d(new char[]{17318, 12201, 28425, 29119}, new char[]{64994, 42536, 16096, 3282}, (char) (53822 - TextUtils.getOffsetBefore("", 0)), ViewConfiguration.getScrollDefaultDelay() >> 16, new char[]{28211, 42586, 44115, 11277, 32505, 1505, 4575, 58165, 25866, 33579, 18823, 59051, 15612, 54855, 9905, 43082, 10748, 26372}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            d(new char[]{17318, 12201, 28425, 29119}, new char[]{52921, 11708, 40842, 57347}, (char) (KeyEvent.getDeadChar(0, 0) + 927), (-1) - TextUtils.lastIndexOf("", '0'), new char[]{34756, 54324, 52941, 27876, 11652, 56173, 60745, 48323, 20705, 13777, 14481, 59310, 24285, 28236, 44248, 58179}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            d(new char[]{17318, 12201, 28425, 29119}, new char[]{44064, 34270, 57753, 55375}, (char) (20449 - View.MeasureSpec.makeMeasureSpec(0, 0)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1, new char[]{42692, 51893, 4528, 15040, 8150, 17090, 40623, 7566, 52102, 39390, 31, 19859, 49395, 27572, 26150, 35646}, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i5 = f389a + 107;
            int i6 = i5 % 128;
            asBinder = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 15;
            f389a = i8 % 128;
            int i9 = i8 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 397598290};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[39];
                byte b6 = (byte) (b5 - 1);
                byte b7 = b5;
                Object[] objArr13 = new Object[1];
                e(b6, b7, b7, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b8 = bArr3[39];
                byte b9 = (byte) (b8 - 1);
                Object[] objArr14 = new Object[1];
                e(b8, b9, b9, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cCombineMeasuredStates = (char) (31533 - View.combineMeasuredStates(0, 0));
                    int i10 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 920;
                    int iLastIndexOf = 27 - TextUtils.lastIndexOf("", '0', 0);
                    byte[] bArr4 = $$a;
                    byte b10 = bArr4[80];
                    Object[] objArr16 = new Object[1];
                    c(b10, (byte) (-bArr4[33]), b10, objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cCombineMeasuredStates, i10, iLastIndexOf, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    d(new char[]{17318, 12201, 28425, 29119}, new char[]{25885, 29083, 51145, 60348}, (char) ((-1) - Process.getGidForName("")), ViewConfiguration.getScrollBarSize() >> 8, new char[]{8733, 48617, 21301, 3881, 33762, 10971, 22567, 9098, 38709, 14582, 59272, 40188, 41806, 63456, 57027, 9832, 21820, 53968, 29342, 7786, 56611, 49762}, objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    d(new char[]{17318, 12201, 28425, 29119}, new char[]{48301, 5329, 28129, 59650}, (char) ((KeyEvent.getMaxKeyCode() >> 16) + 621), (-518729285) - TextUtils.lastIndexOf("", '0'), new char[]{7491, 44588, 58339, 34631, 30049, 31707, 46935, 65518, 51888, 5015, 65311, 9622, 38318, 640, 8733}, objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char scrollBarSize2 = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 31533);
                        int packedPositionGroup = 921 - ExpandableListView.getPackedPositionGroup(0L);
                        int i11 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 27;
                        byte[] bArr5 = $$a;
                        byte b11 = bArr5[80];
                        Object[] objArr19 = new Object[1];
                        c(b11, b11, bArr5[7], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarSize2, packedPositionGroup, i11, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 31533);
                        int offsetAfter = TextUtils.getOffsetAfter("", 0) + 921;
                        int capsMode = TextUtils.getCapsMode("", 0, 0) + 28;
                        byte b12 = $$a[7];
                        Object[] objArr20 = new Object[1];
                        c(b12, (byte) 52, b12, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(tapTimeout, offsetAfter, capsMode, -1048449946, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
            int i14 = asBinder + 33;
            f389a = i14 % 128;
            int i15 = i14 % 2;
            int i16 = ((int[]) objArr[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i17 = ~((-395205302) | iIdentityHashCode2);
            int i18 = 1499367375 + ((92276753 | i17) * (-280)) + ((i17 | (~((-1378874343) | iIdentityHashCode2))) * 140);
            int i19 = ~((-302928549) | iIdentityHashCode2);
            int i20 = ~iIdentityHashCode2;
            int i21 = i16 + i18 + (((~(i20 | (-1075945795))) | i19 | (~((-92276754) | i20))) * 140);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr21[0])[0] = i23 ^ (i23 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i24 = f389a + 97;
                int i25 = i24 % 128;
                asBinder = i25;
                int i26 = i24 % 2;
                int i27 = i25 + 61;
                f389a = i27 % 128;
                if (i27 % 2 == 0) {
                    int i28 = 3 / 3;
                }
                for (String str : strArr) {
                    int i29 = f389a + 29;
                    asBinder = i29 % 128;
                    int i30 = i29 % 2;
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i13];
            int i31 = i13 - 1;
            iArr[i31] = 1;
            Toast.makeText((Context) null, iArr[((i13 * i31) % 2) - 1], 1).show();
            int i32 = ((int[]) objArr[0])[0];
            Object[] objArr22 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i33 = ~((-488902704) | iIdentityHashCode3);
            int i34 = ~iIdentityHashCode3;
            int i35 = i32 + (-798292173) + ((i33 | (~(1285176940 | i34))) * (-1808)) + (((~((-201330733) | iIdentityHashCode3)) | (~(i34 | 1572748911))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(iIdentityHashCode3 | (-1285176941))) | 287571971 | (~(488902703 | i34))) * TypedValues.Custom.TYPE_BOOLEAN);
            int i36 = (i35 << 13) ^ i35;
            int i37 = i36 ^ (i36 >>> 17);
            ((int[]) objArr22[0])[0] = i37 ^ (i37 << 5);
        }
        return this.kpj;
    }

    public final String getKodeSebabKlaim() {
        String str;
        int i = 2 % 2;
        int i2 = f389a;
        int i3 = i2 + 13;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.kodeSebabKlaim;
            int i4 = 58 / 0;
        } else {
            str = this.kodeSebabKlaim;
        }
        int i5 = i2 + 67;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getNik() {
        int i = 2 % 2;
        int i2 = asBinder + 7;
        int i3 = i2 % 128;
        f389a = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.nik;
        int i4 = i3 + 81;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getNamaLengkap() {
        int i = 2 % 2;
        int i2 = asBinder + 91;
        f389a = i2 % 128;
        if (i2 % 2 != 0) {
            return this.namaLengkap;
        }
        throw null;
    }

    public final String getTglLahir() {
        int i = 2 % 2;
        int i2 = asBinder + 89;
        int i3 = i2 % 128;
        f389a = i3;
        int i4 = i2 % 2;
        String str = this.tglLahir;
        int i5 = i3 + 71;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getJenisKelamin() {
        int i = 2 % 2;
        int i2 = f389a + 105;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        String str = this.jenisKelamin;
        int i5 = i3 + 1;
        f389a = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getNpwp() {
        int i = 2 % 2;
        int i2 = f389a + 113;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String str = this.npwp;
        if (i3 != 0) {
            int i4 = 40 / 0;
        }
        return str;
    }

    public final String getNomorHp() {
        int i = 2 % 2;
        int i2 = asBinder + 61;
        int i3 = i2 % 128;
        f389a = i3;
        int i4 = i2 % 2;
        String str = this.nomorHp;
        int i5 = i3 + 83;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getEmail() {
        int i = 2 % 2;
        int i2 = f389a + 81;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        String str = this.email;
        int i5 = i3 + 43;
        f389a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getNamaIbuKandung() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 119;
        f389a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.namaIbuKandung;
        int i5 = i2 + 125;
        f389a = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getKodeKantor() {
        int i = 2 % 2;
        int i2 = f389a + 89;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        String str = this.kodeKantor;
        int i5 = i3 + 55;
        f389a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getTransferVia() {
        int i = 2 % 2;
        int i2 = f389a;
        int i3 = i2 + 103;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.transferVia;
        int i5 = i2 + 7;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getKodeBank() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 13;
        f389a = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.kodeBank;
        int i4 = i2 + 75;
        f389a = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getNamaBank() {
        int i = 2 % 2;
        int i2 = asBinder + 99;
        f389a = i2 % 128;
        if (i2 % 2 != 0) {
            return this.namaBank;
        }
        throw null;
    }

    public final String getNomorRekening() {
        int i = 2 % 2;
        int i2 = f389a + 13;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        String str = this.nomorRekening;
        int i5 = i3 + 53;
        f389a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getNamaRekening() {
        int i = 2 % 2;
        int i2 = f389a;
        int i3 = i2 + 21;
        asBinder = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.namaRekening;
        int i4 = i2 + 105;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final File getFotoKpj() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 25;
        f389a = i3 % 128;
        int i4 = i3 % 2;
        File file = this.fotoKpj;
        int i5 = i2 + 121;
        f389a = i5 % 128;
        int i6 = i5 % 2;
        return file;
    }

    public final File getFotoKtp() {
        int i = 2 % 2;
        int i2 = f389a;
        int i3 = i2 + 105;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        File file = this.fotoKtp;
        int i5 = i2 + 49;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 42 / 0;
        }
        return file;
    }

    public final File getFotoParklaring() {
        int i = 2 % 2;
        int i2 = f389a;
        int i3 = i2 + 123;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        File file = this.fotoParklaring;
        int i5 = i2 + 111;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return file;
        }
        throw null;
    }

    public final File getFotoKk() {
        int i = 2 % 2;
        int i2 = asBinder + 119;
        int i3 = i2 % 128;
        f389a = i3;
        int i4 = i2 % 2;
        File file = this.fotoKk;
        int i5 = i3 + 97;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return file;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getFotoSelfie() {
        int i = 2 % 2;
        int i2 = f389a + 97;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        String str = this.fotoSelfie;
        int i5 = i3 + 37;
        f389a = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getSignature() {
        int i = 2 % 2;
        int i2 = asBinder + 97;
        f389a = i2 % 128;
        if (i2 % 2 != 0) {
            return this.signature;
        }
        throw null;
    }

    public final Map<String, RequestBody> getPartMap() {
        int i = 2 % 2;
        Map<String, Object> mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 = createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this);
        if (mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.remove("fotoKpj");
        }
        if (mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.remove("fotoKtp");
        }
        if (mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            int i2 = f389a + 55;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.remove("fotoParklaring");
        }
        if (mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.remove("fotoKk");
        }
        if (mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
            int i4 = f389a + 107;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.size()));
        Iterator<T> it = mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.entrySet().iterator();
        int i6 = f389a + 19;
        while (true) {
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            if (!it.hasNext()) {
                return linkedHashMap;
            }
            int i8 = asBinder + 41;
            f389a = i8 % 128;
            int i9 = i8 % 2;
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            Intrinsics.checkNotNullParameter(value, "");
            linkedHashMap.put(key, RequestBody.INSTANCE.create((String) value, MediaType.INSTANCE.parse("text/plain")));
            i6 = f389a + 61;
        }
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
        if (i % 2 != 0) {
            int i2 = 48 / 0;
        }
    }

    public static /* synthetic */ JhtClaimRequest copy$default(JhtClaimRequest jhtClaimRequest, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, File file, File file2, File file3, File file4, String str17, String str18, int i, Object obj) {
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        File file5;
        String str26;
        File file6;
        File file7;
        int i2 = 2 % 2;
        int i3 = asBinder + 83;
        int i4 = i3 % 128;
        f389a = i4;
        String str27 = (i3 % 2 == 0 || (i & 1) == 0) ? str : jhtClaimRequest.kpj;
        String str28 = (i & 2) != 0 ? jhtClaimRequest.kodeSebabKlaim : str2;
        String str29 = (i & 4) != 0 ? jhtClaimRequest.nik : str3;
        if ((i & 8) != 0) {
            int i5 = i4 + 53;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            str19 = jhtClaimRequest.namaLengkap;
        } else {
            str19 = str4;
        }
        String str30 = (i & 16) != 0 ? jhtClaimRequest.tglLahir : str5;
        if ((i & 32) != 0) {
            int i7 = i4 + 9;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            str20 = jhtClaimRequest.jenisKelamin;
        } else {
            str20 = str6;
        }
        if ((i & 64) != 0) {
            int i9 = asBinder + 57;
            f389a = i9 % 128;
            if (i9 % 2 == 0) {
                str21 = jhtClaimRequest.npwp;
                int i10 = 3 / 0;
            } else {
                str21 = jhtClaimRequest.npwp;
            }
        } else {
            str21 = str7;
        }
        if ((i & 128) != 0) {
            int i11 = f389a + 43;
            asBinder = i11 % 128;
            if (i11 % 2 != 0) {
                String str31 = jhtClaimRequest.nomorHp;
                throw null;
            }
            str22 = jhtClaimRequest.nomorHp;
        } else {
            str22 = str8;
        }
        String str32 = (i & 256) != 0 ? jhtClaimRequest.email : str9;
        String str33 = (i & 512) != 0 ? jhtClaimRequest.namaIbuKandung : str10;
        String str34 = (i & 1024) != 0 ? jhtClaimRequest.kodeKantor : str11;
        if ((i & 2048) != 0) {
            String str35 = jhtClaimRequest.transferVia;
            int i12 = f389a + 93;
            asBinder = i12 % 128;
            int i13 = i12 % 2;
            str23 = str35;
        } else {
            str23 = str12;
        }
        if ((i & 4096) != 0) {
            int i14 = asBinder + 33;
            str24 = str23;
            f389a = i14 % 128;
            int i15 = i14 % 2;
            str25 = jhtClaimRequest.kodeBank;
            if (i15 == 0) {
                int i16 = 13 / 0;
            }
        } else {
            str24 = str23;
            str25 = str13;
        }
        String str36 = (i & 8192) != 0 ? jhtClaimRequest.namaBank : str14;
        String str37 = (i & 16384) != 0 ? jhtClaimRequest.nomorRekening : str15;
        String str38 = (i & 32768) != 0 ? jhtClaimRequest.namaRekening : str16;
        File file8 = (i & 65536) != 0 ? jhtClaimRequest.fotoKpj : file;
        File file9 = (i & 131072) != 0 ? jhtClaimRequest.fotoKtp : file2;
        if ((i & 262144) != 0) {
            file5 = file9;
            int i17 = f389a + 31;
            str26 = str36;
            asBinder = i17 % 128;
            if (i17 % 2 != 0) {
                file6 = jhtClaimRequest.fotoParklaring;
                int i18 = 22 / 0;
            } else {
                file6 = jhtClaimRequest.fotoParklaring;
            }
        } else {
            file5 = file9;
            str26 = str36;
            file6 = file3;
        }
        if ((524288 & i) != 0) {
            int i19 = asBinder + 39;
            f389a = i19 % 128;
            int i20 = i19 % 2;
            file7 = jhtClaimRequest.fotoKk;
        } else {
            file7 = file4;
        }
        return jhtClaimRequest.copy(str27, str28, str29, str19, str30, str20, str21, str22, str32, str33, str34, str24, str25, str26, str37, str38, file8, file5, file6, file7, (1048576 & i) != 0 ? jhtClaimRequest.fotoSelfie : str17, (i & 2097152) != 0 ? jhtClaimRequest.signature : str18);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = f389a;
        int i3 = i2 + 35;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.kpj;
        int i5 = i2 + 57;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = asBinder + 23;
        f389a = i2 % 128;
        if (i2 % 2 != 0) {
            return this.namaIbuKandung;
        }
        throw null;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = f389a + 23;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        String str = this.kodeKantor;
        int i5 = i3 + 17;
        f389a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component12() {
        String str;
        int i = 2 % 2;
        int i2 = f389a + 71;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 != 0) {
            str = this.transferVia;
            int i4 = 40 / 0;
        } else {
            str = this.transferVia;
        }
        int i5 = i3 + 23;
        f389a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component13() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 63;
        f389a = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.kodeBank;
        int i4 = i2 + 53;
        f389a = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component14() {
        int i = 2 % 2;
        int i2 = asBinder + 27;
        int i3 = i2 % 128;
        f389a = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.namaBank;
        int i4 = i3 + 1;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component15() {
        int i = 2 % 2;
        int i2 = asBinder + 81;
        int i3 = i2 % 128;
        f389a = i3;
        int i4 = i2 % 2;
        String str = this.nomorRekening;
        int i5 = i3 + 17;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component16() {
        int i = 2 % 2;
        int i2 = f389a + 101;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        String str = this.namaRekening;
        int i5 = i3 + 65;
        f389a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final File component17() {
        int i = 2 % 2;
        int i2 = f389a + 35;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return this.fotoKpj;
        }
        throw null;
    }

    public final File component18() {
        int i = 2 % 2;
        int i2 = f389a + 53;
        int i3 = i2 % 128;
        asBinder = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        File file = this.fotoKtp;
        int i4 = i3 + 49;
        f389a = i4 % 128;
        if (i4 % 2 != 0) {
            return file;
        }
        throw null;
    }

    public final File component19() {
        int i = 2 % 2;
        int i2 = f389a + 119;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        File file = this.fotoParklaring;
        int i5 = i3 + 61;
        f389a = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 5 / 0;
        }
        return file;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = f389a;
        int i3 = i2 + 63;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.kodeSebabKlaim;
        int i5 = i2 + 83;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 74 / 0;
        }
        return str;
    }

    public final File component20() {
        int i = 2 % 2;
        int i2 = asBinder + 81;
        f389a = i2 % 128;
        if (i2 % 2 != 0) {
            return this.fotoKk;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component21() {
        int i = 2 % 2;
        int i2 = f389a;
        int i3 = i2 + 123;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.fotoSelfie;
        int i5 = i2 + 121;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component22() {
        String str;
        int i = 2 % 2;
        int i2 = asBinder + 21;
        int i3 = i2 % 128;
        f389a = i3;
        if (i2 % 2 == 0) {
            str = this.signature;
            int i4 = 26 / 0;
        } else {
            str = this.signature;
        }
        int i5 = i3 + 115;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = asBinder + 11;
        f389a = i2 % 128;
        int i3 = i2 % 2;
        String str = this.nik;
        if (i3 == 0) {
            int i4 = 33 / 0;
        }
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 95;
        f389a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.namaLengkap;
        int i5 = i2 + 3;
        f389a = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 69;
        f389a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.tglLahir;
        int i5 = i2 + 27;
        f389a = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = f389a;
        int i3 = i2 + 37;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.jenisKelamin;
        int i4 = i2 + 93;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = f389a + 61;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String str = this.npwp;
        if (i3 != 0) {
            int i4 = 38 / 0;
        }
        return str;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 83;
        f389a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.nomorHp;
        int i5 = i2 + 27;
        f389a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = asBinder + 125;
        int i3 = i2 % 128;
        f389a = i3;
        int i4 = i2 % 2;
        String str = this.email;
        int i5 = i3 + 13;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final JhtClaimRequest copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10, String p11, String p12, String p13, String p14, String p15, File p16, File p17, File p18, File p19, String p20, String p21) {
        int i = 2 % 2;
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
        Intrinsics.checkNotNullParameter(p20, "");
        Intrinsics.checkNotNullParameter(p21, "");
        JhtClaimRequest jhtClaimRequest = new JhtClaimRequest(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21);
        int i2 = asBinder + 7;
        f389a = i2 % 128;
        int i3 = i2 % 2;
        return jhtClaimRequest;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof JhtClaimRequest)) {
            return false;
        }
        JhtClaimRequest jhtClaimRequest = (JhtClaimRequest) p0;
        if (!Intrinsics.areEqual(this.kpj, jhtClaimRequest.kpj) || !Intrinsics.areEqual(this.kodeSebabKlaim, jhtClaimRequest.kodeSebabKlaim)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.nik, jhtClaimRequest.nik)) {
            int i2 = asBinder + 9;
            f389a = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.namaLengkap, jhtClaimRequest.namaLengkap)) {
            int i4 = f389a + 13;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.tglLahir, jhtClaimRequest.tglLahir)) {
            int i6 = f389a + 113;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.jenisKelamin, jhtClaimRequest.jenisKelamin) || !Intrinsics.areEqual(this.npwp, jhtClaimRequest.npwp)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.nomorHp, jhtClaimRequest.nomorHp)) {
            int i8 = f389a + 93;
            asBinder = i8 % 128;
            return i8 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.email, jhtClaimRequest.email) || !Intrinsics.areEqual(this.namaIbuKandung, jhtClaimRequest.namaIbuKandung)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.kodeKantor, jhtClaimRequest.kodeKantor)) {
            int i9 = f389a + 101;
            asBinder = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.transferVia, jhtClaimRequest.transferVia)) {
            int i11 = asBinder + 61;
            f389a = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.kodeBank, jhtClaimRequest.kodeBank) || !Intrinsics.areEqual(this.namaBank, jhtClaimRequest.namaBank) || !Intrinsics.areEqual(this.nomorRekening, jhtClaimRequest.nomorRekening)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.namaRekening, jhtClaimRequest.namaRekening)) {
            int i13 = asBinder + 79;
            f389a = i13 % 128;
            if (i13 % 2 != 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!Intrinsics.areEqual(this.fotoKpj, jhtClaimRequest.fotoKpj) || !Intrinsics.areEqual(this.fotoKtp, jhtClaimRequest.fotoKtp) || (!Intrinsics.areEqual(this.fotoParklaring, jhtClaimRequest.fotoParklaring))) {
            return false;
        }
        if (Intrinsics.areEqual(this.fotoKk, jhtClaimRequest.fotoKk)) {
            return Intrinsics.areEqual(this.fotoSelfie, jhtClaimRequest.fotoSelfie) && Intrinsics.areEqual(this.signature, jhtClaimRequest.signature);
        }
        int i14 = f389a + 107;
        asBinder = i14 % 128;
        int i15 = i14 % 2;
        return false;
    }

    public final int hashCode() {
        int i;
        int iHashCode;
        int iHashCode2;
        int i2 = 2 % 2;
        int iHashCode3 = this.kpj.hashCode();
        int iHashCode4 = this.kodeSebabKlaim.hashCode();
        int iHashCode5 = this.nik.hashCode();
        int iHashCode6 = this.namaLengkap.hashCode();
        int iHashCode7 = this.tglLahir.hashCode();
        int iHashCode8 = this.jenisKelamin.hashCode();
        int iHashCode9 = this.npwp.hashCode();
        int iHashCode10 = this.nomorHp.hashCode();
        int iHashCode11 = this.email.hashCode();
        int iHashCode12 = this.namaIbuKandung.hashCode();
        int iHashCode13 = this.kodeKantor.hashCode();
        int iHashCode14 = this.transferVia.hashCode();
        int iHashCode15 = this.kodeBank.hashCode();
        int iHashCode16 = this.namaBank.hashCode();
        int iHashCode17 = this.nomorRekening.hashCode();
        int iHashCode18 = this.namaRekening.hashCode();
        File file = this.fotoKpj;
        int iHashCode19 = 0;
        int iHashCode20 = file == null ? 0 : file.hashCode();
        File file2 = this.fotoKtp;
        if (file2 == null) {
            int i3 = asBinder + 97;
            i = iHashCode16;
            f389a = i3 % 128;
            iHashCode = i3 % 2 == 0 ? 1 : 0;
        } else {
            i = iHashCode16;
            iHashCode = file2.hashCode();
        }
        File file3 = this.fotoParklaring;
        if (file3 == null) {
            int i4 = f389a + 51;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = file3.hashCode();
        }
        File file4 = this.fotoKk;
        if (file4 != null) {
            iHashCode19 = file4.hashCode();
            int i6 = asBinder + 83;
            f389a = i6 % 128;
            int i7 = i6 % 2;
        }
        return (((((((((((((((((((((((((((((((((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + i) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode20) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode19) * 31) + this.fotoSelfie.hashCode()) * 31) + this.signature.hashCode();
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.kpj;
        String str2 = this.kodeSebabKlaim;
        String str3 = this.nik;
        String str4 = this.namaLengkap;
        String str5 = this.tglLahir;
        String str6 = this.jenisKelamin;
        String str7 = this.npwp;
        String str8 = this.nomorHp;
        String str9 = this.email;
        String str10 = this.namaIbuKandung;
        String str11 = this.kodeKantor;
        String str12 = this.transferVia;
        String str13 = this.kodeBank;
        String str14 = this.namaBank;
        String str15 = this.nomorRekening;
        String str16 = this.namaRekening;
        File file = this.fotoKpj;
        File file2 = this.fotoKtp;
        File file3 = this.fotoParklaring;
        File file4 = this.fotoKk;
        String str17 = this.fotoSelfie;
        String str18 = this.signature;
        StringBuilder sb = new StringBuilder("JhtClaimRequest(kpj=");
        sb.append(str);
        sb.append(", kodeSebabKlaim=");
        sb.append(str2);
        sb.append(", nik=");
        sb.append(str3);
        sb.append(", namaLengkap=");
        sb.append(str4);
        sb.append(", tglLahir=");
        sb.append(str5);
        sb.append(", jenisKelamin=");
        sb.append(str6);
        sb.append(", npwp=");
        sb.append(str7);
        sb.append(", nomorHp=");
        sb.append(str8);
        sb.append(", email=");
        sb.append(str9);
        sb.append(", namaIbuKandung=");
        sb.append(str10);
        sb.append(", kodeKantor=");
        sb.append(str11);
        sb.append(", transferVia=");
        sb.append(str12);
        sb.append(", kodeBank=");
        sb.append(str13);
        sb.append(", namaBank=");
        sb.append(str14);
        sb.append(", nomorRekening=");
        sb.append(str15);
        sb.append(", namaRekening=");
        sb.append(str16);
        sb.append(", fotoKpj=");
        sb.append(file);
        sb.append(", fotoKtp=");
        sb.append(file2);
        sb.append(", fotoParklaring=");
        sb.append(file3);
        sb.append(", fotoKk=");
        sb.append(file4);
        sb.append(", fotoSelfie=");
        sb.append(str17);
        sb.append(", signature=");
        sb.append(str18);
        sb.append(")");
        String string = sb.toString();
        int i2 = asBinder + 57;
        f389a = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentbindingInflater1 = -2971950814661392745L;
        b = -981105359;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (char) 34097;
    }

    private static String $$g(int i, int i2, byte b2) {
        int i3 = b2 * 2;
        int i4 = i + 102;
        byte[] bArr = $$c;
        int i5 = i2 + 4;
        byte[] bArr2 = new byte[1 - i3];
        int i6 = 0 - i3;
        int i7 = -1;
        if (bArr == null) {
            int i8 = i5 + (-i6);
            i5 = i5;
            i4 = i8;
        }
        while (true) {
            i7++;
            int i9 = i5 + 1;
            bArr2[i7] = (byte) i4;
            if (i7 == i6) {
                return new String(bArr2, 0);
            }
            i5 = i9;
            i4 += -bArr[i9];
        }
    }
}
