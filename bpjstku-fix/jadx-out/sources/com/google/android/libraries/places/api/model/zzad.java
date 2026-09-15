package com.google.android.libraries.places.api.model;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.ByteCompanionObject;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzad extends LocalTime {
    private final int zza;
    private final int zzb;
    private static final byte[] $$c = {90, 46, 113, 8};
    private static final int $$f = 66;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {83, -90, 68, -23, -44, -7, 2, -12, -24, -10, 38, -40, -22, -2, -23, 7, 7, -44, -7, -17, 3, -5, -11, -23, 37, -54, -8, -13, 5, -23, -5, -16, -9, -3, -8, -25, 33, -47, -15, -11, 9, -23, 1, -12, 42, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55};
    private static final int $$e = 168;
    private static final byte[] $$a = {88, ByteCompanionObject.MAX_VALUE, -112, -47, 23, -37, 42, 11, -10, 18, -7, 0, 7, 7, 23, -44, 44, 10, -5, 6, 18};
    private static final int $$b = 12;
    private static int b = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static int[] TuitionPaymentFragmentbindingInflater1 = {1707809650, -2117418475, -1955490295, 402092974, -1494269274, 897977535, -232603433, 105488377, -1840414047, 516439116, -1294689953, 99228475, 1562918772, -2052756214, -1714420692, 438794518, 1702165813, 1367932567};

    private static void a(byte b2, int i, int i2, Object[] objArr) {
        byte[] bArr = $$a;
        int i3 = (b2 * 3) + 97;
        int i4 = (i2 * 10) + 4;
        byte[] bArr2 = new byte[i + 1];
        int i5 = -1;
        if (bArr == null) {
            i3 = (i3 + i) - 5;
            i4++;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i3 = (i3 + bArr[i4]) - 5;
                i4++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 4
            int r5 = 84 - r5
            int r7 = r7 * 41
            int r7 = 44 - r7
            byte[] r0 = com.google.android.libraries.places.api.model.zzad.$$d
            int r6 = r6 * 11
            int r6 = r6 + 42
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r6
            r3 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L26:
            int r7 = r7 + 1
            r4 = r0[r7]
        L2a:
            int r4 = -r4
            int r5 = r5 + r4
            int r5 = r5 + (-10)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.model.zzad.d(byte, int, int, java.lang.Object[]):void");
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = this.zza;
        int length = String.valueOf(i2).length();
        int i3 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 26 + String.valueOf(i3).length() + 1);
        sb.append("LocalTime{hours=");
        sb.append(i2);
        sb.append(", minutes=");
        sb.append(i3);
        sb.append("}");
        String string = sb.toString();
        int i4 = b + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if ((!(r6 instanceof com.google.android.libraries.places.api.model.LocalTime)) == true) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        r6 = (com.google.android.libraries.places.api.model.LocalTime) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r5.zza != r6.getHours()) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        if (r5.zzb != r6.getMinutes()) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        r6 = com.google.android.libraries.places.api.model.zzad.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
        com.google.android.libraries.places.api.model.zzad.b = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r6 == r5) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r6 == r5) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r2 = r2 + 7;
        com.google.android.libraries.places.api.model.zzad.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.libraries.places.api.model.zzad.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r1 = r1 + 87
            int r2 = r1 % 128
            com.google.android.libraries.places.api.model.zzad.b = r2
            int r1 = r1 % r0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L16
            r1 = 53
            int r1 = r1 / r3
            if (r6 != r5) goto L20
            goto L18
        L16:
            if (r6 != r5) goto L20
        L18:
            int r2 = r2 + 7
            int r6 = r2 % 128
            com.google.android.libraries.places.api.model.zzad.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r6
            int r2 = r2 % r0
            return r4
        L20:
            boolean r1 = r6 instanceof com.google.android.libraries.places.api.model.LocalTime
            r1 = r1 ^ r4
            if (r1 == r4) goto L41
            com.google.android.libraries.places.api.model.LocalTime r6 = (com.google.android.libraries.places.api.model.LocalTime) r6
            int r1 = r5.zza
            int r2 = r6.getHours()
            if (r1 != r2) goto L41
            int r1 = r5.zzb
            int r6 = r6.getMinutes()
            if (r1 != r6) goto L41
            int r6 = com.google.android.libraries.places.api.model.zzad.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r6 = r6 + 89
            int r1 = r6 % 128
            com.google.android.libraries.places.api.model.zzad.b = r1
            int r6 = r6 % r0
            return r4
        L41:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.model.zzad.equals(java.lang.Object):boolean");
    }

    private static void c(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = TuitionPaymentFragmentbindingInflater1;
        int i3 = -1870535734;
        long j = 0;
        int i4 = 1;
        int i5 = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i6 = 0;
            while (i6 < length2) {
                int i7 = $11 + 57;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i5] = Integer.valueOf(iArr3[i6]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) i5;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (1 - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1))), 3291 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 31 - TextUtils.getTrimmedLength(""), 1948206109, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        iArr4[i6] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(iArr3[i6])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3291, 32 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1948206109, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                        }
                        iArr4[i6] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                        i6++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i3 = -1870535734;
                j = 0;
                i5 = 0;
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = TuitionPaymentFragmentbindingInflater1;
        char c = '0';
        if (iArr6 != null) {
            int i8 = $11 + 109;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i9 = 0;
            while (i9 < length) {
                int i10 = $10 + 21;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                Object[] objArr4 = new Object[i4];
                objArr4[0] = Integer.valueOf(iArr6[i9]);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char c2 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int trimmedLength = TextUtils.getTrimmedLength("") + 3291;
                    int iLastIndexOf = 30 - TextUtils.lastIndexOf("", c, 0, 0);
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, trimmedLength, iLastIndexOf, 1948206109, false, $$g(b6, b7, b7), new Class[]{Integer.TYPE});
                }
                iArr2[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                i9++;
                iArr6 = iArr6;
                c = '0';
                i4 = 1;
            }
            iArr6 = iArr2;
        }
        char c3 = 0;
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            cArr[c3] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i12 = 17;
            for (int i13 = 1; i12 > i13; i13 = 1) {
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[i12];
                Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b8 = (byte) 1;
                    byte b9 = (byte) (b8 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ExpandableListView.getPackedPositionType(0L), TextUtils.indexOf((CharSequence) "", '0') + 2560, 29 - Color.argb(0, 0, 0, 0), 683220507, false, $$g(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                i12--;
            }
            int i14 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr5[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i15 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr6 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (View.MeasureSpec.getSize(0) + 28879), 348 - Drawable.resolveOpacity(0, 0), TextUtils.indexOf("", "", 0) + 25, -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
            c3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public final int hashCode() throws Throwable {
        Object[] objArr;
        char c;
        Object[] objArr2;
        int i = 2 % 2;
        int i2 = this.zza;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
            int longPressTimeout = 876 - (ViewConfiguration.getLongPressTimeout() >> 16);
            int capsMode = 10 - TextUtils.getCapsMode("", 0, 0);
            byte[] bArr = $$a;
            byte b2 = bArr[11];
            Object[] objArr3 = new Object[1];
            a(b2, bArr[17], b2, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(modifierMetaStateMask, longPressTimeout, capsMode, -1199417970, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(new int[]{-59805310, -450355533, -1582537722, 1125209662, -1719568155, 18674135, 1756016814, -387506023, -162652406, -1906019329, -1324631146, 1496880501, 688937433, 1776943808}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 23, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(new int[]{-223696656, 2035614631, 177239023, -1159202566, -2062591598, -2119788488, -1983795006, -269824181, 685502084, -355898300}, 16 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c2 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 877;
            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 10;
            byte b3 = $$a[11];
            byte b4 = (byte) (b3 + 1);
            byte b5 = b3;
            Object[] objArr6 = new Object[1];
            a(b4, b5, (byte) (b5 + 1), objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, iIndexOf, touchSlop, 254769921, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int defaultSize = View.getDefaultSize(0, 0) + 876;
                int i3 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 10;
                byte[] bArr2 = $$a;
                byte b6 = bArr2[11];
                byte b7 = bArr2[12];
                Object[] objArr7 = new Object[1];
                a(b6, b7, (byte) (b7 >>> 2), objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(doubleTapTimeout, defaultSize, i3, 1324201839, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            Object[] objArr9 = {new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = ~iIdentityHashCode;
            int i5 = (-810060588) + ((1442832 | i4) * (-192)) + (((~((-36229541) | i4)) | 2637856) * (-384)) + (((~(iIdentityHashCode | 37672372)) | (~(i4 | (-33591685))) | (~((-2637857) | iIdentityHashCode))) * DerHeader.TAG_CLASS_PRIVATE) + 255979475;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr9[1])[0] = i7 ^ (i7 << 5);
            int i8 = b + 85;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
            int i9 = i8 % 2;
            objArr = objArr9;
            c = 2;
        } else {
            Object[] objArr10 = new Object[1];
            c(new int[]{502401090, 1366280187, -496688142, 1195225350, -115230158, 1924182998, -2107183596, 469114195, -927118829, 1002200735}, Color.red(0) + 16, objArr10);
            Class<?> cls2 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new int[]{-476879335, 495956445, 339653153, -1594580132, -267679609, 488242463, -789394513, 409676040, -1134937190, 1895429781}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 15, objArr11);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i10 = b + 33;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
            int i11 = i10 % 2;
            try {
                Object[] objArr12 = {Integer.valueOf(iIntValue), 255979475};
                byte[] bArr3 = $$d;
                byte b8 = bArr3[42];
                byte b9 = b8;
                Object[] objArr13 = new Object[1];
                d(b9, (byte) (b9 - 1), b8, objArr13);
                Class<?> cls3 = Class.forName((String) objArr13[0]);
                byte b10 = bArr3[42];
                byte b11 = (byte) (b10 - 1);
                byte b12 = b10;
                Object[] objArr14 = new Object[1];
                d(b11, b12, (byte) (b12 - 1), objArr14);
                objArr = (Object[]) cls3.getMethod((String) objArr14[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int iResolveOpacity = 876 - Drawable.resolveOpacity(0, 0);
                    int defaultSize2 = 10 - View.getDefaultSize(0, 0);
                    byte[] bArr4 = $$a;
                    byte b13 = bArr4[11];
                    byte b14 = bArr4[12];
                    Object[] objArr15 = new Object[1];
                    a(b13, b14, (byte) (b14 >>> 2), objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maximumFlingVelocity, iResolveOpacity, defaultSize2, 1324201839, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr16 = new Object[1];
                    c(new int[]{-59805310, -450355533, -1582537722, 1125209662, -1719568155, 18674135, 1756016814, -387506023, -162652406, -1906019329, -1324631146, 1496880501, 688937433, 1776943808}, 21 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr16);
                    Class<?> cls4 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    c(new int[]{-223696656, 2035614631, 177239023, -1159202566, -2062591598, -2119788488, -1983795006, -269824181, 685502084, -355898300}, 14 - TextUtils.lastIndexOf("", '0'), objArr17);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int packedPositionType = 876 - ExpandableListView.getPackedPositionType(0L);
                        int iResolveSizeAndState = 10 - View.resolveSizeAndState(0, 0, 0);
                        byte b15 = $$a[11];
                        byte b16 = (byte) (b15 + 1);
                        byte b17 = b15;
                        Object[] objArr18 = new Object[1];
                        a(b16, b17, (byte) (b17 + 1), objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarFadeDuration, packedPositionType, iResolveSizeAndState, 254769921, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cAlpha = (char) Color.alpha(0);
                        int iRgb = Color.rgb(0, 0, 0) + 16778092;
                        int i12 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 9;
                        byte[] bArr5 = $$a;
                        byte b18 = bArr5[11];
                        Object[] objArr19 = new Object[1];
                        a(b18, bArr5[17], b18, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cAlpha, iRgb, i12, -1199417970, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    int i13 = b + 29;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 % 128;
                    c = 2;
                    int i14 = i13 % 2;
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
        int i15 = ((int[]) objArr[c])[0];
        int i16 = ((int[]) objArr[0])[0];
        if (i16 == i15) {
            int i17 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iMyUid = Process.myUid();
            int i18 = i17 + (-1703544620) + (((~(948559008 | iMyUid)) | 40903253) * 576) + (((~((~iMyUid) | 989462261)) | 947965984) * 576) + 2085437248;
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr2[1])[0] = i20 ^ (i20 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[3];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i16 / (((i16 - 1) * i16) % 2), 0).show();
            int i21 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i22 = i21 + 2063533684 + ((128395999 | iUptimeMillis) * 376) + (((~((~iUptimeMillis) | 1029136506)) | 44042885) * (-376)) + (((~(iUptimeMillis | (-1029136507))) | (-988826278)) * 376);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr2[1])[0] = i24 ^ (i24 << 5);
        }
        int i25 = ((int[]) objArr2[1])[0];
        int i26 = i25 * i25;
        int i27 = -(446228526 * i25);
        int i28 = (i26 ^ i27) + ((i26 & i27) << 1);
        int i29 = -(i25 * 1127799258);
        int i30 = (i28 & i29) + (i29 | i28);
        int i31 = (i30 & 218630160) + (218630160 | i30);
        int i32 = i31 >> 20;
        int i33 = ((i32 ^ (-8191)) + ((i32 & (-8191)) << 1)) / 4096;
        int i34 = (i33 ^ 1) + ((i33 & 1) << 1);
        int i35 = (i31 & i34) + (i34 | i31);
        int i36 = i31 >> 25;
        int i37 = ((i36 & (-255)) + (i36 | (-255))) / 128;
        int i38 = -(((i37 ^ 1) + ((i37 & 1) << 1)) ^ i35);
        int i39 = (i38 ^ 3) + ((i38 & 3) << 1);
        int i40 = i39 >> 21;
        int i41 = ((i40 & (-4095)) + (i40 | (-4095))) / 2048;
        int i42 = (i41 ^ 1) + ((i41 & 1) << 1);
        int i43 = ((i2 ^ 1000003) * (348001044 / (((-(((i42 | 1) << 1) - (i42 ^ 1))) & i39) * 116))) ^ this.zzb;
        int i44 = b + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i44 % 128;
        if (i44 % 2 != 0) {
            return i43;
        }
        throw null;
    }

    zzad(int i, int i2) {
        this.zza = i;
        this.zzb = i2;
    }

    @Override // com.google.android.libraries.places.api.model.LocalTime
    public final int getHours() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        int i5 = this.zza;
        int i6 = i3 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    @Override // com.google.android.libraries.places.api.model.LocalTime
    public final int getMinutes() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 93;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        int i5 = this.zzb;
        int i6 = i3 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, short r7, byte r8) {
        /*
            int r7 = r7 * 3
            int r0 = 1 - r7
            int r6 = r6 * 56
            int r6 = r6 + 66
            int r8 = r8 * 3
            int r8 = 3 - r8
            byte[] r1 = com.google.android.libraries.places.api.model.zzad.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L2e
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            int r8 = r8 + 1
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2e:
            int r8 = -r8
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.model.zzad.$$g(short, short, byte):java.lang.String");
    }
}
