package com.google.android.libraries.places.api.model.kotlin;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.libraries.places.api.model.ConnectorAggregation;
import com.google.android.libraries.places.api.model.EVConnectorType;
import defpackage.LayoutSettings;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aD\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u001b\b\u0002\u0010\n\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0002\b\tH\u0007¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/google/android/libraries/places/api/model/EVConnectorType;", "p0", "", "p1", "", "p2", "Lkotlin/Function1;", "Lcom/google/android/libraries/places/api/model/ConnectorAggregation$Builder;", "", "Lkotlin/ExtensionFunctionType;", "p3", "Lcom/google/android/libraries/places/api/model/ConnectorAggregation;", "connectorAggregation", "(Lcom/google/android/libraries/places/api/model/EVConnectorType;DILkotlin/jvm/functions/Function1;)Lcom/google/android/libraries/places/api/model/ConnectorAggregation;"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ConnectorAggregationKt {
    private static final byte[] $$c = {109, 48, -62, 38};
    private static final int $$d = 226;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {107, 48, 57, 107, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 18;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static char[] TuitionPaymentFragmentbindingInflater1 = {45565, 11058, 33912, 25006, 56051, 46133, 4472, 35570, 26623, 49459, 47730, 6056, 61689, 27186, 51048, 41202, 7647, 63283, 20594, 52648, 42745, Typography.dollar, 64872, 43864, 12698, 40651, 31550, 49231, 44687, 3027, 36886, 32092, 56222, 41163, 3350, 59984, 28817, 56822, 47633, 1881, 60816, 42957, 15618, 37448, 30622, 52419, 41477, 1864, 40130, 29135, 55043, 44098, 408, 59081, 31746, 53592, 46786, 3036, 57601, 17922, 56237, 45276, 5660, 60224, 16517, 9679, 47885, 4184, 62853, 19139, 8194, 34149, 6786, 65482, 21763, 45562, 11056, 33917, 25019, 56047, 15925, 42175, 3054, 60985, 21813, 15283, 40692, 1331, 59502, 20213, 13814, 38966, 32625, 58814, 18615, 12094, 37503, 30904, 57327, 16957, 10621, 36795, 29432, 55606, 48255, 8948, 35304, 27705, 45485, 23654, 50875, 27066, 35888, 14193, 22966, 64737, 26419, 35443, 11445, 22518, 64056, 7537};
    private static long b = 4730866476123106140L;

    private static void c(short s, int i, int i2, Object[] objArr) {
        int i3 = i2 + 4;
        int i4 = 98 - (s * 14);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[53 - i];
        int i5 = 52 - i;
        int i6 = -1;
        if (bArr == null) {
            i4 = (i5 + i3) - 11;
            i3++;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i4;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i8 = i3;
            i4 = (i4 + bArr[i3]) - 11;
            i3 = i8 + 1;
            i6 = i7;
        }
    }

    public static /* synthetic */ ConnectorAggregation connectorAggregation$default(EVConnectorType eVConnectorType, double d, int i, Function1 function1, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 61;
        int i5 = i4 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5;
        if (i4 % 2 == 0 ? (i2 & 8) != 0 : (i2 & 86) != 0) {
            int i6 = i5 + 99;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
            int i7 = i6 % 2;
            function1 = null;
        }
        ConnectorAggregation connectorAggregation = connectorAggregation(eVConnectorType, d, i, function1);
        int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
        int i9 = i8 % 2;
        return connectorAggregation;
    }

    public static final ConnectorAggregation connectorAggregation(EVConnectorType eVConnectorType, double d, int i, Function1<? super ConnectorAggregation.Builder, Unit> function1) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(eVConnectorType, "");
        ConnectorAggregation.Builder builder = ConnectorAggregation.builder(eVConnectorType, Double.valueOf(d), Integer.valueOf(i));
        if (function1 != null) {
            function1.invoke(builder);
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 75;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 5 % 5;
            }
        }
        ConnectorAggregation connectorAggregationBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(connectorAggregationBuild, "");
        return connectorAggregationBuild;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i5 = $10 + 83;
            $11 = i5 % 128;
            if (i5 % i3 == 0) {
                int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1[i >> i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 + 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Color.alpha(0), TextUtils.getOffsetAfter("", 0) + 2187, View.resolveSizeAndState(0, 0, 0) + 40, 841711447, false, $$e(b2, b3, (byte) (b3 - 2)), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(b), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33017 - View.resolveSizeAndState(0, 0, 0)), 3010 - TextUtils.indexOf((CharSequence) "", '0', 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 26, 321985076, false, $$e(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36505 - KeyEvent.normalizeMetaState(0)), View.MeasureSpec.getMode(0) + 3376, 17 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -968507904, false, $$e(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i7 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                Object[] objArr5 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1[i + i7])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = (byte) (b8 + 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) View.MeasureSpec.getSize(0), 2188 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 39, 841711447, false, $$e(b8, b9, (byte) (b9 - 2)), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i7), Long.valueOf(b), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (33017 - ExpandableListView.getPackedPositionGroup(0L)), 3011 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 26 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 321985076, false, $$e(b10, b11, b11), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    byte b12 = (byte) 0;
                    byte b13 = (byte) (b12 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (36505 - View.resolveSize(0, 0)), View.MeasureSpec.getMode(0) + 3376, Color.green(0) + 17, -968507904, false, $$e(b12, b13, (byte) (b13 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
            }
            i3 = 2;
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i8 = $10 + 7;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                    byte b14 = (byte) 0;
                    byte b15 = (byte) (b14 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0) + 36506), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 3376, 16 - TextUtils.lastIndexOf("", '0'), -968507904, false, $$e(b14, b15, (byte) (b15 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
                int i9 = 2 / 0;
            } else {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr9 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                    byte b16 = (byte) 0;
                    byte b17 = (byte) (b16 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 36505), 3377 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 17 - Color.red(0), -968507904, false, $$e(b16, b17, (byte) (b17 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr9);
            }
        }
        objArr[0] = new String(cArr);
        int i10 = $11 + 81;
        $10 = i10 % 128;
        if (i10 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x079b  */
    /* JADX WARN: Code duplicated, block: B:109:0x08e1  */
    /* JADX WARN: Code duplicated, block: B:122:0x03da A[EXC_TOP_SPLITTER, PHI: r16
  0x03da: PHI (r16v5 ??) = (r16v37 ??), (r16v38 ??) binds: [B:40:0x03c5, B:38:0x03bf] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x03c1 A[PHI: r16
  0x03c1: PHI (r16v2 ??) = (r16v44 ??), (r16v45 ??) binds: [B:26:0x0313, B:38:0x03bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:43:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:44:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:48:0x03e1 A[Catch: Exception -> 0x075a, TRY_LEAVE, TryCatch #3 {Exception -> 0x075a, blocks: (B:46:0x03da, B:48:0x03e1, B:52:0x045f, B:54:0x0474, B:53:0x0463), top: B:122:0x03da }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0450  */
    /* JADX WARN: Code duplicated, block: B:53:0x0463 A[Catch: Exception -> 0x075a, TryCatch #3 {Exception -> 0x075a, blocks: (B:46:0x03da, B:48:0x03e1, B:52:0x045f, B:54:0x0474, B:53:0x0463), top: B:122:0x03da }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0495 A[Catch: all -> 0x059e, TryCatch #5 {all -> 0x059e, blocks: (B:55:0x0488, B:57:0x0495, B:58:0x04d3), top: B:126:0x0488, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0599  */
    /* JADX WARN: Code duplicated, block: B:71:0x05a9 A[Catch: Exception -> 0x075c, TRY_LEAVE, TryCatch #2 {Exception -> 0x075c, blocks: (B:60:0x053d, B:67:0x05a1, B:69:0x05a7, B:70:0x05a8, B:71:0x05a9, B:77:0x0624, B:79:0x065a, B:85:0x06cc, B:90:0x073b, B:94:0x0752, B:96:0x0758, B:97:0x0759, B:86:0x06de, B:88:0x06eb, B:89:0x0734, B:55:0x0488, B:57:0x0495, B:58:0x04d3), top: B:121:0x03df, inners: #0, #5 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:75:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:82:0x0694  */
    /* JADX WARN: Code duplicated, block: B:83:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:88:0x06eb A[Catch: all -> 0x0751, TryCatch #0 {all -> 0x0751, blocks: (B:86:0x06de, B:88:0x06eb, B:89:0x0734), top: B:117:0x06de, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0741  */
    /* JADX WARN: Code duplicated, block: B:99:0x075c A[PHI: r16
  0x075c: PHI (r16v7 ??) = (r16v6 ??), (r16v9 ??), (r16v10 ??) binds: [B:98:0x075a, B:116:0x075c, B:91:0x073f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v17 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v33 */
    /* JADX WARN: Type inference failed for: r16v34 */
    /* JADX WARN: Type inference failed for: r16v35 */
    /* JADX WARN: Type inference failed for: r16v36 */
    /* JADX WARN: Type inference failed for: r16v37 */
    /* JADX WARN: Type inference failed for: r16v38 */
    /* JADX WARN: Type inference failed for: r16v39 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v40 */
    /* JADX WARN: Type inference failed for: r16v41 */
    /* JADX WARN: Type inference failed for: r16v42 */
    /* JADX WARN: Type inference failed for: r16v43 */
    /* JADX WARN: Type inference failed for: r16v44 */
    /* JADX WARN: Type inference failed for: r16v45 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r3v3 */
    public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, int i, int i2, int i3) throws Throwable {
        int i4;
        int i5;
        int i6;
        ?? r16;
        int i7;
        int i8;
        ?? r17;
        int i9;
        ?? r18;
        int i10;
        int i11;
        int i12;
        int absoluteGravity;
        int i13;
        int i14;
        int i15;
        int i16;
        String str;
        int i17;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        Object[] objArr;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i23;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i24;
        int i25;
        int i26;
        int i27;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        int i28;
        ?? r19;
        int i29;
        int i30 = 2 % 2;
        int i31 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i32 = (i31 ^ 83) + ((i31 & 83) << 1);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i32 % 128;
        int i33 = i32 % 2;
        if (context != null) {
            int i34 = (i31 ^ 1) + ((i31 & 1) << 1);
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i34 % 128;
            if (i34 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            try {
                int iLastIndexOf = TextUtils.lastIndexOf("", '0');
                int i35 = iLastIndexOf * (-711);
                int i36 = ~(((-2) ^ iLastIndexOf) | ((-2) & iLastIndexOf));
                int i37 = ~i;
                int i38 = ~((i37 ^ iLastIndexOf) | (i37 & iLastIndexOf));
                int i39 = (i35 & 713) + (i35 | 713) + (((i36 ^ i38) | (i38 & i36)) * (-712));
                int i40 = (-2) | i37;
                int i41 = ~((i40 & iLastIndexOf) | (i40 ^ iLastIndexOf));
                int i42 = (iLastIndexOf ^ 1) | (iLastIndexOf & 1);
                int i43 = ~((i42 & i) | (i42 ^ i));
                int i44 = -(-(((i41 & i43) | (i41 ^ i43)) * (-712)));
                int i45 = (i39 ^ i44) + ((i44 & i39) << 1);
                int i46 = ~i;
                int i47 = ~((iLastIndexOf & i46) | (i46 ^ iLastIndexOf));
                int i48 = ((i47 & (-2)) | ((-2) ^ i47)) * 712;
                int i49 = ((i45 | i48) << 1) - (i48 ^ i45);
                int i50 = -TextUtils.getOffsetAfter("", 0);
                Object[] objArr2 = new Object[1];
                a(i49, ((i50 | 23) << 1) - (i50 ^ 23), (char) (TextUtils.lastIndexOf("", '0', 0) + 1), objArr2);
                Class<?> cls = Class.forName((String) objArr2[0]);
                int i51 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int i52 = i51 * (-575);
                int i53 = ((i52 | (-13225)) << 1) - (i52 ^ (-13225));
                int i54 = ~i51;
                int i55 = i53 + (((~(((-24) ^ i) | ((-24) & i))) | (~((i54 ^ (-24)) | (i54 & (-24))))) * 576);
                int i56 = ~i51;
                int i57 = ~(i56 | 23);
                int i58 = (-24) | i46;
                int i59 = ~((i58 ^ i51) | (i58 & i51));
                int i60 = ((i59 & i57) | (i57 ^ i59)) * 576;
                int i61 = ((i55 | i60) << 1) - (i60 ^ i55);
                int i62 = (~((i56 ^ (-24)) | (i56 & (-24)))) * 576;
                int i63 = ((i61 | i62) << 1) - (i62 ^ i61);
                int i64 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                int i65 = i64 * (-949);
                int i66 = (i65 & (-16133)) + (i65 | (-16133));
                int i67 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                int i68 = ~(((-18) ^ i67) | ((-18) & i67));
                int i69 = ~i64;
                int i70 = (i68 | (~((i69 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i69 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4)))) * 1900;
                int i71 = (i66 & i70) + (i70 | i66);
                int i72 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                i29 = iTuitionPaymentFragmentspecialinlinedviewModeldefault4 & 17;
                int i73 = ((~((i72 & i64) | (i72 ^ i64))) | (~(((iTuitionPaymentFragmentspecialinlinedviewModeldefault4 ^ 17) | i29) == true ? 1 : 0))) * (-950);
                int i74 = (i71 & i73) + (i73 | i71);
                int i75 = ~((i67 ^ 17) | (i67 & 17));
                int i76 = ~((i64 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i64 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                int i77 = ((i76 & i75) | (i75 ^ i76)) * 950;
                Object[] objArr3 = new Object[1];
                a(i63, (i74 & i77) + (i77 | i74), (char) (6817 - (~(-TextUtils.indexOf((CharSequence) "", '0', 0)))), objArr3);
                Object objInvoke = cls.getMethod((String) objArr3[0], null).invoke(context, null);
                int maximumFlingVelocity = ViewConfiguration.getMaximumFlingVelocity() >> 16;
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                int i78 = ~maximumFlingVelocity;
                int i79 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault5 ^ 41) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault5 & 41));
                int i80 = ((maximumFlingVelocity * (-464)) - 38089) + (((i79 & i78) | (i78 ^ i79)) * (-465));
                int i81 = ~maximumFlingVelocity;
                int i82 = ~((i81 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i81 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                int i83 = ((i82 & 41) | (i82 ^ 41)) * 930;
                int i84 = ((i80 | i83) << 1) - (i83 ^ i80);
                int i85 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault5 | 41 | i78) * 465;
                int i86 = ((i84 | i85) << 1) - (i85 ^ i84);
                int i87 = 33 - (~(-(Process.myTid() >> 22)));
                int iGreen = Color.green(0);
                Object[] objArr4 = new Object[1];
                a(i86, i87, (char) (((iGreen | 5680) << 1) - (iGreen ^ 5680)), objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                int i88 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                int i89 = i88 * (-381);
                int i90 = (i89 & 14400) + (i89 | 14400);
                int i91 = ~i88;
                int i92 = i90 + (i91 * (-191));
                int i93 = -(-((i88 | (~(iTuitionPaymentFragmentspecialinlinedviewModeldefault6 | 75))) * 191));
                int i94 = ((i92 | i93) << 1) - (i93 ^ i92);
                int i95 = ~((i91 ^ 75) | (i91 & 75));
                int i96 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                int i97 = ~((i96 & 75) | (i96 ^ 75));
                int i98 = -(-(((i95 & i97) | (i95 ^ i97)) * 191));
                int i99 = (i94 & i98) + (i98 | i94);
                int windowTouchSlop = ViewConfiguration.getWindowTouchSlop() >> 8;
                int i100 = (windowTouchSlop & 5) + (windowTouchSlop | 5);
                char mirror = AndroidCharacter.getMirror('0');
                int i101 = mirror * 65041;
                int i102 = (i101 & 23760) + (i101 | 23760);
                int i103 = ~mirror;
                int i104 = ~((i103 ^ 47) | (i103 & 47));
                int i105 = ~((i103 ^ i) | (i103 & i));
                int i106 = ((i104 & i105) | (i104 ^ i105)) * 992;
                int i107 = ((i102 | i106) << 1) - (i102 ^ i106);
                int i108 = ~((i103 & 47) | (i103 ^ 47));
                int i109 = (i108 & i105) | (i108 ^ i105);
                int i110 = mirror | i37;
                int i111 = ~((i110 & (-48)) | (i110 ^ (-48)));
                int i112 = -(-(((i111 & i109) | (i109 ^ i111)) * (-496)));
                Object[] objArr5 = new Object[1];
                a(i99, i100, (char) (((((i107 | i112) << 1) - (i112 ^ i107)) - (~(((i ^ (-48)) | (i & (-48))) * 496))) - 1), objArr5);
                int i113 = cls2.getField((String) objArr5[0]).getInt(objInvoke) & 2;
                int i114 = -i113;
                int i115 = ((i113 & i114) | (i113 ^ i114)) >> 31;
                i4 = (i115 & (~(i & 1)) & (i | 1)) | ((~i115) & i);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } else {
            i4 = i;
        }
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1122237249);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 16948);
                int i116 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2740;
                int packedPositionChild = 12 - ExpandableListView.getPackedPositionChild(0L);
                byte[] bArr = $$a;
                byte b2 = bArr[132];
                byte b3 = bArr[7];
                Object[] objArr6 = new Object[1];
                c(b2, b3, b3, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, i116, packedPositionChild, 1501733736, false, (String) objArr6[0], new Class[0]);
            }
            Set set = (Set) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, null);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
            ?? r110 = i29;
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char longPressTimeout = (char) (16949 - (ViewConfiguration.getLongPressTimeout() >> 16));
                int longPressTimeout2 = 2739 - (ViewConfiguration.getLongPressTimeout() >> 16);
                int iRed = 13 - Color.red(0);
                byte[] bArr2 = $$a;
                byte b4 = bArr2[132];
                byte b5 = bArr2[7];
                Object[] objArr7 = new Object[1];
                c(b4, b5, (short) (b5 | 52), objArr7);
                String str2 = (String) objArr7[0];
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(longPressTimeout, longPressTimeout2, iRed, 47863026, false, str2, null);
                r110 = str2;
            }
            ?? r111 = r110;
            if (set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null))) {
                r17 = r111;
                if (Build.VERSION.SDK_INT == 30) {
                    i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
                    if (i5 % 2 != 0) {
                        throw null;
                    }
                    i6 = i;
                    r16 = i4;
                } else {
                    if (Build.VERSION.SDK_INT > 33) {
                        int scrollDefaultDelay = 80 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        i23 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        int i117 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i118 = ((i117 | 13) << 1) - (i117 ^ 13);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i118 % 128;
                        int i119 = i118 % 2;
                        int i120 = (i23 * 55) - 3103;
                        int i121 = ~((~i23) | 29);
                        int i122 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i123 = i117 + 55;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i123 % 128;
                        int i124 = i123 % 2;
                        int i125 = ~((i122 ^ 29) | (i122 & 29));
                        int i126 = (-108) * ((i121 & i125) | (i121 ^ i125));
                        i24 = ((i120 | i126) << 1) - (i120 ^ i126);
                        int i127 = ~i23;
                        int i128 = ~((i127 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i127 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                        int i129 = ~((-30) | i23);
                        int i130 = (i128 & i129) | (i128 ^ i129);
                        int i131 = ~((i122 & i23) | (i122 ^ i23));
                        i25 = ((i130 & i131) | (i130 ^ i131)) * 54;
                        i26 = (i117 ^ 113) + ((i117 & 113) << 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i26 % 128;
                        if (i26 % 2 == 0) {
                            int i132 = -i25;
                            int i133 = (i24 ^ i132) + ((i132 & i24) << 1);
                            int i134 = ~((i23 & (-30)) | ((-30) ^ i23));
                            i27 = i133 >> (54 % ((i134 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ i134)));
                        } else {
                            int i135 = (i24 - (~i25)) - 1;
                            int i136 = ~((i23 & (-30)) | ((-30) ^ i23));
                            int i137 = ((i136 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ i136)) * 54;
                            i27 = (i137 | i135) + (i135 & i137);
                        }
                        Object[] objArr8 = new Object[1];
                        a(scrollDefaultDelay, i27, (char) (36742 + (ViewConfiguration.getMaximumFlingVelocity() >> 16)), objArr8);
                        Object[] objArr9 = {(String) objArr8[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                        r17 = r17;
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                            int minimumFlingVelocity = 993 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            int i138 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8;
                            byte b6 = $$a[7];
                            Object[] objArr10 = new Object[1];
                            c(b6, (byte) (b6 | 52), (short) 141, objArr10);
                            String str3 = (String) objArr10[0];
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(jumpTapTimeout, minimumFlingVelocity, i138, 410748506, false, str3, new Class[]{String.class});
                            r17 = str3;
                        }
                        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr9)).longValue();
                        long j = 1450507189;
                        long j2 = -1;
                        long j3 = jLongValue ^ j2;
                        long j4 = i;
                        long j5 = j4 ^ j2;
                        r18 = i4;
                        long j6 = (((long) 98) * (((j3 | j5) ^ j2) | ((j3 | j) ^ j2))) + (((long) 50) * j) + (((long) (-97)) * jLongValue) + (((long) (-49)) * (j3 | (((j ^ j2) | j5) ^ j2) | ((j | j4) ^ j2))) + (((long) 49) * (((jLongValue | j) ^ j2) | ((j3 | j4) ^ j2))) + ((long) (-1651425426));
                        int i139 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i139 % 128;
                        int i140 = i139 % 2;
                        int i141 = (int) (j6 >> 32);
                        int i142 = ~((~((int) Process.getStartUptimeMillis())) | (-386238353));
                        int i143 = i141 & (((((-2142232508) | i142) * (-970)) - 271416220) + ((i142 | 1755994155) * 970));
                        int i144 = (int) j6;
                        int startUptimeMillis = (int) Process.getStartUptimeMillis();
                        int i145 = ~startUptimeMillis;
                        int i146 = i144 & (453337145 + (((~(1121935042 | i145)) | 1735805843) * (-328)) + ((1735805843 | startUptimeMillis) * 164) + (((~(startUptimeMillis | (-1121935043))) | 1112951426 | (~(i145 | 1744789459))) * 164));
                        int i147 = (i143 ^ i146) | (i143 & i146);
                        i28 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i28 % 128;
                        if (i28 % 2 != 0) {
                            int i148 = 4 / 2;
                        }
                        i9 = i147;
                    } else {
                        r17 = i4;
                        absoluteGravity = Gravity.getAbsoluteGravity(0, 0);
                        int i149 = absoluteGravity * 71;
                        i13 = (i149 ^ (-7452)) + ((i149 & (-7452)) << 1);
                        i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
                        if (i14 % 2 != 0) {
                            int i150 = ~absoluteGravity;
                            int i151 = ~((i150 & 108) | (i150 ^ 108));
                            int i152 = ~((i ^ 108) | (i & 108));
                            int i153 = -((i151 & i152) | (i151 ^ i152));
                            int i154 = -((i153 ^ (-140)) + ((i153 & (-140)) << 1));
                            i15 = (i13 ^ i154) + ((i154 & i13) << 1);
                            i16 = absoluteGravity | 108;
                        } else {
                            int i155 = ~absoluteGravity;
                            int i156 = ~((i155 & 108) | (i155 ^ 108));
                            int i157 = ~((i ^ 108) | (i & 108));
                            i15 = i13 + (((i156 & i157) | (i156 ^ i157)) * (-140));
                            i16 = (absoluteGravity ^ 108) | (absoluteGravity & 108);
                        }
                        int i158 = i15 + (70 * (~(i16 | i)));
                        int i159 = ~((~absoluteGravity) | 108);
                        int i160 = ~((-109) | absoluteGravity);
                        int i161 = (i159 & i160) | (i159 ^ i160);
                        int i162 = ~((absoluteGravity & i) | (absoluteGravity ^ i));
                        Object[] objArr11 = new Object[1];
                        a((i158 - (~(-(-(((i162 & i161) | (i161 ^ i162)) * 70))))) - 1, 1 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr11);
                        str = (String) objArr11[0];
                        int i163 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        int i164 = (i163 & 109) + (i163 | 109);
                        int i165 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i166 = ((i165 | 15) << 1) - (i165 ^ 15);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i166 % 128;
                        int i167 = i166 % 2;
                        i17 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                        iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        int i168 = i17 * (-337);
                        int i169 = (i168 & 4407) + (i168 | 4407);
                        i18 = ~i17;
                        i19 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i170 = ~((i18 ^ i19) | (i18 & i19));
                        int i171 = ~((-14) | i17);
                        i20 = i169 + (((i170 & i171) | (i170 ^ i171) | (~(i17 | iTuitionPaymentFragmentspecialinlinedviewModeldefault2))) * (-338));
                        int i172 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        i21 = (i172 ^ 93) + ((i172 & 93) << 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i21 % 128;
                        if (i21 % 2 == 0) {
                            int i173 = ~((~i17) | 13);
                            i22 = i20 >>> ((i173 & 338) + (i173 | 338));
                            i19 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        } else {
                            int i174 = (~((i18 ^ 13) | (i18 & 13))) * 338;
                            i22 = ((i20 | i174) << 1) - (i20 ^ i174);
                        }
                        int i175 = ~((i18 & i19) | (i18 ^ i19));
                        int i176 = (i17 & 13) | (i17 ^ 13);
                        int i177 = ~((i176 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i176 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                        int i178 = 338 * ((i177 & i175) | (i175 ^ i177));
                        int i179 = ((i22 | i178) << 1) - (i178 ^ i22);
                        Object[] objArr12 = new Object[1];
                        a(i164, i179, (char) ((-16716408) - Color.rgb(0, 0, 0)), objArr12);
                        objArr = new Object[]{(String) objArr12[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char c2 = (char) (33603 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                            int i180 = 3086 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 26;
                            byte b7 = $$a[7];
                            Object[] objArr13 = new Object[1];
                            c(b7, (byte) (b7 | 52), (short) 141, objArr13);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, i180, packedPositionGroup, 1411172903, false, (String) objArr13[0], new Class[]{String.class});
                        }
                        if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                            int i181 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i182 = (i181 ^ 1) + ((i181 & 1) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i182 % 128;
                            int i183 = i182 % 2;
                            i9 = 1;
                            r18 = r17;
                        } else {
                            i9 = 0;
                            r18 = r17;
                        }
                    }
                    int i184 = (i & (-11)) | ((~i) & 10);
                    int i185 = -i9;
                    int i186 = (i9 & i185) | (i9 ^ i185);
                    int i187 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i188 = i187 + 29;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i188 % 128;
                    int i189 = i188 % 2;
                    int i190 = i186 >> 31;
                    int i191 = (~i190) & i;
                    int i192 = ((i187 | 81) << 1) - (i187 ^ 81);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i192 % 128;
                    int i193 = i192 % 2;
                    int i194 = i190 & i184;
                    i10 = (i194 & i191) | (i191 ^ i194);
                    int i195 = i2 & 32;
                    int i196 = -i195;
                    i11 = ((i195 & i196) | (i195 ^ i196)) >> 31;
                    i12 = i187 + 41;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
                    if (i12 % 2 != 0) {
                        throw null;
                    }
                    int i197 = i10 & (~i11);
                    int i198 = i11 & i;
                    i6 = (i197 & i198) | (i197 ^ i198);
                    r16 = r18;
                }
            } else {
                int i199 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i200 = (i199 ^ 85) + ((i199 & 85) << 1);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i200 % 128;
                if (i200 % 2 != 0) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 16949);
                        int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 2740;
                        int packedPositionGroup2 = 13 - ExpandableListView.getPackedPositionGroup(0L);
                        byte b8 = $$a[132];
                        Object[] objArr14 = new Object[1];
                        c(b8, (byte) (b8 | 14), (short) 104, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cKeyCodeFromString, bitsPerPixel, packedPositionGroup2, 631063962, false, (String) objArr14[0], null);
                    }
                    set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null));
                    throw null;
                }
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    r19 = r110;
                    char c3 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 16948);
                    int pressedStateDuration = 2739 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    int gidForName = 12 - Process.getGidForName("");
                    byte b9 = $$a[132];
                    Object[] objArr15 = new Object[1];
                    c(b9, (byte) (b9 | 14), (short) 104, objArr15);
                    String str4 = (String) objArr15[0];
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c3, pressedStateDuration, gidForName, 631063962, false, str4, null);
                    r19 = str4;
                }
                r19 = r110;
                r17 = r19;
                r111 = r19;
                if (set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null))) {
                    r17 = r111;
                    if (Build.VERSION.SDK_INT == 30) {
                        i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
                        if (i5 % 2 != 0) {
                            throw null;
                        }
                        i6 = i;
                        r16 = i4;
                    } else {
                        try {
                            try {
                                if (Build.VERSION.SDK_INT > 33) {
                                    int scrollDefaultDelay2 = 80 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                    i23 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                    int i1110 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i1111 = ((i1110 | 13) << 1) - (i1110 ^ 13);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i1111 % 128;
                                    int i1112 = i1111 % 2;
                                    int i1210 = (i23 * 55) - 3103;
                                    int i1211 = ~((~i23) | 29);
                                    int i1212 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i1213 = i1110 + 55;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i1213 % 128;
                                    int i1214 = i1213 % 2;
                                    int i1215 = ~((i1212 ^ 29) | (i1212 & 29));
                                    int i1216 = (-108) * ((i1211 & i1215) | (i1211 ^ i1215));
                                    i24 = ((i1210 | i1216) << 1) - (i1210 ^ i1216);
                                    int i1217 = ~i23;
                                    int i1218 = ~((i1217 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i1217 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                    int i1219 = ~((-30) | i23);
                                    int i1310 = (i1218 & i1219) | (i1218 ^ i1219);
                                    int i1311 = ~((i1212 & i23) | (i1212 ^ i23));
                                    i25 = ((i1310 & i1311) | (i1310 ^ i1311)) * 54;
                                    i26 = (i1110 ^ 113) + ((i1110 & 113) << 1);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i26 % 128;
                                    if (i26 % 2 == 0) {
                                        int i1312 = -i25;
                                        int i1313 = (i24 ^ i1312) + ((i1312 & i24) << 1);
                                        int i1314 = ~((i23 & (-30)) | ((-30) ^ i23));
                                        i27 = i1313 >> (54 % ((i1314 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ i1314)));
                                    } else {
                                        int i1315 = (i24 - (~i25)) - 1;
                                        int i1316 = ~((i23 & (-30)) | ((-30) ^ i23));
                                        int i1317 = ((i1316 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ i1316)) * 54;
                                        i27 = (i1317 | i1315) + (i1315 & i1317);
                                    }
                                    Object[] objArr16 = new Object[1];
                                    a(scrollDefaultDelay2, i27, (char) (36742 + (ViewConfiguration.getMaximumFlingVelocity() >> 16)), objArr16);
                                    try {
                                        Object[] objArr17 = {(String) objArr16[0]};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                        r17 = r17;
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char jumpTapTimeout2 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                                            int minimumFlingVelocity2 = 993 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                            int i1318 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8;
                                            byte b10 = $$a[7];
                                            Object[] objArr18 = new Object[1];
                                            c(b10, (byte) (b10 | 52), (short) 141, objArr18);
                                            String str5 = (String) objArr18[0];
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(jumpTapTimeout2, minimumFlingVelocity2, i1318, 410748506, false, str5, new Class[]{String.class});
                                            r17 = str5;
                                        }
                                        long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr17)).longValue();
                                        long j7 = 1450507189;
                                        long j8 = -1;
                                        long j9 = jLongValue2 ^ j8;
                                        long j10 = i;
                                        long j11 = j10 ^ j8;
                                        r18 = i4;
                                        long j12 = (((long) 98) * (((j9 | j11) ^ j8) | ((j9 | j7) ^ j8))) + (((long) 50) * j7) + (((long) (-97)) * jLongValue2) + (((long) (-49)) * (j9 | (((j7 ^ j8) | j11) ^ j8) | ((j7 | j10) ^ j8))) + (((long) 49) * (((jLongValue2 | j7) ^ j8) | ((j9 | j10) ^ j8))) + ((long) (-1651425426));
                                        int i1319 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1319 % 128;
                                        int i1410 = i1319 % 2;
                                        int i1411 = (int) (j12 >> 32);
                                        int i1412 = ~((~((int) Process.getStartUptimeMillis())) | (-386238353));
                                        int i1413 = i1411 & (((((-2142232508) | i1412) * (-970)) - 271416220) + ((i1412 | 1755994155) * 970));
                                        int i1414 = (int) j12;
                                        int startUptimeMillis2 = (int) Process.getStartUptimeMillis();
                                        int i1415 = ~startUptimeMillis2;
                                        int i1416 = i1414 & (453337145 + (((~(1121935042 | i1415)) | 1735805843) * (-328)) + ((1735805843 | startUptimeMillis2) * 164) + (((~(startUptimeMillis2 | (-1121935043))) | 1112951426 | (~(i1415 | 1744789459))) * 164));
                                        int i1417 = (i1413 ^ i1416) | (i1413 & i1416);
                                        i28 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i28 % 128;
                                        if (i28 % 2 != 0) {
                                            int i1418 = 4 / 2;
                                        }
                                        i9 = i1417;
                                    } catch (Throwable th2) {
                                        Throwable cause2 = th2.getCause();
                                        if (cause2 != null) {
                                            throw cause2;
                                        }
                                        throw th2;
                                    }
                                } else {
                                    r17 = i4;
                                    absoluteGravity = Gravity.getAbsoluteGravity(0, 0);
                                    int i1419 = absoluteGravity * 71;
                                    i13 = (i1419 ^ (-7452)) + ((i1419 & (-7452)) << 1);
                                    i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
                                    if (i14 % 2 != 0) {
                                        int i1510 = ~absoluteGravity;
                                        int i1511 = ~((i1510 & 108) | (i1510 ^ 108));
                                        int i1512 = ~((i ^ 108) | (i & 108));
                                        int i1513 = -((i1511 & i1512) | (i1511 ^ i1512));
                                        int i1514 = -((i1513 ^ (-140)) + ((i1513 & (-140)) << 1));
                                        i15 = (i13 ^ i1514) + ((i1514 & i13) << 1);
                                        i16 = absoluteGravity | 108;
                                    } else {
                                        int i1515 = ~absoluteGravity;
                                        int i1516 = ~((i1515 & 108) | (i1515 ^ 108));
                                        int i1517 = ~((i ^ 108) | (i & 108));
                                        i15 = i13 + (((i1516 & i1517) | (i1516 ^ i1517)) * (-140));
                                        i16 = (absoluteGravity ^ 108) | (absoluteGravity & 108);
                                    }
                                    int i1518 = i15 + (70 * (~(i16 | i)));
                                    int i1519 = ~((~absoluteGravity) | 108);
                                    int i1610 = ~((-109) | absoluteGravity);
                                    int i1611 = (i1519 & i1610) | (i1519 ^ i1610);
                                    int i1612 = ~((absoluteGravity & i) | (absoluteGravity ^ i));
                                    Object[] objArr19 = new Object[1];
                                    a((i1518 - (~(-(-(((i1612 & i1611) | (i1611 ^ i1612)) * 70))))) - 1, 1 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr19);
                                    str = (String) objArr19[0];
                                    int i1613 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                    int i1614 = (i1613 & 109) + (i1613 | 109);
                                    int i1615 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i1616 = ((i1615 | 15) << 1) - (i1615 ^ 15);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i1616 % 128;
                                    int i1617 = i1616 % 2;
                                    i17 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                    int i1618 = i17 * (-337);
                                    int i1619 = (i1618 & 4407) + (i1618 | 4407);
                                    i18 = ~i17;
                                    i19 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    int i1710 = ~((i18 ^ i19) | (i18 & i19));
                                    int i1711 = ~((-14) | i17);
                                    i20 = i1619 + (((i1710 & i1711) | (i1710 ^ i1711) | (~(i17 | iTuitionPaymentFragmentspecialinlinedviewModeldefault2))) * (-338));
                                    int i1712 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    i21 = (i1712 ^ 93) + ((i1712 & 93) << 1);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i21 % 128;
                                    if (i21 % 2 == 0) {
                                        int i1713 = ~((~i17) | 13);
                                        i22 = i20 >>> ((i1713 & 338) + (i1713 | 338));
                                        i19 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    } else {
                                        int i1714 = (~((i18 ^ 13) | (i18 & 13))) * 338;
                                        i22 = ((i20 | i1714) << 1) - (i20 ^ i1714);
                                    }
                                    int i1715 = ~((i18 & i19) | (i18 ^ i19));
                                    int i1716 = (i17 & 13) | (i17 ^ 13);
                                    int i1717 = ~((i1716 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i1716 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                                    int i1718 = 338 * ((i1717 & i1715) | (i1715 ^ i1717));
                                    int i1719 = ((i22 | i1718) << 1) - (i1718 ^ i22);
                                    Object[] objArr110 = new Object[1];
                                    a(i1614, i1719, (char) ((-16716408) - Color.rgb(0, 0, 0)), objArr110);
                                    try {
                                        objArr = new Object[]{(String) objArr110[0]};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            char c4 = (char) (33603 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                                            int i1810 = 3086 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                            int packedPositionGroup3 = ExpandableListView.getPackedPositionGroup(0L) + 26;
                                            byte b11 = $$a[7];
                                            Object[] objArr111 = new Object[1];
                                            c(b11, (byte) (b11 | 52), (short) 141, objArr111);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c4, i1810, packedPositionGroup3, 1411172903, false, (String) objArr111[0], new Class[]{String.class});
                                        }
                                        if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                            int i1811 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                            int i1812 = (i1811 ^ 1) + ((i1811 & 1) << 1);
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i1812 % 128;
                                            int i1813 = i1812 % 2;
                                            i9 = 1;
                                            r18 = r17;
                                        } else {
                                            i9 = 0;
                                            r18 = r17;
                                        }
                                    } catch (Throwable th3) {
                                        Throwable cause3 = th3.getCause();
                                        if (cause3 != null) {
                                            throw cause3;
                                        }
                                        throw th3;
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        } catch (Exception unused2) {
                            r17 = i4;
                        }
                        int i1814 = (i & (-11)) | ((~i) & 10);
                        int i1815 = -i9;
                        int i1816 = (i9 & i1815) | (i9 ^ i1815);
                        int i1817 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i1818 = i1817 + 29;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1818 % 128;
                        int i1819 = i1818 % 2;
                        int i1910 = i1816 >> 31;
                        int i1911 = (~i1910) & i;
                        int i1912 = ((i1817 | 81) << 1) - (i1817 ^ 81);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1912 % 128;
                        int i1913 = i1912 % 2;
                        int i1914 = i1910 & i1814;
                        i10 = (i1914 & i1911) | (i1911 ^ i1914);
                        int i1915 = i2 & 32;
                        int i1916 = -i1915;
                        i11 = ((i1915 & i1916) | (i1915 ^ i1916)) >> 31;
                        i12 = i1817 + 41;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
                        if (i12 % 2 != 0) {
                            throw null;
                        }
                        int i1917 = i10 & (~i11);
                        int i1918 = i11 & i;
                        i6 = (i1917 & i1918) | (i1917 ^ i1918);
                        r16 = r18;
                    }
                } else {
                    if (Build.VERSION.SDK_INT > 33) {
                        int scrollDefaultDelay3 = 80 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        i23 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        int i1113 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i1114 = ((i1113 | 13) << 1) - (i1113 ^ 13);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i1114 % 128;
                        int i1115 = i1114 % 2;
                        int i12110 = (i23 * 55) - 3103;
                        int i12111 = ~((~i23) | 29);
                        int i12112 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i12113 = i1113 + 55;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i12113 % 128;
                        int i12114 = i12113 % 2;
                        int i12115 = ~((i12112 ^ 29) | (i12112 & 29));
                        int i12116 = (-108) * ((i12111 & i12115) | (i12111 ^ i12115));
                        i24 = ((i12110 | i12116) << 1) - (i12110 ^ i12116);
                        int i12117 = ~i23;
                        int i12118 = ~((i12117 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i12117 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                        int i12119 = ~((-30) | i23);
                        int i13110 = (i12118 & i12119) | (i12118 ^ i12119);
                        int i13111 = ~((i12112 & i23) | (i12112 ^ i23));
                        i25 = ((i13110 & i13111) | (i13110 ^ i13111)) * 54;
                        i26 = (i1113 ^ 113) + ((i1113 & 113) << 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i26 % 128;
                        if (i26 % 2 == 0) {
                            int i13112 = -i25;
                            int i13113 = (i24 ^ i13112) + ((i13112 & i24) << 1);
                            int i13114 = ~((i23 & (-30)) | ((-30) ^ i23));
                            i27 = i13113 >> (54 % ((i13114 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ i13114)));
                        } else {
                            int i13115 = (i24 - (~i25)) - 1;
                            int i13116 = ~((i23 & (-30)) | ((-30) ^ i23));
                            int i13117 = ((i13116 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ i13116)) * 54;
                            i27 = (i13117 | i13115) + (i13115 & i13117);
                        }
                        Object[] objArr112 = new Object[1];
                        a(scrollDefaultDelay3, i27, (char) (36742 + (ViewConfiguration.getMaximumFlingVelocity() >> 16)), objArr112);
                        Object[] objArr113 = {(String) objArr112[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                        r17 = r17;
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char jumpTapTimeout3 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                            int minimumFlingVelocity3 = 993 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            int i13118 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8;
                            byte b12 = $$a[7];
                            Object[] objArr114 = new Object[1];
                            c(b12, (byte) (b12 | 52), (short) 141, objArr114);
                            String str6 = (String) objArr114[0];
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(jumpTapTimeout3, minimumFlingVelocity3, i13118, 410748506, false, str6, new Class[]{String.class});
                            r17 = str6;
                        }
                        long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr113)).longValue();
                        long j13 = 1450507189;
                        long j14 = -1;
                        long j15 = jLongValue3 ^ j14;
                        long j16 = i;
                        long j17 = j16 ^ j14;
                        r18 = i4;
                        long j18 = (((long) 98) * (((j15 | j17) ^ j14) | ((j15 | j13) ^ j14))) + (((long) 50) * j13) + (((long) (-97)) * jLongValue3) + (((long) (-49)) * (j15 | (((j13 ^ j14) | j17) ^ j14) | ((j13 | j16) ^ j14))) + (((long) 49) * (((jLongValue3 | j13) ^ j14) | ((j15 | j16) ^ j14))) + ((long) (-1651425426));
                        int i13119 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13119 % 128;
                        int i14110 = i13119 % 2;
                        int i14111 = (int) (j18 >> 32);
                        int i14112 = ~((~((int) Process.getStartUptimeMillis())) | (-386238353));
                        int i14113 = i14111 & (((((-2142232508) | i14112) * (-970)) - 271416220) + ((i14112 | 1755994155) * 970));
                        int i14114 = (int) j18;
                        int startUptimeMillis3 = (int) Process.getStartUptimeMillis();
                        int i14115 = ~startUptimeMillis3;
                        int i14116 = i14114 & (453337145 + (((~(1121935042 | i14115)) | 1735805843) * (-328)) + ((1735805843 | startUptimeMillis3) * 164) + (((~(startUptimeMillis3 | (-1121935043))) | 1112951426 | (~(i14115 | 1744789459))) * 164));
                        int i14117 = (i14113 ^ i14116) | (i14113 & i14116);
                        i28 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i28 % 128;
                        if (i28 % 2 != 0) {
                            int i14118 = 4 / 2;
                        }
                        i9 = i14117;
                    } else {
                        r17 = i4;
                        absoluteGravity = Gravity.getAbsoluteGravity(0, 0);
                        int i14119 = absoluteGravity * 71;
                        i13 = (i14119 ^ (-7452)) + ((i14119 & (-7452)) << 1);
                        i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
                        if (i14 % 2 != 0) {
                            int i15110 = ~absoluteGravity;
                            int i15111 = ~((i15110 & 108) | (i15110 ^ 108));
                            int i15112 = ~((i ^ 108) | (i & 108));
                            int i15113 = -((i15111 & i15112) | (i15111 ^ i15112));
                            int i15114 = -((i15113 ^ (-140)) + ((i15113 & (-140)) << 1));
                            i15 = (i13 ^ i15114) + ((i15114 & i13) << 1);
                            i16 = absoluteGravity | 108;
                        } else {
                            int i15115 = ~absoluteGravity;
                            int i15116 = ~((i15115 & 108) | (i15115 ^ 108));
                            int i15117 = ~((i ^ 108) | (i & 108));
                            i15 = i13 + (((i15116 & i15117) | (i15116 ^ i15117)) * (-140));
                            i16 = (absoluteGravity ^ 108) | (absoluteGravity & 108);
                        }
                        int i15118 = i15 + (70 * (~(i16 | i)));
                        int i15119 = ~((~absoluteGravity) | 108);
                        int i16110 = ~((-109) | absoluteGravity);
                        int i16111 = (i15119 & i16110) | (i15119 ^ i16110);
                        int i16112 = ~((absoluteGravity & i) | (absoluteGravity ^ i));
                        Object[] objArr115 = new Object[1];
                        a((i15118 - (~(-(-(((i16112 & i16111) | (i16111 ^ i16112)) * 70))))) - 1, 1 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr115);
                        str = (String) objArr115[0];
                        int i16113 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        int i16114 = (i16113 & 109) + (i16113 | 109);
                        int i16115 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i16116 = ((i16115 | 15) << 1) - (i16115 ^ 15);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i16116 % 128;
                        int i16117 = i16116 % 2;
                        i17 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                        iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = LayoutSettings.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        int i16118 = i17 * (-337);
                        int i16119 = (i16118 & 4407) + (i16118 | 4407);
                        i18 = ~i17;
                        i19 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i17110 = ~((i18 ^ i19) | (i18 & i19));
                        int i17111 = ~((-14) | i17);
                        i20 = i16119 + (((i17110 & i17111) | (i17110 ^ i17111) | (~(i17 | iTuitionPaymentFragmentspecialinlinedviewModeldefault2))) * (-338));
                        int i17112 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        i21 = (i17112 ^ 93) + ((i17112 & 93) << 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i21 % 128;
                        if (i21 % 2 == 0) {
                            int i17113 = ~((~i17) | 13);
                            i22 = i20 >>> ((i17113 & 338) + (i17113 | 338));
                            i19 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        } else {
                            int i17114 = (~((i18 ^ 13) | (i18 & 13))) * 338;
                            i22 = ((i20 | i17114) << 1) - (i20 ^ i17114);
                        }
                        int i17115 = ~((i18 & i19) | (i18 ^ i19));
                        int i17116 = (i17 & 13) | (i17 ^ 13);
                        int i17117 = ~((i17116 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i17116 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                        int i17118 = 338 * ((i17117 & i17115) | (i17115 ^ i17117));
                        int i17119 = ((i22 | i17118) << 1) - (i17118 ^ i22);
                        Object[] objArr116 = new Object[1];
                        a(i16114, i17119, (char) ((-16716408) - Color.rgb(0, 0, 0)), objArr116);
                        objArr = new Object[]{(String) objArr116[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char c5 = (char) (33603 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                            int i18110 = 3086 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            int packedPositionGroup4 = ExpandableListView.getPackedPositionGroup(0L) + 26;
                            byte b13 = $$a[7];
                            Object[] objArr117 = new Object[1];
                            c(b13, (byte) (b13 | 52), (short) 141, objArr117);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c5, i18110, packedPositionGroup4, 1411172903, false, (String) objArr117[0], new Class[]{String.class});
                        }
                        if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                            int i18111 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i18112 = (i18111 ^ 1) + ((i18111 & 1) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i18112 % 128;
                            int i18113 = i18112 % 2;
                            i9 = 1;
                            r18 = r17;
                        } else {
                            i9 = 0;
                            r18 = r17;
                        }
                    }
                    int i18114 = (i & (-11)) | ((~i) & 10);
                    int i18115 = -i9;
                    int i18116 = (i9 & i18115) | (i9 ^ i18115);
                    int i18117 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i18118 = i18117 + 29;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18118 % 128;
                    int i18119 = i18118 % 2;
                    int i1919 = i18116 >> 31;
                    int i19110 = (~i1919) & i;
                    int i19111 = ((i18117 | 81) << 1) - (i18117 ^ 81);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19111 % 128;
                    int i19112 = i19111 % 2;
                    int i19113 = i1919 & i18114;
                    i10 = (i19113 & i19110) | (i19110 ^ i19113);
                    int i19114 = i2 & 32;
                    int i19115 = -i19114;
                    i11 = ((i19114 & i19115) | (i19114 ^ i19115)) >> 31;
                    i12 = i18117 + 41;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
                    if (i12 % 2 != 0) {
                        throw null;
                    }
                    int i19116 = i10 & (~i11);
                    int i19117 = i11 & i;
                    i6 = (i19116 & i19117) | (i19116 ^ i19117);
                    r16 = r18;
                }
            }
            int i201 = (~((i & r16) == true ? 1 : 0)) & ((i | r16) == true ? 1 : 0);
            int i202 = (i201 | (-i201)) >> 31;
            int i203 = (i6 & (~i202)) | (r16 & i202);
            Object[] objArr20 = new Object[4];
            objArr20[0] = new int[]{i};
            objArr20[1] = new int[1];
            objArr20[2] = new int[]{i203};
            int i204 = (~i203) & i;
            int i205 = ~i;
            int i206 = i204 | (i203 & i205);
            int i207 = -i206;
            int i208 = (((i206 & i207) | (i206 ^ i207)) >> 31) & 16;
            int i209 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i210 = (i209 ^ 5) + ((i209 & 5) << 1);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i210 % 128;
            if (i210 % 2 == 0) {
                objArr20[2] = null;
                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                i7 = (((-758182276) + (((~((~iMaxMemory) | 716849779)) | 83957768) * 446)) + (((~(iMaxMemory | 800807547)) | 673202240) * 446)) - 1209541136;
                i8 = (-129) / i208;
            } else {
                objArr20[3] = null;
                i7 = (((-875256932) + ((40442472 | i205) * 1324)) + (((~(653884264 | i)) | (~((-613574036) | i))) * (-1324))) - 1090658216;
                i8 = i208 * (-129);
            }
            int i211 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i212 = (i211 & 17) + (i211 | 17);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i212 % 128;
            int i213 = i212 % 2;
            int i214 = 131 * i7;
            int i215 = (i8 ^ i214) + ((i8 & i214) << 1);
            int i216 = ~i7;
            int i217 = (i216 & i205) | (i216 ^ i205);
            int i218 = (i215 - (~(-(-((~((i217 & i208) | (i217 ^ i208))) * 130))))) - 1;
            int i219 = ~i7;
            int i220 = (i219 & i208) | (i219 ^ i208);
            int i221 = i218 + ((~i220) * (-260));
            int i222 = ~i208;
            int i223 = ~((i222 & i7) | (i222 ^ i7));
            int i224 = ~((i220 & i) | (i220 ^ i));
            int i225 = ((i224 & i223) | (i223 ^ i224)) * 130;
            int i226 = ((i221 | i225) << 1) - (i225 ^ i221);
            int i227 = i226 * 477;
            int i228 = -(-(i3 * (-475)));
            int i229 = (i227 ^ i228) + ((i227 & i228) << 1);
            int i230 = ~((~i226) | i3);
            int i231 = ~i3;
            int i232 = (i231 & i226) | (i231 ^ i226);
            int i233 = (i230 | (~(i232 | i))) * (-476);
            int i234 = (i229 & i233) + (i233 | i229);
            int i235 = (~((i232 ^ i) | (i & i232))) * 952;
            int i236 = (i234 ^ i235) + ((i235 & i234) << 1);
            int i237 = ~i3;
            int i238 = (i237 & i205) | (i237 ^ i205);
            int i239 = (~((i238 & i226) | (i238 ^ i226))) * 476;
            int i240 = (i236 & i239) + (i239 | i236);
            int i241 = i240 << 13;
            int i242 = (i241 | i240) & (~(i240 & i241));
            int i243 = i242 >>> 17;
            int i244 = (i242 | i243) & (~(i242 & i243));
            int i245 = i244 << 5;
            ((int[]) objArr20[1])[0] = (i244 | i245) & (~(i244 & i245));
            return objArr20;
        } catch (Throwable th4) {
            Throwable cause4 = th4.getCause();
            if (cause4 != null) {
                throw cause4;
            }
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(short r6, int r7, int r8) {
        /*
            int r6 = r6 * 2
            int r0 = 1 - r6
            int r7 = r7 * 3
            int r7 = 115 - r7
            int r8 = r8 * 2
            int r8 = 4 - r8
            byte[] r1 = com.google.android.libraries.places.api.model.kotlin.ConnectorAggregationKt.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L2c
        L18:
            r3 = r2
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
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L2c:
            int r7 = -r7
            int r7 = r7 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.model.kotlin.ConnectorAggregationKt.$$e(short, int, int):java.lang.String");
    }
}
