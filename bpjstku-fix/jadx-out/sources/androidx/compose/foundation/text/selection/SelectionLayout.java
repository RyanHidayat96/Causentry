package androidx.compose.foundation.text.selection;

import androidx.collection.LongObjectMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0012\b`\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u00020\t2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000H&¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00188'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0014R\u0014\u0010\u001e\u001a\u00020\f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0014R\u0016\u0010$\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00188'X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001aR\u0014\u0010(\u001a\u00020\b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0014R\u0014\u0010*\u001a\u00020\u00188'X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u001aø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionLayout;", "", "Landroidx/compose/foundation/text/selection/Selection;", "p0", "Landroidx/collection/LongObjectMap;", "createSubSelections", "(Landroidx/compose/foundation/text/selection/Selection;)Landroidx/collection/LongObjectMap;", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/selection/SelectableInfo;", "", "forEachMiddleInfo", "(Lkotlin/jvm/functions/Function1;)V", "", "shouldRecomputeSelection", "(Landroidx/compose/foundation/text/selection/SelectionLayout;)Z", "Landroidx/compose/foundation/text/selection/CrossStatus;", "getCrossStatus", "()Landroidx/compose/foundation/text/selection/CrossStatus;", "crossStatus", "getCurrentInfo", "()Landroidx/compose/foundation/text/selection/SelectableInfo;", "currentInfo", "getEndInfo", "endInfo", "", "getEndSlot", "()I", "endSlot", "getFirstInfo", "firstInfo", "isStartHandle", "()Z", "getLastInfo", "lastInfo", "getPreviousSelection", "()Landroidx/compose/foundation/text/selection/Selection;", "previousSelection", "getSize", "size", "getStartInfo", "startInfo", "getStartSlot", "startSlot"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface SelectionLayout {
    LongObjectMap<Selection> createSubSelections(Selection p0);

    void forEachMiddleInfo(Function1<? super SelectableInfo, Unit> p0);

    CrossStatus getCrossStatus();

    SelectableInfo getCurrentInfo();

    SelectableInfo getEndInfo();

    int getEndSlot();

    SelectableInfo getFirstInfo();

    SelectableInfo getLastInfo();

    Selection getPreviousSelection();

    int getSize();

    SelectableInfo getStartInfo();

    int getStartSlot();

    boolean isStartHandle();

    boolean shouldRecomputeSelection(SelectionLayout p0);
}
