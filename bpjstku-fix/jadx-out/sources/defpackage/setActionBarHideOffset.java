package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.databinding.ItemBpjsServiceBinding;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0014B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"LsetActionBarHideOffset;", "LsetVirtualCameraRotationDegrees;", "Lr8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4;", "LsetActionBarHideOffset$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "Landroid/content/Context;", "p0", "", "p1", "Lkotlin/Function1;", "", "p2", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/view/ViewGroup;)LsetActionBarHideOffset$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class setActionBarHideOffset extends setVirtualCameraRotationDegrees<r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4, TuitionPaymentFragmentspecialinlinedviewModeldefault1> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    final Function1<r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4, Unit> TuitionPaymentFragmentbindingInflater1;

    @Override // defpackage.setVirtualCameraRotationDegrees
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final /* synthetic */ VirtualCameraInfo onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(viewGroup);
    }

    @Override // defpackage.setVirtualCameraRotationDegrees, androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(viewGroup);
    }

    public /* synthetic */ setActionBarHideOffset(Context context, ArrayList arrayList, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new ArrayList() : arrayList, (i & 4) != 0 ? null : function1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public setActionBarHideOffset(Context context, List<r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4> list, Function1<? super r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4, Unit> function1) {
        super(context, list);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.TuitionPaymentFragmentbindingInflater1 = function1;
    }

    private TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault2(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ItemBpjsServiceBinding itemBpjsServiceBindingInflate = ItemBpjsServiceBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(itemBpjsServiceBindingInflate, "");
        setVirtualCameraRotationDegrees.b bVar = this.f1400a;
        setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.asInterface;
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault1(this, itemBpjsServiceBindingInflate, null, null);
    }

    public final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 extends VirtualCameraInfo<r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4> {
        private /* synthetic */ setActionBarHideOffset TuitionPaymentFragmentbindingInflater1;
        private final ItemBpjsServiceBinding b;

        /* JADX WARN: Illegal instructions before constructor call */
        public TuitionPaymentFragmentspecialinlinedviewModeldefault1(setActionBarHideOffset setactionbarhideoffset, ItemBpjsServiceBinding itemBpjsServiceBinding, setVirtualCameraRotationDegrees.b bVar, setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            Intrinsics.checkNotNullParameter(itemBpjsServiceBinding, "");
            this.TuitionPaymentFragmentbindingInflater1 = setactionbarhideoffset;
            Context context = setactionbarhideoffset.asBinder;
            Intrinsics.checkNotNullExpressionValue(context, "");
            ConstraintLayout root = itemBpjsServiceBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(context, root, null, null);
            this.b = itemBpjsServiceBinding;
        }

        @Override // defpackage.VirtualCameraInfo
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs4) {
            final r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs5 = r8lambdai2xi7mochmmaz9qzzewheaxs4;
            Intrinsics.checkNotNullParameter(r8lambdai2xi7mochmmaz9qzzewheaxs5, "");
            ItemBpjsServiceBinding itemBpjsServiceBinding = this.b;
            final setActionBarHideOffset setactionbarhideoffset = this.TuitionPaymentFragmentbindingInflater1;
            itemBpjsServiceBinding.imgService.setImageResource(r8lambdai2xi7mochmmaz9qzzewheaxs5.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            itemBpjsServiceBinding.tvServiceName.setText(r8lambdai2xi7mochmmaz9qzzewheaxs5.TuitionPaymentFragmentbindingInflater1);
            ConstraintLayout root = itemBpjsServiceBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            ConstraintLayout constraintLayout = root;
            Function1 function1 = new Function1() { // from class: setHasNonEmbeddedTabs
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return setActionBarHideOffset.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(setactionbarhideoffset, r8lambdai2xi7mochmmaz9qzzewheaxs5, (View) obj);
                }
            };
            Intrinsics.checkNotNullParameter(constraintLayout, "");
            Intrinsics.checkNotNullParameter(function1, "");
            constraintLayout.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function1));
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(setActionBarHideOffset setactionbarhideoffset, r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs4, View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Function1<r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4, Unit> function1 = setactionbarhideoffset.TuitionPaymentFragmentbindingInflater1;
            if (function1 != null) {
                function1.invoke(r8lambdai2xi7mochmmaz9qzzewheaxs4);
            }
            return Unit.INSTANCE;
        }
    }
}
