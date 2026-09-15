package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.databinding.ItemJkpMenuBinding;
import com.bpjstku.presentation.program.jkp.model.JkpMenu;
import com.google.android.material.card.MaterialCardView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0013B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"LCamera2CapturePipelineTorchTaskExternalSyntheticLambda3;", "LsetVirtualCameraRotationDegrees;", "Lcom/bpjstku/presentation/program/jkp/model/JkpMenu;", "LCamera2CapturePipelineTorchTaskExternalSyntheticLambda3$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "Landroid/content/Context;", "p0", "", "p1", "Lkotlin/Function1;", "", "p2", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/view/ViewGroup;)LCamera2CapturePipelineTorchTaskExternalSyntheticLambda3$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "b", "Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Camera2CapturePipelineTorchTaskExternalSyntheticLambda3 extends setVirtualCameraRotationDegrees<JkpMenu, TuitionPaymentFragmentspecialinlinedviewModeldefault2> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    final Function1<JkpMenu, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Override // defpackage.setVirtualCameraRotationDegrees
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final /* synthetic */ VirtualCameraInfo onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(viewGroup);
    }

    @Override // defpackage.setVirtualCameraRotationDegrees, androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(viewGroup);
    }

    public /* synthetic */ Camera2CapturePipelineTorchTaskExternalSyntheticLambda3(Context context, ArrayList arrayList, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new ArrayList() : arrayList, (i & 4) != 0 ? null : function1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Camera2CapturePipelineTorchTaskExternalSyntheticLambda3(Context context, List<JkpMenu> list, Function1<? super JkpMenu, Unit> function1) {
        super(context, list);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = function1;
    }

    private TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault3(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ItemJkpMenuBinding itemJkpMenuBindingInflate = ItemJkpMenuBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(itemJkpMenuBindingInflate, "");
        setVirtualCameraRotationDegrees.b bVar = this.f1400a;
        setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.asInterface;
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, itemJkpMenuBindingInflate, null, null);
    }

    public final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends VirtualCameraInfo<JkpMenu> {
        private final ItemJkpMenuBinding TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private /* synthetic */ Camera2CapturePipelineTorchTaskExternalSyntheticLambda3 b;

        /* JADX WARN: Illegal instructions before constructor call */
        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(Camera2CapturePipelineTorchTaskExternalSyntheticLambda3 camera2CapturePipelineTorchTaskExternalSyntheticLambda3, ItemJkpMenuBinding itemJkpMenuBinding, setVirtualCameraRotationDegrees.b bVar, setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            Intrinsics.checkNotNullParameter(itemJkpMenuBinding, "");
            this.b = camera2CapturePipelineTorchTaskExternalSyntheticLambda3;
            Context context = camera2CapturePipelineTorchTaskExternalSyntheticLambda3.asBinder;
            Intrinsics.checkNotNullExpressionValue(context, "");
            MaterialCardView root = itemJkpMenuBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(context, root, null, null);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = itemJkpMenuBinding;
        }

        @Override // defpackage.VirtualCameraInfo
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(JkpMenu jkpMenu) {
            final JkpMenu jkpMenu2 = jkpMenu;
            Intrinsics.checkNotNullParameter(jkpMenu2, "");
            ItemJkpMenuBinding itemJkpMenuBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            final Camera2CapturePipelineTorchTaskExternalSyntheticLambda3 camera2CapturePipelineTorchTaskExternalSyntheticLambda3 = this.b;
            View view = this.itemView;
            itemJkpMenuBinding.imgJpnSimulation.setImageResource(jkpMenu2.TuitionPaymentFragmentbindingInflater1);
            itemJkpMenuBinding.tvJpSimulationMenu.setText(jkpMenu2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            itemJkpMenuBinding.tvJpSimulationDescription.setText(jkpMenu2.b);
            Intrinsics.checkNotNull(view);
            Function1 function1 = new Function1() { // from class: buildWithoutTarget
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Camera2CapturePipelineTorchTaskExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(camera2CapturePipelineTorchTaskExternalSyntheticLambda3, jkpMenu2, (View) obj);
                }
            };
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(function1, "");
            view.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function1));
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2CapturePipelineTorchTaskExternalSyntheticLambda3 camera2CapturePipelineTorchTaskExternalSyntheticLambda3, JkpMenu jkpMenu, View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Function1<JkpMenu, Unit> function1 = camera2CapturePipelineTorchTaskExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (function1 != null) {
                function1.invoke(jkpMenu);
            }
            return Unit.INSTANCE;
        }
    }
}
