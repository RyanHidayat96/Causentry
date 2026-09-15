package com.google.android.libraries.places.internal;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.ComposerKt;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaks extends zzazy implements zzbbm {
    private static final byte[] $$c = {21, -108, 100, 114};
    private static final int $$f = 20;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {6, 51, 46, 31, 8, 25, -20, 25, 8, 27, 5, 13, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$e = 221;
    private static final byte[] $$a = {42, -104, -68, 105, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 50;
    private static int b = 0;
    private static int asBinder = 1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 54568;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 37892;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 38447;
    private static char TuitionPaymentFragmentbindingInflater1 = 33044;

    /* synthetic */ zzaks(byte[] bArr) {
        super(zzakz.zzU);
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
    private static void a(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 52
            int r0 = r6 + 1
            byte[] r1 = com.google.android.libraries.places.internal.zzaks.$$a
            int r7 = 103 - r7
            int r8 = r8 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L2a
        L12:
            r3 = r2
        L13:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L24:
            r3 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L2a:
            int r8 = r8 + r7
            int r7 = r8 + (-11)
            r8 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzaks.a(short, byte, int, java.lang.Object[]):void");
    }

    private static void d(int i, short s, int i2, Object[] objArr) {
        int i3 = s + 4;
        byte[] bArr = $$d;
        int i4 = 103 - (i2 * 19);
        int i5 = i * 29;
        byte[] bArr2 = new byte[38 - i5];
        int i6 = 37 - i5;
        int i7 = -1;
        if (bArr == null) {
            i4 = (i3 + i4) - 10;
            i3 = i3;
        }
        while (true) {
            int i8 = i3 + 1;
            i7++;
            bArr2[i7] = (byte) i4;
            if (i7 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i4 = (i4 + bArr[i8]) - 10;
                i3 = i8;
            }
        }
    }

    public final zzaks zza(zzuq zzuqVar) {
        int i = 2 % 2;
        int i2 = b + 115;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        zzy();
        ((zzakz) this.zza).zzc(zzuqVar);
        int i4 = b + 55;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final zzaks zzb(zzamj zzamjVar) {
        int i = 2 % 2;
        int i2 = b + 55;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            zzy();
            ((zzakz) this.zza).zzd(zzamjVar);
            throw null;
        }
        zzy();
        ((zzakz) this.zza).zzd(zzamjVar);
        int i3 = b + 9;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return this;
    }

    public final zzaks zzc(zzamb zzambVar) {
        int i = 2 % 2;
        int i2 = b + 53;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            zzy();
            ((zzakz) this.zza).zze(zzambVar);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        zzy();
        ((zzakz) this.zza).zze(zzambVar);
        int i3 = b + 45;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return this;
    }

    public final zzaks zzd(zzalm zzalmVar) {
        int i = 2 % 2;
        int i2 = asBinder + 25;
        b = i2 % 128;
        int i3 = i2 % 2;
        zzy();
        ((zzakz) this.zza).zzf(zzalmVar);
        int i4 = b + 29;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    public final zzaks zze(zzakm zzakmVar) {
        int i = 2 % 2;
        int i2 = asBinder + 21;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            zzy();
            ((zzakz) this.zza).zzg(zzakmVar);
            return this;
        }
        zzy();
        ((zzakz) this.zza).zzg(zzakmVar);
        throw null;
    }

    public final zzaks zzf(zzaip zzaipVar) {
        int i = 2 % 2;
        int i2 = asBinder + 99;
        b = i2 % 128;
        int i3 = i2 % 2;
        zzy();
        ((zzakz) this.zza).zzh(zzaipVar);
        int i4 = asBinder + 45;
        b = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    public final zzaks zzg(boolean z) {
        int i = 2 % 2;
        int i2 = b + 25;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        zzy();
        ((zzakz) this.zza).zzi(z);
        int i4 = asBinder + 67;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final zzaks zzh(String str) {
        int i = 2 % 2;
        int i2 = b + 47;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            zzy();
            ((zzakz) this.zza).zzj(str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        zzy();
        ((zzakz) this.zza).zzj(str);
        int i3 = b + 61;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return this;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            char c = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            int i4 = $10 + 125;
            $11 = i4 % 128;
            int i5 = 58224;
            char c2 = 1;
            if (i4 % 2 == 0) {
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 % 0];
                i2 = 1;
            } else {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                i2 = 0;
            }
            while (i2 < 16) {
                int i6 = $10 + 19;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                char c3 = cArr3[c2];
                char c4 = cArr3[c];
                int i8 = (c4 + i5) ^ ((c4 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 8611973335120459638L)));
                int i9 = c4 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(TuitionPaymentFragmentbindingInflater1);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[c2] = Integer.valueOf(i8);
                    objArr2[c] = Integer.valueOf(c3);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c5 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 47772);
                        int i10 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 467;
                        int iMyTid = (Process.myTid() >> 22) + 13;
                        Class[] clsArr = new Class[4];
                        clsArr[c] = Integer.TYPE;
                        clsArr[c2] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c5, i10, iMyTid, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[c2] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[c]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47774 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 468 - View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getScrollBarSize() >> 8) + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i2++;
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
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] ^ cArr3[1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b2 = (byte) 0;
                byte b3 = (byte) (b2 - 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 2323, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 43, -1312321721, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x020a  */
    public final zzaks zzi(String str) throws Throwable {
        int length;
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
            int iIndexOf = 876 - TextUtils.indexOf("", "", 0, 0);
            int deadChar = KeyEvent.getDeadChar(0, 0) + 10;
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            a(b2, (byte) (b2 + 5), bArr[5], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(pressedStateDuration, iIndexOf, deadChar, 252381699, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{30129, 31809, 52172, 30059, 36298, 7840, 4836, 24637, 59413, 27429, 55024, 55330, 12416, 7058, 18247, 40168, 30047, 6199, 2369, 53734, 49508, 22, 39053, 27006}, 22 - TextUtils.getCapsMode("", 0, 0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{61823, 50434, 2833, 13519, 1713, 8809, 55505, 33141, 8836, 11653, 47727, 2872, 51614, 48978, 24838, 5400, 58078, 53155}, 15 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
            int packedPositionGroup = 876 - ExpandableListView.getPackedPositionGroup(0L);
            int deadChar2 = KeyEvent.getDeadChar(0, 0) + 10;
            byte[] bArr2 = $$a;
            byte b3 = bArr2[5];
            Object[] objArr5 = new Object[1];
            a((byte) (-b3), bArr2[54], b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(windowTouchSlop, packedPositionGroup, deadChar2, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int offsetBefore = 876 - TextUtils.getOffsetBefore("", 0);
                int i2 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 10;
                byte b4 = $$a[7];
                byte b5 = b4;
                Object[] objArr6 = new Object[1];
                a(b4, b5, (byte) (b5 | 51), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(doubleTapTimeout, offsetBefore, i2, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i3 = 2063533684 + ((94844459 | iIdentityHashCode) * 376) + (((~((~iIdentityHashCode) | 474982340)) | 27267115) * (-376)) + (((~(iIdentityHashCode | (-474982341))) | (-434672112)) * 376) + 1225784831;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{44753, 61890, 2320, 29452, 18932, 16154, 31281, 44331, 19360, 58288, 49327, 56120, 24537, 2958, 44507, 48555, 63884, 41619, 30660, 40505, 15994, 23760, 5195, 18392, 18131, 57244, 5355, 51552}, TextUtils.indexOf((CharSequence) "", '0', 0) + 27, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{42906, 43043, 64018, 43688, 30883, 30299, 55647, 22099, 11959, 41834, 10374, 9392, 5123, 30136, 43388, 20523, 24741, 54412, 44062, 48847}, 18 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i6 = asBinder + 55;
                    b = i6 % 128;
                    if (i6 % 2 != 0) {
                        ((ContextWrapper) applicationContext).getBaseContext();
                        throw null;
                    }
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        int i7 = asBinder + 61;
                        b = i7 % 128;
                        int i8 = i7 % 2;
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            if (str != null) {
                int i9 = b + 83;
                asBinder = i9 % 128;
                if (i9 % 2 == 0) {
                    str.length();
                    throw null;
                }
                length = str.length();
                int i10 = asBinder + 51;
                b = i10 % 128;
                int i11 = i10 % 2;
            } else {
                length = 0;
            }
            int i12 = asBinder + 33;
            b = i12 % 128;
            int i13 = i12 % 2;
            try {
                Object[] objArr10 = {applicationContext, Integer.valueOf(length), 1225784831};
                byte[] bArr3 = $$d;
                byte b6 = bArr3[15];
                Object[] objArr11 = new Object[1];
                d((byte) (-b6), b6, bArr3[36], objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                Object[] objArr12 = new Object[1];
                d(bArr3[36], (byte) (-bArr3[27]), (byte) (-bArr3[15]), objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
                        int i14 = 876 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int i15 = 10 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        byte b7 = $$a[7];
                        byte b8 = b7;
                        Object[] objArr14 = new Object[1];
                        a(b7, b8, (byte) (b8 | 51), objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, i14, i15, 256017550, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                    try {
                        Object[] objArr15 = new Object[1];
                        c(new char[]{30129, 31809, 52172, 30059, 36298, 7840, 4836, 24637, 59413, 27429, 55024, 55330, 12416, 7058, 18247, 40168, 30047, 6199, 2369, 53734, 49508, 22, 39053, 27006}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 22, objArr15);
                        Class<?> cls4 = Class.forName((String) objArr15[0]);
                        Object[] objArr16 = new Object[1];
                        c(new char[]{61823, 50434, 2833, 13519, 1713, 8809, 55505, 33141, 8836, 11653, 47727, 2872, 51614, 48978, 24838, 5400, 58078, 53155}, 15 - (ViewConfiguration.getEdgeSlop() >> 16), objArr16);
                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                            int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 876;
                            int iIndexOf3 = TextUtils.indexOf("", "") + 10;
                            byte[] bArr4 = $$a;
                            byte b9 = bArr4[5];
                            Object[] objArr17 = new Object[1];
                            a((byte) (-b9), bArr4[54], b9, objArr17);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(jumpTapTimeout, iIndexOf2, iIndexOf3, 2009631821, false, (String) objArr17[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                            int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 877;
                            int i16 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 10;
                            byte[] bArr5 = $$a;
                            byte b10 = bArr5[7];
                            Object[] objArr18 = new Object[1];
                            a(b10, (byte) (b10 + 5), bArr5[5], objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(fadingEdgeLength, iLastIndexOf, i16, 252381699, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr13;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i17 = ((int[]) objArr[2])[0];
        int i18 = ((int[]) objArr[0])[0];
        if (i18 != i17) {
            throw new RuntimeException(String.valueOf(i18));
        }
        int i19 = ((int[]) objArr[1])[0];
        Object[] objArr19 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i20 = i19 + (-454980592) + (((-159417355) | iFreeMemory) * (-627)) + (((~(192976474 | iFreeMemory)) | 233286703) * (-627)) + (((~(iFreeMemory | 233286703)) | (~((~iFreeMemory) | (-192976475)))) * 627);
        int i21 = (i20 << 13) ^ i20;
        int i22 = i21 ^ (i21 >>> 17);
        ((int[]) objArr19[1])[0] = i22 ^ (i22 << 5);
        zzy();
        zzakz zzakzVar = (zzakz) this.zza;
        int i23 = ((int[]) objArr19[1])[0];
        int i24 = i23 * i23;
        int i25 = -(1289038469 * i23);
        int i26 = (i24 ^ i25) + ((i24 & i25) << 1);
        int i27 = -(i23 * (-1478761163));
        int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
        int i29 = (i28 & 1409995977) + (1409995977 | i28);
        int i30 = ((i29 >> 16) - 131071) / 65536;
        int i31 = -(((i29 - (~((i30 & 1) + (i30 | 1)))) - 1) ^ ((((i29 >> 26) + ComposerKt.defaultsKey) / 64) + 1));
        int i32 = (i31 ^ 4) + ((i31 & 4) << 1);
        int i33 = i32 >> 18;
        int i34 = (((i33 | (-32767)) << 1) - (i33 ^ (-32767))) / 16384;
        int i35 = (i34 ^ 1) + ((i34 & 1) << 1);
        zzakzVar.zzk("6/4.4.1".substring(4312 / (((-((i35 & 1) + (i35 | 1))) & i32) * 539)));
        return this;
    }

    public final zzaks zzj(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 119;
        b = i2 % 128;
        int i3 = i2 % 2;
        zzy();
        ((zzakz) this.zza).zzl(str);
        int i4 = b + 105;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    public final zzaks zzk(zzbdv zzbdvVar) {
        int i = 2 % 2;
        int i2 = asBinder + 117;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            zzy();
            ((zzakz) this.zza).zzm((zzbdw) zzbdvVar.zzG());
            throw null;
        }
        zzy();
        ((zzakz) this.zza).zzm((zzbdw) zzbdvVar.zzG());
        int i3 = b + 123;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return this;
    }

    public final zzaks zzl(zzahk zzahkVar) {
        int i = 2 % 2;
        int i2 = asBinder + 93;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            zzy();
            ((zzakz) this.zza).zzn((zzahl) zzahkVar.zzG());
            return this;
        }
        zzy();
        ((zzakz) this.zza).zzn((zzahl) zzahkVar.zzG());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final zzaks zzm(boolean z) {
        int i = 2 % 2;
        int i2 = b + 13;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            zzy();
            ((zzakz) this.zza).zzo(z);
            int i3 = 20 / 0;
        } else {
            zzy();
            ((zzakz) this.zza).zzo(z);
        }
        int i4 = b + 7;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    public final zzaks zzn(zzajc zzajcVar) {
        int i = 2 % 2;
        int i2 = b + 31;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            zzy();
            ((zzakz) this.zza).zzp(zzajcVar);
            throw null;
        }
        zzy();
        ((zzakz) this.zza).zzp(zzajcVar);
        int i3 = asBinder + 109;
        b = i3 % 128;
        int i4 = i3 % 2;
        return this;
    }

    public final zzaks zzo(zzajx zzajxVar) {
        int i = 2 % 2;
        int i2 = asBinder + 103;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            zzy();
            ((zzakz) this.zza).zzq(zzajxVar);
            int i3 = 49 / 0;
        } else {
            zzy();
            ((zzakz) this.zza).zzq(zzajxVar);
        }
        int i4 = asBinder + 53;
        b = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    public final zzaks zzp(int i) {
        int i2 = 2 % 2;
        int i3 = b + 87;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            zzy();
            ((zzakz) this.zza).zzs(i);
            int i4 = 92 / 0;
        } else {
            zzy();
            ((zzakz) this.zza).zzs(i);
        }
        int i5 = asBinder + 89;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return this;
        }
        throw null;
    }

    public final zzaks zzq(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 19;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            zzy();
            ((zzakz) this.zza).zzt(i);
            throw null;
        }
        zzy();
        ((zzakz) this.zza).zzt(i);
        int i4 = b + 65;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    public final zzaks zzr(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 115;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            zzy();
            ((zzakz) this.zza).zzu(i);
            return this;
        }
        zzy();
        ((zzakz) this.zza).zzu(i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final zzaks zzs(int i) {
        int i2 = 2 % 2;
        int i3 = b + 45;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            zzy();
            ((zzakz) this.zza).zzv(i);
            int i4 = 50 / 0;
        } else {
            zzy();
            ((zzakz) this.zza).zzv(i);
        }
        return this;
    }

    private zzaks() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r5, short r6, int r7) {
        /*
            int r7 = r7 * 2
            int r0 = 1 - r7
            int r6 = r6 + 4
            int r5 = r5 * 2
            int r5 = 108 - r5
            byte[] r1 = com.google.android.libraries.places.internal.zzaks.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L17
            r4 = r5
            r5 = r7
            r3 = r2
            goto L29
        L17:
            r3 = r2
        L18:
            int r6 = r6 + 1
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L25:
            r4 = r1[r6]
            int r3 = r3 + 1
        L29:
            int r5 = r5 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzaks.$$g(byte, short, int):java.lang.String");
    }
}
