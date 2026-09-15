package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
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
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import com.google.android.gms.tasks.zzu;
import com.google.android.libraries.places.api.net.kotlin.zzo;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.abortCapture;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import okhttp3.CertificatePinner;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
public final class zabx extends BroadcastReceiver {
    private static short[] b;
    Context zaa;
    private final zabw zab;
    private static final byte[] $$c = {21, -108, 100, 114};
    private static final int $$f = 40;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {0, -94, -62, -97, -11, 17, 0, -1, -7, 5, 13, -64, -2, 53, 5, -1, 17, 6, -13, 15, -66, 70, 8, -12, -7, 23, -19, -45, -2, 22, 47, -9, 23, -40, 21, 19, -12, 15, 6, -19, 3, 12, -5, 35, -10, 13, -9, 8, 1, -28, 19, 26, -10, -6, 11, 8, -44, 46, -15, 8, 8, -6, 11, 8, -16, 9, 7, -8, 7, 7, -5, -28, 39, -6, 8, -9, 21, -13, 15, -63, 14, 0, -61, 59, 10, 2, -6, 7, -5, -53, 53, 15, -8, 16, -1, -4, -3, -52, 65, -10, 21, -13, 15, -7, -6, 13, -60, 55, 14, -1, 5, 5, -66, 73, 1, -9, 5, -1, 13, -9, -2, 16, -67, 37, 38, -18, 15, 8, -9, 19, -19, 15, -25, 32, -79, 33, 49, -11, -2, 21, -13, -33, 47, 11, -17, 16, -31, 21, 16, 4, -7, 10, 14, 0, -61, 59, 10, 2, -6, 7, -5, -53, 58, 5, 11, -11, -1, 1, 20, -12, -53, 70, -11, 10, 4, 7, -13, 0, 14, 1, -6, 5, 0, -55, 26, 37, 11, -11, -1, 1, 20, -12, -17, 21, 10, 4, 7, -13, -32, 46, 1, -6, 5, 0, -34, 43, -1, -2, 11, 8, -45, 53, -19, 4, 13, 6, -9, 8, 1, 46, 1, 8, -13, 21, -2, -30, 22, -1, 10, -6, -12, 29, -15, 17, 2, -9, 15, 14, 0, -61, 71, -2, -7, -3, 12, 0, 7, -5, 1, 11, 5, -11, 19, -15, 15, -66, 53, 15, -11, 13, 15, -3, -9, -4, 18, -67, 57, 21, -19, 4, 13, 6, -9, 8, 1, 7, -67, 25, 51, -15, 11, 8, -36, 35, 7, -30, 32, -15, 4, 10, -4, 1, -29, 53, -19, 4, 13, 6, -9, 8, 1, 15, -8, 16, -1, -4, -3, -52, 71, 4, -3, 2, 1, 5, 4, -68, 74, -64, -4, 65, -6, 1, 7, -6, -49, 71, -12, 16, 2, -8, 8, 1, -62, 33, 26, 1, 7, -6, -28, 46, 1, 8, 0, -1, -1, 2, -5, 15, -45, 46, 0, 5, -13, 21, -78, 33, 32, 13, 2, -8, 1, 4, 10, 35, -10, 13, -9, 8, 1, -28, 19, 26, -10, -6, 11, 8, -44, 46, -15, 8, 8, -6, 11, 8, 1, -1, -9, 0, 8, -6, 13, -1, 7, 0, -1, 7, -7, 1, 20, -11, -2, 20, -40, 36, -9, 3, 9, -6, 3, 3, -3, 22, -7, 10, -64, 14, 0, -61, 59, 10, 2, -6, 7, -5, -53, 53, 15, -8, 16, -1, -4, -3, -52, 59, 8, 8, -67, 65, -10, 17, 5, -67, 65, 4, -9, 3, 9, -60, 78, 2, -6, 35, -10, 13, -9, 8, 1, -28, 19, 26, -10, -6, 11, 8, -44, 46, -15, 8, 8, -6, 11, 8, 1, -1, -9, 0, 8, -6, 13, -1, 7, 0, -1, 7, -7, 1, 20, -11, -2, 20, -40, 36, -9, 3, 9, -6, 3, 3, -3, 22, -7, 10, -65};
    private static final int $$h = 38;
    private static final byte[] $$d = {87, 51, -85, 78, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -29, 31, -48, -17, 4, -24, 1, -6, -13, -13, -29, 38, -50, -16, -1, -12, -24};
    private static final int $$e = 148;
    private static final byte[] $$a = {68, 104, -93, -37, -3, 5, 4, -6, 73, -73, 6, 5, -10, 2, 6};
    private static final int $$b = 203;
    private static int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f771a = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = 101128210;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1934795549;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 161343759;
    private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {-19, -18, 23, -25, 28, -64, -61, 33, 31, -21, 19, -40, 43, 13, -13, 17, -35, -42, -32, 41, -53, -28, 42, -27, -41, 25, 25, 52, -49, -26, 48, -52, -32, -26, 25, 27, -25, 54, -25, -43, -26, 55, 26, -41, -27, 26, 53, -49, -25, 25, -26, -32, 28, 49, -56, 52, -54, 54, -55, -28, -28, 27, -27, -25, 24, 40, -46, 43, -27, -44, 44, -25, -56, 51, -53, -29, 28, 52, -27, 24, -11, 19, -31, 18, -23, -2, -7, 92, -9, 24, 31, -32, -25, 21, -94, 33, 31, -21, 19, -40, 43, 13, -13, 17, -13, -21, 26, -27, 27, -29, 19, -60, -7, 92, -9, 24, 31, -32, -25, 21, -94, 33, 31, -21, 19, -40, 43, 13, -13, 17, -27, 9, -21, 19, -11, -11, Base64.padSymbol, -20, -22, -24, 19, 17, -61, 4, -21, 23, -23, 30, -22, 9, -9, -9, 58, -23, 24};
    private static long asBinder = -1895153056848512561L;

    public zabx(zabw zabwVar) {
        this.zab = zabwVar;
    }

