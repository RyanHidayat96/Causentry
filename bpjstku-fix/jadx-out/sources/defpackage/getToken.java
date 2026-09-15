package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.bpjstku.data.about.AboutDataStore;
import com.bpjstku.data.about.AboutRepository;
import com.bpjstku.data.about.remote.AboutApi;
import com.bpjstku.data.about.remote.AboutApiClient;
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
import kotlin.text.Typography;
import okhttp3.OkHttpClient;
import org.koin.core.definition.Kind;

/* JADX INFO: loaded from: classes3.dex */
public final class getToken {
    private static final isLenovoTablet b;

    static {
        Function1 function1 = new Function1() { // from class: hasCallback
            private static final byte[] $$c = {110, -73, -111, 99};
            private static final int $$f = 247;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {97, 58, 103, -72, -15, -18, 11, -21, -7, -5, -7, -29, 5, 23, -56, 7, -32, 12, -11, -20, -3, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 57};
            private static final int $$e = 94;
            private static final byte[] $$a = {58, 66, -1, 15, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
            private static final int $$b = 196;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
            private static long b = 8590552431679251657L;

            /* JADX WARN: Code duplicated, block: B:10:0x0026  */
            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(short r6, byte r7, byte r8, java.lang.Object[] r9) {
                /*
                    int r8 = r8 * 52
                    int r8 = 53 - r8
                    int r6 = r6 * 14
                    int r6 = r6 + 84
                    int r7 = r7 * 52
                    int r7 = 56 - r7
                    byte[] r0 = defpackage.hasCallback.$$a
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L16
                    r3 = r8
                    r4 = r2
                    goto L28
                L16:
                    r3 = r2
                L17:
                    int r4 = r3 + 1
                    byte r5 = (byte) r6
                    r1[r3] = r5
                    if (r4 != r8) goto L26
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L26:
                    r3 = r0[r7]
                L28:
                    int r7 = r7 + 1
                    int r3 = -r3
                    int r6 = r6 + r3
                    int r6 = r6 + (-11)
                    r3 = r4
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.hasCallback.a(short, byte, byte, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0028  */
            /* JADX WARN: Code duplicated, block: B:8:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(int r5, byte r6, int r7, java.lang.Object[] r8) {
                /*
                    int r6 = r6 * 21
                    int r6 = 105 - r6
                    int r5 = r5 * 17
                    int r5 = 21 - r5
                    int r7 = r7 * 35
                    int r0 = 53 - r7
                    byte[] r1 = defpackage.hasCallback.$$d
                    byte[] r0 = new byte[r0]
                    int r7 = 52 - r7
                    r2 = 0
                    if (r1 != 0) goto L18
                    r3 = r7
                    r4 = r2
                    goto L2a
                L18:
                    r3 = r2
                L19:
                    byte r4 = (byte) r6
                    r0[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r7) goto L28
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r0, r2)
                    r8[r2] = r5
                    return
                L28:
                    r3 = r1[r5]
                L2a:
                    int r3 = -r3
                    int r6 = r6 + r3
                    int r6 = r6 + (-10)
                    int r5 = r5 + 1
                    r3 = r4
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.hasCallback.d(int, byte, int, java.lang.Object[]):void");
            }

            private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                abortCapture abortcapture = new abortCapture();
                char[] cArrB = abortCapture.b(b ^ (-2687588926731523482L), cArr, i);
                abortcapture.b = 4;
                int i3 = $11 + 77;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                while (abortcapture.b < cArrB.length) {
                    abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
                    int i5 = abortcapture.b;
                    try {
                        Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(b)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 64838), 1356 - TextUtils.indexOf("", ""), 38 - (ViewConfiguration.getJumpTapTimeout() >> 16), 894276454, false, $$g(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                        }
                        cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {abortcapture, abortcapture};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 47772), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 468, TextUtils.indexOf("", "") + 13, 896083767, false, "n", new Class[]{Object.class, Object.class});
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
                int i6 = $11 + 39;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    throw null;
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Throwable {
                Object[] objArr;
                int i = 2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 37567);
                    int packedPositionGroup = 625 - ExpandableListView.getPackedPositionGroup(0L);
                    int i2 = 14 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    byte b2 = $$a[5];
                    byte b3 = b2;
                    Object[] objArr2 = new Object[1];
                    a(b2, b3, b3, objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(pressedStateDuration, packedPositionGroup, i2, -477065106, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(new char[]{38382, 7153, 15527, 14453, 38287, 54576, 41373, 21514, 44861, 4851, 58585, 40594, 57593, 24485, 11871, 55715, 9635, 25953, 28993, 9297, 32627, 41517, 46213, 28391, 45089, 61377}, View.MeasureSpec.makeMeasureSpec(0, 0) + 1, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(new char[]{18700, 42749, 8883, 62470, 18793, 26686, 49036, 39035, 29635, 45043, 64205, 21149, 15377, 58043, 12297, 5623, 63825, 55411, 28484}, ExpandableListView.getPackedPositionType(0L) + 1, objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cIndexOf = (char) (37567 - TextUtils.indexOf("", "", 0));
                    int trimmedLength = TextUtils.getTrimmedLength("") + 625;
                    int maxKeyCode = 14 - (KeyEvent.getMaxKeyCode() >> 16);
                    byte[] bArr = $$a;
                    byte b4 = bArr[7];
                    Object[] objArr5 = new Object[1];
                    a(b4, bArr[5], b4, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, trimmedLength, maxKeyCode, -976899241, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
                    int i4 = i3 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cRgb = (char) ((-16739649) - Color.rgb(0, 0, 0));
                        int i5 = 625 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int iArgb = Color.argb(0, 0, 0, 0) + 14;
                        byte b5 = $$a[7];
                        byte b6 = b5;
                        Object[] objArr6 = new Object[1];
                        a(b5, b6, b6, objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cRgb, i5, iArgb, -973632554, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    int i6 = ((int[]) objArr7[2])[0];
                    int i7 = ((int[]) objArr7[0])[0];
                    String[] strArr = (String[]) objArr7[3];
                    int[] iArr = {i6};
                    int startUptimeMillis = (int) Process.getStartUptimeMillis();
                    int i8 = ~startUptimeMillis;
                    int i9 = (((~((-1342252241) | i8)) | (~(1584398076 | startUptimeMillis))) * 988) + 300894308 + (((~(startUptimeMillis | (-1581592285))) | 239340044 | (~(i8 | 1584398076))) * 988) + 2107527933;
                    int i10 = (i9 << 13) ^ i9;
                    int i11 = i10 ^ (i10 >>> 17);
                    ((int[]) objArr[1])[0] = i11 ^ (i11 << 5);
                    objArr = new Object[]{new int[]{i7}, new int[1], iArr, strArr};
                    int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
                    int i13 = i12 % 2;
                } else {
                    Object[] objArr8 = new Object[1];
                    c(new char[]{12997, 2495, 27493, 51155, 12964, 51070, 63071, 43948, 2070, Typography.half, 45851, 24884, 18396, 19944, 31171, 9848, 33456, 30527, 9859, 56315, 55363, 45129, 58207, 37207, 5949, 64908, 43037, 22031, 21196, 9932}, -ImageFormat.getBitsPerPixel(0), objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(new char[]{28906, 13411, 34343, 23645, 28809, 64185, 6923, 12322, 18995, 15718, 24137, 64213, 1506, 28724, 38045, 48561, 49341, 19169, 52161, 16501, 39541, 36242}, TextUtils.getOffsetAfter("", 0) + 1, objArr9);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                    }
                    Object[] objArr10 = new Object[1];
                    c(new char[]{9902, 39728, 46923, 5801, 9924, 22014, 10851, 31429, 7228, 37431, 28464, 45070, 21425, 57145, 42446, 63317, 38633, 58791, 64188, 2693}, -TextUtils.lastIndexOf("", '0'), objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    c(new char[]{915, 8915, 39466, 2354, 1018, 60440, 1809, 25937, 14683, 11217, 16964, 44930, 30371, 26261, 34959, 59615, 46052, 23647, 55260, 5398}, -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr11);
                    int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                    Object[] objArr12 = new Object[1];
                    c(new char[]{33869, 14596, 56070, 43313, 33919, 63438, 17982, 50525, 48784, 12301, 890, 4046, 61708, 32069, 51638, 18561, 13340, 18306, 38645, 46405, 28298, 32938, 21374, 65449, 41428, 52584, 6203, 14570, 58432, 5668, 9890, 25973, 8026, 20659, 58288, 44601, 20884, 40426, 43018, 59621, 38112, 59006, 30404, 54777, 53107, 9014, 13188, 7788, 575, 28066, 63559, 23333, 17660, 46667, 34064, 34189, 32757, 62215, 17374, 52938, 45628, 15819, 2196, 2822, 62763, 1745, 54614, 29762}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 1, objArr12);
                    String str = (String) objArr12[0];
                    Object[] objArr13 = new Object[1];
                    c(new char[]{14000, 63017, 335, 9067, 14035, 14567, 40053, 20304, 3132, 65399, 55607, 34197, 17325, 45672, 5033, 49804, 34529, 35064, 19643, 16158, 56434, 20357, 35127, 30117, 4905, 581, 49699, 45796, 22202, 55562, 64747, 61223, 44455, 40899, 14836, 9314, 58217, 21188, 29252, 25271, 9752, 10503, 44244, 24560, 32218, 60491, 59807, 37944, 45203, 41694, 8718, 53625, 63065, 31029, 24408, 3983, 52574, 15398, 39318, 17600, 155, 62136, 53979, 33034, 18389, 51626, 3867, 65052}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, objArr13);
                    String[] strArr2 = {str, (String) objArr13[0]};
                    int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 9;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
                    int i15 = i14 % 2;
                    try {
                        Object[] objArr14 = {applicationContext, strArr2, Integer.valueOf(iIntValue), 17, 2107527933};
                        byte[] bArr2 = $$d;
                        byte b7 = bArr2[24];
                        byte b8 = b7;
                        Object[] objArr15 = new Object[1];
                        d(b8, (byte) (b8 - 1), b7, objArr15);
                        Class<?> cls4 = Class.forName((String) objArr15[0]);
                        byte b9 = bArr2[24];
                        byte b10 = (byte) (b9 - 1);
                        byte b11 = b9;
                        Object[] objArr16 = new Object[1];
                        d(b10, b11, (byte) (b11 - 1), objArr16);
                        objArr = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                        int i16 = ((int[]) objArr[0])[0];
                        int i17 = ((int[]) objArr[2])[0];
                        if (applicationContext != null) {
                            int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i18 % 128;
                            int i19 = i18 % 2;
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char cGreen = (char) (37567 - Color.green(0));
                                int iIndexOf = TextUtils.indexOf("", "", 0) + 625;
                                int i20 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 14;
                                byte b12 = $$a[7];
                                byte b13 = b12;
                                Object[] objArr17 = new Object[1];
                                a(b12, b13, b13, objArr17);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cGreen, iIndexOf, i20, -973632554, false, (String) objArr17[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                            try {
                                Object[] objArr18 = new Object[1];
                                c(new char[]{38382, 7153, 15527, 14453, 38287, 54576, 41373, 21514, 44861, 4851, 58585, 40594, 57593, 24485, 11871, 55715, 9635, 25953, 28993, 9297, 32627, 41517, 46213, 28391, 45089, 61377}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr18);
                                Class<?> cls5 = Class.forName((String) objArr18[0]);
                                Object[] objArr19 = new Object[1];
                                c(new char[]{18700, 42749, 8883, 62470, 18793, 26686, 49036, 39035, 29635, 45043, 64205, 21149, 15377, 58043, 12297, 5623, 63825, 55411, 28484}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr19);
                                long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf = Long.valueOf(jLongValue2);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char cResolveSize = (char) (37567 - View.resolveSize(0, 0));
                                    int i21 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 624;
                                    int i22 = 15 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                    byte[] bArr3 = $$a;
                                    byte b14 = bArr3[7];
                                    Object[] objArr20 = new Object[1];
                                    a(b14, bArr3[5], b14, objArr20);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveSize, i21, i22, -976899241, false, (String) objArr20[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                    char offsetAfter = (char) (37567 - TextUtils.getOffsetAfter("", 0));
                                    int iRgb = (-16776591) - Color.rgb(0, 0, 0);
                                    int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 14;
                                    byte b15 = $$a[5];
                                    byte b16 = b15;
                                    Object[] objArr21 = new Object[1];
                                    a(b15, b16, b16, objArr21);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(offsetAfter, iRgb, doubleTapTimeout, -477065106, false, (String) objArr21[0], null);
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
                int i23 = ((int[]) objArr[0])[0];
                int i24 = ((int[]) objArr[2])[0];
                if (i24 == i23) {
                    int i25 = ((int[]) objArr[1])[0];
                    int i26 = ((int[]) objArr[2])[0];
                    int i27 = ((int[]) objArr[0])[0];
                    String[] strArr3 = (String[]) objArr[3];
                    int[] iArr2 = {i26};
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i28 = i25 + (-1432468450) + (((~((~iIdentityHashCode) | (-371570255))) | 1452167866) * (-235)) + (((~((-371570255) | iIdentityHashCode)) | 1452167866) * (-470)) + (((~(iIdentityHashCode | (-2204741))) | 1082802352) * 235);
                    int i29 = (i28 << 13) ^ i28;
                    int i30 = i29 ^ (i29 >>> 17);
                    ((int[]) objArr[1])[0] = i30 ^ (i30 << 5);
                    Object[] objArr22 = {new int[]{i27}, new int[1], iArr2, strArr3};
                } else {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr4 = (String[]) objArr[3];
                    if (strArr4 != null) {
                        for (String str2 : strArr4) {
                            arrayList.add(str2);
                        }
                    }
                    int[] iArr3 = new int[i24];
                    int i31 = i24 - 1;
                    iArr3[i31] = 1;
                    Toast.makeText((Context) null, iArr3[((i24 * i31) % 2) - 1], 1).show();
                    int i32 = ((int[]) objArr[1])[0];
                    int i33 = ((int[]) objArr[2])[0];
                    int i34 = ((int[]) objArr[0])[0];
                    String[] strArr5 = (String[]) objArr[3];
                    int[] iArr4 = {i33};
                    int i35 = (~System.identityHashCode(this)) | 1067900355;
                    int i36 = i32 + 1642473032 + (i35 * 495) + (((~i35) | 755239233) * 495);
                    int i37 = (i36 << 13) ^ i36;
                    int i38 = i37 ^ (i37 >>> 17);
                    ((int[]) objArr[1])[0] = i38 ^ (i38 << 5);
                    Object[] objArr23 = {new int[]{i34}, new int[1], iArr4, strArr5};
                }
                return getToken.TuitionPaymentFragmentspecialinlinedviewModeldefault2((isLenovoTablet) obj);
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
            private static java.lang.String $$g(int r6, byte r7, int r8) {
                /*
                    int r7 = r7 * 4
                    int r7 = r7 + 4
                    byte[] r0 = defpackage.hasCallback.$$c
                    int r6 = r6 * 3
                    int r1 = r6 + 1
                    int r8 = r8 * 2
                    int r8 = 107 - r8
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    if (r0 != 0) goto L16
                    r3 = r6
                    r4 = r2
                    goto L29
                L16:
                    r3 = r2
                L17:
                    byte r4 = (byte) r8
                    r1[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r6) goto L24
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L24:
                    r3 = r0[r7]
                    r5 = r3
                    r3 = r8
                    r8 = r5
                L29:
                    int r8 = -r8
                    int r8 = r8 + r3
                    int r7 = r7 + 1
                    r3 = r4
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.hasCallback.$$g(int, byte, int):java.lang.String");
            }
        };
        isLenovoTablet islenovotablet = new isLenovoTablet(false, false);
        function1.invoke(islenovotablet);
        b = islenovotablet;
    }

    public static final isLenovoTablet TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return b;
    }

    public static /* synthetic */ AboutApi TuitionPaymentFragmentbindingInflater1(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        return new AboutApi((AboutApiClient) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(AboutApiClient.class), null, null));
    }

    public static /* synthetic */ onActivityPostResumed TuitionPaymentFragmentspecialinlinedviewModeldefault1(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        return new onActivityPostSaveInstanceState((AboutRepository) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(AboutRepository.class), null, null));
    }

    public static /* synthetic */ AboutApiClient TuitionPaymentFragmentspecialinlinedviewModeldefault2(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        notifyStateDetached notifystatedetached = notifyStateDetached.INSTANCE;
        return (AboutApiClient) notifyStateDetached.b(AboutApiClient.class, (OkHttpClient) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(OkHttpClient.class), null, null), (String) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(String.class), new setUsingExifOrientation("baseUrl"), null));
    }

