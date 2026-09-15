package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class setPreviewResolutionSelector<T> implements videoProfileHdrFormatsToDynamicRangeEncoding<T> {
    private final createImageAnalysis TuitionPaymentFragmentbindingInflater1;
    private final videoProfileHdrFormatsToDynamicRangeEncoding<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final byte[] $$c = {87, 51, -85, 78};
    private static final int $$f = 20;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {109, 84, -87, -114, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$e = 18;
    private static final byte[] $$a = {65, -122, -65, 2, 6, -24, 18, 48, -72, 11, -1, -21, 0, 6, -14, -8, 72, -56, -5, -16, -5, 67, -45, 32, 2, -12, -13, -37, -16, -5, 8, 0, -6, 3, -1, -22, 12, -1, -18, 44, -54, 1, 12, -12, -8, 7, -9, -2, 21, -14, -14, -12, 13};
    private static final int $$b = 143;
    private static int b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f1378a = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {59783, 59782, 59745, 59719, 59782, 59788, 59783, 59719, 59764, 59807, 59764, 59779, 59803, 59784, 59791, 59791, 59800, 59755, 59790, 59705, 59751, 59745, 59737, 59698, 59718, 59745, 59749, 59775, 59738, 59724, 59744, 59744, 59758, 59708, 59746, 59746, 59756, 59746, 59728, 59725, 59716, 59742, 59754, 59691, 59740, 59746, 59744, 59771, 59751, 59757, 59740, 59731, 59748, 59757, 59752, 59770, 59771, 59744, 59725, 59786, 59734, 59757, 59785, 59761, 59785, 59778, 59784, 59791, 59783, 59746, 59737, 59749, 59790, 59767, 59762, 59788, 59789, 59786, 59766, 59760, 59704, 59757, 59751, 59759, 59733, 59744, 59746, 59711, 59784, 59796, 59822, 59815, 59776, 59781, 59834, 59810, 59811, 59813, 59820, 59796, 59820, 59776, 59785, 59821, 59821, 59819, 59818, 59796, 59822, 59799, 59798, 59821, 59820, 59820, 59823, 59817, 59823, 59823, 59800, 59793, 59823, 59802, 59787, 59764, 59759, 59841, 59713, 59802, 59801, 59795, 59804, 59800, 59794, 59779, 59786, 59795, 59819, 59792, 59807, 59807, 59800, 59780, 59804, 59794, 59786, 59782, 59434, 59412, 59420, 59408, 59415, 59415, 59432, 59427, 59435, 59394, 59878, 59405, 59427, 59435, 59410, 59894, 59395, 59424, 59432, 59433, 59427, 59434, 59410, 59434, 59406, 59895, 59435, 59435, 59409, 59791, 59404, 59393, 59393, 59399, 59393, 59392, 59398, 59902, 59902, 59399, 59423, 59396, 59395, 59395, 59404, 59400, 59392, 59398, 59756, 59846, 59845, 59845, 59866, 59864, 59844, 59844, 59844, 59846, 59846, 59846, 59844, 59844, 59846, 59846, 59867, 59867, 59845, 59845, 59846, 59865, 59865, 59846, 59736, 59819, 59793, 59792, 59817, 59803, 59779, 59818, 59808, 59801, 59750, 59784, 59818, 59819, 59784, 59767, 59819, 59819, 59793, 59722, 59765, 59768, 59775, 59751, 59865, 59847, 59846, 59871, 59849, 59824, 59866, 59870, 59855, 59853, 59866, 59724, 59791, 59755, 59756, 59791, 59790, 59756, 59738, 59775, 59789, 59764, 59765, 59791, 59788, 59765, 59695, 59741, 59749, 59758, 59752, 59768, 59750, 59744, 59745, 59750, 59770, 59677, 59730, 59820, 59816, 59815, 59800, 59782, 59821, 59835, 59804, 59801, 59808, 59697, 59773, 59749, 59751, 59770, 59749, 59730, 59699, 59738, 59770, 59746, 59751, 59770, 59749, 59746, 59715, 59714, 59757, 59751, 59771, 59744, 59746, 59756, 59704, 59757, 59751, 59753, 59731, 59753, 59756, 59757, 59759, 59757, 59730, 59740, 59756, 59746, 59698, 59744, 59757, 59759, 59756, 59756, 59740, 59730, 59757, 59759, 59757, 59756, 59753, 59731, 59753, 59751, 59757, 59774, 59899, 59897, 59902, 59896, 59883, 59855, 59859, 59897, 59872, 59876, 59899, 59879, 59897, 59868, 59866, 59898, 59877, 59878, 59871, 59845, 59897, 59897, 59879, 59698, 59769, 59744, 59756, 59756, 59756, 59757, 59746, 59733, 59755, 59751, 59757, 59682, 59739, 59738, 59713, 59720, 59712, 59713, 59733, 59673, 59701, 59693, 59743, 59755, 59792, 59450, 59424, 59430, 59425, 59430, 59452, 59453, 59429, 59428, 59722, 59782, 59816, 59816, 59707, 59756, 59745, 59713, 59722, 59733, 59750, 59771, 59768, 59751, 59754, 59756, 59747, 59756, 59758, 59744, 59744, 59724, 59718, 59698, 59802, 59433, 59427, 59415, 59422, 59427, 59428, 59437, 59435, 59433, 59681, 59739, 59730, 59787, 59793, 59795, 59793, 59805, 59800, 59792, 59799, 59805, 59805, 59804, 59771, 59749, 59803, 59781, 59806, 59796, 59773, 59770, 59800, 59781, 59805, 59796, 59774, 59748, 59805, 59804, 59807, 59802, 59804, 59795, 59802, 59748, 59774, 59799, 59799, 59797, 59804, 59749, 59749, 59803, 59795, 59804, 59803, 59805, 59819, 59793, 59806, 59782, 59670, 59706, 59695};
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -6829708820337873254L;

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = 103 - r8
            int r7 = r7 + 1
            byte[] r0 = defpackage.setPreviewResolutionSelector.$$d
            int r6 = 92 - r6
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2a
        L11:
            r3 = r2
        L12:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            int r6 = r6 + 1
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.setPreviewResolutionSelector.e(short, short, int, java.lang.Object[]):void");
    }

    private static void f(byte b2, short s, byte b3, Object[] objArr) {
        int i = (s * 3) + 103;
        byte[] bArr = $$a;
        int i2 = b3 * 17;
        int i3 = 37 - (b2 * 33);
        byte[] bArr2 = new byte[i2 + 17];
        int i4 = i2 + 16;
        int i5 = -1;
        if (bArr == null) {
            i3++;
            i = (i4 + (-i3)) - 3;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                int i6 = bArr[i3];
                i3++;
                i = (i + (-i6)) - 3;
            }
        }
    }

    public setPreviewResolutionSelector(videoProfileHdrFormatsToDynamicRangeEncoding<T> videoprofilehdrformatstodynamicrangeencoding) {
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencoding, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = videoprofilehdrformatstodynamicrangeencoding;
        this.TuitionPaymentFragmentbindingInflater1 = new CameraController2ExternalSyntheticLambda0(videoprofilehdrformatstodynamicrangeencoding.getDescriptor());
    }

    @Override // defpackage.videoProfileHdrFormatsToDynamicRangeEncoding, defpackage.QualityAddedEncoderProfilesProvider, defpackage.isBitDepthMatched
    public final createImageAnalysis getDescriptor() {
        int i = 2 % 2;
        int i2 = b + 103;
        int i3 = i2 % 128;
        f1378a = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        createImageAnalysis createimageanalysis = this.TuitionPaymentFragmentbindingInflater1;
        int i4 = i3 + 93;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 94 / 0;
        }
        return createimageanalysis;
    }

    @Override // defpackage.QualityAddedEncoderProfilesProvider
    public final void serialize(startListeningToRotationEvents startlisteningtorotationevents, T t) {
        int i = 2 % 2;
        int i2 = f1378a + 63;
        b = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(startlisteningtorotationevents, "");
        if (t == null) {
            startlisteningtorotationevents.encodeNull();
            return;
        }
        int i4 = b + 49;
        f1378a = i4 % 128;
        int i5 = i4 % 2;
        startlisteningtorotationevents.encodeNotNullMark();
        startlisteningtorotationevents.encodeSerializableValue(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, t);
    }

    @Override // defpackage.isBitDepthMatched
    public final T deserialize(stopListeningToRotationEvents stoplisteningtorotationevents) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(stoplisteningtorotationevents, "");
        if (!stoplisteningtorotationevents.decodeNotNullMark()) {
            T t = (T) stoplisteningtorotationevents.decodeNull();
            int i2 = b + 39;
            f1378a = i2 % 128;
            int i3 = i2 % 2;
            return t;
        }
        T t2 = (T) stoplisteningtorotationevents.decodeSerializableValue(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        int i4 = f1378a + 11;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return t2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = b + 115;
            f1378a = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 32 / 0;
            }
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, ((setPreviewResolutionSelector) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            return true;
        }
        int i4 = f1378a + 75;
        b = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = f1378a + 69;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            iHashCode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
            int i3 = 97 / 0;
        } else {
            iHashCode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
        }
        int i4 = b + 115;
        f1378a = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    private static void d(char[] cArr, int i, Object[] objArr) throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        while (true) {
            obj = null;
            if (abortcapture.b >= cArrB.length) {
                break;
            }
            int i3 = $11 + 27;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i5 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64837 - Process.getGidForName("")), 1356 - Color.argb(0, 0, 0, 0), ExpandableListView.getPackedPositionType(0L) + 38, 894276454, false, $$g(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - Gravity.getAbsoluteGravity(0, 0)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 468, 13 - (Process.myTid() >> 22), 896083767, false, "n", new Class[]{Object.class, Object.class});
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
        int i6 = $11 + 57;
        $10 = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static void c(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2;
        int i3 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i4 = 0;
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i4] = Integer.valueOf(cArr[i9]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) i4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', i4, i4) + 1), 1270 - (Process.myPid() >> 22), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 18, 407021364, false, $$g(b2, (byte) (b2 | 7), b2), new Class[]{Integer.TYPE});
                    }
                    cArr2[i9] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i9++;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i10 = $10 + 85;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            cArr = cArr2;
        }
        char[] cArr3 = new char[i6];
        System.arraycopy(cArr, i5, cArr3, 0, i6);
        if (bArr != null) {
            char[] cArr4 = new char[i6];
            setvideostabilizationmode.b = 0;
            char c = 0;
            while (setvideostabilizationmode.b < i6) {
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i12 = $11 + 1;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    int i14 = setvideostabilizationmode.b;
                    Object[] objArr3 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 3225 - KeyEvent.normalizeMetaState(0), 13 - TextUtils.getOffsetBefore("", 0), 2133916302, false, $$g(b3, (byte) (b3 | 8), b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                } else {
                    int i15 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b4 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (29944 - Gravity.getAbsoluteGravity(0, 0)), 1755 - (Process.myTid() >> 22), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 23, 387247676, false, $$g(b4, (byte) (b4 | 6), b4), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i15] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                }
                c = cArr4[setvideostabilizationmode.b];
                Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 + 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (41241 - (ViewConfiguration.getEdgeSlop() >> 16)), Drawable.resolveOpacity(0, 0) + 1705, ExpandableListView.getPackedPositionGroup(0L) + 21, -1434471773, false, $$g(b5, b6, (byte) (b6 - 2)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                int i16 = $10 + 63;
                $11 = i16 % 128;
                int i17 = i16 % 2;
            }
            cArr3 = cArr4;
        }
        if (i8 > 0) {
            int i18 = $11 + 15;
            $10 = i18 % 128;
            int i19 = i18 % 2;
            char[] cArr5 = new char[i6];
            i = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i6);
            int i20 = i6 - i8;
            System.arraycopy(cArr5, 0, cArr3, i20, i8);
            System.arraycopy(cArr5, i8, cArr3, 0, i20);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i6];
            while (true) {
                setvideostabilizationmode.b = i;
                if (setvideostabilizationmode.b >= i6) {
                    break;
                }
                cArr6[setvideostabilizationmode.b] = cArr3[(i6 - setvideostabilizationmode.b) - 1];
                i = setvideostabilizationmode.b + 1;
            }
            int i21 = $10 + 67;
            $11 = i21 % 128;
            i2 = 2;
            int i22 = i21 % 2;
            cArr3 = cArr6;
        } else {
            i2 = 2;
        }
        if (i7 > 0) {
            int i23 = $10 + 43;
            $11 = i23 % 128;
            if (i23 % i2 == 0) {
                setvideostabilizationmode.b = 0;
            } else {
                setvideostabilizationmode.b = 0;
            }
            while (setvideostabilizationmode.b < i6) {
                int i24 = $10 + 51;
                $11 = i24 % 128;
                int i25 = i24 % 2;
                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                setvideostabilizationmode.b++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 256471. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static java.lang.Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(android.content.Context r59, java.lang.String[] r60, int r61, int r62, int r63) {
        /*
            Method dump skipped, instruction units count: 25647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.setPreviewResolutionSelector.TuitionPaymentFragmentspecialinlinedviewModeldefault1(android.content.Context, java.lang.String[], int, int, int):java.lang.Object[]");
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
    private static java.lang.String $$g(byte r6, byte r7, byte r8) {
        /*
            int r6 = r6 * 4
            int r6 = r6 + 1
            int r8 = r8 * 3
            int r8 = 4 - r8
            int r7 = 107 - r7
            byte[] r0 = defpackage.setPreviewResolutionSelector.$$c
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r6
            r4 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r3 = r0[r8]
        L24:
            int r7 = r7 + r3
            int r8 = r8 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.setPreviewResolutionSelector.$$g(byte, byte, byte):java.lang.String");
    }
}
