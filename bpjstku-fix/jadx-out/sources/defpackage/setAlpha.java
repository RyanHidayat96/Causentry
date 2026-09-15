package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.databinding.ItemUserKpjBinding;
import com.bpjstku.presentation.complaint.UserKpj;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0013B;\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u001a\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\tH\u0017¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R(\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"LsetAlpha;", "LsetVirtualCameraRotationDegrees;", "Lcom/bpjstku/presentation/complaint/UserKpj;", "LsetAlpha$TuitionPaymentFragmentbindingInflater1;", "Landroid/content/Context;", "p0", "", "p1", "Lkotlin/Function2;", "", "", "p2", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function2;)V", "Landroid/view/ViewGroup;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/view/ViewGroup;)LsetAlpha$TuitionPaymentFragmentbindingInflater1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/util/List;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/jvm/functions/Function2;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class setAlpha extends setVirtualCameraRotationDegrees<UserKpj, TuitionPaymentFragmentbindingInflater1> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Function2<Integer, UserKpj, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final List<UserKpj> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Override // defpackage.setVirtualCameraRotationDegrees
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final /* synthetic */ VirtualCameraInfo onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(viewGroup);
    }

    @Override // defpackage.setVirtualCameraRotationDegrees, androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(viewGroup);
    }

    public /* synthetic */ setAlpha(Context context, ArrayList arrayList, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new ArrayList() : arrayList, function2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public setAlpha(Context context, List<UserKpj> list, Function2<? super Integer, ? super UserKpj, Unit> function2) {
        super(context, list);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = list;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function2;
    }

    private TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault2(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ItemUserKpjBinding itemUserKpjBindingInflate = ItemUserKpjBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(itemUserKpjBindingInflate, "");
        setVirtualCameraRotationDegrees.b bVar = this.f1400a;
        setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.asInterface;
        return new TuitionPaymentFragmentbindingInflater1(this, itemUserKpjBindingInflate, null, null);
    }

    public final class TuitionPaymentFragmentbindingInflater1 extends VirtualCameraInfo<UserKpj> {
        private final ItemUserKpjBinding TuitionPaymentFragmentbindingInflater1;
        private /* synthetic */ setAlpha TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX WARN: Illegal instructions before constructor call */
        public TuitionPaymentFragmentbindingInflater1(setAlpha setalpha, ItemUserKpjBinding itemUserKpjBinding, setVirtualCameraRotationDegrees.b bVar, setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            Intrinsics.checkNotNullParameter(itemUserKpjBinding, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = setalpha;
            Context context = setalpha.asBinder;
            Intrinsics.checkNotNullExpressionValue(context, "");
            AppCompatRadioButton root = itemUserKpjBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(context, root, null, null);
            this.TuitionPaymentFragmentbindingInflater1 = itemUserKpjBinding;
        }

        @Override // defpackage.VirtualCameraInfo
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(UserKpj userKpj) {
            final UserKpj userKpj2 = userKpj;
            Intrinsics.checkNotNullParameter(userKpj2, "");
            ItemUserKpjBinding itemUserKpjBinding = this.TuitionPaymentFragmentbindingInflater1;
            final setAlpha setalpha = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (!Intrinsics.areEqual(userKpj2.TuitionPaymentFragmentspecialinlinedviewModeldefault3, "")) {
                itemUserKpjBinding.rbKpjId.setText(userKpj2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                itemUserKpjBinding.rbKpjId.setChecked(userKpj2.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                AppCompatRadioButton root = itemUserKpjBinding.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                root.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: setColorFilter
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return setAlpha.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(setalpha, this, userKpj2, (View) obj);
                    }
                }));
                return;
            }
            itemUserKpjBinding.rbKpjId.setVisibility(8);
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(setAlpha setalpha, TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1, UserKpj userKpj, View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Function2 function2 = setalpha.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (function2 != null) {
                function2.invoke(Integer.valueOf(tuitionPaymentFragmentbindingInflater1.getAdapterPosition()), userKpj);
            }
            return Unit.INSTANCE;
        }
    }
}
