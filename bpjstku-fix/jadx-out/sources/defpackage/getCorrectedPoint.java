package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.databinding.ItemVocationalTrainingBinding;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.domain.vocation.model.Training;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002$\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002\u0012\b\u0012\u00060\u0006R\u00020\u00000\u0001:\u0001\u0017Ba\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012 \b\u0002\u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00020\u0004\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\u00060\u0006R\u00020\u00002\u0006\u0010\b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016"}, d2 = {"LgetCorrectedPoint;", "LsetVirtualCameraRotationDegrees;", "Lkotlin/Pair;", "", "", "Lcom/bpjstku/domain/vocation/model/Training;", "LgetCorrectedPoint$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "Landroid/content/Context;", "p0", "p1", "Lkotlin/Function1;", "", "p2", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "p3", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "", "TuitionPaymentFragmentbindingInflater1", "(Landroid/view/ViewGroup;)LgetCorrectedPoint$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "b"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class getCorrectedPoint extends setVirtualCameraRotationDegrees<Pair<? extends String, ? extends List<? extends Training>>, TuitionPaymentFragmentspecialinlinedviewModeldefault3> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Function1<Training, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function1<CodeNamePair, Unit> TuitionPaymentFragmentbindingInflater1;

    @Override // defpackage.setVirtualCameraRotationDegrees
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final /* synthetic */ VirtualCameraInfo onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentbindingInflater1(viewGroup);
    }

    @Override // defpackage.setVirtualCameraRotationDegrees, androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentbindingInflater1(viewGroup);
    }

    public /* synthetic */ getCorrectedPoint(Context context, ArrayList arrayList, Function1 function1, Function1 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new ArrayList() : arrayList, (i & 4) != 0 ? null : function1, (i & 8) != 0 ? null : function2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    private getCorrectedPoint(Context context, List<? extends Pair<String, ? extends List<Training>>> list, Function1<? super Training, Unit> function1, Function1<? super CodeNamePair, Unit> function2) {
        super(context, list);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = function1;
        this.TuitionPaymentFragmentbindingInflater1 = function2;
    }

    private TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentbindingInflater1(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ItemVocationalTrainingBinding itemVocationalTrainingBindingInflate = ItemVocationalTrainingBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(itemVocationalTrainingBindingInflate, "");
        setVirtualCameraRotationDegrees.b bVar = this.f1400a;
        setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.asInterface;
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, itemVocationalTrainingBindingInflate, null, null);
    }

    public final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends VirtualCameraInfo<Pair<? extends String, ? extends List<? extends Training>>> {
        private /* synthetic */ getCorrectedPoint TuitionPaymentFragmentbindingInflater1;
        private final ItemVocationalTrainingBinding TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX WARN: Illegal instructions before constructor call */
        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(getCorrectedPoint getcorrectedpoint, ItemVocationalTrainingBinding itemVocationalTrainingBinding, setVirtualCameraRotationDegrees.b bVar, setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            Intrinsics.checkNotNullParameter(itemVocationalTrainingBinding, "");
            this.TuitionPaymentFragmentbindingInflater1 = getcorrectedpoint;
            Context context = getcorrectedpoint.asBinder;
            Intrinsics.checkNotNullExpressionValue(context, "");
            MaterialCardView root = itemVocationalTrainingBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(context, root, null, null);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = itemVocationalTrainingBinding;
        }

        @Override // defpackage.VirtualCameraInfo
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Pair<? extends String, ? extends List<? extends Training>> pair) {
            final Pair<? extends String, ? extends List<? extends Training>> pair2 = pair;
            Intrinsics.checkNotNullParameter(pair2, "");
            ItemVocationalTrainingBinding itemVocationalTrainingBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            final getCorrectedPoint getcorrectedpoint = this.TuitionPaymentFragmentbindingInflater1;
            Context context = itemVocationalTrainingBinding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            shouldSetAeModeAlwaysFlash shouldsetaemodealwaysflash = new shouldSetAeModeAlwaysFlash(context, CollectionsKt.toMutableList((Collection) pair2.getSecond()), new Function1() { // from class: excludeProblematicOutputSizesByFormat
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return getCorrectedPoint.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(getcorrectedpoint, (Training) obj);
                }
            });
            RecyclerView recyclerView = itemVocationalTrainingBinding.rvVocationalTraining;
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.addItemDecoration(new DividerItemDecoration(recyclerView.getContext(), 1));
            recyclerView.setAdapter(shouldsetaemodealwaysflash);
            itemVocationalTrainingBinding.tvLpkName.setText(pair2.getFirst());
            MaterialButton materialButton = itemVocationalTrainingBinding.btnBlkProfile;
            Intrinsics.checkNotNullExpressionValue(materialButton, "");
            materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: addExtraSupportedOutputSizesByFormat
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return getCorrectedPoint.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(pair2, getcorrectedpoint, (View) obj);
                }
            }));
        }

        public static /* synthetic */ Unit b(Pair pair, getCorrectedPoint getcorrectedpoint, View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Training training = (Training) CollectionsKt.first((List) pair.getSecond());
            Function1 function1 = getcorrectedpoint.TuitionPaymentFragmentbindingInflater1;
            if (function1 != null) {
                function1.invoke(new CodeNamePair(training.g, training.INotificationSideChannel));
            }
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit b(getCorrectedPoint getcorrectedpoint, Training training) {
            Intrinsics.checkNotNullParameter(training, "");
            Function1 function1 = getcorrectedpoint.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (function1 != null) {
                function1.invoke(training);
            }
            return Unit.INSTANCE;
        }
    }
}
