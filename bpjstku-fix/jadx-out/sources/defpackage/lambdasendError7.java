package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final class lambdasendError7 extends RecyclerView.ItemDecoration {
    private int TuitionPaymentFragmentbindingInflater1;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private boolean b = false;

    public lambdasendError7(int i, int i2) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i;
        this.TuitionPaymentFragmentbindingInflater1 = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i2 = childAdapterPosition % i;
        rect.left = (this.TuitionPaymentFragmentbindingInflater1 * i2) / i;
        int i3 = this.TuitionPaymentFragmentbindingInflater1;
        rect.right = i3 - (((i2 + 1) * i3) / this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        if (childAdapterPosition >= this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            rect.top = this.TuitionPaymentFragmentbindingInflater1;
        }
    }
}
