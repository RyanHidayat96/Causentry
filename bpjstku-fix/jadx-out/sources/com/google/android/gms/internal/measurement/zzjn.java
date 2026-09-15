package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import defpackage.CameraStateRegistryCameraRegistrationExternalSyntheticLambda0;
import defpackage.initSession;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes6.dex */
final class zzjn extends zzkh {
    private final Context zza;
    private final CameraStateRegistryCameraRegistrationExternalSyntheticLambda0 zzb;
    private static final byte[] $$c = {102, -96, -78, -55};
    private static final int $$f = 207;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {25, -93, -120, -48, 5, -18, 5, -8, -3, -10, -25, 13, -4, -24, -5, 9, 15, -40, 7, 28, -36, -21, -10, -7, -3, 7, 46, -54, -19, 4, -20, -3, 0, -1, -26, 15, -4, -18, 2, -19, 11, -8, -4, -18, 2, -19, 11, 41, -61, -11, -12, 9, -19, -2, 7, -17, 35, -36, -18, 2, -19, 11, 41, -23, -36, -21, -10, -7, -3, 7, 15, -31, -13, 5, -13, -3, -11, 3, 15, -31, -13, 5, -13, -3, -11, 3, 59, -54, -39, 6, -17, 5, -12, -5, 24, -23, -30, 6, 2, -15, -12, 40, -50, 11, -12, -12, 2, -15, -12, 12, -13, -11, 4, -11, -11, 1, 24, -43, 2, -12, 5, -25, 9, -19, 59, -39, 6, -17, 5, -12, -5, 24, -23, -30, 6, 2, -15, -12, 40, -50, 11, -12, -12, 2, -15, -12, -5, -3, 5, -4, -12, 2, -17, -3, -11, -4, -3, -11, 3, -5, -24, 7, -2, -24, 36, -40, 5, -7, -13, 2, -7, -7, -1, -26, 3, -14, Base64.padSymbol};
    private static final int $$e = 182;
    private static final byte[] $$a = {58, -51, 54, -115, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 213;
    private static int b = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -83722259;

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 52
            int r8 = 107 - r8
            int r7 = r7 * 2
            int r7 = r7 + 84
            byte[] r0 = com.google.android.gms.internal.measurement.zzjn.$$a
            int r6 = r6 * 15
            int r1 = 53 - r6
            byte[] r1 = new byte[r1]
            int r6 = 52 - r6
            r2 = 0
            if (r0 != 0) goto L19
            r7 = r6
            r3 = r8
            r4 = r2
            goto L30
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            int r8 = r8 + 1
            r3 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L30:
            int r8 = -r8
            int r7 = r7 + r8
            int r7 = r7 + (-11)
            r8 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzjn.a(int, short, short, java.lang.Object[]):void");
    }

