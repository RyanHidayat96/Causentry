package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.deInitSession;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFb1aSDK implements AFb1bSDK {
    private AFb1lSDK AFAdRevenueData;
    private final ScheduledExecutorService getCurrencyIso4217Code;
    private final AFa1oSDK getMediationNetwork;
    private final AFi1kSDK getMonetizationNetwork;
    private final Executor getRevenue;
    private static final byte[] $$c = {1, 115, -83, 116};
    private static final int $$f = 73;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {83, -90, 68, -23, 2, 31, -21, 54, 15, 12, 21, 15, -30, 57, 19, 11, 4, 35, -64, 64, 49, 4, 27, 5, 22, 15, -14, 33, 40, 4, 8, 25, 22, -30, 60, -1, 22, 22, 8, 25, 22, -2, 23, 21, 6, 21, 21, 9, -14, 53, 8, 22, 5, 35, 1, 29, -49, 49, 4, 27, 5, 22, 15, -14, 33, 40, 4, 8, 25, 22, -30, 60, -1, 22, 22, 8, 25, 22, -2, 23, 21, 6, 21, 21, 9, -14, 53, 8, 22, 5, 35, 1, 29, -49};
    private static final int $$e = 134;
    private static final byte[] $$a = {77, -106, 83, 4, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 242;
    private static int b = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private static char[] TuitionPaymentFragmentbindingInflater1 = {60072, 60055, 60049, 60034, 60048, 60058, 60063, 60052, 60117, 60054, 60088, 60060, 60056, 60041, 60083, 60051, 60062, 60043, 60053, 60073, 60050, 60075, 60045, 60040, 60047};
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 57188;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 3
            int r8 = 84 - r8
            int r7 = r7 * 52
            int r7 = 108 - r7
            byte[] r0 = com.appsflyer.internal.AFb1aSDK.$$a
            int r6 = r6 * 15
            int r6 = r6 + 38
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r8
            r3 = r2
            r8 = r7
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2c:
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            int r8 = r8 + 1
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1aSDK.a(byte, short, int, java.lang.Object[]):void");
    }

    private static void d(int i, byte b2, int i2, Object[] objArr) {
        int i3 = i2 + 4;
        byte[] bArr = $$d;
        int i4 = (i * 31) + 84;
        int i5 = b2 * 16;
        byte[] bArr2 = new byte[i5 + 38];
        int i6 = i5 + 37;
        int i7 = -1;
        if (bArr == null) {
            i4 = (i4 + i6) - 16;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i4;
            if (i7 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i3++;
                i4 = (i4 + bArr[i3]) - 16;
            }
        }
    }

    public AFb1aSDK(Executor executor, ScheduledExecutorService scheduledExecutorService, AFa1oSDK aFa1oSDK, AFi1kSDK aFi1kSDK) {
        Intrinsics.checkNotNullParameter(executor, "");
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        Intrinsics.checkNotNullParameter(aFa1oSDK, "");
        Intrinsics.checkNotNullParameter(aFi1kSDK, "");
        this.getRevenue = executor;
        this.getCurrencyIso4217Code = scheduledExecutorService;
        this.getMediationNetwork = aFa1oSDK;
        this.getMonetizationNetwork = aFi1kSDK;
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void AFAdRevenueData(Context context, AFb1bSDK.AFa1zSDK aFa1zSDK) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 45;
        b = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFa1zSDK, "");
        Intrinsics.checkNotNullParameter(context, "");
        Object obj = null;
        if (this.AFAdRevenueData != null) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 117;
            b = i4 % 128;
            if (i4 % 2 != 0) {
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNull(applicationContext, "");
                ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this.AFAdRevenueData);
                obj.hashCode();
                throw null;
            }
            Context applicationContext2 = context.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext2, "");
            ((Application) applicationContext2).unregisterActivityLifecycleCallbacks(this.AFAdRevenueData);
        }
        this.AFAdRevenueData = null;
        AFb1lSDK aFb1lSDK = new AFb1lSDK(this.getRevenue, this.getCurrencyIso4217Code, this.getMediationNetwork, this.getMonetizationNetwork, aFa1zSDK);
        this.AFAdRevenueData = aFb1lSDK;
        if (context instanceof Activity) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 69;
            b = i5 % 128;
            if (i5 % 2 != 0) {
                aFb1lSDK.onActivityResumed((Activity) context);
                obj.hashCode();
                throw null;
            }
            aFb1lSDK.onActivityResumed((Activity) context);
        }
        Application applicationO_ = AFj1iSDK.O_(context);
        if (applicationO_ != null) {
            applicationO_.registerActivityLifecycleCallbacks(this.AFAdRevenueData);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0138  */
    /* JADX WARN: Code duplicated, block: B:37:0x0150  */
    /* JADX WARN: Code duplicated, block: B:40:0x019d A[Catch: all -> 0x034e, TryCatch #1 {all -> 0x034e, blocks: (B:38:0x0152, B:40:0x019d, B:41:0x0214), top: B:73:0x0152 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0227  */
    /* JADX WARN: Code duplicated, block: B:47:0x0265 A[Catch: all -> 0x036c, TryCatch #0 {all -> 0x036c, blocks: (B:7:0x0020, B:9:0x002e, B:10:0x0064, B:14:0x007e, B:16:0x008f, B:17:0x00c2, B:45:0x0229, B:47:0x0265, B:49:0x02cf), top: B:71:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:51:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:53:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:54:0x032b  */
    private static void c(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        Object[] objArr2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = TuitionPaymentFragmentbindingInflater1;
        int i4 = 1770390596;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1);
                        int iBlue = Color.blue(0) + 2267;
                        int touchSlop = 33 - (ViewConfiguration.getTouchSlop() >> 8);
                        byte b3 = (byte) ($$c[0] - 1);
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, iBlue, touchSlop, -1927765101, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr3)).charValue();
                    i5++;
                    i4 = 1770390596;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            char gidForName = (char) (Process.getGidForName("") + 1);
            int i6 = 2267 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int i7 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 33;
            byte b5 = (byte) ($$c[0] - 1);
            byte b6 = b5;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(gidForName, i6, i7, -1927765101, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i8 = $10 + 119;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                i2 = i + 67;
                cArr4[i2] = (char) (cArr[i2] >>> b2);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b2);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            int i9 = $10 + 41;
            $11 = i9 % 128;
            int i10 = 2;
            int i11 = i9 % 2;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i12 = $10 + 35;
                $11 = i12 % 128;
                if (i12 % i10 == 0) {
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                        obj = obj2;
                    } else {
                        try {
                            objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char pressedStateDuration = (char) (49267 - (ViewConfiguration.getPressedStateDuration() >> 16));
                                int iRed = Color.red(0) + 3261;
                                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 30;
                                byte b7 = $$c[0];
                                byte b8 = (byte) (b7 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(pressedStateDuration, iRed, packedPositionGroup, -127612708, false, $$g(b8, b8, b7), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                                Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 22878);
                                    int iAlpha = Color.alpha(0) + 594;
                                    int iAxisFromString = MotionEvent.axisFromString("") + 18;
                                    byte b9 = (byte) ($$c[0] - 1);
                                    byte b10 = b9;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cCombineMeasuredStates, iAlpha, iAxisFromString, 1570859318, false, $$g(b9, b10, (byte) (b10 + 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr5)).intValue();
                                int i13 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i13];
                            } else {
                                obj = null;
                                if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                    int i14 = $11 + 99;
                                    $10 = i14 % 128;
                                    int i15 = i14 % 2;
                                    deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                    deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                    int i16 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                    int i17 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i16];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i17];
                                } else {
                                    int i18 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                    int i19 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i18];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i19];
                                }
                            }
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                } else {
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                        obj = obj2;
                    } else {
                        objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char pressedStateDuration2 = (char) (49267 - (ViewConfiguration.getPressedStateDuration() >> 16));
                            int iRed2 = Color.red(0) + 3261;
                            int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(0L) + 30;
                            byte b11 = $$c[0];
                            byte b12 = (byte) (b11 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(pressedStateDuration2, iRed2, packedPositionGroup2, -127612708, false, $$g(b12, b12, b11), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                            Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char cCombineMeasuredStates2 = (char) (View.combineMeasuredStates(0, 0) + 22878);
                                int iAlpha2 = Color.alpha(0) + 594;
                                int iAxisFromString2 = MotionEvent.axisFromString("") + 18;
                                byte b13 = (byte) ($$c[0] - 1);
                                byte b14 = b13;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cCombineMeasuredStates2, iAlpha2, iAxisFromString2, 1570859318, false, $$g(b13, b14, (byte) (b14 + 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr6)).intValue();
                            int i110 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue2];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i110];
                        } else {
                            obj = null;
                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                int i111 = $11 + 99;
                                $10 = i111 % 128;
                                int i112 = i111 % 2;
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i113 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i114 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i113];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i114];
                            } else {
                                int i115 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i116 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i115];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i116];
                            }
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                obj2 = obj;
                i10 = 2;
            }
        }
        for (int i20 = 0; i20 < i; i20++) {
            cArr4[i20] = (char) (cArr4[i20] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    @Override // com.appsflyer.internal.AFb1bSDK
    public final boolean getCurrencyIso4217Code() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
        b = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char windowTouchSlop = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 43042);
            int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 3111;
            int offsetAfter = TextUtils.getOffsetAfter("", 0) + 22;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(bArr[132], bArr[37], bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(windowTouchSlop, edgeSlop, offsetAfter, -1272852037, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{'\b', 15, '\b', 11, 5, 22, 7, '\t', '\b', 22, 5, 3, '\b', 3, 21, 19, 5, 14, 2, 6, 14, 2}, (byte) (TextUtils.indexOf("", "", 0) + 30), 22 - TextUtils.getTrimmedLength(""), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{21, 6, 7, 15, 21, 18, '\t', 16, 15, 6, 4, 21, 24, 5, 13843}, (byte) (20 - TextUtils.indexOf("", "")), (ViewConfiguration.getScrollBarSize() >> 8) + 15, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char pressedStateDuration = (char) (43042 - (ViewConfiguration.getPressedStateDuration() >> 16));
            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 3111;
            int capsMode = 22 - TextUtils.getCapsMode("", 0, 0);
            byte[] bArr2 = $$a;
            byte b2 = bArr2[132];
            Object[] objArr5 = new Object[1];
            a(b2, b2, bArr2[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(pressedStateDuration, scrollDefaultDelay, capsMode, -1269618118, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 69;
            b = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf = (char) (43042 - TextUtils.indexOf("", ""));
                int touchSlop = 3111 - (ViewConfiguration.getTouchSlop() >> 8);
                int packedPositionGroup = 22 - ExpandableListView.getPackedPositionGroup(0L);
                byte b3 = $$a[7];
                byte b4 = b3;
                Object[] objArr6 = new Object[1];
                a(b3, b4, b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, touchSlop, packedPositionGroup, 154975793, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i6 = ((int[]) objArr7[2])[0];
            int i7 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i7};
            int iNextInt = new Random().nextInt();
            int i8 = (-1272411950) + (((~((-1680565946) | iNextInt)) | 2179113) * 336) + (((~(iNextInt | 24465513)) | (-1702852346)) * (-168)) + (((~((~iNextInt) | 24465513)) | (-1680565946)) * 168) + 614833359;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
            objArr = new Object[]{new int[1], iArr, new int[]{i6}, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{0, 7, 20, 7, 6, 3, '\b', 15, '\r', 6, 1, 4, 24, 20, 19, 6}, (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 88), (ViewConfiguration.getWindowTouchSlop() >> 8) + 16, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{21, 5, 17, 19, 20, 21, 23, 4, '\n', '\t', 20, 18, '\f', 5, 11, 21}, (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 113), 16 - KeyEvent.getDeadChar(0, 0), objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            int i11 = b + 109;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
            int i12 = i11 % 2;
            try {
                Object[] objArr10 = {null, Integer.valueOf(iIntValue), 0, 614833359};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[54];
                Object[] objArr11 = new Object[1];
                d(b5, b5, bArr3[35], objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b6 = (byte) (bArr3[54] - 1);
                byte b7 = b6;
                Object[] objArr12 = new Object[1];
                d(b6, b7, (byte) (b7 | 52), objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c = (char) (43042 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                    int i13 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3110;
                    int capsMode2 = TextUtils.getCapsMode("", 0, 0) + 22;
                    byte b8 = $$a[7];
                    byte b9 = b8;
                    Object[] objArr13 = new Object[1];
                    a(b8, b9, b9, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, i13, capsMode2, 154975793, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    c(new char[]{'\b', 15, '\b', 11, 5, 22, 7, '\t', '\b', 22, 5, 3, '\b', 3, 21, 19, 5, 14, 2, 6, 14, 2}, (byte) (31 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), TextUtils.indexOf("", "") + 22, objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    c(new char[]{21, 6, 7, 15, 21, 18, '\t', 16, 15, 6, 4, 21, 24, 5, 13843}, (byte) (Color.red(0) + 20), 15 - KeyEvent.normalizeMetaState(0), objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 43042);
                        int iAlpha = 3111 - Color.alpha(0);
                        int i14 = 23 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        byte[] bArr4 = $$a;
                        byte b10 = bArr4[132];
                        Object[] objArr16 = new Object[1];
                        a(b10, b10, bArr4[7], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(deadChar, iAlpha, i14, -1269618118, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 43042);
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 3111;
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 22;
                        byte[] bArr5 = $$a;
                        Object[] objArr17 = new Object[1];
                        a(bArr5[132], bArr5[37], bArr5[7], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cKeyCodeFromString, packedPositionType, tapTimeout, -1272852037, false, (String) objArr17[0], null);
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
        int i15 = ((int[]) objArr[1])[0];
        int i16 = ((int[]) objArr[2])[0];
        if (i16 != i15) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[3];
            if (strArr2 != null) {
                int i17 = b + 5;
                int i18 = i17 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i18;
                int i19 = i18 + 43;
                b = i19 % 128;
                int i20 = i19 % 2;
                for (int i21 = i17 % 2 != 0 ? 0 : 1; i21 < strArr2.length; i21++) {
                    arrayList.add(strArr2[i21]);
                }
            }
            throw new RuntimeException(String.valueOf(i16));
        }
        int i22 = ((int[]) objArr[0])[0];
        int i23 = ((int[]) objArr[2])[0];
        int i24 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[3];
        int[] iArr2 = {i23};
        int[] iArr3 = {i24};
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i25 = ~((-4262692) | iMaxMemory);
        int i26 = ~iMaxMemory;
        int i27 = i22 + 739153138 + ((i25 | (~((-1159102617) | i26))) * 920) + (((~((-541666152) | i26)) | 4262691) * 920) + (((~(iMaxMemory | (-1159102617))) | (~((-4262692) | i26)) | (~((-537403461) | iMaxMemory))) * 920);
        int i28 = (i27 << 13) ^ i27;
        int i29 = i28 ^ (i28 >>> 17);
        Object obj = new Object[]{new int[1], iArr3, iArr2, strArr3}[0];
        ((int[]) obj)[0] = i29 ^ (i29 << 5);
        if (this.AFAdRevenueData != null) {
            return true;
        }
        int i30 = ((int[]) obj)[0];
        int i31 = ((i30 * i30) - (~(-(1677723591 * i30)))) - 1;
        int i32 = -(i30 * (-1692293415));
        int i33 = (i31 & i32) + (i32 | i31);
        int i34 = (i33 & 1326938368) + (1326938368 | i33);
        int i35 = ((i34 >> 16) - 131071) / 65536;
        int i36 = ((i35 | 1) << 1) - (i35 ^ 1);
        int i37 = ((i34 | i36) << 1) - (i36 ^ i34);
        int i38 = i34 >> 29;
        int i39 = -(i37 ^ (((((i38 | (-15)) << 1) - (i38 ^ (-15))) / 8) + 1));
        int i40 = (i39 & 2) + (i39 | 2);
        int i41 = i40 >> 20;
        int i42 = ((i41 ^ (-8191)) + ((i41 & (-8191)) << 1)) / 4096;
        return 0 / (((-((((i42 | 1) << 1) - (i42 ^ 1)) + 1)) & i40) * 1539);
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void AFAdRevenueData() {
        AFb1lSDK aFb1lSDK;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 53;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            aFb1lSDK = this.AFAdRevenueData;
            int i3 = 25 / 0;
            if (aFb1lSDK == null) {
                return;
            }
        } else {
            aFb1lSDK = this.AFAdRevenueData;
            if (aFb1lSDK == null) {
                return;
            }
        }
        AFb1bSDK.AFa1zSDK aFa1zSDK = aFb1lSDK.getCurrencyIso4217Code;
        if (aFa1zSDK != null) {
            aFa1zSDK.getCurrencyIso4217Code();
            int i4 = b + 7;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static String $$g(short s, byte b2, int i) {
        byte[] bArr = $$c;
        int i2 = 4 - (b2 * 3);
        int i3 = i + 113;
        int i4 = s * 3;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            i3 = i4 + i3;
            i2++;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            i3 += bArr[i2];
            i2++;
        }
    }
}
