package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.databinding.ItemLoadmoreSecondBinding;
import com.bpjstku.databinding.ItemVoucherBinding;
import com.bpjstku.domain.promo.model.VoucherItem;
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
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0001:\u0001\u001bB7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"LlambdastartFocusAndMetering1androidxcameracamera2internalFocusMeteringControl;", "LclearCaptureRequestOptionsInternal;", "Lcom/bpjstku/domain/promo/model/VoucherItem;", "LfailInFlightUpdate;", "Landroid/content/Context;", "p0", "", "p1", "Lkotlin/Function1;", "", "p2", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "", "getItemViewType", "(I)I", "getItemCount", "()I", "Landroid/view/ViewGroup;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/view/ViewGroup;I)LfailInFlightUpdate;", "asInterface", "Landroid/content/Context;", "TuitionPaymentFragmentbindingInflater1", "cancel", "Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class lambdastartFocusAndMetering1androidxcameracamera2internalFocusMeteringControl extends clearCaptureRequestOptionsInternal<VoucherItem, failInFlightUpdate<VoucherItem>> {

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Context TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private final Function1<VoucherItem, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    @Override // defpackage.clearCaptureRequestOptionsInternal, androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return onCreateViewHolder(viewGroup, i);
    }

    public /* synthetic */ lambdastartFocusAndMetering1androidxcameracamera2internalFocusMeteringControl(Context context, ArrayList arrayList, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new ArrayList() : arrayList, (i & 4) != 0 ? null : function1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    private lambdastartFocusAndMetering1androidxcameracamera2internalFocusMeteringControl(Context context, List<VoucherItem> list, Function1<? super VoucherItem, Unit> function1) {
        super(context, list);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.TuitionPaymentFragmentbindingInflater1 = context;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function1;
    }

    @Override // defpackage.clearCaptureRequestOptionsInternal
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3 */
    public final failInFlightUpdate<VoucherItem> onCreateViewHolder(ViewGroup p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (p1 == 985213) {
            Context context = this.TuitionPaymentFragmentbindingInflater1;
            ItemVoucherBinding itemVoucherBindingInflate = ItemVoucherBinding.inflate(LayoutInflater.from(p0.getContext()), p0, false);
            Intrinsics.checkNotNullExpressionValue(itemVoucherBindingInflate, "");
            clearCaptureRequestOptionsInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.asBinder;
            clearCaptureRequestOptionsInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.g;
            return new b(this, context, itemVoucherBindingInflate, null, null);
        }
        if (p1 == 981923) {
            Context context2 = this.TuitionPaymentFragmentbindingInflater1;
            ItemLoadmoreSecondBinding itemLoadmoreSecondBindingInflate = ItemLoadmoreSecondBinding.inflate(LayoutInflater.from(p0.getContext()), p0, false);
            Intrinsics.checkNotNullExpressionValue(itemLoadmoreSecondBindingInflate, "");
            clearCaptureRequestOptionsInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault4 = this.asBinder;
            clearCaptureRequestOptionsInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault5 = this.g;
            clearCaptureRequestOptionsInternal.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            Boolean bool = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Intrinsics.checkNotNullExpressionValue(bool, "");
            boolean zBooleanValue = bool.booleanValue();
            Integer num = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Intrinsics.checkNotNullExpressionValue(num, "");
            int iIntValue = num.intValue();
            Integer num2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Intrinsics.checkNotNullExpressionValue(num2, "");
            return new applyOptionsToBuilder(context2, itemLoadmoreSecondBindingInflate, null, null, tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3, zBooleanValue, iIntValue, num2.intValue());
        }
        Context context3 = this.TuitionPaymentFragmentbindingInflater1;
        ItemLoadmoreSecondBinding itemLoadmoreSecondBindingInflate2 = ItemLoadmoreSecondBinding.inflate(LayoutInflater.from(p0.getContext()), p0, false);
        Intrinsics.checkNotNullExpressionValue(itemLoadmoreSecondBindingInflate2, "");
        clearCaptureRequestOptionsInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault6 = this.asBinder;
        clearCaptureRequestOptionsInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault7 = this.g;
        clearCaptureRequestOptionsInternal.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        Boolean bool2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Intrinsics.checkNotNullExpressionValue(bool2, "");
        boolean zBooleanValue2 = bool2.booleanValue();
        Integer num3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Intrinsics.checkNotNullExpressionValue(num3, "");
        int iIntValue2 = num3.intValue();
        Integer num4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Intrinsics.checkNotNullExpressionValue(num4, "");
        return new applyOptionsToBuilder(context3, itemLoadmoreSecondBindingInflate2, null, null, tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault4, zBooleanValue2, iIntValue2, num4.intValue());
    }

    public final class b extends failInFlightUpdate<VoucherItem> {
        private final ItemVoucherBinding TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private /* synthetic */ lambdastartFocusAndMetering1androidxcameracamera2internalFocusMeteringControl b;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(lambdastartFocusAndMetering1androidxcameracamera2internalFocusMeteringControl lambdastartfocusandmetering1androidxcameracamera2internalfocusmeteringcontrol, Context context, ItemVoucherBinding itemVoucherBinding, clearCaptureRequestOptionsInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, clearCaptureRequestOptionsInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(itemVoucherBinding, "");
            this.b = lambdastartfocusandmetering1androidxcameracamera2internalfocusmeteringcontrol;
            MaterialCardView root = itemVoucherBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(context, root, null, null);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = itemVoucherBinding;
        }

        @Override // defpackage.failInFlightUpdate
        public final /* synthetic */ void TuitionPaymentFragmentbindingInflater1(VoucherItem voucherItem) {
            final VoucherItem voucherItem2 = voucherItem;
            ItemVoucherBinding itemVoucherBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            final lambdastartFocusAndMetering1androidxcameracamera2internalFocusMeteringControl lambdastartfocusandmetering1androidxcameracamera2internalfocusmeteringcontrol = this.b;
            if (voucherItem2 != null) {
                ImageView imageView = itemVoucherBinding.imgVoucher;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                bind.TuitionPaymentFragmentspecialinlinedviewModeldefault2(imageView, lambdastartfocusandmetering1androidxcameracamera2internalfocusmeteringcontrol.TuitionPaymentFragmentbindingInflater1, voucherItem2.cancelAll, R.drawable.ic_placeholder, R.drawable.ic_placeholder, false);
                itemVoucherBinding.tvTitleVoucher.setText(voucherItem2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                itemVoucherBinding.tvDescVoucher.setText(voucherItem2.notify);
                if (voucherItem2.INotificationSideChannelDefault.length() == 0) {
                    itemVoucherBinding.tvLocation.setVisibility(8);
                } else {
                    itemVoucherBinding.tvLocation.setVisibility(0);
                    itemVoucherBinding.tvLocation.setText(voucherItem2.INotificationSideChannelDefault);
                }
                MaterialButton materialButton = itemVoucherBinding.btnDetail;
                Intrinsics.checkNotNullExpressionValue(materialButton, "");
                MaterialButton materialButton2 = materialButton;
                Function1 function1 = new Function1() { // from class: lambdaexecuteMeteringAction9androidxcameracamera2internalFocusMeteringControl
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return lambdastartFocusAndMetering1androidxcameracamera2internalFocusMeteringControl.b.b(lambdastartfocusandmetering1androidxcameracamera2internalfocusmeteringcontrol, voucherItem2, (View) obj);
                    }
                };
                Intrinsics.checkNotNullParameter(materialButton2, "");
                Intrinsics.checkNotNullParameter(function1, "");
                materialButton2.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function1));
                MaterialCardView root = itemVoucherBinding.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                MaterialCardView materialCardView = root;
                Function1 function2 = new Function1() { // from class: lambdatriggerAePrecapture3androidxcameracamera2internalFocusMeteringControl
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return lambdastartFocusAndMetering1androidxcameracamera2internalFocusMeteringControl.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(lambdastartfocusandmetering1androidxcameracamera2internalfocusmeteringcontrol, voucherItem2, (View) obj);
                    }
                };
                Intrinsics.checkNotNullParameter(materialCardView, "");
                Intrinsics.checkNotNullParameter(function2, "");
                materialCardView.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function2));
            }
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(lambdastartFocusAndMetering1androidxcameracamera2internalFocusMeteringControl lambdastartfocusandmetering1androidxcameracamera2internalfocusmeteringcontrol, VoucherItem voucherItem, View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Function1 function1 = lambdastartfocusandmetering1androidxcameracamera2internalfocusmeteringcontrol.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (function1 != null) {
                function1.invoke(voucherItem);
            }
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit b(lambdastartFocusAndMetering1androidxcameracamera2internalFocusMeteringControl lambdastartfocusandmetering1androidxcameracamera2internalfocusmeteringcontrol, VoucherItem voucherItem, View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Function1 function1 = lambdastartfocusandmetering1androidxcameracamera2internalfocusmeteringcontrol.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (function1 != null) {
                function1.invoke(voucherItem);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // defpackage.clearCaptureRequestOptionsInternal, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.TuitionPaymentFragmentbindingInflater1.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int p0) {
        List<Data> list = this.TuitionPaymentFragmentbindingInflater1;
        Intrinsics.checkNotNullExpressionValue(list, "");
        return CollectionsKt.getOrNull(list, p0) != null ? 985213 : 981923;
    }
}
