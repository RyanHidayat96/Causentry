package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.databinding.ItemRegionalOfficeBinding;
import com.bpjstku.domain.branchoffice.model.RegionalOffice;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0013B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"LonContentScrollStopped;", "LsetVirtualCameraRotationDegrees;", "Lcom/bpjstku/domain/branchoffice/model/RegionalOffice;", "LonContentScrollStopped$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "Landroid/content/Context;", "p0", "", "p1", "Lkotlin/Function1;", "", "p2", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/view/ViewGroup;)LonContentScrollStopped$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class onContentScrollStopped extends setVirtualCameraRotationDegrees<RegionalOffice, TuitionPaymentFragmentspecialinlinedviewModeldefault3> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    final Function1<RegionalOffice, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Override // defpackage.setVirtualCameraRotationDegrees
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final /* bridge */ /* synthetic */ VirtualCameraInfo onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(viewGroup);
    }

    @Override // defpackage.setVirtualCameraRotationDegrees, androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(viewGroup);
    }

    public /* synthetic */ onContentScrollStopped(Context context, ArrayList arrayList, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new ArrayList() : arrayList, (i & 4) != 0 ? null : function1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public onContentScrollStopped(Context context, List<RegionalOffice> list, Function1<? super RegionalOffice, Unit> function1) {
        super(context, list);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = function1;
    }

    private TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault1(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ItemRegionalOfficeBinding itemRegionalOfficeBindingInflate = ItemRegionalOfficeBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(itemRegionalOfficeBindingInflate, "");
        setVirtualCameraRotationDegrees.b bVar = this.f1400a;
        setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.asInterface;
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, itemRegionalOfficeBindingInflate, null, null);
    }

    public final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends VirtualCameraInfo<RegionalOffice> {
        private /* synthetic */ onContentScrollStopped TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private final ItemRegionalOfficeBinding TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX WARN: Illegal instructions before constructor call */
        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(onContentScrollStopped oncontentscrollstopped, ItemRegionalOfficeBinding itemRegionalOfficeBinding, setVirtualCameraRotationDegrees.b bVar, setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            Intrinsics.checkNotNullParameter(itemRegionalOfficeBinding, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = oncontentscrollstopped;
            Context context = oncontentscrollstopped.asBinder;
            Intrinsics.checkNotNullExpressionValue(context, "");
            ConstraintLayout root = itemRegionalOfficeBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(context, root, null, null);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = itemRegionalOfficeBinding;
        }

        @Override // defpackage.VirtualCameraInfo
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(RegionalOffice regionalOffice) {
            final RegionalOffice regionalOffice2 = regionalOffice;
            Intrinsics.checkNotNullParameter(regionalOffice2, "");
            ItemRegionalOfficeBinding itemRegionalOfficeBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            final onContentScrollStopped oncontentscrollstopped = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            itemRegionalOfficeBinding.tvNameLocationBranchOFfice.setText(regionalOffice2.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            itemRegionalOfficeBinding.tvDescLocationBranchOFfice.setText(regionalOffice2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            ConstraintLayout root = itemRegionalOfficeBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            root.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: WindowDecorActionBar1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return onContentScrollStopped.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(oncontentscrollstopped, regionalOffice2, (View) obj);
                }
            }));
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(onContentScrollStopped oncontentscrollstopped, RegionalOffice regionalOffice, View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Function1<RegionalOffice, Unit> function1 = oncontentscrollstopped.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (function1 != null) {
                function1.invoke(regionalOffice);
            }
            return Unit.INSTANCE;
        }
    }
}
