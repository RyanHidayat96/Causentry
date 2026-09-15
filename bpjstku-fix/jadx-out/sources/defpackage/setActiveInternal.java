package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class setActiveInternal extends RecyclerView.OnScrollListener {
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public RecyclerView.LayoutManager TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public int b;
    private int g;
    public int d = b() - 3;
    public boolean TuitionPaymentFragmentbindingInflater1 = true;

    public abstract void TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2, int i3, RecyclerView recyclerView);

    public abstract int b();

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i, int i2) throws IOException {
        int iFindLastVisibleItemPosition;
        Intrinsics.checkNotNullParameter(recyclerView, "");
        RecyclerView.LayoutManager layoutManager = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int itemCount = layoutManager != null ? layoutManager.getItemCount() : 0;
        RecyclerView.LayoutManager layoutManager2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (layoutManager2 instanceof StaggeredGridLayoutManager) {
            Intrinsics.checkNotNull(layoutManager2, "");
            int[] iArrFindLastVisibleItemPositions = ((StaggeredGridLayoutManager) layoutManager2).findLastVisibleItemPositions(null);
            Intrinsics.checkNotNull(iArrFindLastVisibleItemPositions);
            Intrinsics.checkNotNullParameter(iArrFindLastVisibleItemPositions, "");
            int length = iArrFindLastVisibleItemPositions.length;
            iFindLastVisibleItemPosition = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (i3 == 0) {
                    iFindLastVisibleItemPosition = iArrFindLastVisibleItemPositions[i3];
                } else {
                    int i4 = iArrFindLastVisibleItemPositions[i3];
                    if (i4 > iFindLastVisibleItemPosition) {
                        iFindLastVisibleItemPosition = i4;
                    }
                }
            }
        } else if (layoutManager2 instanceof GridLayoutManager) {
            Intrinsics.checkNotNull(layoutManager2, "");
            iFindLastVisibleItemPosition = ((GridLayoutManager) layoutManager2).findLastVisibleItemPosition();
        } else if (layoutManager2 instanceof LinearLayoutManager) {
            Intrinsics.checkNotNull(layoutManager2, "");
            iFindLastVisibleItemPosition = ((LinearLayoutManager) layoutManager2).findLastVisibleItemPosition();
        } else {
            iFindLastVisibleItemPosition = 0;
        }
        if (itemCount < this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            this.b = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = itemCount;
            if (itemCount == 0) {
                this.TuitionPaymentFragmentbindingInflater1 = true;
            }
        }
        if (this.TuitionPaymentFragmentbindingInflater1 && itemCount >= this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            this.TuitionPaymentFragmentbindingInflater1 = false;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = itemCount;
        }
        if (!this.TuitionPaymentFragmentbindingInflater1 && iFindLastVisibleItemPosition + this.d > itemCount && (itemCount <= b() || this.g != itemCount)) {
            this.g = itemCount;
            int i5 = this.b + 1;
            this.b = i5;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(i5, b(), itemCount, recyclerView);
            if (getContentPaddingRight.TuitionPaymentFragmentbindingInflater1() > 0) {
                int iB = b();
                int i6 = this.b;
                int i7 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                StringBuilder sb = new StringBuilder("Load More limit ");
                sb.append(iB);
                sb.append(" skip ");
                sb.append(i6);
                sb.append(" : total item ");
                sb.append(itemCount);
                sb.append(" previousTotalItemCount ");
                sb.append(i7);
                getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault2(sb.toString(), new Object[0]);
            }
            this.TuitionPaymentFragmentbindingInflater1 = true;
            return;
        }
        if (getContentPaddingRight.TuitionPaymentFragmentbindingInflater1() > 0) {
            int iB2 = b();
            int i8 = this.b;
            int i9 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb2 = new StringBuilder("Load More limit ");
            sb2.append(iB2);
            sb2.append(" skip ");
            sb2.append(i8);
            sb2.append(" : total item ");
            sb2.append(itemCount);
            sb2.append(" previousTotalItemCount ");
            sb2.append(i9);
            sb2.append(" not load more");
            getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault2(sb2.toString(), new Object[0]);
        }
    }
}
