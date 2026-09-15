package defpackage;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"LsetParcelFileDescriptor;", "", "<init>", "()V", "", "p0", "p1", "", "p2", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/lang/String;Ljava/lang/String;[B)Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 1, mv = {2, 3, 0})
public final class setParcelFileDescriptor {
    public static final setParcelFileDescriptor INSTANCE;
    private static char[] TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static long b;
    private static final byte[] $$c = {111, 40, 23, -13};
    private static final int $$d = 255;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {67, -127, -109, 9, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 63;
    private static int asInterface = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f1377a = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = 103 - r7
            int r6 = r6 * 52
            int r6 = r6 + 1
            byte[] r0 = defpackage.setParcelFileDescriptor.$$a
            int r8 = r8 * 52
            int r8 = 55 - r8
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r4 = r2
            r7 = r6
            goto L29
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            int r8 = r8 + 1
            r1[r3] = r5
            if (r4 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r0[r8]
        L29:
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.setParcelFileDescriptor.c(byte, byte, short, java.lang.Object[]):void");
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        INSTANCE = new setParcelFileDescriptor();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
        if (i % 2 == 0) {
            int i2 = 79 / 0;
        }
    }

    private setParcelFileDescriptor() {
    }

    public static String TuitionPaymentFragmentspecialinlinedviewModeldefault1(String p0, String p1) throws Throwable {
        int i = 2 % 2;
        try {
            URL url = new URL(p0);
            URL url2 = new URI(url.getProtocol(), url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef()).toURL();
            Intrinsics.checkExpressionValueIsNotNull(url2, "");
            byte[] bArrDecode = Base64.decode(p1, 8);
            Intrinsics.checkExpressionValueIsNotNull(bArrDecode, "");
            try {
                String path = url2.getPath();
                Intrinsics.checkExpressionValueIsNotNull(path, "");
                String query = url2.getQuery();
                Intrinsics.checkExpressionValueIsNotNull(query, "");
                String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(path, query, bArrDecode);
                StringBuilder sb = new StringBuilder();
                sb.append(p0);
                sb.append("&signature=");
                sb.append(strTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                String string = sb.toString();
                int i2 = asInterface + 39;
                f1377a = i2 % 128;
                int i3 = i2 % 2;
                return string;
            } catch (Exception e2) {
                e2.getMessage();
                return p0;
            }
        } catch (MalformedURLException unused) {
        }
    }

    private static void d(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i4 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1[i + i4])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) KeyEvent.keyCodeFromString(""), 2188 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 41 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 841711447, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(b), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33017 - Color.alpha(0)), 3011 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 25 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 321985076, false, $$e(b4, b5, (byte) (b5 + 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36505 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 3376 - TextUtils.indexOf("", "", 0, 0), 17 - View.resolveSizeAndState(0, 0, 0), -968507904, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                int i5 = $11 + 97;
                $10 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 2 / 3;
                }
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
            int i7 = $10 + 69;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.lastIndexOf("", '0') + 36506), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3375, View.resolveSizeAndState(0, 0, 0) + 17, -968507904, false, $$e(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            int i9 = $10 + 71;
            $11 = i9 % 128;
            int i10 = i9 % 2;
        }
        objArr[0] = new String(cArr);
    }

    private static String TuitionPaymentFragmentspecialinlinedviewModeldefault3(String p0, String p1, byte[] p2) throws Throwable {
        int i;
        Constructor constructor;
        int i2 = 2;
        int i3 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Constructor[] constructorArr = {Class.forName("javax.crypto.spec.SecretKeySpec").getDeclaredConstructor(byte[].class, String.class)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        long j = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 2823;
            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 22;
            byte[] bArr = $$a;
            byte b2 = bArr[5];
            Object[] objArr = new Object[1];
            c((byte) (-b2), bArr[54], (byte) (-b2), objArr);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, packedPositionType, doubleTapTimeout, 1814927978, false, (String) objArr[0], null);
        }
        char c2 = '0';
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) == null) {
            Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2823, 22 - KeyEvent.normalizeMetaState(0))).getDeclaredMethods();
            int length = declaredMethods.length;
            int i4 = 0;
            while (i4 < length) {
                int i5 = asInterface + 89;
                f1377a = i5 % 128;
                int i6 = i5 % i2;
                Method method = declaredMethods[i4];
                try {
                    Object[] objArr2 = new Object[1];
                    d((-1) - TextUtils.lastIndexOf("", c2), (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)) + 23, (char) (MotionEvent.axisFromString("") + 1), objArr2);
                    Class<?> cls = Class.forName((String) objArr2[0]);
                    Object[] objArr3 = new Object[1];
                    d(24 - View.getDefaultSize(0, 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 12, (char) (ViewConfiguration.getPressedStateDuration() >> 16), objArr3);
                    Object[] objArr4 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr3[0], null).invoke(method, null)).intValue())};
                    Object[] objArr5 = new Object[1];
                    d(36 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.lastIndexOf("", c2, 0) + 27, (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 25422), objArr5);
                    Class<?> cls2 = Class.forName((String) objArr5[0]);
                    Object[] objArr6 = new Object[1];
                    d(((Process.getThreadPriority(0) + 20) >> 6) + 62, (KeyEvent.getMaxKeyCode() >> 16) + 8, (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 17274), objArr6);
                    if (((Boolean) cls2.getMethod((String) objArr6[0], Integer.TYPE).invoke(null, objArr4)).booleanValue()) {
                        Class cls3 = Long.TYPE;
                        Object[] objArr7 = new Object[1];
                        d(KeyEvent.getMaxKeyCode() >> 16, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 24, (char) TextUtils.getOffsetBefore("", 0), objArr7);
                        Class<?> cls4 = Class.forName((String) objArr7[0]);
                        Object[] objArr8 = new Object[1];
                        d((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 71, TextUtils.getTrimmedLength("") + 13, (char) (44943 - View.resolveSizeAndState(0, 0, 0)), objArr8);
                        if (cls3.equals(cls4.getMethod((String) objArr8[0], null).invoke(method, null))) {
                            Object[] objArr9 = new Object[1];
                            d(Color.rgb(0, 0, 0) + 16777216, 25 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (ViewConfiguration.getPressedStateDuration() >> 16), objArr9);
                            Class<?> cls5 = Class.forName((String) objArr9[0]);
                            Object[] objArr10 = new Object[1];
                            d(View.resolveSize(0, 0) + 83, (ViewConfiguration.getWindowTouchSlop() >> 8) + 17, (char) (TextUtils.lastIndexOf("", '0') + 32639), objArr10);
                            Object[] objArr11 = (Object[]) cls5.getMethod((String) objArr10[0], null).invoke(method, null);
                            if (objArr11.length == 2 && Long.TYPE.equals(objArr11[0])) {
                                Object[] objArr12 = new Object[1];
                                d(View.MeasureSpec.getSize(0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 23, (char) View.resolveSize(0, 0), objArr12);
                                if (Class.forName((String) objArr12[0]).equals(objArr11[1])) {
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char c3 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 2823;
                                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 23;
                                        byte[] bArr2 = $$a;
                                        byte b3 = bArr2[5];
                                        Object[] objArr13 = new Object[1];
                                        c((byte) (-b3), bArr2[54], (byte) (-b3), objArr13);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c3, pressedStateDuration, iIndexOf, 1814927978, false, (String) objArr13[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char c4 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
                                        int iIndexOf2 = 2822 - TextUtils.indexOf((CharSequence) "", '0');
                                        int i7 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 21;
                                        byte[] bArr3 = $$a;
                                        byte b4 = bArr3[5];
                                        Object[] objArr14 = new Object[1];
                                        c((byte) (-b4), bArr3[54], (byte) (-b4), objArr14);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c4, iIndexOf2, i7, 1814927978, false, (String) objArr14[0], null);
                                    }
                                    try {
                                        Object[] objArr15 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                            char gidForName = (char) ((-1) - Process.getGidForName(""));
                                            int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 2823;
                                            int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 22;
                                            byte b5 = $$a[7];
                                            byte b6 = b5;
                                            Object[] objArr16 = new Object[1];
                                            c(b5, b6, b6, objArr16);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(gidForName, iKeyCodeFromString, pressedStateDuration2, -2137287382, false, (String) objArr16[0], new Class[]{Long.TYPE, Method.class});
                                        }
                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr15)).longValue();
                                        break;
                                    } catch (Throwable th) {
                                        Throwable cause = th.getCause();
                                        if (cause != null) {
                                            throw cause;
                                        }
                                        throw th;
                                    }
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                    i4++;
                    i2 = 2;
                    j = 0;
                    c2 = '0';
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char c5 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int iMyPid = 2823 - (Process.myPid() >> 22);
            int touchSlop = 22 - (ViewConfiguration.getTouchSlop() >> 8);
            byte[] bArr4 = $$a;
            byte b7 = bArr4[5];
            Object[] objArr17 = new Object[1];
            c((byte) (-b7), bArr4[54], (byte) (-b7), objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c5, iMyPid, touchSlop, 1814927978, false, (String) objArr17[0], null);
        }
        Object[] objArr18 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "", 0);
            int bitsPerPixel = 2822 - ImageFormat.getBitsPerPixel(0);
            int i8 = 23 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            byte b8 = $$a[7];
            byte b9 = b8;
            Object[] objArr19 = new Object[1];
            c(b9, (byte) (b9 + 5), b8, objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, bitsPerPixel, i8, 1025296417, false, (String) objArr19[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr18);
        Object[] objArr20 = {0, constructorArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-687574488);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char packedPositionType2 = (char) (ExpandableListView.getPackedPositionType(0L) + 37657);
            int iAlpha = Color.alpha(0) + 2720;
            int iIndexOf3 = 18 - TextUtils.indexOf((CharSequence) "", '0');
            byte[] bArr5 = $$a;
            byte b10 = bArr5[7];
            Object[] objArr21 = new Object[1];
            c(b10, bArr5[14], b10, objArr21);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(packedPositionType2, iAlpha, iIndexOf3, 865785343, false, (String) objArr21[0], new Class[]{Integer.TYPE, Constructor[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr20)).longValue();
        long j2 = -926397451;
        long j3 = -1;
        long j4 = jLongValue ^ j3;
        long jFreeMemory = (int) Runtime.getRuntime().freeMemory();
        long j5 = (j2 | jFreeMemory) ^ j3;
        long j6 = 407;
        long j7 = j2 ^ j3;
        long j8 = (j7 | jLongValue) ^ j3;
        long j9 = (((long) (-813)) * j2) + (((long) 408) * jLongValue) + (((long) (-814)) * (((j4 | j2) ^ j3) | j5)) + ((((j4 | (jFreeMemory ^ j3)) ^ j3) | j8 | j5) * j6) + (j6 * (((jLongValue | jFreeMemory) ^ j3) | j8 | ((j7 | jFreeMemory) ^ j3))) + ((long) (-97658171));
        int i9 = (int) Runtime.getRuntime().totalMemory();
        int i10 = ~i9;
        int i11 = ((int) (j9 >> 32)) & (953589614 + ((1750901487 | i10) * (-757)) + ((~(2063527919 | i9)) * 1514) + (((~(i9 | (-312626433))) | (~(i10 | 313675076)) | 1749852843) * 757));
        int i12 = ~((int) Runtime.getRuntime().freeMemory());
        int i13 = i11 | (((int) j9) & (227589968 + (((~(1452835307 | i12)) | (-15608898)) * (-983)) + (((~(i12 | (-15608898))) | 8912961) * 983)));
        int i14 = i13 >>> 24;
        int i15 = i13 & ViewCompat.MEASURED_SIZE_MASK;
        if (i14 != 0) {
            int i16 = asInterface + 1;
            f1377a = i16 % 128;
            int i17 = i16 % 2;
            i = 1;
        } else {
            i = 0;
        }
        arrayList.add((i == 0 || i15 >= 1 || (constructor = constructorArr[i15]) == null) ? null : constructor.toString());
        if ((i14 + 6) * i != 0) {
            throw null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(p0);
        sb.append('?');
        sb.append(p1);
        String string = sb.toString();
        SecretKeySpec secretKeySpec = new SecretKeySpec(p2, "HmacSHA1");
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(secretKeySpec);
        Charset charset = Charsets.UTF_8;
        if (string == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = string.getBytes(charset);
        Intrinsics.checkExpressionValueIsNotNull(bytes, "");
        String strEncodeToString = Base64.encodeToString(mac.doFinal(bytes), 10);
        Intrinsics.checkExpressionValueIsNotNull(strEncodeToString, "");
        return strEncodeToString;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentbindingInflater1 = new char[]{45558, 17015, 22270, 27491, 32666, 28738, 1217, 6452, 11691, 15976, 12938, 50967, 56194, 61426, 57461, 62697, 35144, 40344, 44645, 41671, 46880, 19366, 23599, 20638, 45563, 17011, 22268, 27471, 32731, 28746, 1225, 6460, 11685, 15907, 12938, 50945, 53944, 8505, 13744, 2093, 7380, 4876, 26511, 31354, 20197, 23846, 20932, 42073, 47308, 36028, 33595, 38823, 59910, 65238, 52523, 49539, 54398, 10473, 16232, 13277, 1607, 6874, 62095, 287, 5564, 10265, 15546, 13117, 18348, 23109, 7796, 60924, 63859, 50399, 53342, 57301, 43866, 46759, 33325, 37277, 40206, 26765, 29710, 52869, 15629, 10626, 5164, 171, 3874, 31679, 26185, 21207, 16716, 19939, 47230, 42190, 37017, 40734, 35729, 63025};
        b = 8210089010905760278L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(byte r7, int r8, byte r9) {
        /*
            int r8 = r8 * 3
            int r8 = 3 - r8
            byte[] r0 = defpackage.setParcelFileDescriptor.$$c
            int r9 = r9 * 3
            int r9 = r9 + 109
            int r7 = r7 * 2
            int r7 = 1 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2b
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            int r8 = r8 + 1
            r1[r3] = r5
            if (r4 != r7) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L26:
            r3 = r0[r8]
            r6 = r3
            r3 = r9
            r9 = r6
        L2b:
            int r9 = -r9
            int r9 = r9 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.setParcelFileDescriptor.$$e(byte, int, byte):java.lang.String");
    }
}
