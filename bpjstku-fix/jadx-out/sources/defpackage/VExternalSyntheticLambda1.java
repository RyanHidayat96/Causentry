package defpackage;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bpjstku.data.podcast.PodcastDataStore;
import com.bpjstku.data.podcast.PodcastRepository;
import com.bpjstku.data.podcast.remote.PodcastApi;
import com.bpjstku.data.podcast.remote.PodcastApiClient;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okhttp3.OkHttpClient;
import org.koin.core.definition.Kind;

/* JADX INFO: loaded from: classes3.dex */
public final class VExternalSyntheticLambda1 {
    private static final isLenovoTablet b;

    static {
        Function1 function1 = new Function1() { // from class: VExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3((isLenovoTablet) obj);
            }
        };
        isLenovoTablet islenovotablet = new isLenovoTablet(false, false);
        function1.invoke(islenovotablet);
        b = islenovotablet;
    }

    public static final isLenovoTablet b() {
        return b;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(isLenovoTablet islenovotablet) {
        Intrinsics.checkNotNullParameter(islenovotablet, "");
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function2 = new Function2() { // from class: VExternalSyntheticLambda4
            private static final byte[] $$c = {55, -47, -47, 67};
            private static final int $$f = 227;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {58, -103, 118, 14, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 54, 3, 3, -72, 60, -11, -7, 15, -1, -6, -16, 5, -11, 6, 3, -73, 56, 2, 3, -18, 10, -7, -16, 8, -65, 73, -3, -27, 1};
            private static final int $$e = 39;
            private static final byte[] $$a = {58, 66, -14, -31, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
            private static final int $$b = 15;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            private static int TuitionPaymentFragmentbindingInflater1 = 1;
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 7523315145017084261L;

            /* JADX WARN: Code duplicated, block: B:10:0x002c  */
            /* JADX WARN: Code duplicated, block: B:8:0x0024  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x002e). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(short r6, int r7, short r8, java.lang.Object[] r9) {
                /*
                    int r7 = r7 * 52
                    int r7 = 108 - r7
                    int r8 = r8 * 15
                    int r0 = r8 + 38
                    byte[] r1 = defpackage.VExternalSyntheticLambda4.$$a
                    int r6 = r6 * 3
                    int r6 = 84 - r6
                    byte[] r0 = new byte[r0]
                    int r8 = r8 + 37
                    r2 = 0
                    if (r1 != 0) goto L19
                    r6 = r7
                    r3 = r8
                    r4 = r2
                    goto L2e
                L19:
                    r3 = r2
                    r5 = r7
                    r7 = r6
                    r6 = r5
                L1d:
                    byte r4 = (byte) r7
                    r0[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r8) goto L2c
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    r9[r2] = r6
                    return
                L2c:
                    r3 = r1[r6]
                L2e:
                    int r3 = -r3
                    int r7 = r7 + r3
                    int r6 = r6 + 1
                    int r7 = r7 + (-11)
                    r3 = r4
                    goto L1d
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.VExternalSyntheticLambda4.a(short, int, short, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0026  */
            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(int r6, int r7, int r8, java.lang.Object[] r9) {
                /*
                    int r8 = r8 * 47
                    int r8 = 51 - r8
                    int r6 = 99 - r6
                    int r7 = r7 * 47
                    int r0 = r7 + 1
                    byte[] r1 = defpackage.VExternalSyntheticLambda4.$$d
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    if (r1 != 0) goto L15
                    r4 = r7
                    r6 = r8
                    r3 = r2
                    goto L2a
                L15:
                    r3 = r2
                    r5 = r8
                    r8 = r6
                    r6 = r5
                L19:
                    byte r4 = (byte) r8
                    r0[r3] = r4
                    if (r3 != r7) goto L26
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    r9[r2] = r6
                    return
                L26:
                    int r3 = r3 + 1
                    r4 = r1[r6]
                L2a:
                    int r8 = r8 + r4
                    int r8 = r8 + 3
                    int r6 = r6 + 1
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.VExternalSyntheticLambda4.c(int, int, int, java.lang.Object[]):void");
            }

            private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                abortCapture abortcapture = new abortCapture();
                char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ (-2687588926731523482L), cArr, i);
                abortcapture.b = 4;
                while (abortcapture.b < cArrB.length) {
                    int i3 = $10 + 79;
                    $11 = i3 % 128;
                    int i4 = i3 % 2;
                    abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
                    int i5 = abortcapture.b;
                    try {
                        Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.indexOf("", "") + 64838), 1357 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), TextUtils.getCapsMode("", 0, 0) + 38, 894276454, false, $$g(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                        }
                        cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {abortcapture, abortcapture};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - (Process.myTid() >> 22)), View.resolveSize(0, 0) + 468, ImageFormat.getBitsPerPixel(0) + 14, 896083767, false, "n", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                        int i6 = $10 + 67;
                        $11 = i6 % 128;
                        int i7 = i6 % 2;
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

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws Throwable {
                Object[] objArr;
                int i = 2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char offsetBefore = (char) (43042 - TextUtils.getOffsetBefore("", 0));
                    int iMyTid = 3111 - (Process.myTid() >> 22);
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22;
                    byte[] bArr = $$a;
                    Object[] objArr2 = new Object[1];
                    a(bArr[7], bArr[40], bArr[5], objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetBefore, iMyTid, minimumFlingVelocity, -1272852037, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                b(new char[]{61004, 41955, 60973, 142, 46202, 52613, 25135, 35973, 61976, 9470, 8302, 20933, 63035, 6283, 44072, 9612, 18961, 58551, 6214, 43446, 56849, 28819, 33858, 15784, 21011, 64695}, Drawable.resolveOpacity(0, 0) + 1, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                b(new char[]{33823, 59513, 33914, 19222, 25846, 26147, 2144, 50963, 8849, 36698, 61671, 64029, 40034, 21251, 31971, 36367, 8274, 44851, 51422}, -MotionEvent.axisFromString(""), objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char threadPriority = (char) (43042 - ((Process.getThreadPriority(0) + 20) >> 6));
                    int maximumFlingVelocity = 3111 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 23;
                    byte[] bArr2 = $$a;
                    byte b2 = bArr2[7];
                    byte b3 = bArr2[5];
                    Object[] objArr5 = new Object[1];
                    a(b2, b3, b3, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(threadPriority, maximumFlingVelocity, iIndexOf, -1269618118, false, (String) objArr5[0], null);
                }
                if (j != ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object[] objArr6 = new Object[1];
                    b(new char[]{39037, 19387, 38935, 59609, 26670, 42809, 5215, 25816, 11870, 20049, 64557, 15146, 32770, 61582, 28691, 20233, 15402, 3304, 50193, 49937}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, objArr6);
                    Class<?> cls2 = Class.forName((String) objArr6[0]);
                    Object[] objArr7 = new Object[1];
                    b(new char[]{9028, 53021, 9005, 27770, 3154, 14537, 44860, 57467, 18993, 53678, 38999, 42178, 15124, 29799, 5212, 53479, 34595, 34901, 41087, 23782}, (ViewConfiguration.getLongPressTimeout() >> 16) + 1, objArr7);
                    try {
                        Object[] objArr8 = {null, Integer.valueOf(((Integer) cls2.getMethod((String) objArr7[0], Object.class).invoke(null, this)).intValue()), 0, 1623613227};
                        byte[] bArr3 = $$d;
                        byte b4 = bArr3[50];
                        byte b5 = (byte) (b4 - 1);
                        byte b6 = b4;
                        Object[] objArr9 = new Object[1];
                        c(b5, b6, b6, objArr9);
                        Class<?> cls3 = Class.forName((String) objArr9[0]);
                        byte b7 = bArr3[50];
                        byte b8 = (byte) (b7 - 1);
                        Object[] objArr10 = new Object[1];
                        c(b7, b8, b8, objArr10);
                        objArr = (Object[]) cls3.getMethod((String) objArr10[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr8);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char c = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 43043);
                            int i2 = 3112 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                            int maximumFlingVelocity2 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 22;
                            byte b9 = $$a[7];
                            byte b10 = b9;
                            Object[] objArr11 = new Object[1];
                            a(b9, b10, b10, objArr11);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, i2, maximumFlingVelocity2, 154975793, false, (String) objArr11[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArr);
                        try {
                            Object[] objArr12 = new Object[1];
                            b(new char[]{61004, 41955, 60973, 142, 46202, 52613, 25135, 35973, 61976, 9470, 8302, 20933, 63035, 6283, 44072, 9612, 18961, 58551, 6214, 43446, 56849, 28819, 33858, 15784, 21011, 64695}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1, objArr12);
                            Class<?> cls4 = Class.forName((String) objArr12[0]);
                            Object[] objArr13 = new Object[1];
                            b(new char[]{33823, 59513, 33914, 19222, 25846, 26147, 2144, 50963, 8849, 36698, 61671, 64029, 40034, 21251, 31971, 36367, 8274, 44851, 51422}, 1 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr13);
                            long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char cAlpha = (char) (Color.alpha(0) + 43042);
                                int iRgb = (-16774105) - Color.rgb(0, 0, 0);
                                int i3 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 22;
                                byte[] bArr4 = $$a;
                                byte b11 = bArr4[7];
                                byte b12 = bArr4[5];
                                Object[] objArr14 = new Object[1];
                                a(b11, b12, b12, objArr14);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cAlpha, iRgb, i3, -1269618118, false, (String) objArr14[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 43042);
                                int defaultSize = 3111 - View.getDefaultSize(0, 0);
                                int iKeyCodeFromString = 22 - KeyEvent.keyCodeFromString("");
                                byte[] bArr5 = $$a;
                                Object[] objArr15 = new Object[1];
                                a(bArr5[7], bArr5[40], bArr5[5], objArr15);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(keyRepeatDelay, defaultSize, iKeyCodeFromString, -1272852037, false, (String) objArr15[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf2);
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
                } else {
                    int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
                    TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                    int i5 = i4 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 43042);
                        int i6 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3110;
                        int i7 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 21;
                        byte b13 = $$a[7];
                        byte b14 = b13;
                        Object[] objArr16 = new Object[1];
                        a(b13, b14, b14, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(tapTimeout, i6, i7, 154975793, false, (String) objArr16[0], null);
                    }
                    Object[] objArr17 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null);
                    int i8 = ((int[]) objArr17[2])[0];
                    int i9 = ((int[]) objArr17[1])[0];
                    String[] strArr = (String[]) objArr17[3];
                    int[] iArr = {i8};
                    int[] iArr2 = {i9};
                    int iMyTid2 = Process.myTid();
                    int i10 = ~((-272761157) | iMyTid2);
                    int i11 = ~iMyTid2;
                    int i12 = (-1463704796) + ((i10 | (~((-1091310617) | i11))) * 497) + (((~(iMyTid2 | (-1091310617))) | (~((-340959687) | i11)) | 68198530) * 497) + 1623613227;
                    int i13 = (i12 << 13) ^ i12;
                    int i14 = i13 ^ (i13 >>> 17);
                    ((int[]) objArr[0])[0] = i14 ^ (i14 << 5);
                    objArr = new Object[]{new int[1], iArr2, iArr, strArr};
                }
                int i15 = ((int[]) objArr[1])[0];
                int i16 = ((int[]) objArr[2])[0];
                if (i16 == i15) {
                    int i17 = ((int[]) objArr[0])[0];
                    int i18 = ((int[]) objArr[2])[0];
                    int i19 = ((int[]) objArr[1])[0];
                    String[] strArr2 = (String[]) objArr[3];
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i20 = i17 + (-1791917092) + (((~((-279075109) | (~iIdentityHashCode))) | (-1425956351)) * (-591)) + ((iIdentityHashCode | (-279075109)) * 591);
                    int i21 = (i20 << 13) ^ i20;
                    int i22 = i21 ^ (i21 >>> 17);
                    ((int[]) objArr[0])[0] = i22 ^ (i22 << 5);
                    Object[] objArr18 = {new int[1], new int[]{i19}, new int[]{i18}, strArr2};
                    int i23 = TuitionPaymentFragmentbindingInflater1 + 47;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i23 % 128;
                    int i24 = i23 % 2;
                    PodcastApiClient podcastApiClientTuitionPaymentFragmentspecialinlinedviewModeldefault2 = VExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2((FileTransformFactory) obj, (CoordinateTransform) obj2);
                    int i25 = TuitionPaymentFragmentbindingInflater1 + 7;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i25 % 128;
                    int i26 = i25 % 2;
                    return podcastApiClientTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                }
                ArrayList arrayList = new ArrayList();
                String[] strArr3 = (String[]) objArr[3];
                if (strArr3 != null) {
                    for (String str : strArr3) {
                        arrayList.add(str);
                    }
                }
                throw new RuntimeException(String.valueOf(i16));
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0024  */
            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(int r7, byte r8, short r9) {
                /*
                    int r8 = r8 * 3
                    int r8 = 4 - r8
                    byte[] r0 = defpackage.VExternalSyntheticLambda4.$$c
                    int r9 = r9 * 2
                    int r9 = r9 + 1
                    int r7 = r7 * 4
                    int r7 = r7 + 107
                    byte[] r1 = new byte[r9]
                    r2 = 0
                    if (r0 != 0) goto L16
                    r3 = r8
                    r4 = r2
                    goto L29
                L16:
                    r3 = r2
                L17:
                    int r4 = r3 + 1
                    byte r5 = (byte) r7
                    r1[r3] = r5
                    if (r4 != r9) goto L24
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    return r7
                L24:
                    r3 = r0[r8]
                    r6 = r3
                    r3 = r8
                    r8 = r6
                L29:
                    int r8 = -r8
                    int r3 = r3 + 1
                    int r7 = r7 + r8
                    r8 = r3
                    r3 = r4
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.VExternalSyntheticLambda4.$$g(int, byte, short):java.lang.String");
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind = Kind.Single;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(PodcastApiClient.class));
        zoomGestureDetectorZoomEventMove.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function2;
        zoomGestureDetectorZoomEventMove.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind;
        boolean z = false;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove, new ZoomGestureDetectorgestureDetector1(false, false));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove);
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function3 = new Function2() { // from class: VExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return VExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd2 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind2 = Kind.Single;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove2 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(PodcastApi.class));
        zoomGestureDetectorZoomEventMove2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function3;
        zoomGestureDetectorZoomEventMove2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind2;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove2, new ZoomGestureDetectorgestureDetector1(false, false));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove2);
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function4 = new Function2() { // from class: VExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return VExternalSyntheticLambda1.b((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd3 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind3 = Kind.Single;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove3 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(PodcastRepository.class));
        zoomGestureDetectorZoomEventMove3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function4;
        zoomGestureDetectorZoomEventMove3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind3;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove3, new ZoomGestureDetectorgestureDetector1(false, false));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove3);
        VExternalSyntheticLambda6 vExternalSyntheticLambda6 = new VExternalSyntheticLambda6();
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd4 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind4 = Kind.Single;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove4 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(addCallback.class));
        zoomGestureDetectorZoomEventMove4.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = vExternalSyntheticLambda6;
        zoomGestureDetectorZoomEventMove4.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind4;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove4, new ZoomGestureDetectorgestureDetector1(false, false));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove4);
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function5 = new Function2() { // from class: W
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return VExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd5 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind5 = Kind.Factory;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove5 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(ShareTargetParams.class));
        zoomGestureDetectorZoomEventMove5.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function5;
        zoomGestureDetectorZoomEventMove5.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind5;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove5, new ZoomGestureDetectorgestureDetector1(z, z, 1, null));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove5);
        ZoomGestureDetectorZoomEventBegin zoomGestureDetectorZoomEventBegin = zoomGestureDetectorZoomEventMove5.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Boolean bool = Boolean.TRUE;
        Map<String, Object> map = zoomGestureDetectorZoomEventBegin.TuitionPaymentFragmentbindingInflater1;
        if (bool == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Any");
        }
        map.put("isViewModel", bool);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ PodcastApiClient TuitionPaymentFragmentspecialinlinedviewModeldefault2(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        notifyStateDetached notifystatedetached = notifyStateDetached.INSTANCE;
        return (PodcastApiClient) notifyStateDetached.b(PodcastApiClient.class, (OkHttpClient) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(OkHttpClient.class), null, null), (String) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(String.class), new setUsingExifOrientation("baseUrl"), null));
    }

    public static /* synthetic */ PodcastRepository b(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        return new PodcastDataStore((PodcastApi) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(PodcastApi.class), null, null));
    }

    public static /* synthetic */ PodcastApi TuitionPaymentFragmentspecialinlinedviewModeldefault3(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        return new PodcastApi((PodcastApiClient) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(PodcastApiClient.class), null, null));
    }

    public static /* synthetic */ addCallback TuitionPaymentFragmentbindingInflater1(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        return new accessgetFallbackOnBackPressedp((PodcastRepository) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(PodcastRepository.class), null, null));
    }

    public static /* synthetic */ ShareTargetParams TuitionPaymentFragmentspecialinlinedviewModeldefault1(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        return new ShareTargetParams((addCallback) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(addCallback.class), null, null), (registerlambda1) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(registerlambda1.class), null, null), (acquireBuffer) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(acquireBuffer.class), null, null));
    }
}
