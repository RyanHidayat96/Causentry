package androidx.compose.ui.layout;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00018WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/Measured;", "", "Landroidx/compose/ui/layout/AlignmentLine;", "p0", "", "get", "(Landroidx/compose/ui/layout/AlignmentLine;)I", "getMeasuredWidth", "()I", "measuredWidth", "getMeasuredHeight", "measuredHeight", "getParentData", "()Ljava/lang/Object;", "parentData"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface Measured {
    int get(AlignmentLine p0);

    int getMeasuredHeight();

    int getMeasuredWidth();

    default Object getParentData() {
        return null;
    }
}
