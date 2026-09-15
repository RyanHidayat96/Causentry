package com.squareup.okhttp.internal.tls;

import android.content.Context;
import android.graphics.Color;
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
import androidx.core.view.ViewCompat;
import defpackage.BrowserActionItem;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes5.dex */
public final class OkHostnameVerifier implements HostnameVerifier {
    private static final int ALT_DNS_NAME = 2;
    private static final int ALT_IPA_NAME = 7;
    public static final OkHostnameVerifier INSTANCE;
    private static long TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final Pattern VERIFY_AS_IP_ADDRESS;
    private static int b;
    private static final byte[] $$c = {93, -77, 2, Base64.padSymbol};
    private static final int $$f = 171;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {104, 27, -72, 120, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$e = 226;
    private static final byte[] $$a = {108, -26, -110, 50, 18, -12, 10, 4, -18};
    private static final int $$b = 11;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 2
            int r8 = 6 - r8
            int r7 = r7 + 4
            byte[] r0 = com.squareup.okhttp.internal.tls.OkHostnameVerifier.$$a
            int r9 = r9 * 2
            int r9 = r9 + 118
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r5 = r2
            r9 = r7
            goto L2c
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r6
        L2c:
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + 1
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.tls.OkHostnameVerifier.a(byte, short, short, java.lang.Object[]):void");
    }

    private static void c(int i, short s, int i2, Object[] objArr) {
        int i3 = 103 - s;
        byte[] bArr = $$d;
        int i4 = 56 - (i2 * 52);
        int i5 = i * 52;
        byte[] bArr2 = new byte[i5 + 1];
        int i6 = -1;
        if (bArr == null) {
            i3 = (i5 + (-i3)) - 11;
            i4++;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i3;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i3 = (i3 + (-bArr[i4])) - 11;
            i4++;
            i6 = i7;
        }
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        b();
        INSTANCE = new OkHostnameVerifier();
        VERIFY_AS_IP_ADDRESS = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
        int i2 = i % 2;
    }

    private OkHostnameVerifier() {
    }

