package androidx.p010navigationevent.p011compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.p010navigationevent.NavigationEventDispatcherOwner;
import androidx.p010navigationevent.View;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/navigationevent/NavigationEventDispatcherOwner;", "findViewTreeNavigationEventDispatcherOwner", "(Landroidx/compose/runtime/Composer;I)Landroidx/navigationevent/NavigationEventDispatcherOwner;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class LocalNavigationEventDispatcherOwner_androidKt {
    public static final NavigationEventDispatcherOwner findViewTreeNavigationEventDispatcherOwner(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-334864187, i, -1, "androidx.navigationevent.compose.findViewTreeNavigationEventDispatcherOwner (LocalNavigationEventDispatcherOwner.android.kt:25)");
        }
        NavigationEventDispatcherOwner navigationEventDispatcherOwner = View.get((android.view.View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return navigationEventDispatcherOwner;
    }
}
