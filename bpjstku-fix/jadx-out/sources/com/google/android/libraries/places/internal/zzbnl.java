package com.google.android.libraries.places.internal;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbnl implements Runnable {
    final /* synthetic */ zzbgj zza;
    final /* synthetic */ zzbnz zzb;
    private static final byte[] $$c = {22, 102, 43, -6};
    private static final int $$d = 179;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {55, -47, -47, 67, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 113;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -6377398940819159759L;
    private static int b = -981105359;
    private static char TuitionPaymentFragmentbindingInflater1 = 64209;

    zzbnl(zzbnz zzbnzVar, zzbgj zzbgjVar) {
        this.zza = zzbgjVar;
        Objects.requireNonNull(zzbnzVar);
        this.zzb = zzbnzVar;
    }

    private static void c(int i, short s, byte b2, Object[] objArr) {
        int i2 = s + 4;
        int i3 = (b2 * 14) + 84;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[53 - i];
        int i4 = 52 - i;
        int i5 = -1;
        if (bArr == null) {
            i3 = (i4 + i3) - 11;
            i2++;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i3 = (i3 + bArr[i2]) - 11;
                i2++;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            this.zzb.zzq().zzd(this.zza);
            int i3 = 65 / 0;
        } else {
            this.zzb.zzq().zzd(this.zza);
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void a(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        int i3 = 0;
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        int i4 = $11 + 45;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cLastIndexOf = (char) (8327 - TextUtils.lastIndexOf("", '0'));
                    int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1235;
                    int iIndexOf = 35 - TextUtils.indexOf("", "");
                    byte b2 = (byte) i3;
                    byte b3 = b2;
                    String str$$e = $$e(b2, b3, b3);
                    Class[] clsArr = new Class[1];
                    clsArr[i3] = Object.class;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, maximumDrawingCacheSize, iIndexOf, -653973969, false, str$$e, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) i3;
                    byte b5 = (byte) (b4 + 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getScrollBarSize() >> 8), 2764 - (Process.myTid() >> 22), 14 - Color.argb(i3, i3, i3, i3), 1504416861, false, $$e(b4, b5, (byte) (b5 - 2)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43326 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), ((Process.getThreadPriority(0) + 20) >> 6) + 253, 21 - TextUtils.lastIndexOf("", '0', 0, 0), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 65200), ExpandableListView.getPackedPositionChild(0L) + 2892, 17 - TextUtils.indexOf("", "", 0), 2012627446, false, $$e(b6, b7, (byte) (b7 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) b) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                int i6 = $11 + 87;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                i3 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0334 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0322  */
    /* JADX WARN: Code duplicated, block: B:49:0x0328  */
    /* JADX WARN: Code duplicated, block: B:53:0x033c  */
    /* JADX WARN: Code duplicated, block: B:57:0x03e7 A[Catch: all -> 0x04c6, TryCatch #1 {all -> 0x04c6, blocks: (B:55:0x03da, B:57:0x03e7, B:58:0x0423), top: B:112:0x03da, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x04cf A[Catch: Exception -> 0x06c5, TRY_LEAVE, TryCatch #3 {Exception -> 0x06c5, blocks: (B:50:0x0334, B:54:0x034b, B:60:0x0467, B:62:0x04c7, B:64:0x04cd, B:65:0x04ce, B:66:0x04cf, B:70:0x052e, B:72:0x05a2, B:78:0x063f, B:83:0x069f, B:89:0x06bd, B:91:0x06c3, B:92:0x06c4, B:71:0x0561, B:55:0x03da, B:57:0x03e7, B:58:0x0423, B:79:0x064f, B:81:0x065c, B:82:0x0698), top: B:116:0x0334, inners: #1, #4 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0525  */
    /* JADX WARN: Code duplicated, block: B:71:0x0561 A[Catch: Exception -> 0x06c5, TryCatch #3 {Exception -> 0x06c5, blocks: (B:50:0x0334, B:54:0x034b, B:60:0x0467, B:62:0x04c7, B:64:0x04cd, B:65:0x04ce, B:66:0x04cf, B:70:0x052e, B:72:0x05a2, B:78:0x063f, B:83:0x069f, B:89:0x06bd, B:91:0x06c3, B:92:0x06c4, B:71:0x0561, B:55:0x03da, B:57:0x03e7, B:58:0x0423, B:79:0x064f, B:81:0x065c, B:82:0x0698), top: B:116:0x0334, inners: #1, #4 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:76:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:81:0x065c A[Catch: all -> 0x06bc, TryCatch #4 {all -> 0x06bc, blocks: (B:79:0x064f, B:81:0x065c, B:82:0x0698), top: B:117:0x064f, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:87:0x06b1  */
    public static Object[] b(Context context, int i, int i2, int i3) throws Throwable {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        char[] cArr;
        char[] cArr2;
        int i9;
        int i10;
        int i11;
        int i12;
        String str;
        char[] cArr3;
        char[] cArr4;
        int i13;
        int i14;
        int iB;
        int i15;
        int i16;
        int i17;
        Object[] objArr;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objInvoke;
        char[] cArr5;
        char[] cArr6;
        char windowTouchSlop;
        long jElapsedRealtimeNanos;
        int i18;
        int i19 = 2 % 2;
        int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i21 = i20 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i21 % 128;
        int i22 = i21 % 2;
        int i23 = ((i20 | 101) << 1) - (i20 ^ 101);
        int i24 = i23 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i24;
        int i25 = i23 % 2;
        if (context != null) {
            int i26 = (i24 ^ 83) + ((i24 & 83) << 1);
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i26 % 128;
            int i27 = i26 % 2;
            try {
                Object[] objArr2 = new Object[1];
                a(new char[]{0, 0, 0, 0}, new char[]{42398, 61355, 59772, 56247}, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 2096081829 - View.resolveSizeAndState(0, 0, 0), new char[]{56057, 60028, 21132, 1857, 2470, 57870, 4732, 49848, 14618, 35068, 54177, 28624, 31279, 10121, 10740, 16984, 64784, 12477, 15595, 6909, 45313, 50867, 29756}, objArr2);
                Class<?> cls = Class.forName((String) objArr2[0]);
                char[] cArr7 = {0, 0, 0, 0};
                char[] cArr8 = {55572, 56757, 50622, 1606};
                char longPressTimeout = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 18117);
                int i28 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                int iB2 = com.google.android.gms.auth.api.accounttransfer.zzn.b();
                int i29 = i28 * (-209);
                int i30 = (i29 ^ (-209)) + ((i29 & (-209)) << 1);
                int i31 = ~i28;
                int i32 = (i30 - (~((~((i31 ^ (-2)) | (i31 & (-2)))) * 210))) - 1;
                int i33 = ~iB2;
                int i34 = ~(((-2) ^ i33) | ((-2) & i33));
                int i35 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 105;
                int i36 = i35 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i36;
                int i37 = i35 % 2;
                int i38 = ~((i31 ^ iB2) | (i31 & iB2));
                int i39 = -(-(((i34 ^ i38) | (i34 & i38)) * 210));
                int i40 = (i32 ^ i39) + ((i32 & i39) << 1);
                int i41 = ~((~iB2) | i31 | 1);
                int i42 = ((-2) ^ i28) | ((-2) & i28);
                int i43 = ((i36 | 93) << 1) - (i36 ^ 93);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i43 % 128;
                int i44 = i43 % 2;
                int i45 = ~((i42 ^ iB2) | (iB2 & i42));
                int i46 = (i41 & i45) | (i41 ^ i45);
                if (i44 != 0) {
                    Object[] objArr3 = new Object[1];
                    a(cArr7, cArr8, longPressTimeout, i40 * ((i46 ^ 210) + ((i46 & 210) << 1)), new char[]{59248, 56307, 27890, 9582, 59992, 62385, 15503, 27887, 60251, 43556, 64044, 9754, 17809, 4271, 59138, 31332, 20551, 26714}, objArr3);
                    objInvoke = cls.getMethod((String) objArr3[0], null).invoke(context, null);
                    cArr5 = new char[]{0, 0, 0, 0};
                    cArr6 = new char[]{43120, 58206, 35692, 11506};
                    int windowTouchSlop2 = ViewConfiguration.getWindowTouchSlop();
                    windowTouchSlop = (char) ((windowTouchSlop2 & 7) + (windowTouchSlop2 | 7));
                    jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    i18 = 0;
                } else {
                    int i47 = -(-(i46 * 210));
                    Object[] objArr4 = new Object[1];
                    a(cArr7, cArr8, longPressTimeout, ((i40 | i47) << 1) - (i47 ^ i40), new char[]{59248, 56307, 27890, 9582, 59992, 62385, 15503, 27887, 60251, 43556, 64044, 9754, 17809, 4271, 59138, 31332, 20551, 26714}, objArr4);
                    objInvoke = cls.getMethod((String) objArr4[0], null).invoke(context, null);
                    cArr5 = new char[]{0, 0, 0, 0};
                    cArr6 = new char[]{43120, 58206, 35692, 11506};
                    windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                    jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    i18 = 1;
                }
                Object[] objArr5 = new Object[1];
                a(cArr5, cArr6, windowTouchSlop, (i18 - (~(-(jElapsedRealtimeNanos > 0L ? 1 : (jElapsedRealtimeNanos == 0L ? 0 : -1))))) - 1, new char[]{4534, 24601, 8478, 56921, 54893, 37797, 14689, 10792, 55701, 24820, 42576, 31120, 60182, 19930, 39547, 19957, 14377, 11204, 40291, 27609, 13174, 45246, 19280, 60715, 34089, 37454, 29332, 56797, 45808, 34351, 27892, 46536, 62398, 22422}, objArr5);
                Class<?> cls2 = Class.forName((String) objArr5[0]);
                Object[] objArr6 = new Object[1];
                a(new char[]{0, 0, 0, 0}, new char[]{40542, 54919, 47831, 12352}, (char) (16569 - (~(-View.MeasureSpec.getSize(0)))), ExpandableListView.getPackedPositionChild(0L) - 673806433, new char[]{4571, 25439, 45326, 60302, 13798}, objArr6);
                int i48 = cls2.getField((String) objArr6[0]).getInt(objInvoke) & 2;
                int i49 = (i & (-2)) | ((~i) & 1);
                int i50 = (i48 | (-i48)) >> 31;
                int i51 = (~i50) & i;
                int i52 = i50 & i49;
                i4 = (i52 & i51) | (i51 ^ i52);
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
                char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 16949);
                int tapTimeout = 2739 - (ViewConfiguration.getTapTimeout() >> 16);
                int iIndexOf = TextUtils.indexOf("", "") + 13;
                byte b2 = $$a[7];
                short s = b2;
                Object[] objArr7 = new Object[1];
                c(b2, s, (byte) s, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(deadChar, tapTimeout, iIndexOf, 1501733736, false, (String) objArr7[0], new Class[0]);
            }
            Set set = (Set) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, null);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 16950);
                int iIndexOf2 = 2739 - TextUtils.indexOf("", "", 0);
                int deadChar2 = KeyEvent.getDeadChar(0, 0) + 13;
                byte b3 = $$a[7];
                byte b4 = b3;
                Object[] objArr8 = new Object[1];
                c(b4, (short) (b4 | 52), b3, objArr8);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionChild, iIndexOf2, deadChar2, 47863026, false, (String) objArr8[0], null);
            }
            if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null))) {
                int i53 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 109;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i53 % 128;
                if (i53 % 2 == 0) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c = (char) (16950 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 2740;
                        int iLastIndexOf2 = TextUtils.lastIndexOf("", '0') + 14;
                        byte[] bArr = $$a;
                        Object[] objArr9 = new Object[1];
                        c((byte) (bArr[33] - 1), (short) 104, bArr[7], objArr9);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, iLastIndexOf, iLastIndexOf2, 631063962, false, (String) objArr9[0], null);
                    }
                    Object obj = null;
                    set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null));
                    obj.hashCode();
                    throw null;
                }
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 16950);
                    int iIndexOf3 = TextUtils.indexOf("", "", 0) + 2739;
                    int trimmedLength = 13 - TextUtils.getTrimmedLength("");
                    byte[] bArr2 = $$a;
                    Object[] objArr10 = new Object[1];
                    c((byte) (bArr2[33] - 1), (short) 104, bArr2[7], objArr10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, iIndexOf3, trimmedLength, 631063962, false, (String) objArr10[0], null);
                }
                if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null))) {
                    if (Build.VERSION.SDK_INT > 33) {
                        int i54 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i55 = ((i54 | 39) << 1) - (i54 ^ 39);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i55 % 128;
                        int i56 = i55 % 2;
                        int maximumDrawingCacheSize = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                        int i57 = (maximumDrawingCacheSize * TypedValues.Custom.TYPE_DIMENSION) - 56415828;
                        int i58 = ~maximumDrawingCacheSize;
                        int i59 = ~((i58 ^ i) | (i58 & i));
                        int i60 = ~i;
                        int i61 = ~((i60 ^ 62476) | (i60 & 62476));
                        int i62 = -(-(((i59 & i61) | (i59 ^ i61)) * (-1808)));
                        int i63 = (i57 & i62) + (i57 | i62);
                        int i64 = (-62477) | i58;
                        int i65 = ~((i64 & i) | (i64 ^ i));
                        int i66 = ~((i60 ^ maximumDrawingCacheSize) | (i60 & maximumDrawingCacheSize) | 62476);
                        int i67 = -(-(((i65 & i66) | (i65 ^ i66)) * TypedValues.Custom.TYPE_BOOLEAN));
                        int i68 = (i63 ^ i67) + ((i67 & i63) << 1);
                        int i69 = ~((i58 ^ 62476) | (i58 & 62476));
                        int i70 = ~(((-62477) & i) | ((-62477) ^ i));
                        int i71 = (i69 & i70) | (i69 ^ i70);
                        int i72 = ~(maximumDrawingCacheSize | i60);
                        int i73 = -(-(((i72 & i71) | (i71 ^ i72)) * TypedValues.Custom.TYPE_BOOLEAN));
                        Object[] objArr11 = new Object[1];
                        a(new char[]{0, 0, 0, 0}, new char[]{51701, 7019, 3203, 1524}, (char) ((i68 ^ i73) + ((i73 & i68) << 1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{64385, 19015, 19469, 1794, 57086, 47204, 12867, 4384, 27707, 47753, 385, 42992, 28059, 21939, 63893, 48982, 48620, 29028, 46023, 21528, 320, 41101, 26539, 7650, 35660, 27799, 6289, 18560}, objArr11);
                        Object[] objArr12 = {(String) objArr11[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char c2 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int trimmedLength2 = TextUtils.getTrimmedLength("") + 993;
                            int iLastIndexOf3 = 7 - TextUtils.lastIndexOf("", '0');
                            Object[] objArr13 = new Object[1];
                            c((byte) 52, (short) 141, $$a[132], objArr13);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, trimmedLength2, iLastIndexOf3, 410748506, false, (String) objArr13[0], new Class[]{String.class});
                        }
                        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr12)).longValue();
                        long j = 1337659481;
                        long j2 = -755;
                        long j3 = -1;
                        long j4 = ((j ^ j3) | (jLongValue ^ j3)) ^ j3;
                        long j5 = (j2 * j) + (j2 * jLongValue) + (((long) 1512) * j4);
                        long j6 = jLongValue | j;
                        long j7 = i;
                        long j8 = j5 + (((long) (-756)) * (j4 | ((j6 | j7) ^ j3))) + (((long) 756) * (j6 | (j7 ^ j3))) + ((long) (-1538577718));
                        int i74 = (int) (j8 >> 32);
                        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                        int i75 = i74 & ((((~(81594866 | iFreeMemory)) | 1355631544) * 56) + 684734306 + (((~((~iFreeMemory) | 1355631544)) | 81594866) * 56));
                        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                        int i76 = ~iMaxMemory;
                        int i77 = 544681341 + (((~(1023410023 | i76)) | (~((-415233859) | iMaxMemory))) * 520);
                        int i78 = ~(415233858 | i76);
                        int i79 = ~(iMaxMemory | (-1021992552));
                        int i80 = ((int) j8) & (i77 + ((i78 | i79) * (-1040)) + ((i79 | (~(i76 | 1021992551)) | 608176165) * 520));
                        i8 = (i75 & i80) | (i75 ^ i80);
                    } else {
                        cArr = new char[]{0, 0, 0, 0};
                        cArr2 = new char[]{25084, 27254, 38723, 16189};
                        i9 = -TextUtils.getTrimmedLength("");
                        int i81 = i9 * 71;
                        int i82 = ((i81 | (-1087923)) << 1) - (i81 ^ (-1087923));
                        int i83 = ~((~i9) | 15767);
                        int i84 = ~((i ^ 15767) | (i & 15767));
                        int i85 = i82 + (((i84 & i83) | (i83 ^ i84)) * (-140));
                        int i86 = (i9 ^ 15767) | (i9 & 15767);
                        int i87 = (~((i86 & i) | (i86 ^ i))) * 70;
                        i10 = (i85 & i87) + (i87 | i85);
                        i11 = i83 | (~(((-15768) & i9) | ((-15768) ^ i9)));
                        int i88 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        i12 = ((i88 | 91) << 1) - (i88 ^ 91);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
                        if (i12 % 2 == 0) {
                            int i89 = ~((i9 & i) | (i9 ^ i));
                            Object[] objArr14 = new Object[1];
                            a(cArr, cArr2, (char) (i10 >>> (70 / ((i89 & i11) | (i11 ^ i89)))), 1131050591 - (~(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), new char[]{26702}, objArr14);
                            str = (String) objArr14[0];
                            cArr3 = new char[]{0, 0, 0, 0};
                            cArr4 = new char[]{39430, 45735, 37170, 25670};
                            i13 = 30063;
                        } else {
                            int i90 = -(-(((~((i9 & i) | (i9 ^ i))) | i11) * 70));
                            int i91 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                            Object[] objArr15 = new Object[1];
                            a(cArr, cArr2, (char) ((i10 ^ i90) + ((i90 & i10) << 1)), (i91 ^ 1131050592) + ((i91 & 1131050592) << 1), new char[]{26702}, objArr15);
                            str = (String) objArr15[0];
                            cArr3 = new char[]{0, 0, 0, 0};
                            cArr4 = new char[]{39430, 45735, 37170, 25670};
                            i13 = 18065;
                        }
                        char c3 = (char) ((i13 - (~(-TextUtils.indexOf("", "", 0, 0)))) - 1);
                        i14 = -Process.getGidForName("");
                        iB = com.google.android.gms.auth.api.accounttransfer.zzn.b();
                        i15 = i14 * 302;
                        i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
                        int i92 = i16 % 128;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i92;
                        if (i16 % 2 == 0) {
                            int i93 = (i15 << 1) - i15;
                            int i94 = ~i14;
                            int i95 = ~iB;
                            int i96 = ~((i94 ^ i95) | (i94 & i95));
                            int i97 = -((i96 & 850569113) | (i96 ^ 850569113));
                            i17 = i93 + (i97 ^ (-602)) + ((i97 & (-602)) << 1);
                        } else {
                            int i98 = (i15 ^ 1792066915) + ((i15 & 1792066915) << 1);
                            int i99 = ~i14;
                            int i100 = ~iB;
                            int i101 = -(-(((~((i99 ^ i100) | (i99 & i100))) | 850569113) * (-602)));
                            i17 = (i98 ^ i101) + ((i101 & i98) << 1);
                        }
                        int i102 = ~i14;
                        int i103 = ~((i102 ^ (-850569114)) | (i102 & (-850569114)));
                        int i104 = ~i14;
                        int i105 = ~((i104 ^ iB) | (i104 & iB));
                        int i106 = ~iB;
                        int i107 = (i14 & i106) | (i106 ^ i14);
                        int i108 = i17 + ((-301) * ((~((i107 & 850569113) | (i107 ^ 850569113))) | (i103 ^ i105) | (i103 & i105)));
                        int i109 = ((i92 | 111) << 1) - (i92 ^ 111);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i109 % 128;
                        int i110 = i109 % 2;
                        int i111 = (i108 - (~(-(-(301 * (~(i106 | 850569113))))))) - 1;
                        Object[] objArr16 = new Object[1];
                        a(cArr3, cArr4, c3, i111, new char[]{65455, 22828, 9492, 29385, 12404, 53582, 32625, 18357, 17815, 33875, 1548, 47554, 5447}, objArr16);
                        objArr = new Object[]{(String) objArr16[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cAlpha = (char) (Color.alpha(0) + 33602);
                            int iRgb = 16780301 + Color.rgb(0, 0, 0);
                            int mode = View.MeasureSpec.getMode(0) + 26;
                            Object[] objArr17 = new Object[1];
                            c((byte) 52, (short) 141, $$a[132], objArr17);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAlpha, iRgb, mode, 1411172903, false, (String) objArr17[0], new Class[]{String.class});
                        }
                        if (!str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                            int i112 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 71;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i112 % 128;
                            int i113 = i112 % 2;
                            i8 = 0;
                        } else {
                            int i114 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 93;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i114 % 128;
                            int i115 = i114 % 2;
                            i8 = 1;
                        }
                    }
                    int i116 = (i & (-11)) | ((~i) & 10);
                    int i117 = (i8 | (-i8)) >> 31;
                    int i118 = (~i117) & i;
                    int i119 = i117 & i116;
                    int i120 = (i119 & i118) | (i118 ^ i119);
                    int i121 = i2 & 32;
                    int i122 = -i121;
                    int i123 = ((i121 & i122) | (i121 ^ i122)) >> 31;
                    int i124 = i120 & (~i123);
                    int i125 = i123 & i;
                    i5 = (i124 & i125) | (i124 ^ i125);
                } else if (Build.VERSION.SDK_INT == 30) {
                    int i126 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i126 % 128;
                    int i127 = i126 % 2;
                    i5 = i;
                } else {
                    if (Build.VERSION.SDK_INT > 33) {
                        int i510 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i511 = ((i510 | 39) << 1) - (i510 ^ 39);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i511 % 128;
                        int i512 = i511 % 2;
                        int maximumDrawingCacheSize2 = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                        int i513 = (maximumDrawingCacheSize2 * TypedValues.Custom.TYPE_DIMENSION) - 56415828;
                        int i514 = ~maximumDrawingCacheSize2;
                        int i515 = ~((i514 ^ i) | (i514 & i));
                        int i610 = ~i;
                        int i611 = ~((i610 ^ 62476) | (i610 & 62476));
                        int i612 = -(-(((i515 & i611) | (i515 ^ i611)) * (-1808)));
                        int i613 = (i513 & i612) + (i513 | i612);
                        int i614 = (-62477) | i514;
                        int i615 = ~((i614 & i) | (i614 ^ i));
                        int i616 = ~((i610 ^ maximumDrawingCacheSize2) | (i610 & maximumDrawingCacheSize2) | 62476);
                        int i617 = -(-(((i615 & i616) | (i615 ^ i616)) * TypedValues.Custom.TYPE_BOOLEAN));
                        int i618 = (i613 ^ i617) + ((i617 & i613) << 1);
                        int i619 = ~((i514 ^ 62476) | (i514 & 62476));
                        int i710 = ~(((-62477) & i) | ((-62477) ^ i));
                        int i711 = (i619 & i710) | (i619 ^ i710);
                        int i712 = ~(maximumDrawingCacheSize2 | i610);
                        int i713 = -(-(((i712 & i711) | (i711 ^ i712)) * TypedValues.Custom.TYPE_BOOLEAN));
                        Object[] objArr18 = new Object[1];
                        a(new char[]{0, 0, 0, 0}, new char[]{51701, 7019, 3203, 1524}, (char) ((i618 ^ i713) + ((i713 & i618) << 1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{64385, 19015, 19469, 1794, 57086, 47204, 12867, 4384, 27707, 47753, 385, 42992, 28059, 21939, 63893, 48982, 48620, 29028, 46023, 21528, 320, 41101, 26539, 7650, 35660, 27799, 6289, 18560}, objArr18);
                        Object[] objArr19 = {(String) objArr18[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char c4 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int trimmedLength3 = TextUtils.getTrimmedLength("") + 993;
                            int iLastIndexOf4 = 7 - TextUtils.lastIndexOf("", '0');
                            Object[] objArr110 = new Object[1];
                            c((byte) 52, (short) 141, $$a[132], objArr110);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c4, trimmedLength3, iLastIndexOf4, 410748506, false, (String) objArr110[0], new Class[]{String.class});
                        }
                        long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr19)).longValue();
                        long j9 = 1337659481;
                        long j10 = -755;
                        long j11 = -1;
                        long j12 = ((j9 ^ j11) | (jLongValue2 ^ j11)) ^ j11;
                        long j13 = (j10 * j9) + (j10 * jLongValue2) + (((long) 1512) * j12);
                        long j14 = jLongValue2 | j9;
                        long j15 = i;
                        long j16 = j13 + (((long) (-756)) * (j12 | ((j14 | j15) ^ j11))) + (((long) 756) * (j14 | (j15 ^ j11))) + ((long) (-1538577718));
                        int i714 = (int) (j16 >> 32);
                        int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
                        int i715 = i714 & ((((~(81594866 | iFreeMemory2)) | 1355631544) * 56) + 684734306 + (((~((~iFreeMemory2) | 1355631544)) | 81594866) * 56));
                        int iMaxMemory2 = (int) Runtime.getRuntime().maxMemory();
                        int i716 = ~iMaxMemory2;
                        int i717 = 544681341 + (((~(1023410023 | i716)) | (~((-415233859) | iMaxMemory2))) * 520);
                        int i718 = ~(415233858 | i716);
                        int i719 = ~(iMaxMemory2 | (-1021992552));
                        int i810 = ((int) j16) & (i717 + ((i718 | i719) * (-1040)) + ((i719 | (~(i716 | 1021992551)) | 608176165) * 520));
                        i8 = (i715 & i810) | (i715 ^ i810);
                    } else {
                        cArr = new char[]{0, 0, 0, 0};
                        cArr2 = new char[]{25084, 27254, 38723, 16189};
                        i9 = -TextUtils.getTrimmedLength("");
                        int i811 = i9 * 71;
                        int i812 = ((i811 | (-1087923)) << 1) - (i811 ^ (-1087923));
                        int i813 = ~((~i9) | 15767);
                        int i814 = ~((i ^ 15767) | (i & 15767));
                        int i815 = i812 + (((i814 & i813) | (i813 ^ i814)) * (-140));
                        int i816 = (i9 ^ 15767) | (i9 & 15767);
                        int i817 = (~((i816 & i) | (i816 ^ i))) * 70;
                        i10 = (i815 & i817) + (i817 | i815);
                        i11 = i813 | (~(((-15768) & i9) | ((-15768) ^ i9)));
                        int i818 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        i12 = ((i818 | 91) << 1) - (i818 ^ 91);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
                        if (i12 % 2 == 0) {
                            int i819 = ~((i9 & i) | (i9 ^ i));
                            Object[] objArr111 = new Object[1];
                            a(cArr, cArr2, (char) (i10 >>> (70 / ((i819 & i11) | (i11 ^ i819)))), 1131050591 - (~(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), new char[]{26702}, objArr111);
                            str = (String) objArr111[0];
                            cArr3 = new char[]{0, 0, 0, 0};
                            cArr4 = new char[]{39430, 45735, 37170, 25670};
                            i13 = 30063;
                        } else {
                            int i910 = -(-(((~((i9 & i) | (i9 ^ i))) | i11) * 70));
                            int i911 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                            Object[] objArr112 = new Object[1];
                            a(cArr, cArr2, (char) ((i10 ^ i910) + ((i910 & i10) << 1)), (i911 ^ 1131050592) + ((i911 & 1131050592) << 1), new char[]{26702}, objArr112);
                            str = (String) objArr112[0];
                            cArr3 = new char[]{0, 0, 0, 0};
                            cArr4 = new char[]{39430, 45735, 37170, 25670};
                            i13 = 18065;
                        }
                        char c5 = (char) ((i13 - (~(-TextUtils.indexOf("", "", 0, 0)))) - 1);
                        i14 = -Process.getGidForName("");
                        iB = com.google.android.gms.auth.api.accounttransfer.zzn.b();
                        i15 = i14 * 302;
                        i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
                        int i912 = i16 % 128;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i912;
                        if (i16 % 2 == 0) {
                            int i913 = (i15 << 1) - i15;
                            int i914 = ~i14;
                            int i915 = ~iB;
                            int i916 = ~((i914 ^ i915) | (i914 & i915));
                            int i917 = -((i916 & 850569113) | (i916 ^ 850569113));
                            i17 = i913 + (i917 ^ (-602)) + ((i917 & (-602)) << 1);
                        } else {
                            int i918 = (i15 ^ 1792066915) + ((i15 & 1792066915) << 1);
                            int i919 = ~i14;
                            int i1010 = ~iB;
                            int i1011 = -(-(((~((i919 ^ i1010) | (i919 & i1010))) | 850569113) * (-602)));
                            i17 = (i918 ^ i1011) + ((i1011 & i918) << 1);
                        }
                        int i1012 = ~i14;
                        int i1013 = ~((i1012 ^ (-850569114)) | (i1012 & (-850569114)));
                        int i1014 = ~i14;
                        int i1015 = ~((i1014 ^ iB) | (i1014 & iB));
                        int i1016 = ~iB;
                        int i1017 = (i14 & i1016) | (i1016 ^ i14);
                        int i1018 = i17 + ((-301) * ((~((i1017 & 850569113) | (i1017 ^ 850569113))) | (i1013 ^ i1015) | (i1013 & i1015)));
                        int i1019 = ((i912 | 111) << 1) - (i912 ^ 111);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1019 % 128;
                        int i1110 = i1019 % 2;
                        int i1111 = (i1018 - (~(-(-(301 * (~(i1016 | 850569113))))))) - 1;
                        Object[] objArr113 = new Object[1];
                        a(cArr3, cArr4, c5, i1111, new char[]{65455, 22828, 9492, 29385, 12404, 53582, 32625, 18357, 17815, 33875, 1548, 47554, 5447}, objArr113);
                        objArr = new Object[]{(String) objArr113[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cAlpha2 = (char) (Color.alpha(0) + 33602);
                            int iRgb2 = 16780301 + Color.rgb(0, 0, 0);
                            int mode2 = View.MeasureSpec.getMode(0) + 26;
                            Object[] objArr114 = new Object[1];
                            c((byte) 52, (short) 141, $$a[132], objArr114);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAlpha2, iRgb2, mode2, 1411172903, false, (String) objArr114[0], new Class[]{String.class});
                        }
                        if (!str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                            int i1112 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 71;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1112 % 128;
                            int i1113 = i1112 % 2;
                            i8 = 0;
                        } else {
                            int i1114 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 93;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1114 % 128;
                            int i1115 = i1114 % 2;
                            i8 = 1;
                        }
                    }
                    int i1116 = (i & (-11)) | ((~i) & 10);
                    int i1117 = (i8 | (-i8)) >> 31;
                    int i1118 = (~i1117) & i;
                    int i1119 = i1117 & i1116;
                    int i128 = (i1119 & i1118) | (i1118 ^ i1119);
                    int i129 = i2 & 32;
                    int i1210 = -i129;
                    int i1211 = ((i129 & i1210) | (i129 ^ i1210)) >> 31;
                    int i1212 = i128 & (~i1211);
                    int i1213 = i1211 & i;
                    i5 = (i1212 & i1213) | (i1212 ^ i1213);
                }
            } else if (Build.VERSION.SDK_INT == 30) {
                int i1214 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1214 % 128;
                int i1215 = i1214 % 2;
                i5 = i;
            } else {
                try {
                    if (Build.VERSION.SDK_INT > 33) {
                        int i516 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i517 = ((i516 | 39) << 1) - (i516 ^ 39);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i517 % 128;
                        int i518 = i517 % 2;
                        int maximumDrawingCacheSize3 = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                        int i519 = (maximumDrawingCacheSize3 * TypedValues.Custom.TYPE_DIMENSION) - 56415828;
                        int i5110 = ~maximumDrawingCacheSize3;
                        int i5111 = ~((i5110 ^ i) | (i5110 & i));
                        int i6110 = ~i;
                        int i6111 = ~((i6110 ^ 62476) | (i6110 & 62476));
                        int i6112 = -(-(((i5111 & i6111) | (i5111 ^ i6111)) * (-1808)));
                        int i6113 = (i519 & i6112) + (i519 | i6112);
                        int i6114 = (-62477) | i5110;
                        int i6115 = ~((i6114 & i) | (i6114 ^ i));
                        int i6116 = ~((i6110 ^ maximumDrawingCacheSize3) | (i6110 & maximumDrawingCacheSize3) | 62476);
                        int i6117 = -(-(((i6115 & i6116) | (i6115 ^ i6116)) * TypedValues.Custom.TYPE_BOOLEAN));
                        int i6118 = (i6113 ^ i6117) + ((i6117 & i6113) << 1);
                        int i6119 = ~((i5110 ^ 62476) | (i5110 & 62476));
                        int i7110 = ~(((-62477) & i) | ((-62477) ^ i));
                        int i7111 = (i6119 & i7110) | (i6119 ^ i7110);
                        int i7112 = ~(maximumDrawingCacheSize3 | i6110);
                        int i7113 = -(-(((i7112 & i7111) | (i7111 ^ i7112)) * TypedValues.Custom.TYPE_BOOLEAN));
                        Object[] objArr115 = new Object[1];
                        a(new char[]{0, 0, 0, 0}, new char[]{51701, 7019, 3203, 1524}, (char) ((i6118 ^ i7113) + ((i7113 & i6118) << 1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{64385, 19015, 19469, 1794, 57086, 47204, 12867, 4384, 27707, 47753, 385, 42992, 28059, 21939, 63893, 48982, 48620, 29028, 46023, 21528, 320, 41101, 26539, 7650, 35660, 27799, 6289, 18560}, objArr115);
                        try {
                            Object[] objArr116 = {(String) objArr115[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char c6 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                int trimmedLength4 = TextUtils.getTrimmedLength("") + 993;
                                int iLastIndexOf5 = 7 - TextUtils.lastIndexOf("", '0');
                                Object[] objArr117 = new Object[1];
                                c((byte) 52, (short) 141, $$a[132], objArr117);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c6, trimmedLength4, iLastIndexOf5, 410748506, false, (String) objArr117[0], new Class[]{String.class});
                            }
                            long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr116)).longValue();
                            long j17 = 1337659481;
                            long j18 = -755;
                            long j19 = -1;
                            long j110 = ((j17 ^ j19) | (jLongValue3 ^ j19)) ^ j19;
                            long j111 = (j18 * j17) + (j18 * jLongValue3) + (((long) 1512) * j110);
                            long j112 = jLongValue3 | j17;
                            long j113 = i;
                            long j114 = j111 + (((long) (-756)) * (j110 | ((j112 | j113) ^ j19))) + (((long) 756) * (j112 | (j113 ^ j19))) + ((long) (-1538577718));
                            int i7114 = (int) (j114 >> 32);
                            int iFreeMemory3 = (int) Runtime.getRuntime().freeMemory();
                            int i7115 = i7114 & ((((~(81594866 | iFreeMemory3)) | 1355631544) * 56) + 684734306 + (((~((~iFreeMemory3) | 1355631544)) | 81594866) * 56));
                            int iMaxMemory3 = (int) Runtime.getRuntime().maxMemory();
                            int i7116 = ~iMaxMemory3;
                            int i7117 = 544681341 + (((~(1023410023 | i7116)) | (~((-415233859) | iMaxMemory3))) * 520);
                            int i7118 = ~(415233858 | i7116);
                            int i7119 = ~(iMaxMemory3 | (-1021992552));
                            int i8110 = ((int) j114) & (i7117 + ((i7118 | i7119) * (-1040)) + ((i7119 | (~(i7116 | 1021992551)) | 608176165) * 520));
                            i8 = (i7115 & i8110) | (i7115 ^ i8110);
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 != null) {
                                throw cause2;
                            }
                            throw th2;
                        }
                    } else {
                        cArr = new char[]{0, 0, 0, 0};
                        cArr2 = new char[]{25084, 27254, 38723, 16189};
                        i9 = -TextUtils.getTrimmedLength("");
                        int i8111 = i9 * 71;
                        int i8112 = ((i8111 | (-1087923)) << 1) - (i8111 ^ (-1087923));
                        int i8113 = ~((~i9) | 15767);
                        int i8114 = ~((i ^ 15767) | (i & 15767));
                        int i8115 = i8112 + (((i8114 & i8113) | (i8113 ^ i8114)) * (-140));
                        int i8116 = (i9 ^ 15767) | (i9 & 15767);
                        int i8117 = (~((i8116 & i) | (i8116 ^ i))) * 70;
                        i10 = (i8115 & i8117) + (i8117 | i8115);
                        i11 = i8113 | (~(((-15768) & i9) | ((-15768) ^ i9)));
                        int i8118 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        i12 = ((i8118 | 91) << 1) - (i8118 ^ 91);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
                        if (i12 % 2 == 0) {
                            int i8119 = ~((i9 & i) | (i9 ^ i));
                            Object[] objArr118 = new Object[1];
                            a(cArr, cArr2, (char) (i10 >>> (70 / ((i8119 & i11) | (i11 ^ i8119)))), 1131050591 - (~(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), new char[]{26702}, objArr118);
                            str = (String) objArr118[0];
                            cArr3 = new char[]{0, 0, 0, 0};
                            cArr4 = new char[]{39430, 45735, 37170, 25670};
                            i13 = 30063;
                        } else {
                            int i9110 = -(-(((~((i9 & i) | (i9 ^ i))) | i11) * 70));
                            int i9111 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                            Object[] objArr119 = new Object[1];
                            a(cArr, cArr2, (char) ((i10 ^ i9110) + ((i9110 & i10) << 1)), (i9111 ^ 1131050592) + ((i9111 & 1131050592) << 1), new char[]{26702}, objArr119);
                            str = (String) objArr119[0];
                            cArr3 = new char[]{0, 0, 0, 0};
                            cArr4 = new char[]{39430, 45735, 37170, 25670};
                            i13 = 18065;
                        }
                        char c7 = (char) ((i13 - (~(-TextUtils.indexOf("", "", 0, 0)))) - 1);
                        i14 = -Process.getGidForName("");
                        iB = com.google.android.gms.auth.api.accounttransfer.zzn.b();
                        i15 = i14 * 302;
                        i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
                        int i9112 = i16 % 128;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9112;
                        if (i16 % 2 == 0) {
                            int i9113 = (i15 << 1) - i15;
                            int i9114 = ~i14;
                            int i9115 = ~iB;
                            int i9116 = ~((i9114 ^ i9115) | (i9114 & i9115));
                            int i9117 = -((i9116 & 850569113) | (i9116 ^ 850569113));
                            i17 = i9113 + (i9117 ^ (-602)) + ((i9117 & (-602)) << 1);
                        } else {
                            int i9118 = (i15 ^ 1792066915) + ((i15 & 1792066915) << 1);
                            int i9119 = ~i14;
                            int i10110 = ~iB;
                            int i10111 = -(-(((~((i9119 ^ i10110) | (i9119 & i10110))) | 850569113) * (-602)));
                            i17 = (i9118 ^ i10111) + ((i10111 & i9118) << 1);
                        }
                        int i10112 = ~i14;
                        int i10113 = ~((i10112 ^ (-850569114)) | (i10112 & (-850569114)));
                        int i10114 = ~i14;
                        int i10115 = ~((i10114 ^ iB) | (i10114 & iB));
                        int i10116 = ~iB;
                        int i10117 = (i14 & i10116) | (i10116 ^ i14);
                        int i10118 = i17 + ((-301) * ((~((i10117 & 850569113) | (i10117 ^ 850569113))) | (i10113 ^ i10115) | (i10113 & i10115)));
                        int i10119 = ((i9112 | 111) << 1) - (i9112 ^ 111);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10119 % 128;
                        int i11110 = i10119 % 2;
                        int i11111 = (i10118 - (~(-(-(301 * (~(i10116 | 850569113))))))) - 1;
                        Object[] objArr1110 = new Object[1];
                        a(cArr3, cArr4, c7, i11111, new char[]{65455, 22828, 9492, 29385, 12404, 53582, 32625, 18357, 17815, 33875, 1548, 47554, 5447}, objArr1110);
                        try {
                            objArr = new Object[]{(String) objArr1110[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char cAlpha3 = (char) (Color.alpha(0) + 33602);
                                int iRgb3 = 16780301 + Color.rgb(0, 0, 0);
                                int mode3 = View.MeasureSpec.getMode(0) + 26;
                                Object[] objArr1111 = new Object[1];
                                c((byte) 52, (short) 141, $$a[132], objArr1111);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAlpha3, iRgb3, mode3, 1411172903, false, (String) objArr1111[0], new Class[]{String.class});
                            }
                            if (!str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                int i11112 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 71;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11112 % 128;
                                int i11113 = i11112 % 2;
                                i8 = 0;
                            } else {
                                int i11114 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 93;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11114 % 128;
                                int i11115 = i11114 % 2;
                                i8 = 1;
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
                    i8 = 0;
                }
                int i11116 = (i & (-11)) | ((~i) & 10);
                int i11117 = (i8 | (-i8)) >> 31;
                int i11118 = (~i11117) & i;
                int i11119 = i11117 & i11116;
                int i1216 = (i11119 & i11118) | (i11118 ^ i11119);
                int i1217 = i2 & 32;
                int i1218 = -i1217;
                int i1219 = ((i1217 & i1218) | (i1217 ^ i1218)) >> 31;
                int i12110 = i1216 & (~i1219);
                int i12111 = i1219 & i;
                i5 = (i12110 & i12111) | (i12110 ^ i12111);
            }
            int i130 = (~(i & i4)) & (i | i4);
            int i131 = -i130;
            int i132 = ((i130 & i131) | (i130 ^ i131)) >> 31;
            int i133 = i5 & (~i132);
            int i134 = i4 & i132;
            int i135 = (i133 & i134) | (i133 ^ i134);
            int i136 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i137 = ((i136 | 31) << 1) - (i136 ^ 31);
            int i138 = i137 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i138;
            int i139 = i137 % 2;
            Object[] objArr20 = new Object[4];
            int[] iArr = new int[1];
            objArr20[0] = iArr;
            objArr20[1] = new int[1];
            int[] iArr2 = new int[1];
            objArr20[2] = iArr2;
            int i140 = (~(i & i135)) & (i | i135);
            int i141 = (i140 | (-i140)) >> 31;
            int i142 = i138 + 93;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i142 % 128;
            if (i142 % 2 != 0) {
                i6 = i141 & 16;
                iArr[0] = i;
                ((int[]) objArr20[3])[1] = i135;
            } else {
                i6 = i141 & 16;
                iArr[0] = i;
                iArr2[0] = i135;
            }
            objArr20[3] = null;
            int iMaxMemory4 = (int) Runtime.getRuntime().maxMemory();
            int i143 = ~iMaxMemory4;
            int i144 = 1854270488 + (((~(87429287 | i143)) | 127739516) * (-90)) + (((~(87429287 | iMaxMemory4)) | 2232451) * (-45)) + (((~(iMaxMemory4 | (-127739517))) | 87429287 | (~(i143 | 127739516))) * 45);
            int i145 = i6 * 236;
            int i146 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i147 = (i146 & 121) + (i146 | 121);
            int i148 = i147 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i148;
            if (i147 % 2 != 0) {
                int i149 = -(471 % i144);
                int i150 = (i145 & i149) + (i145 | i149);
                int i151 = ~i6;
                int i152 = ~i;
                int i153 = ~((i152 & i151) | (i151 ^ i152));
                int i154 = ~((i151 & i) | (i151 ^ i));
                i7 = (i150 >>> ((-235) << ((i153 & i144) | (i144 ^ i153)))) >>> ((-470) >>> ((i154 & i144) | (i144 ^ i154)));
            } else {
                int i155 = i144 * 471;
                int i156 = (i145 & i155) + (i145 | i155);
                int i157 = ~i6;
                int i158 = ~i;
                int i159 = ~((i158 & i157) | (i157 ^ i158));
                int i160 = -(-(((i159 & i144) | (i144 ^ i159)) * (-235)));
                int i161 = ((i156 | i160) << 1) - (i160 ^ i156);
                int i162 = ~((i157 & i) | (i157 ^ i));
                int i163 = -(-(((i162 & i144) | (i144 ^ i162)) * (-470)));
                i7 = ((i163 & i161) << 1) + (i161 ^ i163);
            }
            int i164 = ~((~i144) | i6);
            int i165 = ~i6;
            int i166 = ~((i165 & i144) | (i165 ^ i144) | i);
            int i167 = i7 + (235 * ((i166 & i164) | (i164 ^ i166)));
            int i168 = i167 * 477;
            int i169 = -(-(i3 * (-475)));
            int i170 = ((i168 | i169) << 1) - (i168 ^ i169);
            int i171 = i148 + 71;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i171 % 128;
            int i172 = i171 % 2;
            int i173 = ~i167;
            int i174 = ~((i173 & i3) | (i173 ^ i3));
            int i175 = ~i3;
            int i176 = i175 | i167;
            int i177 = ~((i176 & i) | (i176 ^ i));
            int i178 = -(-((-476) * ((i174 & i177) | (i174 ^ i177))));
            int i179 = (((i170 ^ i178) + ((i178 & i170) << 1)) - (~(-(-((~(((i175 ^ i167) | (i175 & i167)) | i)) * 952))))) - 1;
            int i180 = ~i3;
            int i181 = ~i;
            int i182 = i179 + ((~(i167 | (i181 & i180) | (i180 ^ i181))) * 476);
            int i183 = i182 << 13;
            int i184 = (i183 | i182) & (~(i182 & i183));
            int i185 = i184 ^ (i184 >>> 17);
            int i186 = i185 << 5;
            ((int[]) objArr20[1])[0] = (i185 | i186) & (~(i185 & i186));
            return objArr20;
        } catch (Throwable th4) {
            Throwable cause4 = th4.getCause();
            if (cause4 != null) {
                throw cause4;
            }
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(byte r5, byte r6, int r7) {
        /*
            int r7 = r7 * 2
            int r0 = 1 - r7
            int r6 = r6 + 102
            int r5 = r5 * 4
            int r5 = r5 + 4
            byte[] r1 = com.google.android.libraries.places.internal.zzbnl.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L16
            r4 = r7
            r3 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L22:
            int r3 = r3 + 1
            r4 = r1[r5]
        L26:
            int r4 = -r4
            int r6 = r6 + r4
            int r5 = r5 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbnl.$$e(byte, byte, int):java.lang.String");
    }
}
