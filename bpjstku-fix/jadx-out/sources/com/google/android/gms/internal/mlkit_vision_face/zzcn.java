package com.google.android.gms.internal.mlkit_vision_face;

import android.content.Context;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.work.WorkInfo;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Set;
import kotlin.io.FileTreeWalk;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes6.dex */
public final class zzcn extends zzco {
    private static final byte[] $$c = {33, -59, 107, -108};
    private static final int $$d = 237;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {2, -84, 82, -15, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 20;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int g = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {47352, 47339, 47349, 47335, 47338, 47344, 47275, 47350, 47333, 47348, 47318, 47329, 47346, 47320, 47337, 47341, 47312, 47347, 47340, 47334, 47274, 47342, 47276, 47351, 47332, 47272};
    private static int TuitionPaymentFragmentbindingInflater1 = 2047719577;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
    private static boolean b = true;

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 14
            int r6 = 98 - r6
            int r0 = 53 - r8
            byte[] r1 = com.google.android.gms.internal.mlkit_vision_face.zzcn.$$a
            int r7 = 144 - r7
            byte[] r0 = new byte[r0]
            int r8 = 52 - r8
            r2 = 0
            if (r1 != 0) goto L15
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            int r7 = r7 + 1
            r4 = r1[r7]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r5
        L2c:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_face.zzcn.c(short, short, int, java.lang.Object[]):void");
    }

    public static int zza(int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
        g = i5 % 128;
        int i6 = i5 % 2;
        int iMin = Math.min(Math.max(i, i2), 1073741823);
        if (i6 == 0) {
            int i7 = 1 / 0;
        }
        return iMin;
    }

