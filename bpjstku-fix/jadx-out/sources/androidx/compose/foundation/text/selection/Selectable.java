package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0007H&¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH&ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0007H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H&¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0007H&¢\u0006\u0004\b\u001a\u0010\rJ\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0007H&¢\u0006\u0004\b\u001b\u0010\rJ\u001a\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u0007H&ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010 \u001a\u0004\u0018\u00010\u000eH&¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H'¢\u0006\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020%8'X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/Selectable;", "", "Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;", "p0", "", "appendSelectableInfoToBuilder", "(Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;)V", "", "Landroidx/compose/ui/geometry/Rect;", "getBoundingBox", "(I)Landroidx/compose/ui/geometry/Rect;", "", "getCenterYForOffset", "(I)F", "Landroidx/compose/foundation/text/selection/Selection;", "", "p1", "Landroidx/compose/ui/geometry/Offset;", "getHandlePosition-dBAh8RU", "(Landroidx/compose/foundation/text/selection/Selection;Z)J", "getHandlePosition", "getLastVisibleOffset", "()I", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "getLineLeft", "getLineRight", "Landroidx/compose/ui/text/TextRange;", "getRangeOfLineContaining--jx7JFs", "(I)J", "getRangeOfLineContaining", "getSelectAllSelection", "()Landroidx/compose/foundation/text/selection/Selection;", "Landroidx/compose/ui/text/AnnotatedString;", "getText", "()Landroidx/compose/ui/text/AnnotatedString;", "", "getSelectableId", "()J", "selectableId"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface Selectable {
    void appendSelectableInfoToBuilder(SelectionLayoutBuilder p0);

    Rect getBoundingBox(int p0);

    float getCenterYForOffset(int p0);

    /* JADX INFO: renamed from: getHandlePosition-dBAh8RU */
    long mo1649getHandlePositiondBAh8RU(Selection p0, boolean p1);

    int getLastVisibleOffset();

    LayoutCoordinates getLayoutCoordinates();

    float getLineLeft(int p0);

    float getLineRight(int p0);

    /* JADX INFO: renamed from: getRangeOfLineContaining--jx7JFs */
    long mo1650getRangeOfLineContainingjx7JFs(int p0);

    Selection getSelectAllSelection();

    long getSelectableId();

    AnnotatedString getText();
}