    public static /* synthetic */ AboutRepository TuitionPaymentFragmentspecialinlinedviewModeldefault3(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        return new AboutDataStore((AboutApi) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(AboutApi.class), null, null));
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(isLenovoTablet islenovotablet) {
        Intrinsics.checkNotNullParameter(islenovotablet, "");
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function2 = new Function2() { // from class: getExtraBinder
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return getToken.TuitionPaymentFragmentspecialinlinedviewModeldefault2((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind = Kind.Single;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(AboutApiClient.class));
        zoomGestureDetectorZoomEventMove.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function2;
        zoomGestureDetectorZoomEventMove.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove, new ZoomGestureDetectorgestureDetector1(false, false));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove);
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function3 = new Function2() { // from class: setExtraBinder
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return getToken.TuitionPaymentFragmentbindingInflater1((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd2 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind2 = Kind.Single;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove2 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(AboutApi.class));
        zoomGestureDetectorZoomEventMove2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function3;
        zoomGestureDetectorZoomEventMove2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind2;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove2, new ZoomGestureDetectorgestureDetector1(false, false));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove2);
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function4 = new Function2() { // from class: setSessionToken2Bundle
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return getToken.TuitionPaymentFragmentspecialinlinedviewModeldefault3((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd3 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind3 = Kind.Single;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove3 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(AboutRepository.class));
        zoomGestureDetectorZoomEventMove3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function4;
        zoomGestureDetectorZoomEventMove3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind3;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove3, new ZoomGestureDetectorgestureDetector1(false, false));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove3);
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function5 = new Function2() { // from class: hashCode
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return getToken.TuitionPaymentFragmentspecialinlinedviewModeldefault1((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd4 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind4 = Kind.Single;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove4 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(onActivityPostResumed.class));
        zoomGestureDetectorZoomEventMove4.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function5;
        zoomGestureDetectorZoomEventMove4.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind4;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove4, new ZoomGestureDetectorgestureDetector1(false, false));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove4);
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function6 = new Function2() { // from class: createSession
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return getToken.b((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd5 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind5 = Kind.Factory;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove5 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(ActivityResultContracts.class));
        zoomGestureDetectorZoomEventMove5.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function6;
        zoomGestureDetectorZoomEventMove5.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind5;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove5, new ZoomGestureDetectorgestureDetector1(false, false, 1, null));
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

    public static /* synthetic */ ActivityResultContracts b(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        return new ActivityResultContracts((onActivityPostResumed) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(onActivityPostResumed.class), null, null), (acquireBuffer) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(acquireBuffer.class), null, null));
    }
}
