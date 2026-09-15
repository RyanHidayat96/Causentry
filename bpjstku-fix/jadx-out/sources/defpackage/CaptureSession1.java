package defpackage;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentTutorialVerificationBiometricBinding;
import com.bpjstku.domain.jp.model.JpDataTk;
import java.io.File;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013BU\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u001e\b\u0002\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u000fH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0017\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0018\u0010\u0014R\u001c\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR*\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001eR\u0014\u0010\u0013\u001a\u00020\u001f8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010 R\u0016\u0010\u0017\u001a\u00020!8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0016\u0010\""}, d2 = {"LCaptureSession1;", "LunregisterMediaButtonEventReceiver;", "Lkotlin/Function0;", "", "p0", "p1", "Lkotlin/Function2;", "Ljava/io/File;", "p2", "Lcom/bpjstku/domain/jp/model/JpDataTk;", "p3", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lcom/bpjstku/domain/jp/model/JpDataTk;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "Landroid/os/Bundle;", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()V", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lkotlin/jvm/functions/Function0;", "TuitionPaymentFragmentbindingInflater1", "asInterface", "Lkotlin/jvm/functions/Function2;", "Lcom/bpjstku/domain/jp/model/JpDataTk;", "", "()I", "Lcom/bpjstku/databinding/FragmentTutorialVerificationBiometricBinding;", "Lcom/bpjstku/databinding/FragmentTutorialVerificationBiometricBinding;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CaptureSession1 extends unregisterMediaButtonEventReceiver {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Function0<Unit> b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Function0<Unit> TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private FragmentTutorialVerificationBiometricBinding d;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Function2<unregisterMediaButtonEventReceiver, File, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final JpDataTk TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return R.layout.fragment_tutorial_verification_biometric;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void b() {
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void d() {
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void g() {
    }

    public /* synthetic */ CaptureSession1(Function0 function0, Function0 function1, Function2 function2, JpDataTk jpDataTk, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function0, (i & 2) != 0 ? null : function1, (i & 4) != 0 ? null : function2, jpDataTk);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CaptureSession1(Function0<Unit> function0, Function0<Unit> function1, Function2<? super unregisterMediaButtonEventReceiver, ? super File, Unit> function2, JpDataTk jpDataTk) {
        this.TuitionPaymentFragmentbindingInflater1 = function0;
        this.b = function1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = function2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = jpDataTk;
    }

    /* JADX INFO: renamed from: CaptureSession1$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LCaptureSession1$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private static final byte[] $$c = {89, 107, -36, -112};
        private static final int $$f = 224;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {46, 47, -18, 64};
        private static final int $$e = 185;
        private static final byte[] $$a = {119, -103, 14, -22, -11, 19, -23, -53, 60, -13, 11, -9, -59, 36, 18, 8, -15, -6, 1, -1, -21, 15, 0};
        private static final int $$b = 224;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        private static int TuitionPaymentFragmentbindingInflater1 = 1;
        private static int[] b = {1504351644, 369937068, -1247642807, 719060623, 880793388, 1363875184, -2614811, -1171365057, 931287276, -78130598, -881350636, 336931496, -76835125, -1248599187, 674135400, -1290279346, 1136928744, 1242950595};
        private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {59722, 59761, 59763, 59762, 59773, 59764, 59698, 59749, 59756, 59758, 59747, 59750, 59744, 59756, 59705, 59747, 59756, 59754, 59759, 59756, 59749, 59744, 59752, 59759, 59715, 59715, 59756, 59744, 59751, 59718, 59738, 59749, 59744, 59744, 59719, 59714, 59744, 59751, 59713, 59714, 59745, 59739, 59732, 59850, 59851, 59825, 59830, 59851, 59852, 59855, 59831, 59830, 59817, 59820, 59842, 59667, 59705, 59752, 59755, 59758, 59747, 59748, 59773, 59745, 59716, 59798, 59792, 59817, 59823, 59816, 59815, 59822, 59816, 59697, 59770, 59751, 59751, 59748, 59704, 59751, 59744, 59745, 59751, 59717, 59696, 59771, 59752, 59845, 59844, 59845, 59870, 59869, 59865, 59866, 59709, 59746, 59744, 59768, 59770, 59770, 59769, 59698, 59769, 59749, 59745, 59749, 59751, 59719, 59698, 59768, 59698, 59768, 59745, 59746, 59768, 59746, 59744, 59771, 59749, 59749, 59752, 59758, 59750, 59746, 59756, 59757, 59759, 59757, 59746, 59770, 59707, 59746, 59768, 59768, 59751, 59759, 59712, 59805, 59768, 59769, 59781, 59801, 59807, 59802, 59802, 59781, 59777, 59782, 59805, 59804, 59804, 59782, 59716, 59797, 59807, 59782, 59780, 59806, 59800, 59806, 59794, 59761, 59733, 59849, 59842, 59843, 59843, 59867, 59844, 59867, 59845, 59842, 59852, 59708, 59746, 59754, 59746, 59773, 59768, 59756, 59747, 59750, 59748, 59775, 59770, 59769, 59771, 59676, 59714, 59759, 59750, 59676, 59738, 59773, 59773, 59768, 59751, 59746, 59717, 59715, 59758, 59744, 59708, 59717, 59738, 59773, 59773, 59768, 59751, 59746, 59717, 59738, 59745, 59758, 59696, 59775, 59749, 59768, 59729, 59800, 59399, 59398, 59428, 59438, 59434, 59409, 59883, 59421, 59413, 59408, 59436, 59423, 59883, 59434, 59439, 59437, 59813, 59837, 59838, 59811, 59851, 59809, 59808, 59837, 59839, 59838, 59815, 59750, 59862, 59862, 59883, 59848, 59849, 59885, 59861, 59825, 59849, 59885, 59863, 59864, 59871, 59870, 59856, 59883, 59883, 59707, 59745, 59745, 59715, 59718, 59750, 59746, 59753, 59757, 59718, 59684, 59714, 59676, 59714, 59753, 59745, 59745, 59715, 59718, 59750, 59746, 59753, 59757, 59718, 59715, 59758, 59744, 59717, 59676, 59684, 59714, 59753, 59745, 59745, 59715, 59718, 59750, 59746, 59753, 59757, 59718, 59736, 59750, 59758, 59744, 59720, 59811, 59850, 59831, 59849, 59822, 59703, 59773, 59738, 59684, 59738, 59773, 59749, 59714, 59685, 59717, 59744, 59758, 59715, 59717, 59746, 59751, 59768, 59676, 59738, 59773, 59773, 59768, 59751, 59746, 59717, 59715, 59758, 59744, 59717, 59713, 59752, 59758, 59745, 59748, 59745, 59752, 59758, 59713, 59775, 59395, 59438, 59412, 59436, 59398, 59395, 59432, 59437, 59430, 59451, 59451, 59392, 59676, 59717, 59744, 59758, 59715, 59739, 59769, 59775, 59737, 59708, 59779, 59811, 59812, 59835, 59781};

        private static void a(short s, byte b2, short s2, Object[] objArr) {
            int i = s2 + 97;
            int i2 = (b2 * 3) + 4;
            int i3 = s * 3;
            byte[] bArr = $$d;
            byte[] bArr2 = new byte[i3 + 1];
            int i4 = -1;
            if (bArr == null) {
                i2++;
                i += -i2;
            }
            while (true) {
                i4++;
                bArr2[i4] = (byte) i;
                if (i4 == i3) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                } else {
                    byte b3 = bArr[i2];
                    i2++;
                    i += -b3;
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002b  */
        /* JADX WARN: Code duplicated, block: B:8:0x0023  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0030). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void e(byte r6, int r7, int r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 * 15
                int r7 = r7 + 4
                int r6 = r6 * 9
                int r6 = r6 + 106
                byte[] r0 = defpackage.CaptureSession1.Companion.$$a
                int r8 = r8 * 11
                int r1 = r8 + 5
                byte[] r1 = new byte[r1]
                int r8 = r8 + 4
                r2 = 0
                if (r0 != 0) goto L18
                r3 = r7
                r4 = r2
                goto L30
            L18:
                r3 = r2
                r5 = r7
                r7 = r6
                r6 = r5
            L1c:
                byte r4 = (byte) r7
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r8) goto L2b
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L2b:
                r3 = r0[r6]
                r5 = r3
                r3 = r6
                r6 = r5
            L30:
                int r7 = r7 + r6
                int r6 = r3 + 1
                int r7 = r7 + 2
                r3 = r4
                goto L1c
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.CaptureSession1.Companion.e(byte, int, int, java.lang.Object[]):void");
        }

        private Companion() {
        }

        public static /* synthetic */ CaptureSession1 TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function0 function0, Function2 function2, JpDataTk jpDataTk) {
            int i = 2 % 2;
            CaptureSession1 captureSession1 = new CaptureSession1(function0, null, function2, jpDataTk);
            int i2 = TuitionPaymentFragmentbindingInflater1 + 7;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            return captureSession1;
        }

        private static void c(int[] iArr, int i, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2 % 2;
            SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = b;
            int i4 = -1870535734;
            int i5 = 1;
            int i6 = 0;
            if (iArr2 != null) {
                int i7 = $10 + 53;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i9 = 0;
                while (i9 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i9])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + 3292, (ViewConfiguration.getEdgeSlop() >> 16) + 31, 1948206109, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        iArr3[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                        i9++;
                        i4 = -1870535734;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                int i10 = $11 + 27;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = b;
            char c = '0';
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i12 = 0;
                while (i12 < length3) {
                    int i13 = $10 + 95;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    Object[] objArr3 = new Object[i5];
                    objArr3[i6] = Integer.valueOf(iArr5[i12]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) i6;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.lastIndexOf("", c) + 1), (Process.myTid() >> 22) + 3291, 32 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1948206109, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                    }
                    iArr6[i12] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    i12++;
                    iArr5 = iArr5;
                    c = '0';
                    i5 = 1;
                    i6 = 0;
                }
                i2 = i6;
                iArr5 = iArr6;
            } else {
                i2 = 0;
            }
            System.arraycopy(iArr5, i2, iArr4, i2, length2);
            sessionConfigValidatingBuilder.b = 2;
            while (sessionConfigValidatingBuilder.b < iArr.length) {
                cArr[i2] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
                cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
                cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
                cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
                int i15 = 17;
                for (int i16 = 1; i15 > i16; i16 = 1) {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i15];
                    try {
                        Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 2607 - AndroidCharacter.getMirror('0'), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 29, 683220507, false, $$g((byte) ($$f >>> 2), b6, b6), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                        i15--;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                int i17 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
                int i18 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Object[] objArr5 = {sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (28879 - TextUtils.getOffsetAfter("", 0)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 348, TextUtils.getCapsMode("", 0, 0) + 25, -30507727, false, "G", new Class[]{Object.class});
                }
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
                cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
                cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
                cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
                sessionConfigValidatingBuilder.b += 2;
                i2 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        private static void d(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
            int i;
            int i2;
            int i3 = 2 % 2;
            setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
            int i4 = 0;
            int i5 = iArr[0];
            byte b2 = 1;
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
                            byte b3 = (byte) i4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (CdmaCellLocation.convertQuartSecToDecDegrees(i4) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i4) == 0.0d ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1270, View.combineMeasuredStates(i4, i4) + 18, 407021364, false, $$g((byte) 34, b3, b3), new Class[]{Integer.TYPE});
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
                cArr = cArr2;
            }
            char[] cArr3 = new char[i6];
            System.arraycopy(cArr, i5, cArr3, 0, i6);
            if (bArr != null) {
                char[] cArr4 = new char[i6];
                setvideostabilizationmode.b = 0;
                char c = 0;
                while (setvideostabilizationmode.b < i6) {
                    int i10 = $11 + 25;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    if (bArr[setvideostabilizationmode.b] == b2) {
                        int i12 = setvideostabilizationmode.b;
                        char c2 = cArr3[setvideostabilizationmode.b];
                        try {
                            Object[] objArr3 = new Object[2];
                            objArr3[b2] = Integer.valueOf(c);
                            objArr3[0] = Integer.valueOf(c2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b4 = (byte) 0;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.getTrimmedLength(""), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 3225, 12 - TextUtils.indexOf((CharSequence) "", '0', 0), 2133916302, false, $$g((byte) 33, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i12] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        int i13 = setvideostabilizationmode.b;
                        Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b5 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (View.resolveSizeAndState(0, 0, 0) + 29944), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1754, 23 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 387247676, false, $$g((byte) 35, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i13] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                    }
                    c = cArr4[setvideostabilizationmode.b];
                    Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b6 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.indexOf("", "") + 41241), 1705 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 21 - Color.alpha(0), -1434471773, false, $$g((byte) 39, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    b2 = 1;
                }
                int i14 = $10 + 27;
                $11 = i14 % 128;
                i = 2;
                int i15 = i14 % 2;
                cArr3 = cArr4;
            } else {
                i = 2;
            }
            if (i8 > 0) {
                int i16 = $11 + 29;
                $10 = i16 % 128;
                int i17 = i16 % i;
                char[] cArr5 = new char[i6];
                i2 = 0;
                System.arraycopy(cArr3, 0, cArr5, 0, i6);
                int i18 = i6 - i8;
                System.arraycopy(cArr5, 0, cArr3, i18, i8);
                System.arraycopy(cArr5, i8, cArr3, 0, i18);
            } else {
                i2 = 0;
            }
            if (z) {
                char[] cArr6 = new char[i6];
                while (true) {
                    setvideostabilizationmode.b = i2;
                    if (setvideostabilizationmode.b >= i6) {
                        break;
                    }
                    cArr6[setvideostabilizationmode.b] = cArr3[(i6 - setvideostabilizationmode.b) - 1];
                    i2 = setvideostabilizationmode.b + 1;
                }
                cArr3 = cArr6;
            }
            if (i7 > 0) {
                int i19 = 0;
                while (true) {
                    setvideostabilizationmode.b = i19;
                    if (setvideostabilizationmode.b >= i6) {
                        break;
                    }
                    int i20 = $11 + 1;
                    $10 = i20 % 128;
                    int i21 = i20 % 2;
                    cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                    i19 = setvideostabilizationmode.b + 1;
                }
            }
            objArr[0] = new String(cArr3);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:104:0x0b00  */
        /* JADX WARN: Code duplicated, block: B:152:0x1519  */
        /* JADX WARN: Code duplicated, block: B:155:0x15ab A[Catch: all -> 0x3af5, TryCatch #8 {all -> 0x3af5, blocks: (B:3:0x000d, B:5:0x0017, B:6:0x0046, B:12:0x01d0, B:14:0x01df, B:15:0x021d, B:19:0x0255, B:21:0x0262, B:22:0x02a3, B:26:0x035e, B:28:0x036b, B:29:0x03ad, B:31:0x03df, B:33:0x03ec, B:35:0x0435, B:37:0x043e, B:39:0x0456, B:41:0x04a4, B:88:0x096f, B:90:0x097c, B:91:0x09c0, B:110:0x101b, B:112:0x1028, B:114:0x106f, B:117:0x10bd, B:119:0x10ca, B:120:0x110c, B:124:0x1208, B:126:0x1215, B:127:0x1256, B:129:0x12d9, B:131:0x12e6, B:132:0x1326, B:134:0x132f, B:136:0x1347, B:137:0x1389, B:143:0x141e, B:145:0x1436, B:146:0x147b, B:153:0x159e, B:155:0x15ab, B:156:0x15ec, B:169:0x172f, B:171:0x173c, B:172:0x1778, B:174:0x183e, B:176:0x184b, B:178:0x1897, B:188:0x19e4, B:190:0x19f1, B:192:0x1a2e, B:194:0x1afc, B:196:0x1b09, B:198:0x1b54, B:214:0x1dd8, B:216:0x1de5, B:217:0x1e25, B:291:0x21f1, B:293:0x21fe, B:294:0x2239, B:297:0x225c, B:299:0x2269, B:300:0x22a5, B:307:0x2503, B:309:0x2510, B:310:0x2554, B:442:0x29ba, B:444:0x29c0, B:445:0x29f8, B:458:0x2adc, B:460:0x2ae2, B:461:0x2b1e, B:467:0x2bc9, B:469:0x2bcf, B:470:0x2c05, B:472:0x2cc5, B:474:0x2ccb, B:475:0x2d08, B:477:0x2dd4, B:479:0x2dda, B:480:0x2e14, B:485:0x2edb, B:487:0x2ee8, B:488:0x2f1e, B:490:0x30c3, B:492:0x30d6, B:494:0x3110, B:496:0x31d6, B:498:0x31dc, B:499:0x320d, B:501:0x3371, B:503:0x3395, B:504:0x33e2, B:509:0x3540, B:511:0x354d, B:512:0x357e, B:520:0x365c, B:522:0x3662, B:523:0x3693, B:527:0x377b, B:529:0x3781, B:531:0x37ba, B:533:0x3877, B:535:0x3884, B:537:0x38c4, B:539:0x39aa, B:541:0x39d6, B:542:0x3a2f, B:98:0x0a92, B:100:0x0a9f, B:101:0x0ade, B:49:0x054d, B:51:0x0564, B:53:0x05b4, B:61:0x066f, B:63:0x0686, B:65:0x06c3, B:71:0x0777, B:73:0x078e, B:74:0x07d3, B:78:0x085f, B:80:0x0876, B:82:0x08bf), top: B:581:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:159:0x16a7  */
        /* JADX WARN: Code duplicated, block: B:160:0x16a9  */
        /* JADX WARN: Code duplicated, block: B:164:0x16c2  */
        /* JADX WARN: Code duplicated, block: B:165:0x16ce  */
        /* JADX WARN: Code duplicated, block: B:206:0x1c22  */
        /* JADX WARN: Code duplicated, block: B:293:0x21fe A[Catch: all -> 0x3af5, TryCatch #8 {all -> 0x3af5, blocks: (B:3:0x000d, B:5:0x0017, B:6:0x0046, B:12:0x01d0, B:14:0x01df, B:15:0x021d, B:19:0x0255, B:21:0x0262, B:22:0x02a3, B:26:0x035e, B:28:0x036b, B:29:0x03ad, B:31:0x03df, B:33:0x03ec, B:35:0x0435, B:37:0x043e, B:39:0x0456, B:41:0x04a4, B:88:0x096f, B:90:0x097c, B:91:0x09c0, B:110:0x101b, B:112:0x1028, B:114:0x106f, B:117:0x10bd, B:119:0x10ca, B:120:0x110c, B:124:0x1208, B:126:0x1215, B:127:0x1256, B:129:0x12d9, B:131:0x12e6, B:132:0x1326, B:134:0x132f, B:136:0x1347, B:137:0x1389, B:143:0x141e, B:145:0x1436, B:146:0x147b, B:153:0x159e, B:155:0x15ab, B:156:0x15ec, B:169:0x172f, B:171:0x173c, B:172:0x1778, B:174:0x183e, B:176:0x184b, B:178:0x1897, B:188:0x19e4, B:190:0x19f1, B:192:0x1a2e, B:194:0x1afc, B:196:0x1b09, B:198:0x1b54, B:214:0x1dd8, B:216:0x1de5, B:217:0x1e25, B:291:0x21f1, B:293:0x21fe, B:294:0x2239, B:297:0x225c, B:299:0x2269, B:300:0x22a5, B:307:0x2503, B:309:0x2510, B:310:0x2554, B:442:0x29ba, B:444:0x29c0, B:445:0x29f8, B:458:0x2adc, B:460:0x2ae2, B:461:0x2b1e, B:467:0x2bc9, B:469:0x2bcf, B:470:0x2c05, B:472:0x2cc5, B:474:0x2ccb, B:475:0x2d08, B:477:0x2dd4, B:479:0x2dda, B:480:0x2e14, B:485:0x2edb, B:487:0x2ee8, B:488:0x2f1e, B:490:0x30c3, B:492:0x30d6, B:494:0x3110, B:496:0x31d6, B:498:0x31dc, B:499:0x320d, B:501:0x3371, B:503:0x3395, B:504:0x33e2, B:509:0x3540, B:511:0x354d, B:512:0x357e, B:520:0x365c, B:522:0x3662, B:523:0x3693, B:527:0x377b, B:529:0x3781, B:531:0x37ba, B:533:0x3877, B:535:0x3884, B:537:0x38c4, B:539:0x39aa, B:541:0x39d6, B:542:0x3a2f, B:98:0x0a92, B:100:0x0a9f, B:101:0x0ade, B:49:0x054d, B:51:0x0564, B:53:0x05b4, B:61:0x066f, B:63:0x0686, B:65:0x06c3, B:71:0x0777, B:73:0x078e, B:74:0x07d3, B:78:0x085f, B:80:0x0876, B:82:0x08bf), top: B:581:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:296:0x2242  */
        /* JADX WARN: Code duplicated, block: B:299:0x2269 A[Catch: all -> 0x3af5, TryCatch #8 {all -> 0x3af5, blocks: (B:3:0x000d, B:5:0x0017, B:6:0x0046, B:12:0x01d0, B:14:0x01df, B:15:0x021d, B:19:0x0255, B:21:0x0262, B:22:0x02a3, B:26:0x035e, B:28:0x036b, B:29:0x03ad, B:31:0x03df, B:33:0x03ec, B:35:0x0435, B:37:0x043e, B:39:0x0456, B:41:0x04a4, B:88:0x096f, B:90:0x097c, B:91:0x09c0, B:110:0x101b, B:112:0x1028, B:114:0x106f, B:117:0x10bd, B:119:0x10ca, B:120:0x110c, B:124:0x1208, B:126:0x1215, B:127:0x1256, B:129:0x12d9, B:131:0x12e6, B:132:0x1326, B:134:0x132f, B:136:0x1347, B:137:0x1389, B:143:0x141e, B:145:0x1436, B:146:0x147b, B:153:0x159e, B:155:0x15ab, B:156:0x15ec, B:169:0x172f, B:171:0x173c, B:172:0x1778, B:174:0x183e, B:176:0x184b, B:178:0x1897, B:188:0x19e4, B:190:0x19f1, B:192:0x1a2e, B:194:0x1afc, B:196:0x1b09, B:198:0x1b54, B:214:0x1dd8, B:216:0x1de5, B:217:0x1e25, B:291:0x21f1, B:293:0x21fe, B:294:0x2239, B:297:0x225c, B:299:0x2269, B:300:0x22a5, B:307:0x2503, B:309:0x2510, B:310:0x2554, B:442:0x29ba, B:444:0x29c0, B:445:0x29f8, B:458:0x2adc, B:460:0x2ae2, B:461:0x2b1e, B:467:0x2bc9, B:469:0x2bcf, B:470:0x2c05, B:472:0x2cc5, B:474:0x2ccb, B:475:0x2d08, B:477:0x2dd4, B:479:0x2dda, B:480:0x2e14, B:485:0x2edb, B:487:0x2ee8, B:488:0x2f1e, B:490:0x30c3, B:492:0x30d6, B:494:0x3110, B:496:0x31d6, B:498:0x31dc, B:499:0x320d, B:501:0x3371, B:503:0x3395, B:504:0x33e2, B:509:0x3540, B:511:0x354d, B:512:0x357e, B:520:0x365c, B:522:0x3662, B:523:0x3693, B:527:0x377b, B:529:0x3781, B:531:0x37ba, B:533:0x3877, B:535:0x3884, B:537:0x38c4, B:539:0x39aa, B:541:0x39d6, B:542:0x3a2f, B:98:0x0a92, B:100:0x0a9f, B:101:0x0ade, B:49:0x054d, B:51:0x0564, B:53:0x05b4, B:61:0x066f, B:63:0x0686, B:65:0x06c3, B:71:0x0777, B:73:0x078e, B:74:0x07d3, B:78:0x085f, B:80:0x0876, B:82:0x08bf), top: B:581:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:303:0x2331  */
        /* JADX WARN: Code duplicated, block: B:306:0x24bc  */
        /* JADX WARN: Code duplicated, block: B:309:0x2510 A[Catch: all -> 0x3af5, TryCatch #8 {all -> 0x3af5, blocks: (B:3:0x000d, B:5:0x0017, B:6:0x0046, B:12:0x01d0, B:14:0x01df, B:15:0x021d, B:19:0x0255, B:21:0x0262, B:22:0x02a3, B:26:0x035e, B:28:0x036b, B:29:0x03ad, B:31:0x03df, B:33:0x03ec, B:35:0x0435, B:37:0x043e, B:39:0x0456, B:41:0x04a4, B:88:0x096f, B:90:0x097c, B:91:0x09c0, B:110:0x101b, B:112:0x1028, B:114:0x106f, B:117:0x10bd, B:119:0x10ca, B:120:0x110c, B:124:0x1208, B:126:0x1215, B:127:0x1256, B:129:0x12d9, B:131:0x12e6, B:132:0x1326, B:134:0x132f, B:136:0x1347, B:137:0x1389, B:143:0x141e, B:145:0x1436, B:146:0x147b, B:153:0x159e, B:155:0x15ab, B:156:0x15ec, B:169:0x172f, B:171:0x173c, B:172:0x1778, B:174:0x183e, B:176:0x184b, B:178:0x1897, B:188:0x19e4, B:190:0x19f1, B:192:0x1a2e, B:194:0x1afc, B:196:0x1b09, B:198:0x1b54, B:214:0x1dd8, B:216:0x1de5, B:217:0x1e25, B:291:0x21f1, B:293:0x21fe, B:294:0x2239, B:297:0x225c, B:299:0x2269, B:300:0x22a5, B:307:0x2503, B:309:0x2510, B:310:0x2554, B:442:0x29ba, B:444:0x29c0, B:445:0x29f8, B:458:0x2adc, B:460:0x2ae2, B:461:0x2b1e, B:467:0x2bc9, B:469:0x2bcf, B:470:0x2c05, B:472:0x2cc5, B:474:0x2ccb, B:475:0x2d08, B:477:0x2dd4, B:479:0x2dda, B:480:0x2e14, B:485:0x2edb, B:487:0x2ee8, B:488:0x2f1e, B:490:0x30c3, B:492:0x30d6, B:494:0x3110, B:496:0x31d6, B:498:0x31dc, B:499:0x320d, B:501:0x3371, B:503:0x3395, B:504:0x33e2, B:509:0x3540, B:511:0x354d, B:512:0x357e, B:520:0x365c, B:522:0x3662, B:523:0x3693, B:527:0x377b, B:529:0x3781, B:531:0x37ba, B:533:0x3877, B:535:0x3884, B:537:0x38c4, B:539:0x39aa, B:541:0x39d6, B:542:0x3a2f, B:98:0x0a92, B:100:0x0a9f, B:101:0x0ade, B:49:0x054d, B:51:0x0564, B:53:0x05b4, B:61:0x066f, B:63:0x0686, B:65:0x06c3, B:71:0x0777, B:73:0x078e, B:74:0x07d3, B:78:0x085f, B:80:0x0876, B:82:0x08bf), top: B:581:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:314:0x2625 A[LOOP:2: B:304:0x24b8->B:314:0x2625, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:315:0x2630 A[EDGE_INSN: B:315:0x2630->B:316:0x2634 BREAK  A[LOOP:2: B:304:0x24b8->B:314:0x2625], PHI: r1 r2
  0x2630: PHI (r1v14 int) = (r1v13 int), (r1v13 int), (r1v208 int) binds: [B:295:0x2240, B:302:0x232f, B:624:0x2630] A[DONT_GENERATE, DONT_INLINE]
  0x2630: PHI (r2v85 ??) = (r2v84 ??), (r2v84 ??), (r2v585 ??) binds: [B:295:0x2240, B:302:0x232f, B:624:0x2630] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:322:0x267d  */
        /* JADX WARN: Code duplicated, block: B:325:0x2689  */
        /* JADX WARN: Code duplicated, block: B:332:0x26d8  */
        /* JADX WARN: Code duplicated, block: B:334:0x26e7  */
        /* JADX WARN: Code duplicated, block: B:335:0x26ea  */
        /* JADX WARN: Code duplicated, block: B:337:0x26f0 A[LOOP:4: B:323:0x2686->B:337:0x26f0, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:352:0x2711  */
        /* JADX WARN: Code duplicated, block: B:354:0x2724  */
        /* JADX WARN: Code duplicated, block: B:355:0x2727 A[PHI: r39
  0x2727: PHI (r39v28 long) = (r39v18 long), (r39v29 long) binds: [B:411:0x28ff, B:353:0x2722] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:356:0x272a  */
        /* JADX WARN: Code duplicated, block: B:358:0x2772  */
        /* JADX WARN: Code duplicated, block: B:417:0x2963 A[Catch: all -> 0x2984, IOException -> 0x2992, TryCatch #30 {IOException -> 0x2992, all -> 0x2984, blocks: (B:415:0x295c, B:417:0x2963, B:420:0x296f), top: B:613:0x295c }] */
        /* JADX WARN: Code duplicated, block: B:420:0x296f A[Catch: all -> 0x2984, IOException -> 0x2992, TRY_LEAVE, TryCatch #30 {IOException -> 0x2992, all -> 0x2984, blocks: (B:415:0x295c, B:417:0x2963, B:420:0x296f), top: B:613:0x295c }] */
        /* JADX WARN: Code duplicated, block: B:426:0x297b  */
        /* JADX WARN: Code duplicated, block: B:427:0x297d A[LOOP:6: B:418:0x296c->B:427:0x297d, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:444:0x29c0 A[Catch: all -> 0x3af5, TryCatch #8 {all -> 0x3af5, blocks: (B:3:0x000d, B:5:0x0017, B:6:0x0046, B:12:0x01d0, B:14:0x01df, B:15:0x021d, B:19:0x0255, B:21:0x0262, B:22:0x02a3, B:26:0x035e, B:28:0x036b, B:29:0x03ad, B:31:0x03df, B:33:0x03ec, B:35:0x0435, B:37:0x043e, B:39:0x0456, B:41:0x04a4, B:88:0x096f, B:90:0x097c, B:91:0x09c0, B:110:0x101b, B:112:0x1028, B:114:0x106f, B:117:0x10bd, B:119:0x10ca, B:120:0x110c, B:124:0x1208, B:126:0x1215, B:127:0x1256, B:129:0x12d9, B:131:0x12e6, B:132:0x1326, B:134:0x132f, B:136:0x1347, B:137:0x1389, B:143:0x141e, B:145:0x1436, B:146:0x147b, B:153:0x159e, B:155:0x15ab, B:156:0x15ec, B:169:0x172f, B:171:0x173c, B:172:0x1778, B:174:0x183e, B:176:0x184b, B:178:0x1897, B:188:0x19e4, B:190:0x19f1, B:192:0x1a2e, B:194:0x1afc, B:196:0x1b09, B:198:0x1b54, B:214:0x1dd8, B:216:0x1de5, B:217:0x1e25, B:291:0x21f1, B:293:0x21fe, B:294:0x2239, B:297:0x225c, B:299:0x2269, B:300:0x22a5, B:307:0x2503, B:309:0x2510, B:310:0x2554, B:442:0x29ba, B:444:0x29c0, B:445:0x29f8, B:458:0x2adc, B:460:0x2ae2, B:461:0x2b1e, B:467:0x2bc9, B:469:0x2bcf, B:470:0x2c05, B:472:0x2cc5, B:474:0x2ccb, B:475:0x2d08, B:477:0x2dd4, B:479:0x2dda, B:480:0x2e14, B:485:0x2edb, B:487:0x2ee8, B:488:0x2f1e, B:490:0x30c3, B:492:0x30d6, B:494:0x3110, B:496:0x31d6, B:498:0x31dc, B:499:0x320d, B:501:0x3371, B:503:0x3395, B:504:0x33e2, B:509:0x3540, B:511:0x354d, B:512:0x357e, B:520:0x365c, B:522:0x3662, B:523:0x3693, B:527:0x377b, B:529:0x3781, B:531:0x37ba, B:533:0x3877, B:535:0x3884, B:537:0x38c4, B:539:0x39aa, B:541:0x39d6, B:542:0x3a2f, B:98:0x0a92, B:100:0x0a9f, B:101:0x0ade, B:49:0x054d, B:51:0x0564, B:53:0x05b4, B:61:0x066f, B:63:0x0686, B:65:0x06c3, B:71:0x0777, B:73:0x078e, B:74:0x07d3, B:78:0x085f, B:80:0x0876, B:82:0x08bf), top: B:581:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:448:0x2a8f  */
        /* JADX WARN: Code duplicated, block: B:451:0x2a9f  */
        /* JADX WARN: Code duplicated, block: B:452:0x2aa1  */
        /* JADX WARN: Code duplicated, block: B:455:0x2ab5  */
        /* JADX WARN: Code duplicated, block: B:456:0x2abb  */
        /* JADX WARN: Code duplicated, block: B:460:0x2ae2 A[Catch: all -> 0x3af5, TryCatch #8 {all -> 0x3af5, blocks: (B:3:0x000d, B:5:0x0017, B:6:0x0046, B:12:0x01d0, B:14:0x01df, B:15:0x021d, B:19:0x0255, B:21:0x0262, B:22:0x02a3, B:26:0x035e, B:28:0x036b, B:29:0x03ad, B:31:0x03df, B:33:0x03ec, B:35:0x0435, B:37:0x043e, B:39:0x0456, B:41:0x04a4, B:88:0x096f, B:90:0x097c, B:91:0x09c0, B:110:0x101b, B:112:0x1028, B:114:0x106f, B:117:0x10bd, B:119:0x10ca, B:120:0x110c, B:124:0x1208, B:126:0x1215, B:127:0x1256, B:129:0x12d9, B:131:0x12e6, B:132:0x1326, B:134:0x132f, B:136:0x1347, B:137:0x1389, B:143:0x141e, B:145:0x1436, B:146:0x147b, B:153:0x159e, B:155:0x15ab, B:156:0x15ec, B:169:0x172f, B:171:0x173c, B:172:0x1778, B:174:0x183e, B:176:0x184b, B:178:0x1897, B:188:0x19e4, B:190:0x19f1, B:192:0x1a2e, B:194:0x1afc, B:196:0x1b09, B:198:0x1b54, B:214:0x1dd8, B:216:0x1de5, B:217:0x1e25, B:291:0x21f1, B:293:0x21fe, B:294:0x2239, B:297:0x225c, B:299:0x2269, B:300:0x22a5, B:307:0x2503, B:309:0x2510, B:310:0x2554, B:442:0x29ba, B:444:0x29c0, B:445:0x29f8, B:458:0x2adc, B:460:0x2ae2, B:461:0x2b1e, B:467:0x2bc9, B:469:0x2bcf, B:470:0x2c05, B:472:0x2cc5, B:474:0x2ccb, B:475:0x2d08, B:477:0x2dd4, B:479:0x2dda, B:480:0x2e14, B:485:0x2edb, B:487:0x2ee8, B:488:0x2f1e, B:490:0x30c3, B:492:0x30d6, B:494:0x3110, B:496:0x31d6, B:498:0x31dc, B:499:0x320d, B:501:0x3371, B:503:0x3395, B:504:0x33e2, B:509:0x3540, B:511:0x354d, B:512:0x357e, B:520:0x365c, B:522:0x3662, B:523:0x3693, B:527:0x377b, B:529:0x3781, B:531:0x37ba, B:533:0x3877, B:535:0x3884, B:537:0x38c4, B:539:0x39aa, B:541:0x39d6, B:542:0x3a2f, B:98:0x0a92, B:100:0x0a9f, B:101:0x0ade, B:49:0x054d, B:51:0x0564, B:53:0x05b4, B:61:0x066f, B:63:0x0686, B:65:0x06c3, B:71:0x0777, B:73:0x078e, B:74:0x07d3, B:78:0x085f, B:80:0x0876, B:82:0x08bf), top: B:581:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:464:0x2bb2  */
        /* JADX WARN: Code duplicated, block: B:465:0x2bb5  */
        /* JADX WARN: Code duplicated, block: B:469:0x2bcf A[Catch: all -> 0x3af5, TryCatch #8 {all -> 0x3af5, blocks: (B:3:0x000d, B:5:0x0017, B:6:0x0046, B:12:0x01d0, B:14:0x01df, B:15:0x021d, B:19:0x0255, B:21:0x0262, B:22:0x02a3, B:26:0x035e, B:28:0x036b, B:29:0x03ad, B:31:0x03df, B:33:0x03ec, B:35:0x0435, B:37:0x043e, B:39:0x0456, B:41:0x04a4, B:88:0x096f, B:90:0x097c, B:91:0x09c0, B:110:0x101b, B:112:0x1028, B:114:0x106f, B:117:0x10bd, B:119:0x10ca, B:120:0x110c, B:124:0x1208, B:126:0x1215, B:127:0x1256, B:129:0x12d9, B:131:0x12e6, B:132:0x1326, B:134:0x132f, B:136:0x1347, B:137:0x1389, B:143:0x141e, B:145:0x1436, B:146:0x147b, B:153:0x159e, B:155:0x15ab, B:156:0x15ec, B:169:0x172f, B:171:0x173c, B:172:0x1778, B:174:0x183e, B:176:0x184b, B:178:0x1897, B:188:0x19e4, B:190:0x19f1, B:192:0x1a2e, B:194:0x1afc, B:196:0x1b09, B:198:0x1b54, B:214:0x1dd8, B:216:0x1de5, B:217:0x1e25, B:291:0x21f1, B:293:0x21fe, B:294:0x2239, B:297:0x225c, B:299:0x2269, B:300:0x22a5, B:307:0x2503, B:309:0x2510, B:310:0x2554, B:442:0x29ba, B:444:0x29c0, B:445:0x29f8, B:458:0x2adc, B:460:0x2ae2, B:461:0x2b1e, B:467:0x2bc9, B:469:0x2bcf, B:470:0x2c05, B:472:0x2cc5, B:474:0x2ccb, B:475:0x2d08, B:477:0x2dd4, B:479:0x2dda, B:480:0x2e14, B:485:0x2edb, B:487:0x2ee8, B:488:0x2f1e, B:490:0x30c3, B:492:0x30d6, B:494:0x3110, B:496:0x31d6, B:498:0x31dc, B:499:0x320d, B:501:0x3371, B:503:0x3395, B:504:0x33e2, B:509:0x3540, B:511:0x354d, B:512:0x357e, B:520:0x365c, B:522:0x3662, B:523:0x3693, B:527:0x377b, B:529:0x3781, B:531:0x37ba, B:533:0x3877, B:535:0x3884, B:537:0x38c4, B:539:0x39aa, B:541:0x39d6, B:542:0x3a2f, B:98:0x0a92, B:100:0x0a9f, B:101:0x0ade, B:49:0x054d, B:51:0x0564, B:53:0x05b4, B:61:0x066f, B:63:0x0686, B:65:0x06c3, B:71:0x0777, B:73:0x078e, B:74:0x07d3, B:78:0x085f, B:80:0x0876, B:82:0x08bf), top: B:581:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:474:0x2ccb A[Catch: all -> 0x3af5, TryCatch #8 {all -> 0x3af5, blocks: (B:3:0x000d, B:5:0x0017, B:6:0x0046, B:12:0x01d0, B:14:0x01df, B:15:0x021d, B:19:0x0255, B:21:0x0262, B:22:0x02a3, B:26:0x035e, B:28:0x036b, B:29:0x03ad, B:31:0x03df, B:33:0x03ec, B:35:0x0435, B:37:0x043e, B:39:0x0456, B:41:0x04a4, B:88:0x096f, B:90:0x097c, B:91:0x09c0, B:110:0x101b, B:112:0x1028, B:114:0x106f, B:117:0x10bd, B:119:0x10ca, B:120:0x110c, B:124:0x1208, B:126:0x1215, B:127:0x1256, B:129:0x12d9, B:131:0x12e6, B:132:0x1326, B:134:0x132f, B:136:0x1347, B:137:0x1389, B:143:0x141e, B:145:0x1436, B:146:0x147b, B:153:0x159e, B:155:0x15ab, B:156:0x15ec, B:169:0x172f, B:171:0x173c, B:172:0x1778, B:174:0x183e, B:176:0x184b, B:178:0x1897, B:188:0x19e4, B:190:0x19f1, B:192:0x1a2e, B:194:0x1afc, B:196:0x1b09, B:198:0x1b54, B:214:0x1dd8, B:216:0x1de5, B:217:0x1e25, B:291:0x21f1, B:293:0x21fe, B:294:0x2239, B:297:0x225c, B:299:0x2269, B:300:0x22a5, B:307:0x2503, B:309:0x2510, B:310:0x2554, B:442:0x29ba, B:444:0x29c0, B:445:0x29f8, B:458:0x2adc, B:460:0x2ae2, B:461:0x2b1e, B:467:0x2bc9, B:469:0x2bcf, B:470:0x2c05, B:472:0x2cc5, B:474:0x2ccb, B:475:0x2d08, B:477:0x2dd4, B:479:0x2dda, B:480:0x2e14, B:485:0x2edb, B:487:0x2ee8, B:488:0x2f1e, B:490:0x30c3, B:492:0x30d6, B:494:0x3110, B:496:0x31d6, B:498:0x31dc, B:499:0x320d, B:501:0x3371, B:503:0x3395, B:504:0x33e2, B:509:0x3540, B:511:0x354d, B:512:0x357e, B:520:0x365c, B:522:0x3662, B:523:0x3693, B:527:0x377b, B:529:0x3781, B:531:0x37ba, B:533:0x3877, B:535:0x3884, B:537:0x38c4, B:539:0x39aa, B:541:0x39d6, B:542:0x3a2f, B:98:0x0a92, B:100:0x0a9f, B:101:0x0ade, B:49:0x054d, B:51:0x0564, B:53:0x05b4, B:61:0x066f, B:63:0x0686, B:65:0x06c3, B:71:0x0777, B:73:0x078e, B:74:0x07d3, B:78:0x085f, B:80:0x0876, B:82:0x08bf), top: B:581:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:479:0x2dda A[Catch: all -> 0x3af5, TryCatch #8 {all -> 0x3af5, blocks: (B:3:0x000d, B:5:0x0017, B:6:0x0046, B:12:0x01d0, B:14:0x01df, B:15:0x021d, B:19:0x0255, B:21:0x0262, B:22:0x02a3, B:26:0x035e, B:28:0x036b, B:29:0x03ad, B:31:0x03df, B:33:0x03ec, B:35:0x0435, B:37:0x043e, B:39:0x0456, B:41:0x04a4, B:88:0x096f, B:90:0x097c, B:91:0x09c0, B:110:0x101b, B:112:0x1028, B:114:0x106f, B:117:0x10bd, B:119:0x10ca, B:120:0x110c, B:124:0x1208, B:126:0x1215, B:127:0x1256, B:129:0x12d9, B:131:0x12e6, B:132:0x1326, B:134:0x132f, B:136:0x1347, B:137:0x1389, B:143:0x141e, B:145:0x1436, B:146:0x147b, B:153:0x159e, B:155:0x15ab, B:156:0x15ec, B:169:0x172f, B:171:0x173c, B:172:0x1778, B:174:0x183e, B:176:0x184b, B:178:0x1897, B:188:0x19e4, B:190:0x19f1, B:192:0x1a2e, B:194:0x1afc, B:196:0x1b09, B:198:0x1b54, B:214:0x1dd8, B:216:0x1de5, B:217:0x1e25, B:291:0x21f1, B:293:0x21fe, B:294:0x2239, B:297:0x225c, B:299:0x2269, B:300:0x22a5, B:307:0x2503, B:309:0x2510, B:310:0x2554, B:442:0x29ba, B:444:0x29c0, B:445:0x29f8, B:458:0x2adc, B:460:0x2ae2, B:461:0x2b1e, B:467:0x2bc9, B:469:0x2bcf, B:470:0x2c05, B:472:0x2cc5, B:474:0x2ccb, B:475:0x2d08, B:477:0x2dd4, B:479:0x2dda, B:480:0x2e14, B:485:0x2edb, B:487:0x2ee8, B:488:0x2f1e, B:490:0x30c3, B:492:0x30d6, B:494:0x3110, B:496:0x31d6, B:498:0x31dc, B:499:0x320d, B:501:0x3371, B:503:0x3395, B:504:0x33e2, B:509:0x3540, B:511:0x354d, B:512:0x357e, B:520:0x365c, B:522:0x3662, B:523:0x3693, B:527:0x377b, B:529:0x3781, B:531:0x37ba, B:533:0x3877, B:535:0x3884, B:537:0x38c4, B:539:0x39aa, B:541:0x39d6, B:542:0x3a2f, B:98:0x0a92, B:100:0x0a9f, B:101:0x0ade, B:49:0x054d, B:51:0x0564, B:53:0x05b4, B:61:0x066f, B:63:0x0686, B:65:0x06c3, B:71:0x0777, B:73:0x078e, B:74:0x07d3, B:78:0x085f, B:80:0x0876, B:82:0x08bf), top: B:581:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:483:0x2ea5  */
        /* JADX WARN: Code duplicated, block: B:487:0x2ee8 A[Catch: all -> 0x3af5, TryCatch #8 {all -> 0x3af5, blocks: (B:3:0x000d, B:5:0x0017, B:6:0x0046, B:12:0x01d0, B:14:0x01df, B:15:0x021d, B:19:0x0255, B:21:0x0262, B:22:0x02a3, B:26:0x035e, B:28:0x036b, B:29:0x03ad, B:31:0x03df, B:33:0x03ec, B:35:0x0435, B:37:0x043e, B:39:0x0456, B:41:0x04a4, B:88:0x096f, B:90:0x097c, B:91:0x09c0, B:110:0x101b, B:112:0x1028, B:114:0x106f, B:117:0x10bd, B:119:0x10ca, B:120:0x110c, B:124:0x1208, B:126:0x1215, B:127:0x1256, B:129:0x12d9, B:131:0x12e6, B:132:0x1326, B:134:0x132f, B:136:0x1347, B:137:0x1389, B:143:0x141e, B:145:0x1436, B:146:0x147b, B:153:0x159e, B:155:0x15ab, B:156:0x15ec, B:169:0x172f, B:171:0x173c, B:172:0x1778, B:174:0x183e, B:176:0x184b, B:178:0x1897, B:188:0x19e4, B:190:0x19f1, B:192:0x1a2e, B:194:0x1afc, B:196:0x1b09, B:198:0x1b54, B:214:0x1dd8, B:216:0x1de5, B:217:0x1e25, B:291:0x21f1, B:293:0x21fe, B:294:0x2239, B:297:0x225c, B:299:0x2269, B:300:0x22a5, B:307:0x2503, B:309:0x2510, B:310:0x2554, B:442:0x29ba, B:444:0x29c0, B:445:0x29f8, B:458:0x2adc, B:460:0x2ae2, B:461:0x2b1e, B:467:0x2bc9, B:469:0x2bcf, B:470:0x2c05, B:472:0x2cc5, B:474:0x2ccb, B:475:0x2d08, B:477:0x2dd4, B:479:0x2dda, B:480:0x2e14, B:485:0x2edb, B:487:0x2ee8, B:488:0x2f1e, B:490:0x30c3, B:492:0x30d6, B:494:0x3110, B:496:0x31d6, B:498:0x31dc, B:499:0x320d, B:501:0x3371, B:503:0x3395, B:504:0x33e2, B:509:0x3540, B:511:0x354d, B:512:0x357e, B:520:0x365c, B:522:0x3662, B:523:0x3693, B:527:0x377b, B:529:0x3781, B:531:0x37ba, B:533:0x3877, B:535:0x3884, B:537:0x38c4, B:539:0x39aa, B:541:0x39d6, B:542:0x3a2f, B:98:0x0a92, B:100:0x0a9f, B:101:0x0ade, B:49:0x054d, B:51:0x0564, B:53:0x05b4, B:61:0x066f, B:63:0x0686, B:65:0x06c3, B:71:0x0777, B:73:0x078e, B:74:0x07d3, B:78:0x085f, B:80:0x0876, B:82:0x08bf), top: B:581:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:492:0x30d6 A[Catch: all -> 0x3af5, TryCatch #8 {all -> 0x3af5, blocks: (B:3:0x000d, B:5:0x0017, B:6:0x0046, B:12:0x01d0, B:14:0x01df, B:15:0x021d, B:19:0x0255, B:21:0x0262, B:22:0x02a3, B:26:0x035e, B:28:0x036b, B:29:0x03ad, B:31:0x03df, B:33:0x03ec, B:35:0x0435, B:37:0x043e, B:39:0x0456, B:41:0x04a4, B:88:0x096f, B:90:0x097c, B:91:0x09c0, B:110:0x101b, B:112:0x1028, B:114:0x106f, B:117:0x10bd, B:119:0x10ca, B:120:0x110c, B:124:0x1208, B:126:0x1215, B:127:0x1256, B:129:0x12d9, B:131:0x12e6, B:132:0x1326, B:134:0x132f, B:136:0x1347, B:137:0x1389, B:143:0x141e, B:145:0x1436, B:146:0x147b, B:153:0x159e, B:155:0x15ab, B:156:0x15ec, B:169:0x172f, B:171:0x173c, B:172:0x1778, B:174:0x183e, B:176:0x184b, B:178:0x1897, B:188:0x19e4, B:190:0x19f1, B:192:0x1a2e, B:194:0x1afc, B:196:0x1b09, B:198:0x1b54, B:214:0x1dd8, B:216:0x1de5, B:217:0x1e25, B:291:0x21f1, B:293:0x21fe, B:294:0x2239, B:297:0x225c, B:299:0x2269, B:300:0x22a5, B:307:0x2503, B:309:0x2510, B:310:0x2554, B:442:0x29ba, B:444:0x29c0, B:445:0x29f8, B:458:0x2adc, B:460:0x2ae2, B:461:0x2b1e, B:467:0x2bc9, B:469:0x2bcf, B:470:0x2c05, B:472:0x2cc5, B:474:0x2ccb, B:475:0x2d08, B:477:0x2dd4, B:479:0x2dda, B:480:0x2e14, B:485:0x2edb, B:487:0x2ee8, B:488:0x2f1e, B:490:0x30c3, B:492:0x30d6, B:494:0x3110, B:496:0x31d6, B:498:0x31dc, B:499:0x320d, B:501:0x3371, B:503:0x3395, B:504:0x33e2, B:509:0x3540, B:511:0x354d, B:512:0x357e, B:520:0x365c, B:522:0x3662, B:523:0x3693, B:527:0x377b, B:529:0x3781, B:531:0x37ba, B:533:0x3877, B:535:0x3884, B:537:0x38c4, B:539:0x39aa, B:541:0x39d6, B:542:0x3a2f, B:98:0x0a92, B:100:0x0a9f, B:101:0x0ade, B:49:0x054d, B:51:0x0564, B:53:0x05b4, B:61:0x066f, B:63:0x0686, B:65:0x06c3, B:71:0x0777, B:73:0x078e, B:74:0x07d3, B:78:0x085f, B:80:0x0876, B:82:0x08bf), top: B:581:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:493:0x310e  */
        /* JADX WARN: Code duplicated, block: B:498:0x31dc A[Catch: all -> 0x3af5, TryCatch #8 {all -> 0x3af5, blocks: (B:3:0x000d, B:5:0x0017, B:6:0x0046, B:12:0x01d0, B:14:0x01df, B:15:0x021d, B:19:0x0255, B:21:0x0262, B:22:0x02a3, B:26:0x035e, B:28:0x036b, B:29:0x03ad, B:31:0x03df, B:33:0x03ec, B:35:0x0435, B:37:0x043e, B:39:0x0456, B:41:0x04a4, B:88:0x096f, B:90:0x097c, B:91:0x09c0, B:110:0x101b, B:112:0x1028, B:114:0x106f, B:117:0x10bd, B:119:0x10ca, B:120:0x110c, B:124:0x1208, B:126:0x1215, B:127:0x1256, B:129:0x12d9, B:131:0x12e6, B:132:0x1326, B:134:0x132f, B:136:0x1347, B:137:0x1389, B:143:0x141e, B:145:0x1436, B:146:0x147b, B:153:0x159e, B:155:0x15ab, B:156:0x15ec, B:169:0x172f, B:171:0x173c, B:172:0x1778, B:174:0x183e, B:176:0x184b, B:178:0x1897, B:188:0x19e4, B:190:0x19f1, B:192:0x1a2e, B:194:0x1afc, B:196:0x1b09, B:198:0x1b54, B:214:0x1dd8, B:216:0x1de5, B:217:0x1e25, B:291:0x21f1, B:293:0x21fe, B:294:0x2239, B:297:0x225c, B:299:0x2269, B:300:0x22a5, B:307:0x2503, B:309:0x2510, B:310:0x2554, B:442:0x29ba, B:444:0x29c0, B:445:0x29f8, B:458:0x2adc, B:460:0x2ae2, B:461:0x2b1e, B:467:0x2bc9, B:469:0x2bcf, B:470:0x2c05, B:472:0x2cc5, B:474:0x2ccb, B:475:0x2d08, B:477:0x2dd4, B:479:0x2dda, B:480:0x2e14, B:485:0x2edb, B:487:0x2ee8, B:488:0x2f1e, B:490:0x30c3, B:492:0x30d6, B:494:0x3110, B:496:0x31d6, B:498:0x31dc, B:499:0x320d, B:501:0x3371, B:503:0x3395, B:504:0x33e2, B:509:0x3540, B:511:0x354d, B:512:0x357e, B:520:0x365c, B:522:0x3662, B:523:0x3693, B:527:0x377b, B:529:0x3781, B:531:0x37ba, B:533:0x3877, B:535:0x3884, B:537:0x38c4, B:539:0x39aa, B:541:0x39d6, B:542:0x3a2f, B:98:0x0a92, B:100:0x0a9f, B:101:0x0ade, B:49:0x054d, B:51:0x0564, B:53:0x05b4, B:61:0x066f, B:63:0x0686, B:65:0x06c3, B:71:0x0777, B:73:0x078e, B:74:0x07d3, B:78:0x085f, B:80:0x0876, B:82:0x08bf), top: B:581:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:503:0x3395 A[Catch: all -> 0x3af5, TryCatch #8 {all -> 0x3af5, blocks: (B:3:0x000d, B:5:0x0017, B:6:0x0046, B:12:0x01d0, B:14:0x01df, B:15:0x021d, B:19:0x0255, B:21:0x0262, B:22:0x02a3, B:26:0x035e, B:28:0x036b, B:29:0x03ad, B:31:0x03df, B:33:0x03ec, B:35:0x0435, B:37:0x043e, B:39:0x0456, B:41:0x04a4, B:88:0x096f, B:90:0x097c, B:91:0x09c0, B:110:0x101b, B:112:0x1028, B:114:0x106f, B:117:0x10bd, B:119:0x10ca, B:120:0x110c, B:124:0x1208, B:126:0x1215, B:127:0x1256, B:129:0x12d9, B:131:0x12e6, B:132:0x1326, B:134:0x132f, B:136:0x1347, B:137:0x1389, B:143:0x141e, B:145:0x1436, B:146:0x147b, B:153:0x159e, B:155:0x15ab, B:156:0x15ec, B:169:0x172f, B:171:0x173c, B:172:0x1778, B:174:0x183e, B:176:0x184b, B:178:0x1897, B:188:0x19e4, B:190:0x19f1, B:192:0x1a2e, B:194:0x1afc, B:196:0x1b09, B:198:0x1b54, B:214:0x1dd8, B:216:0x1de5, B:217:0x1e25, B:291:0x21f1, B:293:0x21fe, B:294:0x2239, B:297:0x225c, B:299:0x2269, B:300:0x22a5, B:307:0x2503, B:309:0x2510, B:310:0x2554, B:442:0x29ba, B:444:0x29c0, B:445:0x29f8, B:458:0x2adc, B:460:0x2ae2, B:461:0x2b1e, B:467:0x2bc9, B:469:0x2bcf, B:470:0x2c05, B:472:0x2cc5, B:474:0x2ccb, B:475:0x2d08, B:477:0x2dd4, B:479:0x2dda, B:480:0x2e14, B:485:0x2edb, B:487:0x2ee8, B:488:0x2f1e, B:490:0x30c3, B:492:0x30d6, B:494:0x3110, B:496:0x31d6, B:498:0x31dc, B:499:0x320d, B:501:0x3371, B:503:0x3395, B:504:0x33e2, B:509:0x3540, B:511:0x354d, B:512:0x357e, B:520:0x365c, B:522:0x3662, B:523:0x3693, B:527:0x377b, B:529:0x3781, B:531:0x37ba, B:533:0x3877, B:535:0x3884, B:537:0x38c4, B:539:0x39aa, B:541:0x39d6, B:542:0x3a2f, B:98:0x0a92, B:100:0x0a9f, B:101:0x0ade, B:49:0x054d, B:51:0x0564, B:53:0x05b4, B:61:0x066f, B:63:0x0686, B:65:0x06c3, B:71:0x0777, B:73:0x078e, B:74:0x07d3, B:78:0x085f, B:80:0x0876, B:82:0x08bf), top: B:581:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:507:0x34a7  */
        /* JADX WARN: Code duplicated, block: B:511:0x354d A[Catch: all -> 0x3af5, TryCatch #8 {all -> 0x3af5, blocks: (B:3:0x000d, B:5:0x0017, B:6:0x0046, B:12:0x01d0, B:14:0x01df, B:15:0x021d, B:19:0x0255, B:21:0x0262, B:22:0x02a3, B:26:0x035e, B:28:0x036b, B:29:0x03ad, B:31:0x03df, B:33:0x03ec, B:35:0x0435, B:37:0x043e, B:39:0x0456, B:41:0x04a4, B:88:0x096f, B:90:0x097c, B:91:0x09c0, B:110:0x101b, B:112:0x1028, B:114:0x106f, B:117:0x10bd, B:119:0x10ca, B:120:0x110c, B:124:0x1208, B:126:0x1215, B:127:0x1256, B:129:0x12d9, B:131:0x12e6, B:132:0x1326, B:134:0x132f, B:136:0x1347, B:137:0x1389, B:143:0x141e, B:145:0x1436, B:146:0x147b, B:153:0x159e, B:155:0x15ab, B:156:0x15ec, B:169:0x172f, B:171:0x173c, B:172:0x1778, B:174:0x183e, B:176:0x184b, B:178:0x1897, B:188:0x19e4, B:190:0x19f1, B:192:0x1a2e, B:194:0x1afc, B:196:0x1b09, B:198:0x1b54, B:214:0x1dd8, B:216:0x1de5, B:217:0x1e25, B:291:0x21f1, B:293:0x21fe, B:294:0x2239, B:297:0x225c, B:299:0x2269, B:300:0x22a5, B:307:0x2503, B:309:0x2510, B:310:0x2554, B:442:0x29ba, B:444:0x29c0, B:445:0x29f8, B:458:0x2adc, B:460:0x2ae2, B:461:0x2b1e, B:467:0x2bc9, B:469:0x2bcf, B:470:0x2c05, B:472:0x2cc5, B:474:0x2ccb, B:475:0x2d08, B:477:0x2dd4, B:479:0x2dda, B:480:0x2e14, B:485:0x2edb, B:487:0x2ee8, B:488:0x2f1e, B:490:0x30c3, B:492:0x30d6, B:494:0x3110, B:496:0x31d6, B:498:0x31dc, B:499:0x320d, B:501:0x3371, B:503:0x3395, B:504:0x33e2, B:509:0x3540, B:511:0x354d, B:512:0x357e, B:520:0x365c, B:522:0x3662, B:523:0x3693, B:527:0x377b, B:529:0x3781, B:531:0x37ba, B:533:0x3877, B:535:0x3884, B:537:0x38c4, B:539:0x39aa, B:541:0x39d6, B:542:0x3a2f, B:98:0x0a92, B:100:0x0a9f, B:101:0x0ade, B:49:0x054d, B:51:0x0564, B:53:0x05b4, B:61:0x066f, B:63:0x0686, B:65:0x06c3, B:71:0x0777, B:73:0x078e, B:74:0x07d3, B:78:0x085f, B:80:0x0876, B:82:0x08bf), top: B:581:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:515:0x3632  */
        /* JADX WARN: Code duplicated, block: B:516:0x3634  */
        /* JADX WARN: Code duplicated, block: B:519:0x3659  */
        /* JADX WARN: Code duplicated, block: B:522:0x3662 A[Catch: all -> 0x3af5, TryCatch #8 {all -> 0x3af5, blocks: (B:3:0x000d, B:5:0x0017, B:6:0x0046, B:12:0x01d0, B:14:0x01df, B:15:0x021d, B:19:0x0255, B:21:0x0262, B:22:0x02a3, B:26:0x035e, B:28:0x036b, B:29:0x03ad, B:31:0x03df, B:33:0x03ec, B:35:0x0435, B:37:0x043e, B:39:0x0456, B:41:0x04a4, B:88:0x096f, B:90:0x097c, B:91:0x09c0, B:110:0x101b, B:112:0x1028, B:114:0x106f, B:117:0x10bd, B:119:0x10ca, B:120:0x110c, B:124:0x1208, B:126:0x1215, B:127:0x1256, B:129:0x12d9, B:131:0x12e6, B:132:0x1326, B:134:0x132f, B:136:0x1347, B:137:0x1389, B:143:0x141e, B:145:0x1436, B:146:0x147b, B:153:0x159e, B:155:0x15ab, B:156:0x15ec, B:169:0x172f, B:171:0x173c, B:172:0x1778, B:174:0x183e, B:176:0x184b, B:178:0x1897, B:188:0x19e4, B:190:0x19f1, B:192:0x1a2e, B:194:0x1afc, B:196:0x1b09, B:198:0x1b54, B:214:0x1dd8, B:216:0x1de5, B:217:0x1e25, B:291:0x21f1, B:293:0x21fe, B:294:0x2239, B:297:0x225c, B:299:0x2269, B:300:0x22a5, B:307:0x2503, B:309:0x2510, B:310:0x2554, B:442:0x29ba, B:444:0x29c0, B:445:0x29f8, B:458:0x2adc, B:460:0x2ae2, B:461:0x2b1e, B:467:0x2bc9, B:469:0x2bcf, B:470:0x2c05, B:472:0x2cc5, B:474:0x2ccb, B:475:0x2d08, B:477:0x2dd4, B:479:0x2dda, B:480:0x2e14, B:485:0x2edb, B:487:0x2ee8, B:488:0x2f1e, B:490:0x30c3, B:492:0x30d6, B:494:0x3110, B:496:0x31d6, B:498:0x31dc, B:499:0x320d, B:501:0x3371, B:503:0x3395, B:504:0x33e2, B:509:0x3540, B:511:0x354d, B:512:0x357e, B:520:0x365c, B:522:0x3662, B:523:0x3693, B:527:0x377b, B:529:0x3781, B:531:0x37ba, B:533:0x3877, B:535:0x3884, B:537:0x38c4, B:539:0x39aa, B:541:0x39d6, B:542:0x3a2f, B:98:0x0a92, B:100:0x0a9f, B:101:0x0ade, B:49:0x054d, B:51:0x0564, B:53:0x05b4, B:61:0x066f, B:63:0x0686, B:65:0x06c3, B:71:0x0777, B:73:0x078e, B:74:0x07d3, B:78:0x085f, B:80:0x0876, B:82:0x08bf), top: B:581:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:525:0x3774  */
        /* JADX WARN: Code duplicated, block: B:529:0x3781 A[Catch: all -> 0x3af5, TryCatch #8 {all -> 0x3af5, blocks: (B:3:0x000d, B:5:0x0017, B:6:0x0046, B:12:0x01d0, B:14:0x01df, B:15:0x021d, B:19:0x0255, B:21:0x0262, B:22:0x02a3, B:26:0x035e, B:28:0x036b, B:29:0x03ad, B:31:0x03df, B:33:0x03ec, B:35:0x0435, B:37:0x043e, B:39:0x0456, B:41:0x04a4, B:88:0x096f, B:90:0x097c, B:91:0x09c0, B:110:0x101b, B:112:0x1028, B:114:0x106f, B:117:0x10bd, B:119:0x10ca, B:120:0x110c, B:124:0x1208, B:126:0x1215, B:127:0x1256, B:129:0x12d9, B:131:0x12e6, B:132:0x1326, B:134:0x132f, B:136:0x1347, B:137:0x1389, B:143:0x141e, B:145:0x1436, B:146:0x147b, B:153:0x159e, B:155:0x15ab, B:156:0x15ec, B:169:0x172f, B:171:0x173c, B:172:0x1778, B:174:0x183e, B:176:0x184b, B:178:0x1897, B:188:0x19e4, B:190:0x19f1, B:192:0x1a2e, B:194:0x1afc, B:196:0x1b09, B:198:0x1b54, B:214:0x1dd8, B:216:0x1de5, B:217:0x1e25, B:291:0x21f1, B:293:0x21fe, B:294:0x2239, B:297:0x225c, B:299:0x2269, B:300:0x22a5, B:307:0x2503, B:309:0x2510, B:310:0x2554, B:442:0x29ba, B:444:0x29c0, B:445:0x29f8, B:458:0x2adc, B:460:0x2ae2, B:461:0x2b1e, B:467:0x2bc9, B:469:0x2bcf, B:470:0x2c05, B:472:0x2cc5, B:474:0x2ccb, B:475:0x2d08, B:477:0x2dd4, B:479:0x2dda, B:480:0x2e14, B:485:0x2edb, B:487:0x2ee8, B:488:0x2f1e, B:490:0x30c3, B:492:0x30d6, B:494:0x3110, B:496:0x31d6, B:498:0x31dc, B:499:0x320d, B:501:0x3371, B:503:0x3395, B:504:0x33e2, B:509:0x3540, B:511:0x354d, B:512:0x357e, B:520:0x365c, B:522:0x3662, B:523:0x3693, B:527:0x377b, B:529:0x3781, B:531:0x37ba, B:533:0x3877, B:535:0x3884, B:537:0x38c4, B:539:0x39aa, B:541:0x39d6, B:542:0x3a2f, B:98:0x0a92, B:100:0x0a9f, B:101:0x0ade, B:49:0x054d, B:51:0x0564, B:53:0x05b4, B:61:0x066f, B:63:0x0686, B:65:0x06c3, B:71:0x0777, B:73:0x078e, B:74:0x07d3, B:78:0x085f, B:80:0x0876, B:82:0x08bf), top: B:581:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:530:0x37b8  */
        /* JADX WARN: Code duplicated, block: B:535:0x3884 A[Catch: all -> 0x3af5, TryCatch #8 {all -> 0x3af5, blocks: (B:3:0x000d, B:5:0x0017, B:6:0x0046, B:12:0x01d0, B:14:0x01df, B:15:0x021d, B:19:0x0255, B:21:0x0262, B:22:0x02a3, B:26:0x035e, B:28:0x036b, B:29:0x03ad, B:31:0x03df, B:33:0x03ec, B:35:0x0435, B:37:0x043e, B:39:0x0456, B:41:0x04a4, B:88:0x096f, B:90:0x097c, B:91:0x09c0, B:110:0x101b, B:112:0x1028, B:114:0x106f, B:117:0x10bd, B:119:0x10ca, B:120:0x110c, B:124:0x1208, B:126:0x1215, B:127:0x1256, B:129:0x12d9, B:131:0x12e6, B:132:0x1326, B:134:0x132f, B:136:0x1347, B:137:0x1389, B:143:0x141e, B:145:0x1436, B:146:0x147b, B:153:0x159e, B:155:0x15ab, B:156:0x15ec, B:169:0x172f, B:171:0x173c, B:172:0x1778, B:174:0x183e, B:176:0x184b, B:178:0x1897, B:188:0x19e4, B:190:0x19f1, B:192:0x1a2e, B:194:0x1afc, B:196:0x1b09, B:198:0x1b54, B:214:0x1dd8, B:216:0x1de5, B:217:0x1e25, B:291:0x21f1, B:293:0x21fe, B:294:0x2239, B:297:0x225c, B:299:0x2269, B:300:0x22a5, B:307:0x2503, B:309:0x2510, B:310:0x2554, B:442:0x29ba, B:444:0x29c0, B:445:0x29f8, B:458:0x2adc, B:460:0x2ae2, B:461:0x2b1e, B:467:0x2bc9, B:469:0x2bcf, B:470:0x2c05, B:472:0x2cc5, B:474:0x2ccb, B:475:0x2d08, B:477:0x2dd4, B:479:0x2dda, B:480:0x2e14, B:485:0x2edb, B:487:0x2ee8, B:488:0x2f1e, B:490:0x30c3, B:492:0x30d6, B:494:0x3110, B:496:0x31d6, B:498:0x31dc, B:499:0x320d, B:501:0x3371, B:503:0x3395, B:504:0x33e2, B:509:0x3540, B:511:0x354d, B:512:0x357e, B:520:0x365c, B:522:0x3662, B:523:0x3693, B:527:0x377b, B:529:0x3781, B:531:0x37ba, B:533:0x3877, B:535:0x3884, B:537:0x38c4, B:539:0x39aa, B:541:0x39d6, B:542:0x3a2f, B:98:0x0a92, B:100:0x0a9f, B:101:0x0ade, B:49:0x054d, B:51:0x0564, B:53:0x05b4, B:61:0x066f, B:63:0x0686, B:65:0x06c3, B:71:0x0777, B:73:0x078e, B:74:0x07d3, B:78:0x085f, B:80:0x0876, B:82:0x08bf), top: B:581:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:536:0x38c2  */
        /* JADX WARN: Code duplicated, block: B:541:0x39d6 A[Catch: all -> 0x3af5, TryCatch #8 {all -> 0x3af5, blocks: (B:3:0x000d, B:5:0x0017, B:6:0x0046, B:12:0x01d0, B:14:0x01df, B:15:0x021d, B:19:0x0255, B:21:0x0262, B:22:0x02a3, B:26:0x035e, B:28:0x036b, B:29:0x03ad, B:31:0x03df, B:33:0x03ec, B:35:0x0435, B:37:0x043e, B:39:0x0456, B:41:0x04a4, B:88:0x096f, B:90:0x097c, B:91:0x09c0, B:110:0x101b, B:112:0x1028, B:114:0x106f, B:117:0x10bd, B:119:0x10ca, B:120:0x110c, B:124:0x1208, B:126:0x1215, B:127:0x1256, B:129:0x12d9, B:131:0x12e6, B:132:0x1326, B:134:0x132f, B:136:0x1347, B:137:0x1389, B:143:0x141e, B:145:0x1436, B:146:0x147b, B:153:0x159e, B:155:0x15ab, B:156:0x15ec, B:169:0x172f, B:171:0x173c, B:172:0x1778, B:174:0x183e, B:176:0x184b, B:178:0x1897, B:188:0x19e4, B:190:0x19f1, B:192:0x1a2e, B:194:0x1afc, B:196:0x1b09, B:198:0x1b54, B:214:0x1dd8, B:216:0x1de5, B:217:0x1e25, B:291:0x21f1, B:293:0x21fe, B:294:0x2239, B:297:0x225c, B:299:0x2269, B:300:0x22a5, B:307:0x2503, B:309:0x2510, B:310:0x2554, B:442:0x29ba, B:444:0x29c0, B:445:0x29f8, B:458:0x2adc, B:460:0x2ae2, B:461:0x2b1e, B:467:0x2bc9, B:469:0x2bcf, B:470:0x2c05, B:472:0x2cc5, B:474:0x2ccb, B:475:0x2d08, B:477:0x2dd4, B:479:0x2dda, B:480:0x2e14, B:485:0x2edb, B:487:0x2ee8, B:488:0x2f1e, B:490:0x30c3, B:492:0x30d6, B:494:0x3110, B:496:0x31d6, B:498:0x31dc, B:499:0x320d, B:501:0x3371, B:503:0x3395, B:504:0x33e2, B:509:0x3540, B:511:0x354d, B:512:0x357e, B:520:0x365c, B:522:0x3662, B:523:0x3693, B:527:0x377b, B:529:0x3781, B:531:0x37ba, B:533:0x3877, B:535:0x3884, B:537:0x38c4, B:539:0x39aa, B:541:0x39d6, B:542:0x3a2f, B:98:0x0a92, B:100:0x0a9f, B:101:0x0ade, B:49:0x054d, B:51:0x0564, B:53:0x05b4, B:61:0x066f, B:63:0x0686, B:65:0x06c3, B:71:0x0777, B:73:0x078e, B:74:0x07d3, B:78:0x085f, B:80:0x0876, B:82:0x08bf), top: B:581:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:589:0x26f6 A[EXC_TOP_SPLITTER, PHI: r5
  0x26f6: PHI (r5v164 java.io.BufferedInputStream) = (r5v163 java.io.BufferedInputStream), (r5v354 java.io.BufferedInputStream) binds: [B:348:0x2708, B:321:0x267b] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:595:0x2980 A[EXC_TOP_SPLITTER, PHI: r2
  0x2980: PHI (r2v125 java.io.BufferedInputStream) = (r2v124 java.io.BufferedInputStream), (r2v568 java.io.BufferedInputStream) binds: [B:438:0x2992, B:416:0x2961] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:624:0x2630 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:625:0x25e7 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:626:0x2699 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:627:? A[LOOP:3: B:611:0x2676->B:627:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:628:0x2975 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:629:? A[LOOP:5: B:613:0x295c->B:629:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Multi-variable search skipped. Vars limit reached: 6264 (expected less than 5000) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v183, types: [java.lang.CharSequence, java.lang.String] */
        /* JADX WARN: Type inference failed for: r14v100 */
        /* JADX WARN: Type inference failed for: r14v108, types: [java.lang.CharSequence] */
        /* JADX WARN: Type inference failed for: r14v226 */
        /* JADX WARN: Type inference failed for: r14v99 */
        /* JADX WARN: Type inference failed for: r15v104 */
        /* JADX WARN: Type inference failed for: r15v24 */
        /* JADX WARN: Type inference failed for: r15v25 */
        /* JADX WARN: Type inference failed for: r15v49 */
        /* JADX WARN: Type inference failed for: r2v585, types: [java.lang.CharSequence] */
        /* JADX WARN: Type inference failed for: r2v605 */
        /* JADX WARN: Type inference failed for: r2v84, types: [java.lang.CharSequence, java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v85 */
        /* JADX WARN: Type inference failed for: r2v934 */
        /* JADX WARN: Type inference failed for: r2v935 */
        /* JADX WARN: Type inference failed for: r2v936 */
        /* JADX WARN: Type inference failed for: r30v7 */
        /* JADX WARN: Type inference failed for: r30v8, types: [java.lang.CharSequence] */
        /* JADX WARN: Type inference failed for: r32v10 */
        /* JADX WARN: Type inference failed for: r5v169, types: [java.util.regex.Pattern] */
        /* JADX WARN: Type inference failed for: r6v247 */
        /* JADX WARN: Type inference failed for: r6v248 */
        /* JADX WARN: Type inference failed for: r6v314, types: [java.lang.CharSequence] */
        /* JADX WARN: Type inference failed for: r6v348 */
        /* JADX WARN: Type inference failed for: r7v130 */
        /* JADX WARN: Type inference failed for: r7v131 */
        /* JADX WARN: Type inference failed for: r7v212, types: [java.lang.CharSequence] */
        /* JADX WARN: Type inference failed for: r7v252 */
        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:360:0x2775
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
            */
        public static java.lang.Object[] TuitionPaymentFragmentbindingInflater1$5f1425da(int r59, java.lang.Object r60, int r61) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 16350
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.CaptureSession1.Companion.TuitionPaymentFragmentbindingInflater1$5f1425da(int, java.lang.Object, int):java.lang.Object[]");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(int r6, byte r7, int r8) {
            /*
                int r8 = r8 * 4
                int r8 = 3 - r8
                int r6 = r6 + 66
                int r7 = r7 * 4
                int r0 = r7 + 1
                byte[] r1 = defpackage.CaptureSession1.Companion.$$c
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L14
                r3 = r8
                r4 = r2
                goto L2d
            L14:
                r3 = r2
            L15:
                r5 = r8
                r8 = r6
                r6 = r5
                byte r4 = (byte) r8
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r7) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L25:
                int r6 = r6 + 1
                r3 = r1[r6]
                r5 = r8
                r8 = r6
                r6 = r3
                r3 = r5
            L2d:
                int r6 = -r6
                int r6 = r6 + r3
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.CaptureSession1.Companion.$$g(int, byte, int):java.lang.String");
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentTutorialVerificationBiometricBinding fragmentTutorialVerificationBiometricBindingInflate = FragmentTutorialVerificationBiometricBinding.inflate(p0, p1, false);
        this.d = fragmentTutorialVerificationBiometricBindingInflate;
        if (fragmentTutorialVerificationBiometricBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentTutorialVerificationBiometricBindingInflate = null;
        }
        FrameLayout root = fragmentTutorialVerificationBiometricBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        FragmentTutorialVerificationBiometricBinding fragmentTutorialVerificationBiometricBinding = this.d;
        if (fragmentTutorialVerificationBiometricBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentTutorialVerificationBiometricBinding = null;
        }
        Button button = fragmentTutorialVerificationBiometricBinding.btnOpenCamera;
        Intrinsics.checkNotNullExpressionValue(button, "");
        button.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: CaptureSession2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CaptureSession1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, (View) obj);
            }
        }));
        Button button2 = fragmentTutorialVerificationBiometricBinding.btnBack;
        Intrinsics.checkNotNullExpressionValue(button2, "");
        button2.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: CaptureSessionState
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CaptureSession1.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (View) obj);
            }
        }));
    }

    public static /* synthetic */ Unit b(CaptureSession1 captureSession1, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Function0<Unit> function0 = captureSession1.b;
        if (function0 != null) {
            function0.invoke();
        }
        captureSession1.dismiss();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(CaptureSession1 captureSession1) {
        Function0<Unit> function0 = captureSession1.TuitionPaymentFragmentbindingInflater1;
        if (function0 != null) {
            function0.invoke();
        }
        captureSession1.dismiss();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(final CaptureSession1 captureSession1, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Camera2CameraControlImplExternalSyntheticLambda5.Companion bVar = Camera2CameraControlImplExternalSyntheticLambda5.INSTANCE;
        String string = captureSession1.getString(R.string.title_term_and_condition);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = captureSession1.getString(R.string.term_and_condition_biometric_dukcapil);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String string3 = captureSession1.getString(R.string.action_next);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        String string4 = captureSession1.getString(R.string.action_cancel_id);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        Camera2CameraControlImplExternalSyntheticLambda5 camera2CameraControlImplExternalSyntheticLambda5TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Camera2CameraControlImplExternalSyntheticLambda5.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(R.drawable.ic_info_blue, string, string2, string3, new Function0() { // from class: CaptureSessionExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CaptureSession1.b(this.b);
            }
        }, string4, new Function0() { // from class: CaptureSessionStateCallback
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        });
        camera2CameraControlImplExternalSyntheticLambda5TuitionPaymentFragmentspecialinlinedviewModeldefault3.setCancelable(false);
        int i = captureSession1.requireContext().getResources().getDisplayMetrics().heightPixels;
        FragmentManager childFragmentManager = captureSession1.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Intrinsics.checkNotNullParameter(childFragmentManager, "");
        if (childFragmentManager.findFragmentByTag(camera2CameraControlImplExternalSyntheticLambda5TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            camera2CameraControlImplExternalSyntheticLambda5TuitionPaymentFragmentspecialinlinedviewModeldefault3.show(childFragmentManager, camera2CameraControlImplExternalSyntheticLambda5TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        camera2CameraControlImplExternalSyntheticLambda5TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(Integer.valueOf(i));
        return Unit.INSTANCE;
    }
}
