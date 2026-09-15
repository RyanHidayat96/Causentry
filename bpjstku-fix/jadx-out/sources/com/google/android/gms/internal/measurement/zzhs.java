package com.google.android.gms.internal.measurement;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class zzhs extends zzmf implements zznn {
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static long b;
    private static final zzhs zzj;
    private int zzb;
    private zzmo zzd = zzcv();
    private String zze = "";
    private long zzf;
    private long zzg;
    private int zzh;
    private long zzi;
    private static final byte[] $$c = {31, -3, -46, 11};
    private static final int $$d = 37;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {118, 35, -100, -35, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 43;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int asBinder = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        TuitionPaymentFragmentbindingInflater1();
        zzhs zzhsVar = new zzhs();
        zzj = zzhsVar;
        zzmf.zzcp(zzhs.class, zzhsVar);
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
        int i2 = i % 2;
    }

    private zzhs() {
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 52
            int r6 = r6 + 4
            int r7 = r7 * 14
            int r7 = r7 + 84
            byte[] r0 = com.google.android.gms.internal.measurement.zzhs.$$a
            int r1 = r5 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r4 = r2
            r7 = r5
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L25:
            r3 = r0[r6]
        L27:
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            int r6 = r6 + 1
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzhs.a(int, short, int, java.lang.Object[]):void");
    }

    public static zzhr zzk() {
        int i = 2 % 2;
        int i2 = asBinder + 105;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        zzhr zzhrVar = (zzhr) zzj.zzck();
        if (i3 == 0) {
            return zzhrVar;
        }
        throw null;
    }

    public final int zzb() {
        int i = 2 % 2;
        int i2 = asBinder + 11;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        int size = this.zzd.size();
        int i4 = asBinder + 95;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        return size;
    }

    public final zzhw zzc(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 95;
        asBinder = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        zzhw zzhwVar = (zzhw) this.zzd.get(i);
        int i4 = asBinder + 3;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            return zzhwVar;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    protected final Object zzl(int i, Object obj, Object obj2) {
        int i2 = 2 % 2;
        int i3 = i - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzcq(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003\u0006ဂ\u0004", new Object[]{"zzb", "zzd", zzhw.class, "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i3 == 3) {
            return new zzhs();
        }
        int i4 = TuitionPaymentFragmentbindingInflater1 + 45;
        int i5 = i4 % 128;
        asBinder = i5;
        byte[] bArr = null;
        if (i4 % 2 != 0 ? i3 == 4 : i3 == 5) {
            return new zzhr(bArr);
        }
        int i6 = i5 + 75;
        int i7 = i6 % 128;
        TuitionPaymentFragmentbindingInflater1 = i7;
        int i8 = i6 % 2;
        if (i3 != 5) {
            throw null;
        }
        int i9 = i7 + 31;
        asBinder = i9 % 128;
        if (i9 % 2 != 0) {
            return zzj;
        }
        throw null;
    }

    private final void zzw() {
        int i = 2 % 2;
        int i2 = asBinder + 103;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            this.zzd.zza();
            throw null;
        }
        zzmo zzmoVar = this.zzd;
        if (!zzmoVar.zza()) {
            int i3 = TuitionPaymentFragmentbindingInflater1 + 27;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            this.zzd = zzmf.zzcw(zzmoVar);
        }
        int i5 = TuitionPaymentFragmentbindingInflater1 + 99;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
    }

    final /* synthetic */ void zzm(int i, zzhw zzhwVar) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 23;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        zzhwVar.getClass();
        zzw();
        this.zzd.set(i, zzhwVar);
        int i5 = TuitionPaymentFragmentbindingInflater1 + 113;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void c(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i4 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3[i + i4])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 2187, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 39, 841711447, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(b), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33017 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 3011 - (ViewConfiguration.getScrollBarSize() >> 8), 25 - TextUtils.indexOf((CharSequence) "", '0', 0), 321985076, false, $$e(b4, b5, (byte) (b5 + 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36505 - (ViewConfiguration.getScrollBarSize() >> 8)), ((Process.getThreadPriority(0) + 20) >> 6) + 3376, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 16, -968507904, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                int i5 = $10 + 47;
                $11 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 2 / 2;
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (36505 - KeyEvent.normalizeMetaState(0)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3375, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 16, -968507904, false, $$e(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
        int i7 = $11 + 85;
        $10 = i7 % 128;
        int i8 = i7 % 2;
    }

    final /* synthetic */ void zzp() {
        int i = 2 % 2;
        int i2 = asBinder + 61;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        this.zzd = zzcv();
        int i4 = asBinder + 1;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    final /* synthetic */ void zzr(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 107;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
        int i4 = TuitionPaymentFragmentbindingInflater1 + 95;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    final /* synthetic */ void zzo(Iterable iterable) {
        int i = 2 % 2;
        int i2 = asBinder + 67;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            zzw();
            zzks.zzce(iterable, this.zzd);
            throw null;
        }
        zzw();
        zzks.zzce(iterable, this.zzd);
        int i3 = asBinder + 41;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    final /* synthetic */ void zzq(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 119;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        zzw();
        this.zzd.remove(i);
        int i5 = TuitionPaymentFragmentbindingInflater1 + 37;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 30 / 0;
        }
    }

    final /* synthetic */ void zzn(zzhw zzhwVar) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 13;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
            int bitsPerPixel = 650 - ImageFormat.getBitsPerPixel(0);
            int gidForName = 43 - Process.getGidForName("");
            byte b2 = $$a[7];
            Object[] objArr2 = new Object[1];
            a((byte) 52, b2, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarSize, bitsPerPixel, gidForName, -459846511, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(ViewConfiguration.getWindowTouchSlop() >> 8, View.combineMeasuredStates(0, 0) + 22, (char) (46495 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 21, 15 - Color.green(0), (char) (7940 - (ViewConfiguration.getTouchSlop() >> 8)), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
            int capsMode = TextUtils.getCapsMode("", 0, 0) + 651;
            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 45;
            byte[] bArr = $$a;
            byte b3 = bArr[7];
            byte b4 = bArr[80];
            Object[] objArr5 = new Object[1];
            a(b3, b4, b4, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, capsMode, packedPositionChild, -873460649, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = TuitionPaymentFragmentbindingInflater1 + 125;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                int iRed = Color.red(0) + 651;
                int offsetBefore = 44 - TextUtils.getOffsetBefore("", 0);
                byte[] bArr2 = $$a;
                Object[] objArr6 = new Object[1];
                a((byte) 37, bArr2[80], bArr2[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, iRed, offsetBefore, -1595579076, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i6 = ((int[]) objArr7[2])[0];
            int i7 = ((int[]) objArr7[0])[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i8 = 983496009 + (((~((-4497475) | (~iIdentityHashCode))) | (~((-1066665) | iIdentityHashCode))) * (-272)) + (((~((-390379859) | iIdentityHashCode)) | 385882384) * (-272)) + (((~(iIdentityHashCode | 390379858)) | (-386949049)) * 272) + 1321813234;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[3])[0] = i10 ^ (i10 << 5);
        } else {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((Process.getThreadPriority(0) + 20) >> 6), View.resolveSizeAndState(0, 0, 0) + 1610, (ViewConfiguration.getPressedStateDuration() >> 16) + 26, 2145681644, false, null, new Class[0]);
                }
                Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), 1321813234, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                    int iRgb = Color.rgb(0, 0, 0) + 16777867;
                    int iRgb2 = Color.rgb(0, 0, 0) + 16777260;
                    byte[] bArr3 = $$a;
                    byte b5 = bArr3[7];
                    byte b6 = bArr3[80];
                    Object[] objArr9 = new Object[1];
                    a(b5, b6, b6, objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cCombineMeasuredStates, iRgb, iRgb2, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), AndroidCharacter.getMirror('0') + 647, 97 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63407 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 792, 83 - (ViewConfiguration.getScrollBarSize() >> 8)), Integer.TYPE, Integer.TYPE});
                }
                Object[] objArr10 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char gidForName2 = (char) ((-1) - Process.getGidForName(""));
                    int iIndexOf = 650 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    int iIndexOf2 = 43 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                    byte[] bArr4 = $$a;
                    Object[] objArr11 = new Object[1];
                    a((byte) 37, bArr4[80], bArr4[7], objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(gidForName2, iIndexOf, iIndexOf2, -1595579076, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr10);
                try {
                    Object[] objArr12 = new Object[1];
                    c(ImageFormat.getBitsPerPixel(0) + 1, (ViewConfiguration.getLongPressTimeout() >> 16) + 22, (char) (TextUtils.getOffsetAfter("", 0) + 46495), objArr12);
                    Class<?> cls2 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    c(21 - TextUtils.indexOf((CharSequence) "", '0'), 15 - Color.alpha(0), (char) (7940 - (KeyEvent.getMaxKeyCode() >> 16)), objArr13);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 651;
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 44;
                        byte[] bArr5 = $$a;
                        byte b7 = bArr5[7];
                        byte b8 = bArr5[80];
                        Object[] objArr14 = new Object[1];
                        a(b7, b8, b8, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(maximumDrawingCacheSize, jumpTapTimeout, pressedStateDuration, -873460649, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char c = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                        int iNormalizeMetaState = 651 - KeyEvent.normalizeMetaState(0);
                        int i11 = 44 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        byte b9 = $$a[7];
                        Object[] objArr15 = new Object[1];
                        a((byte) 52, b9, b9, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c, iNormalizeMetaState, i11, -459846511, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    objArr = objArr10;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (((int[]) objArr[2])[0] != ((int[]) objArr[0])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[1];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            throw null;
        }
        int i12 = asBinder + 101;
        TuitionPaymentFragmentbindingInflater1 = i12 % 128;
        int i13 = i12 % 2;
        Object[] objArr16 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
        int i14 = ((int[]) objArr[3])[0];
        int i15 = ((int[]) objArr[2])[0];
        int i16 = ((int[]) objArr[0])[0];
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i17 = ~iIdentityHashCode2;
        int i18 = i14 + (-1437008493) + (((~((-448852317) | i17)) | (~(iIdentityHashCode2 | (-445421507)))) * 333) + (((~(iIdentityHashCode2 | (-448852317))) | (~(i17 | (-445421507)))) * 333);
        int i19 = (i18 << 13) ^ i18;
        int i20 = i19 ^ (i19 >>> 17);
        ((int[]) objArr16[3])[0] = i20 ^ (i20 << 5);
        zzhwVar.getClass();
        zzw();
        this.zzd.add(zzhwVar);
    }

    static /* synthetic */ zzhs zzv() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 49;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        zzhs zzhsVar = zzj;
        int i5 = i2 + 99;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 53 / 0;
        }
        return zzhsVar;
    }

    public final List zza() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 39;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        zzmo zzmoVar = this.zzd;
        int i5 = i3 + 23;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return zzmoVar;
    }

    public final String zzd() {
        String str;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 55;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.zze;
            int i4 = 75 / 0;
        } else {
            str = this.zze;
        }
        int i5 = i2 + 69;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean zze() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 89;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        if ((this.zzb & 2) == 0) {
            int i5 = i2 + 27;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = i2 + 109;
        TuitionPaymentFragmentbindingInflater1 = i7 % 128;
        if (i7 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public final long zzf() {
        int i = 2 % 2;
        int i2 = asBinder + 91;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.zzf;
        }
        throw null;
    }

    public final boolean zzg() {
        int i = 2 % 2;
        if ((this.zzb & 4) == 0) {
            return false;
        }
        int i2 = TuitionPaymentFragmentbindingInflater1 + 103;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 61;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 78 / 0;
        }
        return true;
    }

    public final long zzh() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 59;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        long j = this.zzg;
        int i5 = i2 + 35;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 49 / 0;
        }
        return j;
    }

    public final boolean zzi() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 89;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        if ((this.zzb & 8) == 0) {
            int i5 = i3 + 117;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = i3 + 63;
        TuitionPaymentFragmentbindingInflater1 = i7 % 128;
        int i8 = i7 % 2;
        int i9 = i3 + 45;
        TuitionPaymentFragmentbindingInflater1 = i9 % 128;
        if (i9 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public final int zzj() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 85;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        int i5 = this.zzh;
        int i6 = i3 + 27;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    final /* synthetic */ void zzs(long j) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 121;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        this.zzb = i3 % 2 != 0 ? this.zzb | 3 : this.zzb | 2;
        this.zzf = j;
        int i4 = i2 + 3;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
    }

    final /* synthetic */ void zzt(long j) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 31;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        this.zzb |= 4;
        this.zzg = j;
        int i5 = i2 + 81;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
    }

    final /* synthetic */ void zzu(long j) {
        int i = 2 % 2;
        int i2 = asBinder + 43;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        this.zzb = i2 % 2 != 0 ? this.zzb | 2 : this.zzb | 16;
        this.zzi = j;
        int i4 = i3 + 63;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new char[]{1122, 60111, 55587, 53143, 48868, 44352, 37803, 33347, 29052, 26562, 22137, 17574, 11234, 6730, 2219, 65304, 61006, 56450, 49931, 45674, 41160, 38690, 44797, 16470, 29629, 25870, 5219, 2007, 14640, 10404, 56301, 52555, 64672, 60954, 33129, 45263, 41505};
        b = -6711667934746222786L;
    }

    private static String $$e(int i, byte b2, byte b3) {
        byte[] bArr = $$c;
        int i2 = (b3 * 3) + 109;
        int i3 = 3 - (b2 * 4);
        int i4 = i * 4;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            i2 = i3 + i2;
            i3 = i3;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            int i6 = i3 + 1;
            i2 += bArr[i6];
            i3 = i6;
        }
    }
}
