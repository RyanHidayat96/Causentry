package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentChooseReportingBottomSheetBinding;
import com.bpjstku.domain.report.model.ReportStatus;
import com.bpjstku.presentation.report.ChooseReportingBottomSheetFragment$chooseReportingAdapter$2$1;
import com.bpjstku.presentation.report.ChooseReportingBottomSheetFragment$handleItemClicked$1;
import com.bpjstku.util.constant.ReportType;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001f\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0017\u0010\u0011R\"\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u0014\u0010\u0017\u001a\u00020\u001b8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001cR\u0016\u0010\u0010\u001a\u00020\u001d8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0017\u0010\u001eR\u0015\u0010\u0015\u001a\u00020\u001f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010 "}, d2 = {"LhasPreviewSurface;", "LunregisterMediaButtonEventReceiver;", "Lkotlin/Function1;", "Lcom/bpjstku/domain/report/model/ReportStatus;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()V", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/bpjstku/domain/report/model/ReportStatus;)V", "b", "Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentbindingInflater1", "Lcom/bpjstku/domain/report/model/ReportStatus;", "", "()I", "Lcom/bpjstku/databinding/FragmentChooseReportingBottomSheetBinding;", "Lcom/bpjstku/databinding/FragmentChooseReportingBottomSheetBinding;", "LgenerateConcurrentSupportedCombinationList;", "Lkotlin/Lazy;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class hasPreviewSurface extends unregisterMediaButtonEventReceiver {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Function1<ReportStatus, Unit> TuitionPaymentFragmentbindingInflater1;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private ReportStatus TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private FragmentChooseReportingBottomSheetBinding TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return R.layout.fragment_choose_reporting_bottom_sheet;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void b() {
    }

    public /* synthetic */ hasPreviewSurface(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public hasPreviewSurface(Function1<? super ReportStatus, Unit> function1) {
        this.TuitionPaymentFragmentbindingInflater1 = function1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: isStreamSharing
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return hasPreviewSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        });
    }

    /* JADX INFO: renamed from: hasPreviewSurface$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LhasPreviewSurface$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ hasPreviewSurface TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            hasPreviewSurface haspreviewsurface = new hasPreviewSurface(function1);
            Bundle bundle = new Bundle();
            bundle.putParcelable("report_type", null);
            haspreviewsurface.setArguments(bundle);
            return haspreviewsurface;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentChooseReportingBottomSheetBinding fragmentChooseReportingBottomSheetBindingInflate = FragmentChooseReportingBottomSheetBinding.inflate(p0, p1, false);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = fragmentChooseReportingBottomSheetBindingInflate;
        if (fragmentChooseReportingBottomSheetBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentChooseReportingBottomSheetBindingInflate = null;
        }
        FrameLayout root = fragmentChooseReportingBottomSheetBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            Bundle arguments = getArguments();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = arguments != null ? (ReportStatus) arguments.getParcelable("report_type") : null;
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void g() {
        FragmentChooseReportingBottomSheetBinding fragmentChooseReportingBottomSheetBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (fragmentChooseReportingBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentChooseReportingBottomSheetBinding = null;
        }
        RecyclerView recyclerView = fragmentChooseReportingBottomSheetBinding.rvChooseReporting;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter((generateConcurrentSupportedCombinationList) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue());
        ReportStatus reportStatus = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (reportStatus != null) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(reportStatus);
        }
    }

    public static /* synthetic */ generateConcurrentSupportedCombinationList TuitionPaymentFragmentspecialinlinedviewModeldefault1(hasPreviewSurface haspreviewsurface) {
        ChooseReportingBottomSheetFragment$chooseReportingAdapter$2$1 chooseReportingBottomSheetFragment$chooseReportingAdapter$2$1 = new ChooseReportingBottomSheetFragment$chooseReportingAdapter$2$1(haspreviewsurface);
        Context contextRequireContext = haspreviewsurface.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new generateConcurrentSupportedCombinationList(contextRequireContext, null, chooseReportingBottomSheetFragment$chooseReportingAdapter$2$1, 2, null);
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(hasPreviewSurface haspreviewsurface, ReportStatus reportStatus) {
        haspreviewsurface.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = reportStatus;
        b.TuitionPaymentFragmentbindingInflater1(CoroutineScopeKt.CoroutineScope(Dispatchers.TuitionPaymentFragmentbindingInflater1()), null, null, new ChooseReportingBottomSheetFragment$handleItemClicked$1(haspreviewsurface, reportStatus, null), 3, null);
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ReportStatus p0) {
        Iterable iterable = ((generateConcurrentSupportedCombinationList) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).d;
        Intrinsics.checkNotNullExpressionValue(iterable, "");
        int i = 0;
        for (Object obj : iterable) {
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ReportStatus reportStatus = (ReportStatus) obj;
            reportStatus.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = Intrinsics.areEqual(p0.TuitionPaymentFragmentspecialinlinedviewModeldefault3, reportStatus.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            FragmentChooseReportingBottomSheetBinding fragmentChooseReportingBottomSheetBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (fragmentChooseReportingBottomSheetBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                fragmentChooseReportingBottomSheetBinding = null;
            }
            fragmentChooseReportingBottomSheetBinding.rvChooseReporting.scrollToPosition(i);
            i++;
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void d() {
        List listListOf = CollectionsKt.listOf((Object[]) new ReportStatus[]{new ReportStatus(ReportType.JKK.getType(), false), new ReportStatus(ReportType.JKM.getType(), false)});
        generateConcurrentSupportedCombinationList generateconcurrentsupportedcombinationlist = (generateConcurrentSupportedCombinationList) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        generateconcurrentsupportedcombinationlist.d.clear();
        generateconcurrentsupportedcombinationlist.notifyDataSetChanged();
        ((generateConcurrentSupportedCombinationList) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(listListOf);
        ReportStatus reportStatus = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (reportStatus != null) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(reportStatus);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public hasPreviewSurface() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
