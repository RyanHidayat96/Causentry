package androidx.work.impl;

import androidx.work.impl.model.WorkGenerationalId;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\r2\u0006\u0010\u0005\u001a\u00020\fH\u0017¢\u0006\u0004\b\n\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u000f\u0010\u000bR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/work/impl/StartStopTokensImpl;", "Landroidx/work/impl/StartStopTokens;", "<init>", "()V", "Landroidx/work/impl/model/WorkGenerationalId;", "p0", "", "contains", "(Landroidx/work/impl/model/WorkGenerationalId;)Z", "Landroidx/work/impl/StartStopToken;", "remove", "(Landroidx/work/impl/model/WorkGenerationalId;)Landroidx/work/impl/StartStopToken;", "", "", "(Ljava/lang/String;)Ljava/util/List;", "tokenFor", "", "runs", "Ljava/util/Map;"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class StartStopTokensImpl implements StartStopTokens {
    private final Map<WorkGenerationalId, StartStopToken> runs = new LinkedHashMap();

    @Override // androidx.work.impl.StartStopTokens
    public final StartStopToken tokenFor(WorkGenerationalId p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Map<WorkGenerationalId, StartStopToken> map = this.runs;
        StartStopToken startStopToken = map.get(p0);
        if (startStopToken == null) {
            startStopToken = new StartStopToken(p0);
            map.put(p0, startStopToken);
        }
        return startStopToken;
    }

    @Override // androidx.work.impl.StartStopTokens
    public final StartStopToken remove(WorkGenerationalId p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.runs.remove(p0);
    }

    @Override // androidx.work.impl.StartStopTokens
    public final List<StartStopToken> remove(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Map<WorkGenerationalId, StartStopToken> map = this.runs;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<WorkGenerationalId, StartStopToken> entry : map.entrySet()) {
            if (Intrinsics.areEqual(entry.getKey().getWorkSpecId(), p0)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        Iterator it = linkedHashMap2.keySet().iterator();
        while (it.hasNext()) {
            this.runs.remove((WorkGenerationalId) it.next());
        }
        return CollectionsKt.toList(linkedHashMap2.values());
    }

    @Override // androidx.work.impl.StartStopTokens
    public final boolean contains(WorkGenerationalId p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.runs.containsKey(p0);
    }
}
