package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentWageAmountBinding;
import com.bpjstku.domain.complaint.model.DetailDataTidakSesuai;
import com.bpjstku.domain.complaint.model.TrackingComplaint;
import com.bpjstku.presentation.complaint.fragment.WageAmountFragment$bindingInflater$1;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004R\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0015\u0010\u0014\u001a\u00020\u00138CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R.\u0010\u001b\u001a\u001c\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00020\u00168UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001aR\u0014\u0010\r\u001a\u00020\u001c8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"LupdateDensity;", "LAutoValue_CameraState_StateError;", "Lcom/bpjstku/databinding/FragmentWageAmountBinding;", "<init>", "()V", "", "g", "cancelAll", "INotificationSideChannel", "cancel", "onTransact", "", "Lcom/bpjstku/domain/complaint/model/TrackingComplaint;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/util/List;", "TuitionPaymentFragmentbindingInflater1", "Lcom/bpjstku/domain/complaint/model/DetailDataTidakSesuai;", "Lcom/bpjstku/domain/complaint/model/DetailDataTidakSesuai;", "b", "LsetEnterFadeDuration;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lkotlin/Lazy;", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "()Lkotlin/jvm/functions/Function3;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "", "asBinder", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class updateDensity extends AutoValue_CameraState_StateError<FragmentWageAmountBinding> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private List<TrackingComplaint> TuitionPaymentFragmentbindingInflater1 = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private DetailDataTidakSesuai b = new DetailDataTidakSesuai(null, null, null, null, null, null, 63, null);
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: DrawableContainerCompatDrawableContainerState
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return updateDensity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1);
        }
    });

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder */
    public final int getWrite() {
        return R.layout.fragment_wage_amount;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
    }

    @Override // defpackage.AutoValue_CameraState_StateError
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentWageAmountBinding> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return WageAmountFragment$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        asInterface().btnDetailComplaint.setOnClickListener(new View.OnClickListener() { // from class: DrawableContainerCompat1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                updateDensity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, view);
            }
        });
        asInterface().btnBack.setOnClickListener(new View.OnClickListener() { // from class: prepareDrawable
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                updateDensity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, view);
            }
        });
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
        Bundle arguments = getArguments();
        this.TuitionPaymentFragmentbindingInflater1 = arguments != null ? arguments.getParcelableArrayList("trackingComplaint") : null;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        RecyclerView recyclerView = asInterface().rvTrackingComplaint;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setAdapter((setEnterFadeDuration) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue());
        FragmentWageAmountBinding fragmentWageAmountBindingAsInterface = asInterface();
        List<TrackingComplaint> list = this.TuitionPaymentFragmentbindingInflater1;
        if (list == null || list.isEmpty()) {
            fragmentWageAmountBindingAsInterface.imgEmpty.setVisibility(0);
            fragmentWageAmountBindingAsInterface.rvTrackingComplaint.setVisibility(8);
            fragmentWageAmountBindingAsInterface.tvEmptyWageComplaint.setVisibility(0);
            fragmentWageAmountBindingAsInterface.tvEmptyWageComplaint.setText("Pengaduan ketidaksesuaian data upah tidak ditemukan");
            return;
        }
        fragmentWageAmountBindingAsInterface.imgEmpty.setVisibility(8);
        fragmentWageAmountBindingAsInterface.tvEmptyWageComplaint.setVisibility(8);
        fragmentWageAmountBindingAsInterface.rvTrackingComplaint.setVisibility(0);
        ((setEnterFadeDuration) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1);
    }

    /* JADX INFO: renamed from: updateDensity$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"LupdateDensity$b;", "", "<init>", "()V", "", "Lcom/bpjstku/domain/complaint/model/TrackingComplaint;", "p0", "LupdateDensity;", "TuitionPaymentFragmentbindingInflater1", "(Ljava/util/List;)LupdateDensity;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static updateDensity TuitionPaymentFragmentbindingInflater1(List<TrackingComplaint> p0) {
            updateDensity updatedensity = new updateDensity();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("trackingComplaint", (ArrayList) p0);
            updatedensity.setArguments(bundle);
            return updatedensity;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ setEnterFadeDuration TuitionPaymentFragmentbindingInflater1(final updateDensity updatedensity) {
        Context contextRequireContext = updatedensity.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new setEnterFadeDuration(contextRequireContext, new ArrayList(), new Function1() { // from class: createAllFutures
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return updateDensity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (TrackingComplaint) obj);
            }
        });
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(updateDensity updatedensity, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            BaseActivity baseActivity = updatedensity.TuitionPaymentFragmentbindingInflater1;
            if (baseActivity != null) {
                baseActivity.d_();
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(updateDensity updatedensity, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            setTintList.Companion companion = setTintList.INSTANCE;
            setTintList settintlistTuitionPaymentFragmentbindingInflater1 = setTintList.Companion.TuitionPaymentFragmentbindingInflater1(updatedensity.b, null, null, 6);
            settintlistTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(Integer.valueOf(updatedensity.getResources().getDisplayMetrics().heightPixels));
            FragmentManager childFragmentManager = updatedensity.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(settintlistTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                settintlistTuitionPaymentFragmentbindingInflater1.show(childFragmentManager, settintlistTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ Unit b(updateDensity updatedensity, TrackingComplaint trackingComplaint) {
        Intrinsics.checkNotNullParameter(trackingComplaint, "");
        unscheduleDrawable.Companion companion = unscheduleDrawable.INSTANCE;
        unscheduleDrawable unscheduledrawableTuitionPaymentFragmentbindingInflater1 = unscheduleDrawable.Companion.TuitionPaymentFragmentbindingInflater1(trackingComplaint.b);
        unscheduledrawableTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(Integer.valueOf(updatedensity.getResources().getDisplayMetrics().heightPixels));
        FragmentManager childFragmentManager = updatedensity.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Intrinsics.checkNotNullParameter(childFragmentManager, "");
        if (childFragmentManager.findFragmentByTag(unscheduledrawableTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            unscheduledrawableTuitionPaymentFragmentbindingInflater1.show(childFragmentManager, unscheduledrawableTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        return Unit.INSTANCE;
    }
}
