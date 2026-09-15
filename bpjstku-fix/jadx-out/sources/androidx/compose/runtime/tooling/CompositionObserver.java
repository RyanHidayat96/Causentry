package androidx.compose.runtime.tooling;

import androidx.compose.runtime.RecomposeScope;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0001H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H&¢\u0006\u0004\b\r\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u0006J!\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H&¢\u0006\u0004\b\u0010\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/tooling/CompositionObserver;", "", "Landroidx/compose/runtime/tooling/ObservableComposition;", "p0", "", "onBeginComposition", "(Landroidx/compose/runtime/tooling/ObservableComposition;)V", "Landroidx/compose/runtime/RecomposeScope;", "onScopeEnter", "(Landroidx/compose/runtime/RecomposeScope;)V", "p1", "onReadInScope", "(Landroidx/compose/runtime/RecomposeScope;Ljava/lang/Object;)V", "onScopeExit", "onEndComposition", "onScopeInvalidated", "onScopeDisposed"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface CompositionObserver {
    void onBeginComposition(ObservableComposition p0);

    void onEndComposition(ObservableComposition p0);

    void onReadInScope(RecomposeScope p0, Object p1);

    void onScopeDisposed(RecomposeScope p0);

    void onScopeEnter(RecomposeScope p0);

    void onScopeExit(RecomposeScope p0);

    void onScopeInvalidated(RecomposeScope p0, Object p1);
}
