package androidx.compose.runtime;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\u00020\u00028\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0005R\u0011\u0010\u0016\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/compose/runtime/Anchor;", "", "", "p0", "<init>", "(I)V", "Landroidx/compose/runtime/SlotTable;", "toIndexFor", "(Landroidx/compose/runtime/SlotTable;)I", "Landroidx/compose/runtime/SlotWriter;", "(Landroidx/compose/runtime/SlotWriter;)I", "", "toString", "()Ljava/lang/String;", FirebaseAnalytics.Param.LOCATION, "I", "getLocation$runtime", "()I", "setLocation$runtime", "", "getValid", "()Z", "valid"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Anchor {
    public static final int $stable = 8;
    private int location;

    public Anchor(int i) {
        this.location = i;
    }

    /* JADX INFO: renamed from: getLocation$runtime, reason: from getter */
    public final int getLocation() {
        return this.location;
    }

    public final void setLocation$runtime(int i) {
        this.location = i;
    }

    public final boolean getValid() {
        return this.location != Integer.MIN_VALUE;
    }

    public final int toIndexFor(SlotTable p0) {
        return p0.anchorIndex(this);
    }

    public final int toIndexFor(SlotWriter p0) {
        return p0.anchorIndex(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{ location = ");
        sb.append(this.location);
        sb.append(" }");
        return sb.toString();
    }
}
