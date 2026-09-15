package com.squareup.okhttp;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import androidx.collection.SieveCacheKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.squareup.okhttp.internal.http.HeaderParser;
import defpackage.initSession;
import defpackage.setVideoStabilizationMode;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public final class CacheControl {
    public static final CacheControl FORCE_CACHE;
    public static final CacheControl FORCE_NETWORK;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static char[] b;
    String headerValue;
    private final boolean isPrivate;
    private final boolean isPublic;
    private final int maxAgeSeconds;
    private final int maxStaleSeconds;
    private final int minFreshSeconds;
    private final boolean mustRevalidate;
    private final boolean noCache;
    private final boolean noStore;
    private final boolean noTransform;
    private final boolean onlyIfCached;
    private final int sMaxAgeSeconds;
    private static final byte[] $$c = {81, 125, 2, 46};
    private static final int $$f = 136;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {58, 66, -14, -31, 15, 1, -60, 60, 11, 3, -5, 8, -4, -52, 54, 16, -7, 17, 0, -3, -2, -51, 60, 9, 9, -66, 66, -9, 18, 6, -66, 66, 5, -8, 4, 10, -59, 37, 34, 0, 16, -15, 11, 2, 36, -9, 14, -8, 9, 2, -27, 20, 27, -9, -5, 12, 9, -43, 47, -14, 9, 9, -5, 12, 9, -15, 10, 8, -7, 8, 8, -4, -27, 40, -5, 9, -8, 22, -12, 16, -62};
    private static final int $$e = 124;
    private static final byte[] $$a = {117, 57, 101, -72, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 100;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 52
            int r6 = r6 + 4
            int r7 = r7 + 1
            int r8 = r8 * 14
            int r8 = 98 - r8
            byte[] r0 = com.squareup.okhttp.CacheControl.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-10)
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.CacheControl.a(byte, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.squareup.okhttp.CacheControl.$$d
            int r7 = r7 * 3
            int r7 = 41 - r7
            int r6 = r6 * 15
            int r6 = 99 - r6
            int r5 = r5 * 40
            int r5 = 44 - r5
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r6 = r5
            r4 = r7
            r3 = r2
            goto L29
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L27:
            r4 = r0[r5]
        L29:
            int r5 = r5 + 1
            int r6 = r6 + r4
            int r6 = r6 + (-3)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.CacheControl.d(byte, byte, short, java.lang.Object[]):void");
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
        b();
        FORCE_NETWORK = new Builder().noCache().build();
        FORCE_CACHE = new Builder().onlyIfCached().maxStale(Integer.MAX_VALUE, TimeUnit.SECONDS).build();
        int i = TuitionPaymentFragmentbindingInflater1 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i % 128;
        if (i % 2 == 0) {
            int i2 = 92 / 0;
        }
    }

    private CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, String str) {
        this.noCache = z;
        this.noStore = z2;
        this.maxAgeSeconds = i;
        this.sMaxAgeSeconds = i2;
        this.isPrivate = z3;
        this.isPublic = z4;
        this.mustRevalidate = z5;
        this.maxStaleSeconds = i3;
        this.minFreshSeconds = i4;
        this.onlyIfCached = z6;
        this.noTransform = z7;
        this.headerValue = str;
    }

    private CacheControl(Builder builder) {
        this.noCache = builder.noCache;
        this.noStore = builder.noStore;
        this.maxAgeSeconds = builder.maxAgeSeconds;
        this.sMaxAgeSeconds = -1;
        this.isPrivate = false;
        this.isPublic = false;
        this.mustRevalidate = false;
        this.maxStaleSeconds = builder.maxStaleSeconds;
        this.minFreshSeconds = builder.minFreshSeconds;
        this.onlyIfCached = builder.onlyIfCached;
        this.noTransform = builder.noTransform;
    }

    public final boolean noCache() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 13;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        boolean z = this.noCache;
        int i5 = i3 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean noStore() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.noStore;
        int i5 = i2 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int maxAgeSeconds() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = this.maxAgeSeconds;
        int i5 = i2 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    public final int sMaxAgeSeconds() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.sMaxAgeSeconds;
        if (i3 != 0) {
            int i5 = 40 / 0;
        }
        return i4;
    }

    public final boolean isPrivate() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.isPrivate;
        int i4 = i3 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final boolean isPublic() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        boolean z = this.isPublic;
        int i5 = i3 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean mustRevalidate() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z = this.mustRevalidate;
        int i4 = i3 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final int maxStaleSeconds() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.maxStaleSeconds;
        }
        throw null;
    }

    public final int minFreshSeconds() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 93;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        int i5 = this.minFreshSeconds;
        int i6 = i3 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final boolean onlyIfCached() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        boolean z = this.onlyIfCached;
        int i5 = i3 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void c(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        char c = 0;
        int i2 = iArr[0];
        byte b2 = 1;
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = b;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i6 = $11 + 41;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[c] = Integer.valueOf(cArr[i8]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b3 = (byte) 5;
                        byte b4 = (byte) (b3 - 5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getLongPressTimeout() >> 16), 1270 - (KeyEvent.getMaxKeyCode() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 17, 407021364, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i8++;
                    c = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            int i9 = $10 + 23;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr4 = new char[i3];
            setvideostabilizationmode.b = 0;
            char c2 = 0;
            while (setvideostabilizationmode.b < i3) {
                int i11 = $11 + 57;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                if (bArr[setvideostabilizationmode.b] == b2) {
                    int i13 = $10 + 75;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    int i15 = setvideostabilizationmode.b;
                    char c3 = cArr3[setvideostabilizationmode.b];
                    Object[] objArr3 = new Object[2];
                    objArr3[b2] = Integer.valueOf(c2);
                    objArr3[0] = Integer.valueOf(c3);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b5 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Color.alpha(0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3224, 13 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 2133916302, false, $$g((byte) 6, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i15] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                } else {
                    int i16 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cKeyCodeFromString = (char) (29944 - KeyEvent.keyCodeFromString(""));
                        int iIndexOf = 1755 - TextUtils.indexOf("", "", 0);
                        int iMyPid = (Process.myPid() >> 22) + 23;
                        byte length2 = (byte) $$c.length;
                        byte b6 = (byte) (length2 - 4);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cKeyCodeFromString, iIndexOf, iMyPid, 387247676, false, $$g(length2, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i16] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[setvideostabilizationmode.b];
                Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (41241 - Drawable.resolveOpacity(0, 0)), 1705 - TextUtils.getOffsetBefore("", 0), 21 - KeyEvent.normalizeMetaState(0), -1434471773, false, $$g(b7, b8, b8), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                b2 = 1;
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            int i17 = $11 + 17;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i19 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i19, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i19);
            int i20 = $10 + 111;
            $11 = i20 % 128;
            int i21 = i20 % 2;
        }
        if (z) {
            char[] cArr6 = new char[i3];
            int i22 = 0;
            loop2: while (true) {
                setvideostabilizationmode.b = i22;
                while (true) {
                    if (setvideostabilizationmode.b >= i3) {
                        break loop2;
                    }
                    int i23 = $10 + 89;
                    $11 = i23 % 128;
                    if (i23 % 2 == 0) {
                        cArr6[setvideostabilizationmode.b] = cArr3[(i3 >>> setvideostabilizationmode.b) << 1];
                        setvideostabilizationmode.b = setvideostabilizationmode.b;
                    } else {
                        cArr6[setvideostabilizationmode.b] = cArr3[(i3 - setvideostabilizationmode.b) - 1];
                        i22 = setvideostabilizationmode.b + 1;
                    }
                }
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            int i24 = 0;
            loop4: while (true) {
                setvideostabilizationmode.b = i24;
                while (true) {
                    if (setvideostabilizationmode.b >= i3) {
                        break loop4;
                    }
                    int i25 = $11 + 115;
                    $10 = i25 % 128;
                    if (i25 % 2 != 0) {
                        cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[4]);
                        int i26 = setvideostabilizationmode.b;
                        setvideostabilizationmode.b = 0;
                    }
                }
                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                i24 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class Builder {
        int maxAgeSeconds = -1;
        int maxStaleSeconds = -1;
        int minFreshSeconds = -1;
        boolean noCache;
        boolean noStore;
        boolean noTransform;
        boolean onlyIfCached;

        public final Builder noCache() {
            this.noCache = true;
            return this;
        }

        public final Builder noStore() {
            this.noStore = true;
            return this;
        }

        public final Builder maxAge(int i, TimeUnit timeUnit) {
            if (i < 0) {
                throw new IllegalArgumentException("maxAge < 0: ".concat(String.valueOf(i)));
            }
            long seconds = timeUnit.toSeconds(i);
            this.maxAgeSeconds = seconds > SieveCacheKt.NodeLinkMask ? Integer.MAX_VALUE : (int) seconds;
            return this;
        }

        public final Builder maxStale(int i, TimeUnit timeUnit) throws IllegalAccessException {
            if (i >= 0) {
                long seconds = timeUnit.toSeconds(i);
                int i2 = seconds > SieveCacheKt.NodeLinkMask ? Integer.MAX_VALUE : (int) seconds;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 46400), 41 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 19 - Color.red(0), 1513912262, false, "b", null);
                }
                int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37836 - (ViewConfiguration.getTapTimeout() >> 16)), 59 - TextUtils.indexOf("", "", 0, 0), Gravity.getAbsoluteGravity(0, 0) + 18, 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
                }
                int i4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
                long j = i4;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (37836 - View.combineMeasuredStates(0, 0)), View.getDefaultSize(0, 0) + 59, 17 - MotionEvent.axisFromString(""), 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
                }
                int i5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
                long j2 = -948;
                long j3 = -1;
                long j4 = j3 ^ 3601680832003797724L;
                long j5 = j3 ^ 1917572665155988515L;
                long jIdentityHashCode = System.identityHashCode(this);
                long j6 = (((long) (-947)) * 3601680832003797724L) + (((long) 949) * 1917572665155988515L) + ((j4 | ((j5 | jIdentityHashCode) ^ j3)) * j2) + (j2 * (j3 ^ ((j4 | j5) | (jIdentityHashCode ^ j3)))) + (((long) 948) * (j5 | 3601680832003797724L));
                long j7 = j;
                int i6 = 0;
                while (true) {
                    for (int i7 = 0; i7 != 8; i7++) {
                        i5 = (((((int) (j7 >> i7)) & 255) + (i5 << 6)) + (i5 << 16)) - i5;
                    }
                    if (i6 != 0) {
                        break;
                    }
                    i6++;
                    j7 = j6;
                }
                if (i5 != i3) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46400 - KeyEvent.getDeadChar(0, 0)), View.resolveSize(0, 0) + 40, TextUtils.lastIndexOf("", '0', 0, 0) + 20, -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
                    Toast.makeText((Context) null, i4 / (((i4 - 1) * i4) % 2), 0).show();
                }
                this.maxStaleSeconds = i2;
                return this;
            }
            throw new IllegalArgumentException("maxStale < 0: ".concat(String.valueOf(i)));
        }

        public final Builder minFresh(int i, TimeUnit timeUnit) {
            if (i < 0) {
                throw new IllegalArgumentException("minFresh < 0: ".concat(String.valueOf(i)));
            }
            long seconds = timeUnit.toSeconds(i);
            this.minFreshSeconds = seconds > SieveCacheKt.NodeLinkMask ? Integer.MAX_VALUE : (int) seconds;
            return this;
        }

        public final Builder onlyIfCached() {
            this.onlyIfCached = true;
            return this;
        }

        public final Builder noTransform() {
            this.noTransform = true;
            return this;
        }

        public final CacheControl build() {
            return new CacheControl(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x020d  */
    public final boolean noTransform() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31533);
            int iMyPid = 921 - (Process.myPid() >> 22);
            int i4 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 27;
            byte b2 = $$a[80];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            a(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iMyPid, i4, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new int[]{0, 22, 119, 13}, false, new byte[]{0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new int[]{22, 15, 3, 0}, true, new byte[]{0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char deadChar = (char) (31533 - KeyEvent.getDeadChar(0, 0));
            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 921;
            int pressedStateDuration = 28 - (ViewConfiguration.getPressedStateDuration() >> 16);
            byte[] bArr = $$a;
            byte b4 = bArr[80];
            Object[] objArr5 = new Object[1];
            a(b4, (byte) (b4 | 52), bArr[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(deadChar, doubleTapTimeout, pressedStateDuration, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 65;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char mode = (char) (View.MeasureSpec.getMode(0) + 31533);
                int iAxisFromString = MotionEvent.axisFromString("") + 922;
                int keyRepeatTimeout = 28 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                byte b5 = $$a[7];
                byte b6 = b5;
                Object[] objArr6 = new Object[1];
                a(b6, (byte) (b6 | 36), b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mode, iAxisFromString, keyRepeatTimeout, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = ~iIdentityHashCode;
            int i8 = (((25598825 + (((~((-954056066) | i7)) | (~((-820023579) | iIdentityHashCode))) * 1900)) + (((~(i7 | 820023578)) | (~(iIdentityHashCode | 954056065))) * (-950))) + (((~(iIdentityHashCode | 820023578)) | (~(i7 | 954056065))) * 950)) - 1650596043;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new int[]{37, 26, 0, 3}, true, new byte[]{0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new int[]{63, 18, 0, 5}, false, new byte[]{1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                    int i12 = i11 % 2;
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
            c(new int[]{81, 16, 0, 15}, false, new byte[]{1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new int[]{97, 16, 14, 6}, true, null, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i13 % 128;
            int i14 = i13 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -1650596043};
                byte[] bArr2 = $$d;
                byte b7 = bArr2[5];
                byte b8 = bArr2[18];
                Object[] objArr13 = new Object[1];
                d(b7, b8, b8, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b9 = bArr2[18];
                byte b10 = bArr2[5];
                Object[] objArr14 = new Object[1];
                d(b9, b10, b10, objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c2 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 31532);
                    int i15 = 921 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 28;
                    byte b11 = $$a[7];
                    byte b12 = b11;
                    Object[] objArr15 = new Object[1];
                    a(b12, (byte) (b12 | 36), b11, objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, i15, edgeSlop, -1142834547, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr16 = new Object[1];
                    c(new int[]{0, 22, 119, 13}, false, new byte[]{0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1}, objArr16);
                    Class<?> cls5 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    c(new int[]{22, 15, 3, 0}, true, new byte[]{0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, objArr17);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c3 = (char) (31534 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                        int i16 = 922 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 28;
                        byte[] bArr3 = $$a;
                        byte b13 = bArr3[80];
                        byte b14 = bArr3[7];
                        Object[] objArr18 = new Object[1];
                        a(b13, (byte) (b13 | 52), b14, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c3, i16, iNormalizeMetaState, -778300370, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cMyPid = (char) ((Process.myPid() >> 22) + 31533);
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 921;
                        int i17 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28;
                        byte b15 = $$a[80];
                        byte b16 = b15;
                        Object[] objArr19 = new Object[1];
                        a(b15, b16, b16, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMyPid, tapTimeout, i17, -1048449946, false, (String) objArr19[0], null);
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
        int i18 = ((int[]) objArr[1])[0];
        int i19 = ((int[]) objArr[3])[0];
        if (i19 == i18) {
            int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 41;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i20 % 128;
            int i21 = i20 % 2;
            int i22 = ((int[]) objArr[0])[0];
            Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int i23 = ~Process.myPid();
            int i24 = i22 + 1342896929 + (((-136137220) | i23) * 494) + (((~(i23 | 820020308)) | (-138235412)) * 494);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr20[0])[0] = i26 ^ (i26 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i27 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i27 % 128;
                int i28 = i27 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i19 / (((i19 - 1) * i19) % 2), 0).show();
            int i29 = ((int[]) objArr[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i30 = i29 + (-351186899) + (((~((-722364500) | iUptimeMillis)) | (-1068494428)) * (-502)) + ((~((~iUptimeMillis) | (-16779284))) * (-502)) + (((~(iUptimeMillis | (-1051715145))) | (-722364500)) * TypedValues.PositionType.TYPE_DRAWPATH);
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr21[0])[0] = i32 ^ (i32 << 5);
        }
        return this.noTransform;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0073 A[DONT_INVERT, PHI: r23
  0x0073: PHI (r23v1 java.lang.String) = (r23v0 java.lang.String), (r23v4 java.lang.String) binds: [B:13:0x0071, B:10:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:15:0x0075  */
    /* JADX WARN: Code duplicated, block: B:16:0x0079 A[PHI: r10 r23
  0x0079: PHI (r10v8 java.lang.String) = (r10v4 java.lang.String), (r10v9 java.lang.String) binds: [B:13:0x0071, B:10:0x0062] A[DONT_GENERATE, DONT_INLINE]
  0x0079: PHI (r23v3 java.lang.String) = (r23v0 java.lang.String), (r23v4 java.lang.String) binds: [B:13:0x0071, B:10:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x008b  */
    /* JADX WARN: Code duplicated, block: B:23:0x009f  */
    /* JADX WARN: Code duplicated, block: B:37:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:38:0x010a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0115  */
    /* JADX WARN: Code duplicated, block: B:43:0x0120  */
    /* JADX WARN: Code duplicated, block: B:44:0x0124  */
    /* JADX WARN: Code duplicated, block: B:45:0x0127  */
    /* JADX WARN: Code duplicated, block: B:47:0x012f  */
    /* JADX WARN: Code duplicated, block: B:48:0x013b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0143  */
    /* JADX WARN: Code duplicated, block: B:51:0x014b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0154  */
    /* JADX WARN: Code duplicated, block: B:55:0x015c  */
    /* JADX WARN: Code duplicated, block: B:56:0x015f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0167  */
    /* JADX WARN: Code duplicated, block: B:59:0x0174  */
    /* JADX WARN: Code duplicated, block: B:61:0x017c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0180  */
    /* JADX WARN: Code duplicated, block: B:64:0x018a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0193  */
    /* JADX WARN: Code duplicated, block: B:68:0x019b  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:72:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:74:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:84:0x01cb A[SYNTHETIC] */
    public static CacheControl parse(Headers headers) {
        int size;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int i2;
        String str;
        int seconds;
        int seconds2;
        int seconds3;
        int seconds4;
        String strName;
        String strValue;
        String str2;
        int i3;
        int iSkipUntil;
        String strTrim;
        String strTrim2;
        int i4;
        int iSkipWhitespace;
        int i5 = 2 % 2;
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
        int i7 = 0;
        if (i6 % 2 != 0) {
            size = headers.size();
            i = 0;
            z = false;
            z2 = false;
            i2 = 1;
            str = null;
            seconds = -1;
            seconds2 = -1;
            z3 = true;
            z4 = true;
            z5 = true;
            seconds3 = -1;
            seconds4 = -1;
            z6 = true;
            z7 = true;
        } else {
            size = headers.size();
            i = 0;
            z = false;
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = false;
            z7 = false;
            i2 = 1;
            str = null;
            seconds = -1;
            seconds2 = -1;
            seconds3 = -1;
            seconds4 = -1;
        }
        while (i < size) {
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 59;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
            if (i8 % 2 != 0) {
                strName = headers.name(i);
                strValue = headers.value(i);
                int i9 = 32 / 0;
                if (strName.equalsIgnoreCase("Cache-Control")) {
                    if (str == null) {
                        str2 = strValue;
                        str = str2;
                    }
                    while (true) {
                        i3 = i7;
                        if (i3 < str2.length()) {
                            iSkipUntil = HeaderParser.skipUntil(str2, i3, "=,;");
                            strTrim = str2.substring(i3, iSkipUntil).trim();
                            if (iSkipUntil != str2.length() || str2.charAt(iSkipUntil) == ',') {
                                i7 = iSkipUntil + 1;
                                strTrim2 = null;
                            } else {
                                int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 23;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i10 % 128;
                                if (i10 % 2 != 0) {
                                    if (str2.charAt(iSkipUntil) != ':') {
                                        iSkipWhitespace = HeaderParser.skipWhitespace(str2, iSkipUntil + 1);
                                        if (iSkipWhitespace < str2.length() || str2.charAt(iSkipWhitespace) != '\"') {
                                            int iSkipUntil2 = HeaderParser.skipUntil(str2, iSkipWhitespace, ",;");
                                            strTrim2 = str2.substring(iSkipWhitespace, iSkipUntil2).trim();
                                            i7 = iSkipUntil2;
                                        } else {
                                            int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                                            int i12 = i11 % 2;
                                            int i13 = iSkipWhitespace + 1;
                                            int iSkipUntil3 = HeaderParser.skipUntil(str2, i13, "\"");
                                            strTrim2 = str2.substring(i13, iSkipUntil3);
                                            i7 = iSkipUntil3 + 1;
                                            int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i14 % 128;
                                            int i15 = i14 % 2;
                                        }
                                    } else {
                                        i7 = iSkipUntil + 1;
                                        strTrim2 = null;
                                    }
                                } else if (str2.charAt(iSkipUntil) != ';') {
                                    iSkipWhitespace = HeaderParser.skipWhitespace(str2, iSkipUntil + 1);
                                    if (iSkipWhitespace < str2.length()) {
                                        int iSkipUntil4 = HeaderParser.skipUntil(str2, iSkipWhitespace, ",;");
                                        strTrim2 = str2.substring(iSkipWhitespace, iSkipUntil4).trim();
                                        i7 = iSkipUntil4;
                                    } else {
                                        int iSkipUntil5 = HeaderParser.skipUntil(str2, iSkipWhitespace, ",;");
                                        strTrim2 = str2.substring(iSkipWhitespace, iSkipUntil5).trim();
                                        i7 = iSkipUntil5;
                                    }
                                } else {
                                    i7 = iSkipUntil + 1;
                                    strTrim2 = null;
                                }
                            }
                            if ("no-cache".equalsIgnoreCase(strTrim)) {
                                i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                                if (i4 % 2 != 0) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                            } else if ("no-store".equalsIgnoreCase(strTrim)) {
                                int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i16 % 128;
                                int i17 = i16 % 2;
                                z2 = true;
                            } else if ("max-age".equalsIgnoreCase(strTrim)) {
                                seconds = HeaderParser.parseSeconds(strTrim2, -1);
                            } else if (!"s-maxage".equalsIgnoreCase(strTrim)) {
                                seconds2 = HeaderParser.parseSeconds(strTrim2, -1);
                            } else if ("private".equalsIgnoreCase(strTrim)) {
                                z3 = true;
                            } else if ("public".equalsIgnoreCase(strTrim)) {
                                int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i18 % 128;
                                int i19 = i18 % 2;
                                z4 = true;
                            } else if ("must-revalidate".equalsIgnoreCase(strTrim)) {
                                z5 = true;
                            } else if (!(!"max-stale".equalsIgnoreCase(strTrim))) {
                                seconds3 = HeaderParser.parseSeconds(strTrim2, Integer.MAX_VALUE);
                            } else if ("min-fresh".equalsIgnoreCase(strTrim)) {
                                seconds4 = HeaderParser.parseSeconds(strTrim2, -1);
                            } else if ("only-if-cached".equalsIgnoreCase(strTrim)) {
                                int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 21;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i20 % 128;
                                int i21 = i20 % 2;
                                z6 = true;
                            } else if ("no-transform".equalsIgnoreCase(strTrim)) {
                                z7 = true;
                            }
                        }
                    }
                } else if (strName.equalsIgnoreCase("Pragma")) {
                }
                i2 = i7;
                str2 = strValue;
                while (true) {
                    i3 = i7;
                    if (i3 < str2.length()) {
                        iSkipUntil = HeaderParser.skipUntil(str2, i3, "=,;");
                        strTrim = str2.substring(i3, iSkipUntil).trim();
                        if (iSkipUntil != str2.length()) {
                            i7 = iSkipUntil + 1;
                            strTrim2 = null;
                        } else {
                            i7 = iSkipUntil + 1;
                            strTrim2 = null;
                        }
                        if ("no-cache".equalsIgnoreCase(strTrim)) {
                            i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                            if (i4 % 2 != 0) {
                                z = false;
                            } else {
                                z = true;
                            }
                        } else if ("no-store".equalsIgnoreCase(strTrim)) {
                            int i110 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i110 % 128;
                            int i111 = i110 % 2;
                            z2 = true;
                        } else if ("max-age".equalsIgnoreCase(strTrim)) {
                            seconds = HeaderParser.parseSeconds(strTrim2, -1);
                        } else if (!"s-maxage".equalsIgnoreCase(strTrim)) {
                            seconds2 = HeaderParser.parseSeconds(strTrim2, -1);
                        } else if ("private".equalsIgnoreCase(strTrim)) {
                            z3 = true;
                        } else if ("public".equalsIgnoreCase(strTrim)) {
                            int i112 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i112 % 128;
                            int i113 = i112 % 2;
                            z4 = true;
                        } else if ("must-revalidate".equalsIgnoreCase(strTrim)) {
                            z5 = true;
                        } else if (!(!"max-stale".equalsIgnoreCase(strTrim))) {
                            seconds3 = HeaderParser.parseSeconds(strTrim2, Integer.MAX_VALUE);
                        } else if ("min-fresh".equalsIgnoreCase(strTrim)) {
                            seconds4 = HeaderParser.parseSeconds(strTrim2, -1);
                        } else if ("only-if-cached".equalsIgnoreCase(strTrim)) {
                            int i22 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 21;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i22 % 128;
                            int i23 = i22 % 2;
                            z6 = true;
                        } else if ("no-transform".equalsIgnoreCase(strTrim)) {
                            z7 = true;
                        }
                    }
                }
            } else {
                strName = headers.name(i);
                strValue = headers.value(i);
                if (strName.equalsIgnoreCase("Cache-Control")) {
                    if (str == null) {
                        str2 = strValue;
                        str = str2;
                    }
                    while (true) {
                        i3 = i7;
                        if (i3 < str2.length()) {
                            iSkipUntil = HeaderParser.skipUntil(str2, i3, "=,;");
                            strTrim = str2.substring(i3, iSkipUntil).trim();
                            if (iSkipUntil != str2.length()) {
                                i7 = iSkipUntil + 1;
                                strTrim2 = null;
                            } else {
                                i7 = iSkipUntil + 1;
                                strTrim2 = null;
                            }
                            if ("no-cache".equalsIgnoreCase(strTrim)) {
                                i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                                if (i4 % 2 != 0) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                            } else if ("no-store".equalsIgnoreCase(strTrim)) {
                                int i114 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i114 % 128;
                                int i115 = i114 % 2;
                                z2 = true;
                            } else if ("max-age".equalsIgnoreCase(strTrim)) {
                                seconds = HeaderParser.parseSeconds(strTrim2, -1);
                            } else if (!"s-maxage".equalsIgnoreCase(strTrim)) {
                                seconds2 = HeaderParser.parseSeconds(strTrim2, -1);
                            } else if ("private".equalsIgnoreCase(strTrim)) {
                                z3 = true;
                            } else if ("public".equalsIgnoreCase(strTrim)) {
                                int i116 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i116 % 128;
                                int i117 = i116 % 2;
                                z4 = true;
                            } else if ("must-revalidate".equalsIgnoreCase(strTrim)) {
                                z5 = true;
                            } else if (!(!"max-stale".equalsIgnoreCase(strTrim))) {
                                seconds3 = HeaderParser.parseSeconds(strTrim2, Integer.MAX_VALUE);
                            } else if ("min-fresh".equalsIgnoreCase(strTrim)) {
                                seconds4 = HeaderParser.parseSeconds(strTrim2, -1);
                            } else if ("only-if-cached".equalsIgnoreCase(strTrim)) {
                                int i24 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 21;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i24 % 128;
                                int i25 = i24 % 2;
                                z6 = true;
                            } else if ("no-transform".equalsIgnoreCase(strTrim)) {
                                z7 = true;
                            }
                        }
                    }
                } else if (strName.equalsIgnoreCase("Pragma")) {
                }
                i2 = i7;
                str2 = strValue;
                while (true) {
                    i3 = i7;
                    if (i3 < str2.length()) {
                        iSkipUntil = HeaderParser.skipUntil(str2, i3, "=,;");
                        strTrim = str2.substring(i3, iSkipUntil).trim();
                        if (iSkipUntil != str2.length()) {
                            i7 = iSkipUntil + 1;
                            strTrim2 = null;
                        } else {
                            i7 = iSkipUntil + 1;
                            strTrim2 = null;
                        }
                        if ("no-cache".equalsIgnoreCase(strTrim)) {
                            i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                            if (i4 % 2 != 0) {
                                z = false;
                            } else {
                                z = true;
                            }
                        } else if ("no-store".equalsIgnoreCase(strTrim)) {
                            int i118 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i118 % 128;
                            int i119 = i118 % 2;
                            z2 = true;
                        } else if ("max-age".equalsIgnoreCase(strTrim)) {
                            seconds = HeaderParser.parseSeconds(strTrim2, -1);
                        } else if (!"s-maxage".equalsIgnoreCase(strTrim)) {
                            seconds2 = HeaderParser.parseSeconds(strTrim2, -1);
                        } else if ("private".equalsIgnoreCase(strTrim)) {
                            z3 = true;
                        } else if ("public".equalsIgnoreCase(strTrim)) {
                            int i1110 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1110 % 128;
                            int i1111 = i1110 % 2;
                            z4 = true;
                        } else if ("must-revalidate".equalsIgnoreCase(strTrim)) {
                            z5 = true;
                        } else if (!(!"max-stale".equalsIgnoreCase(strTrim))) {
                            seconds3 = HeaderParser.parseSeconds(strTrim2, Integer.MAX_VALUE);
                        } else if ("min-fresh".equalsIgnoreCase(strTrim)) {
                            seconds4 = HeaderParser.parseSeconds(strTrim2, -1);
                        } else if ("only-if-cached".equalsIgnoreCase(strTrim)) {
                            int i26 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 21;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i26 % 128;
                            int i27 = i26 % 2;
                            z6 = true;
                        } else if ("no-transform".equalsIgnoreCase(strTrim)) {
                            z7 = true;
                        }
                    }
                }
            }
            i++;
            i7 = 0;
        }
        CacheControl cacheControl = new CacheControl(z, z2, seconds, seconds2, z3, z4, z5, seconds3, seconds4, z6, z7, i2 == 0 ? null : str);
        int i28 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i28 % 128;
        int i29 = i28 % 2;
        return cacheControl;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.headerValue;
        if (str == null) {
            String strHeaderValue = headerValue();
            this.headerValue = strHeaderValue;
            return strHeaderValue;
        }
        int i4 = i2 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private String headerValue() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        if (this.noCache) {
            sb.append("no-cache, ");
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
        }
        if (this.noStore) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 89;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            if (i4 % 2 != 0) {
                sb.append("no-store, ");
                int i5 = 6 / 0;
            } else {
                sb.append("no-store, ");
            }
        }
        if (this.maxAgeSeconds != -1) {
            sb.append("max-age=");
            sb.append(this.maxAgeSeconds);
            sb.append(", ");
        }
        if (this.sMaxAgeSeconds != -1) {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
            if (i6 % 2 == 0) {
                sb.append("s-maxage=");
                sb.append(this.sMaxAgeSeconds);
                sb.append(", ");
                throw null;
            }
            sb.append("s-maxage=");
            sb.append(this.sMaxAgeSeconds);
            sb.append(", ");
        }
        if (this.isPrivate) {
            sb.append("private, ");
        }
        if (this.isPublic) {
            sb.append("public, ");
        }
        if (this.mustRevalidate) {
            sb.append("must-revalidate, ");
        }
        if (this.maxStaleSeconds != -1) {
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 33;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
            int i8 = i7 % 2;
            sb.append("max-stale=");
            sb.append(this.maxStaleSeconds);
            sb.append(", ");
        }
        if (this.minFreshSeconds != -1) {
            int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 9;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
            int i10 = i9 % 2;
            sb.append("min-fresh=");
            sb.append(this.minFreshSeconds);
            sb.append(", ");
        }
        if (this.onlyIfCached) {
            sb.append("only-if-cached, ");
        }
        if (this.noTransform) {
            int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 5;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
            if (i11 % 2 == 0) {
                sb.append("no-transform, ");
                throw null;
            }
            sb.append("no-transform, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    static void b() {
        b = new char[]{59774, 59852, 59836, 59862, 59878, 59873, 59880, 59883, 59844, 59845, 59887, 59883, 59861, 59862, 59861, 59883, 59881, 59884, 59880, 59862, 59851, 59854, 59711, 59751, 59749, 59770, 59768, 59746, 59757, 59733, 59733, 59756, 59748, 59775, 59744, 59746, 59744, 59705, 59746, 59756, 59753, 59753, 59752, 59744, 59750, 59733, 59757, 59773, 59749, 59748, 59748, 59749, 59744, 59737, 59708, 59716, 59771, 59747, 59724, 59714, 59757, 59751, 59771, 59707, 59745, 59749, 59751, 59749, 59747, 59751, 59768, 59769, 59744, 59746, 59770, 59729, 59731, 59771, 59749, 59745, 59757, 59707, 59744, 59744, 59724, 59718, 59757, 59756, 59745, 59713, 59723, 59757, 59773, 59768, 59751, 59746, 59744, 59772, 59785, 59767, 59768, 59769, 59772, 59768, 59769, 59766, 59738, 59773, 59786, 59748, 59741, 59788, 59785};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, int r7, int r8) {
        /*
            int r8 = r8 * 2
            int r8 = r8 + 4
            int r6 = 105 - r6
            int r7 = r7 * 2
            int r7 = r7 + 1
            byte[] r0 = com.squareup.okhttp.CacheControl.$$c
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r7
            r6 = r8
            r3 = r2
            goto L2b
        L15:
            r3 = r2
        L16:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L26:
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2b:
            int r8 = r8 + 1
            int r6 = r6 + r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.CacheControl.$$g(byte, int, int):java.lang.String");
    }
}
