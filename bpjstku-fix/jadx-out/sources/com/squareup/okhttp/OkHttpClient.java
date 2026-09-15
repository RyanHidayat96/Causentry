package com.squareup.okhttp;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.collection.SieveCacheKt;
import com.squareup.okhttp.internal.Internal;
import com.squareup.okhttp.internal.InternalCache;
import com.squareup.okhttp.internal.RouteDatabase;
import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.http.AuthenticatorAdapter;
import com.squareup.okhttp.internal.http.StreamAllocation;
import com.squareup.okhttp.internal.io.RealConnection;
import com.squareup.okhttp.internal.tls.OkHostnameVerifier;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.CookieHandler;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes6.dex */
public class OkHttpClient implements Cloneable {
    private static SSLSocketFactory defaultSslSocketFactory;
    private Authenticator authenticator;
    private Cache cache;
    private CertificatePinner certificatePinner;
    private int connectTimeout;
    private ConnectionPool connectionPool;
    private List<ConnectionSpec> connectionSpecs;
    private CookieHandler cookieHandler;
    private Dispatcher dispatcher;
    private Dns dns;
    private boolean followRedirects;
    private boolean followSslRedirects;
    private HostnameVerifier hostnameVerifier;
    private final List<Interceptor> interceptors;
    private InternalCache internalCache;
    private final List<Interceptor> networkInterceptors;
    private List<Protocol> protocols;
    private Proxy proxy;
    private ProxySelector proxySelector;
    private int readTimeout;
    private boolean retryOnConnectionFailure;
    private final RouteDatabase routeDatabase;
    private SocketFactory socketFactory;
    private SSLSocketFactory sslSocketFactory;
    private int writeTimeout;
    private static final List<Protocol> DEFAULT_PROTOCOLS = Util.immutableList(Protocol.HTTP_2, Protocol.SPDY_3, Protocol.HTTP_1_1);
    private static final List<ConnectionSpec> DEFAULT_CONNECTION_SPECS = Util.immutableList(ConnectionSpec.MODERN_TLS, ConnectionSpec.COMPATIBLE_TLS, ConnectionSpec.CLEARTEXT);

