package defpackage;

import androidx.fragment.app.Fragment;
import androidx.p002lifecycle.ViewModel;
import androidx.p002lifecycle.ViewModelStoreOwner;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes4.dex */
public final class getFocusY {
    public static final <T extends ViewModel> T b(Fragment fragment, KClass<T> kClass, mapPoint mappoint, Function0<? extends ViewModelStoreOwner> function0, Function0<CoordinateTransform> function1) {
        Fragment fragment2 = fragment;
        return (T) isQuickZoomEnabled.b(fragment2 instanceof getEventTime ? ((getEventTime) fragment2).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b, new setQuickZoomEnabled(kClass, fragment, mappoint, function0, function1));
    }
}
