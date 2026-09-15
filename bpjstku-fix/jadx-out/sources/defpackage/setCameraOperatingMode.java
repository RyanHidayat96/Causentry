package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class setCameraOperatingMode extends RecyclerView.ItemDecoration {
    private final int TuitionPaymentFragmentbindingInflater1;
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public setCameraOperatingMode(int i, int i2) {
        this.TuitionPaymentFragmentbindingInflater1 = i;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        if (recyclerView.getChildAdapterPosition(view) == 0) {
            rect.top = (int) (this.TuitionPaymentFragmentbindingInflater1 * Resources.getSystem().getDisplayMetrics().density);
        }
        rect.bottom = (int) (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 * Resources.getSystem().getDisplayMetrics().density);
    }
}
