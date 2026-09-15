package defpackage;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.work.WorkInfo;
import com.google.gson.internal.bind.TypeAdapters;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class getPreviewResolutionSelector extends CameraControllerExternalSyntheticLambda3 {
    private final deactivateRecording TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getPreviewResolutionSelector(final String str, final int i) {
        super(str, null, i, 2, null);
        Intrinsics.checkNotNullParameter(str, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = deactivateRecording.TuitionPaymentFragmentbindingInflater1.INSTANCE;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: getScreenFlashUiInfoByPriority
            private static final byte[] $$c = {109, 7, 114, -90};
            private static final int $$d = 208;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {7, 15, 25, 25};
            private static final int $$b = 84;
            private static int d = 0;
            private static int asInterface = 1;
            private static char[] b = {47215, 47205, 47188, 47219, 47222, 47203, 47217, 47206, 47189, 47209, 47210, 47221, 47204, 47220, 47201, 47223, 47186, 47146, 47145, 47263, 47213, 47212, 47225, 47208, 47218, 47143};
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 2047719448;
            private static boolean g = true;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static boolean f977a = true;

            /* JADX WARN: Code duplicated, block: B:10:0x0027  */
            /* JADX WARN: Code duplicated, block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void e(short r6, short r7, byte r8, java.lang.Object[] r9) {
                /*
                    int r6 = r6 * 3
                    int r6 = 1 - r6
                    int r8 = r8 * 2
                    int r8 = 4 - r8
                    int r7 = r7 * 3
                    int r7 = 98 - r7
                    byte[] r0 = defpackage.getScreenFlashUiInfoByPriority.$$a
                    byte[] r1 = new byte[r6]
                    r2 = 0
                    if (r0 != 0) goto L17
                    r3 = r7
                    r4 = r2
                    r7 = r6
                    goto L29
                L17:
                    r3 = r2
                L18:
                    int r4 = r3 + 1
                    byte r5 = (byte) r7
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
                    int r8 = r8 + 1
                    r3 = r4
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.getScreenFlashUiInfoByPriority.e(short, short, byte, java.lang.Object[]):void");
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = asInterface + 85;
                d = i3 % 128;
                int i4 = i3 % 2;
                createImageAnalysis[] createimageanalysisArrB = getPreviewResolutionSelector.b(i, str, this);
                int i5 = asInterface + 121;
                d = i5 % 128;
                if (i5 % 2 == 0) {
                    return createimageanalysisArrB;
                }
                throw null;
            }

            private static void c(char[] cArr, int[] iArr, int i2, byte[] bArr, Object[] objArr) throws Throwable {
                char[] cArr2;
                int i3 = 2 % 2;
                getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
                char[] cArr3 = b;
                long j = 0;
                char c = '0';
                int i4 = 0;
                if (cArr3 != null) {
                    int length = cArr3.length;
                    char[] cArr4 = new char[length];
                    int i5 = $11 + 21;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
                    int i7 = 0;
                    while (i7 < length) {
                        try {
                            Object[] objArr2 = new Object[1];
                            objArr2[i4] = Integer.valueOf(cArr3[i7]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b2 = (byte) i4;
                                byte b3 = b2;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (31338 - (ExpandableListView.getPackedPositionForChild(i4, i4) > j ? 1 : (ExpandableListView.getPackedPositionForChild(i4, i4) == j ? 0 : -1))), 2993 - TextUtils.lastIndexOf("", c), Color.alpha(i4) + 17, 1182129903, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            cArr4[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            i7++;
                            j = 0;
                            c = '0';
                            i4 = 0;
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
                try {
                    Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43325 - TextUtils.indexOf("", "", 0, 0)), 253 - (KeyEvent.getMaxKeyCode() >> 16), 22 - (ViewConfiguration.getLongPressTimeout() >> 16), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    if (f977a) {
                        int i8 = $11 + 29;
                        $10 = i8 % 128;
                        if (i8 % 2 != 0) {
                            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                            cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                        } else {
                            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                            cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                        }
                        while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                            int i9 = $10 + 103;
                            $11 = i9 % 128;
                            if (i9 % 2 == 0) {
                                cArr2[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 >> 1) / getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] / i2] * iIntValue);
                                Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    byte b4 = (byte) 0;
                                    byte b5 = (byte) (b4 + 1);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (33602 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), AndroidCharacter.getMirror('0') + 3037, TextUtils.lastIndexOf("", '0', 0) + 27, -2146875848, false, $$e(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                                }
                                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                            } else {
                                cArr2[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i2] - iIntValue);
                                Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    byte b6 = (byte) 0;
                                    byte b7 = (byte) (b6 + 1);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (33602 - View.MeasureSpec.getSize(0)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 3085, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 25, -2146875848, false, $$e(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                                }
                                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                            }
                        }
                        objArr[0] = new String(cArr2);
                        return;
                    }
                    if (!g) {
                        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                        char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                        while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                            cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i2] - iIntValue);
                            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                            int i10 = $10 + 27;
                            $11 = i10 % 128;
                            if (i10 % 2 == 0) {
                                int i11 = 4 % 2;
                            }
                        }
                        objArr[0] = new String(cArr5);
                        return;
                    }
                    int i12 = $11 + 57;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                    char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        int i14 = $11 + 81;
                        $10 = i14 % 128;
                        int i15 = i14 % 2;
                        cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i2] - iIntValue);
                        Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = (byte) (b8 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (33602 - (ViewConfiguration.getFadingEdgeLength() >> 16)), TextUtils.getCapsMode("", 0, 0) + 3085, Drawable.resolveOpacity(0, 0) + 26, -2146875848, false, $$e(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                    }
                    objArr[0] = new String(cArr6);
                    int i16 = $11 + 25;
                    $10 = i16 % 128;
                    if (i16 % 2 != 0) {
                        throw null;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }

            /* JADX WARN: Code duplicated, block: B:112:0x05f0  */
            /* JADX WARN: Code duplicated, block: B:113:0x0607  */
            /* JADX WARN: Code duplicated, block: B:116:0x0655  */
            /* JADX WARN: Code duplicated, block: B:117:0x0666  */
            /* JADX WARN: Code duplicated, block: B:120:0x0680  */
            /* JADX WARN: Code duplicated, block: B:122:0x06a8  */
            public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i2, int i3) throws Throwable {
                int i4;
                int i5;
                String line;
                char c;
                Object[] objArr;
                Object obj;
                int i6;
                int i7;
                int i8;
                int i9;
                int i10;
                String[] strArr;
                Object[] objArr2;
                int i11;
                int i12;
                String[] strArr2;
                Object[] objArr3;
                int[] iArr;
                int[] iArr2;
                int[] iArr3;
                int i13;
                int i14;
                int i15;
                int i16;
                int i17;
                String[] strArr3;
                int i18;
                char c2;
                int i19;
                int absoluteGravity;
                int i20;
                int i21;
                String str2;
                int i22;
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i23;
                int i24 = 2 % 2;
                int i25 = 127;
                try {
                    String[] strArr4 = new String[2];
                    int i26 = -TextUtils.getOffsetAfter("", 0);
                    int i27 = asInterface;
                    int i28 = ((i27 | 43) << 1) - (i27 ^ 43);
                    d = i28 % 128;
                    int i29 = i28 % 2 != 0 ? ((-464) << i26) >> Integer.MIN_VALUE : (i26 * (-464)) - 117983;
                    int i30 = ~i26;
                    int i31 = (i2 ^ 127) | (i2 & 127);
                    int i32 = ~i31;
                    int i33 = (-465) * ((i32 & i30) | (i30 ^ i32));
                    int i34 = (i29 & i33) + (i29 | i33);
                    int i35 = ~(i30 | i2);
                    int i36 = i34 + (((i35 & 127) | (i35 ^ 127)) * 930) + (((i30 & i31) | (i31 ^ i30)) * 465);
                    Object[] objArr4 = new Object[1];
                    c(null, null, i36, new byte[]{-114, -124, -115, -116, -124, -117, -117, -118, -119, -120, -124, -121, -121, -122, -123, -124, -125, -126, -127}, objArr4);
                    strArr4[0] = (String) objArr4[0];
                    int i37 = -(-Color.alpha(0));
                    Object[] objArr5 = new Object[1];
                    c(null, null, (i37 & 127) + (i37 | 127), new byte[]{-120, -124, -121, -121, -122, -123, -124, -125, -120, -118, -111, -121, -117, -127, -115, -127, -112, -113}, objArr5);
                    String str3 = (String) objArr5[0];
                    int i38 = d;
                    int i39 = (i38 ^ 95) + ((i38 & 95) << 1);
                    asInterface = i39 % 128;
                    if (i39 % 2 == 0) {
                        strArr4[1] = str3;
                        i21 = 1;
                    } else {
                        strArr4[1] = str3;
                        i21 = 0;
                    }
                    while (true) {
                        if (i21 >= 2) {
                            i4 = i2;
                            break;
                        }
                        int i40 = d;
                        int i41 = (i40 ^ 91) + ((i40 & 91) << 1);
                        asInterface = i41 % 128;
                        if (i41 % 2 == 0) {
                            str2 = strArr4[i21];
                            i22 = -(ViewConfiguration.getScrollBarSize() >>> 30);
                            iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            i23 = 89;
                        } else {
                            str2 = strArr4[i21];
                            i22 = -(ViewConfiguration.getScrollBarSize() >> 8);
                            iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            i23 = i25;
                        }
                        int i42 = ((i22 * 141) - (~(i23 * (-139)))) - 1;
                        int i43 = ~i22;
                        int i44 = asInterface;
                        int i45 = (i44 & 7) + (i44 | 7);
                        int i46 = i45 % 128;
                        d = i46;
                        int i47 = i45 % 2;
                        int i48 = ~((i43 ^ i23) | (i43 & i23));
                        int i49 = ~i22;
                        int i50 = (i42 - (~((-280) * ((~((i49 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i49 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3))) | i48)))) - 1;
                        int i51 = ~((i49 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i49 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                        int i52 = ~i23;
                        int i53 = ~((i52 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i52 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                        int i54 = i50 + (((i51 ^ i53) | (i53 & i51)) * 140);
                        int i55 = (i43 ^ i52) | (i43 & i52);
                        int i56 = ~((i55 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i55 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                        int i57 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i58 = ~((i57 & i49) | (i49 ^ i57) | i23);
                        int i59 = (i56 & i58) | (i56 ^ i58);
                        int i60 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i61 = (i60 & i52) | (i52 ^ i60);
                        int i62 = ~((i61 & i22) | (i61 ^ i22));
                        int i63 = (i59 & i62) | (i59 ^ i62);
                        int i64 = ((i46 | 13) << 1) - (i46 ^ 13);
                        asInterface = i64 % 128;
                        int i65 = i64 % 2;
                        int i66 = i54 + (140 * i63);
                        Object[] objArr6 = new Object[1];
                        c(null, null, i66, new byte[]{-121, -122, -123, -124, -125, -110, -126, -118, -110, -114, -127, -118, -120, -114, -117, -112}, objArr6);
                        Class<?> cls = Class.forName((String) objArr6[0]);
                        if (((Boolean) cls.getMethod(str2, new Class[0]).invoke(cls, null)).booleanValue()) {
                            i4 = (i2 & (-2)) | ((~i2) & 1);
                            break;
                        }
                        i21 = (((i21 | 35) << 1) - (i21 ^ 35)) - 34;
                        i25 = 127;
                    }
                } catch (Exception unused) {
                    i4 = (~(i2 & 2)) & (i2 | 2);
                }
                try {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(109138771);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 2419);
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 2846;
                        int tapTimeout = 5 - (ViewConfiguration.getTapTimeout() >> 16);
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        Object[] objArr7 = new Object[1];
                        e(b2, b3, b3, objArr7);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatDelay, iLastIndexOf, tapTimeout, -501222268, false, (String) objArr7[0], new Class[0]);
                    }
                    long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
                    long j = -440944801;
                    long j2 = 85;
                    long j3 = (j2 * j) + (j2 * jLongValue);
                    long j4 = -84;
                    long j5 = -1;
                    long j6 = j ^ j5;
                    long j7 = jLongValue ^ j5;
                    long startUptimeMillis = (int) Process.getStartUptimeMillis();
                    long j8 = startUptimeMillis ^ j5;
                    long j9 = j | jLongValue;
                    long j10 = (j8 | jLongValue) ^ j5;
                    long j11 = j3 + ((((j6 | j7) ^ j5) | ((j6 | j8) ^ j5) | ((j7 | j8) ^ j5) | ((j9 | startUptimeMillis) ^ j5)) * j4) + (j4 * (j | ((j7 | startUptimeMillis) ^ j5) | j10)) + (((long) 84) * (j10 | (j9 ^ j5))) + ((long) (-718241885));
                    int startUptimeMillis2 = (int) Process.getStartUptimeMillis();
                    int i67 = ~(877933083 | startUptimeMillis2);
                    int i68 = ~startUptimeMillis2;
                    int i69 = ((int) (j11 >> 32)) & (1099558810 + ((i67 | (~((-1979807802) | i68))) * (-1808)) + (((~(1985313339 | startUptimeMillis2)) | (~(i68 | (-872427546)))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(startUptimeMillis2 | 1979807801)) | 1107380256 | (~((-877933084) | i68))) * TypedValues.Custom.TYPE_BOOLEAN));
                    int i70 = ~i2;
                    int i71 = (~(332605527 | i70)) | (-1406610776);
                    int i72 = ~((-30615635) | i2);
                    int i73 = (i69 | (((int) j11) & ((((i71 | i72) * (-252)) + 579143605) + ((i72 | (~((-1074005249) | i70))) * 252)))) ^ 1;
                    int i74 = (i73 | (-i73)) >> 31;
                    int i75 = ((i2 & (-11)) | (i70 & 10)) & (~i74);
                    int i76 = i74 & i2;
                    int i77 = (i76 & i75) | (i75 ^ i76);
                    int i78 = d;
                    int i79 = (i78 & 89) + (i78 | 89);
                    asInterface = i79 % 128;
                    if (i79 % 2 == 0) {
                        int i80 = ((~i4) & i2) | (i4 & i70);
                        int i81 = -i80;
                        int i82 = (i80 & i81) | (i80 ^ i81);
                        i5 = (i82 & (-84)) + (i82 | (-84));
                    } else {
                        int i83 = (~(i2 & i4)) & (i2 | i4);
                        int i84 = -i83;
                        i5 = ((i83 & i84) | (i83 ^ i84)) >> 31;
                    }
                    int i85 = (i77 & (~i5)) | (i4 & i5);
                    try {
                        Object[] objArr8 = new Object[1];
                        c(null, null, 128 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), new byte[]{-120, -124, -116, -112, -120, -115, -105, -115, -117, -124, -120, -120, -122, -116, -109, -121, -117, -127, -116, -112, -120, -115, -109, -121, -122, -123, -124, -114, -109, -106, -124, -117, -120, -124, -107, -109, -126, -108, -126, -109}, objArr8);
                        File file = new File((String) objArr8[0]);
                        int i86 = d + 47;
                        asInterface = i86 % 128;
                        int i87 = i86 % 2;
                        if (!file.canRead()) {
                            line = null;
                        } else {
                            FileReader fileReader = new FileReader(file);
                            BufferedReader bufferedReader = new BufferedReader(fileReader);
                            int i88 = d + 117;
                            asInterface = i88 % 128;
                            try {
                                if (i88 % 2 == 0) {
                                    try {
                                        line = bufferedReader.readLine();
                                        absoluteGravity = Gravity.getAbsoluteGravity(0, 1);
                                        i20 = 53;
                                    } catch (Throwable th) {
                                        th = th;
                                        fileReader.close();
                                        bufferedReader.close();
                                        throw th;
                                    }
                                } else {
                                    line = bufferedReader.readLine();
                                    absoluteGravity = Gravity.getAbsoluteGravity(0, 0);
                                    i20 = 127;
                                }
                                int i89 = -(-absoluteGravity);
                                Object[] objArr9 = new Object[1];
                                c(null, null, (i20 & i89) + (i89 | i20), new byte[]{-104, -118, -117}, objArr9);
                                if (line.equals((String) objArr9[0])) {
                                    fileReader.close();
                                    bufferedReader.close();
                                    int i90 = asInterface;
                                    int i91 = (i90 & 17) + (i90 | 17);
                                    d = i91 % 128;
                                    int i92 = i91 % 2;
                                    int i93 = asInterface;
                                    int i94 = ((i93 | 89) << 1) - (i93 ^ 89);
                                    d = i94 % 128;
                                    int i95 = i94 % 2;
                                    line = null;
                                } else {
                                    int i96 = d + 53;
                                    asInterface = i96 % 128;
                                    int i97 = i96 % 2;
                                    fileReader.close();
                                    bufferedReader.close();
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    } catch (Exception unused2) {
                    }
                    try {
                        int i98 = -(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        Object[] objArr10 = new Object[1];
                        c(null, null, (i98 ^ 126) + ((i98 & 126) << 1), new byte[]{-114, -124, -106, -123, -112, -117, -124, -105, -124, -116, -112, -120, -115, -103, -109, -106, -124, -117, -120, -124, -107, -109, -126, -108, -126, -109, -116, -118, -120, -104, -109}, objArr10);
                        File file2 = new File((String) objArr10[0]);
                        if (file2.canRead()) {
                            FileReader fileReader2 = new FileReader(file2);
                            BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
                            try {
                                String line2 = bufferedReader2.readLine();
                                int i99 = -TextUtils.getOffsetBefore("", 0);
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                int i100 = (i99 * (-813)) - (-51816);
                                int i101 = asInterface;
                                int i102 = (i101 ^ 47) + ((i101 & 47) << 1);
                                d = i102 % 128;
                                int i103 = i102 % 2;
                                int i104 = ~((-128) | i99);
                                int i105 = (i99 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i99 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                                int i106 = ~i105;
                                int i107 = -(-((-814) * ((i104 ^ i106) | (i104 & i106))));
                                int i108 = (i100 ^ i107) + ((i100 & i107) << 1);
                                int i109 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                int i110 = ~(((-128) ^ i109) | (i109 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
                                int i111 = ~i99;
                                int i112 = ~((i111 ^ 127) | (i111 & 127));
                                int i113 = (i110 ^ i112) | (i110 & i112);
                                int i114 = ~i105;
                                int i115 = (i108 - (~(((i113 ^ i114) | (i113 & i114)) * 407))) - 1;
                                int i116 = ~i99;
                                int i117 = (i101 ^ 31) + ((i101 & 31) << 1);
                                d = i117 % 128;
                                int i118 = i117 % 2;
                                int i119 = ~((i116 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i116 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                int i120 = (i119 & i112) | (i112 ^ i119);
                                int i121 = ~(iTuitionPaymentFragmentspecialinlinedviewModeldefault4 | 127);
                                Object[] objArr11 = new Object[1];
                                c(null, null, i115 + (407 * ((i120 & i121) | (i120 ^ i121))), new byte[]{-102}, objArr11);
                                boolean zEquals = line2.equals((String) objArr11[0]);
                                fileReader2.close();
                                bufferedReader2.close();
                                if (zEquals) {
                                    Object[] objArr12 = new Object[1];
                                    c(null, null, 126 - (~(ViewConfiguration.getMinimumFlingVelocity() >> 16)), new byte[]{-117, -118, -105, -121, -117, -127, -116, -112, -120, -115, -109, -121, -117, -127, -116, -112, -120, -115, -109, -121, -122, -123, -124, -114, -109, -106, -124, -117, -120, -124, -107, -109, -126, -108, -126, -109}, objArr12);
                                    File file3 = new File((String) objArr12[0]);
                                    if (!(!file3.canRead())) {
                                        FileReader fileReader3 = new FileReader(file3);
                                        BufferedReader bufferedReader3 = new BufferedReader(fileReader3);
                                        try {
                                            String line3 = bufferedReader3.readLine();
                                            int iKeyCodeFromString = KeyEvent.keyCodeFromString("");
                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                            int i122 = asInterface;
                                            int i123 = (i122 & 95) + (i122 | 95);
                                            int i124 = i123 % 128;
                                            d = i124;
                                            if (i123 % 2 != 0) {
                                                i18 = ((-721) >> iKeyCodeFromString) % (-848);
                                            } else {
                                                int i125 = iKeyCodeFromString * (-721);
                                                i18 = (i125 | (-91567)) + (i125 & (-91567));
                                            }
                                            int i126 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                            int i127 = ~iKeyCodeFromString;
                                            int i128 = ~((i127 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i127 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
                                            int i129 = (i126 ^ i128) | (i126 & i128);
                                            int i130 = ~((iKeyCodeFromString ^ 127) | (iKeyCodeFromString & 127));
                                            int i131 = -(-((i129 | i130) * 1444));
                                            int i132 = ((i18 | i131) << 1) - (i18 ^ i131);
                                            int i133 = ~((iKeyCodeFromString ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (iKeyCodeFromString & iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                                            int i134 = (i130 & i133) | (i130 ^ i133);
                                            int i135 = i124 + 13;
                                            asInterface = i135 % 128;
                                            int i136 = i135 % 2;
                                            int i137 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault5 & 127) | (127 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                                            int i138 = -(-((-1444) * ((i137 & i134) | (i134 ^ i137))));
                                            int i139 = (i132 ^ i138) + ((i132 & i138) << 1);
                                            int i140 = ~((i127 ^ 127) | (127 & i127));
                                            int i141 = i124 + 17;
                                            asInterface = i141 % 128;
                                            int i142 = i141 % 2;
                                            int i143 = -(-(722 * ((~(iKeyCodeFromString | WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT)) | i140)));
                                            int i144 = (i139 & i143) + (i143 | i139);
                                            Object[] objArr13 = new Object[1];
                                            c(null, null, i144, new byte[]{-102}, objArr13);
                                            boolean zEquals2 = line3.equals((String) objArr13[0]);
                                            fileReader3.close();
                                            bufferedReader3.close();
                                            int i145 = d;
                                            int i146 = ((i145 | 113) << 1) - (i145 ^ 113);
                                            int i147 = i146 % 128;
                                            asInterface = i147;
                                            int i148 = i146 % 2;
                                            if (zEquals2 && line != null) {
                                                int i149 = ((i147 | 39) << 1) - (i147 ^ 39);
                                                d = i149 % 128;
                                                if (i149 % 2 != 0) {
                                                    objArr = new Object[2];
                                                    c2 = 0;
                                                    objArr[0] = new int[0];
                                                    i19 = 64;
                                                } else {
                                                    c2 = 0;
                                                    objArr = new Object[2];
                                                    objArr[0] = new int[1];
                                                    i19 = 20;
                                                }
                                                int i150 = (i19 | i2) & (~(i2 & i19));
                                                String[] strArr5 = {line};
                                                int[] iArr4 = (int[]) objArr[c2];
                                                int i151 = i147 + 41;
                                                d = i151 % 128;
                                                if (i151 % 2 != 0) {
                                                    iArr4[c2] = i150;
                                                    objArr[1] = strArr5;
                                                } else {
                                                    iArr4[c2] = i150;
                                                    objArr[1] = strArr5;
                                                }
                                                c = 0;
                                            }
                                        } catch (Throwable th3) {
                                            fileReader3.close();
                                            bufferedReader3.close();
                                            throw th3;
                                        }
                                    }
                                }
                                obj = objArr[c];
                                i6 = ((int[]) obj)[c];
                                int i152 = ((~i85) & i2) | (i85 & i70);
                                int i153 = -i152;
                                i7 = ((i152 & i153) | (i152 ^ i153)) >> 31;
                                i8 = (~i7) & i6;
                                int i154 = asInterface;
                                i9 = (i154 & 13) + (i154 | 13);
                                d = i9 % 128;
                                if (i9 % 2 != 0) {
                                    int i155 = i85 & i7;
                                    i10 = (i155 & i8) | (i8 ^ i155);
                                    strArr = (String[]) obj;
                                    objArr2 = new Object[4];
                                    int i156 = i6 ^ i2;
                                    int i157 = -i156;
                                    i12 = (~(((i156 & i157) | (i156 ^ i157)) >> 120)) & 1;
                                    i11 = 1;
                                } else {
                                    i10 = i8 | (i85 & i7);
                                    strArr = (String[]) objArr[1];
                                    objArr2 = new Object[2];
                                    int i158 = (i6 | i2) & (~(i2 & i6));
                                    int i159 = -i158;
                                    int i160 = ((i158 & i159) | (i158 ^ i159)) >> 31;
                                    i11 = 1;
                                    i12 = i160 & 1;
                                }
                                int i161 = -i12;
                                int i162 = (~(((i161 & i12) | (i12 ^ i161)) >> 31)) & i11;
                                objArr2[i12] = null;
                                objArr2[i162] = strArr;
                                strArr2 = (String[]) objArr2[0];
                                objArr3 = new Object[4];
                                iArr = new int[i11];
                                objArr3[0] = iArr;
                                iArr2 = new int[i11];
                                objArr3[i11] = iArr2;
                                iArr3 = new int[i11];
                                objArr3[2] = iArr3;
                                int i163 = i2 ^ i10;
                                int i164 = -i163;
                                i13 = (((i163 & i164) | (i163 ^ i164)) >> 31) & 16;
                                i14 = i154 + 79;
                                d = i14 % 128;
                                if (i14 % 2 != 0) {
                                    iArr2[1] = i2;
                                    ((int[]) objArr3[4])[0] = i10;
                                    objArr3[3] = strArr2;
                                } else {
                                    iArr[0] = i2;
                                    iArr3[0] = i10;
                                    objArr3[3] = strArr2;
                                }
                                i15 = (i154 ^ 57) + ((i154 & 57) << 1);
                                d = i15 % 128;
                                if (i15 % 2 != 0) {
                                    int i165 = ~Process.myUid();
                                    i16 = (-2116069516) + (((~(i165 | 687947719)) | 110755888) * (-160)) + (((~(i165 | 647637490)) | 687947719) * 160);
                                    i17 = ((-830) >> i13) / (832 >> i16);
                                } else {
                                    i16 = 629539536 + (((~((-157122826) | i70)) | (~(116812596 | i70))) * (-867)) + (((~((-157122826) | i2)) | 151617545 | (~(116812596 | i2))) * (-1734)) + (((~((-151617546) | i70)) | (~((-5505281) | i2)) | (~(268430141 | i2))) * 867);
                                    int i166 = i13 * (-830);
                                    int i167 = -(-(i16 * 832));
                                    i17 = ((i166 & i167) << 1) + (i166 ^ i167);
                                }
                                int i168 = ~((~i16) | (~i2));
                                int i169 = (i13 ^ i16) | (i13 & i16);
                                int i170 = ~((i169 & i2) | (i169 ^ i2));
                                int i171 = (-831) * ((i168 & i170) | (i168 ^ i170));
                                int i172 = (i17 & i171) + (i17 | i171);
                                int i173 = ~i16;
                                int i174 = (i173 & i13) | (i173 ^ i13);
                                int i175 = (i172 - (~(-(-((~((i174 & i2) | (i174 ^ i2))) * (-1662)))))) - 1;
                                int i176 = ~i13;
                                int i177 = ~i2;
                                int i178 = ~((i176 & i177) | (i176 ^ i177));
                                int i179 = asInterface + 19;
                                d = i179 % 128;
                                int i180 = i179 % 2;
                                int i181 = i178 | (~((i13 ^ i2) | (i13 & i2)));
                                int i182 = ~((i2 & i16) | (i16 ^ i2));
                                int i183 = i3 + i175 + (831 * ((i181 & i182) | (i181 ^ i182)));
                                int i184 = i183 ^ (i183 << 13);
                                int i185 = i184 >>> 17;
                                int i186 = ((~i184) & i185) | ((~i185) & i184);
                                int i187 = i186 << 5;
                                ((int[]) objArr3[1])[0] = (i186 | i187) & (~(i186 & i187));
                                return objArr3;
                            } catch (Throwable th4) {
                                fileReader2.close();
                                bufferedReader2.close();
                                throw th4;
                            }
                        }
                        int i188 = d + 49;
                        asInterface = i188 % 128;
                        int i189 = i188 % 2;
                    } catch (Exception unused3) {
                    }
                    objArr = new Object[2];
                    int[] iArr5 = new int[1];
                    objArr[0] = iArr5;
                    int i190 = asInterface;
                    int i191 = (i190 ^ 113) + ((i190 & 113) << 1);
                    d = i191 % 128;
                    if (i191 % 2 != 0) {
                        strArr3 = new String[1];
                        c = 0;
                    } else {
                        c = 0;
                        strArr3 = new String[0];
                    }
                    iArr5[c] = i2;
                    objArr[1] = strArr3;
                    obj = objArr[c];
                    i6 = ((int[]) obj)[c];
                    int i1510 = ((~i85) & i2) | (i85 & i70);
                    int i1511 = -i1510;
                    i7 = ((i1510 & i1511) | (i1510 ^ i1511)) >> 31;
                    i8 = (~i7) & i6;
                    int i1512 = asInterface;
                    i9 = (i1512 & 13) + (i1512 | 13);
                    d = i9 % 128;
                    if (i9 % 2 != 0) {
                        int i1513 = i85 & i7;
                        i10 = (i1513 & i8) | (i8 ^ i1513);
                        strArr = (String[]) obj;
                        objArr2 = new Object[4];
                        int i1514 = i6 ^ i2;
                        int i1515 = -i1514;
                        i12 = (~(((i1514 & i1515) | (i1514 ^ i1515)) >> 120)) & 1;
                        i11 = 1;
                    } else {
                        i10 = i8 | (i85 & i7);
                        strArr = (String[]) objArr[1];
                        objArr2 = new Object[2];
                        int i1516 = (i6 | i2) & (~(i2 & i6));
                        int i1517 = -i1516;
                        int i1610 = ((i1516 & i1517) | (i1516 ^ i1517)) >> 31;
                        i11 = 1;
                        i12 = i1610 & 1;
                    }
                    int i1611 = -i12;
                    int i1612 = (~(((i1611 & i12) | (i12 ^ i1611)) >> 31)) & i11;
                    objArr2[i12] = null;
                    objArr2[i1612] = strArr;
                    strArr2 = (String[]) objArr2[0];
                    objArr3 = new Object[4];
                    iArr = new int[i11];
                    objArr3[0] = iArr;
                    iArr2 = new int[i11];
                    objArr3[i11] = iArr2;
                    iArr3 = new int[i11];
                    objArr3[2] = iArr3;
                    int i1613 = i2 ^ i10;
                    int i1614 = -i1613;
                    i13 = (((i1613 & i1614) | (i1613 ^ i1614)) >> 31) & 16;
                    i14 = i1512 + 79;
                    d = i14 % 128;
                    if (i14 % 2 != 0) {
                        iArr2[1] = i2;
                        ((int[]) objArr3[4])[0] = i10;
                        objArr3[3] = strArr2;
                    } else {
                        iArr[0] = i2;
                        iArr3[0] = i10;
                        objArr3[3] = strArr2;
                    }
                    i15 = (i1512 ^ 57) + ((i1512 & 57) << 1);
                    d = i15 % 128;
                    if (i15 % 2 != 0) {
                        int i1615 = ~Process.myUid();
                        i16 = (-2116069516) + (((~(i1615 | 687947719)) | 110755888) * (-160)) + (((~(i1615 | 647637490)) | 687947719) * 160);
                        i17 = ((-830) >> i13) / (832 >> i16);
                    } else {
                        i16 = 629539536 + (((~((-157122826) | i70)) | (~(116812596 | i70))) * (-867)) + (((~((-157122826) | i2)) | 151617545 | (~(116812596 | i2))) * (-1734)) + (((~((-151617546) | i70)) | (~((-5505281) | i2)) | (~(268430141 | i2))) * 867);
                        int i1616 = i13 * (-830);
                        int i1617 = -(-(i16 * 832));
                        i17 = ((i1616 & i1617) << 1) + (i1616 ^ i1617);
                    }
                    int i1618 = ~((~i16) | (~i2));
                    int i1619 = (i13 ^ i16) | (i13 & i16);
                    int i1710 = ~((i1619 & i2) | (i1619 ^ i2));
                    int i1711 = (-831) * ((i1618 & i1710) | (i1618 ^ i1710));
                    int i1712 = (i17 & i1711) + (i17 | i1711);
                    int i1713 = ~i16;
                    int i1714 = (i1713 & i13) | (i1713 ^ i13);
                    int i1715 = (i1712 - (~(-(-((~((i1714 & i2) | (i1714 ^ i2))) * (-1662)))))) - 1;
                    int i1716 = ~i13;
                    int i1717 = ~i2;
                    int i1718 = ~((i1716 & i1717) | (i1716 ^ i1717));
                    int i1719 = asInterface + 19;
                    d = i1719 % 128;
                    int i1810 = i1719 % 2;
                    int i1811 = i1718 | (~((i13 ^ i2) | (i13 & i2)));
                    int i1812 = ~((i2 & i16) | (i16 ^ i2));
                    int i1813 = i3 + i1715 + (831 * ((i1811 & i1812) | (i1811 ^ i1812)));
                    int i1814 = i1813 ^ (i1813 << 13);
                    int i1815 = i1814 >>> 17;
                    int i1816 = ((~i1814) & i1815) | ((~i1815) & i1814);
                    int i1817 = i1816 << 5;
                    ((int[]) objArr3[1])[0] = (i1816 | i1817) & (~(i1816 & i1817));
                    return objArr3;
                } catch (Throwable th5) {
                    Throwable cause = th5.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th5;
                }
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
            private static java.lang.String $$e(short r5, int r6, byte r7) {
                /*
                    byte[] r0 = defpackage.getScreenFlashUiInfoByPriority.$$c
                    int r6 = 68 - r6
                    int r7 = r7 * 2
                    int r1 = 1 - r7
                    int r5 = r5 * 4
                    int r5 = r5 + 4
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    int r7 = 0 - r7
                    if (r0 != 0) goto L17
                    r4 = r6
                    r6 = r7
                    r3 = r2
                    goto L27
                L17:
                    r3 = r2
                L18:
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    if (r3 != r7) goto L23
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    return r5
                L23:
                    int r3 = r3 + 1
                    r4 = r0[r5]
                L27:
                    int r6 = r6 + r4
                    int r5 = r5 + 1
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.getScreenFlashUiInfoByPriority.$$e(short, int, byte):java.lang.String");
            }
        });
    }

    @Override // defpackage.CameraControllerExternalSyntheticLambda3, defpackage.createImageAnalysis
    public final deactivateRecording TuitionPaymentFragmentbindingInflater1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.CameraControllerExternalSyntheticLambda3
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof createImageAnalysis)) {
            return false;
        }
        createImageAnalysis createimageanalysis = (createImageAnalysis) obj;
        return createimageanalysis.TuitionPaymentFragmentbindingInflater1() == deactivateRecording.TuitionPaymentFragmentbindingInflater1.INSTANCE && Intrinsics.areEqual(getINotificationSideChannel(), createimageanalysis.getINotificationSideChannel()) && Intrinsics.areEqual(updatePreviewViewTransform.TuitionPaymentFragmentbindingInflater1(this), updatePreviewViewTransform.TuitionPaymentFragmentbindingInflater1(createimageanalysis));
    }

    @Override // defpackage.CameraControllerExternalSyntheticLambda3
    public final String toString() {
        getPreviewResolutionSelector getpreviewresolutionselector = this;
        Intrinsics.checkNotNullParameter(getpreviewresolutionselector, "");
        StringBuilder sb = new StringBuilder();
        sb.append(getINotificationSideChannel());
        sb.append('(');
        return CollectionsKt.joinToString$default(new createPreview.b(getpreviewresolutionselector), ", ", sb.toString(), ")", 0, null, null, 56, null);
    }

    @Override // defpackage.CameraControllerExternalSyntheticLambda3
    public final int hashCode() {
        int iHashCode = getINotificationSideChannel().hashCode();
        getPreviewResolutionSelector getpreviewresolutionselector = this;
        Intrinsics.checkNotNullParameter(getpreviewresolutionselector, "");
        Iterator<String> it = new createPreview.b(getpreviewresolutionselector).iterator();
        int iHashCode2 = 1;
        while (it.hasNext()) {
            String next = it.next();
            iHashCode2 = (iHashCode2 * 31) + (next != null ? next.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    public static /* synthetic */ createImageAnalysis[] b(int i, String str, getPreviewResolutionSelector getpreviewresolutionselector) {
        createImageAnalysis[] createimageanalysisArr = new createImageAnalysis[i];
        for (int i2 = 0; i2 < i; i2++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('.');
            sb.append(getpreviewresolutionselector.TuitionPaymentFragmentbindingInflater1(i2));
            createimageanalysisArr[i2] = getViewportAspectRatioStrategy.TuitionPaymentFragmentbindingInflater1(sb.toString(), isCameraAttached.TuitionPaymentFragmentbindingInflater1.INSTANCE, new createImageAnalysis[0], new isCameraInitialized());
        }
        return createimageanalysisArr;
    }

    @Override // defpackage.CameraControllerExternalSyntheticLambda3, defpackage.createImageAnalysis
    public final createImageAnalysis TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
        return ((createImageAnalysis[]) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue())[i];
    }
}
