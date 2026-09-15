package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.appsflyer.AFLogger;
import defpackage.initSession;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
final class AFb1lSDK implements Application.ActivityLifecycleCallbacks {
    private final Executor AFAdRevenueData;
    private boolean component1;
    private boolean component3;
    final AFb1bSDK.AFa1zSDK getCurrencyIso4217Code;
    private final AFi1kSDK getMediationNetwork;
    private final ScheduledExecutorService getMonetizationNetwork;
    private final AFa1oSDK getRevenue;

    public AFb1lSDK(Executor executor, ScheduledExecutorService scheduledExecutorService, AFa1oSDK aFa1oSDK, AFi1kSDK aFi1kSDK, AFb1bSDK.AFa1zSDK aFa1zSDK) {
        Intrinsics.checkNotNullParameter(executor, "");
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        Intrinsics.checkNotNullParameter(aFa1oSDK, "");
        Intrinsics.checkNotNullParameter(aFi1kSDK, "");
        Intrinsics.checkNotNullParameter(aFa1zSDK, "");
        this.AFAdRevenueData = executor;
        this.getMonetizationNetwork = scheduledExecutorService;
        this.getRevenue = aFa1oSDK;
        this.getMediationNetwork = aFi1kSDK;
        this.getCurrencyIso4217Code = aFa1zSDK;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        final AFh1qSDK aFh1qSDK = new AFh1qSDK(activity, this.getMediationNetwork);
        this.AFAdRevenueData.execute(new Runnable() { // from class: com.appsflyer.internal.AFb1lSDK$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                AFb1lSDK.getCurrencyIso4217Code(this.f$0, aFh1qSDK);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCurrencyIso4217Code(AFb1lSDK aFb1lSDK, AFh1qSDK aFh1qSDK) {
        Intrinsics.checkNotNullParameter(aFb1lSDK, "");
        Intrinsics.checkNotNullParameter(aFh1qSDK, "");
        if (!aFb1lSDK.component1) {
            try {
                aFb1lSDK.getCurrencyIso4217Code.getRevenue(aFh1qSDK);
            } catch (Exception e2) {
                AFLogger.afErrorLog("Listener thrown an exception: ", e2, true);
            }
        }
        aFb1lSDK.component3 = false;
        aFb1lSDK.component1 = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.AFAdRevenueData.execute(new Runnable() { // from class: com.appsflyer.internal.AFb1lSDK$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AFb1lSDK.getRevenue(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getRevenue(final AFb1lSDK aFb1lSDK) {
        Intrinsics.checkNotNullParameter(aFb1lSDK, "");
        aFb1lSDK.component3 = true;
        try {
            ScheduledExecutorService scheduledExecutorService = aFb1lSDK.getMonetizationNetwork;
            Runnable runnable = new Runnable() { // from class: com.appsflyer.internal.AFb1lSDK$$ExternalSyntheticLambda1
                private static final byte[] $$c = {53, -70, 9, -72};
                private static final int $$d = 150;
                private static int $10 = 0;
                private static int $11 = 1;
                private static final byte[] $$a = {80, -8, 43, 65, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
                private static final int $$b = 102;
                private static int TuitionPaymentFragmentbindingInflater1 = 0;
                private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -83722426;

                /* JADX WARN: Code duplicated, block: B:10:0x0024  */
                /* JADX WARN: Code duplicated, block: B:8:0x001c  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static void a(byte r7, short r8, byte r9, java.lang.Object[] r10) {
                    /*
                        int r7 = r7 * 14
                        int r7 = 98 - r7
                        int r9 = r9 + 1
                        int r8 = r8 * 52
                        int r8 = 56 - r8
                        byte[] r0 = com.appsflyer.internal.AFb1lSDK$$ExternalSyntheticLambda1.$$a
                        byte[] r1 = new byte[r9]
                        r2 = 0
                        if (r0 != 0) goto L14
                        r3 = r8
                        r5 = r2
                        goto L29
                    L14:
                        r3 = r2
                    L15:
                        byte r4 = (byte) r7
                        int r5 = r3 + 1
                        r1[r3] = r4
                        if (r5 != r9) goto L24
                        java.lang.String r7 = new java.lang.String
                        r7.<init>(r1, r2)
                        r10[r2] = r7
                        return
                    L24:
                        r3 = r0[r8]
                        r6 = r3
                        r3 = r8
                        r8 = r6
                    L29:
                        int r7 = r7 + r8
                        int r7 = r7 + (-11)
                        int r8 = r3 + 1
                        r3 = r5
                        goto L15
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1lSDK$$ExternalSyntheticLambda1.a(byte, short, byte, java.lang.Object[]):void");
                }

                private static void b(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
                    char[] cArr2;
                    int i4 = 2 % 2;
                    setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
                    char[] cArr3 = new char[i2];
                    setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                    while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                        int i5 = $10 + 119;
                        $11 = i5 % 128;
                        int i6 = i5 % 2;
                        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                        cArr3[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        int i7 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr3[i7]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b = (byte) 0;
                                byte b2 = b;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 3291 - (KeyEvent.getMaxKeyCode() >> 16), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 31, 1199271174, false, $$e(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr3[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - ImageFormat.getBitsPerPixel(0)), 651 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 44 - View.getDefaultSize(0, 0), -450685997, false, $$e(b3, b4, b4), new Class[]{Object.class, Object.class});
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
                        int i8 = $11 + 93;
                        $10 = i8 % 128;
                        int i9 = i8 % 2;
                        setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
                        char[] cArr4 = new char[i2];
                        System.arraycopy(cArr3, 0, cArr4, 0, i2);
                        System.arraycopy(cArr4, 0, cArr3, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                        System.arraycopy(cArr4, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr3, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                    }
                    if (!(!z)) {
                        int i10 = $10 + 85;
                        $11 = i10 % 128;
                        if (i10 % 2 == 0) {
                            cArr2 = new char[i2];
                            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                        } else {
                            cArr2 = new char[i2];
                            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                        }
                        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                            int i11 = $10 + 95;
                            $11 = i11 % 128;
                            if (i11 % 2 == 0) {
                                cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    byte b5 = (byte) 0;
                                    byte b6 = b5;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 651 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 44 - KeyEvent.normalizeMetaState(0), -450685997, false, $$e(b5, b6, b6), new Class[]{Object.class, Object.class});
                                }
                                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                            } else {
                                cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                                Object[] objArr5 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    byte b7 = (byte) 0;
                                    byte b8 = b7;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 651 - (ViewConfiguration.getJumpTapTimeout() >> 16), 44 - View.MeasureSpec.makeMeasureSpec(0, 0), -450685997, false, $$e(b7, b8, b8), new Class[]{Object.class, Object.class});
                                }
                                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                            }
                        }
                        cArr3 = cArr2;
                    }
                    objArr[0] = new String(cArr3);
                }

                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    Object[] objArr;
                    int i = 2 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int iBlue = 651 - Color.blue(0);
                        int i2 = 45 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        byte b = $$a[80];
                        Object[] objArr2 = new Object[1];
                        a(b, b, (byte) 52, objArr2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(jumpTapTimeout, iBlue, i2, -459846511, false, (String) objArr2[0], null);
                    }
                    long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                    Object[] objArr3 = new Object[1];
                    b(true, TextUtils.lastIndexOf("", '0', 0) + 136, TextUtils.getCapsMode("", 0, 0) + 22, 7 - TextUtils.lastIndexOf("", '0'), new char[]{65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f'}, objArr3);
                    Class<?> cls = Class.forName((String) objArr3[0]);
                    Object[] objArr4 = new Object[1];
                    b(false, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 139, 15 - Color.alpha(0), 5 - (ViewConfiguration.getFadingEdgeLength() >> 16), new char[]{5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530}, objArr4);
                    long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                        int iMakeMeasureSpec = 651 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 44;
                        byte b2 = $$a[7];
                        byte b3 = b2;
                        Object[] objArr5 = new Object[1];
                        a(b2, b3, b3, objArr5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, iMakeMeasureSpec, windowTouchSlop, -873460649, false, (String) objArr5[0], null);
                    }
                    if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char cRed = (char) Color.red(0);
                            int maximumFlingVelocity = 651 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            int offsetBefore = 44 - TextUtils.getOffsetBefore("", 0);
                            byte[] bArr = $$a;
                            byte b4 = bArr[80];
                            byte b5 = bArr[7];
                            Object[] objArr6 = new Object[1];
                            a(b4, b5, (byte) (b5 | 37), objArr6);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cRed, maximumFlingVelocity, offsetBefore, -1595579076, false, (String) objArr6[0], null);
                        }
                        Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                        objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                        int i3 = ((int[]) objArr7[2])[0];
                        int i4 = ((int[]) objArr7[0])[0];
                        int iIdentityHashCode = System.identityHashCode(this);
                        int i5 = 1550894228 + (((~((-4219309) | iIdentityHashCode)) | (~((-788499) | iIdentityHashCode))) * 69) + (((~(iIdentityHashCode | (-414096467))) | (~((-417527277) | iIdentityHashCode)) | 413307968) * (-69)) + 82020527;
                        int i6 = (i5 << 13) ^ i5;
                        int i7 = i6 ^ (i6 >>> 17);
                        ((int[]) objArr[3])[0] = i7 ^ (i7 << 5);
                    } else {
                        try {
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1611 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 26, 2145681644, false, null, new Class[0]);
                            }
                            Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), -1118962070, 0};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char offsetBefore2 = (char) TextUtils.getOffsetBefore("", 0);
                                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 651;
                                int iCombineMeasuredStates = 44 - View.combineMeasuredStates(0, 0);
                                byte b6 = $$a[7];
                                byte b7 = b6;
                                Object[] objArr9 = new Object[1];
                                a(b6, b7, b7, objArr9);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(offsetBefore2, scrollDefaultDelay, iCombineMeasuredStates, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 695 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 98), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63406 - (ViewConfiguration.getJumpTapTimeout() >> 16)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 793, 84 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), Integer.TYPE, Integer.TYPE});
                            }
                            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char c = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                                int i8 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 650;
                                int scrollBarFadeDuration = 44 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                byte[] bArr2 = $$a;
                                byte b8 = bArr2[80];
                                byte b9 = bArr2[7];
                                Object[] objArr10 = new Object[1];
                                a(b8, b9, (byte) (b9 | 37), objArr10);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, i8, scrollBarFadeDuration, -1595579076, false, (String) objArr10[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                            try {
                                Object[] objArr11 = new Object[1];
                                b(true, 135 - View.MeasureSpec.getMode(0), TextUtils.getCapsMode("", 0, 0) + 22, 8 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), new char[]{65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f'}, objArr11);
                                Class<?> cls2 = Class.forName((String) objArr11[0]);
                                Object[] objArr12 = new Object[1];
                                b(false, TextUtils.lastIndexOf("", '0', 0) + 140, 15 - TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getEdgeSlop() >> 16) + 5, new char[]{5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530}, objArr12);
                                long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf = Long.valueOf(jLongValue2);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                    char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                                    int iGreen = Color.green(0) + 651;
                                    int iLastIndexOf = 43 - TextUtils.lastIndexOf("", '0');
                                    byte b10 = $$a[7];
                                    byte b11 = b10;
                                    Object[] objArr13 = new Object[1];
                                    a(b10, b11, b11, objArr13);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(packedPositionType, iGreen, iLastIndexOf, -873460649, false, (String) objArr13[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                                Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                                    char c2 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                                    int scrollBarFadeDuration2 = 651 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 45;
                                    byte b12 = $$a[80];
                                    Object[] objArr14 = new Object[1];
                                    a(b12, b12, (byte) 52, objArr14);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c2, scrollBarFadeDuration2, packedPositionChild, -459846511, false, (String) objArr14[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
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
                    int i9 = ((int[]) objArr[0])[0];
                    int i10 = ((int[]) objArr[2])[0];
                    if (i10 == i9) {
                        int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
                        TuitionPaymentFragmentbindingInflater1 = i11 % 128;
                        int i12 = i11 % 2;
                        Object[] objArr15 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
                        int i13 = ((int[]) objArr[3])[0];
                        int i14 = ((int[]) objArr[2])[0];
                        int i15 = ((int[]) objArr[0])[0];
                        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                        int i16 = (-1272424567) + (((~((-912325489) | iElapsedRealtime)) | 4217376 | (~(908894678 | iElapsedRealtime))) * (-880));
                        int i17 = (~((-912325489) | (~iElapsedRealtime))) | (-908894679);
                        int i18 = ~(iElapsedRealtime | 912325488);
                        int i19 = i13 + i16 + ((i17 | i18) * (-880)) + (i18 * 880);
                        int i20 = (i19 << 13) ^ i19;
                        int i21 = i20 ^ (i20 >>> 17);
                        ((int[]) objArr15[3])[0] = i21 ^ (i21 << 5);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = (String[]) objArr[1];
                        if (strArr != null) {
                            int i22 = TuitionPaymentFragmentbindingInflater1 + 31;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i22 % 128;
                            int i23 = i22 % 2;
                            int i24 = 0;
                            while (i24 < strArr.length) {
                                arrayList.add(strArr[i24]);
                                i24++;
                                int i25 = TuitionPaymentFragmentbindingInflater1 + 37;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i25 % 128;
                                int i26 = i25 % 2;
                            }
                        }
                        int[] iArr = new int[i10];
                        int i27 = i10 - 1;
                        iArr[i27] = 1;
                        Toast.makeText((Context) null, iArr[((i10 * i27) % 2) - 1], 1).show();
                        Object[] objArr16 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
                        int i28 = ((int[]) objArr[3])[0];
                        int i29 = ((int[]) objArr[2])[0];
                        int i30 = ((int[]) objArr[0])[0];
                        int i31 = ~System.identityHashCode(this);
                        int i32 = ~(598793594 | i31);
                        int i33 = i28 + 1396471977 + ((i32 | (-595362785)) * 764) + (((~(i31 | (-595362785))) | 590381408) * (-1528)) + (((-13393563) | i32) * 764);
                        int i34 = (i33 << 13) ^ i33;
                        int i35 = i34 ^ (i34 >>> 17);
                        ((int[]) objArr16[3])[0] = i35 ^ (i35 << 5);
                    }
                    AFb1lSDK.AFAdRevenueData(this.f$0);
                }

                /* JADX WARN: Code duplicated, block: B:10:0x0023  */
                /* JADX WARN: Code duplicated, block: B:8:0x001d  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static java.lang.String $$e(short r6, byte r7, int r8) {
                    /*
                        int r6 = r6 * 2
                        int r6 = 4 - r6
                        int r8 = r8 + 119
                        int r7 = r7 * 3
                        int r7 = 1 - r7
                        byte[] r0 = com.appsflyer.internal.AFb1lSDK$$ExternalSyntheticLambda1.$$c
                        byte[] r1 = new byte[r7]
                        r2 = 0
                        if (r0 != 0) goto L15
                        r3 = r8
                        r4 = r2
                        r8 = r6
                        goto L2a
                    L15:
                        r3 = r2
                    L16:
                        byte r4 = (byte) r8
                        r1[r3] = r4
                        int r3 = r3 + 1
                        if (r3 != r7) goto L23
                        java.lang.String r6 = new java.lang.String
                        r6.<init>(r1, r2)
                        return r6
                    L23:
                        r4 = r0[r6]
                        r5 = r8
                        r8 = r6
                        r6 = r4
                        r4 = r3
                        r3 = r5
                    L2a:
                        int r6 = -r6
                        int r8 = r8 + 1
                        int r6 = r6 + r3
                        r3 = r4
                        r5 = r8
                        r8 = r6
                        r6 = r5
                        goto L16
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1lSDK$$ExternalSyntheticLambda1.$$e(short, byte, int):java.lang.String");
                }
            };
            AFb1bSDK.Companion companion = AFb1bSDK.INSTANCE;
            scheduledExecutorService.schedule(runnable, AFb1bSDK.Companion.getRevenue(), TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            AFLogger.afErrorLog("Background task failed with a throwable: ", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFAdRevenueData(AFb1lSDK aFb1lSDK) {
        Intrinsics.checkNotNullParameter(aFb1lSDK, "");
        if (aFb1lSDK.component1 && aFb1lSDK.component3) {
            aFb1lSDK.component1 = false;
            try {
                aFb1lSDK.getCurrencyIso4217Code.getCurrencyIso4217Code();
            } catch (Exception e2) {
                AFLogger.afErrorLog("Listener threw exception! ", e2);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        AFa1oSDK aFa1oSDK = this.getRevenue;
        Intent intent = activity.getIntent();
        if (((intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData()) != null && intent != aFa1oSDK.AFAdRevenueData) {
            aFa1oSDK.AFAdRevenueData = intent;
        }
        this.getMediationNetwork.getMediationNetwork(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(bundle, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }
}
