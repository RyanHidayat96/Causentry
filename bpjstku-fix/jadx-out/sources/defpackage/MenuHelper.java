package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.databinding.ItemListLoyaltiBinding;
import com.bpjstku.presentation.loyalti.model.LoyaltiMenu;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0014B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"LMenuHelper;", "LsetVirtualCameraRotationDegrees;", "Lcom/bpjstku/presentation/loyalti/model/LoyaltiMenu;", "LMenuHelper$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "Landroid/content/Context;", "p0", "", "p1", "Lkotlin/Function1;", "", "p2", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/view/ViewGroup;)LMenuHelper$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lkotlin/jvm/functions/Function1;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MenuHelper extends setVirtualCameraRotationDegrees<LoyaltiMenu, TuitionPaymentFragmentspecialinlinedviewModeldefault3> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Function1<LoyaltiMenu, Unit> b;

    @Override // defpackage.setVirtualCameraRotationDegrees
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final /* bridge */ /* synthetic */ VirtualCameraInfo onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(viewGroup);
    }

    @Override // defpackage.setVirtualCameraRotationDegrees, androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(viewGroup);
    }

    public /* synthetic */ MenuHelper(Context context, ArrayList arrayList, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new ArrayList() : arrayList, (i & 4) != 0 ? null : function1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MenuHelper(Context context, List<LoyaltiMenu> list, Function1<? super LoyaltiMenu, Unit> function1) {
        super(context, list);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.b = function1;
    }

    private TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault1(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ItemListLoyaltiBinding itemListLoyaltiBindingInflate = ItemListLoyaltiBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(itemListLoyaltiBindingInflate, "");
        setVirtualCameraRotationDegrees.b bVar = this.f1400a;
        setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.asInterface;
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, itemListLoyaltiBindingInflate, null, null);
    }

    public final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends VirtualCameraInfo<LoyaltiMenu> {
        private final ItemListLoyaltiBinding TuitionPaymentFragmentbindingInflater1;
        private /* synthetic */ MenuHelper TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX WARN: Illegal instructions before constructor call */
        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(MenuHelper menuHelper, ItemListLoyaltiBinding itemListLoyaltiBinding, setVirtualCameraRotationDegrees.b bVar, setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            Intrinsics.checkNotNullParameter(itemListLoyaltiBinding, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = menuHelper;
            Context context = menuHelper.asBinder;
            Intrinsics.checkNotNullExpressionValue(context, "");
            CardView root = itemListLoyaltiBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(context, root, null, null);
            this.TuitionPaymentFragmentbindingInflater1 = itemListLoyaltiBinding;
        }

        @Override // defpackage.VirtualCameraInfo
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(LoyaltiMenu loyaltiMenu) {
            final LoyaltiMenu loyaltiMenu2 = loyaltiMenu;
            Intrinsics.checkNotNullParameter(loyaltiMenu2, "");
            ItemListLoyaltiBinding itemListLoyaltiBinding = this.TuitionPaymentFragmentbindingInflater1;
            final MenuHelper menuHelper = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            itemListLoyaltiBinding.tvTitleLoyalti.setText(loyaltiMenu2.TuitionPaymentFragmentbindingInflater1);
            itemListLoyaltiBinding.icLoyaltiMenu.setImageResource(loyaltiMenu2.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            CardView root = itemListLoyaltiBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            CardView cardView = root;
            Function1 function1 = new Function1() { // from class: setPresenterCallback
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MenuHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(menuHelper, loyaltiMenu2, (View) obj);
                }
            };
            Intrinsics.checkNotNullParameter(cardView, "");
            Intrinsics.checkNotNullParameter(function1, "");
            cardView.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function1));
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(MenuHelper menuHelper, LoyaltiMenu loyaltiMenu, View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Function1 function1 = menuHelper.b;
            if (function1 != null) {
                function1.invoke(loyaltiMenu);
            }
            return Unit.INSTANCE;
        }
    }
}
