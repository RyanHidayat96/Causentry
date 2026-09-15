package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentAddProgramBottomSheetDialogBinding;
import com.google.android.material.button.MaterialButton;
import com.google.mlkit.common.sdkinternal.zze;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Random;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0012\u0010\u0003R\u001a\u0010\u000e\u001a\u00020\u00138\u0015X\u0095D¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018"}, d2 = {"LCameraManagerCompatAvailabilityCallbackExecutorWrapperExternalSyntheticLambda2;", "LunregisterMediaButtonEventReceiver;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "b", "", "I", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()I", "Lcom/bpjstku/databinding/FragmentAddProgramBottomSheetDialogBinding;", "Lcom/bpjstku/databinding/FragmentAddProgramBottomSheetDialogBinding;", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CameraManagerCompatAvailabilityCallbackExecutorWrapperExternalSyntheticLambda2 extends unregisterMediaButtonEventReceiver {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private FragmentAddProgramBottomSheetDialogBinding TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = R.layout.fragment_add_program_bottom_sheet_dialog;

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
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

    /* JADX INFO: renamed from: CameraManagerCompatAvailabilityCallbackExecutorWrapperExternalSyntheticLambda2$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LCameraManagerCompatAvailabilityCallbackExecutorWrapperExternalSyntheticLambda2$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "LCameraManagerCompatAvailabilityCallbackExecutorWrapperExternalSyntheticLambda2;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()LCameraManagerCompatAvailabilityCallbackExecutorWrapperExternalSyntheticLambda2;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static CameraManagerCompatAvailabilityCallbackExecutorWrapperExternalSyntheticLambda2 TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return new CameraManagerCompatAvailabilityCallbackExecutorWrapperExternalSyntheticLambda2();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from getter */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentAddProgramBottomSheetDialogBinding fragmentAddProgramBottomSheetDialogBindingInflate = FragmentAddProgramBottomSheetDialogBinding.inflate(p0, p1, false);
        this.TuitionPaymentFragmentbindingInflater1 = fragmentAddProgramBottomSheetDialogBindingInflate;
        if (fragmentAddProgramBottomSheetDialogBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentAddProgramBottomSheetDialogBindingInflate = null;
        }
        FrameLayout root = fragmentAddProgramBottomSheetDialogBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        FragmentAddProgramBottomSheetDialogBinding fragmentAddProgramBottomSheetDialogBinding = this.TuitionPaymentFragmentbindingInflater1;
        FragmentAddProgramBottomSheetDialogBinding fragmentAddProgramBottomSheetDialogBinding2 = null;
        if (fragmentAddProgramBottomSheetDialogBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentAddProgramBottomSheetDialogBinding = null;
        }
        MaterialButton materialButton = fragmentAddProgramBottomSheetDialogBinding.btnAddProgram;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: CameraManagerCompatAvailabilityCallbackExecutorWrapperExternalSyntheticLambda0
            private static final byte[] $$a = {14, 70, 6, -35};
            private static final int $$b = 243;
            private static int $10 = 0;
            private static int $11 = 1;
            private static int asInterface = 0;
            private static int asBinder = 1;
            private static char b = 41804;
            private static char TuitionPaymentFragmentbindingInflater1 = 63495;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 38655;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 12615;
            private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {59717, 59804, 59794, 59798, 59804, 59794, 59799, 59797, 59801, 59770, 59754, 59752, 59772, 59775, 59755, 59754, 59752, 59788, 59791, 59767, 59796, 59822, 59799, 59763, 59791, 59820, 59796, 59797, 59823, 59798, 59806, 59798, 59786, 59791, 59798, 59799, 59799, 59805, 59395, 59887, 59427, 59430, 59448, 59453, 59427, 59449, 59406, 59402, 59417, 59404, 59899, 59427, 59430, 59448, 59453, 59427, 59449, 59406, 59402, 59416, 59899, 59420, 59410, 59402, 59404, 59424, 59442, 59437, 59426, 59708, 59770, 59751, 59749, 59773, 59745, 59756, 59746, 59744, 59771, 59751, 59757, 59714, 59715, 59746, 59749, 59770, 59751, 59746, 59770, 59738, 59699, 59730, 59704, 59757, 59751, 59753, 59731, 59753, 59756, 59757, 59759, 59757, 59730, 59740, 59756, 59756, 59759, 59757, 59744, 59720, 59784, 59765, 59791, 59761, 59771, 59761, 59764, 59765, 59767, 59765, 59748, 59768, 59785, 59720, 59782, 59780, 59802, 59805, 59801, 59783, 59748, 59749, 59780, 59807, 59804, 59801, 59780, 59804, 59772, 59774, 59807, 59768, 59758, 59765, 59779, 59782, 59783, 59777, 59783, 59766, 59786, 59803, 59803, 59705, 59756, 59747, 59745, 59765, 59708, 59747, 59759, 59757, 59757, 59751, 59733, 59728, 59771, 59768, 59745, 59707, 59756, 59746, 59744, 59771, 59751, 59757, 59714, 59715, 59746, 59749, 59770, 59751, 59746, 59770, 59738, 59716, 59749, 59718, 59723, 59733, 59747, 59745, 59756, 59745, 59775, 59768, 59744, 59705, 59751, 59745, 59753, 59757, 59756, 59756, 59749, 59768, 59744, 59743, 59743, 59751, 59745, 59746, 59744, 59746, 59746, 59757, 59742, 59812, 59835, 59814, 59839, 59812, 59780, 59760, 59762, 59778, 59809, 59837, 59839, 59834, 59812, 59838, 59834, 59812, 59833, 59812, 59838, 59815, 59814};

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = asInterface + 31;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                Unit unitTuitionPaymentFragmentspecialinlinedviewModeldefault2 = CameraManagerCompatAvailabilityCallbackExecutorWrapperExternalSyntheticLambda2.TuitionPaymentFragmentspecialinlinedviewModeldefault2((View) obj);
                int i4 = asInterface + 111;
                asBinder = i4 % 128;
                if (i4 % 2 != 0) {
                    return unitTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                }
                throw null;
            }

            private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2;
                int i3 = 2 % 2;
                onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
                char[] cArr2 = new char[cArr.length - 2];
                oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
                char[] cArr3 = new char[2];
                while (true) {
                    int i4 = 0;
                    if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                        objArr[0] = new String(cArr2, 0, i);
                        return;
                    }
                    int i5 = $11 + 5;
                    $10 = i5 % 128;
                    int i6 = 58224;
                    char c = 1;
                    if (i5 % 2 != 0) {
                        cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                        cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                        i2 = 1;
                    } else {
                        cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                        cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                        i2 = 0;
                    }
                    while (i2 < 16) {
                        int i7 = $10 + 11;
                        $11 = i7 % 128;
                        int i8 = i7 % 2;
                        char c2 = cArr3[c];
                        char c3 = cArr3[i4];
                        int i9 = (c3 + i6) ^ ((c3 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 8611973335120459638L)));
                        int i10 = c3 >>> 5;
                        try {
                            Object[] objArr2 = new Object[4];
                            objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            objArr2[2] = Integer.valueOf(i10);
                            objArr2[c] = Integer.valueOf(i9);
                            objArr2[i4] = Integer.valueOf(c2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char mirror = (char) (47821 - AndroidCharacter.getMirror('0'));
                                int deadChar = KeyEvent.getDeadChar(i4, i4) + 468;
                                int i11 = (TypedValue.complexToFraction(i4, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i4, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 13;
                                Class[] clsArr = new Class[4];
                                clsArr[i4] = Integer.TYPE;
                                clsArr[c] = Integer.TYPE;
                                clsArr[2] = Integer.TYPE;
                                clsArr[3] = Integer.TYPE;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(mirror, deadChar, i11, -2007001706, false, "o", clsArr);
                            }
                            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            cArr3[c] = cCharValue;
                            Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) b) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - Color.green(0)), 468 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                            }
                            cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                            i6 -= 40503;
                            i2++;
                            i4 = 0;
                            c = 1;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
                    cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] ^ cArr3[1]);
                    Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b2 = (byte) (-1);
                        byte b3 = (byte) (b2 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) Color.green(0), Color.rgb(0, 0, 0) + 16779539, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 44, -1312321721, false, $$c(b2, b3, b3), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                }
            }

            private static void c(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
                int i;
                int i2 = 2 % 2;
                setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
                int i3 = 0;
                int i4 = iArr[0];
                int i5 = 1;
                int i6 = iArr[1];
                int i7 = iArr[2];
                int i8 = iArr[3];
                char[] cArr = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                char c = '0';
                int i9 = -1;
                if (cArr != null) {
                    int length = cArr.length;
                    char[] cArr2 = new char[length];
                    int i10 = 0;
                    while (i10 < length) {
                        try {
                            Object[] objArr2 = new Object[i5];
                            objArr2[i3] = Integer.valueOf(cArr[i10]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b2 = (byte) i9;
                                byte b3 = (byte) (b2 + 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Color.blue(i3), TextUtils.indexOf("", c, i3, i3) + 1271, 18 - (ViewConfiguration.getScrollBarSize() >> 8), 407021364, false, $$c(b2, b3, (byte) (b3 | 8)), new Class[]{Integer.TYPE});
                            }
                            cArr2[i10] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            i10++;
                            i3 = 0;
                            i5 = 1;
                            c = '0';
                            i9 = -1;
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
                System.arraycopy(cArr, i4, cArr3, 0, i6);
                if (bArr != null) {
                    char[] cArr4 = new char[i6];
                    setvideostabilizationmode.b = 0;
                    char c2 = 0;
                    while (setvideostabilizationmode.b < i6) {
                        int i11 = $10 + 41;
                        $11 = i11 % 128;
                        int i12 = i11 % 2;
                        if (bArr[setvideostabilizationmode.b] == 1) {
                            int i13 = setvideostabilizationmode.b;
                            try {
                                Object[] objArr3 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c2)};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b4 = (byte) (-1);
                                    byte b5 = (byte) (b4 + 1);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 3225, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 12, 2133916302, false, $$c(b4, b5, (byte) (b5 | 9)), new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr4[i13] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        } else {
                            int i14 = setvideostabilizationmode.b;
                            Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c2)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b6 = (byte) (-1);
                                byte b7 = (byte) (b6 + 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 29944), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1755, TextUtils.lastIndexOf("", '0', 0) + 24, 387247676, false, $$c(b6, b7, (byte) (b7 | 7)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i14] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                        }
                        c2 = cArr4[setvideostabilizationmode.b];
                        Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b8 = (byte) (-1);
                            byte b9 = (byte) (b8 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (41241 - (ViewConfiguration.getEdgeSlop() >> 16)), 1705 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.getTrimmedLength("") + 21, -1434471773, false, $$c(b8, b9, (byte) (b9 + 3)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    }
                    cArr3 = cArr4;
                }
                if (i8 > 0) {
                    int i15 = $10 + 31;
                    $11 = i15 % 128;
                    if (i15 % 2 == 0) {
                        char[] cArr5 = new char[i6];
                        i = 0;
                        System.arraycopy(cArr3, 0, cArr5, 1, i6);
                        System.arraycopy(cArr5, 0, cArr3, i6 * i8, i8);
                        System.arraycopy(cArr5, i8, cArr3, 1, i6 - i8);
                    } else {
                        i = 0;
                        char[] cArr6 = new char[i6];
                        System.arraycopy(cArr3, 0, cArr6, 0, i6);
                        int i16 = i6 - i8;
                        System.arraycopy(cArr6, 0, cArr3, i16, i8);
                        System.arraycopy(cArr6, i8, cArr3, 0, i16);
                    }
                } else {
                    i = 0;
                }
                if (z) {
                    char[] cArr7 = new char[i6];
                    setvideostabilizationmode.b = i;
                    while (setvideostabilizationmode.b < i6) {
                        cArr7[setvideostabilizationmode.b] = cArr3[(i6 - setvideostabilizationmode.b) - 1];
                        setvideostabilizationmode.b++;
                    }
                    cArr3 = cArr7;
                }
                if (i7 > 0) {
                    int i17 = 0;
                    loop3: while (true) {
                        setvideostabilizationmode.b = i17;
                        while (true) {
                            if (setvideostabilizationmode.b >= i6) {
                                break loop3;
                            }
                            int i18 = $10 + 35;
                            $11 = i18 % 128;
                            if (i18 % 2 == 0) {
                                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] << iArr[5]);
                                setvideostabilizationmode.b++;
                            }
                        }
                        cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                        i17 = setvideostabilizationmode.b + 1;
                    }
                }
                objArr[0] = new String(cArr3);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r10v0 */
            /* JADX WARN: Type inference failed for: r10v15 */
            /* JADX WARN: Type inference failed for: r9v0 */
            /* JADX WARN: Type inference failed for: r9v8 */
            public static Object[] TuitionPaymentFragmentbindingInflater1(Context context, int i, int i2) {
                int i3;
                Class<?> cls;
                char[] cArr;
                int i4;
                int iB;
                int i5;
                Object[] objArr;
                int length;
                int i6;
                Object obj;
                String str;
                Method method;
                Object obj2;
                int i7;
                Object objInvoke;
                int i8;
                int i9;
                int i10;
                int i11;
                String str2 = "";
                int i12 = 2;
                int i13 = 2 % 2;
                int i14 = asInterface;
                int i15 = i14 + 111;
                asBinder = i15 % 128;
                Object obj3 = null;
                if (i15 % 2 == 0) {
                    obj3.hashCode();
                    throw null;
                }
                int i16 = 0;
                int i17 = 1;
                if (context != null) {
                    int i18 = i14 + 91;
                    asBinder = i18 % 128;
                    int i19 = i18 % 2;
                    try {
                        Object[] objArr2 = new Object[1];
                        a(new char[]{61934, 37179, 22100, 60500, 6541, 35005, 63613, 44402, 15834, 41388, 1697, 62725, 34923, 57578, 19231, 44572, 28620, 53002, 20474, 42631, 44878, 61121, 64507, 34607, 59251, 22401, 64819, 58196, 26815, 54622, 13198, 65062, 25808, 3776}, 30 - (~(-ExpandableListView.getPackedPositionType(0L))), objArr2);
                        try {
                            Object[] objArr3 = {(String) objArr2[0]};
                            Object[] objArr4 = new Object[1];
                            c(new byte[]{1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1}, new int[]{0, 38, 49, 0}, true, objArr4);
                            Object objNewInstance = Class.forName((String) objArr4[0]).getDeclaredConstructor(String.class).newInstance(objArr3);
                            Object[] objArr5 = new Object[1];
                            c(null, new int[]{38, 31, 196, 27}, true, objArr5);
                            String str3 = (String) objArr5[0];
                            int i20 = asBinder;
                            int i21 = (i20 & 97) + (i20 | 97);
                            asInterface = i21 % 128;
                            int i22 = i21 % 2;
                            try {
                                Object[] objArr6 = new Object[1];
                                c(new byte[]{1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1}, new int[]{0, 38, 49, 0}, true, objArr6);
                                Object objNewInstance2 = Class.forName((String) objArr6[0]).getDeclaredConstructor(String.class).newInstance(str3);
                                int i23 = asBinder;
                                int i24 = (i23 ^ 21) + ((i23 & 21) << 1);
                                asInterface = i24 % 128;
                                int i25 = i24 % 2;
                                try {
                                    Object[] objArr7 = new Object[1];
                                    c(new byte[]{0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0}, new int[]{69, 23, 0, 5}, false, objArr7);
                                    Class<?> cls2 = Class.forName((String) objArr7[0]);
                                    Object[] objArr8 = new Object[1];
                                    c(new byte[]{1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1}, new int[]{92, 17, 0, 0}, false, objArr8);
                                    Object objInvoke2 = cls2.getMethod((String) objArr8[0], null).invoke(context, null);
                                    int i26 = asBinder;
                                    int i27 = (i26 ^ 119) + ((i26 & 119) << 1);
                                    asInterface = i27 % 128;
                                    try {
                                        if (i27 % 2 != 0) {
                                            Object[] objArr9 = new Object[1];
                                            c(new byte[]{0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0}, new int[]{69, 23, 0, 5}, false, objArr9);
                                            cls = Class.forName((String) objArr9[0]);
                                            cArr = new char[]{26156, 29871, 30441, 41549, 37721, 63231, 59579, 24569, 12590, 43153, 38047, 34578, 65103, 65184, 8913, 7907};
                                            i4 = 51;
                                        } else {
                                            Object[] objArr10 = new Object[1];
                                            c(new byte[]{0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0}, new int[]{69, 23, 0, 5}, false, objArr10);
                                            cls = Class.forName((String) objArr10[0]);
                                            cArr = new char[]{26156, 29871, 30441, 41549, 37721, 63231, 59579, 24569, 12590, 43153, 38047, 34578, 65103, 65184, 8913, 7907};
                                            i4 = 14;
                                        }
                                        int iIndexOf = TextUtils.indexOf("", "", 0, 0);
                                        Object[] objArr11 = new Object[1];
                                        a(cArr, ((i4 | iIndexOf) << 1) - (i4 ^ iIndexOf), objArr11);
                                        Object objInvoke3 = cls.getMethod((String) objArr11[0], null).invoke(context, null);
                                        int i28 = asInterface + 73;
                                        asBinder = i28 % 128;
                                        int i29 = i28 % 2;
                                        try {
                                            Object[] objArr12 = {objInvoke3, 64};
                                            char[] cArr2 = {43326, 32931, 32625, 31683, 53779, 41445, 5547, 416, 46334, 33005, 43239, 46051, 14174, 58073, 654, 51640, 37986, 1293, 3532, 20540, 41345, 63610, 45502, 5162, 16770, 26706, 58134, 52296, 58912, 14119, 11160, 57943, 33718, 57849, 49433, 34035};
                                            int i30 = -View.MeasureSpec.getMode(0);
                                            int i31 = asBinder;
                                            int i32 = ((i31 | 49) << 1) - (i31 ^ 49);
                                            asInterface = i32 % 128;
                                            if (i32 % 2 != 0) {
                                                iB = zze.b();
                                                int i33 = 318 - (~(-i30));
                                                i5 = (i33 ^ 284) + ((i33 & 284) << 1);
                                            } else {
                                                iB = zze.b();
                                                int i34 = i30 * 319;
                                                i5 = (i34 | (-10461)) + (i34 & (-10461));
                                            }
                                            int i35 = ~i30;
                                            int i36 = ~((i35 ^ iB) | (i35 & iB));
                                            int i37 = -(-((((-34) ^ i36) | ((-34) & i36)) * (-318)));
                                            int i38 = (i5 & i37) + (i5 | i37);
                                            int i39 = ~(((-34) ^ iB) | ((-34) & iB));
                                            int i40 = ~iB;
                                            int i41 = (i40 ^ i30) | (i40 & i30);
                                            int i42 = ~((i41 ^ 33) | (i41 & 33));
                                            int i43 = i38 + (((i39 ^ i42) | (i42 & i39)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
                                            int i44 = ~iB;
                                            int i45 = ((-34) & i44) | ((-34) ^ i44);
                                            int i46 = ~((i45 & i30) | (i45 ^ i30));
                                            int i47 = (i30 ^ 33) | (i30 & 33);
                                            int i48 = ~((i47 & iB) | (i47 ^ iB));
                                            int i49 = ((i46 & i48) | (i46 ^ i48)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                                            int i50 = (i43 ^ i49) + ((i43 & i49) << 1);
                                            Object[] objArr13 = new Object[1];
                                            a(cArr2, i50, objArr13);
                                            Class<?> cls3 = Class.forName((String) objArr13[0]);
                                            byte[] bArr = {1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0};
                                            int[] iArr = {109, 14, 24, 1};
                                            int i51 = asBinder;
                                            int i52 = (i51 & 95) + (i51 | 95);
                                            asInterface = i52 % 128;
                                            int i53 = i52 % 2;
                                            Object[] objArr14 = new Object[1];
                                            c(bArr, iArr, false, objArr14);
                                            Object objInvoke4 = cls3.getMethod((String) objArr14[0], String.class, Integer.TYPE).invoke(objInvoke2, objArr12);
                                            Object[] objArr15 = new Object[1];
                                            c(new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1}, new int[]{123, 30, 38, 0}, false, objArr15);
                                            Class<?> cls4 = Class.forName((String) objArr15[0]);
                                            int i54 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                            int i55 = ((i54 | 11) << 1) - (i54 ^ 11);
                                            Object[] objArr16 = new Object[1];
                                            a(new char[]{13726, 14913, 14300, 4411, 35570, 59021, 60485, 33284, 54979, 14303, 56860, 16705}, i55, objArr16);
                                            Field field = cls4.getField((String) objArr16[0]);
                                            int i56 = asBinder;
                                            int i57 = ((i56 | 19) << 1) - (i56 ^ 19);
                                            asInterface = i57 % 128;
                                            if (i57 % 2 != 0) {
                                                objArr = (Object[]) field.get(objInvoke4);
                                                length = objArr.length;
                                                i6 = 1;
                                            } else {
                                                objArr = (Object[]) field.get(objInvoke4);
                                                length = objArr.length;
                                                i6 = 0;
                                            }
                                            while (true) {
                                                if (i6 < length) {
                                                    int i58 = asBinder + 125;
                                                    asInterface = i58 % 128;
                                                    if (i58 % i12 != 0) {
                                                        obj = objArr[i6];
                                                        Object[] objArr17 = new Object[i17];
                                                        c(new byte[]{0, 1, 1, 1, 1}, new int[]{153, 5, 54, 4}, i17, objArr17);
                                                        str = (String) objArr17[i16];
                                                    } else {
                                                        obj = objArr[i6];
                                                        Object[] objArr18 = new Object[i17];
                                                        c(new byte[]{0, 1, 1, 1, 1}, new int[]{153, 5, 54, 4}, i16, objArr18);
                                                        str = (String) objArr18[i16];
                                                    }
                                                    try {
                                                        Object[] objArr19 = {str};
                                                        Object[] objArr20 = new Object[i17];
                                                        a(new char[]{51913, 8276, 10949, 3338, 10436, 16479, 38616, 18406, 17151, 55558, 13304, 54805, 47827, 14815, 19318, 45370, 46990, 33853, 14131, 22678, 55502, 25170, 52399, 36883, 55286, 64066, 38974, 14066, 1712, 32942, 42279, 39390, 6011, 26386, 12325, 59640, 49474, 914, 21934, 53333}, 37 - View.MeasureSpec.getSize(i16), objArr20);
                                                        Class<?> cls5 = Class.forName((String) objArr20[i16]);
                                                        Object[] objArr21 = new Object[1];
                                                        c(new byte[]{0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1}, new int[]{158, 11, i16, 3}, i16, objArr21);
                                                        String str4 = (String) objArr21[i16];
                                                        int i59 = asBinder;
                                                        int i60 = ((i59 | 67) << 1) - (i59 ^ 67);
                                                        asInterface = i60 % 128;
                                                        if (i60 % 2 != 0) {
                                                            Class<?>[] clsArr = new Class[1];
                                                            clsArr[1] = String.class;
                                                            method = cls5.getMethod(str4, clsArr);
                                                            obj2 = null;
                                                        } else {
                                                            Class<?>[] clsArr2 = new Class[1];
                                                            clsArr2[i16] = String.class;
                                                            method = cls5.getMethod(str4, clsArr2);
                                                            obj2 = null;
                                                        }
                                                        Object objInvoke5 = method.invoke(obj2, objArr19);
                                                        try {
                                                            Object[] objArr22 = new Object[1];
                                                            c(new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1}, new int[]{169, 28, i16, i16}, i16, objArr22);
                                                            Class<?> cls6 = Class.forName((String) objArr22[i16]);
                                                            char[] cArr3 = {8395, 47722, 21157, 41234, 6954, 60506, 36978, 18058, 25893, 17976, 28758, 4382, 57336, 15334};
                                                            int i61 = -TextUtils.lastIndexOf(str2, '0', i16);
                                                            int i62 = asBinder;
                                                            int i63 = (i62 ^ 109) + ((i62 & 109) << 1);
                                                            int i64 = i63 % 128;
                                                            asInterface = i64;
                                                            int i65 = i63 % 2 != 0 ? (i61 - 520) % 2 : (i61 * (-520)) + 5220;
                                                            Object[] objArr23 = objArr;
                                                            int i66 = ~i61;
                                                            int i67 = length;
                                                            int i68 = (i65 - (~((~(((i66 ^ 10) | (i66 & 10)) | i)) * 521))) - 1;
                                                            int i69 = (i64 & 9) + (i64 | 9);
                                                            int i70 = i69 % 128;
                                                            asBinder = i70;
                                                            int i71 = i69 % 2;
                                                            int i72 = ((-11) ^ i61) | ((-11) & i61);
                                                            int i73 = (i68 - (~((~i72) * (-1042)))) - 1;
                                                            int i74 = i70 + 53;
                                                            asInterface = i74 % 128;
                                                            int i75 = i74 % 2;
                                                            int i76 = ~i72;
                                                            int i77 = ~i;
                                                            int i78 = (i66 & i77) | (i66 ^ i77);
                                                            int i79 = ~((i78 & 10) | (i78 ^ 10));
                                                            int i80 = -(-(((i79 & i76) | (i76 ^ i79)) * 521));
                                                            int i81 = (i73 ^ i80) + ((i80 & i73) << 1);
                                                            Object[] objArr24 = new Object[1];
                                                            a(cArr3, i81, objArr24);
                                                            try {
                                                                Object[] objArr25 = {new ByteArrayInputStream((byte[]) cls6.getMethod((String) objArr24[0], null).invoke(obj, null))};
                                                                char[] cArr4 = {51913, 8276, 10949, 3338, 10436, 16479, 38616, 18406, 17151, 55558, 13304, 54805, 47827, 14815, 19318, 45370, 46990, 33853, 14131, 22678, 55502, 25170, 52399, 36883, 55286, 64066, 38974, 14066, 1712, 32942, 42279, 39390, 6011, 26386, 12325, 59640, 49474, 914, 21934, 53333};
                                                                int i82 = -Process.getGidForName(str2);
                                                                int iB2 = zze.b();
                                                                int i83 = asBinder;
                                                                int i84 = ((i83 | 3) << 1) - (i83 ^ 3);
                                                                int i85 = i84 % 128;
                                                                asInterface = i85;
                                                                int i86 = i84 % 2;
                                                                int i87 = (i82 * 567) - 20340;
                                                                int i88 = ~((~i82) | 36);
                                                                int i89 = (i85 ^ 13) + ((i85 & 13) << 1);
                                                                int i90 = i89 % 128;
                                                                asBinder = i90;
                                                                String str5 = str2;
                                                                if (i89 % 2 == 0) {
                                                                    int i91 = ~i82;
                                                                    i7 = i87 / ((-566) % (i88 | (~((i91 ^ iB2) | (i91 & iB2)))));
                                                                } else {
                                                                    int i92 = ~i82;
                                                                    int i93 = -(-((i88 | (~((i92 ^ iB2) | (i92 & iB2)))) * (-566)));
                                                                    i7 = (i87 & i93) + (i93 | i87);
                                                                }
                                                                int i94 = (i90 & 115) + (i90 | 115);
                                                                asInterface = i94 % 128;
                                                                int i95 = i94 % 2;
                                                                int i96 = -(-(566 * (~(((-37) & i82) | ((-37) ^ i82)))));
                                                                int i97 = ((i7 | i96) << 1) - (i96 ^ i7);
                                                                int i98 = (~i82) | (-37);
                                                                int i99 = -(-((~((i98 & iB2) | (i98 ^ iB2))) * 566));
                                                                int i100 = (i97 ^ i99) + ((i99 & i97) << 1);
                                                                Object[] objArr26 = new Object[1];
                                                                a(cArr4, i100, objArr26);
                                                                Class<?> cls7 = Class.forName((String) objArr26[0]);
                                                                Object[] objArr27 = new Object[1];
                                                                c(new byte[]{1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0}, new int[]{197, 19, 0, 0}, true, objArr27);
                                                                Method method2 = cls7.getMethod((String) objArr27[0], InputStream.class);
                                                                int i101 = asBinder + 79;
                                                                asInterface = i101 % 128;
                                                                if (i101 % 2 != 0) {
                                                                    objInvoke = method2.invoke(objInvoke5, objArr25);
                                                                    int i102 = 45 / 0;
                                                                } else {
                                                                    objInvoke = method2.invoke(objInvoke5, objArr25);
                                                                }
                                                                int i103 = asBinder;
                                                                int i104 = ((i103 | 105) << 1) - (i103 ^ 105);
                                                                asInterface = i104 % 128;
                                                                int i105 = i104 % 2;
                                                                try {
                                                                    Object[] objArr28 = new Object[1];
                                                                    a(new char[]{29198, 6535, 62596, 52746, 52033, 17169, 26539, 32119, 55613, 10232, 26577, 40538, 2110, 41514, 56961, 8894, 36843, 52022, 50224, 39699, 17642, 44666, 50373, 64474, 8471, 3499, 40565, 22530, 40855, 1979, 52999, 11163, 37339, 33780, 21808, 15232}, 'R' - AndroidCharacter.getMirror('0'), objArr28);
                                                                    String str6 = (String) objArr28[0];
                                                                    int i106 = asInterface;
                                                                    int i107 = ((i106 | 13) << 1) - (i106 ^ 13);
                                                                    asBinder = i107 % 128;
                                                                    int i108 = i107 % 2;
                                                                    Class<?> cls8 = Class.forName(str6);
                                                                    Object[] objArr29 = new Object[1];
                                                                    c(new byte[]{1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0}, new int[]{216, 23, 73, 18}, false, objArr29);
                                                                    if (!objNewInstance.equals(cls8.getMethod((String) objArr29[0], null).invoke(objInvoke, null))) {
                                                                        int i109 = asBinder;
                                                                        int i110 = (i109 & 63) + (i109 | 63);
                                                                        asInterface = i110 % 128;
                                                                        int i111 = i110 % 2;
                                                                        try {
                                                                            char[] cArr5 = {29198, 6535, 62596, 52746, 52033, 17169, 26539, 32119, 55613, 10232, 26577, 40538, 2110, 41514, 56961, 8894, 36843, 52022, 50224, 39699, 17642, 44666, 50373, 64474, 8471, 3499, 40565, 22530, 40855, 1979, 52999, 11163, 37339, 33780, 21808, 15232};
                                                                            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0);
                                                                            int iB3 = zze.b();
                                                                            int i112 = asBinder;
                                                                            int i113 = ((i112 | 3) << 1) - (i112 ^ 3);
                                                                            asInterface = i113 % 128;
                                                                            if (i113 % 2 != 0) {
                                                                                int i114 = -iResolveSizeAndState;
                                                                                int i115 = (i114 & 303) + (i114 | 303);
                                                                                i11 = (i115 & (-10234)) + (i115 | (-10234));
                                                                            } else {
                                                                                int i116 = iResolveSizeAndState * 303;
                                                                                i11 = (i116 | (-10234)) + (i116 & (-10234));
                                                                            }
                                                                            int i117 = ~((~iResolveSizeAndState) | (~iB3) | 34);
                                                                            int i118 = iResolveSizeAndState | 34;
                                                                            int i119 = ~((i118 & iB3) | (i118 ^ iB3));
                                                                            int i120 = (i11 - (~(-(-((-302) * ((i117 & i119) | (i117 ^ i119))))))) - 1;
                                                                            int i121 = ~iResolveSizeAndState;
                                                                            int i122 = (i121 & 34) | (i121 ^ 34);
                                                                            int i123 = (i120 - (~(-(-((~((i122 & iB3) | (i122 ^ iB3))) * (-604)))))) - 1;
                                                                            int i124 = ~((iResolveSizeAndState & (-35)) | ((-35) ^ iResolveSizeAndState));
                                                                            int i125 = ~((iB3 & 34) | (iB3 ^ 34));
                                                                            int i126 = (i123 - (~(-(-(((i125 & i124) | (i124 ^ i125)) * 302))))) - 1;
                                                                            Object[] objArr30 = new Object[1];
                                                                            a(cArr5, i126, objArr30);
                                                                            Class<?> cls9 = Class.forName((String) objArr30[0]);
                                                                            Object[] objArr31 = new Object[1];
                                                                            c(new byte[]{1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0}, new int[]{216, 23, 73, 18}, false, objArr31);
                                                                            if (!objNewInstance2.equals(cls9.getMethod((String) objArr31[0], null).invoke(objInvoke, null))) {
                                                                                i6++;
                                                                                objArr = objArr23;
                                                                                str2 = str5;
                                                                                length = i67;
                                                                                i12 = 2;
                                                                                i16 = 0;
                                                                                i17 = 1;
                                                                            }
                                                                        } catch (Throwable th) {
                                                                            Throwable cause = th.getCause();
                                                                            if (cause != null) {
                                                                                throw cause;
                                                                            }
                                                                            throw th;
                                                                        }
                                                                    }
                                                                    int i127 = (i & (-2)) | (i77 & 1);
                                                                    Object[] objArr32 = new Object[4];
                                                                    int[] iArr2 = new int[1];
                                                                    objArr32[0] = iArr2;
                                                                    objArr32[1] = new int[1];
                                                                    int[] iArr3 = new int[1];
                                                                    int i128 = asBinder;
                                                                    int i129 = ((i128 | 113) << 1) - (i128 ^ 113);
                                                                    asInterface = i129 % 128;
                                                                    int i130 = i129 % 2;
                                                                    objArr32[2] = iArr3;
                                                                    iArr2[0] = i;
                                                                    iArr3[0] = i127;
                                                                    objArr32[3] = null;
                                                                    int iMyTid = Process.myTid();
                                                                    int i131 = (-2039159572) + ((~(1071464031 | iMyTid)) * 623) + (((~iMyTid) | 1027870728) * (-623)) + (((~(iMyTid | 1069822494)) | (~(1029512265 | iMyTid)) | (-1071464032)) * 623);
                                                                    int i132 = (-15184) + (i131 * (-949));
                                                                    int i133 = ~i131;
                                                                    int i134 = ~i;
                                                                    int i135 = ~((i133 & i134) | (i133 ^ i134));
                                                                    int i136 = asInterface;
                                                                    int i137 = (i136 & 81) + (i136 | 81);
                                                                    asBinder = i137 % 128;
                                                                    if (i137 % 2 == 0) {
                                                                        int i138 = ~((-17) | i);
                                                                        i8 = i132 >>> (1900 / ((i135 & i138) | (i135 ^ i138)));
                                                                        i9 = ~((i77 ^ 16) | (i77 & 16));
                                                                        i10 = (i131 ^ i) | (i131 & i);
                                                                    } else {
                                                                        int i139 = ~((-17) | i);
                                                                        i8 = (i132 - (~(-(-(((i135 & i139) | (i135 ^ i139)) * 1900))))) - 1;
                                                                        i9 = ~((i134 ^ 16) | (i134 & 16));
                                                                        i10 = i131 | i;
                                                                    }
                                                                    int i140 = ~i10;
                                                                    int i141 = (-950) * ((i9 & i140) | (i9 ^ i140));
                                                                    int i142 = (i8 & i141) + (i8 | i141) + (((~((i77 ^ i131) | (i131 & i77))) | (~((16 & i) | (16 ^ i)))) * 950);
                                                                    int i143 = (i2 & i142) + (i142 | i2);
                                                                    int i144 = i143 << 13;
                                                                    int i145 = (i143 | i144) & (~(i143 & i144));
                                                                    int i146 = i145 >>> 17;
                                                                    int i147 = ((~i145) & i146) | ((~i146) & i145);
                                                                    int i148 = i147 << 5;
                                                                    ((int[]) objArr32[1])[0] = (i147 | i148) & (~(i147 & i148));
                                                                    return objArr32;
                                                                } catch (Throwable th2) {
                                                                    Throwable cause2 = th2.getCause();
                                                                    if (cause2 != null) {
                                                                        throw cause2;
                                                                    }
                                                                    throw th2;
                                                                }
                                                            } catch (Throwable th3) {
                                                                Throwable cause3 = th3.getCause();
                                                                if (cause3 != null) {
                                                                    throw cause3;
                                                                }
                                                                throw th3;
                                                            }
                                                        } catch (Throwable th4) {
                                                            Throwable cause4 = th4.getCause();
                                                            if (cause4 != null) {
                                                                throw cause4;
                                                            }
                                                            throw th4;
                                                        }
                                                    } catch (Throwable th5) {
                                                        Throwable cause5 = th5.getCause();
                                                        if (cause5 != null) {
                                                            throw cause5;
                                                        }
                                                        throw th5;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th6) {
                                            Throwable cause6 = th6.getCause();
                                            if (cause6 != null) {
                                                throw cause6;
                                            }
                                            throw th6;
                                        }
                                    } catch (Throwable th7) {
                                        Throwable cause7 = th7.getCause();
                                        if (cause7 != null) {
                                            throw cause7;
                                        }
                                        throw th7;
                                    }
                                } catch (Throwable th8) {
                                    Throwable cause8 = th8.getCause();
                                    if (cause8 != null) {
                                        throw cause8;
                                    }
                                    throw th8;
                                }
                            } catch (Throwable th9) {
                                Throwable cause9 = th9.getCause();
                                if (cause9 != null) {
                                    throw cause9;
                                }
                                throw th9;
                            }
                        } catch (Throwable th10) {
                            Throwable cause10 = th10.getCause();
                            if (cause10 != null) {
                                throw cause10;
                            }
                            throw th10;
                        }
                    } catch (Throwable unused) {
                    }
                }
                Object[] objArr33 = {new int[]{i}, new int[1], new int[]{i}, null};
                int i149 = ~((~new Random().nextInt()) | 910769470);
                int i150 = (((843064616 | i149) * (-374)) - 2032914912) + ((i149 | 67704854) * 374);
                int iB4 = zze.b();
                int i151 = asInterface + 33;
                asBinder = i151 % 128;
                if (i151 % 2 == 0) {
                    i3 = (71 << i150) / ((-69) >> i2);
                } else {
                    int i152 = i150 * 71;
                    int i153 = i2 * (-69);
                    i3 = ((i152 | i153) << 1) - (i152 ^ i153);
                }
                int i154 = ~i150;
                int i155 = (-140) * ((~((i154 & i2) | (i154 ^ i2))) | (~(i2 | iB4)));
                int i156 = (i3 & i155) + (i3 | i155);
                int i157 = i150 | i2;
                int i158 = -(-((~((i157 & iB4) | (i157 ^ iB4))) * 70));
                int i159 = (i156 & i158) + (i158 | i156);
                int i160 = ~i150;
                int i161 = ~((i160 & i2) | (i160 ^ i2));
                int i162 = ~((~i2) | i150);
                int i163 = (i162 & i161) | (i161 ^ i162);
                int i164 = ~((iB4 & i150) | (i150 ^ iB4));
                int i165 = ((i164 & i163) | (i163 ^ i164)) * 70;
                int i166 = ((i159 | i165) << 1) - (i165 ^ i159);
                int i167 = i166 << 13;
                int i168 = (i167 | i166) & (~(i166 & i167));
                int i169 = i168 >>> 17;
                int i170 = (i168 | i169) & (~(i168 & i169));
                int i171 = i170 << 5;
                ((int[]) objArr33[1])[0] = ((~i170) & i171) | ((~i171) & i170);
                return objArr33;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0022  */
            /* JADX WARN: Code duplicated, block: B:8:0x001c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$c(int r7, byte r8, short r9) {
                /*
                    int r7 = r7 + 4
                    int r8 = r8 * 3
                    int r8 = 1 - r8
                    int r9 = 108 - r9
                    byte[] r0 = defpackage.CameraManagerCompatAvailabilityCallbackExecutorWrapperExternalSyntheticLambda0.$$a
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L12
                    r3 = r8
                    r4 = r2
                    goto L27
                L12:
                    r3 = r2
                L13:
                    int r4 = r3 + 1
                    byte r5 = (byte) r9
                    r1[r3] = r5
                    int r7 = r7 + 1
                    if (r4 != r8) goto L22
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    return r7
                L22:
                    r3 = r0[r7]
                    r6 = r3
                    r3 = r9
                    r9 = r6
                L27:
                    int r9 = -r9
                    int r9 = r9 + r3
                    r3 = r4
                    goto L13
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.CameraManagerCompatAvailabilityCallbackExecutorWrapperExternalSyntheticLambda0.$$c(int, byte, short):java.lang.String");
            }
        }));
        FragmentAddProgramBottomSheetDialogBinding fragmentAddProgramBottomSheetDialogBinding3 = this.TuitionPaymentFragmentbindingInflater1;
        if (fragmentAddProgramBottomSheetDialogBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            fragmentAddProgramBottomSheetDialogBinding2 = fragmentAddProgramBottomSheetDialogBinding3;
        }
        MaterialButton materialButton2 = fragmentAddProgramBottomSheetDialogBinding2.btnCancel;
        Intrinsics.checkNotNullExpressionValue(materialButton2, "");
        materialButton2.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: CameraManagerCompatAvailabilityCallbackExecutorWrapperExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CameraManagerCompatAvailabilityCallbackExecutorWrapperExternalSyntheticLambda2.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (View) obj);
            }
        }));
    }

    public static /* synthetic */ Unit b(CameraManagerCompatAvailabilityCallbackExecutorWrapperExternalSyntheticLambda2 cameraManagerCompatAvailabilityCallbackExecutorWrapperExternalSyntheticLambda2, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        cameraManagerCompatAvailabilityCallbackExecutorWrapperExternalSyntheticLambda2.dismiss();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return Unit.INSTANCE;
    }
}