    private static void f(int i, int i2, int i3, Object[] objArr) {
        int i4 = i2 + 4;
        byte[] bArr = $$d;
        int i5 = 103 - i;
        byte[] bArr2 = new byte[i3 + 1];
        int i6 = -1;
        if (bArr == null) {
            i5 = (i3 + (-i4)) - 11;
            i4 = i4;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i5;
            if (i7 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i8 = i4 + 1;
            i5 = (i5 + (-bArr[i8])) - 11;
            i4 = i8;
            i6 = i7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void g(short r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.google.android.gms.common.api.internal.zabx.$$g
            int r7 = 503 - r7
            int r8 = r8 + 1
            int r9 = r9 + 67
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r9
            r4 = r2
            r9 = r7
            goto L27
        L11:
            r3 = r2
        L12:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L21
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L21:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L27:
            int r3 = r3 + r7
            int r7 = r3 + (-2)
            int r9 = r9 + 1
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zabx.g(short, byte, int, java.lang.Object[]):void");
    }

    private static void h(int i, short s, byte b2, Object[] objArr) {
        int i2 = 4 - (s * 3);
        int i3 = 99 - (i * 4);
        byte[] bArr = $$a;
        int i4 = b2 * 4;
        byte[] bArr2 = new byte[i4 + 12];
        int i5 = i4 + 11;
        int i6 = -1;
        if (bArr == null) {
            i2++;
            i3 = i3 + (-i5) + 2;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i2++;
                i3 = i3 + (-bArr[i2]) + 2;
            }
        }
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(asBinder ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        int i3 = $11 + 49;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (abortcapture.b < cArrB.length) {
            int i5 = $11 + 1;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i7 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(asBinder)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64838 - ExpandableListView.getPackedPositionGroup(0L)), 1356 - (ViewConfiguration.getEdgeSlop() >> 16), TextUtils.indexOf("", "", 0) + 38, 894276454, false, $$i(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 47772), TextUtils.getCapsMode("", 0, 0) + 468, (ViewConfiguration.getWindowTouchSlop() >> 8) + 13, 896083767, false, "n", new Class[]{Object.class, Object.class});
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
    }

    private static void e(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        long j;
        boolean z;
        int length;
        byte[] bArr;
        int i4 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            long j2 = 0;
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b3 = (byte) 0;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2267, 34 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1387473586, false, $$i(b3, (byte) (b3 | 10), b3), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            int i5 = iIntValue == -1 ? 1 : 0;
            if (i5 == 0) {
                j = 3046761265686732006L;
            } else {
                byte[] bArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (bArr2 != null) {
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    int i6 = 0;
                    while (i6 < length2) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i6])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b4 = (byte) 0;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.indexOf("", "", 0, 0), (ExpandableListView.getPackedPositionForChild(0, 0) > j2 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j2 ? 0 : -1)) + 3359, (ViewConfiguration.getFadingEdgeLength() >> 16) + 18, -1054011043, false, $$i(b4, (byte) (b4 | 14), b4), new Class[]{Integer.TYPE});
                            }
                            bArr3[i6] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                            i6++;
                            j2 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    int i7 = $11 + 71;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-1) - MotionEvent.axisFromString("")), ExpandableListView.getPackedPositionChild(0L) + 2268, 32 - ExpandableListView.getPackedPositionChild(0L), 1387473586, false, $$i(b5, (byte) (b5 | 10), b5), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr4[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L)));
                    j = 3046761265686732006L;
                } else {
                    j = 3046761265686732006L;
                    iIntValue = (short) (((short) (((long) b[i3 + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ j)) + i5;
                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 0;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 55904), 2855 - TextUtils.getOffsetBefore("", 0), 13 - Color.blue(0), -1529949196, false, $$i(b6, (byte) (b6 | 11), b6), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (bArr5 != null) {
                    int i9 = $10 + 79;
                    $11 = i9 % 128;
                    if (i9 % 2 == 0) {
                        length = bArr5.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr5.length;
                        bArr = new byte[length];
                    }
                    int i10 = 0;
                    while (i10 < length) {
                        int i11 = $11 + 39;
                        $10 = i11 % 128;
                        if (i11 % 2 != 0) {
                            bArr[i10] = (byte) (((long) bArr5[i10]) & 3046761265686732006L);
                        } else {
                            bArr[i10] = (byte) (((long) bArr5[i10]) ^ 3046761265686732006L);
                            i10++;
                        }
                    }
                    bArr5 = bArr;
                }
                if (bArr5 != null) {
                    int i12 = $10 + 121;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    z = true;
                } else {
                    int i14 = $11 + 21;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                    z = false;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    if (z) {
                        byte[] bArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i16 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i16 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i16]) ^ 3046761265686732006L)) + s)) ^ b2));
                    } else {
                        short[] sArr = b;
                        int i17 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i17 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i17]) ^ 3046761265686732006L)) + s)) ^ b2));
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

    /* JADX WARN: Code duplicated, block: B:19:0x018e  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws Throwable {
        Context applicationContext;
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        int i;
        Object[] objArr4;
        int i2;
        String str;
        Object[] objArr5;
        Object[] objArr6;
        String str2;
        char c;
        Object[] objArr7;
        int i3;
        Object[] objArr8;
        String str3;
        Object[] objArr9;
        int i4;
        Object[] objArr10;
        Object[] objArr11;
        Object[] objArr12;
        int i5;
        Object[] objArr13;
        Context applicationContext2 = context;
        int i6 = 2 % 2;
        Object[] objArr14 = new Object[1];
        c(new char[]{4898, 4931, 2666, 39341, 39600, 48518, 12955, 34834, 24041, 31625, 51220, 33187, 36357, 43311, 31026, 53250, 63671, 58955, 44748, 11920, 10719, 22487, 56328, 32246, 39541, 34075}, (ViewConfiguration.getEdgeSlop() >> 16) + 1, objArr14);
        String str4 = (String) objArr14[0];
        Object[] objArr15 = new Object[1];
        c(new char[]{10621, 10520, 24704, 62277, 12641, 5714, 38256, 12283, 26538, 4461, 25536, 9782, 46160, 50133, 53924, 30668, 49912, 36029, 1289}, -MotionEvent.axisFromString(""), objArr15);
        String str5 = (String) objArr15[0];
        Object[] objArr16 = new Object[1];
        e(2060405377 - (ViewConfiguration.getEdgeSlop() >> 16), (-6) - Color.red(0), (short) Color.alpha(0), (byte) (ViewConfiguration.getDoubleTapTimeout() >> 16), View.combineMeasuredStates(0, 0) + 1968552716, objArr16);
        String str6 = (String) objArr16[0];
        Object[] objArr17 = new Object[1];
        c(new char[]{39601, 39640, 31217, 59964, 51890, 60805, 19679, 63050, 54369, 2072, 38919, 65452, 1969, 55980, 10604, 44641, 28958, 38342, 65247, 20680}, ExpandableListView.getPackedPositionType(0L) + 1, objArr17);
        String str7 = (String) objArr17[0];
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char defaultSize = (char) View.getDefaultSize(0, 0);
            int scrollDefaultDelay = 2267 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            int scrollDefaultDelay2 = 33 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            byte[] bArr = $$d;
            byte b2 = bArr[10];
            short s = bArr[80];
            Object[] objArr18 = new Object[1];
            f(b2, s, (byte) (s & 52), objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(defaultSize, scrollDefaultDelay, scrollDefaultDelay2, -887667012, false, (String) objArr18[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                int iMyPid = (Process.myPid() >> 22) + 2267;
                int iKeyCodeFromString = 33 - KeyEvent.keyCodeFromString("");
                byte[] bArr2 = $$d;
                Object[] objArr19 = new Object[1];
                f(bArr2[10], bArr2[1], (byte) ($$e >>> 2), objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(deadChar, iMyPid, iKeyCodeFromString, -654680577, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i7 = ((int[]) objArr20[0])[0];
            int i8 = ((int[]) objArr20[3])[0];
            String[] strArr = (String[]) objArr20[1];
            int i9 = (~System.identityHashCode(this)) | 58967590;
            int i10 = 950542006 + (i9 * 495) + (((~i9) | 8390180) * 495) + 1106435189;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[2])[0] = i12 ^ (i12 << 5);
        } else {
            if (applicationContext2 == null) {
                applicationContext = applicationContext2;
            } else if (applicationContext2 instanceof ContextWrapper) {
                int i13 = d + 113;
                f771a = i13 % 128;
                int i14 = i13 % 2;
                if (((ContextWrapper) applicationContext2).getBaseContext() != null) {
                    applicationContext = context.getApplicationContext();
                } else {
                    applicationContext = null;
                }
            } else {
                applicationContext = context.getApplicationContext();
            }
            try {
                Object[] objArr21 = {applicationContext, Integer.valueOf(((Integer) Class.forName(str6).getMethod(str7, Object.class).invoke(null, this)).intValue()), 0, 1106435189};
                byte[] bArr3 = $$g;
                Object[] objArr22 = new Object[1];
                g((short) 499, bArr3[72], bArr3[30], objArr22);
                Class<?> cls = Class.forName((String) objArr22[0]);
                Object[] objArr23 = new Object[1];
                g((short) 460, bArr3[123], bArr3[5], objArr23);
                Object[] objArr24 = (Object[]) cls.getMethod((String) objArr23[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr21);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                        int scrollDefaultDelay3 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2267;
                        int trimmedLength = TextUtils.getTrimmedLength("") + 33;
                        byte[] bArr4 = $$d;
                        Object[] objArr25 = new Object[1];
                        f(bArr4[10], bArr4[1], (byte) ($$e >>> 2), objArr25);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMakeMeasureSpec, scrollDefaultDelay3, trimmedLength, -654680577, false, (String) objArr25[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArr24);
                    try {
                        long jLongValue = ((Long) Class.forName(str4).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char c2 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                            int i15 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2267;
                            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 33;
                            byte[] bArr5 = $$d;
                            Object[] objArr26 = new Object[1];
                            f(bArr5[10], (short) (bArr5[0] + 1), (byte) (bArr5[1] + 1), objArr26);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, i15, scrollBarSize, -874156483, false, (String) objArr26[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char deadChar2 = (char) KeyEvent.getDeadChar(0, 0);
                            int trimmedLength2 = TextUtils.getTrimmedLength("") + 2267;
                            int iBlue = Color.blue(0) + 33;
                            byte[] bArr6 = $$d;
                            byte b3 = bArr6[10];
                            short s2 = bArr6[80];
                            Object[] objArr27 = new Object[1];
                            f(b3, s2, (byte) (s2 & 52), objArr27);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(deadChar2, trimmedLength2, iBlue, -887667012, false, (String) objArr27[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                } else {
                    objArr24 = objArr24;
                }
                objArr = objArr24;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (((int[]) objArr[0])[0] != ((int[]) objArr[3])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[1];
            if (strArr2 != null) {
                for (String str8 : strArr2) {
                    arrayList.add(str8);
                }
            }
            throw null;
        }
        Object[] objArr28 = {new int[]{i}, strArr, new int[1], new int[]{i}};
        int i16 = ((int[]) objArr[2])[0];
        int i17 = ((int[]) objArr[0])[0];
        int i18 = ((int[]) objArr[3])[0];
        String[] strArr3 = (String[]) objArr[1];
        int i19 = ~(new Random().nextInt(1232712072) | 314555682);
        int i20 = i16 + (((42696738 | i19) * (-196)) - 1157406101) + ((i19 | 271858944) * 196);
        int i21 = (i20 << 13) ^ i20;
        int i22 = i21 ^ (i21 >>> 17);
        ((int[]) objArr28[2])[0] = i22 ^ (i22 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char mirror = (char) (31581 - AndroidCharacter.getMirror('0'));
            int iIndexOf = 921 - TextUtils.indexOf("", "");
            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 28;
            byte[] bArr7 = $$d;
            Object[] objArr29 = new Object[1];
            f((byte) (bArr7[19] - 1), (short) 140, bArr7[7], objArr29);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mirror, iIndexOf, threadPriority, -1048449946, false, (String) objArr29[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char c3 = (char) (31533 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                int scrollBarSize2 = 921 - (ViewConfiguration.getScrollBarSize() >> 8);
                int iAlpha = 28 - Color.alpha(0);
                byte[] bArr8 = $$d;
                Object[] objArr30 = new Object[1];
                f(bArr8[10], bArr8[1], (byte) ($$e >>> 2), objArr30);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c3, scrollBarSize2, iAlpha, -1142834547, false, (String) objArr30[0], null);
            }
            Object[] objArr31 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).get(null);
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr31[1])[0]}, (Object[]) objArr31[2], new int[]{((int[]) objArr31[3])[0]}, (String[]) objArr31[4]};
            int iMyUid = Process.myUid();
            int i23 = 1969826243 + ((~(iMyUid | 569347213)) * 216);
            int i24 = ~iMyUid;
            int i25 = i23 + (((-1174422019) | i24) * (-216)) + (((~(i24 | 569347213)) | 1204732430) * 216) + 1815087465;
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr2[0])[0] = i27 ^ (i27 << 5);
            objArr28 = objArr28;
        } else {
            Object[] objArr32 = {applicationContext2 != null ? ((applicationContext2 instanceof ContextWrapper) && ((ContextWrapper) applicationContext2).getBaseContext() == null) ? null : context.getApplicationContext() : applicationContext2, Integer.valueOf(((Integer) Class.forName(str6).getMethod(str7, Object.class).invoke(null, this)).intValue()), 0, 1815087465};
            short s3 = (short) ($$h | 385);
            byte[] bArr9 = $$g;
            Object[] objArr33 = new Object[1];
            g(s3, (byte) (bArr9[113] - 1), bArr9[133], objArr33);
            Class<?> cls2 = Class.forName((String) objArr33[0]);
            Object[] objArr34 = new Object[1];
            g((short) 351, bArr9[0], (byte) (-bArr9[146]), objArr34);
            Object[] objArr35 = (Object[]) cls2.getMethod((String) objArr34[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr32);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char cResolveSize = (char) (View.resolveSize(0, 0) + 31533);
                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0) + 922;
                int fadingEdgeLength = 28 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                byte[] bArr10 = $$d;
                Object[] objArr36 = new Object[1];
                f(bArr10[10], bArr10[1], (byte) ($$e >>> 2), objArr36);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cResolveSize, iIndexOf2, fadingEdgeLength, -1142834547, false, (String) objArr36[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, objArr35);
            try {
                long jLongValue2 = ((Long) Class.forName(str4).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue2);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                    char mode = (char) (View.MeasureSpec.getMode(0) + 31533);
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 922;
                    int i28 = 28 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    byte[] bArr11 = $$d;
                    byte b4 = bArr11[10];
                    short s4 = bArr11[80];
                    Object[] objArr37 = new Object[1];
                    f(b4, s4, (byte) (s4 & 52), objArr37);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(mode, iLastIndexOf, i28, -778300370, false, (String) objArr37[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue2 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                    char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 31534);
                    int gidForName = Process.getGidForName("") + 922;
                    int iLastIndexOf2 = 27 - TextUtils.lastIndexOf("", '0');
                    byte[] bArr12 = $$d;
                    Object[] objArr38 = new Object[1];
                    f((byte) (bArr12[19] - 1), (short) 140, bArr12[7], objArr38);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(modifierMetaStateMask, gidForName, iLastIndexOf2, -1048449946, false, (String) objArr38[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, lValueOf4);
                objArr2 = objArr35;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i29 = ((int[]) objArr2[1])[0];
        int i30 = ((int[]) objArr2[3])[0];
        if (i30 == i29) {
            int i31 = ((int[]) objArr2[0])[0];
            objArr3 = new Object[]{new int[1], new int[]{((int[]) objArr2[1])[0]}, (Object[]) objArr2[2], new int[]{((int[]) objArr2[3])[0]}, (String[]) objArr2[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i32 = i31 + (((~((-416513732) | iIdentityHashCode)) | 135344131) * (-566)) + 1069446461 + ((~(iIdentityHashCode | (-281169601))) * 566);
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            i = 0;
            ((int[]) objArr3[0])[0] = i34 ^ (i34 << 5);
        } else {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr4 = (String[]) objArr2[4];
            if (strArr4 != null) {
                for (String str9 : strArr4) {
                    arrayList2.add(str9);
                }
            }
            Toast.makeText((Context) null, i30 / (((i30 - 1) * i30) % 2), 0).show();
            int i35 = ((int[]) objArr2[0])[0];
            objArr3 = new Object[]{new int[1], new int[]{((int[]) objArr2[1])[0]}, (Object[]) objArr2[2], new int[]{((int[]) objArr2[3])[0]}, (String[]) objArr2[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i36 = ~iIdentityHashCode2;
            int i37 = i35 + (-1234692683) + (((~((-278912014) | i36)) | (~(iIdentityHashCode2 | 1495167630))) * 333) + (((~(iIdentityHashCode2 | (-278912014))) | (~(i36 | 1495167630))) * 333);
            int i38 = (i37 << 13) ^ i37;
            int i39 = i38 ^ (i38 >>> 17);
            i = 0;
            ((int[]) objArr3[0])[0] = i39 ^ (i39 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
            char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 29944);
            int iLastIndexOf3 = 1754 - TextUtils.lastIndexOf("", '0', i);
            int iIndexOf3 = 23 - TextUtils.indexOf("", "", i);
            byte[] bArr13 = $$d;
            Object[] objArr39 = new Object[1];
            f(bArr13[10], bArr13[1], (byte) ($$e >>> 2), objArr39);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(maxKeyCode, iLastIndexOf3, iIndexOf3, 986134021, false, (String) objArr39[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char deadChar3 = (char) (29944 - KeyEvent.getDeadChar(0, 0));
                int mode2 = View.MeasureSpec.getMode(0) + 1755;
                int iArgb = 23 - Color.argb(0, 0, 0, 0);
                byte[] bArr14 = $$d;
                byte b5 = bArr14[10];
                short s5 = bArr14[80];
                Object[] objArr40 = new Object[1];
                f(b5, s5, (byte) (s5 & 52), objArr40);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(deadChar3, mode2, iArgb, 1599039318, false, (String) objArr40[0], null);
            }
            Object[] objArr41 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).get(null);
            objArr4 = new Object[]{new int[]{((int[]) objArr41[0])[0]}, new int[]{((int[]) objArr41[1])[0]}, (Object[]) objArr41[2], new int[1], (String[]) objArr41[4]};
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i40 = ~iIdentityHashCode3;
            int i41 = 1353485922 + (((-1310793) | i40) * (-369)) + (((~((-787148691) | i40)) | (-574546265)) * (-369)) + (((~(iIdentityHashCode3 | 787148690)) | (-788459483) | (~(i40 | (-573235473)))) * 369) + 108073904;
            int i42 = (i41 << 13) ^ i41;
            int i43 = i42 ^ (i42 >>> 17);
            ((int[]) objArr4[3])[0] = i43 ^ (i43 << 5);
            i2 = 1;
            objArr3 = objArr3;
        } else {
            int iIntValue = ((Integer) Class.forName(str6).getMethod(str7, Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr42 = {815494145};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b((char) (ImageFormat.getBitsPerPixel(0) + 42050), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1726, 28 - TextUtils.lastIndexOf("", '0'), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113 = zzu.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).newInstance(objArr42), 108073904, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 29944);
                    int i44 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1755;
                    int iIndexOf4 = 23 - TextUtils.indexOf("", "");
                    byte[] bArr15 = $$d;
                    byte b6 = bArr15[10];
                    short s6 = bArr15[80];
                    Object[] objArr43 = new Object[1];
                    f(b6, s6, (byte) (s6 & 52), objArr43);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cKeyCodeFromString, i44, iIndexOf4, 1599039318, false, (String) objArr43[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                try {
                    long jLongValue3 = ((Long) Class.forName(str4).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf5 = Long.valueOf(jLongValue3);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                        char modifierMetaStateMask2 = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 29945);
                        int offsetBefore = 1755 - TextUtils.getOffsetBefore("", 0);
                        int i45 = 24 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        byte[] bArr16 = $$d;
                        Object[] objArr44 = new Object[1];
                        f(bArr16[10], (short) 140, (byte) (bArr16[1] + 1), objArr44);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(modifierMetaStateMask2, offsetBefore, i45, 1596667560, false, (String) objArr44[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf5);
                    Long lValueOf6 = Long.valueOf(jLongValue3 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf("", "") + 29944);
                        int offsetBefore2 = 1755 - TextUtils.getOffsetBefore("", 0);
                        int iIndexOf5 = TextUtils.indexOf((CharSequence) "", '0') + 24;
                        byte[] bArr17 = $$d;
                        Object[] objArr45 = new Object[1];
                        f(bArr17[10], bArr17[1], (byte) ($$e >>> 2), objArr45);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(cIndexOf, offsetBefore2, iIndexOf5, 986134021, false, (String) objArr45[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).set(null, lValueOf6);
                    objArr4 = objArrTuitionPaymentFragmentbindingInflater1$7879113;
                    i2 = 1;
                } catch (Exception unused3) {
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
        int i46 = ((int[]) objArr4[i2])[0];
        int i47 = ((int[]) objArr4[0])[0];
        if (i47 != i46) {
            ArrayList arrayList3 = new ArrayList();
            String[] strArr5 = (String[]) objArr4[4];
            if (strArr5 != null) {
                int i48 = f771a + 5;
                d = i48 % 128;
                int i49 = i48 % 2;
                for (String str10 : strArr5) {
                    arrayList3.add(str10);
                }
            }
            throw new RuntimeException(String.valueOf(i47));
        }
        Object[] objArr46 = new Object[5];
        int[] iArr = new int[i2];
        objArr46[0] = iArr;
        int[] iArr2 = new int[i2];
        objArr46[i2] = iArr2;
        objArr46[3] = new int[i2];
        int i50 = ((int[]) objArr4[3])[0];
        int i51 = ((int[]) objArr4[0])[0];
        int i52 = ((int[]) objArr4[i2])[0];
        String[] strArr6 = (String[]) objArr4[4];
        Object[] objArr47 = (Object[]) objArr4[2];
        iArr[0] = i51;
        iArr2[0] = i52;
        objArr46[4] = strArr6;
        objArr46[2] = objArr47;
        int iIdentityHashCode4 = System.identityHashCode(this);
        int i53 = i50 + 816334137 + (((~(1028983 | iIdentityHashCode4)) | 213631409) * (-366)) + (((~(iIdentityHashCode4 | 213906423)) | 753969) * 366);
        int i54 = (i53 << 13) ^ i53;
        int i55 = i54 ^ (i54 >>> 17);
        ((int[]) objArr46[3])[0] = i55 ^ (i55 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
            char cMyPid = (char) (Process.myPid() >> 22);
            int iBlue2 = 876 - Color.blue(0);
            int iLastIndexOf4 = TextUtils.lastIndexOf("", '0') + 11;
            byte[] bArr18 = $$d;
            Object[] objArr48 = new Object[1];
            f(bArr18[10], bArr18[1], (byte) ($$e >>> 2), objArr48);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(cMyPid, iBlue2, iLastIndexOf4, -1650998592, false, (String) objArr48[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).getLong(null);
        long jLongValue4 = ((Long) Class.forName(str4).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
            char cMyPid2 = (char) (Process.myPid() >> 22);
            int mode3 = View.MeasureSpec.getMode(0) + 876;
            int offsetBefore3 = 10 - TextUtils.getOffsetBefore("", 0);
            byte[] bArr19 = $$d;
            byte b7 = bArr19[10];
            short s7 = bArr19[80];
            Object[] objArr49 = new Object[1];
            f(b7, s7, (byte) (s7 & 52), objArr49);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(cMyPid2, mode3, offsetBefore3, 2012020043, false, (String) objArr49[0], null);
        }
        if (j == ((jLongValue4 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                char c4 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int iRgb = (-16776340) - Color.rgb(0, 0, 0);
                int i56 = 10 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                byte[] bArr20 = $$d;
                Object[] objArr50 = new Object[1];
                f(bArr20[10], (short) (bArr20[0] + 1), (byte) (bArr20[1] + 1), objArr50);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(c4, iRgb, i56, 2012931276, false, (String) objArr50[0], null);
            }
            Object[] objArr51 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).get(null);
            objArr5 = new Object[]{new int[]{((int[]) objArr51[0])[0]}, new int[1], new int[]{((int[]) objArr51[2])[0]}, (String[]) objArr51[3]};
            int iMyTid = Process.myTid();
            int i57 = ~iMyTid;
            int i58 = 2070192700 + (((~(350854164 | i57)) | (~((-391164394) | iMyTid))) * (-370)) + (((~(iMyTid | 350854164)) | (~(i57 | (-391164394))) | 11078676) * (-370)) + 1891969969;
            int i59 = (i58 << 13) ^ i58;
            int i60 = i59 ^ (i59 >>> 17);
            ((int[]) objArr5[1])[0] = i60 ^ (i60 << 5);
            str = "";
        } else {
            Context applicationContext3 = applicationContext2 != null ? ((applicationContext2 instanceof ContextWrapper) && ((ContextWrapper) applicationContext2).getBaseContext() == null) ? null : context.getApplicationContext() : applicationContext2;
            Object[] objArr52 = {applicationContext3, Integer.valueOf(((Integer) Class.forName(str6).getMethod(str7, Object.class).invoke(null, this)).intValue()), 0, 2087827145};
            byte[] bArr21 = $$g;
            Object[] objArr53 = new Object[1];
            g((short) 351, (byte) (-bArr21[122]), bArr21[133], objArr53);
            Class<?> cls3 = Class.forName((String) objArr53[0]);
            Object[] objArr54 = new Object[1];
            g((short) 460, bArr21[123], bArr21[5], objArr54);
            Object[] objArr55 = (Object[]) cls3.getMethod((String) objArr54[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr52);
            if (applicationContext3 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                    char c5 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int iMyPid2 = (Process.myPid() >> 22) + 876;
                    int i61 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 10;
                    byte[] bArr22 = $$d;
                    Object[] objArr56 = new Object[1];
                    f(bArr22[10], (short) (bArr22[0] + 1), (byte) (bArr22[1] + 1), objArr56);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(c5, iMyPid2, i61, 2012931276, false, (String) objArr56[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).set(null, objArr55);
                try {
                    long jLongValue5 = ((Long) Class.forName(str4).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf7 = Long.valueOf(jLongValue5);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                        str = r7;
                        char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf(str, '0', 0));
                        int i62 = 877 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        int iIndexOf6 = TextUtils.indexOf((CharSequence) str, '0', 0, 0) + 11;
                        byte[] bArr23 = $$d;
                        byte b8 = bArr23[10];
                        short s8 = bArr23[80];
                        Object[] objArr57 = new Object[1];
                        f(b8, s8, (byte) (s8 & 52), objArr57);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(cLastIndexOf, i62, iIndexOf6, 2012020043, false, (String) objArr57[0], null);
                    } else {
                        str = r7;
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).set(null, lValueOf7);
                    Long lValueOf8 = Long.valueOf(jLongValue5 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                        char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int i63 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 875;
                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 10;
                        byte[] bArr24 = $$d;
                        Object[] objArr58 = new Object[1];
                        f(bArr24[10], bArr24[1], (byte) ($$e >>> 2), objArr58);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(maximumFlingVelocity, i63, absoluteGravity, -1650998592, false, (String) objArr58[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).set(null, lValueOf8);
                } catch (Exception unused4) {
                    throw new RuntimeException();
                }
            } else {
                objArr55 = objArr55;
                str = r7;
            }
            objArr5 = objArr55;
        }
        if (((int[]) objArr5[0])[0] != ((int[]) objArr5[2])[0]) {
            throw null;
        }
        int i64 = ((int[]) objArr5[1])[0];
        Object[] objArr59 = {new int[]{((int[]) objArr5[0])[0]}, new int[1], new int[]{((int[]) objArr5[2])[0]}, (String[]) objArr5[3]};
        int iIdentityHashCode5 = System.identityHashCode(this);
        int i65 = i64 + ((((~(550985790 | iIdentityHashCode5)) | (-65607214)) * 262) - 931531018) + (((~((~iIdentityHashCode5) | 550985790)) | (-65607214)) * 262);
        int i66 = (i65 << 13) ^ i65;
        int i67 = i66 ^ (i66 >>> 17);
        ((int[]) objArr59[1])[0] = i67 ^ (i67 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
            char scrollBarSize3 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
            int iMyPid3 = (Process.myPid() >> 22) + 876;
            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10;
            byte[] bArr25 = $$d;
            Object[] objArr60 = new Object[1];
            f((byte) (bArr25[19] - 1), (short) 140, bArr25[7], objArr60);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(scrollBarSize3, iMyPid3, minimumFlingVelocity, 252381699, false, (String) objArr60[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).getLong(null);
        long jLongValue6 = ((Long) Class.forName(str4).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
            char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            int iCombineMeasuredStates = 876 - View.combineMeasuredStates(0, 0);
            int i68 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 9;
            byte[] bArr26 = $$d;
            Object[] objArr61 = new Object[1];
            f(bArr26[10], (short) 140, (byte) (bArr26[1] + 1), objArr61);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(maximumDrawingCacheSize, iCombineMeasuredStates, i68, 2009631821, false, (String) objArr61[0], null);
        }
        if (j2 == ((jLongValue6 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                char cArgb = (char) Color.argb(0, 0, 0, 0);
                int packedPositionChild = 875 - ExpandableListView.getPackedPositionChild(0L);
                int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L) + 11;
                byte b9 = $$d[7];
                byte b10 = b9;
                Object[] objArr62 = new Object[1];
                f(b10, (short) (b10 | 192), b9, objArr62);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(cArgb, packedPositionChild, packedPositionChild2, 256017550, false, (String) objArr62[0], null);
            }
            Object[] objArr63 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).get(null);
            objArr6 = new Object[]{new int[]{((int[]) objArr63[0])[0]}, new int[1], new int[]{((int[]) objArr63[2])[0]}, (String[]) objArr63[3]};
            int iNextInt = new Random().nextInt(1693646703);
            int i69 = ~(969365574 | iNextInt);
            int i70 = ~iNextInt;
            int i71 = i69 | (~(1009675803 | i70));
            int i72 = ~((-969365575) | i70);
            int i73 = (((1057175628 + ((i71 | i72) * (-516))) + (((~(iNextInt | (-69740058))) | (~((-939935747) | i70))) * 516)) + ((939935746 | i72) * 516)) - 415574449;
            int i74 = (i73 << 13) ^ i73;
            int i75 = i74 ^ (i74 >>> 17);
            ((int[]) objArr6[1])[0] = i75 ^ (i75 << 5);
            str2 = str5;
            c = 2;
            str7 = str7;
        } else {
            Context applicationContext4 = applicationContext2 != null ? ((applicationContext2 instanceof ContextWrapper) && ((ContextWrapper) applicationContext2).getBaseContext() == null) ? null : context.getApplicationContext() : applicationContext2;
            Object[] objArr64 = {applicationContext4, Integer.valueOf(((Integer) Class.forName(str6).getMethod(str7, Object.class).invoke(null, this)).intValue()), -415574449};
            byte[] bArr27 = $$g;
            Object[] objArr65 = new Object[1];
            g((short) 284, bArr27[264], bArr27[0], objArr65);
            Class<?> cls4 = Class.forName((String) objArr65[0]);
            Object[] objArr66 = new Object[1];
            g((short) 351, bArr27[0], (byte) (-bArr27[146]), objArr66);
            objArr6 = (Object[]) cls4.getMethod((String) objArr66[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr64);
            if (applicationContext4 != null) {
                int i76 = f771a + 73;
                d = i76 % 128;
                try {
                    if (i76 % 2 != 0) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                            char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) str, '0', 0));
                            int i77 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 875;
                            int i78 = 11 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                            byte b11 = $$d[7];
                            byte b12 = b11;
                            Object[] objArr67 = new Object[1];
                            f(b12, (short) (b12 | 192), b11, objArr67);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(cIndexOf2, i77, i78, 256017550, false, (String) objArr67[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).set(null, objArr6);
                        str2 = str5;
                        long jLongValue7 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[1]).invoke(null, new Object[1])).longValue();
                        Long lValueOf9 = Long.valueOf(jLongValue7);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                            char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                            int gidForName2 = 875 - Process.getGidForName(str);
                            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 10;
                            byte[] bArr28 = $$d;
                            Object[] objArr68 = new Object[1];
                            f(bArr28[10], (short) 140, (byte) (bArr28[1] + 1), objArr68);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(tapTimeout, gidForName2, scrollBarFadeDuration, 2009631821, false, (String) objArr68[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).set(null, lValueOf9);
                        Long lValueOf10 = Long.valueOf(jLongValue7 << 3);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                            char cMyPid3 = (char) (Process.myPid() >> 22);
                            int iLastIndexOf5 = 875 - TextUtils.lastIndexOf(str, '0');
                            int iLastIndexOf6 = 9 - TextUtils.lastIndexOf(str, '0', 0);
                            byte[] bArr29 = $$d;
                            Object[] objArr69 = new Object[1];
                            f((byte) (bArr29[19] - 1), (short) 140, bArr29[7], objArr69);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(cMyPid3, iLastIndexOf5, iLastIndexOf6, 252381699, false, (String) objArr69[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).set(null, lValueOf10);
                    } else {
                        str2 = str5;
                        str7 = str7;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                            char cMyTid = (char) (Process.myTid() >> 22);
                            int mirror2 = AndroidCharacter.getMirror('0') + 828;
                            int iIndexOf7 = TextUtils.indexOf((CharSequence) str, '0', 0, 0) + 11;
                            byte b13 = $$d[7];
                            byte b14 = b13;
                            Object[] objArr70 = new Object[1];
                            f(b14, (short) (b14 | 192), b13, objArr70);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(cMyTid, mirror2, iIndexOf7, 256017550, false, (String) objArr70[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).set(null, objArr6);
                        long jLongValue8 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf11 = Long.valueOf(jLongValue8);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                            char cIndexOf3 = (char) (TextUtils.indexOf((CharSequence) str, '0', 0, 0) + 1);
                            int i79 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 875;
                            int iResolveSizeAndState = 10 - View.resolveSizeAndState(0, 0, 0);
                            byte[] bArr30 = $$d;
                            Object[] objArr71 = new Object[1];
                            f(bArr30[10], (short) 140, (byte) (bArr30[1] + 1), objArr71);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(cIndexOf3, i79, iResolveSizeAndState, 2009631821, false, (String) objArr71[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).set(null, lValueOf11);
                        Long lValueOf12 = Long.valueOf(jLongValue8 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
                            char defaultSize2 = (char) View.getDefaultSize(0, 0);
                            int iCombineMeasuredStates2 = View.combineMeasuredStates(0, 0) + 876;
                            int packedPositionChild3 = 9 - ExpandableListView.getPackedPositionChild(0L);
                            byte[] bArr31 = $$d;
                            Object[] objArr72 = new Object[1];
                            f((byte) (bArr31[19] - 1), (short) 140, bArr31[7], objArr72);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(defaultSize2, iCombineMeasuredStates2, packedPositionChild3, 252381699, false, (String) objArr72[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).set(null, lValueOf12);
                    }
                } catch (Exception unused5) {
                    throw new RuntimeException();
                }
            } else {
                str2 = str5;
                str7 = str7;
            }
            c = 2;
        }
        if (((int[]) objArr6[0])[0] != ((int[]) objArr6[c])[0]) {
            throw null;
        }
        int i80 = ((int[]) objArr6[1])[0];
        Object[] objArr73 = {new int[]{((int[]) objArr6[0])[0]}, new int[1], new int[]{((int[]) objArr6[2])[0]}, (String[]) objArr6[3]};
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i81 = ~elapsedCpuTime;
        int i82 = (~(814456408 | i81)) | 40902693;
        int i83 = ~(elapsedCpuTime | (-592465));
        int i84 = i80 + ((i82 | i83) * (-252)) + 1757854272 + ((i83 | (~(i81 | 855359101))) * 252);
        int i85 = (i84 << 13) ^ i84;
        int i86 = i85 ^ (i85 >>> 17);
        ((int[]) objArr73[1])[0] = i86 ^ (i86 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
            char cRed = (char) Color.red(0);
            int iIndexOf8 = 651 - TextUtils.indexOf(str, str, 0, 0);
            int iIndexOf9 = 43 - TextUtils.indexOf((CharSequence) str, '0');
            byte[] bArr32 = $$d;
            Object[] objArr74 = new Object[1];
            f(bArr32[10], (short) 140, (byte) (bArr32[1] + 1), objArr74);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(cRed, iIndexOf8, iIndexOf9, -459846511, false, (String) objArr74[0], null);
        }
        long j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).getLong(null);
        long jLongValue9 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
            char cAlpha = (char) Color.alpha(0);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 651;
            int mirror3 = '\\' - AndroidCharacter.getMirror('0');
            byte[] bArr33 = $$d;
            Object[] objArr75 = new Object[1];
            f((byte) (bArr33[19] - 1), (short) 140, bArr33[7], objArr75);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(cAlpha, iMakeMeasureSpec, mirror3, -873460649, false, (String) objArr75[0], null);
        }
        if (j3 == ((jLongValue9 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
                char c6 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 651;
                int iLastIndexOf7 = TextUtils.lastIndexOf(str, '0') + 45;
                byte[] bArr34 = $$d;
                Object[] objArr76 = new Object[1];
                f(bArr34[10], bArr34[1], (byte) ($$e >>> 2), objArr76);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(c6, keyRepeatTimeout, iLastIndexOf7, -1595579076, false, (String) objArr76[0], null);
            }
            Object[] objArr77 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).get(null);
            objArr7 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i87 = ((int[]) objArr77[2])[0];
            int i88 = ((int[]) objArr77[0])[0];
            int iIdentityHashCode6 = System.identityHashCode(this);
            int i89 = 520678560 + (((~((~iIdentityHashCode6) | (-297083870))) | (-293653060)) * (-235)) + (((~((-297083870) | iIdentityHashCode6)) | (-293653060)) * (-470)) + (((~(iIdentityHashCode6 | (-293601858))) | (-297135072)) * 235) + 3673461;
            int i90 = (i89 << 13) ^ i89;
            int i91 = i90 ^ (i90 >>> 17);
            ((int[]) objArr7[3])[0] = i91 ^ (i91 << 5);
            i3 = 0;
        } else {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1609, View.combineMeasuredStates(0, 0) + 26, 2145681644, false, null, new Class[0]);
            }
            Object[] objArr78 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).newInstance(null), 3673461, 0};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
                char mirror4 = (char) ('0' - AndroidCharacter.getMirror('0'));
                int keyRepeatTimeout2 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 651;
                int iIndexOf10 = TextUtils.indexOf((CharSequence) str, '0', 0, 0) + 45;
                byte[] bArr35 = $$d;
                Object[] objArr79 = new Object[1];
                f((byte) (bArr35[19] - 1), (short) 140, bArr35[7], objArr79);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(mirror4, keyRepeatTimeout2, iIndexOf10, 2075921419, false, (String) objArr79[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) View.combineMeasuredStates(0, 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 695, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 97), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 63405), 792 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 83), Integer.TYPE, Integer.TYPE});
            }
            objArr7 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).invoke(null, objArr78);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
                char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                int fadingEdgeLength2 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 651;
                int i92 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 43;
                byte[] bArr36 = $$d;
                Object[] objArr80 = new Object[1];
                f(bArr36[10], bArr36[1], (byte) ($$e >>> 2), objArr80);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(packedPositionType, fadingEdgeLength2, i92, -1595579076, false, (String) objArr80[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).set(null, objArr7);
            try {
                long jLongValue10 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf13 = Long.valueOf(jLongValue10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
                    char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int doubleTapTimeout = 651 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int i93 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 45;
                    byte[] bArr37 = $$d;
                    Object[] objArr81 = new Object[1];
                    f((byte) (bArr37[19] - 1), (short) 140, bArr37[7], objArr81);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(jumpTapTimeout, doubleTapTimeout, i93, -873460649, false, (String) objArr81[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).set(null, lValueOf13);
                Long lValueOf14 = Long.valueOf(jLongValue10 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                    char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                    int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 651;
                    int touchSlop2 = 44 - (ViewConfiguration.getTouchSlop() >> 8);
                    byte[] bArr38 = $$d;
                    Object[] objArr82 = new Object[1];
                    f(bArr38[10], (short) 140, (byte) (bArr38[1] + 1), objArr82);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(cNormalizeMetaState, touchSlop, touchSlop2, -459846511, false, (String) objArr82[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).set(null, lValueOf14);
                i3 = 0;
            } catch (Exception unused6) {
                throw new RuntimeException();
            }
        }
        int i94 = ((int[]) objArr7[i3])[i3];
        int i95 = ((int[]) objArr7[2])[i3];
        if (i95 == i94) {
            objArr8 = new Object[4];
            int[] iArr3 = new int[1];
            objArr8[i3] = iArr3;
            int[] iArr4 = new int[1];
            objArr8[2] = iArr4;
            objArr8[3] = new int[1];
            int i96 = ((int[]) objArr7[3])[i3];
            int i97 = ((int[]) objArr7[2])[i3];
            int i98 = ((int[]) objArr7[i3])[i3];
            iArr4[i3] = i97;
            iArr3[i3] = i98;
            objArr8[1] = new String[i3];
            int iNextInt2 = new Random().nextInt();
            int i99 = i96 + 1745876209 + (((~(873107481 | iNextInt2)) | 64235110 | (~((-869676672) | iNextInt2))) * (-744)) + (((~iNextInt2) | 67665920) * 744) + ((iNextInt2 | (-64235111)) * 744);
            int i100 = (i99 << 13) ^ i99;
            int i101 = i100 ^ (i100 >>> 17);
            ((int[]) objArr8[3])[0] = i101 ^ (i101 << 5);
        } else {
            ArrayList arrayList4 = new ArrayList();
            String[] strArr7 = (String[]) objArr7[1];
            if (strArr7 != null) {
                for (String str11 : strArr7) {
                    int i102 = d + 39;
                    f771a = i102 % 128;
                    int i103 = i102 % 2;
                    arrayList4.add(str11);
                }
            }
            int[] iArr5 = new int[i95];
            int i104 = i95 - 1;
            iArr5[i104] = 1;
            Toast.makeText((Context) null, iArr5[((i95 * i104) % 2) - 1], 1).show();
            objArr8 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i105 = ((int[]) objArr7[3])[0];
            int i106 = ((int[]) objArr7[2])[0];
            int i107 = ((int[]) objArr7[0])[0];
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i108 = ~startUptimeMillis;
            int i109 = i105 + (-384250608) + (((~(256220782 | i108)) | 259651592) * 226) + (((~(i108 | 259915374)) | (~((-259651593) | startUptimeMillis)) | 255957000) * (-113)) + ((~(startUptimeMillis | 256220782)) * 113);
            int i110 = (i109 << 13) ^ i109;
            int i111 = i110 ^ (i110 >>> 17);
            ((int[]) objArr8[3])[0] = i111 ^ (i111 << 5);
        }
        Uri data = intent.getData();
        String schemeSpecificPart = data != null ? data.getSchemeSpecificPart() : null;
        String strConcat = "10/8/18/".concat("com.google.android.gms");
        int i112 = ((int[]) objArr28[2])[0];
        int i113 = i112 * i112;
        int i114 = -(490648862 * i112);
        int i115 = (i113 ^ i114) + ((i113 & i114) << 1);
        int i116 = -(i112 * (-1381602896));
        int i117 = ((i115 | i116) << 1) - (i116 ^ i115);
        int i118 = (i117 ^ 1309686641) + ((1309686641 & i117) << 1);
        int i119 = i118 >> 17;
        int i120 = ((i119 ^ (-65535)) + ((i119 & (-65535)) << 1)) / 32768;
        int i121 = (i118 - (~((i120 ^ 1) + ((i120 & 1) << 1)))) - 1;
        int i122 = i118 >> 15;
        int i123 = -(i121 ^ (((((i122 | (-262143)) << 1) - (i122 ^ (-262143))) / 131072) + 1));
        int i124 = ((i123 | 3) << 1) - (i123 ^ 3);
        int i125 = i124 >> 18;
        int i126 = ((i125 & (-32767)) + (i125 | (-32767))) / 16384;
        int i127 = 1455966 / (((-((((i126 | 1) << 1) - (i126 ^ 1)) + 1)) & i124) * 1721);
        int i128 = ((int[]) objArr3[0])[0];
        int i129 = i128 * i128;
        int i130 = -(1807857869 * i128);
        int i131 = ((((i129 | i130) << 1) - (i129 ^ i130)) - (~(-(i128 * (-1911627955))))) - 1;
        int i132 = ((i131 | (-2044217175)) << 1) - ((-2044217175) ^ i131);
        int i133 = i132 >> 16;
        int i134 = ((i133 ^ (-131071)) + ((i133 & (-131071)) << 1)) / 65536;
        int i135 = (i134 ^ 1) + ((i134 & 1) << 1);
        int i136 = (i132 & i135) + (i135 | i132);
        int i137 = ((i132 >> 28) - 31) / 16;
        int i138 = -(i136 ^ ((i137 & 1) + (i137 | 1)));
        int i139 = ((i138 | 5) << 1) - (i138 ^ 5);
        int i140 = i139 >> 23;
        int i141 = ((((i140 | (-1023)) << 1) - (i140 ^ (-1023))) / 512) + 1;
        int i142 = i127 + (4027090 / (((-((i141 & 1) + (i141 | 1))) & i139) * 1423));
        int i143 = ((int[]) objArr46[3])[0];
        int i144 = i143 * i143;
        int i145 = -(1733260535 * i143);
        int i146 = (i144 ^ i145) + ((i144 & i145) << 1);
        int i147 = -(i143 * 917927817);
        int i148 = ((i146 & i147) + (i147 | i146)) - (-1172246528);
        int i149 = i148 >> 27;
        int i150 = ((i149 & (-63)) + (i149 | (-63))) / 32;
        int i151 = (i150 ^ 1) + ((i150 & 1) << 1);
        int i152 = (i148 & i151) + (i151 | i148);
        int i153 = i148 >> 22;
        int i154 = ((i153 ^ (-2047)) + ((i153 & (-2047)) << 1)) / 1024;
        int i155 = -(((i154 & 1) + (i154 | 1)) ^ i152);
        int i156 = (i155 ^ 6) + ((i155 & 6) << 1);
        int i157 = i142 + (637596 / (((-((((i156 >> 27) - 63) / 32) + 2)) & i156) * 534));
        int i158 = ((int[]) objArr59[1])[0];
        int i159 = i158 * i158;
        int i160 = -(2117009035 * i158);
        int i161 = (((i159 & i160) + (i159 | i160)) - (~(-(i158 * 82010131)))) - 1;
        int i162 = (i161 ^ (-917759391)) + (((-917759391) & i161) << 1);
        int i163 = i162 >> 24;
        int i164 = i163 & (-511);
        int i165 = ((i163 ^ (-511)) + (i164 << 1)) / 256;
        int i166 = (i165 & 1) + (i165 | 1);
        int i167 = (i164 + (i163 | (-511))) / 256;
        int i168 = (-(((i167 ^ 1) + ((i167 & 1) << 1)) ^ ((i162 & i166) + (i162 | i166)))) + 9;
        int i169 = i168 >> 17;
        int i170 = ((i169 ^ (-65535)) + (((-65535) & i169) << 1)) / 32768;
        int i171 = (i170 & 1) + (i170 | 1);
        int i172 = i157 + (2551500 / ((i168 & (-((i171 ^ 1) + ((i171 & 1) << 1)))) * 1125));
        int i173 = ((int[]) objArr73[1])[0];
        int i174 = i173 * i173;
        int i175 = -(650879859 * i173);
        int i176 = (i174 & i175) + (i174 | i175);
        int i177 = -(i173 * (-1651831485));
        int i178 = ((i176 & i177) + (i177 | i176)) - (-2031136857);
        int i179 = ((i178 >> 17) - 65535) / 32768;
        int i180 = (i178 - (~((i179 & 1) + (i179 | 1)))) - 1;
        int i181 = ((i178 >> 21) - 4095) / 2048;
        int i182 = -(i180 ^ ((i181 & 1) + (i181 | 1)));
        int i183 = ((i182 | 2) << 1) - (i182 ^ 2);
        int i184 = i183 >> 16;
        int i185 = i172 + (863456 / (((-(((((i184 | (-131071)) << 1) - (i184 ^ (-131071))) / 65536) + 2)) & i183) * 1784));
        int i186 = ((int[]) objArr8[3])[0];
        int i187 = i186 * i186;
        int i188 = -(850029653 * i186);
        int i189 = ((i187 | i188) << 1) - (i187 ^ i188);
        int i190 = -(i186 * (-1316676285));
        int i191 = ((i189 | i190) << 1) - (i190 ^ i189);
        int i192 = (i191 ^ (-1544486256)) + (((-1544486256) & i191) << 1);
        int i193 = i192 >> 26;
        int i194 = (((i193 | ComposerKt.defaultsKey) << 1) - (i193 ^ ComposerKt.defaultsKey)) / 64;
        int i195 = ((i194 | 1) << 1) - (i194 ^ 1);
        int i196 = -(((((i192 >> 22) - 2047) / 1024) + 1) ^ (((i192 | i195) << 1) - (i195 ^ i192)));
        int i197 = ((i196 | 7) << 1) - (i196 ^ 7);
        int i198 = i197 >> 23;
        int i199 = (((i198 | (-1023)) << 1) - (i198 ^ (-1023))) / 512;
        int i200 = ((i199 | 1) << 1) - (i199 ^ 1);
        if (strConcat.substring(i185 + ((-15774570) / (((-(((i200 | 1) << 1) - (i200 ^ 1))) & i197) * 1470))).equals(schemeSpecificPart)) {
            this.zab.zaa();
            zab();
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
            char cRed2 = (char) (Color.red(0) + 37567);
            int i201 = 625 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 14;
            byte[] bArr39 = $$d;
            Object[] objArr83 = new Object[1];
            f((byte) (bArr39[19] - 1), (short) 140, bArr39[7], objArr83);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(cRed2, i201, doubleTapTimeout2, -477065106, false, (String) objArr83[0], null);
        }
        long j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).getLong(null);
        long jLongValue11 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
            char size = (char) (37567 - View.MeasureSpec.getSize(0));
            int mirror5 = 673 - AndroidCharacter.getMirror('0');
            int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 14;
            byte[] bArr40 = $$d;
            Object[] objArr84 = new Object[1];
            f(bArr40[10], (short) (bArr40[0] + 1), (byte) (bArr40[1] + 1), objArr84);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(size, mirror5, edgeSlop, -976899241, false, (String) objArr84[0], null);
        }
        if (j4 == ((jLongValue11 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
                char maximumFlingVelocity2 = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 37567);
                int minimumFlingVelocity2 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 625;
                int gidForName3 = Process.getGidForName(str) + 15;
                byte[] bArr41 = $$d;
                byte b15 = bArr41[10];
                short s9 = bArr41[80];
                Object[] objArr85 = new Object[1];
                f(b15, s9, (byte) (s9 & 52), objArr85);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(maximumFlingVelocity2, minimumFlingVelocity2, gidForName3, -973632554, false, (String) objArr85[0], null);
            }
            Object[] objArr86 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).get(null);
            int i202 = ((int[]) objArr86[2])[0];
            int i203 = ((int[]) objArr86[0])[0];
            String[] strArr8 = (String[]) objArr86[3];
            int[] iArr6 = {i202};
            int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
            int i204 = ~((-36405429) | elapsedCpuTime2);
            int i205 = (((9118040 + ((285238336 | i204) * (-476))) + (i204 * 952)) + ((~((~elapsedCpuTime2) | (-36405429))) * 476)) - 2113280690;
            int i206 = (i205 << 13) ^ i205;
            int i207 = i206 ^ (i206 >>> 17);
            ((int[]) objArr9[1])[0] = i207 ^ (i207 << 5);
            objArr9 = new Object[]{new int[]{i203}, new int[1], iArr6, strArr8};
            str3 = str7;
        } else {
            Context applicationContext5 = applicationContext2 != null ? ((applicationContext2 instanceof ContextWrapper) && ((ContextWrapper) applicationContext2).getBaseContext() == null) ? null : context.getApplicationContext() : applicationContext2;
            str3 = str7;
            int iIntValue2 = ((Integer) Class.forName(str6).getMethod(str3, Object.class).invoke(null, this)).intValue();
            Object[] objArr87 = new Object[1];
            c(new char[]{29071, 29117, 8345, 45909, 19398, 27890, 30004, 53166, 16202, 20858, 6498, 50695, 60670, 33730, 43022, 38872, 39430, 52389, 32685, 27004, 19240, 32093, 3366, 14912, 63630, 44991, 56387, 35811, 42546, 55523, 37818, 23884, 22464, 2324, 8456, 12000, 1174, 48125, 61618, 65420, 45690, 58377, 34780, 45424, 25473, 5489, 21884, 757, 4325, 18309, 58527, 54172, 56926, 61500, 48072, 42340, 36847, 8848, 18790, 30339, 15694, 21452, 6284, 51263, 60017, 40054, 44590, 39259}, 1 - Gravity.getAbsoluteGravity(0, 0), objArr87);
            String str12 = (String) objArr87[0];
            Object[] objArr88 = new Object[1];
            e((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2060405370, (-6) - ExpandableListView.getPackedPositionGroup(0L), (short) (Process.myTid() >> 22), (byte) ((-1) - TextUtils.lastIndexOf(str, '0')), View.resolveSize(0, 0) + 1968552732, objArr88);
            Object[] objArr89 = {applicationContext5, new String[]{str12, (String) objArr88[0]}, Integer.valueOf(iIntValue2), 17, -2113280690};
            byte[] bArr42 = $$g;
            Object[] objArr90 = new Object[1];
            g((short) 266, (byte) (-bArr42[11]), bArr42[133], objArr90);
            Class<?> cls5 = Class.forName((String) objArr90[0]);
            Object[] objArr91 = new Object[1];
            g((short) 460, bArr42[123], bArr42[5], objArr91);
            Object[] objArr92 = (Object[]) cls5.getMethod((String) objArr91[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr89);
            int i208 = ((int[]) objArr92[0])[0];
            int i209 = ((int[]) objArr92[2])[0];
            if (applicationContext5 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
                    char cIndexOf4 = (char) (37567 - TextUtils.indexOf(str, str, 0));
                    int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 625;
                    int i210 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 14;
                    byte[] bArr43 = $$d;
                    byte b16 = bArr43[10];
                    short s10 = bArr43[80];
                    Object[] objArr93 = new Object[1];
                    f(b16, s10, (byte) (s10 & 52), objArr93);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(cIndexOf4, packedPositionGroup, i210, -973632554, false, (String) objArr93[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).set(null, objArr92);
                try {
                    long jLongValue12 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf15 = Long.valueOf(jLongValue12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
                        char cNormalizeMetaState2 = (char) (KeyEvent.normalizeMetaState(0) + 37567);
                        int iIndexOf11 = TextUtils.indexOf((CharSequence) str, '0', 0, 0) + 626;
                        int packedPositionChild4 = ExpandableListView.getPackedPositionChild(0L) + 15;
                        byte[] bArr44 = $$d;
                        Object[] objArr94 = new Object[1];
                        f(bArr44[10], (short) (bArr44[0] + 1), (byte) (bArr44[1] + 1), objArr94);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(cNormalizeMetaState2, iIndexOf11, packedPositionChild4, -976899241, false, (String) objArr94[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).set(null, lValueOf15);
                    Long lValueOf16 = Long.valueOf(jLongValue12 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
                        char c7 = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 37567);
                        int i211 = 626 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        int longPressTimeout = 14 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        byte[] bArr45 = $$d;
                        Object[] objArr95 = new Object[1];
                        f((byte) (bArr45[19] - 1), (short) 140, bArr45[7], objArr95);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(c7, i211, longPressTimeout, -477065106, false, (String) objArr95[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).set(null, lValueOf16);
                } catch (Exception unused7) {
                    throw new RuntimeException();
                }
            } else {
                objArr92 = objArr92;
            }
            objArr9 = objArr92;
        }
        int i212 = ((int[]) objArr9[0])[0];
        int i213 = ((int[]) objArr9[2])[0];
        if (i213 == i212) {
            int i214 = d + 59;
            f771a = i214 % 128;
            int i215 = i214 % 2;
            int i216 = ((int[]) objArr9[1])[0];
            int i217 = ((int[]) objArr9[2])[0];
            int i218 = ((int[]) objArr9[0])[0];
            String[] strArr9 = (String[]) objArr9[3];
            int[] iArr7 = {i217};
            int iIdentityHashCode7 = System.identityHashCode(this);
            int i219 = (-255899120) + ((iIdentityHashCode7 | 461575958) * (-50));
            int i220 = ~((-285217043) | iIdentityHashCode7);
            int i221 = ~iIdentityHashCode7;
            int i222 = i216 + i219 + ((i220 | (~((-1076945121) | i221))) * 50) + (((~(i221 | 461575958)) | (~((-1362162163) | i221)) | 1076945120) * 50);
            int i223 = i222 ^ (i222 << 13);
            int i224 = i223 ^ (i223 >>> 17);
            ((int[]) objArr[1])[0] = i224 ^ (i224 << 5);
            Object[] objArr96 = {new int[]{i218}, new int[1], iArr7, strArr9};
            i4 = 0;
        } else {
            ArrayList arrayList5 = new ArrayList();
            String[] strArr10 = (String[]) objArr9[3];
            if (strArr10 != null) {
                for (String str13 : strArr10) {
                    arrayList5.add(str13);
                }
            }
            Toast.makeText((Context) null, i213 / (((i213 - 1) * i213) % 2), 0).show();
            int i225 = ((int[]) objArr9[1])[0];
            int i226 = ((int[]) objArr9[2])[0];
            int i227 = ((int[]) objArr9[0])[0];
            String[] strArr11 = (String[]) objArr9[3];
            int[] iArr8 = {i226};
            int iMyTid2 = Process.myTid();
            int i228 = ~iMyTid2;
            int i229 = i225 + 751044214 + (((~((-740165163) | i228)) | 1083572958) * (-602)) + (((~(iMyTid2 | (-740165163))) | 1442314 | (~(1822295806 | i228))) * (-301)) + ((~(i228 | 1083572958)) * 301);
            int i230 = i229 ^ (i229 << 13);
            int i231 = i230 ^ (i230 >>> 17);
            i4 = 0;
            ((int[]) objArr[1])[0] = i231 ^ (i231 << 5);
            Object[] objArr97 = {new int[]{i227}, new int[1], iArr8, strArr11};
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
            char cLastIndexOf2 = (char) (TextUtils.lastIndexOf(str, '0') + 43043);
            int iRgb2 = (-16774105) - Color.rgb(i4, i4, i4);
            int iIndexOf12 = TextUtils.indexOf(str, str, i4, i4) + 22;
            byte[] bArr46 = $$d;
            Object[] objArr98 = new Object[1];
            f(bArr46[10], (short) (bArr46[i4] + 1), (byte) (bArr46[1] + 1), objArr98);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(cLastIndexOf2, iRgb2, iIndexOf12, -1272852037, false, (String) objArr98[i4], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                char c8 = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 43042);
                int mode4 = 3111 - View.MeasureSpec.getMode(0);
                int doubleTapTimeout3 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 22;
                byte[] bArr47 = $$d;
                Object[] objArr99 = new Object[1];
                f(bArr47[10], bArr47[1], (byte) ($$e >>> 2), objArr99);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(c8, mode4, doubleTapTimeout3, 154975793, false, (String) objArr99[0], null);
            }
            Object[] objArr100 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).get(null);
            int i232 = ((int[]) objArr100[2])[0];
            int i233 = ((int[]) objArr100[1])[0];
            String[] strArr12 = (String[]) objArr100[3];
            int[] iArr9 = {i233};
            int startUptimeMillis2 = (int) Process.getStartUptimeMillis();
            int i234 = (((((~((-1179667) | startUptimeMillis2)) | 1703690376) * TypedValues.PositionType.TYPE_TRANSITION_EASING) - 2031334976) + ((~((~startUptimeMillis2) | (-1179667))) * TypedValues.PositionType.TYPE_TRANSITION_EASING)) - 778034241;
            int i235 = (i234 << 13) ^ i234;
            int i236 = i235 ^ (i235 >>> 17);
            ((int[]) objArr10[0])[0] = i236 ^ (i236 << 5);
            objArr10 = new Object[]{new int[1], iArr9, new int[]{i232}, strArr12};
        } else {
            int iIntValue3 = ((Integer) Class.forName(str6).getMethod(str3, Object.class).invoke(null, this)).intValue();
            int i237 = d + 55;
            f771a = i237 % 128;
            int i238 = i237 % 2;
            Object[] objArr101 = {null, Integer.valueOf(iIntValue3), 0, -778034241};
            byte[] bArr48 = $$g;
            Object[] objArr102 = new Object[1];
            g((short) 202, (byte) (-bArr48[2]), (byte) (-bArr48[225]), objArr102);
            Class<?> cls6 = Class.forName((String) objArr102[0]);
            Object[] objArr103 = new Object[1];
            g((short) 140, (byte) (-bArr48[97]), bArr48[5], objArr103);
            objArr10 = (Object[]) cls6.getMethod((String) objArr103[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr101);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
                char capsMode = (char) (TextUtils.getCapsMode(str, 0, 0) + 43042);
                int i239 = 3110 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                int packedPositionGroup2 = 22 - ExpandableListView.getPackedPositionGroup(0L);
                byte[] bArr49 = $$d;
                Object[] objArr104 = new Object[1];
                f(bArr49[10], bArr49[1], (byte) ($$e >>> 2), objArr104);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(capsMode, i239, packedPositionGroup2, 154975793, false, (String) objArr104[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).set(null, objArr10);
            try {
                long jLongValue13 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf17 = Long.valueOf(jLongValue13);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
                    char cMakeMeasureSpec2 = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 43042);
                    int threadPriority2 = 3111 - ((Process.getThreadPriority(0) + 20) >> 6);
                    int keyRepeatTimeout3 = 22 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    byte[] bArr50 = $$d;
                    byte b17 = bArr50[10];
                    short s11 = bArr50[80];
                    Object[] objArr105 = new Object[1];
                    f(b17, s11, (byte) (s11 & 52), objArr105);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(cMakeMeasureSpec2, threadPriority2, keyRepeatTimeout3, -1269618118, false, (String) objArr105[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).set(null, lValueOf17);
                Long lValueOf18 = Long.valueOf(jLongValue13 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
                    char c9 = (char) (43041 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                    int deadChar4 = 3111 - KeyEvent.getDeadChar(0, 0);
                    int touchSlop3 = (ViewConfiguration.getTouchSlop() >> 8) + 22;
                    byte[] bArr51 = $$d;
                    Object[] objArr106 = new Object[1];
                    f(bArr51[10], (short) (bArr51[0] + 1), (byte) (bArr51[1] + 1), objArr106);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(c9, deadChar4, touchSlop3, -1272852037, false, (String) objArr106[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).set(null, lValueOf18);
            } catch (Exception unused8) {
                throw new RuntimeException();
            }
        }
        int i240 = ((int[]) objArr10[1])[0];
        int i241 = ((int[]) objArr10[2])[0];
        if (i241 != i240) {
            ArrayList arrayList6 = new ArrayList();
            String[] strArr13 = (String[]) objArr10[3];
            if (strArr13 != null) {
                for (String str14 : strArr13) {
                    arrayList6.add(str14);
                }
            }
            throw new RuntimeException(String.valueOf(i241));
        }
        int i242 = ((int[]) objArr10[0])[0];
        int i243 = ((int[]) objArr10[2])[0];
        int i244 = ((int[]) objArr10[1])[0];
        String[] strArr14 = (String[]) objArr10[3];
        int[] iArr10 = {i244};
        int iIdentityHashCode8 = System.identityHashCode(this);
        int i245 = i242 + (-1744362186) + (((~iIdentityHashCode8) | 631519267) * 1324) + (((~(iIdentityHashCode8 | 904150647)) | (~(800880811 | iIdentityHashCode8))) * (-1324)) + 541539560;
        int i246 = (i245 << 13) ^ i245;
        int i247 = i246 ^ (i246 >>> 17);
        ((int[]) objArr[0])[0] = i247 ^ (i247 << 5);
        Object[] objArr107 = {new int[1], iArr10, new int[]{i243}, strArr14};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
            char threadPriority3 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
            int iCombineMeasuredStates3 = View.combineMeasuredStates(0, 0) + 876;
            int iLastIndexOf8 = TextUtils.lastIndexOf(str, '0', 0) + 11;
            byte[] bArr52 = $$d;
            Object[] objArr108 = new Object[1];
            f(bArr52[19], (short) DerHeader.TAG_CLASS_PRIVATE, (byte) (-bArr52[9]), objArr108);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(threadPriority3, iCombineMeasuredStates3, iLastIndexOf8, -1199417970, false, (String) objArr108[0], null);
        }
        long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).getLong(null);
        long jLongValue14 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
            char jumpTapTimeout2 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
            int deadChar5 = KeyEvent.getDeadChar(0, 0) + 876;
            int scrollDefaultDelay4 = 10 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            byte[] bArr53 = $$d;
            Object[] objArr109 = new Object[1];
            f((byte) (-bArr53[14]), (short) 202, bArr53[7], objArr109);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(jumpTapTimeout2, deadChar5, scrollDefaultDelay4, 254769921, false, (String) objArr109[0], null);
        }
        if (j5 == ((jLongValue14 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).getLong(null) << 52) >>> 52)) >> 12)) {
            int i248 = d + 29;
            f771a = i248 % 128;
            int i249 = i248 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
                char cIndexOf5 = (char) TextUtils.indexOf(str, str, 0);
                int scrollDefaultDelay5 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 876;
                int iLastIndexOf9 = TextUtils.lastIndexOf(str, '0', 0, 0) + 11;
                byte[] bArr54 = $$d;
                Object[] objArr110 = new Object[1];
                f(bArr54[19], (short) 202, bArr54[77], objArr110);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(cIndexOf5, scrollDefaultDelay5, iLastIndexOf9, 1324201839, false, (String) objArr110[0], null);
            }
            Object[] objArr111 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).get(null);
            objArr11 = new Object[]{new int[]{((int[]) objArr111[0])[0]}, new int[1], new int[]{((int[]) objArr111[2])[0]}, (String[]) objArr111[3]};
            int iMyPid4 = Process.myPid();
            int i250 = ~iMyPid4;
            int i251 = (-2054557442) + (((~((-287346071) | i250)) | (-247035842)) * (-602)) + (((~(iMyPid4 | (-287346071))) | 285247510 | (~((-244937282) | i250))) * (-301)) + ((~(i250 | (-247035842))) * 301) + 1738398932;
            int i252 = (i251 << 13) ^ i251;
            int i253 = i252 ^ (i252 >>> 17);
            ((int[]) objArr11[1])[0] = i253 ^ (i253 << 5);
        } else {
            Object[] objArr112 = {Integer.valueOf(((Integer) Class.forName(str6).getMethod(str3, Object.class).invoke(null, this)).intValue()), 1738398932};
            byte[] bArr55 = $$g;
            Object[] objArr113 = new Object[1];
            g((short) 88, bArr55[403], bArr55[133], objArr113);
            Class<?> cls7 = Class.forName((String) objArr113[0]);
            short s12 = (short) (-bArr55[97]);
            Object[] objArr114 = new Object[1];
            g(s12, (byte) s12, bArr55[5], objArr114);
            objArr11 = (Object[]) cls7.getMethod((String) objArr114[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr112);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
                char offsetAfter = (char) TextUtils.getOffsetAfter(str, 0);
                int iAxisFromString = 875 - MotionEvent.axisFromString(str);
                int iResolveSize = 10 - View.resolveSize(0, 0);
                byte[] bArr56 = $$d;
                Object[] objArr115 = new Object[1];
                f(bArr56[19], (short) 202, bArr56[77], objArr115);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(offsetAfter, iAxisFromString, iResolveSize, 1324201839, false, (String) objArr115[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).set(null, objArr11);
            try {
                long jLongValue15 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf19 = Long.valueOf(jLongValue15);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
                    char c10 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int tapTimeout2 = 876 - (ViewConfiguration.getTapTimeout() >> 16);
                    int iRed = Color.red(0) + 10;
                    byte[] bArr57 = $$d;
                    Object[] objArr116 = new Object[1];
                    f((byte) (-bArr57[14]), (short) 202, bArr57[7], objArr116);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b(c10, tapTimeout2, iRed, 254769921, false, (String) objArr116[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).set(null, lValueOf19);
                Long lValueOf20 = Long.valueOf(jLongValue15 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
                    char packedPositionType2 = (char) ExpandableListView.getPackedPositionType(0L);
                    int iIndexOf13 = TextUtils.indexOf(str, str, 0, 0) + 876;
                    int iResolveSize2 = View.resolveSize(0, 0) + 10;
                    byte[] bArr58 = $$d;
                    Object[] objArr117 = new Object[1];
                    f(bArr58[19], (short) DerHeader.TAG_CLASS_PRIVATE, (byte) (-bArr58[9]), objArr117);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(packedPositionType2, iIndexOf13, iResolveSize2, -1199417970, false, (String) objArr117[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).set(null, lValueOf20);
            } catch (Exception unused9) {
                throw new RuntimeException();
            }
        }
        int i254 = ((int[]) objArr11[2])[0];
        int i255 = ((int[]) objArr11[0])[0];
        if (i255 != i254) {
            ArrayList arrayList7 = new ArrayList();
            String[] strArr15 = (String[]) objArr11[3];
            if (strArr15 != null) {
                int i256 = d + 99;
                f771a = i256 % 128;
                int i257 = i256 % 2;
                for (String str15 : strArr15) {
                    arrayList7.add(str15);
                }
            }
            throw new RuntimeException(String.valueOf(i255));
        }
        int i258 = f771a + 73;
        d = i258 % 128;
        int i259 = i258 % 2;
        int i260 = ((int[]) objArr11[1])[0];
        Object[] objArr118 = {new int[]{((int[]) objArr11[0])[0]}, new int[1], new int[]{((int[]) objArr11[2])[0]}, (String[]) objArr11[3]};
        int iIdentityHashCode9 = System.identityHashCode(this);
        int i261 = i260 + 1851957684 + (((~(iIdentityHashCode9 | 625655268)) | 585345039) * (-668)) + ((625655268 | (~(585345039 | iIdentityHashCode9))) * 1336) + ((iIdentityHashCode9 | 669761007) * 668);
        int i262 = i261 ^ (i261 << 13);
        int i263 = i262 ^ (i262 >>> 17);
        ((int[]) objArr118[1])[0] = i263 ^ (i263 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
            char c11 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
            int i264 = 1031 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int fadingEdgeLength3 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 15;
            byte[] bArr59 = $$d;
            Object[] objArr119 = new Object[1];
            f(bArr59[10], (short) (bArr59[0] + 1), (byte) (bArr59[1] + 1), objArr119);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(c11, i264, fadingEdgeLength3, 1357589585, false, (String) objArr119[0], null);
        }
        long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).getLong(null);
        long jLongValue16 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
            char doubleTapTimeout4 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int iIndexOf14 = 1031 - TextUtils.indexOf(str, str, 0);
            int absoluteGravity2 = 15 - Gravity.getAbsoluteGravity(0, 0);
            byte[] bArr60 = $$d;
            byte b18 = bArr60[10];
            short s13 = bArr60[80];
            Object[] objArr120 = new Object[1];
            f(b18, s13, (byte) (s13 & 52), objArr120);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b(doubleTapTimeout4, iIndexOf14, absoluteGravity2, 1344079056, false, (String) objArr120[0], null);
        }
        if (j6 == ((jLongValue16 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
                char c12 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int i265 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1030;
                int iCombineMeasuredStates4 = 15 - View.combineMeasuredStates(0, 0);
                byte[] bArr61 = $$d;
                Object[] objArr121 = new Object[1];
                f((byte) (bArr61[19] - 1), (short) 140, bArr61[7], objArr121);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b(c12, i265, iCombineMeasuredStates4, 632103528, false, (String) objArr121[0], null);
            }
            Object[] objArr122 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).get(null);
            objArr12 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i266 = ((int[]) objArr122[3])[0];
            int i267 = ((int[]) objArr122[1])[0];
            String[] strArr16 = (String[]) objArr122[0];
            int iIdentityHashCode10 = System.identityHashCode(this);
            int i268 = (((-1497619050) + (((~((-270536721) | iIdentityHashCode10)) | (~((-26256551) | iIdentityHashCode10))) * 69)) + (((~(iIdentityHashCode10 | (-798926000))) | ((~((-1043206170) | iIdentityHashCode10)) | 772669449)) * (-69))) - 781558087;
            int i269 = (i268 << 13) ^ i268;
            int i270 = i269 ^ (i269 >>> 17);
            ((int[]) objArr12[2])[0] = i270 ^ (i270 << 5);
        } else {
            int iIntValue4 = ((Integer) Class.forName(str6).getMethod(str3, Object.class).invoke(null, this)).intValue();
            Object[] objArr123 = {-1111870382};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b((char) (46039 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), TextUtils.getOffsetBefore(str, 0) + 1134, 18 - Color.alpha(0), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr124 = {Integer.valueOf(iIntValue4), 0, -3074439, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).newInstance(objArr123), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
                char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                int iKeyCodeFromString2 = KeyEvent.keyCodeFromString(str) + 1031;
                int edgeSlop2 = (ViewConfiguration.getEdgeSlop() >> 16) + 15;
                byte[] bArr62 = $$d;
                Object[] objArr125 = new Object[1];
                f(bArr62[10], (short) (bArr62[0] + 1), (byte) (bArr62[1] + 1), objArr125);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(cCombineMeasuredStates, iKeyCodeFromString2, edgeSlop2, 1298546779, false, (String) objArr125[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (Color.rgb(0, 0, 0) + 16823209), 1117 - (ViewConfiguration.getEdgeSlop() >> 16), 17 - (ViewConfiguration.getWindowTouchSlop() >> 8)), Boolean.TYPE});
            }
            objArr12 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).invoke(null, objArr124);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
                char defaultSize3 = (char) View.getDefaultSize(0, 0);
                int packedPositionGroup3 = 1031 - ExpandableListView.getPackedPositionGroup(0L);
                int i271 = 15 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                byte[] bArr63 = $$d;
                Object[] objArr126 = new Object[1];
                f((byte) (bArr63[19] - 1), (short) 140, bArr63[7], objArr126);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(defaultSize3, packedPositionGroup3, i271, 632103528, false, (String) objArr126[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).set(null, objArr12);
            try {
                long jLongValue17 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf21 = Long.valueOf(jLongValue17);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
                    char keyRepeatTimeout4 = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int iKeyCodeFromString3 = 1031 - KeyEvent.keyCodeFromString(str);
                    int maxKeyCode2 = 15 - (KeyEvent.getMaxKeyCode() >> 16);
                    byte[] bArr64 = $$d;
                    byte b19 = bArr64[10];
                    short s14 = bArr64[80];
                    Object[] objArr127 = new Object[1];
                    f(b19, s14, (byte) (s14 & 52), objArr127);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(keyRepeatTimeout4, iKeyCodeFromString3, maxKeyCode2, 1344079056, false, (String) objArr127[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).set(null, lValueOf21);
                Long lValueOf22 = Long.valueOf(jLongValue17 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
                    char maximumFlingVelocity3 = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int iIndexOf15 = TextUtils.indexOf((CharSequence) str, '0', 0) + 1032;
                    int iLastIndexOf10 = 14 - TextUtils.lastIndexOf(str, '0');
                    byte[] bArr65 = $$d;
                    Object[] objArr128 = new Object[1];
                    f(bArr65[10], (short) (bArr65[0] + 1), (byte) (bArr65[1] + 1), objArr128);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b(maximumFlingVelocity3, iIndexOf15, iLastIndexOf10, 1357589585, false, (String) objArr128[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).set(null, lValueOf22);
            } catch (Exception unused10) {
                throw new RuntimeException();
            }
        }
        int i272 = ((int[]) objArr12[1])[0];
        int i273 = ((int[]) objArr12[3])[0];
        if (i273 == i272) {
            int i274 = d + 33;
            f771a = i274 % 128;
            int i275 = i274 % 2;
            Object[] objArr129 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i276 = ((int[]) objArr12[2])[0];
            int i277 = ((int[]) objArr12[3])[0];
            int i278 = ((int[]) objArr12[1])[0];
            String[] strArr17 = (String[]) objArr12[0];
            int startUptimeMillis3 = (int) Process.getStartUptimeMillis();
            int i279 = i276 + (-754702767) + (((~(185797917 | startUptimeMillis3)) | (-430078088)) * (-964)) + (((~((~startUptimeMillis3) | 185797917)) | (-464747936)) * (-964));
            int i280 = (i279 << 13) ^ i279;
            int i281 = i280 ^ (i280 >>> 17);
            i5 = 0;
            ((int[]) objArr129[2])[0] = i281 ^ (i281 << 5);
        } else {
            ArrayList arrayList8 = new ArrayList();
            String[] strArr18 = (String[]) objArr12[0];
            if (strArr18 != null) {
                for (String str16 : strArr18) {
                    arrayList8.add(str16);
                }
            }
            int[] iArr11 = new int[i273];
            int i282 = i273 - 1;
            iArr11[i282] = 1;
            Toast.makeText((Context) null, iArr11[((i273 * i282) % 2) - 1], 1).show();
            Object[] objArr130 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i283 = ((int[]) objArr12[2])[0];
            int i284 = ((int[]) objArr12[3])[0];
            int i285 = ((int[]) objArr12[1])[0];
            String[] strArr19 = (String[]) objArr12[0];
            int iNextInt3 = new Random().nextInt(893023223);
            int i286 = ~iNextInt3;
            int i287 = i283 + 433629483 + (((~(603421361 | i286)) | (~((-847701532) | iNextInt3))) * (-370)) + (((~(iNextInt3 | 603421361)) | (~(i286 | (-847701532))) | 24189088) * (-370)) + 360027968;
            int i288 = (i287 << 13) ^ i287;
            int i289 = i288 ^ (i288 >>> 17);
            i5 = 0;
            ((int[]) objArr130[2])[0] = i289 ^ (i289 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
            char c13 = (char) (53893 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
            int iGreen = 1320 - Color.green(i5);
            int i290 = 36 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            byte[] bArr66 = $$d;
            Object[] objArr131 = new Object[1];
            f((byte) (bArr66[19] - 1), (short) 140, bArr66[7], objArr131);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b(c13, iGreen, i290, -1433084963, false, (String) objArr131[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
                char tapTimeout3 = (char) (53893 - (ViewConfiguration.getTapTimeout() >> 16));
                int i291 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1321;
                int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 36;
                byte[] bArr67 = $$d;
                byte b20 = bArr67[10];
                short s15 = bArr67[80];
                Object[] objArr132 = new Object[1];
                f(b20, s15, (byte) (s15 & 52), objArr132);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b(tapTimeout3, i291, pressedStateDuration, -1920778747, false, (String) objArr132[0], null);
            }
            Object[] objArr133 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).get(null);
            objArr13 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i292 = ((int[]) objArr133[0])[0];
            int i293 = ((int[]) objArr133[3])[0];
            String[] strArr20 = (String[]) objArr133[2];
            int iIdentityHashCode11 = System.identityHashCode(this);
            int i294 = (-1101396824) + (((~(1224502974 | iIdentityHashCode11)) | 102400) * (-140)) + ((~(1224605374 | iIdentityHashCode11)) * 70) + (((~(iIdentityHashCode11 | 146124850)) | 1078582924) * 70) + 1681657354;
            int i295 = (i294 << 13) ^ i294;
            int i296 = i295 ^ (i295 >>> 17);
            ((int[]) objArr13[1])[0] = i296 ^ (i296 << 5);
        } else {
            if (applicationContext2 != null) {
                applicationContext2 = ((applicationContext2 instanceof ContextWrapper) && ((ContextWrapper) applicationContext2).getBaseContext() == null) ? null : context.getApplicationContext();
            }
            int iIntValue5 = ((Integer) Class.forName(str6).getMethod(str3, Object.class).invoke(null, this)).intValue();
            Object[] objArr134 = {-1111870382};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b((char) (TextUtils.indexOf((CharSequence) str, '0', 0) + 47978), 1299 - TextUtils.indexOf((CharSequence) str, '0', 0, 0), 20 - (ViewConfiguration.getFadingEdgeLength() >> 16), -420973425, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr135 = {applicationContext2, "com.bpjstku", 1681657354, Integer.valueOf(iIntValue5), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).newInstance(objArr134), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
                char pressedStateDuration2 = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 53893);
                int doubleTapTimeout5 = 1320 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int keyRepeatTimeout5 = 36 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                byte[] bArr68 = $$d;
                byte b21 = bArr68[10];
                short s16 = bArr68[80];
                Object[] objArr136 = new Object[1];
                f(b21, s16, (byte) (s16 & 52), objArr136);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(pressedStateDuration2, doubleTapTimeout5, keyRepeatTimeout5, 819724799, false, (String) objArr136[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.indexOf(str, str, 0) + 57878), 1394 - Color.alpha(0), 76 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), Boolean.TYPE});
            }
            objArr13 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).invoke(null, objArr135);
            if (applicationContext2 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault71 == null) {
                    char capsMode2 = (char) (53893 - TextUtils.getCapsMode(str, 0, 0));
                    int fadingEdgeLength4 = 1320 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int trimmedLength3 = TextUtils.getTrimmedLength(str) + 36;
                    byte[] bArr69 = $$d;
                    byte b22 = bArr69[10];
                    short s17 = bArr69[80];
                    Object[] objArr137 = new Object[1];
                    f(b22, s17, (byte) (s17 & 52), objArr137);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.b(capsMode2, fadingEdgeLength4, trimmedLength3, -1920778747, false, (String) objArr137[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault71).set(null, objArr13);
                try {
                    long jLongValue18 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf23 = Long.valueOf(jLongValue18);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault72 == null) {
                        char modifierMetaStateMask3 = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 53894);
                        int touchSlop4 = (ViewConfiguration.getTouchSlop() >> 8) + 1320;
                        int i297 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 36;
                        byte[] bArr70 = $$d;
                        Object[] objArr138 = new Object[1];
                        f(bArr70[10], bArr70[1], (byte) ($$e >>> 2), objArr138);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.b(modifierMetaStateMask3, touchSlop4, i297, -1273706634, false, (String) objArr138[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault72).set(null, lValueOf23);
                    Long lValueOf24 = Long.valueOf(jLongValue18 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault73 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault73 == null) {
                        char packedPositionGroup4 = (char) (53893 - ExpandableListView.getPackedPositionGroup(0L));
                        int absoluteGravity3 = Gravity.getAbsoluteGravity(0, 0) + 1320;
                        int i298 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 35;
                        byte[] bArr71 = $$d;
                        Object[] objArr139 = new Object[1];
                        f((byte) (bArr71[19] - 1), (short) 140, bArr71[7], objArr139);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault73 = initSession.b(packedPositionGroup4, absoluteGravity3, i298, -1433084963, false, (String) objArr139[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault73).set(null, lValueOf24);
                } catch (Exception unused11) {
                    throw new RuntimeException();
                }
            }
        }
        int i299 = ((int[]) objArr13[3])[0];
        int i300 = ((int[]) objArr13[0])[0];
        if (i300 != i299) {
            throw new RuntimeException(String.valueOf(i300));
        }
        Object[] objArr140 = {new int[]{i}, new int[1], strArr, new int[]{i}};
        int i301 = ((int[]) objArr13[1])[0];
        int i302 = ((int[]) objArr13[0])[0];
        int i303 = ((int[]) objArr13[3])[0];
        String[] strArr21 = (String[]) objArr13[2];
        int iIdentityHashCode12 = System.identityHashCode(this);
        int i304 = ~iIdentityHashCode12;
        int i305 = 984096008 + (((~(1305481452 | i304)) | 35786240) * (-1188));
        int i306 = (~(iIdentityHashCode12 | (-1305481453))) | 35786240;
        int i307 = ~(65146372 | i304);
        int i308 = i301 + i305 + ((i306 | i307) * 594) + (((~((-1305481453) | i304)) | 1276121320 | i307) * 594);
        int i309 = (i308 << 13) ^ i308;
        int i310 = i309 ^ (i309 >>> 17);
        ((int[]) objArr140[1])[0] = i310 ^ (i310 << 5);
    }

    public final void zab() {
        synchronized (this) {
            Context context = this.zaa;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.zaa = null;
        }
    }

    public final void zaa(Context context) {
        Object[] objArr;
        char c;
        Context applicationContext = context;
        int i = 2 % 2;
        int i2 = f771a + 95;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.zaa = applicationContext;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
            int mode = View.MeasureSpec.getMode(0) + 2267;
            int iGreen = Color.green(0) + 33;
            byte[] bArr = $$d;
            byte b2 = bArr[10];
            short s = bArr[80];
            Object[] objArr2 = new Object[1];
            f(b2, s, (byte) (s & 52), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(windowTouchSlop, mode, iGreen, -887667012, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{4898, 4931, 2666, 39341, 39600, 48518, 12955, 34834, 24041, 31625, 51220, 33187, 36357, 43311, 31026, 53250, 63671, 58955, 44748, 11920, 10719, 22487, 56328, 32246, 39541, 34075}, -ImageFormat.getBitsPerPixel(0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{10621, 10520, 24704, 62277, 12641, 5714, 38256, 12283, 26538, 4461, 25536, 9782, 46160, 50133, 53924, 30668, 49912, 36029, 1289}, 1 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c2 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 2268;
            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 33;
            byte[] bArr2 = $$d;
            Object[] objArr5 = new Object[1];
            f(bArr2[10], (short) (bArr2[0] + 1), (byte) (bArr2[1] + 1), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, modifierMetaStateMask, iResolveSizeAndState, -874156483, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cAlpha = (char) Color.alpha(0);
                int iAxisFromString = 2266 - MotionEvent.axisFromString("");
                int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 33;
                byte[] bArr3 = $$d;
                Object[] objArr6 = new Object[1];
                f(bArr3[10], bArr3[1], (byte) ($$e >>> 2), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cAlpha, iAxisFromString, iIndexOf, -654680577, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i4 = ((int[]) objArr7[0])[0];
            int i5 = ((int[]) objArr7[3])[0];
            String[] strArr = (String[]) objArr7[1];
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i6 = (-101594297) + (((~(799800283 | iUptimeMillis)) | 8913032) * (-756)) + (((~iUptimeMillis) | 799800283) * 756) + 1413291102;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[2])[0] = i8 ^ (i8 << 5);
            c = 3;
        } else {
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : context.getApplicationContext();
            }
            Object[] objArr8 = new Object[1];
            e(2060405377 - Color.red(0), (-6) - Gravity.getAbsoluteGravity(0, 0), (short) (ViewConfiguration.getTouchSlop() >> 8), (byte) ((Process.getThreadPriority(0) + 20) >> 6), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1968552716, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{39601, 39640, 31217, 59964, 51890, 60805, 19679, 63050, 54369, 2072, 38919, 65452, 1969, 55980, 10604, 44641, 28958, 38342, 65247, 20680}, -TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            int i9 = f771a + 63;
            d = i9 % 128;
            int i10 = i9 % 2;
            try {
                Object[] objArr10 = {applicationContext, Integer.valueOf(iIntValue), 0, 1413291102};
                byte[] bArr4 = $$g;
                short s2 = bArr4[0];
                Object[] objArr11 = new Object[1];
                g(s2, (byte) s2, bArr4[10], objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                Object[] objArr12 = new Object[1];
                g((short) 140, (byte) (-bArr4[97]), bArr4[5], objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                if (applicationContext != null) {
                    int i11 = f771a + 65;
                    d = i11 % 128;
                    int i12 = i11 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c3 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2267;
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 33;
                        byte[] bArr5 = $$d;
                        Object[] objArr13 = new Object[1];
                        f(bArr5[10], bArr5[1], (byte) ($$e >>> 2), objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c3, scrollDefaultDelay, packedPositionType, -654680577, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr14 = new Object[1];
                        c(new char[]{4898, 4931, 2666, 39341, 39600, 48518, 12955, 34834, 24041, 31625, 51220, 33187, 36357, 43311, 31026, 53250, 63671, 58955, 44748, 11920, 10719, 22487, 56328, 32246, 39541, 34075}, 1 - Color.alpha(0), objArr14);
                        Class<?> cls4 = Class.forName((String) objArr14[0]);
                        Object[] objArr15 = new Object[1];
                        c(new char[]{10621, 10520, 24704, 62277, 12641, 5714, 38256, 12283, 26538, 4461, 25536, 9782, 46160, 50133, 53924, 30668, 49912, 36029, 1289}, -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr15);
                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char mode2 = (char) View.MeasureSpec.getMode(0);
                            int defaultSize = View.getDefaultSize(0, 0) + 2267;
                            int iAlpha = 33 - Color.alpha(0);
                            byte[] bArr6 = $$d;
                            Object[] objArr16 = new Object[1];
                            f(bArr6[10], (short) (bArr6[0] + 1), (byte) (bArr6[1] + 1), objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(mode2, defaultSize, iAlpha, -874156483, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 2267;
                            int trimmedLength = TextUtils.getTrimmedLength("") + 33;
                            byte[] bArr7 = $$d;
                            byte b3 = bArr7[10];
                            short s3 = bArr7[80];
                            Object[] objArr17 = new Object[1];
                            f(b3, s3, (byte) (s3 & 52), objArr17);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cCombineMeasuredStates, scrollBarSize, trimmedLength, -887667012, false, (String) objArr17[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                c = 3;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i13 = ((int[]) objArr[c])[0];
        int i14 = ((int[]) objArr[0])[0];
        if (i14 == i13) {
            int i15 = f771a + 109;
            d = i15 % 128;
            int i16 = i15 % 2;
            Object[] objArr18 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i17 = ((int[]) objArr[2])[0];
            int i18 = ((int[]) objArr[0])[0];
            int i19 = ((int[]) objArr[3])[0];
            String[] strArr2 = (String[]) objArr[1];
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i20 = i17 + (((~((-872337866) | startElapsedRealtime)) | 63623489) * (-283)) + 1634291518 + ((~(startElapsedRealtime | (-808714377))) * 283);
            int i21 = i20 ^ (i20 << 13);
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr18[2])[0] = i22 ^ (i22 << 5);
            return;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr3 = (String[]) objArr[1];
        if (strArr3 != null) {
            int i23 = f771a + 29;
            d = i23 % 128;
            int i24 = 2;
            int i25 = i23 % 2;
            int i26 = 0;
            while (i26 < strArr3.length) {
                int i27 = d + 35;
                f771a = i27 % 128;
                if (i27 % i24 == 0) {
                    arrayList.add(strArr3[i26]);
                    i26 += 109;
                } else {
                    arrayList.add(strArr3[i26]);
                    i26++;
                }
                i24 = 2;
            }
        }
        int[] iArr = new int[i14];
        int i28 = i14 - 1;
        iArr[i28] = 1;
        Toast.makeText((Context) null, iArr[((i14 * i28) % 2) - 1], 1).show();
        Object[] objArr19 = {new int[]{i}, strArr, new int[1], new int[]{i}};
        int i29 = ((int[]) objArr[2])[0];
        int i30 = ((int[]) objArr[0])[0];
        int i31 = ((int[]) objArr[3])[0];
        String[] strArr4 = (String[]) objArr[1];
        int i32 = ~((int) Runtime.getRuntime().totalMemory());
        int i33 = i29 + 1268763183 + ((~(536080371 | i32)) * 52) + (((~(482528626 | i32)) | (~((-326184690) | i32)) | 53551745) * (-52)) + (((~(i32 | (-482528627))) | 209895682) * 52);
        int i34 = (i33 << 13) ^ i33;
        int i35 = i34 ^ (i34 >>> 17);
        ((int[]) objArr19[2])[0] = i35 ^ (i35 << 5);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0b57  */
    /* JADX WARN: Code duplicated, block: B:102:0x0b5a  */
    /* JADX WARN: Code duplicated, block: B:103:0x0b6b  */
    /* JADX WARN: Code duplicated, block: B:105:0x0b6f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:113:0x0b9d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0bf8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:117:0x0bf9  */
    /* JADX WARN: Code duplicated, block: B:119:0x0bfe  */
    /* JADX WARN: Code duplicated, block: B:130:0x0853 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x0974 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x0956 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x0956 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x0956 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x0956 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x0956 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:21:0x011f  */
    /* JADX WARN: Code duplicated, block: B:32:0x049b  */
    /* JADX WARN: Code duplicated, block: B:34:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:37:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:42:0x0537  */
    /* JADX WARN: Code duplicated, block: B:44:0x0557 A[Catch: all -> 0x096b, TRY_LEAVE, TryCatch #1 {all -> 0x096b, blocks: (B:22:0x0121, B:24:0x0197, B:26:0x022a, B:28:0x029d, B:30:0x0324, B:35:0x04ab, B:43:0x0541, B:47:0x05cc, B:50:0x0626, B:44:0x0557, B:38:0x04bb), top: B:128:0x0121 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0626 A[Catch: all -> 0x096b, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x096b, blocks: (B:22:0x0121, B:24:0x0197, B:26:0x022a, B:28:0x029d, B:30:0x0324, B:35:0x04ab, B:43:0x0541, B:47:0x05cc, B:50:0x0626, B:44:0x0557, B:38:0x04bb), top: B:128:0x0121 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x07ac  */
    /* JADX WARN: Code duplicated, block: B:55:0x07c3  */
    /* JADX WARN: Code duplicated, block: B:57:0x07d3  */
    /* JADX WARN: Code duplicated, block: B:58:0x07e2  */
    /* JADX WARN: Code duplicated, block: B:61:0x0818  */
    /* JADX WARN: Code duplicated, block: B:62:0x082e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0866  */
    /* JADX WARN: Code duplicated, block: B:70:0x08b3  */
    /* JADX WARN: Code duplicated, block: B:74:0x090a A[Catch: all -> 0x0c0a, TryCatch #0 {all -> 0x0c0a, blocks: (B:88:0x09bb, B:90:0x09c8, B:91:0x0a05, B:93:0x0a23, B:94:0x0a6c, B:72:0x08f6, B:74:0x090a, B:75:0x0946), top: B:126:0x08f6 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x097b  */
    /* JADX WARN: Code duplicated, block: B:90:0x09c8 A[Catch: all -> 0x0c0a, TryCatch #0 {all -> 0x0c0a, blocks: (B:88:0x09bb, B:90:0x09c8, B:91:0x0a05, B:93:0x0a23, B:94:0x0a6c, B:72:0x08f6, B:74:0x090a, B:75:0x0946), top: B:126:0x08f6 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0a23 A[Catch: all -> 0x0c0a, TryCatch #0 {all -> 0x0c0a, blocks: (B:88:0x09bb, B:90:0x09c8, B:91:0x0a05, B:93:0x0a23, B:94:0x0a6c, B:72:0x08f6, B:74:0x090a, B:75:0x0946), top: B:126:0x08f6 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0b09  */
    /* JADX WARN: Code duplicated, block: B:99:0x0b48  */
    public static int b(List list) throws Throwable {
        Class[] clsArr;
        Class<Function0> cls;
        char c;
        Method[] declaredMethods;
        int length;
        int i;
        Method method;
        Object[] objArr;
        Class<?> cls2;
        Object[] objArr2;
        int i2;
        Class cls3;
        int i3;
        int iTuitionPaymentFragmentbindingInflater1;
        int iIndexOf;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int iTuitionPaymentFragmentbindingInflater2;
        int i9;
        int i10;
        Class<?> cls4;
        Object[] objArr3;
        Object[] objArr4;
        int i11;
        int i12;
        int packedPositionGroup;
        char c2;
        int i13;
        short maximumFlingVelocity;
        int packedPositionType;
        int i14;
        Object obj;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        int i15;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8;
        long j;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z;
        int i20;
        int i21;
        String string;
        int i22;
        int i23;
        int i24 = 2 % 2;
        int i25 = d;
        int i26 = ((i25 | 47) << 1) - (i25 ^ 47);
        f771a = i26 % 128;
        int i27 = i26 % 2;
        Method[] methodArr = new Method[1];
        int i28 = 0;
        byte b2 = (byte) 0;
        byte b3 = b2;
        Object[] objArr5 = new Object[1];
        h(b2, b3, b3, objArr5);
        String str = (String) objArr5[0];
        int i29 = d + 99;
        int i30 = i29 % 128;
        f771a = i30;
        if (i29 % 2 == 0) {
            clsArr = new Class[4];
            clsArr[1] = String.class;
            cls = Function0.class;
            c = 0;
        } else {
            clsArr = new Class[2];
            clsArr[0] = String.class;
            cls = Function0.class;
            c = 1;
        }
        int i31 = ((i30 | 113) << 1) - (i30 ^ 113);
        d = i31 % 128;
        int i32 = -2001519171;
        int i33 = 16;
        Class<?>[] clsArr2 = null;
        if (i31 % 2 == 0) {
            clsArr[c] = cls;
            methodArr[0] = CertificatePinner.class.getMethod(str, clsArr);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 2823;
                int scrollDefaultDelay = 22 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                byte[] bArr = $$d;
                Object[] objArr6 = new Object[1];
                f(bArr[10], (short) 140, (byte) (bArr[1] + 1), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(doubleTapTimeout, iNormalizeMetaState, scrollDefaultDelay, 1814927978, false, (String) objArr6[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).get(null) == null) {
                declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) KeyEvent.getDeadChar(0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2822, 23 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))).getDeclaredMethods();
                length = declaredMethods.length;
                i = 0;
                while (true) {
                    if (i < length) {
                        method = declaredMethods[i];
                        int i34 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        int i35 = ((i34 | 2060405376) << 1) - (i34 ^ 2060405376);
                        int scrollDefaultDelay2 = ViewConfiguration.getScrollDefaultDelay() >> i33;
                        int iTuitionPaymentFragmentbindingInflater3 = zzo.TuitionPaymentFragmentbindingInflater1();
                        int i36 = ~iTuitionPaymentFragmentbindingInflater3;
                        int i37 = ~((5 ^ i36) | (5 & i36));
                        int i38 = ~((5 ^ scrollDefaultDelay2) | (5 & scrollDefaultDelay2));
                        int i39 = (((scrollDefaultDelay2 * (-244)) - 1476) - (~(-(-(((i37 ^ i38) | (i37 & i38)) * (-245)))))) - 1;
                        int i40 = -(-((~((5 ^ iTuitionPaymentFragmentbindingInflater3) | (5 & iTuitionPaymentFragmentbindingInflater3))) * (-245)));
                        int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
                        int i42 = (scrollDefaultDelay2 | (~(5 | iTuitionPaymentFragmentbindingInflater3))) * 245;
                        int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
                        int i44 = -Process.getGidForName("");
                        short s = (short) ((i44 ^ (-1)) + (i44 << 1));
                        byte bRgb = (byte) (Color.rgb(i28, i28, i28) + 16777216);
                        int i45 = d;
                        int i46 = (i45 & 75) + (i45 | 75);
                        f771a = i46 % 128;
                        int i47 = i46 % 2;
                        Object[] objArr7 = new Object[1];
                        e(i35, i43, s, bRgb, 1968552795 - TextUtils.indexOf((CharSequence) "", '0', i28), objArr7);
                        Class<?> cls5 = Class.forName((String) objArr7[i28]);
                        char[] cArr = new char[i33];
                        // fill-array-data instruction
                        cArr[0] = 20490;
                        cArr[1] = 20589;
                        cArr[2] = 43099;
                        cArr[3] = 15255;
                        cArr[4] = 37151;
                        cArr[5] = 46649;
                        cArr[6] = 48738;
                        cArr[7] = 1236;
                        cArr[8] = 7873;
                        cArr[9] = 55742;
                        cArr[10] = 50086;
                        cArr[11] = 3373;
                        cArr[12] = 52523;
                        cArr[13] = 2819;
                        cArr[14] = 29393;
                        cArr[15] = 23780;
                        int i48 = -(ViewConfiguration.getScrollDefaultDelay() >> i33);
                        int iTuitionPaymentFragmentbindingInflater4 = zzo.TuitionPaymentFragmentbindingInflater1();
                        int i49 = i48 * (-129);
                        int i50 = (i49 ^ 131) + ((i49 & 131) << 1);
                        int i51 = ~iTuitionPaymentFragmentbindingInflater4;
                        int i52 = ((-2) ^ i51) | ((-2) & i51);
                        int i53 = (~((i52 ^ i48) | (i52 & i48))) * 130;
                        int i54 = (((i50 | i53) << 1) - (i50 ^ i53)) + ((~((-2) | i48)) * (-260));
                        int i55 = ~((~i48) | 1);
                        int i56 = ((-2) ^ i48) | (i48 & (-2));
                        int i57 = ~((i56 & iTuitionPaymentFragmentbindingInflater4) | (i56 ^ iTuitionPaymentFragmentbindingInflater4));
                        int i58 = -(-(((i57 & i55) | (i55 ^ i57)) * 130));
                        int i59 = ((i54 | i58) << 1) - (i54 ^ i58);
                        Object[] objArr8 = new Object[1];
                        c(cArr, i59, objArr8);
                        int iIntValue = ((Integer) cls5.getMethod((String) objArr8[i28], clsArr2).invoke(method, clsArr2)).intValue();
                        int i60 = f771a;
                        int i61 = ((i60 | 89) << 1) - (i60 ^ 89);
                        d = i61 % 128;
                        int i62 = i61 % 2;
                        objArr = new Object[1];
                        objArr[i28] = Integer.valueOf(iIntValue);
                        int i63 = -TextUtils.indexOf("", "", i28);
                        int iTuitionPaymentFragmentbindingInflater5 = zzo.TuitionPaymentFragmentbindingInflater1();
                        int i64 = i63 * 71;
                        int i65 = (i64 & (-434050245)) + (i64 | (-434050245));
                        int i66 = ~i63;
                        int i67 = ~((i66 ^ 2060405377) | (i66 & 2060405377));
                        int i68 = ~(iTuitionPaymentFragmentbindingInflater5 | 2060405377);
                        int i69 = ((i67 ^ i68) | (i68 & i67)) * (-140);
                        int i70 = ((i65 | i69) << 1) - (i69 ^ i65);
                        int i71 = (i63 ^ 2060405377) | (i63 & 2060405377);
                        int i72 = (i70 - (~(-(-((~((i71 & iTuitionPaymentFragmentbindingInflater5) | (i71 ^ iTuitionPaymentFragmentbindingInflater5))) * 70))))) - 1;
                        int i73 = ~((-2060405378) | i63);
                        int i74 = (i73 & i67) | (i67 ^ i73);
                        int i75 = ~((i63 & iTuitionPaymentFragmentbindingInflater5) | (i63 ^ iTuitionPaymentFragmentbindingInflater5));
                        int i76 = i72 + (((i74 & i75) | (i74 ^ i75)) * 70);
                        long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
                        int i77 = f771a;
                        int i78 = (i77 & 93) + (i77 | 93);
                        d = i78 % 128;
                        int i79 = i78 % 2;
                        int i80 = (jCurrentThreadTimeMillis > (-1L) ? 1 : (jCurrentThreadTimeMillis == (-1L) ? 0 : -1));
                        int iTuitionPaymentFragmentbindingInflater6 = zzo.TuitionPaymentFragmentbindingInflater1();
                        int i81 = i80 * (-337);
                        int i82 = (i81 ^ (-2373)) + ((i81 & (-2373)) << 1);
                        int i83 = ~i80;
                        int i84 = ~iTuitionPaymentFragmentbindingInflater6;
                        int i85 = ~((i83 ^ i84) | (i83 & i84));
                        int i86 = ~(6 | i80);
                        int i87 = (i85 ^ i86) | (i85 & i86);
                        int i88 = ~(i80 | iTuitionPaymentFragmentbindingInflater6);
                        int i89 = -(-(((i87 ^ i88) | (i87 & i88)) * (-338)));
                        int i90 = ((i82 | i89) << 1) - (i89 ^ i82);
                        int i91 = ~i80;
                        int i92 = -(-((~(i91 | (-7))) * 338));
                        int i93 = i80 | (-7);
                        int i94 = (i90 & i92) + (i92 | i90) + (((~((i93 & iTuitionPaymentFragmentbindingInflater6) | (i93 ^ iTuitionPaymentFragmentbindingInflater6))) | (~((i91 & i84) | (i91 ^ i84)))) * 338);
                        int i95 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        int iTuitionPaymentFragmentbindingInflater7 = zzo.TuitionPaymentFragmentbindingInflater1();
                        int i96 = i95 * 980;
                        int i97 = d + 93;
                        f771a = i97 % 128;
                        int i98 = i97 % 2;
                        int i99 = ((((i96 ^ 978) + ((i96 & 978) << 1)) - (~(-(-((~(~iTuitionPaymentFragmentbindingInflater7)) * 979))))) - 1) + ((i95 | iTuitionPaymentFragmentbindingInflater7) * (-979));
                        int i100 = ~iTuitionPaymentFragmentbindingInflater7;
                        int i101 = ~(i95 | (~iTuitionPaymentFragmentbindingInflater7));
                        short s2 = (short) ((i99 - (~(((i101 & i100) | (i100 ^ i101)) * 979))) - 1);
                        char mirror = AndroidCharacter.getMirror('0');
                        int iTuitionPaymentFragmentbindingInflater8 = zzo.TuitionPaymentFragmentbindingInflater1();
                        int i102 = mirror * 866;
                        int i103 = (i102 ^ 41472) + ((i102 & 41472) << 1);
                        int i104 = ~mirror;
                        int i105 = ~iTuitionPaymentFragmentbindingInflater8;
                        int i106 = (((i103 - (~(-(-((47 | (~(i104 | i105))) * (-865)))))) - 1) - (~((~((mirror ^ iTuitionPaymentFragmentbindingInflater8) | (mirror & iTuitionPaymentFragmentbindingInflater8))) * 865))) - 1;
                        int i107 = ~((~iTuitionPaymentFragmentbindingInflater8) | 47);
                        int i108 = ~((i105 ^ mirror) | (mirror & i105));
                        byte b4 = (byte) ((i106 - (~(((i107 & i108) | (i107 ^ i108)) * 865))) - 1);
                        int iResolveOpacity = Drawable.resolveOpacity(i28, i28);
                        int i109 = (iResolveOpacity ^ 1968552820) + ((iResolveOpacity & 1968552820) << 1);
                        Object[] objArr9 = new Object[1];
                        e(i76, i94, s2, b4, i109, objArr9);
                        cls2 = Class.forName((String) objArr9[i28]);
                        int i110 = 2060405375 - (~(-(-(ViewConfiguration.getJumpTapTimeout() >> i33))));
                        int mode = View.MeasureSpec.getMode(i28);
                        int iTuitionPaymentFragmentbindingInflater9 = zzo.TuitionPaymentFragmentbindingInflater1();
                        int i111 = (mode * 866) + 5184;
                        int i112 = ~mode;
                        int i113 = ~iTuitionPaymentFragmentbindingInflater9;
                        int i114 = ~((i112 ^ i113) | (i112 & i113));
                        int i115 = ((5 ^ i114) | (5 & i114)) * (-865);
                        int i116 = ((i111 | i115) << 1) - (i111 ^ i115);
                        int i117 = (~(mode | iTuitionPaymentFragmentbindingInflater9)) * 865;
                        int i118 = ((i116 | i117) << 1) - (i116 ^ i117);
                        int i119 = ~((5 & i113) | (5 ^ i113));
                        int i120 = ~(mode | (~iTuitionPaymentFragmentbindingInflater9));
                        int i121 = -(-(((i120 & i119) | (i119 ^ i120)) * 865));
                        int i122 = (i118 & i121) + (i121 | i118);
                        short modifierMetaStateMask = (short) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
                        int i123 = -(ExpandableListView.getPackedPositionForChild(i28, i28) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i28, i28) == 0L ? 0 : -1));
                        int iTuitionPaymentFragmentbindingInflater10 = zzo.TuitionPaymentFragmentbindingInflater1();
                        int i124 = i123 * 592;
                        int i125 = (i124 & 590) + (i124 | 590);
                        int i126 = ~i123;
                        int i127 = (~((~i126) | i126)) * (-1182);
                        int i128 = ((i125 | i127) << 1) - (i127 ^ i125);
                        int i129 = ~i123;
                        int i130 = ~iTuitionPaymentFragmentbindingInflater10;
                        int i131 = (~((i130 & i129) | (i129 ^ i130))) * (-591);
                        int i132 = ((i128 | i131) << 1) - (i131 ^ i128);
                        int i133 = ((i129 & iTuitionPaymentFragmentbindingInflater10) | (iTuitionPaymentFragmentbindingInflater10 ^ i129)) * 591;
                        byte b5 = (byte) ((i132 & i133) + (i133 | i132));
                        int i134 = -(ViewConfiguration.getScrollBarSize() >> 8);
                        int iTuitionPaymentFragmentbindingInflater11 = zzo.TuitionPaymentFragmentbindingInflater1();
                        int i135 = i134 * (-167);
                        int i136 = ((i135 | 1964156510) << 1) - (i135 ^ 1964156510);
                        int i137 = ~((~i134) | (-1968552847));
                        int i138 = ~((-1968552847) | iTuitionPaymentFragmentbindingInflater11);
                        int i139 = -(-(((i137 ^ i138) | (i138 & i137)) * 336));
                        int i140 = ((i136 | i139) << 1) - (i136 ^ i139);
                        int i141 = ~((i134 ^ 1968552846) | (1968552846 & i134));
                        int i142 = ~((i134 ^ iTuitionPaymentFragmentbindingInflater11) | (i134 & iTuitionPaymentFragmentbindingInflater11));
                        int i143 = -(-(((i141 ^ i142) | (i141 & i142)) * (-168)));
                        int i144 = ((i140 | i143) << 1) - (i143 ^ i140);
                        int i145 = ~iTuitionPaymentFragmentbindingInflater11;
                        int i146 = ~((i145 & i134) | (i145 ^ i134));
                        int i147 = i144 + (((i146 & (-1968552847)) | ((-1968552847) ^ i146)) * 168);
                        objArr2 = new Object[1];
                        e(i110, i122, modifierMetaStateMask, b5, i147, objArr2);
                        if (((Boolean) cls2.getMethod((String) objArr2[0], Integer.TYPE).invoke(null, objArr)).booleanValue()) {
                            i2 = d + 5;
                            f771a = i2 % 128;
                            if (i2 % 2 == 0) {
                                cls3 = Long.TYPE;
                                iIndexOf = TextUtils.indexOf((CharSequence) "", 'n');
                                iTuitionPaymentFragmentbindingInflater1 = zzo.TuitionPaymentFragmentbindingInflater1();
                                i3 = 319 % iIndexOf;
                            } else {
                                cls3 = Long.TYPE;
                                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0');
                                i3 = iIndexOf2 * 319;
                                iTuitionPaymentFragmentbindingInflater1 = zzo.TuitionPaymentFragmentbindingInflater1();
                                iIndexOf = iIndexOf2;
                            }
                            int i148 = (i3 ^ (-313475834)) + ((i3 & (-313475834)) << 1);
                            int i149 = ~iIndexOf;
                            int i150 = ~((i149 & iTuitionPaymentFragmentbindingInflater1) | (i149 ^ iTuitionPaymentFragmentbindingInflater1));
                            int i151 = -(-(((i150 & (-2060405379)) | ((-2060405379) ^ i150)) * (-318)));
                            int i152 = (i148 & i151) + (i151 | i148);
                            int i153 = ~(((-2060405379) ^ iTuitionPaymentFragmentbindingInflater1) | ((-2060405379) & iTuitionPaymentFragmentbindingInflater1));
                            int i154 = d;
                            int i155 = i154 + 13;
                            f771a = i155 % 128;
                            int i156 = i155 % 2;
                            int i157 = ~iTuitionPaymentFragmentbindingInflater1;
                            int i158 = ~((i157 ^ iIndexOf) | (i157 & iIndexOf) | 2060405378);
                            int i159 = -(-(TypedValues.AttributesType.TYPE_PIVOT_TARGET * ((i153 ^ i158) | (i153 & i158))));
                            i4 = ((i152 | i159) << 1) - (i152 ^ i159);
                            int i160 = ((-2060405379) & i157) | ((-2060405379) ^ i157);
                            int i161 = ~((i160 & iIndexOf) | (i160 ^ iIndexOf));
                            int i162 = (iIndexOf & 2060405378) | (iIndexOf ^ 2060405378);
                            int i163 = i154 + 73;
                            f771a = i163 % 128;
                            i5 = i163 % 2;
                            int i164 = ~((i162 & iTuitionPaymentFragmentbindingInflater1) | (i162 ^ iTuitionPaymentFragmentbindingInflater1));
                            i6 = (i164 & i161) | (i161 ^ i164);
                            if (i5 == 0) {
                                int i165 = -i6;
                                i7 = i4 >> (((i165 | TypedValues.AttributesType.TYPE_PIVOT_TARGET) << 1) - (i165 ^ TypedValues.AttributesType.TYPE_PIVOT_TARGET));
                                i8 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 1.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 1.0d ? 0 : -1));
                                iTuitionPaymentFragmentbindingInflater2 = zzo.TuitionPaymentFragmentbindingInflater1();
                                i9 = ((i8 & 989) + (i8 | 989)) - 987;
                                i10 = 96;
                            } else {
                                int i166 = -(-(i6 * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
                                i7 = ((i4 | i166) << 1) - (i166 ^ i4);
                                i8 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                iTuitionPaymentFragmentbindingInflater2 = zzo.TuitionPaymentFragmentbindingInflater1();
                                int i167 = i8 * 989;
                                i9 = ((i167 & 5922) << 1) + (i167 ^ 5922);
                                i10 = -6;
                            }
                            int i168 = i7;
                            int i169 = ~i10;
                            int i170 = ~iTuitionPaymentFragmentbindingInflater2;
                            int i171 = (i169 ^ i170) | (i169 & i170);
                            int i172 = ~((i171 & i8) | (i171 ^ i8));
                            int i173 = ~((i8 ^ i10) | (i8 & i10) | iTuitionPaymentFragmentbindingInflater2);
                            int i174 = -(-(((i172 ^ i173) | (i172 & i173)) * 988));
                            int i175 = ((i9 | i174) << 1) - (i9 ^ i174);
                            int i176 = ~i10;
                            int i177 = (i175 - (~(((i8 ^ i176) | (i8 & i176)) * (-988)))) - 1;
                            int i178 = ~i8;
                            int i179 = (~(i169 | iTuitionPaymentFragmentbindingInflater2)) | (~((i178 ^ i176) | (i176 & i178)));
                            int i180 = d + 17;
                            f771a = i180 % 128;
                            int i181 = i180 % 2;
                            int i182 = ~(i8 | i170 | i10);
                            int i183 = (i177 - (~(-(-(988 * ((i179 & i182) | (i179 ^ i182))))))) - 1;
                            int iRgb = Color.rgb(0, 0, 0);
                            Object[] objArr10 = new Object[1];
                            e(i168, i183, (short) (((iRgb | 16777216) << 1) - (16777216 ^ iRgb)), (byte) (ViewConfiguration.getPressedStateDuration() >> 16), 1968552795 - (~(-View.MeasureSpec.getSize(0))), objArr10);
                            cls4 = Class.forName((String) objArr10[0]);
                            objArr3 = new Object[1];
                            c(new char[]{60631, 60592, 46083, 10191, 31345, 23895, 63995, 17234, 41494, 50678, 10452, 19135, 29169, 5994, 39348, 7009, 1886}, -TextUtils.lastIndexOf("", '0', 0, 0), objArr3);
                            if (cls3.equals(cls4.getMethod((String) objArr3[0], null).invoke(method, null))) {
                                int iGreen = Color.green(0);
                                int i184 = (iGreen ^ 2060405377) + ((iGreen & 2060405377) << 1);
                                int i185 = (-6) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                short longPressTimeout = (short) (ViewConfiguration.getLongPressTimeout() >> 16);
                                byte bIndexOf = (byte) TextUtils.indexOf("", "", 0);
                                int i186 = -(-Process.getGidForName(""));
                                int i187 = (i186 & 1968552797) + (i186 | 1968552797);
                                Object[] objArr11 = new Object[1];
                                e(i184, i185, longPressTimeout, bIndexOf, i187, objArr11);
                                Class<?> cls6 = Class.forName((String) objArr11[0]);
                                int i188 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                int iTuitionPaymentFragmentbindingInflater12 = zzo.TuitionPaymentFragmentbindingInflater1();
                                int i189 = (i188 * (-167)) - 490313778;
                                int i190 = ~i188;
                                int i191 = ~((i190 & (-2060405375)) | (i190 ^ (-2060405375)));
                                int i192 = ~((-2060405375) | iTuitionPaymentFragmentbindingInflater12);
                                int i193 = ((i191 & i192) | (i191 ^ i192)) * 336;
                                int i194 = (i189 ^ i193) + ((i189 & i193) << 1);
                                int i195 = ~((2060405374 & i188) | (i188 ^ 2060405374));
                                int i196 = ~((i188 ^ iTuitionPaymentFragmentbindingInflater12) | (i188 & iTuitionPaymentFragmentbindingInflater12));
                                int i197 = -(-(((i195 & i196) | (i195 ^ i196)) * (-168)));
                                int i198 = ~iTuitionPaymentFragmentbindingInflater12;
                                int i199 = ~((i188 & i198) | (i198 ^ i188));
                                int i200 = (i194 ^ i197) + ((i197 & i194) << 1) + (((i199 & (-2060405375)) | ((-2060405375) ^ i199)) * 168);
                                int jumpTapTimeout = ViewConfiguration.getJumpTapTimeout() >> 16;
                                int iTuitionPaymentFragmentbindingInflater13 = zzo.TuitionPaymentFragmentbindingInflater1();
                                int i201 = (jumpTapTimeout * (-515)) - 3102;
                                int i202 = ~((5 ^ iTuitionPaymentFragmentbindingInflater13) | (5 & iTuitionPaymentFragmentbindingInflater13));
                                int i203 = ~iTuitionPaymentFragmentbindingInflater13;
                                int i204 = ~(i203 | jumpTapTimeout);
                                int i205 = ((i202 & i204) | (i202 ^ i204) | (~((i203 ^ (-6)) | (i203 & (-6))))) * (-516);
                                int i206 = (i201 & i205) + (i201 | i205);
                                int i207 = ~jumpTapTimeout;
                                int i208 = ~((i207 ^ 5) | (i207 & 5) | iTuitionPaymentFragmentbindingInflater13);
                                int i209 = ~iTuitionPaymentFragmentbindingInflater13;
                                int i210 = (i209 & i207) | (i207 ^ i209);
                                int i211 = ~((i210 & (-6)) | (i210 ^ (-6)));
                                int i212 = i206 + (((i211 & i208) | (i208 ^ i211)) * 516);
                                int i213 = ~((i207 & (-6)) | (i207 ^ (-6)));
                                int i214 = ~((i203 ^ (-6)) | (i203 & (-6)));
                                int i215 = (i212 - (~(-(-(((i213 & i214) | (i213 ^ i214)) * 516))))) - 1;
                                short tapTimeout = (short) (ViewConfiguration.getTapTimeout() >> 16);
                                byte windowTouchSlop = (byte) (ViewConfiguration.getWindowTouchSlop() >> 8);
                                int i216 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                int iTuitionPaymentFragmentbindingInflater14 = zzo.TuitionPaymentFragmentbindingInflater1();
                                int i217 = (i216 * 71) + 1608806615;
                                int i218 = ~i216;
                                int i219 = ~((i218 & 1968552853) | (i218 ^ 1968552853));
                                int i220 = ~((iTuitionPaymentFragmentbindingInflater14 ^ 1968552853) | (iTuitionPaymentFragmentbindingInflater14 & 1968552853));
                                int i221 = -(-(((i219 ^ i220) | (i219 & i220)) * (-140)));
                                int i222 = (i217 ^ i221) + ((i217 & i221) << 1);
                                int i223 = -(-((~((i216 ^ 1968552853) | (i216 & 1968552853) | iTuitionPaymentFragmentbindingInflater14)) * 70));
                                int i224 = (i222 ^ i223) + ((i223 & i222) << 1);
                                int i225 = ~i216;
                                int i226 = ~((i225 & 1968552853) | (i225 ^ 1968552853));
                                int i227 = ~(((-1968552854) & i216) | ((-1968552854) ^ i216));
                                int i228 = (i226 & i227) | (i226 ^ i227);
                                int i229 = ~((i216 & iTuitionPaymentFragmentbindingInflater14) | (i216 ^ iTuitionPaymentFragmentbindingInflater14));
                                int i230 = -(-(((i229 & i228) | (i228 ^ i229)) * 70));
                                int i231 = (i224 ^ i230) + ((i230 & i224) << 1);
                                Object[] objArr12 = new Object[1];
                                e(i200, i215, tapTimeout, windowTouchSlop, i231, objArr12);
                                objArr4 = (Object[]) cls6.getMethod((String) objArr12[0], null).invoke(method, null);
                                if (objArr4.length == 2) {
                                    int i232 = f771a;
                                    int i233 = (i232 & 123) + (i232 | 123);
                                    d = i233 % 128;
                                    int i234 = i233 % 2;
                                    if (Long.TYPE.equals(objArr4[0])) {
                                        int i235 = d;
                                        i11 = (i235 ^ 103) + ((i235 & 103) << 1);
                                        f771a = i11 % 128;
                                        if (i11 % 2 == 0) {
                                            i12 = 91;
                                            c2 = '%';
                                            packedPositionGroup = 2060405377 % ExpandableListView.getPackedPositionGroup(0L);
                                        } else {
                                            int i236 = -ExpandableListView.getPackedPositionGroup(0L);
                                            int i237 = (i236 ^ 2060405377) + ((i236 & 2060405377) << 1);
                                            i12 = -5;
                                            packedPositionGroup = i237;
                                            c2 = '0';
                                        }
                                        int iLastIndexOf = TextUtils.lastIndexOf("", c2);
                                        i13 = (i12 & iLastIndexOf) + (i12 | iLastIndexOf);
                                        maximumFlingVelocity = (short) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                        packedPositionType = ExpandableListView.getPackedPositionType(0L);
                                        int i238 = d;
                                        i14 = ((i238 | 43) << 1) - (i238 ^ 43);
                                        f771a = i14 % 128;
                                        if (i14 % 2 == 0) {
                                            Object[] objArr13 = new Object[1];
                                            e(packedPositionGroup, i13, maximumFlingVelocity, (byte) packedPositionType, AndroidCharacter.getMirror((char) 25) * 48012, objArr13);
                                            obj = objArr13[0];
                                        } else {
                                            Object[] objArr14 = new Object[1];
                                            e(packedPositionGroup, i13, maximumFlingVelocity, (byte) packedPositionType, 1968552843 - (~(-AndroidCharacter.getMirror('0'))), objArr14);
                                            obj = objArr14[0];
                                        }
                                        if (Class.forName((String) obj).equals(objArr4[1])) {
                                            int i239 = f771a + 55;
                                            d = i239 % 128;
                                            int i240 = i239 % 2;
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                char doubleTapTimeout2 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(0L) + 2823;
                                                int iIndexOf3 = TextUtils.indexOf("", "", 0, 0) + 22;
                                                byte[] bArr2 = $$d;
                                                Object[] objArr15 = new Object[1];
                                                f(bArr2[10], (short) 140, (byte) (bArr2[1] + 1), objArr15);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(doubleTapTimeout2, packedPositionGroup2, iIndexOf3, 1814927978, false, (String) objArr15[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char c3 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                                                int capsMode = 2823 - TextUtils.getCapsMode("", 0, 0);
                                                int minimumFlingVelocity = 22 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                byte[] bArr3 = $$d;
                                                Object[] objArr16 = new Object[1];
                                                f(bArr3[10], (short) 140, (byte) (bArr3[1] + 1), objArr16);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c3, capsMode, minimumFlingVelocity, 1814927978, false, (String) objArr16[0], null);
                                            }
                                            Object[] objArr17 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char packedPositionGroup3 = (char) ExpandableListView.getPackedPositionGroup(0L);
                                                int gidForName = 2822 - Process.getGidForName("");
                                                int i241 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 22;
                                                byte b6 = $$d[7];
                                                byte b7 = b6;
                                                Object[] objArr18 = new Object[1];
                                                f(b7, (short) (b7 | 192), b6, objArr18);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionGroup3, gidForName, i241, -2137287382, false, (String) objArr18[0], new Class[]{Long.TYPE, Method.class});
                                            }
                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr17)).longValue();
                                            i15 = -2001519171;
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                        i = ((i | 1) << 1) - (i ^ 1);
                        clsArr2 = null;
                        i33 = 16;
                        i28 = 0;
                        i32 = -2001519171;
                    }
                }
            }
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i15);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                int doubleTapTimeout3 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2823;
                int touchSlop = 22 - (ViewConfiguration.getTouchSlop() >> 8);
                byte[] bArr4 = $$d;
                Object[] objArr19 = new Object[1];
                f(bArr4[10], (short) 140, (byte) (bArr4[1] + 1), objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cNormalizeMetaState, doubleTapTimeout3, touchSlop, 1814927978, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null)};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                char c4 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int mode2 = 2823 - View.MeasureSpec.getMode(0);
                int size = View.MeasureSpec.getSize(0) + 22;
                byte[] bArr5 = $$d;
                Object[] objArr21 = new Object[1];
                f((byte) (bArr5[19] - 1), (short) 140, bArr5[7], objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c4, mode2, size, 1025296417, false, (String) objArr21[0], new Class[]{Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr20);
            Object[] objArr22 = {0, methodArr, null};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char cNormalizeMetaState2 = (char) (37657 - KeyEvent.normalizeMetaState(0));
                int iIndexOf4 = TextUtils.indexOf((CharSequence) "", '0', 0) + 2721;
                int iLastIndexOf2 = 18 - TextUtils.lastIndexOf("", '0');
                byte[] bArr6 = $$d;
                Object[] objArr23 = new Object[1];
                f((byte) (bArr6[19] - 1), (short) 140, bArr6[7], objArr23);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cNormalizeMetaState2, iIndexOf4, iLastIndexOf2, -1568796068, false, (String) objArr23[0], new Class[]{Integer.TYPE, Method[].class, List.class});
            }
            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr22)).longValue();
            int i242 = f771a + 43;
            d = i242 % 128;
            int i243 = i242 % 2;
            long j2 = -135172544;
            long j3 = -1;
            long j4 = jLongValue ^ j3;
            long jMyTid = Process.myTid();
            long j5 = (j2 | jMyTid) ^ j3;
            long j6 = 407;
            long j7 = j2 ^ j3;
            long j8 = (j7 | jLongValue) ^ j3;
            j = (((long) (-813)) * j2) + (((long) 408) * jLongValue) + (((long) (-814)) * (((j4 | j2) ^ j3) | j5)) + ((((j4 | (jMyTid ^ j3)) ^ j3) | j8 | j5) * j6) + (j6 * (((jMyTid | jLongValue) ^ j3) | j8 | ((j7 | jMyTid) ^ j3))) + ((long) (-1675233301));
            i16 = (int) (j >> 32);
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i244 = (-818885110) + (((~((-561451077) | iUptimeMillis)) | 540213316 | (~((-875775335) | iUptimeMillis))) * (-880));
            int i245 = (~((-561451077) | (~iUptimeMillis))) | 875775334;
            int i246 = ~(iUptimeMillis | 561451076);
            i17 = i244 + ((i245 | i246) * (-880)) + (i246 * 880);
            i18 = d + 15;
            f771a = i18 % 128;
            if (i18 % 2 == 0) {
                Object obj2 = null;
                Runtime.getRuntime().freeMemory();
                obj2.hashCode();
                throw null;
            }
            int i247 = i16 & i17;
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i248 = ~iFreeMemory;
            int i249 = ((int) j) & (1453938690 + (((~(97997750 | i248)) | (-1339228660)) * 519) + (((~(i248 | (-1241514050))) | (~((-97714611) | iFreeMemory))) * (-519)) + (((~(iFreeMemory | (-1339228660))) | (-97997751)) * 519));
            int i250 = (i247 & i249) | (i247 ^ i249);
            i19 = i250 >>> 24;
            int i251 = i250 & ViewCompat.MEASURED_SIZE_MASK;
            if (i19 != 0) {
                int i252 = f771a;
                int i253 = (i252 & 73) + (i252 | 73);
                d = i253 % 128;
                int i254 = i253 % 2;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i255 = f771a;
                i20 = 1;
                int i256 = (i255 ^ 85) + ((i255 & 85) << 1);
                d = i256 % 128;
                int i257 = i256 % 2;
                i21 = 1;
            } else {
                i20 = 1;
                i21 = 0;
            }
            if (z) {
                string = null;
            } else {
                string = null;
            }
            list.add(string);
            int iTuitionPaymentFragmentbindingInflater15 = zzo.TuitionPaymentFragmentbindingInflater1();
            int i258 = 2699 - (~(-(-(i19 * (-448)))));
            int i259 = ~(((-7) & i19) | ((-7) ^ i19));
            int i260 = ~i19;
            int i261 = ~(i260 | 6 | iTuitionPaymentFragmentbindingInflater15);
            int i262 = i258 + (((i259 & i261) | (i259 ^ i261)) * 449);
            int i263 = (~((-7) | i19)) * (-1347);
            int i264 = (i262 & i263) + (i262 | i263);
            int i265 = ~(((-7) ^ i19) | (i19 & (-7)));
            int i266 = ~iTuitionPaymentFragmentbindingInflater15;
            int i267 = (i266 & i260) | (i260 ^ i266);
            int i268 = ~((i267 & 6) | (i267 ^ 6));
            int i269 = -(-(((i268 & i265) | (i265 ^ i268)) * 449));
            i22 = ((i264 & i269) + (i269 | i264)) * i21;
            int i270 = f771a;
            i23 = (i270 ^ 119) + ((i270 & 119) << 1);
            d = i23 % 128;
            if (i23 % 2 == 0) {
                return i22;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        clsArr[c] = cls;
        methodArr[0] = CertificatePinner.class.getMethod(str, clsArr);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char defaultSize = (char) View.getDefaultSize(0, 0);
            int i271 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2822;
            int packedPositionChild = 21 - ExpandableListView.getPackedPositionChild(0L);
            byte[] bArr7 = $$d;
            Object[] objArr24 = new Object[1];
            f(bArr7[10], (short) 140, (byte) (bArr7[1] + 1), objArr24);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(defaultSize, i271, packedPositionChild, 1814927978, false, (String) objArr24[0], null);
        }
        int i272 = 99 / 0;
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).get(null) == null) {
            declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) KeyEvent.getDeadChar(0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2822, 23 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))).getDeclaredMethods();
            length = declaredMethods.length;
            i = 0;
            while (true) {
                if (i < length) {
                    method = declaredMethods[i];
                    try {
                        int i310 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        int i311 = ((i310 | 2060405376) << 1) - (i310 ^ 2060405376);
                        int scrollDefaultDelay3 = ViewConfiguration.getScrollDefaultDelay() >> i33;
                        int iTuitionPaymentFragmentbindingInflater16 = zzo.TuitionPaymentFragmentbindingInflater1();
                        int i312 = ~iTuitionPaymentFragmentbindingInflater16;
                        int i313 = ~((5 ^ i312) | (5 & i312));
                        int i314 = ~((5 ^ scrollDefaultDelay3) | (5 & scrollDefaultDelay3));
                        int i315 = (((scrollDefaultDelay3 * (-244)) - 1476) - (~(-(-(((i313 ^ i314) | (i313 & i314)) * (-245)))))) - 1;
                        int i410 = -(-((~((5 ^ iTuitionPaymentFragmentbindingInflater16) | (5 & iTuitionPaymentFragmentbindingInflater16))) * (-245)));
                        int i411 = (i315 ^ i410) + ((i410 & i315) << 1);
                        int i412 = (scrollDefaultDelay3 | (~(5 | iTuitionPaymentFragmentbindingInflater16))) * 245;
                        int i413 = (i411 ^ i412) + ((i412 & i411) << 1);
                        int i414 = -Process.getGidForName("");
                        short s3 = (short) ((i414 ^ (-1)) + (i414 << 1));
                        byte bRgb2 = (byte) (Color.rgb(i28, i28, i28) + 16777216);
                        int i415 = d;
                        int i416 = (i415 & 75) + (i415 | 75);
                        f771a = i416 % 128;
                        int i417 = i416 % 2;
                        Object[] objArr25 = new Object[1];
                        e(i311, i413, s3, bRgb2, 1968552795 - TextUtils.indexOf((CharSequence) "", '0', i28), objArr25);
                        Class<?> cls7 = Class.forName((String) objArr25[i28]);
                        char[] cArr2 = new char[i33];
                        // fill-array-data instruction
                        cArr2[0] = 20490;
                        cArr2[1] = 20589;
                        cArr2[2] = 43099;
                        cArr2[3] = 15255;
                        cArr2[4] = 37151;
                        cArr2[5] = 46649;
                        cArr2[6] = 48738;
                        cArr2[7] = 1236;
                        cArr2[8] = 7873;
                        cArr2[9] = 55742;
                        cArr2[10] = 50086;
                        cArr2[11] = 3373;
                        cArr2[12] = 52523;
                        cArr2[13] = 2819;
                        cArr2[14] = 29393;
                        cArr2[15] = 23780;
                        int i418 = -(ViewConfiguration.getScrollDefaultDelay() >> i33);
                        int iTuitionPaymentFragmentbindingInflater17 = zzo.TuitionPaymentFragmentbindingInflater1();
                        int i419 = i418 * (-129);
                        int i510 = (i419 ^ 131) + ((i419 & 131) << 1);
                        int i511 = ~iTuitionPaymentFragmentbindingInflater17;
                        int i512 = ((-2) ^ i511) | ((-2) & i511);
                        int i513 = (~((i512 ^ i418) | (i512 & i418))) * 130;
                        int i514 = (((i510 | i513) << 1) - (i510 ^ i513)) + ((~((-2) | i418)) * (-260));
                        int i515 = ~((~i418) | 1);
                        int i516 = ((-2) ^ i418) | (i418 & (-2));
                        int i517 = ~((i516 & iTuitionPaymentFragmentbindingInflater17) | (i516 ^ iTuitionPaymentFragmentbindingInflater17));
                        int i518 = -(-(((i517 & i515) | (i515 ^ i517)) * 130));
                        int i519 = ((i514 | i518) << 1) - (i514 ^ i518);
                        Object[] objArr26 = new Object[1];
                        c(cArr2, i519, objArr26);
                        int iIntValue2 = ((Integer) cls7.getMethod((String) objArr26[i28], clsArr2).invoke(method, clsArr2)).intValue();
                        int i610 = f771a;
                        int i611 = ((i610 | 89) << 1) - (i610 ^ 89);
                        d = i611 % 128;
                        int i612 = i611 % 2;
                        objArr = new Object[1];
                        objArr[i28] = Integer.valueOf(iIntValue2);
                        int i613 = -TextUtils.indexOf("", "", i28);
                        int iTuitionPaymentFragmentbindingInflater18 = zzo.TuitionPaymentFragmentbindingInflater1();
                        int i614 = i613 * 71;
                        int i615 = (i614 & (-434050245)) + (i614 | (-434050245));
                        int i616 = ~i613;
                        int i617 = ~((i616 ^ 2060405377) | (i616 & 2060405377));
                        int i618 = ~(iTuitionPaymentFragmentbindingInflater18 | 2060405377);
                        int i619 = ((i617 ^ i618) | (i618 & i617)) * (-140);
                        int i710 = ((i615 | i619) << 1) - (i619 ^ i615);
                        int i711 = (i613 ^ 2060405377) | (i613 & 2060405377);
                        int i712 = (i710 - (~(-(-((~((i711 & iTuitionPaymentFragmentbindingInflater18) | (i711 ^ iTuitionPaymentFragmentbindingInflater18))) * 70))))) - 1;
                        int i713 = ~((-2060405378) | i613);
                        int i714 = (i713 & i617) | (i617 ^ i713);
                        int i715 = ~((i613 & iTuitionPaymentFragmentbindingInflater18) | (i613 ^ iTuitionPaymentFragmentbindingInflater18));
                        int i716 = i712 + (((i714 & i715) | (i714 ^ i715)) * 70);
                        long jCurrentThreadTimeMillis2 = SystemClock.currentThreadTimeMillis();
                        int i717 = f771a;
                        int i718 = (i717 & 93) + (i717 | 93);
                        d = i718 % 128;
                        int i719 = i718 % 2;
                        int i810 = (jCurrentThreadTimeMillis2 > (-1L) ? 1 : (jCurrentThreadTimeMillis2 == (-1L) ? 0 : -1));
                        int iTuitionPaymentFragmentbindingInflater19 = zzo.TuitionPaymentFragmentbindingInflater1();
                        int i811 = i810 * (-337);
                        int i812 = (i811 ^ (-2373)) + ((i811 & (-2373)) << 1);
                        int i813 = ~i810;
                        int i814 = ~iTuitionPaymentFragmentbindingInflater19;
                        int i815 = ~((i813 ^ i814) | (i813 & i814));
                        int i816 = ~(6 | i810);
                        int i817 = (i815 ^ i816) | (i815 & i816);
                        int i818 = ~(i810 | iTuitionPaymentFragmentbindingInflater19);
                        int i819 = -(-(((i817 ^ i818) | (i817 & i818)) * (-338)));
                        int i910 = ((i812 | i819) << 1) - (i819 ^ i812);
                        int i911 = ~i810;
                        int i912 = -(-((~(i911 | (-7))) * 338));
                        int i913 = i810 | (-7);
                        int i914 = (i910 & i912) + (i912 | i910) + (((~((i913 & iTuitionPaymentFragmentbindingInflater19) | (i913 ^ iTuitionPaymentFragmentbindingInflater19))) | (~((i911 & i814) | (i911 ^ i814)))) * 338);
                        int i915 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        int iTuitionPaymentFragmentbindingInflater20 = zzo.TuitionPaymentFragmentbindingInflater1();
                        int i916 = i915 * 980;
                        int i917 = d + 93;
                        f771a = i917 % 128;
                        int i918 = i917 % 2;
                        int i919 = ((((i916 ^ 978) + ((i916 & 978) << 1)) - (~(-(-((~(~iTuitionPaymentFragmentbindingInflater20)) * 979))))) - 1) + ((i915 | iTuitionPaymentFragmentbindingInflater20) * (-979));
                        int i1010 = ~iTuitionPaymentFragmentbindingInflater20;
                        int i1011 = ~(i915 | (~iTuitionPaymentFragmentbindingInflater20));
                        short s4 = (short) ((i919 - (~(((i1011 & i1010) | (i1010 ^ i1011)) * 979))) - 1);
                        char mirror2 = AndroidCharacter.getMirror('0');
                        int iTuitionPaymentFragmentbindingInflater21 = zzo.TuitionPaymentFragmentbindingInflater1();
                        int i1012 = mirror2 * 866;
                        int i1013 = (i1012 ^ 41472) + ((i1012 & 41472) << 1);
                        int i1014 = ~mirror2;
                        int i1015 = ~iTuitionPaymentFragmentbindingInflater21;
                        int i1016 = (((i1013 - (~(-(-((47 | (~(i1014 | i1015))) * (-865)))))) - 1) - (~((~((mirror2 ^ iTuitionPaymentFragmentbindingInflater21) | (mirror2 & iTuitionPaymentFragmentbindingInflater21))) * 865))) - 1;
                        int i1017 = ~((~iTuitionPaymentFragmentbindingInflater21) | 47);
                        int i1018 = ~((i1015 ^ mirror2) | (mirror2 & i1015));
                        byte b8 = (byte) ((i1016 - (~(((i1017 & i1018) | (i1017 ^ i1018)) * 865))) - 1);
                        int iResolveOpacity2 = Drawable.resolveOpacity(i28, i28);
                        int i1019 = (iResolveOpacity2 ^ 1968552820) + ((iResolveOpacity2 & 1968552820) << 1);
                        Object[] objArr27 = new Object[1];
                        e(i716, i914, s4, b8, i1019, objArr27);
                        cls2 = Class.forName((String) objArr27[i28]);
                        int i1110 = 2060405375 - (~(-(-(ViewConfiguration.getJumpTapTimeout() >> i33))));
                        int mode3 = View.MeasureSpec.getMode(i28);
                        int iTuitionPaymentFragmentbindingInflater22 = zzo.TuitionPaymentFragmentbindingInflater1();
                        int i1111 = (mode3 * 866) + 5184;
                        int i1112 = ~mode3;
                        int i1113 = ~iTuitionPaymentFragmentbindingInflater22;
                        int i1114 = ~((i1112 ^ i1113) | (i1112 & i1113));
                        int i1115 = ((5 ^ i1114) | (5 & i1114)) * (-865);
                        int i1116 = ((i1111 | i1115) << 1) - (i1111 ^ i1115);
                        int i1117 = (~(mode3 | iTuitionPaymentFragmentbindingInflater22)) * 865;
                        int i1118 = ((i1116 | i1117) << 1) - (i1116 ^ i1117);
                        int i1119 = ~((5 & i1113) | (5 ^ i1113));
                        int i1210 = ~(mode3 | (~iTuitionPaymentFragmentbindingInflater22));
                        int i1211 = -(-(((i1210 & i1119) | (i1119 ^ i1210)) * 865));
                        int i1212 = (i1118 & i1211) + (i1211 | i1118);
                        short modifierMetaStateMask2 = (short) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
                        int i1213 = -(ExpandableListView.getPackedPositionForChild(i28, i28) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i28, i28) == 0L ? 0 : -1));
                        int iTuitionPaymentFragmentbindingInflater110 = zzo.TuitionPaymentFragmentbindingInflater1();
                        int i1214 = i1213 * 592;
                        int i1215 = (i1214 & 590) + (i1214 | 590);
                        int i1216 = ~i1213;
                        int i1217 = (~((~i1216) | i1216)) * (-1182);
                        int i1218 = ((i1215 | i1217) << 1) - (i1217 ^ i1215);
                        int i1219 = ~i1213;
                        int i1310 = ~iTuitionPaymentFragmentbindingInflater110;
                        int i1311 = (~((i1310 & i1219) | (i1219 ^ i1310))) * (-591);
                        int i1312 = ((i1218 | i1311) << 1) - (i1311 ^ i1218);
                        int i1313 = ((i1219 & iTuitionPaymentFragmentbindingInflater110) | (iTuitionPaymentFragmentbindingInflater110 ^ i1219)) * 591;
                        byte b9 = (byte) ((i1312 & i1313) + (i1313 | i1312));
                        int i1314 = -(ViewConfiguration.getScrollBarSize() >> 8);
                        int iTuitionPaymentFragmentbindingInflater111 = zzo.TuitionPaymentFragmentbindingInflater1();
                        int i1315 = i1314 * (-167);
                        int i1316 = ((i1315 | 1964156510) << 1) - (i1315 ^ 1964156510);
                        int i1317 = ~((~i1314) | (-1968552847));
                        int i1318 = ~((-1968552847) | iTuitionPaymentFragmentbindingInflater111);
                        int i1319 = -(-(((i1317 ^ i1318) | (i1318 & i1317)) * 336));
                        int i1410 = ((i1316 | i1319) << 1) - (i1316 ^ i1319);
                        int i1411 = ~((i1314 ^ 1968552846) | (1968552846 & i1314));
                        int i1412 = ~((i1314 ^ iTuitionPaymentFragmentbindingInflater111) | (i1314 & iTuitionPaymentFragmentbindingInflater111));
                        int i1413 = -(-(((i1411 ^ i1412) | (i1411 & i1412)) * (-168)));
                        int i1414 = ((i1410 | i1413) << 1) - (i1413 ^ i1410);
                        int i1415 = ~iTuitionPaymentFragmentbindingInflater111;
                        int i1416 = ~((i1415 & i1314) | (i1415 ^ i1314));
                        int i1417 = i1414 + (((i1416 & (-1968552847)) | ((-1968552847) ^ i1416)) * 168);
                        objArr2 = new Object[1];
                        e(i1110, i1212, modifierMetaStateMask2, b9, i1417, objArr2);
                        if (((Boolean) cls2.getMethod((String) objArr2[0], Integer.TYPE).invoke(null, objArr)).booleanValue()) {
                            i2 = d + 5;
                            f771a = i2 % 128;
                            if (i2 % 2 == 0) {
                                cls3 = Long.TYPE;
                                iIndexOf = TextUtils.indexOf((CharSequence) "", 'n');
                                iTuitionPaymentFragmentbindingInflater1 = zzo.TuitionPaymentFragmentbindingInflater1();
                                i3 = 319 % iIndexOf;
                            } else {
                                cls3 = Long.TYPE;
                                int iIndexOf5 = TextUtils.indexOf((CharSequence) "", '0');
                                i3 = iIndexOf5 * 319;
                                iTuitionPaymentFragmentbindingInflater1 = zzo.TuitionPaymentFragmentbindingInflater1();
                                iIndexOf = iIndexOf5;
                            }
                            int i1418 = (i3 ^ (-313475834)) + ((i3 & (-313475834)) << 1);
                            int i1419 = ~iIndexOf;
                            int i1510 = ~((i1419 & iTuitionPaymentFragmentbindingInflater1) | (i1419 ^ iTuitionPaymentFragmentbindingInflater1));
                            int i1511 = -(-(((i1510 & (-2060405379)) | ((-2060405379) ^ i1510)) * (-318)));
                            int i1512 = (i1418 & i1511) + (i1511 | i1418);
                            int i1513 = ~(((-2060405379) ^ iTuitionPaymentFragmentbindingInflater1) | ((-2060405379) & iTuitionPaymentFragmentbindingInflater1));
                            int i1514 = d;
                            int i1515 = i1514 + 13;
                            f771a = i1515 % 128;
                            int i1516 = i1515 % 2;
                            int i1517 = ~iTuitionPaymentFragmentbindingInflater1;
                            int i1518 = ~((i1517 ^ iIndexOf) | (i1517 & iIndexOf) | 2060405378);
                            int i1519 = -(-(TypedValues.AttributesType.TYPE_PIVOT_TARGET * ((i1513 ^ i1518) | (i1513 & i1518))));
                            i4 = ((i1512 | i1519) << 1) - (i1512 ^ i1519);
                            int i1610 = ((-2060405379) & i1517) | ((-2060405379) ^ i1517);
                            int i1611 = ~((i1610 & iIndexOf) | (i1610 ^ iIndexOf));
                            int i1612 = (iIndexOf & 2060405378) | (iIndexOf ^ 2060405378);
                            int i1613 = i1514 + 73;
                            f771a = i1613 % 128;
                            i5 = i1613 % 2;
                            int i1614 = ~((i1612 & iTuitionPaymentFragmentbindingInflater1) | (i1612 ^ iTuitionPaymentFragmentbindingInflater1));
                            i6 = (i1614 & i1611) | (i1611 ^ i1614);
                            if (i5 == 0) {
                                int i1615 = -i6;
                                i7 = i4 >> (((i1615 | TypedValues.AttributesType.TYPE_PIVOT_TARGET) << 1) - (i1615 ^ TypedValues.AttributesType.TYPE_PIVOT_TARGET));
                                i8 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 1.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 1.0d ? 0 : -1));
                                iTuitionPaymentFragmentbindingInflater2 = zzo.TuitionPaymentFragmentbindingInflater1();
                                i9 = ((i8 & 989) + (i8 | 989)) - 987;
                                i10 = 96;
                            } else {
                                int i1616 = -(-(i6 * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
                                i7 = ((i4 | i1616) << 1) - (i1616 ^ i4);
                                i8 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                iTuitionPaymentFragmentbindingInflater2 = zzo.TuitionPaymentFragmentbindingInflater1();
                                int i1617 = i8 * 989;
                                i9 = ((i1617 & 5922) << 1) + (i1617 ^ 5922);
                                i10 = -6;
                            }
                            int i1618 = i7;
                            int i1619 = ~i10;
                            int i1710 = ~iTuitionPaymentFragmentbindingInflater2;
                            int i1711 = (i1619 ^ i1710) | (i1619 & i1710);
                            int i1712 = ~((i1711 & i8) | (i1711 ^ i8));
                            int i1713 = ~((i8 ^ i10) | (i8 & i10) | iTuitionPaymentFragmentbindingInflater2);
                            int i1714 = -(-(((i1712 ^ i1713) | (i1712 & i1713)) * 988));
                            int i1715 = ((i9 | i1714) << 1) - (i9 ^ i1714);
                            int i1716 = ~i10;
                            int i1717 = (i1715 - (~(((i8 ^ i1716) | (i8 & i1716)) * (-988)))) - 1;
                            int i1718 = ~i8;
                            int i1719 = (~(i1619 | iTuitionPaymentFragmentbindingInflater2)) | (~((i1718 ^ i1716) | (i1716 & i1718)));
                            int i1810 = d + 17;
                            f771a = i1810 % 128;
                            int i1811 = i1810 % 2;
                            int i1812 = ~(i8 | i1710 | i10);
                            int i1813 = (i1717 - (~(-(-(988 * ((i1719 & i1812) | (i1719 ^ i1812))))))) - 1;
                            int iRgb2 = Color.rgb(0, 0, 0);
                            Object[] objArr110 = new Object[1];
                            e(i1618, i1813, (short) (((iRgb2 | 16777216) << 1) - (16777216 ^ iRgb2)), (byte) (ViewConfiguration.getPressedStateDuration() >> 16), 1968552795 - (~(-View.MeasureSpec.getSize(0))), objArr110);
                            cls4 = Class.forName((String) objArr110[0]);
                            objArr3 = new Object[1];
                            c(new char[]{60631, 60592, 46083, 10191, 31345, 23895, 63995, 17234, 41494, 50678, 10452, 19135, 29169, 5994, 39348, 7009, 1886}, -TextUtils.lastIndexOf("", '0', 0, 0), objArr3);
                            if (cls3.equals(cls4.getMethod((String) objArr3[0], null).invoke(method, null))) {
                                int iGreen2 = Color.green(0);
                                int i1814 = (iGreen2 ^ 2060405377) + ((iGreen2 & 2060405377) << 1);
                                int i1815 = (-6) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                short longPressTimeout2 = (short) (ViewConfiguration.getLongPressTimeout() >> 16);
                                byte bIndexOf2 = (byte) TextUtils.indexOf("", "", 0);
                                int i1816 = -(-Process.getGidForName(""));
                                int i1817 = (i1816 & 1968552797) + (i1816 | 1968552797);
                                Object[] objArr111 = new Object[1];
                                e(i1814, i1815, longPressTimeout2, bIndexOf2, i1817, objArr111);
                                Class<?> cls8 = Class.forName((String) objArr111[0]);
                                int i1818 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                int iTuitionPaymentFragmentbindingInflater112 = zzo.TuitionPaymentFragmentbindingInflater1();
                                int i1819 = (i1818 * (-167)) - 490313778;
                                int i1910 = ~i1818;
                                int i1911 = ~((i1910 & (-2060405375)) | (i1910 ^ (-2060405375)));
                                int i1912 = ~((-2060405375) | iTuitionPaymentFragmentbindingInflater112);
                                int i1913 = ((i1911 & i1912) | (i1911 ^ i1912)) * 336;
                                int i1914 = (i1819 ^ i1913) + ((i1819 & i1913) << 1);
                                int i1915 = ~((2060405374 & i1818) | (i1818 ^ 2060405374));
                                int i1916 = ~((i1818 ^ iTuitionPaymentFragmentbindingInflater112) | (i1818 & iTuitionPaymentFragmentbindingInflater112));
                                int i1917 = -(-(((i1915 & i1916) | (i1915 ^ i1916)) * (-168)));
                                int i1918 = ~iTuitionPaymentFragmentbindingInflater112;
                                int i1919 = ~((i1818 & i1918) | (i1918 ^ i1818));
                                int i2010 = (i1914 ^ i1917) + ((i1917 & i1914) << 1) + (((i1919 & (-2060405375)) | ((-2060405375) ^ i1919)) * 168);
                                int jumpTapTimeout2 = ViewConfiguration.getJumpTapTimeout() >> 16;
                                int iTuitionPaymentFragmentbindingInflater113 = zzo.TuitionPaymentFragmentbindingInflater1();
                                int i2011 = (jumpTapTimeout2 * (-515)) - 3102;
                                int i2012 = ~((5 ^ iTuitionPaymentFragmentbindingInflater113) | (5 & iTuitionPaymentFragmentbindingInflater113));
                                int i2013 = ~iTuitionPaymentFragmentbindingInflater113;
                                int i2014 = ~(i2013 | jumpTapTimeout2);
                                int i2015 = ((i2012 & i2014) | (i2012 ^ i2014) | (~((i2013 ^ (-6)) | (i2013 & (-6))))) * (-516);
                                int i2016 = (i2011 & i2015) + (i2011 | i2015);
                                int i2017 = ~jumpTapTimeout2;
                                int i2018 = ~((i2017 ^ 5) | (i2017 & 5) | iTuitionPaymentFragmentbindingInflater113);
                                int i2019 = ~iTuitionPaymentFragmentbindingInflater113;
                                int i2110 = (i2019 & i2017) | (i2017 ^ i2019);
                                int i2111 = ~((i2110 & (-6)) | (i2110 ^ (-6)));
                                int i2112 = i2016 + (((i2111 & i2018) | (i2018 ^ i2111)) * 516);
                                int i2113 = ~((i2017 & (-6)) | (i2017 ^ (-6)));
                                int i2114 = ~((i2013 ^ (-6)) | (i2013 & (-6)));
                                int i2115 = (i2112 - (~(-(-(((i2113 & i2114) | (i2113 ^ i2114)) * 516))))) - 1;
                                short tapTimeout2 = (short) (ViewConfiguration.getTapTimeout() >> 16);
                                byte windowTouchSlop2 = (byte) (ViewConfiguration.getWindowTouchSlop() >> 8);
                                int i2116 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                int iTuitionPaymentFragmentbindingInflater114 = zzo.TuitionPaymentFragmentbindingInflater1();
                                int i2117 = (i2116 * 71) + 1608806615;
                                int i2118 = ~i2116;
                                int i2119 = ~((i2118 & 1968552853) | (i2118 ^ 1968552853));
                                int i2210 = ~((iTuitionPaymentFragmentbindingInflater114 ^ 1968552853) | (iTuitionPaymentFragmentbindingInflater114 & 1968552853));
                                int i2211 = -(-(((i2119 ^ i2210) | (i2119 & i2210)) * (-140)));
                                int i2212 = (i2117 ^ i2211) + ((i2117 & i2211) << 1);
                                int i2213 = -(-((~((i2116 ^ 1968552853) | (i2116 & 1968552853) | iTuitionPaymentFragmentbindingInflater114)) * 70));
                                int i2214 = (i2212 ^ i2213) + ((i2213 & i2212) << 1);
                                int i2215 = ~i2116;
                                int i2216 = ~((i2215 & 1968552853) | (i2215 ^ 1968552853));
                                int i2217 = ~(((-1968552854) & i2116) | ((-1968552854) ^ i2116));
                                int i2218 = (i2216 & i2217) | (i2216 ^ i2217);
                                int i2219 = ~((i2116 & iTuitionPaymentFragmentbindingInflater114) | (i2116 ^ iTuitionPaymentFragmentbindingInflater114));
                                int i2310 = -(-(((i2219 & i2218) | (i2218 ^ i2219)) * 70));
                                int i2311 = (i2214 ^ i2310) + ((i2310 & i2214) << 1);
                                Object[] objArr112 = new Object[1];
                                e(i2010, i2115, tapTimeout2, windowTouchSlop2, i2311, objArr112);
                                objArr4 = (Object[]) cls8.getMethod((String) objArr112[0], null).invoke(method, null);
                                if (objArr4.length == 2) {
                                    int i2312 = f771a;
                                    int i2313 = (i2312 & 123) + (i2312 | 123);
                                    d = i2313 % 128;
                                    int i2314 = i2313 % 2;
                                    if (Long.TYPE.equals(objArr4[0])) {
                                        int i2315 = d;
                                        i11 = (i2315 ^ 103) + ((i2315 & 103) << 1);
                                        f771a = i11 % 128;
                                        if (i11 % 2 == 0) {
                                            i12 = 91;
                                            c2 = '%';
                                            packedPositionGroup = 2060405377 % ExpandableListView.getPackedPositionGroup(0L);
                                        } else {
                                            int i2316 = -ExpandableListView.getPackedPositionGroup(0L);
                                            int i2317 = (i2316 ^ 2060405377) + ((i2316 & 2060405377) << 1);
                                            i12 = -5;
                                            packedPositionGroup = i2317;
                                            c2 = '0';
                                        }
                                        int iLastIndexOf3 = TextUtils.lastIndexOf("", c2);
                                        i13 = (i12 & iLastIndexOf3) + (i12 | iLastIndexOf3);
                                        maximumFlingVelocity = (short) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                        packedPositionType = ExpandableListView.getPackedPositionType(0L);
                                        int i2318 = d;
                                        i14 = ((i2318 | 43) << 1) - (i2318 ^ 43);
                                        f771a = i14 % 128;
                                        if (i14 % 2 == 0) {
                                            Object[] objArr113 = new Object[1];
                                            e(packedPositionGroup, i13, maximumFlingVelocity, (byte) packedPositionType, AndroidCharacter.getMirror((char) 25) * 48012, objArr113);
                                            obj = objArr113[0];
                                        } else {
                                            Object[] objArr114 = new Object[1];
                                            e(packedPositionGroup, i13, maximumFlingVelocity, (byte) packedPositionType, 1968552843 - (~(-AndroidCharacter.getMirror('0'))), objArr114);
                                            obj = objArr114[0];
                                        }
                                        if (Class.forName((String) obj).equals(objArr4[1])) {
                                            int i2319 = f771a + 55;
                                            d = i2319 % 128;
                                            int i2410 = i2319 % 2;
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                char doubleTapTimeout4 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                int packedPositionGroup4 = ExpandableListView.getPackedPositionGroup(0L) + 2823;
                                                int iIndexOf6 = TextUtils.indexOf("", "", 0, 0) + 22;
                                                byte[] bArr8 = $$d;
                                                Object[] objArr115 = new Object[1];
                                                f(bArr8[10], (short) 140, (byte) (bArr8[1] + 1), objArr115);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(doubleTapTimeout4, packedPositionGroup4, iIndexOf6, 1814927978, false, (String) objArr115[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char c5 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                                                int capsMode2 = 2823 - TextUtils.getCapsMode("", 0, 0);
                                                int minimumFlingVelocity2 = 22 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                byte[] bArr9 = $$d;
                                                Object[] objArr116 = new Object[1];
                                                f(bArr9[10], (short) 140, (byte) (bArr9[1] + 1), objArr116);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c5, capsMode2, minimumFlingVelocity2, 1814927978, false, (String) objArr116[0], null);
                                            }
                                            try {
                                                Object[] objArr117 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                    char packedPositionGroup5 = (char) ExpandableListView.getPackedPositionGroup(0L);
                                                    int gidForName2 = 2822 - Process.getGidForName("");
                                                    int i2411 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 22;
                                                    byte b10 = $$d[7];
                                                    byte b11 = b10;
                                                    Object[] objArr118 = new Object[1];
                                                    f(b11, (short) (b11 | 192), b10, objArr118);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionGroup5, gidForName2, i2411, -2137287382, false, (String) objArr118[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr117)).longValue();
                                                i15 = -2001519171;
                                                break;
                                            } catch (Throwable th) {
                                                Throwable cause = th.getCause();
                                                if (cause != null) {
                                                    throw cause;
                                                }
                                                throw th;
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                        i = ((i | 1) << 1) - (i ^ 1);
                        clsArr2 = null;
                        i33 = 16;
                        i28 = 0;
                        i32 = -2001519171;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                }
            }
        }
        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i15);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            char cNormalizeMetaState3 = (char) KeyEvent.normalizeMetaState(0);
            int doubleTapTimeout5 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2823;
            int touchSlop2 = 22 - (ViewConfiguration.getTouchSlop() >> 8);
            byte[] bArr10 = $$d;
            Object[] objArr119 = new Object[1];
            f(bArr10[10], (short) 140, (byte) (bArr10[1] + 1), objArr119);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cNormalizeMetaState3, doubleTapTimeout5, touchSlop2, 1814927978, false, (String) objArr119[0], null);
        }
        Object[] objArr28 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null)};
        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char c6 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int mode4 = 2823 - View.MeasureSpec.getMode(0);
            int size2 = View.MeasureSpec.getSize(0) + 22;
            byte[] bArr11 = $$d;
            Object[] objArr29 = new Object[1];
            f((byte) (bArr11[19] - 1), (short) 140, bArr11[7], objArr29);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c6, mode4, size2, 1025296417, false, (String) objArr29[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr28);
        Object[] objArr210 = {0, methodArr, null};
        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char cNormalizeMetaState4 = (char) (37657 - KeyEvent.normalizeMetaState(0));
            int iIndexOf7 = TextUtils.indexOf((CharSequence) "", '0', 0) + 2721;
            int iLastIndexOf4 = 18 - TextUtils.lastIndexOf("", '0');
            byte[] bArr12 = $$d;
            Object[] objArr211 = new Object[1];
            f((byte) (bArr12[19] - 1), (short) 140, bArr12[7], objArr211);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cNormalizeMetaState4, iIndexOf7, iLastIndexOf4, -1568796068, false, (String) objArr211[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr210)).longValue();
        int i2412 = f771a + 43;
        d = i2412 % 128;
        int i2413 = i2412 % 2;
        long j9 = -135172544;
        long j10 = -1;
        long j11 = jLongValue2 ^ j10;
        long jMyTid2 = Process.myTid();
        long j12 = (j9 | jMyTid2) ^ j10;
        long j13 = 407;
        long j14 = j9 ^ j10;
        long j15 = (j14 | jLongValue2) ^ j10;
        j = (((long) (-813)) * j9) + (((long) 408) * jLongValue2) + (((long) (-814)) * (((j11 | j9) ^ j10) | j12)) + ((((j11 | (jMyTid2 ^ j10)) ^ j10) | j15 | j12) * j13) + (j13 * (((jMyTid2 | jLongValue2) ^ j10) | j15 | ((j14 | jMyTid2) ^ j10))) + ((long) (-1675233301));
        i16 = (int) (j >> 32);
        int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
        int i2414 = (-818885110) + (((~((-561451077) | iUptimeMillis2)) | 540213316 | (~((-875775335) | iUptimeMillis2))) * (-880));
        int i2415 = (~((-561451077) | (~iUptimeMillis2))) | 875775334;
        int i2416 = ~(iUptimeMillis2 | 561451076);
        i17 = i2414 + ((i2415 | i2416) * (-880)) + (i2416 * 880);
        i18 = d + 15;
        f771a = i18 % 128;
        if (i18 % 2 == 0) {
            Object obj4 = null;
            Runtime.getRuntime().freeMemory();
            obj4.hashCode();
            throw null;
        }
        int i2417 = i16 & i17;
        int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
        int i2418 = ~iFreeMemory2;
        int i2419 = ((int) j) & (1453938690 + (((~(97997750 | i2418)) | (-1339228660)) * 519) + (((~(i2418 | (-1241514050))) | (~((-97714611) | iFreeMemory2))) * (-519)) + (((~(iFreeMemory2 | (-1339228660))) | (-97997751)) * 519));
        int i2510 = (i2417 & i2419) | (i2417 ^ i2419);
        i19 = i2510 >>> 24;
        int i2511 = i2510 & ViewCompat.MEASURED_SIZE_MASK;
        if (i19 != 0) {
            int i2512 = f771a;
            int i2513 = (i2512 & 73) + (i2512 | 73);
            d = i2513 % 128;
            int i2514 = i2513 % 2;
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i2515 = f771a;
            i20 = 1;
            int i2516 = (i2515 ^ 85) + ((i2515 & 85) << 1);
            d = i2516 % 128;
            int i2517 = i2516 % 2;
            i21 = 1;
        } else {
            i20 = 1;
            i21 = 0;
        }
        if (z || i2511 >= i20) {
            string = null;
        } else {
            int i273 = d;
            int i274 = (i273 & 55) + (i273 | 55);
            f771a = i274 % 128;
            int i275 = i274 % 2;
            Method method2 = methodArr[i2511];
            if (method2 != null) {
                int i276 = (i273 & 77) + (i273 | 77);
                f771a = i276 % 128;
                if (i276 % 2 == 0) {
                    method2.toString();
                    Object obj5 = null;
                    obj5.hashCode();
                    throw null;
                }
                string = method2.toString();
            } else {
                string = null;
            }
        }
        list.add(string);
        int iTuitionPaymentFragmentbindingInflater115 = zzo.TuitionPaymentFragmentbindingInflater1();
        int i2518 = 2699 - (~(-(-(i19 * (-448)))));
        int i2519 = ~(((-7) & i19) | ((-7) ^ i19));
        int i2610 = ~i19;
        int i2611 = ~(i2610 | 6 | iTuitionPaymentFragmentbindingInflater115);
        int i2612 = i2518 + (((i2519 & i2611) | (i2519 ^ i2611)) * 449);
        int i2613 = (~((-7) | i19)) * (-1347);
        int i2614 = (i2612 & i2613) + (i2612 | i2613);
        int i2615 = ~(((-7) ^ i19) | (i19 & (-7)));
        int i2616 = ~iTuitionPaymentFragmentbindingInflater115;
        int i2617 = (i2616 & i2610) | (i2610 ^ i2616);
        int i2618 = ~((i2617 & 6) | (i2617 ^ 6));
        int i2619 = -(-(((i2618 & i2615) | (i2615 ^ i2618)) * 449));
        i22 = ((i2614 & i2619) + (i2619 | i2614)) * i21;
        int i277 = f771a;
        i23 = (i277 ^ 119) + ((i277 & 119) << 1);
        d = i23 % 128;
        if (i23 % 2 == 0) {
            return i22;
        }
        Object obj6 = null;
        obj6.hashCode();
        throw null;
        i15 = i32;
        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i15);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            char cNormalizeMetaState5 = (char) KeyEvent.normalizeMetaState(0);
            int doubleTapTimeout6 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2823;
            int touchSlop3 = 22 - (ViewConfiguration.getTouchSlop() >> 8);
            byte[] bArr13 = $$d;
            Object[] objArr1110 = new Object[1];
            f(bArr13[10], (short) 140, (byte) (bArr13[1] + 1), objArr1110);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cNormalizeMetaState5, doubleTapTimeout6, touchSlop3, 1814927978, false, (String) objArr1110[0], null);
        }
        Object[] objArr212 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null)};
        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char c7 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int mode5 = 2823 - View.MeasureSpec.getMode(0);
            int size3 = View.MeasureSpec.getSize(0) + 22;
            byte[] bArr14 = $$d;
            Object[] objArr213 = new Object[1];
            f((byte) (bArr14[19] - 1), (short) 140, bArr14[7], objArr213);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c7, mode5, size3, 1025296417, false, (String) objArr213[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr212);
        Object[] objArr214 = {0, methodArr, null};
        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char cNormalizeMetaState6 = (char) (37657 - KeyEvent.normalizeMetaState(0));
            int iIndexOf8 = TextUtils.indexOf((CharSequence) "", '0', 0) + 2721;
            int iLastIndexOf5 = 18 - TextUtils.lastIndexOf("", '0');
            byte[] bArr15 = $$d;
            Object[] objArr215 = new Object[1];
            f((byte) (bArr15[19] - 1), (short) 140, bArr15[7], objArr215);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cNormalizeMetaState6, iIndexOf8, iLastIndexOf5, -1568796068, false, (String) objArr215[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr214)).longValue();
        int i24110 = f771a + 43;
        d = i24110 % 128;
        int i24111 = i24110 % 2;
        long j16 = -135172544;
        long j17 = -1;
        long j18 = jLongValue3 ^ j17;
        long jMyTid3 = Process.myTid();
        long j19 = (j16 | jMyTid3) ^ j17;
        long j110 = 407;
        long j111 = j16 ^ j17;
        long j112 = (j111 | jLongValue3) ^ j17;
        j = (((long) (-813)) * j16) + (((long) 408) * jLongValue3) + (((long) (-814)) * (((j18 | j16) ^ j17) | j19)) + ((((j18 | (jMyTid3 ^ j17)) ^ j17) | j112 | j19) * j110) + (j110 * (((jMyTid3 | jLongValue3) ^ j17) | j112 | ((j111 | jMyTid3) ^ j17))) + ((long) (-1675233301));
        i16 = (int) (j >> 32);
        int iUptimeMillis3 = (int) SystemClock.uptimeMillis();
        int i24112 = (-818885110) + (((~((-561451077) | iUptimeMillis3)) | 540213316 | (~((-875775335) | iUptimeMillis3))) * (-880));
        int i24113 = (~((-561451077) | (~iUptimeMillis3))) | 875775334;
        int i24114 = ~(iUptimeMillis3 | 561451076);
        i17 = i24112 + ((i24113 | i24114) * (-880)) + (i24114 * 880);
        i18 = d + 15;
        f771a = i18 % 128;
        if (i18 % 2 == 0) {
            Object obj7 = null;
            Runtime.getRuntime().freeMemory();
            obj7.hashCode();
            throw null;
        }
        int i24115 = i16 & i17;
        int iFreeMemory3 = (int) Runtime.getRuntime().freeMemory();
        int i24116 = ~iFreeMemory3;
        int i24117 = ((int) j) & (1453938690 + (((~(97997750 | i24116)) | (-1339228660)) * 519) + (((~(i24116 | (-1241514050))) | (~((-97714611) | iFreeMemory3))) * (-519)) + (((~(iFreeMemory3 | (-1339228660))) | (-97997751)) * 519));
        int i25110 = (i24115 & i24117) | (i24115 ^ i24117);
        i19 = i25110 >>> 24;
        int i25111 = i25110 & ViewCompat.MEASURED_SIZE_MASK;
        if (i19 != 0) {
            int i25112 = f771a;
            int i25113 = (i25112 & 73) + (i25112 | 73);
            d = i25113 % 128;
            int i25114 = i25113 % 2;
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i25115 = f771a;
            i20 = 1;
            int i25116 = (i25115 ^ 85) + ((i25115 & 85) << 1);
            d = i25116 % 128;
            int i25117 = i25116 % 2;
            i21 = 1;
        } else {
            i20 = 1;
            i21 = 0;
        }
        if (z) {
            string = null;
        } else {
            string = null;
        }
        list.add(string);
        int iTuitionPaymentFragmentbindingInflater116 = zzo.TuitionPaymentFragmentbindingInflater1();
        int i25118 = 2699 - (~(-(-(i19 * (-448)))));
        int i25119 = ~(((-7) & i19) | ((-7) ^ i19));
        int i26110 = ~i19;
        int i26111 = ~(i26110 | 6 | iTuitionPaymentFragmentbindingInflater116);
        int i26112 = i25118 + (((i25119 & i26111) | (i25119 ^ i26111)) * 449);
        int i26113 = (~((-7) | i19)) * (-1347);
        int i26114 = (i26112 & i26113) + (i26112 | i26113);
        int i26115 = ~(((-7) ^ i19) | (i19 & (-7)));
        int i26116 = ~iTuitionPaymentFragmentbindingInflater116;
        int i26117 = (i26116 & i26110) | (i26110 ^ i26116);
        int i26118 = ~((i26117 & 6) | (i26117 ^ 6));
        int i26119 = -(-(((i26118 & i26115) | (i26115 ^ i26118)) * 449));
        i22 = ((i26114 & i26119) + (i26119 | i26114)) * i21;
        int i278 = f771a;
        i23 = (i278 ^ 119) + ((i278 & 119) << 1);
        d = i23 % 128;
        if (i23 % 2 == 0) {
            return i22;
        }
        Object obj8 = null;
        obj8.hashCode();
        throw null;
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
    private static java.lang.String $$i(int r6, byte r7, byte r8) {
        /*
            byte[] r0 = com.google.android.gms.common.api.internal.zabx.$$c
            int r8 = r8 * 2
            int r8 = 1 - r8
            int r6 = r6 * 4
            int r6 = r6 + 4
            int r7 = r7 + 107
            byte[] r1 = new byte[r8]
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
            if (r5 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r3 = r0[r6]
        L24:
            int r7 = r7 + r3
            int r6 = r6 + 1
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zabx.$$i(int, byte, byte):java.lang.String");
    }
}
