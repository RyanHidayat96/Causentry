package com.bpjstku.data.scholarship.model.request;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.abortCapture;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Random;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0010\u0010\u001c\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001e\u0010\u0017J\u0010\u0010\u001f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u001f\u0010\u0017J\u0010\u0010 \u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b \u0010\u0017J\u0010\u0010!\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b!\u0010\u0017J\u0010\u0010\"\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\"\u0010\u0017J\u0010\u0010#\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b#\u0010\u0017J\u0010\u0010$\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b$\u0010\u0017J\u0010\u0010%\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b%\u0010\u0017J\u0010\u0010&\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b&\u0010\u0017J\u0010\u0010'\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b'\u0010\u0017Jº\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020*2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b0\u0010\u0017R\u001a\u00101\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u0017R\u001a\u00104\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u00102\u001a\u0004\b5\u0010\u0017R\u001a\u00106\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u00102\u001a\u0004\b7\u0010\u0017R\u001a\u00108\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u00102\u001a\u0004\b9\u0010\u0017R\u001a\u0010:\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u00102\u001a\u0004\b;\u0010\u0017R\u001a\u0010<\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u00102\u001a\u0004\b=\u0010\u0017R\u001a\u0010>\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u00102\u001a\u0004\b?\u0010\u0017R\u001a\u0010@\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b@\u00102\u001a\u0004\bA\u0010\u0017R\u001a\u0010B\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u00102\u001a\u0004\bC\u0010\u0017R\u001a\u0010D\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bD\u00102\u001a\u0004\bE\u0010\u0017R\u001a\u0010F\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bF\u00102\u001a\u0004\bG\u0010\u0017R\u001a\u0010H\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bH\u00102\u001a\u0004\bI\u0010\u0017R\u001a\u0010J\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bJ\u00102\u001a\u0004\bK\u0010\u0017R\u001a\u0010L\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bL\u00102\u001a\u0004\bM\u0010\u0017R\u001a\u0010N\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bN\u00102\u001a\u0004\bO\u0010\u0017R\u001a\u0010P\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bP\u00102\u001a\u0004\bQ\u0010\u0017R\u001a\u0010R\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bR\u00102\u001a\u0004\bS\u0010\u0017"}, d2 = {"Lcom/bpjstku/data/scholarship/model/request/Penerima;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "p16", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/scholarship/model/request/Penerima;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "nikPenerima", "Ljava/lang/String;", "getNikPenerima", "namaPenerima", "getNamaPenerima", "tglLahirPenerima", "getTglLahirPenerima", "noUrutPenerima", "getNoUrutPenerima", "kodeKlaimPertama", "getKodeKlaimPertama", "kodeKlaimAkhir", "getKodeKlaimAkhir", "besarManfaat", "getBesarManfaat", "flagDokLengkap", "getFlagDokLengkap", "flagMasihSekolah", "getFlagMasihSekolah", "statusNaik", "getStatusNaik", "tahunBeasiswa", "getTahunBeasiswa", "oldLembagaPendidikan", "getOldLembagaPendidikan", "oldJenjangPendidikan", "getOldJenjangPendidikan", "oldTingkatPendidikan", "getOldTingkatPendidikan", "lembagaPendidikan", "getLembagaPendidikan", "jenjangPendidikan", "getJenjangPendidikan", "tingkatPendidikan", "getTingkatPendidikan"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Penerima {
    public static final int $stable = 0;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final String besarManfaat;
    private final String flagDokLengkap;
    private final String flagMasihSekolah;
    private final String jenjangPendidikan;
    private final String kodeKlaimAkhir;
    private final String kodeKlaimPertama;
    private final String lembagaPendidikan;
    private final String namaPenerima;
    private final String nikPenerima;
    private final String noUrutPenerima;
    private final String oldJenjangPendidikan;
    private final String oldLembagaPendidikan;
    private final String oldTingkatPendidikan;
    private final String statusNaik;
    private final String tahunBeasiswa;
    private final String tglLahirPenerima;
    private final String tingkatPendidikan;
    private static final byte[] $$c = {30, 17, -35, 104};
    private static final int $$f = 188;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {29, 88, -118, 32, -8, -9, 4, -1, -9, -14, 70, -57, -16, -7, -1, -10, -3, 7, -9, 5, -18, 65, -60, -10, -7, -12, 69, -41, -37, 15, -21, -6, 11, -3, 9, -21, -5, -7, 3, 14, -38, 15, -21, 12, -19, 5, 3, -7, -3, 60, -67, -16, -2, -4, 8, -17, 6, 60, -17, -37, 8, -15, 7, -10, -3, 26, -21, -28, 8, 4, -13, -10, 42, -48, 13, -10, -10, 4, -13, -10, -3, -1, 7, -2, -10, 4, -15, -1, -9, -2, -1, -9, 5, -3, -22, 9, 0, -22, 38, -38, 7, -5, -11, 4, -5, -5, 1, -24, 5, -12, 63, -16, -2, 59, -61, -12, -4, 4, -9, 3, 51, -60, -7, -13, 9, -1, -3, -22, 10, 51, -70, 0, 7, -23, 10, -13, -7, 1, 0, -9, 4, -13, Base64.padSymbol, -33, -40, -9, 4, -1, -9, 38, -37, -19, 11, -2, -21, 1, -7, -37, 8, -15, 7, -10, -3, 26, -21, -28, 8, 4, -13, -10, 42, -48, 13, -10, -10, 4, -13, -10, -3, -1, 7, -2, -10, 4, -15, -1, -9, -2, -1, -9, 5, -3, -22, 9, 0, -22, 38, -38, 7, -5, -11, 4, -5, -5, 1, -24, 5, -12, 62};
    private static final int $$e = 4;
    private static final byte[] $$a = {114, -115, 48, 84, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 159;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private static int b = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 52
            int r0 = 53 - r6
            int r7 = r7 + 4
            int r8 = 103 - r8
            byte[] r1 = com.bpjstku.data.scholarship.model.request.Penerima.$$a
            byte[] r0 = new byte[r0]
            int r6 = 52 - r6
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2c:
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.scholarship.model.request.Penerima.a(byte, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.bpjstku.data.scholarship.model.request.Penerima.$$d
            int r6 = r6 * 3
            int r1 = r6 + 47
            int r7 = 107 - r7
            int r8 = r8 + 4
            byte[] r1 = new byte[r1]
            int r6 = r6 + 46
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r6
            r7 = r8
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r8 = r8 + 1
            r3 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r5
        L2c:
            int r3 = -r3
            int r8 = r8 + r3
            int r8 = r8 + (-4)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.scholarship.model.request.Penerima.d(int, int, short, java.lang.Object[]):void");
    }

    public Penerima(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17) {
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
        this.nikPenerima = str;
        this.namaPenerima = str2;
        this.tglLahirPenerima = str3;
        this.noUrutPenerima = str4;
        this.kodeKlaimPertama = str5;
        this.kodeKlaimAkhir = str6;
        this.besarManfaat = str7;
        this.flagDokLengkap = str8;
        this.flagMasihSekolah = str9;
        this.statusNaik = str10;
        this.tahunBeasiswa = str11;
        this.oldLembagaPendidikan = str12;
        this.oldJenjangPendidikan = str13;
        this.oldTingkatPendidikan = str14;
        this.lembagaPendidikan = str15;
        this.jenjangPendidikan = str16;
        this.tingkatPendidikan = str17;
    }

    public final String getNikPenerima() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.nikPenerima;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getNamaPenerima() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 81;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        String str = this.namaPenerima;
        int i5 = i3 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getTglLahirPenerima() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.tglLahirPenerima;
        int i4 = i2 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getNoUrutPenerima() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 7;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        String str = this.noUrutPenerima;
        int i5 = i3 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getKodeKlaimPertama() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.kodeKlaimPertama;
        int i4 = i2 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getKodeKlaimAkhir() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        String str = this.kodeKlaimAkhir;
        int i5 = i3 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getBesarManfaat() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 55;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.besarManfaat;
        int i4 = i3 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getFlagDokLengkap() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 87;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        String str = this.flagDokLengkap;
        int i5 = i3 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 95 / 0;
        }
        return str;
    }

    public final String getFlagMasihSekolah() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.flagMasihSekolah;
        int i5 = i2 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getStatusNaik() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.statusNaik;
        int i4 = i2 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getTahunBeasiswa() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.tahunBeasiswa;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getOldLembagaPendidikan() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.oldLembagaPendidikan;
        }
        throw null;
    }

    public final String getOldJenjangPendidikan() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.oldJenjangPendidikan;
        }
        throw null;
    }

    public final String getOldTingkatPendidikan() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.oldTingkatPendidikan;
        int i5 = i2 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getLembagaPendidikan() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.lembagaPendidikan;
        int i5 = i2 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getJenjangPendidikan() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.jenjangPendidikan;
        int i5 = i2 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 38 / 0;
        }
        return str;
    }

    public final String getTingkatPendidikan() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.tingkatPendidikan;
        int i4 = i2 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        int i3 = $11 + 79;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (abortcapture.b < cArrB.length) {
            int i5 = $11 + 51;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i7 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64837 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 1356 - Color.green(0), 38 - Color.blue(0), 894276454, false, $$g(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47774 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 467, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 12, 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
    }

    public final String component5() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
            int iAlpha = 876 - Color.alpha(0);
            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 10;
            byte b2 = $$a[5];
            byte b3 = (byte) (-b2);
            Object[] objArr2 = new Object[1];
            a(b2, b3, (byte) (b3 & 5), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(longPressTimeout, iAlpha, jumpTapTimeout, 252381699, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{2751, 58821, 2782, 13896, 64536, 23482, 63438, 35861, 17756, 50883, 44172, 15573, 38344, 38733, 7498, 60764, 58466, 10033, 52644, 40422, 13538, 63381, 48672, 20088, 34656, 33841}, 1 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{53266, 39793, 53367, 18686, 36900, 14211, 31583, 134, 40941, 47227, 49333, 45112, 20335, 59883, 28977, 25066, 16095, 22939, 41356}, 1 - View.resolveSize(0, 0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char longPressTimeout2 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
            int keyRepeatDelay = 876 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 10;
            byte[] bArr = $$a;
            Object[] objArr5 = new Object[1];
            a(bArr[7], (byte) (-bArr[5]), bArr[10], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(longPressTimeout2, keyRepeatDelay, iNormalizeMetaState, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                int threadPriority = 876 - ((Process.getThreadPriority(0) + 20) >> 6);
                int iBlue = Color.blue(0) + 10;
                byte[] bArr2 = $$a;
                byte b4 = bArr2[5];
                Object[] objArr6 = new Object[1];
                a(b4, (byte) (b4 | 50), bArr2[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, threadPriority, iBlue, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = 114271668 + (((~(294298943 | iIdentityHashCode)) | 237046336 | (~((-253988715) | iIdentityHashCode))) * (-744)) + (((~iIdentityHashCode) | 277356565) * 744) + ((iIdentityHashCode | (-237046337)) * 744) + 1911258687;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[1])[0] = i6 ^ (i6 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{32888, 61120, 32793, 15693, 39360, 15970, 49554, 47689, 53147, 52678, 51540, 2697, 7937, 40011, 30924, 56189, 28317, 11300, 43132, 43958, 48702, 64698, 56288, 30770, 3472, 36663, 2962, 51346, 23889, 24463}, '1' - AndroidCharacter.getMirror('0'), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{35649, 59644, 35618, 15210, 58180, 17648, 2516, 29199, 50344, 52221, 46038, 49824, 5161, 39543, 578, 4988, 25990, 10778, 53998, 25584, 46366, 64129}, -TextUtils.indexOf((CharSequence) "", '0', 0), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 37;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
                int i8 = i7 % 2;
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{35222, 27762, 35324, 49136, 6236, 49132, 24739, 7019, 50740, 20337, 18655, 44024, 5865, 7847, 63841, 31259, 26433, 44673, 10723, 2691}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{2512, 12884, 2489, 57811, 3794, 43377, 38942, 58329, 17960, 4434, 24151, 21330, 38528, 16590, 61404, 33463, 59191, 61628, 16255, 62006}, 1 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 1911258687};
                byte[] bArr3 = $$d;
                Object[] objArr13 = new Object[1];
                d(bArr3[38], bArr3[96], bArr3[7], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                d((byte) (-bArr3[52]), (byte) (-bArr3[133]), (short) ($$e | 50), objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
                    int i10 = i9 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cLastIndexOf2 = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0));
                        int touchSlop = 876 - (ViewConfiguration.getTouchSlop() >> 8);
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 10;
                        byte[] bArr4 = $$a;
                        byte b5 = bArr4[5];
                        Object[] objArr15 = new Object[1];
                        a(b5, (byte) (b5 | 50), bArr4[7], objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf2, touchSlop, pressedStateDuration, 256017550, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        c(new char[]{2751, 58821, 2782, 13896, 64536, 23482, 63438, 35861, 17756, 50883, 44172, 15573, 38344, 38733, 7498, 60764, 58466, 10033, 52644, 40422, 13538, 63381, 48672, 20088, 34656, 33841}, 1 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr16);
                        Class<?> cls5 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        c(new char[]{53266, 39793, 53367, 18686, 36900, 14211, 31583, 134, 40941, 47227, 49333, 45112, 20335, 59883, 28977, 25066, 16095, 22939, 41356}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr17);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                            int offsetBefore = 876 - TextUtils.getOffsetBefore("", 0);
                            int iMakeMeasureSpec = 10 - View.MeasureSpec.makeMeasureSpec(0, 0);
                            byte[] bArr5 = $$a;
                            Object[] objArr18 = new Object[1];
                            a(bArr5[7], (byte) (-bArr5[5]), bArr5[10], objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarSize, offsetBefore, iMakeMeasureSpec, 2009631821, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char scrollBarSize2 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                            int absoluteGravity = 876 - Gravity.getAbsoluteGravity(0, 0);
                            int keyRepeatDelay2 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 10;
                            byte b6 = $$a[5];
                            byte b7 = (byte) (-b6);
                            Object[] objArr19 = new Object[1];
                            a(b6, b7, (byte) (b7 & 5), objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollBarSize2, absoluteGravity, keyRepeatDelay2, 252381699, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i11 = ((int[]) objArr[2])[0];
        int i12 = ((int[]) objArr[0])[0];
        if (i12 == i11) {
            int i13 = ((int[]) objArr[1])[0];
            Object[] objArr20 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int i14 = ~new Random().nextInt(1982517691);
            int i15 = i13 + (((1213162868 + (((~(i14 | 532397695)) | (~((-436244515) | i14))) * (-184))) + (((68231705 | (~((-504476220) | i14))) | (~(464165990 | i14))) * 184)) - 842584472);
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            ((int[]) objArr20[1])[0] = i17 ^ (i17 << 5);
        } else {
            Toast.makeText((Context) null, i12 / (((i12 - 1) * i12) % 2), 0).show();
            int i18 = ((int[]) objArr[1])[0];
            Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i19 = i18 + (-1654871668) + (((~((-287842327) | iIdentityHashCode2)) | (~((-247532098) | iIdentityHashCode2))) * 69) + (((~(iIdentityHashCode2 | (-247667522))) | (~((-287977751) | iIdentityHashCode2)) | 135424) * (-69)) + 1704526152;
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArr21[1])[0] = i21 ^ (i21 << 5);
        }
        String str = this.kodeKlaimPertama;
        int i22 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i22 % 128;
        if (i22 % 2 == 0) {
            int i23 = 83 / 0;
        }
        return str;
    }

    public final int hashCode() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int iHashCode = ((this.nikPenerima.hashCode() * 31) + this.namaPenerima.hashCode()) * 31;
        String str = this.tglLahirPenerima;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
            int gidForName = 875 - Process.getGidForName("");
            int bitsPerPixel = 9 - ImageFormat.getBitsPerPixel(0);
            byte b2 = $$a[5];
            byte b3 = (byte) (-b2);
            Object[] objArr2 = new Object[1];
            a(b2, b3, (byte) (b3 & 5), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, gidForName, bitsPerPixel, 252381699, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{2751, 58821, 2782, 13896, 64536, 23482, 63438, 35861, 17756, 50883, 44172, 15573, 38344, 38733, 7498, 60764, 58466, 10033, 52644, 40422, 13538, 63381, 48672, 20088, 34656, 33841}, 1 - View.resolveSizeAndState(0, 0, 0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{53266, 39793, 53367, 18686, 36900, 14211, 31583, 134, 40941, 47227, 49333, 45112, 20335, 59883, 28977, 25066, 16095, 22939, 41356}, 1 - View.resolveSize(0, 0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
            int packedPositionGroup = 876 - ExpandableListView.getPackedPositionGroup(0L);
            int bitsPerPixel2 = 9 - ImageFormat.getBitsPerPixel(0);
            byte[] bArr = $$a;
            Object[] objArr5 = new Object[1];
            a(bArr[7], (byte) (-bArr[5]), bArr[10], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSizeAndState, packedPositionGroup, bitsPerPixel2, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 37;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cBlue = (char) Color.blue(0);
                int i4 = 876 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 10;
                byte[] bArr2 = $$a;
                byte b4 = bArr2[5];
                Object[] objArr6 = new Object[1];
                a(b4, (byte) (b4 | 50), bArr2[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cBlue, i4, maximumDrawingCacheSize, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iMyPid = Process.myPid();
            int i5 = ~iMyPid;
            int i6 = (~((-108814822) | i5)) | 68435968;
            int i7 = ~(iMyPid | 108883445);
            int i8 = (((1915000826 + ((i6 | i7) * (-713))) + (i7 * 1426)) + ((~(68504592 | i5)) * 713)) - 1888098321;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[1])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{32888, 61120, 32793, 15693, 39360, 15970, 49554, 47689, 53147, 52678, 51540, 2697, 7937, 40011, 30924, 56189, 28317, 11300, 43132, 43958, 48702, 64698, 56288, 30770, 3472, 36663, 2962, 51346, 23889, 24463}, -((byte) KeyEvent.getModifierMetaStateMask()), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{35649, 59644, 35618, 15210, 58180, 17648, 2516, 29199, 50344, 52221, 46038, 49824, 5161, 39543, 578, 4988, 25990, 10778, 53998, 25584, 46366, 64129}, -TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 27;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                if (i11 % 2 == 0) {
                    boolean z = applicationContext instanceof ContextWrapper;
                    throw null;
                }
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{35222, 27762, 35324, 49136, 6236, 49132, 24739, 7019, 50740, 20337, 18655, 44024, 5865, 7847, 63841, 31259, 26433, 44673, 10723, 2691}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{2512, 12884, 2489, 57811, 3794, 43377, 38942, 58329, 17960, 4434, 24151, 21330, 38528, 16590, 61404, 33463, 59191, 61628, 16255, 62006}, -((byte) KeyEvent.getModifierMetaStateMask()), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 79;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i12 % 128;
            int i13 = i12 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), -1888098321};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[96];
                byte b6 = bArr3[54];
                Object[] objArr13 = new Object[1];
                d(b5, b6, (short) (b6 | 98), objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                d((byte) (-bArr3[52]), (byte) (-bArr3[133]), (short) 152, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 89;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i14 % 128;
                    int i15 = i14 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c2 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
                        int i16 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 875;
                        int trimmedLength = 10 - TextUtils.getTrimmedLength("");
                        byte[] bArr4 = $$a;
                        byte b7 = bArr4[5];
                        Object[] objArr16 = new Object[1];
                        a(b7, (byte) (b7 | 50), bArr4[7], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, i16, trimmedLength, 256017550, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        c(new char[]{2751, 58821, 2782, 13896, 64536, 23482, 63438, 35861, 17756, 50883, 44172, 15573, 38344, 38733, 7498, 60764, 58466, 10033, 52644, 40422, 13538, 63381, 48672, 20088, 34656, 33841}, -TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        c(new char[]{53266, 39793, 53367, 18686, 36900, 14211, 31583, 134, 40941, 47227, 49333, 45112, 20335, 59883, 28977, 25066, 16095, 22939, 41356}, 1 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                            int i17 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 876;
                            int tapTimeout = 10 - (ViewConfiguration.getTapTimeout() >> 16);
                            byte[] bArr5 = $$a;
                            Object[] objArr19 = new Object[1];
                            a(bArr5[7], (byte) (-bArr5[5]), bArr5[10], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveOpacity, i17, tapTimeout, 2009631821, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            int i18 = 876 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            int iAxisFromString = 9 - MotionEvent.axisFromString("");
                            byte b8 = $$a[5];
                            byte b9 = (byte) (-b8);
                            Object[] objArr20 = new Object[1];
                            a(b8, b9, (byte) (b9 & 5), objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(doubleTapTimeout, i18, iAxisFromString, 252381699, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (((int[]) objArr[0])[0] != ((int[]) objArr[2])[0]) {
            throw null;
        }
        int i19 = ((int[]) objArr[1])[0];
        Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i20 = i19 + (((~(233021901 | iIdentityHashCode)) | (-497620592)) * 398) + 1335259448 + (((~((~iIdentityHashCode) | 233021901)) | (-497620592)) * 398);
        int i21 = (i20 << 13) ^ i20;
        int i22 = i21 ^ (i21 >>> 17);
        ((int[]) objArr21[1])[0] = i22 ^ (i22 << 5);
        int iHashCode2 = ((((((((((((iHashCode + str.hashCode()) * 31) + this.noUrutPenerima.hashCode()) * 31) + this.kodeKlaimPertama.hashCode()) * 31) + this.kodeKlaimAkhir.hashCode()) * 31) + this.besarManfaat.hashCode()) * 31) + this.flagDokLengkap.hashCode()) * 31) + this.flagMasihSekolah.hashCode();
        int i23 = ((int[]) objArr21[1])[0];
        int i24 = i23 * i23;
        int i25 = -(1362045443 * i23);
        int i26 = (i24 & i25) + (i24 | i25);
        int i27 = -(i23 * 1834637629);
        int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
        int i29 = (i28 & 796042240) + (796042240 | i28);
        int i30 = (((i29 >> 25) - 255) / 128) + 1;
        int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
        int i32 = i29 >> 15;
        int i33 = (((-262143) ^ i32) + ((i32 & (-262143)) << 1)) / 131072;
        int i34 = (-(((i33 & 1) + (i33 | 1)) ^ i31)) + 7;
        int i35 = i34 >> 17;
        int i36 = (((-65535) ^ i35) + ((i35 & (-65535)) << 1)) / 32768;
        int i37 = (i36 & 1) + (i36 | 1);
        return (((((((((((((((iHashCode2 * (389949 / ((i34 & (-((i37 & 1) + (i37 | 1)))) * 1797))) + this.statusNaik.hashCode()) * 31) + this.tahunBeasiswa.hashCode()) * 31) + this.oldLembagaPendidikan.hashCode()) * 31) + this.oldJenjangPendidikan.hashCode()) * 31) + this.oldTingkatPendidikan.hashCode()) * 31) + this.lembagaPendidikan.hashCode()) * 31) + this.jenjangPendidikan.hashCode()) * 31) + this.tingkatPendidikan.hashCode();
    }

    static {
        TuitionPaymentFragmentbindingInflater1 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int i = b + 35;
        TuitionPaymentFragmentbindingInflater1 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Penerima copy$default(Penerima penerima, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i, Object obj) {
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 103;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
            str18 = penerima.nikPenerima;
        } else {
            str18 = str;
        }
        if ((i & 2) != 0) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
            str19 = penerima.namaPenerima;
        } else {
            str19 = str2;
        }
        String str27 = (i & 4) != 0 ? penerima.tglLahirPenerima : str3;
        if ((i & 8) != 0) {
            str20 = penerima.noUrutPenerima;
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
            int i8 = i7 % 2;
        } else {
            str20 = str4;
        }
        String str28 = (i & 16) != 0 ? penerima.kodeKlaimPertama : str5;
        String str29 = (i & 32) != 0 ? penerima.kodeKlaimAkhir : str6;
        if ((i & 64) != 0) {
            int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
            int i10 = i9 % 2;
            str21 = penerima.besarManfaat;
        } else {
            str21 = str7;
        }
        Object obj2 = null;
        if ((i & 128) != 0) {
            int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 119;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
            if (i11 % 2 != 0) {
                String str30 = penerima.flagDokLengkap;
                obj2.hashCode();
                throw null;
            }
            str22 = penerima.flagDokLengkap;
        } else {
            str22 = str8;
        }
        String str31 = (i & 256) != 0 ? penerima.flagMasihSekolah : str9;
        String str32 = (i & 512) != 0 ? penerima.statusNaik : str10;
        if ((i & 1024) != 0) {
            int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 105;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i12 % 128;
            if (i12 % 2 != 0) {
                String str33 = penerima.tahunBeasiswa;
                throw null;
            }
            str23 = penerima.tahunBeasiswa;
        } else {
            str23 = str11;
        }
        String str34 = (i & 2048) != 0 ? penerima.oldLembagaPendidikan : str12;
        if ((i & 4096) != 0) {
            int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 107;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i13 % 128;
            if (i13 % 2 == 0) {
                String str35 = penerima.oldJenjangPendidikan;
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            str24 = penerima.oldJenjangPendidikan;
        } else {
            str24 = str13;
        }
        String str36 = (i & 8192) != 0 ? penerima.oldTingkatPendidikan : str14;
        String str37 = (i & 16384) != 0 ? penerima.lembagaPendidikan : str15;
        if ((i & 32768) != 0) {
            int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i14 % 128;
            if (i14 % 2 == 0) {
                String str38 = penerima.jenjangPendidikan;
                throw null;
            }
            str25 = penerima.jenjangPendidikan;
        } else {
            str25 = str16;
        }
        if ((i & 65536) != 0) {
            int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i15 % 128;
            int i16 = i15 % 2;
            str26 = penerima.tingkatPendidikan;
        } else {
            str26 = str17;
        }
        return penerima.copy(str18, str19, str27, str20, str28, str29, str21, str22, str31, str32, str23, str34, str24, str36, str37, str25, str26);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 57;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        String str = this.nikPenerima;
        int i5 = i3 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 28 / 0;
        }
        return str;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.statusNaik;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.tahunBeasiswa;
        if (i3 != 0) {
            int i4 = 3 / 0;
        }
        return str;
    }

    public final String component12() {
        String str;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 79;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        if (i2 % 2 != 0) {
            str = this.oldLembagaPendidikan;
            int i4 = 13 / 0;
        } else {
            str = this.oldLembagaPendidikan;
        }
        int i5 = i3 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component13() {
        String str;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        if (i2 % 2 != 0) {
            str = this.oldJenjangPendidikan;
            int i4 = 51 / 0;
        } else {
            str = this.oldJenjangPendidikan;
        }
        int i5 = i3 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component14() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        String str = this.oldTingkatPendidikan;
        int i5 = i3 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component15() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.lembagaPendidikan;
        }
        throw null;
    }

    public final String component16() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.jenjangPendidikan;
        if (i3 != 0) {
            int i4 = 64 / 0;
        }
        return str;
    }

    public final String component17() {
        String str;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        if (i2 % 2 == 0) {
            str = this.tingkatPendidikan;
            int i4 = 28 / 0;
        } else {
            str = this.tingkatPendidikan;
        }
        int i5 = i3 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 91;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.namaPenerima;
        int i4 = i3 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 61;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        String str = this.tglLahirPenerima;
        int i5 = i3 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 27 / 0;
        }
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 13;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        String str = this.noUrutPenerima;
        int i5 = i3 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.kodeKlaimAkhir;
        int i4 = i2 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component7() {
        String str;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.besarManfaat;
            int i4 = 52 / 0;
        } else {
            str = this.besarManfaat;
        }
        int i5 = i2 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.flagDokLengkap;
        int i5 = i2 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.flagMasihSekolah;
        }
        throw null;
    }

    public final Penerima copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10, String p11, String p12, String p13, String p14, String p15, String p16) {
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
        Intrinsics.checkNotNullParameter(p16, "");
        Penerima penerima = new Penerima(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        return penerima;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof Penerima)) {
            return false;
        }
        Penerima penerima = (Penerima) p0;
        if (!Intrinsics.areEqual(this.nikPenerima, penerima.nikPenerima)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.namaPenerima, penerima.namaPenerima)) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.tglLahirPenerima, penerima.tglLahirPenerima)) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.noUrutPenerima, penerima.noUrutPenerima)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.kodeKlaimPertama, penerima.kodeKlaimPertama)) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.kodeKlaimAkhir, penerima.kodeKlaimAkhir)) {
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 61;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.besarManfaat, penerima.besarManfaat)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.flagDokLengkap, penerima.flagDokLengkap)) {
            int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i10 = i9 + 111;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i10 % 128;
            int i11 = i10 % 2;
            int i12 = i9 + 99;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i12 % 128;
            if (i12 % 2 == 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!Intrinsics.areEqual(this.flagMasihSekolah, penerima.flagMasihSekolah) || (!Intrinsics.areEqual(this.statusNaik, penerima.statusNaik))) {
            return false;
        }
        if (!Intrinsics.areEqual(this.tahunBeasiswa, penerima.tahunBeasiswa)) {
            int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 41;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i13 % 128;
            int i14 = i13 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.oldLembagaPendidikan, penerima.oldLembagaPendidikan) || !Intrinsics.areEqual(this.oldJenjangPendidikan, penerima.oldJenjangPendidikan)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.oldTingkatPendidikan, penerima.oldTingkatPendidikan)) {
            int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i15 % 128;
            int i16 = i15 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.lembagaPendidikan, penerima.lembagaPendidikan)) {
            int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 61;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i17 % 128;
            int i18 = i17 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.jenjangPendidikan, penerima.jenjangPendidikan)) {
            return Intrinsics.areEqual(this.tingkatPendidikan, penerima.tingkatPendidikan);
        }
        int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i19 % 128;
        int i20 = i19 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.nikPenerima;
        String str2 = this.namaPenerima;
        String str3 = this.tglLahirPenerima;
        String str4 = this.noUrutPenerima;
        String str5 = this.kodeKlaimPertama;
        String str6 = this.kodeKlaimAkhir;
        String str7 = this.besarManfaat;
        String str8 = this.flagDokLengkap;
        String str9 = this.flagMasihSekolah;
        String str10 = this.statusNaik;
        String str11 = this.tahunBeasiswa;
        String str12 = this.oldLembagaPendidikan;
        String str13 = this.oldJenjangPendidikan;
        String str14 = this.oldTingkatPendidikan;
        String str15 = this.lembagaPendidikan;
        String str16 = this.jenjangPendidikan;
        String str17 = this.tingkatPendidikan;
        StringBuilder sb = new StringBuilder("Penerima(nikPenerima=");
        sb.append(str);
        sb.append(", namaPenerima=");
        sb.append(str2);
        sb.append(", tglLahirPenerima=");
        sb.append(str3);
        sb.append(", noUrutPenerima=");
        sb.append(str4);
        sb.append(", kodeKlaimPertama=");
        sb.append(str5);
        sb.append(", kodeKlaimAkhir=");
        sb.append(str6);
        sb.append(", besarManfaat=");
        sb.append(str7);
        sb.append(", flagDokLengkap=");
        sb.append(str8);
        sb.append(", flagMasihSekolah=");
        sb.append(str9);
        sb.append(", statusNaik=");
        sb.append(str10);
        sb.append(", tahunBeasiswa=");
        sb.append(str11);
        sb.append(", oldLembagaPendidikan=");
        sb.append(str12);
        sb.append(", oldJenjangPendidikan=");
        sb.append(str13);
        sb.append(", oldTingkatPendidikan=");
        sb.append(str14);
        sb.append(", lembagaPendidikan=");
        sb.append(str15);
        sb.append(", jenjangPendidikan=");
        sb.append(str16);
        sb.append(", tingkatPendidikan=");
        sb.append(str17);
        sb.append(")");
        String string = sb.toString();
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 6837720852205287813L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r5, byte r6, int r7) {
        /*
            int r5 = r5 * 4
            int r0 = 1 - r5
            int r6 = r6 * 2
            int r6 = 4 - r6
            int r7 = r7 * 4
            int r7 = 107 - r7
            byte[] r1 = com.bpjstku.data.scholarship.model.request.Penerima.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r5 = 0 - r5
            if (r1 != 0) goto L18
            r4 = r5
            r3 = r2
            goto L28
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L24:
            int r3 = r3 + 1
            r4 = r1[r6]
        L28:
            int r6 = r6 + 1
            int r7 = r7 + r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.scholarship.model.request.Penerima.$$g(int, byte, int):java.lang.String");
    }
}
