package com.google.android.gms.internal.mlkit_vision_common;

import android.graphics.Color;
import android.media.AudioTrack;
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
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.InputDeviceCompat;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import defpackage.EncoderImplByteBufferInput;
import defpackage.initSession;
import defpackage.setVideoStabilizationMode;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zzr implements Map, Serializable {
    private transient zzs zza;
    private transient zzs zzb;
    private transient zzl zzc;
    private static final byte[] $$c = {29, -5, -24, -13};
    private static final int $$d = 127;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {89, 92, -72, 43, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
    private static final int $$b = 227;
    private static int b = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {59707, 59756, 59746, 59744, 59771, 59751, 59757, 59714, 59717, 59770, 59739, 59723, 59757, 59773, 59768, 59751, 59746, 59731, 59740, 59750, 59746, 59756, 59753, 59852, 59854, 59852, 59867, 59840, 59848, 59825, 59825, 59849, 59854, 59844, 59846, 59841, 59843, 59709, 59744, 59758, 59744, 59744, 59724, 59718, 59757, 59756, 59745, 59713, 59723, 59757, 59773, 59768, 59751, 59708, 59730, 59742, 59750, 59745, 59743, 59755, 59773, 59749, 59749, 59770, 59746, 59759, 59757, 59756, 59759};

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 15
            int r0 = 53 - r7
            int r6 = 93 - r6
            byte[] r1 = com.google.android.gms.internal.mlkit_vision_common.zzr.$$a
            int r5 = r5 * 3
            int r5 = 84 - r5
            byte[] r0 = new byte[r0]
            int r7 = 52 - r7
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r5
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L26:
            r3 = r1[r6]
        L28:
            int r6 = r6 + 1
            int r5 = r5 + r3
            int r5 = r5 + (-11)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_common.zzr.a(int, byte, byte, java.lang.Object[]):void");
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        int i = 2 % 2;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    abstract zzl zza();

    abstract zzs zzd();

    abstract zzs zze();

    public static zzr zzc(Object obj, Object obj2) {
        zzz zzzVarZzg;
        int i = 2 % 2;
        int i2 = b + 9;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            zzi.zza("optional-module-barcode", OptionalModuleUtils.BARCODE_MODULE_ID);
            Object[] objArr = new Object[2];
            objArr[1] = "optional-module-barcode";
            objArr[1] = OptionalModuleUtils.BARCODE_MODULE_ID;
            zzzVarZzg = zzz.zzg(0, objArr, null);
        } else {
            zzi.zza("optional-module-barcode", OptionalModuleUtils.BARCODE_MODULE_ID);
            zzzVarZzg = zzz.zzg(1, new Object[]{"optional-module-barcode", OptionalModuleUtils.BARCODE_MODULE_ID}, null);
        }
        int i3 = TuitionPaymentFragmentbindingInflater1 + 1;
        b = i3 % 128;
        int i4 = i3 % 2;
        return zzzVarZzg;
    }

    private static void c(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        char[] cArr;
        char c;
        int i2 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i3 = 0;
        int i4 = iArr[0];
        byte b2 = 1;
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr2[i8]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b3 = (byte) i3;
                        byte b4 = (byte) (b3 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ExpandableListView.getPackedPositionForGroup(i3) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i3) == 0L ? 0 : -1)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1270, 18 - Color.argb(i3, i3, i3, i3), 407021364, false, $$e(b3, b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i8++;
                    int i9 = $10 + 25;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i11 = $10 + 35;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i5];
        System.arraycopy(cArr2, i4, cArr4, 0, i5);
        if (bArr != null) {
            int i13 = $11 + 113;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                cArr = new char[i5];
                setvideostabilizationmode.b = 1;
                c = 1;
            } else {
                cArr = new char[i5];
                setvideostabilizationmode.b = 0;
                c = 0;
            }
            while (setvideostabilizationmode.b < i5) {
                if (bArr[setvideostabilizationmode.b] == b2) {
                    int i14 = setvideostabilizationmode.b;
                    char c2 = cArr4[setvideostabilizationmode.b];
                    try {
                        Object[] objArr3 = new Object[2];
                        objArr3[b2] = Integer.valueOf(c);
                        objArr3[0] = Integer.valueOf(c2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Color.blue(0), (ViewConfiguration.getLongPressTimeout() >> 16) + 3225, 12 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 2133916302, false, $$e(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i14] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i15 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = (byte) (b7 + 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.indexOf("", "", 0, 0) + 29944), 1755 - (ViewConfiguration.getEdgeSlop() >> 16), 23 - KeyEvent.normalizeMetaState(0), 387247676, false, $$e(b7, b8, (byte) (b8 - 2)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i15] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                }
                c = cArr[setvideostabilizationmode.b];
                Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b9 = (byte) 0;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.getOffsetAfter("", 0) + 41241), TextUtils.indexOf("", "", 0, 0) + 1705, 21 - (ViewConfiguration.getLongPressTimeout() >> 16), -1434471773, false, $$e(b9, (byte) (b9 | 6), b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                b2 = 1;
            }
            cArr4 = cArr;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            i = 0;
            System.arraycopy(cArr4, 0, cArr5, 0, i5);
            int i16 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr4, i16, i7);
            System.arraycopy(cArr5, i7, cArr4, 0, i16);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i5];
            setvideostabilizationmode.b = i;
            while (setvideostabilizationmode.b < i5) {
                cArr6[setvideostabilizationmode.b] = cArr4[(i5 - setvideostabilizationmode.b) - 1];
                setvideostabilizationmode.b++;
                int i17 = $11 + 63;
                $10 = i17 % 128;
                if (i17 % 2 != 0) {
                    int i18 = 5 / 3;
                }
            }
            cArr4 = cArr6;
        }
        if (i6 > 0) {
            int i19 = $10 + 53;
            $11 = i19 % 128;
            int i20 = i19 % 2;
            int i21 = 0;
            while (true) {
                setvideostabilizationmode.b = i21;
                if (setvideostabilizationmode.b >= i5) {
                    break;
                }
                cArr4[setvideostabilizationmode.b] = (char) (cArr4[setvideostabilizationmode.b] - iArr[2]);
                i21 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Type inference failed for: r1v66, types: [boolean, int] */
    @Override // java.util.Map
    public final boolean containsKey(Object obj) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cBlue = (char) (29944 - Color.blue(0));
            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 1755;
            int i2 = 24 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(bArr[7], bArr[0], bArr[28], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cBlue, iCombineMeasuredStates, i2, 986134021, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new int[]{0, 22, 0, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new int[]{22, 15, 95, 0}, false, new byte[]{0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char maxKeyCode = (char) (29944 - (KeyEvent.getMaxKeyCode() >> 16));
            int iAxisFromString = 1754 - MotionEvent.axisFromString("");
            int trimmedLength = 23 - TextUtils.getTrimmedLength("");
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr5 = new Object[1];
            a(b3, (byte) (b3 | 52), b2, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maxKeyCode, iAxisFromString, trimmedLength, 1596667560, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf = (char) (TextUtils.indexOf("", "") + 29944);
                int i3 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1755;
                int iRed = 23 - Color.red(0);
                byte b4 = $$a[7];
                byte b5 = b4;
                Object[] objArr6 = new Object[1];
                a(b4, b5, b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, i3, iRed, 1599039318, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[1], (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = ~iIdentityHashCode;
            int i5 = (~((-486251438) | i4)) | 212865676;
            int i6 = ~(iIdentityHashCode | (-263251));
            int i7 = (-303010623) + ((i5 | i6) * (-502)) + ((i6 | (~(i4 | (-273385762)))) * TypedValues.PositionType.TYPE_DRAWPATH) + 2034642473;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[3])[0] = i9 ^ (i9 << 5);
            int i10 = b + 5;
            TuitionPaymentFragmentbindingInflater1 = i10 % 128;
            int i11 = i10 % 2;
        } else {
            Object[] objArr8 = new Object[1];
            c(new int[]{37, 16, 0, 1}, false, new byte[]{1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new int[]{53, 16, 0, 14}, true, new byte[]{1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1}, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {673135215};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 42048), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1726, 29 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = EncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), 2034642473, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cMyPid = (char) ((Process.myPid() >> 22) + 29944);
                    int i12 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1754;
                    int i13 = 24 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    byte b6 = $$a[7];
                    byte b7 = b6;
                    Object[] objArr11 = new Object[1];
                    a(b6, b7, b7, objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMyPid, i12, i13, 1599039318, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113);
                try {
                    Object[] objArr12 = new Object[1];
                    c(new int[]{0, 22, 0, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr12);
                    Class<?> cls3 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    c(new int[]{22, 15, 95, 0}, false, new byte[]{0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr13);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c = (char) (29945 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                        int offsetBefore = TextUtils.getOffsetBefore("", 0) + 1755;
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 23;
                        byte b8 = $$a[7];
                        byte b9 = b8;
                        Object[] objArr14 = new Object[1];
                        a(b9, (byte) (b9 | 52), b8, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, offsetBefore, keyRepeatDelay, 1596667560, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 29944);
                        int i14 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1755;
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 24;
                        byte[] bArr2 = $$a;
                        Object[] objArr15 = new Object[1];
                        a(bArr2[7], bArr2[0], bArr2[28], objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(deadChar, i14, iIndexOf, 986134021, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                    objArr = objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113;
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
        }
        int i15 = ((int[]) objArr[1])[0];
        int i16 = ((int[]) objArr[0])[0];
        if (i16 != i15) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i17 = b + 85;
                TuitionPaymentFragmentbindingInflater1 = i17 % 128;
                int i18 = i17 % 2 != 0 ? 0 : 1;
                while (i18 < strArr.length) {
                    int i19 = TuitionPaymentFragmentbindingInflater1 + 107;
                    b = i19 % 128;
                    if (i19 % 2 != 0) {
                        arrayList.add(strArr[i18]);
                        i18 += 51;
                    } else {
                        arrayList.add(strArr[i18]);
                        i18++;
                    }
                }
            }
            throw new RuntimeException(String.valueOf(i16));
        }
        int i20 = b + 39;
        TuitionPaymentFragmentbindingInflater1 = i20 % 128;
        int i21 = i20 % 2;
        int i22 = ((int[]) objArr[3])[0];
        Object[] objArr16 = {new int[]{((int[]) objArr[0])[0]}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i23 = (~(89724335 | iIdentityHashCode2)) | 302260800;
        int i24 = ~iIdentityHashCode2;
        int i25 = i22 + 1251061285 + ((i23 | (~((-89658375) | i24))) * 886) + (((~(i24 | (-89724336))) | 302326761) * (-1772)) + ((~(i24 | 302326761)) * 886);
        int i26 = (i25 << 13) ^ i25;
        int i27 = i26 ^ (i26 >>> 17);
        ((int[]) objArr16[3])[0] = i27 ^ (i27 << 5);
        if (get(obj) != null) {
            return true;
        }
        int i28 = ((int[]) objArr16[3])[0];
        int i29 = i28 * i28;
        int i30 = -(718057128 * i28);
        int i31 = (i29 & i30) + (i29 | i30);
        int i32 = -(i28 * (-880865734));
        int i33 = (i31 & i32) + (i32 | i31);
        int i34 = (i33 ^ (-1544409631)) + (((-1544409631) & i33) << 1);
        int i35 = i34 >> 17;
        int i36 = (((i35 | (-65535)) << 1) - (i35 ^ (-65535))) / 32768;
        int i37 = ((i36 | 1) << 1) - (i36 ^ 1);
        int i38 = (i34 ^ i37) + ((i37 & i34) << 1);
        int i39 = ((i34 >> 26) + ComposerKt.defaultsKey) / 64;
        int i40 = -(i38 ^ (((i39 | 1) << 1) - (i39 ^ 1)));
        int i41 = (i40 ^ 8) + ((i40 & 8) << 1);
        int i42 = ((i41 >> 21) - 4095) / 2048;
        int i43 = (i42 ^ 1) + ((i42 & 1) << 1);
        ?? r1 = 0 / (((-(((i43 | 1) << 1) - (i43 ^ 1))) & i41) * InputDeviceCompat.SOURCE_DPAD);
        int i44 = b + 83;
        TuitionPaymentFragmentbindingInflater1 = i44 % 128;
        if (i44 % 2 == 0) {
            int i45 = 4 / 0;
        }
        return r1;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 59;
        b = i2 % 128;
        int i3 = i2 % 2;
        boolean zContains = zzb().contains(obj);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 99;
        b = i4 % 128;
        int i5 = i4 % 2;
        return zContains;
    }

    @Override // java.util.Map
    public final /* synthetic */ Set entrySet() {
        int i = 2 % 2;
        int i2 = b + 5;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        zzs zzsVarZzf = zzf();
        if (i3 == 0) {
            int i4 = 28 / 0;
        }
        return zzsVarZzf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r4 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (r4 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        r5 = com.google.android.gms.internal.mlkit_vision_common.zzr.TuitionPaymentFragmentbindingInflater1 + 39;
        com.google.android.gms.internal.mlkit_vision_common.zzr.b = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        return r4;
     */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getOrDefault(java.lang.Object r4, java.lang.Object r5) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.gms.internal.mlkit_vision_common.zzr.b
            int r1 = r1 + 89
            int r2 = r1 % 128
            com.google.android.gms.internal.mlkit_vision_common.zzr.TuitionPaymentFragmentbindingInflater1 = r2
            int r1 = r1 % r0
            java.lang.Object r4 = r3.get(r4)
            if (r1 != 0) goto L19
            r1 = 47
            int r1 = r1 / 0
            if (r4 == 0) goto L25
            goto L1b
        L19:
            if (r4 == 0) goto L25
        L1b:
            int r5 = com.google.android.gms.internal.mlkit_vision_common.zzr.TuitionPaymentFragmentbindingInflater1
            int r5 = r5 + 39
            int r1 = r5 % 128
            com.google.android.gms.internal.mlkit_vision_common.zzr.b = r1
            int r5 = r5 % r0
            return r4
        L25:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_common.zzr.getOrDefault(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i = 2 % 2;
        int i2 = b + 71;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        int iZza = zzaa.zza(zzf());
        int i4 = b + 73;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 11 / 0;
        }
        return iZza;
    }

    @Override // java.util.Map
    public final /* synthetic */ Set keySet() {
        int i = 2 % 2;
        int i2 = b + 103;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        zzs zzsVarZze = this.zzb;
        if (zzsVarZze == null) {
            zzsVarZze = zze();
            this.zzb = zzsVarZze;
        }
        int i4 = b + 117;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            return zzsVarZze;
        }
        throw null;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        int i = 2 % 2;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        int i = 2 % 2;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        int i = 2 % 2;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final /* synthetic */ Collection values() {
        int i = 2 % 2;
        int i2 = b + 99;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        zzl zzlVarZzb = zzb();
        if (i3 == 0) {
            int i4 = 59 / 0;
        }
        return zzlVarZzb;
    }

    public final zzl zzb() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 17;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        zzl zzlVarZza = this.zzc;
        if (zzlVarZza == null) {
            zzlVarZza = zza();
            this.zzc = zzlVarZza;
        }
        int i3 = b + 3;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        return zzlVarZza;
    }

    public final zzs zzf() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 17;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 == 0) {
            zzs zzsVar = this.zza;
            int i4 = 37 / 0;
            if (zzsVar != null) {
                return zzsVar;
            }
        } else {
            zzs zzsVar2 = this.zza;
            if (zzsVar2 != null) {
                return zzsVar2;
            }
        }
        int i5 = i2 + 115;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        zzs zzsVarZzd = zzd();
        this.zza = zzsVarZzd;
        return zzsVarZzd;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 17;
        int i4 = i3 % 128;
        TuitionPaymentFragmentbindingInflater1 = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 39;
            b = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        int i8 = i2 + 87;
        TuitionPaymentFragmentbindingInflater1 = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        if (r1.hasNext() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
    
        r6 = (java.util.Map.Entry) r1.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        if ((!r5) == true) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        r5 = com.google.android.gms.internal.mlkit_vision_common.zzr.TuitionPaymentFragmentbindingInflater1 + 99;
        com.google.android.gms.internal.mlkit_vision_common.zzr.b = r5 % 128;
        r5 = r5 % 2;
        r3.append(", ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
    
        r3.append(r6.getKey());
        r3.append('=');
        r3.append(r6.getValue());
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007b, code lost:
    
        r3.append('}');
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0084, code lost:
    
        return r3.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0098, code lost:
    
        throw new java.lang.IllegalArgumentException("size cannot be negative but was: " + r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r1 >= 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r1 >= 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r3 = new java.lang.StringBuilder((int) java.lang.Math.min(((long) r1) * 8, 1073741824L));
        r3.append('{');
        r1 = entrySet().iterator();
        r4 = com.google.android.gms.internal.mlkit_vision_common.zzr.b + 43;
        com.google.android.gms.internal.mlkit_vision_common.zzr.TuitionPaymentFragmentbindingInflater1 = r4 % 128;
        r4 = r4 % 2;
        r5 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.gms.internal.mlkit_vision_common.zzr.b
            int r1 = r1 + 99
            int r2 = r1 % 128
            com.google.android.gms.internal.mlkit_vision_common.zzr.TuitionPaymentFragmentbindingInflater1 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L19
            int r1 = r8.size()
            r3 = 86
            int r3 = r3 / r2
            if (r1 < 0) goto L85
            goto L1f
        L19:
            int r1 = r8.size()
            if (r1 < 0) goto L85
        L1f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            long r4 = (long) r1
            r6 = 8
            long r4 = r4 * r6
            r6 = 1073741824(0x40000000, double:5.304989477E-315)
            long r4 = java.lang.Math.min(r4, r6)
            int r1 = (int) r4
            r3.<init>(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r3.append(r1)
            java.util.Set r1 = r8.entrySet()
            java.util.Iterator r1 = r1.iterator()
            int r4 = com.google.android.gms.internal.mlkit_vision_common.zzr.b
            int r4 = r4 + 43
            int r5 = r4 % 128
            com.google.android.gms.internal.mlkit_vision_common.zzr.TuitionPaymentFragmentbindingInflater1 = r5
            int r4 = r4 % r0
            r4 = 1
            r5 = r4
        L48:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L7b
            java.lang.Object r6 = r1.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            r5 = r5 ^ r4
            if (r5 == r4) goto L58
            goto L66
        L58:
            int r5 = com.google.android.gms.internal.mlkit_vision_common.zzr.TuitionPaymentFragmentbindingInflater1
            int r5 = r5 + 99
            int r7 = r5 % 128
            com.google.android.gms.internal.mlkit_vision_common.zzr.b = r7
            int r5 = r5 % r0
            java.lang.String r5 = ", "
            r3.append(r5)
        L66:
            java.lang.Object r5 = r6.getKey()
            r3.append(r5)
            r5 = 61
            r3.append(r5)
            java.lang.Object r5 = r6.getValue()
            r3.append(r5)
            r5 = r2
            goto L48
        L7b:
            r0 = 125(0x7d, float:1.75E-43)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            return r0
        L85:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "size cannot be negative but was: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_common.zzr.toString():java.lang.String");
    }

    zzr() {
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 107;
        b = i2 % 128;
        int i3 = i2 % 2;
        if (size() == 0) {
            int i4 = TuitionPaymentFragmentbindingInflater1 + 41;
            b = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = TuitionPaymentFragmentbindingInflater1 + 121;
        b = i6 % 128;
        int i7 = i6 % 2;
        return false;
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
    private static java.lang.String $$e(int r6, byte r7, int r8) {
        /*
            int r7 = r7 + 99
            int r8 = r8 * 4
            int r8 = 1 - r8
            int r6 = r6 * 3
            int r6 = 3 - r6
            byte[] r0 = com.google.android.gms.internal.mlkit_vision_common.zzr.$$c
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r7 = r8
            r4 = r2
            goto L27
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            int r6 = r6 + 1
            r3 = r0[r6]
        L27:
            int r7 = r7 + r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_common.zzr.$$e(int, byte, int):java.lang.String");
    }
}
