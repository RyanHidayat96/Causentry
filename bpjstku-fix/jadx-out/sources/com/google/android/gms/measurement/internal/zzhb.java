package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import defpackage.lambdastart1androidxcameravideointernalaudioAudioSource;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;

/* JADX INFO: loaded from: classes5.dex */
final class zzhb extends BroadcastReceiver {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final zzpg zza;
    private boolean zzb;
    private boolean zzc;
    private static final byte[] $$d = {39, -79, 42, 39, -5, 2, -14, 9, -42, 32, 18, -30, 34, 6, -12, -6, -33, 45, -1, 4, -14, 14, -4, 7, 0, -40, 52, -3, -14, 14, -3, -12, 12, -24, 39, -10, 7, -11, -2, 16, -10, -5, -22, 22, 13, -10, 3, -2, -48, 34, -11, 12, -10, 7, 0, -29, 18, 25, -11, -7, 10, 7, -45, 45, -16, 7, 7, -7, 10, 7, 0, -2, -10, -1, 7, -7, 12, -2, 6, -1, -2, 6, -8, 0, 19, -12, -3, 19, -41, 35, -10, 2, 8, -7, 2, 2, -4, 21, -8, 9, -66, -57, 53, -10, 13, -10, 3, -2, -28, 5, 38, -29, 42, -40, -30, 10, 44, -22, 42, -18, 12, -27, -33, 21, -12, 33, -32, 32, -35, 66, -18, -40, 18, 19, 34, -11, 12, -10, 7, 0, -29, 18, 25, -11, -7, 10, 7, -45, 45, -16, 7, 7, -7, 10, 7, 0, -2, -10, -1, 7, -7, 12, -2, 6, -1, -2, 6, -8, 0, 19, -12, -3, 19, -41, 35, -10, 2, 8, -7, 2, 2, -4, 21, -8, 9, -64, 35, 18, -10, 7, 0, -43, 32, 18, -34, 40, -16, 14, -5, -10, 25, -44, 22, 25, -9, 7, 0, -37, 34, -27, 39, -5, 2, -14, 9, -23, 21, -28, 22, 25, -9, 7, 0, -45, 39, -10, 7, -16, 20, -3, 19, 34, -11, 12, -10, 7, 0, -29, 18, 25, -11, -7, 10, 7, -45, 45, -16, 7, 7, -7, 10, 7, 0, -2, -10, -1, 7, -7, 12, -2, 6, -1, -2, 6, -8, 0, 19, -12, -3, 19, -41, 35, -10, 2, 8, -7, 2, 2, -4, 21, -8, 9, -65, -1, 16, -33, 30, 1, 6, -38, 25, 10, 8, -4, -11, -2, 20, -14, -16, 31, -16, 14, 6, -12, 10, 4, -4, -11, 20, -10, 7, 0, 34, -11, 12, -10, 7, 0, -29, 18, 25, -11, -7, 10, 7, -45, 45, -16, 7, 7, -7, 10, 7, -17, 8, 6, -9, 6, 6, -6, -29, 38, -7, 7, -10, 20, -14, 14, -64, 13, -1, -62, 53, 15, -5, 10, 2, -8, 11, -70, 55, -2, 20, -18, -50, 70, -15, 6, 8, -2, -10, 18, 2, -10, 2, 8, -65, 64, 3, -10, 2, 8, -61, 69, -12, 15, -2, 0, 0, 6, -13, -54, 22, 45, 0, -7, 4, 10, -4, -26, 20, 15, -2, 0, 0, 6, -13, 48, -8, 1, 14, -52, 47, -16, 23, -8, -27, 20, 12, 0, 4, 3, -14, 14, -34, 41, -8, -8, 14};
    private static final int $$e = 206;
    private static final byte[] $$a = {5, 11, -122, -94, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 29, -31, 48, 17, -4, 24, -1, 6, 13, 13, 29, -38, 50, 16, 1, 12, 24, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 142;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int b = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;

    zzhb(zzpg zzpgVar) {
        Preconditions.checkNotNull(zzpgVar);
        this.zza = zzpgVar;
    }

    private static void c(short s, short s2, int i, Object[] objArr) {
        int i2 = i + 84;
        int i3 = s2 + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[53 - s];
        int i4 = 52 - s;
        int i5 = -1;
        if (bArr == null) {
            i3++;
            i2 = (i3 + i4) - 11;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                byte b2 = bArr[i3];
                i3++;
                i2 = (i2 + b2) - 11;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.android.gms.measurement.internal.zzhb.$$d
            int r6 = r6 + 3
            int r8 = 117 - r8
            int r1 = 59 - r7
            byte[] r1 = new byte[r1]
            int r7 = 58 - r7
            r2 = 0
            if (r0 != 0) goto L13
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L2b:
            int r6 = r6 + 1
            int r8 = r8 + r3
            int r8 = r8 + (-1)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzhb.d(int, short, short, java.lang.Object[]):void");
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        int i3 = $11 + 99;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i5 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.getTrimmedLength("") + 19472), (Process.myTid() >> 22) + 2624, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 12, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 39421), 481 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), View.getDefaultSize(0, 0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (39422 - Color.green(0)), View.combineMeasuredStates(0, 0) + 481, Drawable.resolveOpacity(0, 0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
        int i6 = $11 + 39;
        $10 = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:241:0x1682  */
    /* JADX WARN: Code duplicated, block: B:544:0x33ca  */
    /* JADX WARN: Code duplicated, block: B:545:0x33cb  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws Throwable {
        Object[] objArr;
        Throwable th;
        Throwable cause;
        Object[] objArr2;
        Object[] objArr3;
        Object[] objArr4;
        Context applicationContext;
        Object[] objArr5;
        Object[] objArr6;
        Object[] objArr7;
        Context context2;
        Object[] objArr8;
        Object[] objArr9;
        Object obj;
        Context applicationContext2;
        Object[] objArr10;
        Object[] objArr11;
        Object[] objArr12;
        Object[] objArr13;
        int i;
        Object obj2;
        Context applicationContext3;
        String str;
        Object[] objArr14;
        Object[] objArr15;
        Object[] objArr16;
        char c;
        Object[] objArr17;
        int i2 = 2 % 2;
        Object[] objArr18 = new Object[1];
        a(new char[]{8057, 63461, 52826, 42707, 48443, 38318, 27662, 17203, 23535, 12864, 2696, 57626, 63877, 53276, 42854, 49120, 38469, 28312, 17698, 23966, 13319, 2940}, View.MeasureSpec.makeMeasureSpec(0, 0) + 59539, objArr18);
        String str2 = (String) objArr18[0];
        Object[] objArr19 = new Object[1];
        a(new char[]{8061, 26341, 60507, 29659, 63791, 16552, 50714, 19901, 54261, 22880, 41182, 9815, 44477, 13096, 47763}, 31121 - Color.blue(0), objArr19);
        String str3 = (String) objArr19[0];
        Object[] objArr20 = new Object[1];
        a(new char[]{8050, 20812, 33540, 62950, 10210, 39037, 51783, 15365, 28375, 41195, 4441, 17190, 46359, 59357, 22939, 35438}, Color.red(0) + 20021, objArr20);
        String str4 = (String) objArr20[0];
        Object[] objArr21 = new Object[1];
        a(new char[]{8049, 64405, 54959, 45517, 36040, 26620, 16922, 23870, 14360, 4936, 61041, 51571, 42423, 32930, 39874, 30426}, 58600 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr21);
        String str5 = (String) objArr21[0];
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cMyTid = (char) (Process.myTid() >> 22);
            int iIndexOf = 875 - TextUtils.indexOf((CharSequence) "", '0', 0);
            int minimumFlingVelocity = 10 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            byte[] bArr = $$a;
            byte b2 = (byte) (bArr[27] - 1);
            short s = bArr[7];
            Object[] objArr22 = new Object[1];
            c(b2, s, (byte) s, objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyTid, iIndexOf, minimumFlingVelocity, -1650998592, false, (String) objArr22[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        long jLongValue = ((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
            int iGreen = Color.green(0) + 876;
            int iIndexOf2 = 9 - TextUtils.indexOf((CharSequence) "", '0');
            byte b3 = $$a[7];
            byte b4 = b3;
            Object[] objArr23 = new Object[1];
            c(b4, (short) (b4 | 37), b3, objArr23);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cNormalizeMetaState, iGreen, iIndexOf2, 2012020043, false, (String) objArr23[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c2 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 876;
                int i3 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 11;
                byte b5 = $$a[7];
                byte b6 = b5;
                Object[] objArr24 = new Object[1];
                c(b6, (short) (b6 | 89), b5, objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, iResolveSizeAndState, i3, 2012931276, false, (String) objArr24[0], null);
            }
            Object[] objArr25 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr25[0])[0]}, new int[1], new int[]{((int[]) objArr25[2])[0]}, (String[]) objArr25[3]};
            int i4 = ~Process.myPid();
            int i5 = (-368290471) + ((~((-5768193) | i4)) * (-783)) + (((~(i4 | (-41446998))) | (-81757227)) * 783) + 16363577;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
        } else {
            Context applicationContext4 = context != null ? ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) ? null : context.getApplicationContext() : context;
            try {
                Object[] objArr26 = {applicationContext4, Integer.valueOf(((Integer) Class.forName(str4).getMethod(str5, Object.class).invoke(null, this)).intValue()), 0, 16363577};
                byte[] bArr2 = $$d;
                Object[] objArr27 = new Object[1];
                d(bArr2[24], bArr2[32], bArr2[12], objArr27);
                Class<?> cls = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                d((short) (bArr2[412] - 1), bArr2[13], bArr2[125], objArr28);
                Object[] objArr29 = (Object[]) cls.getMethod((String) objArr28[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr26);
                if (applicationContext4 != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c3 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        int i8 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 876;
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 10;
                        byte b7 = $$a[7];
                        byte b8 = b7;
                        Object[] objArr30 = new Object[1];
                        c(b8, (short) (b8 | 89), b7, objArr30);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c3, i8, scrollBarSize, 2012931276, false, (String) objArr30[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr29);
                    try {
                        long jLongValue2 = ((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c4 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            int i9 = 877 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            int iMyTid = 10 - (Process.myTid() >> 22);
                            byte b9 = $$a[7];
                            byte b10 = b9;
                            Object[] objArr31 = new Object[1];
                            c(b10, (short) (b10 | 37), b9, objArr31);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c4, i9, iMyTid, 2012020043, false, (String) objArr31[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                            int iCombineMeasuredStates = 876 - View.combineMeasuredStates(0, 0);
                            int size = View.MeasureSpec.getSize(0) + 10;
                            byte[] bArr3 = $$a;
                            byte b11 = (byte) (bArr3[27] - 1);
                            short s2 = bArr3[7];
                            Object[] objArr32 = new Object[1];
                            c(b11, s2, (byte) s2, objArr32);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollDefaultDelay, iCombineMeasuredStates, size, -1650998592, false, (String) objArr32[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                } else {
                    objArr29 = objArr29;
                }
                objArr = objArr29;
            } catch (Throwable th2) {
                th = th2;
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i10 = ((int[]) objArr[2])[0];
        int i11 = ((int[]) objArr[0])[0];
        if (i11 == i10) {
            int i12 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i13 = ~elapsedCpuTime;
            int i14 = i12 + 1858126516 + (((~(217792189 | i13)) | 50348034) * 168) + ((~((-50348035) | elapsedCpuTime)) * 168) + (((~(elapsedCpuTime | 268140223)) | (~(i13 | (-258102419))) | 207754384) * 168);
            int i15 = (i14 << 13) ^ i14;
            int i16 = i15 ^ (i15 >>> 17);
            ((int[]) objArr2[1])[0] = i16 ^ (i16 << 5);
        } else {
            int[] iArr = new int[i11];
            int i17 = i11 - 1;
            iArr[i17] = 1;
            Toast.makeText((Context) null, iArr[((i11 * i17) % 2) - 1], 1).show();
            int i18 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iNextInt = new Random().nextInt(1400601309);
            int i19 = i18 + (-133904130) + (((~((~iNextInt) | (-848972971))) | (-808662742)) * (-235)) + (((~((-848972971) | iNextInt)) | (-808662742)) * (-470)) + (((~(iNextInt | (-806487169))) | (-851148544)) * 235);
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArr2[1])[0] = i21 ^ (i21 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
            int tapTimeout = 876 - (ViewConfiguration.getTapTimeout() >> 16);
            int tapTimeout2 = 10 - (ViewConfiguration.getTapTimeout() >> 16);
            Object[] objArr33 = new Object[1];
            c((byte) 42, (short) ($$b - 1), $$a[153], objArr33);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cLastIndexOf, tapTimeout, tapTimeout2, -1199417970, false, (String) objArr33[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        long jLongValue3 = ((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
            int iBlue = 876 - Color.blue(0);
            int i22 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 9;
            Object[] objArr34 = new Object[1];
            c((byte) 52, (short) 151, $$a[27], objArr34);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(touchSlop, iBlue, i22, 254769921, false, (String) objArr34[0], null);
        }
        if (j2 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                int absoluteGravity = 876 - Gravity.getAbsoluteGravity(0, 0);
                int i23 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 9;
                byte[] bArr4 = $$a;
                Object[] objArr35 = new Object[1];
                c(bArr4[81], (short) 151, bArr4[153], objArr35);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cResolveOpacity, absoluteGravity, i23, 1324201839, false, (String) objArr35[0], null);
            }
            Object[] objArr36 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr3 = new Object[]{new int[]{((int[]) objArr36[0])[0]}, new int[1], new int[]{((int[]) objArr36[2])[0]}, (String[]) objArr36[3]};
            int iNextInt2 = new Random().nextInt();
            int i24 = (((2042761012 + (((~(1021647245 | iNextInt2)) | 10555533) * (-502))) + ((~((~iNextInt2) | 1072513007)) * (-502))) + (((~(iNextInt2 | (-1061957475))) | 1021647245) * TypedValues.PositionType.TYPE_DRAWPATH)) - 495999068;
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr3[1])[0] = i26 ^ (i26 << 5);
        } else {
            Object[] objArr37 = {Integer.valueOf(((Integer) Class.forName(str4).getMethod(str5, Object.class).invoke(null, this)).intValue()), -495999068};
            byte[] bArr5 = $$d;
            Object[] objArr38 = new Object[1];
            d((short) 98, bArr5[57], bArr5[46], objArr38);
            Class<?> cls2 = Class.forName((String) objArr38[0]);
            Object[] objArr39 = new Object[1];
            d((short) 131, bArr5[13], bArr5[125], objArr39);
            objArr3 = (Object[]) cls2.getMethod((String) objArr39[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr37);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
                int i27 = 876 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                int i28 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 10;
                byte[] bArr6 = $$a;
                Object[] objArr40 = new Object[1];
                c(bArr6[81], (short) 151, bArr6[153], objArr40);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cLastIndexOf2, i27, i28, 1324201839, false, (String) objArr40[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, objArr3);
            try {
                long jLongValue4 = ((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue4);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                    char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                    int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 876;
                    int i29 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 10;
                    Object[] objArr41 = new Object[1];
                    c((byte) 52, (short) 151, $$a[27], objArr41);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(edgeSlop, maximumDrawingCacheSize, i29, 254769921, false, (String) objArr41[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue4 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                    char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int touchSlop2 = 876 - (ViewConfiguration.getTouchSlop() >> 8);
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 11;
                    Object[] objArr42 = new Object[1];
                    c((byte) 42, (short) ($$b - 1), $$a[153], objArr42);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(windowTouchSlop, touchSlop2, packedPositionChild, -1199417970, false, (String) objArr42[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i30 = ((int[]) objArr3[2])[0];
        int i31 = ((int[]) objArr3[0])[0];
        if (i31 == i30) {
            int i32 = ((int[]) objArr3[1])[0];
            objArr4 = new Object[]{new int[]{((int[]) objArr3[0])[0]}, new int[1], new int[]{((int[]) objArr3[2])[0]}, (String[]) objArr3[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i33 = ~iIdentityHashCode;
            int i34 = i32 + (-1729917826) + (((~(383565393 | i33)) | (-534773368)) * 98) + (((~(i33 | (-423875623))) | 383565393 | (~(423875622 | iIdentityHashCode))) * (-49)) + (((~(iIdentityHashCode | 383565393)) | 110897745) * 49);
            int i35 = (i34 << 13) ^ i34;
            int i36 = i35 ^ (i35 >>> 17);
            ((int[]) objArr4[1])[0] = i36 ^ (i36 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr3[3];
            if (strArr != null) {
                for (String str6 : strArr) {
                    arrayList.add(str6);
                }
            }
            int[] iArr2 = new int[i31];
            int i37 = i31 - 1;
            iArr2[i37] = 1;
            Toast.makeText((Context) null, iArr2[((i31 * i37) % 2) - 1], 1).show();
            int i38 = ((int[]) objArr3[1])[0];
            objArr4 = new Object[]{new int[]{((int[]) objArr3[0])[0]}, new int[1], new int[]{((int[]) objArr3[2])[0]}, (String[]) objArr3[3]};
            int iMyUid = Process.myUid();
            int i39 = ~iMyUid;
            int i40 = (-839401132) + (((~((-74524195) | i39)) | (~((-42637406) | iMyUid))) * 520);
            int i41 = ~(42637405 | i39);
            int i42 = ~(iMyUid | 82947634);
            int i43 = i38 + i40 + ((i41 | i42) * (-1040)) + ((i42 | (~(i39 | (-82947635))) | (-117161600)) * 520);
            int i44 = (i43 << 13) ^ i43;
            int i45 = i44 ^ (i44 >>> 17);
            ((int[]) objArr4[1])[0] = i45 ^ (i45 << 5);
            int i46 = b + 121;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i46 % 128;
            if (i46 % 2 != 0) {
                int i47 = 4 / 2;
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
            char packedPositionChild2 = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
            int capsMode = TextUtils.getCapsMode("", 0, 0) + 2267;
            int iCombineMeasuredStates2 = 33 - View.combineMeasuredStates(0, 0);
            byte b12 = $$a[7];
            byte b13 = b12;
            Object[] objArr43 = new Object[1];
            c(b13, (short) (b13 | 37), b12, objArr43);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(packedPositionChild2, capsMode, iCombineMeasuredStates2, -887667012, false, (String) objArr43[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                char cLastIndexOf3 = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                int i48 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2267;
                int windowTouchSlop2 = 33 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                byte[] bArr7 = $$a;
                byte b14 = (byte) (bArr7[27] - 1);
                short s3 = bArr7[7];
                Object[] objArr44 = new Object[1];
                c(b14, s3, (byte) s3, objArr44);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cLastIndexOf3, i48, windowTouchSlop2, -654680577, false, (String) objArr44[0], null);
            }
            Object[] objArr45 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).get(null);
            objArr5 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i49 = ((int[]) objArr45[0])[0];
            int i50 = ((int[]) objArr45[3])[0];
            String[] strArr2 = (String[]) objArr45[1];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i51 = ~iIdentityHashCode2;
            int i52 = 1330210049 + (((~((-148533212) | i51)) | (~((-660180105) | iIdentityHashCode2))) * 1900) + (((~(i51 | 660180104)) | (~(iIdentityHashCode2 | 148533211))) * (-950)) + (((~(iIdentityHashCode2 | 660180104)) | (~(i51 | 148533211))) * 950) + 1751725271;
            int i53 = (i52 << 13) ^ i52;
            int i54 = i53 ^ (i53 >>> 17);
            ((int[]) objArr5[2])[0] = i54 ^ (i54 << 5);
            objArr4 = objArr4;
        } else {
            if (context != null) {
                int i55 = b + 5;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i55 % 128;
                int i56 = i55 % 2;
                applicationContext = ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) ? null : context.getApplicationContext();
            } else {
                applicationContext = context;
            }
            Object[] objArr46 = {applicationContext, Integer.valueOf(((Integer) Class.forName(str4).getMethod(str5, Object.class).invoke(null, this)).intValue()), 0, 1751725271};
            byte[] bArr8 = $$d;
            Object[] objArr47 = new Object[1];
            d((short) 183, bArr8[44], bArr8[26], objArr47);
            Class<?> cls3 = Class.forName((String) objArr47[0]);
            Object[] objArr48 = new Object[1];
            d((short) 228, bArr8[13], bArr8[125], objArr48);
            Object[] objArr49 = (Object[]) cls3.getMethod((String) objArr48[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr46);
            if (applicationContext != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char c5 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int i57 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2267;
                    int windowTouchSlop3 = 33 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    byte[] bArr9 = $$a;
                    byte b15 = (byte) (bArr9[27] - 1);
                    short s4 = bArr9[7];
                    Object[] objArr50 = new Object[1];
                    c(b15, s4, (byte) s4, objArr50);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(c5, i57, windowTouchSlop3, -654680577, false, (String) objArr50[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, objArr49);
                try {
                    long jLongValue5 = ((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf5 = Long.valueOf(jLongValue5);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                        char cMyTid2 = (char) (Process.myTid() >> 22);
                        int i58 = 2268 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        int iIndexOf3 = 32 - TextUtils.indexOf((CharSequence) "", '0', 0);
                        byte b16 = $$a[7];
                        byte b17 = b16;
                        Object[] objArr51 = new Object[1];
                        c(b17, (short) (b17 | 89), b16, objArr51);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(cMyTid2, i58, iIndexOf3, -874156483, false, (String) objArr51[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).set(null, lValueOf5);
                    Long lValueOf6 = Long.valueOf(jLongValue5 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                        char windowTouchSlop4 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int scrollBarFadeDuration = 2267 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int iLastIndexOf = 32 - TextUtils.lastIndexOf("", '0');
                        byte b18 = $$a[7];
                        byte b19 = b18;
                        Object[] objArr52 = new Object[1];
                        c(b19, (short) (b19 | 37), b18, objArr52);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(windowTouchSlop4, scrollBarFadeDuration, iLastIndexOf, -887667012, false, (String) objArr52[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).set(null, lValueOf6);
                } catch (Exception unused3) {
                    throw new RuntimeException();
                }
            } else {
                objArr4 = objArr4;
                objArr49 = objArr49;
            }
            objArr5 = objArr49;
        }
        if (((int[]) objArr5[0])[0] != ((int[]) objArr5[3])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr5[1];
            if (strArr3 != null) {
                int i59 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
                b = i59 % 128;
                int i60 = i59 % 2;
                for (String str7 : strArr3) {
                    arrayList2.add(str7);
                }
            }
            throw null;
        }
        Object[] objArr53 = {new int[]{i}, strArr, new int[1], new int[]{i}};
        int i61 = ((int[]) objArr5[2])[0];
        int i62 = ((int[]) objArr5[0])[0];
        int i63 = ((int[]) objArr5[3])[0];
        String[] strArr4 = (String[]) objArr5[1];
        int i64 = (~((int) Process.getStartUptimeMillis())) | 830437144;
        int i65 = i61 + (-73514022) + (i64 * 495) + (((~i64) | 808715528) * 495);
        int i66 = (i65 << 13) ^ i65;
        int i67 = i66 ^ (i66 >>> 17);
        ((int[]) objArr53[2])[0] = i67 ^ (i67 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
            char capsMode2 = (char) TextUtils.getCapsMode("", 0, 0);
            int iIndexOf4 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1032;
            int iIndexOf5 = 14 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            byte b20 = $$a[7];
            byte b21 = b20;
            Object[] objArr54 = new Object[1];
            c(b21, (short) (b21 | 89), b20, objArr54);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(capsMode2, iIndexOf4, iIndexOf5, 1357589585, false, (String) objArr54[0], null);
        }
        long j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).getLong(null);
        long jLongValue6 = ((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
            char cLastIndexOf4 = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
            int iMyPid = 1031 - (Process.myPid() >> 22);
            int mode = View.MeasureSpec.getMode(0) + 15;
            byte b22 = $$a[7];
            byte b23 = b22;
            Object[] objArr55 = new Object[1];
            c(b23, (short) (b23 | 37), b22, objArr55);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(cLastIndexOf4, iMyPid, mode, 1344079056, false, (String) objArr55[0], null);
        }
        if (j3 == ((jLongValue6 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                char c6 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                int i68 = 1030 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                int i69 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15;
                short s5 = (short) ($$b | 16);
                Object[] objArr56 = new Object[1];
                c((byte) 52, s5, (byte) (s5 & 47), objArr56);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(c6, i68, i69, 632103528, false, (String) objArr56[0], null);
            }
            Object[] objArr57 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).get(null);
            objArr6 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i70 = ((int[]) objArr57[3])[0];
            int i71 = ((int[]) objArr57[1])[0];
            String[] strArr5 = (String[]) objArr57[0];
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i72 = (((608946369 + (((~(414277506 | iIdentityHashCode3)) | 658538604) * 104)) + ((~((~iIdentityHashCode3) | (-414258435))) * (-104))) + ((iIdentityHashCode3 | 658557676) * 104)) - 1936899289;
            int i73 = (i72 << 13) ^ i72;
            int i74 = i73 ^ (i73 >>> 17);
            ((int[]) objArr6[2])[0] = i74 ^ (i74 << 5);
        } else {
            int iIntValue = ((Integer) Class.forName(str4).getMethod(str5, Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr58 = {1023681554};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 46038), 1134 - Color.red(0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 17, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr59 = {Integer.valueOf(iIntValue), 0, -1936899289, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).newInstance(objArr58), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                    char cRgb = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
                    int size2 = 1031 - View.MeasureSpec.getSize(0);
                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 15;
                    byte b24 = $$a[7];
                    byte b25 = b24;
                    Object[] objArr60 = new Object[1];
                    c(b25, (short) (b25 | 89), b24, objArr60);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(cRgb, size2, maximumFlingVelocity, 1298546779, false, (String) objArr60[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 45992), 1117 - KeyEvent.normalizeMetaState(0), 17 - View.getDefaultSize(0, 0)), Boolean.TYPE});
                }
                objArr6 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).invoke(null, objArr59);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                    char cLastIndexOf5 = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0));
                    int iLastIndexOf2 = 1030 - TextUtils.lastIndexOf("", '0');
                    int defaultSize = 15 - View.getDefaultSize(0, 0);
                    short s6 = (short) ($$b | 16);
                    Object[] objArr61 = new Object[1];
                    c((byte) 52, s6, (byte) (s6 & 47), objArr61);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(cLastIndexOf5, iLastIndexOf2, defaultSize, 632103528, false, (String) objArr61[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).set(null, objArr6);
                try {
                    long jLongValue7 = ((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf7 = Long.valueOf(jLongValue7);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                        char c7 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 1031;
                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 15;
                        byte b26 = $$a[7];
                        byte b27 = b26;
                        Object[] objArr62 = new Object[1];
                        c(b27, (short) (b27 | 37), b26, objArr62);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(c7, maxKeyCode, iNormalizeMetaState, 1344079056, false, (String) objArr62[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).set(null, lValueOf7);
                    Long lValueOf8 = Long.valueOf(jLongValue7 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                        char cLastIndexOf6 = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                        int maxKeyCode2 = (KeyEvent.getMaxKeyCode() >> 16) + 1031;
                        int iCombineMeasuredStates3 = 15 - View.combineMeasuredStates(0, 0);
                        byte b28 = $$a[7];
                        byte b29 = b28;
                        Object[] objArr63 = new Object[1];
                        c(b29, (short) (b29 | 89), b28, objArr63);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(cLastIndexOf6, maxKeyCode2, iCombineMeasuredStates3, 1357589585, false, (String) objArr63[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).set(null, lValueOf8);
                } catch (Exception unused4) {
                    throw new RuntimeException();
                }
            } catch (Throwable th3) {
                Throwable cause2 = th3.getCause();
                if (cause2 == null) {
                    throw th3;
                }
                throw cause2;
            }
        }
        int i75 = ((int[]) objArr6[1])[0];
        int i76 = ((int[]) objArr6[3])[0];
        if (i76 == i75) {
            objArr7 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i77 = ((int[]) objArr6[2])[0];
            int i78 = ((int[]) objArr6[3])[0];
            int i79 = ((int[]) objArr6[1])[0];
            String[] strArr6 = (String[]) objArr6[0];
            int iIdentityHashCode4 = System.identityHashCode(this);
            int i80 = ~iIdentityHashCode4;
            int i81 = i77 + (-1670917063) + (((~((-931128238) | i80)) | (~(iIdentityHashCode4 | (-686848068)))) * 333) + (((~(iIdentityHashCode4 | (-931128238))) | (~(i80 | (-686848068)))) * 333);
            int i82 = (i81 << 13) ^ i81;
            int i83 = i82 ^ (i82 >>> 17);
            ((int[]) objArr7[2])[0] = i83 ^ (i83 << 5);
        } else {
            ArrayList arrayList3 = new ArrayList();
            String[] strArr7 = (String[]) objArr6[0];
            if (strArr7 != null) {
                for (String str8 : strArr7) {
                    arrayList3.add(str8);
                }
            }
            int[] iArr3 = new int[i76];
            int i84 = i76 - 1;
            iArr3[i84] = 1;
            Toast.makeText((Context) null, iArr3[((i76 * i84) % 2) - 1], 1).show();
            objArr7 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i85 = ((int[]) objArr6[2])[0];
            int i86 = ((int[]) objArr6[3])[0];
            int i87 = ((int[]) objArr6[1])[0];
            String[] strArr8 = (String[]) objArr6[0];
            int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
            int i88 = ~elapsedCpuTime2;
            int i89 = i85 + (-2018848464) + (((~((-617225465) | i88)) | (~(372945294 | elapsedCpuTime2))) * 217) + (((~(elapsedCpuTime2 | (-617225465))) | 549457008) * 217) + (((~(372945294 | i88)) | 617225464) * 217);
            int i90 = (i89 << 13) ^ i89;
            int i91 = i90 ^ (i90 >>> 17);
            ((int[]) objArr7[2])[0] = i91 ^ (i91 << 5);
        }
        zzpg zzpgVar = this.zza;
        zzpgVar.zzu();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
            char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 31533);
            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 921;
            int offsetBefore = 28 - TextUtils.getOffsetBefore("", 0);
            short s7 = (short) ($$b | 16);
            Object[] objArr64 = new Object[1];
            c((byte) 52, s7, (byte) (s7 & 47), objArr64);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(jumpTapTimeout, packedPositionGroup, offsetBefore, -1048449946, false, (String) objArr64[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                char capsMode3 = (char) (31533 - TextUtils.getCapsMode("", 0, 0));
                int iIndexOf6 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 922;
                int longPressTimeout = 28 - (ViewConfiguration.getLongPressTimeout() >> 16);
                byte[] bArr10 = $$a;
                byte b30 = (byte) (bArr10[27] - 1);
                short s8 = bArr10[7];
                Object[] objArr65 = new Object[1];
                c(b30, s8, (byte) s8, objArr65);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(capsMode3, iIndexOf6, longPressTimeout, -1142834547, false, (String) objArr65[0], null);
            }
            Object[] objArr66 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).get(null);
            objArr8 = new Object[]{new int[1], new int[]{((int[]) objArr66[1])[0]}, (Object[]) objArr66[2], new int[]{((int[]) objArr66[3])[0]}, (String[]) objArr66[4]};
            int iIdentityHashCode5 = System.identityHashCode(this);
            int i92 = ((((-955593779) + (((~((~iIdentityHashCode5) | (-20779090))) | (~(1602092919 | iIdentityHashCode5))) * (-302))) + ((~((-20779090) | iIdentityHashCode5)) * (-604))) + (((~(iIdentityHashCode5 | 1581313830)) | 1409327106) * 302)) - 630464423;
            int i93 = (i92 << 13) ^ i92;
            int i94 = i93 ^ (i93 >>> 17);
            ((int[]) objArr8[0])[0] = i94 ^ (i94 << 5);
            context2 = context;
            zzpgVar = zzpgVar;
            objArr7 = objArr7;
        } else {
            context2 = context;
            Context applicationContext5 = context2 != null ? ((context2 instanceof ContextWrapper) && ((ContextWrapper) context2).getBaseContext() == null) ? null : context.getApplicationContext() : context2;
            int iIntValue2 = ((Integer) Class.forName(str4).getMethod(str5, Object.class).invoke(null, this)).intValue();
            int i95 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
            b = i95 % 128;
            int i96 = i95 % 2;
            try {
                Object[] objArr67 = {applicationContext5, Integer.valueOf(iIntValue2), 0, -630464423};
                byte[] bArr11 = $$d;
                Object[] objArr68 = new Object[1];
                d((short) 280, bArr11[407], bArr11[21], objArr68);
                Class<?> cls4 = Class.forName((String) objArr68[0]);
                Object[] objArr69 = new Object[1];
                d((short) (bArr11[412] - 1), bArr11[13], bArr11[125], objArr69);
                Object[] objArr70 = (Object[]) cls4.getMethod((String) objArr69[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr67);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                    char c8 = (char) (31533 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                    int fadingEdgeLength = 921 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int i97 = 28 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    byte[] bArr12 = $$a;
                    byte b31 = (byte) (bArr12[27] - 1);
                    short s9 = bArr12[7];
                    Object[] objArr71 = new Object[1];
                    c(b31, s9, (byte) s9, objArr71);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(c8, fadingEdgeLength, i97, -1142834547, false, (String) objArr71[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).set(null, objArr70);
                try {
                    long jLongValue8 = ((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf9 = Long.valueOf(jLongValue8);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                        char cKeyCodeFromString = (char) (31533 - KeyEvent.keyCodeFromString(""));
                        int pressedStateDuration = 921 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        int i98 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 27;
                        byte b32 = $$a[7];
                        byte b33 = b32;
                        Object[] objArr72 = new Object[1];
                        c(b33, (short) (b33 | 37), b32, objArr72);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(cKeyCodeFromString, pressedStateDuration, i98, -778300370, false, (String) objArr72[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).set(null, lValueOf9);
                    Long lValueOf10 = Long.valueOf(jLongValue8 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                        char longPressTimeout2 = (char) (31533 - (ViewConfiguration.getLongPressTimeout() >> 16));
                        int iIndexOf7 = TextUtils.indexOf("", "", 0, 0) + 921;
                        int i99 = 27 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        short s10 = (short) ($$b | 16);
                        Object[] objArr73 = new Object[1];
                        c((byte) 52, s10, (byte) (s10 & 47), objArr73);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(longPressTimeout2, iIndexOf7, i99, -1048449946, false, (String) objArr73[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).set(null, lValueOf10);
                    objArr8 = objArr70;
                } catch (Exception unused5) {
                    throw new RuntimeException();
                }
            } catch (Throwable th4) {
                th = th4;
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i100 = ((int[]) objArr8[1])[0];
        int i101 = ((int[]) objArr8[3])[0];
        if (i101 == i100) {
            int i102 = ((int[]) objArr8[0])[0];
            objArr9 = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
            int iIdentityHashCode6 = System.identityHashCode(this);
            int i103 = ~iIdentityHashCode6;
            int i104 = i102 + (-1128424400) + (((~((-1417740884) | i103)) | 356338760) * 226) + (((~(i103 | (-1082130964))) | (~((-356338761) | iIdentityHashCode6)) | 20728840) * (-113)) + ((~(iIdentityHashCode6 | (-1417740884))) * 113);
            int i105 = (i104 << 13) ^ i104;
            int i106 = i105 ^ (i105 >>> 17);
            ((int[]) objArr9[0])[0] = i106 ^ (i106 << 5);
        } else {
            ArrayList arrayList4 = new ArrayList();
            String[] strArr9 = (String[]) objArr8[4];
            if (strArr9 != null) {
                for (String str9 : strArr9) {
                    arrayList4.add(str9);
                }
            }
            int[] iArr4 = new int[i101];
            int i107 = i101 - 1;
            iArr4[i107] = 1;
            Toast.makeText((Context) null, iArr4[((i101 * i107) % 2) - 1], 1).show();
            int i108 = ((int[]) objArr8[0])[0];
            objArr9 = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
            int iIdentityHashCode7 = System.identityHashCode(this);
            int i109 = i108 + (-1827805338) + ((~((-1610612892) | iIdentityHashCode7)) * 623) + (((~iIdentityHashCode7) | 88149504) * (-623)) + (((~(iIdentityHashCode7 | 125808128)) | (~((-1648271516) | iIdentityHashCode7)) | 1610612891) * 623);
            int i110 = (i109 << 13) ^ i109;
            int i111 = i110 ^ (i110 >>> 17);
            ((int[]) objArr9[0])[0] = i111 ^ (i111 << 5);
        }
        String action = intent.getAction();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
            char packedPositionChild3 = (char) (ExpandableListView.getPackedPositionChild(0L) + 53894);
            int iIndexOf8 = 1319 - TextUtils.indexOf((CharSequence) "", '0');
            int i112 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 36;
            short s11 = (short) ($$b | 16);
            Object[] objArr74 = new Object[1];
            c((byte) 52, s11, (byte) (s11 & 47), objArr74);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(packedPositionChild3, iIndexOf8, i112, -1433084963, false, (String) objArr74[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
                char cLastIndexOf7 = (char) (TextUtils.lastIndexOf("", '0') + 53894);
                int i113 = 1320 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int scrollDefaultDelay2 = 36 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                byte b34 = $$a[7];
                byte b35 = b34;
                Object[] objArr75 = new Object[1];
                c(b35, (short) (b35 | 37), b34, objArr75);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(cLastIndexOf7, i113, scrollDefaultDelay2, -1920778747, false, (String) objArr75[0], null);
            }
            Object[] objArr76 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).get(null);
            objArr10 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i114 = ((int[]) objArr76[0])[0];
            int i115 = ((int[]) objArr76[3])[0];
            String[] strArr10 = (String[]) objArr76[2];
            int iIdentityHashCode8 = System.identityHashCode(this);
            int i116 = (((((~((-1095504079) | iIdentityHashCode8)) | 1361714924) * 398) - 1996360188) + (((~((~iIdentityHashCode8) | (-1095504079))) | 1361714924) * 398)) - 764069203;
            int i117 = (i116 << 13) ^ i116;
            int i118 = i117 ^ (i117 >>> 17);
            ((int[]) objArr10[1])[0] = i118 ^ (i118 << 5);
            action = action;
            objArr9 = objArr9;
        } else {
            if (context2 == null) {
                obj = null;
                applicationContext2 = context2;
            } else if (context2 instanceof ContextWrapper) {
                int i119 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
                b = i119 % 128;
                if (i119 % 2 == 0) {
                    ((ContextWrapper) context2).getBaseContext();
                    throw null;
                }
                if (((ContextWrapper) context2).getBaseContext() != null) {
                    obj = null;
                    applicationContext2 = context.getApplicationContext();
                } else {
                    obj = null;
                    applicationContext2 = null;
                }
            } else {
                obj = null;
                applicationContext2 = context.getApplicationContext();
            }
            int iIntValue3 = ((Integer) Class.forName(str4).getMethod(str5, Object.class).invoke(obj, this)).intValue();
            Object[] objArr77 = {830939971};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b((char) (Color.alpha(0) + 47977), 1300 - (Process.myTid() >> 22), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 20, -420973425, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr78 = {applicationContext2, "com.bpjstku", -764069203, Integer.valueOf(iIntValue3), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).newInstance(objArr77), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
                char defaultSize2 = (char) (View.getDefaultSize(0, 0) + 53893);
                int iMyTid2 = (Process.myTid() >> 22) + 1320;
                int iMyPid2 = 36 - (Process.myPid() >> 22);
                byte b36 = $$a[7];
                byte b37 = b36;
                Object[] objArr79 = new Object[1];
                c(b37, (short) (b37 | 37), b36, objArr79);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(defaultSize2, iMyTid2, iMyPid2, 819724799, false, (String) objArr79[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (57879 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (KeyEvent.getMaxKeyCode() >> 16) + 1394, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 74), Boolean.TYPE});
            }
            Object[] objArr80 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).invoke(null, objArr78);
            if (applicationContext2 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
                    char fadingEdgeLength2 = (char) (53893 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                    int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 1321;
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0) + 36;
                    byte b38 = $$a[7];
                    byte b39 = b38;
                    Object[] objArr81 = new Object[1];
                    c(b39, (short) (b39 | 37), b38, objArr81);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(fadingEdgeLength2, modifierMetaStateMask, absoluteGravity2, -1920778747, false, (String) objArr81[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).set(null, objArr80);
                try {
                    long jLongValue9 = ((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf11 = Long.valueOf(jLongValue9);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
                        char tapTimeout3 = (char) (53893 - (ViewConfiguration.getTapTimeout() >> 16));
                        int fadingEdgeLength3 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 1320;
                        int i120 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 36;
                        byte[] bArr13 = $$a;
                        byte b40 = (byte) (bArr13[27] - 1);
                        short s12 = bArr13[7];
                        Object[] objArr82 = new Object[1];
                        c(b40, s12, (byte) s12, objArr82);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(tapTimeout3, fadingEdgeLength3, i120, -1273706634, false, (String) objArr82[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).set(null, lValueOf11);
                    Long lValueOf12 = Long.valueOf(jLongValue9 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
                        char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 53893);
                        int keyRepeatTimeout = 1320 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int i121 = 36 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        short s13 = (short) ($$b | 16);
                        Object[] objArr83 = new Object[1];
                        c((byte) 52, s13, (byte) (s13 & 47), objArr83);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(cCombineMeasuredStates, keyRepeatTimeout, i121, -1433084963, false, (String) objArr83[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).set(null, lValueOf12);
                } catch (Exception unused6) {
                    throw new RuntimeException();
                }
            } else {
                action = action;
                objArr80 = objArr80;
            }
            objArr10 = objArr80;
        }
        if (((int[]) objArr10[0])[0] != ((int[]) objArr10[3])[0]) {
            throw null;
        }
        Object[] objArr84 = {new int[]{i}, new int[1], strArr, new int[]{i}};
        int i122 = ((int[]) objArr10[1])[0];
        int i123 = ((int[]) objArr10[0])[0];
        int i124 = ((int[]) objArr10[3])[0];
        String[] strArr11 = (String[]) objArr10[2];
        int iIdentityHashCode9 = System.identityHashCode(this);
        int i125 = i122 + ((~((~iIdentityHashCode9) | (-11062313))) * 130) + 963637536 + (((~(iIdentityHashCode9 | (-11062313))) | 553717952) * 130);
        int i126 = (i125 << 13) ^ i125;
        int i127 = i126 ^ (i126 >>> 17);
        ((int[]) objArr84[1])[0] = i127 ^ (i127 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
            char cCombineMeasuredStates2 = (char) (43042 - View.combineMeasuredStates(0, 0));
            int keyRepeatTimeout2 = 3111 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int packedPositionGroup2 = 22 - ExpandableListView.getPackedPositionGroup(0L);
            byte b41 = $$a[7];
            byte b42 = b41;
            Object[] objArr85 = new Object[1];
            c(b42, (short) (b42 | 89), b41, objArr85);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(cCombineMeasuredStates2, keyRepeatTimeout2, packedPositionGroup2, -1272852037, false, (String) objArr85[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                char tapTimeout4 = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 43042);
                int i128 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 3112;
                int iIndexOf9 = TextUtils.indexOf((CharSequence) "", '0') + 23;
                byte[] bArr14 = $$a;
                byte b43 = (byte) (bArr14[27] - 1);
                short s14 = bArr14[7];
                Object[] objArr86 = new Object[1];
                c(b43, s14, (byte) s14, objArr86);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(tapTimeout4, i128, iIndexOf9, 154975793, false, (String) objArr86[0], null);
            }
            Object[] objArr87 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).get(null);
            int i129 = ((int[]) objArr87[2])[0];
            int i130 = ((int[]) objArr87[1])[0];
            String[] strArr12 = (String[]) objArr87[3];
            int[] iArr5 = {i130};
            int iIdentityHashCode10 = System.identityHashCode(this);
            int i131 = ~iIdentityHashCode10;
            int i132 = (~((-693385640) | i131)) | 675559715;
            int i133 = ~(iIdentityHashCode10 | 1029471743);
            int i134 = ((1533592004 + ((i132 | i133) * (-502))) + ((i133 | (~(i131 | (-17825925)))) * TypedValues.PositionType.TYPE_DRAWPATH)) - 1720867046;
            int i135 = (i134 << 13) ^ i134;
            int i136 = i135 ^ (i135 >>> 17);
            ((int[]) objArr11[0])[0] = i136 ^ (i136 << 5);
            objArr11 = new Object[]{new int[1], iArr5, new int[]{i129}, strArr12};
            objArr84 = objArr84;
        } else {
            int iIntValue4 = ((Integer) Class.forName(str4).getMethod(str5, Object.class).invoke(null, this)).intValue();
            int i137 = b + 87;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i137 % 128;
            int i138 = i137 % 2;
            Object[] objArr88 = {null, Integer.valueOf(iIntValue4), 0, -1720867046};
            byte[] bArr15 = $$d;
            Object[] objArr89 = new Object[1];
            d((short) 290, bArr15[0], bArr15[24], objArr89);
            Class<?> cls5 = Class.forName((String) objArr89[0]);
            Object[] objArr90 = new Object[1];
            d((short) 309, bArr15[97], bArr15[125], objArr90);
            Object[] objArr91 = (Object[]) cls5.getMethod((String) objArr90[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr88);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                char cIndexOf = (char) (43042 - TextUtils.indexOf("", ""));
                int i139 = 3111 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int maximumFlingVelocity2 = 22 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                byte[] bArr16 = $$a;
                byte b44 = (byte) (bArr16[27] - 1);
                short s15 = bArr16[7];
                Object[] objArr92 = new Object[1];
                c(b44, s15, (byte) s15, objArr92);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(cIndexOf, i139, maximumFlingVelocity2, 154975793, false, (String) objArr92[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).set(null, objArr91);
            try {
                long jLongValue10 = ((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf13 = Long.valueOf(jLongValue10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
                    char c9 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 43041);
                    int offsetBefore2 = 3111 - TextUtils.getOffsetBefore("", 0);
                    int iMyPid3 = 22 - (Process.myPid() >> 22);
                    byte b45 = $$a[7];
                    byte b46 = b45;
                    Object[] objArr93 = new Object[1];
                    c(b46, (short) (b46 | 37), b45, objArr93);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(c9, offsetBefore2, iMyPid3, -1269618118, false, (String) objArr93[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).set(null, lValueOf13);
                Long lValueOf14 = Long.valueOf(jLongValue10 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
                    char offsetBefore3 = (char) (43042 - TextUtils.getOffsetBefore("", 0));
                    int absoluteGravity3 = 3111 - Gravity.getAbsoluteGravity(0, 0);
                    int iAxisFromString = 21 - MotionEvent.axisFromString("");
                    byte b47 = $$a[7];
                    byte b48 = b47;
                    Object[] objArr94 = new Object[1];
                    c(b48, (short) (b48 | 89), b47, objArr94);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(offsetBefore3, absoluteGravity3, iAxisFromString, -1272852037, false, (String) objArr94[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).set(null, lValueOf14);
                objArr11 = objArr91;
            } catch (Exception unused7) {
                throw new RuntimeException();
            }
        }
        int i140 = ((int[]) objArr11[1])[0];
        int i141 = ((int[]) objArr11[2])[0];
        if (i141 == i140) {
            int i142 = ((int[]) objArr11[0])[0];
            int i143 = ((int[]) objArr11[2])[0];
            int i144 = ((int[]) objArr11[1])[0];
            String[] strArr13 = (String[]) objArr11[3];
            int[] iArr6 = {i144};
            int iMyTid3 = Process.myTid();
            int i145 = ~iMyTid3;
            int i146 = i142 + (-498553052) + ((1401992990 | i145) * (-369)) + (((~((-311432973) | i145)) | 1393598486) * (-369)) + (((~(iMyTid3 | 311432972)) | 1090560018 | (~(i145 | (-8394505)))) * 369);
            int i147 = (i146 << 13) ^ i146;
            int i148 = i147 ^ (i147 >>> 17);
            ((int[]) objArr12[0])[0] = i148 ^ (i148 << 5);
            objArr12 = new Object[]{new int[1], iArr6, new int[]{i143}, strArr13};
        } else {
            ArrayList arrayList5 = new ArrayList();
            String[] strArr14 = (String[]) objArr11[3];
            if (strArr14 != null) {
                for (String str10 : strArr14) {
                    arrayList5.add(str10);
                }
            }
            int[] iArr7 = new int[i141];
            int i149 = i141 - 1;
            iArr7[i149] = 1;
            Toast.makeText((Context) null, iArr7[((i141 * i149) % 2) - 1], 1).show();
            int i150 = ((int[]) objArr11[0])[0];
            int i151 = ((int[]) objArr11[2])[0];
            int i152 = ((int[]) objArr11[1])[0];
            String[] strArr15 = (String[]) objArr11[3];
            int[] iArr8 = {i151};
            int iIdentityHashCode11 = System.identityHashCode(this);
            int i153 = ~iIdentityHashCode11;
            int i154 = i150 + 1674123330 + (((~(1494236173 | i153)) | 210795285) * (-328)) + ((iIdentityHashCode11 | 210795285) * 164) + (((~(iIdentityHashCode11 | (-1494236174))) | 135280645 | (~(i153 | 1569750813))) * 164);
            int i155 = (i154 << 13) ^ i154;
            int i156 = i155 ^ (i155 >>> 17);
            ((int[]) objArr12[0])[0] = i156 ^ (i156 << 5);
            objArr12 = new Object[]{new int[1], new int[]{i152}, iArr8, strArr15};
        }
        zzgu zzguVarZzaV = zzpgVar.zzaV();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
            char c10 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int keyRepeatTimeout3 = 651 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int i157 = 44 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            byte b49 = $$a[7];
            byte b50 = b49;
            Object[] objArr95 = new Object[1];
            c(b50, (short) (b50 | 158), b49, objArr95);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(c10, keyRepeatTimeout3, i157, -459846511, false, (String) objArr95[0], null);
        }
        long j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).getLong(null);
        long jLongValue11 = ((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
            char cIndexOf2 = (char) TextUtils.indexOf("", "");
            int bitsPerPixel = 650 - ImageFormat.getBitsPerPixel(0);
            int longPressTimeout3 = 44 - (ViewConfiguration.getLongPressTimeout() >> 16);
            short s16 = (short) ($$b | 16);
            Object[] objArr96 = new Object[1];
            c((byte) 52, s16, (byte) (s16 & 47), objArr96);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(cIndexOf2, bitsPerPixel, longPressTimeout3, -873460649, false, (String) objArr96[0], null);
        }
        if (j4 == ((jLongValue11 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
                char scrollBarFadeDuration2 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int iResolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0) + 651;
                int iRed = 44 - Color.red(0);
                byte[] bArr17 = $$a;
                byte b51 = (byte) (bArr17[27] - 1);
                short s17 = bArr17[7];
                Object[] objArr97 = new Object[1];
                c(b51, s17, (byte) s17, objArr97);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(scrollBarFadeDuration2, iResolveSizeAndState2, iRed, -1595579076, false, (String) objArr97[0], null);
            }
            Object[] objArr98 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).get(null);
            objArr13 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i158 = ((int[]) objArr98[2])[0];
            int i159 = ((int[]) objArr98[0])[0];
            int i160 = ~(System.identityHashCode(this) | 877235909);
            int i161 = (((((-6077423) | i160) * (-658)) - 1429167061) + ((i160 | (-878559216)) * 658)) - 1887347588;
            int i162 = (i161 << 13) ^ i161;
            int i163 = i162 ^ (i162 >>> 17);
            ((int[]) objArr13[3])[0] = i163 ^ (i163 << 5);
            i = 0;
        } else {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.indexOf("", "") + 1610, View.MeasureSpec.getMode(0) + 26, 2145681644, false, null, new Class[0]);
            }
            Object[] objArr99 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).newInstance(null), -1887347588, 0};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                char maxKeyCode3 = (char) (KeyEvent.getMaxKeyCode() >> 16);
                int i164 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 650;
                int i165 = 44 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                short s18 = (short) ($$b | 16);
                Object[] objArr100 = new Object[1];
                c((byte) 52, s18, (byte) (s18 & 47), objArr100);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(maxKeyCode3, i164, i165, 2075921419, false, (String) objArr100[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) Color.blue(0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 695, (ViewConfiguration.getPressedStateDuration() >> 16) + 98), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (View.resolveSizeAndState(0, 0, 0) + 63406), Color.blue(0) + 793, 83 - (ViewConfiguration.getPressedStateDuration() >> 16)), Integer.TYPE, Integer.TYPE});
            }
            objArr13 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).invoke(null, objArr99);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
                char cGreen = (char) Color.green(0);
                int i166 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 651;
                int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 44;
                byte[] bArr18 = $$a;
                byte b52 = (byte) (bArr18[27] - 1);
                short s19 = bArr18[7];
                Object[] objArr101 = new Object[1];
                c(b52, s19, (byte) s19, objArr101);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(cGreen, i166, doubleTapTimeout, -1595579076, false, (String) objArr101[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).set(null, objArr13);
            try {
                long jLongValue12 = ((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf15 = Long.valueOf(jLongValue12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
                    char cIndexOf3 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                    int i167 = 652 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    int modifierMetaStateMask2 = ((byte) KeyEvent.getModifierMetaStateMask()) + 45;
                    short s20 = (short) ($$b | 16);
                    Object[] objArr102 = new Object[1];
                    c((byte) 52, s20, (byte) (s20 & 47), objArr102);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(cIndexOf3, i167, modifierMetaStateMask2, -873460649, false, (String) objArr102[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).set(null, lValueOf15);
                Long lValueOf16 = Long.valueOf(jLongValue12 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
                    char touchSlop3 = (char) (ViewConfiguration.getTouchSlop() >> 8);
                    int keyRepeatTimeout4 = 651 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 44;
                    byte b53 = $$a[7];
                    byte b54 = b53;
                    Object[] objArr103 = new Object[1];
                    c(b54, (short) (b54 | 158), b53, objArr103);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(touchSlop3, keyRepeatTimeout4, threadPriority, -459846511, false, (String) objArr103[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).set(null, lValueOf16);
                i = 0;
            } catch (Exception unused8) {
                throw new RuntimeException();
            }
        }
        int i168 = ((int[]) objArr13[i])[i];
        int i169 = ((int[]) objArr13[2])[i];
        if (i169 != i168) {
            ArrayList arrayList6 = new ArrayList();
            String[] strArr16 = (String[]) objArr13[1];
            if (strArr16 != null) {
                for (int i170 = i; i170 < strArr16.length; i170++) {
                    arrayList6.add(strArr16[i170]);
                }
            }
            throw new RuntimeException(String.valueOf(i169));
        }
        Object[] objArr104 = new Object[4];
        int[] iArr9 = new int[1];
        objArr104[i] = iArr9;
        int[] iArr10 = new int[1];
        objArr104[2] = iArr10;
        objArr104[3] = new int[1];
        int i171 = ((int[]) objArr13[3])[i];
        int i172 = ((int[]) objArr13[2])[i];
        int i173 = ((int[]) objArr13[i])[i];
        iArr10[i] = i172;
        iArr9[i] = i173;
        objArr104[1] = new String[i];
        int i174 = ~(Process.myUid() | 957279386);
        int i175 = i171 + (((-30703515) | i174) * (-658)) + 187783577 + ((i174 | (-970915739)) * 658);
        int i176 = (i175 << 13) ^ i175;
        int i177 = i176 ^ (i176 >>> 17);
        ((int[]) objArr104[3])[0] = i177 ^ (i177 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
            char c11 = (char) (37567 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
            int gidForName = Process.getGidForName("") + 626;
            int iIndexOf10 = TextUtils.indexOf((CharSequence) "", '0', 0) + 15;
            short s21 = (short) ($$b | 16);
            Object[] objArr105 = new Object[1];
            c((byte) 52, s21, (byte) (s21 & 47), objArr105);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(c11, gidForName, iIndexOf10, -477065106, false, (String) objArr105[0], null);
        }
        long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).getLong(null);
        long jLongValue13 = ((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
            char cCombineMeasuredStates3 = (char) (37567 - View.combineMeasuredStates(0, 0));
            int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 625;
            int iResolveOpacity = 14 - Drawable.resolveOpacity(0, 0);
            byte b55 = $$a[7];
            byte b56 = b55;
            Object[] objArr106 = new Object[1];
            c(b56, (short) (b56 | 89), b55, objArr106);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(cCombineMeasuredStates3, iKeyCodeFromString, iResolveOpacity, -976899241, false, (String) objArr106[0], null);
        }
        if (j5 == ((jLongValue13 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).getLong(null) << 52) >>> 52)) >> 12)) {
            int i178 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
            b = i178 % 128;
            int i179 = i178 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
                char cLastIndexOf8 = (char) (37566 - TextUtils.lastIndexOf("", '0', 0));
                int i180 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 625;
                int doubleTapTimeout2 = 14 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                byte b57 = $$a[7];
                byte b58 = b57;
                Object[] objArr107 = new Object[1];
                c(b58, (short) (b58 | 37), b57, objArr107);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(cLastIndexOf8, i180, doubleTapTimeout2, -973632554, false, (String) objArr107[0], null);
            }
            Object[] objArr108 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).get(null);
            int i181 = ((int[]) objArr108[2])[0];
            int i182 = ((int[]) objArr108[0])[0];
            String[] strArr17 = (String[]) objArr108[3];
            int[] iArr11 = {i181};
            int[] iArr12 = {i182};
            int iIdentityHashCode12 = System.identityHashCode(this);
            int i183 = (~((-1456953685) | iIdentityHashCode12)) | 349440276;
            int i184 = ~iIdentityHashCode12;
            int i185 = (((854921792 + ((i183 | (~(1474297844 | i184))) * 886)) + (((~(i184 | 1456953684)) | 366784436) * (-1772))) + ((~(i184 | 366784436)) * 886)) - 266556122;
            int i186 = (i185 << 13) ^ i185;
            int i187 = i186 ^ (i186 >>> 17);
            ((int[]) objArr14[1])[0] = i187 ^ (i187 << 5);
            objArr14 = new Object[]{iArr12, new int[1], iArr11, strArr17};
            str = str5;
        } else {
            if (context2 != null) {
                int i188 = b + 101;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i188 % 128;
                if (i188 % 2 != 0) {
                    boolean z = context2 instanceof ContextWrapper;
                    throw null;
                }
                if ((context2 instanceof ContextWrapper) && ((ContextWrapper) context2).getBaseContext() == null) {
                    obj2 = null;
                    applicationContext3 = null;
                } else {
                    applicationContext3 = context.getApplicationContext();
                    obj2 = null;
                }
            } else {
                obj2 = null;
                applicationContext3 = context2;
            }
            str = str5;
            int iIntValue5 = ((Integer) Class.forName(str4).getMethod(str, Object.class).invoke(obj2, this)).intValue();
            Object[] objArr109 = new Object[1];
            a(new char[]{7978, 65422, 56984, 48544, 40117, 31685, 23244, 14731, 6329, 63477, 54784, 46428, 37913, 29482, 21043, 12560, 4127, 61194, 52792, 44404, 36305, 27840, 19405, 10927, 2485, 59540, 51156, 42632, 34239, 25851, 17238, 8780, 321, 57386, 65388, 56856, 48389, 39990, 31538, 23164, 14982, 6598, 63730, 55281, 46778, 38346, 29825, 21424, 13033, 4523, 61526, 53008, 44656, 36207, 27752, 19279, 10761, 2363, 59426, 51067, 42894, 34457, 26096, 17591}, 57586 - ImageFormat.getBitsPerPixel(0), objArr109);
            String str11 = (String) objArr109[0];
            Object[] objArr110 = new Object[1];
            a(new char[]{8059, 60426, 63898, 50551, 53988, 56850, 43976, 46858, 34021, 36981, 40278, 27275, 30233, 17405, 20276, 23697, 10266, 13704, 312, 3746, 7121, 59200, 62620, 49275, 52658, 55575, 42708, 45568, 49087, 35622, 39003, 26061, 28993, 32425, 19051, 22416, 8960, 12514, 15467, 2479, 5842, 57878, 61344, 64383, 51435, 54299, 41345, 44342, 47793, 34424, 37719, 24776, 27686, 31203, 17769, 21151, 24147, 11237, 14116, 1197, 4493, 7503, 60148, 63027}, 62324 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr110);
            Object[] objArr111 = {applicationContext3, new String[]{str11, (String) objArr110[0]}, Integer.valueOf(iIntValue5), 17, -266556122};
            byte[] bArr19 = $$d;
            Object[] objArr112 = new Object[1];
            d((short) 346, bArr19[24], bArr19[10], objArr112);
            Class<?> cls6 = Class.forName((String) objArr112[0]);
            Object[] objArr113 = new Object[1];
            d((short) 131, bArr19[13], bArr19[125], objArr113);
            Object[] objArr114 = (Object[]) cls6.getMethod((String) objArr113[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr111);
            int i189 = ((int[]) objArr114[0])[0];
            int i190 = ((int[]) objArr114[2])[0];
            if (applicationContext3 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
                    char cIndexOf4 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 37568);
                    int iLastIndexOf3 = TextUtils.lastIndexOf("", '0') + 626;
                    int iIndexOf11 = 13 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    byte b59 = $$a[7];
                    byte b60 = b59;
                    Object[] objArr115 = new Object[1];
                    c(b60, (short) (b60 | 37), b59, objArr115);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(cIndexOf4, iLastIndexOf3, iIndexOf11, -973632554, false, (String) objArr115[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).set(null, objArr114);
                try {
                    long jLongValue14 = ((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf17 = Long.valueOf(jLongValue14);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
                        char cResolveSize = (char) (View.resolveSize(0, 0) + 37567);
                        int offsetAfter = 625 - TextUtils.getOffsetAfter("", 0);
                        int windowTouchSlop5 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 14;
                        byte b61 = $$a[7];
                        byte b62 = b61;
                        Object[] objArr116 = new Object[1];
                        c(b62, (short) (b62 | 89), b61, objArr116);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b(cResolveSize, offsetAfter, windowTouchSlop5, -976899241, false, (String) objArr116[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).set(null, lValueOf17);
                    Long lValueOf18 = Long.valueOf(jLongValue14 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
                        char absoluteGravity4 = (char) (37567 - Gravity.getAbsoluteGravity(0, 0));
                        int tapTimeout5 = 625 - (ViewConfiguration.getTapTimeout() >> 16);
                        int fadingEdgeLength4 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 14;
                        short s22 = (short) ($$b | 16);
                        Object[] objArr117 = new Object[1];
                        c((byte) 52, s22, (byte) (s22 & 47), objArr117);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(absoluteGravity4, tapTimeout5, fadingEdgeLength4, -477065106, false, (String) objArr117[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).set(null, lValueOf18);
                } catch (Exception unused9) {
                    throw new RuntimeException();
                }
            } else {
                objArr114 = objArr114;
            }
            objArr14 = objArr114;
        }
        int i191 = ((int[]) objArr14[0])[0];
        int i192 = ((int[]) objArr14[2])[0];
        if (i192 != i191) {
            ArrayList arrayList7 = new ArrayList();
            String[] strArr18 = (String[]) objArr14[3];
            if (strArr18 != null) {
                for (String str12 : strArr18) {
                    arrayList7.add(str12);
                }
            }
            throw new RuntimeException(String.valueOf(i192));
        }
        int i193 = ((int[]) objArr14[1])[0];
        int i194 = ((int[]) objArr14[2])[0];
        int i195 = ((int[]) objArr14[0])[0];
        String[] strArr19 = (String[]) objArr14[3];
        int iIdentityHashCode13 = System.identityHashCode(this);
        int i196 = i193 + (-1563536376) + (((~((-754977037) | (~iIdentityHashCode13))) | (~(1068761084 | iIdentityHashCode13))) * (-272)) + (((~((-1031965021) | iIdentityHashCode13)) | 276987984) * (-272)) + (((~(iIdentityHashCode13 | 1031965020)) | 791773100) * 272);
        int i197 = (i196 << 13) ^ i196;
        int i198 = i197 ^ (i197 >>> 17);
        ((int[]) objArr[1])[0] = i198 ^ (i198 << 5);
        Object[] objArr118 = {new int[]{i195}, new int[1], new int[]{i194}, strArr19};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
            char trimmedLength = (char) (29944 - TextUtils.getTrimmedLength(""));
            int iGreen2 = 1755 - Color.green(0);
            int i199 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 22;
            byte[] bArr20 = $$a;
            byte b63 = (byte) (bArr20[27] - 1);
            short s23 = bArr20[7];
            Object[] objArr119 = new Object[1];
            c(b63, s23, (byte) s23, objArr119);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(trimmedLength, iGreen2, i199, 986134021, false, (String) objArr119[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
                char cResolveOpacity2 = (char) (29944 - Drawable.resolveOpacity(0, 0));
                int scrollBarFadeDuration3 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1755;
                int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 23;
                byte b64 = $$a[7];
                byte b65 = b64;
                Object[] objArr120 = new Object[1];
                c(b65, (short) (b65 | 37), b64, objArr120);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b(cResolveOpacity2, scrollBarFadeDuration3, threadPriority2, 1599039318, false, (String) objArr120[0], null);
            }
            Object[] objArr121 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).get(null);
            objArr15 = new Object[]{new int[]{((int[]) objArr121[0])[0]}, new int[]{((int[]) objArr121[1])[0]}, (Object[]) objArr121[2], new int[1], (String[]) objArr121[4]};
            int iIdentityHashCode14 = System.identityHashCode(this);
            int i200 = (((1881042720 + ((~(1065352167 | iIdentityHashCode14)) * 623)) + (((~iIdentityHashCode14) | 571205921) * (-623))) + (((~(iIdentityHashCode14 | 924580257)) | ((~(711977831 | iIdentityHashCode14)) | (-1065352168))) * 623)) - 946881965;
            int i201 = (i200 << 13) ^ i200;
            int i202 = i201 ^ (i201 >>> 17);
            ((int[]) objArr15[3])[0] = i202 ^ (i202 << 5);
            str = str;
        } else {
            int iIntValue6 = ((Integer) Class.forName(str4).getMethod(str, Object.class).invoke(null, this)).intValue();
            Object[] objArr122 = {-1015039404};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 42049), (Process.myTid() >> 22) + 1726, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113 = lambdastart1androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue6, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).newInstance(objArr122), -946881965, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
                char windowTouchSlop6 = (char) (29944 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                int defaultSize3 = View.getDefaultSize(0, 0) + 1755;
                int i203 = 23 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                byte b66 = $$a[7];
                byte b67 = b66;
                Object[] objArr123 = new Object[1];
                c(b67, (short) (b67 | 37), b66, objArr123);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b(windowTouchSlop6, defaultSize3, i203, 1599039318, false, (String) objArr123[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
            try {
                long jLongValue15 = ((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf19 = Long.valueOf(jLongValue15);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
                    char touchSlop4 = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 29944);
                    int defaultSize4 = View.getDefaultSize(0, 0) + 1755;
                    int iArgb = 23 - Color.argb(0, 0, 0, 0);
                    byte b68 = $$a[7];
                    byte b69 = b68;
                    Object[] objArr124 = new Object[1];
                    c(b69, (short) (b69 | 158), b68, objArr124);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(touchSlop4, defaultSize4, iArgb, 1596667560, false, (String) objArr124[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).set(null, lValueOf19);
                Long lValueOf20 = Long.valueOf(jLongValue15 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
                    char cIndexOf5 = (char) (TextUtils.indexOf("", "", 0, 0) + 29944);
                    int i204 = 1755 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int iLastIndexOf4 = 22 - TextUtils.lastIndexOf("", '0', 0);
                    byte[] bArr21 = $$a;
                    byte b70 = (byte) (bArr21[27] - 1);
                    short s24 = bArr21[7];
                    Object[] objArr125 = new Object[1];
                    c(b70, s24, (byte) s24, objArr125);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(cIndexOf5, i204, iLastIndexOf4, 986134021, false, (String) objArr125[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).set(null, lValueOf20);
                objArr15 = objArrTuitionPaymentFragmentbindingInflater1$7879113;
            } catch (Exception unused10) {
                throw new RuntimeException();
            }
        }
        int i205 = ((int[]) objArr15[1])[0];
        int i206 = ((int[]) objArr15[0])[0];
        if (i206 == i205) {
            int i207 = ((int[]) objArr15[3])[0];
            objArr16 = new Object[]{new int[]{((int[]) objArr15[0])[0]}, new int[]{((int[]) objArr15[1])[0]}, (Object[]) objArr15[2], new int[1], (String[]) objArr15[4]};
            int iIdentityHashCode15 = System.identityHashCode(this);
            int i208 = ~iIdentityHashCode15;
            int i209 = i207 + (-1498779572) + (((~(362471628 | i208)) | (~((-362283209) | iIdentityHashCode15))) * (-831)) + ((~(937357262 | iIdentityHashCode15)) * (-1662)) + (((~(iIdentityHashCode15 | (-362471629))) | (~(i208 | (-575074055))) | (~(575074054 | iIdentityHashCode15))) * 831);
            int i210 = (i209 << 13) ^ i209;
            int i211 = i210 ^ (i210 >>> 17);
            c = 0;
            ((int[]) objArr16[3])[0] = i211 ^ (i211 << 5);
        } else {
            ArrayList arrayList8 = new ArrayList();
            String[] strArr20 = (String[]) objArr15[4];
            if (strArr20 != null) {
                for (String str13 : strArr20) {
                    arrayList8.add(str13);
                }
            }
            Toast.makeText((Context) null, i206 / (((i206 - 1) * i206) % 2), 0).show();
            int i212 = ((int[]) objArr15[3])[0];
            objArr16 = new Object[]{new int[]{((int[]) objArr15[0])[0]}, new int[]{((int[]) objArr15[1])[0]}, (Object[]) objArr15[2], new int[1], (String[]) objArr15[4]};
            int iIdentityHashCode16 = System.identityHashCode(this);
            int i213 = ~iIdentityHashCode16;
            int i214 = i212 + 1881141566 + (((~((-30299405) | i213)) | 16925696) * 98) + (((~(i213 | (-182303022))) | (-30299405) | (~(182303021 | iIdentityHashCode16))) * (-49)) + (((~(iIdentityHashCode16 | (-30299405))) | (-199228718)) * 49);
            int i215 = (i214 << 13) ^ i214;
            int i216 = i215 ^ (i215 >>> 17);
            c = 0;
            ((int[]) objArr16[3])[0] = i216 ^ (i216 << 5);
        }
        zzgs zzgsVarZzk = zzguVarZzaV.zzk();
        String strConcat = "19/30/".concat("NetworkBroadcastReceiver received action");
        int i217 = ((int[]) objArr2[1])[c];
        int i218 = i217 * i217;
        int i219 = -(328330941 * i217);
        int i220 = (i218 & i219) + (i218 | i219);
        int i221 = -(i217 * 1352612893);
        int i222 = ((i220 | i221) << 1) - (i221 ^ i220);
        int i223 = (i222 ^ (-274198423)) + (((-274198423) & i222) << 1);
        int i224 = i223 >> 18;
        int i225 = (i223 - (~((((i224 & (-32767)) + (i224 | (-32767))) / 16384) + 1))) - 1;
        int i226 = i223 >> 27;
        int i227 = ((i226 & (-63)) + (i226 | (-63))) / 32;
        int i228 = -(i225 ^ (((i227 | 1) << 1) - (i227 ^ 1)));
        int i229 = (i228 ^ 9) + ((i228 & 9) << 1);
        int i230 = i229 >> 29;
        int i231 = ((((i230 | (-15)) << 1) - (i230 ^ (-15))) / 8) + 1;
        int i232 = 2278584 / (((-((i231 & 1) + (i231 | 1))) & i229) * 1918);
        int i233 = ((int[]) objArr4[1])[0];
        int i234 = ((i233 * i233) - (~(-(331697559 * i233)))) - 1;
        int i235 = -(i233 * (-2141513105));
        int i236 = ((i234 | i235) << 1) - (i235 ^ i234);
        int i237 = ((i236 | 1190213641) << 1) - (1190213641 ^ i236);
        int i238 = i237 >> 28;
        int i239 = ((i238 ^ (-31)) + ((i238 & (-31)) << 1)) / 16;
        int i240 = (i239 ^ 1) + ((i239 & 1) << 1);
        int i241 = (i237 & i240) + (i240 | i237);
        int i242 = i237 >> 26;
        int i243 = ((i242 & ComposerKt.defaultsKey) + (i242 | ComposerKt.defaultsKey)) / 64;
        int i244 = -(((i243 & 1) + (i243 | 1)) ^ i241);
        int i245 = (i244 ^ 7) + ((i244 & 7) << 1);
        int i246 = i245 >> 15;
        int i247 = ((i246 ^ (-262143)) + ((i246 & (-262143)) << 1)) / 131072;
        int i248 = (i247 & 1) + (i247 | 1);
        int i249 = i232 + (5482547 / (((-(((i248 | 1) << 1) - (i248 ^ 1))) & i245) * 887));
        int i250 = ((int[]) objArr53[2])[0];
        int i251 = ((i250 * i250) - (~(-(1790672460 * i250)))) - 1;
        int i252 = -(i250 * 1134285334);
        int i253 = (i251 & i252) + (i251 | i252);
        int i254 = (i253 ^ 1022777697) + ((1022777697 & i253) << 1);
        int i255 = i254 >> 19;
        int i256 = ((i255 & (-16383)) + (i255 | (-16383))) / 8192;
        int i257 = (i256 ^ 1) + ((i256 & 1) << 1);
        int i258 = ((i254 | i257) << 1) - (i257 ^ i254);
        int i259 = i254 >> 22;
        int i260 = -(i258 ^ ((((i259 ^ (-2047)) + ((i259 & (-2047)) << 1)) / 1024) + 1));
        int i261 = (i260 ^ 2) + ((i260 & 2) << 1);
        int i262 = i261 >> 29;
        int i263 = (((i262 | (-15)) << 1) - (i262 ^ (-15))) / 8;
        int i264 = i249 + (238394 / (((-(((i263 & 1) + (i263 | 1)) + 1)) & i261) * 173));
        int i265 = ((int[]) objArr84[1])[0];
        int i266 = i265 * i265;
        int i267 = -(396818781 * i265);
        int i268 = (i266 ^ i267) + ((i266 & i267) << 1);
        int i269 = -(i265 * (-1707041427));
        int i270 = (i268 ^ i269) + ((i269 & i268) << 1);
        int i271 = ((i270 | 861361625) << 1) - (861361625 ^ i270);
        int i272 = i271 >> 19;
        int i273 = (((i272 | (-16383)) << 1) - (i272 ^ (-16383))) / 8192;
        int i274 = ((i273 | 1) << 1) - (i273 ^ 1);
        int i275 = (i271 ^ i274) + ((i274 & i271) << 1);
        int i276 = i271 >> 15;
        int i277 = ((i276 & (-262143)) + (i276 | (-262143))) / 131072;
        int i278 = -((((i277 | 1) << 1) - (i277 ^ 1)) ^ i275);
        int i279 = ((i278 | 1) << 1) - (i278 ^ 1);
        int i280 = ((i279 >> 20) - 8191) / 4096;
        int i281 = (i280 ^ 1) + ((i280 & 1) << 1);
        int i282 = i264 + (1302322 / (((-(((i281 | 1) << 1) - (i281 ^ 1))) & i279) * 1358));
        int i283 = ((int[]) objArr12[0])[0];
        int i284 = i283 * i283;
        int i285 = -(1292322572 * i283);
        int i286 = (((i284 & i285) + (i284 | i285)) - (~(-(i283 * 618259356)))) - 1;
        int i287 = (i286 ^ 345695120) + ((345695120 & i286) << 1);
        int i288 = ((i287 >> 15) - 262143) / 131072;
        int i289 = ((i288 | 1) << 1) - (i288 ^ 1);
        int i290 = -(((i287 & i289) + (i287 | i289)) ^ ((((i287 >> 26) + ComposerKt.defaultsKey) / 64) + 1));
        int i291 = ((i290 | 6) << 1) - (i290 ^ 6);
        int i292 = i291 >> 21;
        int i293 = (((i292 | (-4095)) << 1) - (i292 ^ (-4095))) / 2048;
        int i294 = i282 + (2551500 / (((-(((i293 & 1) + (i293 | 1)) + 1)) & i291) * 630));
        int i295 = ((int[]) objArr118[1])[0];
        int i296 = i295 * i295;
        int i297 = -(970668699 * i295);
        int i298 = (i296 & i297) + (i296 | i297);
        int i299 = -(i295 * 698540387);
        int i300 = (i298 ^ i299) + ((i299 & i298) << 1);
        int i301 = ((i300 | (-2126126079)) << 1) - ((-2126126079) ^ i300);
        int i302 = ((i301 >> 26) + ComposerKt.defaultsKey) / 64;
        int i303 = ((i302 | 1) << 1) - (i302 ^ 1);
        int i304 = (i301 & i303) + (i303 | i301);
        int i305 = i301 >> 23;
        int i306 = (-(i304 ^ ((((i305 & (-1023)) + (i305 | (-1023))) / 512) + 1))) + 4;
        int i307 = i306 >> 27;
        int i308 = (((i307 & (-63)) + (i307 | (-63))) / 32) + 1;
        String strSubstring = strConcat.substring(i294 + ((-18352656) / ((i306 & (-((i308 & 1) + (i308 | 1)))) * 1377)));
        String str14 = action;
        zzgsVarZzk.zzb(strSubstring, str14);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
            char cRed = (char) Color.red(0);
            int keyRepeatTimeout5 = 876 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int i309 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 9;
            short s25 = (short) ($$b | 16);
            Object[] objArr126 = new Object[1];
            c((byte) 52, s25, (byte) (s25 & 47), objArr126);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(cRed, keyRepeatTimeout5, i309, 252381699, false, (String) objArr126[0], null);
        }
        long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).getLong(null);
        long jLongValue16 = ((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
            char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
            int bitsPerPixel2 = 875 - ImageFormat.getBitsPerPixel(0);
            int i310 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 10;
            byte b71 = $$a[7];
            byte b72 = b71;
            Object[] objArr127 = new Object[1];
            c(b72, (short) (b72 | 158), b71, objArr127);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b(packedPositionType, bitsPerPixel2, i310, 2009631821, false, (String) objArr127[0], null);
        }
        if (j6 == ((jLongValue16 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
                char defaultSize5 = (char) View.getDefaultSize(0, 0);
                int i311 = 877 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                int longPressTimeout4 = 10 - (ViewConfiguration.getLongPressTimeout() >> 16);
                Object[] objArr128 = new Object[1];
                c((byte) 52, (short) 210, $$a[91], objArr128);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b(defaultSize5, i311, longPressTimeout4, 256017550, false, (String) objArr128[0], null);
            }
            Object[] objArr129 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).get(null);
            objArr17 = new Object[]{new int[]{((int[]) objArr129[0])[0]}, new int[1], new int[]{((int[]) objArr129[2])[0]}, (String[]) objArr129[3]};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i312 = ((((-1093408236) + (((~((-67635305) | (~iFreeMemory))) | (~((-27325076) | iFreeMemory))) * (-272))) + (((~((-878643565) | iFreeMemory)) | 811008260) * (-272))) + (((~(iFreeMemory | 878643564)) | (-838333336)) * 272)) - 1621236981;
            int i313 = (i312 << 13) ^ i312;
            int i314 = i313 ^ (i313 >>> 17);
            ((int[]) objArr17[1])[0] = i314 ^ (i314 << 5);
        } else {
            Context applicationContext6 = context2 != null ? ((context2 instanceof ContextWrapper) && ((ContextWrapper) context2).getBaseContext() == null) ? null : context.getApplicationContext() : context2;
            Object[] objArr130 = {applicationContext6, Integer.valueOf(((Integer) Class.forName(str4).getMethod(str, Object.class).invoke(null, this)).intValue()), -1621236981};
            byte[] bArr22 = $$d;
            Object[] objArr131 = new Object[1];
            d((short) 404, (byte) (bArr22[89] + 1), bArr22[412], objArr131);
            Class<?> cls7 = Class.forName((String) objArr131[0]);
            Object[] objArr132 = new Object[1];
            d((short) 309, bArr22[97], bArr22[125], objArr132);
            objArr17 = (Object[]) cls7.getMethod((String) objArr132[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr130);
            if (applicationContext6 != null) {
                int i315 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
                b = i315 % 128;
                try {
                    if (i315 % 2 == 0) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
                            char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                            int i316 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 876;
                            int iIndexOf12 = TextUtils.indexOf("", "", 0, 0) + 10;
                            Object[] objArr133 = new Object[1];
                            c((byte) 52, (short) 210, $$a[91], objArr133);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b(keyRepeatDelay, i316, iIndexOf12, 256017550, false, (String) objArr133[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).set(null, objArr17);
                        long jLongValue17 = ((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf21 = Long.valueOf(jLongValue17);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
                            char windowTouchSlop7 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                            int tapTimeout6 = (ViewConfiguration.getTapTimeout() >> 16) + 876;
                            int i317 = 11 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            byte b73 = $$a[7];
                            byte b74 = b73;
                            Object[] objArr134 = new Object[1];
                            c(b74, (short) (b74 | 158), b73, objArr134);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b(windowTouchSlop7, tapTimeout6, i317, 2009631821, false, (String) objArr134[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).set(null, lValueOf21);
                        Long lValueOf22 = Long.valueOf(jLongValue17 << 104);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
                            char touchSlop5 = (char) (ViewConfiguration.getTouchSlop() >> 8);
                            int i318 = 876 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int iCombineMeasuredStates4 = View.combineMeasuredStates(0, 0) + 10;
                            short s26 = (short) ($$b | 16);
                            Object[] objArr135 = new Object[1];
                            c((byte) 52, s26, (byte) (s26 & 47), objArr135);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(touchSlop5, i318, iCombineMeasuredStates4, 252381699, false, (String) objArr135[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).set(null, lValueOf22);
                    } else {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault71 == null) {
                            char fadingEdgeLength5 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                            int iNormalizeMetaState2 = 876 - KeyEvent.normalizeMetaState(0);
                            int iKeyCodeFromString2 = KeyEvent.keyCodeFromString("") + 10;
                            Object[] objArr136 = new Object[1];
                            c((byte) 52, (short) 210, $$a[91], objArr136);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.b(fadingEdgeLength5, iNormalizeMetaState2, iKeyCodeFromString2, 256017550, false, (String) objArr136[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault71).set(null, objArr17);
                        long jLongValue18 = ((Long) Class.forName(str2).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf23 = Long.valueOf(jLongValue18);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault72 == null) {
                            char modifierMetaStateMask3 = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                            int keyRepeatDelay2 = 876 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                            int modifierMetaStateMask4 = 9 - ((byte) KeyEvent.getModifierMetaStateMask());
                            byte b75 = $$a[7];
                            byte b76 = b75;
                            Object[] objArr137 = new Object[1];
                            c(b76, (short) (b76 | 158), b75, objArr137);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.b(modifierMetaStateMask3, keyRepeatDelay2, modifierMetaStateMask4, 2009631821, false, (String) objArr137[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault72).set(null, lValueOf23);
                        Long lValueOf24 = Long.valueOf(jLongValue18 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault73 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault73 == null) {
                            char c12 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                            int maximumFlingVelocity3 = 876 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            int i319 = 10 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                            short s27 = (short) (16 | $$b);
                            Object[] objArr138 = new Object[1];
                            c((byte) 52, s27, (byte) (s27 & 47), objArr138);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault73 = initSession.b(c12, maximumFlingVelocity3, i319, 252381699, false, (String) objArr138[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault73).set(null, lValueOf24);
                    }
                } catch (Exception unused11) {
                    throw new RuntimeException();
                }
            }
        }
        int i320 = ((int[]) objArr17[2])[0];
        int i321 = ((int[]) objArr17[0])[0];
        if (i321 != i320) {
            throw new RuntimeException(String.valueOf(i321));
        }
        int i322 = b + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i322 % 128;
        int i323 = i322 % 2;
        int i324 = ((int[]) objArr17[1])[0];
        Object[] objArr139 = {new int[]{((int[]) objArr17[0])[0]}, new int[1], new int[]{((int[]) objArr17[2])[0]}, (String[]) objArr17[3]};
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i325 = ~iElapsedRealtime;
        int i326 = i324 + 222135736 + (((~((-223836701) | i325)) | 183526471) * (-865)) + ((~(iElapsedRealtime | 223836700)) * 865) + (((~(183526471 | i325)) | (~(i325 | 223836700))) * 865);
        int i327 = i326 ^ (i326 << 13);
        int i328 = i327 ^ (i327 >>> 17);
        ((int[]) objArr139[1])[0] = i328 ^ (i328 << 5);
        String strConcat2 = "19;14;11;27;10;".concat("android.net.conn.CONNECTIVITY_CHANGE");
        int i329 = ((int[]) objArr7[2])[0];
        int i330 = i329 * i329;
        int i331 = -(342895914 * i329);
        int i332 = (((i330 & i331) + (i330 | i331)) - (~(-(i329 * 1622569616)))) - 1;
        int i333 = (i332 ^ (-189258551)) + (((-189258551) & i332) << 1);
        int i334 = i333 >> 19;
        int i335 = (((i334 & (-16383)) + (i334 | (-16383))) / 8192) + 1;
        int i336 = (i333 ^ i335) + ((i335 & i333) << 1);
        int i337 = i333 >> 27;
        int i338 = ((i337 & (-63)) + (i337 | (-63))) / 32;
        int i339 = -(i336 ^ ((i338 & 1) + (i338 | 1)));
        int i340 = ((i339 | 5) << 1) - (i339 ^ 5);
        int i341 = ((i340 >> 16) - 131071) / 65536;
        int i342 = ((i341 | 1) << 1) - (i341 ^ 1);
        int i343 = 7553325 / (((-(((i342 | 1) << 1) - (i342 ^ 1))) & i340) * 1905);
        int i344 = ((int[]) objArr9[0])[0];
        int i345 = i344 * i344;
        int i346 = -(955038782 * i344);
        int i347 = (i345 ^ i346) + ((i345 & i346) << 1);
        int i348 = -(i344 * (-803445310));
        int i349 = (i347 & i348) + (i348 | i347);
        int i350 = (i349 & (-635371520)) + ((-635371520) | i349);
        int i351 = i350 >> 25;
        int i352 = (((i351 | (-255)) << 1) - (i351 ^ (-255))) / 128;
        int i353 = (i352 & 1) + (i352 | 1);
        int i354 = (i350 & i353) + (i353 | i350);
        int i355 = ((i350 >> 24) - 511) / 256;
        int i356 = -(i354 ^ ((i355 & 1) + (i355 | 1)));
        int i357 = (i356 & 8) + (i356 | 8);
        int i358 = i357 >> 18;
        int i359 = ((i358 ^ (-32767)) + ((i358 & (-32767)) << 1)) / 16384;
        int i360 = (i359 & 1) + (i359 | 1);
        int i361 = i343 + (1450304 / (((-(((i360 | 1) << 1) - (i360 ^ 1))) & i357) * 527));
        int i362 = ((int[]) objArr104[3])[0];
        int i363 = ((i362 * i362) - (~(-(250823664 * i362)))) - 1;
        int i364 = -(i362 * (-1403557260));
        int i365 = (i363 & i364) + (i363 | i364);
        int i366 = (i365 & (-668531260)) + ((-668531260) | i365);
        int i367 = i366 >> 16;
        int i368 = (((i367 ^ (-131071)) + ((i367 & (-131071)) << 1)) / 65536) + 1;
        int i369 = (i366 & i368) + (i368 | i366);
        int i370 = i366 >> 15;
        int i371 = ((i370 ^ (-262143)) + ((i370 & (-262143)) << 1)) / 131072;
        int i372 = -(i369 ^ ((i371 ^ 1) + ((i371 & 1) << 1)));
        int i373 = (i372 ^ 2) + ((i372 & 2) << 1);
        int i374 = i373 >> 16;
        int i375 = ((i374 ^ (-131071)) + ((i374 & (-131071)) << 1)) / 65536;
        int i376 = (i375 ^ 1) + ((i375 & 1) << 1);
        int i377 = i361 + (259200 / (((-(((i376 | 1) << 1) - (i376 ^ 1))) & i373) * 540));
        int i378 = ((int[]) objArr16[3])[0];
        int i379 = i378 * i378;
        int i380 = -(2106752438 * i378);
        int i381 = ((((i379 | i380) << 1) - (i379 ^ i380)) - (~(-(i378 * (-797593688))))) - 1;
        int i382 = (i381 ^ 159026081) + ((159026081 & i381) << 1);
        int i383 = (((i382 >> 24) - 511) / 256) + 1;
        int i384 = (i382 ^ i383) + ((i383 & i382) << 1);
        int i385 = ((i382 >> 29) - 15) / 8;
        int i386 = (-(i384 ^ ((i385 & 1) + (i385 | 1)))) + 1;
        int i387 = i386 >> 24;
        int i388 = (((i387 | (-511)) << 1) - (i387 ^ (-511))) / 256;
        int i389 = (i388 ^ 1) + ((i388 & 1) << 1);
        int i390 = i377 + (226940 / ((i386 & (-((i389 ^ 1) + ((i389 & 1) << 1)))) * 1621));
        int i391 = ((int[]) objArr139[1])[0];
        int i392 = ((i391 * i391) - (~(-(713036804 * i391)))) - 1;
        int i393 = -(i391 * (-1328681062));
        int i394 = ((i392 | i393) << 1) - (i393 ^ i392);
        int i395 = (i394 ^ (-1575664287)) + (((-1575664287) & i394) << 1);
        int i396 = i395 >> 25;
        int i397 = (((i396 | (-255)) << 1) - (i396 ^ (-255))) / 128;
        int i398 = ((i397 | 1) << 1) - (i397 ^ 1);
        int i399 = (i395 ^ i398) + ((i398 & i395) << 1);
        int i400 = ((i395 >> 27) - 63) / 32;
        int i401 = -(i399 ^ ((i400 & 1) + (i400 | 1)));
        int i402 = (i401 ^ 4) + ((i401 & 4) << 1);
        int i403 = i402 >> 17;
        int i404 = ((i403 ^ (-65535)) + ((i403 & (-65535)) << 1)) / 32768;
        int i405 = ((i404 | 1) << 1) - (i404 ^ 1);
        if (!strConcat2.substring(i390 + ((-9354456) / (((-((i405 & 1) + (i405 | 1))) & i402) * 1557))).equals(str14)) {
            zzpgVar.zzaV().zze().zzb("NetworkBroadcastReceiver received unknown action", str14);
            return;
        }
        boolean zZzb = zzpgVar.zzi().zzb();
        if (this.zzc != zZzb) {
            this.zzc = zZzb;
            zzpgVar.zzaW().zzj(new zzha(this, zZzb));
        }
    }

    public final void zza() {
        int i = 2 % 2;
        int i2 = b + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        zzpg zzpgVar = this.zza;
        zzpgVar.zzu();
        zzpgVar.zzaW().zzg();
        if (!this.zzb) {
            zzpgVar.zzaY().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.zzc = zzpgVar.zzi().zzb();
            zzpgVar.zzaV().zzk().zzb("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.zzc));
            this.zzb = true;
            return;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 57;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void zzb() {
        int i = 2 % 2;
        zzpg zzpgVar = this.zza;
        zzpgVar.zzu();
        zzpgVar.zzaW().zzg();
        zzpgVar.zzaW().zzg();
        if (!this.zzb) {
            int i2 = b + 121;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        zzpgVar.zzaV().zzk().zza("Unregistering connectivity change receiver");
        this.zzb = false;
        this.zzc = false;
        try {
            zzpgVar.zzaY().unregisterReceiver(this);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
            b = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        } catch (IllegalArgumentException e2) {
            this.zza.zzaV().zzb().zzb("Failed to unregister the network broadcast receiver", e2);
        }
    }

    static {
        TuitionPaymentFragmentbindingInflater1 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 15;
        TuitionPaymentFragmentbindingInflater1 = i % 128;
        int i2 = i % 2;
    }

    final /* synthetic */ zzpg zzc() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            return this.zza;
        }
        throw null;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -5551941630484236797L;
    }
}
