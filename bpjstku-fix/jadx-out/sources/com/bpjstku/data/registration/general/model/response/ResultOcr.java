package com.bpjstku.data.registration.general.model.response;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.annotations.SerializedName;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000fJ\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJ|\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002H×\u0001¢\u0006\u0004\b \u0010\u000fR\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u000fR\u001c\u0010$\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010\u000fR\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010\u000fR\u001c\u0010(\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010\u000fR\u001c\u0010*\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b+\u0010\u000fR\u001c\u0010,\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\"\u001a\u0004\b-\u0010\u000fR\u001c\u0010.\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\"\u001a\u0004\b/\u0010\u000fR\u001c\u00100\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010\"\u001a\u0004\b1\u0010\u000fR\u001c\u00102\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010\"\u001a\u0004\b3\u0010\u000f"}, d2 = {"Lcom/bpjstku/data/registration/general/model/response/ResultOcr;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/registration/general/model/response/ResultOcr;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "jenisKelamin", "Ljava/lang/String;", "getJenisKelamin", "rtRw", "getRtRw", "tempatLahir", "getTempatLahir", "alamat", "getAlamat", "kecamatan", "getKecamatan", "kelDesa", "getKelDesa", "nama", "getNama", "nik", "getNik", "tglLahir", "getTglLahir"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ResultOcr {
    public static final int $stable = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int b;

    @SerializedName("alamat")
    private final String alamat;

    @SerializedName("jenisKelamin")
    private final String jenisKelamin;

    @SerializedName("kecamatan")
    private final String kecamatan;

    @SerializedName("kelDesa")
    private final String kelDesa;

    @SerializedName("nama")
    private final String nama;

    @SerializedName("nik")
    private final String nik;

    @SerializedName("rtRw")
    private final String rtRw;

    @SerializedName("tempatLahir")
    private final String tempatLahir;

    @SerializedName("tglLahir")
    private final String tglLahir;
    private static final byte[] $$c = {32, 1, 70, -122};
    private static final int $$f = 125;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {68, 83, 49, -116, -4, -20, -6, 6, -26, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$e = 107;
    private static final byte[] $$a = {77, -106, 83, 4, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f406a = 0;
    private static int d = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r0 = r6 + 1
            int r8 = r8 * 14
            int r8 = 98 - r8
            byte[] r1 = com.bpjstku.data.registration.general.model.response.ResultOcr.$$a
            int r7 = r7 * 52
            int r7 = 55 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2e
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            int r7 = r7 + 1
            r4 = r1[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r3 = r3 + r7
            int r7 = r3 + (-10)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.registration.general.model.response.ResultOcr.c(byte, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 47
            int r0 = r6 + 6
            byte[] r1 = com.bpjstku.data.registration.general.model.response.ResultOcr.$$d
            int r7 = r7 * 5
            int r7 = r7 + 4
            int r8 = r8 * 33
            int r8 = 117 - r8
            byte[] r0 = new byte[r0]
            int r6 = r6 + 5
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r6
            r4 = r2
            goto L2d
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L28:
            r3 = r1[r7]
            r5 = r3
            r3 = r8
            r8 = r5
        L2d:
            int r7 = r7 + 1
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-11)
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.registration.general.model.response.ResultOcr.f(int, byte, short, java.lang.Object[]):void");
    }

    public ResultOcr(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.jenisKelamin = str;
        this.rtRw = str2;
        this.tempatLahir = str3;
        this.alamat = str4;
        this.kecamatan = str5;
        this.kelDesa = str6;
        this.nama = str7;
        this.nik = str8;
        this.tglLahir = str9;
    }

    public final String getJenisKelamin() {
        int i = 2 % 2;
        int i2 = d + 49;
        f406a = i2 % 128;
        if (i2 % 2 == 0) {
            return this.jenisKelamin;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getRtRw() {
        int i = 2 % 2;
        int i2 = f406a + 5;
        int i3 = i2 % 128;
        d = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.rtRw;
        int i4 = i3 + 27;
        f406a = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getTempatLahir() {
        int i = 2 % 2;
        int i2 = d + 21;
        f406a = i2 % 128;
        if (i2 % 2 == 0) {
            return this.tempatLahir;
        }
        throw null;
    }

    private static void e(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
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
            int i4 = $10 + 113;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 8328);
                    int defaultSize = 1235 - View.getDefaultSize(0, 0);
                    int iIndexOf = 35 - TextUtils.indexOf("", "", 0, 0);
                    byte b2 = (byte) ($$c[1] - 1);
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumFlingVelocity, defaultSize, iIndexOf, -653973969, false, $$g(b2, b3, (byte) (b3 + 2)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char size = (char) View.MeasureSpec.getSize(0);
                    int iLastIndexOf = 2763 - TextUtils.lastIndexOf("", '0');
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 14;
                    byte b4 = (byte) ($$c[1] - 1);
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(size, iLastIndexOf, minimumFlingVelocity, 1504416861, false, $$g(b4, b5, b5), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - TextUtils.indexOf("", "", 0)), 252 - TextUtils.lastIndexOf("", '0', 0, 0), 22 - View.resolveSize(0, 0), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c2 = (char) (65200 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    int iMyPid = (Process.myPid() >> 22) + 2891;
                    int iArgb = Color.argb(0, 0, 0, 0) + 17;
                    byte b6 = $$c[1];
                    byte b7 = (byte) (b6 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, iMyPid, iArgb, 2012627446, false, $$g(b7, b7, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                int i6 = $11 + 111;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    public final String getAlamat() throws Throwable {
        int i;
        Object[] objArr;
        int i2 = 2 % 2;
        int i3 = f406a + 107;
        d = i3 % 128;
        int i4 = i3 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char mode = (char) (View.MeasureSpec.getMode(0) + 31533);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 921;
            int packedPositionGroup = 28 - ExpandableListView.getPackedPositionGroup(0L);
            byte[] bArr = $$a;
            byte b2 = bArr[80];
            Object[] objArr2 = new Object[1];
            c(b2, bArr[37], b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(mode, iMakeMeasureSpec, packedPositionGroup, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{6675, 32528, 44194, 54337}, new char[]{16368, 7684, 41465, 31408}, (char) ((Process.getThreadPriority(0) + 20) >> 6), View.MeasureSpec.makeMeasureSpec(0, 0), new char[]{21980, 29961, 21585, 48294, 55717, 4389, 25214, 53845, 47646, 45457, 24407, 8859, 48824, 65125, 52500, 22938, 40768, 13107, 21976, 48517, 47948, 16851}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{6675, 32528, 44194, 54337}, new char[]{65421, 16083, 28516, 20120}, (char) (39023 - Drawable.resolveOpacity(0, 0)), Gravity.getAbsoluteGravity(0, 0) + 1681839103, new char[]{28716, 39707, 45955, 38018, 10445, 49835, 1419, 4635, 49689, 61561, 54436, 44080, 22695, 63218, 43156}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 31533);
            int iRed = Color.red(0) + 921;
            int i5 = 28 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            byte b3 = $$a[37];
            Object[] objArr5 = new Object[1];
            c((byte) 52, b3, b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(deadChar, iRed, i5, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cGreen = (char) (Color.green(0) + 31533);
                int deadChar2 = 921 - KeyEvent.getDeadChar(0, 0);
                int iBlue = Color.blue(0) + 28;
                byte b4 = (byte) ($$b | 32);
                byte[] bArr2 = $$a;
                Object[] objArr6 = new Object[1];
                c(b4, bArr2[80], bArr2[37], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cGreen, deadChar2, iBlue, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int i6 = ~((int) SystemClock.elapsedRealtime());
            int i7 = ((22099979 + ((~((-2175108) | i6)) * (-783))) + (((~(i6 | 1737920268)) | (-36159376)) * 783)) - 257744020;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{6675, 32528, 44194, 54337}, new char[]{60368, 48142, 8940, 37761}, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 33057), Process.myPid() >> 22, new char[]{58544, 63159, 28364, 335, 21070, 30346, 11962, 24243, 59233, 29758, 61059, 45251, 20858, 16041, 15548, 60303, 44804, 14431, 54065, 39787, 17626, 30270, 34080, 33632, 51848, 65148}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{6675, 32528, 44194, 54337}, new char[]{22808, 51661, 8324, 1227}, (char) (52000 - (ViewConfiguration.getScrollBarSize() >> 8)), ViewConfiguration.getWindowTouchSlop() >> 8, new char[]{31938, 26492, 58643, 37665, 50666, 54517, 44573, 22752, 20338, 37770, 39899, 32058, 60627, 859, 22402, 2687, 52325, 61750}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext == null) {
                i = 4;
            } else {
                if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                    applicationContext = null;
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                    int i10 = d + 61;
                    f406a = i10 % 128;
                    if (i10 % 2 != 0) {
                        i = 4;
                        int i11 = 3 % 4;
                    }
                }
                i = 4;
            }
            char[] cArr = new char[i];
            // fill-array-data instruction
            cArr[0] = 6675;
            cArr[1] = 32528;
            cArr[2] = 44194;
            cArr[3] = 54337;
            char[] cArr2 = new char[i];
            // fill-array-data instruction
            cArr2[0] = 23643;
            cArr2[1] = 21106;
            cArr2[2] = 35651;
            cArr2[3] = 9366;
            Object[] objArr10 = new Object[1];
            e(cArr, cArr2, (char) (38539 - (ViewConfiguration.getJumpTapTimeout() >> 16)), TextUtils.lastIndexOf("", '0') + 1, new char[]{28474, 15195, 60885, 59119, 17967, 20396, 41587, 46182, 32693, 927, 6719, 13458, 30836, 32857, 60856, 4912}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new char[]{6675, 32528, 44194, 54337}, new char[]{34733, 36139, 11931, 15302}, (char) (ExpandableListView.getPackedPositionGroup(0L) + 50734), ViewConfiguration.getScrollBarSize() >> 8, new char[]{39867, 19355, 34756, 46578, 23157, 55495, 44282, 61784, 13743, 18959, 64703, 3855, 32608, 59865, 6218, 63505}, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i12 = d + 79;
            int i13 = i12 % 128;
            f406a = i13;
            if (i12 % 2 != 0) {
                int i14 = 2 % 3;
            }
            int i15 = i13 + 67;
            d = i15 % 128;
            int i16 = i15 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -257744020};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[12];
                byte b6 = b5;
                Object[] objArr13 = new Object[1];
                f(b5, b6, b6, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b7 = bArr3[10];
                byte b8 = b7;
                Object[] objArr14 = new Object[1];
                f(b7, b8, b8, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c = (char) (31534 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                    int maxKeyCode = 921 - (KeyEvent.getMaxKeyCode() >> 16);
                    int iArgb = Color.argb(0, 0, 0, 0) + 28;
                    byte b9 = (byte) ($$b | 32);
                    byte[] bArr4 = $$a;
                    Object[] objArr16 = new Object[1];
                    c(b9, bArr4[80], bArr4[37], objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, maxKeyCode, iArgb, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    e(new char[]{6675, 32528, 44194, 54337}, new char[]{16368, 7684, 41465, 31408}, (char) (ViewConfiguration.getLongPressTimeout() >> 16), View.resolveSize(0, 0), new char[]{21980, 29961, 21585, 48294, 55717, 4389, 25214, 53845, 47646, 45457, 24407, 8859, 48824, 65125, 52500, 22938, 40768, 13107, 21976, 48517, 47948, 16851}, objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    e(new char[]{6675, 32528, 44194, 54337}, new char[]{65421, 16083, 28516, 20120}, (char) (39022 - TextUtils.indexOf((CharSequence) "", '0', 0)), TextUtils.indexOf("", "") + 1681839103, new char[]{28716, 39707, 45955, 38018, 10445, 49835, 1419, 4635, 49689, 61561, 54436, 44080, 22695, 63218, 43156}, objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 31533);
                        int gidForName = 920 - Process.getGidForName("");
                        int iResolveSize = 28 - View.resolveSize(0, 0);
                        byte b10 = $$a[37];
                        Object[] objArr19 = new Object[1];
                        c((byte) 52, b10, b10, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(edgeSlop, gidForName, iResolveSize, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c2 = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 31533);
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 922;
                        int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 29;
                        byte[] bArr5 = $$a;
                        byte b11 = bArr5[80];
                        Object[] objArr20 = new Object[1];
                        c(b11, bArr5[37], b11, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, iIndexOf, iIndexOf2, -1048449946, false, (String) objArr20[0], null);
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
        int i17 = ((int[]) objArr[1])[0];
        int i18 = ((int[]) objArr[3])[0];
        if (i18 == i17) {
            int i19 = ((int[]) objArr[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i20 = i19 + (-398041160) + (((~((-990467577) | iIdentityHashCode)) | 704663712) * 345) + (((~((-990467577) | (~iIdentityHashCode))) | 78948355) * 345) + ((~(iIdentityHashCode | (-704663713))) * 345);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr21[0])[0] = i22 ^ (i22 << 5);
            return this.alamat;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = (String[]) objArr[4];
        if (strArr != null) {
            int i23 = d + 45;
            f406a = i23 % 128;
            int i24 = i23 % 2;
            for (String str : strArr) {
                int i25 = d + 21;
                f406a = i25 % 128;
                int i26 = i25 % 2;
                arrayList.add(str);
            }
        }
        throw new RuntimeException(String.valueOf(i18));
    }

    public final String getKecamatan() {
        int i = 2 % 2;
        int i2 = f406a + 93;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        String str = this.kecamatan;
        int i5 = i3 + 37;
        f406a = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getKelDesa() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 61;
        f406a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.kelDesa;
        int i5 = i2 + 79;
        f406a = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getNama() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 59;
        f406a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.nama;
        int i5 = i2 + 109;
        f406a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getNik() {
        String str;
        int i = 2 % 2;
        int i2 = f406a + 69;
        int i3 = i2 % 128;
        d = i3;
        if (i2 % 2 == 0) {
            str = this.nik;
            int i4 = 62 / 0;
        } else {
            str = this.nik;
        }
        int i5 = i3 + 119;
        f406a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 41 / 0;
        }
        return str;
    }

    public final String getTglLahir() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 57;
        f406a = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.tglLahir;
        int i4 = i2 + 87;
        f406a = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    static {
        b = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i = TuitionPaymentFragmentbindingInflater1 + 49;
        b = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ ResultOcr copy$default(ResultOcr resultOcr, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
        String str10;
        int i2 = 2 % 2;
        int i3 = d;
        int i4 = i3 + 79;
        f406a = i4 % 128;
        int i5 = i4 % 2;
        String str11 = (i & 1) != 0 ? resultOcr.jenisKelamin : str;
        String str12 = (i & 2) != 0 ? resultOcr.rtRw : str2;
        String str13 = (i & 4) != 0 ? resultOcr.tempatLahir : str3;
        String str14 = (i & 8) != 0 ? resultOcr.alamat : str4;
        if ((i & 16) != 0) {
            int i6 = i3 + 117;
            f406a = i6 % 128;
            if (i6 % 2 != 0) {
                String str15 = resultOcr.kecamatan;
                throw null;
            }
            str10 = resultOcr.kecamatan;
        } else {
            str10 = str5;
        }
        return resultOcr.copy(str11, str12, str13, str14, str10, (i & 32) != 0 ? resultOcr.kelDesa : str6, (i & 64) != 0 ? resultOcr.nama : str7, (i & 128) != 0 ? resultOcr.nik : str8, (i & 256) != 0 ? resultOcr.tglLahir : str9);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = d + 111;
        int i3 = i2 % 128;
        f406a = i3;
        int i4 = i2 % 2;
        String str = this.jenisKelamin;
        int i5 = i3 + 39;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 76 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = f406a + 49;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        String str = this.rtRw;
        int i5 = i3 + 69;
        f406a = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 59;
        f406a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.tempatLahir;
        int i5 = i2 + 23;
        f406a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        String str;
        int i = 2 % 2;
        int i2 = d + 75;
        int i3 = i2 % 128;
        f406a = i3;
        if (i2 % 2 != 0) {
            str = this.alamat;
            int i4 = 16 / 0;
        } else {
            str = this.alamat;
        }
        int i5 = i3 + 87;
        d = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = f406a + 17;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        String str = this.kecamatan;
        int i5 = i3 + 29;
        f406a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 35 / 0;
        }
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 123;
        f406a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.kelDesa;
        int i5 = i2 + 93;
        f406a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = d + 77;
        int i3 = i2 % 128;
        f406a = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.nama;
        int i4 = i3 + 121;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 51;
        f406a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.nik;
        int i5 = i2 + 63;
        f406a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 7 / 0;
        }
        return str;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = f406a;
        int i3 = i2 + 31;
        d = i3 % 128;
        int i4 = i3 % 2;
        String str = this.tglLahir;
        int i5 = i2 + 95;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final ResultOcr copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8) {
        int i = 2 % 2;
        ResultOcr resultOcr = new ResultOcr(p0, p1, p2, p3, p4, p5, p6, p7, p8);
        int i2 = d + 79;
        f406a = i2 % 128;
        if (i2 % 2 == 0) {
            return resultOcr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ResultOcr)) {
            return false;
        }
        ResultOcr resultOcr = (ResultOcr) p0;
        if (!Intrinsics.areEqual(this.jenisKelamin, resultOcr.jenisKelamin)) {
            int i2 = f406a + 97;
            d = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.rtRw, resultOcr.rtRw)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.tempatLahir, resultOcr.tempatLahir)) {
            int i3 = f406a + 19;
            d = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.alamat, resultOcr.alamat)) {
            int i5 = d + 81;
            f406a = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.kecamatan, resultOcr.kecamatan)) {
            if (Intrinsics.areEqual(this.kelDesa, resultOcr.kelDesa)) {
                if (Intrinsics.areEqual(this.nama, resultOcr.nama)) {
                    return Intrinsics.areEqual(this.nik, resultOcr.nik) && Intrinsics.areEqual(this.tglLahir, resultOcr.tglLahir);
                }
                int i7 = f406a + 87;
                d = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            int i9 = d + 19;
            f406a = i9 % 128;
            int i10 = i9 % 2;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = f406a + 57;
        d = i2 % 128;
        int i3 = i2 % 2;
        String str = this.jenisKelamin;
        int iHashCode3 = 0;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.rtRw;
        if (str2 == null) {
            int i4 = d + 73;
            f406a = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        String str3 = this.tempatLahir;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.alamat;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.kecamatan;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.kelDesa;
        int iHashCode8 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.nama;
        if (str7 == null) {
            int i6 = f406a + 61;
            d = i6 % 128;
            iHashCode2 = i6 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode2 = str7.hashCode();
        }
        String str8 = this.nik;
        int iHashCode9 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.tglLahir;
        if (str9 != null) {
            int i7 = d + 87;
            f406a = i7 % 128;
            if (i7 % 2 != 0) {
                str9.hashCode();
                throw null;
            }
            iHashCode3 = str9.hashCode();
        }
        return (((((((((((((((iHashCode4 * 31) + iHashCode) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode2) * 31) + iHashCode9) * 31) + iHashCode3;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.jenisKelamin;
        String str2 = this.rtRw;
        String str3 = this.tempatLahir;
        String str4 = this.alamat;
        String str5 = this.kecamatan;
        String str6 = this.kelDesa;
        String str7 = this.nama;
        String str8 = this.nik;
        String str9 = this.tglLahir;
        StringBuilder sb = new StringBuilder("ResultOcr(jenisKelamin=");
        sb.append(str);
        sb.append(", rtRw=");
        sb.append(str2);
        sb.append(", tempatLahir=");
        sb.append(str3);
        sb.append(", alamat=");
        sb.append(str4);
        sb.append(", kecamatan=");
        sb.append(str5);
        sb.append(", kelDesa=");
        sb.append(str6);
        sb.append(", nama=");
        sb.append(str7);
        sb.append(", nik=");
        sb.append(str8);
        sb.append(", tglLahir=");
        sb.append(str9);
        sb.append(")");
        String string = sb.toString();
        int i2 = f406a + 33;
        d = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 8304428606928822050L;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -981105359;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (char) 34097;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, int r7, short r8) {
        /*
            int r6 = r6 * 4
            int r0 = r6 + 1
            byte[] r1 = com.bpjstku.data.registration.general.model.response.ResultOcr.$$c
            int r7 = r7 * 3
            int r7 = r7 + 4
            int r8 = 104 - r8
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L28
        L15:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L19:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L26:
            r3 = r1[r8]
        L28:
            int r7 = r7 + r3
            int r8 = r8 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.registration.general.model.response.ResultOcr.$$g(byte, int, short):java.lang.String");
    }
}
