package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.databinding.ItemMasterDataBinding;
import com.bpjstku.presentation.account.model.ItemAutodebitParticipant;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0013B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"LinvalidateOptionsMenu;", "LsetVirtualCameraRotationDegrees;", "Lcom/bpjstku/presentation/account/model/ItemAutodebitParticipant;", "LinvalidateOptionsMenu$TuitionPaymentFragmentbindingInflater1;", "Landroid/content/Context;", "p0", "", "p1", "Lkotlin/Function1;", "", "p2", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/view/ViewGroup;)LinvalidateOptionsMenu$TuitionPaymentFragmentbindingInflater1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class invalidateOptionsMenu extends setVirtualCameraRotationDegrees<ItemAutodebitParticipant, TuitionPaymentFragmentbindingInflater1> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Function1<ItemAutodebitParticipant, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    @Override // defpackage.setVirtualCameraRotationDegrees
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final /* bridge */ /* synthetic */ VirtualCameraInfo onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(viewGroup);
    }

    @Override // defpackage.setVirtualCameraRotationDegrees, androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(viewGroup);
    }

    public /* synthetic */ invalidateOptionsMenu(Context context, ArrayList arrayList, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new ArrayList() : arrayList, (i & 4) != 0 ? null : function1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    private invalidateOptionsMenu(Context context, List<ItemAutodebitParticipant> list, Function1<? super ItemAutodebitParticipant, Unit> function1) {
        super(context, list);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function1;
    }

    private TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault1(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ItemMasterDataBinding itemMasterDataBindingInflate = ItemMasterDataBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(itemMasterDataBindingInflate, "");
        setVirtualCameraRotationDegrees.b bVar = this.f1400a;
        setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.asInterface;
        return new TuitionPaymentFragmentbindingInflater1(this, itemMasterDataBindingInflate, null, null);
    }

    public final class TuitionPaymentFragmentbindingInflater1 extends VirtualCameraInfo<ItemAutodebitParticipant> {
        private /* synthetic */ invalidateOptionsMenu TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private final ItemMasterDataBinding b;

        /* JADX WARN: Illegal instructions before constructor call */
        public TuitionPaymentFragmentbindingInflater1(invalidateOptionsMenu invalidateoptionsmenu, ItemMasterDataBinding itemMasterDataBinding, setVirtualCameraRotationDegrees.b bVar, setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) throws Throwable {
            Intrinsics.checkNotNullParameter(itemMasterDataBinding, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = invalidateoptionsmenu;
            Context context = invalidateoptionsmenu.asBinder;
            Intrinsics.checkNotNullExpressionValue(context, "");
            RelativeLayout root = itemMasterDataBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(context, root, null, null);
            this.b = itemMasterDataBinding;
        }

        @Override // defpackage.VirtualCameraInfo
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ItemAutodebitParticipant itemAutodebitParticipant) throws Throwable {
            final ItemAutodebitParticipant itemAutodebitParticipant2 = itemAutodebitParticipant;
            Intrinsics.checkNotNullParameter(itemAutodebitParticipant2, "");
            ItemMasterDataBinding itemMasterDataBinding = this.b;
            final invalidateOptionsMenu invalidateoptionsmenu = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            itemMasterDataBinding.tvName.setText(itemAutodebitParticipant2.TuitionPaymentFragmentbindingInflater1);
            if (itemAutodebitParticipant2.onTransact) {
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
            Function1 function1 = new Function1() { // from class: isShowing
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return invalidateOptionsMenu.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(invalidateoptionsmenu, itemAutodebitParticipant2, (View) obj);
                }
            };
            Intrinsics.checkNotNullParameter(relativeLayout, "");
            Intrinsics.checkNotNullParameter(function1, "");
            relativeLayout.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function1));
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(invalidateOptionsMenu invalidateoptionsmenu, ItemAutodebitParticipant itemAutodebitParticipant, View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Function1 function1 = invalidateoptionsmenu.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (function1 != null) {
                function1.invoke(itemAutodebitParticipant);
            }
            return Unit.INSTANCE;
        }
    }
}
