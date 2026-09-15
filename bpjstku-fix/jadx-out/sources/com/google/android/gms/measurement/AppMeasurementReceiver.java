package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
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
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.internal.auth.zzgx;
import com.google.android.gms.measurement.internal.zzhl;
import com.google.mlkit.common.MlKitException;
import defpackage.CameraUseCaseAdapter;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.initSession;
import defpackage.setVideoStabilizationMode;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
public final class AppMeasurementReceiver extends WakefulBroadcastReceiver implements zzhl.zza {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$d;
    private static final int $$e;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private zzhl zza;
    private static final byte[] $$c = {5, -91, 77, 46};
    private static final int $$f = 134;
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(int r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r5 = 213 - r5
            byte[] r0 = com.google.android.gms.measurement.AppMeasurementReceiver.$$a
            int r1 = 53 - r7
            int r6 = 103 - r6
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
            byte r4 = (byte) r6
            int r5 = r5 + 1
            r1[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            r4 = r0[r5]
            int r3 = r3 + 1
        L26:
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurementReceiver.b(int, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001e -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x001e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.android.gms.measurement.AppMeasurementReceiver.$$d
            int r1 = r7 + 1
            int r6 = r6 + 67
            int r8 = r8 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r8
            r4 = r2
            goto L27
        L10:
            r3 = r2
        L11:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L1e
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L1e:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L27:
            int r6 = -r6
            int r8 = r8 + r6
            int r6 = r8 + (-4)
            int r8 = r3 + 1
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurementReceiver.c(short, byte, short, java.lang.Object[]):void");
    }

    public final BroadcastReceiver.PendingResult doGoAsync() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            goAsync();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        return pendingResultGoAsync;
    }

    @Override // com.google.android.gms.measurement.internal.zzhl.zza
    public final void doStartService(Context context, Intent intent) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        startWakefulService(context, intent);
        if (i3 != 0) {
            int i4 = 31 / 0;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int length;
        char[] cArr;
        int i2;
        int i3 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i4 = 0;
        int i5 = iArr[0];
        int i6 = 1;
        int i7 = iArr[1];
        int i8 = iArr[2];
        int i9 = iArr[3];
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (cArr2 != null) {
            int i10 = $10 + 113;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                try {
                    Object[] objArr2 = new Object[i6];
                    objArr2[i4] = Integer.valueOf(cArr2[i2]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cIndexOf = (char) TextUtils.indexOf("", "", i4, i4);
                        int iNormalizeMetaState = 1270 - KeyEvent.normalizeMetaState(i4);
                        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i4) + 18;
                        byte b = $$c[i4];
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iNormalizeMetaState, absoluteGravity, 407021364, false, $$g((byte) i4, b, (byte) (b - 5)), new Class[]{Integer.TYPE});
                    }
                    cArr[i2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i2++;
                    i4 = 0;
                    i6 = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i7];
        System.arraycopy(cArr2, i5, cArr3, 0, i7);
        if (bArr != null) {
            char[] cArr4 = new char[i7];
            setvideostabilizationmode.b = 0;
            char c = 0;
            while (setvideostabilizationmode.b < i7) {
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i11 = $11 + 45;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    int i13 = setvideostabilizationmode.b;
                    Object[] objArr3 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b2 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) View.resolveSize(0, 0), 3225 - (Process.myPid() >> 22), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 13, 2133916302, false, $$g(b2, (byte) (b2 | 6), b2), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                } else {
                    int i14 = setvideostabilizationmode.b;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 29944);
                            int i15 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1755;
                            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 23;
                            byte length2 = (byte) $$c.length;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveOpacity, i15, offsetBefore, 387247676, false, $$g((byte) 0, length2, (byte) (length2 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i14] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c = cArr4[setvideostabilizationmode.b];
                Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (41241 - (ViewConfiguration.getTapTimeout() >> 16)), 1704 - TextUtils.lastIndexOf("", '0', 0, 0), View.getDefaultSize(0, 0) + 21, -1434471773, false, $$g(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i9 > 0) {
            char[] cArr5 = new char[i7];
            System.arraycopy(cArr3, 0, cArr5, 0, i7);
            int i16 = i7 - i9;
            System.arraycopy(cArr5, 0, cArr3, i16, i9);
            System.arraycopy(cArr5, i9, cArr3, 0, i16);
            int i17 = $10 + 107;
            $11 = i17 % 128;
            i = 2;
            if (i17 % 2 == 0) {
                int i18 = 2 % 5;
            }
        } else {
            i = 2;
        }
        if (z) {
            int i19 = $11 + 45;
            $10 = i19 % 128;
            int i20 = i19 % i;
            char[] cArr6 = new char[i7];
            int i21 = 0;
            while (true) {
                setvideostabilizationmode.b = i21;
                if (setvideostabilizationmode.b >= i7) {
                    break;
                }
                cArr6[setvideostabilizationmode.b] = cArr3[(i7 - setvideostabilizationmode.b) - 1];
                i21 = setvideostabilizationmode.b + 1;
            }
            cArr3 = cArr6;
        }
        if (i8 > 0) {
            setvideostabilizationmode.b = 0;
            int i22 = $10 + 43;
            $11 = i22 % 128;
            int i23 = i22 % 2;
            while (setvideostabilizationmode.b < i7) {
                int i24 = $11 + 117;
                $10 = i24 % 128;
                int i25 = i24 % 2;
                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                setvideostabilizationmode.b++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:242:0x166b  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws Throwable {
        String str;
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da;
        Object[] objArr2;
        Context context2;
        Object[] objArr3;
        Context applicationContext;
        String str2;
        Object[] objArr4;
        Context applicationContext2;
        Object[] objArr5;
        int i;
        Object[] objArr6;
        Object[] objArr7;
        Object[] objArr8;
        int i2;
        Object[] objArr9;
        Context context3;
        Context applicationContext3;
        Object[] objArr10;
        int i3 = 2 % 2;
        Object[] objArr11 = new Object[1];
        a(new int[]{0, 22, 36, 0}, true, new byte[]{1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, objArr11);
        String str3 = (String) objArr11[0];
        Object[] objArr12 = new Object[1];
        a(new int[]{22, 15, 0, 0}, false, new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr12);
        String str4 = (String) objArr12[0];
        Object[] objArr13 = new Object[1];
        a(new int[]{37, 16, 33, 0}, false, new byte[]{1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0}, objArr13);
        String str5 = (String) objArr13[0];
        Object[] objArr14 = new Object[1];
        a(new int[]{53, 16, 196, 0}, false, new byte[]{1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1}, objArr14);
        String str6 = (String) objArr14[0];
        int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i4 != (-1134047304) + (((~iIdentityHashCode) | 268989001) * 1324) + (((~(iIdentityHashCode | (-1806142755))) | (~(976155211 | iIdentityHashCode))) * (-1324)) + 644908004) {
            throw null;
        }
        int i5 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        if (i5 != ((~((-268468757) | iFreeMemory)) * 521) + 815712864 + (((~((~iFreeMemory) | (-268468757))) | 1177563144) * 521)) {
            throw new RuntimeException("-175506210");
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char trimmedLength = (char) TextUtils.getTrimmedLength("");
            int i6 = 877 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int jumpTapTimeout = 10 - (ViewConfiguration.getJumpTapTimeout() >> 16);
            byte b = $$a[91];
            Object[] objArr15 = new Object[1];
            b((short) 210, b, (byte) (b - 4), objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(trimmedLength, i6, jumpTapTimeout, -1650998592, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        long jLongValue = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 876;
            int doubleTapTimeout = 10 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            short s = (short) ($$b + 1);
            byte[] bArr = $$a;
            Object[] objArr16 = new Object[1];
            b(s, bArr[91], bArr[7], objArr16);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, packedPositionGroup, doubleTapTimeout, 2012020043, false, (String) objArr16[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char size = (char) View.MeasureSpec.getSize(0);
                int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 876;
                int iMakeMeasureSpec = 10 - View.MeasureSpec.makeMeasureSpec(0, 0);
                byte[] bArr2 = $$a;
                Object[] objArr17 = new Object[1];
                b((short) 121, bArr2[91], bArr2[7], objArr17);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(size, maxKeyCode, iMakeMeasureSpec, 2012931276, false, (String) objArr17[0], null);
            }
            Object[] objArr18 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr18[0])[0]}, new int[1], new int[]{((int[]) objArr18[2])[0]}, (String[]) objArr18[3]};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i7 = ~startUptimeMillis;
            int i8 = (-1050682777) + (((~((-569390826) | i7)) | (-529080597)) * (-602)) + (((~(startUptimeMillis | (-569390826))) | 544216809 | (~((-503906581) | i7))) * (-301)) + ((~(i7 | (-529080597))) * 301) + 950207761;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[1])[0] = i10 ^ (i10 << 5);
            str = str4;
        } else {
            Context applicationContext4 = context != null ? ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) ? null : context.getApplicationContext() : context;
            try {
                Object[] objArr19 = {applicationContext4, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), 0, 950207761};
                byte[] bArr3 = $$d;
                Object[] objArr20 = new Object[1];
                c(bArr3[560], (byte) (-bArr3[20]), bArr3[0], objArr20);
                Class<?> cls = Class.forName((String) objArr20[0]);
                Object[] objArr21 = new Object[1];
                c(bArr3[172], (byte) (bArr3[153] - 1), (short) (-bArr3[20]), objArr21);
                Object[] objArr22 = (Object[]) cls.getMethod((String) objArr21[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr19);
                if (applicationContext4 != null) {
                    int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 91;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
                    try {
                        if (i11 % 2 == 0) {
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
                                int offsetBefore = 876 - TextUtils.getOffsetBefore("", 0);
                                int jumpTapTimeout2 = 10 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                                byte[] bArr4 = $$a;
                                Object[] objArr23 = new Object[1];
                                b((short) 121, bArr4[91], bArr4[7], objArr23);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(modifierMetaStateMask, offsetBefore, jumpTapTimeout2, 2012931276, false, (String) objArr23[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr22);
                            str = str4;
                            long jLongValue2 = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[1])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char cAlpha = (char) Color.alpha(0);
                                int tapTimeout = 876 - (ViewConfiguration.getTapTimeout() >> 16);
                                int iKeyCodeFromString = 10 - KeyEvent.keyCodeFromString("");
                                short s2 = (short) ($$b + 1);
                                byte[] bArr5 = $$a;
                                Object[] objArr24 = new Object[1];
                                b(s2, bArr5[91], bArr5[7], objArr24);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cAlpha, tapTimeout, iKeyCodeFromString, 2012020043, false, (String) objArr24[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 << 20);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                int capsMode = TextUtils.getCapsMode("", 0, 0) + 876;
                                int iRgb = (-16777206) - Color.rgb(0, 0, 0);
                                byte b2 = $$a[91];
                                Object[] objArr25 = new Object[1];
                                b((short) 210, b2, (byte) (b2 - 4), objArr25);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollDefaultDelay, capsMode, iRgb, -1650998592, false, (String) objArr25[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        } else {
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                str = str4;
                                char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                                int i12 = 876 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                int maximumFlingVelocity = 10 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                byte[] bArr6 = $$a;
                                Object[] objArr26 = new Object[1];
                                b((short) 121, bArr6[91], bArr6[7], objArr26);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cMakeMeasureSpec, i12, maximumFlingVelocity, 2012931276, false, (String) objArr26[0], null);
                            }
                            str = str4;
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, objArr22);
                            long jLongValue3 = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf3 = Long.valueOf(jLongValue3);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                                char offsetBefore2 = (char) TextUtils.getOffsetBefore("", 0);
                                int i13 = 877 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                int offsetBefore3 = 10 - TextUtils.getOffsetBefore("", 0);
                                short s3 = (short) ($$b + 1);
                                byte[] bArr7 = $$a;
                                Object[] objArr27 = new Object[1];
                                b(s3, bArr7[91], bArr7[7], objArr27);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(offsetBefore2, i13, offsetBefore3, 2012020043, false, (String) objArr27[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf3);
                            Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                                char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 876;
                                int iRgb2 = Color.rgb(0, 0, 0) + 16777226;
                                byte b3 = $$a[91];
                                Object[] objArr28 = new Object[1];
                                b((short) 210, b3, (byte) (b3 - 4), objArr28);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(keyRepeatDelay, iResolveOpacity, iRgb2, -1650998592, false, (String) objArr28[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).set(null, lValueOf4);
                        }
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                } else {
                    str = str4;
                }
                objArr = objArr22;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i14 = ((int[]) objArr[2])[0];
        int i15 = ((int[]) objArr[0])[0];
        if (i15 != i14) {
            throw new RuntimeException(String.valueOf(i15));
        }
        int i16 = ((int[]) objArr[1])[0];
        Object[] objArr29 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int i17 = ~(System.identityHashCode(this) | (-747360642));
        int i18 = i16 + (((-788264920) | i17) * (-196)) + 731904668 + ((i17 | 40904278) * 196);
        int i19 = (i18 << 13) ^ i18;
        int i20 = i19 ^ (i19 >>> 17);
        ((int[]) objArr29[1])[0] = i20 ^ (i20 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 29945);
            int offsetBefore4 = 1755 - TextUtils.getOffsetBefore("", 0);
            int keyRepeatDelay2 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 23;
            byte b4 = $$a[91];
            Object[] objArr30 = new Object[1];
            b((short) 210, b4, (byte) (b4 - 4), objArr30);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cLastIndexOf, offsetBefore4, keyRepeatDelay2, 986134021, false, (String) objArr30[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cIndexOf2 = (char) (29944 - TextUtils.indexOf("", "", 0, 0));
                int i21 = 1755 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int trimmedLength2 = 23 - TextUtils.getTrimmedLength("");
                short s4 = (short) ($$b + 1);
                byte[] bArr8 = $$a;
                Object[] objArr31 = new Object[1];
                b(s4, bArr8[91], bArr8[7], objArr31);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cIndexOf2, i21, trimmedLength2, 1599039318, false, (String) objArr31[0], null);
            }
            Object[] objArr32 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da = new Object[]{new int[]{((int[]) objArr32[0])[0]}, new int[]{((int[]) objArr32[1])[0]}, (Object[]) objArr32[2], new int[1], (String[]) objArr32[4]};
            int iMyPid = Process.myPid();
            int i22 = ~iMyPid;
            int i23 = (~((-69755666) | i22)) | 8960;
            int i24 = ~(iMyPid | 212593465);
            int i25 = ((((i23 | i24) * (-252)) + 214860345) + ((i24 | (~(i22 | (-69746706)))) * 252)) - 2081755904;
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[3])[0] = i27 ^ (i27 << 5);
        } else {
            int iIntValue = ((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr33 = {-49502878};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b((char) (View.getDefaultSize(0, 0) + 42049), 1726 - View.MeasureSpec.getSize(0), 30 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da = zzgx.TuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).newInstance(objArr33), -2081755904);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char defaultSize = (char) (29944 - View.getDefaultSize(0, 0));
                    int touchSlop = 1755 - (ViewConfiguration.getTouchSlop() >> 8);
                    int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 23;
                    short s5 = (short) ($$b + 1);
                    byte[] bArr9 = $$a;
                    Object[] objArr34 = new Object[1];
                    b(s5, bArr9[91], bArr9[7], objArr34);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(defaultSize, touchSlop, packedPositionType, 1599039318, false, (String) objArr34[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da);
                try {
                    long jLongValue4 = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf5 = Long.valueOf(jLongValue4);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                        char cIndexOf3 = (char) (29944 - TextUtils.indexOf("", ""));
                        int doubleTapTimeout2 = 1755 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int i28 = 24 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        byte[] bArr10 = $$a;
                        Object[] objArr35 = new Object[1];
                        b((short) 69, bArr10[91], bArr10[7], objArr35);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cIndexOf3, doubleTapTimeout2, i28, 1596667560, false, (String) objArr35[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf5);
                    Long lValueOf6 = Long.valueOf(jLongValue4 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                        char c = (char) (29944 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                        int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 1755;
                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 23;
                        byte b5 = $$a[91];
                        Object[] objArr36 = new Object[1];
                        b((short) 210, b5, (byte) (b5 - 4), objArr36);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(c, longPressTimeout, fadingEdgeLength, 986134021, false, (String) objArr36[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf6);
                } catch (Exception unused2) {
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
        int i29 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[1])[0];
        int i30 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[0])[0];
        if (i30 != i29) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[4];
            if (strArr != null) {
                for (String str7 : strArr) {
                    arrayList.add(str7);
                }
            }
            throw new RuntimeException(String.valueOf(i30));
        }
        int i31 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[3])[0];
        Object[] objArr37 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$5f1425da[4]};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i32 = i31 + 1878469249 + ((888402526 | iIdentityHashCode2) * 376) + (((~((~iIdentityHashCode2) | 584846829)) | 337900050) * (-376)) + (((~(iIdentityHashCode2 | (-584846830))) | (-372244404)) * 376);
        int i33 = (i32 << 13) ^ i32;
        int i34 = i33 ^ (i33 >>> 17);
        ((int[]) objArr37[3])[0] = i34 ^ (i34 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
            char cResolveOpacity = (char) (43042 - Drawable.resolveOpacity(0, 0));
            int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 3111;
            int i35 = 23 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            byte[] bArr11 = $$a;
            Object[] objArr38 = new Object[1];
            b((short) 121, bArr11[91], bArr11[7], objArr38);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(cResolveOpacity, packedPositionType2, i35, -1272852037, false, (String) objArr38[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                char jumpTapTimeout3 = (char) (43042 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 3111;
                int iResolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0) + 22;
                byte b6 = $$a[91];
                Object[] objArr39 = new Object[1];
                b((short) 210, b6, (byte) (b6 - 4), objArr39);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(jumpTapTimeout3, iResolveSizeAndState, iResolveSizeAndState2, 154975793, false, (String) objArr39[0], null);
            }
            Object[] objArr40 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).get(null);
            int i36 = ((int[]) objArr40[2])[0];
            int i37 = ((int[]) objArr40[1])[0];
            String[] strArr2 = (String[]) objArr40[3];
            int[] iArr = {i37};
            int startUptimeMillis2 = (int) Process.getStartUptimeMillis();
            int i38 = ((((-2143732242) + (((~(1646965344 | startUptimeMillis2)) | 22283394) * (-140))) + ((~(1669248738 | startUptimeMillis2)) * 70)) + (((~(startUptimeMillis2 | 58066114)) | 1633466018) * 70)) - 821772721;
            int i39 = (i38 << 13) ^ i38;
            int i40 = i39 ^ (i39 >>> 17);
            ((int[]) objArr2[0])[0] = i40 ^ (i40 << 5);
            objArr2 = new Object[]{new int[1], iArr, new int[]{i36}, strArr2};
        } else {
            Object[] objArr41 = {null, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), 0, -821772721};
            byte[] bArr12 = $$d;
            byte b7 = (byte) 78;
            Object[] objArr42 = new Object[1];
            c(bArr12[560], b7, (short) (b7 | 49), objArr42);
            Class<?> cls2 = Class.forName((String) objArr42[0]);
            Object[] objArr43 = new Object[1];
            c(bArr12[172], (byte) (bArr12[153] - 1), (short) MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR, objArr43);
            objArr2 = (Object[]) cls2.getMethod((String) objArr43[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr41);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                char defaultSize2 = (char) (View.getDefaultSize(0, 0) + 43042);
                int iMyTid = (Process.myTid() >> 22) + 3111;
                int absoluteGravity = 22 - Gravity.getAbsoluteGravity(0, 0);
                byte b8 = $$a[91];
                Object[] objArr44 = new Object[1];
                b((short) 210, b8, (byte) (b8 - 4), objArr44);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(defaultSize2, iMyTid, absoluteGravity, 154975793, false, (String) objArr44[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).set(null, objArr2);
            try {
                long jLongValue5 = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf7 = Long.valueOf(jLongValue5);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                    char keyRepeatTimeout = (char) (43042 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                    int iRgb3 = Color.rgb(0, 0, 0) + 16780327;
                    int i41 = 23 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    short s6 = (short) ($$b + 1);
                    byte[] bArr13 = $$a;
                    Object[] objArr45 = new Object[1];
                    b(s6, bArr13[91], bArr13[7], objArr45);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(keyRepeatTimeout, iRgb3, i41, -1269618118, false, (String) objArr45[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).set(null, lValueOf7);
                Long lValueOf8 = Long.valueOf(jLongValue5 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                    char maximumDrawingCacheSize = (char) (43042 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                    int iGreen = 3111 - Color.green(0);
                    int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 23;
                    byte[] bArr14 = $$a;
                    Object[] objArr46 = new Object[1];
                    b((short) 121, bArr14[91], bArr14[7], objArr46);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(maximumDrawingCacheSize, iGreen, bitsPerPixel, -1272852037, false, (String) objArr46[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).set(null, lValueOf8);
            } catch (Exception unused3) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr2[2])[0] != ((int[]) objArr2[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr2[3];
            if (strArr3 != null) {
                for (String str8 : strArr3) {
                    arrayList2.add(str8);
                }
            }
            throw null;
        }
        int i42 = ((int[]) objArr2[0])[0];
        int i43 = ((int[]) objArr2[2])[0];
        int i44 = ((int[]) objArr2[1])[0];
        String[] strArr4 = (String[]) objArr2[3];
        int[] iArr2 = {i44};
        int i45 = ~Process.myPid();
        int i46 = i42 + (-1094832342) + (((-93659675) | i45) * 494) + (((~(i45 | 1342885124)) | (-1168058139)) * 494);
        int i47 = (i46 << 13) ^ i46;
        int i48 = i47 ^ (i47 >>> 17);
        ((int[]) objArr[0])[0] = i48 ^ (i48 << 5);
        Object[] objArr47 = {new int[1], iArr2, new int[]{i43}, strArr4};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
            char cIndexOf4 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
            int i49 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2266;
            int packedPositionChild = 32 - ExpandableListView.getPackedPositionChild(0L);
            short s7 = (short) ($$b + 1);
            byte[] bArr15 = $$a;
            Object[] objArr48 = new Object[1];
            b(s7, bArr15[91], bArr15[7], objArr48);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(cIndexOf4, i49, packedPositionChild, -887667012, false, (String) objArr48[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                char c2 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                int deadChar = KeyEvent.getDeadChar(0, 0) + 2267;
                int iCombineMeasuredStates = 33 - View.combineMeasuredStates(0, 0);
                byte b9 = $$a[91];
                Object[] objArr49 = new Object[1];
                b((short) 210, b9, (byte) (b9 - 4), objArr49);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(c2, deadChar, iCombineMeasuredStates, -654680577, false, (String) objArr49[0], null);
            }
            Object[] objArr50 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).get(null);
            objArr3 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i50 = ((int[]) objArr50[0])[0];
            int i51 = ((int[]) objArr50[3])[0];
            String[] strArr5 = (String[]) objArr50[1];
            int iNextInt = new Random().nextInt();
            int i52 = ~iNextInt;
            int i53 = (~((-233065909) | i52)) | 228606224 | (~(575647407 | i52));
            int i54 = 549091817 + (((~(iNextInt | (-571187724))) | i53) * 590) + (i53 * (-1180)) + (((~((-575647408) | i52)) | (~(i52 | 233065908))) * 590) + 1911274660;
            int i55 = (i54 << 13) ^ i54;
            int i56 = i55 ^ (i55 >>> 17);
            ((int[]) objArr3[2])[0] = i56 ^ (i56 << 5);
            context2 = context;
        } else {
            context2 = context;
            Context applicationContext5 = context2 != null ? ((context2 instanceof ContextWrapper) && ((ContextWrapper) context2).getBaseContext() == null) ? null : context.getApplicationContext() : context2;
            Object[] objArr51 = {applicationContext5, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), 0, 1911274660};
            byte[] bArr16 = $$d;
            byte b10 = bArr16[560];
            Object[] objArr52 = new Object[1];
            c(b10, (byte) (b10 | 75), (short) 257, objArr52);
            Class<?> cls3 = Class.forName((String) objArr52[0]);
            byte b11 = (byte) (bArr16[560] - 1);
            byte b12 = bArr16[0];
            Object[] objArr53 = new Object[1];
            c(b11, b12, (short) (b12 | 364), objArr53);
            Object[] objArr54 = (Object[]) cls3.getMethod((String) objArr53[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr51);
            if (applicationContext5 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                    char c3 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 2268;
                    int fadingEdgeLength2 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 33;
                    byte b13 = $$a[91];
                    Object[] objArr55 = new Object[1];
                    b((short) 210, b13, (byte) (b13 - 4), objArr55);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(c3, iLastIndexOf, fadingEdgeLength2, -654680577, false, (String) objArr55[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).set(null, objArr54);
                try {
                    long jLongValue6 = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf9 = Long.valueOf(jLongValue6);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                        char capsMode2 = (char) TextUtils.getCapsMode("", 0, 0);
                        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 2267;
                        int iIndexOf = 32 - TextUtils.indexOf((CharSequence) "", '0');
                        byte[] bArr17 = $$a;
                        Object[] objArr56 = new Object[1];
                        b((short) 121, bArr17[91], bArr17[7], objArr56);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(capsMode2, windowTouchSlop, iIndexOf, -874156483, false, (String) objArr56[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).set(null, lValueOf9);
                    Long lValueOf10 = Long.valueOf(jLongValue6 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                        char c4 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                        int iGreen2 = Color.green(0) + 2267;
                        int fadingEdgeLength3 = 33 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        short s8 = (short) ($$b + 1);
                        byte[] bArr18 = $$a;
                        Object[] objArr57 = new Object[1];
                        b(s8, bArr18[91], bArr18[7], objArr57);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(c4, iGreen2, fadingEdgeLength3, -887667012, false, (String) objArr57[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).set(null, lValueOf10);
                } catch (Exception unused4) {
                    throw new RuntimeException();
                }
            } else {
                objArr54 = objArr54;
            }
            objArr3 = objArr54;
        }
        int i57 = ((int[]) objArr3[3])[0];
        int i58 = ((int[]) objArr3[0])[0];
        if (i58 == i57) {
            int i59 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 21;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i59 % 128;
            int i60 = i59 % 2;
            Object[] objArr58 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i61 = ((int[]) objArr3[2])[0];
            int i62 = ((int[]) objArr3[0])[0];
            int i63 = ((int[]) objArr3[3])[0];
            String[] strArr6 = (String[]) objArr3[1];
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i64 = i61 + 899827689 + (((~((~iMaxMemory) | (-672991054))) | 135529732) * 446) + (((~(iMaxMemory | (-537461322))) | 192530) * 446) + 316718328;
            int i65 = (i64 << 13) ^ i64;
            int i66 = i65 ^ (i65 >>> 17);
            ((int[]) objArr58[2])[0] = i66 ^ (i66 << 5);
        } else {
            ArrayList arrayList3 = new ArrayList();
            String[] strArr7 = (String[]) objArr3[1];
            if (strArr7 != null) {
                for (String str9 : strArr7) {
                    arrayList3.add(str9);
                }
            }
            Toast.makeText((Context) null, i58 / (((i58 - 1) * i58) % 2), 0).show();
            Object[] objArr59 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i67 = ((int[]) objArr3[2])[0];
            int i68 = ((int[]) objArr3[0])[0];
            int i69 = ((int[]) objArr3[3])[0];
            String[] strArr8 = (String[]) objArr3[1];
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i70 = (-1800037807) + (((~((-325970823) | iIdentityHashCode3)) | (-482742494)) * (-318));
            int i71 = ~((-482742494) | iIdentityHashCode3);
            int i72 = ~iIdentityHashCode3;
            int i73 = i67 + i70 + ((i71 | (~(535821279 | i72))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(iIdentityHashCode3 | 535821279)) | (~((-209850458) | i72))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
            int i74 = (i73 << 13) ^ i73;
            int i75 = i74 ^ (i74 >>> 17);
            ((int[]) objArr59[2])[0] = i75 ^ (i75 << 5);
        }
        if (this.zza == null) {
            this.zza = new zzhl(this);
        }
        zzhl zzhlVar = this.zza;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
            char doubleTapTimeout3 = (char) (37567 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
            int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 626;
            int i76 = 15 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            byte[] bArr19 = $$a;
            Object[] objArr60 = new Object[1];
            b(bArr19[1], (byte) (bArr19[88] - 1), (byte) 52, objArr60);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(doubleTapTimeout3, iIndexOf2, i76, -477065106, false, (String) objArr60[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).getLong(null);
        long jLongValue7 = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
            char fadingEdgeLength4 = (char) (37567 - (ViewConfiguration.getFadingEdgeLength() >> 16));
            int i77 = 624 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            int iIndexOf3 = 13 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            byte[] bArr20 = $$a;
            Object[] objArr61 = new Object[1];
            b((short) 121, bArr20[91], bArr20[7], objArr61);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(fadingEdgeLength4, i77, iIndexOf3, -976899241, false, (String) objArr61[0], null);
        }
        if (j2 == ((jLongValue7 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                char cMyPid = (char) ((Process.myPid() >> 22) + 37567);
                int gidForName = 624 - Process.getGidForName("");
                int iIndexOf4 = TextUtils.indexOf("", "") + 14;
                short s9 = (short) ($$b + 1);
                byte[] bArr21 = $$a;
                Object[] objArr62 = new Object[1];
                b(s9, bArr21[91], bArr21[7], objArr62);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(cMyPid, gidForName, iIndexOf4, -973632554, false, (String) objArr62[0], null);
            }
            Object[] objArr63 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).get(null);
            int i78 = ((int[]) objArr63[2])[0];
            int i79 = ((int[]) objArr63[0])[0];
            String[] strArr9 = (String[]) objArr63[3];
            int[] iArr3 = {i78};
            int iIdentityHashCode4 = System.identityHashCode(this);
            int i80 = ((1815198380 + (((~((-268706835) | (~iIdentityHashCode4))) | (-1555031287)) * (-591))) + ((iIdentityHashCode4 | (-268706835)) * 591)) - 533590776;
            int i81 = (i80 << 13) ^ i80;
            int i82 = i81 ^ (i81 >>> 17);
            ((int[]) objArr4[1])[0] = i82 ^ (i82 << 5);
            objArr4 = new Object[]{new int[]{i79}, new int[1], iArr3, strArr9};
            str2 = str;
        } else {
            if (context2 != null) {
                int i83 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i83 % 128;
                int i84 = i83 % 2;
                applicationContext = ((context2 instanceof ContextWrapper) && ((ContextWrapper) context2).getBaseContext() == null) ? null : context.getApplicationContext();
            } else {
                applicationContext = context2;
            }
            int iIntValue2 = ((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue();
            Object[] objArr64 = new Object[1];
            a(new int[]{69, 64, 0, 36}, true, new byte[]{1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0}, objArr64);
            String str10 = (String) objArr64[0];
            Object[] objArr65 = new Object[1];
            a(new int[]{133, 64, 0, 0}, false, new byte[]{1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0}, objArr65);
            Object[] objArr66 = {applicationContext, new String[]{str10, (String) objArr65[0]}, Integer.valueOf(iIntValue2), 17, -533590776};
            byte[] bArr22 = $$d;
            byte b14 = bArr22[560];
            Object[] objArr67 = new Object[1];
            c(b14, (byte) (b14 | 17), (short) 364, objArr67);
            Class<?> cls4 = Class.forName((String) objArr67[0]);
            Object[] objArr68 = new Object[1];
            c(bArr22[172], (byte) (bArr22[153] - 1), (short) 413, objArr68);
            Object[] objArr69 = (Object[]) cls4.getMethod((String) objArr68[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr66);
            int i85 = ((int[]) objArr69[0])[0];
            int i86 = ((int[]) objArr69[2])[0];
            if (applicationContext != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                    char doubleTapTimeout4 = (char) (37567 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                    int iArgb = 625 - Color.argb(0, 0, 0, 0);
                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0') + 15;
                    short s10 = (short) ($$b + 1);
                    byte[] bArr23 = $$a;
                    Object[] objArr70 = new Object[1];
                    b(s10, bArr23[91], bArr23[7], objArr70);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(doubleTapTimeout4, iArgb, iLastIndexOf2, -973632554, false, (String) objArr70[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).set(null, objArr69);
                try {
                    str2 = str;
                    long jLongValue8 = ((Long) Class.forName(str3).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf11 = Long.valueOf(jLongValue8);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                        char cMyPid2 = (char) ((Process.myPid() >> 22) + 37567);
                        int iAxisFromString = 624 - MotionEvent.axisFromString("");
                        int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 14;
                        byte[] bArr24 = $$a;
                        Object[] objArr71 = new Object[1];
                        b((short) 121, bArr24[91], bArr24[7], objArr71);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(cMyPid2, iAxisFromString, edgeSlop, -976899241, false, (String) objArr71[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).set(null, lValueOf11);
                    Long lValueOf12 = Long.valueOf(jLongValue8 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
                        char maxKeyCode2 = (char) (37567 - (KeyEvent.getMaxKeyCode() >> 16));
                        int iBlue = Color.blue(0) + 625;
                        int i87 = 14 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        byte[] bArr25 = $$a;
                        Object[] objArr72 = new Object[1];
                        b(bArr25[1], (byte) (bArr25[88] - 1), (byte) 52, objArr72);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(maxKeyCode2, iBlue, i87, -477065106, false, (String) objArr72[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).set(null, lValueOf12);
                } catch (Exception unused5) {
                    throw new RuntimeException();
                }
            } else {
                str2 = str;
                objArr69 = objArr69;
            }
            objArr4 = objArr69;
        }
        int i88 = ((int[]) objArr4[0])[0];
        int i89 = ((int[]) objArr4[2])[0];
        if (i89 == i88) {
            int i90 = ((int[]) objArr4[1])[0];
            int i91 = ((int[]) objArr4[2])[0];
            int i92 = ((int[]) objArr4[0])[0];
            String[] strArr10 = (String[]) objArr4[3];
            int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
            int i93 = i90 + (-203046980) + (((~((-1538695164) | iFreeMemory2)) | (-1543503872)) * (-502)) + ((~((~iFreeMemory2) | (-1258460915))) * (-502)) + (((~(iFreeMemory2 | (-285042958))) | (-1538695164)) * TypedValues.PositionType.TYPE_DRAWPATH);
            int i94 = (i93 << 13) ^ i93;
            int i95 = i94 ^ (i94 >>> 17);
            ((int[]) objArr[1])[0] = i95 ^ (i95 << 5);
            Object[] objArr73 = {new int[]{i92}, new int[1], new int[]{i91}, strArr10};
        } else {
            ArrayList arrayList4 = new ArrayList();
            String[] strArr11 = (String[]) objArr4[3];
            if (strArr11 != null) {
                for (String str11 : strArr11) {
                    arrayList4.add(str11);
                }
            }
            int[] iArr4 = new int[i89];
            int i96 = i89 - 1;
            iArr4[i96] = 1;
            Toast.makeText((Context) null, iArr4[((i89 * i96) % 2) - 1], 1).show();
            int i97 = ((int[]) objArr4[1])[0];
            int i98 = ((int[]) objArr4[2])[0];
            int i99 = ((int[]) objArr4[0])[0];
            String[] strArr12 = (String[]) objArr4[3];
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i100 = ~startElapsedRealtime;
            int i101 = i97 + 762547796 + ((startElapsedRealtime | 738967552) * 988) + (((~(744480897 | i100)) | 1073743878) * (-1976)) + (((~(startElapsedRealtime | (-1079257224))) | 738967552 | (~(1079257223 | i100))) * 988);
            int i102 = (i101 << 13) ^ i101;
            int i103 = i102 ^ (i102 >>> 17);
            ((int[]) objArr[1])[0] = i103 ^ (i103 << 5);
            Object[] objArr74 = {new int[]{i99}, new int[1], new int[]{i98}, strArr12};
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
            char c5 = (char) (31534 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
            int iIndexOf5 = 920 - TextUtils.indexOf((CharSequence) "", '0');
            int maximumDrawingCacheSize2 = 28 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            byte[] bArr26 = $$a;
            Object[] objArr75 = new Object[1];
            b(bArr26[1], (byte) (bArr26[88] - 1), (byte) 52, objArr75);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(c5, iIndexOf5, maximumDrawingCacheSize2, -1048449946, false, (String) objArr75[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                char cBlue = (char) (Color.blue(0) + 31533);
                int minimumFlingVelocity = 921 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int iIndexOf6 = 27 - TextUtils.indexOf((CharSequence) "", '0', 0);
                byte b15 = $$a[91];
                Object[] objArr76 = new Object[1];
                b((short) 210, b15, (byte) (b15 - 4), objArr76);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(cBlue, minimumFlingVelocity, iIndexOf6, -1142834547, false, (String) objArr76[0], null);
            }
            Object[] objArr77 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).get(null);
            objArr5 = new Object[]{new int[1], new int[]{((int[]) objArr77[1])[0]}, (Object[]) objArr77[2], new int[]{((int[]) objArr77[3])[0]}, (String[]) objArr77[4]};
            int iIdentityHashCode5 = System.identityHashCode(this);
            int i104 = ~((-308161404) | (~iIdentityHashCode5));
            int i105 = ((((1159725056 | i104) | (~(308161403 | iIdentityHashCode5))) * (-338)) - 1375842661) + (((~(iIdentityHashCode5 | 1467886459)) | i104) * 338) + 806100408;
            int i106 = (i105 << 13) ^ i105;
            int i107 = i106 ^ (i106 >>> 17);
            ((int[]) objArr5[0])[0] = i107 ^ (i107 << 5);
        } else {
            if (context2 == null) {
                applicationContext2 = context2;
            } else if (!(context2 instanceof ContextWrapper)) {
                applicationContext2 = context.getApplicationContext();
            } else {
                int i108 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i108 % 128;
                int i109 = i108 % 2;
                if (((ContextWrapper) context2).getBaseContext() != null) {
                    applicationContext2 = context.getApplicationContext();
                } else {
                    applicationContext2 = null;
                }
            }
            Object[] objArr78 = {applicationContext2, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), 0, 806100408};
            byte[] bArr27 = $$d;
            Object[] objArr79 = new Object[1];
            c(bArr27[560], bArr27[260], (short) 465, objArr79);
            Class<?> cls5 = Class.forName((String) objArr79[0]);
            byte b16 = (byte) (bArr27[560] - 1);
            byte b17 = bArr27[0];
            Object[] objArr80 = new Object[1];
            c(b16, b17, (short) (b17 | 364), objArr80);
            Object[] objArr81 = (Object[]) cls5.getMethod((String) objArr80[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr78);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
                char tapTimeout2 = (char) (31533 - (ViewConfiguration.getTapTimeout() >> 16));
                int i110 = 921 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int capsMode3 = 28 - TextUtils.getCapsMode("", 0, 0);
                byte b18 = $$a[91];
                Object[] objArr82 = new Object[1];
                b((short) 210, b18, (byte) (b18 - 4), objArr82);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(tapTimeout2, i110, capsMode3, -1142834547, false, (String) objArr82[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).set(null, objArr81);
            try {
                long jLongValue9 = ((Long) Class.forName(str3).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf13 = Long.valueOf(jLongValue9);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
                    char maximumDrawingCacheSize3 = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 31533);
                    int scrollBarSize = 921 - (ViewConfiguration.getScrollBarSize() >> 8);
                    int i111 = 29 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    short s11 = (short) ($$b + 1);
                    byte[] bArr28 = $$a;
                    Object[] objArr83 = new Object[1];
                    b(s11, bArr28[91], bArr28[7], objArr83);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(maximumDrawingCacheSize3, scrollBarSize, i111, -778300370, false, (String) objArr83[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).set(null, lValueOf13);
                Long lValueOf14 = Long.valueOf(jLongValue9 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
                    char c6 = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 31533);
                    int i112 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 920;
                    int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 28;
                    byte[] bArr29 = $$a;
                    Object[] objArr84 = new Object[1];
                    b(bArr29[1], (byte) (bArr29[88] - 1), (byte) 52, objArr84);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(c6, i112, touchSlop2, -1048449946, false, (String) objArr84[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).set(null, lValueOf14);
                objArr5 = objArr81;
            } catch (Exception unused6) {
                throw new RuntimeException();
            }
        }
        int i113 = ((int[]) objArr5[1])[0];
        int i114 = ((int[]) objArr5[3])[0];
        if (i114 == i113) {
            int i115 = ((int[]) objArr5[0])[0];
            Object[] objArr85 = {new int[1], new int[]{((int[]) objArr5[1])[0]}, (Object[]) objArr5[2], new int[]{((int[]) objArr5[3])[0]}, (String[]) objArr5[4]};
            int iMaxMemory2 = (int) Runtime.getRuntime().maxMemory();
            int i116 = ~iMaxMemory2;
            int i117 = ~(83942062 | i116);
            int i118 = i115 + (-1370978861) + ((1623007553 | i117) * (-712)) + (((~(iMaxMemory2 | 1706949615)) | (~(i116 | (-1623007554)))) * (-712)) + (((-1690137582) | i117) * 712);
            int i119 = (i118 << 13) ^ i118;
            int i120 = i119 ^ (i119 >>> 17);
            i = 0;
            ((int[]) objArr85[0])[0] = i120 ^ (i120 << 5);
        } else {
            ArrayList arrayList5 = new ArrayList();
            String[] strArr13 = (String[]) objArr5[4];
            if (strArr13 != null) {
                for (String str12 : strArr13) {
                    arrayList5.add(str12);
                }
            }
            Toast.makeText((Context) null, i114 / (((i114 - 1) * i114) % 2), 0).show();
            int i121 = ((int[]) objArr5[0])[0];
            Object[] objArr86 = {new int[1], new int[]{((int[]) objArr5[1])[0]}, (Object[]) objArr5[2], new int[]{((int[]) objArr5[3])[0]}, (String[]) objArr5[4]};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i122 = ~elapsedCpuTime;
            int i123 = i121 + (-864606152) + (((~(i122 | 899614092)) | (-899632528) | (~((-874447117) | elapsedCpuTime))) * 717) + (((~(elapsedCpuTime | 899614092)) | (~(i122 | (-874447117))) | (-899632528)) * 717);
            int i124 = (i123 << 13) ^ i123;
            int i125 = i124 ^ (i124 >>> 17);
            i = 0;
            ((int[]) objArr86[0])[0] = i125 ^ (i125 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
            char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int iRgb4 = (-16776340) - Color.rgb(i, i, i);
            int i126 = 11 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            byte[] bArr30 = $$a;
            Object[] objArr87 = new Object[1];
            b(bArr30[1], bArr30[88], (byte) 42, objArr87);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(scrollBarFadeDuration, iRgb4, i126, -1199417970, false, (String) objArr87[0], null);
        }
        long j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).getLong(null);
        long jLongValue10 = ((Long) Class.forName(str3).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
            char cResolveSize = (char) View.resolveSize(0, 0);
            int capsMode4 = 876 - TextUtils.getCapsMode("", 0, 0);
            int i127 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10;
            byte[] bArr31 = $$a;
            Object[] objArr88 = new Object[1];
            b(bArr31[78], bArr31[14], (byte) 52, objArr88);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(cResolveSize, capsMode4, i127, 254769921, false, (String) objArr88[0], null);
        }
        if (j3 == ((jLongValue10 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
                int edgeSlop2 = 876 - (ViewConfiguration.getEdgeSlop() >> 16);
                int i128 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 11;
                byte[] bArr32 = $$a;
                Object[] objArr89 = new Object[1];
                b(bArr32[78], bArr32[88], bArr32[81], objArr89);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(cAxisFromString, edgeSlop2, i128, 1324201839, false, (String) objArr89[0], null);
            }
            Object[] objArr90 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).get(null);
            objArr6 = new Object[]{new int[]{((int[]) objArr90[0])[0]}, new int[1], new int[]{((int[]) objArr90[2])[0]}, (String[]) objArr90[3]};
            int iIdentityHashCode6 = System.identityHashCode(this);
            int i129 = ~iIdentityHashCode6;
            int i130 = ~((-903723925) | i129);
            int i131 = ~(863413695 | iIdentityHashCode6);
            int i132 = ((((-1663234392) + ((i130 | i131) * 1150)) + (((~((-863413696) | i129)) | i131) * (-575))) + (((~(iIdentityHashCode6 | (-903723925))) | (~(i129 | 903723924))) * 575)) - 1120024888;
            int i133 = (i132 << 13) ^ i132;
            int i134 = i133 ^ (i133 >>> 17);
            ((int[]) objArr6[1])[0] = i134 ^ (i134 << 5);
        } else {
            Object[] objArr91 = {Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), -1120024888};
            byte[] bArr33 = $$d;
            Object[] objArr92 = new Object[1];
            c(bArr33[0], bArr33[63], (short) 527, objArr92);
            Class<?> cls6 = Class.forName((String) objArr92[0]);
            Object[] objArr93 = new Object[1];
            c(bArr33[172], (byte) (bArr33[153] - 1), (short) 413, objArr93);
            objArr6 = (Object[]) cls6.getMethod((String) objArr93[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr91);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                int iGreen3 = 876 - Color.green(0);
                int capsMode5 = 10 - TextUtils.getCapsMode("", 0, 0);
                byte[] bArr34 = $$a;
                Object[] objArr94 = new Object[1];
                b(bArr34[78], bArr34[88], bArr34[81], objArr94);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(cCombineMeasuredStates, iGreen3, capsMode5, 1324201839, false, (String) objArr94[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).set(null, objArr6);
            try {
                long jLongValue11 = ((Long) Class.forName(str3).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf15 = Long.valueOf(jLongValue11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
                    char c7 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int scrollDefaultDelay2 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 876;
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0) + 10;
                    byte[] bArr35 = $$a;
                    Object[] objArr95 = new Object[1];
                    b(bArr35[78], bArr35[14], (byte) 52, objArr95);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(c7, scrollDefaultDelay2, absoluteGravity2, 254769921, false, (String) objArr95[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).set(null, lValueOf15);
                Long lValueOf16 = Long.valueOf(jLongValue11 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
                    char size2 = (char) View.MeasureSpec.getSize(0);
                    int maximumDrawingCacheSize4 = 876 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int mode = 10 - View.MeasureSpec.getMode(0);
                    byte[] bArr36 = $$a;
                    Object[] objArr96 = new Object[1];
                    b(bArr36[1], bArr36[88], (byte) 42, objArr96);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(size2, maximumDrawingCacheSize4, mode, -1199417970, false, (String) objArr96[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).set(null, lValueOf16);
            } catch (Exception unused7) {
                throw new RuntimeException();
            }
        }
        int i135 = ((int[]) objArr6[2])[0];
        int i136 = ((int[]) objArr6[0])[0];
        if (i136 != i135) {
            ArrayList arrayList6 = new ArrayList();
            String[] strArr14 = (String[]) objArr6[3];
            if (strArr14 != null) {
                int i137 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i137 % 128;
                for (int i138 = i137 % 2 != 0 ? 1 : 0; i138 < strArr14.length; i138++) {
                    arrayList6.add(strArr14[i138]);
                }
            }
            throw new RuntimeException(String.valueOf(i136));
        }
        int i139 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i139 % 128;
        int i140 = i139 % 2;
        int i141 = ((int[]) objArr6[1])[0];
        Object[] objArr97 = {new int[]{((int[]) objArr6[0])[0]}, new int[1], new int[]{((int[]) objArr6[2])[0]}, (String[]) objArr6[3]};
        int iNextInt2 = new Random().nextInt();
        int i142 = ~iNextInt2;
        int i143 = i141 + 1461683252 + (((~((-151552501) | i142)) | 151552480 | (~(111242271 | i142))) * (-1136)) + (((~((-151552501) | iNextInt2)) | (~(111242271 | iNextInt2)) | (~((-111242252) | i142))) * (-568)) + (((~(iNextInt2 | (-151552481))) | (~(i142 | (-111242272))) | (~(151552500 | i142))) * 568);
        int i144 = i143 ^ (i143 << 13);
        int i145 = i144 ^ (i144 >>> 17);
        ((int[]) objArr97[1])[0] = i145 ^ (i145 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
            char fadingEdgeLength5 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
            int iIndexOf7 = TextUtils.indexOf("", "", 0, 0) + 876;
            int i146 = 11 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            byte[] bArr37 = $$a;
            Object[] objArr98 = new Object[1];
            b(bArr37[1], (byte) (bArr37[88] - 1), (byte) 52, objArr98);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(fadingEdgeLength5, iIndexOf7, i146, 252381699, false, (String) objArr98[0], null);
        }
        long j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).getLong(null);
        long jLongValue12 = ((Long) Class.forName(str3).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
            char mirror = (char) (AndroidCharacter.getMirror('0') - '0');
            int iMyPid2 = (Process.myPid() >> 22) + 876;
            int trimmedLength3 = 10 - TextUtils.getTrimmedLength("");
            byte[] bArr38 = $$a;
            Object[] objArr99 = new Object[1];
            b((short) 69, bArr38[91], bArr38[7], objArr99);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(mirror, iMyPid2, trimmedLength3, 2009631821, false, (String) objArr99[0], null);
        }
        if (j4 == ((jLongValue12 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).getLong(null) << 52) >>> 52)) >> 12)) {
            int i147 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i147 % 128;
            int i148 = i147 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
                char mirror2 = (char) ('0' - AndroidCharacter.getMirror('0'));
                int size3 = View.MeasureSpec.getSize(0) + 876;
                int keyRepeatDelay3 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 10;
                short s12 = $$a[7];
                byte b19 = (byte) s12;
                Object[] objArr100 = new Object[1];
                b(s12, b19, (byte) (b19 | 52), objArr100);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(mirror2, size3, keyRepeatDelay3, 256017550, false, (String) objArr100[0], null);
            }
            Object[] objArr101 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).get(null);
            objArr7 = new Object[]{new int[]{((int[]) objArr101[0])[0]}, new int[1], new int[]{((int[]) objArr101[2])[0]}, (String[]) objArr101[3]};
            int iFreeMemory3 = (int) Runtime.getRuntime().freeMemory();
            int i149 = ~iFreeMemory3;
            int i150 = (((482688636 + (((~((-688291875) | i149)) | 728602103) * (-328))) + ((iFreeMemory3 | 728602103) * 164)) + ((((~(iFreeMemory3 | 688291874)) | 40441301) | (~(i149 | (-131073)))) * 164)) - 462533079;
            int i151 = (i150 << 13) ^ i150;
            int i152 = i151 ^ (i151 >>> 17);
            ((int[]) objArr7[1])[0] = i152 ^ (i152 << 5);
        } else {
            Context applicationContext6 = context != null ? ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) ? null : context.getApplicationContext() : context;
            Object[] objArr102 = {applicationContext6, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), -462533079};
            byte b20 = (byte) ($$e >>> 2);
            byte[] bArr39 = $$d;
            Object[] objArr103 = new Object[1];
            c(b20, bArr39[539], (short) 548, objArr103);
            Class<?> cls7 = Class.forName((String) objArr103[0]);
            Object[] objArr104 = new Object[1];
            c(bArr39[172], (byte) (bArr39[153] - 1), (short) (-bArr39[20]), objArr104);
            Object[] objArr105 = (Object[]) cls7.getMethod((String) objArr104[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr102);
            if (applicationContext6 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                    char cBlue2 = (char) Color.blue(0);
                    int iAxisFromString2 = 875 - MotionEvent.axisFromString("");
                    int iMyPid3 = 10 - (Process.myPid() >> 22);
                    short s13 = $$a[7];
                    byte b21 = (byte) s13;
                    Object[] objArr106 = new Object[1];
                    b(s13, b21, (byte) (b21 | 52), objArr106);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(cBlue2, iAxisFromString2, iMyPid3, 256017550, false, (String) objArr106[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).set(null, objArr105);
                try {
                    long jLongValue13 = ((Long) Class.forName(str3).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf17 = Long.valueOf(jLongValue13);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                        char cIndexOf5 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                        int offsetBefore5 = TextUtils.getOffsetBefore("", 0) + 876;
                        int i153 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10;
                        byte[] bArr40 = $$a;
                        Object[] objArr107 = new Object[1];
                        b((short) 69, bArr40[91], bArr40[7], objArr107);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(cIndexOf5, offsetBefore5, i153, 2009631821, false, (String) objArr107[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).set(null, lValueOf17);
                    Long lValueOf18 = Long.valueOf(jLongValue13 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
                        char maximumFlingVelocity2 = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int packedPositionChild2 = 875 - ExpandableListView.getPackedPositionChild(0L);
                        int iResolveOpacity2 = Drawable.resolveOpacity(0, 0) + 10;
                        byte[] bArr41 = $$a;
                        Object[] objArr108 = new Object[1];
                        b(bArr41[1], (byte) (bArr41[88] - 1), (byte) 52, objArr108);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(maximumFlingVelocity2, packedPositionChild2, iResolveOpacity2, 252381699, false, (String) objArr108[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).set(null, lValueOf18);
                } catch (Exception unused8) {
                    throw new RuntimeException();
                }
            } else {
                objArr105 = objArr105;
            }
            objArr7 = objArr105;
        }
        int i154 = ((int[]) objArr7[2])[0];
        int i155 = ((int[]) objArr7[0])[0];
        if (i155 != i154) {
            throw new RuntimeException(String.valueOf(i155));
        }
        int i156 = ((int[]) objArr7[1])[0];
        Object[] objArr109 = {new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
        int iIdentityHashCode7 = System.identityHashCode(this);
        int i157 = (-1873555180) + (((-94858208) | iIdentityHashCode7) * 614);
        int i158 = ~iIdentityHashCode7;
        int i159 = i156 + i157 + (((~((-906969307) | i158)) | 839385088 | (~((-866659078) | i158))) * (-1228)) + (((~(i158 | (-27273990))) | (~((-67584219) | i158))) * 614);
        int i160 = (i159 << 13) ^ i159;
        int i161 = i160 ^ (i160 >>> 17);
        ((int[]) objArr109[1])[0] = i161 ^ (i161 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
            char cGreen = (char) Color.green(0);
            int iMyPid4 = 651 - (Process.myPid() >> 22);
            int iAxisFromString3 = MotionEvent.axisFromString("") + 45;
            byte[] bArr42 = $$a;
            Object[] objArr110 = new Object[1];
            b((short) 69, bArr42[91], bArr42[7], objArr110);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(cGreen, iMyPid4, iAxisFromString3, -459846511, false, (String) objArr110[0], null);
        }
        long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).getLong(null);
        long jLongValue14 = ((Long) Class.forName(str3).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
            char mirror3 = (char) ('0' - AndroidCharacter.getMirror('0'));
            int edgeSlop3 = (ViewConfiguration.getEdgeSlop() >> 16) + 651;
            int iGreen4 = Color.green(0) + 44;
            byte[] bArr43 = $$a;
            Object[] objArr111 = new Object[1];
            b(bArr43[1], (byte) (bArr43[88] - 1), (byte) 52, objArr111);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(mirror3, edgeSlop3, iGreen4, -873460649, false, (String) objArr111[0], null);
        }
        if (j5 == ((jLongValue14 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
                char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                int iIndexOf8 = TextUtils.indexOf("", "", 0, 0) + 651;
                int iBlue2 = 44 - Color.blue(0);
                byte b22 = $$a[91];
                Object[] objArr112 = new Object[1];
                b((short) 210, b22, (byte) (b22 - 4), objArr112);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(threadPriority, iIndexOf8, iBlue2, -1595579076, false, (String) objArr112[0], null);
            }
            Object[] objArr113 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).get(null);
            objArr8 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i162 = ((int[]) objArr113[2])[0];
            int i163 = ((int[]) objArr113[0])[0];
            int iIdentityHashCode8 = System.identityHashCode(this);
            int i164 = ((((-352652005) + (((~((-1038804633) | iIdentityHashCode8)) | 1007304720) * (-140))) + ((~((-31499913) | iIdentityHashCode8)) * 70)) + (((~(iIdentityHashCode8 | 1042235442)) | (-66430635)) * 70)) - 1216594438;
            int i165 = (i164 << 13) ^ i164;
            int i166 = i165 ^ (i165 >>> 17);
            ((int[]) objArr8[3])[0] = i166 ^ (i166 << 5);
            i2 = 0;
        } else {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 1610 - (KeyEvent.getMaxKeyCode() >> 16), 26 - (KeyEvent.getMaxKeyCode() >> 16), 2145681644, false, null, new Class[0]);
            }
            Object[] objArr114 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).newInstance(null), -1216594438, 0};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
                char cIndexOf6 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                int edgeSlop4 = 651 - (ViewConfiguration.getEdgeSlop() >> 16);
                int edgeSlop5 = (ViewConfiguration.getEdgeSlop() >> 16) + 44;
                byte[] bArr44 = $$a;
                Object[] objArr115 = new Object[1];
                b(bArr44[1], (byte) (bArr44[88] - 1), (byte) 52, objArr115);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(cIndexOf6, edgeSlop4, edgeSlop5, 2075921419, false, (String) objArr115[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 696 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 99 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 63406), 793 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (Process.myTid() >> 22) + 83), Integer.TYPE, Integer.TYPE});
            }
            objArr8 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).invoke(null, objArr114);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
                char cCombineMeasuredStates2 = (char) View.combineMeasuredStates(0, 0);
                int iAlpha = 651 - Color.alpha(0);
                int i167 = 45 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                byte b23 = $$a[91];
                Object[] objArr116 = new Object[1];
                b((short) 210, b23, (byte) (b23 - 4), objArr116);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(cCombineMeasuredStates2, iAlpha, i167, -1595579076, false, (String) objArr116[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).set(null, objArr8);
            try {
                long jLongValue15 = ((Long) Class.forName(str3).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf19 = Long.valueOf(jLongValue15);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
                    char cArgb = (char) Color.argb(0, 0, 0, 0);
                    int packedPositionType3 = ExpandableListView.getPackedPositionType(0L) + 651;
                    int iLastIndexOf3 = TextUtils.lastIndexOf("", '0', 0, 0) + 45;
                    byte[] bArr45 = $$a;
                    Object[] objArr117 = new Object[1];
                    b(bArr45[1], (byte) (bArr45[88] - 1), (byte) 52, objArr117);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b(cArgb, packedPositionType3, iLastIndexOf3, -873460649, false, (String) objArr117[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).set(null, lValueOf19);
                Long lValueOf20 = Long.valueOf(jLongValue15 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
                    char c8 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
                    int mode2 = 651 - View.MeasureSpec.getMode(0);
                    int scrollDefaultDelay3 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 44;
                    byte[] bArr46 = $$a;
                    Object[] objArr118 = new Object[1];
                    b((short) 69, bArr46[91], bArr46[7], objArr118);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(c8, mode2, scrollDefaultDelay3, -459846511, false, (String) objArr118[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).set(null, lValueOf20);
                i2 = 0;
            } catch (Exception unused9) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr8[2])[i2] != ((int[]) objArr8[i2])[i2]) {
            int i168 = i2;
            ArrayList arrayList7 = new ArrayList();
            String[] strArr15 = (String[]) objArr8[1];
            if (strArr15 != null) {
                for (int i169 = i168; i169 < strArr15.length; i169++) {
                    int i170 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i170 % 128;
                    int i171 = i170 % 2;
                    arrayList7.add(strArr15[i169]);
                }
            }
            throw null;
        }
        Object[] objArr119 = new Object[4];
        int[] iArr5 = new int[1];
        objArr119[i2] = iArr5;
        int[] iArr6 = new int[1];
        objArr119[2] = iArr6;
        objArr119[3] = new int[1];
        int i172 = ((int[]) objArr8[3])[i2];
        int i173 = ((int[]) objArr8[2])[i2];
        int i174 = ((int[]) objArr8[i2])[i2];
        iArr6[i2] = i173;
        iArr5[i2] = i174;
        objArr119[1] = new String[i2];
        int i175 = ~(System.identityHashCode(this) | (-426628157));
        int i176 = i172 + (((257127791 + (((-430058967) | i175) * (-220))) + ((i175 | 5099560) * 220)) - 1499292410);
        int i177 = (i176 << 13) ^ i176;
        int i178 = i177 ^ (i177 >>> 17);
        ((int[]) objArr119[3])[0] = i178 ^ (i178 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
            char deadChar2 = (char) KeyEvent.getDeadChar(0, 0);
            int packedPositionType4 = ExpandableListView.getPackedPositionType(0L) + 1031;
            int iLastIndexOf4 = TextUtils.lastIndexOf("", '0') + 16;
            byte[] bArr47 = $$a;
            Object[] objArr120 = new Object[1];
            b((short) 121, bArr47[91], bArr47[7], objArr120);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(deadChar2, packedPositionType4, iLastIndexOf4, 1357589585, false, (String) objArr120[0], null);
        }
        long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).getLong(null);
        long jLongValue16 = ((Long) Class.forName(str3).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
            char fadingEdgeLength6 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
            int iAlpha2 = 1031 - Color.alpha(0);
            int i179 = 15 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            short s14 = (short) ($$b + 1);
            byte[] bArr48 = $$a;
            Object[] objArr121 = new Object[1];
            b(s14, bArr48[91], bArr48[7], objArr121);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b(fadingEdgeLength6, iAlpha2, i179, 1344079056, false, (String) objArr121[0], null);
        }
        if (j6 == ((jLongValue16 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
                char maximumFlingVelocity3 = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int iIndexOf9 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1032;
                int fadingEdgeLength7 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 15;
                byte[] bArr49 = $$a;
                Object[] objArr122 = new Object[1];
                b(bArr49[1], (byte) (bArr49[88] - 1), (byte) 52, objArr122);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b(maximumFlingVelocity3, iIndexOf9, fadingEdgeLength7, 632103528, false, (String) objArr122[0], null);
            }
            Object[] objArr123 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).get(null);
            objArr9 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i180 = ((int[]) objArr123[3])[0];
            int i181 = ((int[]) objArr123[1])[0];
            String[] strArr16 = (String[]) objArr123[0];
            int iMyTid2 = Process.myTid();
            int i182 = ~iMyTid2;
            int i183 = (((~((-128027612) | i182)) | (~(iMyTid2 | 116252558))) * 959) + 1836907189 + (((~(iMyTid2 | (-128027612))) | (~(i182 | 116252558))) * 959) + 790295089;
            int i184 = (i183 << 13) ^ i183;
            int i185 = i184 ^ (i184 >>> 17);
            ((int[]) objArr9[2])[0] = i185 ^ (i185 << 5);
        } else {
            int iIntValue3 = ((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue();
            Object[] objArr124 = {1021514392};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b((char) ((-16731178) - Color.rgb(0, 0, 0)), 1133 - ExpandableListView.getPackedPositionChild(0L), View.getDefaultSize(0, 0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr125 = {Integer.valueOf(iIntValue3), 0, 790295089, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).newInstance(objArr124), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
                char c9 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                int gidForName2 = 1030 - Process.getGidForName("");
                int longPressTimeout2 = (ViewConfiguration.getLongPressTimeout() >> 16) + 15;
                byte[] bArr50 = $$a;
                Object[] objArr126 = new Object[1];
                b((short) 121, bArr50[91], bArr50[7], objArr126);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(c9, gidForName2, longPressTimeout2, 1298546779, false, (String) objArr126[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (View.resolveSize(0, 0) + 45993), (ViewConfiguration.getLongPressTimeout() >> 16) + 1117, Color.rgb(0, 0, 0) + 16777233), Boolean.TYPE});
            }
            objArr9 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).invoke(null, objArr125);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
                char threadPriority2 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                int maxKeyCode3 = (KeyEvent.getMaxKeyCode() >> 16) + 1031;
                int iRed = 15 - Color.red(0);
                byte[] bArr51 = $$a;
                Object[] objArr127 = new Object[1];
                b(bArr51[1], (byte) (bArr51[88] - 1), (byte) 52, objArr127);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(threadPriority2, maxKeyCode3, iRed, 632103528, false, (String) objArr127[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).set(null, objArr9);
            try {
                long jLongValue17 = ((Long) Class.forName(str3).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf21 = Long.valueOf(jLongValue17);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
                    char cResolveOpacity2 = (char) Drawable.resolveOpacity(0, 0);
                    int fadingEdgeLength8 = 1031 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int i186 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 15;
                    short s15 = (short) ($$b + 1);
                    byte[] bArr52 = $$a;
                    Object[] objArr128 = new Object[1];
                    b(s15, bArr52[91], bArr52[7], objArr128);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(cResolveOpacity2, fadingEdgeLength8, i186, 1344079056, false, (String) objArr128[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).set(null, lValueOf21);
                Long lValueOf22 = Long.valueOf(jLongValue17 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
                    char edgeSlop6 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                    int mode3 = View.MeasureSpec.getMode(0) + 1031;
                    int iMyPid5 = 15 - (Process.myPid() >> 22);
                    byte[] bArr53 = $$a;
                    Object[] objArr129 = new Object[1];
                    b((short) 121, bArr53[91], bArr53[7], objArr129);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b(edgeSlop6, mode3, iMyPid5, 1357589585, false, (String) objArr129[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).set(null, lValueOf22);
            } catch (Exception unused10) {
                throw new RuntimeException();
            }
        }
        int i187 = ((int[]) objArr9[1])[0];
        int i188 = ((int[]) objArr9[3])[0];
        if (i188 != i187) {
            ArrayList arrayList8 = new ArrayList();
            String[] strArr17 = (String[]) objArr9[0];
            if (strArr17 != null) {
                for (String str13 : strArr17) {
                    arrayList8.add(str13);
                }
            }
            throw new RuntimeException(String.valueOf(i188));
        }
        Object[] objArr130 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i189 = ((int[]) objArr9[2])[0];
        int i190 = ((int[]) objArr9[3])[0];
        int i191 = ((int[]) objArr9[1])[0];
        String[] strArr18 = (String[]) objArr9[0];
        int iNextInt3 = new Random().nextInt(1654071404);
        int i192 = i189 + (((1539305893 + (((~(144479701 | iNextInt3)) | (-388759872)) * (-948))) + ((~((~iNextInt3) | (-387973163))) * (-948))) - 2040826804);
        int i193 = (i192 << 13) ^ i192;
        int i194 = i193 ^ (i193 >>> 17);
        ((int[]) objArr130[2])[0] = i194 ^ (i194 << 5);
        int i195 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i195 % 128;
        if (i195 % 2 == 0) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
                char cNormalizeMetaState = (char) (53893 - KeyEvent.normalizeMetaState(0));
                int i196 = 1321 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int iCombineMeasuredStates2 = 36 - View.combineMeasuredStates(0, 0);
                byte[] bArr54 = $$a;
                Object[] objArr131 = new Object[1];
                b(bArr54[1], (byte) (bArr54[88] - 1), (byte) 52, objArr131);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b(cNormalizeMetaState, i196, iCombineMeasuredStates2, -1433084963, false, (String) objArr131[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).getLong(null);
            throw null;
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
            char cAxisFromString2 = (char) (MotionEvent.axisFromString("") + 53894);
            int i197 = 1320 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int i198 = 36 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            byte[] bArr55 = $$a;
            Object[] objArr132 = new Object[1];
            b(bArr55[1], (byte) (bArr55[88] - 1), (byte) 52, objArr132);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b(cAxisFromString2, i197, i198, -1433084963, false, (String) objArr132[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
                char cMyTid = (char) (53893 - (Process.myTid() >> 22));
                int doubleTapTimeout5 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1320;
                int i199 = 36 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                short s16 = (short) ($$b + 1);
                byte[] bArr56 = $$a;
                Object[] objArr133 = new Object[1];
                b(s16, bArr56[91], bArr56[7], objArr133);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b(cMyTid, doubleTapTimeout5, i199, -1920778747, false, (String) objArr133[0], null);
            }
            Object[] objArr134 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).get(null);
            objArr10 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i200 = ((int[]) objArr134[0])[0];
            int i201 = ((int[]) objArr134[3])[0];
            String[] strArr19 = (String[]) objArr134[2];
            int iIdentityHashCode9 = System.identityHashCode(this);
            int i202 = 647127268 + ((iIdentityHashCode9 | 76783485) * (-50));
            int i203 = ~((-68296562) | iIdentityHashCode9);
            int i204 = ~iIdentityHashCode9;
            int i205 = ((i202 + ((i203 | (~((-1225547779) | i204))) * 50)) + (((~(i204 | 76783485)) | ((~((-1293844340) | i204)) | 1225547778)) * 50)) - 167933034;
            int i206 = (i205 << 13) ^ i205;
            int i207 = i206 ^ (i206 >>> 17);
            ((int[]) objArr10[1])[0] = i207 ^ (i207 << 5);
            context3 = context;
        } else {
            context3 = context;
            if (context3 != null) {
                int i208 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i208 % 128;
                int i209 = i208 % 2;
                applicationContext3 = ((context3 instanceof ContextWrapper) && ((ContextWrapper) context3).getBaseContext() == null) ? null : context.getApplicationContext();
            } else {
                applicationContext3 = context3;
            }
            int iIntValue4 = ((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue();
            Object[] objArr135 = {1021514392};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 47977), TextUtils.indexOf("", "") + 1300, 20 - TextUtils.getTrimmedLength(""), -420973425, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr136 = {applicationContext3, "com.bpjstku", -167933034, Integer.valueOf(iIntValue4), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).newInstance(objArr135), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault71 == null) {
                char packedPositionGroup2 = (char) (53893 - ExpandableListView.getPackedPositionGroup(0L));
                int iRgb5 = (-16775896) - Color.rgb(0, 0, 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0) + 36;
                short s17 = (short) ($$b + 1);
                byte[] bArr57 = $$a;
                Object[] objArr137 = new Object[1];
                b(s17, bArr57[91], bArr57[7], objArr137);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.b(packedPositionGroup2, iRgb5, iMakeMeasureSpec2, 819724799, false, (String) objArr137[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (57877 - ((byte) KeyEvent.getModifierMetaStateMask())), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1393, TextUtils.indexOf("", "", 0, 0) + 75), Boolean.TYPE});
            }
            objArr10 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault71).invoke(null, objArr136);
            if (applicationContext3 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault72 == null) {
                    char c10 = (char) (53893 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                    int iResolveSizeAndState3 = 1320 - View.resolveSizeAndState(0, 0, 0);
                    int iGreen5 = 36 - Color.green(0);
                    short s18 = (short) ($$b + 1);
                    byte[] bArr58 = $$a;
                    Object[] objArr138 = new Object[1];
                    b(s18, bArr58[91], bArr58[7], objArr138);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.b(c10, iResolveSizeAndState3, iGreen5, -1920778747, false, (String) objArr138[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault72).set(null, objArr10);
                try {
                    long jLongValue18 = ((Long) Class.forName(str3).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf23 = Long.valueOf(jLongValue18);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault73 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault73 == null) {
                        char packedPositionType5 = (char) (53893 - ExpandableListView.getPackedPositionType(0L));
                        int jumpTapTimeout4 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1320;
                        int iAxisFromString4 = MotionEvent.axisFromString("") + 37;
                        byte b24 = $$a[91];
                        Object[] objArr139 = new Object[1];
                        b((short) 210, b24, (byte) (b24 - 4), objArr139);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault73 = initSession.b(packedPositionType5, jumpTapTimeout4, iAxisFromString4, -1273706634, false, (String) objArr139[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault73).set(null, lValueOf23);
                    Long lValueOf24 = Long.valueOf(jLongValue18 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault74 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault74 == null) {
                        char mirror4 = (char) (53941 - AndroidCharacter.getMirror('0'));
                        int iRed2 = 1320 - Color.red(0);
                        int gidForName3 = Process.getGidForName("") + 37;
                        byte[] bArr59 = $$a;
                        Object[] objArr140 = new Object[1];
                        b(bArr59[1], (byte) (bArr59[88] - 1), (byte) 52, objArr140);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault74 = initSession.b(mirror4, iRed2, gidForName3, -1433084963, false, (String) objArr140[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault74).set(null, lValueOf24);
                } catch (Exception unused11) {
                    throw new RuntimeException();
                }
            }
        }
        int i210 = ((int[]) objArr10[3])[0];
        int i211 = ((int[]) objArr10[0])[0];
        if (i211 == i210) {
            Object[] objArr141 = {new int[]{i}, new int[1], strArr, new int[]{i}};
            int i212 = ((int[]) objArr10[1])[0];
            int i213 = ((int[]) objArr10[0])[0];
            int i214 = ((int[]) objArr10[3])[0];
            String[] strArr20 = (String[]) objArr10[2];
            int i215 = ~((int) Runtime.getRuntime().totalMemory());
            int i216 = i212 + 744585725 + (((~((-1312369485) | i215)) | (-58258341)) * (-983)) + (((~(i215 | (-58258341))) | 21024928) * 983);
            int i217 = (i216 << 13) ^ i216;
            int i218 = i217 ^ (i217 >>> 17);
            ((int[]) objArr141[1])[0] = i218 ^ (i218 << 5);
        } else {
            Toast.makeText((Context) null, i211 / (((i211 - 1) * i211) % 2), 0).show();
            Object[] objArr142 = {new int[]{i}, new int[1], strArr, new int[]{i}};
            int i219 = ((int[]) objArr10[1])[0];
            int i220 = ((int[]) objArr10[0])[0];
            int i221 = ((int[]) objArr10[3])[0];
            String[] strArr21 = (String[]) objArr10[2];
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i222 = i219 + (-2096627362) + (((~((-537034770) | (~iElapsedRealtime))) | (-833593056)) * (-591)) + ((iElapsedRealtime | (-537034770)) * 591);
            int i223 = (i222 << 13) ^ i222;
            int i224 = i223 ^ (i223 >>> 17);
            ((int[]) objArr142[1])[0] = i224 ^ (i224 << 5);
        }
        zzhlVar.zza(context3, intent);
    }

    static {
        byte[] bArr = new byte[577];
        System.arraycopy("\u0000¢Â\u009fðþ;½\u0000\u0001ìþ\rï÷A·\u000bõ9µ\búþñB´\t\u0000ê\u0000AÈýïÿóþ\rï÷\týï@·û\u000féûþAÝèï\u0006÷ó\u0005#Õùü\u0015Û\u000féûþ.Úë\u0007ï\tñ÷QîÛ\bñ\u0007öý\u001aëä\b\u0004óö*Ð\röö\u0004óöýÿ\u0007þö\u0004ñÿ÷þÿ÷\u0005ýê\t\u0000ê&Ú\u0007ûõ\u0004ûû\u0001è\u0005ô=ðþ;Èî\u0002óû\u0005òCÆÿé\u000fûõ÷\u0006÷÷\u00035äÐ\röö\u0004óö/Ê\u0006ú&Úë\u0007ï\r\u0011ëëú\u0007\u0002öõ\u000bïö-Öñ\u0007ë\u0011ó÷\u0007ûõ(Ñ\bê\u0004\u0004óö.Õ÷\u0006÷÷\u0003Û\bñ\u0007öý\u001aëä\b\u0004óö*Ð\röö\u0004óöýÿ\u0007þö\u0004ñÿ÷þÿ÷\u0005ýê\t\u0000ê&Ú\u0007ûõ\u0004ûû\u0001è\u0005ô>ðþ;Ãôü\u0004÷\u00033Äùó\tÿýê\n3Çí\rê\u0007øï\u0001\u0007\u0002ìAÁ÷ö\u000bï\u0000\tñ:½ú\u0007ûõ:éÈý\u0001\u0015ññó\f\u0002\u0018Í\rê\u0007øï\u0001\u0007\u0002ì\u001déñýùú\u0011\bêîü\u0006öý\u000b\u0016Ë\róö\u0011\tßÿüùöý/Êü\u0006þõý\u0004óöLïðþ;Ãôü\u0004÷\u00033Éï\u0006îÿ\u0002\u00012¾ÿ\u0003ì\rë\u0005\u0000îAº\u0000\u0007úúîAÁ÷ö\u000bï\u0000\tñ:°ü\u0014ôÿÛ\bñ\u0007öý\u001aëä\b\u0004óö*Ð\röö\u0004óöýÿ\u0007þö\u0004ñÿ÷þÿ÷\u0005ýê\t\u0000ê&Ú\u0007ûõ\u0004ûû\u0001è\u0005ô?ðþ;Ãôü\u0004÷\u00033Äùó\tÿýê\n3Çí\rê\u0007øï\u0001\u0007\u0002ìAÁ÷ö\u000bï\u0000\tñ:¼\u0005íù\u0004ù\u00039âÐü\u0000%Þí\u001eéðø\fîûÞíøûÿ\t\u0013Û\u0019éîÿýý÷\n\u0010Ø\bó\u0003ý\u0018éðø\fîû çï\u0001\u0000òü\u0006öý÷\u001déîú\u0005ô".getBytes("ISO-8859-1"), 0, bArr, 0, 577);
        $$d = bArr;
        $$e = 179;
        $$a = new byte[]{30, 17, -35, 104, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 29, -31, 48, 17, -4, 24, -1, 6, 13, 13, 29, -38, 50, 16, 1, 12, 24};
        $$b = 172;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new char[]{59724, 59776, 59782, 59802, 59760, 59767, 59782, 59803, 59804, 59793, 59777, 59759, 59775, 59806, 59769, 59750, 59777, 59803, 59807, 59780, 59782, 59776, 59705, 59747, 59757, 59747, 59770, 59751, 59759, 59728, 59728, 59752, 59757, 59771, 59749, 59744, 59746, 59726, 59789, 59783, 59783, 59747, 59749, 59788, 59779, 59776, 59744, 59754, 59788, 59804, 59807, 59782, 59777, 59805, 59425, 59427, 59430, 59454, 59449, 59449, 59441, 59439, 59411, 59429, 59450, 59410, 59414, 59430, 59427, 59671, 59710, 59714, 59718, 59698, 59709, 59719, 59712, 59705, 59714, 59719, 59717, 59752, 59719, 59708, 59709, 59718, 59718, 59704, 59711, 59709, 59712, 59752, 59758, 59718, 59718, 59757, 59716, 59708, 59717, 59759, 59754, 59754, 59752, 59758, 59712, 59713, 59713, 59719, 59759, 59753, 59712, 59709, 59699, 59718, 59713, 59710, 59709, 59713, 59719, 59711, 59715, 59712, 59711, 59719, 59758, 59716, 59709, 59711, 59718, 59752, 59719, 59711, 59706, 59706, 59753, 59753, 59718, 59704, 59705, 59712, 59719, 59717, 59758, 59712, 59714, 59752, 59712, 59719, 59718, 59704, 59705, 59711, 59711, 59711, 59709, 59717, 59717, 59719, 59712, 59712, 59718, 59709, 59709, 59698, 59699, 59699, 59718, 59712, 59704, 59705, 59719, 59752, 59714, 59705, 59712, 59758, 59717, 59709, 59710, 59704, 59704, 59709, 59717, 59717, 59698, 59718, 59712, 59704, 59705, 59713, 59759, 59719, 59704, 59713, 59715, 59704, 59717};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r7, byte r8, short r9) {
        /*
            int r7 = r7 * 3
            int r7 = 3 - r7
            int r9 = r9 * 2
            int r9 = 1 - r9
            byte[] r0 = com.google.android.gms.measurement.AppMeasurementReceiver.$$c
            int r8 = 105 - r8
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2b
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            int r7 = r7 + 1
            if (r4 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r7 = -r7
            int r7 = r7 + r3
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurementReceiver.$$g(byte, byte, short):java.lang.String");
    }
}
