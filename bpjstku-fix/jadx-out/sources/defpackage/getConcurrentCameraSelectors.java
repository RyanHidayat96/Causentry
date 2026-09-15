package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class getConcurrentCameraSelectors extends RecyclerView.ItemDecoration {
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 6;
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public getConcurrentCameraSelectors(int i) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        rect.bottom = (int) (Resources.getSystem().getDisplayMetrics().density * 10.0f);
        if (childAdapterPosition % this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == 0) {
            rect.right = (int) ((this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 / 2) * Resources.getSystem().getDisplayMetrics().density);
        } else {
            rect.left = (int) ((this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 / 2) * Resources.getSystem().getDisplayMetrics().density);
        }
    }
}
