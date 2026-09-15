package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.databinding.ItemListInfoKpnJpnHeirBinding;
import com.bpjstku.domain.jp.model.JpDataTk;
import com.bumptech.glide.request.RequestOptions;
import com.google.android.material.card.MaterialCardView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0015B?\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019"}, d2 = {"LCameraDeviceStateCallbacks;", "LsetVirtualCameraRotationDegrees;", "Lcom/bpjstku/domain/jp/model/JpDataTk;", "LCameraDeviceStateCallbacks$TuitionPaymentFragmentbindingInflater1;", "Landroid/content/Context;", "p0", "", "p1", "", "p2", "Lkotlin/Function1;", "", "p3", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/view/ViewGroup;)LCameraDeviceStateCallbacks$TuitionPaymentFragmentbindingInflater1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "b", "Lkotlin/jvm/functions/Function1;", "Lcom/bumptech/glide/request/RequestOptions;", "Lcom/bumptech/glide/request/RequestOptions;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CameraDeviceStateCallbacks extends setVirtualCameraRotationDegrees<JpDataTk, TuitionPaymentFragmentbindingInflater1> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final RequestOptions TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentbindingInflater1;
    private final Function1<JpDataTk, Unit> b;

    @Override // defpackage.setVirtualCameraRotationDegrees
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final /* synthetic */ VirtualCameraInfo onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(viewGroup);
    }

    @Override // defpackage.setVirtualCameraRotationDegrees, androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(viewGroup);
    }

    public /* synthetic */ CameraDeviceStateCallbacks(Context context, String str, ArrayList arrayList, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i & 4) != 0 ? new ArrayList() : arrayList, (i & 8) != 0 ? null : function1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CameraDeviceStateCallbacks(Context context, String str, List<JpDataTk> list, Function1<? super JpDataTk, Unit> function1) throws Throwable {
        super(context, list);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.TuitionPaymentFragmentbindingInflater1 = str;
        this.b = function1;
        RequestOptions requestOptionsTuitionPaymentFragmentbindingInflater1 = new RequestOptions().TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault1(context.getResources().getDrawable(R.drawable.ic_placeholder_wide)).TuitionPaymentFragmentbindingInflater1(context.getResources().getDrawable(R.drawable.ic_placeholder_wide));
        Intrinsics.checkNotNullExpressionValue(requestOptionsTuitionPaymentFragmentbindingInflater1, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = requestOptionsTuitionPaymentFragmentbindingInflater1;
    }

    private TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault2(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ItemListInfoKpnJpnHeirBinding itemListInfoKpnJpnHeirBindingInflate = ItemListInfoKpnJpnHeirBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(itemListInfoKpnJpnHeirBindingInflate, "");
        setVirtualCameraRotationDegrees.b bVar = this.f1400a;
        setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.asInterface;
        return new TuitionPaymentFragmentbindingInflater1(this, itemListInfoKpnJpnHeirBindingInflate, null, null);
    }

    public final class TuitionPaymentFragmentbindingInflater1 extends VirtualCameraInfo<JpDataTk> {
        private /* synthetic */ CameraDeviceStateCallbacks TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private final ItemListInfoKpnJpnHeirBinding TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX WARN: Illegal instructions before constructor call */
        public TuitionPaymentFragmentbindingInflater1(CameraDeviceStateCallbacks cameraDeviceStateCallbacks, ItemListInfoKpnJpnHeirBinding itemListInfoKpnJpnHeirBinding, setVirtualCameraRotationDegrees.b bVar, setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            Intrinsics.checkNotNullParameter(itemListInfoKpnJpnHeirBinding, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cameraDeviceStateCallbacks;
            Context context = cameraDeviceStateCallbacks.asBinder;
            Intrinsics.checkNotNullExpressionValue(context, "");
            MaterialCardView root = itemListInfoKpnJpnHeirBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(context, root, null, null);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = itemListInfoKpnJpnHeirBinding;
        }

        @Override // defpackage.VirtualCameraInfo
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(JpDataTk jpDataTk) {
            final JpDataTk jpDataTk2 = jpDataTk;
            Intrinsics.checkNotNullParameter(jpDataTk2, "");
            ItemListInfoKpnJpnHeirBinding itemListInfoKpnJpnHeirBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            final CameraDeviceStateCallbacks cameraDeviceStateCallbacks = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            View view = this.itemView;
            itemListInfoKpnJpnHeirBinding.tvMembershipName.setText(jpDataTk2.b);
            itemListInfoKpnJpnHeirBinding.tvKpjNumber.setText(jpDataTk2.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            Intrinsics.checkNotNull(view);
            Function1 function1 = new Function1() { // from class: isBackwardCompatible
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CameraDeviceStateCallbacks.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(cameraDeviceStateCallbacks, jpDataTk2, (View) obj);
                }
            };
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(function1, "");
            view.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function1));
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(CameraDeviceStateCallbacks cameraDeviceStateCallbacks, JpDataTk jpDataTk, View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Function1 function1 = cameraDeviceStateCallbacks.b;
            if (function1 != null) {
                function1.invoke(jpDataTk);
            }
            return Unit.INSTANCE;
        }
    }
}
