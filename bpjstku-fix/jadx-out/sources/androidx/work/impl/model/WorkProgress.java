package androidx.work.impl.model;

import androidx.work.Data;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/work/impl/model/WorkProgress;", "", "", "p0", "Landroidx/work/Data;", "p1", "<init>", "(Ljava/lang/String;Landroidx/work/Data;)V", "progress", "Landroidx/work/Data;", "getProgress", "()Landroidx/work/Data;", "workSpecId", "Ljava/lang/String;", "getWorkSpecId", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WorkProgress {
    private final Data progress;
    private final String workSpecId;

    public WorkProgress(String str, Data data) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(data, "");
        this.workSpecId = str;
        this.progress = data;
    }

    public final String getWorkSpecId() {
        return this.workSpecId;
    }

    public final Data getProgress() {
        return this.progress;
    }
}
