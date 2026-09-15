package androidx.p005navigation;

import android.content.Context;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.ViewModelStore;
import androidx.view.OnBackPressedDispatcher;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/navigation/NavHostController;", "Landroidx/navigation/NavController;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "Landroidx/lifecycle/LifecycleOwner;", "", "setLifecycleOwner", "(Landroidx/lifecycle/LifecycleOwner;)V", "Landroidx/activity/OnBackPressedDispatcher;", "setOnBackPressedDispatcher", "(Landroidx/activity/OnBackPressedDispatcher;)V", "", "enableOnBackPressed", "(Z)V", "Landroidx/lifecycle/ViewModelStore;", "setViewModelStore", "(Landroidx/lifecycle/ViewModelStore;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class NavHostController extends NavController {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostController(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // androidx.p005navigation.NavController
    public final void setLifecycleOwner(LifecycleOwner p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        super.setLifecycleOwner(p0);
    }

    @Override // androidx.p005navigation.NavController
    public final void setOnBackPressedDispatcher(OnBackPressedDispatcher p0) throws Exception {
        Intrinsics.checkNotNullParameter(p0, "");
        super.setOnBackPressedDispatcher(p0);
    }

    @Override // androidx.p005navigation.NavController
    public final void enableOnBackPressed(boolean p0) {
        super.enableOnBackPressed(p0);
    }

    @Override // androidx.p005navigation.NavController
    public final void setViewModelStore(ViewModelStore p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        super.setViewModelStore(p0);
    }
}
