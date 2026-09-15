package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.databinding.ItemLoadMoreBinding;
import com.bpjstku.databinding.ItemMerchantBinding;
import com.bpjstku.domain.promo.model.ListMerchant;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0001:\u0001\u0019B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"LlambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl;", "LaddCaptureRequestOptionsInternal;", "Lcom/bpjstku/domain/promo/model/ListMerchant;", "Lr8lambdaSY9Ab4YLo6l9dbvVF3wIMCq470;", "Landroid/content/Context;", "p0", "", "p1", "Lkotlin/Function1;", "", "p2", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "", "getItemViewType", "(I)I", "getItemCount", "()I", "Landroid/view/ViewGroup;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/view/ViewGroup;I)Lr8lambdaSY9Ab4YLo6l9dbvVF3wIMCq470;", "Landroid/content/Context;", "b", "cancelAll", "Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl extends addCaptureRequestOptionsInternal<ListMerchant, r8lambdaSY9Ab4YLo6l9dbvVF3wIMCq470<ListMerchant>> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Context b;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private final Function1<ListMerchant, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    @Override // defpackage.addCaptureRequestOptionsInternal, androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return onCreateViewHolder(viewGroup, i);
    }

    public /* synthetic */ lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl(Context context, ArrayList arrayList, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new ArrayList() : arrayList, (i & 4) != 0 ? null : function1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    private lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl(Context context, List<ListMerchant> list, Function1<? super ListMerchant, Unit> function1) {
        super(context, list);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.b = context;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function1;
    }

    @Override // defpackage.addCaptureRequestOptionsInternal
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final r8lambdaSY9Ab4YLo6l9dbvVF3wIMCq470<ListMerchant> onCreateViewHolder(ViewGroup p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (p1 == 985213) {
            Context context = this.b;
            ItemMerchantBinding itemMerchantBindingInflate = ItemMerchantBinding.inflate(LayoutInflater.from(p0.getContext()), p0, false);
            Intrinsics.checkNotNullExpressionValue(itemMerchantBindingInflate, "");
            addCaptureRequestOptionsInternal.b bVar = this.d;
            addCaptureRequestOptionsInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.asBinder;
            return new TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, context, itemMerchantBindingInflate, null, null);
        }
        if (p1 == 981923) {
            Context context2 = this.b;
            ItemLoadMoreBinding itemLoadMoreBindingInflate = ItemLoadMoreBinding.inflate(LayoutInflater.from(p0.getContext()), p0, false);
            Intrinsics.checkNotNullExpressionValue(itemLoadMoreBindingInflate, "");
            addCaptureRequestOptionsInternal.b bVar2 = this.d;
            addCaptureRequestOptionsInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault4 = this.asBinder;
            addCaptureRequestOptionsInternal.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            Boolean boolTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            Intrinsics.checkNotNullExpressionValue(boolTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
            boolean zBooleanValue = boolTuitionPaymentFragmentspecialinlinedviewModeldefault3.booleanValue();
            Integer num = this.b;
            Intrinsics.checkNotNullExpressionValue(num, "");
            int iIntValue = num.intValue();
            Integer num2 = this.TuitionPaymentFragmentbindingInflater1;
            Intrinsics.checkNotNullExpressionValue(num2, "");
            return new updateConfig(context2, itemLoadMoreBindingInflate, null, null, tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault2, zBooleanValue, iIntValue, num2.intValue());
        }
        Context context3 = this.b;
        ItemLoadMoreBinding itemLoadMoreBindingInflate2 = ItemLoadMoreBinding.inflate(LayoutInflater.from(p0.getContext()), p0, false);
        Intrinsics.checkNotNullExpressionValue(itemLoadMoreBindingInflate2, "");
        addCaptureRequestOptionsInternal.b bVar3 = this.d;
        addCaptureRequestOptionsInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault5 = this.asBinder;
        addCaptureRequestOptionsInternal.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        Boolean boolTuitionPaymentFragmentspecialinlinedviewModeldefault4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        Intrinsics.checkNotNullExpressionValue(boolTuitionPaymentFragmentspecialinlinedviewModeldefault4, "");
        boolean zBooleanValue2 = boolTuitionPaymentFragmentspecialinlinedviewModeldefault4.booleanValue();
        Integer num3 = this.b;
        Intrinsics.checkNotNullExpressionValue(num3, "");
        int iIntValue2 = num3.intValue();
        Integer num4 = this.TuitionPaymentFragmentbindingInflater1;
        Intrinsics.checkNotNullExpressionValue(num4, "");
        return new updateConfig(context3, itemLoadMoreBindingInflate2, null, null, tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3, zBooleanValue2, iIntValue2, num4.intValue());
    }

    public final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends r8lambdaSY9Ab4YLo6l9dbvVF3wIMCq470<ListMerchant> {
        private final ItemMerchantBinding TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private /* synthetic */ lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl b;

        /* JADX WARN: Illegal instructions before constructor call */
        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl lambdastartfocusandmetering0androidxcameracamera2internalfocusmeteringcontrol, Context context, ItemMerchantBinding itemMerchantBinding, addCaptureRequestOptionsInternal.b bVar, addCaptureRequestOptionsInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(itemMerchantBinding, "");
            this.b = lambdastartfocusandmetering0androidxcameracamera2internalfocusmeteringcontrol;
            MaterialCardView root = itemMerchantBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(context, root, null, null);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = itemMerchantBinding;
        }

        @Override // defpackage.r8lambdaSY9Ab4YLo6l9dbvVF3wIMCq470
        public final /* bridge */ /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ListMerchant listMerchant) {
            final ListMerchant listMerchant2 = listMerchant;
            ItemMerchantBinding itemMerchantBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            final lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl lambdastartfocusandmetering0androidxcameracamera2internalfocusmeteringcontrol = this.b;
            if (listMerchant2 != null) {
                ImageView imageView = itemMerchantBinding.imgMerchant;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                bind.TuitionPaymentFragmentspecialinlinedviewModeldefault2(imageView, lambdastartfocusandmetering0androidxcameracamera2internalfocusmeteringcontrol.b, listMerchant2.onTransact, R.drawable.ic_placeholder, R.drawable.ic_placeholder, false);
                itemMerchantBinding.tvTitleMerchant.setText(listMerchant2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                itemMerchantBinding.tvDescMerchant.setText(listMerchant2.cancelAll);
                if (listMerchant2.RemoteActionCompatParcelizer.length() == 0) {
                    itemMerchantBinding.tvLocation.setVisibility(8);
                } else {
                    itemMerchantBinding.tvLocation.setVisibility(0);
                    itemMerchantBinding.tvLocation.setText(listMerchant2.RemoteActionCompatParcelizer);
                }
                MaterialButton materialButton = itemMerchantBinding.btnDetail;
                Intrinsics.checkNotNullExpressionValue(materialButton, "");
                MaterialButton materialButton2 = materialButton;
                lambdaexecuteMeteringAction8androidxcameracamera2internalFocusMeteringControl lambdaexecutemeteringaction8androidxcameracamera2internalfocusmeteringcontrol = new lambdaexecuteMeteringAction8androidxcameracamera2internalFocusMeteringControl(lambdastartfocusandmetering0androidxcameracamera2internalfocusmeteringcontrol, listMerchant2);
                Intrinsics.checkNotNullParameter(materialButton2, "");
                Intrinsics.checkNotNullParameter(lambdaexecutemeteringaction8androidxcameracamera2internalfocusmeteringcontrol, "");
                materialButton2.setOnClickListener(new UseFlashModeTorchFor3aUpdate(lambdaexecutemeteringaction8androidxcameracamera2internalfocusmeteringcontrol));
                MaterialCardView root = itemMerchantBinding.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                MaterialCardView materialCardView = root;
                Function1 function1 = new Function1() { // from class: lambdatriggerAePrecapture2androidxcameracamera2internalFocusMeteringControl
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(lambdastartfocusandmetering0androidxcameracamera2internalfocusmeteringcontrol, listMerchant2, (View) obj);
                    }
                };
                Intrinsics.checkNotNullParameter(materialCardView, "");
                Intrinsics.checkNotNullParameter(function1, "");
                materialCardView.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function1));
            }
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl lambdastartfocusandmetering0androidxcameracamera2internalfocusmeteringcontrol, ListMerchant listMerchant, View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Function1 function1 = lambdastartfocusandmetering0androidxcameracamera2internalfocusmeteringcontrol.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (function1 != null) {
                function1.invoke(listMerchant);
            }
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(lambdastartFocusAndMetering0androidxcameracamera2internalFocusMeteringControl lambdastartfocusandmetering0androidxcameracamera2internalfocusmeteringcontrol, ListMerchant listMerchant, View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Function1 function1 = lambdastartfocusandmetering0androidxcameracamera2internalfocusmeteringcontrol.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (function1 != null) {
                function1.invoke(listMerchant);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // defpackage.addCaptureRequestOptionsInternal, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int p0) {
        List<Data> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Intrinsics.checkNotNullExpressionValue(list, "");
        return CollectionsKt.getOrNull(list, p0) != null ? 985213 : 981923;
    }
}
