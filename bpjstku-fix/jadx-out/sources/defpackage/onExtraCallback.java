package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import com.bpjstku.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class onExtraCallback extends PagerAdapter {
    private final Context TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final List<enabledefault> b;

    public onExtraCallback(Context context, List<enabledefault> list) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = context;
        this.b = list;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Object systemService = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getSystemService("layout_inflater");
        Intrinsics.checkNotNull(systemService, "");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.layout_onboarding, (ViewGroup) null);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.imgOnboarding);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tvTitleOnBoarding);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tvDescOnBoarding);
        enabledefault enabledefaultVar = this.b.get(i);
        textView.setText(enabledefaultVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        textView2.setText(enabledefaultVar.TuitionPaymentFragmentbindingInflater1);
        imageView.setImageResource(enabledefaultVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        viewGroup.addView(viewInflate);
        Intrinsics.checkNotNull(viewInflate);
        return viewInflate;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.b.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(obj, "");
        viewGroup.removeView((View) obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(obj, "");
        return view == obj;
    }
}
