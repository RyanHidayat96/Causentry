package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.bpjstku.databinding.ItemLoadmoreSecondBinding;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class applyOptionsToBuilder<T> extends failInFlightUpdate<T> {
    private final int TuitionPaymentFragmentbindingInflater1;
    private final ItemLoadmoreSecondBinding TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final clearCaptureRequestOptionsInternal.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final int b;

    /* JADX WARN: Illegal instructions before constructor call */
    public applyOptionsToBuilder(Context context, ItemLoadmoreSecondBinding itemLoadmoreSecondBinding, clearCaptureRequestOptionsInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, clearCaptureRequestOptionsInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2, clearCaptureRequestOptionsInternal.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1, boolean z, int i, int i2) {
        Intrinsics.checkNotNullParameter(itemLoadmoreSecondBinding, "");
        Intrinsics.checkNotNull(context);
        RelativeLayout root = itemLoadmoreSecondBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        super(context, root, null, null);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = itemLoadmoreSecondBinding;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = tuitionPaymentFragmentbindingInflater1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = z;
        this.TuitionPaymentFragmentbindingInflater1 = i;
        this.b = i2;
    }

    @Override // defpackage.failInFlightUpdate
    public final void TuitionPaymentFragmentbindingInflater1(T t) {
        ItemLoadmoreSecondBinding itemLoadmoreSecondBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        itemLoadmoreSecondBinding.pbLoadMore.setVisibility(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 ? 0 : 4);
        itemLoadmoreSecondBinding.tvLoadMoreError.setVisibility(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 ? 4 : 0);
        itemLoadmoreSecondBinding.tvLoadMoreError.setOnClickListener(new View.OnClickListener() { // from class: getCamera2ImplConfig
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                applyOptionsToBuilder.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, view);
            }
        });
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(applyOptionsToBuilder applyoptionstobuilder, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            clearCaptureRequestOptionsInternal.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = applyoptionstobuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (tuitionPaymentFragmentbindingInflater1 != null) {
                int i = applyoptionstobuilder.TuitionPaymentFragmentbindingInflater1;
                int i2 = applyoptionstobuilder.b;
                tuitionPaymentFragmentbindingInflater1.g();
            }
        } finally {
            ViewPortBuilder.b();
        }
    }
}
