package androidx.fragment.app;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/fragment/app/Fragment;", "F", "Landroid/view/View;", "findFragment", "(Landroid/view/View;)Landroidx/fragment/app/Fragment;"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ViewKt {
    public static final <F extends Fragment> F findFragment(View view) {
        Intrinsics.checkNotNullParameter(view, "");
        F f = (F) FragmentManager.findFragment(view);
        Intrinsics.checkNotNullExpressionValue(f, "");
        return f;
    }
}
