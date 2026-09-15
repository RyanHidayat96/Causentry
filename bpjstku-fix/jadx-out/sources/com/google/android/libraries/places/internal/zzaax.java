package com.google.android.libraries.places.internal;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import defpackage.abortCapture;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzaax implements zzbak {
    private static int TuitionPaymentFragmentbindingInflater1;
    private static long b;
    static final zzbak zza;
    private static final byte[] $$c = {30, 17, -35, 104};
    private static final int $$d = 210;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {12, -88, 33, 118, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 207;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.google.android.libraries.places.internal.zzaax.$$a
            int r7 = 53 - r7
            int r8 = r8 * 14
            int r8 = 98 - r8
            int r9 = r9 * 52
            int r9 = 55 - r9
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r8 = r7
            r3 = r9
            r5 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            int r9 = r9 + 1
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L27
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
            int r9 = -r9
            int r8 = r8 + r9
            int r8 = r8 + (-11)
            r9 = r3
            r3 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzaax.a(int, short, short, java.lang.Object[]):void");
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(b ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        while (true) {
            obj = null;
            if (abortcapture.b >= cArrB.length) {
                break;
            }
            int i3 = $10 + 109;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i5 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(b)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0) + 64839), 1356 - (Process.myPid() >> 22), TextUtils.getOffsetBefore("", 0) + 38, 894276454, false, $$e(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {abortcapture, abortcapture};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 47773), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 467, 13 - TextUtils.getOffsetBefore("", 0), 896083767, false, "n", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
        int i6 = $10 + 25;
        $11 = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzbak
    public final boolean zza(int i) throws Throwable {
        Object[] objArr;
        char c;
        int i2 = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c2 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 652;
            int defaultSize = View.getDefaultSize(0, 0) + 44;
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            byte b3 = bArr[5];
            Object[] objArr2 = new Object[1];
            a(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, packedPositionChild, defaultSize, -459846511, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{38888, 38793, 2173, 16267, 42288, 63218, 49709, 23009, 27651, 3326, 15119, 41448, 24719, 872, 14025, 43545, 25885, 2028, 12823, 46763, 31125, 6720, 10643, 45885, 32287, 7916}, -TextUtils.indexOf((CharSequence) "", '0'), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{63258, 63359, 32172, 32309, 13551, 33569, 33686, 51260, 3309, 31009, 31412, 12361, 'w', 30377, 30512, 15331, 1535, 29217, 29629}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
            int i3 = 652 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            int iRgb = Color.rgb(0, 0, 0) + 16777260;
            byte b4 = $$a[7];
            Object[] objArr5 = new Object[1];
            a((byte) 52, b4, b4, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, i3, iRgb, -873460649, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cGreen = (char) Color.green(0);
                int i6 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 650;
                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 44;
                byte b5 = (byte) ($$b & 63);
                byte[] bArr2 = $$a;
                Object[] objArr6 = new Object[1];
                a(b5, bArr2[5], bArr2[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cGreen, i6, maximumDrawingCacheSize, -1595579076, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[]{i ^ (i << 5)}};
            int i7 = ((int[]) objArr7[2])[0];
            int i8 = ((int[]) objArr7[0])[0];
            int i9 = (((((~(149470479 | i)) | (-32877479)) * 262) - 410057811) + (((~(149470479 | (~i))) | (-32877479)) * 262)) - 1882618074;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            c = 2;
        } else {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), 1610 - TextUtils.getOffsetBefore("", 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 26, 2145681644, false, null, new Class[0]);
                }
                Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), -1882618074, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c3 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                    int i12 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 650;
                    int i13 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 44;
                    byte b6 = $$a[7];
                    Object[] objArr9 = new Object[1];
                    a((byte) 52, b6, b6, objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c3, i12, i13, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((Process.getThreadPriority(0) + 20) >> 6), ((byte) KeyEvent.getModifierMetaStateMask()) + 696, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 98), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63406 - (ViewConfiguration.getTouchSlop() >> 8)), (Process.myPid() >> 22) + 793, View.MeasureSpec.getSize(0) + 83), Integer.TYPE, Integer.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char packedPositionChild2 = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                    int iGreen = 651 - Color.green(0);
                    int minimumFlingVelocity = 44 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    byte b7 = (byte) ($$b & 63);
                    byte[] bArr3 = $$a;
                    Object[] objArr10 = new Object[1];
                    a(b7, bArr3[5], bArr3[7], objArr10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionChild2, iGreen, minimumFlingVelocity, -1595579076, false, (String) objArr10[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr11 = new Object[1];
                    c(new char[]{38888, 38793, 2173, 16267, 42288, 63218, 49709, 23009, 27651, 3326, 15119, 41448, 24719, 872, 14025, 43545, 25885, 2028, 12823, 46763, 31125, 6720, 10643, 45885, 32287, 7916}, 1 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr11);
                    Class<?> cls2 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    c(new char[]{63258, 63359, 32172, 32309, 13551, 33569, 33686, 51260, 3309, 31009, 31412, 12361, 'w', 30377, 30512, 15331, 1535, 29217, 29629}, TextUtils.indexOf("", "", 0) + 1, objArr12);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1);
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 651;
                        int tapTimeout = 44 - (ViewConfiguration.getTapTimeout() >> 16);
                        byte b8 = $$a[7];
                        Object[] objArr13 = new Object[1];
                        a((byte) 52, b8, b8, objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf2, iKeyCodeFromString, tapTimeout, -873460649, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cIndexOf3 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                        int capsMode = 651 - TextUtils.getCapsMode("", 0, 0);
                        int iLastIndexOf = 43 - TextUtils.lastIndexOf("", '0');
                        byte[] bArr4 = $$a;
                        byte b9 = bArr4[7];
                        byte b10 = bArr4[5];
                        Object[] objArr14 = new Object[1];
                        a(b9, b10, b10, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cIndexOf3, capsMode, iLastIndexOf, -459846511, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 15;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
                    c = 2;
                    int i15 = i14 % 2;
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
        if (((int[]) objArr[c])[0] != ((int[]) objArr[0])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[1];
            if (strArr == null) {
                throw null;
            }
            int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i16 % 128;
            int i17 = i16 % 2;
            for (String str : strArr) {
                arrayList.add(str);
            }
            throw null;
        }
        Object[] objArr15 = new Object[4];
        objArr15[0] = new int[]{i};
        objArr15[c] = new int[]{i};
        objArr15[3] = new int[1];
        int i18 = ((int[]) objArr[3])[0];
        int i19 = ((int[]) objArr[c])[0];
        int i20 = ((int[]) objArr[0])[0];
        objArr15[1] = new String[0];
        int i21 = ~Process.myTid();
        int i22 = i18 + (((~((-268501955) | i21)) | 268501442) * (-241)) + 29743478 + (((~(i21 | (-513))) | (-533572587)) * 241);
        int i23 = (i22 << 13) ^ i22;
        int i24 = i23 ^ (i23 >>> 17);
        Object obj = objArr15[3];
        ((int[]) obj)[0] = i24 ^ (i24 << 5);
        if (i != 0) {
            int i25 = ((int[]) obj)[0];
            int i26 = i25 * i25;
            int i27 = -(467485699 * i25);
            int i28 = (i26 & i27) + (i26 | i27);
            int i29 = -(i25 * (-371624597));
            int i30 = ((i28 & i29) + (i29 | i28)) - 1632761135;
            int i31 = i30 >> 22;
            int i32 = ((i31 & (-2047)) + (i31 | (-2047))) / 1024;
            int i33 = (i30 - (~((i32 ^ 1) + ((i32 & 1) << 1)))) - 1;
            int i34 = i30 >> 29;
            int i35 = ((i34 & (-15)) + (i34 | (-15))) / 8;
            int i36 = -(i33 ^ ((i35 ^ 1) + ((i35 & 1) << 1)));
            int i37 = (i36 ^ 7) + ((i36 & 7) << 1);
            int i38 = i37 >> 28;
            int i39 = ((i38 & (-31)) + (i38 | (-31))) / 16;
            int i40 = ((i39 | 1) << 1) - (i39 ^ 1);
            if (i != 3227 / (((-(((i40 | 1) << 1) - (i40 ^ 1))) & i37) * 461) && i != 2) {
                int i41 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 85;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i41 % 128;
                if (i41 % 2 != 0 ? i != 3 : i != 4) {
                    if (i != 4 && i != 5) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    static {
        TuitionPaymentFragmentbindingInflater1 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        zza = new zzaax();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 9;
        TuitionPaymentFragmentbindingInflater1 = i % 128;
        int i2 = i % 2;
    }

    private zzaax() {
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        b = 7422252425313260679L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(int r7, byte r8, int r9) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 107
            int r9 = r9 * 2
            int r9 = r9 + 4
            byte[] r0 = com.google.android.libraries.places.internal.zzaax.$$c
            int r8 = r8 * 3
            int r8 = r8 + 1
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r9
            r4 = r2
            r9 = r8
            goto L2b
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r7 = -r7
            int r7 = r7 + r9
            int r9 = r3 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzaax.$$e(int, byte, int):java.lang.String");
    }
}
