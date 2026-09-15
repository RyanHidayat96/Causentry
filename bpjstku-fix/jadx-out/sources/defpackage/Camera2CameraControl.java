package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Camera2CameraControl extends RecyclerView.OnScrollListener {
    public int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private RecyclerView.LayoutManager asInterface;
    public final int b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f99a = TuitionPaymentFragmentspecialinlinedviewModeldefault1() - 3;
    public boolean TuitionPaymentFragmentbindingInflater1 = true;

    public abstract int TuitionPaymentFragmentspecialinlinedviewModeldefault1();

    public abstract void TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2, int i3, RecyclerView recyclerView);

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(RecyclerView.LayoutManager layoutManager) {
        Intrinsics.checkNotNullParameter(layoutManager, "");
        if (layoutManager instanceof GridLayoutManager) {
            this.asInterface = layoutManager;
            this.f99a *= ((GridLayoutManager) layoutManager).getSpanCount();
        } else if (layoutManager instanceof LinearLayoutManager) {
            this.asInterface = layoutManager;
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            this.asInterface = layoutManager;
            this.f99a *= ((StaggeredGridLayoutManager) layoutManager).getSpanCount();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i, int i2) throws IOException {
        int iFindLastVisibleItemPosition;
        Intrinsics.checkNotNullParameter(recyclerView, "");
        RecyclerView.LayoutManager layoutManager = this.asInterface;
        int itemCount = layoutManager != null ? layoutManager.getItemCount() : 0;
        RecyclerView.LayoutManager layoutManager2 = this.asInterface;
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
        if (itemCount < this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.b;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = itemCount;
            if (itemCount == 0) {
                this.TuitionPaymentFragmentbindingInflater1 = true;
            }
        }
        if (this.TuitionPaymentFragmentbindingInflater1 && itemCount >= this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            this.TuitionPaymentFragmentbindingInflater1 = false;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = itemCount;
        }
        if (!this.TuitionPaymentFragmentbindingInflater1 && iFindLastVisibleItemPosition + this.f99a > itemCount && (itemCount <= TuitionPaymentFragmentspecialinlinedviewModeldefault1() || this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != itemCount)) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = itemCount;
            int i5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(i5, TuitionPaymentFragmentspecialinlinedviewModeldefault1(), itemCount, recyclerView);
            if (getContentPaddingRight.TuitionPaymentFragmentbindingInflater1() > 0) {
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i6 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i7 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                StringBuilder sb = new StringBuilder("Load More limit ");
                sb.append(iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
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
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int i8 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i9 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            StringBuilder sb2 = new StringBuilder("Load More limit ");
            sb2.append(iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
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
