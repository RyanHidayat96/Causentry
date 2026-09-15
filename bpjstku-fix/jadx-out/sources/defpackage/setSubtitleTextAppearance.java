package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.databinding.ItemBpjstkuBranchOfficeBinding;
import com.bpjstku.domain.branchoffice.model.Office;
import com.bpjstku.domain.branchoffice.model.RegionalOffice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0016BC\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\"\b\u0002\u0010\f\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0011\u0010\u0012R.\u0010\u0015\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"LsetSubtitleTextAppearance;", "LsetVirtualCameraRotationDegrees;", "Lcom/bpjstku/domain/branchoffice/model/RegionalOffice;", "LsetSubtitleTextAppearance$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "Landroid/content/Context;", "p0", "", "p1", "Lkotlin/Function2;", "LlambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy;", "Lcom/bpjstku/domain/branchoffice/model/Office;", "", "p2", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function2;)V", "Landroid/view/ViewGroup;", "", "b", "(Landroid/view/ViewGroup;)LsetSubtitleTextAppearance$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lkotlin/jvm/functions/Function2;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class setSubtitleTextAppearance extends setVirtualCameraRotationDegrees<RegionalOffice, TuitionPaymentFragmentspecialinlinedviewModeldefault2> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Function2<RegionalOffice, lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<Office>, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    @Override // defpackage.setVirtualCameraRotationDegrees
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final /* synthetic */ VirtualCameraInfo onCreateViewHolder(ViewGroup viewGroup, int i) {
        return b(viewGroup);
    }

    @Override // defpackage.setVirtualCameraRotationDegrees, androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return b(viewGroup);
    }

    public /* synthetic */ setSubtitleTextAppearance(Context context, ArrayList arrayList, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new ArrayList() : arrayList, (i & 4) != 0 ? null : function2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public setSubtitleTextAppearance(Context context, List<RegionalOffice> list, Function2<? super RegionalOffice, ? super lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<Office>, Unit> function2) {
        super(context, list);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function2;
    }

    private TuitionPaymentFragmentspecialinlinedviewModeldefault2 b(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ItemBpjstkuBranchOfficeBinding itemBpjstkuBranchOfficeBindingInflate = ItemBpjstkuBranchOfficeBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(itemBpjstkuBranchOfficeBindingInflate, "");
        setVirtualCameraRotationDegrees.b bVar = this.f1400a;
        setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.asInterface;
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, itemBpjstkuBranchOfficeBindingInflate, null, null);
    }

    public final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends VirtualCameraInfo<RegionalOffice> {
        private /* synthetic */ setSubtitleTextAppearance TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private final ItemBpjstkuBranchOfficeBinding b;

        /* JADX WARN: Illegal instructions before constructor call */
        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(setSubtitleTextAppearance setsubtitletextappearance, ItemBpjstkuBranchOfficeBinding itemBpjstkuBranchOfficeBinding, setVirtualCameraRotationDegrees.b bVar, setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            Intrinsics.checkNotNullParameter(itemBpjstkuBranchOfficeBinding, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = setsubtitletextappearance;
            Context context = setsubtitletextappearance.asBinder;
            Intrinsics.checkNotNullExpressionValue(context, "");
            LinearLayout root = itemBpjstkuBranchOfficeBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(context, root, null, null);
            this.b = itemBpjstkuBranchOfficeBinding;
        }

        @Override // defpackage.VirtualCameraInfo
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(RegionalOffice regionalOffice) {
            final RegionalOffice regionalOffice2 = regionalOffice;
            Intrinsics.checkNotNullParameter(regionalOffice2, "");
            ItemBpjstkuBranchOfficeBinding itemBpjstkuBranchOfficeBinding = this.b;
            final setSubtitleTextAppearance setsubtitletextappearance = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            itemBpjstkuBranchOfficeBinding.tvBranchOfficeRegionalName.setText(regionalOffice2.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            Context context = itemBpjstkuBranchOfficeBinding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            List<Office> list = regionalOffice2.asInterface;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy((Office) it.next()));
            }
            setTitleMargin settitlemargin = new setTitleMargin(context, arrayList, new Function1() { // from class: setTitleMarginTop
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return setSubtitleTextAppearance.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(setsubtitletextappearance, regionalOffice2, (lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy) obj);
                }
            });
            RecyclerView recyclerView = itemBpjstkuBranchOfficeBinding.rvBranchOffice;
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.addItemDecoration(new DividerItemDecoration(recyclerView.getContext(), 1));
            recyclerView.setNestedScrollingEnabled(false);
            recyclerView.setAdapter(settitlemargin);
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(setSubtitleTextAppearance setsubtitletextappearance, RegionalOffice regionalOffice, lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy) {
            Intrinsics.checkNotNullParameter(lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy, "");
            Function2 function2 = setsubtitletextappearance.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (function2 != null) {
                function2.invoke(regionalOffice, lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy);
            }
            return Unit.INSTANCE;
        }
    }
}
