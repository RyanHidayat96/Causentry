package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentVocationalFormalEducationBottomSheetBinding;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001f\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0015\u0010\u0011R\"\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u0016\u0010\u0010\u001a\u00020\u00198\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001a\u001a\u00020\u001c8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001d"}, d2 = {"LRequestMonitor;", "LunregisterMediaButtonEventReceiver;", "Lkotlin/Function1;", "", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()V", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "b", "Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/String;", "Lcom/bpjstku/databinding/FragmentVocationalFormalEducationBottomSheetBinding;", "TuitionPaymentFragmentbindingInflater1", "Lcom/bpjstku/databinding/FragmentVocationalFormalEducationBottomSheetBinding;", "", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RequestMonitor extends unregisterMediaButtonEventReceiver {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private FragmentVocationalFormalEducationBottomSheetBinding TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Function1<String, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Override // defpackage.unregisterMediaButtonEventReceiver
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
    public final int getD() {
        return R.layout.fragment_vocational_formal_education_bottom_sheet;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void b() {
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void d() {
    }

    public /* synthetic */ RequestMonitor(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RequestMonitor(Function1<? super String, Unit> function1) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function1;
    }

    /* JADX INFO: renamed from: RequestMonitor$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LRequestMonitor$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ RequestMonitor TuitionPaymentFragmentbindingInflater1(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            RequestMonitor requestMonitor = new RequestMonitor(function1);
            Bundle bundle = new Bundle();
            bundle.putString("formal_education", null);
            requestMonitor.setArguments(bundle);
            return requestMonitor;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentVocationalFormalEducationBottomSheetBinding fragmentVocationalFormalEducationBottomSheetBindingInflate = FragmentVocationalFormalEducationBottomSheetBinding.inflate(p0, p1, false);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = fragmentVocationalFormalEducationBottomSheetBindingInflate;
        if (fragmentVocationalFormalEducationBottomSheetBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentVocationalFormalEducationBottomSheetBindingInflate = null;
        }
        ConstraintLayout root = fragmentVocationalFormalEducationBottomSheetBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            Bundle arguments = getArguments();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = arguments != null ? arguments.getString("formal_education") : null;
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        FragmentVocationalFormalEducationBottomSheetBinding fragmentVocationalFormalEducationBottomSheetBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        FragmentVocationalFormalEducationBottomSheetBinding fragmentVocationalFormalEducationBottomSheetBinding2 = null;
        if (fragmentVocationalFormalEducationBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentVocationalFormalEducationBottomSheetBinding = null;
        }
        fragmentVocationalFormalEducationBottomSheetBinding.rgChooseFormalEducation.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: isAspectRatioMatch
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                RequestMonitor.b(this.TuitionPaymentFragmentbindingInflater1, radioGroup, i);
            }
        });
        FragmentVocationalFormalEducationBottomSheetBinding fragmentVocationalFormalEducationBottomSheetBinding3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (fragmentVocationalFormalEducationBottomSheetBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            fragmentVocationalFormalEducationBottomSheetBinding2 = fragmentVocationalFormalEducationBottomSheetBinding3;
        }
        Button button = fragmentVocationalFormalEducationBottomSheetBinding2.btnApply;
        Intrinsics.checkNotNullExpressionValue(button, "");
        AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(button, new Function0() { // from class: createMonitorListener
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RequestMonitor.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b);
            }
        });
        Dialog dialog = getDialog();
        Intrinsics.checkNotNull(dialog);
        dialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: setHDRnet
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                RequestMonitor.b(dialogInterface);
            }
        });
    }

    public static /* synthetic */ void b(DialogInterface dialogInterface) {
        Intrinsics.checkNotNull(dialogInterface, "");
        FrameLayout frameLayout = (FrameLayout) ((BottomSheetDialog) dialogInterface).findViewById(R.id.design_bottom_sheet);
        if (frameLayout != null) {
            BottomSheetBehavior.from(frameLayout).setState(3);
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(RequestMonitor requestMonitor) {
        Function1<String, Unit> function1 = requestMonitor.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (function1 != null) {
            String str = requestMonitor.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (str == null) {
                str = "";
            }
            function1.invoke(str);
        }
        requestMonitor.dismiss();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void b(RequestMonitor requestMonitor, RadioGroup radioGroup, int i) {
        RadioButton radioButton;
        Intrinsics.checkNotNullParameter(radioGroup, "");
        View view = requestMonitor.getView();
        requestMonitor.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = String.valueOf((view == null || (radioButton = (RadioButton) view.findViewById(i)) == null) ? null : radioButton.getText());
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void g() {
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (str != null) {
            FragmentVocationalFormalEducationBottomSheetBinding fragmentVocationalFormalEducationBottomSheetBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (fragmentVocationalFormalEducationBottomSheetBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                fragmentVocationalFormalEducationBottomSheetBinding = null;
            }
            RadioGroup radioGroup = fragmentVocationalFormalEducationBottomSheetBinding.rgChooseFormalEducation;
            Intrinsics.checkNotNullExpressionValue(radioGroup, "");
            RadioGroup radioGroup2 = radioGroup;
            int childCount = radioGroup2.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = radioGroup2.getChildAt(i);
                RadioButton radioButton = childAt instanceof RadioButton ? (RadioButton) childAt : null;
                if (radioButton != null && Intrinsics.areEqual(radioButton.getText().toString(), str)) {
                    FragmentVocationalFormalEducationBottomSheetBinding fragmentVocationalFormalEducationBottomSheetBinding2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (fragmentVocationalFormalEducationBottomSheetBinding2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        fragmentVocationalFormalEducationBottomSheetBinding2 = null;
                    }
                    fragmentVocationalFormalEducationBottomSheetBinding2.rgChooseFormalEducation.check(radioButton.getId());
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RequestMonitor() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