    private static void a(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        float f = 0.0f;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (31339 - View.getDefaultSize(0, 0)), (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)) + 2994, 17 - ((Process.getThreadPriority(0) + 20) >> 6), 1182129903, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr4[i3] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i3++;
                    f = 0.0f;
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
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.getDefaultSize(0, 0) + 43325), View.resolveSizeAndState(0, 0, 0) + 253, TextUtils.indexOf("", "") + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
        int i4 = 33601;
        int i5 = 1687675375;
        if (b) {
            int i6 = $11 + 41;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            } else {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            }
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr2[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (33601 - ((byte) KeyEvent.getModifierMetaStateMask())), 3084 - Process.getGidForName(""), 26 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -2146875848, false, $$e(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr2);
            return;
        }
        if (!TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                int i7 = $11 + 33;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i9 = $10 + 97;
        $11 = i9 % 128;
        int i10 = i9 % 2;
        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
            int i11 = $10 + 23;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 % 0) % getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] / i] << iIntValue);
                Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (i4 - TextUtils.lastIndexOf("", '0')), (ViewConfiguration.getWindowTouchSlop() >> 8) + 3085, 26 - View.MeasureSpec.makeMeasureSpec(0, 0), -2146875848, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            } else {
                cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                try {
                    Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (33602 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 3085 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getPressedStateDuration() >> 16) + 26, -2146875848, false, $$e(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            i4 = 33601;
            i5 = 1687675375;
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0322 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x030d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0313  */
    /* JADX WARN: Code duplicated, block: B:51:0x0328  */
    /* JADX WARN: Code duplicated, block: B:53:0x0338 A[Catch: Exception -> 0x05db, TRY_ENTER, TryCatch #2 {Exception -> 0x05db, blocks: (B:48:0x0322, B:53:0x0338, B:59:0x03b8, B:66:0x0408, B:68:0x0419, B:54:0x0343), top: B:109:0x0322 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0343 A[Catch: Exception -> 0x05db, TRY_LEAVE, TryCatch #2 {Exception -> 0x05db, blocks: (B:48:0x0322, B:53:0x0338, B:59:0x03b8, B:66:0x0408, B:68:0x0419, B:54:0x0343), top: B:109:0x0322 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x042f A[Catch: all -> 0x0516, TryCatch #3 {all -> 0x0516, blocks: (B:69:0x0422, B:71:0x042f, B:72:0x0469), top: B:111:0x0422, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0521 A[Catch: Exception -> 0x05dd, TRY_LEAVE, TryCatch #1 {Exception -> 0x05dd, blocks: (B:74:0x04e0, B:76:0x0517, B:78:0x051f, B:79:0x0520, B:80:0x0521, B:82:0x0542, B:87:0x05ca, B:91:0x05d3, B:93:0x05d9, B:94:0x05da, B:83:0x056e, B:85:0x057b, B:86:0x05c3, B:69:0x0422, B:71:0x042f, B:72:0x0469), top: B:108:0x0326, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x057b A[Catch: all -> 0x05d2, TryCatch #0 {all -> 0x05d2, blocks: (B:83:0x056e, B:85:0x057b, B:86:0x05c3), top: B:106:0x056e, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:96:0x05dd A[PHI: r27
  0x05dd: PHI (r27v4 ??) = (r27v3 ??), (r27v6 ??), (r27v7 ??) binds: [B:95:0x05db, B:105:0x05dd, B:88:0x05ce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r27v0, types: [android.content.Context, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r27v10 */
    /* JADX WARN: Type inference failed for: r27v11 */
    /* JADX WARN: Type inference failed for: r27v12 */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4 */
    /* JADX WARN: Type inference failed for: r27v5 */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v9 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v6 */
    public static Object[] b(Context context, int i, int i2, int i3) throws Throwable {
        int i4;
        int i5;
        ?? r27;
        int i6;
        ?? r28;
        String str;
        Object[] objArr;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i7;
        int mode;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        int i14;
        int i15;
        int i16 = 2 % 2;
        Object obj = null;
        if (context != 0) {
            int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
            g = i17 % 128;
            if (i17 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            try {
                int maximumFlingVelocity = ViewConfiguration.getMaximumFlingVelocity() >> 16;
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                int i18 = maximumFlingVelocity * (-103);
                int i19 = ((i18 | (-13081)) << 1) - (i18 ^ (-13081));
                int i20 = ~maximumFlingVelocity;
                int i21 = ~((i20 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i20 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
                int i22 = ~(((-128) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | ((-128) & iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                int i23 = ((i21 ^ i22) | (i21 & i22)) * 104;
                int i24 = (i19 & i23) + (i23 | i19);
                int i25 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i26 = (i25 & maximumFlingVelocity) | (i25 ^ maximumFlingVelocity);
                int i27 = -(-((~((i26 & 127) | (i26 ^ 127))) * (-104)));
                int i28 = (i24 & i27) + (i27 | i24);
                int i29 = -(-(((maximumFlingVelocity & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (maximumFlingVelocity ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3)) * 104));
                Object[] objArr2 = new Object[1];
                a(null, null, (i28 & i29) + (i29 | i28), new byte[]{-119, -116, -118, -119, -126, -123, -117, -121, -119, -126, -118, -119, -126, -123, -120, -121, -125, -122, -123, -124, -125, -126, -127}, objArr2);
                Class<?> cls = Class.forName((String) objArr2[0]);
                int i30 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                int i31 = i30 * (-589);
                int i32 = (i31 & 75057) + (i31 | 75057);
                int i33 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                int i34 = (~(((-128) & i33) | ((-128) ^ i33))) | (~((-128) | i30));
                int i35 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                int i36 = (~((i35 ^ i30) | (i35 & i30))) | i34;
                int i37 = ~i30;
                int i38 = ~(iTuitionPaymentFragmentspecialinlinedviewModeldefault4 | (i37 ^ 127) | (i37 & 127));
                int i39 = i32 + (((i36 & i38) | (i36 ^ i38)) * 590);
                int i40 = ~(((-128) ^ i33) | ((-128) & i33));
                int i41 = ~(((-128) ^ i30) | ((-128) & i30));
                int i42 = (i40 & i41) | (i40 ^ i41);
                int i43 = ~((i35 ^ i30) | (i35 & i30));
                int i44 = (i39 - (~(((i42 & i43) | (i42 ^ i43)) * (-1180)))) - 1;
                int i45 = ~((~i30) | i33);
                int i46 = g;
                int i47 = (i46 ^ 123) + ((i46 & 123) << 1);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i47 % 128;
                int i48 = i47 % 2;
                int i49 = -(-(590 * (i45 | (~((i33 ^ 127) | (i33 & 127))))));
                Object[] objArr3 = new Object[1];
                a(null, null, ((i44 | i49) << 1) - (i44 ^ i49), new byte[]{-123, -110, -126, -111, -126, -123, -122, -119, -127, -120, -122, -112, -113, -113, -114, -119, -118, -115}, objArr3);
                Object objInvoke = cls.getMethod((String) objArr3[0], null).invoke(context, null);
                int i50 = -View.combineMeasuredStates(0, 0);
                Object[] objArr4 = new Object[1];
                a(null, null, (i50 ^ 127) + ((i50 & 127) << 1), new byte[]{-123, -110, -126, -111, -126, -123, -122, -119, -127, -120, -122, -112, -113, -113, -114, -121, -109, -113, -121, -119, -126, -118, -119, -126, -123, -120, -121, -125, -122, -123, -124, -125, -126, -127}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                int i51 = -TextUtils.lastIndexOf("", '0', 0, 0);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                int i52 = (i51 * 522) - 65520;
                int i53 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                int i54 = ~((i53 & 126) | (i53 ^ 126));
                int i55 = -(-(((i54 & i51) | (i51 ^ i54)) * (-1042)));
                int i56 = (i52 ^ i55) + ((i52 & i55) << 1);
                int i57 = ((iTuitionPaymentFragmentspecialinlinedviewModeldefault5 ^ 126) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault5 & 126)) * 521;
                int i58 = ((i56 | i57) << 1) - (i57 ^ i56);
                int i59 = ~i51;
                int i60 = (~((i59 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i59 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5))) | (~((i59 ^ ComposerKt.defaultsKey) | (i59 & ComposerKt.defaultsKey)));
                int i61 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                int i62 = (i51 & i61) | (i61 ^ i51);
                int i63 = i62 ^ 126;
                Object[] objArr5 = new Object[1];
                a(null, null, i58 + (((~((i62 & 126) | i63)) | i60) * 521), new byte[]{-108, -115, -127, -112, -110}, objArr5);
                int i64 = cls2.getField((String) objArr5[0]).getInt(objInvoke) & 2;
                int i65 = i ^ 1;
                int i66 = -i64;
                int i67 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
                g = i67 % 128;
                if (i67 % 2 == 0) {
                    int i68 = (i64 | i66) * 104;
                    int i69 = (i68 & i65) | ((~i68) & i);
                    int i70 = i & 1;
                    i14 = i69 ^ i70;
                    i15 = i69 & i70;
                } else {
                    int i71 = ((i64 & i66) | (i64 ^ i66)) >> 31;
                    i14 = (~i71) & i;
                    i15 = i71 & i65;
                }
                i4 = i15 | i14;
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
                char mirror = (char) (16997 - AndroidCharacter.getMirror('0'));
                int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 2739;
                int i72 = 14 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                byte[] bArr = $$a;
                byte b2 = bArr[5];
                Object[] objArr6 = new Object[1];
                c(b2, (short) (b2 | 140), bArr[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mirror, iIndexOf, i72, 1501733736, false, (String) objArr6[0], new Class[0]);
            }
            Set set = (Set) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, null);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 16949);
                int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 2739;
                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 13;
                byte[] bArr2 = $$a;
                byte b3 = bArr2[5];
                Object[] objArr7 = new Object[1];
                c(b3, (short) (b3 | 88), bArr2[7], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cNormalizeMetaState, windowTouchSlop, jumpTapTimeout, 47863026, false, (String) objArr7[0], null);
            }
            if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null))) {
                int i73 = g + 33;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i73 % 128;
                if (i73 % 2 != 0) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cMyPid = (char) ((Process.myPid() >> 22) + 16949);
                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 2739;
                        int modifierMetaStateMask = 12 - ((byte) KeyEvent.getModifierMetaStateMask());
                        byte[] bArr3 = $$a;
                        byte b4 = bArr3[5];
                        Object[] objArr8 = new Object[1];
                        c(b4, (short) (b4 | 36), (byte) (-bArr3[3]), objArr8);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMyPid, fadingEdgeLength, modifierMetaStateMask, 631063962, false, (String) objArr8[0], null);
                    }
                    set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null));
                    obj.hashCode();
                    throw null;
                }
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16949);
                    int iResolveSizeAndState = 2739 - View.resolveSizeAndState(0, 0, 0);
                    int iIndexOf2 = TextUtils.indexOf("", "") + 13;
                    byte[] bArr4 = $$a;
                    byte b5 = bArr4[5];
                    Object[] objArr9 = new Object[1];
                    c(b5, (short) (b5 | 36), (byte) (-bArr4[3]), objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, iResolveSizeAndState, iIndexOf2, 631063962, false, (String) objArr9[0], null);
                }
                if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null))) {
                    if (Build.VERSION.SDK_INT > 33) {
                        int i74 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        i7 = (i74 ^ 103) + ((i74 & 103) << 1);
                        g = i7 % 128;
                        if (i7 % 2 == 0) {
                            mode = View.MeasureSpec.getMode(1);
                            iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            i8 = 9;
                        } else {
                            mode = View.MeasureSpec.getMode(0);
                            iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            i8 = 127;
                        }
                        int i75 = (mode * 375) + (i8 * (-747));
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        int i76 = ~(((-648166151) & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | ((-648166151) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                        int i77 = ((i76 & 614472196) | (614472196 ^ i76)) * (-566);
                        i9 = (((((1422430568 | i77) << 1) - (i77 ^ 1422430568)) - (-517558288)) - (~((~((iTuitionPaymentFragmentspecialinlinedviewModeldefault6 & (-33693955)) | ((-33693955) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6))) * 566))) - 1;
                        int i78 = ~((248369426 & i) | (248369426 ^ i));
                        int i79 = -(-(((i78 & 1628578380) | (1628578380 ^ i78)) * 1504));
                        int i80 = (1751254267 ^ i79) + ((i79 & 1751254267) << 1);
                        int i81 = (~((1876947806 & i) | (1876947806 ^ i))) * (-1504);
                        i10 = ((i80 & i81) + (i81 | i80)) - 1419948592;
                        i11 = ~mode;
                        if (i9 <= i10) {
                            i12 = ~((i11 & i8) | (i11 ^ i8));
                            i13 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i82 = 13 / 0;
                        } else {
                            i12 = ~((i11 & i8) | (i11 ^ i8));
                            i13 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        }
                        int i83 = ~((i13 & mode) | (i13 ^ mode));
                        int i84 = (i75 - (~(-(-((-374) * ((i12 & i83) | (i12 ^ i83))))))) - 1;
                        int i85 = ~i8;
                        int i86 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i87 = ((i86 | 29) << 1) - (i86 ^ 29);
                        g = i87 % 128;
                        int i88 = i87 % 2;
                        int i89 = i84 + (748 * (~((i85 ^ mode) | (i85 & mode))));
                        int i90 = ~mode;
                        int i91 = ~((i85 & i90) | (i90 ^ i85));
                        int i92 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i93 = ~((mode & i92) | (i92 ^ mode));
                        int i94 = -(-(((i93 & i91) | (i91 ^ i93)) * 374));
                        int i95 = (i89 ^ i94) + ((i94 & i89) << 1);
                        byte[] bArr5 = {-120, -124, -121, -118, -112, -104, -127, -115, -115, -103, -104, -118, -125, -105, -125, -106, -112, -112, -107, -119, -122, -126, -122, -107, -120, -119, -118, -107};
                        int i96 = ((i86 | 125) << 1) - (i86 ^ 125);
                        g = i96 % 128;
                        int i97 = i96 % 2;
                        Object[] objArr10 = new Object[1];
                        a(null, null, i95, bArr5, objArr10);
                        Object[] objArr11 = {(String) objArr10[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            int iMyPid = (Process.myPid() >> 22) + 993;
                            int i98 = 8 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                            byte b6 = $$a[7];
                            short s = b6;
                            Object[] objArr12 = new Object[1];
                            c(b6, s, (byte) (s | 52), objArr12);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollBarFadeDuration, iMyPid, i98, 410748506, false, (String) objArr12[0], new Class[]{String.class});
                        }
                        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr11)).longValue();
                        long j = 1078387719;
                        long j2 = -1;
                        long j3 = j ^ j2;
                        r28 = i4;
                        long j4 = ((((long) i) ^ j2) | j) ^ j2;
                        long j5 = (((long) 375) * j) + (((long) (-747)) * jLongValue) + (((long) (-374)) * (((j3 | jLongValue) ^ j2) | j4));
                        long j6 = jLongValue ^ j2;
                        long j7 = j5 + (((long) 748) * ((j | j6) ^ j2)) + (((long) 374) * (((j3 | j6) ^ j2) | j4)) + ((long) (-1279305956));
                        int i99 = ~i;
                        int i100 = ((int) (j7 >> 32)) & ((-1788177110) + ((286408992 | i99) * (-192)) + (((~((-1114377864) | i99)) | 36439555) * (-384)) + (((~(i99 | (-1077938309))) | (~((-36439556) | i)) | (~(1400786855 | i))) * DerHeader.TAG_CLASS_PRIVATE));
                        int i101 = (int) j7;
                        int startUptimeMillis = (int) Process.getStartUptimeMillis();
                        int i102 = ~startUptimeMillis;
                        int i103 = i101 & ((-501357939) + (((~((-44146361) | i102)) | 44042904) * 168) + ((~((-44042905) | startUptimeMillis)) * 168) + (((~(startUptimeMillis | (-103457))) | (~(i102 | 1481372770)) | (-1525415675)) * 168));
                        i6 = (i100 & i103) | (i100 ^ i103);
                    } else {
                        context = i4;
                        int i104 = 127 - (~(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))));
                        byte[] bArr6 = {-102};
                        int i105 = g + 111;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i105 % 128;
                        int i106 = i105 % 2;
                        Object[] objArr13 = new Object[1];
                        a(null, null, i104, bArr6, objArr13);
                        str = (String) objArr13[0];
                        int i107 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        Object[] objArr14 = new Object[1];
                        a(null, null, ((i107 | 128) << 1) - (i107 ^ 128), new byte[]{-118, -112, -104, -127, -115, -115, -103, -104, -118, -125, -121, -123, -124}, objArr14);
                        objArr = new Object[]{(String) objArr14[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char c2 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 33601);
                            int iMyTid = 3085 - (Process.myTid() >> 22);
                            int packedPositionGroup = 26 - ExpandableListView.getPackedPositionGroup(0L);
                            byte b7 = $$a[7];
                            short s2 = b7;
                            Object[] objArr15 = new Object[1];
                            c(b7, s2, (byte) (s2 | 52), objArr15);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, iMyTid, packedPositionGroup, 1411172903, false, (String) objArr15[0], new Class[]{String.class});
                        }
                        if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                            i6 = 1;
                            r28 = context;
                        } else {
                            i6 = 0;
                            r28 = context;
                        }
                    }
                    int i108 = (i & (-11)) | ((~i) & 10);
                    int i109 = -i6;
                    int i110 = ((i6 & i109) | (i6 ^ i109)) >> 31;
                    int i111 = (~i110) & i;
                    int i112 = i110 & i108;
                    int i113 = (i112 & i111) | (i111 ^ i112);
                    int i114 = i2 & 32;
                    int i115 = -i114;
                    int i116 = ((i114 & i115) | (i114 ^ i115)) >> 31;
                    int i117 = i113 & (~i116);
                    int i118 = i116 & i;
                    i5 = (i117 & i118) | (i117 ^ i118);
                    int i119 = g;
                    int i120 = (i119 & 123) + (i119 | 123);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i120 % 128;
                    int i121 = i120 % 2;
                    r27 = r28;
                } else if (Build.VERSION.SDK_INT == 30) {
                    int i122 = g + 19;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i122 % 128;
                    int i123 = i122 % 2;
                    i5 = i;
                    r27 = i4;
                } else {
                    try {
                        try {
                            if (Build.VERSION.SDK_INT > 33) {
                                int i710 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                i7 = (i710 ^ 103) + ((i710 & 103) << 1);
                                g = i7 % 128;
                                if (i7 % 2 == 0) {
                                    mode = View.MeasureSpec.getMode(1);
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                    i8 = 9;
                                } else {
                                    mode = View.MeasureSpec.getMode(0);
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                    i8 = 127;
                                }
                                int i711 = (mode * 375) + (i8 * (-747));
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                int i712 = ~(((-648166151) & iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | ((-648166151) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7));
                                int i713 = ((i712 & 614472196) | (614472196 ^ i712)) * (-566);
                                i9 = (((((1422430568 | i713) << 1) - (i713 ^ 1422430568)) - (-517558288)) - (~((~((iTuitionPaymentFragmentspecialinlinedviewModeldefault7 & (-33693955)) | ((-33693955) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7))) * 566))) - 1;
                                int i714 = ~((248369426 & i) | (248369426 ^ i));
                                int i715 = -(-(((i714 & 1628578380) | (1628578380 ^ i714)) * 1504));
                                int i810 = (1751254267 ^ i715) + ((i715 & 1751254267) << 1);
                                int i811 = (~((1876947806 & i) | (1876947806 ^ i))) * (-1504);
                                i10 = ((i810 & i811) + (i811 | i810)) - 1419948592;
                                i11 = ~mode;
                                if (i9 <= i10) {
                                    i12 = ~((i11 & i8) | (i11 ^ i8));
                                    i13 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    int i812 = 13 / 0;
                                } else {
                                    i12 = ~((i11 & i8) | (i11 ^ i8));
                                    i13 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                }
                                int i813 = ~((i13 & mode) | (i13 ^ mode));
                                int i814 = (i711 - (~(-(-((-374) * ((i12 & i813) | (i12 ^ i813))))))) - 1;
                                int i815 = ~i8;
                                int i816 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                int i817 = ((i816 | 29) << 1) - (i816 ^ 29);
                                g = i817 % 128;
                                int i818 = i817 % 2;
                                int i819 = i814 + (748 * (~((i815 ^ mode) | (i815 & mode))));
                                int i910 = ~mode;
                                int i911 = ~((i815 & i910) | (i910 ^ i815));
                                int i912 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                int i913 = ~((mode & i912) | (i912 ^ mode));
                                int i914 = -(-(((i913 & i911) | (i911 ^ i913)) * 374));
                                int i915 = (i819 ^ i914) + ((i914 & i819) << 1);
                                byte[] bArr7 = {-120, -124, -121, -118, -112, -104, -127, -115, -115, -103, -104, -118, -125, -105, -125, -106, -112, -112, -107, -119, -122, -126, -122, -107, -120, -119, -118, -107};
                                int i916 = ((i816 | 125) << 1) - (i816 ^ 125);
                                g = i916 % 128;
                                int i917 = i916 % 2;
                                Object[] objArr16 = new Object[1];
                                a(null, null, i915, bArr7, objArr16);
                                try {
                                    Object[] objArr17 = {(String) objArr16[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char scrollBarFadeDuration2 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                        int iMyPid2 = (Process.myPid() >> 22) + 993;
                                        int i918 = 8 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        byte b8 = $$a[7];
                                        short s3 = b8;
                                        Object[] objArr18 = new Object[1];
                                        c(b8, s3, (byte) (s3 | 52), objArr18);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollBarFadeDuration2, iMyPid2, i918, 410748506, false, (String) objArr18[0], new Class[]{String.class});
                                    }
                                    long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr17)).longValue();
                                    long j8 = 1078387719;
                                    long j9 = -1;
                                    long j10 = j8 ^ j9;
                                    r28 = i4;
                                    long j11 = ((((long) i) ^ j9) | j8) ^ j9;
                                    long j12 = (((long) 375) * j8) + (((long) (-747)) * jLongValue2) + (((long) (-374)) * (((j10 | jLongValue2) ^ j9) | j11));
                                    long j13 = jLongValue2 ^ j9;
                                    long j14 = j12 + (((long) 748) * ((j8 | j13) ^ j9)) + (((long) 374) * (((j10 | j13) ^ j9) | j11)) + ((long) (-1279305956));
                                    int i919 = ~i;
                                    int i1010 = ((int) (j14 >> 32)) & ((-1788177110) + ((286408992 | i919) * (-192)) + (((~((-1114377864) | i919)) | 36439555) * (-384)) + (((~(i919 | (-1077938309))) | (~((-36439556) | i)) | (~(1400786855 | i))) * DerHeader.TAG_CLASS_PRIVATE));
                                    int i1011 = (int) j14;
                                    int startUptimeMillis2 = (int) Process.getStartUptimeMillis();
                                    int i1012 = ~startUptimeMillis2;
                                    int i1013 = i1011 & ((-501357939) + (((~((-44146361) | i1012)) | 44042904) * 168) + ((~((-44042905) | startUptimeMillis2)) * 168) + (((~(startUptimeMillis2 | (-103457))) | (~(i1012 | 1481372770)) | (-1525415675)) * 168));
                                    i6 = (i1010 & i1013) | (i1010 ^ i1013);
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 != null) {
                                        throw cause2;
                                    }
                                    throw th2;
                                }
                            } else {
                                context = i4;
                                int i1014 = 127 - (~(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))));
                                byte[] bArr8 = {-102};
                                int i1015 = g + 111;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1015 % 128;
                                int i1016 = i1015 % 2;
                                Object[] objArr19 = new Object[1];
                                a(null, null, i1014, bArr8, objArr19);
                                str = (String) objArr19[0];
                                int i1017 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                Object[] objArr110 = new Object[1];
                                a(null, null, ((i1017 | 128) << 1) - (i1017 ^ 128), new byte[]{-118, -112, -104, -127, -115, -115, -103, -104, -118, -125, -121, -123, -124}, objArr110);
                                try {
                                    objArr = new Object[]{(String) objArr110[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                        char c3 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 33601);
                                        int iMyTid2 = 3085 - (Process.myTid() >> 22);
                                        int packedPositionGroup2 = 26 - ExpandableListView.getPackedPositionGroup(0L);
                                        byte b9 = $$a[7];
                                        short s4 = b9;
                                        Object[] objArr111 = new Object[1];
                                        c(b9, s4, (byte) (s4 | 52), objArr111);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c3, iMyTid2, packedPositionGroup2, 1411172903, false, (String) objArr111[0], new Class[]{String.class});
                                    }
                                    if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                        i6 = 1;
                                        r28 = context;
                                    } else {
                                        i6 = 0;
                                        r28 = context;
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
                        context = i4;
                    }
                    int i1018 = (i & (-11)) | ((~i) & 10);
                    int i1019 = -i6;
                    int i1110 = ((i6 & i1019) | (i6 ^ i1019)) >> 31;
                    int i1111 = (~i1110) & i;
                    int i1112 = i1110 & i1018;
                    int i1113 = (i1112 & i1111) | (i1111 ^ i1112);
                    int i1114 = i2 & 32;
                    int i1115 = -i1114;
                    int i1116 = ((i1114 & i1115) | (i1114 ^ i1115)) >> 31;
                    int i1117 = i1113 & (~i1116);
                    int i1118 = i1116 & i;
                    i5 = (i1117 & i1118) | (i1117 ^ i1118);
                    int i1119 = g;
                    int i124 = (i1119 & 123) + (i1119 | 123);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i124 % 128;
                    int i125 = i124 % 2;
                    r27 = r28;
                }
            } else if (Build.VERSION.SDK_INT == 30) {
                int i126 = g + 19;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i126 % 128;
                int i127 = i126 % 2;
                i5 = i;
                r27 = i4;
            } else {
                if (Build.VERSION.SDK_INT > 33) {
                    int i716 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    i7 = (i716 ^ 103) + ((i716 & 103) << 1);
                    g = i7 % 128;
                    if (i7 % 2 == 0) {
                        mode = View.MeasureSpec.getMode(1);
                        iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        i8 = 9;
                    } else {
                        mode = View.MeasureSpec.getMode(0);
                        iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        i8 = 127;
                    }
                    int i717 = (mode * 375) + (i8 * (-747));
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    int i718 = ~(((-648166151) & iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | ((-648166151) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                    int i719 = ((i718 & 614472196) | (614472196 ^ i718)) * (-566);
                    i9 = (((((1422430568 | i719) << 1) - (i719 ^ 1422430568)) - (-517558288)) - (~((~((iTuitionPaymentFragmentspecialinlinedviewModeldefault8 & (-33693955)) | ((-33693955) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8))) * 566))) - 1;
                    int i7110 = ~((248369426 & i) | (248369426 ^ i));
                    int i7111 = -(-(((i7110 & 1628578380) | (1628578380 ^ i7110)) * 1504));
                    int i8110 = (1751254267 ^ i7111) + ((i7111 & 1751254267) << 1);
                    int i8111 = (~((1876947806 & i) | (1876947806 ^ i))) * (-1504);
                    i10 = ((i8110 & i8111) + (i8111 | i8110)) - 1419948592;
                    i11 = ~mode;
                    if (i9 <= i10) {
                        i12 = ~((i11 & i8) | (i11 ^ i8));
                        i13 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i8112 = 13 / 0;
                    } else {
                        i12 = ~((i11 & i8) | (i11 ^ i8));
                        i13 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    }
                    int i8113 = ~((i13 & mode) | (i13 ^ mode));
                    int i8114 = (i717 - (~(-(-((-374) * ((i12 & i8113) | (i12 ^ i8113))))))) - 1;
                    int i8115 = ~i8;
                    int i8116 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i8117 = ((i8116 | 29) << 1) - (i8116 ^ 29);
                    g = i8117 % 128;
                    int i8118 = i8117 % 2;
                    int i8119 = i8114 + (748 * (~((i8115 ^ mode) | (i8115 & mode))));
                    int i9110 = ~mode;
                    int i9111 = ~((i8115 & i9110) | (i9110 ^ i8115));
                    int i9112 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i9113 = ~((mode & i9112) | (i9112 ^ mode));
                    int i9114 = -(-(((i9113 & i9111) | (i9111 ^ i9113)) * 374));
                    int i9115 = (i8119 ^ i9114) + ((i9114 & i8119) << 1);
                    byte[] bArr9 = {-120, -124, -121, -118, -112, -104, -127, -115, -115, -103, -104, -118, -125, -105, -125, -106, -112, -112, -107, -119, -122, -126, -122, -107, -120, -119, -118, -107};
                    int i9116 = ((i8116 | 125) << 1) - (i8116 ^ 125);
                    g = i9116 % 128;
                    int i9117 = i9116 % 2;
                    Object[] objArr112 = new Object[1];
                    a(null, null, i9115, bArr9, objArr112);
                    Object[] objArr113 = {(String) objArr112[0]};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char scrollBarFadeDuration3 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int iMyPid3 = (Process.myPid() >> 22) + 993;
                        int i9118 = 8 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        byte b10 = $$a[7];
                        short s5 = b10;
                        Object[] objArr114 = new Object[1];
                        c(b10, s5, (byte) (s5 | 52), objArr114);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollBarFadeDuration3, iMyPid3, i9118, 410748506, false, (String) objArr114[0], new Class[]{String.class});
                    }
                    long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr113)).longValue();
                    long j15 = 1078387719;
                    long j16 = -1;
                    long j17 = j15 ^ j16;
                    r28 = i4;
                    long j18 = ((((long) i) ^ j16) | j15) ^ j16;
                    long j19 = (((long) 375) * j15) + (((long) (-747)) * jLongValue3) + (((long) (-374)) * (((j17 | jLongValue3) ^ j16) | j18));
                    long j110 = jLongValue3 ^ j16;
                    long j111 = j19 + (((long) 748) * ((j15 | j110) ^ j16)) + (((long) 374) * (((j17 | j110) ^ j16) | j18)) + ((long) (-1279305956));
                    int i9119 = ~i;
                    int i10110 = ((int) (j111 >> 32)) & ((-1788177110) + ((286408992 | i9119) * (-192)) + (((~((-1114377864) | i9119)) | 36439555) * (-384)) + (((~(i9119 | (-1077938309))) | (~((-36439556) | i)) | (~(1400786855 | i))) * DerHeader.TAG_CLASS_PRIVATE));
                    int i10111 = (int) j111;
                    int startUptimeMillis3 = (int) Process.getStartUptimeMillis();
                    int i10112 = ~startUptimeMillis3;
                    int i10113 = i10111 & ((-501357939) + (((~((-44146361) | i10112)) | 44042904) * 168) + ((~((-44042905) | startUptimeMillis3)) * 168) + (((~(startUptimeMillis3 | (-103457))) | (~(i10112 | 1481372770)) | (-1525415675)) * 168));
                    i6 = (i10110 & i10113) | (i10110 ^ i10113);
                } else {
                    context = i4;
                    int i10114 = 127 - (~(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))));
                    byte[] bArr10 = {-102};
                    int i10115 = g + 111;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10115 % 128;
                    int i10116 = i10115 % 2;
                    Object[] objArr115 = new Object[1];
                    a(null, null, i10114, bArr10, objArr115);
                    str = (String) objArr115[0];
                    int i10117 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    Object[] objArr116 = new Object[1];
                    a(null, null, ((i10117 | 128) << 1) - (i10117 ^ 128), new byte[]{-118, -112, -104, -127, -115, -115, -103, -104, -118, -125, -121, -123, -124}, objArr116);
                    objArr = new Object[]{(String) objArr116[0]};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c4 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 33601);
                        int iMyTid3 = 3085 - (Process.myTid() >> 22);
                        int packedPositionGroup3 = 26 - ExpandableListView.getPackedPositionGroup(0L);
                        byte b11 = $$a[7];
                        short s6 = b11;
                        Object[] objArr117 = new Object[1];
                        c(b11, s6, (byte) (s6 | 52), objArr117);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c4, iMyTid3, packedPositionGroup3, 1411172903, false, (String) objArr117[0], new Class[]{String.class});
                    }
                    if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                        i6 = 1;
                        r28 = context;
                    } else {
                        i6 = 0;
                        r28 = context;
                    }
                }
                int i10118 = (i & (-11)) | ((~i) & 10);
                int i10119 = -i6;
                int i11110 = ((i6 & i10119) | (i6 ^ i10119)) >> 31;
                int i11111 = (~i11110) & i;
                int i11112 = i11110 & i10118;
                int i11113 = (i11112 & i11111) | (i11111 ^ i11112);
                int i11114 = i2 & 32;
                int i11115 = -i11114;
                int i11116 = ((i11114 & i11115) | (i11114 ^ i11115)) >> 31;
                int i11117 = i11113 & (~i11116);
                int i11118 = i11116 & i;
                i5 = (i11117 & i11118) | (i11117 ^ i11118);
                int i11119 = g;
                int i128 = (i11119 & 123) + (i11119 | 123);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i128 % 128;
                int i129 = i128 % 2;
                r27 = r28;
            }
            int i130 = (~((i & r27) == true ? 1 : 0)) & ((i | r27) == true ? 1 : 0);
            int i131 = -i130;
            int i132 = ((i130 & i131) | (i130 ^ i131)) >> 31;
            int i133 = (i5 & (~i132)) | (r27 & i132);
            int i134 = ((~i133) & i) | ((~i) & i133);
            int i135 = -i134;
            int i136 = (((i134 & i135) | (i134 ^ i135)) >> 31) & 16;
            Object[] objArr20 = {new int[]{i}, new int[1], new int[]{i133}, null};
            int iMyUid = Process.myUid();
            int i137 = ((((~((-807829955) | iMyUid)) | (-901750776)) * TypedValues.PositionType.TYPE_TRANSITION_EASING) - 149998206) + ((~((~iMyUid) | (-807829955))) * TypedValues.PositionType.TYPE_TRANSITION_EASING);
            int i138 = (i137 & i136) + (i137 | i136);
            int i139 = ((i3 | i138) << 1) - (i3 ^ i138);
            int i140 = i139 << 13;
            int i141 = (i140 | i139) & (~(i139 & i140));
            int i142 = i141 >>> 17;
            int i143 = ((~i141) & i142) | ((~i142) & i141);
            int i144 = i143 << 5;
            ((int[]) objArr20[1])[0] = ((~i143) & i144) | ((~i144) & i143);
            int i145 = g;
            int i146 = (i145 ^ 125) + ((i145 & 125) << 1);
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i146 % 128;
            int i147 = i146 % 2;
            return objArr20;
        } catch (Throwable th4) {
            Throwable cause4 = th4.getCause();
            if (cause4 != null) {
                throw cause4;
            }
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(short r5, byte r6, int r7) {
        /*
            int r7 = 68 - r7
            byte[] r0 = com.google.android.gms.internal.mlkit_vision_face.zzcn.$$c
            int r6 = r6 * 2
            int r1 = 1 - r6
            int r5 = r5 * 3
            int r5 = r5 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L16
            r4 = r5
            r3 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L22:
            int r3 = r3 + 1
            r4 = r0[r5]
        L26:
            int r5 = r5 + 1
            int r7 = r7 + r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_face.zzcn.$$e(short, byte, int):java.lang.String");
    }
}