    static {
        Internal.instance = new Internal() { // from class: com.squareup.okhttp.OkHttpClient.1
            private static final byte[] $$c = {12, -88, 33, 118};
            private static final int $$f = 219;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {49, 89, 41, 48, -4, 11, 11, 19, 10, -6, 22, -38, 39, 21, 1, 22, -8, -52, 57, 42, -3, 20, -2, 15, 8, -21, 26, 33, -3, 1, 18, 15, -37, 53, -8, 15, 15, 1, 18, 15, -9, 16, 14, -1, 14, 14, 2, -21, 46, 1, 15, -2, 28, -6, 22, -56, 42, -3, 20, -2, 15, 8, -21, 26, 33, -3, 1, 18, 15, -37, 53, -8, 15, 15, 1, 18, 15, 8, 6, -2, 7, 15, 1, 20, 6, 14, 7, 6, 14, 0, 8, 27, -4, 5, 27, -33, 43, -2, 10, 16, 1, 10, 10, 4, 29, 0, 17, -57};
            private static final int $$e = 2;
            private static final byte[] $$a = {25, 31, 20, 1, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
            private static final int $$b = 142;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
            private static char[] TuitionPaymentFragmentbindingInflater1 = {45565, 22517, 32246, 1019, 10735, 53206, 54738, 64387, 33227, 42960, 19956, 21378, 31153, 8116, 9610, 52112, 53633, 63400, 40334, 41846, 18803, 28516, 45561, 22519, 32243, 1017, 10739, 53210, 54738, 64511, 33217, 42946, 19894, 21413, 31137, 8106, 9627, 45565, 22517, 32246, 1019, 10735, 53206, 54738, 64387, 33221, 42963, 19882, 21503, 31113, 8100, 9610, 52124, 53658, 63362, 40342, 41824, 18756, 28519, 30068, 7000, 8533, 51031, 45567, 22510, 32224, 1019, 10725, 53201, 54722, 64492, 33236, 42963, 19894, 21432, 31147, 8102, 9610, 52124, 53635, 63365, 62511, 4643, 14397, 17969, 27767, 35338, 36878, 48666, 50202, 57940, 2128, 5745, 15458, 23146, 24642, 36417, 47493, 24463, 30087, 2967, 8580, 51110, 56754, 62372, 35228, 44978, 17881, 23497, 29179, 6104, 11754, 50144};
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1482169869663623067L;

            private static void a(int i, byte b, byte b2, Object[] objArr) {
                int i2 = i + 4;
                byte[] bArr = $$a;
                int i3 = (b * 14) + 84;
                byte[] bArr2 = new byte[b2 + 1];
                int i4 = -1;
                if (bArr == null) {
                    i3 = (i3 + (-b2)) - 11;
                }
                while (true) {
                    i4++;
                    bArr2[i4] = (byte) i3;
                    i2++;
                    if (i4 == b2) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    }
                    i3 = (i3 + (-bArr[i2])) - 11;
                }
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0029  */
            /* JADX WARN: Code duplicated, block: B:8:0x0021  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0032). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(int r6, int r7, short r8, java.lang.Object[] r9) {
                /*
                    int r7 = r7 * 52
                    int r7 = 56 - r7
                    int r6 = r6 * 30
                    int r6 = 114 - r6
                    byte[] r0 = com.squareup.okhttp.OkHttpClient.AnonymousClass1.$$d
                    int r8 = r8 * 2
                    int r1 = 53 - r8
                    byte[] r1 = new byte[r1]
                    int r8 = 52 - r8
                    r2 = 0
                    if (r0 != 0) goto L18
                    r3 = r7
                    r4 = r2
                    goto L32
                L18:
                    r3 = r2
                L19:
                    r5 = r7
                    r7 = r6
                    r6 = r5
                    byte r4 = (byte) r7
                    r1[r3] = r4
                    if (r3 != r8) goto L29
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L29:
                    int r3 = r3 + 1
                    r4 = r0[r6]
                    r5 = r7
                    r7 = r6
                    r6 = r4
                    r4 = r3
                    r3 = r5
                L32:
                    int r7 = r7 + 1
                    int r3 = r3 + r6
                    int r6 = r3 + (-9)
                    r3 = r4
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.OkHttpClient.AnonymousClass1.c(int, int, short, java.lang.Object[]):void");
            }

            private static void b(int i, int i2, char c, Object[] objArr) throws Throwable {
                int i3 = 2 % 2;
                lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
                long[] jArr = new long[i2];
                lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                int i4 = $10 + 107;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                    int i6 = $10 + 59;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    int i8 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    try {
                        Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1[i + i8])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b = (byte) 0;
                            byte b2 = (byte) (b - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 2187 - ExpandableListView.getPackedPositionType(0L), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 40, 841711447, false, $$g(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                        }
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i8), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = (byte) (b3 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 33016), ExpandableListView.getPackedPositionChild(0L) + 3012, 27 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 321985076, false, $$g(b3, b4, (byte) (b4 + 3)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i8] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                        Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = (byte) (b5 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0') + 36506), 3376 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 'A' - AndroidCharacter.getMirror('0'), -968507904, false, $$g(b5, b6, (byte) (-b6)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                char[] cArr = new char[i2];
                lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                    cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                    try {
                        Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b7 = (byte) 0;
                            byte b8 = (byte) (b7 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 36505), 3375 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), View.combineMeasuredStates(0, 0) + 17, -968507904, false, $$g(b7, b8, (byte) (-b8)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                objArr[0] = new String(cArr);
                int i9 = $11 + 125;
                $10 = i9 % 128;
                int i10 = i9 % 2;
            }

            @Override // com.squareup.okhttp.internal.Internal
            public final void addLenient(Headers.Builder builder, String str) throws Throwable {
                Object[] objArr;
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 31;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                int i3 = i2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                int i4 = 0;
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char c = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 651;
                    int iIndexOf = TextUtils.indexOf("", "", 0) + 44;
                    byte[] bArr = $$a;
                    byte b = bArr[80];
                    byte b2 = bArr[7];
                    Object[] objArr2 = new Object[1];
                    a(b, b2, (byte) (b2 | 52), objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iNormalizeMetaState, iIndexOf, -459846511, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                b(ViewConfiguration.getJumpTapTimeout() >> 16, (ViewConfiguration.getPressedStateDuration() >> 16) + 22, (char) (ExpandableListView.getPackedPositionChild(0L) + 1), objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                b((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 21, 15 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 651;
                    int iGreen = 44 - Color.green(0);
                    byte[] bArr2 = $$a;
                    Object[] objArr5 = new Object[1];
                    a((byte) 51, bArr2[3], bArr2[7], objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(doubleTapTimeout, keyRepeatTimeout, iGreen, -873460649, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                        int packedPositionType2 = 651 - ExpandableListView.getPackedPositionType(0L);
                        int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 45;
                        byte b3 = $$a[7];
                        Object[] objArr6 = new Object[1];
                        a((byte) 51, b3, (byte) (b3 | 37), objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionType, packedPositionType2, bitsPerPixel, -1595579076, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                    int i5 = ((int[]) objArr7[2])[0];
                    int i6 = ((int[]) objArr7[0])[0];
                    int iUptimeMillis = (int) SystemClock.uptimeMillis();
                    int i7 = ~iUptimeMillis;
                    int i8 = (~(986063216 | i7)) | (-989756283) | (~(989494026 | i7));
                    int i9 = ((((-1639205345) + (((~(iUptimeMillis | (-985800961))) | i8) * 590)) + (i8 * (-1180))) + (((~((-989494027) | i7)) | (~(i7 | (-986063217)))) * 590)) - 1828184508;
                    int i10 = (i9 << 13) ^ i9;
                    int i11 = i10 ^ (i10 >>> 17);
                    ((int[]) objArr[3])[0] = i11 ^ (i11 << 5);
                } else {
                    try {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) Color.red(0), (ViewConfiguration.getEdgeSlop() >> 16) + 1610, TextUtils.indexOf("", "", 0, 0) + 26, 2145681644, false, null, new Class[0]);
                        }
                        Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), -1828184508, 0};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                            int iAlpha = 651 - Color.alpha(0);
                            int i12 = 45 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                            byte[] bArr3 = $$a;
                            Object[] objArr9 = new Object[1];
                            a((byte) 51, bArr3[3], bArr3[7], objArr9);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maxKeyCode, iAlpha, i12, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) TextUtils.getOffsetAfter("", 0), 694 - TextUtils.indexOf((CharSequence) "", '0'), Color.green(0) + 98), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63406 - Color.blue(0)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 793, 84 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), Integer.TYPE, Integer.TYPE});
                        }
                        Object[] objArr10 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                            int iBlue = Color.blue(0) + 651;
                            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 45;
                            byte b4 = $$a[7];
                            Object[] objArr11 = new Object[1];
                            a((byte) 51, b4, (byte) (b4 | 37), objArr11);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(threadPriority, iBlue, modifierMetaStateMask, -1595579076, false, (String) objArr11[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr10);
                        try {
                            Object[] objArr12 = new Object[1];
                            b(TextUtils.indexOf("", ""), TextUtils.getOffsetAfter("", 0) + 22, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), objArr12);
                            Class<?> cls2 = Class.forName((String) objArr12[0]);
                            Object[] objArr13 = new Object[1];
                            b(22 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), Color.argb(0, 0, 0, 0) + 15, (char) View.resolveSize(0, 0), objArr13);
                            long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                char cIndexOf = (char) TextUtils.indexOf("", "");
                                int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 651;
                                int packedPositionType3 = ExpandableListView.getPackedPositionType(0L) + 44;
                                byte[] bArr4 = $$a;
                                Object[] objArr14 = new Object[1];
                                a((byte) 51, bArr4[3], bArr4[7], objArr14);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf, keyRepeatDelay, packedPositionType3, -873460649, false, (String) objArr14[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                                char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                                int fadingEdgeLength = 651 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                                int iGreen2 = 44 - Color.green(0);
                                byte[] bArr5 = $$a;
                                byte b5 = bArr5[80];
                                byte b6 = bArr5[7];
                                Object[] objArr15 = new Object[1];
                                a(b5, b6, (byte) (b6 | 52), objArr15);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(edgeSlop, fadingEdgeLength, iGreen2, -459846511, false, (String) objArr15[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                            objArr = objArr10;
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                int i13 = ((int[]) objArr[0])[0];
                int i14 = ((int[]) objArr[2])[0];
                if (i14 != i13) {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr[1];
                    if (strArr != null) {
                        while (i4 < strArr.length) {
                            int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i15 % 128;
                            if (i15 % 2 == 0) {
                                arrayList.add(strArr[i4]);
                                i4 += 8;
                            } else {
                                arrayList.add(strArr[i4]);
                                i4++;
                            }
                        }
                    }
                    throw new RuntimeException(String.valueOf(i14));
                }
                int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 67;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16 % 128;
                int i17 = i16 % 2;
                Object[] objArr16 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
                int i18 = ((int[]) objArr[3])[0];
                int i19 = ((int[]) objArr[2])[0];
                int i20 = ((int[]) objArr[0])[0];
                int i21 = ~(((int) Process.getStartElapsedRealtime()) | 262081079);
                int i22 = i18 + ((((-16104107) | i21) * (-658)) - 1477931117) + ((i21 | (-268417728)) * 658);
                int i23 = (i22 << 13) ^ i22;
                int i24 = i23 ^ (i23 >>> 17);
                ((int[]) objArr16[3])[0] = i24 ^ (i24 << 5);
                int i25 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i25 % 128;
                int i26 = i25 % 2;
                builder.addLenient(str);
            }

            @Override // com.squareup.okhttp.internal.Internal
            public final void addLenient(Headers.Builder builder, String str, String str2) {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                int i3 = i2 % 2;
                builder.addLenient(str, str2);
                if (i3 == 0) {
                    int i4 = 38 / 0;
                }
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // com.squareup.okhttp.internal.Internal
            public final void setCache(OkHttpClient okHttpClient, InternalCache internalCache) {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                int i3 = i2 % 2;
                okHttpClient.setInternalCache(internalCache);
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                int i5 = i4 % 2;
            }

            @Override // com.squareup.okhttp.internal.Internal
            public final InternalCache internalCache(OkHttpClient okHttpClient) {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 13;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                int i3 = i2 % 2;
                InternalCache internalCache = okHttpClient.internalCache();
                if (i3 != 0) {
                    int i4 = 25 / 0;
                }
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 78 / 0;
                }
                return internalCache;
            }

            @Override // com.squareup.okhttp.internal.Internal
            public final boolean connectionBecameIdle(ConnectionPool connectionPool, RealConnection realConnection) {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 115;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                if (i2 % 2 == 0) {
                    return connectionPool.connectionBecameIdle(realConnection);
                }
                connectionPool.connectionBecameIdle(realConnection);
                throw null;
            }

            @Override // com.squareup.okhttp.internal.Internal
            public final RealConnection get(ConnectionPool connectionPool, Address address, StreamAllocation streamAllocation) {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                int i3 = i2 % 2;
                RealConnection realConnection = connectionPool.get(address, streamAllocation);
                if (i3 == 0) {
                    int i4 = 45 / 0;
                }
                return realConnection;
            }

            /* JADX WARN: Code duplicated, block: B:22:0x0219  */
            @Override // com.squareup.okhttp.internal.Internal
            public final void put(ConnectionPool connectionPool, RealConnection realConnection) throws Throwable {
                Object[] objArr;
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 93;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                int i3 = i2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char keyRepeatDelay = (char) (31533 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                    int i4 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 921;
                    int iKeyCodeFromString = 28 - KeyEvent.keyCodeFromString("");
                    byte[] bArr = $$a;
                    Object[] objArr2 = new Object[1];
                    a((byte) 51, bArr[3], bArr[7], objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatDelay, i4, iKeyCodeFromString, -1048449946, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                b((-1) - Process.getGidForName(""), ImageFormat.getBitsPerPixel(0) + 23, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                b(22 - (ViewConfiguration.getLongPressTimeout() >> 16), 15 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char keyRepeatDelay2 = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 31533);
                    int iLastIndexOf = 920 - TextUtils.lastIndexOf("", '0');
                    int i5 = 28 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    byte b = $$a[7];
                    Object[] objArr5 = new Object[1];
                    a((byte) 88, b, (byte) (b | 52), objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(keyRepeatDelay2, iLastIndexOf, i5, -778300370, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 31533);
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 922;
                        int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 29;
                        byte b2 = $$a[7];
                        Object[] objArr6 = new Object[1];
                        a((byte) 51, b2, (byte) (b2 | 37), objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(deadChar, iIndexOf, iIndexOf2, -1142834547, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i6 = ((((-1626139589) + (((~(iIdentityHashCode | 500656397)) | (-1273423247)) * (-668))) + ((500656397 | (~((-1273423247) | iIdentityHashCode))) * 1336)) + ((iIdentityHashCode | (-1109427331)) * 668)) - 1336131425;
                    int i7 = (i6 << 13) ^ i6;
                    int i8 = i7 ^ (i7 >>> 17);
                    ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
                } else {
                    Object[] objArr8 = new Object[1];
                    b('U' - AndroidCharacter.getMirror('0'), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 26, (char) View.MeasureSpec.getSize(0), objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    b(Color.alpha(0) + 63, 18 - Color.green(0), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr9);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        if (applicationContext instanceof ContextWrapper) {
                            int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
                            int i10 = i9 % 2;
                            if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                                applicationContext = applicationContext.getApplicationContext();
                            } else {
                                applicationContext = null;
                            }
                        } else {
                            applicationContext = applicationContext.getApplicationContext();
                        }
                    }
                    Object[] objArr10 = new Object[1];
                    b((ViewConfiguration.getWindowTouchSlop() >> 8) + 81, KeyEvent.getDeadChar(0, 0) + 16, (char) (17881 - KeyEvent.normalizeMetaState(0)), objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    b(96 - TextUtils.lastIndexOf("", '0', 0), Gravity.getAbsoluteGravity(0, 0) + 16, (char) (2160 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), objArr11);
                    try {
                        Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -1336131425};
                        byte[] bArr2 = $$d;
                        byte b3 = bArr2[89];
                        Object[] objArr13 = new Object[1];
                        c(b3, bArr2[14], b3, objArr13);
                        Class<?> cls4 = Class.forName((String) objArr13[0]);
                        byte b4 = bArr2[14];
                        byte b5 = bArr2[89];
                        Object[] objArr14 = new Object[1];
                        c(b4, b5, b5, objArr14);
                        objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char mode = (char) (View.MeasureSpec.getMode(0) + 31533);
                            int packedPositionGroup = 921 - ExpandableListView.getPackedPositionGroup(0L);
                            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 28;
                            byte b6 = $$a[7];
                            Object[] objArr15 = new Object[1];
                            a((byte) 51, b6, (byte) (b6 | 37), objArr15);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(mode, packedPositionGroup, pressedStateDuration, -1142834547, false, (String) objArr15[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                        try {
                            Object[] objArr16 = new Object[1];
                            b(ExpandableListView.getPackedPositionGroup(0L), 22 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (ViewConfiguration.getEdgeSlop() >> 16), objArr16);
                            Class<?> cls5 = Class.forName((String) objArr16[0]);
                            Object[] objArr17 = new Object[1];
                            b(22 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 15 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) Color.red(0), objArr17);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char maximumFlingVelocity = (char) (31533 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                                int windowTouchSlop = 921 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                                int i11 = 29 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                byte b7 = $$a[7];
                                Object[] objArr18 = new Object[1];
                                a((byte) 88, b7, (byte) (b7 | 52), objArr18);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maximumFlingVelocity, windowTouchSlop, i11, -778300370, false, (String) objArr18[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 31534);
                                int i12 = 920 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 29;
                                byte[] bArr3 = $$a;
                                Object[] objArr19 = new Object[1];
                                a((byte) 51, bArr3[3], bArr3[7], objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, i12, modifierMetaStateMask, -1048449946, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                int i13 = ((int[]) objArr[1])[0];
                int i14 = ((int[]) objArr[3])[0];
                if (i14 == i13) {
                    int i15 = ((int[]) objArr[0])[0];
                    Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                    int iIdentityHashCode2 = System.identityHashCode(this);
                    int i16 = ~iIdentityHashCode2;
                    int i17 = i15 + 1506327343 + (((~((-81329373) | i16)) | (~(iIdentityHashCode2 | 1692750271))) * 333) + (((~(iIdentityHashCode2 | (-81329373))) | (~(i16 | 1692750271))) * 333);
                    int i18 = (i17 << 13) ^ i17;
                    int i19 = i18 ^ (i18 >>> 17);
                    ((int[]) objArr20[0])[0] = i19 ^ (i19 << 5);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr[4];
                    if (strArr != null) {
                        int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i20 % 128;
                        int i21 = i20 % 2;
                        for (String str : strArr) {
                            arrayList.add(str);
                        }
                    }
                    int[] iArr = new int[i14];
                    int i22 = i14 - 1;
                    iArr[i22] = 1;
                    Toast.makeText((Context) null, iArr[((i14 * i22) % 2) - 1], 1).show();
                    int i23 = ((int[]) objArr[0])[0];
                    Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                    int i24 = ~System.identityHashCode(this);
                    int i25 = i23 + 1540759319 + ((~(1593724539 | i24)) * 52) + (((~(517603424 | i24)) | (~((-1256476220) | i24)) | 1076121115) * (-52)) + (((~(i24 | (-517603425))) | 337248320) * 52);
                    int i26 = (i25 << 13) ^ i25;
                    int i27 = i26 ^ (i26 >>> 17);
                    ((int[]) objArr21[0])[0] = i27 ^ (i27 << 5);
                    int i28 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i28 % 128;
                    int i29 = i28 % 2;
                }
                connectionPool.put(realConnection);
            }

            @Override // com.squareup.okhttp.internal.Internal
            public final RouteDatabase routeDatabase(ConnectionPool connectionPool) {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 53;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                int i3 = i2 % 2;
                RouteDatabase routeDatabase = connectionPool.routeDatabase;
                if (i3 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                int i5 = i4 % 2;
                return routeDatabase;
            }

            @Override // com.squareup.okhttp.internal.Internal
            public final void callEnqueue(Call call, Callback callback, boolean z) {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                int i3 = i2 % 2;
                call.enqueue(callback, z);
                if (i3 == 0) {
                    int i4 = 9 / 0;
                }
            }

            @Override // com.squareup.okhttp.internal.Internal
            public final StreamAllocation callEngineGetStreamAllocation(Call call) {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                int i3 = i2 % 2;
                StreamAllocation streamAllocation = call.engine.streamAllocation;
                if (i3 != 0) {
                    return streamAllocation;
                }
                throw null;
            }

            @Override // com.squareup.okhttp.internal.Internal
            public final void apply(ConnectionSpec connectionSpec, SSLSocket sSLSocket, boolean z) {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 37;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                int i3 = i2 % 2;
                connectionSpec.apply(sSLSocket, z);
                if (i3 != 0) {
                    int i4 = 0 / 0;
                }
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            @Override // com.squareup.okhttp.internal.Internal
            public final HttpUrl getHttpUrlChecked(String str) throws Throwable {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                int i3 = i2 % 2;
                HttpUrl checked = HttpUrl.getChecked(str);
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                int i5 = i4 % 2;
                return checked;
            }

            private static String $$g(byte b, int i, byte b2) {
                byte[] bArr = $$c;
                int i2 = b * 3;
                int i3 = i + 4;
                int i4 = (b2 * 3) + 109;
                byte[] bArr2 = new byte[1 - i2];
                int i5 = 0 - i2;
                int i6 = -1;
                if (bArr == null) {
                    i4 += -i5;
                }
                while (true) {
                    i6++;
                    bArr2[i6] = (byte) i4;
                    if (i6 == i5) {
                        return new String(bArr2, 0);
                    }
                    i3++;
                    i4 += -bArr[i3];
                }
            }
        };
    }

    public OkHttpClient() {
        this.interceptors = new ArrayList();
        this.networkInterceptors = new ArrayList();
        this.followSslRedirects = true;
        this.followRedirects = true;
        this.retryOnConnectionFailure = true;
        this.connectTimeout = 10000;
        this.readTimeout = 10000;
        this.writeTimeout = 10000;
        this.routeDatabase = new RouteDatabase();
        this.dispatcher = new Dispatcher();
    }

    private OkHttpClient(OkHttpClient okHttpClient) {
        ArrayList arrayList = new ArrayList();
        this.interceptors = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.networkInterceptors = arrayList2;
        this.followSslRedirects = true;
        this.followRedirects = true;
        this.retryOnConnectionFailure = true;
        this.connectTimeout = 10000;
        this.readTimeout = 10000;
        this.writeTimeout = 10000;
        this.routeDatabase = okHttpClient.routeDatabase;
        this.dispatcher = okHttpClient.dispatcher;
        this.proxy = okHttpClient.proxy;
        this.protocols = okHttpClient.protocols;
        this.connectionSpecs = okHttpClient.connectionSpecs;
        arrayList.addAll(okHttpClient.interceptors);
        arrayList2.addAll(okHttpClient.networkInterceptors);
        this.proxySelector = okHttpClient.proxySelector;
        this.cookieHandler = okHttpClient.cookieHandler;
        Cache cache = okHttpClient.cache;
        this.cache = cache;
        this.internalCache = cache != null ? cache.internalCache : okHttpClient.internalCache;
        this.socketFactory = okHttpClient.socketFactory;
        this.sslSocketFactory = okHttpClient.sslSocketFactory;
        this.hostnameVerifier = okHttpClient.hostnameVerifier;
        this.certificatePinner = okHttpClient.certificatePinner;
        this.authenticator = okHttpClient.authenticator;
        this.connectionPool = okHttpClient.connectionPool;
        this.dns = okHttpClient.dns;
        this.followSslRedirects = okHttpClient.followSslRedirects;
        this.followRedirects = okHttpClient.followRedirects;
        this.retryOnConnectionFailure = okHttpClient.retryOnConnectionFailure;
        this.connectTimeout = okHttpClient.connectTimeout;
        this.readTimeout = okHttpClient.readTimeout;
        this.writeTimeout = okHttpClient.writeTimeout;
    }

    public void setConnectTimeout(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException("timeout < 0");
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        long millis = timeUnit.toMillis(j);
        if (millis > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException("Timeout too large.");
        }
        if (millis == 0 && j > 0) {
            throw new IllegalArgumentException("Timeout too small.");
        }
        this.connectTimeout = (int) millis;
    }

    public int getConnectTimeout() {
        return this.connectTimeout;
    }

    public void setReadTimeout(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException("timeout < 0");
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        long millis = timeUnit.toMillis(j);
        if (millis > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException("Timeout too large.");
        }
        if (millis == 0 && j > 0) {
            throw new IllegalArgumentException("Timeout too small.");
        }
        this.readTimeout = (int) millis;
    }

    public int getReadTimeout() {
        return this.readTimeout;
    }

    public void setWriteTimeout(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException("timeout < 0");
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        long millis = timeUnit.toMillis(j);
        if (millis > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException("Timeout too large.");
        }
        if (millis == 0 && j > 0) {
            throw new IllegalArgumentException("Timeout too small.");
        }
        this.writeTimeout = (int) millis;
    }

    public int getWriteTimeout() {
        return this.writeTimeout;
    }

    public OkHttpClient setProxy(Proxy proxy) {
        this.proxy = proxy;
        return this;
    }

    public Proxy getProxy() {
        return this.proxy;
    }

    public OkHttpClient setProxySelector(ProxySelector proxySelector) {
        this.proxySelector = proxySelector;
        return this;
    }

    public ProxySelector getProxySelector() {
        return this.proxySelector;
    }

    public OkHttpClient setCookieHandler(CookieHandler cookieHandler) {
        this.cookieHandler = cookieHandler;
        return this;
    }

    public CookieHandler getCookieHandler() {
        return this.cookieHandler;
    }

    void setInternalCache(InternalCache internalCache) {
        this.internalCache = internalCache;
        this.cache = null;
    }

    InternalCache internalCache() {
        return this.internalCache;
    }

    public OkHttpClient setCache(Cache cache) {
        this.cache = cache;
        this.internalCache = null;
        return this;
    }

    public Cache getCache() {
        return this.cache;
    }

    public OkHttpClient setDns(Dns dns) {
        this.dns = dns;
        return this;
    }

    public Dns getDns() {
        return this.dns;
    }

    public OkHttpClient setSocketFactory(SocketFactory socketFactory) {
        this.socketFactory = socketFactory;
        return this;
    }

    public SocketFactory getSocketFactory() {
        return this.socketFactory;
    }

    public OkHttpClient setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.sslSocketFactory = sSLSocketFactory;
        return this;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    public OkHttpClient setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.hostnameVerifier = hostnameVerifier;
        return this;
    }

    public HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    public OkHttpClient setCertificatePinner(CertificatePinner certificatePinner) {
        this.certificatePinner = certificatePinner;
        return this;
    }

    public CertificatePinner getCertificatePinner() {
        return this.certificatePinner;
    }

    public OkHttpClient setAuthenticator(Authenticator authenticator) {
        this.authenticator = authenticator;
        return this;
    }

    public Authenticator getAuthenticator() {
        return this.authenticator;
    }

    public OkHttpClient setConnectionPool(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
        return this;
    }

    public ConnectionPool getConnectionPool() {
        return this.connectionPool;
    }

    public OkHttpClient setFollowSslRedirects(boolean z) {
        this.followSslRedirects = z;
        return this;
    }

    public boolean getFollowSslRedirects() {
        return this.followSslRedirects;
    }

    public void setFollowRedirects(boolean z) {
        this.followRedirects = z;
    }

    public boolean getFollowRedirects() {
        return this.followRedirects;
    }

    public void setRetryOnConnectionFailure(boolean z) {
        this.retryOnConnectionFailure = z;
    }

    public boolean getRetryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    RouteDatabase routeDatabase() {
        return this.routeDatabase;
    }

    public OkHttpClient setDispatcher(Dispatcher dispatcher) {
        if (dispatcher == null) {
            throw new IllegalArgumentException("dispatcher == null");
        }
        this.dispatcher = dispatcher;
        return this;
    }

    public Dispatcher getDispatcher() {
        return this.dispatcher;
    }

    public OkHttpClient setProtocols(List<Protocol> list) {
        List listImmutableList = Util.immutableList(list);
        if (!listImmutableList.contains(Protocol.HTTP_1_1)) {
            throw new IllegalArgumentException("protocols doesn't contain http/1.1: ".concat(String.valueOf(listImmutableList)));
        }
        if (listImmutableList.contains(Protocol.HTTP_1_0)) {
            throw new IllegalArgumentException("protocols must not contain http/1.0: ".concat(String.valueOf(listImmutableList)));
        }
        if (listImmutableList.contains(null)) {
            throw new IllegalArgumentException("protocols must not contain null");
        }
        this.protocols = Util.immutableList(listImmutableList);
        return this;
    }

    public List<Protocol> getProtocols() {
        return this.protocols;
    }

    public OkHttpClient setConnectionSpecs(List<ConnectionSpec> list) {
        this.connectionSpecs = Util.immutableList(list);
        return this;
    }

    public List<ConnectionSpec> getConnectionSpecs() {
        return this.connectionSpecs;
    }

    public List<Interceptor> interceptors() {
        return this.interceptors;
    }

    public List<Interceptor> networkInterceptors() {
        return this.networkInterceptors;
    }

    public Call newCall(Request request) {
        return new Call(this, request);
    }

    public OkHttpClient cancel(Object obj) {
        getDispatcher().cancel(obj);
        return this;
    }

    OkHttpClient copyWithDefaults() {
        OkHttpClient okHttpClient = new OkHttpClient(this);
        if (okHttpClient.proxySelector == null) {
            okHttpClient.proxySelector = ProxySelector.getDefault();
        }
        if (okHttpClient.cookieHandler == null) {
            okHttpClient.cookieHandler = CookieHandler.getDefault();
        }
        if (okHttpClient.socketFactory == null) {
            okHttpClient.socketFactory = SocketFactory.getDefault();
        }
        if (okHttpClient.sslSocketFactory == null) {
            okHttpClient.sslSocketFactory = getDefaultSSLSocketFactory();
        }
        if (okHttpClient.hostnameVerifier == null) {
            okHttpClient.hostnameVerifier = OkHostnameVerifier.INSTANCE;
        }
        if (okHttpClient.certificatePinner == null) {
            okHttpClient.certificatePinner = CertificatePinner.DEFAULT;
        }
        if (okHttpClient.authenticator == null) {
            okHttpClient.authenticator = AuthenticatorAdapter.INSTANCE;
        }
        if (okHttpClient.connectionPool == null) {
            okHttpClient.connectionPool = ConnectionPool.getDefault();
        }
        if (okHttpClient.protocols == null) {
            okHttpClient.protocols = DEFAULT_PROTOCOLS;
        }
        if (okHttpClient.connectionSpecs == null) {
            okHttpClient.connectionSpecs = DEFAULT_CONNECTION_SPECS;
        }
        if (okHttpClient.dns == null) {
            okHttpClient.dns = Dns.SYSTEM;
        }
        return okHttpClient;
    }

    private SSLSocketFactory getDefaultSSLSocketFactory() {
        SSLSocketFactory sSLSocketFactory;
        synchronized (this) {
            if (defaultSslSocketFactory == null) {
                try {
                    SSLContext sSLContext = SSLContext.getInstance("TLS");
                    sSLContext.init(null, null, null);
                    defaultSslSocketFactory = sSLContext.getSocketFactory();
                } catch (GeneralSecurityException unused) {
                    throw new AssertionError();
                }
            }
            sSLSocketFactory = defaultSslSocketFactory;
        }
        return sSLSocketFactory;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public OkHttpClient m8018clone() {
        return new OkHttpClient(this);
    }
}
