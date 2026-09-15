package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LgetVideoCaptureQualitySelector;", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "", "LonRotationChanged;", "", "LgetTapToFocusState;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getVideoCaptureQualitySelector extends onRotationChanged<Float, float[], getTapToFocusState> {
    public static final getVideoCaptureQualitySelector INSTANCE;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static short[] asBinder;
    private static int asInterface;
    private static int b;
    private static final byte[] $$c = {106, -66, 28, 119};
    private static final int $$f = 137;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {46, 47, -18, 64, -9, -2, -7, -6, -10, -9, 40, -58, -3, -5, 10, 14, -32, -24, 10, -14, 50, -23, -51, -6, 1, -10, -5, -21, -4, 10, -26, 4, -13, -6, -12, 25, -21, -19, -13, -9, 0, 0, 28, -40, -24, 6, -1, -9, -40, 5, -18, 4, -13, -6, 23, -24, -31, 5, 1, -16, -13, 39, -51, 10, -13, -13, 1, -16, -13, -6, -4, 4, -5, -13, 1, -18, -4, -12, -5, -4, -12, 2, -6, -25, 6, -3, -25, 35, -41, 4, -8, -14, 1, -8, -8, -2, -27, 2, -15, 59};
    private static final int $$e = 20;
    private static final byte[] $$a = {23, -73, 107, 5, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 219;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f1000a = 0;
    private static int g = 1;
    private static int d = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 52
            int r7 = 108 - r7
            int r5 = r5 * 3
            int r5 = 84 - r5
            int r6 = r6 * 15
            int r0 = r6 + 38
            byte[] r1 = defpackage.getVideoCaptureQualitySelector.$$a
            byte[] r0 = new byte[r0]
            int r6 = r6 + 37
            r2 = -1
            if (r1 != 0) goto L18
            r3 = r2
            r2 = r7
            goto L31
        L18:
            r4 = r7
            r7 = r5
            r5 = r4
        L1b:
            int r2 = r2 + 1
            byte r3 = (byte) r7
            r0[r2] = r3
            if (r2 != r6) goto L2b
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            r8[r6] = r5
            return
        L2b:
            r3 = r1[r5]
            r4 = r2
            r2 = r5
            r5 = r3
            r3 = r4
        L31:
            int r5 = -r5
            int r7 = r7 + r5
            int r7 = r7 + (-11)
            int r5 = r2 + 1
            r2 = r3
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getVideoCaptureQualitySelector.c(int, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r8 = r8 * 8
            int r8 = 53 - r8
            int r7 = r7 * 31
            int r7 = 115 - r7
            byte[] r0 = defpackage.getVideoCaptureQualitySelector.$$d
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            int r6 = r6 + 1
            r3 = r0[r6]
        L28:
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-7)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getVideoCaptureQualitySelector.f(short, int, int, java.lang.Object[]):void");
    }

    private static void e(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(b)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b3 = (byte) 0;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) KeyEvent.getDeadChar(0, 0), 2267 - (KeyEvent.getMaxKeyCode() >> 16), TextUtils.lastIndexOf("", '0', 0) + 34, 1387473586, false, $$g(b3, (byte) (b3 - 1), (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            int i5 = iIntValue == -1 ? 1 : 0;
            if ((i5 ^ 1) == 0) {
                byte[] bArr = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                long j = 0;
                if (bArr != null) {
                    int i6 = $10 + 23;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i8 = 0;
                    while (i8 < length) {
                        int i9 = $11 + 37;
                        $10 = i9 % 128;
                        int i10 = i9 % 2;
                        Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char c = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int i11 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3357;
                            int i12 = 19 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1));
                            byte b4 = (byte) 0;
                            byte b5 = (byte) (b4 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, i11, i12, -1054011043, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                        }
                        bArr2[i8] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                        i8++;
                        j = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i13 = $11 + 7;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    byte[] bArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 2266 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (ViewConfiguration.getPressedStateDuration() >> 16) + 33, 1387473586, false, $$g(b6, (byte) (b6 - 1), (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) b) ^ 3046761265686732006L)));
                } else {
                    iIntValue = (short) (((short) (((long) asBinder[i3 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) b) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                int i15 = $11 + 59;
                $10 = i15 % 128;
                int i16 = i15 % 2;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L)) + i5;
                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = (byte) (b7 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (55904 - KeyEvent.getDeadChar(0, 0)), TextUtils.lastIndexOf("", '0', 0) + 2856, ((Process.getThreadPriority(0) + 20) >> 6) + 13, -1529949196, false, $$g(b7, b8, (byte) (b8 + 4)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (bArr4 != null) {
                    int i17 = $11 + 33;
                    $10 = i17 % 128;
                    int i18 = i17 % 2;
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i19 = 0; i19 < length2; i19++) {
                        bArr5[i19] = (byte) (((long) bArr4[i19]) ^ 3046761265686732006L);
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i20 = $11 + 5;
                    $10 = i20 % 128;
                    int i21 = i20 % 2;
                    z = true;
                } else {
                    z = false;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    int i22 = $10 + 77;
                    $11 = i22 % 128;
                    if (i22 % 2 == 0) {
                        throw null;
                    }
                    if (!z) {
                        short[] sArr = asBinder;
                        int i23 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i23 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i23]) ^ 3046761265686732006L)) + s)) ^ b2));
                    } else {
                        byte[] bArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i24 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i24 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i24]) ^ 3046761265686732006L)) + s)) ^ b2));
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

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object obj) {
        int i = 2 % 2;
        float[] fArr = (float[]) obj;
        Intrinsics.checkNotNullParameter(fArr, "");
        getTapToFocusState gettaptofocusstate = new getTapToFocusState(fArr);
        int i2 = g + 25;
        f1000a = i2 % 128;
        if (i2 % 2 == 0) {
            return gettaptofocusstate;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // defpackage.onRotationChanged
    public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(isUseCaseEnabled isusecaseenabled, float[] fArr, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = f1000a + 83;
        g = i4 % 128;
        int i5 = i4 % 2;
        float[] fArr2 = fArr;
        Intrinsics.checkNotNullParameter(isusecaseenabled, "");
        if (i5 == 0) {
            Intrinsics.checkNotNullParameter(fArr2, "");
            i2 = 1;
        } else {
            Intrinsics.checkNotNullParameter(fArr2, "");
            i2 = 0;
        }
        while (i2 < i) {
            isusecaseenabled.encodeFloatElement(getDescriptor(), i2, fArr2[i2]);
            i2++;
        }
        int i6 = f1000a + 115;
        g = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 61 / 0;
        }
    }

    @Override // defpackage.getImageAnalysisOutputImageFormat, defpackage.speedUpZoomBy2X
    public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(setActiveRecording setactiverecording, int i, Object obj, boolean z) {
        int i2 = 2 % 2;
        int i3 = f1000a + 121;
        g = i3 % 128;
        int i4 = i3 % 2;
        getTapToFocusState gettaptofocusstate = (getTapToFocusState) obj;
        Intrinsics.checkNotNullParameter(setactiverecording, "");
        Intrinsics.checkNotNullParameter(gettaptofocusstate, "");
        float fDecodeFloatElement = setactiverecording.decodeFloatElement(getDescriptor(), i);
        getTapToFocusState gettaptofocusstate2 = gettaptofocusstate;
        gettaptofocusstate2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(gettaptofocusstate2.getTuitionPaymentFragmentspecialinlinedviewModeldefault1() + 1);
        float[] fArr = gettaptofocusstate.b;
        int i5 = gettaptofocusstate.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        gettaptofocusstate.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 + 1;
        fArr[i5] = fDecodeFloatElement;
        int i6 = f1000a + 111;
        g = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0282  */
    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ int b(Object obj) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1);
            int i3 = 2268 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            int tapTimeout = 33 - (ViewConfiguration.getTapTimeout() >> 16);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c(bArr[7], bArr[5], bArr[40], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, i3, tapTimeout, -887667012, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(TextUtils.indexOf("", "", 0, 0) - 1859446113, (-108) - Color.argb(0, 0, 0, 0), (short) TextUtils.getOffsetBefore("", 0), (byte) TextUtils.getOffsetAfter("", 0), (-1090461126) - ((byte) KeyEvent.getModifierMetaStateMask()), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e((-1859446108) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 109, (short) Color.alpha(0), (byte) (KeyEvent.getMaxKeyCode() >> 16), TextUtils.indexOf("", "", 0, 0) - 1090461103, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
            int i4 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2267;
            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 33;
            byte[] bArr2 = $$a;
            byte b2 = bArr2[7];
            byte b3 = bArr2[5];
            Object[] objArr5 = new Object[1];
            c(b2, b3, b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, i4, touchSlop, -874156483, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = f1000a + 25;
            g = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int iAlpha = 2267 - Color.alpha(0);
                int longPressTimeout = 33 - (ViewConfiguration.getLongPressTimeout() >> 16);
                byte b4 = $$a[7];
                byte b5 = b4;
                Object[] objArr6 = new Object[1];
                c(b4, b5, b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(minimumFlingVelocity, iAlpha, longPressTimeout, -654680577, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i7 = ((int[]) objArr7[0])[0];
            int i8 = ((int[]) objArr7[3])[0];
            String[] strArr = (String[]) objArr7[1];
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i9 = 899827689 + (((~((~iMaxMemory) | 13717798)) | 822348936) * 446) + (((~(iMaxMemory | 836066734)) | 82178) * 446) + 969195768;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[2])[0] = i11 ^ (i11 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e((-1859446114) - ((byte) KeyEvent.getModifierMetaStateMask()), (-108) - View.MeasureSpec.getMode(0), (short) ExpandableListView.getPackedPositionGroup(0L), (byte) View.getDefaultSize(0, 0), ((Process.getThreadPriority(0) + 20) >> 6) - 1090461088, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e((-1859446111) - (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) - 108, (short) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (byte) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1090461063, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i12 = f1000a + 69;
                    g = i12 % 128;
                    if (i12 % 2 == 0) {
                        ((ContextWrapper) applicationContext).getBaseContext();
                        throw null;
                    }
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
            e(ExpandableListView.getPackedPositionChild(0L) - 1859446103, (-108) - TextUtils.getCapsMode("", 0, 0), (short) View.combineMeasuredStates(0, 0), (byte) (ExpandableListView.getPackedPositionChild(0L) + 1), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 1090461043, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e((-1859446104) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (-108) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (short) TextUtils.indexOf("", "", 0, 0), (byte) TextUtils.getOffsetBefore("", 0), TextUtils.getCapsMode("", 0, 0) - 1090461028, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i13 = g + 61;
            f1000a = i13 % 128;
            int i14 = i13 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -726209528};
                byte[] bArr3 = $$d;
                Object[] objArr13 = new Object[1];
                f(bArr3[46], bArr3[40], bArr3[24], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                f((byte) 43, bArr3[24], bArr3[40], objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                        int iKeyCodeFromString = 2267 - KeyEvent.keyCodeFromString("");
                        int longPressTimeout2 = 33 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        byte b6 = $$a[7];
                        byte b7 = b6;
                        Object[] objArr16 = new Object[1];
                        c(b6, b7, b7, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(offsetBefore, iKeyCodeFromString, longPressTimeout2, -654680577, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        e((-1859446113) - Drawable.resolveOpacity(0, 0), (-108) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (short) (AndroidCharacter.getMirror('0') - '0'), (byte) View.resolveSize(0, 0), (ViewConfiguration.getEdgeSlop() >> 16) - 1090461125, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        e((-1859446109) - (ViewConfiguration.getEdgeSlop() >> 16), (-108) - KeyEvent.keyCodeFromString(""), (short) KeyEvent.normalizeMetaState(0), (byte) TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 1090461103, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cGreen = (char) Color.green(0);
                            int maximumDrawingCacheSize = 2267 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                            int defaultSize = 33 - View.getDefaultSize(0, 0);
                            byte[] bArr4 = $$a;
                            byte b8 = bArr4[7];
                            byte b9 = bArr4[5];
                            Object[] objArr19 = new Object[1];
                            c(b8, b9, b9, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cGreen, maximumDrawingCacheSize, defaultSize, -874156483, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                            int iMyPid = (Process.myPid() >> 22) + 2267;
                            int maxKeyCode = 33 - (KeyEvent.getMaxKeyCode() >> 16);
                            byte[] bArr5 = $$a;
                            Object[] objArr20 = new Object[1];
                            c(bArr5[7], bArr5[5], bArr5[40], objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(keyRepeatTimeout, iMyPid, maxKeyCode, -887667012, false, (String) objArr20[0], null);
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
        int i15 = ((int[]) objArr[3])[0];
        int i16 = ((int[]) objArr[0])[0];
        if (i16 != i15) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[1];
            if (strArr2 != null) {
                while (i2 < strArr2.length) {
                    int i17 = g + 87;
                    f1000a = i17 % 128;
                    int i18 = i17 % 2;
                    arrayList.add(strArr2[i2]);
                    i2++;
                    int i19 = f1000a + 103;
                    g = i19 % 128;
                    int i20 = i19 % 2;
                }
            }
            throw new RuntimeException(String.valueOf(i16));
        }
        Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
        int i21 = ((int[]) objArr[2])[0];
        int i22 = ((int[]) objArr[0])[0];
        int i23 = ((int[]) objArr[3])[0];
        String[] strArr3 = (String[]) objArr[1];
        int iNextInt = new Random().nextInt(1285563050);
        int i24 = ~iNextInt;
        int i25 = i21 + (-615070855) + (((~((-27822588) | i24)) | (~((-780890729) | iNextInt))) * (-370)) + (((~(iNextInt | (-27822588))) | (~(i24 | (-780890729))) | (-799800316)) * (-370)) + 426626504;
        int i26 = (i25 << 13) ^ i25;
        int i27 = i26 ^ (i26 >>> 17);
        ((int[]) objArr21[2])[0] = i27 ^ (i27 << 5);
        float[] fArr = (float[]) obj;
        Intrinsics.checkNotNullParameter(fArr, "");
        return fArr.length;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private getVideoCaptureQualitySelector() {
        super(getVideoCaptureTargetFrameRate.INSTANCE);
        Intrinsics.checkNotNullParameter(FloatCompanionObject.INSTANCE, "");
    }

    @Override // defpackage.onRotationChanged
    public final /* synthetic */ float[] b() {
        int i = 2 % 2;
        int i2 = g + 51;
        int i3 = i2 % 128;
        f1000a = i3;
        int i4 = i2 % 2;
        float[] fArr = new float[0];
        int i5 = i3 + 37;
        g = i5 % 128;
        int i6 = i5 % 2;
        return fArr;
    }

    static {
        asInterface = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        INSTANCE = new getVideoCaptureQualitySelector();
        int i = d + 59;
        asInterface = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -867024605;
        b = -1934795635;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -495339228;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new byte[]{77, -18, 18, -27, -49, 48, -18, 23, -25, 28, -64, -61, 93, -30, -89, 44, 29, 28, 27, -24, 16, -21, 66, 30, -30, 19, -18, -19, 26, -11, 8, 25, 20, -27, -23, 19, -31, 73, -27, 26, 21, -20, -14, Base64.padSymbol, -29, -19, 21, -21, 19, -9, -60, -11, 88, -26, -23, -43, 44, 29, 28, 27, -24, 16, -21, 65, 25, -32, 19, -11, 24, 28, 27, 26, -26, -55, 43, -32, -17, 21, -26, 27, -12, 67, -18, 23, -25, 28, -64, -61, 33, 31, -21, 19, -40, 43, 13, -13, 17, 67, -25, 19, -54, Base64.padSymbol, 19, -12, -1, 41, -29, -19, 19, -32, -17, -25, 29};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, int r7, byte r8) {
        /*
            int r7 = r7 + 4
            byte[] r0 = defpackage.getVideoCaptureQualitySelector.$$c
            int r6 = r6 * 3
            int r1 = 1 - r6
            int r8 = 121 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            r3 = -1
            if (r0 != 0) goto L15
            r4 = r6
            r8 = r7
            goto L29
        L15:
            r5 = r8
            r8 = r7
            r7 = r5
        L18:
            int r3 = r3 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r8 = r8 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            r4 = r0[r8]
        L29:
            int r4 = -r4
            int r7 = r7 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getVideoCaptureQualitySelector.$$g(short, int, byte):java.lang.String");
    }
}
