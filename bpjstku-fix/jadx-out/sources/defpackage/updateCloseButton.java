package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.databinding.ItemCategoryPaymentBinding;
import com.bpjstku.presentation.membership.payment.model.ItemCategoryPayment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0014B9\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"LupdateCloseButton;", "LsetVirtualCameraRotationDegrees;", "Lcom/bpjstku/presentation/membership/payment/model/ItemCategoryPayment;", "LupdateCloseButton$b;", "Landroid/content/Context;", "p0", "", "p1", "Lkotlin/Function1;", "", "p2", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/view/ViewGroup;)LupdateCloseButton$b;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class updateCloseButton extends setVirtualCameraRotationDegrees<ItemCategoryPayment, b> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Function1<ItemCategoryPayment, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    @Override // defpackage.setVirtualCameraRotationDegrees
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final /* bridge */ /* synthetic */ VirtualCameraInfo onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(viewGroup);
    }

    @Override // defpackage.setVirtualCameraRotationDegrees, androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(viewGroup);
    }

    public /* synthetic */ updateCloseButton(Context context, ArrayList arrayList, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new ArrayList() : arrayList, (i & 4) != 0 ? null : function1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public updateCloseButton(Context context, List<ItemCategoryPayment> list, Function1<? super ItemCategoryPayment, Unit> function1) {
        super(context, list);
        Intrinsics.checkNotNullParameter(context, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function1;
    }

    private b TuitionPaymentFragmentspecialinlinedviewModeldefault1(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ItemCategoryPaymentBinding itemCategoryPaymentBindingInflate = ItemCategoryPaymentBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(itemCategoryPaymentBindingInflate, "");
        setVirtualCameraRotationDegrees.b bVar = this.f1400a;
        setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.asInterface;
        return new b(this, itemCategoryPaymentBindingInflate, null, null);
    }

    public final class b extends VirtualCameraInfo<ItemCategoryPayment> {
        private final ItemCategoryPaymentBinding TuitionPaymentFragmentbindingInflater1;
        private /* synthetic */ updateCloseButton b;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(updateCloseButton updateclosebutton, ItemCategoryPaymentBinding itemCategoryPaymentBinding, setVirtualCameraRotationDegrees.b bVar, setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            Intrinsics.checkNotNullParameter(itemCategoryPaymentBinding, "");
            this.b = updateclosebutton;
            Context context = updateclosebutton.asBinder;
            Intrinsics.checkNotNullExpressionValue(context, "");
            ConstraintLayout root = itemCategoryPaymentBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(context, root, null, null);
            this.TuitionPaymentFragmentbindingInflater1 = itemCategoryPaymentBinding;
        }

        @Override // defpackage.VirtualCameraInfo
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ItemCategoryPayment itemCategoryPayment) {
            final ItemCategoryPayment itemCategoryPayment2 = itemCategoryPayment;
            Intrinsics.checkNotNullParameter(itemCategoryPayment2, "");
            ItemCategoryPaymentBinding itemCategoryPaymentBinding = this.TuitionPaymentFragmentbindingInflater1;
            final updateCloseButton updateclosebutton = this.b;
            itemCategoryPaymentBinding.tvPaymentMethod.setText(itemCategoryPayment2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            itemCategoryPaymentBinding.imgCategoryPayment.setImageResource(itemCategoryPayment2.b);
            ConstraintLayout root = itemCategoryPaymentBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            ConstraintLayout constraintLayout = root;
            Function1 function1 = new Function1() { // from class: adjustDropDownSizeAndPosition
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return updateCloseButton.b.b(updateclosebutton, itemCategoryPayment2, (View) obj);
                }
            };
            Intrinsics.checkNotNullParameter(constraintLayout, "");
            Intrinsics.checkNotNullParameter(function1, "");
            constraintLayout.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function1));
        }

        public static /* synthetic */ Unit b(updateCloseButton updateclosebutton, ItemCategoryPayment itemCategoryPayment, View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Iterable iterable = updateclosebutton.d;
            Intrinsics.checkNotNullExpressionValue(iterable, "");
            Iterable iterable2 = iterable;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
            Iterator it = iterable2.iterator();
            while (it.hasNext()) {
                ((ItemCategoryPayment) it.next()).TuitionPaymentFragmentbindingInflater1 = false;
                arrayList.add(Unit.INSTANCE);
            }
            itemCategoryPayment.TuitionPaymentFragmentbindingInflater1 = true;
            updateclosebutton.notifyDataSetChanged();
            Function1 function1 = updateclosebutton.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (function1 != null) {
                function1.invoke(itemCategoryPayment);
            }
            return Unit.INSTANCE;
        }
    }
}
