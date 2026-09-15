package com.google.android.gms.internal.maps;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class zzs extends zza implements zzu {
    private static final byte[] $$c = {104, 27, -72, 120};
    private static final int $$f = 183;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {83, -44, 103, 46, 3, -26, 37, -48, -21, -8, -7, 0, -35, 33, -45, 0, -12, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$e = 66;
    private static final byte[] $$a = {38, 31, -70, -1, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 7;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private static char[] b = {45565, 60512, 2780, 43352, 51131, 25135, 32916, 16204, 23907, 64461, 5638, 46217, 54077, 29061, 44052, 51831, 26833, 34669, 9652, 16421, 65175, 7437, 10946, 30553, 37346, 12897, 23708, 63768, 7087, 41995, 50770, 24804, 36223, 12181, 18454, 60064, 14142, 54375, 35322, 28486, 52418, 41505, 1973, 58638, 23254, 14583, 40532, 29634, 53614, 46751, 5135, 51598, 45025, 3408, 58077, 16438, 9641, 39738, 30868, 57080, 48253, 4567, 63264, 45567, 60539, 2762, 43352, 51121, 25128, 32900, 16163, 23932, 64462, 5700, 46259, 54055, 29079, 44052, 51835, 26835, 34624, 42366, 63719, 7750, 48579, 54130, 30370, 37913, 11140, 18915, 61208, 755, 41003, 51135, 25866, 47245, 57079, 24094, 897, 58678, 18095, 10315, 36292, 28527, 53488, 45743, 5172, 63920, 23385, 15596, 40562, 17391, 9628};
    private static long TuitionPaymentFragmentbindingInflater1 = 7003357206360091662L;

    zzs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IFeatureLayerDelegate");
    }

    private static void a(int i, short s, byte b2, Object[] objArr) {
        byte[] bArr = $$a;
        int i2 = b2 * 15;
        int i3 = 107 - (i * 52);
        int i4 = (s * 2) + 84;
        byte[] bArr2 = new byte[53 - i2];
        int i5 = 52 - i2;
        int i6 = -1;
        if (bArr == null) {
            i4 = (i4 + i5) - 11;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i4;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i3++;
                i4 = (i4 + bArr[i3]) - 11;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 13
            int r8 = 17 - r8
            int r7 = r7 * 31
            int r7 = 115 - r7
            int r6 = r6 * 39
            int r0 = r6 + 14
            byte[] r1 = com.google.android.gms.internal.maps.zzs.$$d
            byte[] r0 = new byte[r0]
            int r6 = r6 + 13
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L32
        L18:
            r3 = r2
        L19:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L32:
            int r8 = r8 + 1
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-11)
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.maps.zzs.d(short, int, byte, java.lang.Object[]):void");
    }

    @Override // com.google.android.gms.internal.maps.zzu
    public final void zzf(zzal zzalVar) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            Parcel parcelZza = zza();
            zzc.zzg(parcelZza, zzalVar);
            zzc(2, parcelZza);
        } else {
            Parcel parcelZza2 = zza();
            zzc.zzg(parcelZza2, zzalVar);
            zzc(4, parcelZza2);
        }
    }

    @Override // com.google.android.gms.internal.maps.zzu
    public final void zzg(zzal zzalVar) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        zzc.zzg(parcelZza, zzalVar);
        zzc(5, parcelZza);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.internal.maps.zzu
    public final String zzd() throws RemoteException {
        Parcel parcelZzJ;
        String string;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            parcelZzJ = zzJ(93, zza());
            string = parcelZzJ.readString();
        } else {
            parcelZzJ = zzJ(6, zza());
            string = parcelZzJ.readString();
        }
        parcelZzJ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzu
    public final String zze() throws RemoteException {
        Parcel parcelZzJ;
        String string;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            parcelZzJ = zzJ(0, zza());
            string = parcelZzJ.readString();
        } else {
            parcelZzJ = zzJ(1, zza());
            string = parcelZzJ.readString();
        }
        parcelZzJ.recycle();
        return string;
    }

    private static void c(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i4 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(b[i + i4])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getWindowTouchSlop() >> 8), ExpandableListView.getPackedPositionChild(0L) + 2188, 41 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 841711447, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(TuitionPaymentFragmentbindingInflater1), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 33017), 3011 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 25 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 321985076, false, $$g(b4, b5, (byte) (b5 + 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (KeyEvent.keyCodeFromString("") + 36505), 3424 - AndroidCharacter.getMirror('0'), (KeyEvent.getMaxKeyCode() >> 16) + 17, -968507904, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                int i5 = $10 + 95;
                $11 = i5 % 128;
                int i6 = i5 % 2;
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
        int i7 = $11 + 65;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i9 = $10 + 57;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                try {
                    Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 36504), (ViewConfiguration.getEdgeSlop() >> 16) + 3376, 17 - TextUtils.indexOf("", "", 0), -968507904, false, $$g(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    int i10 = 91 / 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } else {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr6 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (36505 - Drawable.resolveOpacity(0, 0)), Drawable.resolveOpacity(0, 0) + 3376, TextUtils.lastIndexOf("", '0', 0, 0) + 18, -968507904, false, $$g(b10, b11, (byte) (b11 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            }
        }
        objArr[0] = new String(cArr);
    }

    @Override // com.google.android.gms.internal.maps.zzu
    public final void zzh(zzat zzatVar) throws Throwable {
        Object[] objArr;
        char c;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c2 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int iMyTid = (Process.myTid() >> 22) + 2267;
            int size = View.MeasureSpec.getSize(0) + 33;
            byte[] bArr = $$a;
            byte b2 = bArr[37];
            byte b3 = bArr[7];
            Object[] objArr2 = new Object[1];
            a(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, iMyTid, size, -887667012, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(ViewConfiguration.getKeyRepeatTimeout() >> 16, 22 - ExpandableListView.getPackedPositionGroup(0L), (char) View.MeasureSpec.getMode(0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(21 - TextUtils.lastIndexOf("", '0', 0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 14, (char) (39738 - ExpandableListView.getPackedPositionChild(0L)), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
            int i2 = 2268 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            int iIndexOf = TextUtils.indexOf("", "", 0) + 33;
            byte[] bArr2 = $$a;
            byte b4 = bArr2[132];
            byte b5 = bArr2[7];
            Object[] objArr5 = new Object[1];
            a(b4, b5, b5, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cNormalizeMetaState, i2, iIndexOf, -874156483, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 95;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                int gidForName = Process.getGidForName("") + 2268;
                int iIndexOf2 = 32 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                byte[] bArr3 = $$a;
                byte b6 = bArr3[7];
                Object[] objArr6 = new Object[1];
                a(b6, b6, bArr3[132], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, gidForName, iIndexOf2, -654680577, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i5 = ((int[]) objArr7[0])[0];
            int i6 = ((int[]) objArr7[3])[0];
            String[] strArr = (String[]) objArr7[1];
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = (((((~(iIdentityHashCode | 454519067)) | 354194248) * 56) + 1943257819) + (((~((~iIdentityHashCode) | 354194248)) | 454519067) * 56)) - 587723778;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[2])[0] = i9 ^ (i9 << 5);
            c = 3;
        } else {
            Object[] objArr8 = new Object[1];
            c(37 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 26 - Color.alpha(0), (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 26010), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(63 - (ViewConfiguration.getDoubleTapTimeout() >> 16), Color.blue(0) + 18, (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(81 - (Process.myPid() >> 22), ExpandableListView.getPackedPositionType(0L) + 16, (char) (5255 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(97 - Drawable.resolveOpacity(0, 0), 17 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (61420 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -587723778};
                byte[] bArr4 = $$d;
                byte b7 = bArr4[11];
                Object[] objArr13 = new Object[1];
                d(b7, b7, bArr4[18], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b8 = bArr4[18];
                Object[] objArr14 = new Object[1];
                d(b8, b8, bArr4[11], objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                        int iRgb = Color.rgb(0, 0, 0) + 16779483;
                        int offsetAfter = 33 - TextUtils.getOffsetAfter("", 0);
                        byte[] bArr5 = $$a;
                        byte b9 = bArr5[7];
                        Object[] objArr15 = new Object[1];
                        a(b9, b9, bArr5[132], objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(pressedStateDuration, iRgb, offsetAfter, -654680577, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        c(TextUtils.indexOf("", ""), (ViewConfiguration.getLongPressTimeout() >> 16) + 22, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr16);
                        Class<?> cls5 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        c(22 - (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 14, (char) ((Process.myTid() >> 22) + 39739), objArr17);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 2267;
                            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 33;
                            byte[] bArr6 = $$a;
                            byte b10 = bArr6[132];
                            byte b11 = bArr6[7];
                            Object[] objArr18 = new Object[1];
                            a(b10, b11, b11, objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(touchSlop, iNormalizeMetaState, iResolveOpacity, -874156483, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                            int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0') + 2268;
                            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 33;
                            byte[] bArr7 = $$a;
                            byte b12 = bArr7[37];
                            byte b13 = bArr7[7];
                            Object[] objArr19 = new Object[1];
                            a(b12, b13, b13, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollBarSize, iIndexOf3, tapTimeout, -887667012, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 103;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
                        int i11 = i10 % 2;
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                c = 3;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (((int[]) objArr[0])[0] != ((int[]) objArr[c])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[1];
            if (strArr2 != null) {
                int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
                int i13 = i12 % 2;
                for (String str : strArr2) {
                    int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i14 % 128;
                    int i15 = i14 % 2;
                    arrayList.add(str);
                }
            }
            throw null;
        }
        Object[] objArr20 = {new int[]{i}, strArr, new int[1], new int[]{i}};
        int i16 = ((int[]) objArr[2])[0];
        int i17 = ((int[]) objArr[0])[0];
        int i18 = ((int[]) objArr[3])[0];
        String[] strArr3 = (String[]) objArr[1];
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i19 = ~iUptimeMillis;
        int i20 = ~((-1028124482) | i19);
        int i21 = ~(219411165 | iUptimeMillis);
        int i22 = i16 + (-344974842) + ((i20 | i21) * 1150) + (((~((-219411166) | i19)) | i21) * (-575)) + (((~(iUptimeMillis | (-1028124482))) | (~(i19 | 1028124481))) * 575);
        int i23 = (i22 << 13) ^ i22;
        int i24 = i23 ^ (i23 >>> 17);
        ((int[]) objArr20[2])[0] = i24 ^ (i24 << 5);
        int i25 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i25 % 128;
        int i26 = i25 % 2;
        Parcel parcelZza = zza();
        zzc.zzg(parcelZza, zzatVar);
        int i27 = ((int[]) objArr20[2])[0];
        int i28 = i27 * i27;
        int i29 = -(205075955 * i27);
        int i30 = (((i28 & i29) + (i28 | i29)) - (~(-(i27 * (-571528341))))) - 1;
        int i31 = (i30 & (-1701177439)) + ((-1701177439) | i30);
        int i32 = ((i31 >> 25) - 255) / 128;
        int i33 = (i32 & 1) + (i32 | 1);
        int i34 = (i31 & i33) + (i33 | i31);
        int i35 = i31 >> 29;
        int i36 = ((i35 & (-15)) + (i35 | (-15))) / 8;
        int i37 = -(i34 ^ (((i36 | 1) << 1) - (i36 ^ 1)));
        int i38 = ((i37 | 2) << 1) - (2 ^ i37);
        int i39 = i38 >> 21;
        int i40 = (((i39 & (-4095)) + (i39 | (-4095))) / 2048) + 1;
        zzc(11712 / (((-((i40 & 1) + (i40 | 1))) & i38) * 1952), parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzu
    public final boolean zzi() throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZzJ = zzJ(2, zza());
        boolean zZzh = zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 45 / 0;
        }
        return zZzh;
    }

    private static String $$g(int i, int i2, int i3) {
        int i4 = i * 2;
        int i5 = 3 - (i2 * 2);
        byte[] bArr = $$c;
        int i6 = (i3 * 3) + 109;
        byte[] bArr2 = new byte[1 - i4];
        int i7 = 0 - i4;
        int i8 = -1;
        if (bArr == null) {
            i6 = (-i6) + i7;
            i8 = -1;
        }
        while (true) {
            int i9 = i8 + 1;
            i5++;
            bArr2[i9] = (byte) i6;
            if (i9 == i7) {
                return new String(bArr2, 0);
            }
            i6 = (-bArr[i5]) + i6;
            i8 = i9;
        }
    }
}
