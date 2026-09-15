package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.data.digitalcard.model.request.DigitalCardImageRequest;
import com.bpjstku.databinding.ItemListDigitalCardBinding;
import com.bpjstku.domain.digitalcard.model.DigitalCard;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.google.android.material.card.MaterialCardView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0019B?\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00178\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018"}, d2 = {"LaddMenuPresenter;", "LsetVirtualCameraRotationDegrees;", "Lcom/bpjstku/domain/digitalcard/model/DigitalCard;", "LaddMenuPresenter$b;", "Landroid/content/Context;", "p0", "", "p1", "", "p2", "Lkotlin/Function1;", "", "p3", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/view/ViewGroup;)LaddMenuPresenter$b;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lkotlin/jvm/functions/Function1;", "Lcom/bumptech/glide/request/RequestOptions;", "Lcom/bumptech/glide/request/RequestOptions;", "b"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class addMenuPresenter extends setVirtualCameraRotationDegrees<DigitalCard, b> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Function1<DigitalCard, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    final RequestOptions b;

    @Override // defpackage.setVirtualCameraRotationDegrees
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final /* synthetic */ VirtualCameraInfo onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(viewGroup);
    }

    @Override // defpackage.setVirtualCameraRotationDegrees, androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(viewGroup);
    }

    public /* synthetic */ addMenuPresenter(Context context, String str, ArrayList arrayList, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i & 4) != 0 ? new ArrayList() : arrayList, (i & 8) != 0 ? null : function1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public addMenuPresenter(Context context, String str, List<DigitalCard> list, Function1<? super DigitalCard, Unit> function1) throws Throwable {
        super(context, list);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = function1;
        RequestOptions requestOptionsTuitionPaymentFragmentbindingInflater1 = new RequestOptions().TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault1(context.getResources().getDrawable(R.drawable.ic_placeholder_wide)).TuitionPaymentFragmentbindingInflater1(context.getResources().getDrawable(R.drawable.ic_placeholder_wide));
        Intrinsics.checkNotNullExpressionValue(requestOptionsTuitionPaymentFragmentbindingInflater1, "");
        this.b = requestOptionsTuitionPaymentFragmentbindingInflater1;
    }

    private b TuitionPaymentFragmentspecialinlinedviewModeldefault3(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ItemListDigitalCardBinding itemListDigitalCardBindingInflate = ItemListDigitalCardBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(itemListDigitalCardBindingInflate, "");
        setVirtualCameraRotationDegrees.b bVar = this.f1400a;
        setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.asInterface;
        return new b(this, itemListDigitalCardBindingInflate, null, null);
    }

    public final class b extends VirtualCameraInfo<DigitalCard> {
        private /* synthetic */ addMenuPresenter TuitionPaymentFragmentbindingInflater1;
        private final ItemListDigitalCardBinding TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(addMenuPresenter addmenupresenter, ItemListDigitalCardBinding itemListDigitalCardBinding, setVirtualCameraRotationDegrees.b bVar, setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            Intrinsics.checkNotNullParameter(itemListDigitalCardBinding, "");
            this.TuitionPaymentFragmentbindingInflater1 = addmenupresenter;
            Context context = addmenupresenter.asBinder;
            Intrinsics.checkNotNullExpressionValue(context, "");
            MaterialCardView root = itemListDigitalCardBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(context, root, null, null);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = itemListDigitalCardBinding;
        }

        @Override // defpackage.VirtualCameraInfo
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(DigitalCard digitalCard) {
            final DigitalCard digitalCard2 = digitalCard;
            Intrinsics.checkNotNullParameter(digitalCard2, "");
            ItemListDigitalCardBinding itemListDigitalCardBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            final addMenuPresenter addmenupresenter = this.TuitionPaymentFragmentbindingInflater1;
            itemListDigitalCardBinding.tvMembershipCategory.setText(digitalCard2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            itemListDigitalCardBinding.tvKpjNumber.setText(digitalCard2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            Glide.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.itemView).TuitionPaymentFragmentspecialinlinedviewModeldefault3(new DigitalCardImageRequest(addmenupresenter.TuitionPaymentFragmentspecialinlinedviewModeldefault1, digitalCard2.TuitionPaymentFragmentbindingInflater1)).apply(addmenupresenter.b).into(itemListDigitalCardBinding.imgDigitalCard);
            MaterialCardView root = itemListDigitalCardBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            MaterialCardView materialCardView = root;
            Function1 function1 = new Function1() { // from class: addSubMenu
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return addMenuPresenter.b.TuitionPaymentFragmentbindingInflater1(addmenupresenter, digitalCard2, (View) obj);
                }
            };
            Intrinsics.checkNotNullParameter(materialCardView, "");
            Intrinsics.checkNotNullParameter(function1, "");
            materialCardView.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function1));
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(addMenuPresenter addmenupresenter, DigitalCard digitalCard, View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Function1 function1 = addmenupresenter.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (function1 != null) {
                function1.invoke(digitalCard);
            }
            return Unit.INSTANCE;
        }
    }
}
