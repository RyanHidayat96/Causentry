package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.databinding.ItemJhtTariffPaymentBinding;
import com.bpjstku.domain.general.model.CodeNamePair;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0012\u00060\u0004R\u00020\u00000\u0001:\u0001\u0014BC\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0007\u0012\u001c\b\u0002\u0010\u000b\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0010\u001a\u00060\u0004R\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R(\u0010\u0016\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015"}, d2 = {"LsetTitleMarginBottom;", "LsetVirtualCameraRotationDegrees;", "LlambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy;", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "LsetTitleMarginBottom$b;", "Landroid/content/Context;", "p0", "", "p1", "Lkotlin/Function1;", "", "p2", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/view/ViewGroup;)LsetTitleMarginBottom$b;", "TuitionPaymentFragmentbindingInflater1", "Landroid/content/Context;", "b", "Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class setTitleMarginBottom extends setVirtualCameraRotationDegrees<lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<CodeNamePair>, b> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Context b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Function1<lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<CodeNamePair>, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Override // defpackage.setVirtualCameraRotationDegrees
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final /* bridge */ /* synthetic */ VirtualCameraInfo onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(viewGroup);
    }

    @Override // defpackage.setVirtualCameraRotationDegrees, androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(viewGroup);
    }

    public /* synthetic */ setTitleMarginBottom(Context context, ArrayList arrayList, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new ArrayList() : arrayList, (i & 4) != 0 ? null : function1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    private setTitleMarginBottom(Context context, List<lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<CodeNamePair>> list, Function1<? super lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<CodeNamePair>, Unit> function1) {
        super(context, list);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.b = context;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = function1;
    }

    public final class b extends VirtualCameraInfo<lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<CodeNamePair>> {
        private /* synthetic */ setTitleMarginBottom TuitionPaymentFragmentbindingInflater1;
        private final ItemJhtTariffPaymentBinding TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(setTitleMarginBottom settitlemarginbottom, ItemJhtTariffPaymentBinding itemJhtTariffPaymentBinding, setVirtualCameraRotationDegrees.b bVar, setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            Intrinsics.checkNotNullParameter(itemJhtTariffPaymentBinding, "");
            this.TuitionPaymentFragmentbindingInflater1 = settitlemarginbottom;
            Context context = settitlemarginbottom.asBinder;
            Intrinsics.checkNotNullExpressionValue(context, "");
            RadioButton root = itemJhtTariffPaymentBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(context, root, null, null);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = itemJhtTariffPaymentBinding;
        }

        @Override // defpackage.VirtualCameraInfo
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<CodeNamePair> lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy) {
            final lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<CodeNamePair> lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy2 = lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy;
            Intrinsics.checkNotNullParameter(lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy2, "");
            ItemJhtTariffPaymentBinding itemJhtTariffPaymentBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            final setTitleMarginBottom settitlemarginbottom = this.TuitionPaymentFragmentbindingInflater1;
            RadioButton radioButton = itemJhtTariffPaymentBinding.rbTariffItem;
            radioButton.setText(getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(Double.parseDouble(lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1)));
            radioButton.setChecked(lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy2.TuitionPaymentFragmentbindingInflater1);
            if (lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy2.TuitionPaymentFragmentbindingInflater1) {
                radioButton.setTextColor(radioButton.getContext().getResources().getColor(R.color.colorBlack));
            } else {
                radioButton.setTextColor(radioButton.getContext().getResources().getColor(R.color.colorCoolGrey));
            }
            RadioButton root = itemJhtTariffPaymentBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            root.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: setTitleMarginStart
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return setTitleMarginBottom.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(settitlemarginbottom, lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy2, (View) obj);
                }
            }));
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(setTitleMarginBottom settitlemarginbottom, lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy, View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Function1 function1 = settitlemarginbottom.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (function1 != null) {
                function1.invoke(lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy);
            }
            return Unit.INSTANCE;
        }
    }

    private b TuitionPaymentFragmentspecialinlinedviewModeldefault1(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ItemJhtTariffPaymentBinding itemJhtTariffPaymentBindingInflate = ItemJhtTariffPaymentBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(itemJhtTariffPaymentBindingInflate, "");
        setVirtualCameraRotationDegrees.b bVar = this.f1400a;
        setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.asInterface;
        return new b(this, itemJhtTariffPaymentBindingInflate, null, null);
    }
}
