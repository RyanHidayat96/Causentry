package defpackage;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.libraries.places.internal.zzrt;
import com.koushikdutta.async.AsyncSSLException;
import com.koushikdutta.async.AsyncServer;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.StrictHostnameVerifier;

/* JADX INFO: loaded from: classes4.dex */
public final class isLongerInAnyEdge implements lambdanew0androidxcameracoreprocessingSurfaceEdgeSettableSurface, UseCaseConfigUtil {
    private static final byte[] $$d;
    private static int IconCompatParcelizer;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static SSLContext f1222a;
    private static SSLContext asInterface;
    private static int disconnect;
    private static boolean getExtras;
    private static int getNotifyChildrenChangedOptions;
    private static boolean getRoot;
    private static char[] write;
    private boolean INotificationSideChannel;
    private getAbsolutePathFromUri INotificationSideChannelDefault;
    private getExif INotificationSideChannelStub;
    private boolean INotificationSideChannelStubProxy;
    private X509Certificate[] MediaBrowserCompat;
    private int RemoteActionCompatParcelizer;
    boolean TuitionPaymentFragmentbindingInflater1;
    SSLEngine TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    Exception TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private boolean asBinder;
    boolean b;
    private HostnameVerifier cancel;
    private lambdasnapshot8androidxcameracoreprocessingDefaultSurfaceProcessor cancelAll;
    private TrustManager[] connect;
    final AutoValue_Packet d = new AutoValue_Packet();
    lambdaonOutputSurface3androidxcameracoreprocessingDefaultSurfaceProcessor g;
    private String getInterfaceDescriptor;
    private TuitionPaymentFragmentspecialinlinedviewModeldefault1 notify;
    private lambdasnapshot8androidxcameracoreprocessingDefaultSurfaceProcessor onTransact;
    private AutoValue_Packet read;
    private static final byte[] $$c = {84, 10, 24, -102};
    private static final int $$f = 47;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final int $$e = 88;
    private static final byte[] $$a = {70, -114, 113, 8, 2, -8, 8};
    private static final int $$b = 23;
    private static int getItem = 0;
    private static int search = 1;

    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Exception exc, UseCaseConfigUtil useCaseConfigUtil);
    }

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i6;
        int i8 = ~i5;
        int i9 = ~i3;
        int i10 = (~(i7 | i8 | i9)) | (~(i6 | i5));
        int i11 = ~(i3 | i5);
        int i12 = i10 | i11;
        int i13 = ~(i7 | i5);
        int i14 = i11 | i7 | (~(i8 | i9));
        int i15 = i6 + i5 + i4 + (1349231875 * i) + (1735201104 * i2);
        int i16 = i15 * i15;
        int i17 = ((-413510627) * i6) + 1558183936 + (237349861 * i5) + (i12 * 325430244) + (325430244 * i13) + ((-325430244) * i14) + ((-88080384) * i4) + ((-1337982976) * i) + (469762048 * i2) + (1272971264 * i16);
        int i18 = ((i6 * 236314795) - 374860141) + (i5 * 236313123) + (i12 * (-836)) + (i13 * (-836)) + (i14 * 836) + (i4 * 236313959) + (i * (-66979019)) + (i2 * (-1872492752)) + (i16 * (-417333248));
        int i19 = i17 + (i18 * i18 * 639631360);
        if (i19 == 1) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        if (i19 != 2) {
            return i19 != 3 ? TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        return b(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 4
            int r8 = 105 - r8
            int r7 = r7 + 4
            byte[] r0 = defpackage.isLongerInAnyEdge.$$a
            int r6 = r6 * 2
            int r6 = r6 + 4
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2e
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r3 = r3 + r7
            int r7 = r3 + 3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isLongerInAnyEdge.c(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(int r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 52
            int r6 = 56 - r6
            int r5 = 103 - r5
            int r7 = r7 * 52
            int r0 = 53 - r7
            byte[] r1 = defpackage.isLongerInAnyEdge.$$d
            byte[] r0 = new byte[r0]
            int r7 = 52 - r7
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r5
            r5 = r7
            r3 = r2
            goto L29
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L25:
            int r3 = r3 + 1
            r4 = r1[r6]
        L29:
            int r5 = r5 + r4
            int r5 = r5 + (-11)
            int r6 = r6 + 1
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isLongerInAnyEdge.e(int, byte, int, java.lang.Object[]):void");
    }

    static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(isLongerInAnyEdge islongerinanyedge, SSLEngineResult.HandshakeStatus handshakeStatus) {
        int i = 2 % 2;
        int i2 = search + 39;
        getItem = i2 % 128;
        int i3 = i2 % 2;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zzrt.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzrt.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentbindingInflater1(zzrt.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), zzrt.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1060342514, new Object[]{islongerinanyedge, handshakeStatus}, 1060342516);
        int i4 = getItem + 27;
        search = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(isLongerInAnyEdge islongerinanyedge, Exception exc) {
        int i = 2 % 2;
        int i2 = search + 57;
        getItem = i2 % 128;
        int i3 = i2 % 2;
        islongerinanyedge.TuitionPaymentFragmentspecialinlinedviewModeldefault3(exc);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = search + 5;
        getItem = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 57 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0251  */
    /* JADX WARN: Code duplicated, block: B:33:0x029d  */
    /* JADX WARN: Code duplicated, block: B:37:0x02f9 A[Catch: all -> 0x0599, TryCatch #1 {all -> 0x0599, blocks: (B:35:0x02e4, B:37:0x02f9, B:38:0x033b, B:50:0x03a3, B:52:0x03b0, B:53:0x03f6, B:55:0x0412, B:56:0x0466), top: B:98:0x02e4 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x053f  */
    static {
        int i;
        String string;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        byte[] bArr = {83, -4, -55, -17, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
        $$d = bArr;
        disconnect = 0;
        getNotifyChildrenChangedOptions = 1;
        INotificationSideChannel();
        ArrayList arrayList = new ArrayList();
        Class<?> cls = Class.forName("javax.net.ssl.SSLContext");
        byte b = (byte) 0;
        byte b2 = (byte) (b - 1);
        Object[] objArr = new Object[1];
        c(b, b2, (byte) (b2 + 1), objArr);
        Method[] methodArr = {cls.getMethod((String) objArr[0], KeyManager[].class, TrustManager[].class, Class.forName("java.security.SecureRandom"))};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
            int i2 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2823;
            int trimmedLength = TextUtils.getTrimmedLength("") + 22;
            Object[] objArr2 = new Object[1];
            e(bArr[54], (byte) (-bArr[5]), bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionGroup, i2, trimmedLength, 1814927978, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null) == null) {
            Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 2824 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), View.MeasureSpec.getSize(0) + 22)).getDeclaredMethods();
            int length = declaredMethods.length;
            int i3 = 2 % 2;
            int i4 = 0;
            while (true) {
                if (i4 < length) {
                    Method method = declaredMethods[i4];
                    try {
                        Object[] objArr3 = new Object[1];
                        f(null, null, TextUtils.getCapsMode("", 0, 0) + 127, new byte[]{-112, -113, -114, -116, -119, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr3);
                        Class<?> cls2 = Class.forName((String) objArr3[0]);
                        Object[] objArr4 = new Object[1];
                        f(null, null, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 127, new byte[]{-110, -120, -119, -111, -118, -111, -112, -113, -115, -116, -119, -121}, objArr4);
                        Object[] objArr5 = {Integer.valueOf(((Integer) cls2.getMethod((String) objArr4[0], null).invoke(method, null)).intValue())};
                        Object[] objArr6 = new Object[1];
                        f(null, null, (ViewConfiguration.getTapTimeout() >> 16) + 127, new byte[]{-120, -119, -111, -118, -111, -112, -113, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr6);
                        Class<?> cls3 = Class.forName((String) objArr6[0]);
                        Object[] objArr7 = new Object[1];
                        f(null, null, 127 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), new byte[]{-119, -125, -111, -116, -126, -109, -110, -111}, objArr7);
                        if (((Boolean) cls3.getMethod((String) objArr7[0], Integer.TYPE).invoke(null, objArr5)).booleanValue()) {
                            Class cls4 = Long.TYPE;
                            Object[] objArr8 = new Object[1];
                            f(null, null, Color.alpha(0) + 127, new byte[]{-112, -113, -114, -116, -119, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr8);
                            Class<?> cls5 = Class.forName((String) objArr8[0]);
                            Object[] objArr9 = new Object[1];
                            f(null, null, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 126, new byte[]{-119, -104, -105, -106, -122, -120, -107, -116, -119, -108, -116, -119, -121}, objArr9);
                            if (cls4.equals(cls5.getMethod((String) objArr9[0], null).invoke(method, null))) {
                                Object[] objArr10 = new Object[1];
                                f(null, null, (ViewConfiguration.getTapTimeout() >> 16) + 127, new byte[]{-112, -113, -114, -116, -119, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr10);
                                Class<?> cls6 = Class.forName((String) objArr10[0]);
                                Object[] objArr11 = new Object[1];
                                f(null, null, 128 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), new byte[]{-110, -119, -104, -105, -106, -120, -119, -116, -119, -102, -126, -120, -126, -103, -116, -119, -121}, objArr11);
                                Object[] objArr12 = (Object[]) cls6.getMethod((String) objArr11[0], null).invoke(method, null);
                                if (objArr12.length == 2 && Long.TYPE.equals(objArr12[0])) {
                                    int i5 = disconnect + 19;
                                    getNotifyChildrenChangedOptions = i5 % 128;
                                    if (i5 % 2 == 0) {
                                        Object[] objArr13 = new Object[1];
                                        f(null, null, Color.argb(1, 1, 1, 1) + 30, new byte[]{-112, -113, -114, -116, -119, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr13);
                                        if (Class.forName((String) objArr13[0]).equals(objArr12[1])) {
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                int iIndexOf = 2823 - TextUtils.indexOf("", "");
                                                int iLastIndexOf = 21 - TextUtils.lastIndexOf("", '0', 0, 0);
                                                byte[] bArr2 = $$d;
                                                Object[] objArr14 = new Object[1];
                                                e(bArr2[54], (byte) (-bArr2[5]), bArr2[7], objArr14);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumDrawingCacheSize, iIndexOf, iLastIndexOf, 1814927978, false, (String) objArr14[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char cResolveSize = (char) View.resolveSize(0, 0);
                                                int i6 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2822;
                                                int modifierMetaStateMask = 21 - ((byte) KeyEvent.getModifierMetaStateMask());
                                                byte[] bArr3 = $$d;
                                                Object[] objArr15 = new Object[1];
                                                e(bArr3[54], (byte) (-bArr3[5]), bArr3[7], objArr15);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSize, i6, modifierMetaStateMask, 1814927978, false, (String) objArr15[0], null);
                                            }
                                            try {
                                                Object[] objArr16 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                    char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                                                    int defaultSize = View.getDefaultSize(0, 0) + 2823;
                                                    int iBlue = Color.blue(0) + 22;
                                                    byte[] bArr4 = $$d;
                                                    byte b3 = bArr4[7];
                                                    Object[] objArr17 = new Object[1];
                                                    e(b3, b3, (byte) (-bArr4[5]), objArr17);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveOpacity, defaultSize, iBlue, -2137287382, false, (String) objArr17[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr16)).longValue();
                                            } catch (Throwable th) {
                                                Throwable cause = th.getCause();
                                                if (cause == null) {
                                                    throw th;
                                                }
                                                throw cause;
                                            }
                                        }
                                    } else {
                                        Object[] objArr18 = new Object[1];
                                        f(null, null, Color.argb(0, 0, 0, 0) + 127, new byte[]{-112, -113, -114, -116, -119, -115, -124, -116, -117, -119, -123, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr18);
                                        if (Class.forName((String) objArr18[0]).equals(objArr12[1])) {
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                char maximumDrawingCacheSize2 = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                int iIndexOf2 = 2823 - TextUtils.indexOf("", "");
                                                int iLastIndexOf2 = 21 - TextUtils.lastIndexOf("", '0', 0, 0);
                                                byte[] bArr5 = $$d;
                                                Object[] objArr19 = new Object[1];
                                                e(bArr5[54], (byte) (-bArr5[5]), bArr5[7], objArr19);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumDrawingCacheSize2, iIndexOf2, iLastIndexOf2, 1814927978, false, (String) objArr19[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char cResolveSize2 = (char) View.resolveSize(0, 0);
                                                int i7 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2822;
                                                int modifierMetaStateMask2 = 21 - ((byte) KeyEvent.getModifierMetaStateMask());
                                                byte[] bArr6 = $$d;
                                                Object[] objArr110 = new Object[1];
                                                e(bArr6[54], (byte) (-bArr6[5]), bArr6[7], objArr110);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSize2, i7, modifierMetaStateMask2, 1814927978, false, (String) objArr110[0], null);
                                            }
                                            Object[] objArr111 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char cResolveOpacity2 = (char) Drawable.resolveOpacity(0, 0);
                                                int defaultSize2 = View.getDefaultSize(0, 0) + 2823;
                                                int iBlue2 = Color.blue(0) + 22;
                                                byte[] bArr7 = $$d;
                                                byte b4 = bArr7[7];
                                                Object[] objArr112 = new Object[1];
                                                e(b4, b4, (byte) (-bArr7[5]), objArr112);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveOpacity2, defaultSize2, iBlue2, -2137287382, false, (String) objArr112[0], new Class[]{Long.TYPE, Method.class});
                                            }
                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr111)).longValue();
                                        }
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                        i4++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
            int longPressTimeout = 2823 - (ViewConfiguration.getLongPressTimeout() >> 16);
            int deadChar = 22 - KeyEvent.getDeadChar(0, 0);
            byte[] bArr8 = $$d;
            Object[] objArr20 = new Object[1];
            e(bArr8[54], (byte) (-bArr8[5]), bArr8[7], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cKeyCodeFromString, longPressTimeout, deadChar, 1814927978, false, (String) objArr20[0], null);
        }
        Object[] objArr21 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char modifierMetaStateMask3 = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 2824;
            int iResolveSize = 22 - View.resolveSize(0, 0);
            byte[] bArr9 = $$d;
            Object[] objArr22 = new Object[1];
            e((byte) (bArr9[51] - 1), bArr9[7], (byte) (-bArr9[5]), objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(modifierMetaStateMask3, packedPositionChild, iResolveSize, 1025296417, false, (String) objArr22[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr21);
        Object[] objArr23 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char mode = (char) (37657 - View.MeasureSpec.getMode(0));
            int minimumFlingVelocity = 2720 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L) + 20;
            byte[] bArr10 = $$d;
            Object[] objArr24 = new Object[1];
            e((byte) (bArr10[51] - 1), bArr10[7], (byte) (-bArr10[5]), objArr24);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(mode, minimumFlingVelocity, packedPositionChild2, -1568796068, false, (String) objArr24[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr23)).longValue();
        long j = -1108589108;
        long j2 = -115;
        long jMyTid = Process.myTid();
        long j3 = -1;
        long j4 = (j2 * j) + (j2 * jLongValue) + (((long) (-116)) * ((((jMyTid ^ j3) | j) | jLongValue) ^ j3));
        long j5 = 116;
        long j6 = jLongValue ^ j3;
        long j7 = j4 + ((j | jMyTid) * j5) + (j5 * (((j6 | jMyTid) ^ j3) | (((j ^ j3) | j6) ^ j3))) + ((long) (-701816737));
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i8 = ~((-1107296529) | iUptimeMillis);
        int i9 = ((int) (j7 >> 32)) & ((-1585081510) + ((136196 | i8) * (-476)) + (i8 * 952) + ((~((~iUptimeMillis) | (-1107296529))) * 476));
        int iMyUid = Process.myUid();
        int i10 = ~(1699271784 | iMyUid);
        int i11 = ~iMyUid;
        int i12 = i10 | (~(262045374 | i11));
        int i13 = ~((-1699271785) | i11);
        int i14 = i9 | (((int) j7) & (135401401 + ((i12 | i13) * (-516)) + (((~(iMyUid | (-177613463))) | (~((-84431913) | i11))) * 516) + ((84431912 | i13) * 516)));
        int i15 = i14 >>> 24;
        int i16 = i14 & ViewCompat.MEASURED_SIZE_MASK;
        boolean z = i15 != 0;
        if (z) {
            int i17 = disconnect + 93;
            getNotifyChildrenChangedOptions = i17 % 128;
            int i18 = i17 % 2;
            i = 1;
        } else {
            i = 0;
        }
        if (!z || i16 >= 1) {
            string = null;
        } else {
            int i19 = getNotifyChildrenChangedOptions + 83;
            disconnect = i19 % 128;
            if (i19 % 2 != 0) {
                Method method2 = methodArr[i16];
                throw null;
            }
            Method method3 = methodArr[i16];
            if (method3 != null) {
                string = method3.toString();
                int i20 = 2 % 2;
            } else {
                string = null;
            }
        }
        arrayList.add(string);
        if ((i15 + 6) * i != 0) {
            throw null;
        }
        try {
            f1222a = SSLContext.getInstance("Default");
        } catch (Exception e2) {
            try {
                f1222a = SSLContext.getInstance("TLS");
                f1222a.init(null, new TrustManager[]{new X509TrustManager() { // from class: isLongerInAnyEdge.5
                    @Override // javax.net.ssl.X509TrustManager
                    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
                    }

                    @Override // javax.net.ssl.X509TrustManager
                    public final X509Certificate[] getAcceptedIssuers() {
                        return new X509Certificate[0];
                    }

                    @Override // javax.net.ssl.X509TrustManager
                    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
                        for (X509Certificate x509Certificate : x509CertificateArr) {
                            if (x509Certificate != null && x509Certificate.getCriticalExtensionOIDs() != null) {
                                x509Certificate.getCriticalExtensionOIDs().remove("2.5.29.15");
                            }
                        }
                    }
                }}, null);
            } catch (Exception e3) {
                e2.printStackTrace();
                e3.printStackTrace();
            }
        }
        try {
            asInterface = SSLContext.getInstance("TLS");
            asInterface.init(null, new TrustManager[]{new X509TrustManager() { // from class: isLongerInAnyEdge.2
                @Override // javax.net.ssl.X509TrustManager
                public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
                }

                @Override // javax.net.ssl.X509TrustManager
                public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
                }

                @Override // javax.net.ssl.X509TrustManager
                public final X509Certificate[] getAcceptedIssuers() {
                    return new X509Certificate[0];
                }
            }}, null);
            new HostnameVerifier() { // from class: updateTargetRotationAndRelatedConfigs
                @Override // javax.net.ssl.HostnameVerifier
                public final boolean verify(String str, SSLSession sSLSession) {
                    return isLongerInAnyEdge.asInterface();
                }
            };
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    private static void f(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2;
        int i3 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr3 = write;
        long j = 0;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $10 + 111;
                $11 = i5 % 128;
                int i6 = i5 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i4])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 31339);
                        int iMyTid = (Process.myTid() >> 22) + 2994;
                        int i7 = (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)) + 16;
                        byte b = (byte) 0;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(tapTimeout, iMyTid, i7, 1182129903, false, $$g(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr4[i4] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i4++;
                    i2 = 2;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        Object[] objArr3 = {Integer.valueOf(IconCompatParcelizer)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 43325), 253 - TextUtils.indexOf("", ""), 22 - (Process.myPid() >> 22), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
        int i8 = 33602;
        int i9 = 1687675375;
        if (getRoot) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (KeyEvent.getDeadChar(0, 0) + i8), 3086 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 27 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -2146875848, false, $$g(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                i8 = 33602;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        if (!getExtras) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
            char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            int i10 = $10 + 59;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 3 / 5;
            }
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
            }
            objArr[0] = new String(cArr6);
            return;
        }
        int i12 = $11 + 105;
        $10 = i12 % 128;
        if (i12 % 2 != 0) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
            cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
        } else {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
            cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        }
        while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
            cArr2[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
            Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i9);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.getCapsMode("", 0, 0) + 33602), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3084, 26 - Color.alpha(0), -2146875848, false, $$g(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            i9 = 1687675375;
        }
        objArr[0] = new String(cArr2);
    }

    public static SSLContext d() {
        int i = 2 % 2;
        int i2 = search + 31;
        getItem = i2 % 128;
        if (i2 % 2 == 0) {
            return f1222a;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(getAbsolutePathFromUri getabsolutepathfromuri, String str, int i, SSLEngine sSLEngine, TrustManager[] trustManagerArr, HostnameVerifier hostnameVerifier, final TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1) {
        int i2 = 2 % 2;
        isLongerInAnyEdge islongerinanyedge = new isLongerInAnyEdge(getabsolutepathfromuri, str, i, sSLEngine, null, hostnameVerifier, true);
        islongerinanyedge.notify = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
        getabsolutepathfromuri.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor() { // from class: isLongerInAnyEdge.3
            @Override // defpackage.lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor
            public final void b(Exception exc) {
                if (exc != null) {
                    tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(exc, null);
                } else {
                    tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new SSLException("socket closed during handshake"), null);
                }
            }
        });
        try {
            islongerinanyedge.TuitionPaymentFragmentspecialinlinedviewModeldefault1.beginHandshake();
            Object[] objArr = {islongerinanyedge, islongerinanyedge.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getHandshakeStatus()};
            TuitionPaymentFragmentbindingInflater1(zzrt.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), zzrt.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), zzrt.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), zzrt.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1060342514, objArr, 1060342516);
            int i3 = search + 65;
            getItem = i3 % 128;
            int i4 = i3 % 2;
        } catch (SSLException e2) {
            islongerinanyedge.TuitionPaymentFragmentspecialinlinedviewModeldefault3(e2);
        }
    }

    private isLongerInAnyEdge(getAbsolutePathFromUri getabsolutepathfromuri, String str, int i, SSLEngine sSLEngine, TrustManager[] trustManagerArr, HostnameVerifier hostnameVerifier, boolean z) {
        lambdasnapshot8androidxcameracoreprocessingDefaultSurfaceProcessor lambdasnapshot8androidxcameracoreprocessingdefaultsurfaceprocessor = new lambdasnapshot8androidxcameracoreprocessingDefaultSurfaceProcessor() { // from class: isLongerInAnyEdge.9
            private lambdaupdateTransformation3androidxcameracoreprocessingSurfaceEdge TuitionPaymentFragmentbindingInflater1;
            private AutoValue_Packet TuitionPaymentFragmentspecialinlinedviewModeldefault2;

            {
                lambdaupdateTransformation3androidxcameracoreprocessingSurfaceEdge lambdaupdatetransformation3androidxcameracoreprocessingsurfaceedge = new lambdaupdateTransformation3androidxcameracoreprocessingSurfaceEdge();
                lambdaupdatetransformation3androidxcameracoreprocessingsurfaceedge.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Math.max(0, 8192);
                this.TuitionPaymentFragmentbindingInflater1 = lambdaupdatetransformation3androidxcameracoreprocessingsurfaceedge;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new AutoValue_Packet();
            }

            @Override // defpackage.lambdasnapshot8androidxcameracoreprocessingDefaultSurfaceProcessor
            public final void TuitionPaymentFragmentbindingInflater1(checkReadyToRelease checkreadytorelease, AutoValue_Packet autoValue_Packet) {
                ByteBuffer byteBuffer;
                ByteBuffer byteBuffer2;
                if (isLongerInAnyEdge.this.b) {
                    return;
                }
                try {
                    isLongerInAnyEdge.this.b = true;
                    autoValue_Packet.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 > 0) {
                        AutoValue_Packet autoValue_Packet2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        if (autoValue_Packet2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == 0) {
                            byteBuffer2 = AutoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        } else {
                            autoValue_Packet2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(autoValue_Packet2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            ByteBuffer byteBufferRemove = autoValue_Packet2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove();
                            autoValue_Packet2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 -= byteBufferRemove.remaining();
                            byteBuffer2 = byteBufferRemove;
                        }
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(byteBuffer2);
                    }
                    ByteBuffer byteBuffer3 = AutoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    while (true) {
                        if (byteBuffer3.remaining() == 0 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.size() > 0) {
                            AutoValue_Packet autoValue_Packet3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            ByteBuffer byteBufferRemove2 = autoValue_Packet3.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove();
                            autoValue_Packet3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 -= byteBufferRemove2.remaining();
                            byteBuffer3 = byteBufferRemove2;
                        }
                        int iRemaining = byteBuffer3.remaining();
                        int i2 = isLongerInAnyEdge.this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        lambdaupdateTransformation3androidxcameracoreprocessingSurfaceEdge lambdaupdatetransformation3androidxcameracoreprocessingsurfaceedge = this.TuitionPaymentFragmentbindingInflater1;
                        ByteBuffer byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AutoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2(Math.min(Math.max(lambdaupdatetransformation3androidxcameracoreprocessingsurfaceedge.TuitionPaymentFragmentbindingInflater1, lambdaupdatetransformation3androidxcameracoreprocessingsurfaceedge.TuitionPaymentFragmentspecialinlinedviewModeldefault3), lambdaupdatetransformation3androidxcameracoreprocessingsurfaceedge.b));
                        SSLEngineResult sSLEngineResultUnwrap = isLongerInAnyEdge.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.unwrap(byteBuffer3, byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        isLongerInAnyEdge.TuitionPaymentFragmentspecialinlinedviewModeldefault1(isLongerInAnyEdge.this.d, byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1 = (isLongerInAnyEdge.this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - i2) * 2;
                        if (sSLEngineResultUnwrap.getStatus() == SSLEngineResult.Status.BUFFER_OVERFLOW) {
                            lambdaupdateTransformation3androidxcameracoreprocessingSurfaceEdge lambdaupdatetransformation3androidxcameracoreprocessingsurfaceedge2 = this.TuitionPaymentFragmentbindingInflater1;
                            lambdaupdatetransformation3androidxcameracoreprocessingsurfaceedge2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Math.max(0, lambdaupdatetransformation3androidxcameracoreprocessingsurfaceedge2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 * 2);
                        } else if (sSLEngineResultUnwrap.getStatus() == SSLEngineResult.Status.BUFFER_UNDERFLOW) {
                            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(byteBuffer3);
                            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.size() <= 1) {
                                break;
                            }
                            AutoValue_Packet autoValue_Packet4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            if (autoValue_Packet4.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == 0) {
                                byteBuffer = AutoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            } else {
                                autoValue_Packet4.TuitionPaymentFragmentspecialinlinedviewModeldefault3(autoValue_Packet4.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                ByteBuffer byteBufferRemove3 = autoValue_Packet4.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove();
                                autoValue_Packet4.TuitionPaymentFragmentspecialinlinedviewModeldefault2 -= byteBufferRemove3.remaining();
                                byteBuffer = byteBufferRemove3;
                            }
                            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(byteBuffer);
                            byteBuffer3 = AutoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        } else {
                            isLongerInAnyEdge.TuitionPaymentFragmentbindingInflater1(isLongerInAnyEdge.this, sSLEngineResultUnwrap.getHandshakeStatus());
                            if (byteBuffer3.remaining() != iRemaining && i2 == isLongerInAnyEdge.this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(byteBuffer3);
                                break;
                            }
                        }
                        iRemaining = -1;
                        isLongerInAnyEdge.TuitionPaymentFragmentbindingInflater1(isLongerInAnyEdge.this, sSLEngineResultUnwrap.getHandshakeStatus());
                        if (byteBuffer3.remaining() != iRemaining) {
                        }
                    }
                    isLongerInAnyEdge.this.onTransact();
                } catch (SSLException e2) {
                    isLongerInAnyEdge.TuitionPaymentFragmentspecialinlinedviewModeldefault3(isLongerInAnyEdge.this, e2);
                } finally {
                    isLongerInAnyEdge.this.b = false;
                }
            }
        };
        this.onTransact = lambdasnapshot8androidxcameracoreprocessingdefaultsurfaceprocessor;
        this.read = new AutoValue_Packet();
        this.INotificationSideChannelDefault = getabsolutepathfromuri;
        this.cancel = hostnameVerifier;
        this.asBinder = true;
        this.connect = trustManagerArr;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = sSLEngine;
        this.getInterfaceDescriptor = str;
        this.RemoteActionCompatParcelizer = i;
        sSLEngine.setUseClientMode(true);
        getExif getexif = new getExif(getabsolutepathfromuri);
        this.INotificationSideChannelStub = getexif;
        getexif.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new lambdaonOutputSurface3androidxcameracoreprocessingDefaultSurfaceProcessor() { // from class: isLongerInAnyEdge.4
            @Override // defpackage.lambdaonOutputSurface3androidxcameracoreprocessingDefaultSurfaceProcessor
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
                if (isLongerInAnyEdge.this.g != null) {
                    isLongerInAnyEdge.this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                }
            }
        };
        this.INotificationSideChannelDefault.b(new lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor() { // from class: isLongerInAnyEdge.1
            @Override // defpackage.lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor
            public final void b(Exception exc) {
                if (isLongerInAnyEdge.this.TuitionPaymentFragmentbindingInflater1) {
                    return;
                }
                isLongerInAnyEdge.this.TuitionPaymentFragmentbindingInflater1 = true;
                isLongerInAnyEdge.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = exc;
                if (isLongerInAnyEdge.this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault2 <= 0 && isLongerInAnyEdge.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                    isLongerInAnyEdge.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(exc);
                }
            }
        });
        this.INotificationSideChannelDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdasnapshot8androidxcameracoreprocessingdefaultsurfaceprocessor);
    }

    public final void onTransact() {
        int i = 2 % 2;
        int i2 = search + 61;
        getItem = i2 % 128;
        int i3 = i2 % 2;
        lambdainitGlRenderer10androidxcameracoreprocessingDefaultSurfaceProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, this.d);
        if (!this.TuitionPaymentFragmentbindingInflater1 || this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault2 > 0) {
            return;
        }
        int i4 = getItem + 19;
        int i5 = i4 % 128;
        search = i5;
        int i6 = i4 % 2;
        lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor != null) {
            int i7 = i5 + 19;
            getItem = i7 % 128;
            int i8 = i7 % 2;
            lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(AutoValue_Packet autoValue_Packet, ByteBuffer byteBuffer) {
        int i = 2 % 2;
        byteBuffer.flip();
        if (byteBuffer.hasRemaining()) {
            int i2 = search + 71;
            getItem = i2 % 128;
            int i3 = i2 % 2;
            autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1(byteBuffer);
            return;
        }
        AutoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3(byteBuffer);
        int i4 = getItem + 69;
        search = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // defpackage.executeSafely
    public final void b() {
        int i = 2 % 2;
        int i2 = getItem + 95;
        search = i2 % 128;
        int i3 = i2 % 2;
        this.INotificationSideChannelDefault.b();
        if (i3 == 0) {
            int i4 = 35 / 0;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private static /* synthetic */ Object b(Object[] objArr) {
        boolean z = false;
        isLongerInAnyEdge islongerinanyedge = (isLongerInAnyEdge) objArr[0];
        SSLEngineResult.HandshakeStatus handshakeStatus = (SSLEngineResult.HandshakeStatus) objArr[1];
        int i = 2 % 2;
        int i2 = search + 63;
        getItem = i2 % 128;
        int i3 = i2 % 2;
        if (handshakeStatus == SSLEngineResult.HandshakeStatus.NEED_TASK) {
            islongerinanyedge.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getDelegatedTask().run();
        }
        if (handshakeStatus == SSLEngineResult.HandshakeStatus.NEED_WRAP) {
            islongerinanyedge.TuitionPaymentFragmentspecialinlinedviewModeldefault3(islongerinanyedge.read);
        }
        if (handshakeStatus == SSLEngineResult.HandshakeStatus.NEED_UNWRAP) {
            islongerinanyedge.onTransact.TuitionPaymentFragmentbindingInflater1(islongerinanyedge, new AutoValue_Packet());
        }
        Object obj = null;
        try {
            if (!islongerinanyedge.INotificationSideChannel) {
                int i4 = getItem + 27;
                search = i4 % 128;
                if (i4 % 2 == 0) {
                    islongerinanyedge.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getHandshakeStatus();
                    SSLEngineResult.HandshakeStatus handshakeStatus2 = SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
                    obj.hashCode();
                    throw null;
                }
                if (islongerinanyedge.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING || islongerinanyedge.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.FINISHED) {
                    if (islongerinanyedge.asBinder) {
                        try {
                            islongerinanyedge.MediaBrowserCompat = (X509Certificate[]) islongerinanyedge.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getSession().getPeerCertificates();
                            String str = islongerinanyedge.getInterfaceDescriptor;
                            if (str != null) {
                                int i5 = search + 125;
                                getItem = i5 % 128;
                                int i6 = i5 % 2;
                                HostnameVerifier hostnameVerifier = islongerinanyedge.cancel;
                                if (hostnameVerifier == null) {
                                    new StrictHostnameVerifier().verify(islongerinanyedge.getInterfaceDescriptor, StrictHostnameVerifier.getCNs(islongerinanyedge.MediaBrowserCompat[0]), StrictHostnameVerifier.getDNSSubjectAlts(islongerinanyedge.MediaBrowserCompat[0]));
                                } else if (!hostnameVerifier.verify(str, islongerinanyedge.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getSession())) {
                                    StringBuilder sb = new StringBuilder("hostname <");
                                    sb.append(islongerinanyedge.getInterfaceDescriptor);
                                    sb.append("> has been denied");
                                    throw new SSLException(sb.toString());
                                }
                            }
                            e = null;
                            z = true;
                        } catch (SSLException e2) {
                            e = e2;
                        }
                        islongerinanyedge.INotificationSideChannel = true;
                        if (!z) {
                            AsyncSSLException asyncSSLException = new AsyncSSLException(e);
                            islongerinanyedge.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asyncSSLException);
                            if (!asyncSSLException.mIgnore) {
                                throw asyncSSLException;
                            }
                        }
                    } else {
                        islongerinanyedge.INotificationSideChannel = true;
                    }
                    islongerinanyedge.notify.TuitionPaymentFragmentspecialinlinedviewModeldefault2(null, islongerinanyedge);
                    islongerinanyedge.notify = null;
                    islongerinanyedge.INotificationSideChannelDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null);
                    islongerinanyedge.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentbindingInflater1(new Runnable() { // from class: isLongerInAnyEdge.8
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (isLongerInAnyEdge.this.g != null) {
                                isLongerInAnyEdge.this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            }
                        }
                    }, 0L);
                    islongerinanyedge.onTransact();
                    return null;
                }
            }
        } catch (Exception e3) {
            islongerinanyedge.TuitionPaymentFragmentspecialinlinedviewModeldefault3(e3);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00ef  */
    @Override // defpackage.executeSafely
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(AutoValue_Packet autoValue_Packet) {
        int i = 2 % 2;
        int i2 = getItem + 109;
        search = i2 % 128;
        int i3 = i2 % 2;
        if (this.INotificationSideChannelStubProxy || this.INotificationSideChannelStub.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 > 0) {
            return;
        }
        this.INotificationSideChannelStubProxy = true;
        int i4 = (autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 * 3) / 2;
        if (i4 == 0) {
            int i5 = getItem + 115;
            search = i5 % 128;
            int i6 = i5 % 2;
            i4 = 8192;
        }
        Object obj = null;
        ByteBuffer byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AutoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i4);
        SSLEngineResult sSLEngineResultWrap = null;
        do {
            if (!this.INotificationSideChannel || autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != 0) {
                int i7 = autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                try {
                    ByteBuffer[] byteBufferArrTuitionPaymentFragmentspecialinlinedviewModeldefault3 = autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    sSLEngineResultWrap = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.wrap(byteBufferArrTuitionPaymentFragmentspecialinlinedviewModeldefault3, byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    int length = byteBufferArrTuitionPaymentFragmentspecialinlinedviewModeldefault3.length;
                    int i8 = 0;
                    while (i8 < length) {
                        int i9 = search + 1;
                        getItem = i9 % 128;
                        if (i9 % 2 != 0) {
                            autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1(byteBufferArrTuitionPaymentFragmentspecialinlinedviewModeldefault3[i8]);
                            i8 += 73;
                        } else {
                            autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1(byteBufferArrTuitionPaymentFragmentspecialinlinedviewModeldefault3[i8]);
                            i8++;
                        }
                    }
                    byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2.flip();
                    this.read.TuitionPaymentFragmentspecialinlinedviewModeldefault1(byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    if (this.read.TuitionPaymentFragmentspecialinlinedviewModeldefault2 > 0) {
                        this.INotificationSideChannelStub.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.read);
                    }
                    int iCapacity = byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2.capacity();
                    try {
                        if (sSLEngineResultWrap.getStatus() == SSLEngineResult.Status.BUFFER_OVERFLOW) {
                            i7 = -1;
                            byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AutoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2(iCapacity * 2);
                        } else {
                            int i10 = (autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 * 3) / 2;
                            if (i10 == 0) {
                                i10 = 8192;
                            }
                            byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AutoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i10);
                            TuitionPaymentFragmentbindingInflater1(zzrt.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), zzrt.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), zzrt.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), zzrt.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -1060342514, new Object[]{this, sSLEngineResultWrap.getHandshakeStatus()}, 1060342516);
                        }
                    } catch (SSLException e2) {
                        e = e2;
                        byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3(e);
                    }
                } catch (SSLException e3) {
                    e = e3;
                }
                if (i7 == autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    if (sSLEngineResultWrap != null) {
                        int i11 = search + 97;
                        getItem = i11 % 128;
                        if (i11 % 2 != 0) {
                            sSLEngineResultWrap.getHandshakeStatus();
                            SSLEngineResult.HandshakeStatus handshakeStatus = SSLEngineResult.HandshakeStatus.NEED_WRAP;
                            obj.hashCode();
                            throw null;
                        }
                        if (sSLEngineResultWrap.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NEED_WRAP) {
                        }
                    }
                }
            }
            this.INotificationSideChannelStubProxy = false;
            AutoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3(byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        } while (this.INotificationSideChannelStub.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == 0);
        int i12 = search + 95;
        getItem = i12 % 128;
        int i13 = i12 % 2;
        this.INotificationSideChannelStubProxy = false;
        AutoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3(byteBufferTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    @Override // defpackage.executeSafely
    public final void TuitionPaymentFragmentbindingInflater1(lambdaonOutputSurface3androidxcameracoreprocessingDefaultSurfaceProcessor lambdaonoutputsurface3androidxcameracoreprocessingdefaultsurfaceprocessor) {
        int i = 2 % 2;
        int i2 = getItem + 121;
        search = i2 % 128;
        int i3 = i2 % 2;
        this.g = lambdaonoutputsurface3androidxcameracoreprocessingdefaultsurfaceprocessor;
        if (i3 == 0) {
            int i4 = 42 / 0;
        }
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Exception exc) {
        int i = 2 % 2;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.notify;
        if (tuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
            this.notify = null;
            this.INotificationSideChannelDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new lambdasnapshot8androidxcameracoreprocessingDefaultSurfaceProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            this.INotificationSideChannelDefault.b();
            this.INotificationSideChannelDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null);
            this.INotificationSideChannelDefault.TuitionPaymentFragmentbindingInflater1();
            tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(exc, null);
            int i2 = getItem + 103;
            search = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor != null) {
            lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor.b(exc);
        }
        int i4 = search + 29;
        getItem = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // defpackage.checkReadyToRelease
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdasnapshot8androidxcameracoreprocessingDefaultSurfaceProcessor lambdasnapshot8androidxcameracoreprocessingdefaultsurfaceprocessor) {
        int i = 2 % 2;
        int i2 = search + 125;
        int i3 = i2 % 128;
        getItem = i3;
        int i4 = i2 % 2;
        this.cancelAll = lambdasnapshot8androidxcameracoreprocessingdefaultsurfaceprocessor;
        int i5 = i3 + 27;
        search = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // defpackage.checkReadyToRelease
    public final lambdasnapshot8androidxcameracoreprocessingDefaultSurfaceProcessor i_() {
        int i = 2 % 2;
        int i2 = search + 83;
        getItem = i2 % 128;
        if (i2 % 2 == 0) {
            return this.cancelAll;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.executeSafely
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i = 2 % 2;
        int i2 = getItem + 99;
        search = i2 % 128;
        if (i2 % 2 == 0) {
            zTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.INotificationSideChannelDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int i3 = 56 / 0;
        } else {
            zTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.INotificationSideChannelDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }
        int i4 = search + 113;
        getItem = i4 % 128;
        int i5 = i4 % 2;
        return zTuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.checkReadyToRelease
    public final void TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = getItem + 27;
        search = i2 % 128;
        int i3 = i2 % 2;
        this.INotificationSideChannelDefault.TuitionPaymentFragmentbindingInflater1();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.executeSafely
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor) {
        int i = 2 % 2;
        int i2 = getItem + 85;
        search = i2 % 128;
        int i3 = i2 % 2;
        this.INotificationSideChannelDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault1(lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor);
        int i4 = getItem + 41;
        search = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // defpackage.checkReadyToRelease
    public final void b(lambdainitGlRenderer9androidxcameracoreprocessingDefaultSurfaceProcessor lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor) {
        int i = 2 % 2;
        int i2 = search;
        int i3 = i2 + 69;
        getItem = i3 % 128;
        int i4 = i3 % 2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = lambdainitglrenderer9androidxcameracoreprocessingdefaultsurfaceprocessor;
        int i5 = i2 + 121;
        getItem = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        isLongerInAnyEdge islongerinanyedge = (isLongerInAnyEdge) objArr[0];
        int i = 2 % 2;
        int i2 = search + 47;
        getItem = i2 % 128;
        int i3 = i2 % 2;
        islongerinanyedge.INotificationSideChannelDefault.g_();
        if (i3 != 0) {
            throw null;
        }
        int i4 = getItem + 61;
        search = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        isLongerInAnyEdge islongerinanyedge = (isLongerInAnyEdge) objArr[0];
        int i = 2 % 2;
        int i2 = search + 53;
        getItem = i2 % 128;
        if (i2 % 2 == 0) {
            islongerinanyedge.INotificationSideChannelDefault.h_();
            islongerinanyedge.onTransact();
            return null;
        }
        islongerinanyedge.INotificationSideChannelDefault.h_();
        islongerinanyedge.onTransact();
        int i3 = 97 / 0;
        return null;
    }

    @Override // defpackage.checkReadyToRelease
    public final boolean f_() {
        int i = 2 % 2;
        int i2 = getItem + 11;
        search = i2 % 128;
        int i3 = i2 % 2;
        boolean zF_ = this.INotificationSideChannelDefault.f_();
        int i4 = search + 125;
        getItem = i4 % 128;
        int i5 = i4 % 2;
        return zF_;
    }

    @Override // defpackage.getAbsolutePathFromUri, defpackage.checkReadyToRelease
    public final AsyncServer TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        AsyncServer asyncServerTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i = 2 % 2;
        int i2 = getItem + 37;
        search = i2 % 128;
        if (i2 % 2 == 0) {
            asyncServerTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.INotificationSideChannelDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i3 = 24 / 0;
        } else {
            asyncServerTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.INotificationSideChannelDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
        int i4 = getItem + 61;
        search = i4 % 128;
        int i5 = i4 % 2;
        return asyncServerTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        isLongerInAnyEdge islongerinanyedge = (isLongerInAnyEdge) objArr[0];
        int i = 2 % 2;
        int i2 = search;
        int i3 = i2 + 41;
        getItem = i3 % 128;
        int i4 = i3 % 2;
        getAbsolutePathFromUri getabsolutepathfromuri = islongerinanyedge.INotificationSideChannelDefault;
        int i5 = i2 + 55;
        getItem = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 26 / 0;
        }
        return getabsolutepathfromuri;
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault1(SSLEngineResult.HandshakeStatus handshakeStatus) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zzrt.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzrt.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentbindingInflater1(zzrt.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), zzrt.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1060342514, new Object[]{this, handshakeStatus}, 1060342516);
    }

    static /* synthetic */ boolean asInterface() {
        int i = 2 % 2;
        int i2 = getItem + 111;
        search = i2 % 128;
        int i3 = i2 % 2;
        return true;
    }

    @Override // defpackage.lambdanew0androidxcameracoreprocessingSurfaceEdgeSettableSurface
    public final getAbsolutePathFromUri cancelAll() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zzrt.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzrt.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return (getAbsolutePathFromUri) TuitionPaymentFragmentbindingInflater1(zzrt.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), zzrt.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -740106051, new Object[]{this}, 740106052);
    }

    @Override // defpackage.checkReadyToRelease
    public final void g_() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zzrt.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzrt.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentbindingInflater1(zzrt.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), zzrt.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1247374723, new Object[]{this}, 1247374723);
    }

    @Override // defpackage.checkReadyToRelease
    public final void h_() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zzrt.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzrt.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentbindingInflater1(zzrt.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), zzrt.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -834748830, new Object[]{this}, 834748833);
    }

    static void INotificationSideChannel() {
        write = new char[]{47421, 47366, 47409, 47353, 47419, 47417, 47360, 47413, 47362, 47361, 47364, 47411, 47386, 47423, 47416, 47363, 47422, 47412, 47385, 47381, 47410, 47379, 47406, 47415, 47383, 47418};
        IconCompatParcelizer = 2047719591;
        getExtras = true;
        getRoot = true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, byte r7, short r8) {
        /*
            int r6 = r6 * 4
            int r6 = 4 - r6
            int r7 = r7 * 4
            int r7 = 1 - r7
            byte[] r0 = defpackage.isLongerInAnyEdge.$$c
            int r8 = r8 + 67
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r3 = r0[r6]
        L24:
            int r8 = r8 + r3
            int r6 = r6 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isLongerInAnyEdge.$$g(short, byte, short):java.lang.String");
    }
}
