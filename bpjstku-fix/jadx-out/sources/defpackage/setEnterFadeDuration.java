package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
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
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0013B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"LsetEnterFadeDuration;", "LsetVirtualCameraRotationDegrees;", "Lcom/bpjstku/domain/complaint/model/TrackingComplaint;", "LsetEnterFadeDuration$b;", "Landroid/content/Context;", "p0", "", "p1", "Lkotlin/Function1;", "", "p2", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "", "TuitionPaymentFragmentbindingInflater1", "(Landroid/view/ViewGroup;)LsetEnterFadeDuration$b;", "getItemViewType", "(I)I", "b", "Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class setEnterFadeDuration extends setVirtualCameraRotationDegrees<TrackingComplaint, b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    final Function1<TrackingComplaint, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    @Override // defpackage.setVirtualCameraRotationDegrees
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final /* synthetic */ VirtualCameraInfo onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentbindingInflater1(viewGroup);
    }

    @Override // defpackage.setVirtualCameraRotationDegrees, androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentbindingInflater1(viewGroup);
    }

    public /* synthetic */ setEnterFadeDuration(Context context, ArrayList arrayList, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new ArrayList() : arrayList, (i & 4) != 0 ? null : function1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public setEnterFadeDuration(Context context, List<TrackingComplaint> list, Function1<? super TrackingComplaint, Unit> function1) {
        super(context, list);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function1;
    }

    public final class b extends VirtualCameraInfo<TrackingComplaint> {
        private /* synthetic */ setEnterFadeDuration TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private final ItemTrackingComplaintBinding TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(setEnterFadeDuration setenterfadeduration, ItemTrackingComplaintBinding itemTrackingComplaintBinding, setVirtualCameraRotationDegrees.b bVar, setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            Intrinsics.checkNotNullParameter(itemTrackingComplaintBinding, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = setenterfadeduration;
            Context context = setenterfadeduration.asBinder;
            Intrinsics.checkNotNullExpressionValue(context, "");
            ConstraintLayout root = itemTrackingComplaintBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(context, root, null, null);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = itemTrackingComplaintBinding;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x00ff  */
        @Override // defpackage.VirtualCameraInfo
        public final /* bridge */ /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(TrackingComplaint trackingComplaint) {
            final TrackingComplaint trackingComplaint2 = trackingComplaint;
            Intrinsics.checkNotNullParameter(trackingComplaint2, "");
            ItemTrackingComplaintBinding itemTrackingComplaintBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            final setEnterFadeDuration setenterfadeduration = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            itemTrackingComplaintBinding.timeline.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getItemViewType());
            itemTrackingComplaintBinding.tvEventName.setText(trackingComplaint2.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            itemTrackingComplaintBinding.tvEventDateTime.setText(trackingComplaint2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            String str = trackingComplaint2.TuitionPaymentFragmentbindingInflater1;
            if (str != null) {
                int iHashCode = str.hashCode();
                if (iHashCode != -1926471020) {
                    if (iHashCode != -1904326730) {
                        if (iHashCode == -1598869360 && str.equals("SELESAI")) {
                            itemTrackingComplaintBinding.timeline.setMarker(ContextCompat.getDrawable(itemTrackingComplaintBinding.getRoot().getContext(), R.drawable.ic_success_small));
                            TextViewCompat.setTextAppearance(itemTrackingComplaintBinding.tvEventName, R.style.BpjstkuTextViewPoppins);
                            itemTrackingComplaintBinding.tvEventName.setTextColor(ContextCompat.getColor(itemTrackingComplaintBinding.getRoot().getContext(), R.color.colorCharcoalGrey));
                            itemTrackingComplaintBinding.tvEventName.setTypeface(itemTrackingComplaintBinding.tvEventName.getTypeface(), 1);
                        } else {
                            itemTrackingComplaintBinding.timeline.setMarker(ContextCompat.getDrawable(itemTrackingComplaintBinding.getRoot().getContext(), R.drawable.bg_circle_grey));
                        }
                    } else if (str.equals("DITOLAK")) {
                        itemTrackingComplaintBinding.timeline.setMarker(ContextCompat.getDrawable(itemTrackingComplaintBinding.getRoot().getContext(), R.drawable.ic_failed));
                        TextViewCompat.setTextAppearance(itemTrackingComplaintBinding.tvEventName, R.style.BpjstkuTextViewPoppins);
                        itemTrackingComplaintBinding.tvEventName.setTextColor(ContextCompat.getColor(itemTrackingComplaintBinding.getRoot().getContext(), R.color.colorCharcoalGrey));
                        itemTrackingComplaintBinding.tvEventName.setTypeface(itemTrackingComplaintBinding.tvEventName.getTypeface(), 1);
                    } else {
                        itemTrackingComplaintBinding.timeline.setMarker(ContextCompat.getDrawable(itemTrackingComplaintBinding.getRoot().getContext(), R.drawable.bg_circle_grey));
                    }
                } else if (str.equals("PROSES")) {
                    itemTrackingComplaintBinding.timeline.setMarker(ContextCompat.getDrawable(itemTrackingComplaintBinding.getRoot().getContext(), R.drawable.bg_circle_azul));
                    TextViewCompat.setTextAppearance(itemTrackingComplaintBinding.tvEventName, R.style.BpjstkuTextViewPoppins);
                    itemTrackingComplaintBinding.tvEventName.setTextColor(ContextCompat.getColor(itemTrackingComplaintBinding.getRoot().getContext(), R.color.colorCharcoalGrey));
                    itemTrackingComplaintBinding.tvEventName.setTypeface(itemTrackingComplaintBinding.tvEventName.getTypeface(), 1);
                } else {
                    itemTrackingComplaintBinding.timeline.setMarker(ContextCompat.getDrawable(itemTrackingComplaintBinding.getRoot().getContext(), R.drawable.bg_circle_grey));
                }
            } else {
                itemTrackingComplaintBinding.timeline.setMarker(ContextCompat.getDrawable(itemTrackingComplaintBinding.getRoot().getContext(), R.drawable.bg_circle_grey));
            }
            if (trackingComplaint2.b != null) {
                itemTrackingComplaintBinding.tvStatus.setVisibility(0);
            } else {
                itemTrackingComplaintBinding.tvStatus.setVisibility(8);
            }
            String str2 = trackingComplaint2.TuitionPaymentFragmentbindingInflater1;
            Intrinsics.checkNotNull(str2);
            if (str2.length() == 0) {
                itemTrackingComplaintBinding.tvStatus.setVisibility(8);
            }
            itemTrackingComplaintBinding.tvStatus.setOnClickListener(new View.OnClickListener() { // from class: setExitFadeDuration
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    setEnterFadeDuration.b.TuitionPaymentFragmentbindingInflater1(setenterfadeduration, trackingComplaint2, view);
                }
            });
        }

        public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(setEnterFadeDuration setenterfadeduration, TrackingComplaint trackingComplaint, View view) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
            try {
                Function1<TrackingComplaint, Unit> function1 = setenterfadeduration.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (function1 != null) {
                    function1.invoke(trackingComplaint);
                }
            } finally {
                ViewPortBuilder.b();
            }
        }
    }

    private b TuitionPaymentFragmentbindingInflater1(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ItemTrackingComplaintBinding itemTrackingComplaintBindingInflate = ItemTrackingComplaintBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(itemTrackingComplaintBindingInflate, "");
        setVirtualCameraRotationDegrees.b bVar = this.f1400a;
        setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.asInterface;
        return new b(this, itemTrackingComplaintBindingInflate, null, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int p0) {
        return TimelineView.b(p0, getItemCount());
    }
}
