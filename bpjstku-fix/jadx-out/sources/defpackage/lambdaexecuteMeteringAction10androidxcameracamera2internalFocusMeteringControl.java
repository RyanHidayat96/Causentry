package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.databinding.ItemMerchantBinding;
import com.bpjstku.domain.promo.model.ListMerchant;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class lambdaexecuteMeteringAction10androidxcameracamera2internalFocusMeteringControl extends ListAdapter<ListMerchant, b> {
    public Function1<? super ListMerchant, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        b bVar = (b) viewHolder;
        Intrinsics.checkNotNullParameter(bVar, "");
        ListMerchant item = getItem(i);
        Intrinsics.checkNotNullExpressionValue(item, "");
        final ListMerchant listMerchant = item;
        Intrinsics.checkNotNullParameter(listMerchant, "");
        ItemMerchantBinding itemMerchantBinding = bVar.TuitionPaymentFragmentbindingInflater1;
        final lambdaexecuteMeteringAction10androidxcameracamera2internalFocusMeteringControl lambdaexecutemeteringaction10androidxcameracamera2internalfocusmeteringcontrol = bVar.b;
        itemMerchantBinding.imgMerchant.setImageResource(R.drawable.ic_placeholder);
        itemMerchantBinding.tvTitleMerchant.setText(listMerchant.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        itemMerchantBinding.tvDescMerchant.setText(listMerchant.cancelAll);
        if (listMerchant.RemoteActionCompatParcelizer.length() == 0) {
            itemMerchantBinding.tvLocation.setVisibility(8);
        } else {
            itemMerchantBinding.tvLocation.setVisibility(0);
            itemMerchantBinding.tvLocation.setText(listMerchant.RemoteActionCompatParcelizer);
        }
        MaterialButton materialButton = itemMerchantBinding.btnDetail;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Function1 function1 = new Function1() { // from class: lambdaenableExternalFlashAeMode6androidxcameracamera2internalFocusMeteringControl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return lambdaexecuteMeteringAction10androidxcameracamera2internalFocusMeteringControl.b.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, listMerchant, (View) obj);
            }
        };
        Intrinsics.checkNotNullParameter(materialButton2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        materialButton2.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function1));
        MaterialCardView root = itemMerchantBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        MaterialCardView materialCardView = root;
        Function1 function2 = new Function1() { // from class: lambdaexecuteMeteringAction7androidxcameracamera2internalFocusMeteringControl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return lambdaexecuteMeteringAction10androidxcameracamera2internalFocusMeteringControl.b.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, listMerchant, (View) obj);
            }
        };
        Intrinsics.checkNotNullParameter(materialCardView, "");
        Intrinsics.checkNotNullParameter(function2, "");
        materialCardView.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ItemMerchantBinding itemMerchantBindingInflate = ItemMerchantBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(itemMerchantBindingInflate, "");
        return new b(this, itemMerchantBindingInflate);
    }

    public lambdaexecuteMeteringAction10androidxcameracamera2internalFocusMeteringControl() {
        super(new TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    public final class b extends RecyclerView.ViewHolder {
        final ItemMerchantBinding TuitionPaymentFragmentbindingInflater1;
        final /* synthetic */ lambdaexecuteMeteringAction10androidxcameracamera2internalFocusMeteringControl b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(lambdaexecuteMeteringAction10androidxcameracamera2internalFocusMeteringControl lambdaexecutemeteringaction10androidxcameracamera2internalfocusmeteringcontrol, ItemMerchantBinding itemMerchantBinding) {
            super(itemMerchantBinding.getRoot());
            Intrinsics.checkNotNullParameter(itemMerchantBinding, "");
            this.b = lambdaexecutemeteringaction10androidxcameracamera2internalfocusmeteringcontrol;
            this.TuitionPaymentFragmentbindingInflater1 = itemMerchantBinding;
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(lambdaexecuteMeteringAction10androidxcameracamera2internalFocusMeteringControl lambdaexecutemeteringaction10androidxcameracamera2internalfocusmeteringcontrol, ListMerchant listMerchant, View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Function1<? super ListMerchant, Unit> function1 = lambdaexecutemeteringaction10androidxcameracamera2internalfocusmeteringcontrol.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (function1 != null) {
                function1.invoke(listMerchant);
            }
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit b(lambdaexecuteMeteringAction10androidxcameracamera2internalFocusMeteringControl lambdaexecutemeteringaction10androidxcameracamera2internalfocusmeteringcontrol, ListMerchant listMerchant, View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Function1<? super ListMerchant, Unit> function1 = lambdaexecutemeteringaction10androidxcameracamera2internalfocusmeteringcontrol.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (function1 != null) {
                function1.invoke(listMerchant);
            }
            return Unit.INSTANCE;
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends DiffUtil.ItemCallback<ListMerchant> {
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public final /* synthetic */ boolean areContentsTheSame(ListMerchant listMerchant, ListMerchant listMerchant2) {
            ListMerchant listMerchant3 = listMerchant;
            ListMerchant listMerchant4 = listMerchant2;
            Intrinsics.checkNotNullParameter(listMerchant3, "");
            Intrinsics.checkNotNullParameter(listMerchant4, "");
            return Intrinsics.areEqual(listMerchant3, listMerchant4);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public final /* synthetic */ boolean areItemsTheSame(ListMerchant listMerchant, ListMerchant listMerchant2) {
            ListMerchant listMerchant3 = listMerchant;
            ListMerchant listMerchant4 = listMerchant2;
            Intrinsics.checkNotNullParameter(listMerchant3, "");
            Intrinsics.checkNotNullParameter(listMerchant4, "");
            return Intrinsics.areEqual(listMerchant3.g, listMerchant4.g);
        }
    }
}
