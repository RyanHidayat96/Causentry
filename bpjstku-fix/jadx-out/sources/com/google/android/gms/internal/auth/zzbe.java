package com.google.android.gms.internal.auth;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.android.gms.auth.api.AuthProxy;
import com.google.android.gms.auth.api.AuthProxyOptions;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import defpackage.abortCapture;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.io.encoding.Base64;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes6.dex */
public final class zzbe extends GmsClient {
    private final Bundle zze;
    private static final byte[] $$l = {58, 66, -1, 15};
    private static final int $$m = 184;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {93, -122, -23, -24, 8, 25, -24, 29, 8, 22, 13, -4, 15, 15, 3, -20, 37, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55};
    private static final int $$k = ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION;
    private static final byte[] $$d = {82, Base64.padSymbol, -66, -42, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$e = 30;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static long b = -7848838874643388876L;

    public zzbe(Context context, Looper looper, ClientSettings clientSettings, AuthProxyOptions authProxyOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        Bundle bundleZza;
        super(context, looper, 16, clientSettings, connectionCallbacks, onConnectionFailedListener);
        if (authProxyOptions != null) {
            bundleZza = authProxyOptions.zza();
            int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
            TuitionPaymentFragmentbindingInflater1 = i % 128;
            if (i % 2 != 0) {
            }
            this.zze = bundleZza;
        }
        bundleZza = new Bundle();
        int i2 = TuitionPaymentFragmentbindingInflater1 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 2 % 2;
        this.zze = bundleZza;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = 53 - r7
            int r8 = r8 * 52
            int r8 = r8 + 4
            int r9 = r9 * 14
            int r9 = r9 + 84
            byte[] r0 = com.google.android.gms.internal.auth.zzbe.$$d
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L29
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L24:
            r3 = r0[r8]
            r6 = r3
            r3 = r9
            r9 = r6
        L29:
            int r9 = -r9
            int r3 = r3 + r9
            int r9 = r3 + (-10)
            int r8 = r8 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzbe.f(short, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void h(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.android.gms.internal.auth.zzbe.$$j
            int r6 = r6 + 4
            int r8 = r8 * 19
            int r8 = r8 + 84
            int r7 = r7 * 39
            int r1 = r7 + 14
            byte[] r1 = new byte[r1]
            int r7 = r7 + 13
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2f
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r6 = r6 + 1
            r3 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2f:
            int r3 = r3 + r6
            int r6 = r3 + (-10)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzbe.h(int, short, short, java.lang.Object[]):void");
    }

    private static void g(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(b ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        int i3 = $10 + 49;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (abortcapture.b < cArrB.length) {
            int i5 = $11 + 19;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i7 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(b)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf("", "") + 64838);
                    int fadingEdgeLength = 1356 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int i8 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 37;
                    byte b2 = (byte) ($$l[2] + 1);
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, fadingEdgeLength, i8, 894276454, false, $$n(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Drawable.resolveOpacity(0, 0) + 47773), TextUtils.getCapsMode("", 0, 0) + 468, 13 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 896083767, false, "n", new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
        int i9 = $11 + 47;
        $10 = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 26 / 0;
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cLastIndexOf = (char) (31532 - TextUtils.lastIndexOf("", '0'));
            int i3 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 920;
            int tapTimeout = 28 - (ViewConfiguration.getTapTimeout() >> 16);
            byte[] bArr = $$d;
            Object[] objArr2 = new Object[1];
            f((byte) 52, bArr[80], bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, i3, tapTimeout, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        g(new char[]{45837, 45932, 42206, 9421, 59618, 63319, 48141, 5075, 33322, 55597, 60741, 57671, 53746, 2639, 57303, 45186, Typography.euro, 17543, 2245, 36860, 30272, 46575, 31077, 23854, 17670, 58895}, ViewConfiguration.getScrollBarFadeDuration() >> 16, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        g(new char[]{51088, 51189, 2855, 27381, 18201, 48800, 62000, 23078, 63147, 30424, 41853, 43212, 42341, 42404, 37293, 63826, 21537, 60256, 18156}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char longPressTimeout = (char) (31533 - (ViewConfiguration.getLongPressTimeout() >> 16));
            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 921;
            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 28;
            byte b2 = $$d[80];
            byte b3 = b2;
            Object[] objArr5 = new Object[1];
            f(b2, b3, b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(longPressTimeout, maximumDrawingCacheSize, jumpTapTimeout, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cAlpha = (char) (31533 - Color.alpha(0));
                int trimmedLength = TextUtils.getTrimmedLength("") + 921;
                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 28;
                byte[] bArr2 = $$d;
                Object[] objArr6 = new Object[1];
                f((byte) (-bArr2[33]), bArr2[7], bArr2[80], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cAlpha, trimmedLength, iCombineMeasuredStates, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i4 = ~((-836451155) | startElapsedRealtime);
            int i5 = ~startElapsedRealtime;
            int i6 = (((504082019 + ((i4 | (~(937628489 | i5))) * (-1808))) + (((~((-834868033) | startElapsedRealtime)) | (~(i5 | 939211611))) * TypedValues.Custom.TYPE_BOOLEAN)) + ((((~(startElapsedRealtime | (-937628490))) | 1583122) | (~(836451154 | i5))) * TypedValues.Custom.TYPE_BOOLEAN)) - 150482607;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            g(new char[]{49731, 49698, 50285, 62490, 34897, 13924, 27866, 53984, 62308, 47518, 15762, 8308, 41138, 27391, 3934, 29132, 20954, 9252, 55314, 20163, 1813, 54646, 43434, 39947, 13439, 34495, 31588, 60767, 58770, 45067}, Gravity.getAbsoluteGravity(0, 0), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            g(new char[]{654, 749, 63181, 22053, 47850, 41149, 52979, 17465, 13219, 35641, 40893, 46786, 24686, 22623, 44413, 59218, 37173, 5766, 31277, 55322, 51137, 59345}, View.resolveSizeAndState(0, 0, 0), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            g(new char[]{51053, 50951, 8273, 40261, 27746, 31376, 1431, 40455, 62987, 23975, 21704, 27840, 42394, 36509, 26146, 15727, 21702, 49167, 45404, 563}, KeyEvent.normalizeMetaState(0), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            g(new char[]{39121, 39096, 55616, 48031, 38262, 32272, 9054, 39560, 43501, 42163, 29191, 26711, 64009, 30659, 16600, 14846, 2890, 14597, 38791, 1723}, ViewConfiguration.getTapTimeout() >> 16, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -150482607};
                byte[] bArr3 = $$j;
                byte b4 = bArr3[20];
                Object[] objArr13 = new Object[1];
                h(b4, (byte) (b4 + 1), bArr3[50], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b5 = (byte) (bArr3[10] - 1);
                byte b6 = bArr3[50];
                Object[] objArr14 = new Object[1];
                h(b5, b6, (byte) (b6 - 1), objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 31534);
                    int iNormalizeMetaState = 921 - KeyEvent.normalizeMetaState(0);
                    int i9 = 28 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    byte[] bArr4 = $$d;
                    Object[] objArr16 = new Object[1];
                    f((byte) (-bArr4[33]), bArr4[7], bArr4[80], objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf2, iNormalizeMetaState, i9, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    g(new char[]{45837, 45932, 42206, 9421, 59618, 63319, 48141, 5075, 33322, 55597, 60741, 57671, 53746, 2639, 57303, 45186, Typography.euro, 17543, 2245, 36860, 30272, 46575, 31077, 23854, 17670, 58895}, Color.blue(0), objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    g(new char[]{51088, 51189, 2855, 27381, 18201, 48800, 62000, 23078, 63147, 30424, 41853, 43212, 42341, 42404, 37293, 63826, 21537, 60256, 18156}, Gravity.getAbsoluteGravity(0, 0), objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cMyPid = (char) ((Process.myPid() >> 22) + 31533);
                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 921;
                        int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 28;
                        byte b7 = $$d[80];
                        byte b8 = b7;
                        Object[] objArr19 = new Object[1];
                        f(b7, b8, b8, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMyPid, absoluteGravity, iIndexOf, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cIndexOf = (char) (31532 - TextUtils.indexOf((CharSequence) "", '0'));
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 922;
                        int i10 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 28;
                        byte[] bArr5 = $$d;
                        Object[] objArr20 = new Object[1];
                        f((byte) 52, bArr5[80], bArr5[7], objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, iLastIndexOf, i10, -1048449946, false, (String) objArr20[0], null);
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
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 123;
                TuitionPaymentFragmentbindingInflater1 = i11 % 128;
                int i12 = i11 % 2;
                while (i2 < strArr.length) {
                    int i13 = TuitionPaymentFragmentbindingInflater1 + 7;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i13 % 128;
                    if (i13 % 2 != 0) {
                        arrayList.add(strArr[i2]);
                        i2 += 49;
                    } else {
                        arrayList.add(strArr[i2]);
                        i2++;
                    }
                }
            }
            throw null;
        }
        int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
        TuitionPaymentFragmentbindingInflater1 = i14 % 128;
        int i15 = i14 % 2;
        int i16 = ((int[]) objArr[0])[0];
        Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int i17 = (int) Runtime.getRuntime().totalMemory();
        int i18 = ~i17;
        int i19 = i16 + (-26967985) + (((-1435347996) | i17) * (-676)) + (((~(170938720 | i18)) | 1435347995) * 676) + (((~(i17 | 1606286715)) | (~(i18 | (-1603140924))) | 167792928) * 676);
        int i20 = (i19 << 13) ^ i19;
        int i21 = i20 ^ (i20 >>> 17);
        ((int[]) objArr21[0])[0] = i21 ^ (i21 << 5);
        if (iBinder == null) {
            int i22 = TuitionPaymentFragmentbindingInflater1 + 37;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i22 % 128;
            if (i22 % 2 == 0) {
                return null;
            }
            throw null;
        }
        String strConcat = "29\\22\\".concat("com.google.android.gms.auth.api.internal.IAuthService");
        int i23 = ((int[]) objArr21[0])[0];
        int i24 = i23 * i23;
        int i25 = -(2135573531 * i23);
        int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
        int i27 = -(i23 * 964867689);
        int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
        int i29 = (i28 ^ 2111931652) + ((2111931652 & i28) << 1);
        int i30 = i29 >> 21;
        int i31 = ((i30 & (-4095)) + (i30 | (-4095))) / 2048;
        int i32 = (i31 ^ 1) + ((i31 & 1) << 1);
        int i33 = (i29 ^ i32) + ((i32 & i29) << 1);
        int i34 = i29 >> 25;
        int i35 = -(i33 ^ ((((i34 ^ (-255)) + ((i34 & (-255)) << 1)) / 128) + 1));
        int i36 = (i35 ^ 6) + ((i35 & 6) << 1);
        int i37 = (((i36 >> 20) - 8191) / 4096) + 1;
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(strConcat.substring(48024 / (((-(((i37 | 1) << 1) - (i37 ^ 1))) & i36) * 1334)));
        return iInterfaceQueryLocalInterface instanceof zzbh ? (zzbh) iInterfaceQueryLocalInterface : new zzbh(iBinder);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0031 A[PHI: r1
  0x0031: PHI (r1v5 com.google.android.gms.common.internal.ClientSettings) = 
  (r1v4 com.google.android.gms.common.internal.ClientSettings)
  (r1v14 com.google.android.gms.common.internal.ClientSettings)
 binds: [B:8:0x002f, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean requiresSignIn() {
        ClientSettings clientSettings;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 79;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            clientSettings = getClientSettings();
            int i3 = 61 / 0;
            if (!TextUtils.isEmpty(clientSettings.getAccountName())) {
                if (!clientSettings.getApplicableScopes(AuthProxy.API).isEmpty()) {
                    int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
                    TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                    int i5 = i4 % 2;
                    return true;
                }
            }
        } else {
            clientSettings = getClientSettings();
            if (!TextUtils.isEmpty(clientSettings.getAccountName())) {
                if (!clientSettings.getApplicableScopes(AuthProxy.API).isEmpty()) {
                    int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
                    TuitionPaymentFragmentbindingInflater1 = i6 % 128;
                    int i7 = i6 % 2;
                    return true;
                }
            }
        }
        int i8 = TuitionPaymentFragmentbindingInflater1 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
        if (i8 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle getGetServiceRequestExtraArgs() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        Bundle bundle = this.zze;
        int i5 = i2 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = i3 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 94 / 0;
        }
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return "com.google.android.gms.auth.api.internal.IAuthService";
        }
        int i3 = 9 / 0;
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 15;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 53;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            return "com.google.android.gms.auth.service.START";
        }
        throw null;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        throw null;
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
    private static java.lang.String $$n(short r6, byte r7, int r8) {
        /*
            byte[] r0 = com.google.android.gms.internal.auth.zzbe.$$l
            int r7 = r7 * 4
            int r7 = r7 + 107
            int r8 = r8 * 3
            int r1 = 1 - r8
            int r6 = r6 * 4
            int r6 = 4 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L2b
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L26:
            r3 = r0[r6]
            r5 = r3
            r3 = r7
            r7 = r5
        L2b:
            int r7 = -r7
            int r6 = r6 + 1
            int r7 = r7 + r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzbe.$$n(short, byte, int):java.lang.String");
    }
}
