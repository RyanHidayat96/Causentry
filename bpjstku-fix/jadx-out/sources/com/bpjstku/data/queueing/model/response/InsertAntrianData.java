package com.bpjstku.data.queueing.model.response;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
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
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b+\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b*\b\u0087\b\u0018\u00002\u00020\u0001Bë\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0019J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0019J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0019J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0019J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0019J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0019J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u0019J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u0019J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u0019J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u0019J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u0019J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u0019Jô\u0001\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020.2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00102\u001a\u000201HÖ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b4\u0010\u0019R\u001c\u00105\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010\u0019R\u001c\u00108\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u00106\u001a\u0004\b9\u0010\u0019R\u001c\u0010:\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u00106\u001a\u0004\b;\u0010\u0019R\u001c\u0010<\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u00106\u001a\u0004\b=\u0010\u0019R\u001c\u0010>\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u00106\u001a\u0004\b?\u0010\u0019R\u001c\u0010@\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b@\u00106\u001a\u0004\bA\u0010\u0019R\u001c\u0010B\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u00106\u001a\u0004\bC\u0010\u0019R\u001c\u0010D\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bD\u00106\u001a\u0004\bE\u0010\u0019R\u001c\u0010F\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bF\u00106\u001a\u0004\bG\u0010\u0019R\u001c\u0010H\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bH\u00106\u001a\u0004\bI\u0010\u0019R\u001c\u0010J\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bJ\u00106\u001a\u0004\bK\u0010\u0019R\u001c\u0010L\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bL\u00106\u001a\u0004\bM\u0010\u0019R\u001c\u0010N\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bN\u00106\u001a\u0004\bO\u0010\u0019R\u001c\u0010P\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bP\u00106\u001a\u0004\bQ\u0010\u0019R\u001c\u0010R\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bR\u00106\u001a\u0004\bS\u0010\u0019R\u001c\u0010T\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bT\u00106\u001a\u0004\bU\u0010\u0019R\u001c\u0010V\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bV\u00106\u001a\u0004\bW\u0010\u0019R\u001c\u0010X\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bX\u00106\u001a\u0004\bY\u0010\u0019R\u001c\u0010Z\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bZ\u00106\u001a\u0004\b[\u0010\u0019"}, d2 = {"Lcom/bpjstku/data/queueing/model/response/InsertAntrianData;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "p16", "p17", "p18", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/queueing/model/response/InsertAntrianData;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "ret", "Ljava/lang/String;", "getRet", NotificationCompat.CATEGORY_MESSAGE, "getMsg", "tglBooking", "getTglBooking", "keteranganWaktu", "getKeteranganWaktu", "cekBankAktif", "getCekBankAktif", "shift", "getShift", "namaWilayah", "getNamaWilayah", "kodeKantor", "getKodeKantor", "waktuExpired", "getWaktuExpired", "kodeSegmen", "getKodeSegmen", "alamat", "getAlamat", "kodeProvinsi", "getKodeProvinsi", "retExp", "getRetExp", "kode", "getKode", "statusVcall", "getStatusVcall", "msgExp", "getMsgExp", "namaKantor", "getNamaKantor", "kodeWilayah", "getKodeWilayah", "kodeJenisAntrian", "getKodeJenisAntrian"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class InsertAntrianData {
    public static final int $stable = 0;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static short[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int asBinder;
    private static byte[] b;

    @SerializedName("alamat")
    private final String alamat;

    @SerializedName("cekBankAktif")
    private final String cekBankAktif;

    @SerializedName("keteranganWaktu")
    private final String keteranganWaktu;

    @SerializedName("kode")
    private final String kode;

    @SerializedName("kodeJenisAntrian")
    private final String kodeJenisAntrian;

    @SerializedName("kodeKantor")
    private final String kodeKantor;

    @SerializedName("kodeProvinsi")
    private final String kodeProvinsi;

    @SerializedName("kodeSegmen")
    private final String kodeSegmen;

    @SerializedName("kodeWilayah")
    private final String kodeWilayah;

    @SerializedName(NotificationCompat.CATEGORY_MESSAGE)
    private final String msg;

    @SerializedName("msgExp")
    private final String msgExp;

    @SerializedName("namaKantor")
    private final String namaKantor;

    @SerializedName("namaWilayah")
    private final String namaWilayah;

    @SerializedName("ret")
    private final String ret;

    @SerializedName("retExp")
    private final String retExp;

    @SerializedName("shift")
    private final String shift;

    @SerializedName("statusVcall")
    private final String statusVcall;

    @SerializedName("tglBooking")
    private final String tglBooking;

    @SerializedName("waktuExpired")
    private final String waktuExpired;
    private static final byte[] $$c = {5, -91, 77, 46};
    private static final int $$f = 167;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {123, -2, -101, -104, 10, -4, -65, 49, 13, -2, 1, -15, 4, 11, -22, 11, -70, 57, 3, 4, -17, 11, -6, -15, 9, -64, 17, 3, 29, -54, 71, -41, -17, 5, -41, 27, 3, 25, -50, 70, -40, -17, 5, 31, -14, 9, -13, 4, -3, -32, 15, 22, -14, -10, 7, 4, -48, 42, -19, 4, 4, -10, 7, 4, -3, -5, -13, -4, 4, -10, 9, -5, 3, -4, -5, 3, -11, -3, 16, -15, -6, 16, -44, 32, -13, -1, 5, -10, -1, -1, -7, 18, -11, 6, -69};
    private static final int $$e = 19;
    private static final byte[] $$a = {8, -36, 87, -65, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
    private static final int $$b = 87;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f402a = 0;
    private static int asInterface = 1;
    private static int d = 1;

    private static void c(byte b2, byte b3, int i, Object[] objArr) {
        int i2 = 98 - (b3 * 14);
        int i3 = 55 - (b2 * 52);
        byte[] bArr = $$a;
        int i4 = i * 52;
        byte[] bArr2 = new byte[53 - i4];
        int i5 = 52 - i4;
        int i6 = -1;
        if (bArr == null) {
            i2 = (i3 + (-i2)) - 11;
            i3 = i3;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i2;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i7 = i3 + 1;
            i2 = (i2 + (-bArr[i7])) - 11;
            i3 = i7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(int r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.bpjstku.data.queueing.model.response.InsertAntrianData.$$d
            int r5 = r5 * 39
            int r5 = r5 + 4
            int r7 = r7 * 15
            int r7 = 99 - r7
            int r6 = r6 * 13
            int r1 = 53 - r6
            byte[] r1 = new byte[r1]
            int r6 = 52 - r6
            r2 = 0
            if (r0 != 0) goto L19
            r4 = r5
            r7 = r6
            r3 = r2
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r5]
        L2b:
            int r5 = r5 + 1
            int r7 = r7 + r4
            int r7 = r7 + 2
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.queueing.model.response.InsertAntrianData.f(int, byte, byte, java.lang.Object[]):void");
    }

    public InsertAntrianData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19) {
        this.ret = str;
        this.msg = str2;
        this.tglBooking = str3;
        this.keteranganWaktu = str4;
        this.cekBankAktif = str5;
        this.shift = str6;
        this.namaWilayah = str7;
        this.kodeKantor = str8;
        this.waktuExpired = str9;
        this.kodeSegmen = str10;
        this.alamat = str11;
        this.kodeProvinsi = str12;
        this.retExp = str13;
        this.kode = str14;
        this.statusVcall = str15;
        this.msgExp = str16;
        this.namaKantor = str17;
        this.kodeWilayah = str18;
        this.kodeJenisAntrian = str19;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ InsertAntrianData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        String str28 = (i & 1) != 0 ? null : str;
        String str29 = (i & 2) != 0 ? null : str2;
        if ((i & 4) != 0) {
            int i2 = 2 % 2;
            str20 = null;
        } else {
            str20 = str3;
        }
        if ((i & 8) != 0) {
            int i3 = f402a + 73;
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i4 = 2 % 2;
            str21 = null;
        } else {
            str21 = str4;
        }
        if ((i & 16) != 0) {
            int i5 = 2 % 2;
            str22 = null;
        } else {
            str22 = str5;
        }
        if ((i & 32) != 0) {
            int i6 = asInterface + 97;
            f402a = i6 % 128;
            int i7 = i6 % 2;
            str23 = null;
        } else {
            str23 = str6;
        }
        String str30 = (i & 64) != 0 ? null : str7;
        String str31 = (i & 128) != 0 ? null : str8;
        if ((i & 256) != 0) {
            int i8 = f402a + 85;
            asInterface = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            str24 = null;
        } else {
            str24 = str9;
        }
        if ((i & 512) != 0) {
            int i11 = 2 % 2;
            str25 = null;
        } else {
            str25 = str10;
        }
        String str32 = (i & 1024) != 0 ? null : str11;
        String str33 = (i & 2048) != 0 ? null : str12;
        String str34 = (i & 4096) != 0 ? null : str13;
        String str35 = (i & 8192) != 0 ? null : str14;
        String str36 = (i & 16384) != 0 ? null : str15;
        if ((i & 32768) != 0) {
            int i12 = f402a + 113;
            asInterface = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 36 / 0;
            }
            str26 = null;
        } else {
            str26 = str16;
        }
        String str37 = (65536 & i) != 0 ? null : str17;
        if ((i & 131072) != 0) {
            int i14 = f402a + 39;
            asInterface = i14 % 128;
            int i15 = i14 % 2;
            str27 = null;
        } else {
            str27 = str18;
        }
        this(str28, str29, str20, str21, str22, str23, str30, str31, str24, str25, str32, str33, str34, str35, str36, str26, str37, str27, (i & 262144) != 0 ? null : str19);
    }

    public final String getRet() {
        int i = 2 % 2;
        int i2 = f402a;
        int i3 = i2 + 21;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ret;
        int i5 = i2 + 119;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getMsg() {
        int i = 2 % 2;
        int i2 = f402a + 7;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        String str = this.msg;
        int i5 = i3 + 75;
        f402a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getTglBooking() {
        int i = 2 % 2;
        int i2 = f402a + 37;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return this.tglBooking;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getKeteranganWaktu() {
        int i = 2 % 2;
        int i2 = asInterface + 17;
        int i3 = i2 % 128;
        f402a = i3;
        int i4 = i2 % 2;
        String str = this.keteranganWaktu;
        int i5 = i3 + 119;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getCekBankAktif() {
        int i = 2 % 2;
        int i2 = f402a + 63;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return this.cekBankAktif;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getShift() {
        int i = 2 % 2;
        int i2 = f402a + 17;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        String str = this.shift;
        int i5 = i3 + 21;
        f402a = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getNamaWilayah() {
        int i = 2 % 2;
        int i2 = f402a;
        int i3 = i2 + 85;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        String str = this.namaWilayah;
        int i5 = i2 + 79;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getKodeKantor() {
        int i = 2 % 2;
        int i2 = asInterface + 73;
        f402a = i2 % 128;
        int i3 = i2 % 2;
        String str = this.kodeKantor;
        if (i3 != 0) {
            int i4 = 47 / 0;
        }
        return str;
    }

    public final String getWaktuExpired() {
        int i = 2 % 2;
        int i2 = f402a + 89;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        String str = this.waktuExpired;
        int i5 = i3 + 41;
        f402a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getKodeSegmen() {
        int i = 2 % 2;
        int i2 = f402a;
        int i3 = i2 + 47;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        String str = this.kodeSegmen;
        int i5 = i2 + 113;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 14 / 0;
        }
        return str;
    }

    public final String getAlamat() {
        int i = 2 % 2;
        int i2 = asInterface + 123;
        int i3 = i2 % 128;
        f402a = i3;
        int i4 = i2 % 2;
        String str = this.alamat;
        int i5 = i3 + 59;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getKodeProvinsi() {
        int i = 2 % 2;
        int i2 = asInterface + 95;
        int i3 = i2 % 128;
        f402a = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.kodeProvinsi;
        int i4 = i3 + 123;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getRetExp() {
        String str;
        int i = 2 % 2;
        int i2 = f402a + 107;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 == 0) {
            str = this.retExp;
            int i4 = 45 / 0;
        } else {
            str = this.retExp;
        }
        int i5 = i3 + 73;
        f402a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getKode() {
        int i = 2 % 2;
        int i2 = f402a + 109;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return this.kode;
        }
        throw null;
    }

    public final String getStatusVcall() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 55;
        f402a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.statusVcall;
        int i5 = i2 + 15;
        f402a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getMsgExp() {
        String str;
        int i = 2 % 2;
        int i2 = f402a;
        int i3 = i2 + 39;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.msgExp;
            int i4 = 86 / 0;
        } else {
            str = this.msgExp;
        }
        int i5 = i2 + 121;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getNamaKantor() {
        String str;
        int i = 2 % 2;
        int i2 = f402a;
        int i3 = i2 + 35;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.namaKantor;
            int i4 = 20 / 0;
        } else {
            str = this.namaKantor;
        }
        int i5 = i2 + 89;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getKodeWilayah() {
        int i = 2 % 2;
        int i2 = asInterface + 97;
        int i3 = i2 % 128;
        f402a = i3;
        int i4 = i2 % 2;
        String str = this.kodeWilayah;
        int i5 = i3 + 47;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getKodeJenisAntrian() {
        int i = 2 % 2;
        int i2 = f402a + 43;
        int i3 = i2 % 128;
        asInterface = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.kodeJenisAntrian;
        int i4 = i3 + 21;
        f402a = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    private static void e(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        int i4;
        boolean z;
        int i5 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b3 = (byte) 0;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ('0' - AndroidCharacter.getMirror('0')), 2267 - Color.argb(0, 0, 0, 0), 33 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1387473586, false, $$g(b3, b3, (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            int i6 = iIntValue == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = b;
                if (bArr != null) {
                    int i7 = $10 + 119;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i9 = 0; i9 < length; i9++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Process.myPid() >> 22), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 3358, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 18, -1054011043, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                        }
                        bArr2[i9] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = b;
                    Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 2268 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), Drawable.resolveOpacity(0, 0) + 33, 1387473586, false, $$g(b6, b6, (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L)));
                    i4 = 2;
                } else {
                    iIntValue = (short) (((short) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3[i3 + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L)));
                    int i10 = $11 + 5;
                    $10 = i10 % 128;
                    i4 = 2;
                    int i11 = i10 % 2;
                }
            } else {
                i4 = 2;
            }
            if (iIntValue > 0) {
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - i4) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)) + i6;
                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (55904 - TextUtils.getOffsetBefore("", 0)), (ViewConfiguration.getLongPressTimeout() >> 16) + 2855, 13 - (ViewConfiguration.getFadingEdgeLength() >> 16), -1529949196, false, $$g(b7, b8, (byte) (b8 + 3)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = b;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i12 = 0;
                    while (i12 < length2) {
                        int i13 = $10 + 65;
                        $11 = i13 % 128;
                        if (i13 % 2 == 0) {
                            bArr5[i12] = (byte) (((long) bArr4[i12]) ^ 3046761265686732006L);
                        } else {
                            bArr5[i12] = (byte) (((long) bArr4[i12]) ^ 3046761265686732006L);
                            i12++;
                        }
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i14 = $10 + 27;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                    z = true;
                } else {
                    z = false;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    if (z) {
                        byte[] bArr6 = b;
                        int i16 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i16 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i16]) ^ 3046761265686732006L)) + s)) ^ b2));
                    } else {
                        short[] sArr = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i17 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i17 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i17]) ^ 3046761265686732006L)) + s)) ^ b2));
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                    int i18 = $11 + 69;
                    $10 = i18 % 128;
                    int i19 = i18 % 2;
                }
            }
            objArr[0] = sb.toString();
            int i20 = $10 + 83;
            $11 = i20 % 128;
            int i21 = i20 % 2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public final String component12() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        String str = this.kodeProvinsi;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char fadingEdgeLength = (char) (37567 - (ViewConfiguration.getFadingEdgeLength() >> 16));
            int iKeyCodeFromString = 625 - KeyEvent.keyCodeFromString("");
            int maximumDrawingCacheSize = 14 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            byte[] bArr = $$a;
            byte b2 = bArr[5];
            Object[] objArr2 = new Object[1];
            c(b2, bArr[7], b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(fadingEdgeLength, iKeyCodeFromString, maximumDrawingCacheSize, -477065106, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e((-944258681) - KeyEvent.getDeadChar(0, 0), TextUtils.lastIndexOf("", '0', 0) - 2, (short) (Color.red(0) + 42), (byte) ((-9) - Color.alpha(0)), View.resolveSize(0, 0) - 1524955362, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e((ViewConfiguration.getFadingEdgeLength() >> 16) - 944258677, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 10, (short) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31), (byte) ((-103) - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (-1524955341) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char absoluteGravity = (char) (Gravity.getAbsoluteGravity(0, 0) + 37567);
            int threadPriority = 625 - ((Process.getThreadPriority(0) + 20) >> 6);
            int i2 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 14;
            byte[] bArr2 = $$a;
            byte b3 = bArr2[5];
            Object[] objArr5 = new Object[1];
            c(b3, b3, bArr2[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(absoluteGravity, threadPriority, i2, -976899241, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = f402a + 55;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char trimmedLength = (char) (37567 - TextUtils.getTrimmedLength(""));
                int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 626;
                int i5 = 13 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                byte[] bArr3 = $$a;
                byte b4 = bArr3[7];
                Object[] objArr6 = new Object[1];
                c(b4, bArr3[5], b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(trimmedLength, iLastIndexOf, i5, -973632554, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i6 = ((int[]) objArr7[2])[0];
            int i7 = ((int[]) objArr7[0])[0];
            String[] strArr = (String[]) objArr7[3];
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i8 = (((((~((-1646510305) | iMaxMemory)) | 12308) * 449) + 1263933952) + (((~((~iMaxMemory) | (-1646510305))) | 12308) * 449)) - 1706932863;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[1])[0] = i10 ^ (i10 << 5);
            objArr = new Object[]{new int[]{i7}, new int[1], new int[]{i6}, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            e((-944258681) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -TextUtils.indexOf((CharSequence) "", '0'), (short) ((-90) - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), (byte) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 11), (-1524955327) - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(Color.blue(0) - 944258679, KeyEvent.normalizeMetaState(0) - 7, (short) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 103), (byte) (TextUtils.indexOf("", "", 0, 0) + 58), TextUtils.getOffsetBefore("", 0) - 1524955302, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            e((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 944258671, (-10) - TextUtils.lastIndexOf("", '0', 0), (short) (Color.argb(0, 0, 0, 0) - 117), (byte) (67 - (ViewConfiguration.getScrollBarSize() >> 8)), (-1524955285) - (ViewConfiguration.getPressedStateDuration() >> 16), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(Color.blue(0) - 944258673, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 10, (short) (ImageFormat.getBitsPerPixel(0) - 84), (byte) (View.combineMeasuredStates(0, 0) + 45), (-1524955270) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr12 = new Object[1];
            e((-944258728) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 39 - (ViewConfiguration.getScrollBarSize() >> 8), (short) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 90), (byte) (115 - Process.getGidForName("")), (-1524955255) - (ViewConfiguration.getLongPressTimeout() >> 16), objArr12);
            String str2 = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            e((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 944258680, TextUtils.indexOf("", "") + 39, (short) (48 - View.MeasureSpec.getMode(0)), (byte) (View.getDefaultSize(0, 0) - 29), TextUtils.lastIndexOf("", '0') - 1524955191, objArr13);
            try {
                Object[] objArr14 = {applicationContext, new String[]{str2, (String) objArr13[0]}, Integer.valueOf(iIntValue), 17, -1706932863};
                byte[] bArr4 = $$d;
                byte b5 = bArr4[10];
                byte b6 = (byte) (b5 - 1);
                byte b7 = b5;
                Object[] objArr15 = new Object[1];
                f(b6, b7, (byte) (b7 - 1), objArr15);
                Class<?> cls4 = Class.forName((String) objArr15[0]);
                byte b8 = bArr4[10];
                byte b9 = b8;
                Object[] objArr16 = new Object[1];
                f(b9, (byte) (b9 - 1), b8, objArr16);
                objArr = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                int i11 = ((int[]) objArr[0])[0];
                int i12 = ((int[]) objArr[2])[0];
                if (applicationContext != null) {
                    int i13 = asInterface + 39;
                    f402a = i13 % 128;
                    int i14 = i13 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cMyPid = (char) ((Process.myPid() >> 22) + 37567);
                        int i15 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 624;
                        int i16 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 13;
                        byte[] bArr5 = $$a;
                        byte b10 = bArr5[7];
                        Object[] objArr17 = new Object[1];
                        c(b10, bArr5[5], b10, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMyPid, i15, i16, -973632554, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr18 = new Object[1];
                        e((-944258681) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (-3) - Drawable.resolveOpacity(0, 0), (short) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 42), (byte) ((-9) - TextUtils.getTrimmedLength("")), (-1524955363) - TextUtils.lastIndexOf("", '0'), objArr18);
                        Class<?> cls5 = Class.forName((String) objArr18[0]);
                        Object[] objArr19 = new Object[1];
                        e((-944258678) - MotionEvent.axisFromString(""), (-10) - TextUtils.indexOf("", "", 0, 0), (short) (TextUtils.lastIndexOf("", '0') + 32), (byte) ((-103) - KeyEvent.normalizeMetaState(0)), (ViewConfiguration.getDoubleTapTimeout() >> 16) - 1524955341, objArr19);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char keyRepeatTimeout = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 37567);
                            int gidForName = 624 - Process.getGidForName("");
                            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 14;
                            byte[] bArr6 = $$a;
                            byte b11 = bArr6[5];
                            Object[] objArr20 = new Object[1];
                            c(b11, b11, bArr6[7], objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(keyRepeatTimeout, gidForName, packedPositionGroup, -976899241, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 37567);
                            int iMyTid = (Process.myTid() >> 22) + 625;
                            int threadPriority2 = 14 - ((Process.getThreadPriority(0) + 20) >> 6);
                            byte[] bArr7 = $$a;
                            byte b12 = bArr7[5];
                            Object[] objArr21 = new Object[1];
                            c(b12, bArr7[7], b12, objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMakeMeasureSpec, iMyTid, threadPriority2, -477065106, false, (String) objArr21[0], null);
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
        int i17 = ((int[]) objArr[0])[0];
        int i18 = ((int[]) objArr[2])[0];
        if (i18 == i17) {
            int i19 = ((int[]) objArr[1])[0];
            int i20 = ((int[]) objArr[2])[0];
            int i21 = ((int[]) objArr[0])[0];
            String[] strArr2 = (String[]) objArr[3];
            int iIdentityHashCode = System.identityHashCode(this);
            int i22 = i19 + (-300688064) + (((~((-851862702) | iIdentityHashCode)) | 818160649) * 345) + (((~((-851862702) | (~iIdentityHashCode))) | 153714770) * 345) + ((~(iIdentityHashCode | (-818160650))) * 345);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr[1])[0] = i24 ^ (i24 << 5);
            Object[] objArr22 = {new int[]{i21}, new int[1], new int[]{i20}, strArr2};
            return str;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr3 = (String[]) objArr[3];
        if (strArr3 != null) {
            int i25 = f402a + 15;
            asInterface = i25 % 128;
            int i26 = i25 % 2;
            int i27 = 0;
            while (i27 < strArr3.length) {
                arrayList.add(strArr3[i27]);
                i27++;
                int i28 = asInterface + 65;
                f402a = i28 % 128;
                int i29 = i28 % 2;
            }
        }
        Toast.makeText((Context) null, i18 / (((i18 - 1) * i18) % 2), 0).show();
        int i30 = ((int[]) objArr[1])[0];
        int i31 = ((int[]) objArr[2])[0];
        int i32 = ((int[]) objArr[0])[0];
        String[] strArr4 = (String[]) objArr[3];
        int i33 = ~Process.myTid();
        int i34 = i30 + (((1263373128 + (((~(i33 | (-4371621))) | (~((-33636931) | i33))) * (-184))) + (((892864785 | (~((-926501716) | i33))) | (~((-897236406) | i33))) * 184)) - 517998200);
        int i35 = (i34 << 13) ^ i34;
        int i36 = i35 ^ (i35 >>> 17);
        ((int[]) objArr[1])[0] = i36 ^ (i36 << 5);
        Object[] objArr23 = {new int[]{i32}, new int[1], new int[]{i31}, strArr4};
        return str;
    }

    static {
        asBinder = 0;
        b();
        int i = d + 95;
        asBinder = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public InsertAntrianData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
    }

    public static /* synthetic */ InsertAntrianData copy$default(InsertAntrianData insertAntrianData, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, int i, Object obj) {
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = asInterface + 121;
            f402a = i3 % 128;
            int i4 = i3 % 2;
            str20 = insertAntrianData.ret;
        } else {
            str20 = str;
        }
        String str27 = (i & 2) != 0 ? insertAntrianData.msg : str2;
        if ((i & 4) != 0) {
            int i5 = asInterface + 11;
            f402a = i5 % 128;
            int i6 = i5 % 2;
            str21 = insertAntrianData.tglBooking;
        } else {
            str21 = str3;
        }
        String str28 = (i & 8) != 0 ? insertAntrianData.keteranganWaktu : str4;
        String str29 = (i & 16) != 0 ? insertAntrianData.cekBankAktif : str5;
        Object obj2 = null;
        if ((i & 32) != 0) {
            int i7 = f402a + 85;
            asInterface = i7 % 128;
            if (i7 % 2 == 0) {
                String str30 = insertAntrianData.shift;
                throw null;
            }
            str22 = insertAntrianData.shift;
        } else {
            str22 = str6;
        }
        String str31 = (i & 64) != 0 ? insertAntrianData.namaWilayah : str7;
        String str32 = (i & 128) != 0 ? insertAntrianData.kodeKantor : str8;
        String str33 = (i & 256) != 0 ? insertAntrianData.waktuExpired : str9;
        if ((i & 512) != 0) {
            int i8 = asInterface + 65;
            f402a = i8 % 128;
            if (i8 % 2 != 0) {
                String str34 = insertAntrianData.kodeSegmen;
                obj2.hashCode();
                throw null;
            }
            str23 = insertAntrianData.kodeSegmen;
        } else {
            str23 = str10;
        }
        if ((i & 1024) != 0) {
            int i9 = asInterface + 75;
            f402a = i9 % 128;
            if (i9 % 2 != 0) {
                String str35 = insertAntrianData.alamat;
                throw null;
            }
            str24 = insertAntrianData.alamat;
        } else {
            str24 = str11;
        }
        String str36 = (i & 2048) != 0 ? insertAntrianData.kodeProvinsi : str12;
        if ((i & 4096) != 0) {
            int i10 = asInterface + 77;
            f402a = i10 % 128;
            if (i10 % 2 != 0) {
                String str37 = insertAntrianData.retExp;
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            str25 = insertAntrianData.retExp;
        } else {
            str25 = str13;
        }
        if ((i & 8192) != 0) {
            int i11 = asInterface + 51;
            f402a = i11 % 128;
            int i12 = i11 % 2;
            str26 = insertAntrianData.kode;
        } else {
            str26 = str14;
        }
        return insertAntrianData.copy(str20, str27, str21, str28, str29, str22, str31, str32, str33, str23, str24, str36, str25, str26, (i & 16384) != 0 ? insertAntrianData.statusVcall : str15, (32768 & i) != 0 ? insertAntrianData.msgExp : str16, (i & 65536) != 0 ? insertAntrianData.namaKantor : str17, (i & 131072) != 0 ? insertAntrianData.kodeWilayah : str18, (i & 262144) != 0 ? insertAntrianData.kodeJenisAntrian : str19);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 97;
        f402a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ret;
        int i5 = i2 + 121;
        f402a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = f402a + 115;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        String str = this.kodeSegmen;
        int i5 = i3 + 75;
        f402a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = f402a;
        int i3 = i2 + 63;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        String str = this.alamat;
        int i5 = i2 + 105;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component13() {
        String str;
        int i = 2 % 2;
        int i2 = f402a + 93;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 == 0) {
            str = this.retExp;
            int i4 = 92 / 0;
        } else {
            str = this.retExp;
        }
        int i5 = i3 + 79;
        f402a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component14() {
        int i = 2 % 2;
        int i2 = f402a + 53;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        String str = this.kode;
        int i5 = i3 + 21;
        f402a = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component15() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 61;
        f402a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.statusVcall;
        int i5 = i2 + 17;
        f402a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component16() {
        int i = 2 % 2;
        int i2 = f402a + 71;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        String str = this.msgExp;
        int i5 = i3 + 45;
        f402a = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component17() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 81;
        f402a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.namaKantor;
        int i5 = i2 + 33;
        f402a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component18() {
        int i = 2 % 2;
        int i2 = asInterface + 11;
        int i3 = i2 % 128;
        f402a = i3;
        int i4 = i2 % 2;
        String str = this.kodeWilayah;
        int i5 = i3 + 23;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 99 / 0;
        }
        return str;
    }

    public final String component19() {
        int i = 2 % 2;
        int i2 = f402a + 89;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        String str = this.kodeJenisAntrian;
        int i5 = i3 + 73;
        f402a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 69 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = asInterface + 33;
        int i3 = i2 % 128;
        f402a = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.msg;
        int i4 = i3 + 81;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = asInterface + 55;
        int i3 = i2 % 128;
        f402a = i3;
        int i4 = i2 % 2;
        String str = this.tglBooking;
        int i5 = i3 + 13;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = asInterface + 69;
        int i3 = i2 % 128;
        f402a = i3;
        int i4 = i2 % 2;
        String str = this.keteranganWaktu;
        int i5 = i3 + 123;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = f402a + 123;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        String str = this.cekBankAktif;
        int i5 = i3 + 47;
        f402a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = f402a + 85;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        String str = this.shift;
        int i5 = i3 + 11;
        f402a = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = f402a + 43;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return this.namaWilayah;
        }
        throw null;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = asInterface + 49;
        int i3 = i2 % 128;
        f402a = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.kodeKantor;
        int i4 = i3 + 109;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 91 / 0;
        }
        return str;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = f402a + 73;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        String str = this.waktuExpired;
        if (i3 == 0) {
            int i4 = 4 / 0;
        }
        return str;
    }

    public final InsertAntrianData copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10, String p11, String p12, String p13, String p14, String p15, String p16, String p17, String p18) {
        int i = 2 % 2;
        InsertAntrianData insertAntrianData = new InsertAntrianData(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18);
        int i2 = asInterface + 67;
        f402a = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 49 / 0;
        }
        return insertAntrianData;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            return true;
        }
        if (!(!(p0 instanceof InsertAntrianData))) {
            InsertAntrianData insertAntrianData = (InsertAntrianData) p0;
            if (!Intrinsics.areEqual(this.ret, insertAntrianData.ret) || !Intrinsics.areEqual(this.msg, insertAntrianData.msg)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.tglBooking, insertAntrianData.tglBooking)) {
                int i2 = asInterface + 35;
                int i3 = i2 % 128;
                f402a = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 103;
                asInterface = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 15 / 0;
                }
                return false;
            }
            if (!Intrinsics.areEqual(this.keteranganWaktu, insertAntrianData.keteranganWaktu)) {
                int i7 = asInterface + 49;
                f402a = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.cekBankAktif, insertAntrianData.cekBankAktif)) {
                int i9 = asInterface + 37;
                f402a = i9 % 128;
                int i10 = i9 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.shift, insertAntrianData.shift) && Intrinsics.areEqual(this.namaWilayah, insertAntrianData.namaWilayah) && Intrinsics.areEqual(this.kodeKantor, insertAntrianData.kodeKantor) && Intrinsics.areEqual(this.waktuExpired, insertAntrianData.waktuExpired) && Intrinsics.areEqual(this.kodeSegmen, insertAntrianData.kodeSegmen)) {
                if (!Intrinsics.areEqual(this.alamat, insertAntrianData.alamat)) {
                    int i11 = asInterface + 101;
                    f402a = i11 % 128;
                    int i12 = i11 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.kodeProvinsi, insertAntrianData.kodeProvinsi)) {
                    int i13 = f402a + 89;
                    asInterface = i13 % 128;
                    return i13 % 2 == 0;
                }
                if (!Intrinsics.areEqual(this.retExp, insertAntrianData.retExp)) {
                    int i14 = asInterface + 121;
                    f402a = i14 % 128;
                    int i15 = i14 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.kode, insertAntrianData.kode) || !Intrinsics.areEqual(this.statusVcall, insertAntrianData.statusVcall) || !Intrinsics.areEqual(this.msgExp, insertAntrianData.msgExp) || !Intrinsics.areEqual(this.namaKantor, insertAntrianData.namaKantor) || !Intrinsics.areEqual(this.kodeWilayah, insertAntrianData.kodeWilayah)) {
                    return false;
                }
                if (Intrinsics.areEqual(this.kodeJenisAntrian, insertAntrianData.kodeJenisAntrian)) {
                    return true;
                }
                int i16 = asInterface + 65;
                f402a = i16 % 128;
                return i16 % 2 != 0;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str;
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int iHashCode6;
        int iHashCode7;
        int i;
        int iHashCode8;
        int i2 = 2 % 2;
        int i3 = asInterface + 67;
        f402a = i3 % 128;
        int iHashCode9 = (i3 % 2 == 0 ? (str = this.ret) != null : (str = this.ret) != null) ? str.hashCode() : 0;
        String str2 = this.msg;
        int iHashCode10 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.tglBooking;
        if (str3 == null) {
            int i4 = f402a + 17;
            asInterface = i4 % 128;
            iHashCode = i4 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str3.hashCode();
        }
        String str4 = this.keteranganWaktu;
        if (str4 == null) {
            int i5 = f402a + 17;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str4.hashCode();
        }
        String str5 = this.cekBankAktif;
        if (str5 == null) {
            iHashCode3 = 0;
        } else {
            iHashCode3 = str5.hashCode();
            int i7 = asInterface + 21;
            f402a = i7 % 128;
            int i8 = i7 % 2;
        }
        String str6 = this.shift;
        int iHashCode11 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.namaWilayah;
        int iHashCode12 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.kodeKantor;
        if (str8 == null) {
            int i9 = f402a;
            int i10 = i9 + 117;
            asInterface = i10 % 128;
            iHashCode4 = i10 % 2 != 0 ? 0 : 1;
            int i11 = i9 + 105;
            asInterface = i11 % 128;
            int i12 = i11 % 2;
        } else {
            iHashCode4 = str8.hashCode();
        }
        String str9 = this.waktuExpired;
        int iHashCode13 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.kodeSegmen;
        int iHashCode14 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.alamat;
        if (str11 == null) {
            int i13 = f402a + 41;
            asInterface = i13 % 128;
            int i14 = i13 % 2;
            iHashCode5 = 0;
        } else {
            iHashCode5 = str11.hashCode();
        }
        String str12 = this.kodeProvinsi;
        int iHashCode15 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.retExp;
        if (str13 == null) {
            int i15 = f402a + 47;
            asInterface = i15 % 128;
            int i16 = i15 % 2;
            iHashCode6 = 0;
        } else {
            iHashCode6 = str13.hashCode();
        }
        String str14 = this.kode;
        int iHashCode16 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.statusVcall;
        int iHashCode17 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.msgExp;
        int iHashCode18 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.namaKantor;
        if (str17 == null) {
            int i17 = f402a + 87;
            asInterface = i17 % 128;
            int i18 = i17 % 2;
            iHashCode7 = 0;
        } else {
            iHashCode7 = str17.hashCode();
        }
        String str18 = this.kodeWilayah;
        int iHashCode19 = str18 == null ? 0 : str18.hashCode();
        String str19 = this.kodeJenisAntrian;
        if (str19 != null) {
            int i19 = asInterface + 83;
            i = iHashCode7;
            f402a = i19 % 128;
            if (i19 % 2 != 0) {
                iHashCode8 = str19.hashCode();
                int i20 = 94 / 0;
            } else {
                iHashCode8 = str19.hashCode();
            }
        } else {
            i = iHashCode7;
            iHashCode8 = 0;
        }
        return (((((((((((((((((((((((((((((((((((iHashCode9 * 31) + iHashCode10) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode4) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode5) * 31) + iHashCode15) * 31) + iHashCode6) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + i) * 31) + iHashCode19) * 31) + iHashCode8;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.ret;
        String str2 = this.msg;
        String str3 = this.tglBooking;
        String str4 = this.keteranganWaktu;
        String str5 = this.cekBankAktif;
        String str6 = this.shift;
        String str7 = this.namaWilayah;
        String str8 = this.kodeKantor;
        String str9 = this.waktuExpired;
        String str10 = this.kodeSegmen;
        String str11 = this.alamat;
        String str12 = this.kodeProvinsi;
        String str13 = this.retExp;
        String str14 = this.kode;
        String str15 = this.statusVcall;
        String str16 = this.msgExp;
        String str17 = this.namaKantor;
        String str18 = this.kodeWilayah;
        String str19 = this.kodeJenisAntrian;
        StringBuilder sb = new StringBuilder("InsertAntrianData(ret=");
        sb.append(str);
        sb.append(", msg=");
        sb.append(str2);
        sb.append(", tglBooking=");
        sb.append(str3);
        sb.append(", keteranganWaktu=");
        sb.append(str4);
        sb.append(", cekBankAktif=");
        sb.append(str5);
        sb.append(", shift=");
        sb.append(str6);
        sb.append(", namaWilayah=");
        sb.append(str7);
        sb.append(", kodeKantor=");
        sb.append(str8);
        sb.append(", waktuExpired=");
        sb.append(str9);
        sb.append(", kodeSegmen=");
        sb.append(str10);
        sb.append(", alamat=");
        sb.append(str11);
        sb.append(", kodeProvinsi=");
        sb.append(str12);
        sb.append(", retExp=");
        sb.append(str13);
        sb.append(", kode=");
        sb.append(str14);
        sb.append(", statusVcall=");
        sb.append(str15);
        sb.append(", msgExp=");
        sb.append(str16);
        sb.append(", namaKantor=");
        sb.append(str17);
        sb.append(", kodeWilayah=");
        sb.append(str18);
        sb.append(", kodeJenisAntrian=");
        sb.append(str19);
        sb.append(")");
        String string = sb.toString();
        int i2 = f402a + 95;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    static void b() {
        TuitionPaymentFragmentbindingInflater1 = -699816956;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -1934795521;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1260035524;
        b = new byte[]{51, 63, 44, 82, 17, 51, 58, 42, 5, 65, 78, -60, 47, 106, -11, 4, 5, 6, 41, 49, 54, -92, -104, -85, -108, -107, -96, -115, -66, -95, -86, -99, -111, -85, -103, -124, -73, -76, -67, -97, -52, -114, -68, -76, -122, -66, -110, 101, -108, -23, -125, -72, 116, -3, -84, -83, -74, -71, -79, -122, -72, 51, -114, 36, -69, -65, -122, -71, 53, 72, 118, 51, 42, -124, 53, -122, 39, 38, -63, 81, -56, 60, Base64.padSymbol, 31, -55, 37, -51, 20, -27, -5, 45, -49, 103, -53, -80, -83, -53, 114, 111, -47, -101, -99, -53, 102, -97, 103, -51, 12, -72, -16, -4, -26, -56, -41, -81, 12, -46, -16, -85, -27, -60, -121, 24, -6, -122, -41, -26, -16, -41, -121, -15, -27, -1, -4, -44, -1, -83, -28, -4, -15, -84, 13, -6, -121, -29, -86, -5, -29, -4, -6, -84, -25, -15, -46, -6, -96, -56, -4, 12, -121, -4, 25, -5, -84, -16, -3, -4, -45, -3, 11, 69, 83, 26, 120, 87, 25, 86, 68, 10, 10, -25, 124, 85, -29, ByteCompanionObject.MAX_VALUE, 83, 85, 10, 8, 84, -27, 84, 70, 85, -28, 9, 68, 86, 9, -26, 124, 84, 10, 85, 83, 15, -30, 123, -25, 121, -27, 122, 87, 87, 8, 86, 84, 11, 27, 65, 24, 86, 71, 31, 84, 123, -32, 120, 80, 15, -25, 86, 11, -26, -26, -26, -26, -26, -26, -26, -26};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, short r7, short r8) {
        /*
            byte[] r0 = com.bpjstku.data.queueing.model.response.InsertAntrianData.$$c
            int r8 = 121 - r8
            int r6 = r6 * 3
            int r6 = r6 + 4
            int r7 = r7 * 3
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L20:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L28:
            int r6 = r6 + 1
            int r8 = -r8
            int r8 = r8 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.queueing.model.response.InsertAntrianData.$$g(int, short, short):java.lang.String");
    }
}
