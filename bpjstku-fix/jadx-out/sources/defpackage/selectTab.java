package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentChooseSegmentBottomSheetBinding;
import com.bpjstku.util.constant.Citizenship;
import com.bpjstku.util.constant.MembershipType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0012\u0010\u0003R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016R$\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\r0\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u0016\u0010\u000e\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001b\u001a\u00020\u001d8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001e"}, d2 = {"LselectTab;", "LunregisterMediaButtonEventReceiver;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "b", "Lcom/bpjstku/util/constant/MembershipType;", "Lcom/bpjstku/util/constant/MembershipType;", "Lcom/bpjstku/util/constant/Citizenship;", "Lcom/bpjstku/util/constant/Citizenship;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "Lcom/bpjstku/databinding/FragmentChooseSegmentBottomSheetBinding;", "TuitionPaymentFragmentbindingInflater1", "Lcom/bpjstku/databinding/FragmentChooseSegmentBottomSheetBinding;", "", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class selectTab extends unregisterMediaButtonEventReceiver {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private FragmentChooseSegmentBottomSheetBinding TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private MembershipType b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private Function1<? super MembershipType, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private Citizenship TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MembershipType.values().length];
            try {
                iArr[MembershipType.PU.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MembershipType.BPU.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
    public final int getTuitionPaymentFragmentbindingInflater1() {
        return R.layout.fragment_choose_segment_bottom_sheet;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void b() {
    }

    /* JADX INFO: renamed from: selectTab$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\f\u0010\r"}, d2 = {"LselectTab$b;", "", "<init>", "()V", "Lcom/bpjstku/util/constant/MembershipType;", "p0", "Lcom/bpjstku/util/constant/Citizenship;", "p1", "Lkotlin/Function1;", "", "p2", "LselectTab;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/bpjstku/util/constant/MembershipType;Lcom/bpjstku/util/constant/Citizenship;Lkotlin/jvm/functions/Function1;)LselectTab;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static selectTab TuitionPaymentFragmentspecialinlinedviewModeldefault3(MembershipType p0, Citizenship p1, Function1<? super MembershipType, Unit> p2) {
            Intrinsics.checkNotNullParameter(p2, "");
            selectTab selecttab = new selectTab();
            selecttab.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = p2;
            Bundle bundle = new Bundle();
            bundle.putParcelable("membership_type", p0);
            bundle.putParcelable("citizenship", p1);
            selecttab.setArguments(bundle);
            return selecttab;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentChooseSegmentBottomSheetBinding fragmentChooseSegmentBottomSheetBindingInflate = FragmentChooseSegmentBottomSheetBinding.inflate(getLayoutInflater(), p1, false);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = fragmentChooseSegmentBottomSheetBindingInflate;
        if (fragmentChooseSegmentBottomSheetBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentChooseSegmentBottomSheetBindingInflate = null;
        }
        FrameLayout root = fragmentChooseSegmentBottomSheetBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        Bundle arguments = getArguments();
        this.b = arguments != null ? (MembershipType) arguments.getParcelable("membership_type") : null;
        Bundle arguments2 = getArguments();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = arguments2 != null ? (Citizenship) arguments2.getParcelable("citizenship") : null;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void g() {
        Citizenship citizenship = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        FragmentChooseSegmentBottomSheetBinding fragmentChooseSegmentBottomSheetBinding = null;
        if (Intrinsics.areEqual(citizenship != null ? citizenship.name() : null, "WNA")) {
            FragmentChooseSegmentBottomSheetBinding fragmentChooseSegmentBottomSheetBinding2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (fragmentChooseSegmentBottomSheetBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                fragmentChooseSegmentBottomSheetBinding2 = null;
            }
            fragmentChooseSegmentBottomSheetBinding2.rbBPUSegment.setVisibility(8);
            FragmentChooseSegmentBottomSheetBinding fragmentChooseSegmentBottomSheetBinding3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (fragmentChooseSegmentBottomSheetBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                fragmentChooseSegmentBottomSheetBinding = fragmentChooseSegmentBottomSheetBinding3;
            }
            fragmentChooseSegmentBottomSheetBinding.rbPMISegment.setVisibility(8);
            return;
        }
        FragmentChooseSegmentBottomSheetBinding fragmentChooseSegmentBottomSheetBinding4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (fragmentChooseSegmentBottomSheetBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentChooseSegmentBottomSheetBinding4 = null;
        }
        fragmentChooseSegmentBottomSheetBinding4.rbBPUSegment.setVisibility(0);
        FragmentChooseSegmentBottomSheetBinding fragmentChooseSegmentBottomSheetBinding5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (fragmentChooseSegmentBottomSheetBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            fragmentChooseSegmentBottomSheetBinding = fragmentChooseSegmentBottomSheetBinding5;
        }
        fragmentChooseSegmentBottomSheetBinding.rbPMISegment.setVisibility(0);
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        FragmentChooseSegmentBottomSheetBinding fragmentChooseSegmentBottomSheetBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (fragmentChooseSegmentBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentChooseSegmentBottomSheetBinding = null;
        }
        Button button = fragmentChooseSegmentBottomSheetBinding.btnApply;
        Intrinsics.checkNotNullExpressionValue(button, "");
        button.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: setCustomView
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return selectTab.TuitionPaymentFragmentbindingInflater1(this.b, (View) obj);
            }
        }));
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void d() {
        MembershipType membershipType = this.b;
        if (membershipType != null) {
            int i = membershipType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[membershipType.ordinal()];
            FragmentChooseSegmentBottomSheetBinding fragmentChooseSegmentBottomSheetBinding = null;
            if (i == 1) {
                FragmentChooseSegmentBottomSheetBinding fragmentChooseSegmentBottomSheetBinding2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (fragmentChooseSegmentBottomSheetBinding2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    fragmentChooseSegmentBottomSheetBinding = fragmentChooseSegmentBottomSheetBinding2;
                }
                fragmentChooseSegmentBottomSheetBinding.rbPUSegment.setChecked(true);
                return;
            }
            if (i == 2) {
                FragmentChooseSegmentBottomSheetBinding fragmentChooseSegmentBottomSheetBinding3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (fragmentChooseSegmentBottomSheetBinding3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    fragmentChooseSegmentBottomSheetBinding = fragmentChooseSegmentBottomSheetBinding3;
                }
                fragmentChooseSegmentBottomSheetBinding.rbBPUSegment.setChecked(true);
                return;
            }
            FragmentChooseSegmentBottomSheetBinding fragmentChooseSegmentBottomSheetBinding4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (fragmentChooseSegmentBottomSheetBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                fragmentChooseSegmentBottomSheetBinding = fragmentChooseSegmentBottomSheetBinding4;
            }
            fragmentChooseSegmentBottomSheetBinding.rbPMISegment.setChecked(true);
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(selectTab selecttab, View view) {
        MembershipType membershipType;
        Intrinsics.checkNotNullParameter(view, "");
        FragmentChooseSegmentBottomSheetBinding fragmentChooseSegmentBottomSheetBinding = selecttab.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Function1<? super MembershipType, Unit> function1 = null;
        if (fragmentChooseSegmentBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentChooseSegmentBottomSheetBinding = null;
        }
        int checkedRadioButtonId = fragmentChooseSegmentBottomSheetBinding.rgChooseSegment.getCheckedRadioButtonId();
        FragmentChooseSegmentBottomSheetBinding fragmentChooseSegmentBottomSheetBinding2 = selecttab.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (fragmentChooseSegmentBottomSheetBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentChooseSegmentBottomSheetBinding2 = null;
        }
        if (checkedRadioButtonId == fragmentChooseSegmentBottomSheetBinding2.rbBPUSegment.getId()) {
            membershipType = MembershipType.BPU;
        } else {
            FragmentChooseSegmentBottomSheetBinding fragmentChooseSegmentBottomSheetBinding3 = selecttab.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (fragmentChooseSegmentBottomSheetBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                fragmentChooseSegmentBottomSheetBinding3 = null;
            }
            membershipType = checkedRadioButtonId == fragmentChooseSegmentBottomSheetBinding3.rbPUSegment.getId() ? MembershipType.PU : MembershipType.PMI;
        }
        selecttab.b = membershipType;
        Function1<? super MembershipType, Unit> function2 = selecttab.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (function2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            function1 = function2;
        }
        function1.invoke(selecttab.b);
        selecttab.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }
}
