package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.databinding.ItemMasterDataBinding;
import com.bpjstku.domain.branchoffice.model.Office;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0012\u00060\u0004R\u00020\u00000\u0001:\u0001\u0012BC\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0007\u0012\u001c\b\u0002\u0010\u000b\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0010\u001a\u00060\u0004R\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0010\u0010\u0011R(\u0010\u0010\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"LsetTitleMargin;", "LsetVirtualCameraRotationDegrees;", "LlambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy;", "Lcom/bpjstku/domain/branchoffice/model/Office;", "LsetTitleMargin$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "Landroid/content/Context;", "p0", "", "p1", "Lkotlin/Function1;", "", "p2", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "", "TuitionPaymentFragmentbindingInflater1", "(Landroid/view/ViewGroup;)LsetTitleMargin$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class setTitleMargin extends setVirtualCameraRotationDegrees<lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<Office>, TuitionPaymentFragmentspecialinlinedviewModeldefault2> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Function1<lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<Office>, Unit> TuitionPaymentFragmentbindingInflater1;

    @Override // defpackage.setVirtualCameraRotationDegrees
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final /* synthetic */ VirtualCameraInfo onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentbindingInflater1(viewGroup);
    }

    @Override // defpackage.setVirtualCameraRotationDegrees, androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentbindingInflater1(viewGroup);
    }

    public /* synthetic */ setTitleMargin(Context context, ArrayList arrayList, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new ArrayList() : arrayList, (i & 4) != 0 ? null : function1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public setTitleMargin(Context context, List<lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<Office>> list, Function1<? super lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<Office>, Unit> function1) {
        super(context, list);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.TuitionPaymentFragmentbindingInflater1 = function1;
    }

    private TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentbindingInflater1(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ItemMasterDataBinding itemMasterDataBindingInflate = ItemMasterDataBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(itemMasterDataBindingInflate, "");
        setVirtualCameraRotationDegrees.b bVar = this.f1400a;
        setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.asInterface;
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, itemMasterDataBindingInflate, null, null);
    }

    public final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends VirtualCameraInfo<lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<Office>> {
        private /* synthetic */ setTitleMargin TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private final ItemMasterDataBinding b;

        /* JADX WARN: Illegal instructions before constructor call */
        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(setTitleMargin settitlemargin, ItemMasterDataBinding itemMasterDataBinding, setVirtualCameraRotationDegrees.b bVar, setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) throws Throwable {
            Intrinsics.checkNotNullParameter(itemMasterDataBinding, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = settitlemargin;
            Context context = settitlemargin.asBinder;
            Intrinsics.checkNotNullExpressionValue(context, "");
            RelativeLayout root = itemMasterDataBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(context, root, null, null);
            this.b = itemMasterDataBinding;
        }

        @Override // defpackage.VirtualCameraInfo
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<Office> lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy) throws Throwable {
            final lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<Office> lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy2 = lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy;
            Intrinsics.checkNotNullParameter(lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy2, "");
            ItemMasterDataBinding itemMasterDataBinding = this.b;
            final setTitleMargin settitlemargin = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            itemMasterDataBinding.tvName.setText(lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1);
            if (lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy2.TuitionPaymentFragmentbindingInflater1) {
                AppCompatImageView appCompatImageView = itemMasterDataBinding.imgSelected;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
                appCompatImageView.setVisibility(0);
            } else {
                AppCompatImageView appCompatImageView2 = itemMasterDataBinding.imgSelected;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
                appCompatImageView2.setVisibility(8);
            }
            RelativeLayout root = itemMasterDataBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            root.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: setSubtitleTextColor
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return setTitleMargin.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy2, settitlemargin, (View) obj);
                }
            }));
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy, setTitleMargin settitlemargin, View view) {
            Intrinsics.checkNotNullParameter(view, "");
            lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentbindingInflater1 = true;
            Function1 function1 = settitlemargin.TuitionPaymentFragmentbindingInflater1;
            if (function1 != null) {
                function1.invoke(lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy);
            }
            return Unit.INSTANCE;
        }
    }
}
