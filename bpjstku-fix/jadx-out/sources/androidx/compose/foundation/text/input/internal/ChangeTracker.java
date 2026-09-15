package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0001!B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004J1\u0010\u000b\u001a\u00020\n2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0016\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010 \u001a\u00020\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/compose/foundation/text/input/internal/ChangeTracker;", "Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;", "p0", "<init>", "(Landroidx/compose/foundation/text/input/internal/ChangeTracker;)V", "Landroidx/compose/foundation/text/input/internal/ChangeTracker$Change;", "", "p1", "p2", "p3", "", "appendNewChange", "(Landroidx/compose/foundation/text/input/internal/ChangeTracker$Change;III)V", "clearChanges", "()V", "Landroidx/compose/ui/text/TextRange;", "getOriginalRange--jx7JFs", "(I)J", "getOriginalRange", "getRange--jx7JFs", "getRange", "", "toString", "()Ljava/lang/String;", "trackChange", "(III)V", "Landroidx/compose/runtime/collection/MutableVector;", "_changes", "Landroidx/compose/runtime/collection/MutableVector;", "_changesTemp", "getChangeCount", "()I", "changeCount", "Change"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ChangeTracker implements TextFieldBuffer.ChangeList {
    public static final int $stable = 8;
    private MutableVector<Change> _changes;
    private MutableVector<Change> _changesTemp;

    public ChangeTracker(ChangeTracker changeTracker) {
        MutableVector<Change> mutableVector;
        int size;
        int i = 0;
        this._changes = new MutableVector<>(new Change[16], 0);
        this._changesTemp = new MutableVector<>(new Change[16], 0);
        if (changeTracker == null || (mutableVector = changeTracker._changes) == null || (size = mutableVector.getSize()) <= 0) {
            return;
        }
        Change[] content = mutableVector.getContent();
        do {
            Change change = content[i];
            this._changes.add(new Change(change.getPreStart(), change.getPreEnd(), change.getOriginalStart(), change.getOriginalEnd()));
            i++;
        } while (i < size);
    }

    public /* synthetic */ ChangeTracker(ChangeTracker changeTracker, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : changeTracker);
    }

    @Override // androidx.compose.foundation.text.input.TextFieldBuffer.ChangeList
    public final int getChangeCount() {
        return this._changes.getSize();
    }

    public final void trackChange(int p0, int p1, int p2) {
        int preEnd;
        if (p0 == p1 && p2 == 0) {
            return;
        }
        int iMin = Math.min(p0, p1);
        int iMax = Math.max(p0, p1);
        int i = p2 - (iMax - iMin);
        Change change = null;
        boolean z = false;
        for (int i2 = 0; i2 < this._changes.getSize(); i2++) {
            Change change2 = this._changes.getContent()[i2];
            int preStart = change2.getPreStart();
            if ((iMin > preStart || preStart > iMax) && (iMin > (preEnd = change2.getPreEnd()) || preEnd > iMax)) {
                if (change2.getPreStart() > iMax && !z) {
                    appendNewChange(change, iMin, iMax, i);
                    z = true;
                }
                if (z) {
                    change2.setPreStart(change2.getPreStart() + i);
                    change2.setPreEnd(change2.getPreEnd() + i);
                }
                this._changesTemp.add(change2);
            } else if (change == null) {
                change = change2;
            } else {
                change.setPreEnd(change2.getPreEnd());
                change.setOriginalEnd(change2.getOriginalEnd());
            }
        }
        if (!z) {
            appendNewChange(change, iMin, iMax, i);
        }
        MutableVector<Change> mutableVector = this._changes;
        this._changes = this._changesTemp;
        this._changesTemp = mutableVector;
        mutableVector.clear();
    }

    public final void clearChanges() {
        this._changes.clear();
    }

    @Override // androidx.compose.foundation.text.input.TextFieldBuffer.ChangeList
    /* JADX INFO: renamed from: getRange--jx7JFs */
    public final long mo1427getRangejx7JFs(int p0) {
        Change change = this._changes.getContent()[p0];
        return TextRangeKt.TextRange(change.getPreStart(), change.getPreEnd());
    }

    @Override // androidx.compose.foundation.text.input.TextFieldBuffer.ChangeList
    /* JADX INFO: renamed from: getOriginalRange--jx7JFs */
    public final long mo1426getOriginalRangejx7JFs(int p0) {
        Change change = this._changes.getContent()[p0];
        return TextRangeKt.TextRange(change.getOriginalStart(), change.getOriginalEnd());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChangeList(changes=[");
        MutableVector<Change> mutableVector = this._changes;
        int size = mutableVector.getSize();
        if (size > 0) {
            Change[] content = mutableVector.getContent();
            int i = 0;
            do {
                Change change = content[i];
                StringBuilder sb2 = new StringBuilder("(");
                sb2.append(change.getOriginalStart());
                sb2.append(',');
                sb2.append(change.getOriginalEnd());
                sb2.append(")->(");
                sb2.append(change.getPreStart());
                sb2.append(',');
                sb2.append(change.getPreEnd());
                sb2.append(')');
                sb.append(sb2.toString());
                if (i < getChangeCount() - 1) {
                    sb.append(", ");
                }
                i++;
            } while (i < size);
        }
        sb.append("])");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    private final void appendNewChange(Change p0, int p1, int p2, int p3) {
        int preEnd;
        if (this._changesTemp.isEmpty()) {
            preEnd = 0;
        } else {
            Change changeLast = this._changesTemp.last();
            preEnd = changeLast.getPreEnd() - changeLast.getOriginalEnd();
        }
        if (p0 == null) {
            int i = p1 - preEnd;
            p0 = new Change(p1, p3 + p2, i, (p2 - p1) + i);
        } else {
            if (p0.getPreStart() > p1) {
                p0.setPreStart(p1);
                p0.setOriginalStart(p1);
            }
            if (p2 > p0.getPreEnd()) {
                int preEnd2 = p0.getPreEnd();
                int originalEnd = p0.getOriginalEnd();
                p0.setPreEnd(p2);
                p0.setOriginalEnd(p2 - (preEnd2 - originalEnd));
            }
            p0.setPreEnd(p0.getPreEnd() + p3);
        }
        this._changesTemp.add(p0);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\nJ\u0010\u0010\u0015\u001a\u00020\u0014H×\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\n\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\n\"\u0004\b\u001e\u0010\u001bR\"\u0010\u001f\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\n\"\u0004\b!\u0010\u001bR\"\u0010\"\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010\n\"\u0004\b$\u0010\u001b"}, d2 = {"Landroidx/compose/foundation/text/input/internal/ChangeTracker$Change;", "", "", "p0", "p1", "p2", "p3", "<init>", "(IIII)V", "component1", "()I", "component2", "component3", "component4", "copy", "(IIII)Landroidx/compose/foundation/text/input/internal/ChangeTracker$Change;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "originalEnd", "I", "getOriginalEnd", "setOriginalEnd", "(I)V", "originalStart", "getOriginalStart", "setOriginalStart", "preEnd", "getPreEnd", "setPreEnd", "preStart", "getPreStart", "setPreStart"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final /* data */ class Change {
        private int originalEnd;
        private int originalStart;
        private int preEnd;
        private int preStart;

        public Change(int i, int i2, int i3, int i4) {
            this.preStart = i;
            this.preEnd = i2;
            this.originalStart = i3;
            this.originalEnd = i4;
        }

        public final int getPreStart() {
            return this.preStart;
        }

        public final void setPreStart(int i) {
            this.preStart = i;
        }

        public final int getPreEnd() {
            return this.preEnd;
        }

        public final void setPreEnd(int i) {
            this.preEnd = i;
        }

        public final int getOriginalStart() {
            return this.originalStart;
        }

        public final void setOriginalStart(int i) {
            this.originalStart = i;
        }

        public final int getOriginalEnd() {
            return this.originalEnd;
        }

        public final void setOriginalEnd(int i) {
            this.originalEnd = i;
        }

        public static /* synthetic */ Change copy$default(Change change, int i, int i2, int i3, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i = change.preStart;
            }
            if ((i5 & 2) != 0) {
                i2 = change.preEnd;
            }
            if ((i5 & 4) != 0) {
                i3 = change.originalStart;
            }
            if ((i5 & 8) != 0) {
                i4 = change.originalEnd;
            }
            return change.copy(i, i2, i3, i4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getPreStart() {
            return this.preStart;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getPreEnd() {
            return this.preEnd;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getOriginalStart() {
            return this.originalStart;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getOriginalEnd() {
            return this.originalEnd;
        }

        public final Change copy(int p0, int p1, int p2, int p3) {
            return new Change(p0, p1, p2, p3);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof Change)) {
                return false;
            }
            Change change = (Change) p0;
            return this.preStart == change.preStart && this.preEnd == change.preEnd && this.originalStart == change.originalStart && this.originalEnd == change.originalEnd;
        }

        public final int hashCode() {
            return (((((Integer.hashCode(this.preStart) * 31) + Integer.hashCode(this.preEnd)) * 31) + Integer.hashCode(this.originalStart)) * 31) + Integer.hashCode(this.originalEnd);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Change(preStart=");
            sb.append(this.preStart);
            sb.append(", preEnd=");
            sb.append(this.preEnd);
            sb.append(", originalStart=");
            sb.append(this.originalStart);
            sb.append(", originalEnd=");
            sb.append(this.originalEnd);
            sb.append(')');
            return sb.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChangeTracker() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
