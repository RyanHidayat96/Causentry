package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class getTimestampNs<T> extends notifySuspended<T, T> {
    private findQualityInTargetQualities<? super T> b;

    public getTimestampNs(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, findQualityInTargetQualities<? super T> findqualityintargetqualities) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.b = findqualityintargetqualities;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new b(derivemediatype, this.b));
    }

    static final class b<T> extends getAudioFormat<T, T> {
        private findQualityInTargetQualities<? super T> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private static final byte[] $$c = {1, 115, -83, 116};
        private static final int $$f = 188;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {43, 23, 22, -14, 12, -2, -63, 57, 8, 0, -8, 5, -7, -55, 51, 13, -10, 14, -3, -6, -5, -54, 57, 6, 6, -69, 51, 20, -1, -12, -58, 51, 15, -7, -59, 69, -10, -2, 7, -5, 5, -64, 36, 19, 17, -7, -12, -2, 19, -11, 6, -1, -44, 45, 6, -7, -10, -17, 18, 13, 4, -13, -6, 2, 33, -12, 11, -11, 6, -1, -30, 17, 24, -12, -8, 9, 6, -46, 44, -17, 6, 6, -8, 9, 6, -1, -3, -11, -2, 6, -8, 11, -3, 5, -2, -3, 5, -9, -1, 18, -13, -4, 18, -42, 34, -11, 1, 7, -8, 1, 1, -5, 20, -9, 8, -67};
        private static final int $$e = 153;
        private static final byte[] $$a = {1, -81, 2, 79, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
        private static final int $$b = 87;
        private static int asBinder = 0;
        private static int d = 1;
        private static char[] g = {59710, 59756, 59746, 59750, 59740, 59731, 59746, 59751, 59768, 59773, 59757, 59723, 59739, 59770, 59717, 59714, 59757, 59751, 59771, 59744, 59746, 59756, 59705, 59746, 59744, 59749, 59771, 59757, 59752, 59728, 59728, 59759, 59751, 59770, 59747, 59757, 59747, 59747, 59836, 59826, 59869, 59863, 59883, 59856, 59858, 59868, 59865, 59865, 59864, 59856, 59862, 59845, 59869, 59885, 59861, 59860, 59860, 59861, 59856, 59849, 59820, 59828, 59883, 59699, 59771, 59731, 59729, 59770, 59746, 59744, 59769, 59768, 59751, 59747, 59749, 59751, 59749, 59745, 59753, 59757, 59745, 59763, 59752, 59751, 59748, 59756, 59773, 59774, 59760, 59742, 59707, 59746, 59771, 59752, 59749, 59707, 59752, 59711, 59757, 59759, 59746, 59770, 59749, 59749, 59773, 59755, 59743, 59745, 59750, 59742, 59730, 59746, 59759};

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(byte r6, byte r7, int r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = getTimestampNs.b.$$a
                int r7 = 53 - r7
                int r8 = r8 * 14
                int r8 = r8 + 84
                int r6 = r6 * 52
                int r6 = 56 - r6
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L15
                r8 = r6
                r3 = r7
                r5 = r2
                goto L27
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r8
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r7) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L25:
                r3 = r0[r6]
            L27:
                int r3 = -r3
                int r6 = r6 + 1
                int r8 = r8 + r3
                int r8 = r8 + (-10)
                r3 = r5
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: getTimestampNs.b.a(byte, byte, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002b  */
        /* JADX WARN: Code duplicated, block: B:8:0x0023  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0030). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void e(byte r6, int r7, short r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 15
                int r8 = r8 + 84
                byte[] r0 = getTimestampNs.b.$$d
                int r6 = r6 * 60
                int r6 = 63 - r6
                int r7 = r7 * 8
                int r1 = 61 - r7
                byte[] r1 = new byte[r1]
                int r7 = 60 - r7
                r2 = 0
                if (r0 != 0) goto L19
                r3 = r8
                r4 = r2
                r8 = r6
                goto L30
            L19:
                r3 = r2
            L1a:
                int r6 = r6 + 1
                byte r4 = (byte) r8
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r7) goto L2b
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L2b:
                r3 = r0[r6]
                r5 = r8
                r8 = r6
                r6 = r5
            L30:
                int r6 = r6 + r3
                r3 = r4
                r5 = r8
                r8 = r6
                r6 = r5
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: getTimestampNs.b.e(byte, int, short, java.lang.Object[]):void");
        }

        b(deriveMediaType<? super T> derivemediatype, findQualityInTargetQualities<? super T> findqualityintargetqualities) {
            super(derivemediatype);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = findqualityintargetqualities;
        }

        private static void c(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            int i;
            int i2 = 2 % 2;
            setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
            int i3 = 0;
            int i4 = iArr[0];
            int i5 = iArr[1];
            int i6 = iArr[2];
            int i7 = iArr[3];
            char[] cArr = g;
            long j = 0;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i8 = 0;
                while (i8 < length) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i3] = Integer.valueOf(cArr[i8]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                            int i9 = 1271 - (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1));
                            int deadChar = KeyEvent.getDeadChar(i3, i3) + 18;
                            byte b = $$c[i3];
                            byte b2 = (byte) (b - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(windowTouchSlop, i9, deadChar, 407021364, false, $$g(b, b2, b2), new Class[]{Integer.TYPE});
                        }
                        cArr2[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i8++;
                        i3 = 0;
                        j = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr = cArr2;
            }
            char[] cArr3 = new char[i5];
            System.arraycopy(cArr, i4, cArr3, 0, i5);
            if (bArr != null) {
                char[] cArr4 = new char[i5];
                setvideostabilizationmode.b = 0;
                char c = 0;
                while (setvideostabilizationmode.b < i5) {
                    int i10 = $11 + 107;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    if (bArr[setvideostabilizationmode.b] == 1) {
                        int i12 = setvideostabilizationmode.b;
                        Object[] objArr3 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                            int i13 = 3225 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            int touchSlop = 13 - (ViewConfiguration.getTouchSlop() >> 8);
                            byte b3 = (byte) ($$c[0] - 1);
                            byte b4 = b3;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveOpacity, i13, touchSlop, 2133916302, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i12] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    } else {
                        int i14 = setvideostabilizationmode.b;
                        Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char cCombineMeasuredStates = (char) (29944 - View.combineMeasuredStates(0, 0));
                            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 1756;
                            int mode = 23 - View.MeasureSpec.getMode(0);
                            byte b5 = (byte) ($$c[0] + 1);
                            byte b6 = (byte) (b5 - 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cCombineMeasuredStates, iLastIndexOf, mode, 387247676, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i14] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                        int i15 = $11 + 15;
                        $10 = i15 % 128;
                        int i16 = i15 % 2;
                    }
                    c = cArr4[setvideostabilizationmode.b];
                    Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cGreen = (char) (Color.green(0) + 41241);
                        int i17 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1705;
                        int i18 = 22 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        byte b7 = (byte) ($$c[0] - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cGreen, i17, i18, -1434471773, false, $$g((byte) 6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                }
                cArr3 = cArr4;
            }
            if (i7 > 0) {
                char[] cArr5 = new char[i5];
                i = 0;
                System.arraycopy(cArr3, 0, cArr5, 0, i5);
                int i19 = i5 - i7;
                System.arraycopy(cArr5, 0, cArr3, i19, i7);
                System.arraycopy(cArr5, i7, cArr3, 0, i19);
            } else {
                i = 0;
            }
            if (z) {
                char[] cArr6 = new char[i5];
                setvideostabilizationmode.b = i;
                int i20 = $11 + 89;
                $10 = i20 % 128;
                int i21 = i20 % 2;
                while (setvideostabilizationmode.b < i5) {
                    cArr6[setvideostabilizationmode.b] = cArr3[(i5 - setvideostabilizationmode.b) - 1];
                    setvideostabilizationmode.b++;
                }
                cArr3 = cArr6;
            }
            if (i6 > 0) {
                int i22 = 0;
                loop3: while (true) {
                    setvideostabilizationmode.b = i22;
                    while (true) {
                        if (setvideostabilizationmode.b >= i5) {
                            break loop3;
                        }
                        int i23 = $11 + 71;
                        $10 = i23 % 128;
                        if (i23 % 2 != 0) {
                            cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] / iArr[5]);
                            setvideostabilizationmode.b++;
                        }
                    }
                    cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                    i22 = setvideostabilizationmode.b + 1;
                }
            }
            objArr[0] = new String(cArr3);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.deriveMediaType
        public final void onNext(T t) throws Throwable {
            int i;
            Object[] objArr;
            int i2 = 2 % 2;
            int i3 = d + 65;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char c = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 31533);
                int iAxisFromString = MotionEvent.axisFromString("") + 922;
                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 28;
                byte b = $$a[0];
                Object[] objArr2 = new Object[1];
                a(b, (byte) 52, b, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iAxisFromString, iResolveOpacity, -1048449946, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(new int[]{0, 22, 0, 0}, true, new byte[]{1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(new int[]{22, 15, 0, 0}, true, new byte[]{1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 31534);
                int iArgb = 921 - Color.argb(0, 0, 0, 0);
                int iKeyCodeFromString = 28 - KeyEvent.keyCodeFromString("");
                byte[] bArr = $$a;
                byte b2 = bArr[0];
                byte b3 = bArr[80];
                Object[] objArr5 = new Object[1];
                a(b2, b3, b3, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionChild, iArgb, iKeyCodeFromString, -778300370, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                int i5 = d + 121;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 31533);
                    int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 921;
                    int i7 = 29 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    byte[] bArr2 = $$a;
                    byte b4 = bArr2[80];
                    Object[] objArr6 = new Object[1];
                    a(b4, (byte) (-bArr2[33]), b4, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, fadingEdgeLength, i7, -1142834547, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                int i8 = ((int[]) objArr7[3])[0];
                objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{i8}, (String[]) objArr7[4]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i9 = (((358313577 + (((~((-1420361681) | iIdentityHashCode)) | (-1438515164)) * (-502))) + ((~((~iIdentityHashCode) | (-1084797201))) * (-502))) + (((~(iIdentityHashCode | (-353717964))) | (-1420361681)) * TypedValues.PositionType.TYPE_DRAWPATH)) - 1453212284;
                int i10 = (i9 << 13) ^ i9;
                int i11 = i10 ^ (i10 >>> 17);
                ((int[]) objArr[0])[0] = i11 ^ (i11 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                c(new int[]{37, 26, 112, 9}, true, new byte[]{1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0}, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(new int[]{63, 18, 0, 10}, true, new byte[]{0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1}, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    if (!(applicationContext instanceof ContextWrapper)) {
                        i = 2;
                    } else {
                        int i12 = d + 79;
                        asBinder = i12 % 128;
                        i = 2;
                        int i13 = i12 % 2;
                        if (((ContextWrapper) applicationContext).getBaseContext() == null) {
                            applicationContext = null;
                        }
                    }
                    applicationContext = applicationContext.getApplicationContext();
                } else {
                    i = 2;
                }
                int[] iArr = {81, 16, i, 3};
                Object[] objArr10 = new Object[1];
                c(iArr, true, null, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                c(new int[]{97, 16, 0, 0}, false, new byte[]{1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1}, objArr11);
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -1453212284};
                    byte[] bArr3 = $$d;
                    byte b5 = bArr3[106];
                    Object[] objArr13 = new Object[1];
                    e(b5, bArr3[9], b5, objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b6 = bArr3[9];
                    Object[] objArr14 = new Object[1];
                    e(b6, bArr3[106], b6, objArr14);
                    Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char scrollBarFadeDuration = (char) (31533 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                        int i14 = 922 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        int iKeyCodeFromString2 = 28 - KeyEvent.keyCodeFromString("");
                        byte[] bArr4 = $$a;
                        byte b7 = bArr4[80];
                        Object[] objArr16 = new Object[1];
                        a(b7, (byte) (-bArr4[33]), b7, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollBarFadeDuration, i14, iKeyCodeFromString2, -1142834547, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        c(new int[]{0, 22, 0, 0}, true, new byte[]{1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        c(new int[]{22, 15, 0, 0}, true, new byte[]{1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char maximumDrawingCacheSize = (char) (31533 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 921;
                            int iAxisFromString2 = MotionEvent.axisFromString("") + 29;
                            byte[] bArr5 = $$a;
                            byte b8 = bArr5[0];
                            byte b9 = bArr5[80];
                            Object[] objArr19 = new Object[1];
                            a(b8, b9, b9, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maximumDrawingCacheSize, windowTouchSlop, iAxisFromString2, -778300370, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c2 = (char) (31533 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 921;
                            int iMyTid = (Process.myTid() >> 22) + 28;
                            byte b10 = $$a[0];
                            Object[] objArr20 = new Object[1];
                            a(b10, (byte) 52, b10, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, packedPositionType, iMyTid, -1048449946, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        objArr = objArr15;
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
            int i15 = ((int[]) objArr[1])[0];
            int i16 = ((int[]) objArr[3])[0];
            if (i16 == i15) {
                int i17 = asBinder + 61;
                d = i17 % 128;
                int i18 = i17 % 2;
                int i19 = ((int[]) objArr[0])[0];
                int i20 = ((int[]) objArr[3])[0];
                Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i20}, (String[]) objArr[4]};
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i21 = (~((-1209454692) | iUptimeMillis)) | 413728;
                int i22 = ~iUptimeMillis;
                int i23 = i19 + (-567884903) + ((i21 | (~(1773665915 | i22))) * 886) + (((~(i22 | 1209454691)) | 564624952) * (-1772)) + ((~(i22 | 564624952)) * 886);
                int i24 = (i23 << 13) ^ i23;
                int i25 = i24 ^ (i24 >>> 17);
                ((int[]) objArr21[0])[0] = i25 ^ (i25 << 5);
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[4];
                if (strArr != null) {
                    int i26 = 0;
                    while (i26 < strArr.length) {
                        arrayList.add(strArr[i26]);
                        i26++;
                        int i27 = d + 111;
                        asBinder = i27 % 128;
                        int i28 = i27 % 2;
                    }
                }
                Toast.makeText((Context) null, i16 / (((i16 - 1) * i16) % 2), 0).show();
                int i29 = ((int[]) objArr[0])[0];
                int i30 = ((int[]) objArr[3])[0];
                Object[] objArr22 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i30}, (String[]) objArr[4]};
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i31 = ~iIdentityHashCode2;
                int i32 = i29 + (-1418503073) + ((iIdentityHashCode2 | 87565632) * 988) + (((~(393917932 | i31)) | 1073809411) * (-1976)) + (((~(iIdentityHashCode2 | (-1380161712))) | 87565632 | (~(1380161711 | i31))) * 988);
                int i33 = (i32 << 13) ^ i32;
                int i34 = i33 ^ (i33 >>> 17);
                ((int[]) objArr22[0])[0] = i34 ^ (i34 << 5);
            }
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != 0) {
                this.TuitionPaymentFragmentbindingInflater1.onNext(null);
                return;
            }
            try {
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(t)) {
                    this.TuitionPaymentFragmentbindingInflater1.onNext((Object) t);
                }
            } catch (Throwable th2) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(th2);
            }
        }

        @Override // defpackage.VideoValidatedEncoderProfilesProxy
        public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
            int i2 = 2 % 2;
            int i3 = d + 101;
            asBinder = i3 % 128;
            if (i3 % 2 != 0) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3(i);
                throw null;
            }
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(i);
            int i4 = asBinder + 61;
            d = i4 % 128;
            int i5 = i4 % 2;
            return iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        @Override // defpackage.AudioSettingsBuilder
        public final T TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws Exception {
            T tTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i = 2 % 2;
            do {
                tTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                if (tTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                    break;
                }
                int i2 = d + 67;
                asBinder = i2 % 128;
                if (i2 % 2 != 0) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(tTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            } while (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(tTuitionPaymentFragmentspecialinlinedviewModeldefault2));
            int i3 = d + 83;
            asBinder = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 1 / 0;
            }
            return tTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(int r6, short r7, short r8) {
            /*
                byte[] r0 = getTimestampNs.b.$$c
                int r7 = r7 * 4
                int r7 = 4 - r7
                int r8 = r8 * 3
                int r1 = r8 + 1
                int r6 = r6 + 99
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L15
                r6 = r7
                r4 = r8
                r3 = r2
                goto L2b
            L15:
                r3 = r2
            L16:
                r5 = r7
                r7 = r6
                r6 = r5
                byte r4 = (byte) r7
                r1[r3] = r4
                if (r3 != r8) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L24:
                int r3 = r3 + 1
                r4 = r0[r6]
                r5 = r7
                r7 = r6
                r6 = r5
            L2b:
                int r7 = r7 + 1
                int r6 = r6 + r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: getTimestampNs.b.$$g(int, short, short):java.lang.String");
        }
    }
}
