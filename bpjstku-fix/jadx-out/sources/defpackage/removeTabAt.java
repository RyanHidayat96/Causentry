package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentChooseCitizenshipBottomSheetBinding;
import com.bpjstku.util.constant.Citizenship;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0012\u0010\u0003R$\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\r0\u00138\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u000e\u001a\u00020\u00198\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u000e\u0010\u001aR\u0014\u0010\u0012\u001a\u00020\u001b8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001c"}, d2 = {"LremoveTabAt;", "LunregisterMediaButtonEventReceiver;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "b", "Lkotlin/Function1;", "Lcom/bpjstku/util/constant/Citizenship;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lcom/bpjstku/util/constant/Citizenship;", "Lcom/bpjstku/databinding/FragmentChooseCitizenshipBottomSheetBinding;", "Lcom/bpjstku/databinding/FragmentChooseCitizenshipBottomSheetBinding;", "", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class removeTabAt extends unregisterMediaButtonEventReceiver {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private Function1<? super Citizenship, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private FragmentChooseCitizenshipBottomSheetBinding TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private Citizenship TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Citizenship.values().length];
            try {
                iArr[Citizenship.WNI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
    public final int getD() {
        return R.layout.fragment_choose_citizenship_bottom_sheet;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void b() {
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void g() {
    }

    /* JADX INFO: renamed from: removeTabAt$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"LremoveTabAt$b;", "", "<init>", "()V", "Lcom/bpjstku/util/constant/Citizenship;", "p0", "Lkotlin/Function1;", "", "p1", "LremoveTabAt;", "b", "(Lcom/bpjstku/util/constant/Citizenship;Lkotlin/jvm/functions/Function1;)LremoveTabAt;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static removeTabAt b(Citizenship p0, Function1<? super Citizenship, Unit> p1) {
            Intrinsics.checkNotNullParameter(p1, "");
            removeTabAt removetabat = new removeTabAt();
            Bundle bundle = new Bundle();
            bundle.putParcelable("citizenship", p0);
            removetabat.setArguments(bundle);
            removetabat.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = p1;
            return removetabat;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentChooseCitizenshipBottomSheetBinding fragmentChooseCitizenshipBottomSheetBindingInflate = FragmentChooseCitizenshipBottomSheetBinding.inflate(p0, p1, false);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = fragmentChooseCitizenshipBottomSheetBindingInflate;
        if (fragmentChooseCitizenshipBottomSheetBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentChooseCitizenshipBottomSheetBindingInflate = null;
        }
        FrameLayout root = fragmentChooseCitizenshipBottomSheetBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        Bundle arguments = getArguments();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = arguments != null ? (Citizenship) arguments.getParcelable("citizenship") : null;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        FragmentChooseCitizenshipBottomSheetBinding fragmentChooseCitizenshipBottomSheetBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (fragmentChooseCitizenshipBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentChooseCitizenshipBottomSheetBinding = null;
        }
        Button button = fragmentChooseCitizenshipBottomSheetBinding.btnApply;
        Intrinsics.checkNotNullExpressionValue(button, "");
        button.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: requestFocus
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return removeTabAt.TuitionPaymentFragmentbindingInflater1(this.b, (View) obj);
            }
        }));
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void d() {
        Citizenship citizenship = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (citizenship != null) {
            FragmentChooseCitizenshipBottomSheetBinding fragmentChooseCitizenshipBottomSheetBinding = null;
            if ((citizenship == null ? -1 : WhenMappings.$EnumSwitchMapping$0[citizenship.ordinal()]) == 1) {
                FragmentChooseCitizenshipBottomSheetBinding fragmentChooseCitizenshipBottomSheetBinding2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (fragmentChooseCitizenshipBottomSheetBinding2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    fragmentChooseCitizenshipBottomSheetBinding = fragmentChooseCitizenshipBottomSheetBinding2;
                }
                fragmentChooseCitizenshipBottomSheetBinding.rbWniSegment.setChecked(true);
                return;
            }
            FragmentChooseCitizenshipBottomSheetBinding fragmentChooseCitizenshipBottomSheetBinding3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (fragmentChooseCitizenshipBottomSheetBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                fragmentChooseCitizenshipBottomSheetBinding = fragmentChooseCitizenshipBottomSheetBinding3;
            }
            fragmentChooseCitizenshipBottomSheetBinding.rbWnaSegment.setChecked(true);
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(removeTabAt removetabat, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        FragmentChooseCitizenshipBottomSheetBinding fragmentChooseCitizenshipBottomSheetBinding = removetabat.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Function1<? super Citizenship, Unit> function1 = null;
        if (fragmentChooseCitizenshipBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentChooseCitizenshipBottomSheetBinding = null;
        }
        int checkedRadioButtonId = fragmentChooseCitizenshipBottomSheetBinding.rgChooseCitizenship.getCheckedRadioButtonId();
        FragmentChooseCitizenshipBottomSheetBinding fragmentChooseCitizenshipBottomSheetBinding2 = removetabat.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (fragmentChooseCitizenshipBottomSheetBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentChooseCitizenshipBottomSheetBinding2 = null;
        }
        removetabat.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = checkedRadioButtonId == fragmentChooseCitizenshipBottomSheetBinding2.rbWniSegment.getId() ? Citizenship.WNI : Citizenship.WNA;
        Function1<? super Citizenship, Unit> function2 = removetabat.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (function2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            function1 = function2;
        }
        function1.invoke(removetabat.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        removetabat.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }
}
