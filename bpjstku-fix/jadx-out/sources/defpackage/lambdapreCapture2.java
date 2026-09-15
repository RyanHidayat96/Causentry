package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.databinding.ItemProgramServiceBinding;
import com.bpjstku.domain.jkm.model.JkmService;
import com.google.android.material.card.MaterialCardView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u000fB7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"LlambdapreCapture2;", "LsetVirtualCameraRotationDegrees;", "Lcom/bpjstku/domain/jkm/model/JkmService;", "LlambdapreCapture2$b;", "Landroid/content/Context;", "p0", "", "p1", "Lkotlin/Function1;", "", "p2", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "", "b", "(Landroid/view/ViewGroup;)LlambdapreCapture2$b;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class lambdapreCapture2 extends setVirtualCameraRotationDegrees<JkmService, b> {
    final Function1<JkmService, Unit> TuitionPaymentFragmentbindingInflater1;

    @Override // defpackage.setVirtualCameraRotationDegrees
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final /* synthetic */ VirtualCameraInfo onCreateViewHolder(ViewGroup viewGroup, int i) {
        return b(viewGroup);
    }

    @Override // defpackage.setVirtualCameraRotationDegrees, androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return b(viewGroup);
    }

    public /* synthetic */ lambdapreCapture2(Context context, ArrayList arrayList, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new ArrayList() : arrayList, (i & 4) != 0 ? null : function1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lambdapreCapture2(Context context, List<JkmService> list, Function1<? super JkmService, Unit> function1) {
        super(context, list);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.TuitionPaymentFragmentbindingInflater1 = function1;
    }

    private b b(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ItemProgramServiceBinding itemProgramServiceBindingInflate = ItemProgramServiceBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(itemProgramServiceBindingInflate, "");
        setVirtualCameraRotationDegrees.b bVar = this.f1400a;
        setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.asInterface;
        return new b(this, itemProgramServiceBindingInflate, null, null);
    }

    public final class b extends VirtualCameraInfo<JkmService> {
        private final ItemProgramServiceBinding TuitionPaymentFragmentbindingInflater1;
        private /* synthetic */ lambdapreCapture2 TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(lambdapreCapture2 lambdaprecapture2, ItemProgramServiceBinding itemProgramServiceBinding, setVirtualCameraRotationDegrees.b bVar, setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            Intrinsics.checkNotNullParameter(itemProgramServiceBinding, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = lambdaprecapture2;
            Context context = lambdaprecapture2.asBinder;
            Intrinsics.checkNotNullExpressionValue(context, "");
            MaterialCardView root = itemProgramServiceBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(context, root, null, null);
            this.TuitionPaymentFragmentbindingInflater1 = itemProgramServiceBinding;
        }

        @Override // defpackage.VirtualCameraInfo
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(JkmService jkmService) {
            final JkmService jkmService2 = jkmService;
            Intrinsics.checkNotNullParameter(jkmService2, "");
            ItemProgramServiceBinding itemProgramServiceBinding = this.TuitionPaymentFragmentbindingInflater1;
            final lambdapreCapture2 lambdaprecapture2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            itemProgramServiceBinding.imgIcon.setImageResource(jkmService2.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            itemProgramServiceBinding.tvTitle.setText(jkmService2.b);
            itemProgramServiceBinding.tvDesc.setText(jkmService2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            MaterialCardView root = itemProgramServiceBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            MaterialCardView materialCardView = root;
            Function1 function1 = new Function1() { // from class: onCompleted
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return lambdapreCapture2.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(lambdaprecapture2, jkmService2, (View) obj);
                }
            };
            Intrinsics.checkNotNullParameter(materialCardView, "");
            Intrinsics.checkNotNullParameter(function1, "");
            materialCardView.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function1));
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(lambdapreCapture2 lambdaprecapture2, JkmService jkmService, View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Function1<JkmService, Unit> function1 = lambdaprecapture2.TuitionPaymentFragmentbindingInflater1;
            if (function1 != null) {
                function1.invoke(jkmService);
            }
            return Unit.INSTANCE;
        }
    }
}
