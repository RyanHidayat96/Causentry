package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentMotionChangePhoneBottomSheetBinding;
import com.google.android.material.button.MaterialButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class changeMenuMode extends unregisterMediaButtonEventReceiver {
    private final Function0<Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private FragmentMotionChangePhoneBottomSheetBinding b;

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return R.layout.fragment_motion_change_phone_bottom_sheet;
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

    public changeMenuMode(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function0;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        FragmentMotionChangePhoneBottomSheetBinding fragmentMotionChangePhoneBottomSheetBindingInflate = FragmentMotionChangePhoneBottomSheetBinding.inflate(layoutInflater, viewGroup, false);
        this.b = fragmentMotionChangePhoneBottomSheetBindingInflate;
        if (fragmentMotionChangePhoneBottomSheetBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentMotionChangePhoneBottomSheetBindingInflate = null;
        }
        FrameLayout root = fragmentMotionChangePhoneBottomSheetBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        FragmentMotionChangePhoneBottomSheetBinding fragmentMotionChangePhoneBottomSheetBinding = this.b;
        FragmentMotionChangePhoneBottomSheetBinding fragmentMotionChangePhoneBottomSheetBinding2 = null;
        if (fragmentMotionChangePhoneBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentMotionChangePhoneBottomSheetBinding = null;
        }
        MaterialButton materialButton = fragmentMotionChangePhoneBottomSheetBinding.btnCancel;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: clearAll
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return changeMenuMode.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj);
            }
        }));
        FragmentMotionChangePhoneBottomSheetBinding fragmentMotionChangePhoneBottomSheetBinding3 = this.b;
        if (fragmentMotionChangePhoneBottomSheetBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            fragmentMotionChangePhoneBottomSheetBinding2 = fragmentMotionChangePhoneBottomSheetBinding3;
        }
        MaterialButton materialButton2 = fragmentMotionChangePhoneBottomSheetBinding2.btnChange;
        Intrinsics.checkNotNullExpressionValue(materialButton2, "");
        materialButton2.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: clearHeader
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return changeMenuMode.b(this.TuitionPaymentFragmentbindingInflater1, (View) obj);
            }
        }));
    }

    public static /* synthetic */ Unit b(changeMenuMode changemenumode, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        changemenumode.TuitionPaymentFragmentspecialinlinedviewModeldefault2.invoke();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(changeMenuMode changemenumode, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        changemenumode.dismiss();
        return Unit.INSTANCE;
    }
}
