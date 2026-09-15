package com.bpjstku.data.lib;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
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
import androidx.core.view.ViewCompat;
import defpackage.M;
import defpackage.deInitSession;
import defpackage.initSession;
import defpackage.lambdasetOnImageAvailableListener1androidxcameracoreAndroidImageReaderProxy;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import okhttp3.Authenticator;
import okhttp3.Dispatcher;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/bpjstku/data/lib/OkHttpClientFactory;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "Lokhttp3/Interceptor;", "p1", "Lokhttp3/Authenticator;", "p2", "", "p3", "Lokhttp3/OkHttpClient;", "create", "(Landroid/content/Context;[Lokhttp3/Interceptor;Lokhttp3/Authenticator;Z)Lokhttp3/OkHttpClient;", "", "DEFAULT_MAX_REQUEST", "I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OkHttpClientFactory {
    public static final int $stable = 0;
    private static final int DEFAULT_MAX_REQUEST = 30;
    public static final OkHttpClientFactory INSTANCE;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static char b;
    private static final byte[] $$c = {30, 17, -35, 104};
    private static final int $$f = 71;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {36, -74, -79, -21, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$e = 180;
    private static final byte[] $$a = {117, 57, 101, -72, 2, 5, 32, -32, -1, 20, -8, 20, 3, -6, 1, 10, 2, -14, 17, 2, 13};
    private static final int $$b = 114;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int d = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 + 97
            int r9 = r9 * 13
            int r9 = 17 - r9
            int r8 = r8 * 9
            int r8 = 14 - r8
            byte[] r0 = com.bpjstku.data.lib.OkHttpClientFactory.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r4 = r2
            r9 = r8
            goto L2b
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r7 = -r7
            int r3 = r3 + 1
            int r9 = r9 + r7
            int r7 = r9 + 5
            r9 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.lib.OkHttpClientFactory.c(byte, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 52
            int r0 = r8 + 1
            int r6 = r6 + 4
            byte[] r1 = com.bpjstku.data.lib.OkHttpClientFactory.$$d
            int r7 = 103 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2b
        L13:
            r3 = r2
        L14:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2b:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.lib.OkHttpClientFactory.e(byte, byte, int, java.lang.Object[]):void");
    }

    private OkHttpClientFactory() {
    }

    /* JADX WARN: Code duplicated, block: B:114:0x08e9  */
    /* JADX WARN: Code duplicated, block: B:144:0x0aeb A[PHI: r3
  0x0aeb: PHI (r3v52 int) = (r3v51 int), (r3v53 int) binds: [B:143:0x0ae9, B:140:0x0ae4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:146:0x0aef  */
    /* JADX WARN: Code duplicated, block: B:151:0x0b02  */
    /* JADX WARN: Code duplicated, block: B:153:0x0b08 A[LOOP:2: B:152:0x0b06->B:153:0x0b08, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:156:0x0b18  */
    /* JADX WARN: Code duplicated, block: B:158:0x0b1d  */
    /* JADX WARN: Code duplicated, block: B:161:0x0b44  */
    /* JADX WARN: Code duplicated, block: B:71:0x0573  */
    /* JADX WARN: Code duplicated, block: B:73:0x0577  */
    /* JADX WARN: Multi-variable type inference failed */
    public final OkHttpClient create(Context p0, Interceptor[] p1, Authenticator p2, boolean p3) throws Throwable {
        X509TrustManager x509TrustManager;
        String string;
        int i;
        String string2;
        int length;
        int i2;
        int i3 = 2 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{29, '\t', '\t', 6, 3, 17, 6, 7, 29, 1, 25, 19, '!', 14, 16, 25, 1, 0, 31, 17, 1, 3, '!', 6}, (byte) (119 - KeyEvent.getDeadChar(0, 0)), 24 - ExpandableListView.getPackedPositionType(0L), objArr);
        String str = (String) objArr[0];
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        lambdasetOnImageAvailableListener1androidxcameracoreAndroidImageReaderProxy lambdasetonimageavailablelistener1androidxcameracoreandroidimagereaderproxy = lambdasetOnImageAvailableListener1androidxcameracoreAndroidImageReaderProxy.INSTANCE;
        Intrinsics.checkNotNullParameter(p0, "");
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(lambdasetOnImageAvailableListener1androidxcameracoreAndroidImageReaderProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        Intrinsics.checkNotNull(trustManagerFactory);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                Intrinsics.checkNotNull(trustManager, "");
                X509TrustManager x509TrustManager2 = (X509TrustManager) trustManager;
                OkHttpClient.Builder builderConnectTimeout = new OkHttpClient.Builder().readTimeout(600L, TimeUnit.SECONDS).connectTimeout(600L, TimeUnit.SECONDS);
                ArrayList arrayList = new ArrayList();
                int iIntValue = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, this)).intValue();
                byte b2 = $$a[14];
                byte b3 = (byte) (b2 - 1);
                Object[] objArr2 = new Object[1];
                c(b3, b3, b2, objArr2);
                Method[] methodArr = {OkHttpClient.Builder.class.getMethod((String) objArr2[0], Interceptor.class)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                    int i4 = 2823 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 23;
                    byte[] bArr = $$d;
                    byte b4 = bArr[5];
                    Object[] objArr3 = new Object[1];
                    e((byte) (-b4), bArr[10], b4, objArr3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(touchSlop, i4, bitsPerPixel, 1814927978, false, (String) objArr3[0], null);
                }
                int i5 = 12;
                if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) != null) {
                    x509TrustManager = x509TrustManager2;
                    break;
                }
                Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getLongPressTimeout() >> 16) + 2823, (Process.myTid() >> 22) + 22)).getDeclaredMethods();
                int length2 = declaredMethods.length;
                int i6 = 0;
                while (true) {
                    if (i6 >= length2) {
                        x509TrustManager = x509TrustManager2;
                        break;
                    }
                    Method method = declaredMethods[i6];
                    try {
                        Class<?> cls = Class.forName(str);
                        char[] cArr = new char[i5];
                        // fill-array-data instruction
                        cArr[0] = 31;
                        cArr[1] = 19;
                        cArr[2] = 5;
                        cArr[3] = 30;
                        cArr[4] = '!';
                        cArr[5] = 6;
                        cArr[6] = 26;
                        cArr[7] = '#';
                        cArr[8] = 25;
                        cArr[9] = 17;
                        cArr[10] = 20;
                        cArr[11] = 22;
                        Method[] methodArr2 = declaredMethods;
                        int i7 = length2;
                        Object[] objArr4 = new Object[1];
                        a(cArr, (byte) (ImageFormat.getBitsPerPixel(0) + 10), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 11, objArr4);
                        Object[] objArr5 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr4[0], null).invoke(method, null)).intValue())};
                        Object[] objArr6 = new Object[1];
                        a(new char[]{29, '\t', '\t', 6, 3, 17, 6, 7, 29, 1, 25, 19, '!', 14, 16, 25, 1, 0, 30, 31, 11, 27, '#', 26, 19, 25}, (byte) (KeyEvent.keyCodeFromString("") + 6), TextUtils.getOffsetAfter("", 0) + 26, objArr6);
                        Class<?> cls2 = Class.forName((String) objArr6[0]);
                        x509TrustManager = x509TrustManager2;
                        Object[] objArr7 = new Object[1];
                        a(new char[]{27, 23, 23, '\b', 5, 24, 7, 14}, (byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 20), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 7, objArr7);
                        if (((Boolean) cls2.getMethod((String) objArr7[0], Integer.TYPE).invoke(null, objArr5)).booleanValue()) {
                            Class cls3 = Long.TYPE;
                            Class<?> cls4 = Class.forName(str);
                            Object[] objArr8 = new Object[1];
                            a(new char[]{31, 19, 4, '\f', '\f', 1, '\r', 23, '\n', 0, 30, 21, 13889}, (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 67), 13 - View.resolveSize(0, 0), objArr8);
                            if (cls3.equals(cls4.getMethod((String) objArr8[0], null).invoke(method, null))) {
                                Class<?> cls5 = Class.forName(str);
                                Object[] objArr9 = new Object[1];
                                a(new char[]{31, 19, 1, 30, 7, 23, '\n', '#', '\f', 1, 19, 25, 3, Typography.quote, 19, '\f', 13842}, (byte) (Color.rgb(0, 0, 0) + 16777257), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 18, objArr9);
                                Object[] objArr10 = (Object[]) cls5.getMethod((String) objArr9[0], null).invoke(method, null);
                                if (objArr10.length == 2 && Long.TYPE.equals(objArr10[0]) && Class.forName(str).equals(objArr10[1])) {
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                                        int i8 = 2824 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                        int i9 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 21;
                                        byte[] bArr2 = $$d;
                                        byte b5 = bArr2[5];
                                        Object[] objArr11 = new Object[1];
                                        e((byte) (-b5), bArr2[10], b5, objArr11);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(pressedStateDuration, i8, i9, 1814927978, false, (String) objArr11[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char c = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
                                        int iMyTid = (Process.myTid() >> 22) + 2823;
                                        int iGreen = Color.green(0) + 22;
                                        byte[] bArr3 = $$d;
                                        byte b6 = bArr3[5];
                                        Object[] objArr12 = new Object[1];
                                        e((byte) (-b6), bArr3[10], b6, objArr12);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, iMyTid, iGreen, 1814927978, false, (String) objArr12[0], null);
                                    }
                                    try {
                                        Object[] objArr13 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                            char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                                            int absoluteGravity = 2823 - Gravity.getAbsoluteGravity(0, 0);
                                            int iIndexOf = 22 - TextUtils.indexOf("", "");
                                            byte b7 = $$d[7];
                                            Object[] objArr14 = new Object[1];
                                            e((byte) 51, b7, b7, objArr14);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(threadPriority, absoluteGravity, iIndexOf, -2137287382, false, (String) objArr14[0], new Class[]{Long.TYPE, Method.class});
                                        }
                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr13)).longValue();
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
                        }
                        i6++;
                        length2 = i7;
                        declaredMethods = methodArr2;
                        x509TrustManager2 = x509TrustManager;
                        i5 = 12;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                }
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                    int scrollBarFadeDuration = 2823 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int iAxisFromString = MotionEvent.axisFromString("") + 23;
                    byte[] bArr4 = $$d;
                    byte b8 = bArr4[5];
                    Object[] objArr15 = new Object[1];
                    e((byte) (-b8), bArr4[10], b8, objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionChild, scrollBarFadeDuration, iAxisFromString, 1814927978, false, (String) objArr15[0], null);
                }
                Object[] objArr16 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c2 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int mirror = 2871 - AndroidCharacter.getMirror('0');
                    int i10 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 21;
                    byte[] bArr5 = $$d;
                    Object[] objArr17 = new Object[1];
                    e((byte) 51, (byte) (bArr5[19] - 1), bArr5[7], objArr17);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, mirror, i10, 1025296417, false, (String) objArr17[0], new Class[]{Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr16);
                Object[] objArr18 = {0, methodArr, null};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                    char cIndexOf = (char) (37657 - TextUtils.indexOf("", ""));
                    int i11 = 2720 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int trimmedLength = 19 - TextUtils.getTrimmedLength("");
                    byte[] bArr6 = $$d;
                    Object[] objArr19 = new Object[1];
                    e((byte) 51, (byte) (bArr6[19] - 1), bArr6[7], objArr19);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf, i11, trimmedLength, -1568796068, false, (String) objArr19[0], new Class[]{Integer.TYPE, Method[].class, List.class});
                }
                long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr18)).longValue();
                long j = 298075425;
                long j2 = (((long) 659) * j) + (((long) (-657)) * jLongValue);
                long j3 = -1;
                long j4 = ((j ^ j3) | jLongValue) ^ j3;
                long j5 = ((jLongValue ^ j3) | j) ^ j3;
                long startUptimeMillis = (j | ((long) ((int) Process.getStartUptimeMillis()))) ^ j3;
                long j6 = 658;
                long j7 = j2 + (((long) (-658)) * (j4 | j5 | startUptimeMillis)) + (j6 * j5) + (j6 * (j5 | startUptimeMillis)) + ((long) (-2108481270));
                int startUptimeMillis2 = (int) Process.getStartUptimeMillis();
                int i12 = ((int) (j7 >> 32)) & (301181908 + (((~((-1477083697) | (~startUptimeMillis2))) | 39857285) * (-591)) + ((startUptimeMillis2 | (-1477083697)) * 591));
                int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                int i13 = 818884229 + (((~((-919900131) | startElapsedRealtime)) | 847252066 | (~((-1937840756) | startElapsedRealtime))) * (-880));
                int i14 = (~((-919900131) | (~startElapsedRealtime))) | 1937840755;
                int i15 = ~(startElapsedRealtime | 919900130);
                int i16 = i12 | (((int) j7) & (i13 + ((i14 | i15) * (-880)) + (i15 * 880)));
                int i17 = i16 >>> 24;
                int i18 = i16 & ViewCompat.MEASURED_SIZE_MASK;
                int i19 = i17 != 0 ? 1 : 0;
                if (i19 != 0) {
                    int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
                    d = i20 % 128;
                    if (i20 % 2 == 0) {
                        int i21 = 97 / 0;
                        if (i18 < 1) {
                            Method method2 = methodArr[i18];
                            string = method2 != null ? method2.toString() : null;
                        }
                    } else if (i18 < 1) {
                        Method method3 = methodArr[i18];
                        if (method3 != null) {
                        }
                    }
                }
                arrayList.add(string);
                if ((i17 + 6) * i19 != 0) {
                    Toast.makeText((Context) null, iIntValue / (((iIntValue - 1) * iIntValue) % 2), 0).show();
                }
                OkHttpClient.Builder builderRetryOnConnectionFailure = builderConnectTimeout.retryOnConnectionFailure(true);
                lambdasetOnImageAvailableListener1androidxcameracoreAndroidImageReaderProxy lambdasetonimageavailablelistener1androidxcameracoreandroidimagereaderproxy2 = lambdasetOnImageAvailableListener1androidxcameracoreAndroidImageReaderProxy.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "");
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                int iIntValue2 = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, lambdasetonimageavailablelistener1androidxcameracoreandroidimagereaderproxy2)).intValue();
                if (M.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new ArrayList()) != 0) {
                    throw new RuntimeException(String.valueOf(iIntValue2));
                }
                Intrinsics.checkNotNullParameter(p0, "");
                TrustManagerFactory trustManagerFactory2 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory2.init(lambdasetOnImageAvailableListener1androidxcameracoreAndroidImageReaderProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                Intrinsics.checkNotNull(trustManagerFactory2);
                sSLContext.init(null, trustManagerFactory2.getTrustManagers(), null);
                Intrinsics.checkNotNull(sSLContext);
                SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
                Intrinsics.checkNotNullExpressionValue(socketFactory, "");
                OkHttpClient.Builder builderSslSocketFactory = builderRetryOnConnectionFailure.sslSocketFactory(socketFactory, x509TrustManager);
                ArrayList arrayList2 = new ArrayList();
                byte b9 = $$a[14];
                byte b10 = b9;
                Object[] objArr20 = new Object[1];
                c(b9, b10, (byte) (b10 - 1), objArr20);
                Method[] methodArr3 = {OkHttpClient.Builder.class.getMethod((String) objArr20[0], new Class[0])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                    char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int iResolveSize = View.resolveSize(0, 0) + 2823;
                    int i22 = 23 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    byte[] bArr7 = $$d;
                    byte b11 = bArr7[5];
                    Object[] objArr21 = new Object[1];
                    e((byte) (-b11), bArr7[10], b11, objArr21);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(keyRepeatDelay, iResolveSize, i22, 1814927978, false, (String) objArr21[0], null);
                }
                if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).get(null) == null) {
                    Method[] declaredMethods2 = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 2823 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), View.getDefaultSize(0, 0) + 22)).getDeclaredMethods();
                    int length3 = declaredMethods2.length;
                    int i23 = 0;
                    while (i23 < length3) {
                        Method method4 = declaredMethods2[i23];
                        int i24 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
                        d = i24 % 128;
                        int i25 = i24 % 2;
                        try {
                            Class<?> cls6 = Class.forName(str);
                            Object[] objArr22 = new Object[1];
                            a(new char[]{31, 19, 5, 30, '!', 6, 26, '#', 25, 17, 20, 22}, (byte) ((ViewConfiguration.getEdgeSlop() >> 16) + 9), 13 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr22);
                            Object[] objArr23 = {Integer.valueOf(((Integer) cls6.getMethod((String) objArr22[0], null).invoke(method4, null)).intValue())};
                            Object[] objArr24 = new Object[1];
                            a(new char[]{29, '\t', '\t', 6, 3, 17, 6, 7, 29, 1, 25, 19, '!', 14, 16, 25, 1, 0, 30, 31, 11, 27, '#', 26, 19, 25}, (byte) (ExpandableListView.getPackedPositionType(0L) + 6), View.resolveSizeAndState(0, 0, 0) + 26, objArr24);
                            Class<?> cls7 = Class.forName((String) objArr24[0]);
                            Method[] methodArr4 = declaredMethods2;
                            Object[] objArr25 = new Object[1];
                            a(new char[]{27, 23, 23, '\b', 5, 24, 7, 14}, (byte) (21 - TextUtils.getCapsMode("", 0, 0)), 8 - KeyEvent.keyCodeFromString(""), objArr25);
                            if (((Boolean) cls7.getMethod((String) objArr25[0], Integer.TYPE).invoke(null, objArr23)).booleanValue()) {
                                Class cls8 = Long.TYPE;
                                Class<?> cls9 = Class.forName(str);
                                Object[] objArr26 = new Object[1];
                                a(new char[]{31, 19, 4, '\f', '\f', 1, '\r', 23, '\n', 0, 30, 21, 13889}, (byte) (66 - (ViewConfiguration.getScrollBarSize() >> 8)), 13 - TextUtils.indexOf("", "", 0, 0), objArr26);
                                if (cls8.equals(cls9.getMethod((String) objArr26[0], null).invoke(method4, null))) {
                                    int i26 = d + 29;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i26 % 128;
                                    int i27 = i26 % 2;
                                    Class<?> cls10 = Class.forName(str);
                                    Object[] objArr27 = new Object[1];
                                    a(new char[]{31, 19, 1, 30, 7, 23, '\n', '#', '\f', 1, 19, 25, 3, Typography.quote, 19, '\f', 13842}, (byte) (42 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (ViewConfiguration.getEdgeSlop() >> 16) + 17, objArr27);
                                    Object[] objArr28 = (Object[]) cls10.getMethod((String) objArr27[0], null).invoke(method4, null);
                                    if (objArr28.length == 2 && Long.TYPE.equals(objArr28[0]) && Class.forName(str).equals(objArr28[1])) {
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                                            char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                                            int i28 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2823;
                                            int iMakeMeasureSpec = 22 - View.MeasureSpec.makeMeasureSpec(0, 0);
                                            byte[] bArr8 = $$d;
                                            byte b12 = bArr8[5];
                                            Object[] objArr29 = new Object[1];
                                            e((byte) (-b12), bArr8[10], b12, objArr29);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cMakeMeasureSpec, i28, iMakeMeasureSpec, 1814927978, false, (String) objArr29[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).set(null, method4);
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                                            char cIndexOf2 = (char) TextUtils.indexOf("", "", 0);
                                            int longPressTimeout = 2823 - (ViewConfiguration.getLongPressTimeout() >> 16);
                                            int trimmedLength2 = TextUtils.getTrimmedLength("") + 22;
                                            byte[] bArr9 = $$d;
                                            byte b13 = bArr9[5];
                                            Object[] objArr30 = new Object[1];
                                            e((byte) (-b13), bArr9[10], b13, objArr30);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cIndexOf2, longPressTimeout, trimmedLength2, 1814927978, false, (String) objArr30[0], null);
                                        }
                                        Object[] objArr31 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null)};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                                            char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                                            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 2823;
                                            int iAxisFromString2 = 21 - MotionEvent.axisFromString("");
                                            byte b14 = $$d[7];
                                            Object[] objArr32 = new Object[1];
                                            e((byte) 51, b14, b14, objArr32);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cNormalizeMetaState, iNormalizeMetaState, iAxisFromString2, -2137287382, false, (String) objArr32[0], new Class[]{Long.TYPE, Method.class});
                                        }
                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr31)).longValue();
                                        break;
                                    }
                                }
                            }
                            i23++;
                            declaredMethods2 = methodArr4;
                        } catch (Throwable th3) {
                            Throwable cause3 = th3.getCause();
                            if (cause3 != null) {
                                throw cause3;
                            }
                            throw th3;
                        }
                    }
                }
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                    char c3 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                    int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2823;
                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 22;
                    byte[] bArr10 = $$d;
                    byte b15 = bArr10[5];
                    Object[] objArr33 = new Object[1];
                    e((byte) (-b15), bArr10[10], b15, objArr33);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c3, maximumDrawingCacheSize, jumpTapTimeout, 1814927978, false, (String) objArr33[0], null);
                }
                Object[] objArr34 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).get(null)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char c4 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                    int i29 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2822;
                    int deadChar = KeyEvent.getDeadChar(0, 0) + 22;
                    byte[] bArr11 = $$d;
                    Object[] objArr35 = new Object[1];
                    e((byte) 51, (byte) (bArr11[19] - 1), bArr11[7], objArr35);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c4, i29, deadChar, 1025296417, false, (String) objArr35[0], new Class[]{Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).invoke(null, objArr34);
                Object[] objArr36 = {0, methodArr3, null};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char defaultSize = (char) (View.getDefaultSize(0, 0) + 37657);
                    int i30 = 2721 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    int i31 = 18 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    byte[] bArr12 = $$d;
                    Object[] objArr37 = new Object[1];
                    e((byte) 51, (byte) (bArr12[19] - 1), bArr12[7], objArr37);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(defaultSize, i30, i31, -1568796068, false, (String) objArr37[0], new Class[]{Integer.TYPE, Method[].class, List.class});
                }
                long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).invoke(null, objArr36)).longValue();
                long j8 = -1525324384;
                long j9 = 399;
                long j10 = (j9 * j8) + (j9 * jLongValue2);
                long j11 = 398;
                long j12 = ((j8 ^ j3) | jLongValue2) ^ j3;
                long j13 = jLongValue2 ^ j3;
                long j14 = (j13 | j8) ^ j3;
                long jIdentityHashCode = System.identityHashCode(this);
                long j15 = j10 + ((j12 | j14 | ((j13 | jIdentityHashCode) ^ j3)) * j11) + (((long) (-1194)) * (jLongValue2 | j8)) + (j11 * (((j13 | (jIdentityHashCode ^ j3)) ^ j3) | j12 | j14)) + ((long) (-285081461));
                int iIdentityHashCode = System.identityHashCode(this);
                int i32 = ((int) (j15 >> 32)) & ((-1404069378) + (((~((~iIdentityHashCode) | (-271093769))) | (~((-1259735638) | iIdentityHashCode))) * (-302)) + ((~((-271093769) | iIdentityHashCode)) * (-604)) + (((~(iIdentityHashCode | (-1530829406))) | 67175842) * 302));
                int startUptimeMillis3 = (int) Process.getStartUptimeMillis();
                int i33 = ~startUptimeMillis3;
                int i34 = i32 | (((int) j15) & ((-1687905466) + (((~((-1897127162) | i33)) | 960613724) * (-90)) + (((~((-1897127162) | startUptimeMillis3)) | (-2035539454)) * (-45)) + (((~(startUptimeMillis3 | (-960613725))) | (-1897127162) | (~(i33 | 960613724))) * 45)));
                int i35 = i34 >>> 24;
                int i36 = i34 & ViewCompat.MEASURED_SIZE_MASK;
                int i37 = i35 != 0 ? 1 : 0;
                if (i37 != 0) {
                    int i38 = d + 111;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i38 % 128;
                    if (i38 % 2 == 0) {
                        i = 0;
                        if (i36 < 1) {
                            Method method5 = methodArr3[i36];
                            if (method5 != null) {
                            }
                        }
                        arrayList2.add(string2);
                        if ((i35 + 6) * i37 != 0) {
                            throw null;
                        }
                        length = p1.length;
                        for (i2 = i; i2 < length; i2++) {
                            builderSslSocketFactory.addInterceptor(p1[i2]);
                        }
                        if (p2 != null) {
                            builderSslSocketFactory.authenticator(p2);
                        }
                        if (p3) {
                            HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(null, 1, null == true ? 1 : 0);
                            httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.BODY);
                            builderSslSocketFactory.addInterceptor(httpLoggingInterceptor).build();
                        }
                        Dispatcher dispatcher = new Dispatcher();
                        dispatcher.setMaxRequests(30);
                        builderSslSocketFactory.dispatcher(dispatcher);
                        return builderSslSocketFactory.build();
                    }
                    i = 0;
                    int i39 = 8 / 0;
                    if (i36 < 1) {
                        Method method6 = methodArr3[i36];
                        string2 = method6 != null ? method6.toString() : null;
                    }
                    arrayList2.add(string2);
                    if ((i35 + 6) * i37 != 0) {
                        throw null;
                    }
                    length = p1.length;
                    while (i2 < length) {
                        builderSslSocketFactory.addInterceptor(p1[i2]);
                    }
                    if (p2 != null) {
                        builderSslSocketFactory.authenticator(p2);
                    }
                    if (p3) {
                        HttpLoggingInterceptor httpLoggingInterceptor2 = new HttpLoggingInterceptor(null, 1, null == true ? 1 : 0);
                        httpLoggingInterceptor2.level(HttpLoggingInterceptor.Level.BODY);
                        builderSslSocketFactory.addInterceptor(httpLoggingInterceptor2).build();
                    }
                    Dispatcher dispatcher2 = new Dispatcher();
                    dispatcher2.setMaxRequests(30);
                    builderSslSocketFactory.dispatcher(dispatcher2);
                    return builderSslSocketFactory.build();
                }
                i = 0;
                arrayList2.add(string2);
                if ((i35 + 6) * i37 != 0) {
                    throw null;
                }
                length = p1.length;
                while (i2 < length) {
                    builderSslSocketFactory.addInterceptor(p1[i2]);
                }
                if (p2 != null) {
                    builderSslSocketFactory.authenticator(p2);
                }
                if (p3) {
                    HttpLoggingInterceptor httpLoggingInterceptor3 = new HttpLoggingInterceptor(null, 1, null == true ? 1 : 0);
                    httpLoggingInterceptor3.level(HttpLoggingInterceptor.Level.BODY);
                    builderSslSocketFactory.addInterceptor(httpLoggingInterceptor3).build();
                }
                Dispatcher dispatcher3 = new Dispatcher();
                dispatcher3.setMaxRequests(30);
                builderSslSocketFactory.dispatcher(dispatcher3);
                return builderSslSocketFactory.build();
            }
        }
        throw new IllegalStateException("Unexpected default trust managers:".concat(String.valueOf(Arrays.toString(trustManagers))));
    }

    private static void a(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        int length;
        char[] cArr2;
        char c = 2;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        long j = 0;
        int i4 = 1770390596;
        char c2 = '0';
        if (cArr3 != null) {
            int i5 = $11 + 47;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 + 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (1 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1))), 2315 - AndroidCharacter.getMirror(c2), 33 - View.MeasureSpec.getMode(0), -1927765101, false, $$g(b3, b4, (byte) (b4 - 3)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i6++;
                    j = 0;
                    i4 = 1770390596;
                    c2 = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i7 = $11 + 93;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 3 / 3;
            }
            cArr3 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(b)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            byte b5 = (byte) 0;
            byte b6 = (byte) (b5 + 3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 2268 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 32, -1927765101, false, $$g(b5, b6, (byte) (b6 - 3)), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i9 = $10 + 85;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            } else {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            }
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = deinitsession;
                    objArr4[11] = Integer.valueOf(cCharValue);
                    objArr4[10] = deinitsession;
                    objArr4[9] = deinitsession;
                    objArr4[8] = Integer.valueOf(cCharValue);
                    objArr4[7] = deinitsession;
                    objArr4[6] = deinitsession;
                    objArr4[5] = Integer.valueOf(cCharValue);
                    objArr4[4] = deinitsession;
                    objArr4[3] = deinitsession;
                    objArr4[c] = Integer.valueOf(cCharValue);
                    objArr4[1] = deinitsession;
                    objArr4[0] = deinitsession;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = (byte) (b7 + 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (49266 - TextUtils.lastIndexOf("", '0', 0)), TextUtils.lastIndexOf("", '0', 0) + 3262, 30 - View.resolveSizeAndState(0, 0, 0), -127612708, false, $$g(b7, b8, (byte) (b8 - 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b9 = (byte) 0;
                            byte b10 = b9;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (22878 - TextUtils.getOffsetAfter("", 0)), 594 - (Process.myTid() >> 22), 17 - (ViewConfiguration.getScrollBarSize() >> 8), 1570859318, false, $$g(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        int i10 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i10];
                    } else if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                        deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                        deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                        int i11 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                        int i12 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i11];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i12];
                    } else {
                        int i13 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                        int i14 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i13];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i14];
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                c = 2;
            }
        }
        for (int i15 = 0; i15 < i; i15++) {
            cArr4[i15] = (char) (cArr4[i15] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        INSTANCE = new OkHttpClientFactory();
        int i = TuitionPaymentFragmentbindingInflater1 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new char[]{60047, 59745, 60051, 60057, 60079, 60117, 60053, 59746, 60045, 60063, 59749, 60058, 59748, 60062, 60048, 60055, 60073, 60046, 60043, 60041, 60085, 60040, 59744, 59751, 59747, 60060, 60059, 60049, 60056, 60050, 60052, 60075, 60061, 60034, 60054, 60086};
        b = (char) 57191;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r5, byte r6, short r7) {
        /*
            int r5 = r5 * 4
            int r5 = r5 + 4
            int r7 = r7 * 4
            int r0 = r7 + 1
            byte[] r1 = com.bpjstku.data.lib.OkHttpClientFactory.$$c
            int r6 = 116 - r6
            byte[] r0 = new byte[r0]
            r2 = -1
            if (r1 != 0) goto L14
            r3 = r6
            r6 = r5
            goto L27
        L14:
            r4 = r6
            r6 = r5
            r5 = r4
        L17:
            int r2 = r2 + 1
            byte r3 = (byte) r5
            r0[r2] = r3
            if (r2 != r7) goto L25
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            return r5
        L25:
            r3 = r1[r6]
        L27:
            int r3 = -r3
            int r5 = r5 + r3
            int r6 = r6 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.lib.OkHttpClientFactory.$$g(byte, byte, short):java.lang.String");
    }
}
