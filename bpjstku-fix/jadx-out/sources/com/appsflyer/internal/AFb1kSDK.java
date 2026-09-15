package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.ContextWrapper;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFb1kSDK extends AFb1tSDK<String> {
    private static short[] b;
    private static final byte[] $$c = {88, ByteCompanionObject.MAX_VALUE, -112, -47};
    private static final int $$f = 209;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {Base64.padSymbol, -108, 49, -100, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -54, -3, -3, 72, -56, -2, -3, 18, -10, 7, 16, -8, 65, -60, 4, 4, 5, -8, 24, -1, -9, 5, 3, 1, 4, 67, -73, 3, 27, -13, -30, 15, -8, 14, -3, 4, 33, -14, -21, 15, 11, -6, -3, 49, -41, 20, -3, -3, 11, -6, -3, 4, 6, 14, 5, -3, 11, -8, 6, -2, 5, 6, -2, 12, 4, -15, 16, 7, -15, 45, -31, 14, 2, -4, 11, 2, 2, 8, -17, 12, -5, 69};
    private static final int $$h = 245;
    private static final byte[] $$a = {88, ByteCompanionObject.MAX_VALUE, -112, -47, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
    private static final int $$b = 189;
    private static int g = 0;
    private static int asInterface = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1712947032;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -1934795582;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1806715390;
    private static byte[] TuitionPaymentFragmentbindingInflater1 = {20, -18, 18, -27, -49, 48, -18, 23, -25, 28, -64, -61, 93, -30, -89, 44, 29, 28, 27, -24, 16, -21, 13, 30, -30, 19, -18, -19, 26, -11, 8, 25, 20, -27, -23, 19, -31, 16, -27, 26, 21, -20, -14, Base64.padSymbol, -29, -19, 21, -21, 19, -9, -60, -11, 88, -26, -23, -43, 44, 29, 28, 27, -24, 16, -21, 8, 25, -32, 19, -11, 24, 28, 27, 26, -26, -55, 43, -32, -17, 21, -26, 27, -12, 10, -18, 23, -25, 28, -64, -61, 33, 31, -21, 19, -40, 43, 13, -13, 17, 10, -25, 19, -54, Base64.padSymbol, 19, -12, -1, 41, -29, -19, 19, -32, -17, -25, 29, -6, -42, 42, -30, -26, -56, 26, 25, 49, -42, 28, -30, 53, -49, -18, 41, -54, -28, 40, 25, -56, -30, 25, 41, -29, -49, -31, -26, 30, -31, 55, -50, -26, -29, 54, -41, -28, 41, -51, 52, -27, -51, -26, -28, 54, -55, -29, 28, -28, 50, 26, -26, -42, 41, -26, -53, -27, 54, -30, -25, -26, 29, -25, -43, -6, -42, -32, 41, -53, -28, 42, -27, -41, 25, 25, 52, -49, -26, 48, -52, -32, -26, 25, 27, -25, 54, -25, -43, -26, 55, 26, -41, -27, 26, 53, -49, -25, 25, -26, -32, 28, 49, -56, 52, -54, 54, -55, -28, -28, 27, -27, -25, 24, 40, -46, 43, -27, -44, 44, -25, -56, 51, -53, -29, 28, 52, -27, 24};

    private static void c(byte b2, int i, int i2, Object[] objArr) {
        int i3 = i * 52;
        int i4 = (i2 * 14) + 84;
        int i5 = 56 - (b2 * 52);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[53 - i3];
        int i6 = 52 - i3;
        int i7 = -1;
        if (bArr == null) {
            i5++;
            i4 = (i6 + i4) - 11;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i4;
            if (i7 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                byte b3 = bArr[i5];
                i5++;
                i4 = (i4 + b3) - 11;
            }
        }
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
    private static void e(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 4
            int r0 = r6 + 49
            int r8 = r8 * 48
            int r8 = r8 + 4
            int r7 = r7 * 15
            int r7 = r7 + 84
            byte[] r1 = com.appsflyer.internal.AFb1kSDK.$$g
            byte[] r0 = new byte[r0]
            int r6 = r6 + 48
            r2 = 0
            if (r1 != 0) goto L19
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2f
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2f:
            int r8 = -r8
            int r3 = r3 + 1
            int r7 = r7 + r8
            int r7 = r7 + 3
            r8 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1kSDK.e(int, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0287 A[PHI: r0
  0x0287: PHI (r0v9 int) = (r0v8 int), (r0v34 int) binds: [B:58:0x0285, B:55:0x0274] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0289 A[PHI: r0
  0x0289: PHI (r0v31 int) = (r0v8 int), (r0v34 int) binds: [B:58:0x0285, B:55:0x0274] A[DONT_GENERATE, DONT_INLINE]] */
    private static void d(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4;
        int i5;
        int i6;
        byte b3;
        long j;
        int i7 = 2;
        int i8 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b4 = (byte) 0;
                byte b5 = b4;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), View.combineMeasuredStates(0, 0) + 2267, 33 - View.resolveSizeAndState(0, 0, 0), 1387473586, false, $$i(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                z = true;
            } else {
                int i9 = $10 + 45;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                z = false;
            }
            long j2 = 0;
            if (z) {
                byte[] bArr = TuitionPaymentFragmentbindingInflater1;
                char c = '0';
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i11 = 0;
                    while (i11 < length) {
                        int i12 = $11 + 9;
                        $10 = i12 % 128;
                        if (i12 % i7 != 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i11])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                int iIndexOf = 3357 - TextUtils.indexOf("", c, 0);
                                int i13 = 19 - (ViewConfiguration.getZoomControlsTimeout() > j2 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j2 ? 0 : -1));
                                byte b6 = (byte) 0;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(keyRepeatDelay, iIndexOf, i13, -1054011043, false, $$i(b6, b6, (byte) $$c.length), new Class[]{Integer.TYPE});
                            }
                            bArr2[i11] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                            i11 /= 0;
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr[i11])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b7 = (byte) 0;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 3358 - View.combineMeasuredStates(0, 0), 17 - ((byte) KeyEvent.getModifierMetaStateMask()), -1054011043, false, $$i(b7, b7, (byte) $$c.length), new Class[]{Integer.TYPE});
                            }
                            bArr2[i11] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).byteValue();
                            i11++;
                        }
                        i7 = 2;
                        j2 = 0;
                        c = '0';
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i14 = $11 + 125;
                    $10 = i14 % 128;
                    if (i14 % 2 != 0) {
                        byte[] bArr3 = TuitionPaymentFragmentbindingInflater1;
                        Object[] objArr5 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = b8;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) View.combineMeasuredStates(0, 0), View.getDefaultSize(0, 0) + 2267, TextUtils.getCapsMode("", 0, 0) + 33, 1387473586, false, $$i(b8, b9, b9), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        b3 = (byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()]) % 3046761265686732006L);
                        j = ((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) / 3046761265686732006L;
                    } else {
                        byte[] bArr4 = TuitionPaymentFragmentbindingInflater1;
                        Object[] objArr6 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            byte b10 = (byte) 0;
                            byte b11 = b10;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2268, 'Q' - AndroidCharacter.getMirror('0'), 1387473586, false, $$i(b10, b11, b11), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        b3 = (byte) (((long) bArr4[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()]) ^ 3046761265686732006L);
                        j = ((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L;
                    }
                    iIntValue = (byte) (b3 + ((int) j));
                    i4 = 2;
                } else {
                    iIntValue = (short) (((short) (((long) b[i3 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L)));
                    int i15 = $11 + 21;
                    $10 = i15 % 128;
                    i4 = 2;
                    int i16 = i15 % 2;
                }
            } else {
                i4 = 2;
            }
            if (iIntValue > 0) {
                int i17 = $10 + 111;
                $11 = i17 % 128;
                if (i17 % i4 == 0) {
                    i5 = ((i3 >> iIntValue) << i4) >> ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) + 3046761265686732006L));
                    if (z) {
                        i6 = 1;
                    } else {
                        i6 = 0;
                    }
                } else {
                    i5 = ((i3 + iIntValue) - i4) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L));
                    if (z) {
                        i6 = 1;
                    } else {
                        i6 = 0;
                    }
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i5 + i6;
                Object[] objArr7 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (55904 - TextUtils.getOffsetAfter("", 0)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2854, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 13, -1529949196, false, $$i(b12, b13, (byte) (b13 + 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr5 = TuitionPaymentFragmentbindingInflater1;
                if (bArr5 != null) {
                    int length2 = bArr5.length;
                    byte[] bArr6 = new byte[length2];
                    for (int i18 = 0; i18 < length2; i18++) {
                        int i19 = $11 + 121;
                        $10 = i19 % 128;
                        int i20 = i19 % 2;
                        bArr6[i18] = (byte) (((long) bArr5[i18]) ^ 3046761265686732006L);
                    }
                    bArr5 = bArr6;
                }
                boolean z2 = bArr5 != null;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    if (!(!z2)) {
                        byte[] bArr7 = TuitionPaymentFragmentbindingInflater1;
                        int i21 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i21 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr7[i21]) ^ 3046761265686732006L)) + s)) ^ b2));
                    } else {
                        short[] sArr = b;
                        int i22 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i22 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i22]) ^ 3046761265686732006L)) + s)) ^ b2));
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

    @Override // com.appsflyer.internal.AFb1tSDK
    public final /* synthetic */ String getCurrencyIso4217Code() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = asInterface + 3;
        g = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char defaultSize = (char) (37567 - View.getDefaultSize(0, 0));
            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 625;
            int trimmedLength = 14 - TextUtils.getTrimmedLength("");
            byte b2 = (byte) (-$$a[5]);
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            c(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(defaultSize, iResolveSizeAndState, trimmedLength, -477065106, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        d((ViewConfiguration.getTapTimeout() >> 16) + 417524553, (-37) - (ViewConfiguration.getWindowTouchSlop() >> 8), (short) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (byte) (ViewConfiguration.getJumpTapTimeout() >> 16), 357293122 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        d(((byte) KeyEvent.getModifierMetaStateMask()) + 417524558, MotionEvent.axisFromString("") - 36, (short) (ViewConfiguration.getScrollBarSize() >> 8), (byte) View.MeasureSpec.getSize(0), TextUtils.indexOf((CharSequence) "", '0') + 357293145, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 37567);
            int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 626;
            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 14;
            byte[] bArr = $$a;
            byte b4 = (byte) (-bArr[5]);
            byte b5 = bArr[7];
            Object[] objArr5 = new Object[1];
            c(b4, b5, b5, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(fadingEdgeLength, iLastIndexOf, packedPositionType, -976899241, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 37567);
                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 625;
                int iIndexOf = TextUtils.indexOf("", "", 0) + 14;
                byte b6 = $$a[7];
                byte b7 = b6;
                Object[] objArr6 = new Object[1];
                c(b6, b7, b7, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(jumpTapTimeout, packedPositionGroup, iIndexOf, -973632554, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i4 = ((int[]) objArr7[2])[0];
            int i5 = ((int[]) objArr7[0])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i4};
            int i6 = ~System.identityHashCode(this);
            int i7 = ((251619060 + ((~((-321110595) | i6)) * (-783))) + (((~(i6 | 1288189365)) | (-535548756)) * 783)) - 747610247;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
            objArr = new Object[]{new int[]{i5}, new int[1], iArr, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            d(417524552 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (-38) - TextUtils.lastIndexOf("", '0'), (short) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), (byte) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getEdgeSlop() >> 16) + 357293159, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            d(417524556 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 37, (short) (KeyEvent.getMaxKeyCode() >> 16), (byte) View.MeasureSpec.getMode(0), 357293185 - Color.green(0), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            d((ViewConfiguration.getKeyRepeatDelay() >> 16) + 417524562, (-37) - (ViewConfiguration.getPressedStateDuration() >> 16), (short) (ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) View.combineMeasuredStates(0, 0), 357293203 - View.resolveSizeAndState(0, 0, 0), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            d((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 417524560, (-38) - MotionEvent.axisFromString(""), (short) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (byte) (ViewConfiguration.getWindowTouchSlop() >> 8), AndroidCharacter.getMirror('0') + 56435, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr12 = new Object[1];
            d(417524506 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (-37) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (short) View.getDefaultSize(0, 0), (byte) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 357293234 - TextUtils.lastIndexOf("", '0', 0, 0), objArr12);
            String str = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            d(((Process.getThreadPriority(0) + 20) >> 6) + 417524555, (-36) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (short) (ViewConfiguration.getPressedStateDuration() >> 16), (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), TextUtils.indexOf((CharSequence) "", '0', 0) + 357293300, objArr13);
            try {
                Object[] objArr14 = {applicationContext, new String[]{str, (String) objArr13[0]}, Integer.valueOf(iIntValue), 17, -747610247};
                byte[] bArr2 = $$g;
                byte b8 = bArr2[45];
                byte b9 = (byte) (b8 - 1);
                byte b10 = b8;
                Object[] objArr15 = new Object[1];
                e(b9, b10, (byte) (b10 - 1), objArr15);
                Class<?> cls4 = Class.forName((String) objArr15[0]);
                byte b11 = bArr2[45];
                byte b12 = b11;
                Object[] objArr16 = new Object[1];
                e(b12, (byte) (b12 - 1), b11, objArr16);
                Object[] objArr17 = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                int i10 = ((int[]) objArr17[0])[0];
                int i11 = ((int[]) objArr17[2])[0];
                if (applicationContext != null) {
                    int i12 = g + 69;
                    asInterface = i12 % 128;
                    int i13 = i12 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cMyPid = (char) ((Process.myPid() >> 22) + 37567);
                        int scrollDefaultDelay = 625 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int iAxisFromString = 13 - MotionEvent.axisFromString("");
                        byte b13 = $$a[7];
                        byte b14 = b13;
                        Object[] objArr18 = new Object[1];
                        c(b13, b14, b14, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMyPid, scrollDefaultDelay, iAxisFromString, -973632554, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr17);
                    try {
                        Object[] objArr19 = new Object[1];
                        d(417524553 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 11 - AndroidCharacter.getMirror('0'), (short) (TextUtils.lastIndexOf("", '0') + 1), (byte) Drawable.resolveOpacity(0, 0), 357293122 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr19);
                        Class<?> cls5 = Class.forName((String) objArr19[0]);
                        Object[] objArr20 = new Object[1];
                        d(Color.alpha(0) + 417524557, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 38, (short) ((-1) - TextUtils.lastIndexOf("", '0')), (byte) (ViewConfiguration.getScrollBarSize() >> 8), MotionEvent.axisFromString("") + 357293145, objArr20);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr20[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char doubleTapTimeout = (char) (37567 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                            int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0) + 626;
                            int iRgb = Color.rgb(0, 0, 0) + 16777230;
                            byte[] bArr3 = $$a;
                            byte b15 = (byte) (-bArr3[5]);
                            byte b16 = bArr3[7];
                            Object[] objArr21 = new Object[1];
                            c(b15, b16, b16, objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(doubleTapTimeout, iLastIndexOf2, iRgb, -976899241, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cResolveOpacity = (char) (37567 - Drawable.resolveOpacity(0, 0));
                            int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 625;
                            int i14 = 14 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            byte b17 = (byte) (-$$a[5]);
                            byte b18 = b17;
                            Object[] objArr22 = new Object[1];
                            c(b17, b18, b18, objArr22);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveOpacity, packedPositionType2, i14, -477065106, false, (String) objArr22[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr17;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i15 = ((int[]) objArr[0])[0];
        int i16 = ((int[]) objArr[2])[0];
        if (i16 == i15) {
            int i17 = ((int[]) objArr[1])[0];
            int i18 = ((int[]) objArr[2])[0];
            int i19 = ((int[]) objArr[0])[0];
            String[] strArr2 = (String[]) objArr[3];
            int[] iArr2 = {i18};
            int[] iArr3 = {i19};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i20 = ~iFreeMemory;
            int i21 = (-728172424) + (((~((-223871242) | i20)) | (~(1297614267 | iFreeMemory))) * 520);
            int i22 = ~((-1297614268) | i20);
            int i23 = ~(iFreeMemory | 526123853);
            int i24 = i17 + i21 + ((i22 | i23) * (-1040)) + ((i23 | (~(i20 | (-526123854))) | 1073743026) * 520);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr[1])[0] = i26 ^ (i26 << 5);
            Object[] objArr23 = {iArr3, new int[1], iArr2, strArr2};
            int i27 = asInterface;
            int i28 = i27 + 9;
            g = i28 % 128;
            int i29 = i28 % 2;
            int i30 = i27 + 27;
            g = i30 % 128;
            int i31 = i30 % 2;
            return AFAdRevenueData();
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr3 = (String[]) objArr[3];
        if (strArr3 != null) {
            for (String str2 : strArr3) {
                arrayList.add(str2);
            }
        }
        throw new RuntimeException(String.valueOf(i16));
    }

    public AFb1kSDK(Context context, Executor executor) {
        super(context, executor, "com.facebook.katana.provider.AttributionIdProvider", "E3F9E1E0CF99D0E56A055BA65E241B3399F7CEA524326B0CDD6EC1327ED0FDC1");
    }

    public final String getRevenue() {
        String str;
        int i = 2 % 2;
        int i2 = asInterface + 11;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            this.getRevenue.execute(this.AFAdRevenueData);
            str = (String) super.getMonetizationNetwork();
            int i3 = 2 / 0;
        } else {
            this.getRevenue.execute(this.AFAdRevenueData);
            str = (String) super.getMonetizationNetwork();
        }
        int i4 = asInterface + 35;
        g = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private String AFAdRevenueData() throws Throwable {
        int i = 2 % 2;
        Cursor cursor = null;
        try {
            ContentResolver contentResolver = this.getCurrencyIso4217Code.getContentResolver();
            StringBuilder sb = new StringBuilder("content://");
            sb.append(this.getMediationNetwork);
            Cursor cursorQuery = contentResolver.query(Uri.parse(sb.toString()), new String[]{"aid"}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("aid"));
                        if (cursorQuery != null) {
                            int i2 = g + 117;
                            asInterface = i2 % 128;
                            if (i2 % 2 == 0) {
                                cursorQuery.close();
                                int i3 = 39 / 0;
                            } else {
                                cursorQuery.close();
                            }
                        }
                        int i4 = asInterface + 57;
                        g = i4 % 128;
                        if (i4 % 2 == 0) {
                            return string;
                        }
                        cursor.hashCode();
                        throw null;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        int i5 = g + 43;
                        asInterface = i5 % 128;
                        if (i5 % 2 == 0) {
                            cursor.close();
                            int i6 = 62 / 0;
                        } else {
                            cursor.close();
                        }
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                int i7 = g + 5;
                asInterface = i7 % 128;
                int i8 = i7 % 2;
                cursorQuery.close();
                int i9 = asInterface + 75;
                g = i9 % 128;
                int i10 = i9 % 2;
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.appsflyer.internal.AFb1tSDK
    public final /* synthetic */ String getMonetizationNetwork() {
        int i = 2 % 2;
        int i2 = asInterface + 21;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            this.getRevenue.execute(this.AFAdRevenueData);
            return (String) super.getMonetizationNetwork();
        }
        this.getRevenue.execute(this.AFAdRevenueData);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r6, byte r7, short r8) {
        /*
            int r7 = r7 * 2
            int r0 = r7 + 1
            byte[] r1 = com.appsflyer.internal.AFb1kSDK.$$c
            int r8 = r8 + 117
            int r6 = r6 * 4
            int r6 = 4 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r6
            goto L28
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            r3 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L28:
            int r6 = r6 + r3
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1kSDK.$$i(int, byte, short):java.lang.String");
    }
}
