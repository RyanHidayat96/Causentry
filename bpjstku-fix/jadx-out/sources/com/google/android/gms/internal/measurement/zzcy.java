package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes5.dex */
public final class zzcy extends zzbl implements zzda {
    private static short[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {102, -96, -78, -55};
    private static final int $$f = 71;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {93, -77, 2, Base64.padSymbol, 8, 25, -20, 25, 8, 27, 5, 13, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$e = 218;
    private static final byte[] $$a = {65, -122, -65, 2, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 6;
    private static int asInterface = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f775a = 1;
    private static int b = 1623676138;
    private static int TuitionPaymentFragmentbindingInflater1 = -1934795590;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 941532308;
    private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {92, -18, 18, -27, -49, 48, -18, 23, -25, 28, -64, -61, 93, -30, -89, 44, 29, 28, 27, -24, 16, -21, 85, 30, -30, 19, -18, -19, 26, -11, 8, 25, 20, -27, -23, 19, -31, 88, -27, 26, 21, -20, -14, Base64.padSymbol, -29, -19, 21, -21, 19, -9, -60, -11, 88, -26, -23, -43, 44, 29, 28, 27, -24, 16, -21, 80, 25, -32, 19, -11, 24, 28, 27, 26, -26, -55, 43, -32, -17, 21, -26, 27, -12, 82, -18, 23, -25, 28, -64, -61, 33, 31, -21, 19, -40, 43, 13, -13, 17, 82, -25, 19, -54, Base64.padSymbol, 19, -12, -1, 41, -29, -19, 19, -32, -17, -25, 29};

    zzcy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 52
            int r7 = r7 + 4
            int r9 = r9 * 52
            int r9 = r9 + 1
            int r8 = r8 + 84
            byte[] r0 = com.google.android.gms.internal.measurement.zzcy.$$a
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r8 = r7
            r3 = r9
            r4 = r2
            goto L2b
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r3 = r3 + r7
            int r7 = r3 + (-11)
            int r8 = r8 + 1
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzcy.c(byte, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 29
            int r0 = 38 - r6
            int r8 = r8 + 4
            byte[] r1 = com.google.android.gms.internal.measurement.zzcy.$$d
            int r7 = r7 * 19
            int r7 = 103 - r7
            byte[] r0 = new byte[r0]
            int r6 = 37 - r6
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2d
        L16:
            r3 = r2
        L17:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L28:
            r3 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2d:
            int r7 = r7 + r8
            int r7 = r7 + (-10)
            r8 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzcy.e(byte, byte, int, java.lang.Object[]):void");
    }

    @Override // com.google.android.gms.internal.measurement.zzda
    public final void zze(String str, String str2, Bundle bundle, long j) throws RemoteException {
        int i = 2 % 2;
        int i2 = asInterface + 79;
        f775a = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbn.zzc(parcelZza, bundle);
        parcelZza.writeLong(j);
        zzc(1, parcelZza);
        int i4 = f775a + 17;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0090 A[PHI: r13
  0x0090: PHI (r13v5 byte[] A[IMMUTABLE_TYPE]) = (r13v4 byte[]), (r13v8 byte[]) binds: [B:18:0x008e, B:15:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x009d  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b0 A[Catch: all -> 0x02ea, TryCatch #0 {all -> 0x02ea, blocks: (B:3:0x000f, B:5:0x0028, B:6:0x005b, B:30:0x0100, B:32:0x0117, B:33:0x0151, B:43:0x01aa, B:45:0x01c7, B:46:0x020f, B:22:0x009f, B:24:0x00b0, B:25:0x00e3), top: B:81:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:62:0x025c  */
    private static void d(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        long j;
        boolean z2;
        int length;
        byte[] bArr;
        byte[] bArr2;
        int length2;
        byte[] bArr3;
        int i4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i5 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                byte b3 = (byte) 0;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), KeyEvent.normalizeMetaState(0) + 2267, 33 - View.getDefaultSize(0, 0), 1387473586, false, $$g(b3, b3, (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i6 = $11 + 105;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i8 = $11;
                int i9 = i8 + 109;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    bArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i10 = 95 / 0;
                    if (bArr2 != null) {
                        length2 = bArr2.length;
                        bArr3 = new byte[length2];
                        int i11 = i8 + 23;
                        $10 = i11 % 128;
                        int i12 = i11 % 2;
                        for (i4 = 0; i4 < length2; i4++) {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i4])};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.getCapsMode("", 0, 0) + 3358, (ViewConfiguration.getLongPressTimeout() >> 16) + 18, -1054011043, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                            }
                            bArr3[i4] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr3)).byteValue();
                        }
                        bArr2 = bArr3;
                    }
                } else {
                    bArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    if (bArr2 != null) {
                        length2 = bArr2.length;
                        bArr3 = new byte[length2];
                        int i13 = i8 + 23;
                        $10 = i13 % 128;
                        int i14 = i13 % 2;
                        while (i4 < length2) {
                            Object[] objArr4 = {Integer.valueOf(bArr2[i4])};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = b6;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.getCapsMode("", 0, 0) + 3358, (ViewConfiguration.getLongPressTimeout() >> 16) + 18, -1054011043, false, $$g(b6, b7, b7), new Class[]{Integer.TYPE});
                            }
                            bArr3[i4] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr4)).byteValue();
                        }
                        bArr2 = bArr3;
                    }
                }
                if (bArr2 != null) {
                    byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    Object[] objArr5 = {Integer.valueOf(i3), Integer.valueOf(b)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b8 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ExpandableListView.getPackedPositionChild(0L) + 1), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2266, 33 - ExpandableListView.getPackedPositionGroup(0L), 1387473586, false, $$g(b8, b8, (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr4[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr5)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)));
                    j = 3046761265686732006L;
                } else {
                    j = 3046761265686732006L;
                    iIntValue = (short) (((short) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3[i3 + ((int) (((long) b) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)));
                }
            } else {
                j = 3046761265686732006L;
            }
            if (iIntValue > 0) {
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) b) ^ j)) + (!(z ^ true) ? 1 : 0);
                Object[] objArr6 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b9 = (byte) 0;
                    byte b10 = b9;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (55904 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2854, 13 - (Process.myPid() >> 22), -1529949196, false, $$g(b9, b10, (byte) (b10 + 3)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr6)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (bArr5 != null) {
                    int i15 = $10 + 91;
                    $11 = i15 % 128;
                    if (i15 % 2 == 0) {
                        length = bArr5.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr5.length;
                        bArr = new byte[length];
                    }
                    for (int i16 = 0; i16 < length; i16++) {
                        bArr[i16] = (byte) (((long) bArr5[i16]) ^ 3046761265686732006L);
                    }
                    bArr5 = bArr;
                }
                if (bArr5 != null) {
                    int i17 = $11 + 115;
                    $10 = i17 % 128;
                    if (i17 % 2 != 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                } else {
                    z2 = false;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    if (z2) {
                        int i18 = $11 + 45;
                        $10 = i18 % 128;
                        if (i18 % 2 != 0) {
                            byte[] bArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i19 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i19 % 0;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - (((byte) (((byte) (((long) bArr6[i19]) & 3046761265686732006L)) - s)) ^ b2));
                        } else {
                            byte[] bArr7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i20 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i20 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr7[i20]) ^ 3046761265686732006L)) + s)) ^ b2));
                        }
                    } else {
                        short[] sArr = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
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

    /* JADX WARN: Code duplicated, block: B:23:0x027e  */
    @Override // com.google.android.gms.internal.measurement.zzda
    public final int zzf() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Parcel parcelZza = zza();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 877;
            int edgeSlop = 10 - (ViewConfiguration.getEdgeSlop() >> 16);
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            c(b3, (byte) (b3 | 14), b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iLastIndexOf, edgeSlop, 252381699, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        d((ViewConfiguration.getKeyRepeatDelay() >> 16) + 1263273967, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 94, (short) (TextUtils.indexOf((CharSequence) "", '0') + 1), (byte) TextUtils.indexOf("", "", 0), 328595444 - Color.argb(0, 0, 0, 0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        d(TextUtils.getOffsetAfter("", 0) + 1263273971, (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 93, (short) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), (byte) (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.getTrimmedLength("") + 328595466, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            int deadChar = KeyEvent.getDeadChar(0, 0) + 876;
            int i2 = 11 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            byte[] bArr = $$a;
            byte b4 = bArr[7];
            Object[] objArr5 = new Object[1];
            c(b4, b4, (byte) (-bArr[5]), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maximumDrawingCacheSize, deadChar, i2, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf2 = (char) TextUtils.indexOf("", "", 0, 0);
                int i3 = 877 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                int offsetBefore = 10 - TextUtils.getOffsetBefore("", 0);
                byte[] bArr2 = $$a;
                Object[] objArr6 = new Object[1];
                c((byte) (-bArr2[5]), bArr2[54], bArr2[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf2, i3, offsetBefore, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int i4 = (int) Runtime.getRuntime().totalMemory();
            int i5 = ~i4;
            int i6 = (~((-338718470) | i5)) | 70264325;
            int i7 = ~(i4 | (-29954097));
            int i8 = ((953263010 + ((i6 | i7) * (-502))) + ((i7 | (~(i5 | (-268454145)))) * TypedValues.PositionType.TYPE_DRAWPATH)) - 812384127;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[1])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            d(TextUtils.indexOf((CharSequence) "", '0', 0) + 1263273968, (-93) - (ViewConfiguration.getJumpTapTimeout() >> 16), (short) (ViewConfiguration.getScrollBarSize() >> 8), (byte) TextUtils.getOffsetBefore("", 0), 328595480 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            d(1263273969 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), Gravity.getAbsoluteGravity(0, 0) - 93, (short) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (byte) View.MeasureSpec.makeMeasureSpec(0, 0), TextUtils.indexOf("", "", 0, 0) + 328595507, objArr9);
            Method method = cls2.getMethod((String) objArr9[0], new Class[0]);
            Context applicationContext = (Context) method.invoke(null, null);
            if (applicationContext != null) {
                int i11 = f775a;
                int i12 = i11 + 89;
                asInterface = i12 % 128;
                int i13 = i12 % 2;
                if (applicationContext instanceof ContextWrapper) {
                    int i14 = i11 + 85;
                    asInterface = i14 % 128;
                    int i15 = i14 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            d(1263273976 - TextUtils.getCapsMode("", 0, 0), View.resolveSize(0, 0) - 93, (short) Color.argb(0, 0, 0, 0), (byte) (ViewConfiguration.getJumpTapTimeout() >> 16), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 328595525, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            d(TextUtils.getTrimmedLength("") + 1263273975, (-93) - (ViewConfiguration.getPressedStateDuration() >> 16), (short) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), (byte) ((-1) - ExpandableListView.getPackedPositionChild(0L)), KeyEvent.keyCodeFromString("") + 328595541, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), -812384127};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[15];
                Object[] objArr13 = new Object[1];
                e((byte) (-b5), bArr3[36], b5, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                e(bArr3[36], (byte) (-bArr3[15]), (byte) (-bArr3[27]), objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                        int offsetBefore2 = TextUtils.getOffsetBefore("", 0) + 876;
                        int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 11;
                        byte[] bArr4 = $$a;
                        Object[] objArr16 = new Object[1];
                        c((byte) (-bArr4[5]), bArr4[54], bArr4[7], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(tapTimeout, offsetBefore2, iLastIndexOf2, 256017550, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        d((Process.myPid() >> 22) + 1263273967, (-92) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (short) (ViewConfiguration.getTapTimeout() >> 16), (byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), TextUtils.indexOf((CharSequence) "", '0') + 328595445, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        d(1263273971 - View.MeasureSpec.makeMeasureSpec(0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 94, (short) (ExpandableListView.getPackedPositionChild(0L) + 1), (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 328595466, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 876;
                            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 10;
                            byte[] bArr5 = $$a;
                            byte b6 = bArr5[7];
                            Object[] objArr19 = new Object[1];
                            c(b6, b6, (byte) (-bArr5[5]), objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, scrollBarSize, keyRepeatTimeout, 2009631821, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                            int iLastIndexOf3 = TextUtils.lastIndexOf("", '0', 0) + 877;
                            int pressedStateDuration = 10 - (ViewConfiguration.getPressedStateDuration() >> 16);
                            byte b7 = $$a[7];
                            byte b8 = b7;
                            Object[] objArr20 = new Object[1];
                            c(b8, (byte) (b8 | 14), b7, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(fadingEdgeLength, iLastIndexOf3, pressedStateDuration, 252381699, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i16 = ((int[]) objArr[2])[0];
        int i17 = ((int[]) objArr[0])[0];
        if (i17 != i16) {
            throw new RuntimeException(String.valueOf(i17));
        }
        int i18 = ((int[]) objArr[1])[0];
        Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int iMyPid = Process.myPid();
        int i19 = ~iMyPid;
        int i20 = i18 + 2070192700 + (((~(900464161 | i19)) | (~((-940774391) | iMyPid))) * (-370)) + (((~(iMyPid | 900464161)) | (~(i19 | (-940774391))) | 94956545) * (-370)) + 774183282;
        int i21 = (i20 << 13) ^ i20;
        int i22 = i21 ^ (i21 >>> 17);
        Object obj = objArr21[1];
        ((int[]) obj)[0] = i22 ^ (i22 << 5);
        int i23 = ((int[]) obj)[0];
        int i24 = i23 * i23;
        int i25 = -(1626146982 * i23);
        int i26 = (i24 ^ i25) + ((i24 & i25) << 1);
        int i27 = -(i23 * 2050415826);
        int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
        int i29 = (i28 ^ (-148899312)) + (((-148899312) & i28) << 1);
        int i30 = i29 >> 21;
        int i31 = (((i30 | (-4095)) << 1) - (i30 ^ (-4095))) / 2048;
        int i32 = ((i31 | 1) << 1) - (i31 ^ 1);
        int i33 = (i30 - 4095) / 2048;
        int i34 = -(((i29 & i32) + (i29 | i32)) ^ ((i33 & 1) + (i33 | 1)));
        int i35 = (i34 ^ 7) + ((i34 & 7) << 1);
        int i36 = i35 >> 23;
        int i37 = ((i36 & (-1023)) + (i36 | (-1023))) / 512;
        int i38 = (i37 & 1) + (i37 | 1);
        Parcel parcelZzP = zzP(21154 / (((-(((i38 | 1) << 1) - (i38 ^ 1))) & i35) * 1511), parcelZza);
        int i39 = parcelZzP.readInt();
        parcelZzP.recycle();
        return i39;
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
    private static java.lang.String $$g(byte r5, byte r6, byte r7) {
        /*
            int r6 = r6 * 4
            int r0 = 1 - r6
            int r5 = r5 * 4
            int r5 = 4 - r5
            byte[] r1 = com.google.android.gms.internal.measurement.zzcy.$$c
            int r7 = 121 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L16
            r4 = r6
            r3 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L22:
            int r3 = r3 + 1
            r4 = r1[r5]
        L26:
            int r7 = r7 + r4
            int r5 = r5 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzcy.$$g(byte, byte, byte):java.lang.String");
    }
}
