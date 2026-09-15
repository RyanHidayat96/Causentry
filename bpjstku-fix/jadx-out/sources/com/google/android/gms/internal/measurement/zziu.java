package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.recyclerview.widget.ItemTouchHelper;
import defpackage.initSession;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class zziu extends zzmf implements zznn {
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final zziu zzj;
    private int zzb;
    private long zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private float zzh;
    private double zzi;
    private static final byte[] $$c = {53, -70, 9, -72};
    private static final int $$f = 103;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {83, -4, -55, -17, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 59, -6, -10, 13, -20, 14, -12, -7, 11, -72, 63, -7, -14, -1, -1, 11, -72, 56, 2, 3, -18, 10, -7, -16, 8, -65, 73, -3, -23, 17, 30, -15, 8, -14, 3, -4, -33, 14, 21, -15, -11, 6, 3, -49, 41, -20, 3, 3, -11, 6, 3, -21, 4, 2, -13, 2, 2, -10, -33, 34, -11, 3, -14, 16, -18, 10, -68};
    private static final int $$e = 183;
    private static final byte[] $$a = {12, 11, -9, -106, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 72;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static int b = 1;

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        zziu zziuVar = new zziu();
        zzj = zziuVar;
        zzmf.zzcp(zziu.class, zziuVar);
        int i = b + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private zziu() {
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 14
            int r6 = 98 - r6
            int r5 = r5 * 52
            int r5 = r5 + 4
            int r0 = r7 + 1
            byte[] r1 = com.google.android.gms.internal.measurement.zziu.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r6
            r6 = r7
            r3 = r2
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L23:
            r4 = r1[r5]
            int r3 = r3 + 1
        L27:
            int r6 = r6 + r4
            int r6 = r6 + (-10)
            int r5 = r5 + 1
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zziu.a(int, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 15
            int r7 = r7 + 84
            int r5 = r5 * 11
            int r0 = 49 - r5
            byte[] r1 = com.google.android.gms.internal.measurement.zziu.$$d
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            int r5 = 48 - r5
            r2 = 0
            if (r1 != 0) goto L16
            r4 = r5
            r3 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L24:
            int r3 = r3 + 1
            int r6 = r6 + 1
            r4 = r1[r6]
        L2a:
            int r7 = r7 + r4
            int r7 = r7 + 3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zziu.d(short, int, int, java.lang.Object[]):void");
    }

    public static zzit zzm() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        zzit zzitVar = (zzit) zzj.zzck();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        return zzitVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    protected final Object zzl(int i, Object obj, Object obj2) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
        int i4 = i3 % 128;
        TuitionPaymentFragmentbindingInflater1 = i4;
        int i5 = i3 % 2;
        int i6 = i - 1;
        byte[] bArr = null;
        if (i6 == 0) {
            int i7 = TuitionPaymentFragmentbindingInflater1 + 25;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
            if (i7 % 2 == 0) {
                return (byte) 1;
            }
            bArr.hashCode();
            throw null;
        }
        if (i6 == 2) {
            Object objZzcq = zzcq(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            int i8 = TuitionPaymentFragmentbindingInflater1 + 31;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
            int i9 = i8 % 2;
            return objZzcq;
        }
        if (i6 == 3) {
            return new zziu();
        }
        if (i6 == 4) {
            return new zzit(bArr);
        }
        int i10 = i4 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
        if (i10 % 2 != 0) {
            if (i6 != 3) {
                throw null;
            }
        } else if (i6 != 5) {
            throw null;
        }
        return zzj;
    }

    final /* synthetic */ void zzo(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
        int i4 = TuitionPaymentFragmentbindingInflater1 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    final /* synthetic */ void zzp(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        str.getClass();
        int i4 = this.zzb;
        this.zzb = i3 == 0 ? i4 | 5 : i4 | 4;
        this.zzf = str;
    }

    private static void c(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4;
        long j;
        char[] cArr2;
        int i5 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr3 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (true) {
            i4 = 29209604;
            j = 0;
            if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i2) {
                break;
            }
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i6 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i6]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.getOffsetBefore("", 0) + 3291, 31 - ExpandableListView.getPackedPositionGroup(0L), 1199271174, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Process.myPid() >> 22), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 651, 44 - Drawable.resolveOpacity(0, 0), -450685997, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
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
            int i7 = $10 + 79;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr4 = new char[i2];
            System.arraycopy(cArr3, 0, cArr4, 0, i2);
            System.arraycopy(cArr4, 0, cArr3, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr4, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr3, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            int i9 = $10 + 89;
            $11 = i9 % 128;
            int i10 = i9 % 2;
        }
        if (z) {
            int i11 = $10 + 73;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
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
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) - 1), KeyEvent.keyCodeFromString("") + 651, 43 - TextUtils.lastIndexOf("", '0'), -450685997, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    i4 = 29209604;
                    j = 0;
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
    }

    public final long zzg() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        long j = this.zzg;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cMyPid = (char) (31533 - (Process.myPid() >> 22));
            int iMakeMeasureSpec = 921 - View.MeasureSpec.makeMeasureSpec(0, 0);
            int iBlue = Color.blue(0) + 28;
            byte b2 = $$a[80];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            a(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyPid, iMakeMeasureSpec, iBlue, -1048449946, false, (String) objArr2[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(true, 251 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), View.MeasureSpec.getSize(0) + 22, 23 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), new char[]{'\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(true, 254 - Color.green(0), 15 - Color.red(0), 13 - TextUtils.getOffsetAfter("", 0), new char[]{2, '\r', 5, 65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 31533);
            int iIndexOf = TextUtils.indexOf("", "") + 921;
            int iIndexOf2 = 28 - TextUtils.indexOf("", "", 0);
            byte[] bArr = $$a;
            Object[] objArr5 = new Object[1];
            a(bArr[80], bArr[37], (byte) 52, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveOpacity, iIndexOf, iIndexOf2, -778300370, false, (String) objArr5[0], null);
        }
        if (j2 == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = TuitionPaymentFragmentbindingInflater1 + 97;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 31533);
                int iIndexOf3 = 920 - TextUtils.indexOf((CharSequence) "", '0');
                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 28;
                byte b4 = $$a[37];
                byte b5 = b4;
                Object[] objArr6 = new Object[1];
                a(b4, b5, (byte) (b5 | 36), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(doubleTapTimeout, iIndexOf3, absoluteGravity, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i4 = (-1949926163) + (((~((-819063527) | iMaxMemory)) | 1148994 | (~(955016117 | iMaxMemory))) * (-754));
            int i5 = ~((-1148995) | iMaxMemory);
            int i6 = ~iMaxMemory;
            int i7 = ((i4 + ((i5 | (~(956165111 | i6))) * (-754))) + ((i6 | (-819063527)) * 754)) - 959643603;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(false, (Process.myPid() >> 22) + ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 25, 7 - Drawable.resolveOpacity(0, 0), new char[]{22, 65521, 5, 15, 2, 65534, 1, 65534, 11, 1, 15, '\f', 6, 1, 65483, 65534, '\r', '\r', 65483, 65502, 0, 17, 6, 19, 6, 17}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(true, 256 - Process.getGidForName(""), 18 - KeyEvent.keyCodeFromString(""), 10 - ExpandableListView.getPackedPositionGroup(0L), new char[]{6, 6, 65495, '\n', 4, 65531, '\b', '\b', 11, 65529, 4, 5, 65535, '\n', 65527, 65529, 65535, 2}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i10 = TuitionPaymentFragmentbindingInflater1 + 39;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
                if (i10 % 2 != 0) {
                    boolean z = applicationContext instanceof ContextWrapper;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(true, Color.red(0) + 249, 16 - TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getEdgeSlop() >> 16) + 3, new char[]{20, 65535, '\b', 11, 3, 18, 17, 23, 65521, 65484, 5, '\f', 65535, '\n', 65484, 65535}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(false, 253 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 15 - ExpandableListView.getPackedPositionChild(0L), ((byte) KeyEvent.getModifierMetaStateMask()) + 16, new char[]{65534, 65535, '\b', 14, 3, 14, 19, 65506, 65531, '\r', 2, 65501, '\t', 65534, 65535, 3}, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -959643603};
                byte[] bArr2 = $$d;
                byte b6 = bArr2[35];
                byte b7 = (byte) (b6 + 1);
                byte b8 = b6;
                Object[] objArr13 = new Object[1];
                d(b7, b8, (byte) (-b8), objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b9 = bArr2[35];
                byte b10 = (byte) (-b9);
                Object[] objArr14 = new Object[1];
                d(b10, (byte) (b10 | 46), (byte) (b9 + 1), objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(0L) + 31533);
                    int longPressTimeout = 921 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0) + 28;
                    byte b11 = $$a[37];
                    byte b12 = b11;
                    Object[] objArr15 = new Object[1];
                    a(b11, b12, (byte) (b12 | 36), objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionGroup, longPressTimeout, absoluteGravity2, -1142834547, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr16 = new Object[1];
                    c(true, Gravity.getAbsoluteGravity(0, 0) + ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, TextUtils.getOffsetBefore("", 0) + 22, new char[]{'\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534}, objArr16);
                    Class<?> cls5 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    c(true, View.MeasureSpec.makeMeasureSpec(0, 0) + 254, ((Process.getThreadPriority(0) + 20) >> 6) + 15, 13 - (ViewConfiguration.getScrollDefaultDelay() >> 16), new char[]{2, '\r', 5, 65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6}, objArr17);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c = (char) (31533 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        int keyRepeatTimeout = 921 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int iIndexOf4 = TextUtils.indexOf("", "", 0, 0) + 28;
                        byte[] bArr3 = $$a;
                        Object[] objArr18 = new Object[1];
                        a(bArr3[80], bArr3[37], (byte) 52, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, keyRepeatTimeout, iIndexOf4, -778300370, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf("", "") + 31533);
                        int absoluteGravity3 = Gravity.getAbsoluteGravity(0, 0) + 921;
                        int iIndexOf5 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 29;
                        byte b13 = $$a[80];
                        byte b14 = b13;
                        Object[] objArr19 = new Object[1];
                        a(b13, b14, b14, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, absoluteGravity3, iIndexOf5, -1048449946, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
        int i11 = ((int[]) objArr[1])[0];
        int i12 = ((int[]) objArr[3])[0];
        if (i12 == i11) {
            int i13 = ((int[]) objArr[0])[0];
            Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int i14 = (int) Runtime.getRuntime().totalMemory();
            int i15 = i13 + 2106421723 + (((~((-1773523343) | i14)) | 20748) * 576) + (((~((~i14) | (-1773502595))) | 535553) * 576) + 11950848;
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            ((int[]) objArr20[0])[0] = i17 ^ (i17 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
                TuitionPaymentFragmentbindingInflater1 = i18 % 128;
                int i19 = 2;
                int i20 = i18 % 2;
                int i21 = 0;
                while (i21 < strArr.length) {
                    int i22 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
                    TuitionPaymentFragmentbindingInflater1 = i22 % 128;
                    if (i22 % i19 == 0) {
                        arrayList.add(strArr[i21]);
                        i21 += 5;
                    } else {
                        arrayList.add(strArr[i21]);
                        i21++;
                    }
                    i19 = 2;
                }
            }
            int[] iArr = new int[i12];
            int i23 = i12 - 1;
            iArr[i23] = 1;
            Toast.makeText((Context) null, iArr[((i12 * i23) % 2) - 1], 1).show();
            int i24 = ((int[]) objArr[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i25 = i24 + (-1243091780) + (((~((~iIdentityHashCode) | (-581935892))) | 1192143752) * (-235)) + (((~((-581935892) | iIdentityHashCode)) | 1192143752) * (-470)) + (((~(iIdentityHashCode | (-547422228))) | 1157630088) * 235);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr21[0])[0] = i27 ^ (i27 << 5);
            int i28 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
            TuitionPaymentFragmentbindingInflater1 = i28 % 128;
            int i29 = i28 % 2;
        }
        return j;
    }

    static /* synthetic */ zziu zzv() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 41;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        zziu zziuVar = zzj;
        int i5 = i3 + 65;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 17 / 0;
        }
        return zziuVar;
    }

    public final boolean zza() {
        int i = 2 % 2;
        if ((this.zzb & 1) != 0) {
            int i2 = TuitionPaymentFragmentbindingInflater1 + 117;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public final long zzb() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 19;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        long j = this.zzd;
        int i5 = i3 + 107;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String zzc() {
        String str;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        if (i2 % 2 == 0) {
            str = this.zze;
            int i4 = 83 / 0;
        } else {
            str = this.zze;
        }
        int i5 = i3 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean zzd() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 73;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        if (i2 % 2 != 0) {
            if ((this.zzb & 4) != 0) {
                return true;
            }
        } else if ((this.zzb & 4) != 0) {
            return true;
        }
        int i4 = i3 + 121;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public final String zze() {
        String str;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 101;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.zzf;
            int i4 = 41 / 0;
        } else {
            str = this.zzf;
        }
        int i5 = i2 + 31;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean zzf() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            if ((this.zzb & 14) != 0) {
                return true;
            }
        } else if ((this.zzb & 8) != 0) {
            return true;
        }
        int i4 = i2 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public final boolean zzh() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 69;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        if ((this.zzb & 16) == 0) {
            return false;
        }
        int i5 = i2 + 115;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public final float zzi() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 71;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        float f = this.zzh;
        int i5 = i3 + 27;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean zzj() {
        int i = 2 % 2;
        if ((this.zzb & 32) != 0) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            return i2 % 2 != 0;
        }
        int i3 = TuitionPaymentFragmentbindingInflater1 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public final double zzk() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        double d = this.zzi;
        int i5 = i2 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return d;
    }

    final /* synthetic */ void zzn(long j) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        this.zzb |= 1;
        this.zzd = j;
        int i5 = i3 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 32 / 0;
        }
    }

    final /* synthetic */ void zzq() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 79;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        this.zzb &= -5;
        this.zzf = zzj.zzf;
        int i5 = i2 + 13;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final /* synthetic */ void zzr(long j) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 91;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        this.zzb |= 8;
        this.zzg = j;
        int i5 = i3 + 61;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
    }

    final /* synthetic */ void zzs() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 65;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        this.zzb = i2 % 2 != 0 ? this.zzb & 52 : this.zzb & (-9);
        this.zzg = 0L;
        int i4 = i3 + 109;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 78 / 0;
        }
    }

    final /* synthetic */ void zzt(double d) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 69;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        this.zzb |= 32;
        this.zzi = d;
        int i5 = i3 + 117;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
    }

    final /* synthetic */ void zzu() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        this.zzb = i2 % 2 != 0 ? 0 : this.zzb & (-33);
        this.zzi = 0.0d;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -83722251;
    }

    private static String $$g(short s, short s2, byte b2) {
        byte[] bArr = $$c;
        int i = 120 - b2;
        int i2 = (s2 * 4) + 4;
        int i3 = s * 4;
        byte[] bArr2 = new byte[i3 + 1];
        int i4 = -1;
        if (bArr == null) {
            i4 = -1;
            i = (-i2) + i;
            i2++;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i;
            if (i5 == i3) {
                return new String(bArr2, 0);
            }
            int i6 = i;
            i4 = i5;
            i = (-bArr[i2]) + i6;
            i2++;
        }
    }
}
