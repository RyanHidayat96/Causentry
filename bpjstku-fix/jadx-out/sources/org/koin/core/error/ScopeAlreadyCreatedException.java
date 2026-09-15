package org.koin.core.error;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.deInitSession;
import defpackage.initSession;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002"}, d2 = {"Lorg/koin/core/error/ScopeAlreadyCreatedException;", "Ljava/lang/Exception;", "Lkotlin/TuitionPaymentFragmentspecialinlinedviewModeldefault3;"}, k = 1, mv = {2, 3, 0})
public final class ScopeAlreadyCreatedException extends Exception {
    private static short[] asBinder;
    private static final byte[] $$c = {48, -110, 22, 55};
    private static final int $$f = 62;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {115, 98, 19, 9};
    private static final int $$e = 162;
    private static final byte[] $$a = {25, 31, 20, 1, -11, 19, -23, -53, 60, -13, 11, -9, -59, 36, 18, 8, -15, -6, 1, -1, -21, 15, 0};
    private static final int $$b = 173;
    private static int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f1316a = 1;
    private static char[] b = {60054, 60060, 60058, 60057, 59745, 60034, 60047, 60046, 60048, 60042, 60062, 60117, 60035, 60118, 60068, 60045, 60040, 59744, 60059, 60043, 60104, 60051, 60061, 59746, 60116, 60050, 59747, 60063, 60055, 60056, 60041, 60052, 60044, 60053, 60109, 60033};
    private static char TuitionPaymentFragmentbindingInflater1 = 57191;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 416141858;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -1934795579;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -997257057;
    private static byte[] g = {5, -46, -54, 122, -46, 116, 3, 43, -56, -47, -48, 38, 35, -42, 18, 15, 85, 95, 3, 51, 4, 93, 83, 57, 15, 86, 17, -100, 51, 32, 51, 87, 95, 4, -60, -111, 95, 29, -91, 51, 53, -95, -47, -96, 43, 49, -81, -91, 58, -9, -31, -90, 49, -95, 40, -84, 109, 104, -47, 4, -47, Base64.padSymbol, 53, -96, 96, 119, 53, 12, 125, -120, -123, 120, -126, 112, -109, 113, -123, -76, 63, 113, 56, 0, -33, 125, -92, -33, 126, -45, 106, 111, 5, 13, -103, 3, -104, 23, 12, 106, 7, -124, 105, 72, 126, 122, 52, -78, 64, 112, 70, 4, -51, -93, -63, -50, 5, 19, -54, 83, -53, 89, 57, 26, 11, 40, 89, -107, 41, -19, -64, 41, 48, -68, 41, 53, -67, 49, -114, 43, 15, -19, 10, -9, -14, Base64.padSymbol, -10, 57, -10, -20, -10, 59, 2, -44, 23, -44, -48, -90, 1, 2, 74, -127, -125, 85, 82, ByteCompanionObject.MIN_VALUE, 23, 116, 105, 60, 116, 4, 118, 2, 115, 109, 7, 2, 107, 0, 102, 11, 112, 97, 13, 113, 5, -4, -4, 25, 8, -5, 11, 119, 22, 24, 98, 22, -49, -80, 2, 96, -26, 122, 0, 112, 2, 103, 0, 47, -50, 32, -90, -47, -47, 2, 53, 14, 2, 34, 36, -33, 38, -42, -45, -45, 52, 39, 13, -111, 123, -117, 67, 66, -112, 98, 125, 64, -109, 68, -113, ByteCompanionObject.MAX_VALUE, 18, 102, 43, -103, 99, 48, 99, 106, -19, -103, -99, -97, 55, -99, 54, -36, -12, 103, 109, -12, 62, -102, -36, 7, -112, 96, 124, 15, -58, -8, -43, 50, -67, -13, -54, -6, -59, -7, 7, 14, 8, 22, -30, -112, 18, 10, -39, 12, -82, 86, 14, 75, 58, 65, 55, 78, 68, 63, 51, 84, 54, 2, -27, -15, -25, -4, -27, -1, 18, 46, 44, 32, 46, 32, 32, 73, 35, 46, 91, -30, -103, 88, 36, -29, -104, 47, 40, 84, 47, 43, 83, 15, 42, 98, 95, 37, 106, -100, 47, 76, 122, 92, 100, 8, -19, -95, -93, 6, 101, -17, -89, 42, 48, -81, -23, 26, 57, -33, 41, -15, 5, -109, 87, 85, -83, 20, 11, -71, -3, -1, 96, 1, -125, -119, 58, -72, -50, -119, -7, -112, -4, 58, 0, 77, 1, 3, 95, -55, -117, -118, -62, 3, -60, 0, 14, 50, -83, 5, 67, 5, 115, 89, 49, ByteCompanionObject.MIN_VALUE, 104};

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 3
            int r8 = 4 - r8
            int r7 = r7 * 2
            int r0 = 1 - r7
            byte[] r1 = org.koin.core.error.ScopeAlreadyCreatedException.$$d
            int r6 = 103 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L30
        L16:
            r3 = r2
        L17:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L30:
            int r8 = r8 + 1
            int r6 = r6 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: org.koin.core.error.ScopeAlreadyCreatedException.c(byte, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void h(int r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 15
            int r9 = r9 + 4
            byte[] r0 = org.koin.core.error.ScopeAlreadyCreatedException.$$a
            int r7 = r7 * 9
            int r7 = r7 + 106
            int r8 = r8 * 11
            int r8 = r8 + 5
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r7 = r9
            r4 = r2
            goto L2f
        L17:
            r3 = r2
        L18:
            r6 = r9
            r9 = r7
            r7 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L2a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2a:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r6
        L2f:
            int r9 = r9 + 1
            int r7 = r7 + r3
            int r7 = r7 + 2
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: org.koin.core.error.ScopeAlreadyCreatedException.h(int, byte, byte, java.lang.Object[]):void");
    }

    private static void f(int i, int i2, short s, int i3, byte b2, Object[] objArr) throws Throwable {
        int i4 = 2;
        int i5 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cBlue = (char) Color.blue(0);
                int deadChar = 2267 - KeyEvent.getDeadChar(0, 0);
                int i6 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 32;
                byte length = (byte) $$c.length;
                byte b3 = (byte) (length - 4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cBlue, deadChar, i6, 1387473586, false, $$g(length, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            int i7 = iIntValue == -1 ? 1 : 0;
            if (i7 != 0) {
                byte[] bArr = g;
                if (bArr != null) {
                    int length2 = bArr.length;
                    byte[] bArr2 = new byte[length2];
                    int i8 = 0;
                    while (i8 < length2) {
                        int i9 = $11 + 41;
                        $10 = i9 % 128;
                        if (i9 % i4 != 0) {
                            try {
                                Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b4 = (byte) 0;
                                    byte b5 = b4;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Gravity.getAbsoluteGravity(0, 0), 3358 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 18, -1054011043, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                                }
                                bArr2[i8] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                                i8--;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr[i8])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = b6;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((Process.getThreadPriority(0) + 20) >> 6), 3358 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 19 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -1054011043, false, $$g(b6, b7, b7), new Class[]{Integer.TYPE});
                            }
                            bArr2[i8] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).byteValue();
                            i8++;
                        }
                        i4 = 2;
                    }
                    int i10 = $10 + 111;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        int i11 = 2 % 5;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i12 = $10 + 11;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    byte[] bArr3 = g;
                    Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                        int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 2267;
                        int iIndexOf = 33 - TextUtils.indexOf("", "");
                        byte length3 = (byte) $$c.length;
                        byte b8 = (byte) (length3 - 4);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(pressedStateDuration, pressedStateDuration2, iIndexOf, 1387473586, false, $$g(length3, b8, b8), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L)));
                } else {
                    iIntValue = (short) (((short) (((long) asBinder[i + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                int i14 = $11 + 35;
                $10 = i14 % 128;
                int i15 = i14 % 2;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L)) + i7;
                Object[] objArr6 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b9 = (byte) 3;
                    byte b10 = (byte) (b9 - 3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 55905), 2854 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), TextUtils.indexOf("", "") + 13, -1529949196, false, $$g(b9, b10, b10), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = g;
                if (bArr4 != null) {
                    int length4 = bArr4.length;
                    byte[] bArr5 = new byte[length4];
                    for (int i16 = 0; i16 < length4; i16++) {
                        bArr5[i16] = (byte) (((long) bArr4[i16]) ^ 3046761265686732006L);
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                int i17 = $10 + 59;
                $11 = i17 % 128;
                int i18 = i17 % 2;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    if (z) {
                        byte[] bArr6 = g;
                        int i19 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i19 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i19]) ^ 3046761265686732006L)) + s)) ^ b2));
                    } else {
                        short[] sArr = asBinder;
                        int i20 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i20 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i20]) ^ 3046761265686732006L)) + s)) ^ b2));
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

    private static void e(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        char c;
        int length;
        char[] cArr2;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr3 = b;
        int i4 = 1770390596;
        Object obj2 = null;
        int i5 = 6;
        if (cArr3 != null) {
            int i6 = $11 + 89;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i7])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b3 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((Process.getThreadPriority(0) + 20) >> i5), 2267 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getEdgeSlop() >> 16) + 33, -1927765101, false, $$g((byte) ($$f & 8), b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i7++;
                    i4 = 1770390596;
                    i5 = 6;
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
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            byte b4 = (byte) 0;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.lastIndexOf("", '0') + 1), 2267 - (KeyEvent.getMaxKeyCode() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + 33, -1927765101, false, $$g((byte) ($$f & 8), b4, b4), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i8 = $10 + 21;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            char c2 = '\t';
            int i10 = $11 + 9;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                    c = c2;
                    obj = obj2;
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = deinitsession;
                    objArr4[11] = Integer.valueOf(cCharValue);
                    objArr4[10] = deinitsession;
                    objArr4[c2] = deinitsession;
                    objArr4[8] = Integer.valueOf(cCharValue);
                    objArr4[7] = deinitsession;
                    objArr4[6] = deinitsession;
                    objArr4[5] = Integer.valueOf(cCharValue);
                    objArr4[4] = deinitsession;
                    objArr4[3] = deinitsession;
                    objArr4[2] = Integer.valueOf(cCharValue);
                    objArr4[1] = deinitsession;
                    objArr4[0] = deinitsession;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 49267), (ViewConfiguration.getWindowTouchSlop() >> 8) + 3261, Color.alpha(0) + 30, -127612708, false, $$g((byte) 7, b5, b5), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b6 = (byte) 5;
                            byte b7 = (byte) (b6 - 5);
                            c = '\t';
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (22878 - ExpandableListView.getPackedPositionType(0L)), 594 - TextUtils.getOffsetBefore("", 0), TextUtils.getOffsetAfter("", 0) + 17, 1570859318, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            c = '\t';
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        int i12 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i12];
                        int i13 = $11 + 35;
                        $10 = i13 % 128;
                        int i14 = i13 % 2;
                    } else {
                        obj = null;
                        c = '\t';
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i15 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i16 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i15];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i16];
                        } else {
                            int i17 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i18 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i17];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i18];
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                obj2 = obj;
                c2 = c;
            }
        }
        int i19 = $10 + 67;
        $11 = i19 % 128;
        int i20 = i19 % 2;
        int i21 = 0;
        while (i21 < i) {
            int i22 = $11 + 23;
            $10 = i22 % 128;
            if (i22 % 2 != 0) {
                cArr4[i21] = (char) (cArr4[i21] ^ 7565);
                i21 += 127;
            } else {
                cArr4[i21] = (char) (cArr4[i21] ^ 13722);
                i21++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 188471. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static java.lang.Object[] b$7879113(int r48, int r49, java.lang.Object r50, int r51, boolean r52, boolean r53) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 18847
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.koin.core.error.ScopeAlreadyCreatedException.b$7879113(int, int, java.lang.Object, int, boolean, boolean):java.lang.Object[]");
    }

    private static String $$g(int i, short s, int i2) {
        int i3 = 121 - i;
        byte[] bArr = $$c;
        int i4 = s * 3;
        int i5 = 4 - (i2 * 2);
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        int i7 = -1;
        if (bArr == null) {
            i3 = (-i3) + i5;
            i5++;
            i7 = -1;
        }
        while (true) {
            int i8 = i7 + 1;
            bArr2[i8] = (byte) i3;
            if (i8 == i6) {
                return new String(bArr2, 0);
            }
            i3 = (-bArr[i5]) + i3;
            i5++;
            i7 = i8;
        }
    }
}
