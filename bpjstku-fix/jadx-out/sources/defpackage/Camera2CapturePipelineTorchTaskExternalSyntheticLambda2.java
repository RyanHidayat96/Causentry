package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.databinding.ItemClaimTrackingOldDaySecurityBinding;
import com.github.vipulasri.timelineview.TimelineView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\fB\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"LCamera2CapturePipelineTorchTaskExternalSyntheticLambda2;", "LsetVirtualCameraRotationDegrees;", "LComponentActivityExternalSyntheticLambda7;", "LCamera2CapturePipelineTorchTaskExternalSyntheticLambda2$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "Landroid/content/Context;", "p0", "", "p1", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "Landroid/view/ViewGroup;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/view/ViewGroup;)LCamera2CapturePipelineTorchTaskExternalSyntheticLambda2$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "getItemViewType", "(I)I", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Landroid/content/Context;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 extends setVirtualCameraRotationDegrees<ComponentActivityExternalSyntheticLambda7, TuitionPaymentFragmentspecialinlinedviewModeldefault3> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Context TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    @Override // defpackage.setVirtualCameraRotationDegrees
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final /* synthetic */ VirtualCameraInfo onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(viewGroup);
    }

    @Override // defpackage.setVirtualCameraRotationDegrees, androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(viewGroup);
    }

    public /* synthetic */ Camera2CapturePipelineTorchTaskExternalSyntheticLambda2(Context context, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new ArrayList() : arrayList);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private Camera2CapturePipelineTorchTaskExternalSyntheticLambda2(Context context, List<ComponentActivityExternalSyntheticLambda7> list) {
        super(context, list);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = context;
    }

    private TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault3(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ItemClaimTrackingOldDaySecurityBinding itemClaimTrackingOldDaySecurityBindingInflate = ItemClaimTrackingOldDaySecurityBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(itemClaimTrackingOldDaySecurityBindingInflate, "");
        setVirtualCameraRotationDegrees.b bVar = this.f1400a;
        setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.asInterface;
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, itemClaimTrackingOldDaySecurityBindingInflate, null, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int p0) {
        return TimelineView.b(p0, getItemCount());
    }

    public final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends VirtualCameraInfo<ComponentActivityExternalSyntheticLambda7> {
        private final ItemClaimTrackingOldDaySecurityBinding TuitionPaymentFragmentbindingInflater1;
        private /* synthetic */ Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX WARN: Illegal instructions before constructor call */
        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, ItemClaimTrackingOldDaySecurityBinding itemClaimTrackingOldDaySecurityBinding, setVirtualCameraRotationDegrees.b bVar, setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            Intrinsics.checkNotNullParameter(itemClaimTrackingOldDaySecurityBinding, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
            Context context = camera2CapturePipelineTorchTaskExternalSyntheticLambda2.asBinder;
            Intrinsics.checkNotNullExpressionValue(context, "");
            ConstraintLayout root = itemClaimTrackingOldDaySecurityBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(context, root, null, null);
            this.TuitionPaymentFragmentbindingInflater1 = itemClaimTrackingOldDaySecurityBinding;
        }

        @Override // defpackage.VirtualCameraInfo
        public final /* bridge */ /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ComponentActivityExternalSyntheticLambda7 componentActivityExternalSyntheticLambda7) {
            ComponentActivityExternalSyntheticLambda7 componentActivityExternalSyntheticLambda8 = componentActivityExternalSyntheticLambda7;
            Intrinsics.checkNotNullParameter(componentActivityExternalSyntheticLambda8, "");
            ItemClaimTrackingOldDaySecurityBinding itemClaimTrackingOldDaySecurityBinding = this.TuitionPaymentFragmentbindingInflater1;
            View view = this.itemView;
            itemClaimTrackingOldDaySecurityBinding.timeline.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getItemViewType());
            itemClaimTrackingOldDaySecurityBinding.tvEventName.setText(componentActivityExternalSyntheticLambda8.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            itemClaimTrackingOldDaySecurityBinding.tvEventDateTime.setText(componentActivityExternalSyntheticLambda8.b);
            int i = Camera2CapturePipelineTorchTaskExternalSyntheticLambda2$TuitionPaymentFragmentspecialinlinedviewModeldefault3$TuitionPaymentFragmentspecialinlinedviewModeldefault3$WhenMappings.$EnumSwitchMapping$0[componentActivityExternalSyntheticLambda8.TuitionPaymentFragmentspecialinlinedviewModeldefault3.ordinal()];
            if (i == 1) {
                itemClaimTrackingOldDaySecurityBinding.tvStatus.setText(view.getContext().getString(R.string.label_finished));
                itemClaimTrackingOldDaySecurityBinding.tvStatus.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, view.getContext().getResources().getDrawable(R.drawable.ic_success_small), (Drawable) null, (Drawable) null);
            } else if (i == 2) {
                itemClaimTrackingOldDaySecurityBinding.tvStatus.setText(view.getContext().getString(R.string.label_rejected));
                itemClaimTrackingOldDaySecurityBinding.tvStatus.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, view.getContext().getResources().getDrawable(R.drawable.ic_failed), (Drawable) null, (Drawable) null);
            } else if (i == 3) {
                itemClaimTrackingOldDaySecurityBinding.tvStatus.setText(view.getContext().getString(R.string.label_in_process));
                itemClaimTrackingOldDaySecurityBinding.tvStatus.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, view.getContext().getResources().getDrawable(R.drawable.ic_waiting), (Drawable) null, (Drawable) null);
            } else {
                itemClaimTrackingOldDaySecurityBinding.tvStatus.setText("");
                itemClaimTrackingOldDaySecurityBinding.timeline.setMarker(ContextCompat.getDrawable(view.getContext(), R.drawable.bg_circle_black));
            }
        }
    }
}
