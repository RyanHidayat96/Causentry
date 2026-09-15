package androidx.compose.runtime.tooling;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Landroidx/compose/runtime/tooling/ComposeStackTraceFrame;", "", "Landroidx/compose/runtime/tooling/SourceInformation;", "p0", "", "p1", "<init>", "(Landroidx/compose/runtime/tooling/SourceInformation;Ljava/lang/Integer;)V", "component1", "()Landroidx/compose/runtime/tooling/SourceInformation;", "component2", "()Ljava/lang/Integer;", "copy", "(Landroidx/compose/runtime/tooling/SourceInformation;Ljava/lang/Integer;)Landroidx/compose/runtime/tooling/ComposeStackTraceFrame;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "sourceInfo", "Landroidx/compose/runtime/tooling/SourceInformation;", "getSourceInfo", "groupOffset", "Ljava/lang/Integer;", "getGroupOffset"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ComposeStackTraceFrame {
    public static final int $stable = 8;
    private final Integer groupOffset;
    private final SourceInformation sourceInfo;

    public ComposeStackTraceFrame(SourceInformation sourceInformation, Integer num) {
        this.sourceInfo = sourceInformation;
        this.groupOffset = num;
    }

    public final SourceInformation getSourceInfo() {
        return this.sourceInfo;
    }

    public final Integer getGroupOffset() {
        return this.groupOffset;
    }

    public static /* synthetic */ ComposeStackTraceFrame copy$default(ComposeStackTraceFrame composeStackTraceFrame, SourceInformation sourceInformation, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            sourceInformation = composeStackTraceFrame.sourceInfo;
        }
        if ((i & 2) != 0) {
            num = composeStackTraceFrame.groupOffset;
        }
        return composeStackTraceFrame.copy(sourceInformation, num);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SourceInformation getSourceInfo() {
        return this.sourceInfo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getGroupOffset() {
        return this.groupOffset;
    }

    public final ComposeStackTraceFrame copy(SourceInformation p0, Integer p1) {
        return new ComposeStackTraceFrame(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ComposeStackTraceFrame)) {
            return false;
        }
        ComposeStackTraceFrame composeStackTraceFrame = (ComposeStackTraceFrame) p0;
        return Intrinsics.areEqual(this.sourceInfo, composeStackTraceFrame.sourceInfo) && Intrinsics.areEqual(this.groupOffset, composeStackTraceFrame.groupOffset);
    }

    public final int hashCode() {
        int iHashCode = this.sourceInfo.hashCode();
        Integer num = this.groupOffset;
        return (iHashCode * 31) + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ComposeStackTraceFrame(sourceInfo=");
        sb.append(this.sourceInfo);
        sb.append(", groupOffset=");
        sb.append(this.groupOffset);
        sb.append(')');
        return sb.toString();
    }
}
