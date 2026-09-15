package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.databinding.ItemTncMerchantBinding;
import com.bpjstku.domain.promo.model.SyaratMerchant;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u000eB\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\f\u0010\r"}, d2 = {"LtriggerAf;", "LsetVirtualCameraRotationDegrees;", "Lcom/bpjstku/domain/promo/model/SyaratMerchant;", "LtriggerAf$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "Landroid/content/Context;", "p0", "", "p1", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "Landroid/view/ViewGroup;", "", "b", "(Landroid/view/ViewGroup;)LtriggerAf$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class triggerAf extends setVirtualCameraRotationDegrees<SyaratMerchant, TuitionPaymentFragmentspecialinlinedviewModeldefault2> {
    @Override // defpackage.setVirtualCameraRotationDegrees
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final /* synthetic */ VirtualCameraInfo onCreateViewHolder(ViewGroup viewGroup, int i) {
        return b(viewGroup);
    }

    @Override // defpackage.setVirtualCameraRotationDegrees, androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return b(viewGroup);
    }

    public /* synthetic */ triggerAf(Context context, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new ArrayList() : arrayList);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public triggerAf(Context context, List<SyaratMerchant> list) {
        super(context, list);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
    }

    private TuitionPaymentFragmentspecialinlinedviewModeldefault2 b(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ItemTncMerchantBinding itemTncMerchantBindingInflate = ItemTncMerchantBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(itemTncMerchantBindingInflate, "");
        setVirtualCameraRotationDegrees.b bVar = this.f1400a;
        setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.asInterface;
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, itemTncMerchantBindingInflate, null, null);
    }

    public final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends VirtualCameraInfo<SyaratMerchant> {
        private final ItemTncMerchantBinding TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private /* synthetic */ triggerAf b;

        /* JADX WARN: Illegal instructions before constructor call */
        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(triggerAf triggeraf, ItemTncMerchantBinding itemTncMerchantBinding, setVirtualCameraRotationDegrees.b bVar, setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            Intrinsics.checkNotNullParameter(itemTncMerchantBinding, "");
            this.b = triggeraf;
            Context context = triggeraf.asBinder;
            Intrinsics.checkNotNullExpressionValue(context, "");
            ConstraintLayout root = itemTncMerchantBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(context, root, null, null);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = itemTncMerchantBinding;
        }

        @Override // defpackage.VirtualCameraInfo
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(SyaratMerchant syaratMerchant) {
            SyaratMerchant syaratMerchant2 = syaratMerchant;
            Intrinsics.checkNotNullParameter(syaratMerchant2, "");
            ItemTncMerchantBinding itemTncMerchantBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (syaratMerchant2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.length() == 0) {
                itemTncMerchantBinding.tvProgramTitle.setVisibility(8);
                TextView textView = itemTncMerchantBinding.tvProgramDescription;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                TextView textView2 = textView;
                ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
                if (layoutParams != null) {
                    ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                    layoutParams2.topToTop = R.id.iconInfoProgram;
                    textView2.setLayoutParams(layoutParams2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
            } else {
                itemTncMerchantBinding.tvProgramTitle.setVisibility(0);
                itemTncMerchantBinding.tvProgramTitle.setText(syaratMerchant2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            if (syaratMerchant2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.length() > 0) {
                itemTncMerchantBinding.tvProgramDescription.setVisibility(0);
                itemTncMerchantBinding.tvProgramDescription.setText(syaratMerchant2.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
        }
    }
}
