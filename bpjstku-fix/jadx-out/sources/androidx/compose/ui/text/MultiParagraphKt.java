package androidx.compose.ui.text;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u001a%\u0010\u0005\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\b\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\t\u001a9\u0010\u0010\u001a\u00020\f2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f0\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a%\u0010\u0011\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0011\u0010\u0006\u001a4\u0010\u0013\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u000bH\u0082\b¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"", "Landroidx/compose/ui/text/ParagraphInfo;", "p0", "", "p1", "findParagraphByIndex", "(Ljava/util/List;I)I", "", "findParagraphByY", "(Ljava/util/List;F)I", "Landroidx/compose/ui/text/TextRange;", "Lkotlin/Function1;", "", "p2", "findParagraphsByRange-Sb-Bc2M", "(Ljava/util/List;JLkotlin/jvm/functions/Function1;)V", "findParagraphsByRange", "findParagraphByLineIndex", ExifInterface.GPS_DIRECTION_TRUE, "fastBinarySearch", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)I"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MultiParagraphKt {
    public static final int findParagraphByIndex(List<ParagraphInfo> list, int i) {
        int i2;
        byte b;
        int endIndex = ((ParagraphInfo) CollectionsKt.last((List) list)).getEndIndex();
        if (i > ((ParagraphInfo) CollectionsKt.last((List) list)).getEndIndex()) {
            StringBuilder sb = new StringBuilder("Index ");
            sb.append(i);
            sb.append(" should be less or equal than last line's end ");
            sb.append(endIndex);
            InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
        }
        int size = list.size() - 1;
        int i3 = 0;
        while (true) {
            if (i3 > size) {
                i2 = -(i3 + 1);
                break;
            }
            i2 = (i3 + size) >>> 1;
            ParagraphInfo paragraphInfo = list.get(i2);
            if (paragraphInfo.getStartIndex() > i) {
                b = 1;
            } else {
                b = paragraphInfo.getEndIndex() <= i ? (byte) -1 : (byte) 0;
            }
            if (b >= 0) {
                if (b <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i3 = i2 + 1;
            }
        }
        if (i2 < 0 || i2 >= list.size()) {
            StringBuilder sb2 = new StringBuilder("Found paragraph index ");
            sb2.append(i2);
            sb2.append(" should be in range [0, ");
            sb2.append(list.size());
            sb2.append(").\nDebug info: index=");
            sb2.append(i);
            sb2.append(", paragraphs=[");
            sb2.append(ListUtilsKt.fastJoinToString$default(list, null, null, null, 0, null, new Function1() { // from class: androidx.compose.ui.text.MultiParagraphKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MultiParagraphKt.findParagraphByIndex$lambda$3$lambda$2((ParagraphInfo) obj);
                }
            }, 31, null));
            sb2.append(']');
            InlineClassHelperKt.throwIllegalArgumentException(sb2.toString());
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence findParagraphByIndex$lambda$3$lambda$2(ParagraphInfo paragraphInfo) {
        StringBuilder sb = new StringBuilder("[");
        sb.append(paragraphInfo.getStartIndex());
        sb.append(", ");
        sb.append(paragraphInfo.getEndIndex());
        sb.append(')');
        return sb.toString();
    }

    public static final int findParagraphByY(List<ParagraphInfo> list, float f) {
        byte b;
        if (f <= 0.0f) {
            return 0;
        }
        if (f >= ((ParagraphInfo) CollectionsKt.last((List) list)).getBottom()) {
            return CollectionsKt.getLastIndex(list);
        }
        int size = list.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            ParagraphInfo paragraphInfo = list.get(i2);
            if (paragraphInfo.getTop() > f) {
                b = 1;
            } else {
                b = paragraphInfo.getBottom() <= f ? (byte) -1 : (byte) 0;
            }
            if (b < 0) {
                i = i2 + 1;
            } else {
                if (b <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: renamed from: findParagraphsByRange-Sb-Bc2M, reason: not valid java name */
    public static final void m6245findParagraphsByRangeSbBc2M(List<ParagraphInfo> list, long j, Function1<? super ParagraphInfo, Unit> function1) {
        int size = list.size();
        for (int iFindParagraphByIndex = findParagraphByIndex(list, TextRange.m6395getMinimpl(j)); iFindParagraphByIndex < size; iFindParagraphByIndex++) {
            ParagraphInfo paragraphInfo = list.get(iFindParagraphByIndex);
            if (paragraphInfo.getStartIndex() >= TextRange.m6394getMaximpl(j)) {
                return;
            }
            if (paragraphInfo.getStartIndex() != paragraphInfo.getEndIndex()) {
                function1.invoke(paragraphInfo);
            }
        }
    }

    private static final <T> int fastBinarySearch(List<? extends T> list, Function1<? super T, Integer> function1) {
        int size = list.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            int iIntValue = function1.invoke(list.get(i2)).intValue();
            if (iIntValue < 0) {
                i = i2 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final int findParagraphByLineIndex(List<ParagraphInfo> list, int i) {
        byte b;
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            ParagraphInfo paragraphInfo = list.get(i3);
            if (paragraphInfo.getStartLineIndex() > i) {
                b = 1;
            } else {
                b = paragraphInfo.getEndLineIndex() <= i ? (byte) -1 : (byte) 0;
            }
            if (b < 0) {
                i2 = i3 + 1;
            } else {
                if (b <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }
}
