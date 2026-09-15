package androidx.compose.runtime.tooling;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H&¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/tooling/CompositionErrorContext;", "", "", "p0", "", "attachComposeStackTrace", "(Ljava/lang/Throwable;Ljava/lang/Object;)Z", "Landroidx/compose/runtime/tooling/CompositionErrorContextImpl;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface CompositionErrorContext {
    boolean attachComposeStackTrace(Throwable th, Object obj);
}
