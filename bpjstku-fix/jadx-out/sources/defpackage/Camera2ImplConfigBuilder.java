package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.databinding.ItemLoadMoreBinding;
import com.bpjstku.databinding.ItemVideoBinding;
import com.bpjstku.domain.podcast.model.PodcastVideoList;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0001:\u0001\u001aB7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\"\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"LCamera2ImplConfigBuilder;", "LaddCaptureRequestOptionsInternal;", "Lcom/bpjstku/domain/podcast/model/PodcastVideoList;", "Lr8lambdaSY9Ab4YLo6l9dbvVF3wIMCq470;", "Landroid/content/Context;", "p0", "", "p1", "Lkotlin/Function1;", "", "p2", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/view/ViewGroup;I)Lr8lambdaSY9Ab4YLo6l9dbvVF3wIMCq470;", "getItemViewType", "(I)I", "getItemCount", "()I", "Landroid/content/Context;", "b", "cancel", "Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Camera2ImplConfigBuilder extends addCaptureRequestOptionsInternal<PodcastVideoList, r8lambdaSY9Ab4YLo6l9dbvVF3wIMCq470<PodcastVideoList>> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Context b;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private final Function1<PodcastVideoList, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Override // defpackage.addCaptureRequestOptionsInternal, androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return onCreateViewHolder(viewGroup, i);
    }

    public /* synthetic */ Camera2ImplConfigBuilder(Context context, ArrayList arrayList, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new ArrayList() : arrayList, (i & 4) != 0 ? null : function1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    private Camera2ImplConfigBuilder(Context context, List<PodcastVideoList> list, Function1<? super PodcastVideoList, Unit> function1) {
        super(context, list);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.b = context;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = function1;
    }

    @Override // defpackage.addCaptureRequestOptionsInternal
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final r8lambdaSY9Ab4YLo6l9dbvVF3wIMCq470<PodcastVideoList> onCreateViewHolder(ViewGroup p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (p1 == 985213) {
            Context context = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Intrinsics.checkNotNullExpressionValue(context, "");
            ItemVideoBinding itemVideoBindingInflate = ItemVideoBinding.inflate(LayoutInflater.from(p0.getContext()), p0, false);
            Intrinsics.checkNotNullExpressionValue(itemVideoBindingInflate, "");
            addCaptureRequestOptionsInternal.b bVar = this.d;
            addCaptureRequestOptionsInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.asBinder;
            return new TuitionPaymentFragmentbindingInflater1(this, context, itemVideoBindingInflate, null, null);
        }
        if (p1 == 981923) {
            Context context2 = this.b;
            ItemLoadMoreBinding itemLoadMoreBindingInflate = ItemLoadMoreBinding.inflate(LayoutInflater.from(p0.getContext()), p0, false);
            Intrinsics.checkNotNullExpressionValue(itemLoadMoreBindingInflate, "");
            addCaptureRequestOptionsInternal.b bVar2 = this.d;
            addCaptureRequestOptionsInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault4 = this.asBinder;
            addCaptureRequestOptionsInternal.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            Boolean boolTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            Intrinsics.checkNotNullExpressionValue(boolTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
            boolean zBooleanValue = boolTuitionPaymentFragmentspecialinlinedviewModeldefault3.booleanValue();
            Integer num = this.b;
            Intrinsics.checkNotNullExpressionValue(num, "");
            int iIntValue = num.intValue();
            Integer num2 = this.TuitionPaymentFragmentbindingInflater1;
            Intrinsics.checkNotNullExpressionValue(num2, "");
            return new updateConfig(context2, itemLoadMoreBindingInflate, null, null, tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault2, zBooleanValue, iIntValue, num2.intValue());
        }
        Context context3 = this.b;
        ItemLoadMoreBinding itemLoadMoreBindingInflate2 = ItemLoadMoreBinding.inflate(LayoutInflater.from(p0.getContext()), p0, false);
        Intrinsics.checkNotNullExpressionValue(itemLoadMoreBindingInflate2, "");
        addCaptureRequestOptionsInternal.b bVar3 = this.d;
        addCaptureRequestOptionsInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault5 = this.asBinder;
        addCaptureRequestOptionsInternal.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        Boolean boolTuitionPaymentFragmentspecialinlinedviewModeldefault4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        Intrinsics.checkNotNullExpressionValue(boolTuitionPaymentFragmentspecialinlinedviewModeldefault4, "");
        boolean zBooleanValue2 = boolTuitionPaymentFragmentspecialinlinedviewModeldefault4.booleanValue();
        Integer num3 = this.b;
        Intrinsics.checkNotNullExpressionValue(num3, "");
        int iIntValue2 = num3.intValue();
        Integer num4 = this.TuitionPaymentFragmentbindingInflater1;
        Intrinsics.checkNotNullExpressionValue(num4, "");
        return new updateConfig(context3, itemLoadMoreBindingInflate2, null, null, tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3, zBooleanValue2, iIntValue2, num4.intValue());
    }

    public final class TuitionPaymentFragmentbindingInflater1 extends r8lambdaSY9Ab4YLo6l9dbvVF3wIMCq470<PodcastVideoList> {
        private /* synthetic */ Camera2ImplConfigBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private final ItemVideoBinding TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX WARN: Illegal instructions before constructor call */
        public TuitionPaymentFragmentbindingInflater1(Camera2ImplConfigBuilder camera2ImplConfigBuilder, Context context, ItemVideoBinding itemVideoBinding, addCaptureRequestOptionsInternal.b bVar, addCaptureRequestOptionsInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(itemVideoBinding, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = camera2ImplConfigBuilder;
            MaterialCardView root = itemVideoBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(context, root, null, null);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = itemVideoBinding;
        }

        @Override // defpackage.r8lambdaSY9Ab4YLo6l9dbvVF3wIMCq470
        public final /* bridge */ /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(PodcastVideoList podcastVideoList) {
            final PodcastVideoList podcastVideoList2 = podcastVideoList;
            ItemVideoBinding itemVideoBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            final Camera2ImplConfigBuilder camera2ImplConfigBuilder = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (podcastVideoList2 != null) {
                ImageView imageView = itemVideoBinding.imgThumbnailVideo;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                lambdacreateCameraSelectorById0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(imageView, camera2ImplConfigBuilder.b, podcastVideoList2.TuitionPaymentFragmentbindingInflater1, R.drawable.ic_placeholder, R.drawable.ic_placeholder);
                itemVideoBinding.tvTitleVideo.setText(podcastVideoList2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                itemVideoBinding.tvDescVideo.setText(podcastVideoList2.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                MaterialButton materialButton = itemVideoBinding.btnDetailVideo;
                Intrinsics.checkNotNullExpressionValue(materialButton, "");
                MaterialButton materialButton2 = materialButton;
                Function1 function1 = new Function1() { // from class: getStreamUseCase
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Camera2ImplConfigBuilder.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(camera2ImplConfigBuilder, podcastVideoList2, (View) obj);
                    }
                };
                Intrinsics.checkNotNullParameter(materialButton2, "");
                Intrinsics.checkNotNullParameter(function1, "");
                materialButton2.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function1));
                MaterialCardView root = itemVideoBinding.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                MaterialCardView materialCardView = root;
                getSessionStateCallback getsessionstatecallback = new getSessionStateCallback(camera2ImplConfigBuilder, podcastVideoList2);
                Intrinsics.checkNotNullParameter(materialCardView, "");
                Intrinsics.checkNotNullParameter(getsessionstatecallback, "");
                materialCardView.setOnClickListener(new UseFlashModeTorchFor3aUpdate(getsessionstatecallback));
            }
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(Camera2ImplConfigBuilder camera2ImplConfigBuilder, PodcastVideoList podcastVideoList, View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Function1 function1 = camera2ImplConfigBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (function1 != null) {
                function1.invoke(podcastVideoList);
            }
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(Camera2ImplConfigBuilder camera2ImplConfigBuilder, PodcastVideoList podcastVideoList, View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Function1 function1 = camera2ImplConfigBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (function1 != null) {
                function1.invoke(podcastVideoList);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // defpackage.addCaptureRequestOptionsInternal, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int p0) {
        List<Data> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Intrinsics.checkNotNullExpressionValue(list, "");
        return CollectionsKt.getOrNull(list, p0) != null ? 985213 : 981923;
    }
}
