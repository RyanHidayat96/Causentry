package com.google.android.gms.auth.api.signin.internal;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.measurement.internal.zznf;
import defpackage.deInitSession;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class zbv implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ SignInHubActivity zba;
    private static final byte[] $$c = {77, -106, 83, 4};
    private static final int $$d = 238;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {104, 27, -72, 120, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 126;
    private static int b = 0;
    private static int asBinder = 1;
    private static char[] TuitionPaymentFragmentbindingInflater1 = {45565, 61673, 13262, 29375, 46495, 62578, 14170, 30223, 47403, 63516, 15036, 32230, 48289, 65456, 16018, 24940, 41025, 58132, 8726, 25842, 42979, 59072, 45560, 61666, 13266, 29326, 46481, 62584, 14166, 30276, 45560, 61666, 13266, 29323, 46489, 62583, 14171, 45565, 61673, 13262, 29375, 46495, 62578, 14170, 30223, 47397, 63519, 15074, 32155, 48281, 65440, 16018, 24928, 41050, 58174, 8718, 25828, 42964, 59075, 10684, 26772, 43893, 59995};
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 3856816278611947655L;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {60054, 60043, 60041, 60055, 60040, 60050, 60056, 60058, 60034, 60053, 60090, 59744, 60057, 60049, 60048, 60044, 60072, 59746, 60052, 60051, 60079, 60062, 60083, 60117, 60046, 60047, 60088, 60073, 59749, 60059, 59745, 60045, 59747, 60063, 60061, 60060};
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 57191;

    /* synthetic */ zbv(SignInHubActivity signInHubActivity, byte[] bArr) {
        Objects.requireNonNull(signInHubActivity);
        this.zba = signInHubActivity;
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
    private static void d(int r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 52
            int r0 = r6 + 1
            byte[] r1 = com.google.android.gms.auth.api.signin.internal.zbv.$$a
            int r7 = r7 * 14
            int r7 = 98 - r7
            int r5 = r5 * 52
            int r5 = r5 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r7 = r5
            r3 = r6
            r4 = r2
            goto L29
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L27:
            r3 = r1[r5]
        L29:
            int r5 = r5 + 1
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.internal.zbv.d(int, short, int, java.lang.Object[]):void");
    }

    @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
    public final Loader onCreateLoader(int i, Bundle bundle) {
        int i2 = 2 % 2;
        zbc zbcVar = new zbc(this.zba, GoogleApiClient.getAllClients());
        int i3 = b + 71;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return zbcVar;
    }

    @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
    public final /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 47;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            SignInHubActivity signInHubActivity = this.zba;
            signInHubActivity.setResult(signInHubActivity.zba(), signInHubActivity.zbb());
            signInHubActivity.finish();
            return;
        }
        SignInHubActivity signInHubActivity2 = this.zba;
        signInHubActivity2.setResult(signInHubActivity2.zba(), signInHubActivity2.zbb());
        signInHubActivity2.finish();
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        int i4 = $11 + 53;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i6 = $11 + 25;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1[i / i7])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (Process.myPid() >> 22) + 2187, 40 - Color.green(0), 841711447, false, $$e((byte) 7, b2, b2), new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b3 = (byte) 1;
                            byte b4 = (byte) (b3 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 33017), (ViewConfiguration.getFadingEdgeLength() >> 16) + 3011, Color.green(0) + 26, 321985076, false, $$e(b3, b4, b4), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                        Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char cAxisFromString = (char) (36504 - MotionEvent.axisFromString(""));
                            int i8 = 3377 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                            int maximumFlingVelocity = 17 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            byte length = (byte) $$c.length;
                            byte b5 = (byte) (length - 4);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cAxisFromString, i8, maximumFlingVelocity, -968507904, false, $$e(length, b5, b5), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
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
                int i9 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                Object[] objArr5 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1[i + i9])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 0;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ExpandableListView.getPackedPositionChild(0L) + 1), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2187, 40 - View.getDefaultSize(0, 0), 841711447, false, $$e((byte) 7, b6, b6), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i9), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b7 = (byte) 1;
                    byte b8 = (byte) (b7 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (33017 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), ImageFormat.getBitsPerPixel(0) + 3012, 26 - Color.alpha(0), 321985076, false, $$e(b7, b8, b8), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i9] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 36505);
                    int iBlue = Color.blue(0) + 3376;
                    int windowTouchSlop = 17 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    byte length2 = (byte) $$c.length;
                    byte b9 = (byte) (length2 - 4);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveSizeAndState, iBlue, windowTouchSlop, -968507904, false, $$e(length2, b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        int i10 = $11 + 85;
        $10 = i10 % 128;
        int i11 = i10 % 2;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i12 = $11 + 39;
            $10 = i12 % 128;
            if (i12 % 2 != 0) {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                    char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 36505);
                    int iArgb = 3376 - Color.argb(0, 0, 0, 0);
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 17;
                    byte length3 = (byte) $$c.length;
                    byte b10 = (byte) (length3 - 4);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cNormalizeMetaState, iArgb, iResolveOpacity, -968507904, false, $$e(length3, b10, b10), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
                throw null;
            }
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr9 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char cIndexOf = (char) (TextUtils.indexOf("", "", 0, 0) + 36505);
                int iGreen = Color.green(0) + 3376;
                int bitsPerPixel = 16 - ImageFormat.getBitsPerPixel(0);
                byte length4 = (byte) $$c.length;
                byte b11 = (byte) (length4 - 4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cIndexOf, iGreen, bitsPerPixel, -968507904, false, $$e(length4, b11, b11), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr9);
        }
        objArr[0] = new String(cArr);
    }

    @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
    public final void onLoaderReset(Loader loader) throws Throwable {
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - (KeyEvent.getMaxKeyCode() >> 16)), TextUtils.indexOf((CharSequence) "", '0') + 41, 19 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
        }
        int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        int i3 = 0;
        Object[] objArr = new Object[1];
        a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1, 21 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (Process.myPid() >> 22), objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        c(15 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), new char[]{27, '\t', '\r', 7, 3, 22, 3, '!', 19, '\t', 1, 27, 0, 1, 13948}, (byte) (125 - KeyEvent.normalizeMetaState(0)), objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long j = 262;
        long j2 = -1;
        long j3 = ((j2 ^ 4598252942374125609L) | (-2500995767632166622L)) ^ j2;
        long j4 = j2 ^ (-2500995767632166622L);
        long j5 = (j4 | 4598252942374125609L) ^ j2;
        long jIdentityHashCode = System.identityHashCode(this);
        long j6 = (((long) (-523)) * 4598252942374125609L) + (((long) 263) * (-2500995767632166622L)) + ((j3 | j5 | ((j4 | jIdentityHashCode) ^ j2)) * j) + (((long) (-786)) * j5) + (j * (((j4 | (jIdentityHashCode ^ j2)) ^ j2) | j3 | j5));
        for (int i4 = 0; i4 != 10; i4++) {
            int i5 = b + 123;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Color.green(0) + 37836), 59 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getTouchSlop() >> 8) + 18, 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
            }
            int i7 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
            long j7 = jLongValue;
            int i8 = 0;
            while (true) {
                int i9 = 0;
                while (i9 != 8) {
                    int i10 = b + 43;
                    asBinder = i10 % 128;
                    if (i10 % 2 == 0) {
                        i7 = (((((int) (j7 >> i9)) & 18161) % (i7 % 51)) % (i7 % 119)) - i7;
                        i9 += 67;
                    } else {
                        i7 = (((((int) (j7 >> i9)) & 255) + (i7 << 6)) + (i7 << 16)) - i7;
                        i9++;
                    }
                }
                if (i8 != 0) {
                    break;
                }
                i8++;
                j7 = j6;
            }
            if (i7 == i2) {
                return;
            }
            jLongValue -= 1024;
        }
        Object[] objArr3 = new Object[1];
        c((-16777200) - Color.rgb(0, 0, 0), new char[]{19, '\r', 1, '\r', 21, 5, '\b', '\n', 5, 29, 14, '\n', 1, 28, 18, 3}, (byte) ((KeyEvent.getMaxKeyCode() >> 16) + 91), objArr3);
        Class<?> cls2 = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(16 - (ViewConfiguration.getJumpTapTimeout() >> 16), new char[]{3, '#', 27, 15, 29, 1, 26, 7, 19, '\n', 1, 22, 24, 20, 3, 27}, (byte) (107 - Color.alpha(0)), objArr4);
        int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
        try {
            Object[] objArr5 = {1571550276};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (46038 - (ViewConfiguration.getTapTimeout() >> 16)), 1135 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 18 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr6 = {Integer.valueOf(iIntValue), 0, -415157682, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr5), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1031;
                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 15;
                byte[] bArr = $$a;
                byte b2 = bArr[7];
                byte b3 = bArr[5];
                Object[] objArr7 = new Object[1];
                d(b2, b3, b3, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, maximumDrawingCacheSize, absoluteGravity, 1298546779, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45992 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (Process.myTid() >> 22) + 1117, 18 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), Boolean.TYPE});
            }
            Object[] objArr8 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr6);
            if (((int[]) objArr8[3])[0] == ((int[]) objArr8[1])[0]) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr8[0];
            if (strArr != null) {
                while (i3 < strArr.length) {
                    int i11 = asBinder + 7;
                    b = i11 % 128;
                    if (i11 % 2 != 0) {
                        arrayList.add(strArr[i3]);
                        i3 += 60;
                    } else {
                        arrayList.add(strArr[i3]);
                        i3++;
                    }
                }
            }
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void c(int i, char[] cArr, byte b2, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3;
        int length;
        char[] cArr2;
        int i4;
        int i5 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Object obj2 = null;
        float f = 0.0f;
        char c = 3;
        if (cArr3 != null) {
            int i6 = $11 + 65;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i4 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i4 = 0;
            }
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i4])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c2 = (char) (TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1));
                        int iResolveSize = 2267 - View.resolveSize(0, 0);
                        int scrollDefaultDelay = 33 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        byte b3 = (byte) ($$c[c] - 1);
                        byte b4 = (byte) (b3 - 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, iResolveSize, scrollDefaultDelay, -1927765101, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr2[i4] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i4++;
                    f = 0.0f;
                    c = 3;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char mode = (char) View.MeasureSpec.getMode(0);
            int packedPositionGroup = 2267 - ExpandableListView.getPackedPositionGroup(0L);
            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 33;
            byte b5 = (byte) ($$c[3] - 1);
            byte b6 = (byte) (b5 - 3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(mode, packedPositionGroup, doubleTapTimeout, -1927765101, false, $$e(b5, b6, b6), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i7 = $10 + 61;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                    obj = obj2;
                    i3 = 2;
                } else {
                    Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char c3 = (char) (49267 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 3261;
                        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 30;
                        byte b7 = (byte) ($$d & 3);
                        byte b8 = (byte) (b7 - 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c3, scrollBarSize, windowTouchSlop, -127612708, false, $$e(b7, b8, b8), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b9 = (byte) 0;
                            byte b10 = b9;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (22879 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0') + 595, 17 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1570859318, false, $$e(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        int i9 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i9];
                    } else {
                        obj = null;
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i10 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i11 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i10];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i11];
                        } else {
                            int i12 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i13 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i12];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i13];
                            int i14 = $11 + 27;
                            $10 = i14 % 128;
                            i3 = 2;
                            int i15 = i14 % 2;
                        }
                    }
                    i3 = 2;
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += i3;
                obj2 = obj;
            }
        }
        for (int i16 = 0; i16 < i; i16++) {
            int i17 = $10 + 3;
            $11 = i17 % 128;
            int i18 = i17 % 2;
            cArr4[i16] = (char) (cArr4[i16] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:132:0x0ad0  */
    /* JADX WARN: Code duplicated, block: B:133:0x0ae2  */
    /* JADX WARN: Code duplicated, block: B:136:0x0bbe  */
    /* JADX WARN: Code duplicated, block: B:138:0x0bdb  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32, types: [int] */
    /* JADX WARN: Type inference failed for: r3v79 */
    /* JADX WARN: Type inference failed for: r3v80 */
    /* JADX WARN: Type inference failed for: r3v89, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r9v51, types: [int[]] */
    public static Object[] b(Class cls, int i, int i2, int i3) throws Throwable {
        int i4;
        CharSequence charSequence;
        long jCurrentTimeMillis;
        int i5;
        int i6;
        int i7;
        int i8;
        String[] strArr;
        Object[] objArr;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        ?? r3;
        char c;
        String string;
        int i19;
        char c2;
        Object[] objArr2;
        int i20;
        char c3;
        int[] iArr;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27 = 2 % 2;
        if ((i2 & 2) != 0) {
            String[][] strArr2 = new String[1][];
            try {
                int i28 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 21;
                int i29 = -Color.red(0);
                int i30 = i29 * 765;
                int i31 = (i30 ^ (-12216)) + ((i30 & (-12216)) << 1);
                int i32 = ~i;
                int i33 = ~((i32 ^ i29) | (i32 & i29));
                int i34 = -(-(((i33 & 8) | (i33 ^ 8)) * 764));
                int i35 = ((i31 | i34) << 1) - (i34 ^ i31);
                int i36 = ~((~i29) | 8);
                int i37 = ~i;
                int i38 = (i36 | (~((i37 ^ 8) | (i37 & 8)))) * (-1528);
                int i39 = ((i35 | i38) << 1) - (i35 ^ i38);
                int i40 = ~i29;
                int i41 = ~((i40 ^ 8) | (i40 & 8));
                int i42 = ~(((-9) ^ i29) | ((-9) & i29));
                int i43 = (i41 ^ i42) | (i41 & i42);
                int i44 = ~((i29 & i37) | (i37 ^ i29));
                int i45 = ((i43 & i44) | (i43 ^ i44)) * 764;
                int i46 = (i39 & i45) + (i45 | i39);
                int i47 = -TextUtils.lastIndexOf("", '0', 0);
                int i48 = asBinder;
                int i49 = (i48 ^ 97) + ((i48 & 97) << 1);
                b = i49 % 128;
                int i50 = i49 % 2;
                int i51 = ~i47;
                int i52 = ~((i51 ^ i37) | (i51 & i37));
                int i53 = ~i47;
                int i54 = (((i47 * (-337)) - 339) - (~(-(-((((i52 ^ i53) | (i53 & i52)) | (~((i47 ^ i) | (i47 & i)))) * (-338)))))) - 1;
                int i55 = ~i47;
                int i56 = (i54 << 1) - i54;
                int i57 = ~((i55 & i32) | (i55 ^ i32));
                int i58 = i47 | i51;
                int i59 = ~((i58 & i) | (i58 ^ i));
                int i60 = ((i57 & i59) | (i57 ^ i59)) * 338;
                Object[] objArr3 = new Object[1];
                a(i28, i46, (char) ((i56 ^ i60) + ((i60 & i56) << 1)), objArr3);
                Field declaredField = Class.class.getDeclaredField((String) objArr3[0]);
                declaredField.setAccessible(true);
                Object obj = declaredField.get(cls);
                Class<?> cls2 = obj.getClass();
                int maximumDrawingCacheSize = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                int i61 = maximumDrawingCacheSize * 236;
                int i62 = (i61 & 14130) + (i61 | 14130);
                int i63 = ~maximumDrawingCacheSize;
                int i64 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i65 = -(-(((~((i63 ^ i64) | (i64 & i63))) | 30) * (-235)));
                int i66 = (i62 ^ i65) + ((i62 & i65) << 1);
                int i67 = ~((i63 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i63 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                int i68 = i66 + (((i67 & 30) | (i67 ^ 30)) * (-470));
                int i69 = b + 95;
                asBinder = i69 % 128;
                int i70 = i69 % 2;
                int i71 = ~((maximumDrawingCacheSize & (-31)) | ((-31) ^ maximumDrawingCacheSize));
                int i72 = ~(iTuitionPaymentFragmentspecialinlinedviewModeldefault2 | (i63 & 30) | (i63 ^ 30));
                int i73 = (i68 - (~(235 * ((i71 & i72) | (i71 ^ i72))))) - 1;
                int i74 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                int i75 = (i74 & 7) + (i74 | 7);
                int i76 = -ExpandableListView.getPackedPositionChild(0L);
                int i77 = i76 * 398;
                int i78 = ((i77 | 396) << 1) - (i77 ^ 396);
                int i79 = ~i76;
                int i80 = ~((i79 ^ i32) | (i79 & i32));
                int i81 = ~((~i79) | i79);
                int i82 = -(-(((~(i32 | (~i32))) | (i80 ^ i81) | (i80 & i81)) * (-397)));
                int i83 = (i78 ^ i82) + ((i82 & i78) << 1);
                int i84 = -(-((~((~i79) | i79)) * (-397)));
                int i85 = (i83 ^ i84) + ((i84 & i83) << 1);
                int i86 = ~i76;
                int i87 = ~(i86 | (~i86));
                char c4 = (char) (i85 + (((~i76) | (i87 & i) | (i ^ i87)) * 397));
                Object[] objArr4 = new Object[1];
                a(i73, i75, c4, objArr4);
                Field declaredField2 = cls2.getDeclaredField((String) objArr4[0]);
                declaredField2.setAccessible(true);
                long jLongValue = ((Number) declaredField2.get(obj)).longValue() & 281474976710655L;
                r3 = 2;
                try {
                    try {
                        Object[] objArr5 = {Long.valueOf(jLongValue), strArr2};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486768121);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 41241);
                            int defaultSize = View.getDefaultSize(0, 0) + 1705;
                            int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 21;
                            byte[] bArr = $$a;
                            byte b2 = bArr[5];
                            byte b3 = bArr[7];
                            Object[] objArr6 = new Object[1];
                            d(b2, b3, b3, objArr6);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatDelay, defaultSize, iIndexOf, -107095506, false, (String) objArr6[0], new Class[]{Long.TYPE, String[][].class});
                        }
                        r3 = (Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr5);
                        long jLongValue2 = r3.longValue();
                        long j = -893009931;
                        long j2 = 764;
                        long j3 = -1;
                        long j4 = ((long) i) ^ j3;
                        long j5 = (j4 | j) ^ j3;
                        long j6 = ((j ^ j3) | jLongValue2) ^ j3;
                        long j7 = (((long) 765) * j) + (((long) (-1527)) * jLongValue2) + ((jLongValue2 | j5) * j2) + (((long) (-1528)) * (j6 | ((j4 | jLongValue2) ^ j3))) + (j2 * (j6 | (((jLongValue2 ^ j3) | j) ^ j3) | j5)) + ((long) (-1213007130));
                        i4 = i;
                        int i88 = ((int) (j7 >> 32)) & ((-1084269382) + (((~((-2135305658) | i4)) | 687998984 | (~((-698079247) | i4))) * (-754)) + (((~((-687998985) | i4)) | (~(i37 | (-10080263)))) * (-754)) + (((-2135305658) | i37) * 754));
                        int i89 = ((int) j7) & (695319256 + ((~((-1479566861) | i4)) * (-301)) + (((~((-583407715) | i4)) | (~(i37 | (-2020634125)))) * (-301)) + (((-583407715) | (~(2020634124 | i4))) * 301));
                        int i90 = (i88 & i89) | (i88 ^ i89);
                        if (i90 != 0) {
                            int i91 = b;
                            int i92 = (i91 & 97) + (i91 | 97);
                            asBinder = i92 % 128;
                            int i93 = i92 % 2;
                            int i94 = (i90 & i37) | ((~i90) & i4);
                            String[] strArr3 = new String[4];
                            strArr3[0] = cls.getName();
                            String[] strArr4 = strArr2[0];
                            int i95 = asBinder + 69;
                            int i96 = i95 % 128;
                            b = i96;
                            int i97 = i95 % 2;
                            strArr3[1] = strArr4[0];
                            strArr3[2] = strArr4[1];
                            strArr3[3] = strArr4[2];
                            Object[] objArr7 = new Object[4];
                            objArr7[0] = new int[1];
                            int[] iArr2 = new int[1];
                            objArr7[1] = iArr2;
                            int[] iArr3 = new int[1];
                            objArr7[2] = iArr3;
                            int i98 = i96 + 81;
                            int i99 = i98 % 128;
                            asBinder = i99;
                            int i100 = i98 % 2;
                            iArr3[0] = i4;
                            int i101 = ((i99 | 85) << 1) - (i99 ^ 85);
                            b = i101 % 128;
                            if (i101 % 2 != 0) {
                                iArr2[1] = i94;
                                i24 = (-116965905) + (((~((-753775135) | i37)) | (-951256325)) * (-983)) + (((~((-951256325) | i37)) | 269616384) * 983);
                            } else {
                                iArr2[0] = i94;
                                int iMyPid = Process.myPid();
                                int i102 = ~iMyPid;
                                i24 = (((~((-1126526453) | i102)) | (~(iMyPid | 578505006))) * 959) + 138475815 + (((~(iMyPid | (-1126526453))) | (~(i102 | 578505006))) * 959);
                            }
                            int i103 = b;
                            int i104 = (i103 & 53) + (i103 | 53);
                            int i105 = i104 % 128;
                            asBinder = i105;
                            if (i104 % 2 == 0) {
                                int i106 = i3 << (i24 * 16);
                                int i107 = i106 / 80;
                                int i108 = (i106 | i107) & (~(i106 & i107));
                                int i109 = i108 / 117;
                                i25 = ((~i108) & i109) | ((~i109) & i108);
                                i26 = i25 % 4;
                            } else {
                                int i110 = i24 + 16;
                                int i111 = ((i3 | i110) << 1) - (i110 ^ i3);
                                int i112 = i111 << 13;
                                int i113 = (i111 | i112) & (~(i111 & i112));
                                i25 = i113 ^ (i113 >>> 17);
                                i26 = i25 << 5;
                            }
                            ((int[]) objArr7[0])[0] = ((~i25) & i26) | ((~i26) & i25);
                            objArr7[3] = strArr3;
                            int i114 = (i105 & 69) + (i105 | 69);
                            b = i114 % 128;
                            int i115 = i114 % 2;
                            return objArr7;
                        }
                        int i116 = asBinder;
                        int i117 = ((i116 | 59) << 1) - (i116 ^ 59);
                        b = i117 % 128;
                        int i118 = i117 % 2;
                        charSequence = "";
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        StringWriter stringWriter = new StringWriter();
                        try {
                            Object[] objArr8 = {new PrintWriter(stringWriter)};
                            int i119 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            int i120 = (i119 * (-716)) + 28700;
                            int i121 = ~i119;
                            int i122 = i121 | 20;
                            int i123 = asBinder;
                            int i124 = ((i123 | 123) << 1) - (i123 ^ 123);
                            int i125 = i124 % 128;
                            b = i125;
                            if (i124 % 2 != 0) {
                                i21 = i120 % ((-1434) >>> i122);
                                int i126 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | 20);
                                int i127 = ~((i119 ^ 20) | (i119 & 20));
                                i22 = (i126 & i127) | (i126 ^ i127);
                            } else {
                                int i128 = i122 * (-1434);
                                i21 = (i120 | i128) + (i120 & i128);
                                int i129 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                i22 = (~((i129 & 20) | (i129 ^ 20))) | (~(i119 | 20));
                            }
                            int i130 = (i125 & 95) + (i125 | 95);
                            asBinder = i130 % 128;
                            if (i130 % 2 == 0) {
                                int i131 = ~i119;
                                int i132 = (i131 & (-21)) | (i131 ^ (-21));
                                i23 = i21 % (((~((i132 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i132 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3))) | i22) * 717);
                                i121 = ~i119;
                            } else {
                                int i133 = ((i119 ^ (-1)) & (-21)) | (i119 ^ 20);
                                int i134 = ~((i133 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i133 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                i23 = i21 + (((i22 & i134) | (i22 ^ i134)) * 717);
                            }
                            int i135 = i121 | (-21);
                            int i136 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i137 = ~((i135 & i136) | (i135 ^ i136));
                            int i138 = ~((i119 & 20) | (i119 ^ 20));
                            int i139 = (i138 & i137) | (i137 ^ i138);
                            int i140 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & 20) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ 20));
                            Object[] objArr9 = new Object[1];
                            c(i23 + (((i139 & i140) | (i139 ^ i140)) * 717), new char[]{19, '\r', 1, '\r', 21, 5, '\b', '\n', 5, 29, 21, 20, 0, 20, '\r', '\t', 15, 0, 13911}, (byte) (88 - TextUtils.getCapsMode("", 0, 0)), objArr9);
                            Class<?> cls3 = Class.forName((String) objArr9[0]);
                            float minVolume = AudioTrack.getMinVolume();
                            int i141 = b;
                            int i142 = ((i141 | 93) << 1) - (i141 ^ 93);
                            asBinder = i142 % 128;
                            int i143 = i142 % 2;
                            int i144 = 14 - (~(minVolume > 0.0f ? 1 : (minVolume == 0.0f ? 0 : -1)));
                            int i145 = -(-(ViewConfiguration.getScrollDefaultDelay() >> 16));
                            Object[] objArr10 = new Object[1];
                            c(i144, new char[]{2, 3, 3, 11, 28, '\r', 31, '\r', '\b', '\f', 26, '\b', '\b', 7, 13881}, (byte) ((i145 & 58) + (i145 | 58)), objArr10);
                            String str = (String) objArr10[0];
                            Class<?>[] clsArr = new Class[1];
                            int i146 = ~(((-925404161) & r3) | ((-925404161) ^ r3));
                            int i147 = ~r3;
                            int i148 = ((-2007534881) & i147) | ((-2007534881) ^ i147);
                            int i149 = ~((i148 & (-1217544557)) | (i148 ^ (-1217544557)));
                            int i150 = (-151633813) + (((i146 & i149) | (i146 ^ i149)) * 920);
                            int i151 = ~((1217544556 & i147) | (1217544556 ^ i147));
                            int i152 = (i150 - (~(((i151 & 925404160) | (925404160 ^ i151)) * 920))) - 1;
                            int i153 = (~((-925404161) | i147)) | (~((2142948716 & r3) | (2142948716 ^ r3)));
                            int i154 = ~((-1082130721) | r3);
                            int i155 = (i152 - (~(((i153 & i154) | (i153 ^ i154)) * 920))) - 1;
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            int i156 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                            int i157 = ~(1077939462 | i156);
                            int i158 = 1542673158 - (~(((~(i156 | 592582398)) | ((i157 & (-1666326527)) | (i157 ^ (-1666326527)))) * 464));
                            int i159 = ((-592582399) & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault4 ^ (-592582399));
                            int i160 = (i158 - (~(((i159 & 1077939462) | (i159 ^ 1077939462)) * (-464)))) - 1;
                            int i161 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault4 & 592582398) | (592582398 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                            int i162 = -(-(((i161 & (-1666326527)) | ((-1666326527) ^ i161)) * 464));
                            if (i155 <= ((i160 | i162) << 1) - (i162 ^ i160)) {
                                clsArr[0] = PrintWriter.class;
                                cls3.getMethod(str, clsArr).invoke(th, objArr8);
                                stringWriter.toString();
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                            clsArr[0] = PrintWriter.class;
                            cls3.getMethod(str, clsArr).invoke(th, objArr8);
                            string = stringWriter.toString();
                            c = 0;
                            int i163 = r3 ^ 31;
                            String[] strArr5 = new String[2];
                            strArr5[c] = cls.getName();
                            int i164 = asBinder;
                            int i165 = (i164 & 11) + (i164 | 11);
                            b = i165 % 128;
                            if (i165 % 2 != 0) {
                                i19 = 1;
                                strArr5[1] = string;
                                objArr2 = new Object[2];
                                c2 = 0;
                                objArr2[0] = new int[0];
                            } else {
                                i19 = 1;
                                c2 = 0;
                                strArr5[1] = string;
                                objArr2 = new Object[4];
                                objArr2[0] = new int[1];
                            }
                            int[] iArr4 = new int[i19];
                            objArr2[i19] = iArr4;
                            int[] iArr5 = new int[i19];
                            objArr2[2] = iArr5;
                            iArr5[c2] = r3;
                            iArr4[c2] = i163;
                            int i166 = ~r3;
                            int i167 = (((~((-1701776578) | i166)) | (~(r3 | 3254881))) * 959) + 615331137 + (((~(r3 | (-1701776578))) | (~(i166 | 3254881))) * 959);
                            int i168 = (i164 ^ 9) + ((i164 & 9) << 1);
                            b = i168 % 128;
                            if (i168 % 2 != 0) {
                                int i169 = i3 >> (i167 << 16);
                                int i170 = i169 + 68;
                                int i171 = (i169 | i170) & (~(i169 & i170));
                                int i172 = i171 - 70;
                                int i173 = ((~i171) & i172) | ((~i172) & i171);
                                i20 = i173 ^ ((i173 & 5) + (i173 | 5));
                                iArr = (int[]) objArr2[0];
                                c3 = 0;
                            } else {
                                int i174 = i167 + 16;
                                int i175 = (i3 ^ i174) + ((i3 & i174) << 1);
                                int i176 = i175 << 13;
                                int i177 = (i175 | i176) & (~(i175 & i176));
                                int i178 = i177 ^ (i177 >>> 17);
                                int i179 = i178 << 5;
                                i20 = ((~i178) & i179) | ((~i179) & i178);
                                c3 = 0;
                                iArr = (int[]) objArr2[0];
                            }
                            iArr[c3] = i20;
                            objArr2[3] = strArr5;
                            return objArr2;
                        } catch (Throwable th3) {
                            Throwable cause2 = th3.getCause();
                            if (cause2 != null) {
                                throw cause2;
                            }
                            throw th3;
                        }
                    } catch (Throwable unused) {
                        int maximumDrawingCacheSize2 = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        int i180 = maximumDrawingCacheSize2 * (-716);
                        int i181 = ((i180 | 1435) << 1) - (i180 ^ 1435);
                        int i182 = ~maximumDrawingCacheSize2;
                        int i183 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | 1);
                        int i184 = (maximumDrawingCacheSize2 ^ 1) | (maximumDrawingCacheSize2 & 1);
                        int i185 = ~i184;
                        int i186 = ~maximumDrawingCacheSize2;
                        int i187 = (i186 & (-2)) | (i186 ^ (-2));
                        int i188 = i181 + ((i182 | 1) * (-1434)) + (((~((i187 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i187 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5))) | (i183 & i185) | (i183 ^ i185)) * 717);
                        int i189 = i182 | (-2);
                        int i190 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                        int i191 = ~((i189 & i190) | (i189 ^ i190));
                        int i192 = ~i184;
                        int i193 = (i191 & i192) | (i191 ^ i192);
                        int i194 = ~(iTuitionPaymentFragmentspecialinlinedviewModeldefault5 | 1);
                        int i195 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        Object[] objArr11 = new Object[1];
                        c((i188 - (~(-(-(((i193 & i194) | (i193 ^ i194)) * 717))))) - 1, new char[]{13775}, (byte) ((i195 ^ 28) + ((i195 & 28) << 1)), objArr11);
                        c = 0;
                        string = (String) objArr11[0];
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                r3 = i;
            }
        } else {
            i4 = i;
            charSequence = "";
        }
        int[] iArr6 = {-1844476378, 1276062274, -797088743, 965014536, -30564408, 800164665, 427080095, -63109426, -2128711273, 443823261, -421827424, -1596256068, -554832609, -49350782, -437871410, 1291703475, -587285223, 1359539528, -706062319, 1866472215};
        String[][] strArr6 = new String[1][];
        int i196 = b;
        int i197 = ((i196 | 3) << 1) - (i196 ^ 3);
        asBinder = i197 % 128;
        if (i197 % 2 == 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
            int i198 = 79 / 0;
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        int i199 = ((int) jCurrentTimeMillis) ^ 343337308;
        int i200 = (~i199) & i4;
        int i201 = ~i4;
        try {
            Object[] objArr12 = {Integer.valueOf(i200 | (i199 & i201)), iArr6, Integer.valueOf(i2), strArr6};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-561316232);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cAlpha = (char) (43042 - Color.alpha(0));
                int iIndexOf2 = 3111 - TextUtils.indexOf(charSequence, charSequence, 0, 0);
                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 22;
                byte[] bArr2 = $$a;
                byte b4 = bArr2[5];
                byte b5 = bArr2[7];
                Object[] objArr13 = new Object[1];
                d(b4, b5, b5, objArr13);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cAlpha, iIndexOf2, keyRepeatTimeout, 974412207, false, (String) objArr13[0], new Class[]{Integer.TYPE, int[].class, Integer.TYPE, String[][].class});
            }
            long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr12)).longValue();
            long j8 = -174739183;
            long j9 = 46;
            long j10 = -1;
            long j11 = jLongValue3 ^ j10;
            long j12 = i4;
            long j13 = j12 ^ j10;
            long j14 = (j9 * j8) + (j9 * jLongValue3) + (((long) (-90)) * (j8 | ((j11 | j13) ^ j10))) + (((long) (-45)) * (((j11 | j12) ^ j10) | ((jLongValue3 | j8) ^ j10))) + (((long) 45) * (j11 | ((j12 | (j8 ^ j10)) ^ j10) | (j10 ^ (j13 | j8)))) + ((long) 278473248);
            int i202 = (int) Runtime.getRuntime().totalMemory();
            int i203 = ((int) (j14 >> 32)) & ((-2005432166) + (((~(1420964078 | i202)) | (-1437825519)) * 104) + ((~((~i202) | (-1419915367))) * (-104)) + ((i202 | (-1436776807)) * 104));
            int i204 = ((int) j14) & ((((~((-806780847) | i201)) | (~(2050960039 | i4))) * 959) + 2024679643 + (((~((-806780847) | i4)) | (~(2050960039 | i201))) * 959));
            int i205 = (i203 & i204) | (i203 ^ i204);
            int i206 = (i205 | i199) & (~(i205 & i199));
            if (i206 != i4) {
                String[] strArr7 = strArr6[0];
                int[] iArr7 = new int[1];
                int[] iArr8 = {i4};
                int[] iArr9 = {i206};
                int i207 = ((~((-68558873) | i4)) * 521) + 725852518 + (((~((-68558873) | i201)) | 1359480516) * 521) + 16;
                int i208 = (i207 * 595) + (i3 * (-1187));
                int i209 = ~i207;
                int i210 = ~((i209 ^ i3) | (i209 & i3));
                int i211 = ~i4;
                int i212 = ~((i211 ^ i3) | (i211 & i3));
                int i213 = ((i210 & i212) | (i210 ^ i212)) * (-1188);
                int i214 = ((i208 | i213) << 1) - (i208 ^ i213);
                int i215 = ~(i209 | i3);
                int i216 = ~i3;
                int i217 = ~((i4 & i216) | (i216 ^ i4));
                int i218 = (i215 & i217) | (i215 ^ i217);
                int i219 = ~((i211 ^ i207) | (i211 & i207));
                int i220 = (i214 - (~(((i218 & i219) | (i218 ^ i219)) * 594))) - 1;
                int i221 = ~((i216 ^ i211) | (i216 & i211));
                int i222 = ~i3;
                int i223 = ~((i222 & i207) | (i222 ^ i207));
                int i224 = (i221 & i223) | (i221 ^ i223);
                int i225 = ~((i207 & i201) | (i201 ^ i207));
                int i226 = ((i225 & i224) | (i224 ^ i225)) * 594;
                int i227 = (i220 ^ i226) + ((i226 & i220) << 1);
                int i228 = (i227 << 13) ^ i227;
                int i229 = i228 >>> 17;
                int i230 = (i228 | i229) & (~(i228 & i229));
                int i231 = i230 << 5;
                iArr7[0] = (i230 | i231) & (~(i230 & i231));
                return new Object[]{iArr7, iArr9, iArr8, strArr7};
            }
            try {
                int i232 = -TextUtils.getCapsMode(charSequence, 0, 0);
                int i233 = i232 * (-1965);
                int i234 = (i233 ^ 36408) + ((i233 & 36408) << 1);
                int i235 = asBinder;
                int i236 = (i235 ^ 53) + ((i235 & 53) << 1);
                int i237 = i236 % 128;
                b = i237;
                int i238 = i232 ^ (-38);
                if (i236 % 2 != 0) {
                    int i239 = i234 * (i238 | (i232 & (-38))) * 983;
                    i11 = ~i232;
                    int i240 = -((~(((-38) & i201) | ((-38) ^ i201))) | i11);
                    i12 = i239 * ((i240 & (-983)) + (i240 | (-983)));
                } else {
                    int i241 = -(-((i238 | (i232 & (-38))) * 983));
                    int i242 = (i234 & i241) + (i241 | i234);
                    i11 = ~i232;
                    int i243 = ~i4;
                    int i244 = ~((i243 & (-38)) | ((-38) ^ i243));
                    int i245 = -(-(((i244 & i11) | (i11 ^ i244)) * (-983)));
                    i12 = ((i242 | i245) << 1) - (i245 ^ i242);
                }
                int i246 = i237 + 123;
                asBinder = i246 % 128;
                if (i246 % 2 == 0) {
                    int i247 = ~(i11 | i201);
                    int i248 = ~i232;
                    int i249 = ~((i248 & 37) | (i248 ^ 37));
                    i13 = i12 * (983 % ((i249 & i247) | (i247 ^ i249)));
                    int longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    i15 = (longPressTimeout ^ (-18)) + ((longPressTimeout & (-18)) << 1);
                    int i250 = -i15;
                    i14 = ((i250 | 375) << 1) - (i250 ^ 375);
                    i16 = 30;
                } else {
                    int i251 = ~((i11 ^ i201) | (i11 & i201));
                    int i252 = ~i232;
                    int i253 = ~((i252 & 37) | (i252 ^ 37));
                    i13 = (i12 - (~(-(-(983 * ((i253 & i251) | (i251 ^ i253))))))) - 1;
                    int longPressTimeout2 = ViewConfiguration.getLongPressTimeout() >> 16;
                    i14 = longPressTimeout2 * 375;
                    i15 = longPressTimeout2;
                    i16 = 26;
                }
                int i254 = (i14 - (~(i16 * (-747)))) - 1;
                int i255 = ~i15;
                int i256 = ~((i255 ^ i16) | (i255 & i16));
                int i257 = ~(i201 | i15);
                int i258 = ((i257 & i256) | (i256 ^ i257)) * (-374);
                int i259 = (i254 ^ i258) + ((i258 & i254) << 1);
                int i260 = ~i16;
                int i261 = (~(i260 | i15)) * 748;
                int i262 = ((i259 | i261) << 1) - (i261 ^ i259);
                int i263 = ~((i260 & i255) | (i255 ^ i260));
                int i264 = ~i4;
                int i265 = (i263 | (~(i15 | i264))) * 374;
                Object[] objArr14 = new Object[1];
                a(i13, (i262 ^ i265) + ((i265 & i262) << 1), (char) TextUtils.getCapsMode(charSequence, 0, 0), objArr14);
                String str2 = (String) objArr14[0];
                int i266 = asBinder + 81;
                b = i266 % 128;
                int i267 = i266 % 2;
                Class<?> cls4 = Class.forName(str2);
                int i268 = 16 - (~(-TextUtils.lastIndexOf(charSequence, '0', 0)));
                char[] cArr = {'\f', 30, 13878, 13878, 27, 15, 28, 7, 13880, 13880, 4, 0, 7, '\b', 29, 1, 21, 6};
                int i269 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                int i270 = b;
                int i271 = (i270 & 119) + (i270 | 119);
                asBinder = i271 % 128;
                if (i271 % 2 == 0) {
                    int i272 = (((-419) / i269) << 5) >> (TypedValues.CycleType.TYPE_EASING >> (~((i4 ^ 79) | (i4 & 79))));
                    i18 = ~i269;
                    int i273 = (-420) >> ((i18 ^ 79) | (i18 & 79));
                    i17 = (i272 ^ i273) + ((i272 & i273) << 1);
                } else {
                    int i274 = i269 * (-419);
                    int i275 = ((((i274 | 33259) << 1) - (i274 ^ 33259)) - (~(-(-((~((i4 ^ 79) | (i4 & 79))) * TypedValues.CycleType.TYPE_EASING))))) - 1;
                    int i276 = ~i269;
                    int i277 = -(-(((i276 & 79) | (i276 ^ 79)) * (-420)));
                    i17 = ((i275 | i277) << 1) - (i275 ^ i277);
                    i18 = ~i269;
                }
                int i278 = ~(i18 | (-80));
                int i279 = ~((i264 & 79) | (i264 ^ 79));
                int i280 = -(-(TypedValues.CycleType.TYPE_EASING * ((i279 & i278) | (i278 ^ i279))));
                Object[] objArr15 = new Object[1];
                c(i268, cArr, (byte) ((i17 & i280) + (i280 | i17)), objArr15);
                if (cls4.getMethod((String) objArr15[0], new Class[0]).invoke(null, null) != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1289074282);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf(charSequence, '0', 0) + 22879);
                        i5 = 16;
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 594;
                        int offsetAfter = TextUtils.getOffsetAfter(charSequence, 0) + 17;
                        byte[] bArr3 = $$a;
                        byte b6 = bArr3[7];
                        byte b7 = bArr3[5];
                        Object[] objArr16 = new Object[1];
                        d(b6, b7, b7, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, tapTimeout, offsetAfter, -1471475267, false, (String) objArr16[0], null);
                    } else {
                        i5 = 16;
                    }
                    if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null) != 0) {
                        i6 = i4 ^ 9;
                    }
                    if (i6 != i4) {
                        int i281 = b;
                        int i282 = ((i281 | 79) << 1) - (i281 ^ 79);
                        asBinder = i282 % 128;
                        int i283 = i282 % 2;
                        i8 = i5;
                        i7 = 0;
                    } else {
                        i7 = 0;
                        i8 = 0;
                    }
                    strArr = new String[i7];
                    objArr = new Object[4];
                    objArr[i7] = new int[1];
                    objArr[1] = new int[1];
                    int i284 = b + 21;
                    asBinder = i284 % 128;
                    int i285 = i284 % 2;
                    objArr[2] = new int[]{i4};
                    zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    ((int[]) objArr[1])[0] = i6;
                    int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                    int i286 = ~startElapsedRealtime;
                    int i287 = 1556967732 + (((~((-896921357) | i286)) | 808110102) * 519) + (((~(i286 | (-89466633))) | (~(897576734 | startElapsedRealtime))) * (-519)) + (((~(startElapsedRealtime | 808110102)) | 896921356) * 519);
                    int i288 = b;
                    int i289 = (i288 & 117) + (i288 | 117);
                    asBinder = i289 % 128;
                    int i290 = i289 % 2;
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    int i291 = ((i8 * (-501)) - (~(i287 * TypedValues.PositionType.TYPE_PERCENT_WIDTH))) - 1;
                    int i292 = ~i287;
                    int i293 = ~(i292 | iTuitionPaymentFragmentspecialinlinedviewModeldefault6);
                    int i294 = ~((i8 ^ i287) | (i8 & i287));
                    int i295 = i291 + (((i293 & i294) | (i293 ^ i294)) * (-502));
                    int i296 = (~i287) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault6);
                    int i297 = -(-((~((i296 & i8) | (i296 ^ i8))) * (-502)));
                    int i298 = (i295 ^ i297) + ((i295 & i297) << 1);
                    int i299 = ~(iTuitionPaymentFragmentspecialinlinedviewModeldefault6 | (~i8));
                    int i300 = ((i299 & i292) | (i292 ^ i299)) * TypedValues.PositionType.TYPE_DRAWPATH;
                    int i301 = ((i298 | i300) << 1) - (i300 ^ i298);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    int i302 = ~i301;
                    int i303 = (i3 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | (i3 & iTuitionPaymentFragmentspecialinlinedviewModeldefault7);
                    int i304 = ~i303;
                    int i305 = (i301 * (-464)) + (i3 * (-929)) + (((i302 & i304) | (i302 ^ i304)) * (-465));
                    int i306 = ~i301;
                    int i307 = i305 + (((~((iTuitionPaymentFragmentspecialinlinedviewModeldefault7 & i306) | (i306 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7))) | i3) * 930);
                    int i308 = -(-(((i303 ^ i306) | (i306 & i303)) * 465));
                    i9 = (i307 & i308) + (i308 | i307);
                    i10 = asBinder + 3;
                    b = i10 % 128;
                    if (i10 % 2 != 0) {
                        int i309 = i9 * 13;
                        int i310 = (i309 & (~i9)) | ((~i309) & i9);
                        int i311 = i310 ^ (i310 / 83);
                        int i312 = i311 * 3;
                        ((int[]) objArr[0])[1] = (i311 | i312) & (~(i311 & i312));
                        objArr[2] = strArr;
                        return objArr;
                    }
                    int i313 = i9 << 13;
                    int i314 = (i313 | i9) & (~(i9 & i313));
                    int i315 = i314 ^ (i314 >>> 17);
                    int i316 = i315 << 5;
                    ((int[]) objArr[0])[0] = (i315 | i316) & (~(i315 & i316));
                    objArr[3] = strArr;
                    return objArr;
                }
                i5 = 16;
            } catch (Exception unused2) {
            }
            i6 = i4;
            if (i6 != i4) {
                int i2810 = b;
                int i2811 = ((i2810 | 79) << 1) - (i2810 ^ 79);
                asBinder = i2811 % 128;
                int i2812 = i2811 % 2;
                i8 = i5;
                i7 = 0;
            } else {
                i7 = 0;
                i8 = 0;
            }
            strArr = new String[i7];
            objArr = new Object[4];
            objArr[i7] = new int[1];
            objArr[1] = new int[1];
            int i2813 = b + 21;
            asBinder = i2813 % 128;
            int i2814 = i2813 % 2;
            objArr[2] = new int[]{i4};
            zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            ((int[]) objArr[1])[0] = i6;
            int startElapsedRealtime2 = (int) Process.getStartElapsedRealtime();
            int i2815 = ~startElapsedRealtime2;
            int i2816 = 1556967732 + (((~((-896921357) | i2815)) | 808110102) * 519) + (((~(i2815 | (-89466633))) | (~(897576734 | startElapsedRealtime2))) * (-519)) + (((~(startElapsedRealtime2 | 808110102)) | 896921356) * 519);
            int i2817 = b;
            int i2818 = (i2817 & 117) + (i2817 | 117);
            asBinder = i2818 % 128;
            int i2910 = i2818 % 2;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            int i2911 = ((i8 * (-501)) - (~(i2816 * TypedValues.PositionType.TYPE_PERCENT_WIDTH))) - 1;
            int i2912 = ~i2816;
            int i2913 = ~(i2912 | iTuitionPaymentFragmentspecialinlinedviewModeldefault8);
            int i2914 = ~((i8 ^ i2816) | (i8 & i2816));
            int i2915 = i2911 + (((i2913 & i2914) | (i2913 ^ i2914)) * (-502));
            int i2916 = (~i2816) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault8);
            int i2917 = -(-((~((i2916 & i8) | (i2916 ^ i8))) * (-502)));
            int i2918 = (i2915 ^ i2917) + ((i2915 & i2917) << 1);
            int i2919 = ~(iTuitionPaymentFragmentspecialinlinedviewModeldefault8 | (~i8));
            int i3010 = ((i2919 & i2912) | (i2912 ^ i2919)) * TypedValues.PositionType.TYPE_DRAWPATH;
            int i3011 = ((i2918 | i3010) << 1) - (i3010 ^ i2918);
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = zznf.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            int i3012 = ~i3011;
            int i3013 = (i3 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9) | (i3 & iTuitionPaymentFragmentspecialinlinedviewModeldefault9);
            int i3014 = ~i3013;
            int i3015 = (i3011 * (-464)) + (i3 * (-929)) + (((i3012 & i3014) | (i3012 ^ i3014)) * (-465));
            int i3016 = ~i3011;
            int i3017 = i3015 + (((~((iTuitionPaymentFragmentspecialinlinedviewModeldefault9 & i3016) | (i3016 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9))) | i3) * 930);
            int i3018 = -(-(((i3013 ^ i3016) | (i3016 & i3013)) * 465));
            i9 = (i3017 & i3018) + (i3018 | i3017);
            i10 = asBinder + 3;
            b = i10 % 128;
            if (i10 % 2 != 0) {
                int i3019 = i9 * 13;
                int i317 = (i3019 & (~i9)) | ((~i3019) & i9);
                int i318 = i317 ^ (i317 / 83);
                int i319 = i318 * 3;
                ((int[]) objArr[0])[1] = (i318 | i319) & (~(i318 & i319));
                objArr[2] = strArr;
                return objArr;
            }
            int i3110 = i9 << 13;
            int i3111 = (i3110 | i9) & (~(i9 & i3110));
            int i3112 = i3111 ^ (i3111 >>> 17);
            int i3113 = i3112 << 5;
            ((int[]) objArr[0])[0] = (i3112 | i3113) & (~(i3112 & i3113));
            objArr[3] = strArr;
            return objArr;
        } catch (Throwable th5) {
            Throwable cause3 = th5.getCause();
            if (cause3 != null) {
                throw cause3;
            }
            throw th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(short r6, int r7, int r8) {
        /*
            int r6 = 116 - r6
            int r8 = r8 * 4
            int r8 = 1 - r8
            int r7 = r7 * 2
            int r7 = r7 + 4
            byte[] r0 = com.google.android.gms.auth.api.signin.internal.zbv.$$c
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r3 = r0[r7]
        L24:
            int r3 = -r3
            int r6 = r6 + r3
            int r7 = r7 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.internal.zbv.$$e(short, int, int):java.lang.String");
    }
}
