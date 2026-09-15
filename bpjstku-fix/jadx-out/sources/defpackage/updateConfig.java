package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.bpjstku.databinding.ItemLoadMoreBinding;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class updateConfig<T> extends r8lambdaSY9Ab4YLo6l9dbvVF3wIMCq470<T> {
    private final boolean TuitionPaymentFragmentbindingInflater1;
    private final ItemLoadMoreBinding TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final addCaptureRequestOptionsInternal.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final int b;

    /* JADX WARN: Illegal instructions before constructor call */
    public updateConfig(Context context, ItemLoadMoreBinding itemLoadMoreBinding, addCaptureRequestOptionsInternal.b bVar, addCaptureRequestOptionsInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, addCaptureRequestOptionsInternal.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1, boolean z, int i, int i2) {
        Intrinsics.checkNotNullParameter(itemLoadMoreBinding, "");
        Intrinsics.checkNotNull(context);
        RelativeLayout root = itemLoadMoreBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        super(context, root, null, null);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = itemLoadMoreBinding;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = tuitionPaymentFragmentbindingInflater1;
        this.TuitionPaymentFragmentbindingInflater1 = z;
        this.b = i;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2;
    }

    @Override // defpackage.r8lambdaSY9Ab4YLo6l9dbvVF3wIMCq470
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(T t) {
        ItemLoadMoreBinding itemLoadMoreBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        itemLoadMoreBinding.pbLoadMore.setVisibility(this.TuitionPaymentFragmentbindingInflater1 ? 0 : 4);
        itemLoadMoreBinding.tvLoadMoreError.setVisibility(this.TuitionPaymentFragmentbindingInflater1 ? 4 : 0);
        itemLoadMoreBinding.tvLoadMoreError.setOnClickListener(new View.OnClickListener() { // from class: completeInFlightUpdate
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                updateConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, view);
            }
        });
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(updateConfig updateconfig, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            addCaptureRequestOptionsInternal.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = updateconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (tuitionPaymentFragmentbindingInflater1 != null) {
                Integer numValueOf = Integer.valueOf(updateconfig.b);
                int i = updateconfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(numValueOf);
            }
        } finally {
            ViewPortBuilder.b();
        }
    }
}