    private static void d(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
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
            int i4 = $11 + 35;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char pressedStateDuration = (char) (8328 - (ViewConfiguration.getPressedStateDuration() >> 16));
                    int iRed = Color.red(0) + 1235;
                    int i6 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 35;
                    byte b2 = $$c[i2];
                    byte b3 = (byte) (b2 - 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(pressedStateDuration, iRed, i6, -653973969, false, $$g(b2, b3, b3), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 2765 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 14, 1504416861, false, $$g(b4, b5, b5), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43326 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0, 0) + 254, 23 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cAlpha = (char) (Color.alpha(0) + 65200);
                    int iIndexOf = 2891 - TextUtils.indexOf("", "", 0, 0);
                    int i7 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 17;
                    byte b6 = (byte) ($$f & 5);
                    byte b7 = (byte) (b6 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cAlpha, iIndexOf, i7, 2012627446, false, $$g(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentbindingInflater1 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) b) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                int i8 = $10 + 45;
                $11 = i8 % 128;
                int i9 = i8 % 2;
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

    /* JADX WARN: Code duplicated, block: B:101:0x04c0 A[Catch: all -> 0x066e, TryCatch #7 {all -> 0x066e, blocks: (B:99:0x04b3, B:101:0x04c0, B:102:0x0503), top: B:150:0x04b3, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x0521 A[Catch: all -> 0x0663, TryCatch #2 {all -> 0x0663, blocks: (B:104:0x050a, B:106:0x0521, B:107:0x056e), top: B:153:0x050a, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x0612  */
    /* JADX WARN: Code duplicated, block: B:113:0x061e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0622  */
    /* JADX WARN: Code duplicated, block: B:116:0x062d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0646  */
    /* JADX WARN: Code duplicated, block: B:127:0x064f A[Catch: SSLException -> 0x0679, TRY_LEAVE, TryCatch #3 {SSLException -> 0x0679, blocks: (B:29:0x01eb, B:32:0x0269, B:38:0x02ef, B:40:0x02f3, B:43:0x02f8, B:45:0x02fe, B:48:0x032c, B:50:0x033a, B:55:0x035d, B:58:0x0371, B:60:0x0385, B:65:0x03ad, B:68:0x03c1, B:69:0x03cf, B:77:0x043c, B:79:0x0442, B:80:0x0443, B:81:0x0444, B:83:0x0452, B:85:0x0458, B:86:0x0459, B:87:0x045a, B:89:0x0463, B:93:0x0479, B:96:0x0498, B:98:0x04ac, B:109:0x057f, B:120:0x0633, B:123:0x0641, B:125:0x0647, B:127:0x064f, B:27:0x00ec, B:31:0x01ee, B:37:0x0273, B:71:0x03d7, B:73:0x03ed, B:74:0x042e), top: B:155:0x01eb, inners: #1, #6 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x065b A[Catch: SSLException -> 0x067b, TryCatch #0 {SSLException -> 0x067b, blocks: (B:129:0x0656, B:131:0x065b, B:132:0x0662, B:134:0x0664, B:136:0x066c, B:137:0x066d, B:139:0x066f, B:141:0x0677, B:142:0x0678, B:104:0x050a, B:106:0x0521, B:107:0x056e, B:99:0x04b3, B:101:0x04c0, B:102:0x0503), top: B:150:0x04b3, inners: #2, #7 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0463 A[Catch: SSLException -> 0x0679, TRY_LEAVE, TryCatch #3 {SSLException -> 0x0679, blocks: (B:29:0x01eb, B:32:0x0269, B:38:0x02ef, B:40:0x02f3, B:43:0x02f8, B:45:0x02fe, B:48:0x032c, B:50:0x033a, B:55:0x035d, B:58:0x0371, B:60:0x0385, B:65:0x03ad, B:68:0x03c1, B:69:0x03cf, B:77:0x043c, B:79:0x0442, B:80:0x0443, B:81:0x0444, B:83:0x0452, B:85:0x0458, B:86:0x0459, B:87:0x045a, B:89:0x0463, B:93:0x0479, B:96:0x0498, B:98:0x04ac, B:109:0x057f, B:120:0x0633, B:123:0x0641, B:125:0x0647, B:127:0x064f, B:27:0x00ec, B:31:0x01ee, B:37:0x0273, B:71:0x03d7, B:73:0x03ed, B:74:0x042e), top: B:155:0x01eb, inners: #1, #6 }] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) throws Throwable {
        int length;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        int i;
        int i2;
        boolean z;
        int i3;
        String string;
        Method method;
        boolean z2;
        boolean z3;
        int i4 = 2 % 2;
        int i5 = asBinder;
        int i6 = i5 + 63;
        asInterface = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i7 = 0;
        if (str != null) {
            int i8 = i5 + 3;
            asInterface = i8 % 128;
            if (i8 % 2 == 0) {
                str.length();
                throw null;
            }
            length = str.length();
        } else {
            length = 0;
        }
        if (BrowserActionItem.b(new ArrayList()) != 0) {
            Toast.makeText((Context) null, length / (((length - 1) * length) % 2), 0).show();
        }
        try {
            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
            ArrayList arrayList = new ArrayList();
            byte b2 = (byte) (-1);
            byte b3 = (byte) (b2 + 1);
            Object[] objArr = new Object[1];
            a(b2, b3, b3, objArr);
            Method[] methodArr = {OkHostnameVerifier.class.getMethod((String) objArr[0], String.class, Class.forName("java.security.cert.X509Certificate"))};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char cMyTid = (char) (Process.myTid() >> 22);
                int i9 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2822;
                int capsMode = TextUtils.getCapsMode("", 0, 0) + 22;
                byte[] bArr = $$d;
                byte b4 = bArr[5];
                Object[] objArr2 = new Object[1];
                c(b4, bArr[10], b4, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMyTid, i9, capsMode, 1814927978, false, (String) objArr2[0], null);
            }
            Object obj2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
            float f = 0.0f;
            if (obj2 != null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char c = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                    i7 = 0;
                    int i10 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2824;
                    int iAxisFromString = 21 - MotionEvent.axisFromString("");
                    byte[] bArr2 = $$d;
                    byte b5 = bArr2[5];
                    Object[] objArr3 = new Object[1];
                    c(b5, bArr2[10], b5, objArr3);
                    z2 = false;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i10, iAxisFromString, 1814927978, false, (String) objArr3[0], null);
                }
                Object[] objArr4 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null)};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                    int i11 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2823;
                    int maxKeyCode = 22 - (KeyEvent.getMaxKeyCode() >> 16);
                    byte b6 = $$d[7];
                    byte b7 = b6;
                    Object[] objArr5 = new Object[1];
                    c(b7, (byte) (b7 + 5), b6, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(longPressTimeout, i11, maxKeyCode, 1025296417, false, (String) objArr5[0], new Class[]{Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr4);
                Object[] objArr6 = {0, methodArr, null};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cArgb = (char) (37657 - Color.argb(0, 0, 0, 0));
                    int i12 = 2720 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int gidForName = 18 - Process.getGidForName("");
                    byte b8 = $$d[7];
                    byte b9 = b8;
                    Object[] objArr7 = new Object[1];
                    c(b9, (byte) (b9 + 5), b8, objArr7);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cArgb, i12, gidForName, -1568796068, false, (String) objArr7[0], new Class[]{Integer.TYPE, Method[].class, List.class});
                }
                long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr6)).longValue();
                long j = -647312400;
                long j2 = (((long) (-589)) * j) + (((long) 591) * jLongValue);
                long j3 = 590;
                long j4 = -1;
                long j5 = jLongValue ^ j4;
                long jMyPid = Process.myPid();
                long j6 = jMyPid ^ j4;
                long j7 = ((j5 | j6) ^ j4) | ((j5 | j) ^ j4) | ((j6 | j) ^ j4);
                long j8 = j ^ j4;
                long j9 = j2 + ((j7 | (((j8 | jLongValue) | jMyPid) ^ j4)) * j3) + (((long) (-1180)) * j7) + (j3 * (((j6 | jLongValue) ^ j4) | ((j8 | j6) ^ j4))) + ((long) (-1163093445));
                int startUptimeMillis = (int) Process.getStartUptimeMillis();
                int i13 = ((int) (j9 >> 32)) & (((((~((-1107069899) | startUptimeMillis)) | 1078985226) * (-566)) - 2037459002) + ((~(startUptimeMillis | (-28084673))) * 566));
                int i14 = (int) j9;
                int iIdentityHashCode = System.identityHashCode(this);
                int i15 = i13 | (i14 & ((-1408217179) + (((~((-213736381) | iIdentityHashCode)) | (-1650962791)) * (-366)) + (((~(iIdentityHashCode | (-2429221))) | (-1862269951)) * 366)));
                i = i15 >>> 24;
                int i16 = i15 & ViewCompat.MEASURED_SIZE_MASK;
                if (i != 0) {
                    int i17 = asInterface + 125;
                    asBinder = i17 % 128;
                    i2 = 2;
                    int i18 = i17 % 2;
                    z = true;
                } else {
                    i2 = 2;
                    z = false;
                }
                if (z) {
                    int i19 = asInterface + 101;
                    asBinder = i19 % 128;
                    int i20 = i19 % i2;
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                if (z) {
                    string = null;
                } else {
                    string = null;
                }
                arrayList.add(string);
                if ((i + 6) * i3 == 0) {
                    return verify(str, (X509Certificate) peerCertificates[0]);
                }
                throw new NullPointerException();
            }
            int i21 = asInterface + 119;
            asBinder = i21 % 128;
            int i22 = i21 % 2;
            Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 2822 - TextUtils.indexOf((CharSequence) "", '0'), Color.rgb(0, 0, 0) + 16777238)).getDeclaredMethods();
            int length2 = declaredMethods.length;
            int i23 = 0;
            while (i23 < length2) {
                Method method2 = declaredMethods[i23];
                try {
                    Object[] objArr8 = new Object[1];
                    d(new char[]{0, 0, 0, 0}, new char[]{12810, 7894, 41016, 13189}, (char) TextUtils.getTrimmedLength(""), (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)), new char[]{2080, 30845, 17715, 55894, 41135, 448, 21341, 1528, 30011, 185, 3787, 49356, 14217, 9057, 21007, 29359, 22116, 43596, 61070, 46138, 43723, 45239, 25885, 51459}, objArr8);
                    Class<?> cls = Class.forName((String) objArr8[i7]);
                    Object[] objArr9 = new Object[1];
                    d(new char[]{0, 0, 0, 0}, new char[]{42041, 8525, 3217, 50275}, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.indexOf("", "", i7), new char[]{58864, 10889, 14536, 29268, 54956, 55090, 25040, 35327, 9834, 47961, 56052, 47614}, objArr9);
                    Object[] objArr10 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr9[0], null).invoke(method2, null)).intValue())};
                    Object[] objArr11 = new Object[1];
                    d(new char[]{0, 0, 0, 0}, new char[]{7654, 40848, 39385, 14121}, (char) (TextUtils.indexOf("", "", 0) + 10649), ViewConfiguration.getJumpTapTimeout() >> 16, new char[]{576, 6718, 33178, 56577, 60580, 15735, 62850, 16171, 8813, 53146, 32840, 14539, 47238, 6142, 8911, 48223, 36745, 1035, 48858, 18313, 23540, 41855, 32672, 37664, 54191, 13497}, objArr11);
                    Class<?> cls2 = Class.forName((String) objArr11[0]);
                    Method[] methodArr2 = declaredMethods;
                    Object[] objArr12 = new Object[1];
                    d(new char[]{0, 0, 0, 0}, new char[]{64642, 51334, 34921, 44303}, (char) (TextUtils.lastIndexOf("", '0') + 1), View.resolveSizeAndState(0, 0, 0), new char[]{30600, 52072, 50859, 39933, 'd', 49430, 9403, 32512}, objArr12);
                    if (((Boolean) cls2.getMethod((String) objArr12[0], Integer.TYPE).invoke(null, objArr10)).booleanValue()) {
                        try {
                            Class cls3 = Long.TYPE;
                            Object[] objArr13 = new Object[1];
                            d(new char[]{0, 0, 0, 0}, new char[]{12810, 7894, 41016, 13189}, (char) (ViewConfiguration.getLongPressTimeout() >> 16), Drawable.resolveOpacity(0, 0), new char[]{2080, 30845, 17715, 55894, 41135, 448, 21341, 1528, 30011, 185, 3787, 49356, 14217, 9057, 21007, 29359, 22116, 43596, 61070, 46138, 43723, 45239, 25885, 51459}, objArr13);
                            Class<?> cls4 = Class.forName((String) objArr13[0]);
                            Object[] objArr14 = new Object[1];
                            d(new char[]{0, 0, 0, 0}, new char[]{32531, 59607, 11415, 54216}, (char) (51245 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), View.MeasureSpec.getMode(0) - 1746348161, new char[]{45959, 47315, 26488, 44418, 55846, 5813, 6526, 29432, 10078, 13505, 51584, 54767, 12201}, objArr14);
                            if (!cls3.equals(cls4.getMethod((String) objArr14[0], null).invoke(method2, null))) {
                                continue;
                            } else {
                                Object[] objArr15 = new Object[1];
                                d(new char[]{0, 0, 0, 0}, new char[]{12810, 7894, 41016, 13189}, (char) Gravity.getAbsoluteGravity(0, 0), ViewConfiguration.getDoubleTapTimeout() >> 16, new char[]{2080, 30845, 17715, 55894, 41135, 448, 21341, 1528, 30011, 185, 3787, 49356, 14217, 9057, 21007, 29359, 22116, 43596, 61070, 46138, 43723, 45239, 25885, 51459}, objArr15);
                                Class<?> cls5 = Class.forName((String) objArr15[0]);
                                Object[] objArr16 = new Object[1];
                                d(new char[]{0, 0, 0, 0}, new char[]{3237, 2779, 34423, 21259}, (char) (2950 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (KeyEvent.getMaxKeyCode() >> 16) + 1997200140, new char[]{41708, 52019, 55370, 57964, 48864, 51939, 46936, 35233, 29510, 57636, 20368, 65408, 46913, 18851, 23265, 3086, 24887}, objArr16);
                                Object[] objArr17 = (Object[]) cls5.getMethod((String) objArr16[0], null).invoke(method2, null);
                                if (objArr17.length == 2) {
                                    z2 = false;
                                    try {
                                        if (Long.TYPE.equals(objArr17[0])) {
                                            Object[] objArr18 = new Object[1];
                                            d(new char[]{0, 0, 0, 0}, new char[]{12810, 7894, 41016, 13189}, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.getTrimmedLength(""), new char[]{2080, 30845, 17715, 55894, 41135, 448, 21341, 1528, 30011, 185, 3787, 49356, 14217, 9057, 21007, 29359, 22116, 43596, 61070, 46138, 43723, 45239, 25885, 51459}, objArr18);
                                            if (Class.forName((String) objArr18[0]).equals(objArr17[1])) {
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                                    z3 = false;
                                                    try {
                                                        char cRed = (char) Color.red(0);
                                                        int maximumDrawingCacheSize = 2823 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                        int size = 22 - View.MeasureSpec.getSize(0);
                                                        byte[] bArr3 = $$d;
                                                        byte b10 = bArr3[5];
                                                        Object[] objArr19 = new Object[1];
                                                        c(b10, bArr3[10], b10, objArr19);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cRed, maximumDrawingCacheSize, size, 1814927978, false, (String) objArr19[0], null);
                                                    } catch (SSLException unused) {
                                                        return z3;
                                                    }
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, method2);
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                                    char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                                                    int mirror = 2871 - AndroidCharacter.getMirror('0');
                                                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 22;
                                                    byte[] bArr4 = $$d;
                                                    byte b11 = bArr4[5];
                                                    Object[] objArr20 = new Object[1];
                                                    c(b11, bArr4[10], b11, objArr20);
                                                    z3 = false;
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cCombineMeasuredStates, mirror, iMakeMeasureSpec, 1814927978, false, (String) objArr20[0], null);
                                                }
                                                try {
                                                    Object[] objArr21 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null)};
                                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                                        char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                                                        int iResolveSizeAndState = 2823 - View.resolveSizeAndState(0, 0, 0);
                                                        int maxKeyCode2 = 22 - (KeyEvent.getMaxKeyCode() >> 16);
                                                        byte b12 = $$d[7];
                                                        byte b13 = b12;
                                                        Object[] objArr22 = new Object[1];
                                                        c(b12, b13, b13, objArr22);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf, iResolveSizeAndState, maxKeyCode2, -2137287382, false, (String) objArr22[0], new Class[]{Long.TYPE, Method.class});
                                                    }
                                                    ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr21)).longValue();
                                                    break;
                                                } catch (Throwable th) {
                                                    Throwable cause = th.getCause();
                                                    if (cause != null) {
                                                        throw cause;
                                                    }
                                                    throw th;
                                                }
                                            }
                                        } else {
                                            continue;
                                        }
                                    } catch (SSLException unused2) {
                                        return z2;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        } catch (SSLException unused3) {
                        }
                    }
                    i23++;
                    declaredMethods = methodArr2;
                    i7 = 0;
                    f = 0.0f;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char c2 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                i7 = 0;
                int i110 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2824;
                int iAxisFromString2 = 21 - MotionEvent.axisFromString("");
                byte[] bArr5 = $$d;
                byte b14 = bArr5[5];
                Object[] objArr23 = new Object[1];
                c(b14, bArr5[10], b14, objArr23);
                z2 = false;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, i110, iAxisFromString2, 1814927978, false, (String) objArr23[0], null);
            }
            try {
                try {
                    Object[] objArr24 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null)};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char longPressTimeout2 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                        int i111 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2823;
                        int maxKeyCode3 = 22 - (KeyEvent.getMaxKeyCode() >> 16);
                        byte b15 = $$d[7];
                        byte b16 = b15;
                        Object[] objArr25 = new Object[1];
                        c(b16, (byte) (b16 + 5), b15, objArr25);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(longPressTimeout2, i111, maxKeyCode3, 1025296417, false, (String) objArr25[0], new Class[]{Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr24);
                    try {
                        Object[] objArr26 = {0, methodArr, null};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char cArgb2 = (char) (37657 - Color.argb(0, 0, 0, 0));
                            int i112 = 2720 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int gidForName2 = 18 - Process.getGidForName("");
                            byte b17 = $$d[7];
                            byte b18 = b17;
                            Object[] objArr27 = new Object[1];
                            c(b18, (byte) (b18 + 5), b17, objArr27);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cArgb2, i112, gidForName2, -1568796068, false, (String) objArr27[0], new Class[]{Integer.TYPE, Method[].class, List.class});
                        }
                        long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr26)).longValue();
                        long j10 = -647312400;
                        long j11 = (((long) (-589)) * j10) + (((long) 591) * jLongValue2);
                        long j12 = 590;
                        long j13 = -1;
                        long j14 = jLongValue2 ^ j13;
                        long jMyPid2 = Process.myPid();
                        long j15 = jMyPid2 ^ j13;
                        long j16 = ((j14 | j15) ^ j13) | ((j14 | j10) ^ j13) | ((j15 | j10) ^ j13);
                        long j17 = j10 ^ j13;
                        long j18 = j11 + ((j16 | (((j17 | jLongValue2) | jMyPid2) ^ j13)) * j12) + (((long) (-1180)) * j16) + (j12 * (((j15 | jLongValue2) ^ j13) | ((j17 | j15) ^ j13))) + ((long) (-1163093445));
                        int startUptimeMillis2 = (int) Process.getStartUptimeMillis();
                        int i113 = ((int) (j18 >> 32)) & (((((~((-1107069899) | startUptimeMillis2)) | 1078985226) * (-566)) - 2037459002) + ((~(startUptimeMillis2 | (-28084673))) * 566));
                        int i114 = (int) j18;
                        int iIdentityHashCode2 = System.identityHashCode(this);
                        int i115 = i113 | (i114 & ((-1408217179) + (((~((-213736381) | iIdentityHashCode2)) | (-1650962791)) * (-366)) + (((~(iIdentityHashCode2 | (-2429221))) | (-1862269951)) * 366)));
                        i = i115 >>> 24;
                        int i116 = i115 & ViewCompat.MEASURED_SIZE_MASK;
                        if (i != 0) {
                            int i117 = asInterface + 125;
                            asBinder = i117 % 128;
                            i2 = 2;
                            int i118 = i117 % 2;
                            z = true;
                        } else {
                            i2 = 2;
                            z = false;
                        }
                        if (z) {
                            int i119 = asInterface + 101;
                            asBinder = i119 % 128;
                            int i24 = i119 % i2;
                            i3 = 1;
                        } else {
                            i3 = 0;
                        }
                        if (z || i116 >= 1 || (method = methodArr[i116]) == null) {
                            string = null;
                        } else {
                            int i25 = asInterface + 53;
                            asBinder = i25 % 128;
                            int i26 = i25 % 2;
                            string = method.toString();
                        }
                        arrayList.add(string);
                        if ((i + 6) * i3 == 0) {
                            return verify(str, (X509Certificate) peerCertificates[0]);
                        }
                        throw new NullPointerException();
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 != null) {
                            throw cause3;
                        }
                        throw th3;
                    }
                } catch (SSLException unused4) {
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 != null) {
                    throw cause4;
                }
                throw th4;
            }
            return false;
        } catch (SSLException unused5) {
            return i7;
        }
    }

    public final boolean verify(String str, X509Certificate x509Certificate) {
        int i = 2 % 2;
        if (!(!verifyAsIpAddress(str))) {
            int i2 = asBinder + 57;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                return verifyIpAddress(str, x509Certificate);
            }
            boolean zVerifyIpAddress = verifyIpAddress(str, x509Certificate);
            int i3 = 60 / 0;
            return zVerifyIpAddress;
        }
        boolean zVerifyHostName = verifyHostName(str, x509Certificate);
        int i4 = asInterface + 97;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return zVerifyHostName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static boolean verifyAsIpAddress(String str) {
        int i = 2 % 2;
        int i2 = asInterface + 9;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        boolean zMatches = VERIFY_AS_IP_ADDRESS.matcher(str).matches();
        int i4 = asBinder + 55;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return zMatches;
    }

    private boolean verifyIpAddress(String str, X509Certificate x509Certificate) {
        List<String> subjectAltNames;
        int size;
        int i;
        int i2 = 2 % 2;
        int i3 = asBinder + 91;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            subjectAltNames = getSubjectAltNames(x509Certificate, 43);
            size = subjectAltNames.size();
            i = 1;
        } else {
            subjectAltNames = getSubjectAltNames(x509Certificate, 7);
            size = subjectAltNames.size();
            i = 0;
        }
        while (i < size) {
            int i4 = asInterface + 13;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                str.equalsIgnoreCase(subjectAltNames.get(i));
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!(!str.equalsIgnoreCase(subjectAltNames.get(i)))) {
                return true;
            }
            i++;
        }
        return false;
    }

    private boolean verifyHostName(String str, X509Certificate x509Certificate) {
        String strFindMostSpecific;
        int i = 2 % 2;
        int i2 = asBinder + 23;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        String lowerCase = str.toLowerCase(Locale.US);
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 2);
        int size = subjectAltNames.size();
        int i4 = 0;
        boolean z = false;
        while (i4 < size) {
            int i5 = asInterface + 15;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            if (verifyHostName(lowerCase, subjectAltNames.get(i4))) {
                int i7 = asInterface + 25;
                asBinder = i7 % 128;
                int i8 = i7 % 2;
                return true;
            }
            i4++;
            int i9 = asBinder + 67;
            asInterface = i9 % 128;
            int i10 = i9 % 2;
            z = true;
        }
        if (z || (strFindMostSpecific = new DistinguishedNameParser(x509Certificate.getSubjectX500Principal()).findMostSpecific("cn")) == null) {
            return false;
        }
        return verifyHostName(lowerCase, strFindMostSpecific);
    }

    public static List<String> allSubjectAltNames(X509Certificate x509Certificate) {
        int i = 2 % 2;
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 7);
        List<String> subjectAltNames2 = getSubjectAltNames(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(subjectAltNames.size() + subjectAltNames2.size());
        arrayList.addAll(subjectAltNames);
        arrayList.addAll(subjectAltNames2);
        int i2 = asInterface + 3;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0020 A[SYNTHETIC] */
    private static List<String> getSubjectAltNames(X509Certificate x509Certificate, int i) {
        int i2;
        Integer num;
        String str;
        int i3 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                int i4 = asBinder + 65;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                return Collections.emptyList();
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null) {
                    int i6 = asInterface + 15;
                    asBinder = i6 % 128;
                    if (i6 % 2 != 0) {
                        if (list.size() < 4) {
                            i2 = asBinder + 45;
                            asInterface = i2 % 128;
                            if (i2 % 2 == 0) {
                                int i7 = 3 % 3;
                            }
                        } else {
                            num = (Integer) list.get(0);
                            if (num == null && num.intValue() == i && (str = (String) list.get(1)) != null) {
                                arrayList.add(str);
                                int i8 = asInterface + 115;
                                asBinder = i8 % 128;
                                int i9 = i8 % 2;
                            }
                        }
                    } else if (list.size() < 2) {
                        i2 = asBinder + 45;
                        asInterface = i2 % 128;
                        if (i2 % 2 == 0) {
                            int i10 = 3 % 3;
                        }
                    } else {
                        num = (Integer) list.get(0);
                        if (num == null) {
                        }
                    }
                }
            }
            int i11 = asInterface + 81;
            asBinder = i11 % 128;
            if (i11 % 2 == 0) {
                return arrayList;
            }
            throw null;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    private boolean verifyHostName(String str, String str2) {
        int i = 2 % 2;
        if (str != null) {
            int i2 = asInterface + 119;
            asBinder = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                str.length();
                throw null;
            }
            if (str.length() != 0 && !str.startsWith(".")) {
                int i3 = asBinder + 57;
                asInterface = i3 % 128;
                if (i3 % 2 == 0) {
                    str.endsWith("..");
                    obj.hashCode();
                    throw null;
                }
                if (!str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".")) {
                    int i4 = asBinder + 45;
                    asInterface = i4 % 128;
                    if (i4 % 2 == 0) {
                        str2.endsWith("..");
                        obj.hashCode();
                        throw null;
                    }
                    if (!str2.endsWith("..")) {
                        if (!str.endsWith(".")) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str);
                            sb.append('.');
                            str = sb.toString();
                            int i5 = asInterface + 61;
                            asBinder = i5 % 128;
                            int i6 = i5 % 2;
                        }
                        if (!str2.endsWith(".")) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str2);
                            sb2.append('.');
                            str2 = sb2.toString();
                        }
                        String lowerCase = str2.toLowerCase(Locale.US);
                        if (!lowerCase.contains("*")) {
                            return str.equals(lowerCase);
                        }
                        if (lowerCase.startsWith("*.")) {
                            int i7 = asBinder + 21;
                            asInterface = i7 % 128;
                            int i8 = i7 % 2;
                            if (lowerCase.indexOf(42, 1) == -1) {
                                int i9 = asBinder + 85;
                                asInterface = i9 % 128;
                                int i10 = i9 % 2;
                                if (str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                                    return false;
                                }
                                String strSubstring = lowerCase.substring(1);
                                if (str.endsWith(strSubstring)) {
                                    int length = str.length() - strSubstring.length();
                                    return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
                                }
                                int i11 = asBinder + 69;
                                asInterface = i11 % 128;
                                return i11 % 2 == 0;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    static void b() {
        TuitionPaymentFragmentbindingInflater1 = -6377398940819159759L;
        b = 1501617788;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (char) 34097;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, byte r7, short r8) {
        /*
            int r8 = r8 * 3
            int r8 = 4 - r8
            int r7 = r7 * 4
            int r0 = r7 + 1
            int r6 = 104 - r6
            byte[] r1 = com.squareup.okhttp.internal.tls.OkHostnameVerifier.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L29
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            r3 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L29:
            int r3 = r3 + 1
            int r6 = -r6
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.tls.OkHostnameVerifier.$$g(byte, byte, short):java.lang.String");
    }
}
