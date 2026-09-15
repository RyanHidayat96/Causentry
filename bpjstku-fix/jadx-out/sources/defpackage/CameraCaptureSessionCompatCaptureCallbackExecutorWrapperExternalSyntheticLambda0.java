package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.databinding.ItemSupportMenuBinding;
import com.bpjstku.presentation.support.model.SupportMenu;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0014B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"LCameraCaptureSessionCompatCaptureCallbackExecutorWrapperExternalSyntheticLambda0;", "LsetVirtualCameraRotationDegrees;", "Lcom/bpjstku/presentation/support/model/SupportMenu;", "LCameraCaptureSessionCompatCaptureCallbackExecutorWrapperExternalSyntheticLambda0$TuitionPaymentFragmentbindingInflater1;", "Landroid/content/Context;", "p0", "", "p1", "Lkotlin/Function1;", "", "p2", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/view/ViewGroup;)LCameraCaptureSessionCompatCaptureCallbackExecutorWrapperExternalSyntheticLambda0$TuitionPaymentFragmentbindingInflater1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lkotlin/jvm/functions/Function1;", "b", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CameraCaptureSessionCompatCaptureCallbackExecutorWrapperExternalSyntheticLambda0 extends setVirtualCameraRotationDegrees<SupportMenu, TuitionPaymentFragmentbindingInflater1> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Function1<SupportMenu, Unit> b;

    @Override // defpackage.setVirtualCameraRotationDegrees
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final /* synthetic */ VirtualCameraInfo onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(viewGroup);
    }

    @Override // defpackage.setVirtualCameraRotationDegrees, androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(viewGroup);
    }

    public /* synthetic */ CameraCaptureSessionCompatCaptureCallbackExecutorWrapperExternalSyntheticLambda0(Context context, ArrayList arrayList, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new ArrayList() : arrayList, (i & 4) != 0 ? null : function1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CameraCaptureSessionCompatCaptureCallbackExecutorWrapperExternalSyntheticLambda0(Context context, List<SupportMenu> list, Function1<? super SupportMenu, Unit> function1) {
        super(context, list);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.b = function1;
    }

    private TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault3(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ItemSupportMenuBinding itemSupportMenuBindingInflate = ItemSupportMenuBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(itemSupportMenuBindingInflate, "");
        setVirtualCameraRotationDegrees.b bVar = this.f1400a;
        setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.asInterface;
        return new TuitionPaymentFragmentbindingInflater1(this, itemSupportMenuBindingInflate, null, null);
    }

    public final class TuitionPaymentFragmentbindingInflater1 extends VirtualCameraInfo<SupportMenu> {
        private final ItemSupportMenuBinding TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private /* synthetic */ CameraCaptureSessionCompatCaptureCallbackExecutorWrapperExternalSyntheticLambda0 b;

        /* JADX WARN: Illegal instructions before constructor call */
        public TuitionPaymentFragmentbindingInflater1(CameraCaptureSessionCompatCaptureCallbackExecutorWrapperExternalSyntheticLambda0 cameraCaptureSessionCompatCaptureCallbackExecutorWrapperExternalSyntheticLambda0, ItemSupportMenuBinding itemSupportMenuBinding, setVirtualCameraRotationDegrees.b bVar, setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            Intrinsics.checkNotNullParameter(itemSupportMenuBinding, "");
            this.b = cameraCaptureSessionCompatCaptureCallbackExecutorWrapperExternalSyntheticLambda0;
            Context context = cameraCaptureSessionCompatCaptureCallbackExecutorWrapperExternalSyntheticLambda0.asBinder;
            Intrinsics.checkNotNullExpressionValue(context, "");
            CardView root = itemSupportMenuBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(context, root, null, null);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = itemSupportMenuBinding;
        }

        @Override // defpackage.VirtualCameraInfo
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(SupportMenu supportMenu) {
            final SupportMenu supportMenu2 = supportMenu;
            Intrinsics.checkNotNullParameter(supportMenu2, "");
            ItemSupportMenuBinding itemSupportMenuBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            final CameraCaptureSessionCompatCaptureCallbackExecutorWrapperExternalSyntheticLambda0 cameraCaptureSessionCompatCaptureCallbackExecutorWrapperExternalSyntheticLambda0 = this.b;
            itemSupportMenuBinding.tvSupportMenuTitle.setText(supportMenu2.b);
            itemSupportMenuBinding.tvSupportMenuDescription.setText(supportMenu2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            itemSupportMenuBinding.imgSupportMenu.setImageResource(supportMenu2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            CardView root = itemSupportMenuBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            CardView cardView = root;
            Function1 function1 = new Function1() { // from class: CameraCaptureSessionCompatCaptureCallbackExecutorWrapperExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CameraCaptureSessionCompatCaptureCallbackExecutorWrapperExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1.b(cameraCaptureSessionCompatCaptureCallbackExecutorWrapperExternalSyntheticLambda0, supportMenu2, (View) obj);
                }
            };
            Intrinsics.checkNotNullParameter(cardView, "");
            Intrinsics.checkNotNullParameter(function1, "");
            cardView.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function1));
        }

        public static /* synthetic */ Unit b(CameraCaptureSessionCompatCaptureCallbackExecutorWrapperExternalSyntheticLambda0 cameraCaptureSessionCompatCaptureCallbackExecutorWrapperExternalSyntheticLambda0, SupportMenu supportMenu, View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Function1 function1 = cameraCaptureSessionCompatCaptureCallbackExecutorWrapperExternalSyntheticLambda0.b;
            if (function1 != null) {
                function1.invoke(supportMenu);
            }
            return Unit.INSTANCE;
        }
    }
}
