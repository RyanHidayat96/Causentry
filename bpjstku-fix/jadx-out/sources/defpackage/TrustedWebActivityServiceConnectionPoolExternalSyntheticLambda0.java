package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.databinding.ItemPartnerBinding;
import com.bpjstku.domain.partners.model.Partner;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u000fB7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"LTrustedWebActivityServiceConnectionPoolExternalSyntheticLambda0;", "LsetVirtualCameraRotationDegrees;", "Lcom/bpjstku/domain/partners/model/Partner;", "LTrustedWebActivityServiceConnectionPoolExternalSyntheticLambda0$b;", "Landroid/content/Context;", "p0", "", "p1", "Lkotlin/Function1;", "", "p2", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "", "b", "(Landroid/view/ViewGroup;)LTrustedWebActivityServiceConnectionPoolExternalSyntheticLambda0$b;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TrustedWebActivityServiceConnectionPoolExternalSyntheticLambda0 extends setVirtualCameraRotationDegrees<Partner, b> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    final Function1<Partner, Unit> TuitionPaymentFragmentbindingInflater1;

    @Override // defpackage.setVirtualCameraRotationDegrees
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final /* synthetic */ VirtualCameraInfo onCreateViewHolder(ViewGroup viewGroup, int i) {
        return b(viewGroup);
    }

    @Override // defpackage.setVirtualCameraRotationDegrees, androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return b(viewGroup);
    }

    public /* synthetic */ TrustedWebActivityServiceConnectionPoolExternalSyntheticLambda0(Context context, ArrayList arrayList, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new ArrayList() : arrayList, (i & 4) != 0 ? null : function1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    private TrustedWebActivityServiceConnectionPoolExternalSyntheticLambda0(Context context, List<Partner> list, Function1<? super Partner, Unit> function1) {
        super(context, list);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.TuitionPaymentFragmentbindingInflater1 = function1;
    }

    private b b(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ItemPartnerBinding itemPartnerBindingInflate = ItemPartnerBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(itemPartnerBindingInflate, "");
        setVirtualCameraRotationDegrees.b bVar = this.f1400a;
        setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.asInterface;
        return new b(this, itemPartnerBindingInflate, null, null);
    }

    public final class b extends VirtualCameraInfo<Partner> {
        private final ItemPartnerBinding TuitionPaymentFragmentbindingInflater1;
        private /* synthetic */ TrustedWebActivityServiceConnectionPoolExternalSyntheticLambda0 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(TrustedWebActivityServiceConnectionPoolExternalSyntheticLambda0 trustedWebActivityServiceConnectionPoolExternalSyntheticLambda0, ItemPartnerBinding itemPartnerBinding, setVirtualCameraRotationDegrees.b bVar, setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            Intrinsics.checkNotNullParameter(itemPartnerBinding, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = trustedWebActivityServiceConnectionPoolExternalSyntheticLambda0;
            Context context = trustedWebActivityServiceConnectionPoolExternalSyntheticLambda0.asBinder;
            Intrinsics.checkNotNullExpressionValue(context, "");
            CardView root = itemPartnerBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(context, root, null, null);
            this.TuitionPaymentFragmentbindingInflater1 = itemPartnerBinding;
        }

        @Override // defpackage.VirtualCameraInfo
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Partner partner) {
            final Partner partner2 = partner;
            Intrinsics.checkNotNullParameter(partner2, "");
            ItemPartnerBinding itemPartnerBinding = this.TuitionPaymentFragmentbindingInflater1;
            final TrustedWebActivityServiceConnectionPoolExternalSyntheticLambda0 trustedWebActivityServiceConnectionPoolExternalSyntheticLambda0 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            View view = this.itemView;
            itemPartnerBinding.tvLocationNamePartner.setText(partner2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            itemPartnerBinding.tvLocationDescPartner.setText(partner2.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            Intrinsics.checkNotNull(view);
            view.setOnClickListener(new isBound(new Function1() { // from class: serviceExistsForScope
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TrustedWebActivityServiceConnectionPoolExternalSyntheticLambda0.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(trustedWebActivityServiceConnectionPoolExternalSyntheticLambda0, partner2, (View) obj);
                }
            }));
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(TrustedWebActivityServiceConnectionPoolExternalSyntheticLambda0 trustedWebActivityServiceConnectionPoolExternalSyntheticLambda0, Partner partner, View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Function1<Partner, Unit> function1 = trustedWebActivityServiceConnectionPoolExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1;
            if (function1 != null) {
                function1.invoke(partner);
            }
            return Unit.INSTANCE;
        }
    }
}
