package androidx.compose.runtime;

import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000z\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u001c\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001a\u001a@\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0082\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a>\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0082\b¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\f\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001c\u0010\u0013\u001a\u00020\b*\u00020\u00122\u0006\u0010\u0005\u001a\u00020\bH\u0082\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001c\u0010\u0015\u001a\u00020\u0004*\u00020\u00122\u0006\u0010\u0005\u001a\u00020\bH\u0082\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001c\u0010\u0017\u001a\u00020\b*\u00020\u00122\u0006\u0010\u0005\u001a\u00020\bH\u0082\b¢\u0006\u0004\b\u0017\u0010\u0014\u001a\u001c\u0010\u0018\u001a\u00020\u0004*\u00020\u00122\u0006\u0010\u0005\u001a\u00020\bH\u0082\b¢\u0006\u0004\b\u0018\u0010\u0016\u001a\u001b\u0010\u0019\u001a\u00020\b*\u00020\u00122\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u0014\u001a\u001c\u0010\u001a\u001a\u00020\u0004*\u00020\u00122\u0006\u0010\u0005\u001a\u00020\bH\u0082\b¢\u0006\u0004\b\u001a\u0010\u0016\u001a\u001b\u0010\u001c\u001a\u00020\u001b*\u00020\u00122\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001c\u0010\u001e\u001a\u00020\u0004*\u00020\u00122\u0006\u0010\u0005\u001a\u00020\bH\u0082\b¢\u0006\u0004\b\u001e\u0010\u0016\u001a#\u0010 \u001a\u00020\u001b*\u00020\u00122\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010!\u001a\u001c\u0010\"\u001a\u00020\u0004*\u00020\u00122\u0006\u0010\u0005\u001a\u00020\bH\u0082\b¢\u0006\u0004\b\"\u0010\u0016\u001a#\u0010#\u001a\u00020\u001b*\u00020\u00122\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010!\u001a\u001c\u0010$\u001a\u00020\u0004*\u00020\u00122\u0006\u0010\u0005\u001a\u00020\bH\u0082\b¢\u0006\u0004\b$\u0010\u0016\u001a\u001b\u0010%\u001a\u00020\b*\u00020\u00122\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b%\u0010\u0014\u001a\u001b\u0010&\u001a\u00020\b*\u00020\u00122\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b&\u0010\u0014\u001a\u0018\u0010'\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\bH\u0082\b¢\u0006\u0004\b'\u0010(\u001a\u001c\u0010)\u001a\u00020\b*\u00020\u00122\u0006\u0010\u0005\u001a\u00020\bH\u0082\b¢\u0006\u0004\b)\u0010\u0014\u001a#\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0**\u00020\u00122\b\b\u0002\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b+\u0010,\u001a\u001c\u0010-\u001a\u00020\b*\u00020\u00122\u0006\u0010\u0005\u001a\u00020\bH\u0082\b¢\u0006\u0004\b-\u0010\u0014\u001a#\u0010.\u001a\u00020\u001b*\u00020\u00122\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bH\u0002¢\u0006\u0004\b.\u0010/\u001a#\u00100\u001a\b\u0012\u0004\u0012\u00020\b0**\u00020\u00122\b\b\u0002\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b0\u0010,\u001a\u001c\u00101\u001a\u00020\b*\u00020\u00122\u0006\u0010\u0005\u001a\u00020\bH\u0082\b¢\u0006\u0004\b1\u0010\u0014\u001a$\u00102\u001a\u00020\u001b*\u00020\u00122\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bH\u0082\b¢\u0006\u0004\b2\u0010/\u001a#\u00103\u001a\b\u0012\u0004\u0012\u00020\b0**\u00020\u00122\b\b\u0002\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b3\u0010,\u001a\u001b\u00104\u001a\u00020\b*\u00020\u00122\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b4\u0010\u0014\u001a#\u00105\u001a\u00020\u001b*\u00020\u00122\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bH\u0002¢\u0006\u0004\b5\u0010/\u001a'\u00107\u001a\b\u0012\u0004\u0012\u00020\b0**\u00020\u00122\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\b06H\u0002¢\u0006\u0004\b7\u00108\u001a#\u00109\u001a\b\u0012\u0004\u0012\u00020\b0**\u00020\u00122\b\b\u0002\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b9\u0010,\u001a\u001c\u0010:\u001a\u00020\b*\u00020\u00122\u0006\u0010\u0005\u001a\u00020\bH\u0082\b¢\u0006\u0004\b:\u0010\u0014\u001a$\u0010;\u001a\u00020\u001b*\u00020\u00122\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bH\u0082\b¢\u0006\u0004\b;\u0010/\u001a#\u0010<\u001a\b\u0012\u0004\u0012\u00020\b0**\u00020\u00122\b\b\u0002\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b<\u0010,\u001aK\u0010B\u001a\u00020\u001b*\u00020\u00122\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010=\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\u00042\u0006\u0010?\u001a\u00020\u00042\u0006\u0010@\u001a\u00020\b2\u0006\u0010A\u001a\u00020\bH\u0002¢\u0006\u0004\bB\u0010C\u001a\u0014\u0010D\u001a\u00020\b*\u00020\u0004H\u0082\b¢\u0006\u0004\bD\u0010E\u001a#\u0010F\u001a\u00020\u001b*\u00020\u00122\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bH\u0002¢\u0006\u0004\bF\u0010/\u001aB\u0010I\u001a\u00020G*\u0012\u0012\u0004\u0012\u00020G0\u0001j\b\u0012\u0004\u0012\u00020G`\u00022\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020G0HH\u0082\b¢\u0006\u0004\bI\u0010J\u001a5\u0010K\u001a\u0004\u0018\u00010G*\u0012\u0012\u0004\u0012\u00020G0\u0001j\b\u0012\u0004\u0012\u00020G`\u00022\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bH\u0002¢\u0006\u0004\bK\u0010L\u001a3\u0010M\u001a\u00020\b*\u0012\u0012\u0004\u0012\u00020G0\u0001j\b\u0012\u0004\u0012\u00020G`\u00022\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bH\u0002¢\u0006\u0004\bM\u0010N\u001a3\u0010O\u001a\u00020\b*\u0012\u0012\u0004\u0012\u00020G0\u0001j\b\u0012\u0004\u0012\u00020G`\u00022\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bH\u0002¢\u0006\u0004\bO\u0010N\u001a)\u0010R\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00020Q0P2\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bH\u0002¢\u0006\u0004\bR\u0010S\u001a\u000f\u0010T\u001a\u00020\u001bH\u0000¢\u0006\u0004\bT\u0010U\"\u0014\u0010W\u001a\u00020V8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bW\u0010X\"\u0019\u0010\\\u001a\u00020\b*\u00020Y8Ã\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[\"\u0014\u0010]\u001a\u00020\b8\u0002X\u0083T¢\u0006\u0006\n\u0004\b]\u0010^\"\u0014\u0010_\u001a\u00020\b8\u0002X\u0083T¢\u0006\u0006\n\u0004\b_\u0010^\"\u0014\u0010`\u001a\u00020\b8\u0002X\u0083T¢\u0006\u0006\n\u0004\b`\u0010^\"\u0014\u0010a\u001a\u00020\b8\u0002X\u0083T¢\u0006\u0006\n\u0004\ba\u0010^\"\u0014\u0010b\u001a\u00020\b8\u0002X\u0083T¢\u0006\u0006\n\u0004\bb\u0010^\"\u0014\u0010c\u001a\u00020\b8\u0002X\u0083T¢\u0006\u0006\n\u0004\bc\u0010^\"\u0014\u0010d\u001a\u00020\b8\u0002X\u0083T¢\u0006\u0006\n\u0004\bd\u0010^\"\u0014\u0010e\u001a\u00020\b8\u0002X\u0083T¢\u0006\u0006\n\u0004\be\u0010^\"\u0014\u0010f\u001a\u00020\b8\u0002X\u0083T¢\u0006\u0006\n\u0004\bf\u0010^\"\u0014\u0010g\u001a\u00020\b8\u0002X\u0083T¢\u0006\u0006\n\u0004\bg\u0010^\"\u0014\u0010h\u001a\u00020\b8\u0002X\u0083T¢\u0006\u0006\n\u0004\bh\u0010^\"\u0014\u0010i\u001a\u00020\b8\u0002X\u0083T¢\u0006\u0006\n\u0004\bi\u0010^\"\u0014\u0010j\u001a\u00020\b8\u0002X\u0083T¢\u0006\u0006\n\u0004\bj\u0010^\"\u0014\u0010k\u001a\u00020\b8\u0002X\u0083T¢\u0006\u0006\n\u0004\bk\u0010^\"\u0014\u0010l\u001a\u00020\b8\u0002X\u0083T¢\u0006\u0006\n\u0004\bl\u0010^\"\u0014\u0010m\u001a\u00020\b8\u0002X\u0083T¢\u0006\u0006\n\u0004\bm\u0010^\"\u0014\u0010n\u001a\u00020\b8\u0002X\u0083T¢\u0006\u0006\n\u0004\bn\u0010^\"\u0014\u0010o\u001a\u00020\b8\u0002X\u0083T¢\u0006\u0006\n\u0004\bo\u0010^\"\u0014\u0010p\u001a\u00020\b8\u0002X\u0083T¢\u0006\u0006\n\u0004\bp\u0010^\"\u0014\u0010q\u001a\u00020\b8\u0002X\u0083T¢\u0006\u0006\n\u0004\bq\u0010^\"\u0014\u0010r\u001a\u00020\b8\u0002X\u0083T¢\u0006\u0006\n\u0004\br\u0010^\"\u0014\u0010s\u001a\u00020\b8\u0002X\u0083T¢\u0006\u0006\n\u0004\bs\u0010^"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Ljava/util/ArrayList;", "Lkotlin/collections/b;", "Lkotlin/Function1;", "", "p0", "fastLastOrNull", "(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "", "fastIndexOf", "(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;)I", "", "summarize", "(Ljava/lang/String;I)Ljava/lang/String;", "Landroidx/compose/runtime/SlotTable;", "Landroidx/compose/runtime/tooling/CompositionGroup;", "compositionGroupOf", "(Landroidx/compose/runtime/SlotTable;I)Landroidx/compose/runtime/tooling/CompositionGroup;", "", "groupInfo", "([II)I", "isNode", "([II)Z", "nodeIndex", "hasObjectKey", "objectKeyIndex", "hasAux", "", "addAux", "([II)V", "hasMark", "p1", "updateMark", "([IIZ)V", "containsMark", "updateContainsMark", "containsAnyMark", "auxIndex", "slotAnchor", "countOneBits", "(I)I", "key", "", UserMetadata.KEYDATA_FILENAME, "([II)Ljava/util/List;", "nodeCount", "updateNodeCount", "([III)V", "nodeCounts", "parentAnchor", "updateParentAnchor", "parentAnchors", "groupSize", "updateGroupSize", "", "slice", "([ILjava/lang/Iterable;)Ljava/util/List;", "groupSizes", "dataAnchor", "updateDataAnchor", "dataAnchors", "p2", "p3", "p4", "p5", "p6", "initGroup", "([IIIZZZII)V", "toBit", "(Z)I", "updateGroupKey", "Landroidx/compose/runtime/Anchor;", "Lkotlin/Function0;", "getOrAdd", "(Ljava/util/ArrayList;IILkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/Anchor;", "find", "(Ljava/util/ArrayList;II)Landroidx/compose/runtime/Anchor;", FirebaseAnalytics.Event.SEARCH, "(Ljava/util/ArrayList;II)I", "locationOf", "Landroidx/collection/MutableIntObjectMap;", "Landroidx/collection/MutableIntSet;", "add", "(Landroidx/collection/MutableIntObjectMap;II)V", "throwConcurrentModificationException", "()V", "", "EmptyLongArray", "[J", "", "getFirstBitSet", "(J)I", "firstBitSet", "parentAnchorPivot", "I", "Key_Offset", "GroupInfo_Offset", "ParentAnchor_Offset", "Size_Offset", "DataAnchor_Offset", "Group_Fields_Size", "NodeBit_Mask", "NodeBit_Shift", "ObjectKey_Mask", "ObjectKey_Shift", "Aux_Mask", "Aux_Shift", "Mark_Mask", "Mark_Shift", "ContainsMark_Mask", "ContainsMark_Shift", "Slots_Shift", "NodeCount_Mask", "MinGroupGrowthSize", "MinSlotsGrowthSize", "LIVE_EDIT_INVALID_KEY"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SlotTableKt {
    private static final int Aux_Mask = 268435456;
    private static final int Aux_Shift = 28;
    private static final int ContainsMark_Mask = 67108864;
    private static final int ContainsMark_Shift = 26;
    private static final int DataAnchor_Offset = 4;
    private static final long[] EmptyLongArray = new long[0];
    private static final int GroupInfo_Offset = 1;
    private static final int Group_Fields_Size = 5;
    private static final int Key_Offset = 0;
    private static final int LIVE_EDIT_INVALID_KEY = -3;
    private static final int Mark_Mask = 134217728;
    private static final int Mark_Shift = 27;
    private static final int MinGroupGrowthSize = 32;
    private static final int MinSlotsGrowthSize = 32;
    private static final int NodeBit_Mask = 1073741824;
    private static final int NodeBit_Shift = 30;
    private static final int NodeCount_Mask = 67108863;
    private static final int ObjectKey_Mask = 536870912;
    private static final int ObjectKey_Shift = 29;
    private static final int ParentAnchor_Offset = 2;
    private static final int Size_Offset = 3;
    private static final int Slots_Shift = 28;
    private static final int parentAnchorPivot = -2;

    private static final int toBit(boolean z) {
        return z ? 1 : 0;
    }

    private static final <T> T fastLastOrNull(ArrayList<T> arrayList, Function1<? super T, Boolean> function1) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            T t = arrayList.get(size);
            if (function1.invoke(t).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    private static final <T> int fastIndexOf(ArrayList<T> arrayList, Function1<? super T, Boolean> function1) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (function1.invoke(arrayList.get(i)).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String summarize(String str, int i) {
        String strReplace$default = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(str, "androidx.", "a.", false, 4, (Object) null), "compose.", "c.", false, 4, (Object) null), "runtime.", "r.", false, 4, (Object) null), "internal.", "ι.", false, 4, (Object) null), "ui.", "u.", false, 4, (Object) null), "Modifier", "μ", false, 4, (Object) null), "material.", "m.", false, 4, (Object) null), "Function", "λ", false, 4, (Object) null), "OpaqueKey", "κ", false, 4, (Object) null), "MutableState", "σ", false, 4, (Object) null);
        String strSubstring = strReplace$default.substring(0, Math.min(i, strReplace$default.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring;
    }

    public static final CompositionGroup compositionGroupOf(SlotTable slotTable, int i) {
        return new SlotTableGroup(slotTable, i, slotTable.getVersion());
    }

    private static final int getFirstBitSet(long j) {
        return Long.numberOfTrailingZeros(j);
    }

    private static final int groupInfo(int[] iArr, int i) {
        return iArr[(i * 5) + 1];
    }

    private static final boolean isNode(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 1073741824) != 0;
    }

    private static final int nodeIndex(int[] iArr, int i) {
        return iArr[(i * 5) + 4];
    }

    private static final boolean hasObjectKey(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & ObjectKey_Mask) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int objectKeyIndex(int[] iArr, int i) {
        int i2 = i * 5;
        return iArr[i2 + 4] + Integer.bitCount(iArr[i2 + 1] >> 30);
    }

    private static final boolean hasAux(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & Aux_Mask) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addAux(int[] iArr, int i) {
        int i2 = (i * 5) + 1;
        iArr[i2] = iArr[i2] | Aux_Mask;
    }

    private static final boolean hasMark(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & Mark_Mask) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateMark(int[] iArr, int i, boolean z) {
        int i2 = (i * 5) + 1;
        iArr[i2] = ((z ? 1 : 0) << 27) | (iArr[i2] & (-134217729));
    }

    private static final boolean containsMark(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 67108864) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateContainsMark(int[] iArr, int i, boolean z) {
        int i2 = (i * 5) + 1;
        iArr[i2] = ((z ? 1 : 0) << 26) | (iArr[i2] & (-67108865));
    }

    private static final boolean containsAnyMark(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 201326592) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int auxIndex(int[] iArr, int i) {
        int i2 = i * 5;
        return i2 >= iArr.length ? iArr.length : iArr[i2 + 4] + Integer.bitCount(iArr[i2 + 1] >> 29);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int slotAnchor(int[] iArr, int i) {
        int i2 = i * 5;
        return iArr[i2 + 4] + Integer.bitCount(iArr[i2 + 1] >> 28);
    }

    private static final int countOneBits(int i) {
        return Integer.bitCount(i);
    }

    private static final int key(int[] iArr, int i) {
        return iArr[i * 5];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> keys(int[] iArr, int i) {
        return slice(iArr, RangesKt.step(RangesKt.until(0, i), 5));
    }

    static /* synthetic */ List keys$default(int[] iArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = iArr.length;
        }
        return keys(iArr, i);
    }

    private static final int nodeCount(int[] iArr, int i) {
        return iArr[(i * 5) + 1] & 67108863;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateNodeCount(int[] iArr, int i, int i2) {
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    static /* synthetic */ List nodeCounts$default(int[] iArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = iArr.length;
        }
        return nodeCounts(iArr, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> nodeCounts(int[] iArr, int i) {
        List<Integer> listSlice = slice(iArr, RangesKt.step(RangesKt.until(1, i), 5));
        ArrayList arrayList = new ArrayList(listSlice.size());
        int size = listSlice.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(Integer.valueOf(listSlice.get(i2).intValue() & 67108863));
        }
        return arrayList;
    }

    private static final int parentAnchor(int[] iArr, int i) {
        return iArr[(i * 5) + 2];
    }

    private static final void updateParentAnchor(int[] iArr, int i, int i2) {
        iArr[(i * 5) + 2] = i2;
    }

    static /* synthetic */ List parentAnchors$default(int[] iArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = iArr.length;
        }
        return parentAnchors(iArr, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> parentAnchors(int[] iArr, int i) {
        return slice(iArr, RangesKt.step(RangesKt.until(2, i), 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int groupSize(int[] iArr, int i) {
        return iArr[(i * 5) + 3];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateGroupSize(int[] iArr, int i, int i2) {
        iArr[(i * 5) + 3] = i2;
    }

    private static final List<Integer> slice(int[] iArr, Iterable<Integer> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(iArr[it.next().intValue()]));
        }
        return arrayList;
    }

    static /* synthetic */ List groupSizes$default(int[] iArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = iArr.length;
        }
        return groupSizes(iArr, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> groupSizes(int[] iArr, int i) {
        return slice(iArr, RangesKt.step(RangesKt.until(3, i), 5));
    }

    private static final int dataAnchor(int[] iArr, int i) {
        return iArr[(i * 5) + 4];
    }

    private static final void updateDataAnchor(int[] iArr, int i, int i2) {
        iArr[(i * 5) + 4] = i2;
    }

    static /* synthetic */ List dataAnchors$default(int[] iArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = iArr.length;
        }
        return dataAnchors(iArr, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> dataAnchors(int[] iArr, int i) {
        return slice(iArr, RangesKt.step(RangesKt.until(4, i), 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initGroup(int[] iArr, int i, int i2, boolean z, boolean z2, boolean z3, int i3, int i4) {
        int i5 = i * 5;
        iArr[i5] = i2;
        iArr[i5 + 1] = ((z ? 1 : 0) << 30) | ((z2 ? 1 : 0) << 29) | ((z3 ? 1 : 0) << 28);
        iArr[i5 + 2] = i3;
        iArr[i5 + 3] = 0;
        iArr[i5 + 4] = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateGroupKey(int[] iArr, int i, int i2) {
        iArr[i * 5] = i2;
    }

    private static final Anchor getOrAdd(ArrayList<Anchor> arrayList, int i, int i2, Function0<Anchor> function0) {
        int iSearch = search(arrayList, i, i2);
        if (iSearch < 0) {
            Anchor anchorInvoke = function0.invoke();
            arrayList.add(-(iSearch + 1), anchorInvoke);
            return anchorInvoke;
        }
        return arrayList.get(iSearch);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Anchor find(ArrayList<Anchor> arrayList, int i, int i2) {
        int iSearch = search(arrayList, i, i2);
        if (iSearch >= 0) {
            return arrayList.get(iSearch);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int search(ArrayList<Anchor> arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int location$runtime = arrayList.get(i4).getLocation();
            if (location$runtime < 0) {
                location$runtime += i2;
            }
            int iCompare = Intrinsics.compare(location$runtime, i);
            if (iCompare < 0) {
                i3 = i4 + 1;
            } else {
                if (iCompare <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int locationOf(ArrayList<Anchor> arrayList, int i, int i2) {
        int iSearch = search(arrayList, i, i2);
        return iSearch >= 0 ? iSearch : -(iSearch + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void add(MutableIntObjectMap<MutableIntSet> mutableIntObjectMap, int i, int i2) {
        MutableIntSet mutableIntSet = mutableIntObjectMap.get(i);
        if (mutableIntSet == null) {
            mutableIntSet = new MutableIntSet(0, 1, null);
            mutableIntObjectMap.set(i, mutableIntSet);
        }
        mutableIntSet.add(i2);
    }

    public static final void throwConcurrentModificationException() {
        throw new ConcurrentModificationException();
    }
}
