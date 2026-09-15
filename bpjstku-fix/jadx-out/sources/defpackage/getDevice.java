package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentProgramBenefitBinding;
import com.bpjstku.domain.programinfo.model.BenefitItem;
import com.bpjstku.domain.programinfo.model.BenefitProgram;
import com.bpjstku.domain.programinfo.model.ProgramAttribute;
import com.bpjstku.presentation.program.ProgramBenefitFragment$bindingInflater$1;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0015\u0010\u0013\u001a\u00020\u00108CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\r\u001a\u00020\u00148\u0015X\u0095D¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R.\u0010\u0011\u001a\u001c\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00020\u00188UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"LgetDevice;", "LAutoValue_CameraState_StateError;", "Lcom/bpjstku/databinding/FragmentProgramBenefitBinding;", "<init>", "()V", "", "b_", "cancelAll", "onTransact", "g", "cancel", "INotificationSideChannel", "Lcom/bpjstku/domain/programinfo/model/ProgramAttribute;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lcom/bpjstku/domain/programinfo/model/ProgramAttribute;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LgetFlashState;", "b", "Lkotlin/Lazy;", "TuitionPaymentFragmentbindingInflater1", "", "I", "asBinder", "()I", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()Lkotlin/jvm/functions/Function3;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class getDevice extends AutoValue_CameraState_StateError<FragmentProgramBenefitBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private ProgramAttribute TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0() { // from class: getBrand
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return getDevice.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = R.layout.fragment_program_benefit;

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void b_() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
    }

    /* JADX INFO: renamed from: getDevice$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LgetDevice$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Lcom/bpjstku/domain/programinfo/model/ProgramAttribute;", "p0", "LgetDevice;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lcom/bpjstku/domain/programinfo/model/ProgramAttribute;)LgetDevice;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static getDevice TuitionPaymentFragmentspecialinlinedviewModeldefault1(ProgramAttribute p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            getDevice getdevice = new getDevice();
            Bundle bundle = new Bundle();
            bundle.putParcelable("program_attribute", p0);
            getdevice.setArguments(bundle);
            return getdevice;
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
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentProgramBenefitBinding> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return ProgramBenefitFragment$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
        Bundle arguments = getArguments();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = arguments != null ? (ProgramAttribute) arguments.getParcelable("program_attribute") : null;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        RecyclerView recyclerView = asInterface().rvBenefits;
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setAdapter((getFlashState) this.TuitionPaymentFragmentbindingInflater1.getValue());
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
        List<BenefitProgram> list;
        BenefitProgram benefitProgram;
        ProgramAttribute programAttribute = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        List<BenefitItem> list2 = null;
        List<BenefitProgram> list3 = programAttribute != null ? programAttribute.benefits : null;
        if (list3 == null || list3.isEmpty()) {
            getDevice getdevice = this;
            Function0 function0 = new Function0() { // from class: getModel
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return getDevice.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1);
                }
            };
            Intrinsics.checkNotNullParameter(getdevice, "");
            Intrinsics.checkNotNullParameter("Data tidak tersedia", "");
            BaseActivity baseActivity = (BaseActivity) getdevice.getContext();
            if (baseActivity != null) {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, "Data tidak tersedia", function0);
                return;
            }
            return;
        }
        getFlashState getflashstate = (getFlashState) this.TuitionPaymentFragmentbindingInflater1.getValue();
        ProgramAttribute programAttribute2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (programAttribute2 != null && (list = programAttribute2.benefits) != null && (benefitProgram = list.get(0)) != null) {
            list2 = benefitProgram.benefitItems;
        }
        getflashstate.TuitionPaymentFragmentspecialinlinedviewModeldefault1(list2);
    }

    public static /* synthetic */ getFlashState TuitionPaymentFragmentbindingInflater1(getDevice getdevice) {
        Context contextRequireContext = getdevice.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new getFlashState(contextRequireContext, new ArrayList());
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(getDevice getdevice) {
        BaseActivity baseActivity = getdevice.TuitionPaymentFragmentbindingInflater1;
        if (baseActivity != null) {
            baseActivity.d_();
        }
        return Unit.INSTANCE;
    }
}