    private static void d(int i, short s, short s2, Object[] objArr) {
        byte[] bArr = $$d;
        int i2 = s2 * 69;
        int i3 = (s * 121) + 4;
        int i4 = (i * 24) + 84;
        byte[] bArr2 = new byte[i2 + 53];
        int i5 = i2 + 52;
        int i6 = -1;
        if (bArr == null) {
            i4 = (i5 + (-i3)) - 6;
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
            i4 = (i4 + (-bArr[i3])) - 6;
            i3 = i8 + 1;
            i6 = i7;
        }
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = b + 15;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            this.zza.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode2 = this.zza.hashCode();
        CameraStateRegistryCameraRegistrationExternalSyntheticLambda0 cameraStateRegistryCameraRegistrationExternalSyntheticLambda0 = this.zzb;
        if (cameraStateRegistryCameraRegistrationExternalSyntheticLambda0 == null) {
            int i3 = TuitionPaymentFragmentbindingInflater1 + 15;
            b = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = cameraStateRegistryCameraRegistrationExternalSyntheticLambda0.hashCode();
        }
        return iHashCode ^ ((iHashCode2 ^ 1000003) * 1000003);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 83;
        int i4 = i3 % 128;
        b = i4;
        int i5 = i3 % 2;
        if (obj == this) {
            int i6 = i2 + 51;
            b = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (!(obj instanceof zzkh)) {
            return false;
        }
        int i8 = i4 + 83;
        TuitionPaymentFragmentbindingInflater1 = i8 % 128;
        if (i8 % 2 == 0) {
            this.zza.equals(((zzkh) obj).zza());
            throw null;
        }
        zzkh zzkhVar = (zzkh) obj;
        if (!this.zza.equals(zzkhVar.zza())) {
            return false;
        }
        CameraStateRegistryCameraRegistrationExternalSyntheticLambda0 cameraStateRegistryCameraRegistrationExternalSyntheticLambda0 = this.zzb;
        if (cameraStateRegistryCameraRegistrationExternalSyntheticLambda0 == null) {
            int i9 = b + 31;
            TuitionPaymentFragmentbindingInflater1 = i9 % 128;
            int i10 = i9 % 2;
            if (zzkhVar.zzb() != null) {
                return false;
            }
        } else if (!cameraStateRegistryCameraRegistrationExternalSyntheticLambda0.equals(zzkhVar.zzb())) {
            return false;
        }
        return true;
    }

    private static void c(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i4 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr3 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
            int i5 = $10 + 63;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i7 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i7]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.getOffsetBefore("", 0), 3291 - (KeyEvent.getMaxKeyCode() >> 16), 30 - TextUtils.lastIndexOf("", '0'), 1199271174, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 651;
                    int iLastIndexOf = 43 - TextUtils.lastIndexOf("", '0');
                    byte b4 = (byte) ($$f & 1);
                    byte b5 = (byte) (b4 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, minimumFlingVelocity, iLastIndexOf, -450685997, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
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
        if (i3 > 0) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr4 = new char[i2];
            System.arraycopy(cArr3, 0, cArr4, 0, i2);
            System.arraycopy(cArr4, 0, cArr3, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr4, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr3, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            int i8 = $10 + 53;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            } else {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            }
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                try {
                    Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int iMyTid = 651 - (Process.myTid() >> 22);
                        int iIndexOf = TextUtils.indexOf("", "") + 44;
                        byte b6 = (byte) ($$f & 1);
                        byte b7 = (byte) (b6 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maximumFlingVelocity, iMyTid, iIndexOf, -450685997, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr3 = cArr2;
        }
        objArr[0] = new String(cArr3);
        int i9 = $11 + 13;
        $10 = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
    }

    public final String toString() throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (43041 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
            int iResolveSize = 3111 - View.resolveSize(0, 0);
            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 22;
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr3 = new Object[1];
            a(b2, b2, bArr[40], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iResolveSize, iResolveOpacity, -1272852037, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(false, Color.green(0) + 242, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, (ViewConfiguration.getTapTimeout() >> 16) + 4, new char[]{'\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(false, TextUtils.lastIndexOf("", '0') + 247, TextUtils.getOffsetAfter("", 0) + 15, 7 - (ViewConfiguration.getPressedStateDuration() >> 16), new char[]{65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c2 = (char) (43042 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
            int i2 = 3112 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int iIndexOf = 21 - TextUtils.indexOf((CharSequence) "", '0');
            byte[] bArr2 = $$a;
            byte b3 = bArr2[7];
            Object[] objArr6 = new Object[1];
            a(b3, b3, bArr2[5], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, i2, iIndexOf, -1269618118, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = TuitionPaymentFragmentbindingInflater1 + 49;
            b = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c3 = (char) (43042 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                int edgeSlop = 3111 - (ViewConfiguration.getEdgeSlop() >> 16);
                int i5 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 21;
                byte[] bArr3 = $$a;
                byte b4 = bArr3[5];
                byte b5 = bArr3[7];
                Object[] objArr7 = new Object[1];
                a(b4, b5, b5, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c3, edgeSlop, i5, 154975793, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i6 = ((int[]) objArr8[2])[0];
            int i7 = ((int[]) objArr8[1])[0];
            String[] strArr = (String[]) objArr8[3];
            int[] iArr = {i7};
            int iMyTid = Process.myTid();
            int i8 = ~iMyTid;
            int i9 = (-1984962272) + (((~((-1439820378) | i8)) | 265211081) * 226) + (((~(i8 | (-1343300113))) | (~((-265211082) | iMyTid)) | 168690816) * (-113)) + ((~(iMyTid | (-1439820378))) * 113) + 1908488441;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[0])[0] = i11 ^ (i11 << 5);
            objArr = new Object[]{new int[1], iArr, new int[]{i6}, strArr};
            int i12 = TuitionPaymentFragmentbindingInflater1 + 19;
            b = i12 % 128;
            int i13 = i12 % 2;
        } else {
            Object[] objArr9 = new Object[1];
            c(true, TextUtils.indexOf((CharSequence) "", '0', 0) + 242, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16, TextUtils.getOffsetAfter("", 0) + 13, new char[]{17, 23, 65521, 65484, 5, '\f', 65535, '\n', 65484, 65535, 20, 65535, '\b', 11, 3, 18}, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            c(false, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 245, 15 - TextUtils.indexOf((CharSequence) "", '0'), 14 - ExpandableListView.getPackedPositionChild(0L), new char[]{65534, 65535, '\b', 14, 3, 14, 19, 65506, 65531, '\r', 2, 65501, '\t', 65534, 65535, 3}, objArr10);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue();
            int i14 = TuitionPaymentFragmentbindingInflater1 + 1;
            b = i14 % 128;
            int i15 = i14 % 2;
            try {
                Object[] objArr11 = {null, Integer.valueOf(iIntValue), 0, 1908488441};
                byte[] bArr4 = $$d;
                byte b6 = bArr4[115];
                Object[] objArr12 = new Object[1];
                d(b6, bArr4[32], b6, objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                byte b7 = bArr4[32];
                Object[] objArr13 = new Object[1];
                d(b7, bArr4[115], b7, objArr13);
                Object[] objArr14 = (Object[]) cls3.getMethod((String) objArr13[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char gidForName = (char) (43041 - Process.getGidForName(""));
                    int minimumFlingVelocity = 3111 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    int tapTimeout = 22 - (ViewConfiguration.getTapTimeout() >> 16);
                    byte[] bArr5 = $$a;
                    byte b8 = bArr5[5];
                    byte b9 = bArr5[7];
                    Object[] objArr15 = new Object[1];
                    a(b8, b9, b9, objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(gidForName, minimumFlingVelocity, tapTimeout, 154975793, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr14);
                try {
                    Object[] objArr16 = new Object[1];
                    c(false, View.getDefaultSize(0, 0) + 242, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 22, TextUtils.getTrimmedLength("") + 4, new char[]{'\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504}, objArr16);
                    Class<?> cls4 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    c(false, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 246, TextUtils.getOffsetAfter("", 0) + 15, AndroidCharacter.getMirror('0') - ')', new char[]{65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515}, objArr17);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cIndexOf = (char) (43041 - TextUtils.indexOf((CharSequence) "", '0'));
                        int iRed = 3111 - Color.red(0);
                        int i16 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 22;
                        byte[] bArr6 = $$a;
                        byte b10 = bArr6[7];
                        Object[] objArr18 = new Object[1];
                        a(b10, b10, bArr6[5], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, iRed, i16, -1269618118, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c4 = (char) (43043 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                        int jumpTapTimeout = 3111 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int scrollDefaultDelay = 22 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        byte[] bArr7 = $$a;
                        byte b11 = bArr7[7];
                        Object[] objArr19 = new Object[1];
                        a(b11, b11, bArr7[40], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c4, jumpTapTimeout, scrollDefaultDelay, -1272852037, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr14;
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
        int i17 = ((int[]) objArr[1])[0];
        int i18 = ((int[]) objArr[2])[0];
        if (i18 == i17) {
            int i19 = ((int[]) objArr[0])[0];
            int i20 = ((int[]) objArr[2])[0];
            int i21 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[3];
            int[] iArr2 = {i21};
            int iIdentityHashCode = System.identityHashCode(this);
            int i22 = ~iIdentityHashCode;
            int i23 = i19 + 1881209546 + (((-1083442817) | iIdentityHashCode) * (-676)) + (((~(487319678 | i22)) | 1083442816) * 676) + (((~(iIdentityHashCode | 1570762494)) | (~(i22 | (-1217711781))) | 134268964) * 676);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr2[0])[0] = i25 ^ (i25 << 5);
            objArr2 = new Object[]{new int[1], iArr2, new int[]{i20}, strArr2};
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                int i26 = 0;
                while (i26 < strArr3.length) {
                    int i27 = b + 17;
                    TuitionPaymentFragmentbindingInflater1 = i27 % 128;
                    if (i27 % 2 == 0) {
                        arrayList.add(strArr3[i26]);
                        i26 += 21;
                    } else {
                        arrayList.add(strArr3[i26]);
                        i26++;
                    }
                }
            }
            int[] iArr3 = new int[i18];
            int i28 = i18 - 1;
            iArr3[i28] = 1;
            Toast.makeText((Context) null, iArr3[((i18 * i28) % 2) - 1], 1).show();
            int i29 = ((int[]) objArr[0])[0];
            int i30 = ((int[]) objArr[2])[0];
            int i31 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[3];
            int i32 = ~((int) Runtime.getRuntime().maxMemory());
            int i33 = i29 + 650528666 + (((-18482179) | i32) * 494) + (((~(i32 | 1011198688)) | (-354330275)) * 494);
            int i34 = (i33 << 13) ^ i33;
            int i35 = i34 ^ (i34 >>> 17);
            ((int[]) objArr2[0])[0] = i35 ^ (i35 << 5);
            objArr2 = new Object[]{new int[1], new int[]{i31}, new int[]{i30}, strArr4};
        }
        String string = this.zza.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.zzb);
        int length2 = length + 45 + String.valueOf(strValueOf).length();
        int i36 = ((int[]) objArr2[0])[0];
        int i37 = i36 * i36;
        int i38 = -(237896584 * i36);
        int i39 = (i37 ^ i38) + ((i37 & i38) << 1);
        int i40 = -(i36 * 1377836446);
        int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
        int i42 = ((i41 | 769438825) << 1) - (769438825 ^ i41);
        int i43 = i42 >> 26;
        int i44 = (((i43 | ComposerKt.defaultsKey) << 1) - (i43 ^ ComposerKt.defaultsKey)) / 64;
        int i45 = (i42 - (~((i44 ^ 1) + ((i44 & 1) << 1)))) - 1;
        int i46 = i42 >> 22;
        int i47 = (((i46 | (-2047)) << 1) - (i46 ^ (-2047))) / 1024;
        int i48 = (-(i45 ^ ((i47 & 1) + (i47 | 1)))) + 4;
        int i49 = i48 >> 24;
        int i50 = (((i49 | (-511)) << 1) - (i49 ^ (-511))) / 256;
        int i51 = (i50 ^ 1) + ((i50 & 1) << 1);
        StringBuilder sb = new StringBuilder(length2 + (6820 / ((i48 & (-((i51 & 1) + (i51 | 1)))) * 1705)));
        sb.append("FlagsContext{context=");
        sb.append(string);
        sb.append(", hermeticFileOverrides=");
        sb.append(strValueOf);
        sb.append("}");
        return sb.toString();
    }

    zzjn(Context context, CameraStateRegistryCameraRegistrationExternalSyntheticLambda0 cameraStateRegistryCameraRegistrationExternalSyntheticLambda0) {
        this.zza = context;
        this.zzb = cameraStateRegistryCameraRegistrationExternalSyntheticLambda0;
    }

    @Override // com.google.android.gms.internal.measurement.zzkh
    final Context zza() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 53;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        Context context = this.zza;
        int i5 = i3 + 65;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return context;
    }

    @Override // com.google.android.gms.internal.measurement.zzkh
    final CameraStateRegistryCameraRegistrationExternalSyntheticLambda0 zzb() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 109;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        CameraStateRegistryCameraRegistrationExternalSyntheticLambda0 cameraStateRegistryCameraRegistrationExternalSyntheticLambda0 = this.zzb;
        int i5 = i2 + 37;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return cameraStateRegistryCameraRegistrationExternalSyntheticLambda0;
    }

    private static String $$g(byte b2, int i, short s) {
        int i2 = s * 2;
        int i3 = 120 - b2;
        byte[] bArr = $$c;
        int i4 = 4 - (i * 3);
        byte[] bArr2 = new byte[i2 + 1];
        int i5 = -1;
        if (bArr == null) {
            i4++;
            i3 += i4;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i3;
            if (i6 == i2) {
                return new String(bArr2, 0);
            }
            byte b3 = bArr[i4];
            i4++;
            i3 = b3 + i3;
            i5 = i6;
        }
    }
}
