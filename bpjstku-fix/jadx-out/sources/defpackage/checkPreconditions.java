package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.databinding.ItemFaqSyariahBinding;
import com.bpjstku.presentation.syariah.model.FaqSyariahModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\fB\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e"}, d2 = {"LcheckPreconditions;", "LsetVirtualCameraRotationDegrees;", "Lcom/bpjstku/presentation/syariah/model/FaqSyariahModel;", "LcheckPreconditions$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "Landroid/content/Context;", "p0", "", "p1", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "Landroid/view/ViewGroup;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/view/ViewGroup;)LcheckPreconditions$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "Landroid/content/Context;", "b"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class checkPreconditions extends setVirtualCameraRotationDegrees<FaqSyariahModel, TuitionPaymentFragmentspecialinlinedviewModeldefault1> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Context b;

    @Override // defpackage.setVirtualCameraRotationDegrees
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final /* bridge */ /* synthetic */ VirtualCameraInfo onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(viewGroup);
    }

    @Override // defpackage.setVirtualCameraRotationDegrees, androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(viewGroup);
    }

    public /* synthetic */ checkPreconditions(Context context, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new ArrayList() : arrayList);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public checkPreconditions(Context context, List<FaqSyariahModel> list) {
        super(context, list);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.b = context;
    }

    private TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault1(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ItemFaqSyariahBinding itemFaqSyariahBindingInflate = ItemFaqSyariahBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(itemFaqSyariahBindingInflate, "");
        setVirtualCameraRotationDegrees.b bVar = this.f1400a;
        setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.asInterface;
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault1(this, itemFaqSyariahBindingInflate, null, null);
    }

    public final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 extends VirtualCameraInfo<FaqSyariahModel> {
        private /* synthetic */ checkPreconditions TuitionPaymentFragmentbindingInflater1;
        private final ItemFaqSyariahBinding TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX WARN: Illegal instructions before constructor call */
        public TuitionPaymentFragmentspecialinlinedviewModeldefault1(checkPreconditions checkpreconditions, ItemFaqSyariahBinding itemFaqSyariahBinding, setVirtualCameraRotationDegrees.b bVar, setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            Intrinsics.checkNotNullParameter(itemFaqSyariahBinding, "");
            this.TuitionPaymentFragmentbindingInflater1 = checkpreconditions;
            Context context = checkpreconditions.asBinder;
            Intrinsics.checkNotNullExpressionValue(context, "");
            CardView root = itemFaqSyariahBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(context, root, null, null);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = itemFaqSyariahBinding;
        }

        @Override // defpackage.VirtualCameraInfo
        public final /* bridge */ /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(FaqSyariahModel faqSyariahModel) {
            final FaqSyariahModel faqSyariahModel2 = faqSyariahModel;
            Intrinsics.checkNotNullParameter(faqSyariahModel2, "");
            final ItemFaqSyariahBinding itemFaqSyariahBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            itemFaqSyariahBinding.questionFaqSyariah.setText(faqSyariahModel2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            itemFaqSyariahBinding.answerFaqSyariah.setText(faqSyariahModel2.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            itemFaqSyariahBinding.expandableLayout.setVisibility(faqSyariahModel2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ? 0 : 8);
            LinearLayout linearLayout = itemFaqSyariahBinding.llFaq;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            AutoValue_MediaSpec1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(linearLayout, new Function0() { // from class: checkPhysicalCameraIdValid
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return checkPreconditions.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(faqSyariahModel2, itemFaqSyariahBinding);
                }
            });
        }

        public static /* synthetic */ Unit b(FaqSyariahModel faqSyariahModel, ItemFaqSyariahBinding itemFaqSyariahBinding) {
            faqSyariahModel.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = !faqSyariahModel.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            itemFaqSyariahBinding.expandableLayout.setVisibility(faqSyariahModel.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ? 0 : 8);
            if (faqSyariahModel.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                itemFaqSyariahBinding.questionFaqSyariah.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_arrow_up_green, 0);
            } else {
                itemFaqSyariahBinding.questionFaqSyariah.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_arrow_down, 0);
            }
            return Unit.INSTANCE;
        }
    }
}
