package com.google.android.libraries.places.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.AppCompatDelegateImplApi26Impl;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbqd implements Runnable {
    private static int $10 = 0;
    private static int $11 = 1;
    final /* synthetic */ zzbqe zza;
    private static final byte[] $$a = {57, -50, -56, -93, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 207;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 2158492981551717645L;

    zzbqd(zzbqe zzbqeVar) {
        Objects.requireNonNull(zzbqeVar);
        this.zza = zzbqeVar;
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
    private static void b(byte r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 + 4
            byte[] r0 = com.google.android.libraries.places.internal.zzbqd.$$a
            int r1 = r6 + 1
            int r5 = r5 * 14
            int r5 = r5 + 84
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r5
            r5 = r6
            r3 = r2
            goto L27
        L13:
            r3 = r2
        L14:
            int r7 = r7 + 1
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L23:
            int r3 = r3 + 1
            r4 = r0[r7]
        L27:
            int r5 = r5 + r4
            int r5 = r5 + (-11)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbqd.b(byte, byte, int, java.lang.Object[]):void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        zzbqe zzbqeVar = this.zza;
        zzbqg zzbqgVar = zzbqeVar.zzc;
        zzbqgVar.zzy().remove(zzbqeVar.zza);
        if (zzbqgVar.zzE().zzc() == zzbfy.SHUTDOWN) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 37 / 0;
                if (!zzbqgVar.zzy().isEmpty()) {
                    return;
                }
            } else if (!zzbqgVar.zzy().isEmpty()) {
                return;
            }
            zzbqgVar.zzi();
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = $11 + 105;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - (ViewConfiguration.getPressedStateDuration() >> 16)), 2625 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() + TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 9053247990562531611L;
                    try {
                        Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 481 - Color.argb(0, 0, 0, 0), KeyEvent.normalizeMetaState(0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } else {
                int i5 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 19472), 2624 - View.getDefaultSize(0, 0), 14 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ 9053247990562531611L);
                    Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 39422), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 482, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 36, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i6 = $11 + 99;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (39422 - TextUtils.indexOf("", "", 0)), (ViewConfiguration.getLongPressTimeout() >> 16) + 481, TextUtils.indexOf((CharSequence) "", '0', 0) + 38, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                int i7 = 80 / 0;
            } else {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr7 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 39422), 481 - Color.green(0), 37 - (ViewConfiguration.getPressedStateDuration() >> 16), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
            }
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0349  */
    /* JADX WARN: Code duplicated, block: B:43:0x034f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0370  */
    /* JADX WARN: Code duplicated, block: B:51:0x03e7 A[Catch: all -> 0x04ca, TryCatch #3 {all -> 0x04ca, blocks: (B:49:0x03da, B:51:0x03e7, B:52:0x0429), top: B:110:0x03da, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x04d3 A[Catch: Exception -> 0x05b9, TRY_LEAVE, TryCatch #2 {Exception -> 0x05b9, blocks: (B:44:0x036a, B:48:0x037c, B:54:0x047e, B:56:0x04cb, B:58:0x04d1, B:59:0x04d2, B:60:0x04d3, B:62:0x0502, B:68:0x058a, B:73:0x05b1, B:75:0x05b7, B:76:0x05b8, B:63:0x0520, B:65:0x052d, B:66:0x0579, B:49:0x03da, B:51:0x03e7, B:52:0x0429), top: B:109:0x036a, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x052d A[Catch: all -> 0x05b0, TryCatch #0 {all -> 0x05b0, blocks: (B:63:0x0520, B:65:0x052d, B:66:0x0579), top: B:105:0x0520, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0590  */
    /* JADX WARN: Code duplicated, block: B:71:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:80:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:95:0x06f5  */
    public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, int i, int i2, int i3) throws Throwable {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        String str;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objInvoke;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        int i12 = 2 % 2;
        int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i14 = ((i13 | 69) << 1) - (i13 ^ 69);
        int i15 = i14 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15;
        if (i14 % 2 != 0) {
            throw null;
        }
        if (context != null) {
            int i16 = (i15 & 25) + (i15 | 25);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i16 % 128;
            int i17 = i16 % 2;
            int i18 = ((i15 | 61) << 1) - (i15 ^ 61);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i18 % 128;
            int i19 = i18 % 2;
            try {
                char[] cArr = {62583, 57955, 55364, 46645, 44053, 39672, 28880, 28293, 17581, 12938, 10614, 1867, 64823, 60199, 49432, 49069, 38373, 33714, 31134, 20579, 20079, 9305, 4656};
                int i20 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int i21 = i20 * 50;
                int i22 = (i21 & (-548923)) + (i21 | (-548923));
                int i23 = ~i;
                int i24 = ~((i23 & (-5660)) | ((-5660) ^ i23));
                int i25 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i26 = (i25 & 19) + (i25 | 19);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i26 % 128;
                int i27 = i26 % 2;
                int i28 = ~(((-5660) ^ i20) | ((-5660) & i20));
                int i29 = 98 * ((i28 & i24) | (i24 ^ i28));
                int i30 = ((i22 | i29) << 1) - (i29 ^ i22);
                int i31 = ~((~i20) | (~i));
                int i32 = (i31 & (-5660)) | ((-5660) ^ i31);
                int i33 = ~((i20 ^ i) | (i20 & i));
                int i34 = ((i32 & i33) | (i32 ^ i33)) * (-49);
                int i35 = ((i30 | i34) << 1) - (i30 ^ i34);
                int i36 = ~(((-5660) ^ i) | ((-5660) & i));
                int i37 = ~((i20 ^ 5659) | (i20 & 5659));
                int i38 = ((i36 & i37) | (i36 ^ i37)) * 49;
                int i39 = (i35 & i38) + (i38 | i35);
                Object[] objArr = new Object[1];
                a(cArr, i39, objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                int i40 = -TextUtils.getCapsMode("", 0, 0);
                int i41 = ((i40 | 38431) << 1) - (i40 ^ 38431);
                Object[] objArr2 = new Object[1];
                a(new char[]{62577, 25196, 55388, 13834, 44058, 6909, 28864, 61094, 17549, 45920, 10580, 34602, 64781, 27627, 49645, 16297, 38272, 3190}, i41, objArr2);
                Object objInvoke2 = cls.getMethod((String) objArr2[0], null).invoke(context, null);
                int mode = View.MeasureSpec.getMode(0);
                int iTuitionPaymentFragmentbindingInflater1 = AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1();
                int i42 = (mode * (-1529)) - 30019852;
                int i43 = ~mode;
                int i44 = i43 | (-39294);
                int i45 = ~iTuitionPaymentFragmentbindingInflater1;
                int i46 = ~((i44 ^ i45) | (i44 & i45));
                int i47 = ~mode;
                int i48 = (i47 ^ 39293) | (i47 & 39293);
                int i49 = ((~((i48 ^ iTuitionPaymentFragmentbindingInflater1) | (i48 & iTuitionPaymentFragmentbindingInflater1))) | i46 | (~(((-39294) ^ mode) | ((-39294) & mode) | iTuitionPaymentFragmentbindingInflater1))) * 765;
                int i50 = (i42 ^ i49) + ((i49 & i42) << 1);
                int i51 = ~((i47 ^ (-39294)) | (i47 & (-39294)));
                int i52 = ~((i43 ^ i45) | (i43 & i45));
                int i53 = ((i51 & i52) | (i51 ^ i52)) * 1530;
                int i54 = (i50 & i53) + (i53 | i50);
                int i55 = ~((i47 ^ iTuitionPaymentFragmentbindingInflater1) | (i47 & iTuitionPaymentFragmentbindingInflater1));
                int i56 = (-39294) | i45;
                int i57 = ~((i56 & mode) | (i56 ^ mode));
                int i58 = i54 + (((i55 & i57) | (i55 ^ i57)) * 765);
                Object[] objArr3 = new Object[1];
                a(new char[]{62583, 27909, 50824, 14355, 37261, 2830, 27804, 50771, 16285, 37148, 2714, 27709, 50607, 16161, 37044, 2667, 25526, 50486, 16114, 36880, 2466, 25383, 50372, 15940, 38861, 2370, 25296, 50256, 15829, 38737, 2297, 25179, 56272, 15716}, i58, objArr3);
                Class<?> cls2 = Class.forName((String) objArr3[0]);
                int i59 = -Drawable.resolveOpacity(0, 0);
                int iTuitionPaymentFragmentbindingInflater2 = AppCompatDelegateImplApi26Impl.TuitionPaymentFragmentbindingInflater1();
                int i60 = i59 * (-711);
                int i61 = (i60 ^ 247411) + ((i60 & 247411) << 1);
                int i62 = ~(((-348) ^ i59) | ((-348) & i59));
                int i63 = ~((~iTuitionPaymentFragmentbindingInflater2) | i59);
                int i64 = ((i62 & i63) | (i62 ^ i63)) * (-712);
                int i65 = ((i61 | i64) << 1) - (i64 ^ i61);
                int i66 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i67 = (i66 & 57) + (i66 | 57);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i67 % 128;
                int i68 = i67 % 2;
                int i69 = ~iTuitionPaymentFragmentbindingInflater2;
                int i70 = ((-348) ^ i69) | ((-348) & i69);
                int i71 = ~((i70 & i59) | (i70 ^ i59));
                int i72 = ~(iTuitionPaymentFragmentbindingInflater2 | (i59 ^ 347) | (i59 & 347));
                int i73 = i65 + ((-712) * ((i72 & i71) | (i71 ^ i72)));
                int i74 = ~((i59 & i69) | (i69 ^ i59));
                int i75 = ((i74 & (-348)) | ((-348) ^ i74)) * 712;
                int i76 = ((i73 | i75) << 1) - (i75 ^ i73);
                Object[] objArr4 = new Object[1];
                a(new char[]{62576, 62753, 63169, 61536, 61705}, i76, objArr4);
                int i77 = cls2.getField((String) objArr4[0]).getInt(objInvoke2) & 2;
                int i78 = (i77 | (-i77)) >> 31;
                i4 = (i78 & (~(i & 1)) & (i | 1)) | ((~i78) & i);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } else {
            i4 = i;
        }
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1122237249);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 16948);
                int longPressTimeout = 2739 - (ViewConfiguration.getLongPressTimeout() >> 16);
                int windowTouchSlop = 13 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                byte[] bArr = $$a;
                byte b = bArr[7];
                Object[] objArr5 = new Object[1];
                b(b, (byte) (b | 52), bArr[5], objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, longPressTimeout, windowTouchSlop, 1501733736, false, (String) objArr5[0], new Class[0]);
            }
            Set set = (Set) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, null);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 16949);
                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 2739;
                int iIndexOf = 12 - TextUtils.indexOf((CharSequence) "", '0');
                byte b2 = $$a[7];
                byte b3 = (byte) (b2 | 52);
                Object[] objArr6 = new Object[1];
                b(b2, b3, (short) (b3 - 1), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(touchSlop, edgeSlop, iIndexOf, 47863026, false, (String) objArr6[0], null);
            }
            if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null))) {
                int i79 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i80 = (i79 ^ 125) + ((i79 & 125) << 1);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i80 % 128;
                if (i80 % 2 != 0) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c2 = (char) (16950 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        int i81 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2738;
                        int maxKeyCode = 13 - (KeyEvent.getMaxKeyCode() >> 16);
                        byte b4 = $$a[7];
                        byte b5 = (byte) (b4 | 37);
                        Object[] objArr7 = new Object[1];
                        b(b4, b5, (short) (b5 | 66), objArr7);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, i81, maxKeyCode, 631063962, false, (String) objArr7[0], null);
                    }
                    int i82 = 2 / 0;
                    if (!(!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)))) {
                        if (Build.VERSION.SDK_INT == 30) {
                            int i83 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i84 = (i83 ^ 67) + ((i83 & 67) << 1);
                            int i85 = i84 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i85;
                            int i86 = i84 % 2;
                            int i87 = (i85 & 95) + (i85 | 95);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i87 % 128;
                            int i88 = i87 % 2;
                            i5 = i;
                        }
                    }
                } else {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c3 = (char) (16948 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                        int iAxisFromString = MotionEvent.axisFromString("") + 2740;
                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 13;
                        byte b6 = $$a[7];
                        byte b7 = (byte) (b6 | 37);
                        Object[] objArr8 = new Object[1];
                        b(b6, b7, (short) (b7 | 66), objArr8);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c3, iAxisFromString, iCombineMeasuredStates, 631063962, false, (String) objArr8[0], null);
                    }
                    if (set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null))) {
                        if (Build.VERSION.SDK_INT == 30) {
                            int i89 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i810 = (i89 ^ 67) + ((i89 & 67) << 1);
                            int i811 = i810 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i811;
                            int i812 = i810 % 2;
                            int i813 = (i811 & 95) + (i811 | 95);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i813 % 128;
                            int i814 = i813 % 2;
                            i5 = i;
                        }
                    }
                }
                if (Build.VERSION.SDK_INT > 33) {
                    int i90 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 39;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i90 % 128;
                    int i91 = i90 % 2;
                    int i92 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int i93 = i92 * 677;
                    int i94 = (i93 ^ (-5832000)) + ((i93 & (-5832000)) << 1);
                    int i95 = -(-(((i92 ^ i) | (i92 & i) | (-8641)) * (-676)));
                    int i96 = (i94 ^ i95) + ((i95 & i94) << 1);
                    int i97 = ~((-8641) | i92);
                    int i98 = ~i;
                    int i99 = ~((i98 ^ i92) | (i98 & i92));
                    int i100 = i96 + (((i97 & i99) | (i97 ^ i99)) * 676);
                    int i101 = (~((~i92) | (-8641))) | (~(((-8641) & i98) | ((-8641) ^ i98)));
                    int i102 = (i92 & 8640) | (i92 ^ 8640);
                    int i103 = ~((i102 & i) | (i102 ^ i));
                    int i104 = (i100 - (~(((i103 & i101) | (i101 ^ i103)) * 676))) - 1;
                    Object[] objArr9 = new Object[1];
                    a(new char[]{62521, 54706, 47072, 37174, 29501, 23738, 16126, 6200, 64106, 56304, 42480, 34609, 24945, 17087, 11445, 3645, 59491, 51621, 44017, 29986, 22373, 12450, 4834, 64557, 56939, 49121, 39422, 31534}, i104, objArr9);
                    Object[] objArr10 = {(String) objArr9[0]};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 993;
                        int maxKeyCode2 = (KeyEvent.getMaxKeyCode() >> 16) + 8;
                        byte[] bArr2 = $$a;
                        byte b8 = bArr2[132];
                        byte b9 = bArr2[7];
                        Object[] objArr11 = new Object[1];
                        b(b8, b9, (short) (b9 | 140), objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(capsMode, minimumFlingVelocity, maxKeyCode2, 410748506, false, (String) objArr11[0], new Class[]{String.class});
                    }
                    long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr10)).longValue();
                    long j = 1363768967;
                    long j2 = -751;
                    long j3 = -1;
                    long j4 = j ^ j3;
                    long j5 = jLongValue ^ j3;
                    long j6 = i;
                    long j7 = (j2 * j) + (j2 * jLongValue) + (((long) 1504) * (((j4 | j5) ^ j3) | ((j4 | j6) ^ j3)));
                    long j8 = j4 | jLongValue;
                    long j9 = j7 + (((long) (-1504)) * ((j6 | j8) ^ j3)) + (((long) 752) * ((j8 ^ j3) | ((j5 | j) ^ j3))) + ((long) (-1564687204));
                    int i105 = (int) (j9 >> 32);
                    int i106 = ~((~((int) Process.getStartUptimeMillis())) | 1408452333);
                    int i107 = i105 & (((1379942464 | i106) * (-374)) + 66876012 + ((i106 | 28509869) * 374));
                    int i108 = ((int) j9) & ((-501357939) + (((~(1750151631 | i98)) | 312921120) * 168) + ((~((-312921121) | i)) * 168) + (((~((-312925222) | i98)) | 4101 | (~(2063072751 | i))) * 168));
                    i8 = (i107 & i108) | (i107 ^ i108);
                } else {
                    int i109 = -(-TextUtils.indexOf((CharSequence) "", '0', 0));
                    Object[] objArr12 = new Object[1];
                    a(new char[]{62503}, (i109 & 52610) + (i109 | 52610), objArr12);
                    str = (String) objArr12[0];
                    int i110 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i111 = ((i110 | 89) << 1) - (i110 ^ 89);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i111 % 128;
                    int i112 = i111 % 2;
                    int i113 = -(-(ViewConfiguration.getScrollBarSize() >> 8));
                    int i114 = ((i113 | 17077) << 1) - (i113 ^ 17077);
                    Object[] objArr13 = new Object[1];
                    a(new char[]{62564, 46796, 29010, 15469, 65191, 47613, 25693, 9858, 57817, 44074, 28518, 10685, 54287}, i114, objArr13);
                    Object[] objArr14 = {(String) objArr13[0]};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c4 = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 33602);
                        int i115 = 3084 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        int windowTouchSlop2 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 26;
                        byte[] bArr3 = $$a;
                        byte b10 = bArr3[132];
                        byte b11 = bArr3[7];
                        Object[] objArr15 = new Object[1];
                        b(b10, b11, (short) (b11 | 140), objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c4, i115, windowTouchSlop2, 1411172903, false, (String) objArr15[0], new Class[]{String.class});
                    }
                    objInvoke = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr14);
                    int i116 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i116 % 128;
                    int i117 = i116 % 2;
                    if (str.equals(objInvoke)) {
                        int i118 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 81;
                        int i119 = i118 % 128;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i119;
                        int i120 = i118 % 2;
                        int i121 = i119 + 35;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i121 % 128;
                        int i122 = i121 % 2;
                        i8 = 1;
                    } else {
                        int i123 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i124 = (i123 & 63) + (i123 | 63);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i124 % 128;
                        int i125 = i124 % 2;
                        i8 = 0;
                    }
                }
                int i126 = (i & (-11)) | ((~i) & 10);
                int i127 = -i8;
                int i128 = ((i8 & i127) | (i8 ^ i127)) >> 31;
                int i129 = (~i128) & i;
                int i130 = i128 & i126;
                i9 = (i130 & i129) | (i129 ^ i130);
                int i131 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 3;
                int i132 = i131 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i132;
                int i133 = i131 % 2;
                int i134 = i2 & 32;
                i10 = (i134 | (-i134)) >> 31;
                i11 = (i132 & 59) + (i132 | 59);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                if (i11 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i135 = i9 & (~i10);
                int i136 = i10 & i;
                i5 = (i135 & i136) | (i135 ^ i136);
            } else if (Build.VERSION.SDK_INT == 30) {
                int i815 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i816 = (i815 ^ 67) + ((i815 & 67) << 1);
                int i817 = i816 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i817;
                int i818 = i816 % 2;
                int i819 = (i817 & 95) + (i817 | 95);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i819 % 128;
                int i8110 = i819 % 2;
                i5 = i;
            } else {
                try {
                    if (Build.VERSION.SDK_INT > 33) {
                        int i910 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 39;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i910 % 128;
                        int i911 = i910 % 2;
                        int i912 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        int i913 = i912 * 677;
                        int i914 = (i913 ^ (-5832000)) + ((i913 & (-5832000)) << 1);
                        int i915 = -(-(((i912 ^ i) | (i912 & i) | (-8641)) * (-676)));
                        int i916 = (i914 ^ i915) + ((i915 & i914) << 1);
                        int i917 = ~((-8641) | i912);
                        int i918 = ~i;
                        int i919 = ~((i918 ^ i912) | (i918 & i912));
                        int i1010 = i916 + (((i917 & i919) | (i917 ^ i919)) * 676);
                        int i1011 = (~((~i912) | (-8641))) | (~(((-8641) & i918) | ((-8641) ^ i918)));
                        int i1012 = (i912 & 8640) | (i912 ^ 8640);
                        int i1013 = ~((i1012 & i) | (i1012 ^ i));
                        int i1014 = (i1010 - (~(((i1013 & i1011) | (i1011 ^ i1013)) * 676))) - 1;
                        Object[] objArr16 = new Object[1];
                        a(new char[]{62521, 54706, 47072, 37174, 29501, 23738, 16126, 6200, 64106, 56304, 42480, 34609, 24945, 17087, 11445, 3645, 59491, 51621, 44017, 29986, 22373, 12450, 4834, 64557, 56939, 49121, 39422, 31534}, i1014, objArr16);
                        try {
                            Object[] objArr17 = {(String) objArr16[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char capsMode2 = (char) TextUtils.getCapsMode("", 0, 0);
                                int minimumFlingVelocity2 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 993;
                                int maxKeyCode3 = (KeyEvent.getMaxKeyCode() >> 16) + 8;
                                byte[] bArr4 = $$a;
                                byte b12 = bArr4[132];
                                byte b13 = bArr4[7];
                                Object[] objArr18 = new Object[1];
                                b(b12, b13, (short) (b13 | 140), objArr18);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(capsMode2, minimumFlingVelocity2, maxKeyCode3, 410748506, false, (String) objArr18[0], new Class[]{String.class});
                            }
                            long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr17)).longValue();
                            long j10 = 1363768967;
                            long j11 = -751;
                            long j12 = -1;
                            long j13 = j10 ^ j12;
                            long j14 = jLongValue2 ^ j12;
                            long j15 = i;
                            long j16 = (j11 * j10) + (j11 * jLongValue2) + (((long) 1504) * (((j13 | j14) ^ j12) | ((j13 | j15) ^ j12)));
                            long j17 = j13 | jLongValue2;
                            long j18 = j16 + (((long) (-1504)) * ((j15 | j17) ^ j12)) + (((long) 752) * ((j17 ^ j12) | ((j14 | j10) ^ j12))) + ((long) (-1564687204));
                            int i1015 = (int) (j18 >> 32);
                            int i1016 = ~((~((int) Process.getStartUptimeMillis())) | 1408452333);
                            int i1017 = i1015 & (((1379942464 | i1016) * (-374)) + 66876012 + ((i1016 | 28509869) * 374));
                            int i1018 = ((int) j18) & ((-501357939) + (((~(1750151631 | i918)) | 312921120) * 168) + ((~((-312921121) | i)) * 168) + (((~((-312925222) | i918)) | 4101 | (~(2063072751 | i))) * 168));
                            i8 = (i1017 & i1018) | (i1017 ^ i1018);
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 != null) {
                                throw cause2;
                            }
                            throw th2;
                        }
                    } else {
                        int i1019 = -(-TextUtils.indexOf((CharSequence) "", '0', 0));
                        Object[] objArr19 = new Object[1];
                        a(new char[]{62503}, (i1019 & 52610) + (i1019 | 52610), objArr19);
                        str = (String) objArr19[0];
                        int i1110 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i1111 = ((i1110 | 89) << 1) - (i1110 ^ 89);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1111 % 128;
                        int i1112 = i1111 % 2;
                        int i1113 = -(-(ViewConfiguration.getScrollBarSize() >> 8));
                        int i1114 = ((i1113 | 17077) << 1) - (i1113 ^ 17077);
                        Object[] objArr110 = new Object[1];
                        a(new char[]{62564, 46796, 29010, 15469, 65191, 47613, 25693, 9858, 57817, 44074, 28518, 10685, 54287}, i1114, objArr110);
                        try {
                            Object[] objArr111 = {(String) objArr110[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char c5 = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 33602);
                                int i1115 = 3084 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                int windowTouchSlop3 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 26;
                                byte[] bArr5 = $$a;
                                byte b14 = bArr5[132];
                                byte b15 = bArr5[7];
                                Object[] objArr112 = new Object[1];
                                b(b14, b15, (short) (b15 | 140), objArr112);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c5, i1115, windowTouchSlop3, 1411172903, false, (String) objArr112[0], new Class[]{String.class});
                            }
                            objInvoke = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr111);
                            int i1116 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1116 % 128;
                            int i1117 = i1116 % 2;
                            if (str.equals(objInvoke)) {
                                int i1118 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 81;
                                int i1119 = i1118 % 128;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1119;
                                int i1210 = i1118 % 2;
                                int i1211 = i1119 + 35;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1211 % 128;
                                int i1212 = i1211 % 2;
                                i8 = 1;
                            } else {
                                int i1213 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i1214 = (i1213 & 63) + (i1213 | 63);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1214 % 128;
                                int i1215 = i1214 % 2;
                                i8 = 0;
                            }
                        } catch (Throwable th3) {
                            Throwable cause3 = th3.getCause();
                            if (cause3 != null) {
                                throw cause3;
                            }
                            throw th3;
                        }
                    }
                } catch (Exception unused) {
                }
                int i1216 = (i & (-11)) | ((~i) & 10);
                int i1217 = -i8;
                int i1218 = ((i8 & i1217) | (i8 ^ i1217)) >> 31;
                int i1219 = (~i1218) & i;
                int i137 = i1218 & i1216;
                i9 = (i137 & i1219) | (i1219 ^ i137);
                int i138 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 3;
                int i139 = i138 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i139;
                int i1310 = i138 % 2;
                int i1311 = i2 & 32;
                i10 = (i1311 | (-i1311)) >> 31;
                i11 = (i139 & 59) + (i139 | 59);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                if (i11 % 2 != 0) {
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                int i1312 = i9 & (~i10);
                int i1313 = i10 & i;
                i5 = (i1312 & i1313) | (i1312 ^ i1313);
            }
            int i140 = i ^ i4;
            int i141 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i142 = ((i141 | 39) << 1) - (i141 ^ 39);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i142 % 128;
            int i143 = i142 % 2;
            int i144 = -i140;
            int i145 = ((i140 & i144) | (i140 ^ i144)) >> 31;
            int i146 = i5 & (~i145);
            int i147 = i4 & i145;
            int i148 = (i146 & i147) | (i146 ^ i147);
            Object[] objArr20 = new Object[4];
            int i149 = i141 + 79;
            int i150 = i149 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i150;
            if (i149 % 2 == 0) {
                objArr20[0] = new int[0];
                objArr20[0] = new int[1];
                objArr20[5] = new int[0];
            } else {
                objArr20[0] = new int[1];
                objArr20[1] = new int[1];
                objArr20[2] = new int[1];
            }
            int i151 = ((~i148) & i) | ((~i) & i148);
            int i152 = ((i151 | (-i151)) >> 31) & 16;
            int i153 = i150 + 9;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i153 % 128;
            Object obj3 = i153 % 2 != 0 ? objArr20[0] : objArr20[0];
            int i154 = ((i150 | 115) << 1) - (i150 ^ 115);
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i154 % 128;
            int i155 = i154 % 2;
            ((int[]) obj3)[0] = i;
            ((int[]) objArr20[2])[0] = i148;
            objArr20[3] = null;
            int i156 = i150 + 109;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i156 % 128;
            int i157 = i156 % 2;
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            if (i157 != 0) {
                int i158 = (((~(iFreeMemory | 988166937)) | (-947856709)) * 56) + 1986093204 + (((~((~iFreeMemory) | (-947856709))) | 988166937) * 56);
                int i159 = -i152;
                int i160 = i3 / ((i158 ^ i159) + ((i159 & i158) << 1));
                int i161 = i160 / 67;
                i6 = ((~i160) & i161) | ((~i161) & i160);
                i7 = 9;
            } else {
                int i162 = ~iFreeMemory;
                int i163 = ~(819528302 | i162);
                int i164 = 33983820 + ((i163 | (-779218074)) * 764) + (((~(i162 | (-779218074))) | 542179336) * (-1528)) + (((-514387704) | i163) * 764);
                int i165 = i3 + (i164 & i152) + (i164 | i152);
                int i166 = i165 << 13;
                i6 = ((~i165) & i166) | ((~i166) & i165);
                i7 = 17;
            }
            int i167 = i6 ^ (i6 >>> i7);
            int i168 = i167 << 5;
            ((int[]) objArr20[1])[0] = (i167 | i168) & (~(i167 & i168));
            return objArr20;
        } catch (Throwable th4) {
            Throwable cause4 = th4.getCause();
            if (cause4 != null) {
                throw cause4;
            }
            throw th4;
        }
    }
}
