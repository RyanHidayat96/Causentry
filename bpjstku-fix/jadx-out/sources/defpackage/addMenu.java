package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.databinding.ItemDanasiagaBinding;
import com.bpjstku.domain.danasiaga.model.DanaSiagaService;
import com.bumptech.glide.Glide;
import com.google.android.material.card.MaterialCardView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class addMenu extends setVirtualCameraRotationDegrees<DanaSiagaService, TuitionPaymentFragmentspecialinlinedviewModeldefault2> {
    private final Function1<DanaSiagaService, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Override // defpackage.setVirtualCameraRotationDegrees
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final /* bridge */ /* synthetic */ VirtualCameraInfo onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(viewGroup);
    }

    @Override // defpackage.setVirtualCameraRotationDegrees, androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(viewGroup);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public addMenu(Context context, List<DanaSiagaService> list, Function1<? super DanaSiagaService, Unit> function1) {
        super(context, list);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = function1;
    }

    public final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends VirtualCameraInfo<DanaSiagaService> {
        private /* synthetic */ addMenu TuitionPaymentFragmentbindingInflater1;
        private final ItemDanasiagaBinding TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX WARN: Illegal instructions before constructor call */
        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(addMenu addmenu, ItemDanasiagaBinding itemDanasiagaBinding, setVirtualCameraRotationDegrees.b bVar, setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            Intrinsics.checkNotNullParameter(itemDanasiagaBinding, "");
            this.TuitionPaymentFragmentbindingInflater1 = addmenu;
            Context context = addmenu.asBinder;
            Intrinsics.checkNotNullExpressionValue(context, "");
            MaterialCardView root = itemDanasiagaBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(context, root, null, null);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = itemDanasiagaBinding;
        }

        @Override // defpackage.VirtualCameraInfo
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(DanaSiagaService danaSiagaService) {
            final DanaSiagaService danaSiagaService2 = danaSiagaService;
            Intrinsics.checkNotNullParameter(danaSiagaService2, "");
            ItemDanasiagaBinding itemDanasiagaBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            final addMenu addmenu = this.TuitionPaymentFragmentbindingInflater1;
            Glide.TuitionPaymentFragmentspecialinlinedviewModeldefault1(itemDanasiagaBinding.getRoot()).load(Integer.valueOf(danaSiagaService2.b)).d().into(itemDanasiagaBinding.itemDanasiagaLogo);
            itemDanasiagaBinding.itemDanasiagaTenor.setVisibility(!Intrinsics.areEqual(danaSiagaService2.asBinder, "") ? 0 : 8);
            itemDanasiagaBinding.itemDanasiagaTenorTitle.setVisibility(!Intrinsics.areEqual(danaSiagaService2.asBinder, "") ? 0 : 8);
            itemDanasiagaBinding.itemDanasiagaBunga.setVisibility(!Intrinsics.areEqual(danaSiagaService2.asInterface, "") ? 0 : 8);
            itemDanasiagaBinding.itemDanasiagaBungaTitle.setVisibility(!Intrinsics.areEqual(danaSiagaService2.asInterface, "") ? 0 : 8);
            itemDanasiagaBinding.itemDanasiagaProses.setVisibility(!Intrinsics.areEqual(danaSiagaService2.d, "") ? 0 : 8);
            itemDanasiagaBinding.itemDanasiagaProsesTitle.setVisibility(!Intrinsics.areEqual(danaSiagaService2.d, "") ? 0 : 8);
            itemDanasiagaBinding.itemDanasiagaCompany.setVisibility(Intrinsics.areEqual(danaSiagaService2.TuitionPaymentFragmentbindingInflater1, "") ? 8 : 0);
            if (Intrinsics.areEqual(danaSiagaService2.asBinder, "") && Intrinsics.areEqual(danaSiagaService2.asInterface, "") && Intrinsics.areEqual(danaSiagaService2.d, "")) {
                itemDanasiagaBinding.itemDanasiagaBottomdiv.setVisibility(8);
            }
            itemDanasiagaBinding.itemDanasiagaTitle.setText(danaSiagaService2.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            itemDanasiagaBinding.itemDanasiagaCompany.setText(danaSiagaService2.TuitionPaymentFragmentbindingInflater1);
            itemDanasiagaBinding.itemDanasiagaDescription.setText(danaSiagaService2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            itemDanasiagaBinding.itemDanasiagaTenor.setText(danaSiagaService2.asBinder);
            itemDanasiagaBinding.itemDanasiagaBunga.setText(danaSiagaService2.asInterface);
            itemDanasiagaBinding.itemDanasiagaProses.setText(danaSiagaService2.d);
            MaterialCardView root = itemDanasiagaBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            MaterialCardView materialCardView = root;
            Function1 function1 = new Function1() { // from class: setShowTitle
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return addMenu.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(addmenu, danaSiagaService2, (View) obj);
                }
            };
            Intrinsics.checkNotNullParameter(materialCardView, "");
            Intrinsics.checkNotNullParameter(function1, "");
            materialCardView.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function1));
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(addMenu addmenu, DanaSiagaService danaSiagaService, View view) {
            Intrinsics.checkNotNullParameter(view, "");
            addmenu.TuitionPaymentFragmentspecialinlinedviewModeldefault3.invoke(danaSiagaService);
            return Unit.INSTANCE;
        }
    }

    private TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault1(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ItemDanasiagaBinding itemDanasiagaBindingInflate = ItemDanasiagaBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(itemDanasiagaBindingInflate, "");
        setVirtualCameraRotationDegrees.b bVar = this.f1400a;
        setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.asInterface;
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, itemDanasiagaBindingInflate, null, null);
    }
}
