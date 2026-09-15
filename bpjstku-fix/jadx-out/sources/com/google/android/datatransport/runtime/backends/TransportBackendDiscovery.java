package com.google.android.datatransport.runtime.backends;

import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.IBinder;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bpjstku.R;
import com.datadog.android.rum.internal.domain.scope.RumViewScope$onStopView$1;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.initSession;
import defpackage.onScroll;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public class TransportBackendDiscovery extends Service {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$d;
    private static final int $$e;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {83, ByteCompanionObject.MIN_VALUE, -37, -48};
    private static final int $$f = 232;
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 + 4
            byte[] r0 = com.google.android.datatransport.runtime.backends.TransportBackendDiscovery.$$a
            int r9 = 53 - r9
            int r8 = 103 - r8
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L11
            r8 = r7
            r3 = r9
            r4 = r2
            goto L27
        L11:
            r3 = r2
        L12:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L21
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L21:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L27:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-11)
            int r8 = r8 + 1
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.backends.TransportBackendDiscovery.a(short, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.android.datatransport.runtime.backends.TransportBackendDiscovery.$$d
            int r8 = r8 + 84
            int r1 = 99 - r6
            int r7 = 491 - r7
            byte[] r1 = new byte[r1]
            int r6 = 98 - r6
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r7 = r7 + 1
            int r4 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2a:
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-1)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.backends.TransportBackendDiscovery.d(int, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:34:0x016d  */
    /* JADX WARN: Code duplicated, block: B:35:0x016e  */
    private static void c(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (true) {
            i4 = 29209604;
            if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i2) {
                break;
            }
            int i6 = $10 + 51;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i8 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.getOffsetAfter("", 0) + 3291, 31 - Color.blue(0), 1199271174, false, $$g(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) View.combineMeasuredStates(0, 0), (ViewConfiguration.getEdgeSlop() >> 16) + 651, AndroidCharacter.getMirror('0') - 4, -450685997, false, $$g(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
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
        if (i3 > 0) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            int i9 = $11 + 107;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr4 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i11 = $11 + 87;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) % 1];
                    Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) Gravity.getAbsoluteGravity(0, 0), 651 - (Process.myTid() >> 22), 44 - TextUtils.getCapsMode("", 0, 0), -450685997, false, $$g(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } else {
                    cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                    try {
                        Object[] objArr5 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b7 = (byte) 0;
                            byte b8 = (byte) (b7 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 652, KeyEvent.keyCodeFromString("") + 44, -450685997, false, $$g(b7, b8, (byte) (b8 - 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i4 = 29209604;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    @Override // android.app.Service, android.content.ContextWrapper
    protected void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 29944);
            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 1755;
            int maximumFlingVelocity = 23 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            byte[] bArr = $$a;
            short s = bArr[7];
            byte b = bArr[10];
            Object[] objArr2 = new Object[1];
            a(s, b, (byte) (b - 4), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cKeyCodeFromString, iResolveSizeAndState, maximumFlingVelocity, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29944);
                int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1755;
                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 23;
                short s2 = (short) ($$b >>> 1);
                byte[] bArr2 = $$a;
                Object[] objArr3 = new Object[1];
                a(s2, bArr2[10], bArr2[7], objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollBarFadeDuration, keyRepeatDelay, packedPositionGroup, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 736318852;
            int i4 = ((((-120790168) + (((~((-628001483) | length)) | 623673930) * 345)) + (((~((-628001483) | (~length))) | (-1039072987)) * 345)) + ((~(length | (-623673931))) * 345)) - 2095732126;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0] = i6 ^ (i6 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            c(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) + 45, (ViewConfiguration.getEdgeSlop() >> 16) + 16, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_instruction_tablet_step5).substring(28, 29).codePointAt(0) - 39, new char[]{65535, '\n', 65484, 65535, 20, 65535, '\b', 11, 3, 18, 17, 23, 65521, 65484, 5, '\f'}, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            c(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 136, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 82, 16 - View.getDefaultSize(0, 0), new char[]{3, 65534, 65535, '\b', 14, 3, 14, 19, 65506, 65531, '\r', 2, 65501, '\t', 65534, 65535}, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {-1594756574};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42049 - ((Process.getThreadPriority(0) + 20) >> 6)), 1726 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = RumViewScope$onStopView$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), -2095732126);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 29945);
                    int maximumFlingVelocity2 = 1755 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int iResolveOpacity = 23 - Drawable.resolveOpacity(0, 0);
                    short s3 = (short) ($$b >>> 1);
                    byte[] bArr3 = $$a;
                    Object[] objArr8 = new Object[1];
                    a(s3, bArr3[10], bArr3[7], objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, maximumFlingVelocity2, iResolveOpacity, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da);
                try {
                    Object[] objArr9 = new Object[1];
                    c(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 108, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_snap_transaction_details).substring(1, 2).codePointAt(0) - 75, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_screen_title_text).substring(0, 25).length() - 13, new char[]{65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16}, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    c(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_message_status_code_500).substring(13, 15).length() + 146, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_bill_transfer).substring(0, 12).codePointAt(9) - 90, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.formatted_installment_month).substring(16, 17).length() + 5, new char[]{65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5, 65530, 65534, 65515, 65533}, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cAxisFromString = (char) (29943 - MotionEvent.axisFromString(""));
                        int iResolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0) + 1755;
                        int i7 = 24 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        byte[] bArr4 = $$a;
                        Object[] objArr11 = new Object[1];
                        a((short) 89, bArr4[10], bArr4[7], objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cAxisFromString, iResolveSizeAndState2, i7, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cIndexOf2 = (char) (TextUtils.indexOf("", "") + 29944);
                        int bitsPerPixel = 1754 - ImageFormat.getBitsPerPixel(0);
                        int edgeSlop = 23 - (ViewConfiguration.getEdgeSlop() >> 16);
                        byte[] bArr5 = $$a;
                        short s4 = bArr5[7];
                        byte b2 = bArr5[10];
                        Object[] objArr12 = new Object[1];
                        a(s4, b2, (byte) (b2 - 4), objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf2, bitsPerPixel, edgeSlop, 986134021, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
        int i8 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0];
        int i9 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0];
        if (i9 == i8) {
            int i10 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
            Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i11 = i10 + ((((~((-742392106) | iIdentityHashCode)) | (-1072691184)) * TypedValues.PositionType.TYPE_TRANSITION_EASING) - 1811283540) + ((~((~iIdentityHashCode) | (-742392106))) * TypedValues.PositionType.TYPE_TRANSITION_EASING);
            int i12 = (i11 << 13) ^ i11;
            int i13 = i12 ^ (i12 >>> 17);
            ((int[]) objArr13[3])[0] = i13 ^ (i13 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4];
            if (strArr != null) {
                int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
                int i15 = 2;
                int i16 = i14 % 2;
                int i17 = 0;
                while (i17 < strArr.length) {
                    int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 % 128;
                    if (i18 % i15 != 0) {
                        arrayList.add(strArr[i17]);
                        i17 += 33;
                    } else {
                        arrayList.add(strArr[i17]);
                        i17++;
                    }
                    i15 = 2;
                }
            }
            Toast.makeText((Context) null, i9 / (((i9 - 1) * i9) % 2), 0).show();
            int i19 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 123961736;
            int i20 = ~(613341958 | iCodePointAt);
            int i21 = i19 + (-723777734) + (((-938401743) | i20) * (-814)) + ((i20 | (~((~iCodePointAt) | 400739532)) | 75679748) * 407) + (((~(iCodePointAt | (-400739533))) | (~((-613341959) | iCodePointAt)) | 75679748) * 407);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr14[3])[0] = i23 ^ (i23 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char edgeSlop2 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
            int i24 = 1031 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int edgeSlop3 = (ViewConfiguration.getEdgeSlop() >> 16) + 15;
            byte[] bArr6 = $$a;
            Object[] objArr15 = new Object[1];
            a((short) 141, bArr6[10], bArr6[7], objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(edgeSlop2, i24, edgeSlop3, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        c(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.currency_invalid).substring(15, 16).codePointAt(0) + 112, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, 12 - TextUtils.indexOf("", "", 0), new char[]{65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16}, objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        c(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tesla_ev_connector_type).substring(1, 5).length() + 144, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bank_permata_transfer).substring(0, 12).codePointAt(3) - 92, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 30, new char[]{65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5, 65530, 65534, 65515, 65533}, objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cMyPid = (char) (Process.myPid() >> 22);
            int mode = 1031 - View.MeasureSpec.getMode(0);
            int iIndexOf = TextUtils.indexOf("", "", 0) + 15;
            short s5 = (short) ($$b >>> 1);
            byte[] bArr7 = $$a;
            Object[] objArr18 = new Object[1];
            a(s5, bArr7[10], bArr7[7], objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cMyPid, mode, iIndexOf, 1344079056, false, (String) objArr18[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                int edgeSlop4 = (ViewConfiguration.getEdgeSlop() >> 16) + 1031;
                int iLastIndexOf = 14 - TextUtils.lastIndexOf("", '0', 0, 0);
                Object[] objArr19 = new Object[1];
                a((short) 193, (byte) ($$a[19] - 1), (byte) 52, objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cMakeMeasureSpec, edgeSlop4, iLastIndexOf, 632103528, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i25 = ((int[]) objArr20[3])[0];
            int i26 = ((int[]) objArr20[1])[0];
            String[] strArr2 = (String[]) objArr20[0];
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i27 = ~iMaxMemory;
            int i28 = (((10650882 + ((iMaxMemory | 357002306) * (-859))) + (((~(iMaxMemory | (-289893379))) | (~(357002306 | i27))) * 859)) + (((~(112722136 | i27)) | (-402615515)) * 859)) - 1110727417;
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr[2])[0] = i30 ^ (i30 << 5);
        } else {
            Object[] objArr21 = new Object[1];
            c(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 132, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 93, KeyEvent.normalizeMetaState(0) + 7, new char[]{65535, '\n', 65484, 65535, 20, 65535, '\b', 11, 3, 18, 17, 23, 65521, 65484, 5, '\f'}, objArr21);
            Class<?> cls4 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            c(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 111, TextUtils.indexOf("", "", 0) + 16, KeyEvent.keyCodeFromString("") + 16, new char[]{3, 65534, 65535, '\b', 14, 3, 14, 19, 65506, 65531, '\r', 2, 65501, '\t', 65534, 65535}, objArr22);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr23 = {-1594756574};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 46038), (Process.myTid() >> 22) + 1134, 'B' - AndroidCharacter.getMirror('0'), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr24 = {Integer.valueOf(iIntValue2), 0, -1110727417, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr23), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cIndexOf3 = (char) TextUtils.indexOf("", "", 0);
                int iIndexOf2 = 1030 - TextUtils.indexOf((CharSequence) "", '0');
                int iLastIndexOf2 = TextUtils.lastIndexOf("", '0') + 16;
                byte[] bArr8 = $$a;
                Object[] objArr25 = new Object[1];
                a((short) 141, bArr8[10], bArr8[7], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cIndexOf3, iIndexOf2, iLastIndexOf2, 1298546779, false, (String) objArr25[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - Color.blue(0)), View.resolveSize(0, 0) + 1117, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 17), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr24);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                int iLastIndexOf3 = 1030 - TextUtils.lastIndexOf("", '0', 0, 0);
                int i31 = 16 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                Object[] objArr26 = new Object[1];
                a((short) 193, (byte) ($$a[19] - 1), (byte) 52, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c, iLastIndexOf3, i31, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr27 = new Object[1];
                c(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 108, View.MeasureSpec.makeMeasureSpec(0, 0) + 22, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1, new char[]{65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16}, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                c(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.kioson_instruction_step9).substring(20, 21).length() + 147, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_error_image_signing_failed).substring(0, 24).codePointAt(10) - 100, 6 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), new char[]{65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5, 65530, 65534, 65515, 65533}, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                    int iRed = Color.red(0) + 1031;
                    int maximumFlingVelocity3 = 15 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    short s6 = (short) ($$b >>> 1);
                    byte[] bArr9 = $$a;
                    Object[] objArr29 = new Object[1];
                    a(s6, bArr9[10], bArr9[7], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(tapTimeout, iRed, maximumFlingVelocity3, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                    int iIndexOf3 = 1030 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    int i32 = 15 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    byte[] bArr10 = $$a;
                    Object[] objArr30 = new Object[1];
                    a((short) 141, bArr10[10], bArr10[7], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(scrollBarSize, iIndexOf3, i32, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i33 = ((int[]) objArr[1])[0];
        int i34 = ((int[]) objArr[3])[0];
        if (i34 == i33) {
            Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i35 = ((int[]) objArr[2])[0];
            int i36 = ((int[]) objArr[3])[0];
            int i37 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i38 = 462464089 + (((~((-433095991) | elapsedCpuTime)) | 277906482 | (~(188815820 | elapsedCpuTime))) * (-880));
            int i39 = (~((-433095991) | (~elapsedCpuTime))) | (-188815821);
            int i40 = ~(elapsedCpuTime | 433095990);
            int i41 = i35 + i38 + ((i39 | i40) * (-880)) + (i40 * 880);
            int i42 = (i41 << 13) ^ i41;
            int i43 = i42 ^ (i42 >>> 17);
            ((int[]) objArr31[2])[0] = i43 ^ (i43 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            for (String str : strArr4) {
                arrayList2.add(str);
            }
        }
        int[] iArr = new int[i34];
        int i44 = i34 - 1;
        iArr[i44] = 1;
        Toast.makeText((Context) null, iArr[((i34 * i44) % 2) - 1], 1).show();
        Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i45 = ((int[]) objArr[2])[0];
        int i46 = ((int[]) objArr[3])[0];
        int i47 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int i48 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) + 1147077742);
        int i49 = i45 + 1831106525 + ((~((-134349987) | i48)) * 52) + (((~(395966476 | i48)) | (~(151686306 | i48)) | (-530316463)) * (-52)) + (((~(i48 | (-395966477))) | 17336320) * 52);
        int i50 = i49 ^ (i49 << 13);
        int i51 = i50 ^ (i50 >>> 17);
        ((int[]) objArr32[2])[0] = i51 ^ (i51 << 5);
    }

    /* JADX WARN: Code duplicated, block: B:127:0x0e0b  */
    /* JADX WARN: Code duplicated, block: B:128:0x0e0d  */
    /* JADX WARN: Code duplicated, block: B:251:0x1972  */
    @Override // android.app.Service
    public void onCreate() throws Throwable {
        Object[] objArr;
        String str;
        String str2;
        Object[] objArr2;
        String str3;
        char c;
        String str4;
        Object[] objArr3;
        Object[] objArr4;
        Object[] objArr5;
        Object[] objArr6;
        String str5;
        int i;
        String str6;
        Object[] objArr7;
        char c2;
        Object[] objArr8;
        Object[] objArr9;
        Object[] objArr10;
        Object[] objArr11;
        int i2 = 2 % 2;
        String str7 = "currentApplication";
        Object[] objArr12 = new Object[1];
        c(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 133, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 24, View.combineMeasuredStates(0, 0) + 12, new char[]{65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16}, objArr12);
        String str8 = (String) objArr12[0];
        Object[] objArr13 = new Object[1];
        c(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 112, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 83, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.pay_with_mandiri_point).substring(1, 3).codePointAt(1) - 115, new char[]{65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5, 65530, 65534, 65515, 65533}, objArr13);
        String str9 = (String) objArr13[0];
        Object[] objArr14 = new Object[1];
        c(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 107, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 15, 7 - KeyEvent.getDeadChar(0, 0), new char[]{65535, '\n', 65484, 65535, 20, 65535, '\b', 11, 3, 18, 17, 23, 65521, 65484, 5, '\f'}, objArr14);
        String str10 = (String) objArr14[0];
        Object[] objArr15 = new Object[1];
        c(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_credit_card_2).substring(1, 3).codePointAt(0) + 50, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_click_pay_instruction_step7).substring(0, 3).length() + 13, new char[]{3, 65534, 65535, '\b', 14, 3, 14, 19, 65506, 65531, '\r', 2, 65501, '\t', 65534, 65535}, objArr15);
        String str11 = (String) objArr15[0];
        Object[] objArr16 = new Object[1];
        c(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.minutes).substring(0, 1).codePointAt(0) + 35, KeyEvent.getDeadChar(0, 0) + 26, 5 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), new char[]{'\f', 15, 1, 11, 65534, 1, 65534, 2, 15, 5, 65521, 22, 17, 6, 19, 6, 17, 0, 65502, 65483, '\r', '\r', 65534, 65483, 1, 6}, objArr16);
        String str12 = (String) objArr16[0];
        Object[] objArr17 = new Object[1];
        c(true, (ViewConfiguration.getWindowTouchSlop() >> 8) + 151, ImageFormat.getBitsPerPixel(0) + 19, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.redeem_100_point).substring(0, 13).codePointAt(12) - 86, new char[]{2, 6, 6, 65495, '\n', 4, 65531, '\b', '\b', 11, 65529, 4, 5, 65535, '\n', 65527, 65529, 65535}, objArr17);
        String str13 = (String) objArr17[0];
        int i3 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) + 1923253138;
        if (i3 != (-1541134816) + (((-19290817) | iCodePointAt) * (-627)) + (((~(1495726793 | iCodePointAt)) | 665739250) * (-627)) + (((~(iCodePointAt | 665739250)) | (~((~iCodePointAt) | (-1495726794)))) * 627)) {
            throw null;
        }
        int i4 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int i5 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
        if (i4 != (-2049746116) + (((~(i5 | 46772205)) | 1762672656) * (-160)) + (((~(1762683536 | i5)) | 46772205) * 160)) {
            int[] iArr = new int[1951321418];
            iArr[1951321417] = 1;
            int i6 = 1500040218 % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cCombineMeasuredStates = (char) (43042 - View.combineMeasuredStates(0, 0));
            int iAlpha = 3111 - Color.alpha(0);
            int i7 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 21;
            byte[] bArr = $$a;
            Object[] objArr18 = new Object[1];
            a((short) 141, bArr[10], bArr[7], objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cCombineMeasuredStates, iAlpha, i7, -1272852037, false, (String) objArr18[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char edgeSlop = (char) (43042 - (ViewConfiguration.getEdgeSlop() >> 16));
                int i8 = 3112 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 23;
                byte[] bArr2 = $$a;
                short s = bArr2[7];
                byte b = bArr2[10];
                Object[] objArr19 = new Object[1];
                a(s, b, (byte) (b - 4), objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(edgeSlop, i8, iLastIndexOf, 154975793, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            int i9 = ((int[]) objArr20[2])[0];
            int i10 = ((int[]) objArr20[1])[0];
            String[] strArr = (String[]) objArr20[3];
            int[] iArr2 = {i10};
            int iIdentityHashCode = System.identityHashCode(this);
            int i11 = (((1879698000 + (((~((-693824776) | iIdentityHashCode)) | 675334147) * 345)) + (((~((-693824776) | (~iIdentityHashCode))) | 335872536) * 345)) + ((~(iIdentityHashCode | (-675334148))) * 345)) - 880512357;
            int i12 = (i11 << 13) ^ i11;
            int i13 = i12 ^ (i12 >>> 17);
            ((int[]) objArr[0])[0] = i13 ^ (i13 << 5);
            objArr = new Object[]{new int[1], iArr2, new int[]{i9}, strArr};
            str10 = str10;
            str11 = str11;
        } else {
            str13 = str13;
            try {
                Object[] objArr21 = {null, Integer.valueOf(((Integer) Class.forName(str10).getMethod(str11, Object.class).invoke(null, this)).intValue()), 0, -880512357};
                byte[] bArr3 = $$d;
                Object[] objArr22 = new Object[1];
                d((byte) (bArr3[152] - 1), (short) 488, bArr3[29], objArr22);
                Class<?> cls = Class.forName((String) objArr22[0]);
                Object[] objArr23 = new Object[1];
                d(bArr3[51], (short) 426, bArr3[15], objArr23);
                Object[] objArr24 = (Object[]) cls.getMethod((String) objArr23[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr21);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char c3 = (char) (43042 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                    int packedPositionGroup = 3111 - ExpandableListView.getPackedPositionGroup(0L);
                    int iAlpha2 = 22 - Color.alpha(0);
                    byte[] bArr4 = $$a;
                    short s2 = bArr4[7];
                    byte b2 = bArr4[10];
                    Object[] objArr25 = new Object[1];
                    a(s2, b2, (byte) (b2 - 4), objArr25);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c3, packedPositionGroup, iAlpha2, 154975793, false, (String) objArr25[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArr24);
                try {
                    long jLongValue = ((Long) Class.forName(str8).getDeclaredMethod(str9, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char jumpTapTimeout = (char) (43042 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3111;
                        int iArgb = Color.argb(0, 0, 0, 0) + 22;
                        short s3 = (short) ($$b >>> 1);
                        byte[] bArr5 = $$a;
                        Object[] objArr26 = new Object[1];
                        a(s3, bArr5[10], bArr5[7], objArr26);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(jumpTapTimeout, scrollBarFadeDuration, iArgb, -1269618118, false, (String) objArr26[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cCombineMeasuredStates2 = (char) (View.combineMeasuredStates(0, 0) + 43042);
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 3111;
                        int iRgb = Color.rgb(0, 0, 0) + 16777238;
                        byte[] bArr6 = $$a;
                        Object[] objArr27 = new Object[1];
                        a((short) 141, bArr6[10], bArr6[7], objArr27);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cCombineMeasuredStates2, scrollDefaultDelay, iRgb, -1272852037, false, (String) objArr27[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf2);
                    objArr = objArr24;
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
        int i14 = ((int[]) objArr[1])[0];
        int i15 = ((int[]) objArr[2])[0];
        if (i15 == i14) {
            int i16 = ((int[]) objArr[0])[0];
            int i17 = ((int[]) objArr[2])[0];
            int i18 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[3];
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i19 = ~iUptimeMillis;
            int i20 = i16 + 62551714 + (((-134481185) | iUptimeMillis) * (-676)) + (((~(937073153 | i19)) | 134481184) * 676) + (((~(iUptimeMillis | 1071554337)) | (~(i19 | (-767958306))) | 633477121) * 676);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr[0])[0] = i22 ^ (i22 << 5);
            Object[] objArr28 = {new int[1], new int[]{i18}, new int[]{i17}, strArr2};
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                for (String str14 : strArr3) {
                    arrayList.add(str14);
                }
            }
            int[] iArr3 = new int[i15];
            int i23 = i15 - 1;
            iArr3[i23] = 1;
            Toast.makeText((Context) null, iArr3[((i15 * i23) % 2) - 1], 1).show();
            int i24 = ((int[]) objArr[0])[0];
            int i25 = ((int[]) objArr[2])[0];
            int i26 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[3];
            int[] iArr4 = {i25};
            int i27 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation;
            int i28 = ~i27;
            int i29 = i24 + (-1339827262) + (((~(i28 | 1052875322)) | (~((-652156137) | i28)) | 1967296) * 464) + (((-650188841) | i27) * (-464)) + (((~(i27 | 1052875322)) | 1967296) * 464);
            int i30 = (i29 << 13) ^ i29;
            int i31 = i30 ^ (i30 >>> 17);
            ((int[]) objArr[0])[0] = i31 ^ (i31 << 5);
            Object[] objArr29 = {new int[1], new int[]{i26}, iArr4, strArr4};
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char doubleTapTimeout = (char) (37567 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 625;
            int i32 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 14;
            Object[] objArr30 = new Object[1];
            a((short) 193, (byte) ($$a[19] - 1), (byte) 52, objArr30);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(doubleTapTimeout, tapTimeout, i32, -477065106, false, (String) objArr30[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).getLong(null);
        long jLongValue2 = ((Long) Class.forName(str8).getDeclaredMethod(str9, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char maximumFlingVelocity = (char) (37567 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
            int i33 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 624;
            int iNormalizeMetaState = 14 - KeyEvent.normalizeMetaState(0);
            byte[] bArr7 = $$a;
            Object[] objArr31 = new Object[1];
            a((short) 141, bArr7[10], bArr7[7], objArr31);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(maximumFlingVelocity, i33, iNormalizeMetaState, -976899241, false, (String) objArr31[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char c4 = (char) (37568 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 625;
                int size = 14 - View.MeasureSpec.getSize(0);
                short s4 = (short) ($$b >>> 1);
                byte[] bArr8 = $$a;
                Object[] objArr32 = new Object[1];
                a(s4, bArr8[10], bArr8[7], objArr32);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c4, offsetAfter, size, -973632554, false, (String) objArr32[0], null);
            }
            Object[] objArr33 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).get(null);
            int i34 = ((int[]) objArr33[2])[0];
            int i35 = ((int[]) objArr33[0])[0];
            String[] strArr5 = (String[]) objArr33[3];
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 2049713610;
            int i36 = (-1448728672) + (((-144868039) | length) * (-627)) + (((~((-856778034) | length)) | 966960087) * (-627)) + (((~(length | 966960087)) | (~((~length) | 856778033))) * 627) + 2082051901;
            int i37 = (i36 << 13) ^ i36;
            int i38 = i37 ^ (i37 >>> 17);
            ((int[]) objArr[1])[0] = i38 ^ (i38 << 5);
            Object[] objArr34 = {new int[]{i35}, new int[1], new int[]{i34}, strArr5};
            str8 = str8;
            objArr2 = objArr34;
            c = 0;
            str = str13;
            str2 = str11;
            str3 = str9;
        } else {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                str = str13;
                baseContext = (Context) Class.forName(str12).getMethod(str, new Class[0]).invoke(null, null);
            } else {
                str = str13;
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            str2 = str11;
            int iIntValue = ((Integer) Class.forName(str10).getMethod(str2, Object.class).invoke(null, this)).intValue();
            Object[] objArr35 = new Object[1];
            c(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) + 3, 64 - (Process.myPid() >> 22), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_network_error).substring(0, 13).length() - 11, new char[]{65513, 25, 65513, 28, 29, 24, 24, 25, 29, 65517, 65520, 29, 29, 65516, 28, 28, 24, 65516, 65518, 65512, 65517, 28, 65516, 65518, 65518, 25, 28, 65518, 25, 65512, 65514, 27, 65515, 65520, 65520, 24, 65513, 65520, 65512, 65512, 65519, 24, 29, 65516, 65515, 65519, 29, 28, 65514, 65516, 24, 65511, 65519, 24, 65515, 65519, 65513, 25, 65520, 65519, 65515, 25, 25, 29}, objArr35);
            String str15 = (String) objArr35[0];
            Object[] objArr36 = new Object[1];
            c(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 103, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 63, 64 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), new char[]{30, 28, 31, 65521, 65515, 65520, 29, 65522, ' ', '!', 65515, 29, ' ', 65517, '!', 65519, 65517, 65518, 65521, 65518, 65520, 65522, '!', 65521, 29, 65519, 29, 65524, 65518, 65524, 65524, 65523, 65524, 29, 65520, 65516, 65519, ' ', 28, 65517, 65517, ' ', '!', 65521, 65522, 65519, 65518, 65518, 65524, 30, 65524, 65524, 29, 65519, 65518, 65517, 30, '!', 65517, 65519, 28, 65515, 65521, '!'}, objArr36);
            Object[] objArr37 = {baseContext, new String[]{str15, (String) objArr36[0]}, Integer.valueOf(iIntValue), 17, 2082051901};
            byte[] bArr9 = $$d;
            Object[] objArr38 = new Object[1];
            d((byte) (-bArr9[346]), (short) 374, bArr9[0], objArr38);
            Class<?> cls2 = Class.forName((String) objArr38[0]);
            Object[] objArr39 = new Object[1];
            d((byte) 98, (short) 334, bArr9[55], objArr39);
            objArr2 = (Object[]) cls2.getMethod((String) objArr39[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr37);
            int i39 = ((int[]) objArr2[0])[0];
            int i40 = ((int[]) objArr2[2])[0];
            if (baseContext != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                    char c5 = (char) (37568 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                    int doubleTapTimeout2 = 625 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int mode = 14 - View.MeasureSpec.getMode(0);
                    short s5 = (short) ($$b >>> 1);
                    byte[] bArr10 = $$a;
                    Object[] objArr40 = new Object[1];
                    a(s5, bArr10[10], bArr10[7], objArr40);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c5, doubleTapTimeout2, mode, -973632554, false, (String) objArr40[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).set(null, objArr2);
                try {
                    str3 = str9;
                    long jLongValue3 = ((Long) Class.forName(str8).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf3 = Long.valueOf(jLongValue3);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                        char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 37567);
                        int iIndexOf = 625 - TextUtils.indexOf("", "", 0, 0);
                        int defaultSize = View.getDefaultSize(0, 0) + 14;
                        byte[] bArr11 = $$a;
                        Object[] objArr41 = new Object[1];
                        a((short) 141, bArr11[10], bArr11[7], objArr41);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(offsetBefore, iIndexOf, defaultSize, -976899241, false, (String) objArr41[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, lValueOf3);
                    Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                        char c6 = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 37567);
                        int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0) + 625;
                        int i41 = 14 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        Object[] objArr42 = new Object[1];
                        a((short) 193, (byte) ($$a[19] - 1), (byte) 52, objArr42);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(c6, iNormalizeMetaState2, i41, -477065106, false, (String) objArr42[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, lValueOf4);
                } catch (Exception unused2) {
                    throw new RuntimeException();
                }
            } else {
                str8 = str8;
                objArr2 = objArr2;
                str3 = str9;
            }
            c = 0;
        }
        int i42 = ((int[]) objArr2[c])[c];
        int i43 = ((int[]) objArr2[2])[c];
        if (i43 == i42) {
            Object[] objArr43 = new Object[4];
            int[] iArr5 = new int[1];
            objArr43[c] = iArr5;
            objArr43[1] = new int[1];
            int[] iArr6 = new int[1];
            objArr43[2] = iArr6;
            int i44 = ((int[]) objArr2[1])[c];
            int i45 = ((int[]) objArr2[2])[c];
            int i46 = ((int[]) objArr2[c])[c];
            String[] strArr6 = (String[]) objArr2[3];
            iArr6[c] = i45;
            iArr5[c] = i46;
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i47 = ~elapsedCpuTime;
            int i48 = i44 + (-710700384) + (((~(elapsedCpuTime | 1530536833)) | (~((-288891266) | i47)) | (-1534846856)) * (-68)) + ((~((-4310023) | i47)) * (-68)) + (((~((-1530536834) | i47)) | (-293201288)) * 68);
            int i49 = (i48 << 13) ^ i48;
            int i50 = i49 ^ (i49 >>> 17);
            ((int[]) objArr43[1])[0] = i50 ^ (i50 << 5);
            objArr43[3] = strArr6;
        } else {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr7 = (String[]) objArr2[3];
            if (strArr7 != null) {
                int i51 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i51 % 128;
                int i52 = 2;
                int i53 = i51 % 2;
                int i54 = 0;
                while (i54 < strArr7.length) {
                    int i55 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i55 % 128;
                    if (i55 % i52 != 0) {
                        arrayList2.add(strArr7[i54]);
                        i54 += 116;
                    } else {
                        arrayList2.add(strArr7[i54]);
                        i54++;
                    }
                    i52 = 2;
                }
            }
            Toast.makeText((Context) null, i43 / (((i43 - 1) * i43) % 2), 0).show();
            int i56 = ((int[]) objArr2[1])[0];
            int i57 = ((int[]) objArr2[2])[0];
            int i58 = ((int[]) objArr2[0])[0];
            String[] strArr8 = (String[]) objArr2[3];
            int[] iArr7 = {i57};
            int i59 = ~Process.myUid();
            int i60 = i56 + 50413288 + (((~(1047726072 | i59)) | 776012048) * (-828)) + ((i59 | 1047726072) * (-828)) + 66205348;
            int i61 = i60 ^ (i60 << 13);
            int i62 = i61 ^ (i61 >>> 17);
            ((int[]) objArr[1])[0] = i62 ^ (i62 << 5);
            Object[] objArr44 = {new int[]{i58}, new int[1], iArr7, strArr8};
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 31534);
            int edgeSlop2 = 921 - (ViewConfiguration.getEdgeSlop() >> 16);
            int i63 = 29 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            Object[] objArr45 = new Object[1];
            a((short) 193, (byte) ($$a[19] - 1), (byte) 52, objArr45);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cIndexOf, edgeSlop2, i63, -1048449946, false, (String) objArr45[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char scrollDefaultDelay2 = (char) (31533 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                int offsetBefore2 = 921 - TextUtils.getOffsetBefore("", 0);
                int mirror = 'L' - AndroidCharacter.getMirror('0');
                byte[] bArr12 = $$a;
                short s6 = bArr12[7];
                byte b3 = bArr12[10];
                Object[] objArr46 = new Object[1];
                a(s6, b3, (byte) (b3 - 4), objArr46);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(scrollDefaultDelay2, offsetBefore2, mirror, -1142834547, false, (String) objArr46[0], null);
            }
            Object[] objArr47 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).get(null);
            objArr3 = new Object[]{new int[1], new int[]{((int[]) objArr47[1])[0]}, (Object[]) objArr47[2], new int[]{((int[]) objArr47[3])[0]}, (String[]) objArr47[4]};
            int i64 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode | 972400642);
            int i65 = ((373100187 | i64) * (-658)) + 302834623 + ((i64 | 101189273) * 658) + 1594083384;
            int i66 = (i65 << 13) ^ i65;
            int i67 = i66 ^ (i66 >>> 17);
            ((int[]) objArr3[0])[0] = i67 ^ (i67 << 5);
            str7 = "currentApplication";
            str4 = str3;
        } else {
            Context baseContext2 = getBaseContext();
            if (baseContext2 == null) {
                baseContext2 = (Context) Class.forName(str12).getMethod(str, new Class[0]).invoke(null, null);
            }
            if (baseContext2 != null) {
                if (baseContext2 instanceof ContextWrapper) {
                    int i68 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i68 % 128;
                    if (i68 % 2 != 0) {
                        int i69 = 19 / 0;
                        if (((ContextWrapper) baseContext2).getBaseContext() != null) {
                            baseContext2 = baseContext2.getApplicationContext();
                        } else {
                            baseContext2 = null;
                        }
                    } else if (((ContextWrapper) baseContext2).getBaseContext() != null) {
                        baseContext2 = baseContext2.getApplicationContext();
                    } else {
                        baseContext2 = null;
                    }
                } else {
                    baseContext2 = baseContext2.getApplicationContext();
                }
            }
            Object[] objArr48 = {baseContext2, Integer.valueOf(((Integer) Class.forName(str10).getMethod(str2, Object.class).invoke(null, this)).intValue()), 0, 1594083384};
            byte[] bArr13 = $$d;
            Object[] objArr49 = new Object[1];
            d(bArr13[35], (short) 334, bArr13[185], objArr49);
            Class<?> cls3 = Class.forName((String) objArr49[0]);
            Object[] objArr50 = new Object[1];
            d(bArr13[51], (short) 426, bArr13[15], objArr50);
            Object[] objArr51 = (Object[]) cls3.getMethod((String) objArr50[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr48);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                char cIndexOf2 = (char) (31532 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                int iResolveOpacity = 921 - Drawable.resolveOpacity(0, 0);
                int i70 = 29 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                byte[] bArr14 = $$a;
                short s7 = bArr14[7];
                byte b4 = bArr14[10];
                Object[] objArr52 = new Object[1];
                a(s7, b4, (byte) (b4 - 4), objArr52);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cIndexOf2, iResolveOpacity, i70, -1142834547, false, (String) objArr52[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, objArr51);
            try {
                str4 = str3;
                long jLongValue4 = ((Long) Class.forName(str8).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf5 = Long.valueOf(jLongValue4);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 31533);
                    int i71 = 922 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    int i72 = 28 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    short s8 = (short) ($$b >>> 1);
                    byte[] bArr15 = $$a;
                    Object[] objArr53 = new Object[1];
                    a(s8, bArr15[10], bArr15[7], objArr53);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(cNormalizeMetaState, i71, i72, -778300370, false, (String) objArr53[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf5);
                Long lValueOf6 = Long.valueOf(jLongValue4 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                    char cLastIndexOf = (char) (31532 - TextUtils.lastIndexOf("", '0', 0));
                    int edgeSlop3 = (ViewConfiguration.getEdgeSlop() >> 16) + 921;
                    int defaultSize2 = 28 - View.getDefaultSize(0, 0);
                    Object[] objArr54 = new Object[1];
                    a((short) 193, (byte) ($$a[19] - 1), (byte) 52, objArr54);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(cLastIndexOf, edgeSlop3, defaultSize2, -1048449946, false, (String) objArr54[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).set(null, lValueOf6);
                objArr3 = objArr51;
            } catch (Exception unused3) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr3[3])[0] != ((int[]) objArr3[1])[0]) {
            ArrayList arrayList3 = new ArrayList();
            String[] strArr9 = (String[]) objArr3[4];
            if (strArr9 != null) {
                for (String str16 : strArr9) {
                    arrayList3.add(str16);
                }
            }
            throw null;
        }
        int i73 = ((int[]) objArr3[0])[0];
        Object[] objArr55 = {new int[1], new int[]{((int[]) objArr3[1])[0]}, (Object[]) objArr3[2], new int[]{((int[]) objArr3[3])[0]}, (String[]) objArr3[4]};
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i74 = i73 + (-621700329) + (((~((-1640113836) | iElapsedRealtime)) | (-133965809)) * (-948)) + ((~((~iElapsedRealtime) | (-29370017))) * (-948)) + 2023216016;
        int i75 = (i74 << 13) ^ i74;
        int i76 = i75 ^ (i75 >>> 17);
        ((int[]) objArr55[0])[0] = i76 ^ (i76 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
            char c7 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 29943);
            int mirror2 = 1803 - AndroidCharacter.getMirror('0');
            int tapTimeout2 = (ViewConfiguration.getTapTimeout() >> 16) + 23;
            byte[] bArr16 = $$a;
            short s9 = bArr16[7];
            byte b5 = bArr16[10];
            Object[] objArr56 = new Object[1];
            a(s9, b5, (byte) (b5 - 4), objArr56);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(c7, mirror2, tapTimeout2, 986134021, false, (String) objArr56[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                char c8 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 29943);
                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 1756;
                int i77 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 23;
                short s10 = (short) ($$b >>> 1);
                byte[] bArr17 = $$a;
                Object[] objArr57 = new Object[1];
                a(s10, bArr17[10], bArr17[7], objArr57);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(c8, iIndexOf2, i77, 1599039318, false, (String) objArr57[0], null);
            }
            Object[] objArr58 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).get(null);
            objArr4 = new Object[]{new int[]{((int[]) objArr58[0])[0]}, new int[]{((int[]) objArr58[1])[0]}, (Object[]) objArr58[2], new int[1], (String[]) objArr58[4]};
            int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
            int i78 = ~((-9174473) | elapsedCpuTime2);
            int i79 = ~elapsedCpuTime2;
            int i80 = 701114737 + ((i78 | (~(203427953 | i79))) * (-1808)) + (((~((-4161) | elapsedCpuTime2)) | (~(i79 | 212598265))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(elapsedCpuTime2 | (-203427954))) | 9170312 | (~(9174472 | i79))) * TypedValues.Custom.TYPE_BOOLEAN) + 754686378;
            int i81 = (i80 << 13) ^ i80;
            int i82 = i81 ^ (i81 >>> 17);
            ((int[]) objArr4[3])[0] = i82 ^ (i82 << 5);
        } else {
            int iIntValue2 = ((Integer) Class.forName(str10).getMethod(str2, Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr59 = {-1114016065};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b((char) (View.resolveSize(0, 0) + 42049), View.MeasureSpec.getSize(0) + 1726, 29 - View.MeasureSpec.getMode(0), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrB$7879113 = onScroll.b$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).newInstance(objArr59), 754686378, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                    char cAxisFromString = (char) (MotionEvent.axisFromString("") + 29945);
                    int i83 = 1755 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int i84 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23;
                    short s11 = (short) ($$b >>> 1);
                    byte[] bArr18 = $$a;
                    Object[] objArr60 = new Object[1];
                    a(s11, bArr18[10], bArr18[7], objArr60);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(cAxisFromString, i83, i84, 1599039318, false, (String) objArr60[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).set(null, objArrB$7879113);
                try {
                    long jLongValue5 = ((Long) Class.forName(str8).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf7 = Long.valueOf(jLongValue5);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                        char gidForName = (char) (Process.getGidForName("") + 29945);
                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 1755;
                        int iBlue = Color.blue(0) + 23;
                        byte[] bArr19 = $$a;
                        Object[] objArr61 = new Object[1];
                        a((short) 89, bArr19[10], bArr19[7], objArr61);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(gidForName, fadingEdgeLength, iBlue, 1596667560, false, (String) objArr61[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).set(null, lValueOf7);
                    Long lValueOf8 = Long.valueOf(jLongValue5 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                        char jumpTapTimeout2 = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 29944);
                        int i85 = 1756 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        int iResolveSizeAndState = 23 - View.resolveSizeAndState(0, 0, 0);
                        byte[] bArr20 = $$a;
                        short s12 = bArr20[7];
                        byte b6 = bArr20[10];
                        Object[] objArr62 = new Object[1];
                        a(s12, b6, (byte) (b6 - 4), objArr62);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(jumpTapTimeout2, i85, iResolveSizeAndState, 986134021, false, (String) objArr62[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).set(null, lValueOf8);
                    objArr4 = objArrB$7879113;
                } catch (Exception unused4) {
                    throw new RuntimeException();
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        if (((int[]) objArr4[0])[0] != ((int[]) objArr4[1])[0]) {
            ArrayList arrayList4 = new ArrayList();
            String[] strArr10 = (String[]) objArr4[4];
            if (strArr10 != null) {
                for (String str17 : strArr10) {
                    arrayList4.add(str17);
                }
            }
            throw null;
        }
        int i86 = ((int[]) objArr4[3])[0];
        Object[] objArr63 = {new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i87 = ~(698772689 | iIdentityHashCode2);
        int i88 = ~iIdentityHashCode2;
        int i89 = i86 + (-672377413) + ((i87 | (~((-161744081) | i88))) * (-406)) + ((~(1073119195 | i88)) * (-406)) + (((~(iIdentityHashCode2 | (-911375116))) | (~((-698772690) | i88))) * 406);
        int i90 = (i89 << 13) ^ i89;
        int i91 = i90 ^ (i90 >>> 17);
        ((int[]) objArr63[3])[0] = i91 ^ (i91 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
            char cIndexOf3 = (char) TextUtils.indexOf("", "", 0, 0);
            int tapTimeout3 = (ViewConfiguration.getTapTimeout() >> 16) + 2267;
            int maximumDrawingCacheSize = 33 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            short s13 = (short) ($$b >>> 1);
            byte[] bArr21 = $$a;
            Object[] objArr64 = new Object[1];
            a(s13, bArr21[10], bArr21[7], objArr64);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(cIndexOf3, tapTimeout3, maximumDrawingCacheSize, -887667012, false, (String) objArr64[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int iResolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0) + 2267;
                int iIndexOf3 = 33 - TextUtils.indexOf("", "", 0, 0);
                byte[] bArr22 = $$a;
                short s14 = bArr22[7];
                byte b7 = bArr22[10];
                Object[] objArr65 = new Object[1];
                a(s14, b7, (byte) (b7 - 4), objArr65);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(minimumFlingVelocity, iResolveSizeAndState2, iIndexOf3, -654680577, false, (String) objArr65[0], null);
            }
            Object[] objArr66 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).get(null);
            objArr5 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i92 = ((int[]) objArr66[0])[0];
            int i93 = ((int[]) objArr66[3])[0];
            String[] strArr11 = (String[]) objArr66[1];
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i94 = ~iIdentityHashCode3;
            int i95 = (((774200719 + ((((~(44970162 | i94)) | (-853683479)) | (~((-44970163) | iIdentityHashCode3))) * (-564))) + ((~(iIdentityHashCode3 | (-44179475))) * 1128)) + (((~((-853683479) | i94)) | 790688) * 564)) - 1866969804;
            int i96 = (i95 << 13) ^ i95;
            int i97 = i96 ^ (i96 >>> 17);
            ((int[]) objArr5[2])[0] = i97 ^ (i97 << 5);
        } else {
            Context baseContext3 = getBaseContext();
            if (baseContext3 == null) {
                baseContext3 = (Context) Class.forName(str12).getMethod(str, new Class[0]).invoke(null, null);
            }
            if (baseContext3 != null) {
                baseContext3 = ((baseContext3 instanceof ContextWrapper) && ((ContextWrapper) baseContext3).getBaseContext() == null) ? null : baseContext3.getApplicationContext();
            }
            Object[] objArr67 = {baseContext3, Integer.valueOf(((Integer) Class.forName(str10).getMethod(str2, Object.class).invoke(null, this)).intValue()), 0, -1866969804};
            byte[] bArr23 = $$d;
            byte b8 = bArr23[15];
            Object[] objArr68 = new Object[1];
            d(b8, (short) (b8 | 299), bArr23[185], objArr68);
            Class<?> cls4 = Class.forName((String) objArr68[0]);
            Object[] objArr69 = new Object[1];
            d(bArr23[51], (short) 201, bArr23[15], objArr69);
            Object[] objArr70 = (Object[]) cls4.getMethod((String) objArr69[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr67);
            if (baseContext3 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                    char cLastIndexOf2 = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
                    int keyRepeatDelay = 2267 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int i98 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 33;
                    byte[] bArr24 = $$a;
                    short s15 = bArr24[7];
                    byte b9 = bArr24[10];
                    Object[] objArr71 = new Object[1];
                    a(s15, b9, (byte) (b9 - 4), objArr71);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(cLastIndexOf2, keyRepeatDelay, i98, -654680577, false, (String) objArr71[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).set(null, objArr70);
                try {
                    long jLongValue6 = ((Long) Class.forName(str8).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf9 = Long.valueOf(jLongValue6);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                        char cLastIndexOf3 = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                        int i99 = 2267 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 33;
                        byte[] bArr25 = $$a;
                        Object[] objArr72 = new Object[1];
                        a((short) 141, bArr25[10], bArr25[7], objArr72);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(cLastIndexOf3, i99, scrollBarSize, -874156483, false, (String) objArr72[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).set(null, lValueOf9);
                    Long lValueOf10 = Long.valueOf(jLongValue6 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                        char size2 = (char) View.MeasureSpec.getSize(0);
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 2267;
                        int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 33;
                        short s16 = (short) ($$b >>> 1);
                        byte[] bArr26 = $$a;
                        Object[] objArr73 = new Object[1];
                        a(s16, bArr26[10], bArr26[7], objArr73);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(size2, packedPositionType, longPressTimeout, -887667012, false, (String) objArr73[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).set(null, lValueOf10);
                } catch (Exception unused5) {
                    throw new RuntimeException();
                }
            } else {
                objArr70 = objArr70;
            }
            objArr5 = objArr70;
        }
        int i100 = ((int[]) objArr5[3])[0];
        int i101 = ((int[]) objArr5[0])[0];
        if (i101 == i100) {
            Object[] objArr74 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i102 = ((int[]) objArr5[2])[0];
            int i103 = ((int[]) objArr5[0])[0];
            int i104 = ((int[]) objArr5[3])[0];
            String[] strArr12 = (String[]) objArr5[1];
            int iIdentityHashCode4 = System.identityHashCode(this);
            int i105 = i102 + (-304117791) + (((~(74843735 | iIdentityHashCode4)) | 730460168) * (-140)) + ((~(805303903 | iIdentityHashCode4)) * 70) + (((~(iIdentityHashCode4 | 733869580)) | 801894491) * 70);
            int i106 = (i105 << 13) ^ i105;
            int i107 = i106 ^ (i106 >>> 17);
            ((int[]) objArr74[2])[0] = i107 ^ (i107 << 5);
        } else {
            ArrayList arrayList5 = new ArrayList();
            String[] strArr13 = (String[]) objArr5[1];
            if (strArr13 != null) {
                for (String str18 : strArr13) {
                    arrayList5.add(str18);
                }
            }
            int[] iArr8 = new int[i101];
            int i108 = i101 - 1;
            iArr8[i108] = 1;
            Toast.makeText((Context) null, iArr8[((i101 * i108) % 2) - 1], 1).show();
            Object[] objArr75 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i109 = ((int[]) objArr5[2])[0];
            int i110 = ((int[]) objArr5[0])[0];
            int i111 = ((int[]) objArr5[3])[0];
            String[] strArr14 = (String[]) objArr5[1];
            int iIdentityHashCode5 = System.identityHashCode(this);
            int i112 = ~iIdentityHashCode5;
            int i113 = i109 + (-1070378897) + (((~((-662181086) | i112)) | 658509913) * 98) + (((~(i112 | (-146532231))) | (-662181086) | (~(146532230 | iIdentityHashCode5))) * (-49)) + (((~(iIdentityHashCode5 | (-662181086))) | (-805042144)) * 49);
            int i114 = (i113 << 13) ^ i113;
            int i115 = i114 ^ (i114 >>> 17);
            ((int[]) objArr75[2])[0] = i115 ^ (i115 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
            char c9 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
            int scrollDefaultDelay3 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 876;
            int iLastIndexOf2 = 9 - TextUtils.lastIndexOf("", '0', 0);
            Object[] objArr76 = new Object[1];
            a((short) 193, (byte) ($$a[19] - 1), (byte) 52, objArr76);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(c9, scrollDefaultDelay3, iLastIndexOf2, 252381699, false, (String) objArr76[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).getLong(null);
        long jLongValue7 = ((Long) Class.forName(str8).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
            char mirror3 = (char) (AndroidCharacter.getMirror('0') - '0');
            int i116 = 877 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            int i117 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 9;
            byte[] bArr27 = $$a;
            Object[] objArr77 = new Object[1];
            a((short) 89, bArr27[10], bArr27[7], objArr77);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(mirror3, i116, i117, 2009631821, false, (String) objArr77[0], null);
        }
        if (j2 == ((jLongValue7 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                char cMyTid = (char) (Process.myTid() >> 22);
                int i118 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 875;
                int i119 = 10 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                byte b10 = $$a[7];
                Object[] objArr78 = new Object[1];
                a((short) 193, b10, (byte) (b10 | 52), objArr78);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(cMyTid, i118, i119, 256017550, false, (String) objArr78[0], null);
            }
            Object[] objArr79 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).get(null);
            objArr6 = new Object[]{new int[]{((int[]) objArr79[0])[0]}, new int[1], new int[]{((int[]) objArr79[2])[0]}, (String[]) objArr79[3]};
            int iIdentityHashCode6 = System.identityHashCode(this);
            int i120 = (((~(iIdentityHashCode6 | 910120869)) | (-869810641)) * 56) + 433733108 + (((~((~iIdentityHashCode6) | (-869810641))) | 910120869) * 56) + 20534467;
            int i121 = (i120 << 13) ^ i120;
            int i122 = i121 ^ (i121 >>> 17);
            ((int[]) objArr6[1])[0] = i122 ^ (i122 << 5);
        } else {
            Context baseContext4 = getBaseContext();
            if (baseContext4 == null) {
                baseContext4 = (Context) Class.forName(str12).getMethod(str, new Class[0]).invoke(null, null);
            }
            if (baseContext4 != null) {
                if (baseContext4 instanceof ContextWrapper) {
                    int i123 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 3;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i123 % 128;
                    int i124 = i123 % 2;
                    if (((ContextWrapper) baseContext4).getBaseContext() != null) {
                        baseContext4 = baseContext4.getApplicationContext();
                    } else {
                        baseContext4 = null;
                    }
                } else {
                    baseContext4 = baseContext4.getApplicationContext();
                }
            }
            Object[] objArr80 = {baseContext4, Integer.valueOf(((Integer) Class.forName(str10).getMethod(str2, Object.class).invoke(null, this)).intValue()), 20534467};
            byte[] bArr28 = $$d;
            Object[] objArr81 = new Object[1];
            d(bArr28[79], (short) 149, bArr28[185], objArr81);
            Class<?> cls5 = Class.forName((String) objArr81[0]);
            Object[] objArr82 = new Object[1];
            d(bArr28[133], (short) 96, bArr28[15], objArr82);
            objArr6 = (Object[]) cls5.getMethod((String) objArr82[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr80);
            if (baseContext4 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
                    char size3 = (char) View.MeasureSpec.getSize(0);
                    int tapTimeout4 = (ViewConfiguration.getTapTimeout() >> 16) + 876;
                    int iMyPid = (Process.myPid() >> 22) + 10;
                    byte b11 = $$a[7];
                    Object[] objArr83 = new Object[1];
                    a((short) 193, b11, (byte) (b11 | 52), objArr83);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(size3, tapTimeout4, iMyPid, 256017550, false, (String) objArr83[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).set(null, objArr6);
                try {
                    long jLongValue8 = ((Long) Class.forName(str8).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf11 = Long.valueOf(jLongValue8);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
                        char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                        int iRgb2 = Color.rgb(0, 0, 0) + 16778092;
                        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 10;
                        byte[] bArr29 = $$a;
                        Object[] objArr84 = new Object[1];
                        a((short) 89, bArr29[10], bArr29[7], objArr84);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(maxKeyCode, iRgb2, windowTouchSlop, 2009631821, false, (String) objArr84[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).set(null, lValueOf11);
                    Long lValueOf12 = Long.valueOf(jLongValue8 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                        char packedPositionGroup2 = (char) ExpandableListView.getPackedPositionGroup(0L);
                        int i125 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 876;
                        int deadChar = KeyEvent.getDeadChar(0, 0) + 10;
                        Object[] objArr85 = new Object[1];
                        a((short) 193, (byte) ($$a[19] - 1), (byte) 52, objArr85);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(packedPositionGroup2, i125, deadChar, 252381699, false, (String) objArr85[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).set(null, lValueOf12);
                } catch (Exception unused6) {
                    throw new RuntimeException();
                }
            }
        }
        int i126 = ((int[]) objArr6[2])[0];
        int i127 = ((int[]) objArr6[0])[0];
        if (i127 == i126) {
            int i128 = ((int[]) objArr6[1])[0];
            Object[] objArr86 = {new int[]{((int[]) objArr6[0])[0]}, new int[1], new int[]{((int[]) objArr6[2])[0]}, (String[]) objArr6[3]};
            str5 = str7;
            int i129 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str5, new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1107902273;
            int i130 = ~i129;
            int i131 = i128 + 2029882472 + (((-26804885) | i130) * (-369)) + (((~((-778337644) | i130)) | (-738027415)) * (-369)) + (((~(i129 | 778337643)) | (-805142528) | (~(i130 | (-711222531)))) * 369);
            int i132 = i131 ^ (i131 << 13);
            int i133 = i132 ^ (i132 >>> 17);
            ((int[]) objArr86[1])[0] = i133 ^ (i133 << 5);
            i = 0;
        } else {
            str5 = str7;
            Toast.makeText((Context) null, i127 / (((i127 - 1) * i127) % 2), 0).show();
            int i134 = ((int[]) objArr6[1])[0];
            Object[] objArr87 = {new int[]{((int[]) objArr6[0])[0]}, new int[1], new int[]{((int[]) objArr6[2])[0]}, (String[]) objArr6[3]};
            int iIdentityHashCode7 = System.identityHashCode(this);
            int i135 = i134 + 549169516 + (((~((-65541) | iIdentityHashCode7)) | 40375769) * (-756)) + (((~iIdentityHashCode7) | (-65541)) * 756);
            int i136 = i135 ^ (i135 << 13);
            int i137 = i136 ^ (i136 >>> 17);
            i = 0;
            ((int[]) objArr87[1])[0] = i137 ^ (i137 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
            str6 = "";
            char cLastIndexOf4 = (char) ((-1) - TextUtils.lastIndexOf(str6, '0', i));
            int iArgb2 = 651 - Color.argb(i, i, i, i);
            int defaultSize3 = 44 - View.getDefaultSize(i, i);
            byte[] bArr30 = $$a;
            Object[] objArr88 = new Object[1];
            a((short) 89, bArr30[10], bArr30[7], objArr88);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(cLastIndexOf4, iArgb2, defaultSize3, -459846511, false, (String) objArr88[0], null);
        } else {
            str6 = r11;
        }
        long j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).getLong(null);
        long jLongValue9 = ((Long) Class.forName(str8).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
            char c10 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
            int modifierMetaStateMask = 650 - ((byte) KeyEvent.getModifierMetaStateMask());
            int modifierMetaStateMask2 = ((byte) KeyEvent.getModifierMetaStateMask()) + 45;
            Object[] objArr89 = new Object[1];
            a((short) 193, (byte) ($$a[19] - 1), (byte) 52, objArr89);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(c10, modifierMetaStateMask, modifierMetaStateMask2, -873460649, false, (String) objArr89[0], null);
        }
        if (j3 == ((jLongValue9 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
                char cAxisFromString2 = (char) (MotionEvent.axisFromString(str6) + 1);
                int i138 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 650;
                int i139 = 45 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                byte[] bArr31 = $$a;
                short s17 = bArr31[7];
                byte b12 = bArr31[10];
                Object[] objArr90 = new Object[1];
                a(s17, b12, (byte) (b12 - 4), objArr90);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(cAxisFromString2, i138, i139, -1595579076, false, (String) objArr90[0], null);
            }
            Object[] objArr91 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).get(null);
            objArr7 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i140 = ((int[]) objArr91[2])[0];
            int i141 = ((int[]) objArr91[0])[0];
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i142 = ((((-353373327) + (((~(200334228 | startElapsedRealtime)) | 67445802) * 104)) + ((~((~startElapsedRealtime) | (-64014993))) * (-104))) + ((startElapsedRealtime | 203765038) * 104)) - 1599809017;
            int i143 = (i142 << 13) ^ i142;
            int i144 = i143 ^ (i143 >>> 17);
            ((int[]) objArr7[3])[0] = i144 ^ (i144 << 5);
            c2 = 0;
        } else {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 1610 - (ViewConfiguration.getScrollBarSize() >> 8), 26 - (ViewConfiguration.getTapTimeout() >> 16), 2145681644, false, null, new Class[0]);
            }
            Object[] objArr92 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).newInstance(null), -1599809017, 0};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
                char cIndexOf4 = (char) TextUtils.indexOf(str6, str6, 0);
                int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 651;
                int iIndexOf4 = TextUtils.indexOf(str6, str6, 0, 0) + 44;
                Object[] objArr93 = new Object[1];
                a((short) 193, (byte) ($$a[19] - 1), (byte) 52, objArr93);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(cIndexOf4, maximumDrawingCacheSize2, iIndexOf4, 2075921419, false, (String) objArr93[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (Process.myPid() >> 22) + 695, 98 - View.combineMeasuredStates(0, 0)), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 63406), (ViewConfiguration.getJumpTapTimeout() >> 16) + 793, (Process.myPid() >> 22) + 83), Integer.TYPE, Integer.TYPE});
            }
            objArr7 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).invoke(null, objArr92);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                char cIndexOf5 = (char) (TextUtils.indexOf((CharSequence) str6, '0', 0, 0) + 1);
                int absoluteGravity = 651 - Gravity.getAbsoluteGravity(0, 0);
                int offsetBefore3 = TextUtils.getOffsetBefore(str6, 0) + 44;
                byte[] bArr32 = $$a;
                short s18 = bArr32[7];
                byte b13 = bArr32[10];
                Object[] objArr94 = new Object[1];
                a(s18, b13, (byte) (b13 - 4), objArr94);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(cIndexOf5, absoluteGravity, offsetBefore3, -1595579076, false, (String) objArr94[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).set(null, objArr7);
            try {
                long jLongValue10 = ((Long) Class.forName(str8).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf13 = Long.valueOf(jLongValue10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                    char trimmedLength = (char) TextUtils.getTrimmedLength(str6);
                    int i145 = 651 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int iIndexOf5 = 43 - TextUtils.indexOf((CharSequence) str6, '0');
                    Object[] objArr95 = new Object[1];
                    a((short) 193, (byte) ($$a[19] - 1), (byte) 52, objArr95);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(trimmedLength, i145, iIndexOf5, -873460649, false, (String) objArr95[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).set(null, lValueOf13);
                Long lValueOf14 = Long.valueOf(jLongValue10 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
                    char packedPositionGroup3 = (char) ExpandableListView.getPackedPositionGroup(0L);
                    int iArgb3 = Color.argb(0, 0, 0, 0) + 651;
                    int i146 = 45 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    byte[] bArr33 = $$a;
                    Object[] objArr96 = new Object[1];
                    a((short) 89, bArr33[10], bArr33[7], objArr96);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(packedPositionGroup3, iArgb3, i146, -459846511, false, (String) objArr96[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).set(null, lValueOf14);
                c2 = 0;
            } catch (Exception unused7) {
                throw new RuntimeException();
            }
        }
        int i147 = ((int[]) objArr7[c2])[c2];
        int i148 = ((int[]) objArr7[2])[c2];
        if (i148 != i147) {
            ArrayList arrayList6 = new ArrayList();
            String[] strArr15 = (String[]) objArr7[1];
            if (strArr15 != null) {
                for (String str19 : strArr15) {
                    arrayList6.add(str19);
                }
            }
            throw new RuntimeException(String.valueOf(i148));
        }
        int i149 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i149 % 128;
        int i150 = i149 % 2;
        Object[] objArr97 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
        int i151 = ((int[]) objArr7[3])[0];
        int i152 = ((int[]) objArr7[2])[0];
        int i153 = ((int[]) objArr7[0])[0];
        int i154 = (int) Runtime.getRuntime().totalMemory();
        int i155 = i151 + ((((~(133194766 | i154)) | (-265607591)) * 398) - 1025358307) + (((~((~i154) | 133194766)) | (-265607591)) * 398);
        int i156 = i155 ^ (i155 << 13);
        int i157 = i156 ^ (i156 >>> 17);
        ((int[]) objArr97[3])[0] = i157 ^ (i157 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
            char c11 = (char) (53893 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
            int iResolveSize = View.resolveSize(0, 0) + 1320;
            int maximumFlingVelocity2 = 36 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            Object[] objArr98 = new Object[1];
            a((short) 193, (byte) ($$a[19] - 1), (byte) 52, objArr98);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(c11, iResolveSize, maximumFlingVelocity2, -1433084963, false, (String) objArr98[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
                char minimumFlingVelocity2 = (char) (53893 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                int defaultSize4 = View.getDefaultSize(0, 0) + 1320;
                int iMyTid = 36 - (Process.myTid() >> 22);
                short s19 = (short) ($$b >>> 1);
                byte[] bArr34 = $$a;
                Object[] objArr99 = new Object[1];
                a(s19, bArr34[10], bArr34[7], objArr99);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(minimumFlingVelocity2, defaultSize4, iMyTid, -1920778747, false, (String) objArr99[0], null);
            }
            Object[] objArr100 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).get(null);
            objArr8 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i158 = ((int[]) objArr100[0])[0];
            int i159 = ((int[]) objArr100[3])[0];
            String[] strArr16 = (String[]) objArr100[2];
            int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
            int i160 = 685785752 + ((1227742956 | iUptimeMillis2) * 614);
            int i161 = ~iUptimeMillis2;
            int i162 = ((i160 + ((((~((-223082215) | i161)) | 151639780) | (~(1147545610 | i161))) * (-1228))) + (((~(i161 | 1299185390)) | (~((-71442435) | i161))) * 614)) - 170785391;
            int i163 = (i162 << 13) ^ i162;
            int i164 = i163 ^ (i163 >>> 17);
            ((int[]) objArr8[1])[0] = i164 ^ (i164 << 5);
        } else {
            Context baseContext5 = getBaseContext();
            if (baseContext5 == null) {
                baseContext5 = (Context) Class.forName(str12).getMethod(str, new Class[0]).invoke(null, null);
            }
            if (baseContext5 != null) {
                baseContext5 = ((baseContext5 instanceof ContextWrapper) && ((ContextWrapper) baseContext5).getBaseContext() == null) ? null : baseContext5.getApplicationContext();
            }
            int iIntValue3 = ((Integer) Class.forName(str10).getMethod(str2, Object.class).invoke(null, this)).intValue();
            Object[] objArr101 = {-1130793684};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b((char) (47977 - TextUtils.getOffsetAfter(str6, 0)), AndroidCharacter.getMirror('0') + 1252, (ViewConfiguration.getLongPressTimeout() >> 16) + 20, -420973425, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr102 = {baseContext5, "com.bpjstku", -170785391, Integer.valueOf(iIntValue3), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).newInstance(objArr101), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
                char tapTimeout5 = (char) (53893 - (ViewConfiguration.getTapTimeout() >> 16));
                int iCombineMeasuredStates = 1320 - View.combineMeasuredStates(0, 0);
                int mirror4 = AndroidCharacter.getMirror('0') - '\f';
                short s20 = (short) ($$b >>> 1);
                byte[] bArr35 = $$a;
                Object[] objArr103 = new Object[1];
                a(s20, bArr35[10], bArr35[7], objArr103);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(tapTimeout5, iCombineMeasuredStates, mirror4, 819724799, false, (String) objArr103[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (57878 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), View.resolveSize(0, 0) + 1394, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 74), Boolean.TYPE});
            }
            objArr8 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).invoke(null, objArr102);
            if (baseContext5 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                    char cIndexOf6 = (char) (53893 - TextUtils.indexOf(str6, str6, 0));
                    int defaultSize5 = 1320 - View.getDefaultSize(0, 0);
                    int tapTimeout6 = 36 - (ViewConfiguration.getTapTimeout() >> 16);
                    short s21 = (short) ($$b >>> 1);
                    byte[] bArr36 = $$a;
                    Object[] objArr104 = new Object[1];
                    a(s21, bArr36[10], bArr36[7], objArr104);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(cIndexOf6, defaultSize5, tapTimeout6, -1920778747, false, (String) objArr104[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).set(null, objArr8);
                try {
                    long jLongValue11 = ((Long) Class.forName(str8).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf15 = Long.valueOf(jLongValue11);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                        char pressedStateDuration = (char) (53893 - (ViewConfiguration.getPressedStateDuration() >> 16));
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 1321;
                        int packedPositionGroup4 = 36 - ExpandableListView.getPackedPositionGroup(0L);
                        byte[] bArr37 = $$a;
                        short s22 = bArr37[7];
                        byte b14 = bArr37[10];
                        Object[] objArr105 = new Object[1];
                        a(s22, b14, (byte) (b14 - 4), objArr105);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(pressedStateDuration, packedPositionChild, packedPositionGroup4, -1273706634, false, (String) objArr105[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).set(null, lValueOf15);
                    Long lValueOf16 = Long.valueOf(jLongValue11 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
                        char keyRepeatDelay2 = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 53893);
                        int windowTouchSlop2 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1320;
                        int maxKeyCode2 = (KeyEvent.getMaxKeyCode() >> 16) + 36;
                        Object[] objArr106 = new Object[1];
                        a((short) 193, (byte) ($$a[19] - 1), (byte) 52, objArr106);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(keyRepeatDelay2, windowTouchSlop2, maxKeyCode2, -1433084963, false, (String) objArr106[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).set(null, lValueOf16);
                } catch (Exception unused8) {
                    throw new RuntimeException();
                }
            }
        }
        if (((int[]) objArr8[0])[0] != ((int[]) objArr8[3])[0]) {
            throw null;
        }
        int i165 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i165 % 128;
        int i166 = i165 % 2;
        Object[] objArr107 = {new int[]{i}, new int[1], strArr, new int[]{i}};
        int i167 = ((int[]) objArr8[1])[0];
        int i168 = ((int[]) objArr8[0])[0];
        int i169 = ((int[]) objArr8[3])[0];
        String[] strArr17 = (String[]) objArr8[2];
        String str20 = str5;
        int i170 = ((Context) Class.forName(r1).getMethod(str20, new Class[0]).invoke(null, null)).getResources().getConfiguration().navigationHidden;
        int i171 = i167 + (-1167932144) + (((~((-538451986) | (~i170))) | (~(832175839 | i170))) * (-272)) + (((~((-806970010) | i170)) | 268518024) * (-272)) + (((~(i170 | 806970009)) | 563657815) * 272);
        int i172 = i171 ^ (i171 << 13);
        int i173 = i172 ^ (i172 >>> 17);
        ((int[]) objArr107[1])[0] = i173 ^ (i173 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
            char capsMode = (char) TextUtils.getCapsMode(str6, 0, 0);
            int iResolveSizeAndState3 = 1031 - View.resolveSizeAndState(0, 0, 0);
            int tapTimeout7 = 15 - (ViewConfiguration.getTapTimeout() >> 16);
            byte[] bArr38 = $$a;
            Object[] objArr108 = new Object[1];
            a((short) 141, bArr38[10], bArr38[7], objArr108);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(capsMode, iResolveSizeAndState3, tapTimeout7, 1357589585, false, (String) objArr108[0], null);
        }
        long j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).getLong(null);
        long jLongValue12 = ((Long) Class.forName(str8).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
            char packedPositionChild2 = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
            int iIndexOf6 = 1030 - TextUtils.indexOf((CharSequence) str6, '0', 0, 0);
            int size4 = 15 - View.MeasureSpec.getSize(0);
            short s23 = (short) ($$b >>> 1);
            byte[] bArr39 = $$a;
            Object[] objArr109 = new Object[1];
            a(s23, bArr39[10], bArr39[7], objArr109);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(packedPositionChild2, iIndexOf6, size4, 1344079056, false, (String) objArr109[0], null);
        }
        if (j4 == ((jLongValue12 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).getLong(null) << 52) >>> 52)) >> 12)) {
            int i174 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i174 % 128;
            int i175 = i174 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
                char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString(str6);
                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1031;
                int iMyTid2 = 15 - (Process.myTid() >> 22);
                Object[] objArr110 = new Object[1];
                a((short) 193, (byte) ($$a[19] - 1), (byte) 52, objArr110);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(cKeyCodeFromString, keyRepeatTimeout, iMyTid2, 632103528, false, (String) objArr110[0], null);
            }
            Object[] objArr111 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).get(null);
            objArr9 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i176 = ((int[]) objArr111[3])[0];
            int i177 = ((int[]) objArr111[1])[0];
            String[] strArr18 = (String[]) objArr111[0];
            int i178 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str20, new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
            int i179 = ~i178;
            int i180 = 1581789188 + (((~((-691410200) | i179)) | (~(447130029 | i179))) * (-867)) + (((~((-691410200) | i178)) | 554701842 | (~(447130029 | i178))) * (-1734)) + (((~(i178 | 1001831871)) | (~(i179 | (-554701843))) | (~((-136708358) | i178))) * 867) + 631570129;
            int i181 = (i180 << 13) ^ i180;
            int i182 = i181 ^ (i181 >>> 17);
            ((int[]) objArr9[2])[0] = i182 ^ (i182 << 5);
        } else {
            int iIntValue4 = ((Integer) Class.forName(str10).getMethod(str2, Object.class).invoke(null, this)).intValue();
            Object[] objArr112 = {-1130793684};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b((char) (46038 - (ViewConfiguration.getPressedStateDuration() >> 16)), 1134 - Color.alpha(0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr113 = {Integer.valueOf(iIntValue4), 0, 631570129, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).newInstance(objArr112), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
                char c12 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                int maxKeyCode3 = 1031 - (KeyEvent.getMaxKeyCode() >> 16);
                int iResolveOpacity2 = Drawable.resolveOpacity(0, 0) + 15;
                byte[] bArr40 = $$a;
                Object[] objArr114 = new Object[1];
                a((short) 141, bArr40[10], bArr40[7], objArr114);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(c12, maxKeyCode3, iResolveOpacity2, 1298546779, false, (String) objArr114[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - ExpandableListView.getPackedPositionGroup(0L)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1116, View.MeasureSpec.getMode(0) + 17), Boolean.TYPE});
            }
            objArr9 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).invoke(null, objArr113);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
                char cNormalizeMetaState2 = (char) KeyEvent.normalizeMetaState(0);
                int iIndexOf7 = TextUtils.indexOf((CharSequence) str6, '0', 0, 0) + 1032;
                int iResolveSize2 = 15 - View.resolveSize(0, 0);
                Object[] objArr115 = new Object[1];
                a((short) 193, (byte) ($$a[19] - 1), (byte) 52, objArr115);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(cNormalizeMetaState2, iIndexOf7, iResolveSize2, 632103528, false, (String) objArr115[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).set(null, objArr9);
            try {
                long jLongValue13 = ((Long) Class.forName(str8).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf17 = Long.valueOf(jLongValue13);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
                    char packedPositionChild3 = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                    int keyRepeatDelay3 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1031;
                    int i183 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 15;
                    short s24 = (short) ($$b >>> 1);
                    byte[] bArr41 = $$a;
                    Object[] objArr116 = new Object[1];
                    a(s24, bArr41[10], bArr41[7], objArr116);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b(packedPositionChild3, keyRepeatDelay3, i183, 1344079056, false, (String) objArr116[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).set(null, lValueOf17);
                Long lValueOf18 = Long.valueOf(jLongValue13 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
                    char packedPositionGroup5 = (char) ExpandableListView.getPackedPositionGroup(0L);
                    int iIndexOf8 = TextUtils.indexOf((CharSequence) str6, '0') + 1032;
                    int keyRepeatTimeout2 = 15 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    byte[] bArr42 = $$a;
                    Object[] objArr117 = new Object[1];
                    a((short) 141, bArr42[10], bArr42[7], objArr117);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(packedPositionGroup5, iIndexOf8, keyRepeatTimeout2, 1357589585, false, (String) objArr117[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).set(null, lValueOf18);
            } catch (Exception unused9) {
                throw new RuntimeException();
            }
        }
        int i184 = ((int[]) objArr9[1])[0];
        int i185 = ((int[]) objArr9[3])[0];
        if (i185 != i184) {
            ArrayList arrayList7 = new ArrayList();
            String[] strArr19 = (String[]) objArr9[0];
            if (strArr19 != null) {
                for (String str21 : strArr19) {
                    arrayList7.add(str21);
                }
            }
            throw new RuntimeException(String.valueOf(i185));
        }
        Object[] objArr118 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i186 = ((int[]) objArr9[2])[0];
        int i187 = ((int[]) objArr9[3])[0];
        int i188 = ((int[]) objArr9[1])[0];
        String[] strArr20 = (String[]) objArr9[0];
        int iMyTid3 = Process.myTid();
        int i189 = ~iMyTid3;
        int i190 = i186 + 1704240461 + (((~((-366804276) | i189)) | 611084445) * (-328)) + ((iMyTid3 | 611084445) * 164) + (((~(iMyTid3 | 366804275)) | 538968204 | (~(i189 | (-294688035)))) * 164);
        int i191 = (i190 << 13) ^ i190;
        int i192 = i191 ^ (i191 >>> 17);
        ((int[]) objArr118[2])[0] = i192 ^ (i192 << 5);
        super.onCreate();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
            char c13 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
            int iMyPid2 = (Process.myPid() >> 22) + 876;
            int i193 = 11 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            byte[] bArr43 = $$a;
            short s25 = bArr43[7];
            byte b15 = bArr43[10];
            Object[] objArr119 = new Object[1];
            a(s25, b15, (byte) (b15 - 4), objArr119);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(c13, iMyPid2, i193, -1650998592, false, (String) objArr119[0], null);
        }
        long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).getLong(null);
        long jLongValue14 = ((Long) Class.forName(str8).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
            char c14 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int packedPositionGroup6 = ExpandableListView.getPackedPositionGroup(0L) + 876;
            int scrollDefaultDelay4 = 10 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            short s26 = (short) ($$b >>> 1);
            byte[] bArr44 = $$a;
            Object[] objArr120 = new Object[1];
            a(s26, bArr44[10], bArr44[7], objArr120);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b(c14, packedPositionGroup6, scrollDefaultDelay4, 2012020043, false, (String) objArr120[0], null);
        }
        if (j5 == ((jLongValue14 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).getLong(null) << 52) >>> 52)) >> 12)) {
            int i194 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 7;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i194 % 128;
            int i195 = i194 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
                char gidForName2 = (char) (Process.getGidForName(str6) + 1);
                int mirror5 = 924 - AndroidCharacter.getMirror('0');
                int i196 = 11 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                byte[] bArr45 = $$a;
                Object[] objArr121 = new Object[1];
                a((short) 141, bArr45[10], bArr45[7], objArr121);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b(gidForName2, mirror5, i196, 2012931276, false, (String) objArr121[0], null);
            }
            Object[] objArr122 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).get(null);
            objArr10 = new Object[]{new int[]{((int[]) objArr122[0])[0]}, new int[1], new int[]{((int[]) objArr122[2])[0]}, (String[]) objArr122[3]};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i197 = (-1640252828) + ((~(startUptimeMillis | 652556373)) * 216);
            int i198 = ~startUptimeMillis;
            int i199 = i197 + ((654260949 | i198) * (-216)) + (((~(i198 | 652556373)) | (-612246145)) * 216) + 1233290802;
            int i200 = (i199 << 13) ^ i199;
            int i201 = i200 ^ (i200 >>> 17);
            ((int[]) objArr10[1])[0] = i201 ^ (i201 << 5);
        } else {
            Context baseContext6 = getBaseContext();
            if (baseContext6 == null) {
                baseContext6 = (Context) Class.forName(str12).getMethod(str, new Class[0]).invoke(null, null);
            }
            if (baseContext6 != null) {
                baseContext6 = ((baseContext6 instanceof ContextWrapper) && ((ContextWrapper) baseContext6).getBaseContext() == null) ? null : baseContext6.getApplicationContext();
            }
            Object[] objArr123 = {baseContext6, Integer.valueOf(((Integer) Class.forName(str10).getMethod(str2, Object.class).invoke(null, this)).intValue()), 0, 1233290802};
            byte[] bArr46 = $$d;
            Object[] objArr124 = new Object[1];
            d(bArr46[235], (short) (bArr46[123] - 1), (byte) (-bArr46[114]), objArr124);
            Class<?> cls6 = Class.forName((String) objArr124[0]);
            Object[] objArr125 = new Object[1];
            d((byte) 98, (short) 334, bArr46[55], objArr125);
            objArr10 = (Object[]) cls6.getMethod((String) objArr125[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr123);
            if (baseContext6 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
                    char packedPositionChild4 = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                    int iLastIndexOf3 = 875 - TextUtils.lastIndexOf(str6, '0');
                    int fadingEdgeLength2 = 10 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    byte[] bArr47 = $$a;
                    Object[] objArr126 = new Object[1];
                    a((short) 141, bArr47[10], bArr47[7], objArr126);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b(packedPositionChild4, iLastIndexOf3, fadingEdgeLength2, 2012931276, false, (String) objArr126[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).set(null, objArr10);
                try {
                    long jLongValue15 = ((Long) Class.forName(str8).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf19 = Long.valueOf(jLongValue15);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
                        char deadChar2 = (char) KeyEvent.getDeadChar(0, 0);
                        int packedPositionGroup7 = 876 - ExpandableListView.getPackedPositionGroup(0L);
                        int iLastIndexOf4 = TextUtils.lastIndexOf(str6, '0') + 11;
                        short s27 = (short) ($$b >>> 1);
                        byte[] bArr48 = $$a;
                        Object[] objArr127 = new Object[1];
                        a(s27, bArr48[10], bArr48[7], objArr127);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(deadChar2, packedPositionGroup7, iLastIndexOf4, 2012020043, false, (String) objArr127[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).set(null, lValueOf19);
                    Long lValueOf20 = Long.valueOf(jLongValue15 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
                        char packedPositionType2 = (char) ExpandableListView.getPackedPositionType(0L);
                        int gidForName3 = 875 - Process.getGidForName(str6);
                        int offsetAfter2 = 10 - TextUtils.getOffsetAfter(str6, 0);
                        byte[] bArr49 = $$a;
                        short s28 = bArr49[7];
                        byte b16 = bArr49[10];
                        Object[] objArr128 = new Object[1];
                        a(s28, b16, (byte) (b16 - 4), objArr128);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(packedPositionType2, gidForName3, offsetAfter2, -1650998592, false, (String) objArr128[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).set(null, lValueOf20);
                } catch (Exception unused10) {
                    throw new RuntimeException();
                }
            }
        }
        int i202 = ((int[]) objArr10[2])[0];
        int i203 = ((int[]) objArr10[0])[0];
        if (i203 == i202) {
            int i204 = ((int[]) objArr10[1])[0];
            Object[] objArr129 = {new int[]{((int[]) objArr10[0])[0]}, new int[1], new int[]{((int[]) objArr10[2])[0]}, (String[]) objArr10[3]};
            int startUptimeMillis2 = (int) Process.getStartUptimeMillis();
            int i205 = 1740365464 + (((~((-277613412) | startUptimeMillis2)) | 262402 | (~((-237303183) | startUptimeMillis2))) * (-754));
            int i206 = ~((-262403) | startUptimeMillis2);
            int i207 = ~startUptimeMillis2;
            int i208 = i204 + i205 + ((i206 | (~((-237040781) | i207))) * (-754)) + ((i207 | (-277613412)) * 754);
            int i209 = (i208 << 13) ^ i208;
            int i210 = i209 ^ (i209 >>> 17);
            ((int[]) objArr129[1])[0] = i210 ^ (i210 << 5);
        } else {
            Toast.makeText((Context) null, i203 / (((i203 - 1) * i203) % 2), 0).show();
            int i211 = ((int[]) objArr10[1])[0];
            Object[] objArr130 = {new int[]{((int[]) objArr10[0])[0]}, new int[1], new int[]{((int[]) objArr10[2])[0]}, (String[]) objArr10[3]};
            int i212 = ((Context) Class.forName(r1).getMethod(str20, new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
            int i213 = i211 + ((((~((-671358307) | i212)) | 537134336) * (-566)) - 884333612) + ((~(i212 | (-134223971))) * 566);
            int i214 = i213 ^ (i213 << 13);
            int i215 = i214 ^ (i214 >>> 17);
            ((int[]) objArr130[1])[0] = i215 ^ (i215 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
            char jumpTapTimeout3 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
            int edgeSlop4 = 876 - (ViewConfiguration.getEdgeSlop() >> 16);
            int iRed = Color.red(0) + 10;
            Object[] objArr131 = new Object[1];
            a((short) 193, $$a[19], (byte) 42, objArr131);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(jumpTapTimeout3, edgeSlop4, iRed, -1199417970, false, (String) objArr131[0], null);
        }
        long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).getLong(null);
        long jLongValue16 = ((Long) Class.forName(str8).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
            char c15 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
            int edgeSlop5 = (ViewConfiguration.getEdgeSlop() >> 16) + 876;
            int scrollBarSize2 = 10 - (ViewConfiguration.getScrollBarSize() >> 8);
            Object[] objArr132 = new Object[1];
            a((short) ($$b | 128), (byte) (-$$a[14]), (byte) 52, objArr132);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b(c15, edgeSlop5, scrollBarSize2, 254769921, false, (String) objArr132[0], null);
        }
        if (j6 == ((jLongValue16 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).getLong(null) << 52) >>> 52)) >> 12)) {
            int i216 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i216 % 128;
            int i217 = i216 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
                char absoluteGravity2 = (char) Gravity.getAbsoluteGravity(0, 0);
                int iArgb4 = 876 - Color.argb(0, 0, 0, 0);
                int iIndexOf9 = 9 - TextUtils.indexOf((CharSequence) str6, '0', 0);
                short s29 = (short) ($$b | 128);
                byte[] bArr50 = $$a;
                Object[] objArr133 = new Object[1];
                a(s29, bArr50[19], (byte) (-bArr50[81]), objArr133);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b(absoluteGravity2, iArgb4, iIndexOf9, 1324201839, false, (String) objArr133[0], null);
            }
            Object[] objArr134 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).get(null);
            objArr11 = new Object[]{new int[]{((int[]) objArr134[0])[0]}, new int[1], new int[]{((int[]) objArr134[2])[0]}, (String[]) objArr134[3]};
            int iIdentityHashCode8 = System.identityHashCode(this);
            int i218 = (((1187553490 + ((~((-94961713) | iIdentityHashCode8)) * (-301))) + (((~(933961786 | iIdentityHashCode8)) | (~((~iIdentityHashCode8) | 974272015))) * (-301))) + (((~(iIdentityHashCode8 | (-974272016))) | 933961786) * 301)) - 2026955843;
            int i219 = (i218 << 13) ^ i218;
            int i220 = i219 ^ (i219 >>> 17);
            ((int[]) objArr11[1])[0] = i220 ^ (i220 << 5);
        } else {
            Object[] objArr135 = {Integer.valueOf(((Integer) Class.forName(str10).getMethod(str2, Object.class).invoke(null, this)).intValue()), -2026955843};
            byte[] bArr51 = $$d;
            Object[] objArr136 = new Object[1];
            d(bArr51[379], bArr51[15], bArr51[185], objArr136);
            Class<?> cls7 = Class.forName((String) objArr136[0]);
            Object[] objArr137 = new Object[1];
            d(bArr51[133], (short) 96, bArr51[15], objArr137);
            objArr11 = (Object[]) cls7.getMethod((String) objArr137[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr135);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
                char c16 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                int i221 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 875;
                int iResolveSizeAndState4 = 10 - View.resolveSizeAndState(0, 0, 0);
                short s30 = (short) ($$b | 128);
                byte[] bArr52 = $$a;
                Object[] objArr138 = new Object[1];
                a(s30, bArr52[19], (byte) (-bArr52[81]), objArr138);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b(c16, i221, iResolveSizeAndState4, 1324201839, false, (String) objArr138[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).set(null, objArr11);
            try {
                long jLongValue17 = ((Long) Class.forName(str8).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf21 = Long.valueOf(jLongValue17);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
                    char packedPositionChild5 = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                    int iAxisFromString = MotionEvent.axisFromString(str6) + 877;
                    int i222 = 10 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    Object[] objArr139 = new Object[1];
                    a((short) ($$b | 128), (byte) (-$$a[14]), (byte) 52, objArr139);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b(packedPositionChild5, iAxisFromString, i222, 254769921, false, (String) objArr139[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).set(null, lValueOf21);
                Long lValueOf22 = Long.valueOf(jLongValue17 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
                    char mode2 = (char) View.MeasureSpec.getMode(0);
                    int i223 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 876;
                    int iLastIndexOf5 = 9 - TextUtils.lastIndexOf(str6, '0');
                    Object[] objArr140 = new Object[1];
                    a((short) 193, $$a[19], (byte) 42, objArr140);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(mode2, i223, iLastIndexOf5, -1199417970, false, (String) objArr140[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).set(null, lValueOf22);
            } catch (Exception unused11) {
                throw new RuntimeException();
            }
        }
        int i224 = ((int[]) objArr11[2])[0];
        int i225 = ((int[]) objArr11[0])[0];
        if (i225 == i224) {
            int i226 = ((int[]) objArr11[1])[0];
            Object[] objArr141 = {new int[]{((int[]) objArr11[0])[0]}, new int[1], new int[]{((int[]) objArr11[2])[0]}, (String[]) objArr11[3]};
            int elapsedCpuTime3 = (int) Process.getElapsedCpuTime();
            int i227 = i226 + 298930656 + (((~(77977980 | elapsedCpuTime3)) | 10555436) * (-502)) + ((~((~elapsedCpuTime3) | 128843645)) * (-502)) + (((~(elapsedCpuTime3 | (-118288210))) | 77977980) * TypedValues.PositionType.TYPE_DRAWPATH);
            int i228 = (i227 << 13) ^ i227;
            int i229 = i228 ^ (i228 >>> 17);
            ((int[]) objArr141[1])[0] = i229 ^ (i229 << 5);
            return;
        }
        ArrayList arrayList8 = new ArrayList();
        String[] strArr21 = (String[]) objArr11[3];
        if (strArr21 != null) {
            for (String str22 : strArr21) {
                int i230 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i230 % 128;
                int i231 = i230 % 2;
                arrayList8.add(str22);
            }
        }
        int[] iArr9 = new int[i225];
        int i232 = i225 - 1;
        iArr9[i232] = 1;
        Toast.makeText((Context) null, iArr9[((i225 * i232) % 2) - 1], 1).show();
        int i233 = ((int[]) objArr11[1])[0];
        Object[] objArr142 = {new int[]{((int[]) objArr11[0])[0]}, new int[1], new int[]{((int[]) objArr11[2])[0]}, (String[]) objArr11[3]};
        int iIdentityHashCode9 = System.identityHashCode(this);
        int i234 = i233 + (((~((-397347) | iIdentityHashCode9)) | 4243720) * 449) + 346008610 + (((~((~iIdentityHashCode9) | (-397347))) | 4243720) * 449);
        int i235 = (i234 << 13) ^ i234;
        int i236 = i235 ^ (i235 >>> 17);
        ((int[]) objArr142[1])[0] = i236 ^ (i236 << 5);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 43 / 0;
        }
        return null;
    }

    static {
        byte[] bArr = new byte[570];
        System.arraycopy("\u001bAßxò\tñ\u0002\u0005\u00045ºý\u0004ÿ\u0000üýE·A\u0005À\u0007\u0000ú\u00072º\rñÿ\tù\u0000?àç\u0000ú\u0007\u001dÓ\u0000ù\u0001\u0002\u0002ÿ\u0006ò.Ó\u0001ü\u000eìOàáôÿ\t\u0000ý÷Þ\u000bô\nù\u0000\u001dîç\u000b\u0007öù-Ó\u0010ùù\u0007öù\u0000\u0002\n\u0001ù\u0007ô\u0002ú\u0001\u0002ú\b\u0000í\f\u0003í)Ý\nþø\u0007þþ\u0004ë\b÷A\u0003\u0002óÿ\u0003<\u0004Äúù\u000eò\u0003\fô=Ê\u0001ýú\u00022\u0003Ûìø\nçTÑìø\nç%ãù\u0002\u000eýó\u0001>Âûù\u0001\nþý\u0006î\u0000ÿ\u00122Ìíù\n\n4ìÍù\n\n\u000fíòû\u0010òMòó\u0001>Ëñ\u0005öþ\bõF½ý\fñ\röù\u0012ì\nù\u0000?Éú\u0001ýô\u0012ô\b\u0001î\r5éÞð\u0012÷ü'Ú\u0001ýô\u0012ô(áî\r\"Ýî\nò\fôúT°\u0002\n\u0001ù\u0007ôGÿºú\u0001\u0002ú\b\u0000?\u00ad\f\u0003í)Ý\nþøG¿þþ\u0004ë\b÷OðÞ\u000bô\nù\u0000\u001dîç\u000b\u0007öù-Ó\u0010ùù\u0007öù\u0000\u0002\n\u0001ù\u0007ô\u0002ú\u0001\u0002ú\b\u0000í\f\u0003í)Ý\nþø\u0007þþ\u0004ë\b÷@ó\u0001>Æ÷ÿ\u0007ú\u00066Ìò\tñ\u0002\u0005\u00045ÆùùDÄúù\u000eò\u0003\fô=À\u0000\u0000\u0001ô\u0014è\fõ\tù\u0000\u000eø\u0004ýý6³ÿ\u000b\u0000Þ\u000bô\nù\u0000\u001dîç\u000b\u0007öù-Ó\u0010ùù\u0007öù\u0011øú\túú\u0006\u001dÚ\u0007ù\nì\u000eò@ù@»\f\u0003ýî\nò\u0010ìIÄúù\u000eò\u0003\fô=¾þ\nò\u0010ì\u0004üþD¾\fî\ròû\u0014þõ\u00066Þìî\ròû\u0014þõ\u0006\u0014Ú\u0012õ\u0002õ\nó\u0001>Ëñ\u0005öþ\bõFÉ\u0002ì\u00122Éþî\f\u0005ý\u0002øú\túú\u00068éÞî\f\u0005ý\"Øú\túú\u0006\"âì\u0012\rÞ\u0004ü\f@ÿÞÌ\u0003\u000eò\u0003\fô\u0018Ù\nù\u000b\u0002ð\n\u0005\u0016êó\ný\u0002.".getBytes("ISO-8859-1"), 0, bArr, 0, 570);
        $$d = bArr;
        $$e = 220;
        $$a = new byte[]{33, -59, 107, -108, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -29, 31, -48, -17, 4, -24, 1, -6, -13, -13, -29, 38, -50, -16, -1, -12, -24};
        $$b = 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -83722417;
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
    private static java.lang.String $$g(short r6, int r7, short r8) {
        /*
            int r6 = r6 * 2
            int r6 = 1 - r6
            int r8 = r8 * 3
            int r8 = 4 - r8
            byte[] r0 = com.google.android.datatransport.runtime.backends.TransportBackendDiscovery.$$c
            int r7 = 120 - r7
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r5 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r3 = r0[r8]
        L24:
            int r8 = r8 + 1
            int r7 = r7 + r3
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.backends.TransportBackendDiscovery.$$g(short, int, short):java.lang.String");
    }
}
