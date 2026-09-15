package androidx.compose.runtime.tooling;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00008'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/tooling/CompositionInstance;", "", "Landroidx/compose/runtime/tooling/CompositionGroup;", "findContextGroup", "()Landroidx/compose/runtime/tooling/CompositionGroup;", "getParent", "()Landroidx/compose/runtime/tooling/CompositionInstance;", "parent", "Landroidx/compose/runtime/tooling/CompositionData;", "getData", "()Landroidx/compose/runtime/tooling/CompositionData;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface CompositionInstance {
    CompositionGroup findContextGroup();

    CompositionData getData();

    CompositionInstance getParent();
}
