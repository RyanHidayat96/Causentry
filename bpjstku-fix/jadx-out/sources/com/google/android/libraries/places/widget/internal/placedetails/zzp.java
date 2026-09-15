package com.google.android.libraries.places.widget.internal.placedetails;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Parcel;
import android.os.Parcelable;
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
import android.widget.Toast;
import com.google.android.libraries.places.internal.zzait;
import com.google.android.libraries.places.internal.zzaiw;
import com.google.android.libraries.places.internal.zzaiz;
import com.google.android.libraries.places.internal.zzajb;
import com.google.android.libraries.places.internal.zzajc;
import com.google.android.libraries.places.internal.zzbae;
import com.google.android.libraries.places.internal.zzoz;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zzp implements Parcelable {
    public static final Parcelable.Creator<zzp> CREATOR;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static long b;
    private final zzajb zza;
    private final zzaiz zzb;
    private final List zzc;
    private zzoz zzd;
    private static final byte[] $$c = {117, 50, 102, 124};
    private static final int $$f = 207;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {29, 88, -118, 32, -13, 1, 62, -53, -15, 5, -10, -2, 8, -11, 70, -55, 2, -20, 18, 50, -67, 14, -25, 11, 7, -10, -7, 69, -64, -3, 10, -2, -8, Base64.padSymbol, -69, 12, -13, -5, 15, -15, -2, 69, -28, -38, 9, -6, -14, 12, 4, -18, 19, -12, 39, -34, -16, 18, -9, -4, 40, -51, 1, -2, 4, 1, 7, -14, 34, -20, -9, 4, 1, -18, -34, 11, -12, 10, -7, 0, 29, -18, -25, 11, 7, -10, -7, 45, -45, 16, -7, -7, 7, -10, -7, 17, -8, -6, 9, -6, -6, 6, 29, -38, 7, -7, 10, -20, 14, -14, 64};
    private static final int $$e = 110;
    private static final byte[] $$a = {99, -43, -44, -62, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 117;
    private static int asBinder = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f796a = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r8 = r8 * 14
            int r8 = r8 + 84
            byte[] r0 = com.google.android.libraries.places.widget.internal.placedetails.zzp.$$a
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2a
        L13:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r8 = r8 + 1
            int r4 = r3 + 1
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            r3 = r0[r8]
        L2a:
            int r6 = r6 + r3
            int r6 = r6 + (-10)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.widget.internal.placedetails.zzp.c(byte, int, byte, java.lang.Object[]):void");
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
    private static void e(byte r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 68
            int r6 = 72 - r6
            byte[] r0 = com.google.android.libraries.places.widget.internal.placedetails.zzp.$$d
            int r5 = r5 * 15
            int r5 = r5 + 84
            int r7 = r7 * 31
            int r1 = r7 + 38
            byte[] r1 = new byte[r1]
            int r7 = r7 + 37
            r2 = 0
            if (r0 != 0) goto L18
            r4 = r7
            r3 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L26:
            int r3 = r3 + 1
            r4 = r0[r6]
        L2a:
            int r6 = r6 + 1
            int r4 = -r4
            int r5 = r5 + r4
            int r5 = r5 + (-1)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.widget.internal.placedetails.zzp.e(byte, short, int, java.lang.Object[]):void");
    }

    public final void zzb() {
        int i = 2 % 2;
        int i2 = f796a + 47;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        zzl(2);
        int i4 = asBinder + 115;
        f796a = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void zzc() {
        int i = 2 % 2;
        int i2 = f796a + 79;
        asBinder = i2 % 128;
        zzl(i2 % 2 != 0 ? 5 : 3);
    }

    public final void zzd() {
        int i = 2 % 2;
        int i2 = f796a + 91;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        zzl(4);
        int i4 = f796a + 29;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final void zzl(int i) {
        int i2 = 2 % 2;
        int i3 = f796a + 49;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        zzait zzaitVarZza = zzajc.zza();
        zzaitVarZza.zze(i);
        zzaitVarZza.zza(this.zza);
        zzaitVarZza.zzb(this.zzb);
        zzaitVarZza.zzc(this.zzc);
        zzbae zzbaeVarZzG = zzaitVarZza.zzG();
        Intrinsics.checkNotNullExpressionValue(zzbaeVarZzG, "");
        zzajc zzajcVar = (zzajc) zzbaeVarZzG;
        zzoz zzozVar = this.zzd;
        if (zzozVar != null) {
            zzozVar.zzb(zzajcVar);
        }
        int i5 = asBinder + 35;
        f796a = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void zzm(int i) {
        int i2 = 2 % 2;
        int i3 = f796a + 11;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        zzait zzaitVarZza = zzajc.zza();
        zzaitVarZza.zzf(i);
        zzaitVarZza.zza(this.zza);
        zzaitVarZza.zzb(this.zzb);
        zzaitVarZza.zzc(this.zzc);
        zzbae zzbaeVarZzG = zzaitVarZza.zzG();
        Intrinsics.checkNotNullExpressionValue(zzbaeVarZzG, "");
        zzajc zzajcVar = (zzajc) zzbaeVarZzG;
        zzoz zzozVar = this.zzd;
        if (zzozVar != null) {
            int i5 = asBinder + 123;
            f796a = i5 % 128;
            int i6 = i5 % 2;
            zzozVar.zzb(zzajcVar);
            int i7 = f796a + 37;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = asBinder + 75;
        f796a = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 33 / 0;
        }
    }

    private static void d(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        Object obj;
        int i2 = 2;
        int i3 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        int i4 = $10 + 67;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (true) {
            obj = null;
            if (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 >= length3) {
                break;
            }
            int i6 = $11 + 105;
            $10 = i6 % 128;
            int i7 = i6 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 8328), 1235 - Color.argb(0, 0, 0, 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 35, -653973969, false, $$g(b2, b3, b3), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getLongPressTimeout() >> 16), 2764 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 15 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1504416861, false, $$g(b4, b5, (byte) (b5 + 2)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - TextUtils.indexOf("", "")), 254 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 22, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (65201 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 2891 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), MotionEvent.axisFromString("") + 18, 2012627446, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (b ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
        int i8 = $10 + 11;
        $11 = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0371  */
    /* JADX WARN: Code duplicated, block: B:34:0x0442  */
    /* JADX WARN: Code duplicated, block: B:37:0x0499  */
    public final void zze() throws Throwable {
        int i;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        Object[] objArr;
        Object[] objArr2;
        int i2 = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            char c = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 31532);
            int iAlpha = Color.alpha(0) + 921;
            int deadChar = KeyEvent.getDeadChar(0, 0) + 28;
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            c(bArr[7], bArr[80], bArr[37], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, iAlpha, deadChar, -1048449946, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).getLong(null);
        Object[] objArr4 = new Object[1];
        d(new char[]{0, 0, 0, 0}, new char[]{42864, 62297, 41074, 46344}, (char) ((-1) - ImageFormat.getBitsPerPixel(0)), Gravity.getAbsoluteGravity(0, 0), new char[]{44468, 65143, 32619, 9580, 29735, 58642, 59793, 42806, 50740, 7995, 46691, 34397, 48355, 22700, 401, 44777, 1148, 58010, 61224, 8319, 16390, 27170}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        d(new char[]{0, 0, 0, 0}, new char[]{10875, 18644, 54014, 16382}, (char) (ExpandableListView.getPackedPositionType(0L) + 65234), (-28781526) + Gravity.getAbsoluteGravity(0, 0), new char[]{1875, 14569, 45030, 59009, 65464, 8381, 22749, 14414, 63778, 3907, 13300, 24479, 8026, 12699, 17030}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char cAlpha = (char) (Color.alpha(0) + 31533);
            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 921;
            int i3 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 27;
            byte[] bArr2 = $$a;
            byte b2 = bArr2[7];
            Object[] objArr6 = new Object[1];
            c(b2, (byte) (b2 & 52), bArr2[80], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cAlpha, maximumFlingVelocity, i3, -778300370, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = f796a + 69;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char c2 = (char) (31534 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                int iRed = Color.red(0) + 921;
                int iLastIndexOf = 27 - TextUtils.lastIndexOf("", '0', 0, 0);
                Object[] objArr7 = new Object[1];
                c((byte) 51, (byte) ($$b & 175), $$a[80], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, iRed, iLastIndexOf, -1142834547, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i6 = (-1256809179) + (((~((-810978789) | iFreeMemory)) | 1051968 | (~(963100855 | iFreeMemory))) * (-754));
            int i7 = ~((-1051969) | iFreeMemory);
            int i8 = ~iFreeMemory;
            int i9 = i6 + ((i7 | (~(964152823 | i8))) * (-754)) + ((i8 | (-810978789)) * 754) + 2143754334;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[0])[0] = i11 ^ (i11 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            d(new char[]{0, 0, 0, 0}, new char[]{5750, 4442, 49116, 24328}, (char) (2239 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), ViewConfiguration.getDoubleTapTimeout() >> 16, new char[]{48671, 59018, 50216, 49971, 30139, 39381, 31649, 44900, 3798, 22502, 49248, 54213, 42384, 3876, 9387, 37339, 12274, 21543, 17336, 28992, 41476, 8632, 40652, 25853, 24754, 59735}, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            d(new char[]{0, 0, 0, 0}, new char[]{59771, 4969, 8232, 23292}, (char) (64544 - (ViewConfiguration.getPressedStateDuration() >> 16)), View.getDefaultSize(0, 0), new char[]{27874, 56973, 57590, 681, 25119, 21937, 47174, 57013, 47905, 23419, 18069, 3997, 42554, 2675, 32261, 8889, 1793, 9801}, objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            try {
                try {
                    if (applicationContext != null) {
                        if ((!(applicationContext instanceof ContextWrapper)) || ((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = applicationContext.getApplicationContext();
                            int i12 = asBinder + 15;
                            f796a = i12 % 128;
                            int i13 = i12 % 2;
                        } else {
                            applicationContext = null;
                            i = 4;
                        }
                        char[] cArr = new char[i];
                        // fill-array-data instruction
                        cArr[0] = 0;
                        cArr[1] = 0;
                        cArr[2] = 0;
                        cArr[3] = 0;
                        char[] cArr2 = new char[i];
                        // fill-array-data instruction
                        cArr2[0] = 10027;
                        cArr2[1] = 34887;
                        cArr2[2] = 63204;
                        cArr2[3] = 54134;
                        Object[] objArr11 = new Object[1];
                        d(cArr, cArr2, (char) (30453 - TextUtils.lastIndexOf("", '0', 0, 0)), Color.red(0), new char[]{39356, 48574, 22925, 8857, 599, 13697, 9210, 23161, 8228, 11287, 25379, 13711, 59286, 28180, 43520, 27834}, objArr11);
                        Class<?> cls3 = Class.forName((String) objArr11[0]);
                        Object[] objArr12 = new Object[1];
                        d(new char[]{0, 0, 0, 0}, new char[]{1356, 1542, 43425, 62362}, (char) (39592 - ExpandableListView.getPackedPositionChild(0L)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, new char[]{42770, 32117, 12565, 40067, 17909, 32895, 54519, 24855, 59326, 9519, 30756, 5367, 40014, 41823, 13208, 55412}, objArr12);
                        int iIntValue = ((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue();
                        int i14 = f796a + 61;
                        asBinder = i14 % 128;
                        int i15 = i14 % 2;
                        Object[] objArr13 = {applicationContext, Integer.valueOf(iIntValue), 0, 2143754334};
                        byte[] bArr3 = $$d;
                        byte b3 = bArr3[5];
                        byte b4 = b3;
                        Object[] objArr14 = new Object[1];
                        e(b3, b4, b4, objArr14);
                        Class<?> cls4 = Class.forName((String) objArr14[0]);
                        byte b5 = bArr3[77];
                        byte b6 = b5;
                        Object[] objArr15 = new Object[1];
                        e(b5, b6, b6, objArr15);
                        Object[] objArr16 = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cMakeMeasureSpec = (char) (31533 - View.MeasureSpec.makeMeasureSpec(0, 0));
                            int i16 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 921;
                            int packedPositionGroup = 28 - ExpandableListView.getPackedPositionGroup(0L);
                            Object[] objArr17 = new Object[1];
                            c((byte) 51, (byte) ($$b & 175), $$a[80], objArr17);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMakeMeasureSpec, i16, packedPositionGroup, -1142834547, false, (String) objArr17[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, objArr16);
                        Object[] objArr18 = new Object[1];
                        d(new char[]{0, 0, 0, 0}, new char[]{42864, 62297, 41074, 46344}, (char) (Process.getGidForName("") + 1), TextUtils.lastIndexOf("", '0', 0, 0) + 1, new char[]{44468, 65143, 32619, 9580, 29735, 58642, 59793, 42806, 50740, 7995, 46691, 34397, 48355, 22700, 401, 44777, 1148, 58010, 61224, 8319, 16390, 27170}, objArr18);
                        Class<?> cls5 = Class.forName((String) objArr18[0]);
                        Object[] objArr19 = new Object[1];
                        d(new char[]{0, 0, 0, 0}, new char[]{10875, 18644, 54014, 16382}, (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 65234), AndroidCharacter.getMirror('0') - 11270, new char[]{1875, 14569, 45030, 59009, 65464, 8381, 22749, 14414, 63778, 3907, 13300, 24479, 8026, 12699, 17030}, objArr19);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char c3 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 31532);
                            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 921;
                            int i17 = 29 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            byte[] bArr4 = $$a;
                            byte b7 = bArr4[7];
                            Object[] objArr20 = new Object[1];
                            c(b7, (byte) (b7 & 52), bArr4[80], objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c3, jumpTapTimeout, i17, -778300370, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char c4 = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31533);
                            int i18 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 920;
                            int i19 = 28 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                            byte[] bArr5 = $$a;
                            Object[] objArr21 = new Object[1];
                            c(bArr5[7], bArr5[80], bArr5[37], objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c4, i18, i19, -1048449946, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, lValueOf2);
                        objArr = objArr16;
                    }
                    Object[] objArr110 = new Object[1];
                    d(new char[]{0, 0, 0, 0}, new char[]{42864, 62297, 41074, 46344}, (char) (Process.getGidForName("") + 1), TextUtils.lastIndexOf("", '0', 0, 0) + 1, new char[]{44468, 65143, 32619, 9580, 29735, 58642, 59793, 42806, 50740, 7995, 46691, 34397, 48355, 22700, 401, 44777, 1148, 58010, 61224, 8319, 16390, 27170}, objArr110);
                    Class<?> cls6 = Class.forName((String) objArr110[0]);
                    Object[] objArr111 = new Object[1];
                    d(new char[]{0, 0, 0, 0}, new char[]{10875, 18644, 54014, 16382}, (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 65234), AndroidCharacter.getMirror('0') - 11270, new char[]{1875, 14569, 45030, 59009, 65464, 8381, 22749, 14414, 63778, 3907, 13300, 24479, 8026, 12699, 17030}, objArr111);
                    long jLongValue3 = ((Long) cls6.getDeclaredMethod((String) objArr111[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf3 = Long.valueOf(jLongValue3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char c5 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 31532);
                        int jumpTapTimeout2 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 921;
                        int i110 = 29 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        byte[] bArr6 = $$a;
                        byte b8 = bArr6[7];
                        Object[] objArr22 = new Object[1];
                        c(b8, (byte) (b8 & 52), bArr6[80], objArr22);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c5, jumpTapTimeout2, i110, -778300370, false, (String) objArr22[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, lValueOf3);
                    Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char c6 = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31533);
                        int i111 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 920;
                        int i112 = 28 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        byte[] bArr7 = $$a;
                        Object[] objArr23 = new Object[1];
                        c(bArr7[7], bArr7[80], bArr7[37], objArr23);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c6, i111, i112, -1048449946, false, (String) objArr23[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, lValueOf4);
                    objArr = objArr16;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
                Object[] objArr112 = {applicationContext, Integer.valueOf(iIntValue), 0, 2143754334};
                byte[] bArr8 = $$d;
                byte b9 = bArr8[5];
                byte b10 = b9;
                Object[] objArr113 = new Object[1];
                e(b9, b10, b10, objArr113);
                Class<?> cls7 = Class.forName((String) objArr113[0]);
                byte b11 = bArr8[77];
                byte b12 = b11;
                Object[] objArr114 = new Object[1];
                e(b11, b12, b12, objArr114);
                Object[] objArr115 = (Object[]) cls7.getMethod((String) objArr114[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr112);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cMakeMeasureSpec2 = (char) (31533 - View.MeasureSpec.makeMeasureSpec(0, 0));
                    int i113 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 921;
                    int packedPositionGroup2 = 28 - ExpandableListView.getPackedPositionGroup(0L);
                    Object[] objArr116 = new Object[1];
                    c((byte) 51, (byte) ($$b & 175), $$a[80], objArr116);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMakeMeasureSpec2, i113, packedPositionGroup2, -1142834547, false, (String) objArr116[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, objArr115);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
            i = 4;
            char[] cArr3 = new char[i];
            // fill-array-data instruction
            cArr3[0] = 0;
            cArr3[1] = 0;
            cArr3[2] = 0;
            cArr3[3] = 0;
            char[] cArr4 = new char[i];
            // fill-array-data instruction
            cArr4[0] = 10027;
            cArr4[1] = 34887;
            cArr4[2] = 63204;
            cArr4[3] = 54134;
            Object[] objArr117 = new Object[1];
            d(cArr3, cArr4, (char) (30453 - TextUtils.lastIndexOf("", '0', 0, 0)), Color.red(0), new char[]{39356, 48574, 22925, 8857, 599, 13697, 9210, 23161, 8228, 11287, 25379, 13711, 59286, 28180, 43520, 27834}, objArr117);
            Class<?> cls8 = Class.forName((String) objArr117[0]);
            Object[] objArr118 = new Object[1];
            d(new char[]{0, 0, 0, 0}, new char[]{1356, 1542, 43425, 62362}, (char) (39592 - ExpandableListView.getPackedPositionChild(0L)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, new char[]{42770, 32117, 12565, 40067, 17909, 32895, 54519, 24855, 59326, 9519, 30756, 5367, 40014, 41823, 13208, 55412}, objArr118);
            int iIntValue2 = ((Integer) cls8.getMethod((String) objArr118[0], Object.class).invoke(null, this)).intValue();
            int i114 = f796a + 61;
            asBinder = i114 % 128;
            int i115 = i114 % 2;
        }
        int i20 = ((int[]) objArr[1])[0];
        int i21 = ((int[]) objArr[3])[0];
        if (i21 == i20) {
            int i22 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int i23 = (int) Runtime.getRuntime().totalMemory();
            int i24 = i22 + (-1448678945) + (((~(1505578619 | i23)) | 268501024) * (-756)) + (((~i23) | 1505578619) * 756);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr2[0])[0] = i26 ^ (i26 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i21 / (((i21 - 1) * i21) % 2), 0).show();
            int i27 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i28 = i27 + (-263599478) + (((~((-36509) | iIdentityHashCode)) | (~(1774043135 | iIdentityHashCode))) * 69) + (((~(iIdentityHashCode | 1773248252)) | (~((-831392) | iIdentityHashCode)) | 794883) * (-69)) + 2092526048;
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr2[0])[0] = i30 ^ (i30 << 5);
        }
        int i31 = ((int[]) objArr2[0])[0];
        int i32 = i31 * i31;
        int i33 = -(1087425913 * i31);
        int i34 = (i32 ^ i33) + ((i32 & i33) << 1);
        int i35 = -(i31 * (-1106816787));
        int i36 = (i34 & i35) + (i35 | i34);
        int i37 = (i36 & 1844380713) + (1844380713 | i36);
        int i38 = i37 >> 29;
        int i39 = ((i38 & (-15)) + (i38 | (-15))) / 8;
        int i40 = (i37 - (~((i39 ^ 1) + ((i39 & 1) << 1)))) - 1;
        int i41 = i37 >> 25;
        int i42 = (((i41 | (-255)) << 1) - (i41 ^ (-255))) / 128;
        int i43 = -(i40 ^ (((i42 | 1) << 1) - (i42 ^ 1)));
        int i44 = ((i43 | 9) << 1) - (i43 ^ 9);
        int i45 = ((i44 >> 18) - 32767) / 16384;
        int i46 = ((i45 | 1) << 1) - (i45 ^ 1);
        zzl(7200 / (((-(((i46 | 1) << 1) - (i46 ^ 1))) & i44) * 160));
    }

    public final void zzf() {
        int i = 2 % 2;
        int i2 = asBinder + 99;
        f796a = i2 % 128;
        zzl(i2 % 2 == 0 ? 1 : 7);
        int i3 = f796a + 29;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void zzg() {
        int i = 2 % 2;
        int i2 = asBinder + 1;
        f796a = i2 % 128;
        if (i2 % 2 == 0) {
            zzm(4);
        } else {
            zzm(2);
        }
        int i3 = asBinder + 111;
        f796a = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 91 / 0;
        }
    }

    public final void zzh() {
        int i = 2 % 2;
        int i2 = asBinder + 15;
        f796a = i2 % 128;
        zzm(i2 % 2 != 0 ? 3 : 2);
    }

    public final void zzi() {
        int i = 2 % 2;
        int i2 = f796a + 19;
        asBinder = i2 % 128;
        zzm(i2 % 2 != 0 ? 3 : 4);
    }

    public final void zzk() {
        int i = 2 % 2;
        int i2 = f796a + 71;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        zzm(6);
        int i4 = asBinder + 85;
        f796a = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void zzj(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 33;
        f796a = i3 % 128;
        int i4 = i3 % 2;
        zzait zzaitVarZza = zzajc.zza();
        zzaitVarZza.zzf(5);
        zzaitVarZza.zzd(i);
        zzaitVarZza.zza(this.zza);
        zzaitVarZza.zzb(this.zzb);
        zzaitVarZza.zzc(this.zzc);
        zzbae zzbaeVarZzG = zzaitVarZza.zzG();
        Intrinsics.checkNotNullExpressionValue(zzbaeVarZzG, "");
        zzajc zzajcVar = (zzajc) zzbaeVarZzG;
        zzoz zzozVar = this.zzd;
        if (zzozVar != null) {
            zzozVar.zzb(zzajcVar);
        }
        int i5 = f796a + 69;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        b();
        CREATOR = new zzo();
        int i = TuitionPaymentFragmentbindingInflater1 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
        if (i % 2 != 0) {
            int i2 = 81 / 0;
        }
    }

    public zzp(zzajb zzajbVar, zzaiz zzaizVar, List list) {
        Intrinsics.checkNotNullParameter(zzajbVar, "");
        Intrinsics.checkNotNullParameter(zzaizVar, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.zza = zzajbVar;
        this.zzb = zzaizVar;
        this.zzc = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = f796a + 3;
        asBinder = i2 % 128;
        return i2 % 2 != 0 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.zza.name());
        parcel.writeString(this.zzb.name());
        List list = this.zzc;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        int i3 = f796a + 65;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        while (it.hasNext()) {
            int i5 = f796a + 95;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            parcel.writeString(((zzaiw) it.next()).name());
        }
    }

    public final void zza(zzoz zzozVar) {
        int i = 2 % 2;
        int i2 = f796a;
        int i3 = i2 + 29;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        this.zzd = zzozVar;
        int i5 = i2 + 33;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void b() {
        b = -6377398940819159759L;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -981105359;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) 46931;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r5, int r6, byte r7) {
        /*
            byte[] r0 = com.google.android.libraries.places.widget.internal.placedetails.zzp.$$c
            int r6 = r6 * 4
            int r6 = r6 + 4
            int r5 = r5 * 2
            int r1 = r5 + 1
            int r7 = r7 + 102
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r6
            r3 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r5) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L20:
            r4 = r0[r6]
            int r3 = r3 + 1
        L24:
            int r6 = r6 + 1
            int r7 = r7 + r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.widget.internal.placedetails.zzp.$$g(int, int, byte):java.lang.String");
    }
}
