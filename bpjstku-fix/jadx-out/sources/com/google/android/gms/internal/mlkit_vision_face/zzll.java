package com.google.android.gms.internal.mlkit_vision_face;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
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
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bpjstku.data.promo.model.request.VoucherRequest;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.io.encoding.Base64;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes6.dex */
public final class zzll {
    private final zzkl zza;
    private final zzkh zzb;
    private final zzkd zzc;
    private final Integer zzd;
    private final Integer zze;
    private static final byte[] $$c = {89, 107, -36, -112};
    private static final int $$f = 133;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {29, -5, -24, -13, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55};
    private static final int $$e = 245;
    private static final byte[] $$a = {1, -81, 2, 79, -15, 8, -16, 1, 4, 3, 52, -55, -14, -1, -8, 13, -11, -8, 68, -68, 1, Base64.padSymbol, -21, -49, -2, 2, 1, 4, 0, -21, 9, -8, -1, 35, -39, 6, -11, 1, -21, 17, 27, -39, -11, 7, -23, 19, 49, -64, 9, -15, 5, 55, -40, -22, -12, 11, 2, -5, -3, 17, -19, -4, 5, 5, -2, -13, -7, 4, -7};
    private static final int $$b = 10;
    private static int g = 0;
    private static int asBinder = 1;
    private static char TuitionPaymentFragmentbindingInflater1 = 20502;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 45707;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 8412;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 51456;
    private static int[] b = {-587810039, 1082623456, -709646863, -1501668829, -1719955057, 1965932200, -1593912065, 620771994, 1843770224, -1043520564, 865118364, -713759273, -2129625284, -175923548, 2045163383, 1395877479, -998842817, 1655993046};

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.android.gms.internal.mlkit_vision_face.zzll.$$a
            int r6 = r6 * 3
            int r6 = r6 + 97
            int r7 = r7 + 4
            int r1 = 34 - r8
            byte[] r1 = new byte[r1]
            int r8 = 33 - r8
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2b
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r7 = r7 + 1
            int r4 = r3 + 1
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r5
        L2b:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + (-2)
            r7 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_face.zzll.d(int, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 52
            int r0 = r8 + 1
            int r6 = r6 + 4
            byte[] r1 = com.google.android.gms.internal.mlkit_vision_face.zzll.$$d
            int r7 = r7 + 84
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2c
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r6 = r6 + 1
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-10)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_face.zzll.e(short, byte, byte, java.lang.Object[]):void");
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        int i4 = $11 + 21;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (true) {
            char c = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                int i6 = $10 + 111;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                return;
            }
            int i8 = $10 + 27;
            $11 = i8 % 128;
            int i9 = 58224;
            char c2 = 1;
            if (i8 % i2 == 0) {
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            } else {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            }
            int i10 = 0;
            while (i10 < 16) {
                int i11 = $11 + 39;
                $10 = i11 % 128;
                int i12 = i11 % i2;
                char c3 = cArr3[c2];
                char c4 = cArr3[c];
                int i13 = (c4 + i9) ^ ((c4 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 8611973335120459638L)));
                int i14 = c4 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    objArr2[i2] = Integer.valueOf(i14);
                    objArr2[1] = Integer.valueOf(i13);
                    objArr2[0] = Integer.valueOf(c3);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 47773);
                        int i15 = 469 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        int doubleTapTimeout = 13 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[i2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollDefaultDelay, i15, doubleTapTimeout, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    onCaptureSessionEnd oncapturesessionend2 = oncapturesessionend;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i9) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf("", "") + 47773), 468 - Color.argb(0, 0, 0, 0), 13 - (ViewConfiguration.getScrollBarSize() >> 8), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i9 -= 40503;
                    i10++;
                    oncapturesessionend = oncapturesessionend2;
                    i2 = 2;
                    c = 0;
                    c2 = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            onCaptureSessionEnd oncapturesessionend3 = oncapturesessionend;
            cArr2[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr[oncapturesessionend3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] ^ cArr3[1]);
            Object[] objArr4 = {oncapturesessionend3, oncapturesessionend3};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b2 = (byte) 3;
                byte b3 = (byte) (b2 - 3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getPressedStateDuration() >> 16), View.MeasureSpec.getMode(0) + 2323, MotionEvent.axisFromString("") + 45, -1312321721, false, $$g(b2, b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            oncapturesessionend = oncapturesessionend3;
            i2 = 2;
        }
    }

    private static void c(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = b;
        int i3 = -1870535734;
        int i4 = 1;
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $11 + 15;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i5] = Integer.valueOf(iArr2[i6]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) i5;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.getOffsetBefore("", i5), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3291, 31 - TextUtils.indexOf("", "", i5, i5), 1948206109, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i6++;
                    i3 = -1870535734;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = b;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = $11 + 67;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 2 / 2;
            }
            int i11 = 0;
            while (i11 < length3) {
                Object[] objArr3 = new Object[i4];
                objArr3[0] = Integer.valueOf(iArr5[i11]);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + 3292, 30 - TextUtils.lastIndexOf("", '0', 0, 0), 1948206109, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                }
                iArr6[i11] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                i11++;
                iArr5 = iArr5;
                i4 = 1;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        sessionConfigValidatingBuilder.b = 2;
        int i12 = $10 + 77;
        $11 = i12 % 128;
        int i13 = i12 % 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i14 = 17;
            for (int i15 = 1; i14 > i15; i15 = 1) {
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i14];
                Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char mode = (char) View.MeasureSpec.getMode(0);
                    int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 2559;
                    int iAlpha = Color.alpha(0) + 29;
                    byte length4 = (byte) $$c.length;
                    byte b6 = (byte) (length4 - 4);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mode, fadingEdgeLength, iAlpha, 683220507, false, $$g(length4, b6, b6), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                i14--;
                int i16 = $11 + 105;
                $10 = i16 % 128;
                if (i16 % 2 != 0) {
                    int i17 = 5 % 2;
                }
            }
            int i18 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i19 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr5 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 28878), 348 - View.MeasureSpec.getMode(0), 24 - Process.getGidForName(""), -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* synthetic */ zzll(zzlj zzljVar, zzlk zzlkVar) {
        this.zza = zzljVar.zza;
        this.zzb = zzljVar.zzb;
        this.zzc = zzljVar.zzc;
        this.zzd = zzljVar.zzd;
        this.zze = zzljVar.zze;
    }

    public final zzkd zza() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 37;
        g = i3 % 128;
        int i4 = i3 % 2;
        zzkd zzkdVar = this.zzc;
        int i5 = i2 + 105;
        g = i5 % 128;
        int i6 = i5 % 2;
        return zzkdVar;
    }

    public final zzkh zzb() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 9;
        g = i3 % 128;
        int i4 = i3 % 2;
        zzkh zzkhVar = this.zzb;
        int i5 = i2 + 93;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 72 / 0;
        }
        return zzkhVar;
    }

    public final zzkl zzc() {
        int i = 2 % 2;
        int i2 = asBinder + 31;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        zzkl zzklVar = this.zza;
        int i5 = i3 + 17;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return zzklVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer zzd() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 73;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.zzd;
        int i5 = i2 + 113;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer zze() {
        Integer num;
        int i = 2 % 2;
        int i2 = asBinder + 79;
        int i3 = i2 % 128;
        g = i3;
        if (i2 % 2 != 0) {
            num = this.zze;
            int i4 = 56 / 0;
        } else {
            num = this.zze;
        }
        int i5 = i3 + 5;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0a44 A[Catch: IOException -> 0x0c41, Exception -> 0x0c4a, all -> 0x0d5b, TryCatch #20 {, blocks: (B:45:0x0663, B:46:0x0681, B:48:0x06ef, B:53:0x0748, B:64:0x079d, B:78:0x0829, B:125:0x0a33, B:126:0x0a36, B:128:0x0a44, B:129:0x0a8b, B:131:0x0aa1, B:132:0x0ae2, B:134:0x0af4, B:135:0x0af9, B:137:0x0b15, B:139:0x0b19, B:140:0x0b1e, B:143:0x0b3f, B:144:0x0b44, B:147:0x0b60, B:148:0x0b65, B:150:0x0b9e, B:152:0x0bae, B:154:0x0c10, B:156:0x0c1a, B:251:0x0d37, B:252:0x0d5a, B:203:0x0c9d, B:204:0x0ca0, B:210:0x0cab, B:212:0x0cb2, B:213:0x0cb3, B:223:0x0cd0, B:225:0x0cd7, B:226:0x0cd8, B:233:0x0cf0, B:235:0x0cfd, B:236:0x0cfe, B:238:0x0d00, B:240:0x0d13, B:241:0x0d14), top: B:368:0x0663 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x0aa1 A[Catch: IOException -> 0x0c41, Exception -> 0x0c4a, all -> 0x0d5b, TryCatch #20 {, blocks: (B:45:0x0663, B:46:0x0681, B:48:0x06ef, B:53:0x0748, B:64:0x079d, B:78:0x0829, B:125:0x0a33, B:126:0x0a36, B:128:0x0a44, B:129:0x0a8b, B:131:0x0aa1, B:132:0x0ae2, B:134:0x0af4, B:135:0x0af9, B:137:0x0b15, B:139:0x0b19, B:140:0x0b1e, B:143:0x0b3f, B:144:0x0b44, B:147:0x0b60, B:148:0x0b65, B:150:0x0b9e, B:152:0x0bae, B:154:0x0c10, B:156:0x0c1a, B:251:0x0d37, B:252:0x0d5a, B:203:0x0c9d, B:204:0x0ca0, B:210:0x0cab, B:212:0x0cb2, B:213:0x0cb3, B:223:0x0cd0, B:225:0x0cd7, B:226:0x0cd8, B:233:0x0cf0, B:235:0x0cfd, B:236:0x0cfe, B:238:0x0d00, B:240:0x0d13, B:241:0x0d14), top: B:368:0x0663 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x0b15 A[Catch: IOException -> 0x0c41, all -> 0x0d5b, TRY_LEAVE, TryCatch #20 {, blocks: (B:45:0x0663, B:46:0x0681, B:48:0x06ef, B:53:0x0748, B:64:0x079d, B:78:0x0829, B:125:0x0a33, B:126:0x0a36, B:128:0x0a44, B:129:0x0a8b, B:131:0x0aa1, B:132:0x0ae2, B:134:0x0af4, B:135:0x0af9, B:137:0x0b15, B:139:0x0b19, B:140:0x0b1e, B:143:0x0b3f, B:144:0x0b44, B:147:0x0b60, B:148:0x0b65, B:150:0x0b9e, B:152:0x0bae, B:154:0x0c10, B:156:0x0c1a, B:251:0x0d37, B:252:0x0d5a, B:203:0x0c9d, B:204:0x0ca0, B:210:0x0cab, B:212:0x0cb2, B:213:0x0cb3, B:223:0x0cd0, B:225:0x0cd7, B:226:0x0cd8, B:233:0x0cf0, B:235:0x0cfd, B:236:0x0cfe, B:238:0x0d00, B:240:0x0d13, B:241:0x0d14), top: B:368:0x0663 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x0b3d  */
    /* JADX WARN: Code duplicated, block: B:146:0x0b5f  */
    /* JADX WARN: Code duplicated, block: B:152:0x0bae A[Catch: IOException -> 0x0c47, all -> 0x0d5b, TryCatch #20 {, blocks: (B:45:0x0663, B:46:0x0681, B:48:0x06ef, B:53:0x0748, B:64:0x079d, B:78:0x0829, B:125:0x0a33, B:126:0x0a36, B:128:0x0a44, B:129:0x0a8b, B:131:0x0aa1, B:132:0x0ae2, B:134:0x0af4, B:135:0x0af9, B:137:0x0b15, B:139:0x0b19, B:140:0x0b1e, B:143:0x0b3f, B:144:0x0b44, B:147:0x0b60, B:148:0x0b65, B:150:0x0b9e, B:152:0x0bae, B:154:0x0c10, B:156:0x0c1a, B:251:0x0d37, B:252:0x0d5a, B:203:0x0c9d, B:204:0x0ca0, B:210:0x0cab, B:212:0x0cb2, B:213:0x0cb3, B:223:0x0cd0, B:225:0x0cd7, B:226:0x0cd8, B:233:0x0cf0, B:235:0x0cfd, B:236:0x0cfe, B:238:0x0d00, B:240:0x0d13, B:241:0x0d14), top: B:368:0x0663 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x0c10 A[Catch: IOException -> 0x0c47, all -> 0x0d5b, TRY_LEAVE, TryCatch #20 {, blocks: (B:45:0x0663, B:46:0x0681, B:48:0x06ef, B:53:0x0748, B:64:0x079d, B:78:0x0829, B:125:0x0a33, B:126:0x0a36, B:128:0x0a44, B:129:0x0a8b, B:131:0x0aa1, B:132:0x0ae2, B:134:0x0af4, B:135:0x0af9, B:137:0x0b15, B:139:0x0b19, B:140:0x0b1e, B:143:0x0b3f, B:144:0x0b44, B:147:0x0b60, B:148:0x0b65, B:150:0x0b9e, B:152:0x0bae, B:154:0x0c10, B:156:0x0c1a, B:251:0x0d37, B:252:0x0d5a, B:203:0x0c9d, B:204:0x0ca0, B:210:0x0cab, B:212:0x0cb2, B:213:0x0cb3, B:223:0x0cd0, B:225:0x0cd7, B:226:0x0cd8, B:233:0x0cf0, B:235:0x0cfd, B:236:0x0cfe, B:238:0x0d00, B:240:0x0d13, B:241:0x0d14), top: B:368:0x0663 }] */
    /* JADX WARN: Code duplicated, block: B:158:0x0c31  */
    /* JADX WARN: Code duplicated, block: B:225:0x0cd7 A[Catch: Exception -> 0x0d37, all -> 0x0d5b, IOException -> 0x0d5f, TryCatch #20 {, blocks: (B:45:0x0663, B:46:0x0681, B:48:0x06ef, B:53:0x0748, B:64:0x079d, B:78:0x0829, B:125:0x0a33, B:126:0x0a36, B:128:0x0a44, B:129:0x0a8b, B:131:0x0aa1, B:132:0x0ae2, B:134:0x0af4, B:135:0x0af9, B:137:0x0b15, B:139:0x0b19, B:140:0x0b1e, B:143:0x0b3f, B:144:0x0b44, B:147:0x0b60, B:148:0x0b65, B:150:0x0b9e, B:152:0x0bae, B:154:0x0c10, B:156:0x0c1a, B:251:0x0d37, B:252:0x0d5a, B:203:0x0c9d, B:204:0x0ca0, B:210:0x0cab, B:212:0x0cb2, B:213:0x0cb3, B:223:0x0cd0, B:225:0x0cd7, B:226:0x0cd8, B:233:0x0cf0, B:235:0x0cfd, B:236:0x0cfe, B:238:0x0d00, B:240:0x0d13, B:241:0x0d14), top: B:368:0x0663 }] */
    /* JADX WARN: Code duplicated, block: B:226:0x0cd8 A[Catch: Exception -> 0x0d37, all -> 0x0d5b, IOException -> 0x0d5f, TryCatch #20 {, blocks: (B:45:0x0663, B:46:0x0681, B:48:0x06ef, B:53:0x0748, B:64:0x079d, B:78:0x0829, B:125:0x0a33, B:126:0x0a36, B:128:0x0a44, B:129:0x0a8b, B:131:0x0aa1, B:132:0x0ae2, B:134:0x0af4, B:135:0x0af9, B:137:0x0b15, B:139:0x0b19, B:140:0x0b1e, B:143:0x0b3f, B:144:0x0b44, B:147:0x0b60, B:148:0x0b65, B:150:0x0b9e, B:152:0x0bae, B:154:0x0c10, B:156:0x0c1a, B:251:0x0d37, B:252:0x0d5a, B:203:0x0c9d, B:204:0x0ca0, B:210:0x0cab, B:212:0x0cb2, B:213:0x0cb3, B:223:0x0cd0, B:225:0x0cd7, B:226:0x0cd8, B:233:0x0cf0, B:235:0x0cfd, B:236:0x0cfe, B:238:0x0d00, B:240:0x0d13, B:241:0x0d14), top: B:368:0x0663 }] */
    /* JADX WARN: Code duplicated, block: B:259:0x0d61  */
    /* JADX WARN: Code duplicated, block: B:25:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:27:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:292:0x1259 A[EDGE_INSN: B:292:0x1259->B:293:0x125d BREAK  A[LOOP:5: B:272:0x0f99->B:291:0x1243], PHI: r1 r10
  0x1259: PHI (r1v78 java.lang.String[]) = (r1v75 java.lang.String[]), (r1v75 java.lang.String[]), (r1v85 java.lang.String[]) binds: [B:268:0x0ea6, B:270:0x0f93, B:430:0x1259] A[DONT_GENERATE, DONT_INLINE]
  0x1259: PHI (r10v71 int) = (r10v69 int), (r10v69 int), (r10v75 int) binds: [B:268:0x0ea6, B:270:0x0f93, B:430:0x1259] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x0410 A[Catch: all -> 0x19f2, TryCatch #35 {all -> 0x19f2, blocks: (B:13:0x01ee, B:15:0x0204, B:17:0x0263, B:28:0x03f9, B:30:0x0410, B:32:0x046b, B:282:0x10f1, B:284:0x1108, B:286:0x1165, B:308:0x12a9, B:310:0x12b8, B:311:0x1300, B:313:0x143f, B:315:0x144c, B:316:0x149a, B:318:0x1584, B:320:0x1591, B:321:0x15d6, B:323:0x169b, B:325:0x16a8, B:326:0x16ea, B:328:0x17f7, B:330:0x1804, B:331:0x184d), top: B:392:0x01ee }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0467  */
    /* JADX WARN: Code duplicated, block: B:36:0x050e A[LOOP:1: B:26:0x03b9->B:36:0x050e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x051c A[EDGE_INSN: B:37:0x051c->B:38:0x0523 BREAK  A[LOOP:1: B:26:0x03b9->B:36:0x050e], PHI: r3 r4 r7 r33 r40 r41
  0x051c: PHI (r3v233 int) = (r3v232 int), (r3v306 int) binds: [B:24:0x03b6, B:421:0x051c] A[DONT_GENERATE, DONT_INLINE]
  0x051c: PHI (r4v244 int) = (r4v243 int), (r4v332 int) binds: [B:24:0x03b6, B:421:0x051c] A[DONT_GENERATE, DONT_INLINE]
  0x051c: PHI (r7v175 java.lang.Object) = (r7v100 java.lang.Object), (r7v276 java.lang.Object) binds: [B:24:0x03b6, B:421:0x051c] A[DONT_GENERATE, DONT_INLINE]
  0x051c: PHI (r33v9 long) = (r33v27 long), (r33v22 long) binds: [B:24:0x03b6, B:421:0x051c] A[DONT_GENERATE, DONT_INLINE]
  0x051c: PHI (r40v21 ??) = (r8v329 java.lang.String), (r40v39 ??) binds: [B:24:0x03b6, B:421:0x051c] A[DONT_GENERATE, DONT_INLINE]
  0x051c: PHI (r41v3 int) = (r11v193 int), (r41v29 int) binds: [B:24:0x03b6, B:421:0x051c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x060f  */
    /* JADX WARN: Code duplicated, block: B:420:0x050c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:421:0x051c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:425:0x0c41 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:426:0x0c1a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:428:0x0c35 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x063d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0661  */
    /* JADX WARN: Code duplicated, block: B:51:0x070f A[Catch: all -> 0x0cff, TryCatch #39 {all -> 0x0cff, blocks: (B:49:0x0702, B:51:0x070f, B:52:0x0742), top: B:396:0x0702 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0759  */
    /* JADX WARN: Code duplicated, block: B:62:0x0795  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r33v11 */
    /* JADX WARN: Type inference failed for: r33v12 */
    /* JADX WARN: Type inference failed for: r33v13 */
    /* JADX WARN: Type inference failed for: r33v14 */
    /* JADX WARN: Type inference failed for: r33v15 */
    /* JADX WARN: Type inference failed for: r33v16 */
    /* JADX WARN: Type inference failed for: r33v17 */
    /* JADX WARN: Type inference failed for: r33v18 */
    /* JADX WARN: Type inference failed for: r33v19 */
    /* JADX WARN: Type inference failed for: r33v20 */
    /* JADX WARN: Type inference failed for: r33v21 */
    /* JADX WARN: Type inference failed for: r33v31 */
    /* JADX WARN: Type inference failed for: r33v32 */
    /* JADX WARN: Type inference failed for: r33v33 */
    /* JADX WARN: Type inference failed for: r33v34 */
    /* JADX WARN: Type inference failed for: r33v35 */
    /* JADX WARN: Type inference failed for: r34v10 */
    /* JADX WARN: Type inference failed for: r34v11 */
    /* JADX WARN: Type inference failed for: r34v12 */
    /* JADX WARN: Type inference failed for: r34v19 */
    /* JADX WARN: Type inference failed for: r34v23 */
    /* JADX WARN: Type inference failed for: r34v24 */
    /* JADX WARN: Type inference failed for: r34v6 */
    /* JADX WARN: Type inference failed for: r34v7 */
    /* JADX WARN: Type inference failed for: r34v8 */
    /* JADX WARN: Type inference failed for: r34v9 */
    /* JADX WARN: Type inference failed for: r37v1 */
    /* JADX WARN: Type inference failed for: r37v10 */
    /* JADX WARN: Type inference failed for: r37v11 */
    /* JADX WARN: Type inference failed for: r37v12 */
    /* JADX WARN: Type inference failed for: r37v15 */
    /* JADX WARN: Type inference failed for: r37v16 */
    /* JADX WARN: Type inference failed for: r37v17 */
    /* JADX WARN: Type inference failed for: r37v18 */
    /* JADX WARN: Type inference failed for: r37v19 */
    /* JADX WARN: Type inference failed for: r37v2 */
    /* JADX WARN: Type inference failed for: r37v20 */
    /* JADX WARN: Type inference failed for: r37v22 */
    /* JADX WARN: Type inference failed for: r37v23 */
    /* JADX WARN: Type inference failed for: r37v24 */
    /* JADX WARN: Type inference failed for: r37v25 */
    /* JADX WARN: Type inference failed for: r37v28 */
    /* JADX WARN: Type inference failed for: r37v29 */
    /* JADX WARN: Type inference failed for: r37v8 */
    /* JADX WARN: Type inference failed for: r37v9 */
    /* JADX WARN: Type inference failed for: r3v252 */
    /* JADX WARN: Type inference failed for: r3v254 */
    /* JADX WARN: Type inference failed for: r3v334 */
    /* JADX WARN: Type inference failed for: r40v21 */
    /* JADX WARN: Type inference failed for: r40v22 */
    /* JADX WARN: Type inference failed for: r40v23 */
    /* JADX WARN: Type inference failed for: r40v25 */
    /* JADX WARN: Type inference failed for: r40v26 */
    /* JADX WARN: Type inference failed for: r40v27 */
    /* JADX WARN: Type inference failed for: r40v28 */
    /* JADX WARN: Type inference failed for: r40v29 */
    /* JADX WARN: Type inference failed for: r40v30 */
    /* JADX WARN: Type inference failed for: r40v36 */
    /* JADX WARN: Type inference failed for: r40v39 */
    /* JADX WARN: Type inference failed for: r40v42 */
    /* JADX WARN: Type inference failed for: r40v43 */
    /* JADX WARN: Type inference failed for: r40v44 */
    /* JADX WARN: Type inference failed for: r40v45 */
    /* JADX WARN: Type inference failed for: r40v46 */
    /* JADX WARN: Type inference failed for: r42v11 */
    /* JADX WARN: Type inference failed for: r42v12 */
    /* JADX WARN: Type inference failed for: r42v13 */
    /* JADX WARN: Type inference failed for: r4v193, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v260 */
    /* JADX WARN: Type inference failed for: r4v262 */
    /* JADX WARN: Type inference failed for: r4v320, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r4v321, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v361 */
    /* JADX WARN: Type inference failed for: r5v113 */
    /* JADX WARN: Type inference failed for: r5v114 */
    /* JADX WARN: Type inference failed for: r5v124, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v27, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r7v106, types: [java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r7v108 */
    /* JADX WARN: Type inference failed for: r7v190, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v191, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v340 */
    public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context, int i, int i2, int i3) throws Throwable {
        int i4;
        int i5;
        String[] strArr;
        ?? r37;
        byte b2;
        int i6;
        int i7;
        int i8;
        int length;
        int length2;
        byte b3;
        int i9;
        int i10;
        int i11;
        byte b4;
        String str;
        int i12;
        long j;
        int i13;
        int i14;
        Object obj;
        int i15;
        ?? r40;
        long j2;
        int i16;
        ?? r41;
        ?? r38;
        ?? r34;
        ?? r33;
        ?? r3;
        ?? r7;
        Object[] objArr;
        ?? r35;
        Process processExec;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Throwable th;
        Throwable cause;
        byte b5;
        byte b6;
        ?? r42;
        InterruptedException interruptedException;
        Throwable th2;
        long nanos;
        float f;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        int i17;
        String[] strArrSplit;
        int length3;
        int i18;
        String str2;
        Object[] objArr2;
        ?? r5;
        Object[] objArr3;
        Object[] objArr4;
        ?? Split;
        int i19;
        int i20;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        int i21;
        Object obj2;
        long j3;
        int i22;
        int i23;
        int i24;
        int i25 = i;
        int i26 = 0;
        char c = 1;
        if (context != null) {
            try {
                int i27 = -(ViewConfiguration.getScrollBarSize() >> 8);
                Object[] objArr5 = new Object[1];
                a(new char[]{62951, 25017, 63819, 30066, 39374, 4493, 35337, 1991, 2783, 32130, 54015, 17035, 25856, 63364, 34530, 34796, 35248, 5895, 53903, 46440, 37969, 9920, 13324, 17869, 15449, 58082}, ((i27 | 23) << 1) - (i27 ^ 23), objArr5);
                Class<?> cls = Class.forName((String) objArr5[0]);
                int i28 = -ExpandableListView.getPackedPositionType(0L);
                Object[] objArr6 = new Object[1];
                a(new char[]{30809, 3834, 24855, 2652, 46113, 17876, 1374, 30994, 63985, 13202, 15574, 53513, 4518, 20887, 38613, 23555}, (i28 & 14) + (i28 | 14), objArr6);
                String str3 = (String) cls.getMethod((String) objArr6[0], null).invoke(context, null);
                int i29 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int iB = VoucherRequest.b();
                int i30 = i29 * 659;
                int i31 = (i30 & (-15111)) + (i30 | (-15111));
                int i32 = ~i29;
                int i33 = ~((i32 ^ 23) | (i32 & 23));
                int i34 = ~((-24) | i29);
                int i35 = (i33 ^ i34) | (i34 & i33);
                int i36 = ~((i29 ^ iB) | (iB & i29));
                int i37 = (i35 | i36) * (-658);
                int i38 = (((i31 ^ i37) + ((i37 & i31) << 1)) - (~((~(((-24) ^ i29) | ((-24) & i29))) * 658))) - 1;
                int i39 = ~((i29 & (-24)) | ((-24) ^ i29));
                int i40 = -(-(((i39 & i36) | (i39 ^ i36)) * 658));
                int i41 = (i38 & i40) + (i40 | i38);
                Object[] objArr7 = new Object[1];
                a(new char[]{62951, 25017, 63819, 30066, 39374, 4493, 35337, 1991, 2783, 32130, 54015, 17035, 25856, 63364, 34530, 34796, 35248, 5895, 53903, 46440, 37969, 9920, 13324, 17869, 15449, 58082}, i41, objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                int i42 = -TextUtils.lastIndexOf("", '0');
                int iB2 = VoucherRequest.b();
                int i43 = i42 * 673;
                int i44 = ((i43 | (-22831)) << 1) - (i43 ^ (-22831));
                int i45 = ~(i42 | iB2);
                int i46 = (i44 - (~(((i45 ^ 17) | (i45 & 17)) * 672))) - 1;
                int i47 = ~i42;
                int i48 = ~iB2;
                int i49 = ~((i47 ^ i48) | (i47 & i48));
                int i50 = ~((iB2 ^ 17) | (iB2 & 17));
                int i51 = i46 + (((i49 ^ i50) | (i50 & i49)) * (-672));
                int i52 = ~(i48 | (-18));
                int i53 = ~(i42 | (-18));
                int i54 = ((i53 & i52) | (i52 ^ i53)) * 672;
                int i55 = (i51 & i54) + (i54 | i51);
                Object[] objArr8 = new Object[1];
                c(new int[]{-436322370, -1998585848, -996598695, 1333921493, -1500772836, -1474034498, 2115094759, -1156254309, 216751811, 1227715267, -2134256404, 436393562}, i55, objArr8);
                Object objInvoke = cls2.getMethod((String) objArr8[0], null).invoke(context, null);
                byte[] bArr = $$a;
                byte b7 = bArr[28];
                Object[] objArr9 = new Object[1];
                d(b7, bArr[13], b7, objArr9);
                Class<?> cls3 = Class.forName((String) objArr9[0]);
                byte b8 = (byte) 32;
                Object[] objArr10 = new Object[1];
                d(bArr[0], b8, bArr[40], objArr10);
                int iIndexOf = ((String) cls3.getField((String) objArr10[0]).get(objInvoke)).indexOf(str3);
                if (iIndexOf > 0) {
                    byte b9 = bArr[28];
                    Object[] objArr11 = new Object[1];
                    d(b9, bArr[13], b9, objArr11);
                    Class<?> cls4 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    d(bArr[0], b8, bArr[40], objArr12);
                    String str4 = (String) cls4.getField((String) objArr12[0]).get(objInvoke);
                    int length4 = str4.length();
                    int iB3 = VoucherRequest.b();
                    int i56 = -(-(length4 * (-657)));
                    int i57 = ((-10544) & i56) + (i56 | (-10544));
                    int i58 = ~(15 | length4);
                    int i59 = ~length4;
                    int i60 = ~((i59 ^ (-16)) | (i59 & (-16)));
                    int i61 = (i58 ^ i60) | (i58 & i60);
                    int i62 = ((-16) ^ iB3) | ((-16) & iB3);
                    int i63 = ~i62;
                    int i64 = -(-(((i61 ^ i63) | (i63 & i61)) * (-658)));
                    int i65 = (i57 ^ i64) + ((i57 & i64) << 1);
                    int i66 = -(-((~((~length4) | (-16))) * 658));
                    int i67 = (i65 ^ i66) + ((i66 & i65) << 1);
                    int i68 = ~i62;
                    int i69 = ((i68 & i60) | (i60 ^ i68)) * 658;
                    i6 = ((i67 | i69) << 1) - (i69 ^ i67);
                    if (i6 >= 0) {
                        int i70 = 0;
                        while (true) {
                            if (i70 > i6) {
                                length2 = iIndexOf;
                                b3 = b8;
                                i9 = 0;
                                break;
                            }
                            String strSubstring = str4.substring(i70, i70 + 16);
                            try {
                                Object[] objArr13 = new Object[2];
                                objArr13[c] = 931995;
                                objArr13[i26] = strSubstring;
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                    char c2 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
                                    int iIndexOf2 = 3393 - TextUtils.indexOf("", "", i26, i26);
                                    int i71 = 9 - (TypedValue.complexToFraction(i26, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i26, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                    byte[] bArr2 = $$d;
                                    byte b10 = bArr2[37];
                                    Object[] objArr14 = new Object[1];
                                    e(b10, (byte) (b10 & 14), (byte) (bArr2[7] - 1), objArr14);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, iIndexOf2, i71, 1203525406, false, (String) objArr14[0], new Class[]{String.class, Integer.TYPE});
                                }
                                long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr13)).longValue();
                                long j4 = 1183196188;
                                long j5 = 184;
                                b3 = b8;
                                length2 = iIndexOf;
                                long j6 = -1;
                                j = j4 ^ j6;
                                i24 = i70;
                                long j7 = i25;
                                long j8 = j7 ^ j6;
                                long j9 = (((long) (-183)) * j4) + (((long) 185) * jLongValue) + ((((j | jLongValue) ^ j6) | ((j8 | jLongValue) ^ j6)) * j5) + (((long) (-184)) * ((((jLongValue ^ j6) | j4) ^ j6) | j7)) + (j5 * ((j | j8) ^ j6)) + ((long) (-1185266065));
                                i25 = i;
                                int i72 = ~((~i25) | (-2115174872));
                                int i73 = ((int) (j9 >> 32)) & (((4237352 | i72) * (-374)) + 1113218074 + ((i72 | (-2119412224)) * 374));
                                int i74 = (int) Runtime.getRuntime().totalMemory();
                                int i75 = ~i74;
                                int i76 = ((int) j9) & (721513213 + (((~(1959936388 | i75)) | 16853073) * 184) + ((i74 | 1078984964) * (-184)) + ((~((-897804498) | i75)) * 184));
                                if (((i73 & i76) | (i73 ^ i76)) == -725904754) {
                                    i9 = 1;
                                    break;
                                }
                                i70 = ((i24 | 1) << 1) - (i24 ^ 1);
                                b8 = b3;
                                iIndexOf = length2;
                                str4 = str4;
                                i6 = i6;
                                i26 = 0;
                                c = 1;
                            } catch (Throwable th3) {
                                Throwable cause2 = th3.getCause();
                                if (cause2 != null) {
                                    throw cause2;
                                }
                                throw th3;
                            }
                        }
                        i10 = ~i25;
                        i11 = (i25 & (-21)) | (i10 & 20);
                        int i77 = -i9;
                        int i78 = ((i9 & i77) | (i9 ^ i77)) >> 31;
                        int i79 = (i78 & i11) | ((~i78) & i25);
                        byte[] bArr3 = $$a;
                        byte b11 = bArr3[28];
                        Object[] objArr15 = new Object[1];
                        d(b11, bArr3[13], b11, objArr15);
                        Class<?> cls5 = Class.forName((String) objArr15[0]);
                        Object[] objArr16 = new Object[1];
                        b4 = b3;
                        d(bArr3[0], b4 == true ? (byte) 1 : (byte) 0, bArr3[40], objArr16);
                        str = (String) cls5.getField((String) objArr16[0]).get(objInvoke);
                        int length5 = str.length();
                        int iB4 = VoucherRequest.b();
                        int i80 = (-1416) + (length5 * 471);
                        int i81 = ~iB4;
                        int i82 = -(-(((~((i81 & 5) | (5 ^ i81))) | length5) * (-235)));
                        int i83 = (i80 & i82) + (i82 | i80);
                        int i84 = ~((5 ^ iB4) | (5 & iB4));
                        int i85 = (i83 - (~(((i84 & length5) | (length5 ^ i84)) * (-470)))) - 1;
                        int i86 = ~length5;
                        int i87 = ~((i86 & (-6)) | (i86 ^ (-6)));
                        int i88 = (length5 & 5) | (5 ^ length5);
                        int i89 = ~((i88 & iB4) | (i88 ^ iB4));
                        i12 = (i85 - (~(-(-(((i89 & i87) | (i87 ^ i89)) * 235))))) - 1;
                        if (i12 >= 0) {
                            i13 = i11;
                            i14 = i10;
                            obj = objInvoke;
                            i15 = 0;
                            j2 = j;
                            r40 = str4;
                            break;
                        }
                        i19 = 0;
                        while (true) {
                            if (i19 <= i20) {
                                objInvoke = objInvoke;
                                i20 = i12;
                                j = j;
                                str4 = str4;
                                i13 = i11;
                                i14 = i10;
                                obj = objInvoke;
                                i15 = 0;
                                j2 = j;
                                r40 = str4;
                                break;
                            }
                            objInvoke = objInvoke;
                            i20 = i12;
                            j = j;
                            str4 = str4;
                            int i90 = (-3000) + (i19 * (-500));
                            int i91 = ~i19;
                            int i92 = ~(i91 | 6);
                            int i93 = (-7) | i19;
                            int i94 = ~((i93 & i25) | (i93 ^ i25));
                            int i95 = -(-(((i92 & i94) | (i92 ^ i94)) * TypedValues.PositionType.TYPE_TRANSITION_EASING));
                            int i96 = (i90 & i95) + (i90 | i95) + ((~((i91 & (-7)) | ((-7) ^ i91))) * 1002);
                            int i97 = ((-7) & i10) | ((-7) ^ i10);
                            int i98 = -(-((~((i97 & i19) | (i97 ^ i19))) * TypedValues.PositionType.TYPE_TRANSITION_EASING));
                            Object[] objArr17 = {str.substring(i19, (i96 ^ i98) + ((i98 & i96) << 1)), 931995};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                int i99 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 3394;
                                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 9;
                                byte[] bArr4 = $$d;
                                byte b12 = bArr4[37];
                                Object[] objArr18 = new Object[1];
                                e(b12, (byte) (b12 & 14), (byte) (bArr4[7] - 1), objArr18);
                                i6 = i99;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(doubleTapTimeout, i6, absoluteGravity, 1203525406, false, (String) objArr18[0], new Class[]{String.class, Integer.TYPE});
                            }
                            long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr17)).longValue();
                            long j10 = 944617436;
                            i21 = i19;
                            long j11 = -318;
                            i13 = i11;
                            i14 = i10;
                            obj2 = objInvoke;
                            long j12 = -1;
                            j3 = j10 ^ j12;
                            long j13 = jLongValue2 ^ j12;
                            long j14 = i25;
                            long j15 = (((long) (-317)) * j10) + (((long) 319) * jLongValue2) + (((((j3 | j13) | j14) ^ j12) | ((((j14 ^ j12) | j10) | jLongValue2) ^ j12)) * j11) + (j11 * (((j13 | j10) ^ j12) | ((j10 | j14) ^ j12))) + (((long) TypedValues.AttributesType.TYPE_PIVOT_TARGET) * (j13 | (j12 ^ (j3 | j14)))) + ((long) (-946687313));
                            i22 = ((int) (j15 >> 32)) & ((-650032790) + ((~((-1503296439) | i25)) * 216) + (((-151015713) | i14) * (-216)) + (((~(i14 | (-1503296439))) | (-1354444447)) * 216));
                            int iMyTid = Process.myTid();
                            i23 = ((int) j15) & ((((~((-1538938928) | iMyTid)) * TypedValues.CycleType.TYPE_EASING) - 1667701959) + (((~((~iMyTid) | (-1538938928))) | 67109504) * TypedValues.CycleType.TYPE_EASING));
                            if (((i22 & i23) | (i22 ^ i23)) == -2096167706) {
                                i15 = 1;
                                j2 = i20;
                                obj = obj2;
                                r40 = j3;
                                break;
                            }
                            i19 = i21 + 1;
                            str = str;
                            i20 = i20;
                            objInvoke = obj2;
                            i10 = i14;
                            i11 = i13;
                            j = i20;
                            str4 = j3;
                        }
                        int i100 = (i15 | (-i15)) >> 31;
                        int i101 = (~i100) & i25;
                        int i102 = i13 & i100;
                        int i103 = (i102 & i101) | (i101 ^ i102);
                        int i104 = (~(i25 & i79)) & (i25 | i79);
                        int i105 = -i104;
                        int i106 = ((i104 & i105) | (i104 ^ i105)) >> 31;
                        int i107 = i103 & (~i106);
                        int i108 = i79 & i106;
                        i6 = (i108 & i107) | (i107 ^ i108);
                        byte[] bArr5 = $$a;
                        byte b13 = bArr5[28];
                        Object[] objArr19 = new Object[1];
                        d(b13, bArr5[13], b13, objArr19);
                        Class<?> cls6 = Class.forName((String) objArr19[0]);
                        Object[] objArr20 = new Object[1];
                        d(bArr5[0], b4 == true ? (byte) 1 : (byte) 0, bArr5[40], objArr20);
                        Object obj3 = obj;
                        String str5 = (String) cls6.getField((String) objArr20[0]).get(obj3);
                        int i109 = length2;
                        int i110 = ~i109;
                        int i111 = -i110;
                        String strSubstring2 = str5.substring(0, i109 & (((i110 & i111) | (i110 ^ i111)) >> 31));
                        int i112 = -AndroidCharacter.getMirror('0');
                        int i113 = i112 * (-721);
                        int i114 = (i113 ^ (-35329)) + ((i113 & (-35329)) << 1);
                        int i115 = ~i112;
                        int i116 = i14 | (~((i115 ^ (-50)) | (i115 & (-50))));
                        int i117 = (i112 ^ 49) | (i112 & 49);
                        int i118 = ~i117;
                        int i119 = (i114 - (~(-(-(((i116 & i118) | (i116 ^ i118)) * 1444))))) - 1;
                        int i120 = (~i117) | (~((i112 ^ i25) | (i112 & i25)));
                        int i121 = ~((i25 ^ 49) | (i25 & 49));
                        int i122 = -(-(((i120 & i121) | (i120 ^ i121)) * (-1444)));
                        int i123 = (i119 ^ i122) + ((i122 & i119) << 1);
                        int i124 = ~((i115 & 49) | (i115 ^ 49));
                        int i125 = ~((i112 & (-50)) | ((-50) ^ i112));
                        int i126 = ((i125 & i124) | (i124 ^ i125)) * 722;
                        Object[] objArr21 = new Object[1];
                        c(new int[]{1613856900, -1874407086, -725003307, -557480267}, (i123 & i126) + (i126 | i123), objArr21);
                        String[] strArrSplit2 = strSubstring2.split((String) objArr21[0]);
                        length2 = strArrSplit2.length;
                        i16 = 0;
                        r3 = strArrSplit2;
                        r38 = obj3;
                        r33 = j2;
                        r34 = obj;
                        r38 = i24;
                        r41 = r40;
                        while (i16 < length2) {
                            r7 = r3[i16];
                            objArr = new Object[1];
                            c(new int[]{-923441544, 1362894970, 1198674095, -1637055726}, 4 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
                            if (r7.split((String) objArr[0]).length > 1) {
                                synchronized (((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (Process.myPid() >> 22), 2267 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 32 - TextUtils.lastIndexOf("", '0')))) {
                                    try {
                                        try {
                                            int iLastIndexOf = TextUtils.lastIndexOf("", '0');
                                            int i127 = (iLastIndexOf ^ 17) + ((iLastIndexOf & 17) << 1);
                                            Object[] objArr22 = new Object[1];
                                            a(new char[]{26450, 29904, 65280, 37886, 10059, 12953, 12263, 30797, 12776, 29544, 7694, 56513, 31530, 8556, 30995, 50025, 49014, 17909}, i127, objArr22);
                                            String str6 = (String) objArr22[0];
                                            try {
                                                Runtime runtime = Runtime.getRuntime();
                                                char[] cArr = {676, 56279, 49908, 16782};
                                                int pressedStateDuration = ViewConfiguration.getPressedStateDuration() >> 16;
                                                int i128 = pressedStateDuration * 55;
                                                int i129 = (i128 & (-214)) + (i128 | (-214));
                                                int i130 = ~pressedStateDuration;
                                                int i131 = ~((i130 ^ 2) | (i130 & 2));
                                                r33 = r3;
                                                int i132 = ~((i14 ^ 2) | (i14 & 2));
                                                int i133 = ((i131 ^ i132) | (i132 & i131)) * (-108);
                                                int i134 = (i129 ^ i133) + ((i133 & i129) << 1);
                                                int i135 = ~pressedStateDuration;
                                                int i136 = ~((i135 & i25) | (i135 ^ i25));
                                                int i137 = ~((-3) | pressedStateDuration);
                                                int i138 = (i136 ^ i137) | (i136 & i137);
                                                int i139 = ~i25;
                                                int i140 = ~((i139 ^ pressedStateDuration) | (i139 & pressedStateDuration));
                                                int i141 = -(-(((i138 ^ i140) | (i138 & i140)) * 54));
                                                int i142 = ((i134 | i141) << 1) - (i141 ^ i134);
                                                int i143 = ~(((-3) & pressedStateDuration) | ((-3) ^ pressedStateDuration));
                                                try {
                                                    try {
                                                        Object[] objArr23 = new Object[1];
                                                        a(cArr, (i142 - (~(((i143 & i25) | (i25 ^ i143)) * 54))) - 1, objArr23);
                                                        processExec = runtime.exec((String) objArr23[0], (String[]) null, (File) null);
                                                        try {
                                                            Object[] objArr24 = {processExec.getInputStream()};
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Drawable.resolveOpacity(0, 0), 2142 - ExpandableListView.getPackedPositionGroup(0L), 45 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -1020714777, false, null, new Class[]{InputStream.class});
                                                            }
                                                            Object objNewInstance = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr24);
                                                            try {
                                                                Object[] objArr25 = {processExec.getErrorStream()};
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                                    try {
                                                                        try {
                                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Color.red(0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2141, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 45, -1020714777, false, null, new Class[]{InputStream.class});
                                                                        } catch (Throwable th4) {
                                                                            th = th4;
                                                                            Throwable th5 = th;
                                                                            Throwable cause3 = th5.getCause();
                                                                            if (cause3 != null) {
                                                                                throw cause3;
                                                                            }
                                                                            throw th5;
                                                                        }
                                                                    } catch (Throwable th6) {
                                                                        th = th6;
                                                                    }
                                                                }
                                                                Object objNewInstance2 = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr25);
                                                                try {
                                                                    DataOutputStream dataOutputStream = new DataOutputStream(processExec.getOutputStream());
                                                                    try {
                                                                        byte[] bArr6 = $$a;
                                                                        try {
                                                                            b5 = (byte) 38;
                                                                            r38 = r38;
                                                                            r41 = b4;
                                                                            r34 = i16;
                                                                            try {
                                                                                Object[] objArr26 = new Object[1];
                                                                                d(bArr6[9], b5, (byte) (bArr6[45] - 1), objArr26);
                                                                                Class<?> cls7 = Class.forName((String) objArr26[0]);
                                                                                i6 = i6;
                                                                                b6 = (byte) 29;
                                                                                r42 = r7;
                                                                                try {
                                                                                    Object[] objArr27 = new Object[1];
                                                                                    d(bArr6[35], (byte) (bArr6[10] + 1), b6, objArr27);
                                                                                    cls7.getMethod((String) objArr27[0], null).invoke(objNewInstance, null);
                                                                                    try {
                                                                                        try {
                                                                                            Object[] objArr28 = new Object[1];
                                                                                            d(bArr6[9], b5, (byte) (bArr6[45] - 1), objArr28);
                                                                                            Class<?> cls8 = Class.forName((String) objArr28[0]);
                                                                                            byte b14 = bArr6[35];
                                                                                            byte b15 = (byte) (bArr6[10] + 1);
                                                                                            Object[] objArr29 = new Object[1];
                                                                                            d(b14, b15, b6, objArr29);
                                                                                            cls8.getMethod((String) objArr29[0], null).invoke(objNewInstance2, null);
                                                                                            try {
                                                                                                StringBuilder sb = new StringBuilder();
                                                                                                sb.append(str6);
                                                                                                Object[] objArr30 = new Object[1];
                                                                                                a(new char[]{28163, 3554, 47032, 33674}, (Process.myPid() >> 22) + 1, objArr30);
                                                                                                sb.append((String) objArr30[0]);
                                                                                                String string = sb.toString();
                                                                                                int offsetBefore = TextUtils.getOffsetBefore("", 0);
                                                                                                int i144 = (offsetBefore ^ 5) + ((offsetBefore & 5) << 1);
                                                                                                Object[] objArr31 = new Object[1];
                                                                                                c(new int[]{-1382838039, -96327287, -842118464, 494828356, 72575729, 1571017381}, i144, objArr31);
                                                                                                dataOutputStream.write(string.getBytes((String) objArr31[0]));
                                                                                                dataOutputStream.flush();
                                                                                                int i145 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                                                                int i146 = (i145 * (-574)) - 3444;
                                                                                                int i147 = ~i145;
                                                                                                int i148 = ~(i147 | i14);
                                                                                                int i149 = ~((-7) | i25);
                                                                                                int i150 = ((i148 & i149) | (i148 ^ i149)) * 1150;
                                                                                                int i151 = (((i146 ^ i150) + ((i146 & i150) << 1)) - (~(((~(((-7) & i25) | ((-7) ^ i25))) | (~((i14 ^ 6) | (i14 & 6)))) * (-575)))) - 1;
                                                                                                int i152 = ~((i147 ^ i25) | (i147 & i25));
                                                                                                int i153 = ~((i14 & i145) | (i14 ^ i145));
                                                                                                int i154 = i151 + (((i153 & i152) | (i152 ^ i153)) * 575);
                                                                                                Object[] objArr32 = new Object[1];
                                                                                                a(new char[]{60120, 47227, 2335, 47480, 28055, 23926, 32095, 60197}, i154, objArr32);
                                                                                                String str7 = (String) objArr32[0];
                                                                                                Object[] objArr33 = new Object[1];
                                                                                                c(new int[]{-1382838039, -96327287, -842118464, 494828356, 72575729, 1571017381}, 5 - (~(-(-TextUtils.lastIndexOf("", '0', 0)))), objArr33);
                                                                                                dataOutputStream.write(str7.getBytes((String) objArr33[0]));
                                                                                                dataOutputStream.flush();
                                                                                                try {
                                                                                                    long jNanoTime = System.nanoTime();
                                                                                                    nanos = TimeUnit.MILLISECONDS.toNanos(2000L);
                                                                                                    while (true) {
                                                                                                        try {
                                                                                                            processExec.exitValue();
                                                                                                            f = nanos;
                                                                                                            break;
                                                                                                        } catch (IllegalThreadStateException unused) {
                                                                                                            if (nanos > 0) {
                                                                                                                try {
                                                                                                                    Object[] objArr34 = {Long.valueOf(Math.min(TimeUnit.NANOSECONDS.toMillis(nanos) + 1, 3L))};
                                                                                                                    byte[] bArr7 = $$a;
                                                                                                                    Object[] objArr35 = new Object[1];
                                                                                                                    d(bArr7[9], b5, (byte) (bArr7[45] - 1), objArr35);
                                                                                                                    Class<?> cls9 = Class.forName((String) objArr35[0]);
                                                                                                                    Object[] objArr36 = new Object[1];
                                                                                                                    d(bArr7[35], (byte) 57, b6, objArr36);
                                                                                                                    cls9.getMethod((String) objArr36[0], Long.TYPE).invoke(null, objArr34);
                                                                                                                } catch (Throwable th7) {
                                                                                                                    Throwable cause4 = th7.getCause();
                                                                                                                    if (cause4 != null) {
                                                                                                                        throw cause4;
                                                                                                                    }
                                                                                                                    throw th7;
                                                                                                                }
                                                                                                            }
                                                                                                            try {
                                                                                                                long nanos2 = TimeUnit.MILLISECONDS.toNanos(2000L) - (System.nanoTime() - jNanoTime);
                                                                                                                f = nanos2;
                                                                                                                if (nanos2 <= 0) {
                                                                                                                    break;
                                                                                                                }
                                                                                                                nanos = nanos2;
                                                                                                            } catch (InterruptedException e2) {
                                                                                                                e = e2;
                                                                                                                interruptedException = e;
                                                                                                                try {
                                                                                                                    throw interruptedException;
                                                                                                                } catch (Throwable th8) {
                                                                                                                    th = th8;
                                                                                                                    th2 = th;
                                                                                                                    try {
                                                                                                                        processExec.destroy();
                                                                                                                        throw th2;
                                                                                                                    } catch (Exception unused2) {
                                                                                                                        throw th2;
                                                                                                                    }
                                                                                                                }
                                                                                                            } catch (Throwable th9) {
                                                                                                                th = th9;
                                                                                                                th2 = th;
                                                                                                                processExec.destroy();
                                                                                                                throw th2;
                                                                                                            }
                                                                                                        } catch (InterruptedException e3) {
                                                                                                            e = e3;
                                                                                                            interruptedException = e;
                                                                                                            throw interruptedException;
                                                                                                        } catch (Throwable th10) {
                                                                                                            th = th10;
                                                                                                            th2 = th;
                                                                                                            processExec.destroy();
                                                                                                            throw th2;
                                                                                                        }
                                                                                                    }
                                                                                                    try {
                                                                                                        try {
                                                                                                            dataOutputStream.close();
                                                                                                        } catch (IOException unused3) {
                                                                                                        }
                                                                                                        try {
                                                                                                            try {
                                                                                                                Object[] objArr37 = {100L};
                                                                                                                byte[] bArr8 = $$a;
                                                                                                                try {
                                                                                                                    Object[] objArr38 = new Object[1];
                                                                                                                    d(bArr8[9], b5, (byte) (bArr8[45] - 1), objArr38);
                                                                                                                    Class<?> cls10 = Class.forName((String) objArr38[0]);
                                                                                                                    try {
                                                                                                                        byte b16 = bArr8[9];
                                                                                                                        byte b17 = bArr8[21];
                                                                                                                        Object[] objArr39 = new Object[1];
                                                                                                                        d(b16, b17, (byte) (b17 >>> 1), objArr39);
                                                                                                                        cls10.getMethod((String) objArr39[0], Long.TYPE).invoke(objNewInstance, objArr37);
                                                                                                                        try {
                                                                                                                            Object[] objArr40 = {10L};
                                                                                                                            try {
                                                                                                                                Object[] objArr41 = new Object[1];
                                                                                                                                d(bArr8[9], b5, (byte) (bArr8[45] - 1), objArr41);
                                                                                                                                Class<?> cls11 = Class.forName((String) objArr41[0]);
                                                                                                                                try {
                                                                                                                                    byte b18 = bArr8[9];
                                                                                                                                    byte b19 = bArr8[21];
                                                                                                                                    Object[] objArr42 = new Object[1];
                                                                                                                                    d(b18, b19, (byte) (b19 >>> 1), objArr42);
                                                                                                                                    cls11.getMethod((String) objArr42[0], Long.TYPE).invoke(objNewInstance2, objArr40);
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            processExec.destroy();
                                                                                                                                        } catch (Exception unused4) {
                                                                                                                                        }
                                                                                                                                        try {
                                                                                                                                            StringBuilder sb2 = new StringBuilder();
                                                                                                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                                                                                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                                                                                                                char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                                                                                                                                                int i155 = 2143 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                                                                                                                int touchSlop = 45 - (ViewConfiguration.getTouchSlop() >> 8);
                                                                                                                                                byte[] bArr9 = $$d;
                                                                                                                                                byte b20 = bArr9[37];
                                                                                                                                                Object[] objArr43 = new Object[1];
                                                                                                                                                e(b20, (byte) (b20 + 1), bArr9[7], objArr43);
                                                                                                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(fadingEdgeLength, i155, touchSlop, 399405187, false, (String) objArr43[0], null);
                                                                                                                                            }
                                                                                                                                            sb2.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(objNewInstance).toString());
                                                                                                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                                                                                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                                                                                                                char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                                                                                                                int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2142;
                                                                                                                                                int bitsPerPixel = 44 - ImageFormat.getBitsPerPixel(0);
                                                                                                                                                byte[] bArr10 = $$d;
                                                                                                                                                byte b21 = bArr10[37];
                                                                                                                                                Object[] objArr44 = new Object[1];
                                                                                                                                                e(b21, (byte) (b21 + 1), bArr10[7], objArr44);
                                                                                                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maximumDrawingCacheSize, keyRepeatDelay, bitsPerPixel, 399405187, false, (String) objArr44[0], null);
                                                                                                                                            }
                                                                                                                                            sb2.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(objNewInstance2).toString());
                                                                                                                                            String string2 = sb2.toString();
                                                                                                                                            try {
                                                                                                                                                Object[] objArr45 = new Object[1];
                                                                                                                                                a(new char[]{28163, 3554, 47032, 33674}, -TextUtils.lastIndexOf("", '0', 0, 0), objArr45);
                                                                                                                                                strArrSplit = string2.split((String) objArr45[0]);
                                                                                                                                                length3 = strArrSplit.length;
                                                                                                                                                i18 = 0;
                                                                                                                                                while (true) {
                                                                                                                                                    if (i18 < length3) {
                                                                                                                                                        str2 = strArrSplit[i18];
                                                                                                                                                        int[] iArr = {-2064892275, 1023043301, -1508307050, -1562984321, 1821184149, 858712626, -295967294, 299662355, 1292647012, 1618703361, 1368389795, 296511751};
                                                                                                                                                        int i156 = -TextUtils.indexOf("", "");
                                                                                                                                                        objArr2 = new Object[1];
                                                                                                                                                        c(iArr, (i156 & 19) + (i156 | 19), objArr2);
                                                                                                                                                        if (str2.startsWith((String) objArr2[0])) {
                                                                                                                                                            r5 = r42;
                                                                                                                                                        } else {
                                                                                                                                                            char[] cArr2 = {54670, 55753, 57741, 34340, 61896, 1451, 23598, 63508, 6326, 11585, 55785, 42530, 39511, 43812, 24161, 2290, 61510, 57407, 7548, 22093, 7658, 53175};
                                                                                                                                                            int iGreen = Color.green(0);
                                                                                                                                                            int i157 = (iGreen ^ 20) + ((iGreen & 20) << 1);
                                                                                                                                                            objArr3 = new Object[1];
                                                                                                                                                            a(cArr2, i157, objArr3);
                                                                                                                                                            if (!str2.startsWith((String) objArr3[0])) {
                                                                                                                                                                int[] iArr2 = {-1696394750, 310008150, 1398789221, 1651918692, 814651849, -100832883};
                                                                                                                                                                int i158 = -TextUtils.lastIndexOf("", '0');
                                                                                                                                                                int i159 = (i158 * (-244)) + 1722 + (((~(((-8) & i14) | ((-8) ^ i14))) | (~(((-8) & i158) | ((-8) ^ i158)))) * (-245));
                                                                                                                                                                i17 = i;
                                                                                                                                                                int i160 = ~(((-8) & i17) | ((-8) ^ i17));
                                                                                                                                                                int i161 = i160 * (-245);
                                                                                                                                                                int i162 = (i159 & i161) + (i159 | i161);
                                                                                                                                                                int i163 = -(-(((i158 & i160) | (i158 ^ i160)) * 245));
                                                                                                                                                                try {
                                                                                                                                                                    objArr4 = new Object[1];
                                                                                                                                                                    c(iArr2, (i162 & i163) + (i163 | i162), objArr4);
                                                                                                                                                                    if (str2.startsWith((String) objArr4[0])) {
                                                                                                                                                                        int capsMode = TextUtils.getCapsMode("", 0, 0);
                                                                                                                                                                        int iB5 = VoucherRequest.b();
                                                                                                                                                                        int i164 = (capsMode * (-445)) - 445;
                                                                                                                                                                        int i165 = ~capsMode;
                                                                                                                                                                        int i166 = (i165 & (-2)) | (i165 ^ (-2));
                                                                                                                                                                        int i167 = ~i166;
                                                                                                                                                                        int i168 = ~((-2) | (~iB5));
                                                                                                                                                                        int i169 = ((i167 & i168) | (i167 ^ i168)) * 446;
                                                                                                                                                                        int i170 = (i164 & i169) + (i164 | i169);
                                                                                                                                                                        int i171 = ((~((capsMode & (-2)) | ((-2) ^ capsMode) | iB5)) | (~((~capsMode) | 1))) * 446;
                                                                                                                                                                        int i172 = ((i170 | i171) << 1) - (i171 ^ i170);
                                                                                                                                                                        int i173 = -(-((~i166) * 446));
                                                                                                                                                                        int i174 = (i172 & i173) + (i173 | i172);
                                                                                                                                                                        Object[] objArr46 = new Object[1];
                                                                                                                                                                        c(new int[]{-439873869, -103435319, -1527581425, 2005065970}, i174, objArr46);
                                                                                                                                                                        Split = str2.split((String) objArr46[0]);
                                                                                                                                                                        if (Split.length > 1) {
                                                                                                                                                                            r5 = r42;
                                                                                                                                                                            if (Split[1].equalsIgnoreCase(r5)) {
                                                                                                                                                                                int i175 = (~(i17 & i6)) & (i17 | i6);
                                                                                                                                                                                int i176 = -i175;
                                                                                                                                                                                int i177 = ((i175 & i176) | (i175 ^ i176)) >> 31;
                                                                                                                                                                                i6 = (i6 & i177) | (i13 & (~i177));
                                                                                                                                                                                i25 = i17;
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                } catch (IOException unused5) {
                                                                                                                                                                    i25 = i17;
                                                                                                                                                                    i6 = i6;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            r5 = r42;
                                                                                                                                                        }
                                                                                                                                                        i18 = ((i18 | 1) << 1) - (i18 ^ 1);
                                                                                                                                                        r42 = r5;
                                                                                                                                                    } else {
                                                                                                                                                        i25 = i;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            } catch (IOException unused6) {
                                                                                                                                                i17 = i;
                                                                                                                                            }
                                                                                                                                        } catch (Exception unused7) {
                                                                                                                                            int i178 = -Drawable.resolveOpacity(0, 0);
                                                                                                                                            int i179 = (i178 ^ 27) + ((i178 & 27) << 1);
                                                                                                                                            Object[] objArr47 = new Object[1];
                                                                                                                                            a(new char[]{47581, 10421, 41631, 62711, 23723, 48681, 17301, 62458, 57019, 26563, 4491, 2372, 12251, 15612, 59974, 15637, 23968, 39154, 44686, 41339, 12467, 724, 61221, 53890, 9433, 53025, 15068, 45183, 44511, 24851}, i179, objArr47);
                                                                                                                                            throw new IOException((String) objArr47[0]);
                                                                                                                                        }
                                                                                                                                    } catch (IOException unused8) {
                                                                                                                                    }
                                                                                                                                } catch (Throwable th11) {
                                                                                                                                    th = th11;
                                                                                                                                    Throwable th12 = th;
                                                                                                                                    Throwable cause5 = th12.getCause();
                                                                                                                                    if (cause5 != null) {
                                                                                                                                        throw cause5;
                                                                                                                                    }
                                                                                                                                    throw th12;
                                                                                                                                }
                                                                                                                            } catch (Throwable th13) {
                                                                                                                                th = th13;
                                                                                                                            }
                                                                                                                        } catch (Throwable th14) {
                                                                                                                            th = th14;
                                                                                                                        }
                                                                                                                    } catch (Throwable th15) {
                                                                                                                        th = th15;
                                                                                                                        Throwable th16 = th;
                                                                                                                        Throwable cause6 = th16.getCause();
                                                                                                                        if (cause6 != null) {
                                                                                                                            throw cause6;
                                                                                                                        }
                                                                                                                        throw th16;
                                                                                                                    }
                                                                                                                } catch (Throwable th17) {
                                                                                                                    th = th17;
                                                                                                                }
                                                                                                            } catch (Throwable th18) {
                                                                                                                th = th18;
                                                                                                            }
                                                                                                        } catch (InterruptedException e4) {
                                                                                                            interruptedException = e4;
                                                                                                            throw interruptedException;
                                                                                                        } catch (Throwable th19) {
                                                                                                            th2 = th19;
                                                                                                            processExec.destroy();
                                                                                                            throw th2;
                                                                                                        }
                                                                                                    } catch (InterruptedException e5) {
                                                                                                        e = e5;
                                                                                                        interruptedException = e;
                                                                                                        throw interruptedException;
                                                                                                    } catch (Throwable th20) {
                                                                                                        th = th20;
                                                                                                        th2 = th;
                                                                                                        processExec.destroy();
                                                                                                        throw th2;
                                                                                                    }
                                                                                                } catch (InterruptedException e6) {
                                                                                                    e = e6;
                                                                                                } catch (Throwable th21) {
                                                                                                    th = th21;
                                                                                                }
                                                                                            } catch (IOException unused9) {
                                                                                            } catch (Exception unused10) {
                                                                                                int i1710 = -Drawable.resolveOpacity(0, 0);
                                                                                                int i1711 = (i1710 ^ 27) + ((i1710 & 27) << 1);
                                                                                                Object[] objArr48 = new Object[1];
                                                                                                a(new char[]{47581, 10421, 41631, 62711, 23723, 48681, 17301, 62458, 57019, 26563, 4491, 2372, 12251, 15612, 59974, 15637, 23968, 39154, 44686, 41339, 12467, 724, 61221, 53890, 9433, 53025, 15068, 45183, 44511, 24851}, i1711, objArr48);
                                                                                                throw new IOException((String) objArr48[0]);
                                                                                            }
                                                                                        } catch (Throwable th22) {
                                                                                            th = th22;
                                                                                            Throwable th23 = th;
                                                                                            Throwable cause7 = th23.getCause();
                                                                                            if (cause7 != null) {
                                                                                                throw cause7;
                                                                                            }
                                                                                            throw th23;
                                                                                        }
                                                                                    } catch (Throwable th24) {
                                                                                        th = th24;
                                                                                    }
                                                                                } catch (Throwable th25) {
                                                                                    th = th25;
                                                                                    th = th;
                                                                                    cause = th.getCause();
                                                                                    if (cause != null) {
                                                                                        throw cause;
                                                                                    }
                                                                                    throw th;
                                                                                }
                                                                            } catch (Throwable th26) {
                                                                                th = th26;
                                                                            }
                                                                        } catch (Throwable th27) {
                                                                            th = th27;
                                                                            th = th;
                                                                            cause = th.getCause();
                                                                            if (cause != null) {
                                                                                throw cause;
                                                                            }
                                                                            throw th;
                                                                        }
                                                                    } catch (Throwable th28) {
                                                                        th = th28;
                                                                    }
                                                                } catch (IOException unused11) {
                                                                    i6 = i6;
                                                                    r33 = r33;
                                                                    r34 = i16;
                                                                    r41 = b4;
                                                                    i6 = i6;
                                                                    i16 = (r34 & 1) + (r34 | 1);
                                                                    length2 = length2;
                                                                    r3 = r33;
                                                                    r38 = r38;
                                                                    b4 = r41 == true ? 1 : 0;
                                                                    r33 = r33;
                                                                    r34 = r34;
                                                                    r38 = r38;
                                                                    r41 = r41;
                                                                } catch (Exception unused12) {
                                                                    int i1712 = -Drawable.resolveOpacity(0, 0);
                                                                    int i1713 = (i1712 ^ 27) + ((i1712 & 27) << 1);
                                                                    Object[] objArr49 = new Object[1];
                                                                    a(new char[]{47581, 10421, 41631, 62711, 23723, 48681, 17301, 62458, 57019, 26563, 4491, 2372, 12251, 15612, 59974, 15637, 23968, 39154, 44686, 41339, 12467, 724, 61221, 53890, 9433, 53025, 15068, 45183, 44511, 24851}, i1713, objArr49);
                                                                    throw new IOException((String) objArr49[0]);
                                                                }
                                                            } catch (Throwable th29) {
                                                                th = th29;
                                                            }
                                                        } catch (Throwable th30) {
                                                            Throwable cause8 = th30.getCause();
                                                            if (cause8 != null) {
                                                                throw cause8;
                                                            }
                                                            throw th30;
                                                        }
                                                    } catch (Exception unused13) {
                                                    }
                                                } catch (IOException unused14) {
                                                    r35 = r33;
                                                    length2 = length2;
                                                    r33 = r35;
                                                    r34 = i16;
                                                    r41 = b4;
                                                    i6 = i6;
                                                    i16 = (r34 & 1) + (r34 | 1);
                                                    length2 = length2;
                                                    r3 = r33;
                                                    r38 = r38;
                                                    b4 = r41 == true ? 1 : 0;
                                                    r33 = r33;
                                                    r34 = r34;
                                                    r38 = r38;
                                                    r41 = r41;
                                                } catch (Exception unused15) {
                                                    int i1714 = -Drawable.resolveOpacity(0, 0);
                                                    int i1715 = (i1714 ^ 27) + ((i1714 & 27) << 1);
                                                    Object[] objArr410 = new Object[1];
                                                    a(new char[]{47581, 10421, 41631, 62711, 23723, 48681, 17301, 62458, 57019, 26563, 4491, 2372, 12251, 15612, 59974, 15637, 23968, 39154, 44686, 41339, 12467, 724, 61221, 53890, 9433, 53025, 15068, 45183, 44511, 24851}, i1715, objArr410);
                                                    throw new IOException((String) objArr410[0]);
                                                }
                                            } catch (Exception unused16) {
                                            }
                                        } catch (IOException unused17) {
                                            r35 = r3;
                                        }
                                    } catch (IOException unused18) {
                                    }
                                }
                                i16 = (r34 & 1) + (r34 | 1);
                                length2 = length2;
                                r3 = r33;
                                r38 = r38;
                                b4 = r41 == true ? 1 : 0;
                                r33 = r33;
                                r34 = r34;
                                r38 = r38;
                                r41 = r41;
                            } else {
                                i6 = i6;
                                r33 = r3;
                                r38 = r38;
                                length2 = length2;
                                r34 = i16;
                                r41 = b4;
                            }
                            i6 = i6;
                            i16 = (r34 & 1) + (r34 | 1);
                            length2 = length2;
                            r3 = r33;
                            r38 = r38;
                            b4 = r41 == true ? 1 : 0;
                            r33 = r33;
                            r34 = r34;
                            r38 = r38;
                            r41 = r41;
                        }
                        r37 = r38;
                        b2 = b4;
                    } else {
                        length2 = iIndexOf;
                        b3 = b8;
                        i9 = 0;
                        i10 = ~i25;
                        i11 = (i25 & (-21)) | (i10 & 20);
                        int i710 = -i9;
                        int i711 = ((i9 & i710) | (i9 ^ i710)) >> 31;
                        int i712 = (i711 & i11) | ((~i711) & i25);
                        byte[] bArr11 = $$a;
                        byte b110 = bArr11[28];
                        Object[] objArr110 = new Object[1];
                        d(b110, bArr11[13], b110, objArr110);
                        Class<?> cls12 = Class.forName((String) objArr110[0]);
                        Object[] objArr111 = new Object[1];
                        b4 = b3;
                        d(bArr11[0], b4 == true ? (byte) 1 : (byte) 0, bArr11[40], objArr111);
                        str = (String) cls12.getField((String) objArr111[0]).get(objInvoke);
                        int length6 = str.length();
                        int iB6 = VoucherRequest.b();
                        int i810 = (-1416) + (length6 * 471);
                        int i811 = ~iB6;
                        int i812 = -(-(((~((i811 & 5) | (5 ^ i811))) | length6) * (-235)));
                        int i813 = (i810 & i812) + (i812 | i810);
                        int i814 = ~((5 ^ iB6) | (5 & iB6));
                        int i815 = (i813 - (~(((i814 & length6) | (length6 ^ i814)) * (-470)))) - 1;
                        int i816 = ~length6;
                        int i817 = ~((i816 & (-6)) | (i816 ^ (-6)));
                        int i818 = (length6 & 5) | (5 ^ length6);
                        int i819 = ~((i818 & iB6) | (i818 ^ iB6));
                        i12 = (i815 - (~(-(-(((i819 & i817) | (i817 ^ i819)) * 235))))) - 1;
                        if (i12 >= 0) {
                            i13 = i11;
                            i14 = i10;
                            obj = objInvoke;
                            i15 = 0;
                            j2 = j;
                            r40 = str4;
                            break;
                        }
                        i19 = 0;
                        while (true) {
                            if (i19 <= i20) {
                                objInvoke = objInvoke;
                                i20 = i12;
                                j = j;
                                str4 = str4;
                                i13 = i11;
                                i14 = i10;
                                obj = objInvoke;
                                i15 = 0;
                                j2 = j;
                                r40 = str4;
                                break;
                            }
                            objInvoke = objInvoke;
                            i20 = i12;
                            j = j;
                            str4 = str4;
                            int i910 = (-3000) + (i19 * (-500));
                            int i911 = ~i19;
                            int i912 = ~(i911 | 6);
                            int i913 = (-7) | i19;
                            int i914 = ~((i913 & i25) | (i913 ^ i25));
                            int i915 = -(-(((i912 & i914) | (i912 ^ i914)) * TypedValues.PositionType.TYPE_TRANSITION_EASING));
                            int i916 = (i910 & i915) + (i910 | i915) + ((~((i911 & (-7)) | ((-7) ^ i911))) * 1002);
                            int i917 = ((-7) & i10) | ((-7) ^ i10);
                            int i918 = -(-((~((i917 & i19) | (i917 ^ i19))) * TypedValues.PositionType.TYPE_TRANSITION_EASING));
                            Object[] objArr112 = {str.substring(i19, (i916 ^ i918) + ((i918 & i916) << 1)), 931995};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char doubleTapTimeout2 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                int i919 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 3394;
                                int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0) + 9;
                                byte[] bArr12 = $$d;
                                byte b111 = bArr12[37];
                                Object[] objArr113 = new Object[1];
                                e(b111, (byte) (b111 & 14), (byte) (bArr12[7] - 1), objArr113);
                                i6 = i919;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(doubleTapTimeout2, i6, absoluteGravity2, 1203525406, false, (String) objArr113[0], new Class[]{String.class, Integer.TYPE});
                            }
                            long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr112)).longValue();
                            long j16 = 944617436;
                            i21 = i19;
                            long j17 = -318;
                            i13 = i11;
                            i14 = i10;
                            obj2 = objInvoke;
                            long j18 = -1;
                            j3 = j16 ^ j18;
                            long j19 = jLongValue3 ^ j18;
                            long j110 = i25;
                            long j111 = (((long) (-317)) * j16) + (((long) 319) * jLongValue3) + (((((j3 | j19) | j110) ^ j18) | ((((j110 ^ j18) | j16) | jLongValue3) ^ j18)) * j17) + (j17 * (((j19 | j16) ^ j18) | ((j16 | j110) ^ j18))) + (((long) TypedValues.AttributesType.TYPE_PIVOT_TARGET) * (j19 | (j18 ^ (j3 | j110)))) + ((long) (-946687313));
                            i22 = ((int) (j111 >> 32)) & ((-650032790) + ((~((-1503296439) | i25)) * 216) + (((-151015713) | i14) * (-216)) + (((~(i14 | (-1503296439))) | (-1354444447)) * 216));
                            int iMyTid2 = Process.myTid();
                            i23 = ((int) j111) & ((((~((-1538938928) | iMyTid2)) * TypedValues.CycleType.TYPE_EASING) - 1667701959) + (((~((~iMyTid2) | (-1538938928))) | 67109504) * TypedValues.CycleType.TYPE_EASING));
                            if (((i22 & i23) | (i22 ^ i23)) == -2096167706) {
                                i15 = 1;
                                j2 = i20;
                                obj = obj2;
                                r40 = j3;
                                break;
                            }
                            i19 = i21 + 1;
                            str = str;
                            i20 = i20;
                            objInvoke = obj2;
                            i10 = i14;
                            i11 = i13;
                            j = i20;
                            str4 = j3;
                        }
                        int i1010 = (i15 | (-i15)) >> 31;
                        int i1011 = (~i1010) & i25;
                        int i1012 = i13 & i1010;
                        int i1013 = (i1012 & i1011) | (i1011 ^ i1012);
                        int i1014 = (~(i25 & i712)) & (i25 | i712);
                        int i1015 = -i1014;
                        int i1016 = ((i1014 & i1015) | (i1014 ^ i1015)) >> 31;
                        int i1017 = i1013 & (~i1016);
                        int i1018 = i712 & i1016;
                        i6 = (i1018 & i1017) | (i1017 ^ i1018);
                        byte[] bArr13 = $$a;
                        byte b112 = bArr13[28];
                        Object[] objArr114 = new Object[1];
                        d(b112, bArr13[13], b112, objArr114);
                        Class<?> cls13 = Class.forName((String) objArr114[0]);
                        Object[] objArr210 = new Object[1];
                        d(bArr13[0], b4 == true ? (byte) 1 : (byte) 0, bArr13[40], objArr210);
                        Object obj4 = obj;
                        String str8 = (String) cls13.getField((String) objArr210[0]).get(obj4);
                        int i1019 = length2;
                        int i1110 = ~i1019;
                        int i1111 = -i1110;
                        String strSubstring3 = str8.substring(0, i1019 & (((i1110 & i1111) | (i1110 ^ i1111)) >> 31));
                        int i1112 = -AndroidCharacter.getMirror('0');
                        int i1113 = i1112 * (-721);
                        int i1114 = (i1113 ^ (-35329)) + ((i1113 & (-35329)) << 1);
                        int i1115 = ~i1112;
                        int i1116 = i14 | (~((i1115 ^ (-50)) | (i1115 & (-50))));
                        int i1117 = (i1112 ^ 49) | (i1112 & 49);
                        int i1118 = ~i1117;
                        int i1119 = (i1114 - (~(-(-(((i1116 & i1118) | (i1116 ^ i1118)) * 1444))))) - 1;
                        int i1210 = (~i1117) | (~((i1112 ^ i25) | (i1112 & i25)));
                        int i1211 = ~((i25 ^ 49) | (i25 & 49));
                        int i1212 = -(-(((i1210 & i1211) | (i1210 ^ i1211)) * (-1444)));
                        int i1213 = (i1119 ^ i1212) + ((i1212 & i1119) << 1);
                        int i1214 = ~((i1115 & 49) | (i1115 ^ 49));
                        int i1215 = ~((i1112 & (-50)) | ((-50) ^ i1112));
                        int i1216 = ((i1215 & i1214) | (i1214 ^ i1215)) * 722;
                        Object[] objArr211 = new Object[1];
                        c(new int[]{1613856900, -1874407086, -725003307, -557480267}, (i1213 & i1216) + (i1216 | i1213), objArr211);
                        String[] strArrSplit3 = strSubstring3.split((String) objArr211[0]);
                        length2 = strArrSplit3.length;
                        i16 = 0;
                        r3 = strArrSplit3;
                        r38 = obj4;
                        r33 = j2;
                        r34 = obj;
                        r38 = i24;
                        r41 = r40;
                        while (i16 < length2) {
                            r7 = r3[i16];
                            objArr = new Object[1];
                            c(new int[]{-923441544, 1362894970, 1198674095, -1637055726}, 4 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
                            if (r7.split((String) objArr[0]).length > 1) {
                                synchronized (((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (Process.myPid() >> 22), 2267 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 32 - TextUtils.lastIndexOf("", '0')))) {
                                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0');
                                    int i1217 = (iLastIndexOf2 ^ 17) + ((iLastIndexOf2 & 17) << 1);
                                    Object[] objArr212 = new Object[1];
                                    a(new char[]{26450, 29904, 65280, 37886, 10059, 12953, 12263, 30797, 12776, 29544, 7694, 56513, 31530, 8556, 30995, 50025, 49014, 17909}, i1217, objArr212);
                                    String str9 = (String) objArr212[0];
                                    Runtime runtime2 = Runtime.getRuntime();
                                    char[] cArr3 = {676, 56279, 49908, 16782};
                                    int pressedStateDuration2 = ViewConfiguration.getPressedStateDuration() >> 16;
                                    int i1218 = pressedStateDuration2 * 55;
                                    int i1219 = (i1218 & (-214)) + (i1218 | (-214));
                                    int i1310 = ~pressedStateDuration2;
                                    int i1311 = ~((i1310 ^ 2) | (i1310 & 2));
                                    r33 = r3;
                                    int i1312 = ~((i14 ^ 2) | (i14 & 2));
                                    int i1313 = ((i1311 ^ i1312) | (i1312 & i1311)) * (-108);
                                    int i1314 = (i1219 ^ i1313) + ((i1313 & i1219) << 1);
                                    int i1315 = ~pressedStateDuration2;
                                    int i1316 = ~((i1315 & i25) | (i1315 ^ i25));
                                    int i1317 = ~((-3) | pressedStateDuration2);
                                    int i1318 = (i1316 ^ i1317) | (i1316 & i1317);
                                    int i1319 = ~i25;
                                    int i1410 = ~((i1319 ^ pressedStateDuration2) | (i1319 & pressedStateDuration2));
                                    int i1411 = -(-(((i1318 ^ i1410) | (i1318 & i1410)) * 54));
                                    int i1412 = ((i1314 | i1411) << 1) - (i1411 ^ i1314);
                                    int i1413 = ~(((-3) & pressedStateDuration2) | ((-3) ^ pressedStateDuration2));
                                    Object[] objArr213 = new Object[1];
                                    a(cArr3, (i1412 - (~(((i1413 & i25) | (i25 ^ i1413)) * 54))) - 1, objArr213);
                                    processExec = runtime2.exec((String) objArr213[0], (String[]) null, (File) null);
                                    Object[] objArr214 = {processExec.getInputStream()};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Drawable.resolveOpacity(0, 0), 2142 - ExpandableListView.getPackedPositionGroup(0L), 45 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -1020714777, false, null, new Class[]{InputStream.class});
                                    }
                                    Object objNewInstance3 = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr214);
                                    Object[] objArr215 = {processExec.getErrorStream()};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Color.red(0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2141, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 45, -1020714777, false, null, new Class[]{InputStream.class});
                                    }
                                    Object objNewInstance4 = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr215);
                                    DataOutputStream dataOutputStream2 = new DataOutputStream(processExec.getOutputStream());
                                    byte[] bArr14 = $$a;
                                    b5 = (byte) 38;
                                    r38 = r38;
                                    r41 = b4;
                                    r34 = i16;
                                    Object[] objArr216 = new Object[1];
                                    d(bArr14[9], b5, (byte) (bArr14[45] - 1), objArr216);
                                    Class<?> cls14 = Class.forName((String) objArr216[0]);
                                    i6 = i6;
                                    b6 = (byte) 29;
                                    r42 = r7;
                                    Object[] objArr217 = new Object[1];
                                    d(bArr14[35], (byte) (bArr14[10] + 1), b6, objArr217);
                                    cls14.getMethod((String) objArr217[0], null).invoke(objNewInstance3, null);
                                    Object[] objArr218 = new Object[1];
                                    d(bArr14[9], b5, (byte) (bArr14[45] - 1), objArr218);
                                    Class<?> cls15 = Class.forName((String) objArr218[0]);
                                    byte b113 = bArr14[35];
                                    byte b114 = (byte) (bArr14[10] + 1);
                                    Object[] objArr219 = new Object[1];
                                    d(b113, b114, b6, objArr219);
                                    cls15.getMethod((String) objArr219[0], null).invoke(objNewInstance4, null);
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(str9);
                                    Object[] objArr310 = new Object[1];
                                    a(new char[]{28163, 3554, 47032, 33674}, (Process.myPid() >> 22) + 1, objArr310);
                                    sb3.append((String) objArr310[0]);
                                    String string3 = sb3.toString();
                                    int offsetBefore2 = TextUtils.getOffsetBefore("", 0);
                                    int i1414 = (offsetBefore2 ^ 5) + ((offsetBefore2 & 5) << 1);
                                    Object[] objArr311 = new Object[1];
                                    c(new int[]{-1382838039, -96327287, -842118464, 494828356, 72575729, 1571017381}, i1414, objArr311);
                                    dataOutputStream2.write(string3.getBytes((String) objArr311[0]));
                                    dataOutputStream2.flush();
                                    int i1415 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                    int i1416 = (i1415 * (-574)) - 3444;
                                    int i1417 = ~i1415;
                                    int i1418 = ~(i1417 | i14);
                                    int i1419 = ~((-7) | i25);
                                    int i1510 = ((i1418 & i1419) | (i1418 ^ i1419)) * 1150;
                                    int i1511 = (((i1416 ^ i1510) + ((i1416 & i1510) << 1)) - (~(((~(((-7) & i25) | ((-7) ^ i25))) | (~((i14 ^ 6) | (i14 & 6)))) * (-575)))) - 1;
                                    int i1512 = ~((i1417 ^ i25) | (i1417 & i25));
                                    int i1513 = ~((i14 & i1415) | (i14 ^ i1415));
                                    int i1514 = i1511 + (((i1513 & i1512) | (i1512 ^ i1513)) * 575);
                                    Object[] objArr312 = new Object[1];
                                    a(new char[]{60120, 47227, 2335, 47480, 28055, 23926, 32095, 60197}, i1514, objArr312);
                                    String str10 = (String) objArr312[0];
                                    Object[] objArr313 = new Object[1];
                                    c(new int[]{-1382838039, -96327287, -842118464, 494828356, 72575729, 1571017381}, 5 - (~(-(-TextUtils.lastIndexOf("", '0', 0)))), objArr313);
                                    dataOutputStream2.write(str10.getBytes((String) objArr313[0]));
                                    dataOutputStream2.flush();
                                    long jNanoTime2 = System.nanoTime();
                                    nanos = TimeUnit.MILLISECONDS.toNanos(2000L);
                                    while (true) {
                                        processExec.exitValue();
                                        f = nanos;
                                        break;
                                    }
                                    dataOutputStream2.close();
                                    Object[] objArr314 = {100L};
                                    byte[] bArr15 = $$a;
                                    Object[] objArr315 = new Object[1];
                                    d(bArr15[9], b5, (byte) (bArr15[45] - 1), objArr315);
                                    Class<?> cls16 = Class.forName((String) objArr315[0]);
                                    byte b115 = bArr15[9];
                                    byte b116 = bArr15[21];
                                    Object[] objArr316 = new Object[1];
                                    d(b115, b116, (byte) (b116 >>> 1), objArr316);
                                    cls16.getMethod((String) objArr316[0], Long.TYPE).invoke(objNewInstance3, objArr314);
                                    Object[] objArr411 = {10L};
                                    Object[] objArr412 = new Object[1];
                                    d(bArr15[9], b5, (byte) (bArr15[45] - 1), objArr412);
                                    Class<?> cls17 = Class.forName((String) objArr412[0]);
                                    byte b117 = bArr15[9];
                                    byte b118 = bArr15[21];
                                    Object[] objArr413 = new Object[1];
                                    d(b117, b118, (byte) (b118 >>> 1), objArr413);
                                    cls17.getMethod((String) objArr413[0], Long.TYPE).invoke(objNewInstance4, objArr411);
                                    processExec.destroy();
                                    StringBuilder sb4 = new StringBuilder();
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char fadingEdgeLength2 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                                        int i1515 = 2143 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                        int touchSlop2 = 45 - (ViewConfiguration.getTouchSlop() >> 8);
                                        byte[] bArr16 = $$d;
                                        byte b22 = bArr16[37];
                                        Object[] objArr414 = new Object[1];
                                        e(b22, (byte) (b22 + 1), bArr16[7], objArr414);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(fadingEdgeLength2, i1515, touchSlop2, 399405187, false, (String) objArr414[0], null);
                                    }
                                    sb4.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(objNewInstance3).toString());
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                        char maximumDrawingCacheSize2 = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                        int keyRepeatDelay2 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2142;
                                        int bitsPerPixel2 = 44 - ImageFormat.getBitsPerPixel(0);
                                        byte[] bArr17 = $$d;
                                        byte b23 = bArr17[37];
                                        Object[] objArr415 = new Object[1];
                                        e(b23, (byte) (b23 + 1), bArr17[7], objArr415);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maximumDrawingCacheSize2, keyRepeatDelay2, bitsPerPixel2, 399405187, false, (String) objArr415[0], null);
                                    }
                                    sb4.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(objNewInstance4).toString());
                                    String string4 = sb4.toString();
                                    Object[] objArr416 = new Object[1];
                                    a(new char[]{28163, 3554, 47032, 33674}, -TextUtils.lastIndexOf("", '0', 0, 0), objArr416);
                                    strArrSplit = string4.split((String) objArr416[0]);
                                    length3 = strArrSplit.length;
                                    i18 = 0;
                                    while (true) {
                                        if (i18 < length3) {
                                            str2 = strArrSplit[i18];
                                            int[] iArr3 = {-2064892275, 1023043301, -1508307050, -1562984321, 1821184149, 858712626, -295967294, 299662355, 1292647012, 1618703361, 1368389795, 296511751};
                                            int i1516 = -TextUtils.indexOf("", "");
                                            objArr2 = new Object[1];
                                            c(iArr3, (i1516 & 19) + (i1516 | 19), objArr2);
                                            if (str2.startsWith((String) objArr2[0])) {
                                                char[] cArr4 = {54670, 55753, 57741, 34340, 61896, 1451, 23598, 63508, 6326, 11585, 55785, 42530, 39511, 43812, 24161, 2290, 61510, 57407, 7548, 22093, 7658, 53175};
                                                int iGreen2 = Color.green(0);
                                                int i1517 = (iGreen2 ^ 20) + ((iGreen2 & 20) << 1);
                                                objArr3 = new Object[1];
                                                a(cArr4, i1517, objArr3);
                                                if (!str2.startsWith((String) objArr3[0])) {
                                                    int[] iArr4 = {-1696394750, 310008150, 1398789221, 1651918692, 814651849, -100832883};
                                                    int i1518 = -TextUtils.lastIndexOf("", '0');
                                                    int i1519 = (i1518 * (-244)) + 1722 + (((~(((-8) & i14) | ((-8) ^ i14))) | (~(((-8) & i1518) | ((-8) ^ i1518)))) * (-245));
                                                    i17 = i;
                                                    int i1610 = ~(((-8) & i17) | ((-8) ^ i17));
                                                    int i1611 = i1610 * (-245);
                                                    int i1612 = (i1519 & i1611) + (i1519 | i1611);
                                                    int i1613 = -(-(((i1518 & i1610) | (i1518 ^ i1610)) * 245));
                                                    objArr4 = new Object[1];
                                                    c(iArr4, (i1612 & i1613) + (i1613 | i1612), objArr4);
                                                    if (str2.startsWith((String) objArr4[0])) {
                                                        int capsMode2 = TextUtils.getCapsMode("", 0, 0);
                                                        int iB7 = VoucherRequest.b();
                                                        int i1614 = (capsMode2 * (-445)) - 445;
                                                        int i1615 = ~capsMode2;
                                                        int i1616 = (i1615 & (-2)) | (i1615 ^ (-2));
                                                        int i1617 = ~i1616;
                                                        int i1618 = ~((-2) | (~iB7));
                                                        int i1619 = ((i1617 & i1618) | (i1617 ^ i1618)) * 446;
                                                        int i1716 = (i1614 & i1619) + (i1614 | i1619);
                                                        int i1717 = ((~((capsMode2 & (-2)) | ((-2) ^ capsMode2) | iB7)) | (~((~capsMode2) | 1))) * 446;
                                                        int i1718 = ((i1716 | i1717) << 1) - (i1717 ^ i1716);
                                                        int i1719 = -(-((~i1616) * 446));
                                                        int i1720 = (i1718 & i1719) + (i1719 | i1718);
                                                        Object[] objArr417 = new Object[1];
                                                        c(new int[]{-439873869, -103435319, -1527581425, 2005065970}, i1720, objArr417);
                                                        Split = str2.split((String) objArr417[0]);
                                                        if (Split.length > 1) {
                                                            r5 = r42;
                                                            if (Split[1].equalsIgnoreCase(r5)) {
                                                                int i1721 = (~(i17 & i6)) & (i17 | i6);
                                                                int i1722 = -i1721;
                                                                int i1723 = ((i1721 & i1722) | (i1721 ^ i1722)) >> 31;
                                                                i6 = (i6 & i1723) | (i13 & (~i1723));
                                                                i25 = i17;
                                                            }
                                                        }
                                                    }
                                                }
                                                r5 = r42;
                                            } else {
                                                r5 = r42;
                                            }
                                            i18 = ((i18 | 1) << 1) - (i18 ^ 1);
                                            r42 = r5;
                                        } else {
                                            i25 = i;
                                        }
                                        i16 = (r34 & 1) + (r34 | 1);
                                        length2 = length2;
                                        r3 = r33;
                                        r38 = r38;
                                        b4 = r41 == true ? 1 : 0;
                                        r33 = r33;
                                        r34 = r34;
                                        r38 = r38;
                                        r41 = r41;
                                    }
                                }
                            } else {
                                i6 = i6;
                                r33 = r3;
                                r38 = r38;
                                length2 = length2;
                                r34 = i16;
                                r41 = b4;
                            }
                            i6 = i6;
                            i16 = (r34 & 1) + (r34 | 1);
                            length2 = length2;
                            r3 = r33;
                            r38 = r38;
                            b4 = r41 == true ? 1 : 0;
                            r33 = r33;
                            r34 = r34;
                            r38 = r38;
                            r41 = r41;
                        }
                        r37 = r38;
                        b2 = b4;
                    }
                } else {
                    r37 = objInvoke;
                    b2 = b8;
                    i6 = i25;
                }
                byte[] bArr18 = $$a;
                byte b24 = bArr18[28];
                Object[] objArr50 = new Object[1];
                d(b24, bArr18[13], b24, objArr50);
                Class<?> cls18 = Class.forName((String) objArr50[0]);
                Object[] objArr51 = new Object[1];
                d(bArr18[0], b2 == true ? (byte) 1 : (byte) 0, bArr18[40], objArr51);
                ?? r6 = {cls18.getField((String) objArr51[0]).get(r37)};
                ?? r8 = new Object[]{new int[1], r6}[0];
                ((int[]) r8)[0] = i6;
                i4 = ((int[]) r8)[0];
                String[] strArr2 = (String[]) r6;
                if ((i2 & 1) == 0) {
                    Object[] objArr52 = new Object[1];
                    a(new char[]{30858, 38662, 54106, 52242, 36336, 35029, 26808, 62938, 20956, 48537, 28670, 40258, 44316, 22727, 38313, 10436}, TextUtils.getOffsetBefore("", 0) + 13, objArr52);
                    try {
                        Object[] objArr53 = {(String) objArr52[0]};
                        int i180 = -ExpandableListView.getPackedPositionChild(0L);
                        int i181 = (i180 * (-1529)) - 16808;
                        int i182 = ~i180;
                        int i183 = (i182 ^ (-23)) | (i182 & (-23));
                        int i184 = ~i25;
                        int i185 = ~((i183 & i184) | (i183 ^ i184));
                        int i186 = (i182 ^ 22) | (i182 & 22);
                        int i187 = ~((i186 & i25) | (i186 ^ i25));
                        int i188 = (i185 & i187) | (i185 ^ i187);
                        int i189 = ((-23) ^ i180) | ((-23) & i180);
                        int i190 = ~((i189 & i25) | (i189 ^ i25));
                        int i191 = -(-(((i188 & i190) | (i188 ^ i190)) * 765));
                        int i192 = (i181 ^ i191) + ((i181 & i191) << 1);
                        int i193 = ~((~i180) | (-23));
                        int i194 = ~((i182 ^ i184) | (i182 & i184));
                        int i195 = i192 + (((i193 & i194) | (i193 ^ i194)) * 1530);
                        int i196 = ~(i182 | i25);
                        int i197 = ~i25;
                        int i198 = (-23) | i197;
                        int i199 = ((~((i180 & i198) | (i198 ^ i180))) | i196) * 765;
                        int i200 = (i195 ^ i199) + ((i199 & i195) << 1);
                        Object[] objArr54 = new Object[1];
                        a(new char[]{62951, 25017, 63819, 30066, 39374, 4493, 35337, 1991, 2783, 32130, 54015, 17035, 25856, 63364, 34530, 34796, 35248, 5895, 53903, 46440, 37969, 9920, 13324, 17869, 15449, 58082}, i200, objArr54);
                        Class<?> cls19 = Class.forName((String) objArr54[0]);
                        int iRed = Color.red(0);
                        Object[] objArr55 = new Object[1];
                        c(new int[]{1106329479, -2066964262, -798426046, 283788215, 2021671599, 267323303, 106659304, -1795904037, 1761403433, -1933812386}, (iRed & 16) + (iRed | 16), objArr55);
                        Object objInvoke2 = cls19.getMethod((String) objArr55[0], String.class).invoke(context, objArr53);
                        if (objInvoke2 == null) {
                            strArr2 = strArr2;
                            i7 = i4;
                            i8 = i25;
                            break;
                        }
                        int doubleTapTimeout3 = ViewConfiguration.getDoubleTapTimeout() >> 16;
                        int i201 = doubleTapTimeout3 * (-958);
                        int i202 = (i201 & (-35446)) + (i201 | (-35446));
                        int i203 = ~(((-38) & i184) | ((-38) ^ i184));
                        int i204 = ~doubleTapTimeout3;
                        int i205 = i203 | (~((i204 & i25) | (i204 ^ i25)));
                        int i206 = ~((i197 & doubleTapTimeout3) | (i197 ^ doubleTapTimeout3));
                        int i207 = ((i205 & i206) | (i205 ^ i206)) * 959;
                        int i208 = (((i202 | i207) << 1) - (i207 ^ i202)) + ((~(doubleTapTimeout3 | 37)) * (-959));
                        int i209 = ~doubleTapTimeout3;
                        int i210 = ~((i209 & i184) | (i209 ^ i184));
                        int i211 = -38;
                        int i212 = ~(((-38) ^ i25) | ((-38) & i25));
                        int i213 = (i210 & i212) | (i210 ^ i212);
                        int i214 = ~((doubleTapTimeout3 & i25) | (doubleTapTimeout3 ^ i25));
                        int i215 = -(-(((i214 & i213) | (i213 ^ i214)) * 959));
                        int i216 = (i208 & i215) + (i215 | i208);
                        Object[] objArr56 = new Object[1];
                        c(new int[]{-1949831361, 139630311, -829215592, 1833461293, -83988879, -299122346, -2020326939, 734586350, 1875866207, 1556213024, 2095721633, -473801231, -1845794130, 874423657, 2014963615, 1126766356, -26020425, -1118028568, -1658668938, 1368676457, -1576768973, 130775488}, i216, objArr56);
                        Class<?> cls20 = Class.forName((String) objArr56[0]);
                        int i217 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                        int iB8 = VoucherRequest.b();
                        int i218 = ~iB8;
                        int i219 = ~i217;
                        int i220 = (((i217 * 193) + 2895) - (~(-(-((i218 | (~((i219 ^ 15) | (i219 & 15)))) * (-192)))))) - 1;
                        int i221 = ~i217;
                        int i222 = ~((i221 & (-16)) | (i221 ^ (-16)));
                        int i223 = ~iB8;
                        int i224 = (i220 - (~(-(-((i222 | (~(((-16) ^ i223) | ((-16) & i223)))) * (-384)))))) - 1;
                        int i225 = (i219 ^ (-16)) | (i219 & (-16));
                        int i226 = ~((i225 & iB8) | (i225 ^ iB8));
                        int i227 = ~(((-16) ^ i223) | (i223 & (-16)) | i217);
                        int i228 = (i226 & i227) | (i226 ^ i227);
                        int i229 = ~((i217 & 15) | (i217 ^ 15) | iB8);
                        int i230 = ((i229 & i228) | (i228 ^ i229)) * DerHeader.TAG_CLASS_PRIVATE;
                        int i231 = ((i224 | i230) << 1) - (i230 ^ i224);
                        Object[] objArr57 = new Object[1];
                        a(new char[]{4402, 62421, 3645, 50494, 28896, 43603, 34789, 50327, 24957, 43098, 42602, 34781, 31329, 4659, 41097, 46756, 57359, 12673}, i231, objArr57);
                        List list = (List) cls20.getMethod((String) objArr57[0], null).invoke(objInvoke2, null);
                        if (list == null) {
                            strArr2 = strArr2;
                            i7 = i4;
                            i8 = i25;
                            break;
                        }
                        Iterator it = list.iterator();
                        loop5: while (true) {
                            if (!it.hasNext()) {
                                strArr2 = strArr2;
                                i7 = i4;
                                i8 = i25;
                                break;
                            }
                            Object next = it.next();
                            int i232 = -(ViewConfiguration.getTouchSlop() >> 8);
                            Object[] objArr58 = new Object[1];
                            c(new int[]{-1281746797, 1329165776, -245938282, -801201775, -832529622, 1492400598, 1061477537, -1871412812, -592772833, -86013117, -459581284, -971009318, -859993404, 1760860597, -170249372, 279863004, 1531145526, -280923510}, (i232 & 29) + (i232 | 29), objArr58);
                            Class<?> cls21 = Class.forName((String) objArr58[0]);
                            int i233 = -TextUtils.indexOf((CharSequence) "", '0', 0);
                            int i234 = (i233 * 141) - 3627;
                            int i235 = -(-(((i25 ^ 13) | (i25 & 13)) * 140));
                            int i236 = (i234 ^ i235) + ((i234 & i235) << 1);
                            int i237 = ~i233;
                            int i238 = ~((i237 & 13) | (i237 ^ 13));
                            int i239 = ~((i184 ^ 13) | (i184 & 13));
                            int i240 = ((i238 & i239) | (i238 ^ i239)) * (-280);
                            int i241 = ((i236 | i240) << 1) - (i240 ^ i236);
                            int i242 = ~(((-14) & i233) | ((-14) ^ i233));
                            int i243 = ~((i184 ^ i233) | (i184 & i233));
                            int i244 = (i242 & i243) | (i242 ^ i243);
                            int i245 = (~i233) | 13;
                            int i246 = ~((i245 & i25) | (i245 ^ i25));
                            int i247 = (i241 - (~(((i246 & i244) | (i244 ^ i246)) * 140))) - 1;
                            Object[] objArr59 = new Object[1];
                            a(new char[]{30809, 3834, 24855, 2652, 46113, 17876, 1374, 30994, 63985, 13202, 15574, 53513, 4518, 20887, 38613, 23555}, i247, objArr59);
                            String str11 = (String) cls21.getMethod((String) objArr59[0], null).invoke(next, null);
                            int i248 = -TextUtils.getOffsetAfter("", 0);
                            int iB9 = VoucherRequest.b();
                            int i249 = (i248 * (-501)) + 18611;
                            int i250 = ~((i211 ^ iB9) | (i211 & iB9));
                            int i251 = ~((i248 ^ 37) | (i248 & 37));
                            int i252 = ((i250 ^ i251) | (i251 & i250)) * (-502);
                            int i253 = (i249 ^ i252) + ((i249 & i252) << 1);
                            int i254 = ~iB9;
                            int i255 = (~((i211 ^ i254) | (i254 & i211) | i248)) * (-502);
                            int i256 = ((i253 | i255) << 1) - (i255 ^ i253);
                            int i257 = ~i248;
                            int i258 = ((~((i257 & iB9) | (i257 ^ iB9))) | (-38)) * TypedValues.PositionType.TYPE_DRAWPATH;
                            Object[] objArr60 = new Object[1];
                            c(new int[]{-1949831361, 139630311, -829215592, 1833461293, -83988879, -299122346, -2020326939, 734586350, 1875866207, 1556213024, 2095721633, -473801231, -1845794130, 874423657, 2014963615, 1126766356, -26020425, -1118028568, -1658668938, 1368676457, -1576768973, 130775488}, (i256 & i258) + (i256 | i258), objArr60);
                            Class<?> cls22 = Class.forName((String) objArr60[0]);
                            int i259 = -(-(ViewConfiguration.getLongPressTimeout() >> 16));
                            Object[] objArr61 = new Object[1];
                            c(new int[]{-655373079, 341683318, 1441115891, 1110165038, -1404064519, 930923777, 1459513143, -1704009622, 1332561525, 1551991685, 43854124, -306341259}, (i259 & 17) + (i259 | 17), objArr61);
                            if (((Boolean) cls22.getMethod((String) objArr61[0], String.class).invoke(objInvoke2, str11)).booleanValue() && (length = str11.length() - 20) >= 0) {
                                int i260 = 0;
                                while (i260 <= length) {
                                    Object[] objArr62 = {str11.substring(i260, (i260 ^ 20) + ((i260 & 20) << 1)), 931995};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                        char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
                                        int i261 = 3394 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                        int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 10;
                                        byte[] bArr19 = $$d;
                                        byte b25 = bArr19[37];
                                        Object[] objArr63 = new Object[1];
                                        e(b25, (byte) (b25 & 14), (byte) (bArr19[7] - 1), objArr63);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(modifierMetaStateMask, i261, iIndexOf3, 1203525406, false, (String) objArr63[0], new Class[]{String.class, Integer.TYPE});
                                    }
                                    long jLongValue4 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr62)).longValue();
                                    long j20 = 1684623171;
                                    Iterator it2 = it;
                                    String str12 = str11;
                                    int i262 = length;
                                    int i263 = i260;
                                    long j21 = -1;
                                    long j22 = j20 ^ j21;
                                    long j23 = (((long) (-716)) * j20) + (((long) 1435) * jLongValue4) + (((long) (-1434)) * (jLongValue4 | j22));
                                    long j24 = 717;
                                    int i264 = i184;
                                    i7 = i4;
                                    long jMyTid = Process.myTid();
                                    long j25 = jMyTid ^ j21;
                                    long j26 = (j20 | jLongValue4) ^ j21;
                                    long j27 = j22 | (jLongValue4 ^ j21);
                                    long j28 = j23 + ((((j25 | jLongValue4) ^ j21) | j26 | ((j27 | jMyTid) ^ j21)) * j24) + (j24 * ((j21 ^ (jMyTid | jLongValue4)) | ((j27 | j25) ^ j21) | j26)) + ((long) (-1686693048));
                                    int iMyUid = Process.myUid();
                                    int i265 = ~iMyUid;
                                    int i266 = ((int) (j28 >> 32)) & ((-1870147649) + (((~((-1757925592) | i265)) | 348164) * 98) + (((~(i265 | 320699180)) | (-1757925592) | (~((-320699181) | iMyUid))) * (-49)) + (((~(iMyUid | (-1757925592))) | 320351016) * 49));
                                    int i267 = ((int) j28) & (2005432269 + (((~((-1203237680) | i25)) | 1117106982) * 104) + ((~(i264 | 1740633903)) * (-104)) + ((1654503206 | i25) * 104));
                                    if (((i266 & i267) | (i266 ^ i267)) == 1245577864) {
                                        i8 = (~(i25 & 70)) & (i25 | 70);
                                        break loop5;
                                    }
                                    i260 = (i263 & 1) + (i263 | 1);
                                    i4 = i7;
                                    strArr2 = strArr2;
                                    str11 = str12;
                                    length = i262;
                                    it = it2;
                                    i184 = i264;
                                    objInvoke2 = objInvoke2;
                                }
                            }
                            i4 = i4;
                            strArr2 = strArr2;
                            it = it;
                            i184 = i184;
                            objInvoke2 = objInvoke2;
                            i211 = -38;
                        }
                        int i268 = i25 ^ i7;
                        int i269 = -i268;
                        int i270 = ((i268 & i269) | (i268 ^ i269)) >> 31;
                        int i271 = (~i270) & i8;
                        int i272 = i270 & i7;
                        i4 = (i271 ^ i272) | (i272 & i271);
                    } catch (Throwable th31) {
                        Throwable cause9 = th31.getCause();
                        if (cause9 != null) {
                            throw cause9;
                        }
                        throw th31;
                    }
                } else {
                    strArr2 = strArr2;
                }
                strArr = strArr2;
                i5 = 14;
            } catch (Throwable th32) {
                Throwable cause10 = th32.getCause();
                if (cause10 != null) {
                    throw cause10;
                }
                throw th32;
            }
        } else {
            i4 = i25;
            i5 = 14;
            strArr = null;
        }
        char[] cArr5 = new char[i5];
        // fill-array-data instruction
        cArr5[0] = 30159;
        cArr5[1] = 26886;
        cArr5[2] = 32478;
        cArr5[3] = 25827;
        cArr5[4] = 45804;
        cArr5[5] = 52392;
        cArr5[6] = 42422;
        cArr5[7] = 3996;
        cArr5[8] = 30262;
        cArr5[9] = 13417;
        cArr5[10] = 34591;
        cArr5[11] = 21336;
        cArr5[12] = 28456;
        cArr5[13] = 54843;
        Object[] objArr64 = new Object[1];
        a(cArr5, 11 - (~(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))), objArr64);
        Object[] objArr65 = {(String) objArr64[0]};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
            int iAxisFromString = 992 - MotionEvent.axisFromString("");
            int edgeSlop = 8 - (ViewConfiguration.getEdgeSlop() >> 16);
            byte[] bArr20 = $$d;
            Object[] objArr66 = new Object[1];
            e((byte) 51, (byte) (-bArr20[15]), (byte) (bArr20[7] - 1), objArr66);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cMakeMeasureSpec, iAxisFromString, edgeSlop, -545305915, false, (String) objArr66[0], new Class[]{String.class});
        }
        long jLongValue5 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr65)).longValue();
        long j29 = -17609761;
        long j30 = 765;
        String[] strArr3 = strArr;
        long j31 = -1;
        long j32 = j29 ^ j31;
        long j33 = jLongValue5 ^ j31;
        long j34 = j32 | j33;
        int i273 = i4;
        long j35 = i25;
        long j36 = j35 ^ j31;
        long j37 = (((long) (-1529)) * j29) + (((long) (-764)) * jLongValue5) + ((((j34 | j36) ^ j31) | (((j32 | jLongValue5) | j35) ^ j31) | (((j33 | j29) | j35) ^ j31)) * j30) + (((long) 1530) * ((j34 ^ j31) | ((j32 | j36) ^ j31))) + (j30 * (((j32 | j35) ^ j31) | (((j33 | j36) | j29) ^ j31))) + ((long) 638069045);
        int iNextInt = new Random().nextInt(371164532);
        int i274 = ((int) (j37 >> 32)) & (501358106 + (((~(2053995401 | iNextInt)) | (-2146271180)) * 336) + (((~((-803745484) | iNextInt)) | 711469705) * (-168)) + (((~((~iNextInt) | (-803745484))) | 2053995401) * 168));
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i275 = i274 | (((int) j37) & (((1463327601 + (((~((-1625214189) | iMaxMemory)) | (-1232526698)) * (-948))) + ((~((~iMaxMemory) | (-1079430249))) * (-948))) - 2007100548));
        int i276 = -i275;
        int i277 = ((i275 & i276) | (i275 ^ i276)) >> 31;
        int i278 = (i277 & (i25 ^ 50)) | ((~i277) & i25);
        int i279 = (~(i25 & i273)) & (i25 | i273);
        int i280 = -i279;
        int i281 = ((i279 & i280) | (i279 ^ i280)) >> 31;
        int i282 = i278 & (~i281);
        int i283 = i273 & i281;
        int i284 = (i283 & i282) | (i282 ^ i283);
        int i285 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
        int i286 = i285 * (-167);
        int i287 = ((i286 | (-3340)) << 1) - (i286 ^ (-3340));
        int i288 = ~i285;
        int i289 = ~((i288 & (-21)) | (i288 ^ (-21)));
        int i290 = ~(((-21) & i25) | ((-21) ^ i25));
        int i291 = -(-(((i289 & i290) | (i289 ^ i290)) * 336));
        int i292 = (i287 ^ i291) + ((i291 & i287) << 1);
        int i293 = -(-(((~((i285 ^ 20) | (i285 & 20))) | (~((i285 ^ i25) | (i285 & i25)))) * (-168)));
        int i294 = ((i292 | i293) << 1) - (i293 ^ i292);
        int i295 = -(-(((~(i285 | (~i25))) | (-21)) * 168));
        int i296 = (i294 & i295) + (i295 | i294);
        Object[] objArr67 = new Object[1];
        a(new char[]{51141, 30358, 60172, 23452, 32938, 14220, 50645, 42981, 15857, 57892, 37326, 42017, 5904, 431, 54229, 54501, 1433, 32462, 14571, 12870, 691, 16676}, i296, objArr67);
        Object[] objArr68 = {(String) objArr67[0]};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char c3 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int iIndexOf4 = TextUtils.indexOf("", "", 0) + 993;
            int i297 = 8 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            byte[] bArr21 = $$d;
            Object[] objArr69 = new Object[1];
            e((byte) 51, (byte) (-bArr21[15]), (byte) (bArr21[7] - 1), objArr69);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c3, iIndexOf4, i297, -545305915, false, (String) objArr69[0], new Class[]{String.class});
        }
        long jLongValue6 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr68)).longValue();
        long j38 = -1169621312;
        long j39 = -495;
        long j40 = j38 ^ j31;
        long jMyPid = Process.myPid();
        long j41 = ((j40 | (jLongValue6 ^ j31)) ^ j31) | ((j40 | jMyPid) ^ j31);
        long j42 = (j39 * j38) + (j39 * jLongValue6) + (((long) 992) * j41) + (((long) (-496)) * (j41 | ((((jMyPid ^ j31) | j38) | jLongValue6) ^ j31))) + (((long) 496) * (jLongValue6 | jMyPid)) + ((long) 1790080596);
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i298 = ~elapsedCpuTime;
        int i299 = ((int) (j42 >> 32)) & ((-2111026220) + ((1261543716 | elapsedCpuTime) * (-859)) + (((~(elapsedCpuTime | (-170958853))) | (~(1261543716 | i298))) * 859) + (((~((-175682695) | i298)) | 4723842) * 859));
        int i300 = ~i25;
        int i301 = ((int) j42) & (1725729162 + (((~(i300 | (-1694405180))) | 257178769) * (-1042)) + (((-1694405180) | i25) * 521) + (((~((-257178770) | i25)) | 184560768 | (~((-1621787179) | i300))) * 521));
        int i302 = (i299 & i301) | (i299 ^ i301);
        int i303 = (~(i25 & 60)) & (i25 | 60);
        int i304 = -i302;
        int i305 = ((i302 & i304) | (i302 ^ i304)) >> 31;
        int i306 = (~i305) & i25;
        int i307 = i305 & i303;
        int i308 = (i307 & i306) | (i306 ^ i307);
        int i309 = ((~i284) & i25) | (i284 & i300);
        int i310 = -i309;
        int i311 = ((i309 & i310) | (i309 ^ i310)) >> 31;
        int i312 = i308 & (~i311);
        int i313 = i284 & i311;
        int i314 = (i313 & i312) | (i312 ^ i313);
        Object[] objArr70 = new Object[1];
        a(new char[]{44987, 60420, 48367, 43296, 49510, 27001, 4635, 40901, 3115, 11163, 52681, 24656, 11074, 58290, 25676, 56591, 15479, 29800, 19320, 488, 23699, 7644, 45521, 55575, 48499, 65125, 52035, 12161, 14767, 8241, 57274, 9869, 9622, 63941, 7443, 50918, 32462, 33303}, 34 - (~(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr70);
        Object[] objArr71 = {(String) objArr70[0]};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
            char capsMode3 = (char) TextUtils.getCapsMode("", 0, 0);
            int i315 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 992;
            int i316 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 7;
            byte[] bArr22 = $$d;
            Object[] objArr72 = new Object[1];
            e((byte) 51, (byte) (-bArr22[3]), (byte) (bArr22[7] - 1), objArr72);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(capsMode3, i315, i316, 349342683, false, (String) objArr72[0], new Class[]{String.class});
        }
        long jLongValue7 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr71)).longValue();
        long j43 = 525342962;
        long j44 = ((j43 ^ j31) | jLongValue7) ^ j31;
        long j45 = 70;
        long j46 = (((long) 71) * j43) + (((long) (-69)) * jLongValue7) + (((long) (-140)) * (j44 | ((jLongValue7 | j35) ^ j31))) + ((((j43 | jLongValue7) | j35) ^ j31) * j45) + (j45 * ((((jLongValue7 ^ j31) | j43) ^ j31) | j44 | ((j43 | j35) ^ j31))) + ((long) (-1372421567));
        int i317 = ~Process.myUid();
        int i318 = ((int) (j46 >> 32)) & ((-67219886) + (((-139273) | i317) * 494) + (((~(i317 | (-274195086))) | 1985338037) * 494));
        int i319 = ~((-1340408394) | i25);
        int i320 = i318 | (((int) j46) & ((((1243631913 | i319) * (-658)) - 1423561067) + ((i319 | 1243611145) * 658)));
        int i321 = (~(i25 & 80)) & (i25 | 80);
        int i322 = -i320;
        int i323 = ((i320 & i322) | (i320 ^ i322)) >> 31;
        int i324 = (~i323) & i25;
        int i325 = i323 & i321;
        int i326 = ((~i314) & i25) | (i314 & i300);
        int i327 = (i326 | (-i326)) >> 31;
        int i328 = ((i325 & i324) | (i324 ^ i325)) & (~i327);
        int i329 = i314 & i327;
        int i330 = (i329 & i328) | (i328 ^ i329);
        int i331 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
        int i332 = ((i331 | 43) << 1) - (i331 ^ 43);
        Object[] objArr73 = new Object[1];
        c(new int[]{765344428, -540064611, 1007434796, -336659205, 804647198, -1564146412, -90834927, 504662707, 608799523, 1636172316, 1646499503, 794285819, -1707627280, 1375809614, 163273628, 1508067211, -1630061695, 2125828949, 1707566128, -398472211, 1157794617, -486775011, -478808459, 849819286}, i332, objArr73);
        Object[] objArr74 = {(String) objArr73[0]};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
            char size = (char) View.MeasureSpec.getSize(0);
            int iLastIndexOf3 = 992 - TextUtils.lastIndexOf("", '0', 0);
            int iAlpha = Color.alpha(0) + 8;
            byte[] bArr23 = $$d;
            Object[] objArr75 = new Object[1];
            e((byte) 51, (byte) (-bArr23[3]), (byte) (bArr23[7] - 1), objArr75);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(size, iLastIndexOf3, iAlpha, 349342683, false, (String) objArr75[0], new Class[]{String.class});
        }
        long jLongValue8 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr74)).longValue();
        long j47 = 506782179;
        long j48 = -919;
        long j49 = (j48 * j47) + (j48 * jLongValue8);
        long j50 = 920;
        long j51 = j47 ^ j31;
        long j52 = jLongValue8 ^ j31;
        long j53 = j51 | j52;
        long j54 = j49 + ((((j53 | j35) ^ j31) | (((j52 | j36) | j47) ^ j31)) * j50) + (((j53 ^ j31) | ((j51 | j36) ^ j31)) * j50) + (j50 * (((j53 | j36) ^ j31) | (((jLongValue8 | j51) | j35) ^ j31) | (((j52 | j47) | j35) ^ j31))) + ((long) (-1353860784));
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        int i333 = ~startElapsedRealtime;
        int i334 = ((int) (j54 >> 32)) & (1269256838 + (((~(i333 | 1521983136)) | 84426837 | (~((-1521653249) | startElapsedRealtime))) * 717) + (((~(startElapsedRealtime | 1521983136)) | (~(i333 | (-1521653249))) | 84426837) * 717));
        int i335 = ((int) j54) & (1354165650 + ((~((-1073825026) | i25)) * 623) + ((168296468 | i300) * (-623)) + (((~(265848926 | i25)) | 1073825025 | (~((-1171377484) | i25))) * 623));
        int i336 = (i334 & i335) | (i334 ^ i335);
        int i337 = -i336;
        int i338 = ((i336 & i337) | (i336 ^ i337)) >> 31;
        int i339 = (~i338) & i25;
        int i340 = i338 & (i25 ^ 90);
        int i341 = (i340 & i339) | (i339 ^ i340);
        int i342 = (~(i25 & i330)) & (i25 | i330);
        int i343 = -i342;
        int i344 = ((i342 & i343) | (i342 ^ i343)) >> 31;
        int i345 = (i330 & i344) | (i341 & (~i344));
        int i346 = -TextUtils.getOffsetBefore("", 0);
        int i347 = -(-(i346 * 306));
        int i348 = (i347 & TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS) + (i347 | TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS) + 5508;
        int i349 = ~(i346 | 18);
        int i350 = ~((i346 ^ i25) | (i346 & i25));
        int i351 = -(-(((i349 & i350) | (i349 ^ i350)) * 305));
        int i352 = (i348 & i351) + (i351 | i348) + (((~(i346 | i300)) | (-19)) * 305);
        Object[] objArr76 = new Object[1];
        a(new char[]{21825, 62748, 51919, 49829, 18535, 62497, 61232, 55950, 52345, 2711, 9997, 31744, 30971, 38427, 20908, 38542, 3547, 46259, 12608, 22794}, i352, objArr76);
        Object[] objArr77 = {(String) objArr76[0]};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
            char c4 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
            int iRgb = (-16776223) - Color.rgb(0, 0, 0);
            int i353 = 8 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            byte[] bArr24 = $$d;
            Object[] objArr78 = new Object[1];
            e((byte) 51, (byte) (-bArr24[3]), (byte) (bArr24[7] - 1), objArr78);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c4, iRgb, i353, 349342683, false, (String) objArr78[0], new Class[]{String.class});
        }
        long jLongValue9 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr77)).longValue();
        long j55 = 1253441330;
        long j56 = -103;
        long j57 = (j56 * j55) + (j56 * jLongValue9);
        long j58 = 104;
        long j59 = jLongValue9 ^ j31;
        long jElapsedRealtime = (int) SystemClock.elapsedRealtime();
        long j60 = j57 + (((((j55 ^ j31) | j59) ^ j31) | ((j59 | jElapsedRealtime) ^ j31)) * j58) + (((long) (-104)) * ((((jElapsedRealtime ^ j31) | j55) | jLongValue9) ^ j31)) + (j58 * (jElapsedRealtime | j55)) + ((long) (-2100519935));
        int i354 = ((int) (j60 >> 32)) & ((((~(658164642 | i)) | (-2147478512)) * (-566)) + 1440133386 + ((~((-1489313870) | i)) * 566));
        int i355 = (~((-431704938) | i300)) | 278547048;
        int i356 = ~((-1715773459) | i);
        int i357 = ((int) j60) & (((i355 | i356) * (-252)) + 37152949 + ((i356 | (~((-153157890) | i300))) * 252));
        int i358 = (i354 & i357) | (i354 ^ i357);
        int i359 = (i358 | (-i358)) >> 31;
        int i360 = (i359 & (~(i & 100)) & (i | 100)) | (i & (~i359));
        int i361 = (i & (~i345)) | (i345 & i300);
        int i362 = -i361;
        int i363 = ((i361 & i362) | (i361 ^ i362)) >> 31;
        int i364 = i360 & (~i363);
        int i365 = i345 & i363;
        int i366 = (i364 & i365) | (i364 ^ i365);
        Object[] objArr79 = {new int[]{i}, strArr3, new int[1], new int[]{i366}};
        int i367 = (~(i & i366)) & (i | i366);
        int i368 = -i367;
        int i369 = (((i367 & i368) | (i367 ^ i368)) >> 31) & 16;
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i370 = 1530468990 + (((~((~iUptimeMillis) | (-974679350))) | (-165966034)) * (-235)) + (((~((-974679350) | iUptimeMillis)) | (-165966034)) * (-470)) + (((~(iUptimeMillis | (-134242322))) | (-1006403062)) * 235);
        int iB10 = VoucherRequest.b();
        int i371 = i369 * (-300);
        int i372 = i370 * 302;
        int i373 = ((i371 | i372) << 1) - (i371 ^ i372);
        int i374 = (i369 ^ i370) | (i369 & i370);
        int i375 = -(-((~((i374 & iB10) | (i374 ^ iB10))) * (-301)));
        int i376 = ((i373 | i375) << 1) - (i375 ^ i373);
        int i377 = ~i370;
        int i378 = ~((i377 ^ iB10) | (i377 & iB10));
        int i379 = ~iB10;
        int i380 = -(-((i378 | (~((i379 & i369) | (i379 ^ i369)))) * (-301)));
        int i381 = ~(iB10 | (~i369));
        int i382 = (i376 & i380) + (i376 | i380) + (((i381 & i377) | (i377 ^ i381)) * 301);
        int iB11 = VoucherRequest.b();
        int i383 = i382 * 217;
        int i384 = i3 * (-215);
        int i385 = ((i383 | i384) << 1) - (i383 ^ i384);
        int i386 = (~((i382 ^ iB11) | (i382 & iB11))) * 216;
        int i387 = ((i385 | i386) << 1) - (i386 ^ i385);
        int i388 = ~i3;
        int i389 = (i388 & i382) | (i382 ^ i388);
        int i390 = ~iB11;
        int i391 = -(-(((i389 & i390) | (i389 ^ i390)) * (-216)));
        int i392 = ((i387 | i391) << 1) - (i391 ^ i387);
        int i393 = ~(i390 | i382);
        int i394 = ((i393 & i3) | (i3 ^ i393)) * 216;
        int i395 = (i392 & i394) + (i394 | i392);
        int i396 = i395 << 13;
        int i397 = (i396 & (~i395)) | ((~i396) & i395);
        int i398 = i397 >>> 17;
        int i399 = ((~i397) & i398) | ((~i398) & i397);
        int i400 = i399 << 5;
        ((int[]) objArr79[2])[0] = ((~i399) & i400) | ((~i400) & i399);
        return objArr79;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r7, int r8, short r9) {
        /*
            byte[] r0 = com.google.android.gms.internal.mlkit_vision_face.zzll.$$c
            int r7 = r7 * 14
            int r7 = r7 + 66
            int r9 = r9 * 4
            int r9 = r9 + 1
            int r8 = r8 * 3
            int r8 = 3 - r8
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2c
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L24:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2c:
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_face.zzll.$$g(short, int, short):java.lang.String");
    }
}
