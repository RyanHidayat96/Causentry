package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.databinding.ItemMasterDataBinding;
import com.bpjstku.domain.asik.model.FamilyStatus;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u000fB7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"LisOutOfBounds;", "LsetVirtualCameraRotationDegrees;", "Lcom/bpjstku/domain/asik/model/FamilyStatus;", "LisOutOfBounds$TuitionPaymentFragmentbindingInflater1;", "Landroid/content/Context;", "p0", "", "p1", "Lkotlin/Function1;", "", "p2", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "", "TuitionPaymentFragmentbindingInflater1", "(Landroid/view/ViewGroup;)LisOutOfBounds$TuitionPaymentFragmentbindingInflater1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class isOutOfBounds extends setVirtualCameraRotationDegrees<FamilyStatus, TuitionPaymentFragmentbindingInflater1> {
    private final Function1<FamilyStatus, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    @Override // defpackage.setVirtualCameraRotationDegrees
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final /* synthetic */ VirtualCameraInfo onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentbindingInflater1(viewGroup);
    }

    @Override // defpackage.setVirtualCameraRotationDegrees, androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentbindingInflater1(viewGroup);
    }

    public /* synthetic */ isOutOfBounds(Context context, ArrayList arrayList, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new ArrayList() : arrayList, (i & 4) != 0 ? null : function1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    private isOutOfBounds(Context context, List<FamilyStatus> list, Function1<? super FamilyStatus, Unit> function1) {
        super(context, list);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function1;
    }

    private TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentbindingInflater1(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ItemMasterDataBinding itemMasterDataBindingInflate = ItemMasterDataBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(itemMasterDataBindingInflate, "");
        setVirtualCameraRotationDegrees.b bVar = this.f1400a;
        setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.asInterface;
        return new TuitionPaymentFragmentbindingInflater1(this, itemMasterDataBindingInflate, null, null);
    }

    public final class TuitionPaymentFragmentbindingInflater1 extends VirtualCameraInfo<FamilyStatus> {
        private /* synthetic */ isOutOfBounds TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private final ItemMasterDataBinding b;

        /* JADX WARN: Illegal instructions before constructor call */
        public TuitionPaymentFragmentbindingInflater1(isOutOfBounds isoutofbounds, ItemMasterDataBinding itemMasterDataBinding, setVirtualCameraRotationDegrees.b bVar, setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) throws Throwable {
            Intrinsics.checkNotNullParameter(itemMasterDataBinding, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = isoutofbounds;
            Context context = isoutofbounds.asBinder;
            Intrinsics.checkNotNullExpressionValue(context, "");
            RelativeLayout root = itemMasterDataBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(context, root, null, null);
            this.b = itemMasterDataBinding;
        }

        @Override // defpackage.VirtualCameraInfo
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(FamilyStatus familyStatus) throws Throwable {
            final FamilyStatus familyStatus2 = familyStatus;
            Intrinsics.checkNotNullParameter(familyStatus2, "");
            ItemMasterDataBinding itemMasterDataBinding = this.b;
            final isOutOfBounds isoutofbounds = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            itemMasterDataBinding.tvName.setText(familyStatus2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            if (familyStatus2.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                AppCompatImageView appCompatImageView = itemMasterDataBinding.imgSelected;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
                appCompatImageView.setVisibility(0);
            } else {
                AppCompatImageView appCompatImageView2 = itemMasterDataBinding.imgSelected;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
                appCompatImageView2.setVisibility(4);
            }
            RelativeLayout root = itemMasterDataBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            RelativeLayout relativeLayout = root;
            Function1 function1 = new Function1() { // from class: AppCompatDelegateImplAutoNightModeManager1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return isOutOfBounds.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(isoutofbounds, familyStatus2, (View) obj);
                }
            };
            Intrinsics.checkNotNullParameter(relativeLayout, "");
            Intrinsics.checkNotNullParameter(function1, "");
            relativeLayout.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function1));
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(isOutOfBounds isoutofbounds, FamilyStatus familyStatus, View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Function1 function1 = isoutofbounds.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (function1 != null) {
                function1.invoke(familyStatus);
            }
            return Unit.INSTANCE;
        }
    }
}
