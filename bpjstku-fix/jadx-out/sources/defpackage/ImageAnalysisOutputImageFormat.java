package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bpjstku.presentation.membership.accountactivation.newactivation.NewActivationPasswordActivity$special$$inlined$inject$default$2;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Queue;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ImageAnalysisOutputImageFormat extends InputStream {
    public static final Queue<ImageAnalysisOutputImageFormat> TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static byte[] f151a;
    private static short[] asInterface;
    private static int d;
    private static int g;
    public IOException TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public InputStream b;
    private static final byte[] $$c = {46, 126, -84, 108};
    private static final int $$f = 50;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {29, -5, -24, -13, -12, 2, 63, -57, -8, 0, 8, -5, 7, 55, -51, -13, 10, -14, 3, 6, 5, 54, -57, -6, -6, 69, -51, -20, 1, 12, 58, -51, -15, 7, 59, -69, 10, 2, -7, 5, -5, 64, -36, -19, -17, 7, 12, 2, -19, 11, -6, 1, 44, -45, -6, 7, 10, 17, -18, -13, -4, 13, 6, -2, -33, 12, -11, 11, -6, 1, 30, -17, -24, 12, 8, -9, -6, 46, -44, 17, -6, -6, 8, -9, -6, 1, 3, 11, 2, -6, 8, -11, 3, -5, 2, 3, -5, 9, 1, -18, 13, 4, -18, 42, -34, 11, -1, -7, 8, -1, -1, 5, -20, 9, -8, 67};
    private static final int $$e = 65;
    private static final byte[] $$a = {29, -5, -24, -13, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 36;
    private static int cancelAll = 0;
    private static int cancel = 1;
    private static int asBinder = 1;

    public static /* synthetic */ Object b(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = (~(i7 | i)) | i3;
        int i9 = ~i;
        int i10 = i7 | i3;
        int i11 = (~(i2 | i9 | i3)) | (~(i10 | i));
        int i12 = (~i10) | (~(i9 | (~i3)));
        int i13 = i3 + i + i6 + (1353909401 * i4) + ((-1351514252) * i5);
        int i14 = i13 * i13;
        int i15 = (1883508457 * i3) + 799145984 + ((-1483212659) * i) + (2050486552 * i8) + (i11 * 1122240372) + (1122240372 * i12) + ((-360972288) * i6) + (337379328 * i4) + ((-1540358144) * i5) + (669122560 * i14);
        int i16 = ((i3 * 521834465) - 1171472169) + (i * 521833829) + (i8 * (-424)) + (i11 * 212) + (i12 * 212) + (i6 * 521834041) + (i4 * 1123214353) + (i5 * (-684621612)) + (i14 * 1028784128);
        return i15 + ((i16 * i16) * 1635647488) != 1 ? TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
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
    private static void c(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 52
            int r6 = r6 + 4
            int r7 = r7 * 14
            int r7 = 98 - r7
            int r0 = r8 + 1
            byte[] r1 = defpackage.ImageAnalysisOutputImageFormat.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L29
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L24:
            r3 = r1[r6]
            r5 = r3
            r3 = r7
            r7 = r5
        L29:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-10)
            int r6 = r6 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ImageAnalysisOutputImageFormat.c(short, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = defpackage.ImageAnalysisOutputImageFormat.$$d
            int r7 = r7 * 8
            int r1 = r7 + 53
            int r6 = r6 * 60
            int r6 = r6 + 4
            int r8 = r8 * 15
            int r8 = 99 - r8
            byte[] r1 = new byte[r1]
            int r7 = r7 + 52
            r2 = 0
            if (r0 != 0) goto L19
            r8 = r6
            r3 = r7
            r4 = r2
            goto L31
        L19:
            r3 = r2
        L1a:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L2c
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2c:
            r3 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L31:
            int r3 = -r3
            int r6 = r6 + 1
            int r8 = r8 + r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ImageAnalysisOutputImageFormat.f(int, short, byte, java.lang.Object[]):void");
    }

    static {
        g = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentbindingInflater1 = getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0);
        int i = asBinder + 91;
        g = i % 128;
        int i2 = i % 2;
    }

    public static ImageAnalysisOutputImageFormat TuitionPaymentFragmentspecialinlinedviewModeldefault2(InputStream inputStream) {
        ImageAnalysisOutputImageFormat imageAnalysisOutputImageFormatPoll;
        Queue<ImageAnalysisOutputImageFormat> queue = TuitionPaymentFragmentbindingInflater1;
        synchronized (queue) {
            imageAnalysisOutputImageFormatPoll = queue.poll();
        }
        if (imageAnalysisOutputImageFormatPoll == null) {
            imageAnalysisOutputImageFormatPoll = new ImageAnalysisOutputImageFormat();
        }
        imageAnalysisOutputImageFormatPoll.b = inputStream;
        return imageAnalysisOutputImageFormatPoll;
    }

    ImageAnalysisOutputImageFormat() {
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        int i = 2 % 2;
        int i2 = cancelAll + 41;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        InputStream inputStream = this.b;
        if (i3 != 0) {
            return inputStream.available();
        }
        inputStream.available();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i = 2 % 2;
        int i2 = cancel + 111;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        this.b.close();
        int i4 = cancelAll + 95;
        cancel = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        int i2 = 2 % 2;
        int i3 = cancelAll + 17;
        cancel = i3 % 128;
        int i4 = i3 % 2;
        this.b.mark(i);
        int i5 = cancelAll + 103;
        cancel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 27 / 0;
        }
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        int i = 2 % 2;
        int i2 = cancel + 59;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        boolean zMarkSupported = this.b.markSupported();
        int i4 = cancelAll + 11;
        cancel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 55 / 0;
        }
        return zMarkSupported;
    }

    private static void e(int i, int i2, short s, byte b, int i3, Object[] objArr) throws Throwable {
        int length;
        byte[] bArr;
        int i4;
        int i5 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b2 = (byte) 0;
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getEdgeSlop() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 2267, 33 - TextUtils.indexOf("", "", 0), 1387473586, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            int i6 = iIntValue == -1 ? 1 : 0;
            if (i6 != 0) {
                int i7 = $10 + 55;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                byte[] bArr2 = f151a;
                if (bArr2 != null) {
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    for (int i9 = 0; i9 < length2; i9++) {
                        Object[] objArr3 = {Integer.valueOf(bArr2[i9])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char cRed = (char) Color.red(0);
                            int pressedStateDuration = 3358 - (ViewConfiguration.getPressedStateDuration() >> 16);
                            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 18;
                            byte length3 = (byte) $$c.length;
                            byte b4 = (byte) (length3 - 4);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRed, pressedStateDuration, jumpTapTimeout, -1054011043, false, $$g(length3, b4, b4), new Class[]{Integer.TYPE});
                        }
                        bArr3[i9] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    byte[] bArr4 = f151a;
                    try {
                        Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 2267 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.getOffsetAfter("", 0) + 33, 1387473586, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr4[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L)));
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    iIntValue = (short) (((short) (((long) asInterface[i3 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L)) + i6;
                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(d), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) 1;
                    byte b8 = (byte) (b7 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.getCapsMode("", 0, 0) + 55904), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2854, 14 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -1529949196, false, $$g(b7, b8, b8), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr5 = f151a;
                if (bArr5 != null) {
                    int i10 = $10 + 17;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        length = bArr5.length;
                        bArr = new byte[length];
                        i4 = 1;
                    } else {
                        length = bArr5.length;
                        bArr = new byte[length];
                        i4 = 0;
                    }
                    while (i4 < length) {
                        int i11 = $10 + 109;
                        $11 = i11 % 128;
                        int i12 = i11 % 2;
                        bArr[i4] = (byte) (((long) bArr5[i4]) ^ 3046761265686732006L);
                        i4++;
                    }
                    bArr5 = bArr;
                }
                boolean z = bArr5 != null;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    int i13 = $11 + 1;
                    $10 = i13 % 128;
                    if (i13 % 2 != 0) {
                        throw null;
                    }
                    if (!z) {
                        short[] sArr = asInterface;
                        int i14 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i14 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i14]) ^ 3046761265686732006L)) + s)) ^ b));
                    } else {
                        byte[] bArr6 = f151a;
                        int i15 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i15 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i15]) ^ 3046761265686732006L)) + s)) ^ b));
                        int i16 = $10 + 93;
                        $11 = i16 % 128;
                        int i17 = i16 % 2;
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

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) throws Throwable {
        Object[] objArr2;
        ImageAnalysisOutputImageFormat imageAnalysisOutputImageFormat = (ImageAnalysisOutputImageFormat) objArr[0];
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char mode = (char) (31533 - View.MeasureSpec.getMode(0));
            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 921;
            int iAlpha = Color.alpha(0) + 28;
            byte b = $$a[80];
            byte b2 = b;
            Object[] objArr3 = new Object[1];
            c(b, b2, b2, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(mode, keyRepeatTimeout, iAlpha, -1048449946, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(MotionEvent.axisFromString("") + 26939920, (-66) - TextUtils.getOffsetBefore("", 0), (short) ((ViewConfiguration.getTapTimeout() >> 16) - 62), (byte) View.MeasureSpec.makeMeasureSpec(0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 1129021933, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(26939924 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (-66) - (ViewConfiguration.getWindowTouchSlop() >> 8), (short) ((ViewConfiguration.getPressedStateDuration() >> 16) - 24), (byte) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (-1129021911) - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char size = (char) (View.MeasureSpec.getSize(0) + 31533);
            int iIndexOf = 920 - TextUtils.indexOf((CharSequence) "", '0', 0);
            int edgeSlop = 28 - (ViewConfiguration.getEdgeSlop() >> 16);
            byte[] bArr = $$a;
            Object[] objArr6 = new Object[1];
            c(bArr[80], bArr[7], (byte) ($$b | 16), objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(size, iIndexOf, edgeSlop, -778300370, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 31533);
                int i2 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 921;
                int iIndexOf2 = 27 - TextUtils.indexOf((CharSequence) "", '0', 0);
                byte b3 = $$a[7];
                byte b4 = b3;
                Object[] objArr7 = new Object[1];
                c(b3, b4, (byte) (b4 | 36), objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, i2, iIndexOf2, -1142834547, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i3 = 1240874587 + (((~((-1343891307) | startElapsedRealtime)) | 430188337) * (-366)) + (((~(startElapsedRealtime | (-1075445835))) | 161742865) * 366) + 2130432661;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArr2[0])[0] = i5 ^ (i5 << 5);
            int i6 = cancel + 55;
            cancelAll = i6 % 128;
            int i7 = i6 % 2;
        } else {
            Object[] objArr9 = new Object[1];
            e((ViewConfiguration.getPressedStateDuration() >> 16) + 26939919, (-66) - (ViewConfiguration.getWindowTouchSlop() >> 8), (short) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 66), (byte) ((-1) - ExpandableListView.getPackedPositionChild(0L)), KeyEvent.getDeadChar(0, 0) - 1129021896, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            e((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 26939920, (-67) - TextUtils.indexOf((CharSequence) "", '0', 0), (short) (Color.rgb(0, 0, 0) + 16777320), (byte) (KeyEvent.getMaxKeyCode() >> 16), (-1129021870) - View.resolveSizeAndState(0, 0, 0), objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr11 = new Object[1];
            e((ViewConfiguration.getTouchSlop() >> 8) + 26939928, (-66) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (short) ((-51) - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (byte) ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getPressedStateDuration() >> 16) - 1129021852, objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            e(26939927 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (-67) - ExpandableListView.getPackedPositionChild(0L), (short) (67 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (byte) (ViewConfiguration.getJumpTapTimeout() >> 16), View.combineMeasuredStates(0, 0) - 1129021836, objArr12);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, imageAnalysisOutputImageFormat)).intValue();
            int i8 = cancel;
            int i9 = i8 + 1;
            cancelAll = i9 % 128;
            int i10 = i9 % 2;
            int i11 = i8 + 61;
            cancelAll = i11 % 128;
            int i12 = i11 % 2;
            try {
                Object[] objArr13 = {applicationContext, Integer.valueOf(iIntValue), 0, 2130432661};
                byte[] bArr2 = $$d;
                byte b5 = bArr2[9];
                Object[] objArr14 = new Object[1];
                f(b5, bArr2[28], b5, objArr14);
                Class<?> cls4 = Class.forName((String) objArr14[0]);
                byte b6 = bArr2[28];
                Object[] objArr15 = new Object[1];
                f(b6, bArr2[9], b6, objArr15);
                Object[] objArr16 = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cMyPid = (char) (31533 - (Process.myPid() >> 22));
                    int i13 = 920 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    int iMyPid = (Process.myPid() >> 22) + 28;
                    byte b7 = $$a[7];
                    byte b8 = b7;
                    Object[] objArr17 = new Object[1];
                    c(b7, b8, (byte) (b8 | 36), objArr17);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMyPid, i13, iMyPid, -1142834547, false, (String) objArr17[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr16);
                try {
                    Object[] objArr18 = new Object[1];
                    e(26939919 - View.MeasureSpec.makeMeasureSpec(0, 0), (Process.myTid() >> 22) - 66, (short) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) - 62), (byte) TextUtils.indexOf("", "", 0), (-1129021933) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr18);
                    Class<?> cls5 = Class.forName((String) objArr18[0]);
                    Object[] objArr19 = new Object[1];
                    e((ViewConfiguration.getTapTimeout() >> 16) + 26939923, (-66) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (short) (Process.getGidForName("") - 23), (byte) View.resolveSizeAndState(0, 0, 0), TextUtils.indexOf("", "", 0) - 1129021911, objArr19);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 31534);
                        int capsMode = TextUtils.getCapsMode("", 0, 0) + 921;
                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 28;
                        byte[] bArr3 = $$a;
                        Object[] objArr20 = new Object[1];
                        c(bArr3[80], bArr3[7], (byte) ($$b | 16), objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, capsMode, maximumDrawingCacheSize, -778300370, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char packedPositionType = (char) (31533 - ExpandableListView.getPackedPositionType(0L));
                        int iLastIndexOf = 920 - TextUtils.lastIndexOf("", '0', 0, 0);
                        int iIndexOf3 = 28 - TextUtils.indexOf("", "", 0, 0);
                        byte b9 = $$a[80];
                        byte b10 = b9;
                        Object[] objArr21 = new Object[1];
                        c(b9, b10, b10, objArr21);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionType, iLastIndexOf, iIndexOf3, -1048449946, false, (String) objArr21[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr2 = objArr16;
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
        int i14 = ((int[]) objArr2[1])[0];
        int i15 = ((int[]) objArr2[3])[0];
        if (i15 != i14) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr2[4];
            if (strArr != null) {
                int i16 = cancel + 63;
                cancelAll = i16 % 128;
                for (int i17 = i16 % 2 != 0 ? 1 : 0; i17 < strArr.length; i17++) {
                    arrayList.add(strArr[i17]);
                }
            }
            throw new RuntimeException(String.valueOf(i15));
        }
        int i18 = ((int[]) objArr2[0])[0];
        Object[] objArr22 = {new int[1], new int[]{((int[]) objArr2[1])[0]}, (Object[]) objArr2[2], new int[]{((int[]) objArr2[3])[0]}, (String[]) objArr2[4]};
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i19 = (-1514955493) + (((~(742217630 | iElapsedRealtime)) | 1031862013) * 672);
        int i20 = ~iElapsedRealtime;
        int i21 = i18 + i19 + (((~(iElapsedRealtime | 1031862013)) | (~((-742217631) | i20))) * (-672)) + (((~((-1031862014) | i20)) | 293642337) * 672);
        int i22 = (i21 << 13) ^ i21;
        int i23 = i22 ^ (i22 >>> 17);
        ((int[]) objArr22[0])[0] = i23 ^ (i23 << 5);
        int i24 = cancel + 55;
        cancelAll = i24 % 128;
        int i25 = i24 % 2;
        try {
            return Integer.valueOf(imageAnalysisOutputImageFormat.b.read());
        } catch (IOException e2) {
            imageAnalysisOutputImageFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = e2;
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int i = 2 % 2;
        int i2 = cancelAll + 87;
        cancel = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.b.read(bArr);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i3 = this.b.read(bArr);
            int i4 = cancelAll + 101;
            cancel = i4 % 128;
            int i5 = i4 % 2;
            return i3;
        } catch (IOException e2) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = e2;
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 2 % 2;
        int i4 = cancelAll + 109;
        cancel = i4 % 128;
        int i5 = i4 % 2;
        try {
            int i6 = this.b.read(bArr, i, i2);
            int i7 = cancelAll + 125;
            cancel = i7 % 128;
            int i8 = i7 % 2;
            return i6;
        } catch (IOException e2) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = e2;
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        synchronized (this) {
            this.b.reset();
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) throws IOException {
        ImageAnalysisOutputImageFormat imageAnalysisOutputImageFormat = (ImageAnalysisOutputImageFormat) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i = 2 % 2;
        int i2 = cancelAll + 23;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        try {
            long jSkip = imageAnalysisOutputImageFormat.b.skip(jLongValue);
            int i4 = cancelAll + 85;
            cancel = i4 % 128;
            int i5 = i4 % 2;
            return Long.valueOf(jSkip);
        } catch (IOException e2) {
            imageAnalysisOutputImageFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = e2;
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        return ((Integer) b(1828700307, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1828700306, new Object[]{this}, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1())).intValue();
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        Object[] objArr = {this, Long.valueOf(j)};
        return ((Long) b(296091836, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -296091836, objArr, NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1())).longValue();
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -806953717;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -1934795609;
        d = 1925821108;
        f151a = new byte[]{51, -96, -44, -89, -127, -14, -96, -55, -39, -34, -126, -123, 31, -92, -103, -18, -33, -34, -35, -86, -46, -83, 40, -10, -6, -21, -58, -59, -14, -51, -32, -15, -20, -3, -63, -21, -7, 63, 39, 92, 87, 46, 52, ByteCompanionObject.MAX_VALUE, 37, 47, 87, 45, 85, 41, 6, 55, -102, 88, 43, 23, 110, 95, 94, 93, 42, 82, 45, 55, 113, 120, 107, 77, 112, 116, 115, 114, 126, 33, -125, 120, 71, 109, 126, 115, 76, 41, -35, -62, -46, -53, -65, -66, 28, -54, -90, -50, -105, -26, -8, -82, -52, 41, 88, 84, 15, 126, 84, 41, 48, 106, 36, 46, 84, 37, 32, 88, 94};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, int r7, byte r8) {
        /*
            int r8 = r8 * 2
            int r8 = r8 + 1
            int r7 = r7 * 4
            int r7 = 3 - r7
            byte[] r0 = defpackage.ImageAnalysisOutputImageFormat.$$c
            int r6 = r6 + 117
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            int r7 = r7 + 1
            if (r4 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r7]
        L26:
            int r3 = -r3
            int r6 = r6 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ImageAnalysisOutputImageFormat.$$g(short, int, byte):java.lang.String");
    }
}
