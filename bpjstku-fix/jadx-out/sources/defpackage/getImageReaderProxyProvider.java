package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.exifinterface.media.ExifInterface;
import com.dynatrace.android.callback.CbConstants;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.io.encoding.Base64;
import org.apache.http.Header;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.RequestLine;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: loaded from: classes6.dex */
final class getImageReaderProxyProvider extends AutoValue_CaptureNode_In {
    private static boolean INotificationSideChannelStub;
    private static boolean INotificationSideChannelStubProxy;
    private static int RemoteActionCompatParcelizer;
    private static final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static char[] getInterfaceDescriptor;
    private static int write;
    HttpHost TuitionPaymentFragmentbindingInflater1;
    HttpContext TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    HttpRequest b;
    private ViewPortScaleType cancel;
    private HttpUriRequest cancelAll;
    private static final byte[] $$c = {113, 29, -123, -97};
    private static final int $$f = 16;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {102, -96, -78, -55, 21, 7, -54, Base64.padSymbol, 23, 3, 18, 10, 0, 19, -62, 75, 11, -4, 23, -5, 18, 15, -10, 28, -2, 15, 8, -55, 72, 1, 17, -2, 12, 22, 10, -2, 10, 16, -57, 60, 11, 9, 21, 15, 2, 15, -10, 11, 26, -2, 22, -12, 28, -2, 15, 8, -55, 73, 0, 27, -13, 11, 26, -2, 22, -12, 28, -2, 15, 8, -55, 41, 32, 27, -30, 33, 16, 8, 0, -6, 24, 22, 0, 6, 12, 3, 7, 28, -2, 15, 8, -19, 28, 23, -5, 24, -42, 43, 26, -2, 22, -4, 20, 14, -76, 57, 42, -3, 20, -2, 15, 8, -21, 26, 33, -3, 1, 18, 15, -37, 53, -8, 15, 15, 1, 18, 15, -9, 16, 14, -1, 14, 14, 2, -21, 46, 1, 15, -2, 28, -6, 22, -56, 42, -3, 20, -2, 15, 8, -21, 26, 33, -3, 1, 18, 15, -37, 53, -8, 15, 15, 1, 18, 15, 8, 6, -2, 7, 15, 1, 20, 6, 14, 7, 6, 14, 0, 8, 27, -4, 5, 27, -33, 43, -2, 10, 16, 1, 10, 10, 4, 29, 0, 17, -56};
    private static final int $$e = 42;
    private static final byte[] $$a = {91, -9, 99, 11, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 141;
    private static int connect = 0;
    private static int IconCompatParcelizer = 1;
    private static int INotificationSideChannelDefault = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = defpackage.getImageReaderProxyProvider.$$a
            int r8 = r8 * 3
            int r8 = 84 - r8
            int r6 = r6 + 4
            int r7 = r7 * 15
            int r7 = r7 + 38
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L29
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            int r6 = r6 + 1
            if (r4 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r0[r6]
        L29:
            int r8 = r8 + r3
            int r8 = r8 + (-11)
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getImageReaderProxyProvider.c(short, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(byte r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = defpackage.getImageReaderProxyProvider.$$d
            int r8 = r8 * 87
            int r8 = r8 + 53
            int r7 = r7 * 15
            int r7 = 99 - r7
            int r9 = r9 * 139
            int r9 = 143 - r9
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r7 = r8
            r3 = r9
            r4 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2c:
            int r7 = r7 + r9
            int r7 = r7 + (-9)
            int r9 = r3 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getImageReaderProxyProvider.f(byte, byte, byte, java.lang.Object[]):void");
    }

    static {
        write = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("UriReqStateParms");
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = sb.toString();
        int i = INotificationSideChannelDefault + 7;
        write = i % 128;
        int i2 = i % 2;
    }

    getImageReaderProxyProvider(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        super(CbConstants.WrMethod.execute, CbConstants.WrStates.PRE_EXEC, 0);
        this.TuitionPaymentFragmentbindingInflater1 = httpHost;
        this.b = httpRequest;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = httpContext;
        this.cancel = ViewPortScaleType.H_(httpRequest, httpHost);
        if (httpRequest != null && !(!(httpRequest instanceof HttpUriRequest))) {
            int i = IconCompatParcelizer + 57;
            connect = i % 128;
            int i2 = i % 2;
            this.cancelAll = (HttpUriRequest) httpRequest;
            if (i2 != 0) {
                throw null;
            }
            int i3 = 2 % 2;
        }
        int i4 = IconCompatParcelizer + 63;
        connect = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void e(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr2 = getInterfaceDescriptor;
        int i3 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = $11 + 95;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 % 5;
            }
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr2[i6]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) i3;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (31339 - TextUtils.indexOf("", "")), 2994 - TextUtils.getCapsMode("", i3, i3), TextUtils.lastIndexOf("", '0') + 18, 1182129903, false, $$g(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i6++;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(RemoteActionCompatParcelizer)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (KeyEvent.normalizeMetaState(0) + 43325), TextUtils.getOffsetBefore("", 0) + 253, 22 - (ViewConfiguration.getWindowTouchSlop() >> 8), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
        int i7 = 33602;
        if (INotificationSideChannelStub) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
            char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (i7 - TextUtils.indexOf("", "", 0)), 3085 - TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 26, -2146875848, false, $$g(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                i7 = 33602;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (INotificationSideChannelStubProxy) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            int i8 = $11 + 103;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 4 / 4;
            }
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                int i10 = $10 + 9;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (33602 - Gravity.getAbsoluteGravity(0, 0)), 3085 - ((Process.getThreadPriority(0) + 20) >> 6), 26 - View.MeasureSpec.getSize(0), -2146875848, false, $$g(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i12 = 0;
        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
        while (true) {
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i12;
            if (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                objArr[0] = new String(cArr6);
                return;
            } else {
                cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                i12 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0202  */
    @Override // defpackage.AutoValue_CaptureNode_In
    final String TuitionPaymentFragmentbindingInflater1() throws Throwable {
        Object[] objArr;
        char c;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c2 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
            int maximumFlingVelocity = 2267 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int iLastIndexOf = 32 - TextUtils.lastIndexOf("", '0', 0);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c(bArr[5], bArr[132], bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, maximumFlingVelocity, iLastIndexOf, -887667012, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(null, null, 126 - ExpandableListView.getPackedPositionChild(0L), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(null, null, (ViewConfiguration.getPressedStateDuration() >> 16) + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2267;
            int iBlue = 33 - Color.blue(0);
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            c((byte) 51, bArr2[132], bArr2[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRgb, keyRepeatDelay, iBlue, -874156483, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c3 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
                int iIndexOf = TextUtils.indexOf("", "", 0) + 2267;
                int iRed = 33 - Color.red(0);
                byte b = $$a[7];
                Object[] objArr6 = new Object[1];
                c((byte) 103, b, b, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c3, iIndexOf, iRed, -654680577, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i2 = ((int[]) objArr7[0])[0];
            int i3 = ((int[]) objArr7[3])[0];
            String[] strArr = (String[]) objArr7[1];
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i4 = (((((~(28751877 | iUptimeMillis)) | (-811338861)) * 398) + 2121516447) + (((~((~iUptimeMillis) | 28751877)) | (-811338861)) * 398)) - 1024924082;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[2])[0] = i6 ^ (i6 << 5);
            c = 3;
        } else {
            Object[] objArr8 = new Object[1];
            e(null, null, 127 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(null, null, Color.argb(0, 0, 0, 0) + 127, new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i7 = connect;
                int i8 = i7 + 57;
                IconCompatParcelizer = i8 % 128;
                int i9 = i8 % 2;
                if (applicationContext instanceof ContextWrapper) {
                    int i10 = i7 + 55;
                    IconCompatParcelizer = i10 % 128;
                    if (i10 % 2 == 0) {
                        ((ContextWrapper) applicationContext).getBaseContext();
                        throw null;
                    }
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
            e(null, null, Gravity.getAbsoluteGravity(0, 0) + 127, new byte[]{-115, -116, -117, -120, -118, -119, -121, -102, -126, -127, -113, -121, -127, -107, -127, -103}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(null, null, Color.argb(0, 0, 0, 0) + 127, new byte[]{-116, -125, -123, -114, -105, -120, -127, -101, -118, -117, -122, -117, -126, -116, -125, -122}, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -1024924082};
                byte[] bArr3 = $$d;
                byte b2 = bArr3[12];
                byte b3 = bArr3[29];
                Object[] objArr13 = new Object[1];
                f(b2, b3, b3, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b4 = bArr3[29];
                byte b5 = bArr3[12];
                Object[] objArr14 = new Object[1];
                f(b4, b5, b5, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                        int iMakeMeasureSpec = 2267 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        int i11 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 33;
                        byte b6 = $$a[7];
                        Object[] objArr16 = new Object[1];
                        c((byte) 103, b6, b6, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, iMakeMeasureSpec, i11, -654680577, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        e(null, null, 127 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        e(null, null, 127 - Color.alpha(0), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c4 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                            int iArgb = Color.argb(0, 0, 0, 0) + 2267;
                            int iRgb = (-16777183) - Color.rgb(0, 0, 0);
                            byte[] bArr4 = $$a;
                            Object[] objArr19 = new Object[1];
                            c((byte) 51, bArr4[132], bArr4[7], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c4, iArgb, iRgb, -874156483, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 2267;
                            int mode = View.MeasureSpec.getMode(0) + 33;
                            byte[] bArr5 = $$a;
                            Object[] objArr20 = new Object[1];
                            c(bArr5[5], bArr5[132], bArr5[7], objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(edgeSlop, iCombineMeasuredStates, mode, -887667012, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        int i12 = IconCompatParcelizer + 117;
                        connect = i12 % 128;
                        int i13 = i12 % 2;
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
                c = 3;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i14 = ((int[]) objArr[c])[0];
        int i15 = ((int[]) objArr[0])[0];
        if (i15 == i14) {
            Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i16 = ((int[]) objArr[2])[0];
            int i17 = ((int[]) objArr[0])[0];
            int i18 = ((int[]) objArr[3])[0];
            String[] strArr2 = (String[]) objArr[1];
            int iIdentityHashCode = System.identityHashCode(this);
            int i19 = ~(760940920 | iIdentityHashCode);
            int i20 = i16 + 2141590640 + ((42005123 | i19) * (-814)) + ((i19 | (~((~iIdentityHashCode) | (-47772396))) | 755173648) * 407) + (((~(iIdentityHashCode | 47772395)) | (~((-760940921) | iIdentityHashCode)) | 755173648) * 407);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr21[2])[0] = i22 ^ (i22 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[1];
            if (strArr3 != null) {
                int i23 = connect + 109;
                int i24 = i23 % 128;
                IconCompatParcelizer = i24;
                int i25 = i24 + 75;
                connect = i25 % 128;
                int i26 = i25 % 2;
                for (int i27 = i23 % 2 == 0 ? 1 : 0; i27 < strArr3.length; i27++) {
                    arrayList.add(strArr3[i27]);
                }
            }
            Toast.makeText((Context) null, i15 / (((i15 - 1) * i15) % 2), 0).show();
            Object[] objArr22 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i28 = ((int[]) objArr[2])[0];
            int i29 = ((int[]) objArr[0])[0];
            int i30 = ((int[]) objArr[3])[0];
            String[] strArr4 = (String[]) objArr[1];
            int iNextInt = new Random().nextInt(1320662818);
            int i31 = ~iNextInt;
            int i32 = i28 + 78651919 + (((~(68432354 | i31)) | (-877145671) | (~((-68432355) | iNextInt))) * (-564)) + ((~(iNextInt | (-67117123))) * 1128) + (((~((-877145671) | i31)) | 1315232) * 564);
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArr22[2])[0] = i34 ^ (i34 << 5);
        }
        if (this.d != null) {
            return this.d;
        }
        this.d = this.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        return this.d;
    }

    @Override // defpackage.AutoValue_CaptureNode_In
    final String b() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 57;
        connect = i2 % 128;
        int i3 = i2 % 2;
        String str = this.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = IconCompatParcelizer + 67;
        connect = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.AutoValue_CaptureNode_In
    final String TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        RequestLine requestLine;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 93;
        connect = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        HttpUriRequest httpUriRequest = this.cancelAll;
        if (httpUriRequest != null) {
            return httpUriRequest.getMethod();
        }
        HttpRequest httpRequest = this.b;
        if (!(httpRequest instanceof HttpEntityEnclosingRequest) || (requestLine = httpRequest.getRequestLine()) == null) {
            return "NA";
        }
        String method = requestLine.getMethod();
        int i3 = connect + 109;
        IconCompatParcelizer = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 98 / 0;
        }
        return method;
    }

    @Override // defpackage.AutoValue_CaptureNode_In
    protected final String TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 23;
        int i3 = i2 % 128;
        connect = i3;
        int i4 = i2 % 2;
        HttpRequest httpRequest = this.b;
        if (httpRequest == null) {
            return "NA";
        }
        int i5 = i3 + 27;
        IconCompatParcelizer = i5 % 128;
        if (i5 % 2 != 0) {
            return httpRequest.getClass().getSimpleName();
        }
        String simpleName = httpRequest.getClass().getSimpleName();
        int i6 = 88 / 0;
        return simpleName;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static long P_(HttpResponse httpResponse) {
        int i = 2 % 2;
        int length = httpResponse.getStatusLine().toString().length();
        Header[] allHeaders = httpResponse.getAllHeaders();
        int length2 = allHeaders.length;
        long j = 0;
        int length3 = 2;
        int i2 = 0;
        boolean z = true;
        while (i2 < length2) {
            int i3 = connect + 33;
            IconCompatParcelizer = i3 % 128;
            int i4 = i3 % 2;
            Header header = allHeaders[i2];
            length3 += header.toString().length() + 2;
            if (z) {
                int i5 = IconCompatParcelizer + 19;
                connect = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 13 / 0;
                    if ("Content-Length".equals(header.getName())) {
                        try {
                            j = Long.parseLong(header.getValue());
                        } catch (NumberFormatException e2) {
                            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(e2.getMessage());
                            }
                        }
                        z = false;
                    }
                } else if ("Content-Length".equals(header.getName())) {
                    j = Long.parseLong(header.getValue());
                    z = false;
                }
            }
            i2++;
            int i7 = IconCompatParcelizer + 87;
            connect = i7 % 128;
            int i8 = i7 % 2;
        }
        return ((long) (length + 2 + length3)) + j;
    }

    static long O_(HttpContext httpContext) {
        int i = 2 % 2;
        RequestWrapper requestWrapper = (RequestWrapper) httpContext.getAttribute("http.request");
        long j = 0;
        int length = 2;
        for (Header header : requestWrapper.getAllHeaders()) {
            int i2 = IconCompatParcelizer + 67;
            connect = i2 % 128;
            int i3 = i2 % 2;
            length += header.toString().length() + 2;
            if ("Content-Length".equalsIgnoreCase(header.getName())) {
                int i4 = IconCompatParcelizer + 87;
                connect = i4 % 128;
                if (i4 % 2 != 0) {
                    j = Long.parseLong(header.getValue());
                    int i5 = 34 / 0;
                } else {
                    j = Long.parseLong(header.getValue());
                }
            }
        }
        long length2 = ((long) (requestWrapper.getRequestLine().toString().length() + 2 + length)) + j;
        int i6 = IconCompatParcelizer + 117;
        connect = i6 % 128;
        if (i6 % 2 == 0) {
            return length2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        getInterfaceDescriptor = new char[]{47363, 47414, 47360, 47410, 47413, 47419, 47350, 47409, 47377, 47403, 47408, 47423, 47415, 47329, 47416, 47361, 47417, 47412, 47378, 47331, 47406, 47376, 47420, 47407, 47418, 47421, 47388};
        RemoteActionCompatParcelizer = 2047719588;
        INotificationSideChannelStubProxy = true;
        INotificationSideChannelStub = true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, byte r7, byte r8) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 4
            int r7 = 68 - r7
            byte[] r0 = defpackage.getImageReaderProxyProvider.$$c
            int r6 = r6 * 2
            int r1 = 1 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L17
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2b
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r4 = r0[r8]
            int r3 = r3 + 1
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2b:
            int r8 = -r8
            int r3 = r3 + 1
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getImageReaderProxyProvider.$$g(int, byte, byte):java.lang.String");
    }
}
