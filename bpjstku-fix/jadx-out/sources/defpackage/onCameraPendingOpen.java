package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.databinding.ItemJpnSimulationResultBinding;
import com.bpjstku.domain.simulation.model.PeriodicDetail;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0011B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"LonCameraPendingOpen;", "LsetVirtualCameraRotationDegrees;", "Lcom/bpjstku/domain/simulation/model/PeriodicDetail;", "LonCameraPendingOpen$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "Landroid/content/Context;", "p0", "", "p1", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "Landroid/view/ViewGroup;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/view/ViewGroup;)LonCameraPendingOpen$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "b", "Landroid/content/Context;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class onCameraPendingOpen extends setVirtualCameraRotationDegrees<PeriodicDetail, TuitionPaymentFragmentspecialinlinedviewModeldefault2> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    final Context TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    @Override // defpackage.setVirtualCameraRotationDegrees
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final /* synthetic */ VirtualCameraInfo onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(viewGroup);
    }

    @Override // defpackage.setVirtualCameraRotationDegrees, androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(viewGroup);
    }

    public /* synthetic */ onCameraPendingOpen(Context context, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new ArrayList() : arrayList);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private onCameraPendingOpen(Context context, List<PeriodicDetail> list) {
        super(context, list);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = context;
    }

    private TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault3(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ItemJpnSimulationResultBinding itemJpnSimulationResultBindingInflate = ItemJpnSimulationResultBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(itemJpnSimulationResultBindingInflate, "");
        setVirtualCameraRotationDegrees.b bVar = this.f1400a;
        setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.asInterface;
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, itemJpnSimulationResultBindingInflate, null, null);
    }

    public final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends VirtualCameraInfo<PeriodicDetail> {
        private final ItemJpnSimulationResultBinding TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private /* synthetic */ onCameraPendingOpen TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX WARN: Illegal instructions before constructor call */
        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(onCameraPendingOpen oncamerapendingopen, ItemJpnSimulationResultBinding itemJpnSimulationResultBinding, setVirtualCameraRotationDegrees.b bVar, setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            Intrinsics.checkNotNullParameter(itemJpnSimulationResultBinding, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = oncamerapendingopen;
            Context context = oncamerapendingopen.asBinder;
            Intrinsics.checkNotNullExpressionValue(context, "");
            ConstraintLayout root = itemJpnSimulationResultBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(context, root, null, null);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = itemJpnSimulationResultBinding;
        }

        @Override // defpackage.VirtualCameraInfo
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(PeriodicDetail periodicDetail) throws ParseException {
            PeriodicDetail periodicDetail2 = periodicDetail;
            Intrinsics.checkNotNullParameter(periodicDetail2, "");
            ItemJpnSimulationResultBinding itemJpnSimulationResultBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            View view = this.itemView;
            TextView textView = itemJpnSimulationResultBinding.tvDateTime;
            String string = view.getContext().getString(R.string.label_month);
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = setSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3(periodicDetail2.TuitionPaymentFragmentspecialinlinedviewModeldefault3, "MM-yyyy", "MMMM yyyy");
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(" : ");
            sb.append(strTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            textView.setText(sb.toString());
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            getSelectedAvailableCameraIds getselectedavailablecameraids = new getSelectedAvailableCameraIds(context, CollectionsKt.listOf((Object[]) new Pair[]{new Pair(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getString(R.string.label_wage), getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(periodicDetail2.asBinder)), new Pair(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getString(R.string.label_inflation), periodicDetail2.TuitionPaymentFragmentbindingInflater1), new Pair(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getString(R.string.label_inflation_index), periodicDetail2.TuitionPaymentFragmentspecialinlinedviewModeldefault1), new Pair(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getString(R.string.label_wage_limit), getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(periodicDetail2.d)), new Pair(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getString(R.string.label_counted), getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(periodicDetail2.b))}));
            RecyclerView recyclerView = itemJpnSimulationResultBinding.rvJpnSimulationResultTable;
            recyclerView.setNestedScrollingEnabled(false);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setHasFixedSize(true);
            recyclerView.setAdapter(getselectedavailablecameraids);
        }
    }
}
