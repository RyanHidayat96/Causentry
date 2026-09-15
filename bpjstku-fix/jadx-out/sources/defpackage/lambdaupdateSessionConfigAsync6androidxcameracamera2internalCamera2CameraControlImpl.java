package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.databinding.ItemListTuitionCompanyBinding;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0011B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\f\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"LlambdaupdateSessionConfigAsync6androidxcameracamera2internalCamera2CameraControlImpl;", "LsetVirtualCameraRotationDegrees;", "LstartActivityForResult;", "LlambdaupdateSessionConfigAsync6androidxcameracamera2internalCamera2CameraControlImpl$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "Landroid/content/Context;", "p0", "", "p1", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "Landroid/view/ViewGroup;", "", "b", "(Landroid/view/ViewGroup;)LlambdaupdateSessionConfigAsync6androidxcameracamera2internalCamera2CameraControlImpl$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class lambdaupdateSessionConfigAsync6androidxcameracamera2internalCamera2CameraControlImpl extends setVirtualCameraRotationDegrees<startActivityForResult, TuitionPaymentFragmentspecialinlinedviewModeldefault1> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final RecyclerView.RecycledViewPool b;

    @Override // defpackage.setVirtualCameraRotationDegrees
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final /* synthetic */ VirtualCameraInfo onCreateViewHolder(ViewGroup viewGroup, int i) {
        return b(viewGroup);
    }

    @Override // defpackage.setVirtualCameraRotationDegrees, androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return b(viewGroup);
    }

    public /* synthetic */ lambdaupdateSessionConfigAsync6androidxcameracamera2internalCamera2CameraControlImpl(Context context, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new ArrayList() : arrayList);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lambdaupdateSessionConfigAsync6androidxcameracamera2internalCamera2CameraControlImpl(Context context, List<startActivityForResult> list) {
        super(context, list);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.b = new RecyclerView.RecycledViewPool();
    }

    private TuitionPaymentFragmentspecialinlinedviewModeldefault1 b(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ItemListTuitionCompanyBinding itemListTuitionCompanyBindingInflate = ItemListTuitionCompanyBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(itemListTuitionCompanyBindingInflate, "");
        setVirtualCameraRotationDegrees.b bVar = this.f1400a;
        setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.asInterface;
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault1(this, itemListTuitionCompanyBindingInflate, null, null);
    }

    public final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 extends VirtualCameraInfo<startActivityForResult> {
        private final ItemListTuitionCompanyBinding TuitionPaymentFragmentbindingInflater1;
        private /* synthetic */ lambdaupdateSessionConfigAsync6androidxcameracamera2internalCamera2CameraControlImpl TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX WARN: Illegal instructions before constructor call */
        public TuitionPaymentFragmentspecialinlinedviewModeldefault1(lambdaupdateSessionConfigAsync6androidxcameracamera2internalCamera2CameraControlImpl lambdaupdatesessionconfigasync6androidxcameracamera2internalcamera2cameracontrolimpl, ItemListTuitionCompanyBinding itemListTuitionCompanyBinding, setVirtualCameraRotationDegrees.b bVar, setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            Intrinsics.checkNotNullParameter(itemListTuitionCompanyBinding, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = lambdaupdatesessionconfigasync6androidxcameracamera2internalcamera2cameracontrolimpl;
            Context context = lambdaupdatesessionconfigasync6androidxcameracamera2internalcamera2cameracontrolimpl.asBinder;
            Intrinsics.checkNotNullExpressionValue(context, "");
            LinearLayout root = itemListTuitionCompanyBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(context, root, null, null);
            this.TuitionPaymentFragmentbindingInflater1 = itemListTuitionCompanyBinding;
        }

        @Override // defpackage.VirtualCameraInfo
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(startActivityForResult startactivityforresult) {
            startActivityForResult startactivityforresult2 = startactivityforresult;
            Intrinsics.checkNotNullParameter(startactivityforresult2, "");
            ItemListTuitionCompanyBinding itemListTuitionCompanyBinding = this.TuitionPaymentFragmentbindingInflater1;
            lambdaupdateSessionConfigAsync6androidxcameracamera2internalCamera2CameraControlImpl lambdaupdatesessionconfigasync6androidxcameracamera2internalcamera2cameracontrolimpl = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            View view = this.itemView;
            itemListTuitionCompanyBinding.tvTuitionCompanyName.setText(startactivityforresult2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(itemListTuitionCompanyBinding.rvListTuitionCompany.getContext(), 1, false);
            RecyclerView recyclerView = itemListTuitionCompanyBinding.rvListTuitionCompany;
            recyclerView.setLayoutManager(linearLayoutManager);
            Context context = recyclerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            recyclerView.setAdapter(new lambdawaitForSessionUpdateId3androidxcameracamera2internalCamera2CameraControlImpl(context, startactivityforresult2.TuitionPaymentFragmentbindingInflater1));
            recyclerView.setRecycledViewPool(lambdaupdatesessionconfigasync6androidxcameracamera2internalcamera2cameracontrolimpl.b);
        }
    }
}
