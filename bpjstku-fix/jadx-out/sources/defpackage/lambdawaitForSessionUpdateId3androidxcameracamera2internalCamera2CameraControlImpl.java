package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.databinding.ItemListTuitionLastYearBinding;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u000eB\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\f\u0010\r"}, d2 = {"LlambdawaitForSessionUpdateId3androidxcameracamera2internalCamera2CameraControlImpl;", "LsetVirtualCameraRotationDegrees;", "LremoveOnUserLeaveHintListener;", "LlambdawaitForSessionUpdateId3androidxcameracamera2internalCamera2CameraControlImpl$TuitionPaymentFragmentbindingInflater1;", "Landroid/content/Context;", "p0", "", "p1", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "Landroid/view/ViewGroup;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/view/ViewGroup;)LlambdawaitForSessionUpdateId3androidxcameracamera2internalCamera2CameraControlImpl$TuitionPaymentFragmentbindingInflater1;", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class lambdawaitForSessionUpdateId3androidxcameracamera2internalCamera2CameraControlImpl extends setVirtualCameraRotationDegrees<removeOnUserLeaveHintListener, TuitionPaymentFragmentbindingInflater1> {
    @Override // defpackage.setVirtualCameraRotationDegrees
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final /* synthetic */ VirtualCameraInfo onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(viewGroup);
    }

    @Override // defpackage.setVirtualCameraRotationDegrees, androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(viewGroup);
    }

    public /* synthetic */ lambdawaitForSessionUpdateId3androidxcameracamera2internalCamera2CameraControlImpl(Context context, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new ArrayList() : arrayList);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lambdawaitForSessionUpdateId3androidxcameracamera2internalCamera2CameraControlImpl(Context context, List<removeOnUserLeaveHintListener> list) {
        super(context, list);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
    }

    private TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault2(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ItemListTuitionLastYearBinding itemListTuitionLastYearBindingInflate = ItemListTuitionLastYearBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(itemListTuitionLastYearBindingInflate, "");
        setVirtualCameraRotationDegrees.b bVar = this.f1400a;
        setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.asInterface;
        return new TuitionPaymentFragmentbindingInflater1(this, itemListTuitionLastYearBindingInflate, null, null);
    }

    public final class TuitionPaymentFragmentbindingInflater1 extends VirtualCameraInfo<removeOnUserLeaveHintListener> {
        private /* synthetic */ lambdawaitForSessionUpdateId3androidxcameracamera2internalCamera2CameraControlImpl TuitionPaymentFragmentbindingInflater1;
        private final ItemListTuitionLastYearBinding TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX WARN: Illegal instructions before constructor call */
        public TuitionPaymentFragmentbindingInflater1(lambdawaitForSessionUpdateId3androidxcameracamera2internalCamera2CameraControlImpl lambdawaitforsessionupdateid3androidxcameracamera2internalcamera2cameracontrolimpl, ItemListTuitionLastYearBinding itemListTuitionLastYearBinding, setVirtualCameraRotationDegrees.b bVar, setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            Intrinsics.checkNotNullParameter(itemListTuitionLastYearBinding, "");
            this.TuitionPaymentFragmentbindingInflater1 = lambdawaitforsessionupdateid3androidxcameracamera2internalcamera2cameracontrolimpl;
            Context context = lambdawaitforsessionupdateid3androidxcameracamera2internalcamera2cameracontrolimpl.asBinder;
            Intrinsics.checkNotNullExpressionValue(context, "");
            ConstraintLayout root = itemListTuitionLastYearBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(context, root, null, null);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = itemListTuitionLastYearBinding;
        }

        @Override // defpackage.VirtualCameraInfo
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(removeOnUserLeaveHintListener removeonuserleavehintlistener) {
            removeOnUserLeaveHintListener removeonuserleavehintlistener2 = removeonuserleavehintlistener;
            Intrinsics.checkNotNullParameter(removeonuserleavehintlistener2, "");
            View view = this.itemView;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.tvTitleTuitionInMonth.setText(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1(removeonuserleavehintlistener2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.toString()));
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.tvTuitionValue.setText(getCameraOperatingMode.TuitionPaymentFragmentspecialinlinedviewModeldefault1(removeonuserleavehintlistener2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.toString()));
        }
    }
}
