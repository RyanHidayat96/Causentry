package com.google.android.libraries.places.internal;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.logging.Level;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbkp implements zzbks, zzbsk {
    private static int $10 = 0;
    private static int $11 = 1;
    private zzbmk zzr;
    private final Object zzs = new Object();
    private final zzbwp zzt;
    private final zzbsn zzu;
    private int zzv;
    private boolean zzw;
    private boolean zzx;
    private final int zzy;
    private static final byte[] $$d = {80, -8, 43, 65, -7, -8, 5, 0, -8, Base64.padSymbol, -72, 11, -15, -7, 13, -12, 8, -5, -17, 66, -40, -21, -15, -7, 13, -12, 8, -5, -17, 37, -44, 18, -3, -3, 9, -21, -15, -7, 13, -12, 8, -5, -17, 37, -44, 77, -76, 1, -8, -10, -1, 76, -16, 10, -3, -36, -54, 1, 12, -16, 1, 10, -14, 22, -41, 8, -9, 9, 0, -18, 8, 3, 20, -24, -15, 8, -5, 0, 46, -36, 9, -14, 8, -9, -2, 27, -20, -27, 9, 5, -12, -9, 43, -47, 14, -9, -9, 5, -12, -9, -2, 0, 8, -1, -9, 5, -14, 0, -8, -1, 0, -8, 6, -2, -21, 10, 1, -21, 39, -37, 8, -4, -10, 5, -4, -4, 2, -23, 6, -11, 62};
    private static final int $$e = 90;
    private static final byte[] $$a = {38, 31, -70, -1, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 3;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 3513925638353817136L;

    protected zzbkp(int i, zzbwg zzbwgVar, zzbwp zzbwpVar) {
        if (zzbwgVar == null) {
            throw new NullPointerException("statsTraceCtx");
        }
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = 2 % 2;
        if (zzbwpVar == null) {
            throw new NullPointerException("transportTracer");
        }
        int i6 = i2 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 37 / 0;
        }
        this.zzt = zzbwpVar;
        zzbsn zzbsnVar = new zzbsn(this, zzbfs.zza, i, zzbwgVar, zzbwpVar);
        this.zzu = zzbsnVar;
        this.zzr = zzbsnVar;
        this.zzy = 32768;
        int i8 = TuitionPaymentFragmentbindingInflater1 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 29 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 + 4
            int r7 = r7 * 14
            int r7 = r7 + 84
            byte[] r0 = com.google.android.libraries.places.internal.zzbkp.$$a
            int r8 = r8 + 1
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r9
            r4 = r2
            r9 = r8
            goto L2b
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            int r9 = r9 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r7 = -r7
            int r9 = r9 + r7
            int r7 = r9 + (-10)
            r9 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbkp.a(short, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 + 4
            int r7 = r7 * 23
            int r7 = r7 + 84
            byte[] r0 = com.google.android.libraries.places.internal.zzbkp.$$d
            int r8 = r8 * 23
            int r8 = r8 + 53
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r9
            r4 = r2
            goto L2c
        L14:
            r3 = r2
        L15:
            int r9 = r9 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2c:
            int r7 = -r7
            int r9 = r9 + r7
            int r7 = r9 + (-3)
            r9 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbkp.d(byte, short, short, java.lang.Object[]):void");
    }

    private final boolean zza() {
        boolean z;
        synchronized (this.zzs) {
            z = false;
            if (this.zzw && this.zzv < this.zzy && !this.zzx) {
                z = true;
            }
        }
        return z;
    }

    private final void zzc() {
        boolean zZza;
        synchronized (this.zzs) {
            zZza = zza();
            if (!zZza && zzbkq.zza.isLoggable(Level.FINEST)) {
                zzbkq.zza.logp(Level.FINEST, "io.grpc.internal.AbstractStream$TransportState", "notifyIfReady", "Stream not ready so skip notifying listener.\ndetails: allocated/deallocated:{0}/{3}, sent queued: {1}, ready thresh: {2}", new Object[]{Boolean.valueOf(this.zzw), Integer.valueOf(this.zzv), Integer.valueOf(this.zzy), Boolean.valueOf(this.zzx)});
            }
        }
        if (zZza) {
            zzh().zzd();
        }
    }

    protected abstract zzbwj zzh();

    final void zzl() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            zzbsn zzbsnVar = this.zzu;
            zzbsnVar.zzf(this);
            this.zzr = zzbsnVar;
            throw null;
        }
        zzbsn zzbsnVar2 = this.zzu;
        zzbsnVar2.zzf(this);
        this.zzr = zzbsnVar2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
    }

    final void zzm(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 57;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 == 0) {
            this.zzr.zza(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.zzr.zza(i);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 123;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.libraries.places.internal.zzbsk
    public final void zzn(zzbwi zzbwiVar) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 5;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            zzh().zzb(zzbwiVar);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        zzh().zzb(zzbwiVar);
        int i3 = TuitionPaymentFragmentbindingInflater1 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
    }

    protected final void zzq(zzbgh zzbghVar) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        this.zzr.zzb(zzbghVar);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 39;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected final void zzr() {
        if (zzh() == null) {
            throw new IllegalStateException();
        }
        synchronized (this.zzs) {
            if (!(!this.zzw)) {
                throw new IllegalStateException("Already allocated");
            }
            this.zzw = true;
        }
        zzc();
    }

    protected final void zzs() {
        synchronized (this.zzs) {
            this.zzx = true;
        }
    }

    public final void zzt(int i) {
        boolean z;
        synchronized (this.zzs) {
            if (!this.zzw) {
                throw new IllegalStateException("onStreamAllocated was not called, but it seems the stream is active");
            }
            int i2 = this.zzv;
            int i3 = this.zzy;
            int i4 = i2 - i;
            this.zzv = i4;
            z = false;
            if (i2 >= i3 && i4 < i3) {
                z = true;
            }
        }
        if (z) {
            zzc();
        }
    }

    final /* synthetic */ void zzw(int i) {
        synchronized (this.zzs) {
            this.zzv += i;
        }
    }

    protected final void zzo(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        if (z) {
            this.zzr.close();
            return;
        }
        this.zzr.zze();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    protected final void zzp(zzbtu zzbtuVar) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.zzr.zzd(zzbtuVar);
                int i3 = 48 / 0;
            } else {
                this.zzr.zzd(zzbtuVar);
            }
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 107;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            zzE(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x018f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0190  */
    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        Object obj;
        Throwable cause;
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (true) {
            obj = null;
            if (getrealtimecapturelatency.b >= cArr.length) {
                break;
            }
            int i3 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 19472), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2623, 12 - Process.getGidForName(""), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39421 - TextUtils.lastIndexOf("", '0', 0)), 481 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.indexOf((CharSequence) "", '0', 0) + 38, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i4 = $11 + 59;
                $10 = i4 % 128;
                int i5 = i4 % 2;
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i6 = $10 + 61;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                try {
                    Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (39422 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 480 - ((byte) KeyEvent.getModifierMetaStateMask()), 37 - (KeyEvent.getMaxKeyCode() >> 16), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    obj.hashCode();
                    throw null;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (39422 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 481 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0200  */
    protected final zzbwp zzu() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cArgb = (char) (Color.argb(0, 0, 0, 0) + 31533);
            int mirror = 969 - AndroidCharacter.getMirror('0');
            int iResolveSizeAndState = 28 - View.resolveSizeAndState(0, 0, 0);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(bArr[7], bArr[80], bArr[3], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cArgb, mirror, iResolveSizeAndState, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{10058, 30320, 34085, 54470, 25488, 45387, 49265, 8054, 44780, 64901, 2839, 23103, 59694, 14569, 22457, 58709, 13334, 17389, 37629, 8619, 32620, 36377}, TextUtils.getCapsMode("", 0, 0) + 20789, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{10062, 4936, 20308, 47990, 63332, 8965, 7957, 19216, 34614, 62413, 12241, 7162, 22518, 33669, 65436}, 13327 - TextUtils.indexOf("", ""), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cAlpha = (char) (31533 - Color.alpha(0));
            int iResolveSize = 921 - View.resolveSize(0, 0);
            int modifierMetaStateMask = 27 - ((byte) KeyEvent.getModifierMetaStateMask());
            byte[] bArr2 = $$a;
            byte b = bArr2[80];
            Object[] objArr5 = new Object[1];
            a(b, (byte) (b | 52), bArr2[3], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cAlpha, iResolveSize, modifierMetaStateMask, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cCombineMeasuredStates = (char) (31533 - View.combineMeasuredStates(0, 0));
                int trimmedLength = 921 - TextUtils.getTrimmedLength("");
                int scrollBarFadeDuration = 28 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                byte b2 = $$a[80];
                Object[] objArr6 = new Object[1];
                a(b2, (byte) (b2 | 37), (byte) (48 | $$b), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cCombineMeasuredStates, trimmedLength, scrollBarFadeDuration, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i2 = ~iIdentityHashCode;
            int i3 = ((((-1180440333) + ((iIdentityHashCode | 285214731) * 988)) + (((~(457595563 | i2)) | 1144103248) * (-1976))) + ((((~(iIdentityHashCode | (-1316484081))) | 285214731) | (~(1316484080 | i2))) * 988)) - 523437624;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArr[0])[0] = i5 ^ (i5 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{10058, 65452, 38557, 44514, 17632, 7119, 12857, 51546, 57346, 34666, 24129, 29958, 3462, 9373, 64481, 37605, 43469, 16443, 26429, 15897, 54603, 60510, 33631, 23457, 29330, 2446}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 55528, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{10056, 49869, 60543, 38880, 45314, 23706, 17965, 24687, 3011, 13680, 53497, 64019, 58796, 36669, 43349, 21727, 32372, 6534}, View.MeasureSpec.getSize(0) + 58771, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i6 = TuitionPaymentFragmentbindingInflater1 + 109;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
                    int i7 = i6 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{10049, 61617, 34987, 41147, 30953, 4256, 10408, 49304, 39060, 45270, 18614, 24731, 14492, 53472, 59636, 33011}, View.resolveSize(0, 0) + 55291, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{10050, 12576, 2960, 25608, 32483, 22377, 41413, 47707, 37915, 61101, 50958, 53638, 10844, 1255, 7517, 30671}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 5742, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -523437624};
                byte[] bArr3 = $$d;
                byte b3 = bArr3[47];
                Object[] objArr13 = new Object[1];
                d(b3, b3, bArr3[50], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b4 = bArr3[7];
                byte b5 = b4;
                Object[] objArr14 = new Object[1];
                d(b4, b5, (byte) (b5 | 74), objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cCombineMeasuredStates2 = (char) (31533 - View.combineMeasuredStates(0, 0));
                    int defaultSize = 921 - View.getDefaultSize(0, 0);
                    int offsetAfter = TextUtils.getOffsetAfter("", 0) + 28;
                    byte b6 = $$a[80];
                    Object[] objArr16 = new Object[1];
                    a(b6, (byte) (b6 | 37), (byte) (48 | $$b), objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cCombineMeasuredStates2, defaultSize, offsetAfter, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    c(new char[]{10058, 30320, 34085, 54470, 25488, 45387, 49265, 8054, 44780, 64901, 2839, 23103, 59694, 14569, 22457, 58709, 13334, 17389, 37629, 8619, 32620, 36377}, 20789 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    c(new char[]{10062, 4936, 20308, 47990, 63332, 8965, 7957, 19216, 34614, 62413, 12241, 7162, 22518, 33669, 65436}, 13327 - (KeyEvent.getMaxKeyCode() >> 16), objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char mode = (char) (31533 - View.MeasureSpec.getMode(0));
                        int minimumFlingVelocity = 921 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 28;
                        byte[] bArr4 = $$a;
                        byte b7 = bArr4[80];
                        Object[] objArr19 = new Object[1];
                        a(b7, (byte) (b7 | 52), bArr4[3], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(mode, minimumFlingVelocity, keyRepeatDelay, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char offsetBefore = (char) (31533 - TextUtils.getOffsetBefore("", 0));
                        int i8 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 920;
                        int fadingEdgeLength = 28 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        byte[] bArr5 = $$a;
                        Object[] objArr20 = new Object[1];
                        a(bArr5[7], bArr5[80], bArr5[3], objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(offsetBefore, i8, fadingEdgeLength, -1048449946, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr15;
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
        int i9 = ((int[]) objArr[1])[0];
        int i10 = ((int[]) objArr[3])[0];
        if (i10 == i9) {
            int i11 = TuitionPaymentFragmentbindingInflater1 + 61;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
            int i12 = i11 % 2;
            int i13 = ((int[]) objArr[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i14 = i13 + (((~((-1746436161) | startElapsedRealtime)) | 2427939) * 449) + 1422969749 + (((~((~startElapsedRealtime) | (-1746436161))) | 2427939) * 449);
            int i15 = (i14 << 13) ^ i14;
            int i16 = i15 ^ (i15 >>> 17);
            ((int[]) objArr21[0])[0] = i16 ^ (i16 << 5);
            return this.zzt;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = (String[]) objArr[4];
        if (strArr != null) {
            int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 91;
            TuitionPaymentFragmentbindingInflater1 = i17 % 128;
            int i18 = i17 % 2 != 0 ? 0 : 1;
            while (i18 < strArr.length) {
                int i19 = TuitionPaymentFragmentbindingInflater1 + 69;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i19 % 128;
                if (i19 % 2 != 0) {
                    arrayList.add(strArr[i18]);
                    i18 += 91;
                } else {
                    arrayList.add(strArr[i18]);
                    i18++;
                }
            }
        }
        throw new RuntimeException(String.valueOf(i10));
    }

    final /* synthetic */ boolean zzv() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        boolean zZza = zza();
        if (i3 != 0) {
            int i4 = 56 / 0;
        }
        return zZza;
    }

    final /* synthetic */ zzbmk zzx() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 29;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        zzbmk zzbmkVar = this.zzr;
        int i5 = i3 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 33 / 0;
        }
        return zzbmkVar;
    }
}
