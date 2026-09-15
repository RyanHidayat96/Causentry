package defpackage;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import com.bpjstku.data.country.CountryDataStore;
import com.bpjstku.data.country.CountryRepository;
import com.bpjstku.data.country.remote.CountryApi;
import com.bpjstku.data.country.remote.CountryApiClient;
import java.lang.reflect.Constructor;
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
public final class fromCustomAction {
    private static final isLenovoTablet b;

    static {
        Function1 function1 = new Function1() { // from class: setState
            private static final byte[] $$c = {53, -70, 9, -72};
            private static final int $$d = 229;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {48, -119, -71, 110, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
            private static final int $$b = 220;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -83722399;

            private static void b(byte b2, short s, short s2, Object[] objArr) {
                byte[] bArr = $$a;
                int i = 84 - (s2 * 2);
                int i2 = s * 3;
                int i3 = 3 - (b2 * 3);
                byte[] bArr2 = new byte[i2 + 53];
                int i4 = i2 + 52;
                int i5 = -1;
                if (bArr == null) {
                    i5 = -1;
                    i = (i4 + i3) - 11;
                    i3 = i3;
                }
                while (true) {
                    int i6 = i5 + 1;
                    int i7 = i3 + 1;
                    bArr2[i6] = (byte) i;
                    if (i6 == i4) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    }
                    i5 = i6;
                    i = (i + bArr[i7]) - 11;
                    i3 = i7;
                }
            }

            /* JADX WARN: Code duplicated, block: B:34:0x0171  */
            /* JADX WARN: Code duplicated, block: B:35:0x0172  */
            private static void a(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
                int i4;
                Throwable cause;
                int i5 = 2 % 2;
                setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
                char[] cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (true) {
                    i4 = 29209604;
                    if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i2) {
                        break;
                    }
                    int i6 = $11 + 11;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    int i8 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
                            int iIndexOf = 3291 - TextUtils.indexOf("", "");
                            int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 31;
                            byte b2 = (byte) ($$d & 3);
                            byte b3 = (byte) (b2 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAxisFromString, iIndexOf, edgeSlop, 1199271174, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr2[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Process.myTid() >> 22), 651 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 44, -450685997, false, $$e(b4, b5, b5), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                        int i9 = $11 + 45;
                        $10 = i9 % 128;
                        int i10 = i9 % 2;
                    } catch (Throwable th) {
                        cause = th.getCause();
                        if (cause != null) {
                            throw th;
                        }
                        throw cause;
                    }
                    cause = th.getCause();
                    if (cause != null) {
                        throw th;
                    }
                    throw cause;
                }
                if (i3 > 0) {
                    setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
                    char[] cArr3 = new char[i2];
                    System.arraycopy(cArr2, 0, cArr3, 0, i2);
                    System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                    System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                }
                if (z) {
                    int i11 = $10 + 21;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    char[] cArr4 = new char[i2];
                    setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                    while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                        int i13 = $11 + 29;
                        $10 = i13 % 128;
                        if (i13 % 2 != 0) {
                            cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                            Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = b6;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Process.myTid() >> 22), 651 - View.MeasureSpec.makeMeasureSpec(0, 0), View.combineMeasuredStates(0, 0) + 44, -450685997, false, $$e(b6, b7, b7), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                            i4 = 29209604;
                        } else {
                            cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                            try {
                                Object[] objArr5 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                                i4 = 29209604;
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    byte b8 = (byte) 0;
                                    byte b9 = b8;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), Gravity.getAbsoluteGravity(0, 0) + 651, 43 - Process.getGidForName(""), -450685997, false, $$e(b8, b9, b9), new Class[]{Object.class, Object.class});
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
                    }
                    cArr2 = cArr4;
                }
                objArr[0] = new String(cArr2);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Throwable {
                int iIntValue;
                int i;
                int i2 = 2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 46400), 41 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 19, -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                }
                Object obj2 = null;
                int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
                Object[] objArr = new Object[1];
                a(false, 102 - Drawable.resolveOpacity(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 23, Color.blue(0) + 4, new char[]{'\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504}, objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                Object[] objArr2 = new Object[1];
                a(true, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 105, 14 - TextUtils.indexOf((CharSequence) "", '0', 0), Color.blue(0) + 11, new char[]{5, 65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r'}, objArr2);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
                long j = -1;
                long j2 = j ^ 520576411254007568L;
                long elapsedCpuTime = (int) Process.getElapsedCpuTime();
                long j3 = elapsedCpuTime ^ j;
                long j4 = (((long) TypedValues.Custom.TYPE_DIMENSION) * 520576411254007568L) + (((long) (-903)) * 1576680763487951419L) + (((long) (-1808)) * (((j2 | elapsedCpuTime) ^ j) | ((j3 | 1576680763487951419L) ^ j)));
                long j5 = TypedValues.Custom.TYPE_BOOLEAN;
                long j6 = j ^ 1576680763487951419L;
                long j7 = j4 + (((((j2 | j6) | elapsedCpuTime) ^ j) | ((j3 | 1727552656676634427L) ^ j)) * j5) + (j5 * (((j3 | 520576411254007568L) ^ j) | ((j2 | 1576680763487951419L) ^ j) | ((j6 | elapsedCpuTime) ^ j)));
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 0;
                try {
                    while (i6 != 10) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 37836), 58 - TextUtils.indexOf((CharSequence) "", '0', 0), TextUtils.lastIndexOf("", '0', 0, 0) + 19, 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                        }
                        int i7 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(obj2);
                        int i8 = 0;
                        long j8 = jLongValue;
                        while (true) {
                            int i9 = 0;
                            while (i9 != 8) {
                                i7 = (((((int) (j8 >> i9)) & 255) + (i7 << 6)) + (i7 << 16)) - i7;
                                i9++;
                                i3 = i3;
                            }
                            i = i3;
                            if (i8 != 0) {
                                break;
                            }
                            int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
                            int i11 = i10 % 2;
                            i8++;
                            j8 = j7;
                            i3 = i;
                        }
                        if (i7 == i) {
                            return fromCustomAction.TuitionPaymentFragmentbindingInflater1((isLenovoTablet) obj);
                        }
                        int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i13 = i12 + 111;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 % 128;
                        int i14 = i13 % 2;
                        jLongValue -= 1024;
                        i6++;
                        int i15 = i12 + 57;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15 % 128;
                        int i16 = i15 % 2;
                        i3 = i;
                        obj2 = null;
                    }
                    Object[] objArr3 = {-1391152122};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 46038), Color.blue(0) + 1134, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr4 = {Integer.valueOf(iIntValue), 0, -863445727, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr3), false};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1031;
                        int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 15;
                        byte b2 = $$a[7];
                        byte b3 = b2;
                        Object[] objArr5 = new Object[1];
                        b(b2, b3, b3, objArr5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, doubleTapTimeout, edgeSlop, 1298546779, false, (String) objArr5[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 1116 - ImageFormat.getBitsPerPixel(0), Color.rgb(0, 0, 0) + 16777233), Boolean.TYPE});
                    }
                    Object[] objArr6 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr4);
                    int i17 = ((int[]) objArr6[1])[0];
                    int i18 = ((int[]) objArr6[3])[0];
                    if (i18 != i17) {
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = (String[]) objArr6[0];
                        if (strArr != null) {
                            int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i19 % 128;
                            int i20 = i19 % 2;
                            for (String str : strArr) {
                                arrayList.add(str);
                            }
                        }
                        throw new RuntimeException(String.valueOf(i18));
                    }
                    return fromCustomAction.TuitionPaymentFragmentbindingInflater1((isLenovoTablet) obj);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
                Object[] objArr7 = new Object[1];
                a(true, 101 - (KeyEvent.getMaxKeyCode() >> 16), AndroidCharacter.getMirror('0') - ' ', -TextUtils.indexOf((CharSequence) "", '0', 0), new char[]{'\b', 11, 3, 18, 17, 23, 65521, 65484, 5, '\f', 65535, '\n', 65484, 65535, 20, 65535}, objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                Object[] objArr8 = new Object[1];
                a(false, 105 - View.combineMeasuredStates(0, 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16, 16 - (ViewConfiguration.getScrollBarSize() >> 8), new char[]{3, 65534, 65535, '\b', 14, 3, 14, 19, 65506, 65531, '\r', 2, 65501, '\t', 65534, 65535}, objArr8);
                iIntValue = ((Integer) cls2.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue();
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0023  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$e(byte r6, byte r7, short r8) {
                /*
                    byte[] r0 = defpackage.setState.$$c
                    int r6 = r6 + 119
                    int r7 = r7 * 3
                    int r7 = 3 - r7
                    int r8 = r8 * 2
                    int r8 = r8 + 1
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L15
                    r3 = r6
                    r6 = r8
                    r4 = r2
                    goto L27
                L15:
                    r3 = r2
                L16:
                    int r4 = r3 + 1
                    byte r5 = (byte) r6
                    r1[r3] = r5
                    if (r4 != r8) goto L23
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L23:
                    int r7 = r7 + 1
                    r3 = r0[r7]
                L27:
                    int r6 = r6 + r3
                    r3 = r4
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.setState.$$e(byte, byte, short):java.lang.String");
            }
        };
        isLenovoTablet islenovotablet = new isLenovoTablet(false, false);
        function1.invoke(islenovotablet);
        b = islenovotablet;
    }

    public static final isLenovoTablet TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return b;
    }

    public static /* synthetic */ flagActionItems b(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        return new flagActionItems((r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.class), null, null), (acquireBuffer) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(acquireBuffer.class), null, null));
    }

    public static /* synthetic */ CountryRepository TuitionPaymentFragmentbindingInflater1(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        return new CountryDataStore((CountryApi) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(CountryApi.class), null, null));
    }

    public static /* synthetic */ r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 TuitionPaymentFragmentspecialinlinedviewModeldefault2(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        return new r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus((CountryRepository) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(CountryRepository.class), null, null));
    }

    public static /* synthetic */ CountryApiClient TuitionPaymentFragmentspecialinlinedviewModeldefault1(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        notifyStateDetached notifystatedetached = notifyStateDetached.INSTANCE;
        return (CountryApiClient) notifyStateDetached.b(CountryApiClient.class, (OkHttpClient) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(OkHttpClient.class), null, null), (String) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(String.class), new setUsingExifOrientation("baseUrl"), null));
    }

    public static /* synthetic */ CountryApi TuitionPaymentFragmentspecialinlinedviewModeldefault3(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        return new CountryApi((CountryApiClient) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(CountryApiClient.class), null, null));
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(isLenovoTablet islenovotablet) {
        Intrinsics.checkNotNullParameter(islenovotablet, "");
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function2 = new Function2() { // from class: setBufferedPosition
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return fromCustomAction.TuitionPaymentFragmentspecialinlinedviewModeldefault1((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind = Kind.Single;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(CountryApiClient.class));
        zoomGestureDetectorZoomEventMove.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function2;
        zoomGestureDetectorZoomEventMove.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove, new ZoomGestureDetectorgestureDetector1(false, false));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove);
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function3 = new Function2() { // from class: setErrorMessage
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return fromCustomAction.TuitionPaymentFragmentspecialinlinedviewModeldefault3((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd2 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind2 = Kind.Single;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove2 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(CountryApi.class));
        zoomGestureDetectorZoomEventMove2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function3;
        zoomGestureDetectorZoomEventMove2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind2;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove2, new ZoomGestureDetectorgestureDetector1(false, false));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove2);
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function4 = new Function2() { // from class: getCustomAction
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return fromCustomAction.TuitionPaymentFragmentbindingInflater1((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd3 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind3 = Kind.Single;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove3 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(CountryRepository.class));
        zoomGestureDetectorZoomEventMove3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function4;
        zoomGestureDetectorZoomEventMove3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind3;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove3, new ZoomGestureDetectorgestureDetector1(false, false));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove3);
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function5 = new Function2() { // from class: getAction
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return fromCustomAction.TuitionPaymentFragmentspecialinlinedviewModeldefault2((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd4 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind4 = Kind.Single;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove4 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.class));
        zoomGestureDetectorZoomEventMove4.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function5;
        zoomGestureDetectorZoomEventMove4.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind4;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove4, new ZoomGestureDetectorgestureDetector1(false, false));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove4);
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function6 = new Function2() { // from class: getName
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return fromCustomAction.b((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd5 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind5 = Kind.Factory;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove5 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(flagActionItems.class));
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
}
