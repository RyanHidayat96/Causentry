package androidx.p010navigationevent.p011compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.p010navigationevent.NavigationEventDispatcherOwner;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0087\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u00048G¢\u0006\u0006\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/navigationevent/compose/LocalNavigationEventDispatcherOwner;", "", "<init>", "()V", "Landroidx/navigationevent/NavigationEventDispatcherOwner;", "p0", "Landroidx/compose/runtime/ProvidedValue;", "provides", "(Landroidx/navigationevent/NavigationEventDispatcherOwner;)Landroidx/compose/runtime/ProvidedValue;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalNavigationEventDispatcherOwner", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getCurrent", "(Landroidx/compose/runtime/Composer;I)Landroidx/navigationevent/NavigationEventDispatcherOwner;", "current"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LocalNavigationEventDispatcherOwner {
    public static final int $stable = 0;
    public static final LocalNavigationEventDispatcherOwner INSTANCE = new LocalNavigationEventDispatcherOwner();
    private static final ProvidableCompositionLocal<NavigationEventDispatcherOwner> LocalNavigationEventDispatcherOwner = CompositionLocalKt.compositionLocalOf$default(null, new Function0() { // from class: androidx.navigationevent.compose.LocalNavigationEventDispatcherOwner$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LocalNavigationEventDispatcherOwner.LocalNavigationEventDispatcherOwner$lambda$0();
        }
    }, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavigationEventDispatcherOwner LocalNavigationEventDispatcherOwner$lambda$0() {
        return null;
    }

    private LocalNavigationEventDispatcherOwner() {
    }

    public final NavigationEventDispatcherOwner getCurrent(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-942026292, i, -1, "androidx.navigationevent.compose.LocalNavigationEventDispatcherOwner.<get-current> (LocalNavigationEventDispatcherOwner.kt:38)");
        }
        NavigationEventDispatcherOwner navigationEventDispatcherOwnerFindViewTreeNavigationEventDispatcherOwner = (NavigationEventDispatcherOwner) composer.consume(LocalNavigationEventDispatcherOwner);
        if (navigationEventDispatcherOwnerFindViewTreeNavigationEventDispatcherOwner != null) {
            composer.startReplaceGroup(950834231);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(950836184);
            navigationEventDispatcherOwnerFindViewTreeNavigationEventDispatcherOwner = LocalNavigationEventDispatcherOwner_androidKt.findViewTreeNavigationEventDispatcherOwner(composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return navigationEventDispatcherOwnerFindViewTreeNavigationEventDispatcherOwner;
    }

    public final ProvidedValue<NavigationEventDispatcherOwner> provides(NavigationEventDispatcherOwner p0) {
        return LocalNavigationEventDispatcherOwner.provides(p0);
    }
}
