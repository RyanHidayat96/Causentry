package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.databinding.ItemJpnMenuBinding;
import com.bpjstku.presentation.program.jpn.model.JpnMenu;
import com.google.android.material.card.MaterialCardView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0013B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"LCameraDeviceStateCallbacksComboDeviceStateCallback;", "LsetVirtualCameraRotationDegrees;", "Lcom/bpjstku/presentation/program/jpn/model/JpnMenu;", "LCameraDeviceStateCallbacksComboDeviceStateCallback$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "Landroid/content/Context;", "p0", "", "p1", "Lkotlin/Function1;", "", "p2", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "", "b", "(Landroid/view/ViewGroup;)LCameraDeviceStateCallbacksComboDeviceStateCallback$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CameraDeviceStateCallbacksComboDeviceStateCallback extends setVirtualCameraRotationDegrees<JpnMenu, TuitionPaymentFragmentspecialinlinedviewModeldefault1> {
    final Function1<JpnMenu, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Override // defpackage.setVirtualCameraRotationDegrees
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final /* synthetic */ VirtualCameraInfo onCreateViewHolder(ViewGroup viewGroup, int i) {
        return b(viewGroup);
    }

    @Override // defpackage.setVirtualCameraRotationDegrees, androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return b(viewGroup);
    }

    public /* synthetic */ CameraDeviceStateCallbacksComboDeviceStateCallback(Context context, ArrayList arrayList, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new ArrayList() : arrayList, (i & 4) != 0 ? null : function1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CameraDeviceStateCallbacksComboDeviceStateCallback(Context context, List<JpnMenu> list, Function1<? super JpnMenu, Unit> function1) {
        super(context, list);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = function1;
    }

    private TuitionPaymentFragmentspecialinlinedviewModeldefault1 b(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ItemJpnMenuBinding itemJpnMenuBindingInflate = ItemJpnMenuBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(itemJpnMenuBindingInflate, "");
        setVirtualCameraRotationDegrees.b bVar = this.f1400a;
        setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.asInterface;
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault1(this, itemJpnMenuBindingInflate, null, null);
    }

    public final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 extends VirtualCameraInfo<JpnMenu> {
        private /* synthetic */ CameraDeviceStateCallbacksComboDeviceStateCallback TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private final ItemJpnMenuBinding TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX WARN: Illegal instructions before constructor call */
        public TuitionPaymentFragmentspecialinlinedviewModeldefault1(CameraDeviceStateCallbacksComboDeviceStateCallback cameraDeviceStateCallbacksComboDeviceStateCallback, ItemJpnMenuBinding itemJpnMenuBinding, setVirtualCameraRotationDegrees.b bVar, setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            Intrinsics.checkNotNullParameter(itemJpnMenuBinding, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cameraDeviceStateCallbacksComboDeviceStateCallback;
            Context context = cameraDeviceStateCallbacksComboDeviceStateCallback.asBinder;
            Intrinsics.checkNotNullExpressionValue(context, "");
            MaterialCardView root = itemJpnMenuBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(context, root, null, null);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = itemJpnMenuBinding;
        }

        @Override // defpackage.VirtualCameraInfo
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(JpnMenu jpnMenu) {
            final JpnMenu jpnMenu2 = jpnMenu;
            Intrinsics.checkNotNullParameter(jpnMenu2, "");
            ItemJpnMenuBinding itemJpnMenuBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            final CameraDeviceStateCallbacksComboDeviceStateCallback cameraDeviceStateCallbacksComboDeviceStateCallback = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            View view = this.itemView;
            itemJpnMenuBinding.imgJpnSimulation.setImageResource(jpnMenu2.TuitionPaymentFragmentbindingInflater1);
            itemJpnMenuBinding.tvJpSimulationMenu.setText(jpnMenu2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            itemJpnMenuBinding.tvJpSimulationDescription.setText(jpnMenu2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            Intrinsics.checkNotNull(view);
            Function1 function1 = new Function1() { // from class: CameraDeviceStateCallbacksNoOpDeviceStateCallback
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CameraDeviceStateCallbacksComboDeviceStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(cameraDeviceStateCallbacksComboDeviceStateCallback, jpnMenu2, (View) obj);
                }
            };
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(function1, "");
            view.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function1));
        }

        public static /* synthetic */ Unit b(CameraDeviceStateCallbacksComboDeviceStateCallback cameraDeviceStateCallbacksComboDeviceStateCallback, JpnMenu jpnMenu, View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Function1<JpnMenu, Unit> function1 = cameraDeviceStateCallbacksComboDeviceStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (function1 != null) {
                function1.invoke(jpnMenu);
            }
            return Unit.INSTANCE;
        }
    }
}
