package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.databinding.ItemListCategoryPaymentBinding;
import com.bpjstku.presentation.membership.payment.model.CategoryPayment;
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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u000fB7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"LupdateVoiceButton;", "LsetVirtualCameraRotationDegrees;", "Lcom/bpjstku/presentation/membership/payment/model/CategoryPayment;", "LupdateVoiceButton$TuitionPaymentFragmentbindingInflater1;", "Landroid/content/Context;", "p0", "", "p1", "Lkotlin/Function1;", "", "p2", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "", "TuitionPaymentFragmentbindingInflater1", "(Landroid/view/ViewGroup;)LupdateVoiceButton$TuitionPaymentFragmentbindingInflater1;", "Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "b", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class updateVoiceButton extends setVirtualCameraRotationDegrees<CategoryPayment, TuitionPaymentFragmentbindingInflater1> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Function1<CategoryPayment, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final RecyclerView.RecycledViewPool b;

    @Override // defpackage.setVirtualCameraRotationDegrees
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final /* synthetic */ VirtualCameraInfo onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentbindingInflater1(viewGroup);
    }

    @Override // defpackage.setVirtualCameraRotationDegrees, androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentbindingInflater1(viewGroup);
    }

    public /* synthetic */ updateVoiceButton(Context context, ArrayList arrayList, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new ArrayList() : arrayList, (i & 4) != 0 ? null : function1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public updateVoiceButton(Context context, List<CategoryPayment> list, Function1<? super CategoryPayment, Unit> function1) {
        super(context, list);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function1;
        this.b = new RecyclerView.RecycledViewPool();
    }

    private TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentbindingInflater1(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ItemListCategoryPaymentBinding itemListCategoryPaymentBindingInflate = ItemListCategoryPaymentBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(itemListCategoryPaymentBindingInflate, "");
        setVirtualCameraRotationDegrees.b bVar = this.f1400a;
        setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.asInterface;
        return new TuitionPaymentFragmentbindingInflater1(this, itemListCategoryPaymentBindingInflate, null, null);
    }

    public final class TuitionPaymentFragmentbindingInflater1 extends VirtualCameraInfo<CategoryPayment> {
        private final ItemListCategoryPaymentBinding TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private /* synthetic */ updateVoiceButton b;

        /* JADX WARN: Illegal instructions before constructor call */
        public TuitionPaymentFragmentbindingInflater1(updateVoiceButton updatevoicebutton, ItemListCategoryPaymentBinding itemListCategoryPaymentBinding, setVirtualCameraRotationDegrees.b bVar, setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            Intrinsics.checkNotNullParameter(itemListCategoryPaymentBinding, "");
            this.b = updatevoicebutton;
            Context context = updatevoicebutton.asBinder;
            Intrinsics.checkNotNullExpressionValue(context, "");
            ConstraintLayout root = itemListCategoryPaymentBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(context, root, null, null);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = itemListCategoryPaymentBinding;
        }

        @Override // defpackage.VirtualCameraInfo
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(CategoryPayment categoryPayment) {
            final CategoryPayment categoryPayment2 = categoryPayment;
            Intrinsics.checkNotNullParameter(categoryPayment2, "");
            ItemListCategoryPaymentBinding itemListCategoryPaymentBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            final updateVoiceButton updatevoicebutton = this.b;
            itemListCategoryPaymentBinding.tvTitleCategoryPromo.setText(categoryPayment2.b);
            itemListCategoryPaymentBinding.tvTitleCategoryPromo.setSelected(categoryPayment2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            ConstraintLayout root = itemListCategoryPaymentBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            ConstraintLayout constraintLayout = root;
            Function1 function1 = new Function1() { // from class: updateSubmitButton
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return updateVoiceButton.TuitionPaymentFragmentbindingInflater1.b(updatevoicebutton, categoryPayment2, (View) obj);
                }
            };
            Intrinsics.checkNotNullParameter(constraintLayout, "");
            Intrinsics.checkNotNullParameter(function1, "");
            constraintLayout.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function1));
        }

        public static /* synthetic */ Unit b(updateVoiceButton updatevoicebutton, CategoryPayment categoryPayment, View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Iterable iterable = updatevoicebutton.d;
            Intrinsics.checkNotNullExpressionValue(iterable, "");
            Iterable iterable2 = iterable;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
            Iterator it = iterable2.iterator();
            while (it.hasNext()) {
                ((CategoryPayment) it.next()).TuitionPaymentFragmentspecialinlinedviewModeldefault2 = false;
                arrayList.add(Unit.INSTANCE);
            }
            categoryPayment.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
            updatevoicebutton.notifyDataSetChanged();
            Function1 function1 = updatevoicebutton.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (function1 != null) {
                function1.invoke(categoryPayment);
            }
            return Unit.INSTANCE;
        }
    }
}
