package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class VirtualCameraControlExternalSyntheticLambda0<Fragment extends Fragment> extends FragmentStatePagerAdapter {
    private List<String> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private List<? extends Fragment> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public final List<Fragment> b() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public VirtualCameraControlExternalSyntheticLambda0(FragmentManager fragmentManager, List<? extends Fragment> list, List<String> list2) {
        super(fragmentManager);
        CollectionsKt.emptyList();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = list;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = list2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i) {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.size() == this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.size() ? this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(i) : super.getPageTitle(i);
    }
}
