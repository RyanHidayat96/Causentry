package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.ContextWrapper;
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
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes5.dex */
final class zzpe {
    private static short[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final zzpg zza;
    private int zzb = 1;
    private long zzc = zzd();
    private static final byte[] $$c = {56, 94, 119, -19};
    private static final int $$f = 161;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {46, 47, -18, 64, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -54, -3, -3, 72, -56, -2, -3, 18, -10, 7, 16, -8, 65, -60, 4, 4, 5, -8, 24, -1, -9, 5, 3, 1, 4, 67, -73, 3, 27, -13, -30, 15, -8, 14, -3, 4, 33, -14, -21, 15, 11, -6, -3, 49, -41, 20, -3, -3, 11, -6, -3, 4, 6, 14, 5, -3, 11, -8, 6, -2, 5, 6, -2, 12, 4, -15, 16, 7, -15, 45, -31, 14, 2, -4, 11, 2, 2, 8, -17, 12, -5, 69};
    private static final int $$e = 38;
    private static final byte[] $$a = {Base64.padSymbol, -108, 49, -100, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
    private static final int $$b = 86;
    private static int asInterface = 0;
    private static int g = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = 789195887;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -1934795606;
    private static int b = -1381067326;
    private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {44, -31, 29, -22, -64, 63, -31, 24, -24, 19, -49, -52, 82, -19, -88, 35, 18, 19, 20, -25, 31, -28, 37, 116, -120, 121, -124, -121, 112, -97, 98, 115, 126, -113, -125, 121, -117, 40, 42, -43, -38, 35, Base64.padSymbol, -14, 44, 34, -38, 36, -36, 56, 11, 58, -105, 41, 38, 26, -29, -46, -45, -44, 39, -33, 36, 32, 7, -2, 13, -21, 6, 2, 5, 4, -8, -41, 53, -2, -15, 11, -8, 5, -22, 34, 25, -32, 16, -21, 55, 52, -42, -24, 28, -28, 47, -36, -6, 4, -26, 34, 121, -115, 84, -93, -115, 106, 97, -73, 125, 115, -115, 126, 113, 121, -125, 18, 114, -114, 70, 66, 108, -66, -67, -107, 114, -72, 70, -111, 107, 74, -115, 110, 64, -116, -67, 108, 70, -67, -115, 71, 107, 69, 66, -70, 69, -109, 106, 66, 71, -110, 115, 64, -115, 105, -112, 65, 105, 66, 64, -110, 109, 71, -72, 64, -106, -66, 66, 114, -115, 66, 111, 65, -110, 70, 67, 66, -71, 67, 113, 18, -70, -116, 69, -89, -120, 70, -119, -69, 117, 117, 88, -93, -118, 92, -96, -116, -118, 117, 119, -117, 90, -117, -71, -118, 91, 118, -69, -119, 118, 89, -93, -117, 117, -118, -116, 112, 93, -92, 88, -90, 90, -91, -120, -120, 119, -119, -117, 116, 68, -66, 71, -119, -72, 64, -117, -92, 95, -89, -113, 112, 88, -119, 116};

    public zzpe(zzpg zzpgVar) {
        this.zza = zzpgVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 52
            int r9 = 55 - r9
            int r8 = r8 * 14
            int r8 = r8 + 84
            byte[] r0 = com.google.android.gms.measurement.internal.zzpe.$$a
            int r7 = r7 * 52
            int r7 = 53 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r8 = r9
            r4 = r2
            goto L2e
        L17:
            r3 = r2
            r6 = r9
            r9 = r8
            r8 = r6
        L1b:
            int r8 = r8 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L2c
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2c:
            r3 = r0[r8]
        L2e:
            int r3 = -r3
            int r9 = r9 + r3
            int r9 = r9 + (-11)
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpe.a(short, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 4
            int r0 = 53 - r8
            int r7 = r7 + 4
            byte[] r1 = com.google.android.gms.measurement.internal.zzpe.$$d
            int r6 = r6 * 15
            int r6 = r6 + 84
            byte[] r0 = new byte[r0]
            int r8 = 52 - r8
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2e
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r7 = r7 + 1
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L26:
            r4 = r1[r7]
            int r3 = r3 + 1
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2e:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + 3
            r7 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpe.d(int, byte, short, java.lang.Object[]):void");
    }

    private final long zzd() {
        int i = 2 % 2;
        int i2 = asInterface + 79;
        g = i2 % 128;
        int i3 = i2 % 2;
        zzpg zzpgVar = this.zza;
        Preconditions.checkNotNull(zzpgVar);
        long jLongValue = ((Long) zzfy.zzu.zzb(null)).longValue();
        long jLongValue2 = ((Long) zzfy.zzv.zzb(null)).longValue();
        int i4 = 1;
        while (i4 < this.zzb) {
            jLongValue += jLongValue;
            if (jLongValue >= jLongValue2) {
                break;
            }
            i4++;
            int i5 = asInterface + 117;
            g = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 / 5;
            }
        }
        long jCurrentTimeMillis = zzpgVar.zzaZ().currentTimeMillis() + Math.min(jLongValue, jLongValue2);
        int i7 = g + 39;
        asInterface = i7 % 128;
        if (i7 % 2 == 0) {
            return jCurrentTimeMillis;
        }
        throw null;
    }

    private static void c(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4;
        int i5;
        int i6 = 2;
        int i7 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2267, Color.argb(0, 0, 0, 0) + 33, 1387473586, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i8 = $10 + 101;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                byte[] bArr = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i10 = 0;
                    while (i10 < length) {
                        int i11 = $10 + 81;
                        $11 = i11 % 128;
                        if (i11 % i6 == 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i10])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                int i12 = 3359 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                int pressedStateDuration = 18 - (ViewConfiguration.getPressedStateDuration() >> 16);
                                byte length2 = (byte) $$c.length;
                                byte b5 = (byte) (length2 - 4);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(keyRepeatDelay, i12, pressedStateDuration, -1054011043, false, $$g(length2, b5, b5), new Class[]{Integer.TYPE});
                            }
                            bArr2[i10] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                            i10 %= 1;
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr[i10])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char mode = (char) View.MeasureSpec.getMode(0);
                                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 3359;
                                int defaultSize = View.getDefaultSize(0, 0) + 18;
                                byte length3 = (byte) $$c.length;
                                byte b6 = (byte) (length3 - 4);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mode, iLastIndexOf, defaultSize, -1054011043, false, $$g(length3, b6, b6), new Class[]{Integer.TYPE});
                            }
                            bArr2[i10] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).byteValue();
                            i10++;
                        }
                        i6 = 2;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i13 = $10 + 13;
                    $11 = i13 % 128;
                    if (i13 % 2 == 0) {
                        byte[] bArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        Object[] objArr5 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b7 = (byte) 0;
                            byte b8 = b7;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Process.getGidForName("") + 1), 2266 - TextUtils.lastIndexOf("", '0'), TextUtils.getTrimmedLength("") + 33, 1387473586, false, $$g(b7, b8, b8), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i5 = ((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()]) % 3046761265686732006L)) * ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) | 3046761265686732006L));
                    } else {
                        byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        Object[] objArr6 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            byte b9 = (byte) 0;
                            byte b10 = b9;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (ViewConfiguration.getLongPressTimeout() >> 16), 2268 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0) + 34, 1387473586, false, $$g(b9, b10, b10), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i5 = ((byte) (((long) bArr4[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L));
                    }
                    iIntValue = (byte) i5;
                } else {
                    iIntValue = (short) (((short) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2[i3 + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                int i14 = $11;
                int i15 = i14 + 29;
                $10 = i15 % 128;
                int i16 = i15 % 2;
                int i17 = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L));
                if (z) {
                    int i18 = i14 + 75;
                    $10 = i18 % 128;
                    int i19 = i18 % 2;
                    i4 = 1;
                } else {
                    int i20 = i14 + 67;
                    $10 = i20 % 128;
                    int i21 = i20 % 2;
                    i4 = 0;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i17 + i4;
                try {
                    Object[] objArr7 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(b), sb};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c = (char) (55905 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                        int iIndexOf = 2855 - TextUtils.indexOf("", "", 0);
                        int offsetBefore = TextUtils.getOffsetBefore("", 0) + 13;
                        byte b11 = (byte) ($$f & 7);
                        byte b12 = (byte) (b11 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, iIndexOf, offsetBefore, -1529949196, false, $$g(b11, b12, b12), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    byte[] bArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    if (bArr5 != null) {
                        int length4 = bArr5.length;
                        byte[] bArr6 = new byte[length4];
                        int i22 = 0;
                        while (i22 < length4) {
                            bArr6[i22] = (byte) (((long) bArr5[i22]) ^ 3046761265686732006L);
                            i22++;
                            int i23 = $10 + 87;
                            $11 = i23 % 128;
                            if (i23 % 2 == 0) {
                                int i24 = 4 % 5;
                            }
                        }
                        bArr5 = bArr6;
                    }
                    boolean z2 = bArr5 != null;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                    while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                        int i25 = $11 + 65;
                        $10 = i25 % 128;
                        int i26 = i25 % 2;
                        if (z2) {
                            byte[] bArr7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i27 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i27 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr7[i27]) ^ 3046761265686732006L)) + s)) ^ b2));
                        } else {
                            short[] sArr = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i28 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i28 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i28]) ^ 3046761265686732006L)) + s)) ^ b2));
                        }
                        sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
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

    /* JADX WARN: Code duplicated, block: B:26:0x0289  */
    public final void zza() throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        int i2 = asInterface + 25;
        g = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char offsetAfter = (char) (TextUtils.getOffsetAfter("", 0) + 37567);
            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 625;
            int mode = 14 - View.MeasureSpec.getMode(0);
            byte b2 = $$a[5];
            byte b3 = b2;
            Object[] objArr3 = new Object[1];
            a(b2, b3, b3, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetAfter, iNormalizeMetaState, mode, -477065106, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 553896132, (-76) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (short) TextUtils.indexOf("", "", 0, 0), (byte) (15 - View.MeasureSpec.getSize(0)), 1549307766 - Process.getGidForName(""), objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(Drawable.resolveOpacity(0, 0) - 553896127, (-77) - (ViewConfiguration.getScrollDefaultDelay() >> 16), (short) KeyEvent.keyCodeFromString(""), (byte) (TextUtils.indexOf((CharSequence) "", '0') + 107), 1549307789 - (ViewConfiguration.getTouchSlop() >> 8), objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cBlue = (char) (Color.blue(0) + 37567);
            int iGreen = 625 - Color.green(0);
            int fadingEdgeLength = 14 - (ViewConfiguration.getFadingEdgeLength() >> 16);
            byte[] bArr = $$a;
            byte b4 = bArr[7];
            Object[] objArr6 = new Object[1];
            a(b4, b4, bArr[5], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cBlue, iGreen, fadingEdgeLength, -976899241, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cAxisFromString = (char) (MotionEvent.axisFromString("") + 37568);
                int iMyTid = 625 - (Process.myTid() >> 22);
                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 14;
                byte b5 = $$a[7];
                byte b6 = b5;
                Object[] objArr7 = new Object[1];
                a(b5, b6, b6, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cAxisFromString, iMyTid, maximumDrawingCacheSize, -973632554, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i4 = ((int[]) objArr8[2])[0];
            int i5 = ((int[]) objArr8[0])[0];
            String[] strArr = (String[]) objArr8[3];
            int[] iArr = {i4};
            int iNextInt = new Random().nextInt();
            int i6 = (-2122724920) + (((~(539758025 | iNextInt)) | (-1823473664) | (~(1283980095 | iNextInt))) * (-744)) + (((~iNextInt) | 264457) * 744) + ((iNextInt | 1823473663) * 744) + 975196230;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[1])[0] = i8 ^ (i8 << 5);
            objArr = new Object[]{new int[]{i5}, new int[1], iArr, strArr};
        } else {
            Object[] objArr9 = new Object[1];
            c(View.resolveSizeAndState(0, 0, 0) - 553896131, (-77) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (short) View.getDefaultSize(0, 0), (byte) (ImageFormat.getBitsPerPixel(0) - 48), 1549307804 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            c((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 553896130, (ViewConfiguration.getKeyRepeatDelay() >> 16) - 77, (short) ((Process.getThreadPriority(0) + 20) >> 6), (byte) (30 - Color.argb(0, 0, 0, 0)), View.MeasureSpec.getSize(0) + 1549307830, objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i9 = g + 63;
                    asInterface = i9 % 128;
                    if (i9 % 2 != 0) {
                        ((ContextWrapper) applicationContext).getBaseContext();
                        throw null;
                    }
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                        int i10 = g + 51;
                        asInterface = i10 % 128;
                        int i11 = i10 % 2;
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                    int i12 = g + 51;
                    asInterface = i12 % 128;
                    int i13 = i12 % 2;
                }
            }
            Object[] objArr11 = new Object[1];
            c(ExpandableListView.getPackedPositionType(0L) - 553896122, (-78) - TextUtils.indexOf((CharSequence) "", '0'), (short) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), (byte) (ImageFormat.getBitsPerPixel(0) - 8), ((byte) KeyEvent.getModifierMetaStateMask()) + 1549307849, objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            c((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 553896124, ExpandableListView.getPackedPositionType(0L) - 77, (short) Color.argb(0, 0, 0, 0), (byte) ((-98) - KeyEvent.keyCodeFromString("")), View.MeasureSpec.getSize(0) + 1549307864, objArr12);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr13 = new Object[1];
            c((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 553896178, (-77) - (ViewConfiguration.getEdgeSlop() >> 16), (short) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), (byte) (65492 - AndroidCharacter.getMirror('0')), TextUtils.indexOf((CharSequence) "", '0') + 1549307881, objArr13);
            String str = (String) objArr13[0];
            Object[] objArr14 = new Object[1];
            c((-553896130) - TextUtils.lastIndexOf("", '0', 0), (-78) - MotionEvent.axisFromString(""), (short) TextUtils.indexOf("", ""), (byte) (107 - TextUtils.lastIndexOf("", '0', 0, 0)), 1549307944 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr14);
            String[] strArr2 = {str, (String) objArr14[0]};
            int i14 = g + 101;
            asInterface = i14 % 128;
            int i15 = i14 % 2;
            try {
                Object[] objArr15 = {applicationContext, strArr2, Integer.valueOf(iIntValue), 17, 975196230};
                byte[] bArr2 = $$d;
                byte b7 = bArr2[45];
                Object[] objArr16 = new Object[1];
                d(b7, bArr2[41], b7, objArr16);
                Class<?> cls4 = Class.forName((String) objArr16[0]);
                byte b8 = bArr2[45];
                Object[] objArr17 = new Object[1];
                d((byte) (b8 - 1), bArr2[1], (byte) (b8 - 1), objArr17);
                Object[] objArr18 = (Object[]) cls4.getMethod((String) objArr17[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr15);
                int i16 = ((int[]) objArr18[0])[0];
                int i17 = ((int[]) objArr18[2])[0];
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char mode2 = (char) (37567 - View.MeasureSpec.getMode(0));
                        int keyRepeatDelay = 625 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 14;
                        byte b9 = $$a[7];
                        byte b10 = b9;
                        Object[] objArr19 = new Object[1];
                        a(b9, b10, b10, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(mode2, keyRepeatDelay, maximumFlingVelocity, -973632554, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr18);
                    try {
                        Object[] objArr20 = new Object[1];
                        c((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 553896131, TextUtils.getOffsetBefore("", 0) - 77, (short) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (byte) (KeyEvent.keyCodeFromString("") + 15), ExpandableListView.getPackedPositionType(0L) + 1549307767, objArr20);
                        Class<?> cls5 = Class.forName((String) objArr20[0]);
                        Object[] objArr21 = new Object[1];
                        c((-553896127) - View.combineMeasuredStates(0, 0), Process.getGidForName("") - 76, (short) KeyEvent.keyCodeFromString(""), (byte) (ImageFormat.getBitsPerPixel(0) + 107), 1549307788 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr21);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr21[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 37567);
                            int tapTimeout = 625 - (ViewConfiguration.getTapTimeout() >> 16);
                            int i18 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 13;
                            byte[] bArr3 = $$a;
                            byte b11 = bArr3[7];
                            Object[] objArr22 = new Object[1];
                            a(b11, b11, bArr3[5], objArr22);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(touchSlop, tapTimeout, i18, -976899241, false, (String) objArr22[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 37567);
                            int i19 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 625;
                            int keyRepeatDelay2 = 14 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                            byte b12 = $$a[5];
                            byte b13 = b12;
                            Object[] objArr23 = new Object[1];
                            a(b12, b13, b13, objArr23);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionType, i19, keyRepeatDelay2, -477065106, false, (String) objArr23[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr18;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i20 = ((int[]) objArr[0])[0];
        int i21 = ((int[]) objArr[2])[0];
        if (i21 == i20) {
            int i22 = ((int[]) objArr[1])[0];
            int i23 = ((int[]) objArr[2])[0];
            int i24 = ((int[]) objArr[0])[0];
            String[] strArr3 = (String[]) objArr[3];
            int[] iArr2 = {i23};
            int iIdentityHashCode = System.identityHashCode(this);
            int i25 = ~iIdentityHashCode;
            int i26 = i22 + (((((~((-1731065645) | i25)) | (~((-92672477) | iIdentityHashCode))) | (~(i25 | 92672476))) * 959) - 1569181485) + (((~(iIdentityHashCode | 92672476)) | (~(i25 | (-92672477))) | (~((-1731065645) | iIdentityHashCode))) * 959);
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr2[1])[0] = i28 ^ (i28 << 5);
            objArr2 = new Object[]{new int[]{i24}, new int[1], iArr2, strArr3};
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr4 = (String[]) objArr[3];
            if (strArr4 != null) {
                int i29 = asInterface + 15;
                g = i29 % 128;
                int i30 = 2;
                int i31 = i29 % 2;
                int i32 = 0;
                while (i32 < strArr4.length) {
                    int i33 = asInterface + 73;
                    g = i33 % 128;
                    if (i33 % i30 == 0) {
                        arrayList.add(strArr4[i32]);
                        i32 += 15;
                    } else {
                        arrayList.add(strArr4[i32]);
                        i32++;
                    }
                    i30 = 2;
                }
            }
            int[] iArr3 = new int[i21];
            int i34 = i21 - 1;
            iArr3[i34] = 1;
            Toast.makeText((Context) null, iArr3[((i21 * i34) % 2) - 1], 1).show();
            int i35 = ((int[]) objArr[1])[0];
            int i36 = ((int[]) objArr[2])[0];
            int i37 = ((int[]) objArr[0])[0];
            String[] strArr5 = (String[]) objArr[3];
            int[] iArr4 = {i36};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i38 = ~(1023675744 | iIdentityHashCode2);
            int i39 = i35 + 983210464 + ((44823176 | i38) * (-814)) + ((i38 | (~((~iIdentityHashCode2) | (-800062377))) | 268436544) * 407) + (((~(iIdentityHashCode2 | 800062376)) | (~((-1023675745) | iIdentityHashCode2)) | 268436544) * 407);
            int i40 = (i39 << 13) ^ i39;
            int i41 = i40 ^ (i40 >>> 17);
            ((int[]) objArr2[1])[0] = i41 ^ (i41 << 5);
            objArr2 = new Object[]{new int[]{i37}, new int[1], iArr4, strArr5};
        }
        int i42 = this.zzb;
        int i43 = ((int[]) objArr2[1])[0];
        int i44 = i43 * i43;
        int i45 = -(479937177 * i43);
        int i46 = (i44 & i45) + (i44 | i45);
        int i47 = -(i43 * (-289969075));
        int i48 = (i46 & i47) + (i47 | i46);
        int i49 = (i48 & 297098665) + (297098665 | i48);
        int i50 = i49 >> 15;
        int i51 = ((i50 ^ (-262143)) + ((i50 & (-262143)) << 1)) / 131072;
        int i52 = ((i49 >> 19) - 16383) / 8192;
        int i53 = -(((i49 - (~((i51 & 1) + (i51 | 1)))) - 1) ^ ((i52 & 1) + (i52 | 1)));
        int i54 = ((i53 | 9) << 1) - (i53 ^ 9);
        int i55 = i54 >> 21;
        int i56 = ((i55 & (-4095)) + (i55 | (-4095))) / 2048;
        int i57 = ((i56 | 1) << 1) - (i56 ^ 1);
        this.zzb = i42 + (10539 / (((-((i57 & 1) + (i57 | 1))) & i54) * 1171));
        this.zzc = zzd();
    }

    public final boolean zzb() {
        int i = 2 % 2;
        int i2 = g + 5;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            this.zza.zzaZ().currentTimeMillis();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.zza.zzaZ().currentTimeMillis() < this.zzc) {
            return false;
        }
        int i3 = asInterface + 59;
        g = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 63 / 0;
        }
        return true;
    }

    final /* synthetic */ long zzc() {
        long j;
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 61;
        g = i3 % 128;
        if (i3 % 2 == 0) {
            j = this.zzc;
            int i4 = 52 / 0;
        } else {
            j = this.zzc;
        }
        int i5 = i2 + 19;
        g = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 52 / 0;
        }
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r5, short r6, int r7) {
        /*
            byte[] r0 = com.google.android.gms.measurement.internal.zzpe.$$c
            int r6 = r6 * 4
            int r6 = r6 + 4
            int r7 = r7 * 4
            int r1 = r7 + 1
            int r5 = r5 + 117
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r5
            r5 = r7
            r4 = r2
            goto L25
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L23:
            r3 = r0[r6]
        L25:
            int r5 = r5 + r3
            int r6 = r6 + 1
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpe.$$g(short, short, int):java.lang.String");
    }
}
