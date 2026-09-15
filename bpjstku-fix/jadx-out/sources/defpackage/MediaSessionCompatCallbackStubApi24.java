package defpackage;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MediaSessionCompatCallbackStubApi24<T> extends PagerAdapter {
    private boolean TuitionPaymentFragmentbindingInflater1 = false;
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public Context TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public List<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private boolean b;
    private SparseArray<View> g;

    protected abstract void TuitionPaymentFragmentbindingInflater1(View view, int i);

    protected abstract View TuitionPaymentFragmentspecialinlinedviewModeldefault2(ViewGroup viewGroup);

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public MediaSessionCompatCallbackStubApi24(Context context, List<T> list, boolean z) {
        this.g = new SparseArray<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = context;
        this.b = z;
        this.g = new SparseArray<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = list;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = list.size() > 1;
        notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        View viewTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (this.b && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            i = b(i);
        }
        if (this.g.get(0, null) == null) {
            viewTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(viewGroup);
        } else {
            viewTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.g.get(0);
            this.g.remove(0);
        }
        TuitionPaymentFragmentbindingInflater1(viewTuitionPaymentFragmentspecialinlinedviewModeldefault2, i);
        viewGroup.addView(viewTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        return viewTuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (this.b && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            b(i);
        }
        View view = (View) obj;
        viewGroup.removeView(view);
        if (this.TuitionPaymentFragmentbindingInflater1) {
            return;
        }
        this.g.put(0, view);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void notifyDataSetChanged() {
        this.TuitionPaymentFragmentbindingInflater1 = true;
        super.notifyDataSetChanged();
        this.TuitionPaymentFragmentbindingInflater1 = false;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        List<T> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int size = list != null ? list.size() : 0;
        return (this.b && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) ? size + 2 : size;
    }

    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        List<T> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    private int b(int i) {
        if (!this.b || !this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            return i;
        }
        if (i == 0) {
            return getCount() - 3;
        }
        if (i > getCount() - 2) {
            return 0;
        }
        return i - 1;
    }

    public final int b() {
        if (this.b) {
            List<T> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (list == null) {
                return 0;
            }
            return list.size();
        }
        List<T> list2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (list2 == null) {
            return 0;
        }
        return list2.size() - 1;
    }
}
