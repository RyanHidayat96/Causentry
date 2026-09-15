package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.databinding.ItemEwalletDetailBinding;
import com.bpjstku.domain.ewallet.model.EWalletService;
import com.google.android.material.card.MaterialCardView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class removeGroup extends setVirtualCameraRotationDegrees<EWalletService, TuitionPaymentFragmentspecialinlinedviewModeldefault3> {
    @Override // defpackage.setVirtualCameraRotationDegrees
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final /* synthetic */ VirtualCameraInfo onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentbindingInflater1(viewGroup);
    }

    @Override // defpackage.setVirtualCameraRotationDegrees, androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentbindingInflater1(viewGroup);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public removeGroup(Context context, List<EWalletService> list) {
        super(context, list);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
    }

    private TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentbindingInflater1(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ItemEwalletDetailBinding itemEwalletDetailBindingInflate = ItemEwalletDetailBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(itemEwalletDetailBindingInflate, "");
        setVirtualCameraRotationDegrees.b bVar = this.f1400a;
        setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.asInterface;
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, itemEwalletDetailBindingInflate, null, null);
    }

    public final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends VirtualCameraInfo<EWalletService> {
        private final ItemEwalletDetailBinding TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private /* synthetic */ removeGroup TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX WARN: Illegal instructions before constructor call */
        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(removeGroup removegroup, ItemEwalletDetailBinding itemEwalletDetailBinding, setVirtualCameraRotationDegrees.b bVar, setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            Intrinsics.checkNotNullParameter(itemEwalletDetailBinding, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = removegroup;
            Context context = removegroup.asBinder;
            Intrinsics.checkNotNullExpressionValue(context, "");
            MaterialCardView root = itemEwalletDetailBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(context, root, null, null);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = itemEwalletDetailBinding;
        }

        @Override // defpackage.VirtualCameraInfo
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(EWalletService eWalletService) {
            EWalletService eWalletService2 = eWalletService;
            Intrinsics.checkNotNullParameter(eWalletService2, "");
            ItemEwalletDetailBinding itemEwalletDetailBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            itemEwalletDetailBinding.tvItemEwalletPrice.setText(getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(String.valueOf(eWalletService2.TuitionPaymentFragmentspecialinlinedviewModeldefault2)));
            itemEwalletDetailBinding.imgItemEwallet.setImageResource(eWalletService2.TuitionPaymentFragmentbindingInflater1);
            MaterialCardView root = itemEwalletDetailBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            MaterialCardView materialCardView = root;
            Function1 function1 = new Function1() { // from class: removeItem
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return removeGroup.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3((View) obj);
                }
            };
            Intrinsics.checkNotNullParameter(materialCardView, "");
            Intrinsics.checkNotNullParameter(function1, "");
            materialCardView.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function1));
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(View view) {
            Intrinsics.checkNotNullParameter(view, "");
            return Unit.INSTANCE;
        }
    }
}
