package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.databinding.ItemTrackingComplaintBinding;
import com.bpjstku.domain.complaint.model.TrackingComplaint;
import com.github.vipulasri.timelineview.TimelineView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0010B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"LsetDither;", "LsetVirtualCameraRotationDegrees;", "Lcom/bpjstku/domain/complaint/model/TrackingComplaint;", "LsetDither$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "Landroid/content/Context;", "p0", "", "p1", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "Landroid/view/ViewGroup;", "", "TuitionPaymentFragmentbindingInflater1", "(Landroid/view/ViewGroup;)LsetDither$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "getItemViewType", "(I)I", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class setDither extends setVirtualCameraRotationDegrees<TrackingComplaint, TuitionPaymentFragmentspecialinlinedviewModeldefault2> {
    @Override // defpackage.setVirtualCameraRotationDegrees
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final /* synthetic */ VirtualCameraInfo onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentbindingInflater1(viewGroup);
    }

    @Override // defpackage.setVirtualCameraRotationDegrees, androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentbindingInflater1(viewGroup);
    }

    public /* synthetic */ setDither(Context context, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new ArrayList() : arrayList);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setDither(Context context, List<TrackingComplaint> list) {
        super(context, list);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
    }

    public final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends VirtualCameraInfo<TrackingComplaint> {
        private final ItemTrackingComplaintBinding TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private /* synthetic */ setDither b;

        /* JADX WARN: Illegal instructions before constructor call */
        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(setDither setdither, ItemTrackingComplaintBinding itemTrackingComplaintBinding, setVirtualCameraRotationDegrees.b bVar, setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            Intrinsics.checkNotNullParameter(itemTrackingComplaintBinding, "");
            this.b = setdither;
            Context context = setdither.asBinder;
            Intrinsics.checkNotNullExpressionValue(context, "");
            ConstraintLayout root = itemTrackingComplaintBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(context, root, null, null);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = itemTrackingComplaintBinding;
        }

        @Override // defpackage.VirtualCameraInfo
        public final /* bridge */ /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(TrackingComplaint trackingComplaint) {
            TrackingComplaint trackingComplaint2 = trackingComplaint;
            Intrinsics.checkNotNullParameter(trackingComplaint2, "");
            ItemTrackingComplaintBinding itemTrackingComplaintBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            itemTrackingComplaintBinding.timeline.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getItemViewType());
            itemTrackingComplaintBinding.tvEventName.setText(trackingComplaint2.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            itemTrackingComplaintBinding.tvEventDateTime.setText(trackingComplaint2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            String str = trackingComplaint2.TuitionPaymentFragmentbindingInflater1;
            if (str == null || StringsKt.isBlank(str)) {
                itemTrackingComplaintBinding.timeline.setMarker(ContextCompat.getDrawable(itemTrackingComplaintBinding.getRoot().getContext(), R.drawable.bg_circle_grey));
            } else {
                itemTrackingComplaintBinding.timeline.setMarker(ContextCompat.getDrawable(itemTrackingComplaintBinding.getRoot().getContext(), R.drawable.ic_success_small));
            }
            TextViewCompat.setTextAppearance(itemTrackingComplaintBinding.tvEventName, R.style.BpjstkuTextViewPoppins);
            itemTrackingComplaintBinding.tvEventName.setTextColor(ContextCompat.getColor(itemTrackingComplaintBinding.getRoot().getContext(), R.color.colorCharcoalGrey));
            itemTrackingComplaintBinding.tvEventName.setTypeface(itemTrackingComplaintBinding.tvEventName.getTypeface(), 1);
        }
    }

    private TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentbindingInflater1(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ItemTrackingComplaintBinding itemTrackingComplaintBindingInflate = ItemTrackingComplaintBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(itemTrackingComplaintBindingInflate, "");
        setVirtualCameraRotationDegrees.b bVar = this.f1400a;
        setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.asInterface;
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, itemTrackingComplaintBindingInflate, null, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int p0) {
        return TimelineView.b(p0, getItemCount());
    }
}
