package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
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
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.UInt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"LstartPreviewStreamStateFlow;", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "Lkotlin/UInt;", "<init>", "()V", "LcreateImageAnalysis;", "b", "LcreateImageAnalysis;", "getDescriptor", "()LcreateImageAnalysis;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class startPreviewStreamStateFlow implements videoProfileHdrFormatsToDynamicRangeEncoding<UInt> {
    public static final startPreviewStreamStateFlow INSTANCE;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static short[] f1406a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final createImageAnalysis TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int d;
    private static byte[] g;
    private static final byte[] $$c = {31, 115, -100, -11};
    private static final int $$f = 164;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {58, 66, -1, 15, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 54, 3, 3, -72, 56, 2, 3, -18, 10, -7, -16, 8, -65, 60, -4, -4, -5, 8, -24, 1, 9, -5, -3, -1, -4, -67, 73, -3, -17, -3, 30, -15, 8, -14, 3, -4, -33, 14, 21, -15, -11, 6, 3, -49, 41, -20, 3, 3, -11, 6, 3, -4, -6, -14, -5, 3, -11, 8, -6, 2, -5, -6, 2, -12, -4, 15, -16, -7, 15, -45, 31, -14, -2, 4, -11, -2, -2, -8, 17, -12, 5, -70};
    private static final int $$e = 30;
    private static final byte[] $$a = {58, -103, 118, 14, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 185;
    private static int asInterface = 0;
    private static int cancel = 1;
    private static int asBinder = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r8 = r8 * 52
            int r0 = 53 - r8
            int r7 = r7 + 84
            byte[] r1 = defpackage.startPreviewStreamStateFlow.$$a
            byte[] r0 = new byte[r0]
            int r8 = 52 - r8
            r2 = 0
            if (r1 != 0) goto L15
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2e
        L15:
            r3 = r2
        L16:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.startPreviewStreamStateFlow.c(short, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 15
            int r6 = 99 - r6
            int r7 = r7 * 4
            int r7 = 53 - r7
            byte[] r0 = defpackage.startPreviewStreamStateFlow.$$d
            int r8 = r8 * 48
            int r8 = 51 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2f
        L17:
            r3 = r2
        L18:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2f:
            int r6 = r6 + r8
            int r6 = r6 + 3
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.startPreviewStreamStateFlow.f(short, int, byte, java.lang.Object[]):void");
    }

    private startPreviewStreamStateFlow() {
    }

    private static void e(int i, int i2, short s, byte b, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5;
        int i6 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            long j = 0;
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b2 = (byte) 0;
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getPressedStateDuration() >> 16), 2267 - Color.red(0), 32 - ExpandableListView.getPackedPositionChild(0L), 1387473586, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i7 = $10 + 85;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (i4 != 0) {
                int i9 = $10 + 41;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                byte[] bArr = g;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i11 = 0;
                    while (i11 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i11])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.lastIndexOf("", '0') + 1), 3359 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)), Drawable.resolveOpacity(0, 0) + 18, -1054011043, false, $$g(b4, b4, (byte) $$c.length), new Class[]{Integer.TYPE});
                        }
                        bArr2[i11] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                        i11++;
                        j = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i12 = $11 + 111;
                    $10 = i12 % 128;
                    if (i12 % 2 != 0) {
                        byte[] bArr3 = g;
                        Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2266, ExpandableListView.getPackedPositionGroup(0L) + 33, 1387473586, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i5 = ((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) | 3046761265686732006L)) / ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) % 3046761265686732006L));
                    } else {
                        byte[] bArr4 = g;
                        Object[] objArr5 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b7 = (byte) 0;
                            byte b8 = b7;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), View.MeasureSpec.makeMeasureSpec(0, 0) + 2267, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 33, 1387473586, false, $$g(b7, b8, b8), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i5 = ((byte) (((long) bArr4[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L));
                    }
                    iIntValue = (byte) i5;
                } else {
                    iIntValue = (short) (((short) (((long) f1406a[i3 + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                int i13 = $11 + 25;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)) + i4;
                Object[] objArr6 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b9 = (byte) 0;
                    byte b10 = b9;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (55904 - KeyEvent.keyCodeFromString("")), Process.getGidForName("") + 2856, Color.rgb(0, 0, 0) + 16777229, -1529949196, false, $$g(b9, b10, (byte) (b10 + 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr5 = g;
                if (bArr5 != null) {
                    int i15 = $10 + 51;
                    $11 = i15 % 128;
                    int i16 = i15 % 2;
                    int length2 = bArr5.length;
                    byte[] bArr6 = new byte[length2];
                    for (int i17 = 0; i17 < length2; i17++) {
                        bArr6[i17] = (byte) (((long) bArr5[i17]) ^ 3046761265686732006L);
                    }
                    bArr5 = bArr6;
                }
                boolean z = bArr5 != null;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    if (z) {
                        int i18 = $10 + 35;
                        $11 = i18 % 128;
                        if (i18 % 2 == 0) {
                            byte[] bArr7 = g;
                            int i19 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i19 % 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 * (((byte) (((byte) (((long) bArr7[i19]) ^ 3046761265686732006L)) - s)) ^ b));
                        } else {
                            byte[] bArr8 = g;
                            int i20 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i20 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr8[i20]) ^ 3046761265686732006L)) + s)) ^ b));
                        }
                    } else {
                        short[] sArr = f1406a;
                        int i21 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i21 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i21]) ^ 3046761265686732006L)) + s)) ^ b));
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

    /* JADX WARN: Code duplicated, block: B:23:0x027c  */
    @Override // defpackage.isBitDepthMatched
    public final /* synthetic */ Object deserialize(stopListeningToRotationEvents stoplisteningtorotationevents) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "");
            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 876;
            int i2 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 10;
            byte[] bArr = $$a;
            byte b = bArr[5];
            Object[] objArr2 = new Object[1];
            c(b, bArr[3], (byte) (-b), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, scrollBarSize, i2, 252381699, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 364059224, Color.alpha(0) - 78, (short) (56 - Process.getGidForName("")), (byte) KeyEvent.keyCodeFromString(""), 57664 - AndroidCharacter.getMirror('0'), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(364059229 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (-78) - KeyEvent.keyCodeFromString(""), (short) ((-35) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (byte) (ViewConfiguration.getEdgeSlop() >> 16), (-1429020378) - Drawable.resolveOpacity(0, 0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 876;
            int scrollBarFadeDuration = 10 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            byte[] bArr2 = $$a;
            byte b2 = bArr2[5];
            byte b3 = bArr2[7];
            Object[] objArr5 = new Object[1];
            c(b2, b3, b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, scrollDefaultDelay, scrollBarFadeDuration, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
                int iIndexOf = 876 - TextUtils.indexOf("", "", 0);
                int iAlpha = 10 - Color.alpha(0);
                byte[] bArr3 = $$a;
                Object[] objArr6 = new Object[1];
                c((byte) 51, bArr3[54], (byte) (-bArr3[5]), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cAxisFromString, iIndexOf, iAlpha, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i3 = ~iIdentityHashCode;
            int i4 = (~(898649373 | i3)) | (-938962944) | (~(938959602 | i3));
            int i5 = ((((-1817227020) + (((~(iIdentityHashCode | (-898646033))) | i4) * 590)) + (i4 * (-1180))) + (((~((-938959603) | i3)) | (~(i3 | (-898649374)))) * 590)) - 925764521;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(364059226 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 79, (short) ((-23) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (byte) Color.alpha(0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 1429020363, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(364059227 - Color.alpha(0), TextUtils.indexOf((CharSequence) "", '0', 0) - 77, (short) (TextUtils.indexOf("", "", 0, 0) - 15), (byte) ((-1) - MotionEvent.axisFromString("")), (-1429020337) - View.MeasureSpec.getMode(0), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i8 = asInterface + 37;
                    cancel = i8 % 128;
                    int i9 = i8 % 2;
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
            e(TextUtils.getOffsetBefore("", 0) + 364059234, (-78) - TextUtils.indexOf("", "", 0, 0), (short) (101 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (byte) ExpandableListView.getPackedPositionType(0L), (-1429020318) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(TextUtils.getTrimmedLength("") + 364059233, (-79) - MotionEvent.axisFromString(""), (short) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 7), (byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), TextUtils.lastIndexOf("", '0', 0, 0) - 1429020302, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i10 = asInterface + 73;
            cancel = i10 % 128;
            int i11 = i10 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), -925764521};
                byte[] bArr4 = $$d;
                byte b4 = bArr4[41];
                byte b5 = (byte) (b4 - 1);
                byte b6 = b4;
                Object[] objArr13 = new Object[1];
                f(b5, b6, b6, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b7 = bArr4[41];
                byte b8 = (byte) (b7 - 1);
                Object[] objArr14 = new Object[1];
                f(b7, b8, b8, objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    int i12 = cancel + 45;
                    asInterface = i12 % 128;
                    int i13 = i12 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                        int absoluteGravity = 876 - Gravity.getAbsoluteGravity(0, 0);
                        int packedPositionType = 10 - ExpandableListView.getPackedPositionType(0L);
                        byte[] bArr5 = $$a;
                        Object[] objArr15 = new Object[1];
                        c((byte) 51, bArr5[54], (byte) (-bArr5[5]), objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(bitsPerPixel, absoluteGravity, packedPositionType, 256017550, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        e(364059225 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), TextUtils.indexOf("", "") - 78, (short) (KeyEvent.normalizeMetaState(0) + 57), (byte) ExpandableListView.getPackedPositionGroup(0L), ExpandableListView.getPackedPositionGroup(0L) - 1429020400, objArr16);
                        Class<?> cls5 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        e(364059229 - (ViewConfiguration.getTapTimeout() >> 16), (-78) - (ViewConfiguration.getLongPressTimeout() >> 16), (short) ((-35) - TextUtils.indexOf("", "")), (byte) (ViewConfiguration.getMaximumFlingVelocity() >> 16), View.combineMeasuredStates(0, 0) - 1429020378, objArr17);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 876;
                            int i14 = 10 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            byte[] bArr6 = $$a;
                            byte b9 = bArr6[5];
                            byte b10 = bArr6[7];
                            Object[] objArr18 = new Object[1];
                            c(b9, b10, b10, objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(doubleTapTimeout, offsetBefore, i14, 2009631821, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c2 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                            int touchSlop = 876 - (ViewConfiguration.getTouchSlop() >> 8);
                            int mode = 10 - View.MeasureSpec.getMode(0);
                            byte[] bArr7 = $$a;
                            byte b11 = bArr7[5];
                            Object[] objArr19 = new Object[1];
                            c(b11, bArr7[3], (byte) (-b11), objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, touchSlop, mode, 252381699, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i15 = ((int[]) objArr[2])[0];
        int i16 = ((int[]) objArr[0])[0];
        if (i16 == i15) {
            int i17 = ((int[]) objArr[1])[0];
            Object[] objArr20 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i18 = ~iIdentityHashCode2;
            int i19 = i17 + ((((~(i18 | (-747830701))) | ((~((-788140930) | i18)) | 747770240)) * (-397)) - 576350550) + ((iIdentityHashCode2 | (-40431150)) * 397);
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArr20[1])[0] = i21 ^ (i21 << 5);
            int i22 = cancel + 5;
            asInterface = i22 % 128;
            int i23 = i22 % 2;
        } else {
            int[] iArr = new int[i16];
            int i24 = i16 - 1;
            iArr[i24] = 1;
            Toast.makeText((Context) null, iArr[((i16 * i24) % 2) - 1], 1).show();
            int i25 = ((int[]) objArr[1])[0];
            Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i26 = ~iElapsedRealtime;
            int i27 = i25 + 800900004 + (((~(iElapsedRealtime | (-490727728))) | (~((-41948673) | i26)) | 1638443) * (-68)) + ((~((-489089285) | i26)) * (-68)) + (((~(490727727 | i26)) | (-531037957)) * 68);
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr21[1])[0] = i29 ^ (i29 << 5);
        }
        Intrinsics.checkNotNullParameter(stoplisteningtorotationevents, "");
        UInt uIntM8118boximpl = UInt.m8118boximpl(UInt.m8124constructorimpl(stoplisteningtorotationevents.decodeInline(getDescriptor()).decodeInt()));
        int i30 = asInterface + 91;
        cancel = i30 % 128;
        int i31 = i30 % 2;
        return uIntM8118boximpl;
    }

    @Override // defpackage.QualityAddedEncoderProfilesProvider
    public final /* synthetic */ void serialize(startListeningToRotationEvents startlisteningtorotationevents, Object obj) {
        int i = 2 % 2;
        int i2 = cancel + 119;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int data = ((UInt) obj).getData();
        if (i3 != 0) {
            Intrinsics.checkNotNullParameter(startlisteningtorotationevents, "");
            startlisteningtorotationevents.encodeInline(getDescriptor()).encodeInt(data);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(startlisteningtorotationevents, "");
        startlisteningtorotationevents.encodeInline(getDescriptor()).encodeInt(data);
    }

    static {
        d = 1;
        TuitionPaymentFragmentbindingInflater1();
        INSTANCE = new startPreviewStreamStateFlow();
        Intrinsics.checkNotNullParameter(IntCompanionObject.INSTANCE, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = lambdasetCameraSelector3androidxcameraviewCameraController.TuitionPaymentFragmentspecialinlinedviewModeldefault1("kotlin.UInt", lambdanew1androidxcameraviewCameraController.INSTANCE);
        int i = asBinder + 99;
        d = i % 128;
        int i2 = i % 2;
    }

    @Override // defpackage.videoProfileHdrFormatsToDynamicRangeEncoding, defpackage.QualityAddedEncoderProfilesProvider, defpackage.isBitDepthMatched
    public final createImageAnalysis getDescriptor() {
        int i = 2 % 2;
        int i2 = cancel;
        int i3 = i2 + 97;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        createImageAnalysis createimageanalysis = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i4 = i2 + 13;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 63 / 0;
        }
        return createimageanalysis;
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        TuitionPaymentFragmentbindingInflater1 = -645905898;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1934795605;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1726069486;
        g = new byte[]{47, 41, 93, 44, 22, 123, 41, 94, 46, 39, 11, 10, 100, 45, -18, 119, 36, 39, 34, 51, 91, 50, 36, -3, -63, -2, -51, -56, -7, -48, -9, -60, -13, -64, -44, -2, -52, 43, -3, -14, -19, -60, -54, 21, -5, -59, -19, -61, -21, -49, -36, -51, 48, -2, -63, -83, 4, -11, -12, -13, -64, -24, -61, 35, -24, -13, -30, -60, -21, -17, -22, -19, -23, -40, 58, -13, -2, -28, -23, -22, -57, 37, 69, 106, 122, 115, 39, 38, -124, 114, 78, 118, 63, -114, 96, 86, 116, 37, 31, 11, -62, 53, 11, -20, -9, 33, 27, -27, 11, 24, -25, 31, 21};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, short r7, short r8) {
        /*
            byte[] r0 = defpackage.startPreviewStreamStateFlow.$$c
            int r8 = r8 + 117
            int r7 = r7 * 4
            int r7 = 3 - r7
            int r6 = r6 * 2
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2c
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r7 = -r7
            int r7 = r7 + r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.startPreviewStreamStateFlow.$$g(int, short, short):java.lang.String");
    }
}
