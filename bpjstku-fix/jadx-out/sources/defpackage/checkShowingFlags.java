package defpackage;

import android.app.Activity;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.p002lifecycle.ViewModel;
import com.android.volley.ExecutorDelivery;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class checkShowingFlags extends ViewModel {
    private final acquireBuffer TuitionPaymentFragmentbindingInflater1 = new acquireBuffer();
    public final isProblematicVideoQuality<TwilightManager> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private ToolbarActionBarToolbarMenuCallback TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public checkShowingFlags() {
        isProblematicVideoQuality<TwilightManager> isproblematicvideoqualityTuitionPaymentFragmentbindingInflater1 = isProblematicVideoQuality.TuitionPaymentFragmentbindingInflater1();
        Intrinsics.checkNotNullExpressionValue(isproblematicvideoqualityTuitionPaymentFragmentbindingInflater1, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = isproblematicvideoqualityTuitionPaymentFragmentbindingInflater1;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Activity activity) {
        VideoRecordEventStart<TwilightManager> videoRecordEventStartTuitionPaymentFragmentbindingInflater1;
        Intrinsics.checkNotNullParameter(activity, "");
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ToolbarActionBarToolbarMenuCallback();
        }
        ToolbarActionBarToolbarMenuCallback toolbarActionBarToolbarMenuCallback = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (toolbarActionBarToolbarMenuCallback == null || (videoRecordEventStartTuitionPaymentFragmentbindingInflater1 = toolbarActionBarToolbarMenuCallback.TuitionPaymentFragmentbindingInflater1(activity)) == null) {
            return;
        }
        final Function1 function1 = new Function1() { // from class: WindowDecorActionBar
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return checkShowingFlags.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, (TwilightManager) obj);
            }
        };
        logToString<? super TwilightManager> logtostring = new logToString() { // from class: cleanupTabs
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: configureTab
            private static final byte[] $$c = {83, ByteCompanionObject.MIN_VALUE, -37, -48};
            private static final int $$d = 214;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {7, 15, 25, 25};
            private static final int $$b = 124;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {59709, 59750, 59774, 59775, 59750, 59769, 59772, 59772, 59753, 59752, 59775, 59748, 59771, 59772, 59775, 59751, 59734, 59759, 59772, 59730, 59827, 59827, 59838, 59839, 59819, 59823, 59825, 59822, 59797, 59814, 59838, 59827, 59834, 59835, 59838, 59829, 59837, 59757, 59842, 59815, 59834, 59871, 59832, 59799, 59836, 59853, 59845, 59866, 59852, 59841, 59847, 59845, 59864, 59702, 59791, 59783, 59791, 59789, 59782, 59781, 59788, 59759, 59757, 59790, 59789, 59786, 59766, 59791, 59781, 59751, 59757, 59778, 59789, 59765, 59764, 59759, 59747, 59784, 59791, 59776, 59789, 59784, 59747, 59751, 59802, 59802, 59751, 59744, 59789, 59764, 59766, 59791, 59781, 59699, 59748, 59749, 59732, 59826, 59832, 59826, 59824, 59839, 59839, 59837, 59839, 59824, 59854, 59828, 59799, 59796, 59825, 59824, 59849, 59830, 59825, 59796, 59816, 59843, 59843, 59816, 59792, 59824, 59849, 59848, 59818, 59792, 59837, 59688, 59727, 59779, 59786, 59766, 59791, 59790, 59787, 59767, 59784, 59782, 59744, 59758, 59791, 59790, 59787, 59767, 59784, 59782, 59744, 59758, 59779, 59790, 59766, 59765, 59752, 59756, 59785, 59784, 59777, 59790, 59785, 59756, 59744, 59803, 59803, 59744};

            /* JADX WARN: Code duplicated, block: B:10:0x0024  */
            /* JADX WARN: Code duplicated, block: B:8:0x001c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(int r6, short r7, int r8, java.lang.Object[] r9) {
                /*
                    int r8 = r8 * 3
                    int r0 = r8 + 1
                    byte[] r1 = defpackage.configureTab.$$a
                    int r6 = r6 * 4
                    int r6 = 98 - r6
                    int r7 = r7 * 4
                    int r7 = r7 + 4
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    if (r1 != 0) goto L16
                    r3 = r7
                    r4 = r2
                    goto L2c
                L16:
                    r3 = r2
                L17:
                    byte r4 = (byte) r6
                    r0[r3] = r4
                    if (r3 != r8) goto L24
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    r9[r2] = r6
                    return
                L24:
                    r4 = r1[r7]
                    int r3 = r3 + 1
                    r5 = r3
                    r3 = r7
                    r7 = r4
                    r4 = r5
                L2c:
                    int r7 = -r7
                    int r6 = r6 + r7
                    int r7 = r3 + 1
                    r3 = r4
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.configureTab.c(int, short, int, java.lang.Object[]):void");
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws IOException {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                if (i2 % 2 != 0) {
                    checkShowingFlags.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, (Throwable) obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Unit unitTuitionPaymentFragmentspecialinlinedviewModeldefault1 = checkShowingFlags.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, (Throwable) obj);
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 5 / 0;
                }
                return unitTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            }

            /* JADX WARN: Code duplicated, block: B:34:0x00ef A[Catch: all -> 0x0094, TryCatch #0 {all -> 0x0094, blocks: (B:11:0x0033, B:13:0x0044, B:14:0x007b, B:32:0x00d7, B:34:0x00ef, B:35:0x0128, B:44:0x01a8, B:46:0x01b5, B:48:0x01fb, B:38:0x013f, B:40:0x0158, B:41:0x0195), top: B:75:0x0033 }] */
            /* JADX WARN: Code duplicated, block: B:37:0x0138  */
            /* JADX WARN: Code duplicated, block: B:40:0x0158 A[Catch: all -> 0x0094, TryCatch #0 {all -> 0x0094, blocks: (B:11:0x0033, B:13:0x0044, B:14:0x007b, B:32:0x00d7, B:34:0x00ef, B:35:0x0128, B:44:0x01a8, B:46:0x01b5, B:48:0x01fb, B:38:0x013f, B:40:0x0158, B:41:0x0195), top: B:75:0x0033 }] */
            private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
                int i;
                char c;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                int length;
                char[] cArr;
                int i2 = 2 % 2;
                setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
                char c2 = 0;
                int i3 = iArr[0];
                int i4 = 1;
                int i5 = iArr[1];
                int i6 = iArr[2];
                int i7 = iArr[3];
                char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i8 = -1;
                float f = 0.0f;
                if (cArr2 != null) {
                    int i9 = $10 + 109;
                    $11 = i9 % 128;
                    if (i9 % 2 == 0) {
                        length = cArr2.length;
                        cArr = new char[length];
                    } else {
                        length = cArr2.length;
                        cArr = new char[length];
                    }
                    int i10 = 0;
                    while (i10 < length) {
                        try {
                            Object[] objArr2 = new Object[i4];
                            objArr2[c2] = Integer.valueOf(cArr2[i10]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b = (byte) i8;
                                byte b2 = (byte) (b + 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)), 1269 - TextUtils.indexOf((CharSequence) "", '0'), KeyEvent.keyCodeFromString("") + 18, 407021364, false, $$e(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                            }
                            cArr[i10] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr2)).charValue();
                            i10++;
                            c2 = 0;
                            i4 = 1;
                            i8 = -1;
                            f = 0.0f;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    int i11 = $10 + 73;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    cArr2 = cArr;
                }
                char[] cArr3 = new char[i5];
                System.arraycopy(cArr2, i3, cArr3, 0, i5);
                if (bArr != null) {
                    char[] cArr4 = new char[i5];
                    setvideostabilizationmode.b = 0;
                    char c3 = 0;
                    while (setvideostabilizationmode.b < i5) {
                        int i13 = $11 + 105;
                        $10 = i13 % 128;
                        if (i13 % 2 == 0) {
                            c = 1;
                            if (bArr[setvideostabilizationmode.b] == 1) {
                                int i14 = setvideostabilizationmode.b;
                                char c4 = cArr3[setvideostabilizationmode.b];
                                Object[] objArr3 = new Object[2];
                                objArr3[c] = Integer.valueOf(c3);
                                objArr3[0] = Integer.valueOf(c4);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b3 = (byte) (-1);
                                    byte b4 = (byte) (b3 + 1);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) KeyEvent.getDeadChar(0, 0), 3225 - View.getDefaultSize(0, 0), 12 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 2133916302, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr4[i14] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                            } else {
                                int i15 = setvideostabilizationmode.b;
                                Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c3)};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    byte b5 = (byte) (-1);
                                    byte b6 = (byte) (b5 + 1);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (29944 - KeyEvent.getDeadChar(0, 0)), View.MeasureSpec.makeMeasureSpec(0, 0) + 1755, 24 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 387247676, false, $$e(b5, b6, (byte) (b6 + 2)), new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr4[i15] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr4)).charValue();
                            }
                        } else if (bArr[setvideostabilizationmode.b] == 0) {
                            c = 1;
                            int i16 = setvideostabilizationmode.b;
                            char c5 = cArr3[setvideostabilizationmode.b];
                            Object[] objArr5 = new Object[2];
                            objArr5[c] = Integer.valueOf(c3);
                            objArr5[0] = Integer.valueOf(c5);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b7 = (byte) (-1);
                                byte b8 = (byte) (b7 + 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) KeyEvent.getDeadChar(0, 0), 3225 - View.getDefaultSize(0, 0), 12 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 2133916302, false, $$e(b7, b8, b8), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i16] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr5)).charValue();
                        } else {
                            int i17 = setvideostabilizationmode.b;
                            Object[] objArr6 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c3)};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b9 = (byte) (-1);
                                byte b10 = (byte) (b9 + 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (29944 - KeyEvent.getDeadChar(0, 0)), View.MeasureSpec.makeMeasureSpec(0, 0) + 1755, 24 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 387247676, false, $$e(b9, b10, (byte) (b10 + 2)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i17] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr6)).charValue();
                        }
                        c3 = cArr4[setvideostabilizationmode.b];
                        Object[] objArr7 = {setvideostabilizationmode, setvideostabilizationmode};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b11 = (byte) (-1);
                            byte b12 = (byte) (b11 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.indexOf("", "") + 41241), 1705 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 21, -1434471773, false, $$e(b11, b12, (byte) (b12 | 6)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr7);
                    }
                    cArr3 = cArr4;
                }
                if (i7 > 0) {
                    char[] cArr5 = new char[i5];
                    i = 0;
                    System.arraycopy(cArr3, 0, cArr5, 0, i5);
                    int i18 = i5 - i7;
                    System.arraycopy(cArr5, 0, cArr3, i18, i7);
                    System.arraycopy(cArr5, i7, cArr3, 0, i18);
                } else {
                    i = 0;
                }
                if (z) {
                    char[] cArr6 = new char[i5];
                    setvideostabilizationmode.b = i;
                    int i19 = $11 + 83;
                    $10 = i19 % 128;
                    int i20 = i19 % 2;
                    while (setvideostabilizationmode.b < i5) {
                        cArr6[setvideostabilizationmode.b] = cArr3[(i5 - setvideostabilizationmode.b) - 1];
                        setvideostabilizationmode.b++;
                    }
                    cArr3 = cArr6;
                }
                if (i6 > 0) {
                    int i21 = $11 + 83;
                    $10 = i21 % 128;
                    if (i21 % 2 != 0) {
                        setvideostabilizationmode.b = 1;
                    } else {
                        setvideostabilizationmode.b = 0;
                    }
                    while (setvideostabilizationmode.b < i5) {
                        cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                        setvideostabilizationmode.b++;
                    }
                }
                objArr[0] = new String(cArr3);
            }

            /* JADX WARN: Code duplicated, block: B:56:0x02cb  */
            /* JADX WARN: Code duplicated, block: B:57:0x02d9 A[Catch: Exception -> 0x03de, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x03de, blocks: (B:54:0x02a6, B:57:0x02d9, B:59:0x0302, B:61:0x030a, B:63:0x0332, B:66:0x033b, B:69:0x0370, B:78:0x03cf, B:79:0x03d5, B:81:0x03d7, B:82:0x03dd, B:58:0x02e3, B:67:0x0345), top: B:93:0x02a6, inners: #1, #7 }] */
            /* JADX WARN: Code duplicated, block: B:61:0x030a A[Catch: Exception -> 0x03de, TRY_LEAVE, TryCatch #0 {Exception -> 0x03de, blocks: (B:54:0x02a6, B:57:0x02d9, B:59:0x0302, B:61:0x030a, B:63:0x0332, B:66:0x033b, B:69:0x0370, B:78:0x03cf, B:79:0x03d5, B:81:0x03d7, B:82:0x03dd, B:58:0x02e3, B:67:0x0345), top: B:93:0x02a6, inners: #1, #7 }] */
            /* JADX WARN: Code duplicated, block: B:65:0x0339  */
            /* JADX WARN: Code duplicated, block: B:66:0x033b A[Catch: Exception -> 0x03de, TRY_LEAVE, TryCatch #0 {Exception -> 0x03de, blocks: (B:54:0x02a6, B:57:0x02d9, B:59:0x0302, B:61:0x030a, B:63:0x0332, B:66:0x033b, B:69:0x0370, B:78:0x03cf, B:79:0x03d5, B:81:0x03d7, B:82:0x03dd, B:58:0x02e3, B:67:0x0345), top: B:93:0x02a6, inners: #1, #7 }] */
            public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2) throws Throwable {
                int i3;
                String str;
                char c;
                Object[] objArr;
                File file;
                FileReader fileReader;
                BufferedReader bufferedReader;
                boolean zEquals;
                File file2;
                FileReader fileReader2;
                BufferedReader bufferedReader2;
                boolean zEquals2;
                int i4;
                String str2;
                Object obj;
                int i5 = 2 % 2;
                try {
                    String[] strArr = new String[2];
                    Object[] objArr2 = new Object[1];
                    a(new int[]{0, 19, 9, 0}, true, new byte[]{1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, objArr2);
                    strArr[0] = (String) objArr2[0];
                    int[] iArr = {19, 18, 74, 16};
                    byte[] bArr = {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0};
                    int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 109;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
                    if (i6 % 2 == 0) {
                        Object[] objArr3 = new Object[1];
                        a(iArr, false, bArr, objArr3);
                        strArr[1] = (String) objArr3[0];
                    } else {
                        Object[] objArr4 = new Object[1];
                        a(iArr, false, bArr, objArr4);
                        strArr[1] = (String) objArr4[0];
                    }
                    int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i8 = (i7 & 89) + (i7 | 89);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
                    int i9 = i8 % 2;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= 2) {
                            int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i12 = (i11 ^ 73) + ((i11 & 73) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
                            if (i12 % 2 == 0) {
                                int i13 = 3 / 5;
                            }
                            i3 = i;
                            break;
                        }
                        int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
                        if (i14 % 2 == 0) {
                            str2 = strArr[i10];
                            Object[] objArr5 = new Object[1];
                            a(new int[]{37, 16, 99, 11}, false, new byte[]{0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 1}, objArr5);
                            obj = objArr5[0];
                        } else {
                            str2 = strArr[i10];
                            Object[] objArr6 = new Object[1];
                            a(new int[]{37, 16, 99, 11}, false, new byte[]{0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 1}, objArr6);
                            obj = objArr6[0];
                        }
                        Class<?> cls = Class.forName((String) obj);
                        if (((Boolean) cls.getMethod(str2, new Class[0]).invoke(cls, null)).booleanValue()) {
                            int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i15 % 128;
                            int i16 = i15 % 2;
                            i3 = (~(i & 1)) & (i | 1);
                            break;
                        }
                        i10++;
                        int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i17 % 128;
                        int i18 = i17 % 2;
                    }
                } catch (Exception unused) {
                    i3 = i ^ 2;
                }
                try {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(109138771);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cMyTid = (char) (2419 - (Process.myTid() >> 22));
                        int i19 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2844;
                        int iIndexOf = TextUtils.indexOf("", "") + 5;
                        byte b = (byte) 0;
                        byte b2 = b;
                        Object[] objArr7 = new Object[1];
                        c(b, b2, b2, objArr7);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyTid, i19, iIndexOf, -501222268, false, (String) objArr7[0], new Class[0]);
                    }
                    long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
                    long j = 352014094;
                    long j2 = -167;
                    long j3 = -1;
                    long j4 = jLongValue ^ j3;
                    long j5 = i;
                    long j6 = (j2 * j) + (j2 * jLongValue) + (((long) 336) * ((((j ^ j3) | j4) ^ j3) | ((j4 | j5) ^ j3))) + (((long) (-168)) * (((jLongValue | j) ^ j3) | ((j | j5) ^ j3))) + (((long) 168) * (j4 | (j3 ^ ((j5 ^ j3) | j)))) + ((long) (-1511200780));
                    int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i20 % 128;
                    int i21 = i20 % 2;
                    int i22 = ~i;
                    int i23 = ((int) (j6 >> 32)) & (1621217818 + ((1153716989 | i) * (-859)) + (((~(1153716989 | i22)) | (~((-12845742) | i))) * 859) + (((~((-283509422) | i22)) | 270663680) * 859));
                    int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                    int i24 = (~((-1814647418) | iMaxMemory)) | 740840024;
                    int i25 = ~iMaxMemory;
                    int i26 = ((int) j6) & ((-1371381153) + ((i24 | (~(2116900861 | i25))) * 886) + (((~(i25 | 1814647417)) | 1043093468) * (-1772)) + ((~(i25 | 1043093468)) * 886));
                    int i27 = (i23 & i26) | (i23 ^ i26);
                    int i28 = (i27 | 1) & (~(i27 & 1));
                    int i29 = (i28 | (-i28)) >> 31;
                    int i30 = (i29 & i) | (((i & (-11)) | (i22 & 10)) & (~i29));
                    int i31 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i32 = (i31 & 111) + (i31 | 111);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i32 % 128;
                    int i33 = i32 % 2;
                    int i34 = ((~i3) & i) | (i3 & i22);
                    int i35 = -i34;
                    int i36 = ((i34 & i35) | (i34 ^ i35)) >> 31;
                    int i37 = i30 & (~i36);
                    int i38 = i36 & i3;
                    int i39 = (i37 ^ i38) | (i37 & i38);
                    try {
                        try {
                            Object[] objArr8 = new Object[1];
                            a(new int[]{53, 40, 27, 34}, true, new byte[]{0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0}, objArr8);
                            File file3 = new File((String) objArr8[0]);
                            if (file3.canRead()) {
                                FileReader fileReader3 = new FileReader(file3);
                                BufferedReader bufferedReader3 = new BufferedReader(fileReader3);
                                try {
                                    String line = bufferedReader3.readLine();
                                    Object[] objArr9 = new Object[1];
                                    a(new int[]{93, 3, 0, 3}, true, new byte[]{0, 1, 1}, objArr9);
                                    if (line.equals((String) objArr9[0])) {
                                        fileReader3.close();
                                        bufferedReader3.close();
                                    } else {
                                        int i40 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                        int i41 = (i40 & 63) + (i40 | 63);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i41 % 128;
                                        if (i41 % 2 == 0) {
                                            fileReader3.close();
                                            bufferedReader3.close();
                                            Object obj2 = null;
                                            obj2.hashCode();
                                            throw null;
                                        }
                                        fileReader3.close();
                                        bufferedReader3.close();
                                        str = line;
                                    }
                                    Object[] objArr10 = new Object[1];
                                    a(new int[]{96, 31, 82, 29}, true, new byte[]{0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1}, objArr10);
                                    file = new File((String) objArr10[0]);
                                    if (!file.canRead()) {
                                        fileReader = new FileReader(file);
                                        bufferedReader = new BufferedReader(fileReader);
                                        try {
                                            String line2 = bufferedReader.readLine();
                                            Object[] objArr11 = new Object[1];
                                            a(new int[]{127, 1, 21, 1}, true, new byte[]{0}, objArr11);
                                            zEquals = line2.equals((String) objArr11[0]);
                                            fileReader.close();
                                            bufferedReader.close();
                                            if (zEquals) {
                                                Object[] objArr12 = new Object[1];
                                                a(new int[]{128, 36, 26, 0}, true, new byte[]{0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0}, objArr12);
                                                file2 = new File((String) objArr12[0]);
                                                int i42 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i42 % 128;
                                                int i43 = i42 % 2;
                                                if (!file2.canRead()) {
                                                    fileReader2 = new FileReader(file2);
                                                    bufferedReader2 = new BufferedReader(fileReader2);
                                                    try {
                                                        String line3 = bufferedReader2.readLine();
                                                        Object[] objArr13 = new Object[1];
                                                        a(new int[]{127, 1, 21, 1}, true, new byte[]{0}, objArr13);
                                                        zEquals2 = line3.equals((String) objArr13[0]);
                                                        int i44 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                        int i45 = (i44 & 13) + (i44 | 13);
                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i45 % 128;
                                                        int i46 = i45 % 2;
                                                        fileReader2.close();
                                                        bufferedReader2.close();
                                                        if (!zEquals2 && str != null) {
                                                            objArr = new Object[2];
                                                            objArr[0] = new int[1];
                                                            int i47 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                            int i48 = ((i47 | 17) << 1) - (i47 ^ 17);
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i48 % 128;
                                                            int i49 = i48 % 2;
                                                            int i50 = (~(i & 20)) & (i | 20);
                                                            int i51 = i47 + 83;
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i51 % 128;
                                                            int i52 = i51 % 2;
                                                            String[] strArr2 = {str};
                                                            int i53 = (i47 & 63) + (i47 | 63);
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i53 % 128;
                                                            if (i53 % 2 != 0) {
                                                                i4 = 1;
                                                                ((int[]) objArr[0])[1] = i50;
                                                            } else {
                                                                i4 = 1;
                                                                ((int[]) objArr[0])[0] = i50;
                                                            }
                                                            int i54 = (i47 ^ 79) + ((i47 & 79) << i4);
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i54 % 128;
                                                            int i55 = i54 % 2;
                                                            objArr[i4] = strArr2;
                                                            c = 0;
                                                        }
                                                    } catch (Throwable th) {
                                                        fileReader2.close();
                                                        bufferedReader2.close();
                                                        throw th;
                                                    }
                                                }
                                            }
                                            int i56 = ((int[]) objArr[c])[c];
                                            int i57 = (~(i & i39)) & (i | i39);
                                            int i58 = -i57;
                                            int i59 = ((i57 & i58) | (i57 ^ i58)) >> 31;
                                            int i60 = (i39 & i59) | ((~i59) & i56);
                                            String[] strArr3 = (String[]) objArr[1];
                                            Object[] objArr14 = new Object[2];
                                            int i61 = (i56 | i) & (~(i & i56));
                                            int i62 = -i61;
                                            int i63 = (((i61 & i62) | (i61 ^ i62)) >> 31) & 1;
                                            int i64 = (~(((-i63) | i63) >> 31)) & 1;
                                            objArr14[i63] = null;
                                            objArr14[i64] = strArr3;
                                            String[] strArr4 = (String[]) objArr14[0];
                                            int i65 = ((~i60) & i) | (i60 & i22);
                                            int i66 = -i65;
                                            int i67 = (((i65 & i66) | (i65 ^ i66)) >> 31) & 16;
                                            Object[] objArr15 = {new int[]{i}, new int[1], new int[]{i60}, strArr4};
                                            int i68 = (-959618912) + (((~(i22 | (-822120715))) | (~((-37816913) | i))) * (-302)) + ((~((-822120715) | i)) * (-604)) + (((~((-859937627) | i)) | (-938064768)) * 302);
                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                            int i69 = (i67 * (-167)) + (i68 * (-167));
                                            int i70 = ~i67;
                                            int i71 = ~i68;
                                            int i72 = ~((i70 ^ i71) | (i70 & i71));
                                            int i73 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                            int i74 = ~((i73 & i71) | (i71 ^ i73));
                                            int i75 = ((i72 & i74) | (i72 ^ i74)) * 168;
                                            int i76 = ((i69 | i75) << 1) - (i69 ^ i75);
                                            int i77 = ~i67;
                                            int i78 = (~((i77 ^ i71) | (i77 & i71) | iTuitionPaymentFragmentspecialinlinedviewModeldefault1)) * 168;
                                            int i79 = (i76 ^ i78) + ((i78 & i76) << 1);
                                            int i80 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                            int i81 = (~((i77 & i68) | (i77 ^ i68))) | (~((i70 & i80) | (i70 ^ i80)));
                                            int i82 = (i67 & i71) | (i71 ^ i67);
                                            int i83 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault1 & i82) | (i82 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                                            int i84 = ((i83 & i81) | (i81 ^ i83)) * 168;
                                            int i85 = -(-((i79 ^ i84) + ((i84 & i79) << 1)));
                                            int i86 = (i2 ^ i85) + ((i2 & i85) << 1);
                                            int i87 = i86 << 13;
                                            int i88 = (i87 | i86) & (~(i86 & i87));
                                            int i89 = i88 ^ (i88 >>> 17);
                                            int i90 = i89 << 5;
                                            ((int[]) objArr15[1])[0] = (i89 | i90) & (~(i89 & i90));
                                            return objArr15;
                                        } catch (Throwable th2) {
                                            fileReader.close();
                                            bufferedReader.close();
                                            throw th2;
                                        }
                                    }
                                    int i91 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i92 = (i91 & 85) + (i91 | 85);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i92 % 128;
                                    int i93 = i92 % 2;
                                    int i94 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
                                    int i95 = i94 % 128;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i95;
                                    int i96 = i94 % 2;
                                    int i97 = i95 + 47;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i97 % 128;
                                    int i98 = i97 % 2;
                                    c = 0;
                                    objArr = new Object[]{new int[]{i}, new String[0]};
                                    int i510 = ((int[]) objArr[c])[c];
                                    int i511 = (~(i & i39)) & (i | i39);
                                    int i512 = -i511;
                                    int i513 = ((i511 & i512) | (i511 ^ i512)) >> 31;
                                    int i610 = (i39 & i513) | ((~i513) & i510);
                                    String[] strArr5 = (String[]) objArr[1];
                                    Object[] objArr16 = new Object[2];
                                    int i611 = (i510 | i) & (~(i & i510));
                                    int i612 = -i611;
                                    int i613 = (((i611 & i612) | (i611 ^ i612)) >> 31) & 1;
                                    int i614 = (~(((-i613) | i613) >> 31)) & 1;
                                    objArr16[i613] = null;
                                    objArr16[i614] = strArr5;
                                    String[] strArr6 = (String[]) objArr16[0];
                                    int i615 = ((~i610) & i) | (i610 & i22);
                                    int i616 = -i615;
                                    int i617 = (((i615 & i616) | (i615 ^ i616)) >> 31) & 16;
                                    Object[] objArr17 = {new int[]{i}, new int[1], new int[]{i610}, strArr6};
                                    int i618 = (-959618912) + (((~(i22 | (-822120715))) | (~((-37816913) | i))) * (-302)) + ((~((-822120715) | i)) * (-604)) + (((~((-859937627) | i)) | (-938064768)) * 302);
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                    int i619 = (i617 * (-167)) + (i618 * (-167));
                                    int i710 = ~i617;
                                    int i711 = ~i618;
                                    int i712 = ~((i710 ^ i711) | (i710 & i711));
                                    int i713 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    int i714 = ~((i713 & i711) | (i711 ^ i713));
                                    int i715 = ((i712 & i714) | (i712 ^ i714)) * 168;
                                    int i716 = ((i619 | i715) << 1) - (i619 ^ i715);
                                    int i717 = ~i617;
                                    int i718 = (~((i717 ^ i711) | (i717 & i711) | iTuitionPaymentFragmentspecialinlinedviewModeldefault2)) * 168;
                                    int i719 = (i716 ^ i718) + ((i718 & i716) << 1);
                                    int i810 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    int i811 = (~((i717 & i618) | (i717 ^ i618))) | (~((i710 & i810) | (i710 ^ i810)));
                                    int i812 = (i617 & i711) | (i711 ^ i617);
                                    int i813 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault2 & i812) | (i812 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                                    int i814 = ((i813 & i811) | (i811 ^ i813)) * 168;
                                    int i815 = -(-((i719 ^ i814) + ((i814 & i719) << 1)));
                                    int i816 = (i2 ^ i815) + ((i2 & i815) << 1);
                                    int i817 = i816 << 13;
                                    int i818 = (i817 | i816) & (~(i816 & i817));
                                    int i819 = i818 ^ (i818 >>> 17);
                                    int i99 = i819 << 5;
                                    ((int[]) objArr17[1])[0] = (i819 | i99) & (~(i819 & i99));
                                    return objArr17;
                                } catch (Throwable th3) {
                                    fileReader3.close();
                                    bufferedReader3.close();
                                    throw th3;
                                }
                            }
                            int i100 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i101 = (i100 ^ 53) + ((i100 & 53) << 1);
                            int i102 = i101 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i102;
                            if (i101 % 2 != 0) {
                                throw null;
                            }
                            int i103 = i102 + 23;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i103 % 128;
                            int i104 = i103 % 2;
                        } catch (Exception unused2) {
                        }
                        Object[] objArr18 = new Object[1];
                        a(new int[]{96, 31, 82, 29}, true, new byte[]{0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1}, objArr18);
                        file = new File((String) objArr18[0]);
                        if (!file.canRead()) {
                            fileReader = new FileReader(file);
                            bufferedReader = new BufferedReader(fileReader);
                            String line4 = bufferedReader.readLine();
                            Object[] objArr19 = new Object[1];
                            a(new int[]{127, 1, 21, 1}, true, new byte[]{0}, objArr19);
                            zEquals = line4.equals((String) objArr19[0]);
                            fileReader.close();
                            bufferedReader.close();
                            if (zEquals) {
                                Object[] objArr110 = new Object[1];
                                a(new int[]{128, 36, 26, 0}, true, new byte[]{0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0}, objArr110);
                                file2 = new File((String) objArr110[0]);
                                int i410 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i410 % 128;
                                int i411 = i410 % 2;
                                if (!file2.canRead()) {
                                    fileReader2 = new FileReader(file2);
                                    bufferedReader2 = new BufferedReader(fileReader2);
                                    String line5 = bufferedReader2.readLine();
                                    Object[] objArr111 = new Object[1];
                                    a(new int[]{127, 1, 21, 1}, true, new byte[]{0}, objArr111);
                                    zEquals2 = line5.equals((String) objArr111[0]);
                                    int i412 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i413 = (i412 & 13) + (i412 | 13);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i413 % 128;
                                    int i414 = i413 % 2;
                                    fileReader2.close();
                                    bufferedReader2.close();
                                    if (!zEquals2) {
                                    }
                                }
                            }
                            int i514 = ((int[]) objArr[c])[c];
                            int i515 = (~(i & i39)) & (i | i39);
                            int i516 = -i515;
                            int i517 = ((i515 & i516) | (i515 ^ i516)) >> 31;
                            int i6110 = (i39 & i517) | ((~i517) & i514);
                            String[] strArr7 = (String[]) objArr[1];
                            Object[] objArr112 = new Object[2];
                            int i6111 = (i514 | i) & (~(i & i514));
                            int i6112 = -i6111;
                            int i6113 = (((i6111 & i6112) | (i6111 ^ i6112)) >> 31) & 1;
                            int i6114 = (~(((-i6113) | i6113) >> 31)) & 1;
                            objArr112[i6113] = null;
                            objArr112[i6114] = strArr7;
                            String[] strArr8 = (String[]) objArr112[0];
                            int i6115 = ((~i6110) & i) | (i6110 & i22);
                            int i6116 = -i6115;
                            int i6117 = (((i6115 & i6116) | (i6115 ^ i6116)) >> 31) & 16;
                            Object[] objArr113 = {new int[]{i}, new int[1], new int[]{i6110}, strArr8};
                            int i6118 = (-959618912) + (((~(i22 | (-822120715))) | (~((-37816913) | i))) * (-302)) + ((~((-822120715) | i)) * (-604)) + (((~((-859937627) | i)) | (-938064768)) * 302);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i6119 = (i6117 * (-167)) + (i6118 * (-167));
                            int i7110 = ~i6117;
                            int i7111 = ~i6118;
                            int i7112 = ~((i7110 ^ i7111) | (i7110 & i7111));
                            int i7113 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i7114 = ~((i7113 & i7111) | (i7111 ^ i7113));
                            int i7115 = ((i7112 & i7114) | (i7112 ^ i7114)) * 168;
                            int i7116 = ((i6119 | i7115) << 1) - (i6119 ^ i7115);
                            int i7117 = ~i6117;
                            int i7118 = (~((i7117 ^ i7111) | (i7117 & i7111) | iTuitionPaymentFragmentspecialinlinedviewModeldefault3)) * 168;
                            int i7119 = (i7116 ^ i7118) + ((i7118 & i7116) << 1);
                            int i8110 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i8111 = (~((i7117 & i6118) | (i7117 ^ i6118))) | (~((i7110 & i8110) | (i7110 ^ i8110)));
                            int i8112 = (i6117 & i7111) | (i7111 ^ i6117);
                            int i8113 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & i8112) | (i8112 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                            int i8114 = ((i8113 & i8111) | (i8111 ^ i8113)) * 168;
                            int i8115 = -(-((i7119 ^ i8114) + ((i8114 & i7119) << 1)));
                            int i8116 = (i2 ^ i8115) + ((i2 & i8115) << 1);
                            int i8117 = i8116 << 13;
                            int i8118 = (i8117 | i8116) & (~(i8116 & i8117));
                            int i8119 = i8118 ^ (i8118 >>> 17);
                            int i910 = i8119 << 5;
                            ((int[]) objArr113[1])[0] = (i8119 | i910) & (~(i8119 & i910));
                            return objArr113;
                        }
                        int i911 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i912 = (i911 & 85) + (i911 | 85);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i912 % 128;
                        int i913 = i912 % 2;
                    } catch (Exception unused3) {
                    }
                    str = null;
                    int i914 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
                    int i915 = i914 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i915;
                    int i916 = i914 % 2;
                    int i917 = i915 + 47;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i917 % 128;
                    int i918 = i917 % 2;
                    c = 0;
                    objArr = new Object[]{new int[]{i}, new String[0]};
                    int i518 = ((int[]) objArr[c])[c];
                    int i519 = (~(i & i39)) & (i | i39);
                    int i5110 = -i519;
                    int i5111 = ((i519 & i5110) | (i519 ^ i5110)) >> 31;
                    int i61110 = (i39 & i5111) | ((~i5111) & i518);
                    String[] strArr9 = (String[]) objArr[1];
                    Object[] objArr114 = new Object[2];
                    int i61111 = (i518 | i) & (~(i & i518));
                    int i61112 = -i61111;
                    int i61113 = (((i61111 & i61112) | (i61111 ^ i61112)) >> 31) & 1;
                    int i61114 = (~(((-i61113) | i61113) >> 31)) & 1;
                    objArr114[i61113] = null;
                    objArr114[i61114] = strArr9;
                    String[] strArr10 = (String[]) objArr114[0];
                    int i61115 = ((~i61110) & i) | (i61110 & i22);
                    int i61116 = -i61115;
                    int i61117 = (((i61115 & i61116) | (i61115 ^ i61116)) >> 31) & 16;
                    Object[] objArr115 = {new int[]{i}, new int[1], new int[]{i61110}, strArr10};
                    int i61118 = (-959618912) + (((~(i22 | (-822120715))) | (~((-37816913) | i))) * (-302)) + ((~((-822120715) | i)) * (-604)) + (((~((-859937627) | i)) | (-938064768)) * 302);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i61119 = (i61117 * (-167)) + (i61118 * (-167));
                    int i71110 = ~i61117;
                    int i71111 = ~i61118;
                    int i71112 = ~((i71110 ^ i71111) | (i71110 & i71111));
                    int i71113 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                    int i71114 = ~((i71113 & i71111) | (i71111 ^ i71113));
                    int i71115 = ((i71112 & i71114) | (i71112 ^ i71114)) * 168;
                    int i71116 = ((i61119 | i71115) << 1) - (i61119 ^ i71115);
                    int i71117 = ~i61117;
                    int i71118 = (~((i71117 ^ i71111) | (i71117 & i71111) | iTuitionPaymentFragmentspecialinlinedviewModeldefault4)) * 168;
                    int i71119 = (i71116 ^ i71118) + ((i71118 & i71116) << 1);
                    int i81110 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                    int i81111 = (~((i71117 & i61118) | (i71117 ^ i61118))) | (~((i71110 & i81110) | (i71110 ^ i81110)));
                    int i81112 = (i61117 & i71111) | (i71111 ^ i61117);
                    int i81113 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault4 & i81112) | (i81112 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                    int i81114 = ((i81113 & i81111) | (i81111 ^ i81113)) * 168;
                    int i81115 = -(-((i71119 ^ i81114) + ((i81114 & i71119) << 1)));
                    int i81116 = (i2 ^ i81115) + ((i2 & i81115) << 1);
                    int i81117 = i81116 << 13;
                    int i81118 = (i81117 | i81116) & (~(i81116 & i81117));
                    int i81119 = i81118 ^ (i81118 >>> 17);
                    int i919 = i81119 << 5;
                    ((int[]) objArr115[1])[0] = (i81119 | i919) & (~(i81119 & i919));
                    return objArr115;
                } catch (Throwable th4) {
                    Throwable cause = th4.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th4;
                }
            }

            private static String $$e(byte b, int i, byte b2) {
                int i2 = b2 + 99;
                byte[] bArr = $$c;
                int i3 = b + 4;
                int i4 = i * 2;
                byte[] bArr2 = new byte[i4 + 1];
                int i5 = -1;
                if (bArr == null) {
                    i5 = -1;
                    i2 = (-i3) + i2;
                    i3 = i3;
                }
                while (true) {
                    int i6 = i5 + 1;
                    int i7 = i3 + 1;
                    bArr2[i6] = (byte) i2;
                    if (i6 == i4) {
                        return new String(bArr2, 0);
                    }
                    i5 = i6;
                    i2 = (-bArr[i7]) + i2;
                    i3 = i7;
                }
            }
        };
        BufferProviderState bufferProviderStateSubscribe = videoRecordEventStartTuitionPaymentFragmentbindingInflater1.subscribe(logtostring, new logToString() { // from class: TwilightManagerTwilightState
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        if (bufferProviderStateSubscribe != null) {
            this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateSubscribe);
        }
    }

    @Override // androidx.p002lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(checkShowingFlags checkshowingflags, Throwable th) throws IOException {
        if (!checkshowingflags.TuitionPaymentFragmentbindingInflater1.isDisposed()) {
            checkshowingflags.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onError(th);
        }
        getContentPaddingRight.TuitionPaymentFragmentbindingInflater1(th);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(checkShowingFlags checkshowingflags, TwilightManager twilightManager) {
        checkshowingflags.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onNext(twilightManager);
        return Unit.INSTANCE;
    }
}
