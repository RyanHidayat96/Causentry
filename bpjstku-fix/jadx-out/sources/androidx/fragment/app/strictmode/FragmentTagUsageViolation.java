package androidx.fragment.app.strictmode;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentTagUsageViolation;", "Landroidx/fragment/app/strictmode/Violation;", "Landroidx/fragment/app/Fragment;", "p0", "Landroid/view/ViewGroup;", "p1", "<init>", "(Landroidx/fragment/app/Fragment;Landroid/view/ViewGroup;)V", "parentContainer", "Landroid/view/ViewGroup;", "getParentContainer", "()Landroid/view/ViewGroup;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FragmentTagUsageViolation extends Violation {
    private final ViewGroup parentContainer;

    public final ViewGroup getParentContainer() {
        return this.parentContainer;
    }

    public FragmentTagUsageViolation(Fragment fragment, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(fragment, "");
        StringBuilder sb = new StringBuilder("Attempting to use <fragment> tag to add fragment ");
        sb.append(fragment);
        sb.append(" to container ");
        sb.append(viewGroup);
        super(fragment, sb.toString());
        this.parentContainer = viewGroup;
    }
}
