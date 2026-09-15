package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.databinding.ItemSimulationOldDaySecurityBinding;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u000eB\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\f\u0010\r"}, d2 = {"LremoveSessionCameraCaptureCallback;", "LsetVirtualCameraRotationDegrees;", "LgetDefaultLightScrim;", "LremoveSessionCameraCaptureCallback$b;", "Landroid/content/Context;", "p0", "", "p1", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "Landroid/view/ViewGroup;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/view/ViewGroup;)LremoveSessionCameraCaptureCallback$b;", "b"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class removeSessionCameraCaptureCallback extends setVirtualCameraRotationDegrees<getDefaultLightScrim, b> {
    @Override // defpackage.setVirtualCameraRotationDegrees
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final /* synthetic */ VirtualCameraInfo onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(viewGroup);
    }

    @Override // defpackage.setVirtualCameraRotationDegrees, androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(viewGroup);
    }

    public /* synthetic */ removeSessionCameraCaptureCallback(Context context, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new ArrayList() : arrayList);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public removeSessionCameraCaptureCallback(Context context, List<getDefaultLightScrim> list) {
        super(context, list);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
    }

    private b TuitionPaymentFragmentspecialinlinedviewModeldefault3(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ItemSimulationOldDaySecurityBinding itemSimulationOldDaySecurityBindingInflate = ItemSimulationOldDaySecurityBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(itemSimulationOldDaySecurityBindingInflate, "");
        setVirtualCameraRotationDegrees.b bVar = this.f1400a;
        setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.asInterface;
        return new b(this, itemSimulationOldDaySecurityBindingInflate, null, null);
    }

    public final class b extends VirtualCameraInfo<getDefaultLightScrim> {
        private final ItemSimulationOldDaySecurityBinding TuitionPaymentFragmentbindingInflater1;
        private /* synthetic */ removeSessionCameraCaptureCallback TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(removeSessionCameraCaptureCallback removesessioncameracapturecallback, ItemSimulationOldDaySecurityBinding itemSimulationOldDaySecurityBinding, setVirtualCameraRotationDegrees.b bVar, setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            Intrinsics.checkNotNullParameter(itemSimulationOldDaySecurityBinding, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = removesessioncameracapturecallback;
            Context context = removesessioncameracapturecallback.asBinder;
            Intrinsics.checkNotNullExpressionValue(context, "");
            ConstraintLayout root = itemSimulationOldDaySecurityBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(context, root, null, null);
            this.TuitionPaymentFragmentbindingInflater1 = itemSimulationOldDaySecurityBinding;
        }

        @Override // defpackage.VirtualCameraInfo
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(getDefaultLightScrim getdefaultlightscrim) {
            getDefaultLightScrim getdefaultlightscrim2 = getdefaultlightscrim;
            Intrinsics.checkNotNullParameter(getdefaultlightscrim2, "");
            View view = this.itemView;
            this.TuitionPaymentFragmentbindingInflater1.tvTitleSimulationOldDaySecurity.setText(getdefaultlightscrim2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            this.TuitionPaymentFragmentbindingInflater1.tvValueSimulationOldDaySecurity.setText(getdefaultlightscrim2.b);
        }
    }
}
