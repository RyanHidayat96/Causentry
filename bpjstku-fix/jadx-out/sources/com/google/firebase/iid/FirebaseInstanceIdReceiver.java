package com.google.firebase.iid;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.android.gms.tasks.Tasks;
import com.google.android.libraries.places.internal.zzbla;
import com.google.firebase.messaging.FcmBroadcastProcessor;
import com.google.firebase.messaging.MessagingAnalytics;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import kotlin.io.encoding.Base64;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes6.dex */
public final class FirebaseInstanceIdReceiver extends CloudMessagingReceiver {
    private static final byte[] $$d;
    private static final int $$e;
    private static final byte[] $$j;
    private static final int $$k;
    private static final byte[] $$l = {67, -127, -109, 9};
    private static final int $$m = DerHeader.TAG_CLASS_PRIVATE;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final String TAG = "FirebaseMessaging";
    private static int TuitionPaymentFragmentbindingInflater1;
    private static short[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int asBinder;
    private static int b;
    private static int g;

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(short r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 + 84
            int r6 = 206 - r6
            byte[] r0 = com.google.firebase.iid.FirebaseInstanceIdReceiver.$$d
            int r1 = 53 - r7
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L12
            r4 = r7
            r3 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            int r6 = r6 + 1
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            int r3 = r3 + 1
            r4 = r0[r6]
        L26:
            int r4 = -r4
            int r5 = r5 + r4
            int r5 = r5 + (-11)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceIdReceiver.e(short, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void h(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r0 = r8 + 1
            byte[] r1 = com.google.firebase.iid.FirebaseInstanceIdReceiver.$$j
            int r6 = 111 - r6
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L10
            r3 = r7
            r4 = r2
            goto L29
        L10:
            r3 = r2
        L11:
            byte r4 = (byte) r6
            int r7 = r7 + 1
            r0[r3] = r4
            if (r3 != r8) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L20:
            r4 = r1[r7]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L29:
            int r7 = r7 + r6
            int r6 = r7 + (-5)
            r7 = r3
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceIdReceiver.h(byte, short, int, java.lang.Object[]):void");
    }

    private static Intent createServiceIntent(Context context, String str, Bundle bundle) {
        int i = 2 % 2;
        Intent intentPutExtras = new Intent(str).putExtras(bundle);
        int i2 = g + 69;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return intentPutExtras;
    }

    private static void f(int i, int i2, short s, int i3, byte b2, Object[] objArr) throws Throwable {
        long j;
        int i4;
        boolean z;
        int i5;
        int i6 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            char c = '0';
            int i7 = -1;
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b3 = (byte) (-1);
                byte b4 = (byte) (b3 + 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Process.myTid() >> 22), ExpandableListView.getPackedPositionType(0L) + 2267, 32 - TextUtils.lastIndexOf("", '0', 0, 0), 1387473586, false, $$n(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            if (z2) {
                byte[] bArr = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i8 = 0;
                    while (i8 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char mirror = (char) ('0' - AndroidCharacter.getMirror(c));
                            int iArgb = Color.argb(0, 0, 0, 0) + 3358;
                            int threadPriority = 18 - ((Process.getThreadPriority(0) + 20) >> 6);
                            byte b5 = (byte) i7;
                            byte length2 = (byte) $$l.length;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(mirror, iArgb, threadPriority, -1054011043, false, $$n(b5, length2, (byte) (length2 - 4)), new Class[]{Integer.TYPE});
                        }
                        bArr2[i8] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                        i8++;
                        int i9 = $10 + 17;
                        $11 = i9 % 128;
                        int i10 = i9 % 2;
                        c = '0';
                        i7 = -1;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i11 = $10 + 111;
                    $11 = i11 % 128;
                    if (i11 % 2 == 0) {
                        byte[] bArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(b)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) (-1);
                            byte b7 = (byte) (b6 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 2267 - (ViewConfiguration.getTouchSlop() >> 8), 33 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1387473586, false, $$n(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i5 = ((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) & 3046761265686732006L)) << ((int) (((long) TuitionPaymentFragmentbindingInflater1) % 3046761265686732006L));
                    } else {
                        byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(b)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b8 = (byte) (-1);
                            byte b9 = (byte) (b8 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 2267 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (Process.myPid() >> 22) + 33, 1387473586, false, $$n(b8, b9, b9), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i5 = ((byte) (((long) bArr4[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L));
                    }
                    iIntValue = (byte) i5;
                    j = 3046761265686732006L;
                } else {
                    j = 3046761265686732006L;
                    iIntValue = (short) (((short) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1[i + ((int) (((long) b) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)));
                }
            } else {
                j = 3046761265686732006L;
            }
            if (iIntValue > 0) {
                int i12 = ((i + iIntValue) - 2) + ((int) (((long) b) ^ j));
                if (z2) {
                    int i13 = $11;
                    int i14 = i13 + 113;
                    $10 = i14 % 128;
                    i4 = i14 % 2 != 0 ? 0 : 1;
                    int i15 = i13 + 3;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
                } else {
                    i4 = 0;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i12 + i4;
                Object[] objArr6 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b10 = (byte) (-1);
                    byte b11 = (byte) (-b10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (ImageFormat.getBitsPerPixel(0) + 55905), AndroidCharacter.getMirror('0') + 2807, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 13, -1529949196, false, $$n(b10, b11, (byte) (b11 - 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (bArr5 != null) {
                    int length3 = bArr5.length;
                    byte[] bArr6 = new byte[length3];
                    for (int i17 = 0; i17 < length3; i17++) {
                        bArr6[i17] = (byte) (((long) bArr5[i17]) ^ 3046761265686732006L);
                    }
                    bArr5 = bArr6;
                }
                if (bArr5 != null) {
                    int i18 = $11 + 117;
                    $10 = i18 % 128;
                    int i19 = i18 % 2;
                    z = true;
                } else {
                    z = false;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    if (z) {
                        byte[] bArr7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i20 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i20 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr7[i20]) ^ 3046761265686732006L)) + s)) ^ b2));
                    } else {
                        short[] sArr = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i21 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i21 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i21]) ^ 3046761265686732006L)) + s)) ^ b2));
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    public final int onMessageReceive(Context context, CloudMessage cloudMessage) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113;
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (29945 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
            int packedPositionType = 1755 - ExpandableListView.getPackedPositionType(0L);
            int i2 = 24 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            byte b2 = $$d[7];
            Object[] objArr2 = new Object[1];
            e(b2, (short) (b2 | 203), (byte) 15, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, packedPositionType, i2, 986134021, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        f((ViewConfiguration.getScrollBarSize() >> 8) - 245203357, 1028625603 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (short) (ViewConfiguration.getEdgeSlop() >> 16), View.combineMeasuredStates(0, 0) + 17, (byte) (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        f(TextUtils.lastIndexOf("", '0', 0, 0) - 245203335, 1028625608 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (short) View.MeasureSpec.getMode(0), (ViewConfiguration.getScrollBarSize() >> 8) + 10, (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) (29944 - TextUtils.indexOf("", "", 0));
            int i3 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1755;
            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 23;
            byte b3 = $$d[7];
            byte b4 = b3;
            byte b5 = b3;
            Object[] objArr5 = new Object[1];
            e(b4, (short) (b4 | 166), b5, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, i3, fadingEdgeLength, 1596667560, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = g + 61;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char packedPositionType2 = (char) (29944 - ExpandableListView.getPackedPositionType(0L));
                int i6 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1754;
                int gidForName = 22 - Process.getGidForName("");
                byte b6 = $$d[7];
                byte b7 = b6;
                Object[] objArr6 = new Object[1];
                e(b7, (short) (b7 | 114), b6, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionType2, i6, gidForName, 1599039318, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113 = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[1], (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = ~((-615284741) | iIdentityHashCode);
            int i8 = ~iIdentityHashCode;
            int i9 = (-2108100255) + ((i7 | (~(1023277055 | i8))) * 920) + (((~((-620594742) | i8)) | 615284740) * 920) + (((~(iIdentityHashCode | 1023277055)) | (~((-615284741) | i8)) | (~((-5310002) | iIdentityHashCode))) * 920) + 186460526;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[3])[0] = i11 ^ (i11 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            f((Process.myPid() >> 22) - 245203322, (ViewConfiguration.getPressedStateDuration() >> 16) + 1028625612, (short) TextUtils.getCapsMode("", 0, 0), 10 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (byte) ((Process.getThreadPriority(0) + 20) >> 6), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            f((ViewConfiguration.getScrollDefaultDelay() >> 16) - 245203307, 1028625611 - Color.red(0), (short) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 10, (byte) TextUtils.getCapsMode("", 0, 0), objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {1821564382};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ExpandableListView.getPackedPositionType(0L) + 42049), 1726 - (ViewConfiguration.getScrollBarSize() >> 8), 29 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113 = zzbla.TuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), 186460526, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char bitsPerPixel = (char) (29943 - ImageFormat.getBitsPerPixel(0));
                    int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1755;
                    int i12 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23;
                    byte b8 = $$d[7];
                    byte b9 = b8;
                    Object[] objArr11 = new Object[1];
                    e(b9, (short) (b9 | 114), b8, objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(bitsPerPixel, maximumDrawingCacheSize, i12, 1599039318, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113);
                try {
                    Object[] objArr12 = new Object[1];
                    f((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 245203357, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1028625603, (short) (ViewConfiguration.getScrollDefaultDelay() >> 16), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 17, (byte) (ViewConfiguration.getTapTimeout() >> 16), objArr12);
                    Class<?> cls3 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    f((-245203336) - TextUtils.getTrimmedLength(""), MotionEvent.axisFromString("") + 1028625608, (short) TextUtils.indexOf("", ""), 10 - View.MeasureSpec.getSize(0), (byte) (ViewConfiguration.getWindowTouchSlop() >> 8), objArr13);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cIndexOf2 = (char) (TextUtils.indexOf("", "", 0, 0) + 29944);
                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 1755;
                        int bitsPerPixel2 = 22 - ImageFormat.getBitsPerPixel(0);
                        byte b10 = $$d[7];
                        byte b11 = b10;
                        Object[] objArr14 = new Object[1];
                        e(b11, (short) (b11 | 166), b10, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf2, iCombineMeasuredStates, bitsPerPixel2, 1596667560, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 29944);
                        int i13 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1754;
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 23;
                        byte b12 = $$d[7];
                        Object[] objArr15 = new Object[1];
                        e(b12, (short) (b12 | 203), (byte) 15, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(scrollBarSize, i13, iKeyCodeFromString, 986134021, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                    int i14 = asBinder + 119;
                    g = i14 % 128;
                    int i15 = i14 % 2;
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
        if (((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[0])[0] != ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[4];
            if (strArr == null) {
                throw null;
            }
            for (String str : strArr) {
                arrayList.add(str);
            }
            throw null;
        }
        int i16 = asBinder + 15;
        g = i16 % 128;
        int i17 = i16 % 2;
        int i18 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[3])[0];
        Object[] objArr16 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[4]};
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        int i19 = ~startUptimeMillis;
        int i20 = i18 + 1541093546 + (((~((-769385318) | i19)) | (-556782892)) * 519) + (((~(i19 | (-554418466))) | (~((-2364427) | startUptimeMillis))) * (-519)) + (((~(startUptimeMillis | (-556782892))) | 769385317) * 519);
        int i21 = (i20 << 13) ^ i20;
        int i22 = i21 ^ (i21 >>> 17);
        ((int[]) objArr16[3])[0] = i22 ^ (i22 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char gidForName2 = (char) (Process.getGidForName("") + 1);
            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 876;
            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 10;
            byte b13 = $$d[7];
            Object[] objArr17 = new Object[1];
            e(b13, (short) (b13 | 203), (byte) 15, objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(gidForName2, offsetBefore, windowTouchSlop, -1650998592, false, (String) objArr17[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null);
        Object[] objArr18 = new Object[1];
        f((-261980573) - Color.rgb(0, 0, 0), TextUtils.indexOf((CharSequence) "", '0') + 1028625604, (short) TextUtils.getOffsetAfter("", 0), 17 - View.resolveSize(0, 0), (byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), objArr18);
        Class<?> cls4 = Class.forName((String) objArr18[0]);
        Object[] objArr19 = new Object[1];
        f(View.getDefaultSize(0, 0) - 245203336, 1028625607 - Color.alpha(0), (short) View.MeasureSpec.getSize(0), ExpandableListView.getPackedPositionGroup(0L) + 10, (byte) View.MeasureSpec.getMode(0), objArr19);
        long jLongValue3 = ((Long) cls4.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cResolveSize = (char) View.resolveSize(0, 0);
            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 876;
            int scrollBarSize2 = 10 - (ViewConfiguration.getScrollBarSize() >> 8);
            byte b14 = $$d[7];
            byte b15 = b14;
            Object[] objArr20 = new Object[1];
            e(b15, (short) (b15 | 114), b14, objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cResolveSize, scrollBarFadeDuration, scrollBarSize2, 2012020043, false, (String) objArr20[0], null);
        }
        if (j2 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cResolveSize2 = (char) View.resolveSize(0, 0);
                int iBlue = 876 - Color.blue(0);
                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 10;
                byte b16 = $$d[7];
                byte b17 = b16;
                Object[] objArr21 = new Object[1];
                e(b17, (short) (b17 | 62), b16, objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cResolveSize2, iBlue, scrollDefaultDelay, 2012931276, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[1], new int[]{((int[]) objArr22[2])[0]}, (String[]) objArr22[3]};
            int i23 = (~new Random().nextInt(803019316)) | 828747496;
            int i24 = ((556588331 + (i23 * 495)) + (((~i23) | 285288168) * 495)) - 57245755;
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr[1])[0] = i26 ^ (i26 << 5);
        } else {
            Context applicationContext = context != null ? ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) ? null : context.getApplicationContext() : context;
            Object[] objArr23 = new Object[1];
            f((-245203322) - Color.argb(0, 0, 0, 0), 1028625612 - KeyEvent.normalizeMetaState(0), (short) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Color.red(0) + 11, (byte) (ViewConfiguration.getLongPressTimeout() >> 16), objArr23);
            Class<?> cls5 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            f((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 245203307, (ViewConfiguration.getScrollBarSize() >> 8) + 1028625611, (short) ExpandableListView.getPackedPositionGroup(0L), AndroidCharacter.getMirror('0') - '%', (byte) View.MeasureSpec.makeMeasureSpec(0, 0), objArr24);
            try {
                Object[] objArr25 = {applicationContext, Integer.valueOf(((Integer) cls5.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue()), 0, -57245755};
                byte[] bArr = $$j;
                byte b18 = bArr[93];
                short s = bArr[113];
                Object[] objArr26 = new Object[1];
                h(b18, s, (short) (s & 67), objArr26);
                Class<?> cls6 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                h(bArr[360], (short) (-bArr[118]), bArr[525], objArr27);
                objArr = (Object[]) cls6.getMethod((String) objArr27[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr25);
                if (applicationContext != null) {
                    int i27 = g + 95;
                    asBinder = i27 % 128;
                    int i28 = i27 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                        char c2 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                        int longPressTimeout = 876 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        int scrollBarFadeDuration2 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 10;
                        byte b19 = $$d[7];
                        byte b20 = b19;
                        Object[] objArr28 = new Object[1];
                        e(b20, (short) (b20 | 62), b19, objArr28);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(c2, longPressTimeout, scrollBarFadeDuration2, 2012931276, false, (String) objArr28[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, objArr);
                    try {
                        Object[] objArr29 = new Object[1];
                        f(Color.blue(0) - 245203357, 1028625603 - ExpandableListView.getPackedPositionGroup(0L), (short) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), (ViewConfiguration.getWindowTouchSlop() >> 8) + 17, (byte) (TextUtils.lastIndexOf("", '0') + 1), objArr29);
                        Class<?> cls7 = Class.forName((String) objArr29[0]);
                        Object[] objArr30 = new Object[1];
                        f((Process.myTid() >> 22) - 245203336, 1028625606 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (short) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 9 - Process.getGidForName(""), (byte) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), objArr30);
                        long jLongValue4 = ((Long) cls7.getDeclaredMethod((String) objArr30[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf3 = Long.valueOf(jLongValue4);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                            char cIndexOf3 = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                            int windowTouchSlop2 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 876;
                            int offsetBefore2 = 10 - TextUtils.getOffsetBefore("", 0);
                            byte b21 = $$d[7];
                            byte b22 = b21;
                            Object[] objArr31 = new Object[1];
                            e(b22, (short) (b22 | 114), b21, objArr31);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cIndexOf3, windowTouchSlop2, offsetBefore2, 2012020043, false, (String) objArr31[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, lValueOf3);
                        Long lValueOf4 = Long.valueOf(jLongValue4 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                            char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                            int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 877;
                            int iGreen = 10 - Color.green(0);
                            byte b23 = $$d[7];
                            Object[] objArr32 = new Object[1];
                            e(b23, (short) (b23 | 203), (byte) 15, objArr32);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(capsMode, iLastIndexOf, iGreen, -1650998592, false, (String) objArr32[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf4);
                    } catch (Exception unused2) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }
        int i29 = ((int[]) objArr[2])[0];
        int i30 = ((int[]) objArr[0])[0];
        if (i30 == i29) {
            int i31 = asBinder + 93;
            g = i31 % 128;
            int i32 = i31 % 2;
            int i33 = ((int[]) objArr[1])[0];
            Object[] objArr33 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i34 = ~iIdentityHashCode2;
            int i35 = (~(58394155 | i34)) | (-133897772) | (~(98704384 | i34));
            int i36 = i33 + 1841452140 + (((~(iIdentityHashCode2 | (-23200769))) | i35) * 590) + (i35 * (-1180)) + (((~((-98704385) | i34)) | (~(i34 | (-58394156)))) * 590);
            int i37 = (i36 << 13) ^ i36;
            int i38 = i37 ^ (i37 >>> 17);
            ((int[]) objArr33[1])[0] = i38 ^ (i38 << 5);
        } else {
            int[] iArr = new int[i30];
            int i39 = i30 - 1;
            iArr[i39] = 1;
            Toast.makeText((Context) null, iArr[((i30 * i39) % 2) - 1], 1).show();
            int i40 = ((int[]) objArr[1])[0];
            Object[] objArr34 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i41 = ~((-998772651) | iIdentityHashCode3);
            int i42 = ~iIdentityHashCode3;
            int i43 = i40 + (-145710636) + ((i41 | (~((-958462422) | i42))) * (-1808)) + (((~((-42468907) | iIdentityHashCode3)) | (~(i42 | (-2158678)))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(iIdentityHashCode3 | 958462421)) | 956303744 | (~(998772650 | i42))) * TypedValues.Custom.TYPE_BOOLEAN);
            int i44 = (i43 << 13) ^ i43;
            int i45 = i44 ^ (i44 >>> 17);
            ((int[]) objArr34[1])[0] = i45 ^ (i45 << 5);
        }
        try {
            return ((Integer) Tasks.await(new FcmBroadcastProcessor(context).process(cloudMessage.getIntent()))).intValue();
        } catch (InterruptedException | ExecutionException unused3) {
            return 500;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002c A[PHI: r5
  0x002c: PHI (r5v5 android.content.Intent) = (r5v1 android.content.Intent), (r5v6 android.content.Intent) binds: [B:8:0x002a, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    public final void onNotificationDismissed(Context context, Bundle bundle) {
        Intent intentCreateServiceIntent;
        int i = 2 % 2;
        int i2 = g + 29;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            intentCreateServiceIntent = createServiceIntent(context, CloudMessagingReceiver.IntentActionKeys.NOTIFICATION_DISMISS, bundle);
            int i3 = 75 / 0;
            if (!(!MessagingAnalytics.shouldUploadScionMetrics(intentCreateServiceIntent))) {
                MessagingAnalytics.logNotificationDismiss(intentCreateServiceIntent);
            }
        } else {
            intentCreateServiceIntent = createServiceIntent(context, CloudMessagingReceiver.IntentActionKeys.NOTIFICATION_DISMISS, bundle);
            if (!(!MessagingAnalytics.shouldUploadScionMetrics(intentCreateServiceIntent))) {
                MessagingAnalytics.logNotificationDismiss(intentCreateServiceIntent);
            }
        }
        int i4 = asBinder + 121;
        g = i4 % 128;
        int i5 = i4 % 2;
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1219821051
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver, android.content.BroadcastReceiver
    public final void onReceive(android.content.Context r46, android.content.Intent r47) {
        /*
            Method dump skipped, instruction units count: 12210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceIdReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }

    static {
        byte[] bArr = new byte[649];
        System.arraycopy("\u0019£\u0088Ð\u0011\u0003Æ>\r\u0005ý\nþÎ=\b\u000eø\u0002\u0004\u0017÷ÎIø\r\u0007\nö\u0003\u0011\u0004ý\b\u0003Ì\u001d(\u000eø\u0002\u0004\u0017÷ò\u0018\r\u0007\nöã1\u0004ý\b\u0003á.\u0002\u0001\u000e\u000bÖ8ð\u0007\u0010\tú\u000b\u0004&ù\u0010ú\u000b\u0004ç\u0016\u001dùý\u000e\u000b×1ô\u000b\u000bý\u000e\u000bó\f\nû\n\nþç*ý\u000bú\u0018ö\u0012Ä\u0011\u0003Æ9\u0013ÿ\u000e\u0006ü\u000f¾G\u0007ø\u0013÷\u000e\u000bò\u0018ú\u000b\u0004Å8\u0007\u0005\u0011\u000bþ\u000b¿D\u0007ú\u0006\fÇ 0ö\rÙ9\u0004\u0000ú\u0006\u0002\f\u0010á\u0016\u0016\u0007úÿ\u000b\fö\u0012\u000bµ5&ù\u0010ú\u000b\u0004ç\u0016\u001dùý\u000e\u000b×1ô\u000b\u000bý\u000e\u000bó\f\nû\n\nþç*ý\u000bú\u0018ö\u0012Ä&ù\u0010ú\u000b\u0004ç\u0016\u001dùý\u000e\u000b×1ô\u000b\u000bý\u000e\u000b\u0004\u0002ú\u0003\u000bý\u0010\u0002\n\u0003\u0002\nü\u0004\u0017ø\u0001\u0017Û'ú\u0006\fý\u0006\u0006\u0000\u0019ü\rÂ9ô\n\u000bé&\u0003ø\u0001\u0011á)\b\u0001Þ8\u0001ö\u0012\u0001ø\u0010ì+ú\u000bù\u0002\u0014úÿî\u001a\u0011ú\u0007\u0002ÔùE\u000eþ\u0001\u0012ì è\u0017\u0013\u0005û\u000b\u0004\u0011\u0003Æ>\r\u0005ý\nþÎ8\u0012û\u0013\u0002ÿ\u0000Ï>\u000b\u000bÀ8\u0019\u0004ùË8\u0014þÊ@\u0000\u0006\u000e\u000bú\u0010\nº\u0019(\u0007\u0007\nê\u001b\u0003\fà*é\u0018\u0011\tõ\u0013\u0006µ1\u0016\u0017\u0005ýÿ\u0019Ö.\u0001\u0004é\u0018\u0011\tõ\u0013\u0006à&\tú\u000b\u0004\n¶#8ù\bý\u0006\u0012\u0011\u0003ÆPí\u0010ú\u0012\u000bú\u000fÀLó\u0014\u0002\u0006ÃL\u0004ú\bÇ\u0019,\u0010þù\u0014á(÷\bö$ú\b\f\u0004ê\u0017\u0001\u0016ö\nà.\u0002ÿ\rÿ\u0004\u0011\u0003Æ9\u0013ÿ\u000e\u0006ü\u000f¾G\u0007ø\u0013÷\u000e\u000bò\u0018ú\u000b\u0004ÅDý\rú\b\u0012\u0006ú\u0006\fÃ8\u0007\u0005\u0011\u000bþ\u000bò\u0007\u0016ú\u0012ð\u0018ú\u000b\u0004ÅEü\u0017ï\u0007\u0016ú\u0012ð\u0018ú\u000b\u0004Å%\u001c\u0017Þ\u001d\f\u0004üö\u0014\u0012ü\u0002\bÿ\u0003\u0018ú\u000b\u0004é\u0018\u0013÷\u0014Ò'\u0016ú\u0012ø\u0010\n°5&ù\u0010ú\u000b\u0004ç\u0016\u001dùý\u000e\u000b×1ô\u000b\u000bý\u000e\u000bó\f\nû\n\nþç*ý\u000bú\u0018ö\u0012Ä&ù\u0010ú\u000b\u0004ç\u0016\u001dùý\u000e\u000b×1ô\u000b\u000bý\u000e\u000b\u0004\u0002ú\u0003\u000bý\u0010\u0002\n\u0003\u0002\nü\u0004\u0017ø\u0001\u0017Û'ú\u0006\fý\u0006\u0006\u0000\u0019ü\rÄ".getBytes("ISO-8859-1"), 0, bArr, 0, 649);
        $$j = bArr;
        $$k = 34;
        $$d = new byte[]{29, 88, -118, 32, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -29, 31, -48, -17, 4, -24, 1, -6, -13, -13, -29, 38, -50, -16, -1, -12, -24};
        $$e = 176;
        asBinder = 0;
        g = 1;
        b = -2110726789;
        TuitionPaymentFragmentbindingInflater1 = -1934795549;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1310537592;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new byte[]{-18, 18, -27, -49, 48, -18, 23, -25, 28, -64, -61, 93, -30, -89, 44, 29, 28, 27, -24, 16, -21, 30, -30, 19, -18, -19, 26, -11, 8, 25, 20, -27, -23, 19, -31, -18, 23, -25, 28, -64, -61, 33, 31, -21, 19, -40, 43, 13, -13, 17, -25, 19, -54, Base64.padSymbol, 19, -12, -1, 41, -29, -19, 19, -32, -17, -25, 29, -42, 42, -30, -26, -56, 26, 25, 49, -42, 28, -30, 53, -49, -18, 41, -54, -28, 40, 25, -56, -30, 25, 41, -29, -49, -31, -26, 30, -31, 55, -50, -26, -29, 54, -41, -28, 41, -51, 52, -27, -51, -26, -28, 54, -55, -29, 28, -28, 50, 26, -26, -42, 41, -26, -53, -27, 54, -30, -25, -26, 29, -25, -43, -42, -32, 41, -53, -28, 42, -27, -41, 25, 25, 52, -49, -26, 48, -52, -32, -26, 25, 27, -25, 54, -25, -43, -26, 55, 26, -41, -27, 26, 53, -49, -25, 25, -26, -32, 28, 49, -56, 52, -54, 54, -55, -28, -28, 27, -27, -25, 24, 40, -46, 43, -27, -44, 44, -25, -56, 51, -53, -29, 28, 52, -27, 24, -26, -26, -26, -26, -26, -26};
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
    private static java.lang.String $$n(short r6, int r7, short r8) {
        /*
            int r6 = r6 + 4
            int r8 = r8 * 3
            int r8 = 1 - r8
            int r7 = r7 + 117
            byte[] r0 = com.google.firebase.iid.FirebaseInstanceIdReceiver.$$l
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            int r6 = r6 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r3 = r0[r6]
        L24:
            int r3 = -r3
            int r7 = r7 + r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceIdReceiver.$$n(short, int, short):java.lang.String");
    }
}
