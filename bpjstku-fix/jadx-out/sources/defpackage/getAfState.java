package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentTuitionFeeBinding;
import com.bpjstku.domain.programinfo.model.ProgramAttribute;
import com.bpjstku.presentation.program.TuitionFeeFragment$bindingInflater$1;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00108\u0015X\u0095D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R.\u0010\r\u001a\u001c\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00020\u00158UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0019"}, d2 = {"LgetAfState;", "LAutoValue_CameraState_StateError;", "Lcom/bpjstku/databinding/FragmentTuitionFeeBinding;", "<init>", "()V", "", "b_", "cancelAll", "onTransact", "g", "cancel", "INotificationSideChannel", "Lcom/bpjstku/domain/programinfo/model/ProgramAttribute;", "b", "Lcom/bpjstku/domain/programinfo/model/ProgramAttribute;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "I", "asBinder", "()I", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "()Lkotlin/jvm/functions/Function3;", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class getAfState extends AutoValue_CameraState_StateError<FragmentTuitionFeeBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = R.layout.fragment_tuition_fee;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private ProgramAttribute TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void b_() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
    }

    /* JADX INFO: renamed from: getAfState$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LgetAfState$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/bpjstku/domain/programinfo/model/ProgramAttribute;", "p0", "LgetAfState;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/bpjstku/domain/programinfo/model/ProgramAttribute;)LgetAfState;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static getAfState TuitionPaymentFragmentspecialinlinedviewModeldefault3(ProgramAttribute p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            getAfState getafstate = new getAfState();
            Bundle bundle = new Bundle();
            bundle.putParcelable("program_attribute", p0);
            getafstate.setArguments(bundle);
            return getafstate;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder, reason: from getter */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    @Override // defpackage.AutoValue_CameraState_StateError
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentTuitionFeeBinding> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return TuitionFeeFragment$bindingInflater$1.b;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
        Bundle arguments = getArguments();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = arguments != null ? (ProgramAttribute) arguments.getParcelable("program_attribute") : null;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
        ProgramAttribute programAttribute = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (programAttribute != null) {
            FragmentTuitionFeeBinding fragmentTuitionFeeBindingAsInterface = asInterface();
            if (!Intrinsics.areEqual(programAttribute.puTuitionAmount, "")) {
                fragmentTuitionFeeBindingAsInterface.llTuitionPu.setVisibility(0);
                fragmentTuitionFeeBindingAsInterface.tvTuitionPu.setText(programAttribute.puTuitionAmount.toString());
            } else if (Intrinsics.areEqual(programAttribute.puTuitionAmount, "")) {
                fragmentTuitionFeeBindingAsInterface.llTuitionPu.setVisibility(8);
            }
            if (!Intrinsics.areEqual(programAttribute.bpuTuitionAmount, "")) {
                fragmentTuitionFeeBindingAsInterface.llTuitionBpu.setVisibility(0);
                fragmentTuitionFeeBindingAsInterface.tvTuitionBpu.setText(programAttribute.bpuTuitionAmount.toString());
            } else if (Intrinsics.areEqual(programAttribute.bpuTuitionAmount, "")) {
                fragmentTuitionFeeBindingAsInterface.llTuitionBpu.setVisibility(8);
            }
            if (!Intrinsics.areEqual(programAttribute.JakonTuitionAmount, "")) {
                fragmentTuitionFeeBindingAsInterface.llTuitionJakon.setVisibility(0);
                fragmentTuitionFeeBindingAsInterface.tvTuitionJakon.setText(programAttribute.JakonTuitionAmount.toString());
            } else if (Intrinsics.areEqual(programAttribute.JakonTuitionAmount, "")) {
                fragmentTuitionFeeBindingAsInterface.llTuitionJakon.setVisibility(8);
            }
            if (!Intrinsics.areEqual(programAttribute.pmiTuitionAmount, "")) {
                if (programAttribute.pmiTuitionAmount.equals("Rp370 Ribu (Program JKK dan JKM)") || programAttribute.pmiTuitionAmount.equals("Rp370 ribu (Program JKK dan JKM)")) {
                    fragmentTuitionFeeBindingAsInterface.llTuitionPmi.setVisibility(8);
                    return;
                } else {
                    fragmentTuitionFeeBindingAsInterface.llTuitionPmi.setVisibility(0);
                    fragmentTuitionFeeBindingAsInterface.tvTuitionPMI.setText(programAttribute.pmiTuitionAmount);
                    return;
                }
            }
            if (Intrinsics.areEqual(programAttribute.pmiTuitionAmount, "")) {
                fragmentTuitionFeeBindingAsInterface.llTuitionPmi.setVisibility(8);
            }
        }
    }
}
