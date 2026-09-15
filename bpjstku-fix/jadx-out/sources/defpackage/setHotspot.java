package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.databinding.ItemComplaintHistoryBinding;
import com.bpjstku.domain.complaint.model.ComplaintHistory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0013B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011"}, d2 = {"LsetHotspot;", "LsetVirtualCameraRotationDegrees;", "Lcom/bpjstku/domain/complaint/model/ComplaintHistory;", "LsetHotspot$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "Landroid/content/Context;", "p0", "", "p1", "Lkotlin/Function1;", "", "p2", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/view/ViewGroup;)LsetHotspot$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class setHotspot extends setVirtualCameraRotationDegrees<ComplaintHistory, TuitionPaymentFragmentspecialinlinedviewModeldefault3> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    final Function1<ComplaintHistory, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    @Override // defpackage.setVirtualCameraRotationDegrees
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final /* bridge */ /* synthetic */ VirtualCameraInfo onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(viewGroup);
    }

    @Override // defpackage.setVirtualCameraRotationDegrees, androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(viewGroup);
    }

    public /* synthetic */ setHotspot(Context context, ArrayList arrayList, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new ArrayList() : arrayList, (i & 4) != 0 ? null : function1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public setHotspot(Context context, List<ComplaintHistory> list, Function1<? super ComplaintHistory, Unit> function1) {
        super(context, list);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function1;
    }

    public final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends VirtualCameraInfo<ComplaintHistory> {
        private final ItemComplaintHistoryBinding TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private /* synthetic */ setHotspot TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX WARN: Illegal instructions before constructor call */
        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(setHotspot sethotspot, ItemComplaintHistoryBinding itemComplaintHistoryBinding, setVirtualCameraRotationDegrees.b bVar, setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            Intrinsics.checkNotNullParameter(itemComplaintHistoryBinding, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = sethotspot;
            Context context = sethotspot.asBinder;
            Intrinsics.checkNotNullExpressionValue(context, "");
            ConstraintLayout root = itemComplaintHistoryBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(context, root, null, null);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = itemComplaintHistoryBinding;
        }

        @Override // defpackage.VirtualCameraInfo
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ComplaintHistory complaintHistory) {
            final ComplaintHistory complaintHistory2 = complaintHistory;
            Intrinsics.checkNotNullParameter(complaintHistory2, "");
            ItemComplaintHistoryBinding itemComplaintHistoryBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            final setHotspot sethotspot = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            String str = complaintHistory2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (Intrinsics.areEqual(str, "P01")) {
                itemComplaintHistoryBinding.tvTitleComplaintHistory.setText(itemComplaintHistoryBinding.getRoot().getResources().getString(R.string.label_item_pdts));
                itemComplaintHistoryBinding.imgComplaintHistory.setImageResource(R.drawable.ic_icon_invalid_data);
            } else if (Intrinsics.areEqual(str, "P02")) {
                itemComplaintHistoryBinding.tvTitleComplaintHistory.setText(itemComplaintHistoryBinding.getRoot().getResources().getString(R.string.label_item_ppbt));
                itemComplaintHistoryBinding.imgComplaintHistory.setImageResource(R.drawable.ic_icon_nonreg_company);
            }
            itemComplaintHistoryBinding.tvComplaintDate.setText(complaintHistory2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            itemComplaintHistoryBinding.containerComplaintHistoryItem.setOnClickListener(new View.OnClickListener() { // from class: setCurrentIndex
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    setHotspot.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sethotspot, complaintHistory2, view);
                }
            });
        }

        public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(setHotspot sethotspot, ComplaintHistory complaintHistory, View view) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
            try {
                Function1<ComplaintHistory, Unit> function1 = sethotspot.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (function1 != null) {
                    function1.invoke(complaintHistory);
                }
            } finally {
                ViewPortBuilder.b();
            }
        }
    }

    private TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault1(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ItemComplaintHistoryBinding itemComplaintHistoryBindingInflate = ItemComplaintHistoryBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(itemComplaintHistoryBindingInflate, "");
        setVirtualCameraRotationDegrees.b bVar = this.f1400a;
        setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.asInterface;
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, itemComplaintHistoryBindingInflate, null, null);
    }
}
