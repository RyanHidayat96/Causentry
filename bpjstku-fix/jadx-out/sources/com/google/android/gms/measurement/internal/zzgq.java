package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLogging;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import com.google.android.gms.tasks.OnFailureListener;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes5.dex */
public final class zzgq {
    private static short[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static zzgq zza;
    private final zzic zzb;
    private final TelemetryLoggingClient zzc;
    private final AtomicLong zzd = new AtomicLong(-1);
    private static final byte[] $$c = {49, -45, -112, 57};
    private static final int $$f = 63;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {30, 17, -35, 104, 4, -11, -11, -19, -10, 6, -22, 38, -39, -21, -1, -22, 8, 52, -57, -42, 3, -20, 2, -15, -8, 21, -26, -33, 3, -1, -18, -15, 37, -53, 8, -15, -15, -1, -18, -15, 9, -16, -14, 1, -14, -14, -2, 21, -46, -1, -15, 2, -28, 6, -22, 56, -42, 3, -20, 2, -15, -8, 21, -26, -33, 3, -1, -18, -15, 37, -53, 8, -15, -15, -1, -18, -15, -8, -6, 2, -7, -15, -1, -20, -6, -14, -7, -6, -14, 0, -8, -27, 4, -5, -27, 33, -43, 2, -10, -16, -1, -10, -10, -4, -29, 0, -17, 57};
    private static final int $$e = 182;
    private static final byte[] $$a = {70, -114, 113, 8, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 3;
    private static int g = 0;
    private static int asBinder = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = -1482881804;
    private static int b = -1934795599;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -2048132861;
    private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {-18, 18, -27, -49, 48, -18, 23, -25, 28, -64, -61, 93, -30, -89, 44, 29, 28, 27, -24, 16, -21, 30, -30, 19, -18, -19, 26, -11, 8, 25, 20, -27, -23, 19, -31, -27, 26, 21, -20, -14, Base64.padSymbol, -29, -19, 21, -21, 19, -9, -60, -11, 88, -26, -23, -43, 44, 29, 28, 27, -24, 16, -21, 25, -32, 19, -11, 24, 28, 27, 26, -26, -55, 43, -32, -17, 21, -26, 27, -12, -26, -26, -26, -26};

    private zzgq(Context context, zzic zzicVar) {
        this.zzc = TelemetryLogging.getClient(context, TelemetryLoggingOptions.builder().setApi("measurement:api").build());
        this.zzb = zzicVar;
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
    private static void a(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 14
            int r7 = 98 - r7
            byte[] r0 = com.google.android.gms.measurement.internal.zzgq.$$a
            int r1 = 53 - r8
            int r6 = r6 * 52
            int r6 = 56 - r6
            byte[] r1 = new byte[r1]
            int r8 = 52 - r8
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2b
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r6]
            r5 = r3
            r3 = r7
            r7 = r5
        L2b:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-10)
            int r6 = r6 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzgq.a(byte, int, short, java.lang.Object[]):void");
    }

    private static void d(short s, short s2, short s3, Object[] objArr) {
        byte[] bArr = $$d;
        int i = 114 - (s2 * 30);
        int i2 = s3 * 4;
        int i3 = (s * 52) + 4;
        byte[] bArr2 = new byte[i2 + 53];
        int i4 = i2 + 52;
        int i5 = -1;
        if (bArr == null) {
            i3++;
            i = (i4 + (-i)) - 9;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i;
            if (i6 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i3++;
            i = (i + (-bArr[i3])) - 9;
            i5 = i6;
        }
    }

    static zzgq zza(zzic zzicVar) {
        int i = 2 % 2;
        int i2 = asBinder + 31;
        g = i2 % 128;
        int i3 = i2 % 2;
        if (zza == null) {
            zza = new zzgq(zzicVar.zzaY(), zzicVar);
        }
        zzgq zzgqVar = zza;
        int i4 = asBinder + 73;
        g = i4 % 128;
        int i5 = i4 % 2;
        return zzgqVar;
    }

    public final void zzb(int i, int i2, long j, long j2, int i3) {
        Object[] objArr;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char fadingEdgeLength = (char) (31533 - (ViewConfiguration.getFadingEdgeLength() >> 16));
            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 921;
            int gidForName = Process.getGidForName("") + 29;
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            byte b3 = bArr[80];
            Object[] objArr2 = new Object[1];
            a(b2, b3, (byte) (b3 | 52), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(fadingEdgeLength, offsetBefore, gidForName, -1048449946, false, (String) objArr2[0], null);
        }
        long j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c((ViewConfiguration.getJumpTapTimeout() >> 16) - 155624836, (-65) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (short) (ViewConfiguration.getJumpTapTimeout() >> 16), (byte) (ViewConfiguration.getScrollBarFadeDuration() >> 16), ExpandableListView.getPackedPositionType(0L) - 724588562, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 155624833, View.combineMeasuredStates(0, 0) - 72, (short) (Process.myPid() >> 22), (byte) TextUtils.getTrimmedLength(""), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 724588542, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 31533);
            int mode = 921 - View.MeasureSpec.getMode(0);
            int maxKeyCode2 = (KeyEvent.getMaxKeyCode() >> 16) + 28;
            byte[] bArr2 = $$a;
            byte b4 = bArr2[7];
            Object[] objArr5 = new Object[1];
            a(b4, b4, bArr2[80], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maxKeyCode, mode, maxKeyCode2, -778300370, false, (String) objArr5[0], null);
        }
        if (j3 == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 31534);
                int fadingEdgeLength2 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 921;
                int mode2 = 28 - View.MeasureSpec.getMode(0);
                byte[] bArr3 = $$a;
                Object[] objArr6 = new Object[1];
                a(bArr3[80], bArr3[7], (byte) (-bArr3[33]), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionChild, fadingEdgeLength2, mode2, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i ^ (i << 5)}, new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int i4 = ~i;
            int i5 = ((((-1518492233) + (((~(1593573335 | i4)) | 180506308) * 220)) + (((~(i4 | 1324019669)) | 450059974) * (-440))) + ((i | 1593573335) * 220)) - 496537082;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
        } else {
            Object[] objArr8 = new Object[1];
            c(View.MeasureSpec.getSize(0) - 155624836, (-61) - (ViewConfiguration.getEdgeSlop() >> 16), (short) ExpandableListView.getPackedPositionGroup(0L), (byte) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (-724588527) - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c((-155624834) - Gravity.getAbsoluteGravity(0, 0), (-68) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (short) Gravity.getAbsoluteGravity(0, 0), (byte) (KeyEvent.getMaxKeyCode() >> 16), KeyEvent.normalizeMetaState(0) - 724588502, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            try {
                Object[] objArr10 = {applicationContext, Integer.valueOf(i), 0, -496537082};
                byte[] bArr4 = $$d;
                byte b5 = bArr4[89];
                byte b6 = b5;
                Object[] objArr11 = new Object[1];
                d(b5, b6, b6, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b7 = bArr4[43];
                Object[] objArr12 = new Object[1];
                d(b7, b7, bArr4[89], objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char fadingEdgeLength3 = (char) (31533 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                    int defaultSize = View.getDefaultSize(0, 0) + 921;
                    int iRgb = (-16777188) - Color.rgb(0, 0, 0);
                    byte[] bArr5 = $$a;
                    Object[] objArr14 = new Object[1];
                    a(bArr5[80], bArr5[7], (byte) (-bArr5[33]), objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(fadingEdgeLength3, defaultSize, iRgb, -1142834547, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                try {
                    Object[] objArr15 = new Object[1];
                    c(View.MeasureSpec.makeMeasureSpec(0, 0) - 155624836, KeyEvent.normalizeMetaState(0) - 65, (short) (ViewConfiguration.getScrollDefaultDelay() >> 16), (byte) Color.alpha(0), Color.blue(0) - 724588562, objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    c(ExpandableListView.getPackedPositionChild(0L) - 155624831, (-72) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (short) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (byte) (ViewConfiguration.getEdgeSlop() >> 16), (-724588541) - (Process.myPid() >> 22), objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cBlue = (char) (Color.blue(0) + 31533);
                        int i8 = 921 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int mirror = AndroidCharacter.getMirror('0') - 20;
                        byte[] bArr6 = $$a;
                        byte b8 = bArr6[7];
                        Object[] objArr17 = new Object[1];
                        a(b8, b8, bArr6[80], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cBlue, i8, mirror, -778300370, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 31532);
                        int iResolveSize = 921 - View.resolveSize(0, 0);
                        int defaultSize2 = 28 - View.getDefaultSize(0, 0);
                        byte[] bArr7 = $$a;
                        byte b9 = bArr7[7];
                        byte b10 = bArr7[80];
                        Object[] objArr18 = new Object[1];
                        a(b9, b10, (byte) (b10 | 52), objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, iResolveSize, defaultSize2, -1048449946, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr13;
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
        int i9 = ((int[]) objArr[1])[0];
        int i10 = ((int[]) objArr[3])[0];
        if (i10 == i9) {
            int i11 = ((int[]) objArr[0])[0];
            Object[] objArr19 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iMyTid = Process.myTid();
            int i12 = i11 + ((((~((-68699460) | iMyTid)) | 296093696) * TypedValues.PositionType.TYPE_TRANSITION_EASING) - 598664580) + ((~((~iMyTid) | (-68699460))) * TypedValues.PositionType.TYPE_TRANSITION_EASING);
            int i13 = (i12 << 13) ^ i12;
            int i14 = i13 ^ (i13 >>> 17);
            ((int[]) objArr19[0])[0] = i14 ^ (i14 << 5);
            synchronized (this) {
                final long jElapsedRealtime = this.zzb.zzaZ().elapsedRealtime();
                AtomicLong atomicLong = this.zzd;
                long j4 = atomicLong.get();
                int i15 = ((int[]) objArr19[0])[0];
                int i16 = ((((i15 * i15) - (~(-(36021708 * i15)))) - 1) - (~(-(i15 * (-548265950))))) - (-2115177040);
                int i17 = i16 >> 27;
                int i18 = (((i17 | (-63)) << 1) - (i17 ^ (-63))) / 32;
                int i19 = ((i18 | 1) << 1) - (i18 ^ 1);
                int i20 = ((i16 | i19) << 1) - (i19 ^ i16);
                int i21 = i16 >> 21;
                int i22 = ((i21 & (-4095)) + (i21 | (-4095))) / 2048;
                int i23 = (-(((i22 & 1) + (i22 | 1)) ^ i20)) + 4;
                int i24 = i23 >> 21;
                int i25 = (((i24 | (-4095)) << 1) - (i24 ^ (-4095))) / 2048;
                int i26 = (i25 ^ 1) + ((i25 & 1) << 1);
                if (j4 != ((long) (2917508 / ((i23 & (-((i26 ^ 1) + ((i26 & 1) << 1)))) * 1087))) - 672 && jElapsedRealtime - atomicLong.get() <= 1800000) {
                    return;
                }
                this.zzc.log(new TelemetryData(0, Arrays.asList(new MethodInvocation(36301, i2, 0, j, j2, null, null, 0, i3)))).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.measurement.internal.zzgp
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final /* synthetic */ void onFailure(Exception exc) {
                        this.zza.zzc(jElapsedRealtime, exc);
                    }
                });
                return;
            }
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = (String[]) objArr[4];
        if (strArr != null) {
            for (String str : strArr) {
                arrayList.add(str);
            }
        }
        throw new RuntimeException(String.valueOf(i10));
    }

    final /* synthetic */ void zzc(long j, Exception exc) {
        int i = 2 % 2;
        int i2 = asBinder + 73;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            this.zzd.set(j);
            int i3 = 3 / 0;
        } else {
            this.zzd.set(j);
        }
        int i4 = g + 23;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 20 / 0;
        }
    }

    private static void c(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4;
        int i5 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(b)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 2267 - View.getDefaultSize(0, 0), 34 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 1387473586, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i6 = $10 + 103;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                z = true;
            } else {
                z = false;
            }
            if (!(!z)) {
                byte[] bArr = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i8 = 0; i8 < length; i8++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b5 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.indexOf("", "", 0, 0), KeyEvent.normalizeMetaState(0) + 3358, 18 - Gravity.getAbsoluteGravity(0, 0), -1054011043, false, $$g(b5, b5, (byte) $$c.length), new Class[]{Integer.TYPE});
                        }
                        bArr2[i8] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    try {
                        Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 2267 - (ViewConfiguration.getLongPressTimeout() >> 16), KeyEvent.normalizeMetaState(0) + 33, 1387473586, false, $$g(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) b) ^ 3046761265686732006L)));
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    iIntValue = (short) (((short) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2[i3 + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) b) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                int i9 = $10 + 111;
                int i10 = i9 % 128;
                $11 = i10;
                int i11 = i9 % 2;
                int i12 = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L));
                if (z) {
                    int i13 = i10 + 69;
                    int i14 = i13 % 128;
                    $10 = i14;
                    int i15 = i13 % 2;
                    int i16 = i14 + 93;
                    $11 = i16 % 128;
                    int i17 = i16 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i12 + i4;
                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 55904), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2854, (-16777203) - Color.rgb(0, 0, 0), -1529949196, false, $$g(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i18 = 0; i18 < length2; i18++) {
                        bArr5[i18] = (byte) (((long) bArr4[i18]) ^ 3046761265686732006L);
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    if (z2) {
                        byte[] bArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i19 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i19 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i19]) ^ 3046761265686732006L)) + s)) ^ b2));
                    } else {
                        short[] sArr = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i20 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i20 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i20]) ^ 3046761265686732006L)) + s)) ^ b2));
                        int i21 = $10 + 41;
                        $11 = i21 % 128;
                        int i22 = i21 % 2;
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, short r7, short r8) {
        /*
            int r8 = r8 + 117
            byte[] r0 = com.google.android.gms.measurement.internal.zzgq.$$c
            int r6 = r6 * 2
            int r1 = r6 + 1
            int r7 = r7 * 3
            int r7 = 4 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r6
            r4 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L20:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L28:
            int r7 = r7 + 1
            int r8 = -r8
            int r8 = r8 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzgq.$$g(short, short, short):java.lang.String");
    }
}
