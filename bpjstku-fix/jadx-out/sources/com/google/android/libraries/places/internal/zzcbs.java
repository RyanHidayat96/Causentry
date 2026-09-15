package com.google.android.libraries.places.internal;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcbs implements zzcbk {
    private static int $10 = 0;
    private static int $11 = 1;
    public final zzcbx zza;
    public final zzcbj zzb;
    public boolean zzc;
    private static final byte[] $$d = {89, 92, -72, 43, 12, -2, -63, 57, 8, 0, -8, 5, -7, -55, 51, 13, -10, 14, -3, -6, -5, -54, 62, -3, -7, 16, -17, 17, -9, -4, 14, -69, 66, -4, -11, 2, 2, 14, -69, 36, -46, 69, -5, 33, -12, 11, -11, 6, -1, -30, 17, 24, -12, -8, 9, 6, -46, 44, -17, 6, 6, -8, 9, 6, -1, -3, -11, -2, 6, -8, 11, -3, 5, -2, -3, 5, -9, -1, 18, -13, -4, 18, -42, 34, -11, 1, 7, -8, 1, 1, -5, 20, -9, 8, -67};
    private static final int $$e = 115;
    private static final byte[] $$a = {108, -26, -110, 50, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
    private static final int $$b = 126;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static long b = 6477147168396222781L;

    public zzcbs(zzcbx zzcbxVar) {
        Intrinsics.checkNotNullParameter(zzcbxVar, "");
        this.zza = zzcbxVar;
        this.zzb = new zzcbj();
    }

    private static void a(short s, short s2, byte b2, Object[] objArr) {
        int i = (b2 * 52) + 4;
        int i2 = s2 * 52;
        byte[] bArr = $$a;
        int i3 = 98 - (s * 14);
        byte[] bArr2 = new byte[i2 + 1];
        int i4 = -1;
        if (bArr == null) {
            int i5 = i2 + i;
            i++;
            i3 = i5 - 11;
            i4 = -1;
        }
        while (true) {
            int i6 = i4 + 1;
            bArr2[i6] = (byte) i3;
            if (i6 == i2) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i++;
            i3 = (i3 + bArr[i]) - 11;
            i4 = i6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 15
            int r6 = 99 - r6
            int r8 = r8 * 39
            int r8 = 42 - r8
            int r7 = r7 * 13
            int r0 = r7 + 40
            byte[] r1 = com.google.android.libraries.places.internal.zzcbs.$$d
            byte[] r0 = new byte[r0]
            int r7 = r7 + 39
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L31
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r8 = r8 + 1
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L28:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L31:
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzcbs.d(short, short, int, java.lang.Object[]):void");
    }

    public final String toString() {
        int i = 2 % 2;
        zzcbx zzcbxVar = this.zza;
        StringBuilder sb = new StringBuilder(zzcbxVar.toString().length() + 8);
        sb.append("buffer(");
        sb.append(zzcbxVar);
        sb.append(")");
        String string = sb.toString();
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, com.google.android.libraries.places.internal.zzcbx
    public final void close() throws Throwable {
        zzcbj zzcbjVar;
        int i = 2 % 2;
        if (this.zzc) {
            return;
        }
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        Throwable th = null;
        try {
            if (i2 % 2 == 0) {
                zzcbjVar = this.zzb;
                if (zzcbjVar.zzb() > 0) {
                    this.zza.zzc(zzcbjVar, zzcbjVar.zzb());
                }
            } else {
                zzcbjVar = this.zzb;
                if (zzcbjVar.zzb() > 0) {
                    this.zza.zzc(zzcbjVar, zzcbjVar.zzb());
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.zza.close();
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 103;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.zzc = true;
        if (th != null) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b A[PHI: r1
  0x002b: PHI (r1v7 com.google.android.libraries.places.internal.zzcbj) = (r1v6 com.google.android.libraries.places.internal.zzcbj), (r1v12 com.google.android.libraries.places.internal.zzcbj) binds: [B:10:0x0029, B:7:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.libraries.places.internal.zzcbk, com.google.android.libraries.places.internal.zzcbx, java.io.Flushable
    public final void flush() throws IOException {
        zzcbj zzcbjVar;
        int i = 2 % 2;
        if (this.zzc) {
            throw new IllegalStateException("closed");
        }
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            zzcbjVar = this.zzb;
            if (zzcbjVar.zzb() > 1) {
                this.zza.zzc(zzcbjVar, zzcbjVar.zzb());
            }
        } else {
            zzcbjVar = this.zzb;
            if (zzcbjVar.zzb() > 0) {
                this.zza.zzc(zzcbjVar, zzcbjVar.zzb());
            }
        }
        this.zza.flush();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) throws IOException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(byteBuffer, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (this.zzc) {
            throw new IllegalStateException("closed");
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        int iWrite = this.zzb.write(byteBuffer);
        zza();
        return iWrite;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        int i3 = $11 + 15;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i5 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 19473), 2625 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 13 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (b ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 39421), (ViewConfiguration.getWindowTouchSlop() >> 8) + 481, 37 - Color.blue(0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i6 = $11 + 119;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            try {
                Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (39422 - TextUtils.getOffsetAfter("", 0)), 481 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (KeyEvent.getMaxKeyCode() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x021d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0227  */
    @Override // com.google.android.libraries.places.internal.zzcbk
    public final zzcbk zzH(String str) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        int i4 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char doubleTapTimeout = (char) (37567 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 625;
            int i5 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14;
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            a(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(doubleTapTimeout, maximumFlingVelocity, i5, -477065106, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{34887, 48979, 58996, 11525, 21541, 39880, 49888, 2485, 12433, 26534, 44806, 54876, 7451, 17418, 35624, 45782, 63995, 8366, 22444, 40776, 50777, 3450}, 14107 - Color.red(0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{34883, 56685, 8713, 30499, 56521, 8576, 30376, 56421, 8571, 30232, 56268, 8447, 30107, 55984, 8289}, 21798 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (37568 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
            int iGreen = Color.green(0) + 625;
            int absoluteGravity = 14 - Gravity.getAbsoluteGravity(0, 0);
            byte[] bArr = $$a;
            byte b4 = (byte) (-bArr[5]);
            Object[] objArr5 = new Object[1];
            a(b4, b4, bArr[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iGreen, absoluteGravity, -976899241, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
            int i7 = i6 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c2 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 37566);
                int deadChar = 625 - KeyEvent.getDeadChar(0, 0);
                int maximumDrawingCacheSize = 14 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                byte b5 = (byte) (-$$a[5]);
                byte b6 = b5;
                Object[] objArr6 = new Object[1];
                a(b5, b6, b6, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, deadChar, maximumDrawingCacheSize, -973632554, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i8 = ((int[]) objArr7[2])[0];
            int i9 = ((int[]) objArr7[0])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i8};
            int[] iArr2 = {i9};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i10 = ~startUptimeMillis;
            int i11 = ((((-210428464) + ((startUptimeMillis | 548504580) * 988)) + (((~(649172238 | i10)) | 1073898224) * (-1976))) + ((((~(startUptimeMillis | (-1174565883))) | 548504580) | (~(1174565882 | i10))) * 988)) - 1572021520;
            int i12 = (i11 << 13) ^ i11;
            int i13 = i12 ^ (i12 >>> 17);
            ((int[]) objArr[1])[0] = i13 ^ (i13 << 5);
            objArr = new Object[]{iArr2, new int[1], iArr, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{34887, 54757, 13080, 37203, 65277, 23598, 47692, 1971, 25903, 49987, 8340, 36455, 60539, 18828, 38692, 62828, 21120, 45106, 7800, 31624, 55798, 10111, 33930, 58056, 16511, 44455}, 23981 - TextUtils.indexOf("", "", 0, 0), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{34885, 25162, 23654, 13855, 8231, 6709, 62660, 61128, 55454, 45751, 44208, 34652, 29033, 27394, 17676, 16184, 10713, 993}, ((Process.getThreadPriority(0) + 20) >> 6) + 59929, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 77;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
                if (i14 % 2 == 0) {
                    int i15 = 87 / 0;
                    if (applicationContext instanceof ContextWrapper) {
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = null;
                        }
                    }
                } else if (applicationContext instanceof ContextWrapper) {
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = null;
                    }
                }
                applicationContext = applicationContext.getApplicationContext();
            }
            int length = str != null ? str.length() : 0;
            Object[] objArr10 = new Object[1];
            c(new char[]{34836, 11638, 49706, 26584, 7315, 45645, 22398, 3171, 41399, 18077, 64594, 37204, 13887, 60402, 32929, 9736, 56129, 28818, 5546, 51884, 24631, 1352, 47775, 24455, 62651, 43580, 20262, 58496, 39385, 16195, 54308, 35188, 11967, 50066, 31006, 7712, 45923, 26814, 3520, 41812, 22536, 64878, 37536, 14329, 60764, 33298, 10131, 56488, 29111, 5939, 52292, 25032, 1750, 48103, 20794, 63015, 43911, 16595, 58896, 39795, 12328, 54753, 35522, 8271}, 42293 - ExpandableListView.getPackedPositionGroup(0L), objArr10);
            String str2 = (String) objArr10[0];
            Object[] objArr11 = new Object[1];
            c(new char[]{34885, 31356, 27700, 24225, 16634, 13108, 9510, 6028, 6555, 3155, 65112, 57549, 53895, 50411, 46970, 47463, 43940, 40446, 32822, 29300, 25743, 22214, 22866, 19293, 15820, 12241, 4538, 1062, 63073, 63664, 60149, 56635, 53119, 45535, 41925, 38406, 39006, 35524, 31877, 28393, 20780, 17200, 13806, 10233, 10805, 7245, 3727, 61632, 58127, 54542, 51097, 51678, 48056, 44581, 36967, 33465, 29869, 26467, 26954, 23435, 19859, 12313, 8794, 5317}, 62011 - Color.red(0), objArr11);
            try {
                Object[] objArr12 = {applicationContext, new String[]{str2, (String) objArr11[0]}, Integer.valueOf(length), 17, -1572021520};
                byte[] bArr2 = $$d;
                byte b7 = bArr2[9];
                Object[] objArr13 = new Object[1];
                d(b7, b7, bArr2[85], objArr13);
                Class<?> cls3 = Class.forName((String) objArr13[0]);
                byte b8 = bArr2[85];
                Object[] objArr14 = new Object[1];
                d(b8, b8, bArr2[9], objArr14);
                Object[] objArr15 = (Object[]) cls3.getMethod((String) objArr14[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                int i16 = ((int[]) objArr15[0])[0];
                int i17 = ((int[]) objArr15[2])[0];
                if (applicationContext != null) {
                    int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 67;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 % 128;
                    int i19 = i18 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cMyPid = (char) ((Process.myPid() >> 22) + 37567);
                        int i20 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 624;
                        int maxKeyCode = 14 - (KeyEvent.getMaxKeyCode() >> 16);
                        byte b9 = (byte) (-$$a[5]);
                        byte b10 = b9;
                        Object[] objArr16 = new Object[1];
                        a(b9, b10, b10, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMyPid, i20, maxKeyCode, -973632554, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        c(new char[]{34887, 48979, 58996, 11525, 21541, 39880, 49888, 2485, 12433, 26534, 44806, 54876, 7451, 17418, 35624, 45782, 63995, 8366, 22444, 40776, 50777, 3450}, 14107 - TextUtils.getOffsetBefore("", 0), objArr17);
                        Class<?> cls4 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        c(new char[]{34883, 56685, 8713, 30499, 56521, 8576, 30376, 56421, 8571, 30232, 56268, 8447, 30107, 55984, 8289}, (ViewConfiguration.getLongPressTimeout() >> 16) + 21799, objArr18);
                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 37567);
                            int i21 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 624;
                            int iNormalizeMetaState = 14 - KeyEvent.normalizeMetaState(0);
                            byte[] bArr3 = $$a;
                            byte b11 = (byte) (-bArr3[5]);
                            Object[] objArr19 = new Object[1];
                            a(b11, b11, bArr3[7], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarFadeDuration, i21, iNormalizeMetaState, -976899241, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char scrollDefaultDelay = (char) (37567 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                            int edgeSlop = 625 - (ViewConfiguration.getEdgeSlop() >> 16);
                            int iRed = Color.red(0) + 14;
                            byte b12 = $$a[7];
                            byte b13 = b12;
                            Object[] objArr20 = new Object[1];
                            a(b12, b13, b13, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollDefaultDelay, edgeSlop, iRed, -477065106, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (((int[]) objArr[2])[0] != ((int[]) objArr[0])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[3];
            if (strArr2 == null) {
                throw null;
            }
            while (i4 < strArr2.length) {
                int i22 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i22 % 128;
                int i23 = i22 % 2;
                arrayList.add(strArr2[i4]);
                i4++;
                int i24 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 93;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i24 % 128;
                int i25 = i24 % 2;
            }
            throw null;
        }
        int i26 = ((int[]) objArr[1])[0];
        int i27 = ((int[]) objArr[2])[0];
        int i28 = ((int[]) objArr[0])[0];
        String[] strArr3 = (String[]) objArr[3];
        int[] iArr3 = {i27};
        int iIdentityHashCode = System.identityHashCode(this);
        int i29 = ~iIdentityHashCode;
        int i30 = (~((-904931511) | i29)) | 885006354;
        int i31 = ~(iIdentityHashCode | 938731766);
        int i32 = i26 + (-579670956) + ((i30 | i31) * (-502)) + ((i31 | (~(i29 | (-19925157)))) * TypedValues.PositionType.TYPE_DRAWPATH);
        int i33 = (i32 << 13) ^ i32;
        int i34 = i33 ^ (i33 >>> 17);
        ((int[]) objArr[1])[0] = i34 ^ (i34 << 5);
        Object[] objArr21 = {new int[]{i28}, new int[1], iArr3, strArr3};
        if (!this.zzc) {
            int i35 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i35 % 128;
            if (i35 % 2 == 0) {
                this.zzb.zzv(str);
                return zza();
            }
            this.zzb.zzv(str);
            zza();
            throw null;
        }
        int i36 = ((int[]) objArr21[1])[0];
        int i37 = ((i36 * i36) - (~(-(1334758273 * i36)))) - 1;
        int i38 = -(i36 * 415563035);
        int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
        int i40 = ((i39 | (-1667823676)) << 1) - ((-1667823676) ^ i39);
        int i41 = ((i40 >> 16) - 131071) / 65536;
        int i42 = (i40 - (~((i41 ^ 1) + ((i41 & 1) << 1)))) - 1;
        int i43 = ((i40 >> 15) - 262143) / 131072;
        int i44 = -(i42 ^ ((i43 ^ 1) + ((i43 & 1) << 1)));
        int i45 = (i44 ^ 4) + ((i44 & 4) << 1);
        int i46 = ((i45 >> 26) + ComposerKt.defaultsKey) / 64;
        throw new IllegalStateException("4/closed".substring(14064 / (((-(((i46 ^ 1) + ((i46 & 1) << 1)) + 1)) & i45) * 1758)));
    }

    @Override // com.google.android.libraries.places.internal.zzcbk
    public final zzcbk zzI(byte[] bArr) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(bArr, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(bArr, "");
        if (this.zzc) {
            throw new IllegalStateException("closed");
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        this.zzb.zzy(bArr);
        return zza();
    }

    @Override // com.google.android.libraries.places.internal.zzcbk
    public final zzcbk zzJ(int i) throws IOException {
        int i2 = 2 % 2;
        if (this.zzc) {
            throw new IllegalStateException("closed");
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        this.zzb.zzA(i);
        zzcbk zzcbkVarZza = zza();
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return zzcbkVarZza;
    }

    @Override // com.google.android.libraries.places.internal.zzcbk
    public final zzcbk zzK(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = i3 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        if (!this.zzc) {
            int i6 = i3 + 19;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            int i7 = i6 % 2;
            this.zzb.zzB(i);
            return zza();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.google.android.libraries.places.internal.zzcbk
    public final zzcbk zzL(int i) throws IOException {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        if (this.zzc) {
            throw new IllegalStateException("closed");
        }
        this.zzb.zzC(i);
        zzcbk zzcbkVarZza = zza();
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return zzcbkVarZza;
    }

    @Override // com.google.android.libraries.places.internal.zzcbx
    public final void zzc(zzcbj zzcbjVar, long j) throws IOException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(zzcbjVar, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(zzcbjVar, "");
        if (this.zzc) {
            throw new IllegalStateException("closed");
        }
        this.zzb.zzc(zzcbjVar, j);
        zza();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
    }

    public final zzcbk zza() throws IOException {
        int i = 2 % 2;
        if (!(!this.zzc)) {
            throw new IllegalStateException("closed");
        }
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        zzcbj zzcbjVar = this.zzb;
        long jZzi = zzcbjVar.zzi();
        if (jZzi > 0) {
            this.zza.zzc(zzcbjVar, jZzi);
        }
        zzcbs zzcbsVar = this;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return zzcbsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r6.zzc == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if ((!r6.zzc) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        r1 = r1 + 19;
        com.google.android.libraries.places.internal.zzcbs.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r1 % 128;
        r1 = r1 % 2;
     */
    @Override // java.nio.channels.Channel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isOpen() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.libraries.places.internal.zzcbs.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            int r2 = r1 + 55
            int r3 = r2 % 128
            com.google.android.libraries.places.internal.zzcbs.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L18
            boolean r2 = r6.zzc
            r5 = 81
            int r5 = r5 / r4
            if (r2 != 0) goto L25
            goto L1d
        L18:
            boolean r2 = r6.zzc
            r2 = r2 ^ r3
            if (r2 == 0) goto L25
        L1d:
            int r1 = r1 + 19
            int r2 = r1 % 128
            com.google.android.libraries.places.internal.zzcbs.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r2
            int r1 = r1 % r0
            return r3
        L25:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzcbs.isOpen():boolean");
    }
}
