package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.databinding.ItemJpnSimulationResultTableBinding;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0012\u00060\u0004R\u00020\u00000\u0001:\u0001\u000fB+\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u00060\u0004R\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\fH\u0017¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R&\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"LgetSelectedAvailableCameraIds;", "LsetVirtualCameraRotationDegrees;", "Lkotlin/Pair;", "", "LgetSelectedAvailableCameraIds$TuitionPaymentFragmentbindingInflater1;", "Landroid/content/Context;", "p0", "", "p1", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "Landroid/view/ViewGroup;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/view/ViewGroup;)LgetSelectedAvailableCameraIds$TuitionPaymentFragmentbindingInflater1;", "TuitionPaymentFragmentbindingInflater1", "Landroid/content/Context;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "b", "Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class getSelectedAvailableCameraIds extends setVirtualCameraRotationDegrees<Pair<? extends String, ? extends String>, TuitionPaymentFragmentbindingInflater1> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Context TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final List<Pair<String, String>> b;

    @Override // defpackage.setVirtualCameraRotationDegrees
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final /* synthetic */ VirtualCameraInfo onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(viewGroup);
    }

    @Override // defpackage.setVirtualCameraRotationDegrees, androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(viewGroup);
    }

    public /* synthetic */ getSelectedAvailableCameraIds(Context context, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new ArrayList() : arrayList);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getSelectedAvailableCameraIds(Context context, List<Pair<String, String>> list) {
        super(context, list);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = context;
        this.b = list;
    }

    private TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault2(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ItemJpnSimulationResultTableBinding itemJpnSimulationResultTableBindingInflate = ItemJpnSimulationResultTableBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(itemJpnSimulationResultTableBindingInflate, "");
        setVirtualCameraRotationDegrees.b bVar = this.f1400a;
        setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.asInterface;
        return new TuitionPaymentFragmentbindingInflater1(this, itemJpnSimulationResultTableBindingInflate, null, null);
    }

    public final class TuitionPaymentFragmentbindingInflater1 extends VirtualCameraInfo<Pair<? extends String, ? extends String>> {
        private final ItemJpnSimulationResultTableBinding TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private /* synthetic */ getSelectedAvailableCameraIds b;

        /* JADX WARN: Illegal instructions before constructor call */
        public TuitionPaymentFragmentbindingInflater1(getSelectedAvailableCameraIds getselectedavailablecameraids, ItemJpnSimulationResultTableBinding itemJpnSimulationResultTableBinding, setVirtualCameraRotationDegrees.b bVar, setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            Intrinsics.checkNotNullParameter(itemJpnSimulationResultTableBinding, "");
            this.b = getselectedavailablecameraids;
            Context context = getselectedavailablecameraids.asBinder;
            Intrinsics.checkNotNullExpressionValue(context, "");
            LinearLayout root = itemJpnSimulationResultTableBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(context, root, null, null);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = itemJpnSimulationResultTableBinding;
        }

        @Override // defpackage.VirtualCameraInfo
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Pair<? extends String, ? extends String> pair) {
            Drawable drawable;
            Pair<? extends String, ? extends String> pair2 = pair;
            Intrinsics.checkNotNullParameter(pair2, "");
            View view = this.itemView;
            if (getAdapterPosition() % 2 == 0) {
                drawable = view.getContext().getResources().getDrawable(R.color.colorPaleGreyFour);
            } else {
                drawable = view.getContext().getResources().getDrawable(R.color.colorWhite);
            }
            view.setBackground(drawable);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.tvLabel.setText(pair2.getFirst());
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.tvValue.setText(pair2.getSecond());
        }
    }
}
