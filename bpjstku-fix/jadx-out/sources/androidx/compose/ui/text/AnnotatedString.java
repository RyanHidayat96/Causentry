package androidx.compose.ui.text;

import androidx.collection.IntListKt;
import androidx.collection.MutableIntList;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u0000 F2\u00020\u0001:\u0005GHIJFB)\b\u0000\u0012\u0016\u0010\u0005\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB=\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\u0002\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00030\u0002¢\u0006\u0004\b\b\u0010\rB)\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\u0002¢\u0006\u0004\b\b\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u0018\u0010\u0019J3\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000f¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001a\u0010\u001fJ+\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000fH\u0007¢\u0006\u0004\b!\u0010\u001fJ+\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000fH\u0007¢\u0006\u0004\b#\u0010\u001fJ+\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000fH\u0007¢\u0006\u0004\b%\u0010\u001fJ\u001d\u0010&\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000f¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u001c2\b\u0010\u0005\u001a\u0004\u0018\u00010(H\u0096\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u000fH\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0006H\u0017¢\u0006\u0004\b-\u0010.J\u0015\u0010/\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u0000¢\u0006\u0004\b/\u00100J3\u00102\u001a\u00020\u00002\"\u0010\u0005\u001a\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000301H\u0007¢\u0006\u0004\b2\u00103J9\u00104\u001a\u00020\u00002(\u0010\u0005\u001a$\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\u000201H\u0007¢\u0006\u0004\b4\u00103R*\u00105\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u00109\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010.R(\u0010<\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0003\u0018\u00010\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b<\u00106\u001a\u0004\b=\u00108R\u001d\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\u00028G¢\u0006\u0006\u001a\u0004\b>\u00108R(\u0010@\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0003\u0018\u00010\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b@\u00106\u001a\u0004\bA\u00108R\u001d\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00030\u00028G¢\u0006\u0006\u001a\u0004\bB\u00108R\u0014\u0010E\u001a\u00020\u000f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010,"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "p0", "", "p1", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "Landroidx/compose/ui/text/SpanStyle;", "Landroidx/compose/ui/text/ParagraphStyle;", "p2", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "(Ljava/lang/String;Ljava/util/List;)V", "", "", "get", "(I)C", "subSequence", "(II)Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/TextRange;", "subSequence-5zc-tL8", "(J)Landroidx/compose/ui/text/AnnotatedString;", "plus", "(Landroidx/compose/ui/text/AnnotatedString;)Landroidx/compose/ui/text/AnnotatedString;", "getStringAnnotations", "(Ljava/lang/String;II)Ljava/util/List;", "", "hasStringAnnotations", "(Ljava/lang/String;II)Z", "(II)Ljava/util/List;", "Landroidx/compose/ui/text/TtsAnnotation;", "getTtsAnnotations", "Landroidx/compose/ui/text/UrlAnnotation;", "getUrlAnnotations", "Landroidx/compose/ui/text/LinkAnnotation;", "getLinkAnnotations", "hasLinkAnnotations", "(II)Z", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "hasEqualAnnotations", "(Landroidx/compose/ui/text/AnnotatedString;)Z", "Lkotlin/Function1;", "mapAnnotations", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/text/AnnotatedString;", "flatMapAnnotations", "annotations", "Ljava/util/List;", "getAnnotations$ui_text", "()Ljava/util/List;", "text", "Ljava/lang/String;", "getText", "spanStylesOrNull", "getSpanStylesOrNull$ui_text", "getSpanStyles", "spanStyles", "paragraphStylesOrNull", "getParagraphStylesOrNull$ui_text", "getParagraphStyles", "paragraphStyles", "getLength", "length", "Companion", "Range", "Builder", "Annotation", "ExhaustiveAnnotation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AnnotatedString implements CharSequence {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Saver<AnnotatedString, ?> Saver = SaversKt.getAnnotatedStringSaver();
    private final List<Range<? extends Annotation>> annotations;
    private final List<Range<ParagraphStyle>> paragraphStylesOrNull;
    private final List<Range<SpanStyle>> spanStylesOrNull;
    private final String text;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001\u0082\u0001\b\u0002\u0003\u0004\u0005\u0006\u0007\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Annotation;", "", "Landroidx/compose/ui/text/AnnotatedString$ExhaustiveAnnotation;", "Landroidx/compose/ui/text/Bullet;", "Landroidx/compose/ui/text/LinkAnnotation;", "Landroidx/compose/ui/text/ParagraphStyle;", "Landroidx/compose/ui/text/SpanStyle;", "Landroidx/compose/ui/text/StringAnnotation;", "Landroidx/compose/ui/text/TtsAnnotation;", "Landroidx/compose/ui/text/UrlAnnotation;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Annotation {
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$ExhaustiveAnnotation;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class ExhaustiveAnnotation implements Annotation {
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return get(i);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return getLength();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnnotatedString(List<? extends Range<? extends Annotation>> list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.annotations = list;
        this.text = str;
        if (list != 0) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                Range<SpanStyle> range = (Range) list.get(i);
                if (range.getItem() instanceof SpanStyle) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    Intrinsics.checkNotNull(range, "");
                    arrayList.add(range);
                } else if (range.getItem() instanceof ParagraphStyle) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    Intrinsics.checkNotNull(range, "");
                    arrayList2.add(range);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.spanStylesOrNull = arrayList;
        this.paragraphStylesOrNull = arrayList2;
        List listSortedWith = arrayList2 != null ? CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: androidx.compose.ui.text.AnnotatedString$special$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Integer.valueOf(((AnnotatedString.Range) t).getStart()), Integer.valueOf(((AnnotatedString.Range) t2).getStart()));
            }
        }) : null;
        List list2 = listSortedWith;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        MutableIntList mutableIntListMutableIntListOf = IntListKt.mutableIntListOf(((Range) CollectionsKt.first(listSortedWith)).getEnd());
        int size2 = listSortedWith.size();
        for (int i2 = 1; i2 < size2; i2++) {
            Range range2 = (Range) listSortedWith.get(i2);
            while (true) {
                MutableIntList mutableIntList = mutableIntListMutableIntListOf;
                if (mutableIntList._size == 0) {
                    break;
                }
                int iLast = mutableIntListMutableIntListOf.last();
                if (range2.getStart() >= iLast) {
                    mutableIntListMutableIntListOf.removeAt(mutableIntList._size - 1);
                } else {
                    if (range2.getEnd() > iLast) {
                        StringBuilder sb = new StringBuilder("Paragraph overlap not allowed, end ");
                        sb.append(range2.getEnd());
                        sb.append(" should be less than or equal to ");
                        sb.append(iLast);
                        InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
                        break;
                    }
                    break;
                }
            }
            mutableIntListMutableIntListOf.add(range2.getEnd());
        }
    }

    public final List<Range<? extends Annotation>> getAnnotations$ui_text() {
        return this.annotations;
    }

    public final String getText() {
        return this.text;
    }

    public final List<Range<SpanStyle>> getSpanStylesOrNull$ui_text() {
        return this.spanStylesOrNull;
    }

    public final List<Range<SpanStyle>> getSpanStyles() {
        List<Range<SpanStyle>> list = this.spanStylesOrNull;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    public final List<Range<ParagraphStyle>> getParagraphStylesOrNull$ui_text() {
        return this.paragraphStylesOrNull;
    }

    public final List<Range<ParagraphStyle>> getParagraphStyles() {
        List<Range<ParagraphStyle>> list = this.paragraphStylesOrNull;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    public /* synthetic */ AnnotatedString(String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt.emptyList() : list2);
    }

    public AnnotatedString(String str, List<Range<SpanStyle>> list, List<Range<ParagraphStyle>> list2) {
        this((List<? extends Range<? extends Annotation>>) AnnotatedStringKt.constructAnnotationsFromSpansAndParagraphs(list, list2), str);
    }

    public /* synthetic */ AnnotatedString(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (List<? extends Range<? extends Annotation>>) ((i & 2) != 0 ? CollectionsKt.emptyList() : list));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AnnotatedString(String str, List<? extends Range<? extends Annotation>> list) {
        List<? extends Range<? extends Annotation>> list2 = list;
        this(list2.isEmpty() ? null : list2, str);
    }

    public final int getLength() {
        return this.text.length();
    }

    public final char get(int p0) {
        return this.text.charAt(p0);
    }

    @Override // java.lang.CharSequence
    public final AnnotatedString subSequence(int p0, int p1) {
        if (p0 > p1) {
            StringBuilder sb = new StringBuilder("start (");
            sb.append(p0);
            sb.append(") should be less or equal to end (");
            sb.append(p1);
            sb.append(')');
            InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
        }
        if (p0 == 0 && p1 == this.text.length()) {
            return this;
        }
        String strSubstring = this.text.substring(p0, p1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return new AnnotatedString((List<? extends Range<? extends Annotation>>) AnnotatedStringKt.filterRanges(this.annotations, p0, p1), strSubstring);
    }

    /* JADX INFO: renamed from: subSequence-5zc-tL8, reason: not valid java name */
    public final AnnotatedString m6209subSequence5zctL8(long p0) {
        return subSequence(TextRange.m6395getMinimpl(p0), TextRange.m6394getMaximpl(p0));
    }

    public final AnnotatedString plus(AnnotatedString p0) {
        Builder builder = new Builder(this);
        builder.append(p0);
        return builder.toAnnotatedString();
    }

    public final List<Range<String>> getStringAnnotations(String p0, int p1, int p2) {
        List<Range<? extends Annotation>> list = this.annotations;
        if (list == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Range<? extends Annotation> range = list.get(i);
            if ((range.getItem() instanceof StringAnnotation) && Intrinsics.areEqual(p0, range.getTag()) && AnnotatedStringKt.intersect(p1, p2, range.getStart(), range.getEnd())) {
                arrayList.add(StringAnnotationKt.unbox(range));
            }
        }
        return arrayList;
    }

    public final boolean hasStringAnnotations(String p0, int p1, int p2) {
        List<Range<? extends Annotation>> list = this.annotations;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Range<? extends Annotation> range = list.get(i);
                if ((range.getItem() instanceof StringAnnotation) && Intrinsics.areEqual(p0, range.getTag()) && AnnotatedStringKt.intersect(p1, p2, range.getStart(), range.getEnd())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final List<Range<String>> getStringAnnotations(int p0, int p1) {
        List<Range<? extends Annotation>> list = this.annotations;
        if (list == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Range<? extends Annotation> range = list.get(i);
            if ((range.getItem() instanceof StringAnnotation) && AnnotatedStringKt.intersect(p0, p1, range.getStart(), range.getEnd())) {
                arrayList.add(StringAnnotationKt.unbox(range));
            }
        }
        return arrayList;
    }

    public final List<Range<TtsAnnotation>> getTtsAnnotations(int p0, int p1) {
        ArrayList arrayListEmptyList;
        List<Range<? extends Annotation>> list = this.annotations;
        if (list == null) {
            arrayListEmptyList = CollectionsKt.emptyList();
        } else {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Range<? extends Annotation> range = list.get(i);
                Range<? extends Annotation> range2 = range;
                if ((range2.getItem() instanceof TtsAnnotation) && AnnotatedStringKt.intersect(p0, p1, range2.getStart(), range2.getEnd())) {
                    arrayList.add(range);
                }
            }
            arrayListEmptyList = arrayList;
        }
        Intrinsics.checkNotNull(arrayListEmptyList, "");
        return arrayListEmptyList;
    }

    @Deprecated(message = "Use LinkAnnotation API instead", replaceWith = @ReplaceWith(expression = "getLinkAnnotations(start, end)", imports = {}))
    public final List<Range<UrlAnnotation>> getUrlAnnotations(int p0, int p1) {
        ArrayList arrayListEmptyList;
        List<Range<? extends Annotation>> list = this.annotations;
        if (list == null) {
            arrayListEmptyList = CollectionsKt.emptyList();
        } else {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Range<? extends Annotation> range = list.get(i);
                Range<? extends Annotation> range2 = range;
                if ((range2.getItem() instanceof UrlAnnotation) && AnnotatedStringKt.intersect(p0, p1, range2.getStart(), range2.getEnd())) {
                    arrayList.add(range);
                }
            }
            arrayListEmptyList = arrayList;
        }
        Intrinsics.checkNotNull(arrayListEmptyList, "");
        return arrayListEmptyList;
    }

    public final List<Range<LinkAnnotation>> getLinkAnnotations(int p0, int p1) {
        ArrayList arrayListEmptyList;
        List<Range<? extends Annotation>> list = this.annotations;
        if (list == null) {
            arrayListEmptyList = CollectionsKt.emptyList();
        } else {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Range<? extends Annotation> range = list.get(i);
                Range<? extends Annotation> range2 = range;
                if ((range2.getItem() instanceof LinkAnnotation) && AnnotatedStringKt.intersect(p0, p1, range2.getStart(), range2.getEnd())) {
                    arrayList.add(range);
                }
            }
            arrayListEmptyList = arrayList;
        }
        Intrinsics.checkNotNull(arrayListEmptyList, "");
        return arrayListEmptyList;
    }

    public final boolean hasLinkAnnotations(int p0, int p1) {
        List<Range<? extends Annotation>> list = this.annotations;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Range<? extends Annotation> range = list.get(i);
                if ((range.getItem() instanceof LinkAnnotation) && AnnotatedStringKt.intersect(p0, p1, range.getStart(), range.getEnd())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AnnotatedString)) {
            return false;
        }
        AnnotatedString annotatedString = (AnnotatedString) p0;
        return Intrinsics.areEqual(this.text, annotatedString.text) && Intrinsics.areEqual(this.annotations, annotatedString.annotations);
    }

    public final int hashCode() {
        int iHashCode = this.text.hashCode();
        List<Range<? extends Annotation>> list = this.annotations;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.text;
    }

    public final boolean hasEqualAnnotations(AnnotatedString p0) {
        return Intrinsics.areEqual(this.annotations, p0.annotations);
    }

    public final AnnotatedString mapAnnotations(Function1<? super Range<? extends Annotation>, ? extends Range<? extends Annotation>> p0) {
        Builder builder = new Builder(this);
        builder.mapAnnotations$ui_text(p0);
        return builder.toAnnotatedString();
    }

    public final AnnotatedString flatMapAnnotations(Function1<? super Range<? extends Annotation>, ? extends List<? extends Range<? extends Annotation>>> p0) {
        Builder builder = new Builder(this);
        builder.flatMapAnnotations$ui_text(p0);
        return builder.toAnnotatedString();
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B'\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0007HÇ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J>\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000fJ\u0010\u0010\u0019\u001a\u00020\u0007H×\u0001¢\u0006\u0004\b\u0019\u0010\u0012R\u0017\u0010\u001a\u001a\u00028\u00008\u0007¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001a\u0010\u001d\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010 \u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u000fR\u001a\u0010\"\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0012"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Range;", ExifInterface.GPS_DIRECTION_TRUE, "", "p0", "", "p1", "p2", "", "p3", "<init>", "(Ljava/lang/Object;IILjava/lang/String;)V", "(Ljava/lang/Object;II)V", "component1", "()Ljava/lang/Object;", "component2", "()I", "component3", "component4", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;IILjava/lang/String;)Landroidx/compose/ui/text/AnnotatedString$Range;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "item", "Ljava/lang/Object;", "getItem", "start", "I", "getStart", "end", "getEnd", "tag", "Ljava/lang/String;", "getTag"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Range<T> {
        public static final int $stable = 0;
        private final int end;
        private final T item;
        private final int start;
        private final String tag;

        public Range(T t, int i, int i2, String str) {
            this.item = t;
            this.start = i;
            this.end = i2;
            this.tag = str;
            if (i <= i2) {
                return;
            }
            InlineClassHelperKt.throwIllegalArgumentException("Reversed range is not supported");
        }

        public final int getEnd() {
            return this.end;
        }

        public final T getItem() {
            return this.item;
        }

        public final int getStart() {
            return this.start;
        }

        public final String getTag() {
            return this.tag;
        }

        public Range(T t, int i, int i2) {
            this(t, i, i2, "");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Range copy$default(Range range, Object obj, int i, int i2, String str, int i3, Object obj2) {
            if ((i3 & 1) != 0) {
                obj = range.item;
            }
            if ((i3 & 2) != 0) {
                i = range.start;
            }
            if ((i3 & 4) != 0) {
                i2 = range.end;
            }
            if ((i3 & 8) != 0) {
                str = range.tag;
            }
            return range.copy(obj, i, i2, str);
        }

        public final T component1() {
            return this.item;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getStart() {
            return this.start;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getEnd() {
            return this.end;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        public final Range<T> copy(T p0, int p1, int p2, String p3) {
            return new Range<>(p0, p1, p2, p3);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof Range)) {
                return false;
            }
            Range range = (Range) p0;
            return Intrinsics.areEqual(this.item, range.item) && this.start == range.start && this.end == range.end && Intrinsics.areEqual(this.tag, range.tag);
        }

        public final int hashCode() {
            T t = this.item;
            return ((((((t == null ? 0 : t.hashCode()) * 31) + Integer.hashCode(this.start)) * 31) + Integer.hashCode(this.end)) * 31) + this.tag.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Range(item=");
            sb.append(this.item);
            sb.append(", start=");
            sb.append(this.start);
            sb.append(", end=");
            sb.append(this.end);
            sb.append(", tag=");
            sb.append(this.tag);
            sb.append(')');
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002_`B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\t¢\u0006\u0004\b\u0005\u0010\nJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\rH\u0007¢\u0006\u0004\b\f\u0010\u000eJ\u0019\u0010\f\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u000fH\u0017¢\u0006\u0004\b\f\u0010\u0010J)\u0010\f\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\f\u0010\u0013J\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\rH\u0017¢\u0006\u0004\b\f\u0010\u0014J\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\t¢\u0006\u0004\b\f\u0010\nJ%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\u0015J%\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u001aJ-\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u001f\u0010 J'\u0010\"\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020!2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\"\u0010#J%\u0010%\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020$2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b%\u0010&J%\u0010%\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020'2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b%\u0010(J%\u0010*\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020)2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b*\u0010+J-\u0010*\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020)2\u0006\u0010\u0011\u001a\u00020,2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0003¢\u0006\u0004\b-\u0010.J\u0015\u0010/\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0016¢\u0006\u0004\b/\u00100J\u0015\u0010/\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0019¢\u0006\u0004\b/\u00101J\u0015\u00102\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020)¢\u0006\u0004\b2\u00103JF\u0010;\u001a\u00028\u0000\"\b\b\u0000\u00105*\u0002042\b\b\u0002\u0010\u0004\u001a\u00020,2\b\b\u0002\u0010\u0011\u001a\u00020)2\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00028\u000006¢\u0006\u0002\b8H\u0007¢\u0006\u0004\b9\u0010:JB\u0010<\u001a\u00028\u0000\"\b\b\u0000\u00105*\u000204*\u0002072\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010)2\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u000006¢\u0006\u0002\b8H\u0007¢\u0006\u0004\b<\u0010=J\u001d\u0010>\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b>\u0010?J\u0015\u0010@\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u001e¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020!H\u0007¢\u0006\u0004\bB\u0010CJ\u0015\u0010E\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020D¢\u0006\u0004\bE\u0010FJ\r\u0010G\u001a\u00020\u000b¢\u0006\u0004\bG\u0010HJ\u0015\u0010G\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\bG\u0010\u0006J\u000f\u0010I\u001a\u00020\tH\u0007¢\u0006\u0004\bI\u0010JJ3\u0010M\u001a\u00020\u000b2\"\u0010\u0004\u001a\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020L0K\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020L0K06H\u0000¢\u0006\u0004\bM\u0010NJ9\u0010P\u001a\u00020\u000b2(\u0010\u0004\u001a$\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020L0K\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020L0K0O06H\u0000¢\u0006\u0004\bP\u0010NR\u0018\u0010S\u001a\u00060Qj\u0002`R8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\"\u0010W\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002040V0U8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\"\u0010Y\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020L0V0U8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bY\u0010XR\u0011\u0010\\\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0014\u0010]\u001a\u0002078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b]\u0010^"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder;", "Ljava/lang/Appendable;", "Lkotlin/text/TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "p0", "<init>", "(I)V", "", "(Ljava/lang/String;)V", "Landroidx/compose/ui/text/AnnotatedString;", "(Landroidx/compose/ui/text/AnnotatedString;)V", "", "append", "", "(C)V", "", "(Ljava/lang/CharSequence;)Landroidx/compose/ui/text/AnnotatedString$Builder;", "p1", "p2", "(Ljava/lang/CharSequence;II)Landroidx/compose/ui/text/AnnotatedString$Builder;", "(C)Landroidx/compose/ui/text/AnnotatedString$Builder;", "(Landroidx/compose/ui/text/AnnotatedString;II)V", "Landroidx/compose/ui/text/SpanStyle;", "addStyle", "(Landroidx/compose/ui/text/SpanStyle;II)V", "Landroidx/compose/ui/text/ParagraphStyle;", "(Landroidx/compose/ui/text/ParagraphStyle;II)V", "p3", "addStringAnnotation", "(Ljava/lang/String;Ljava/lang/String;II)V", "Landroidx/compose/ui/text/TtsAnnotation;", "addTtsAnnotation", "(Landroidx/compose/ui/text/TtsAnnotation;II)V", "Landroidx/compose/ui/text/UrlAnnotation;", "addUrlAnnotation", "(Landroidx/compose/ui/text/UrlAnnotation;II)V", "Landroidx/compose/ui/text/LinkAnnotation$Url;", "addLink", "(Landroidx/compose/ui/text/LinkAnnotation$Url;II)V", "Landroidx/compose/ui/text/LinkAnnotation$Clickable;", "(Landroidx/compose/ui/text/LinkAnnotation$Clickable;II)V", "Landroidx/compose/ui/text/Bullet;", "addBullet", "(Landroidx/compose/ui/text/Bullet;II)V", "Landroidx/compose/ui/unit/TextUnit;", "addBullet-r9BaKPg", "(Landroidx/compose/ui/text/Bullet;JII)V", "pushStyle", "(Landroidx/compose/ui/text/SpanStyle;)I", "(Landroidx/compose/ui/text/ParagraphStyle;)I", "pushBullet", "(Landroidx/compose/ui/text/Bullet;)I", "", "R", "Lkotlin/Function1;", "Landroidx/compose/ui/text/AnnotatedString$Builder$BulletScope;", "Lkotlin/ExtensionFunctionType;", "withBulletList-o2QH7mI", "(JLandroidx/compose/ui/text/Bullet;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "withBulletList", "withBulletListItem", "(Landroidx/compose/ui/text/AnnotatedString$Builder$BulletScope;Landroidx/compose/ui/text/Bullet;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "pushStringAnnotation", "(Ljava/lang/String;Ljava/lang/String;)I", "pushTtsAnnotation", "(Landroidx/compose/ui/text/TtsAnnotation;)I", "pushUrlAnnotation", "(Landroidx/compose/ui/text/UrlAnnotation;)I", "Landroidx/compose/ui/text/LinkAnnotation;", "pushLink", "(Landroidx/compose/ui/text/LinkAnnotation;)I", "pop", "()V", "toAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "mapAnnotations$ui_text", "(Lkotlin/jvm/functions/Function1;)V", "", "flatMapAnnotations$ui_text", "Ljava/lang/StringBuilder;", "Lkotlin/text/TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "text", "Ljava/lang/StringBuilder;", "", "Landroidx/compose/ui/text/AnnotatedString$Builder$MutableRange;", "styleStack", "Ljava/util/List;", "annotations", "getLength", "()I", "length", "bulletScope", "Landroidx/compose/ui/text/AnnotatedString$Builder$BulletScope;", "MutableRange", "BulletScope"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder implements Appendable {
        public static final int $stable = 8;
        private final List<MutableRange<? extends Annotation>> annotations;
        private final BulletScope bulletScope;
        private final List<MutableRange<? extends Object>> styleStack;
        private final StringBuilder text;

        public Builder(int i) {
            this.text = new StringBuilder(i);
            this.styleStack = new ArrayList();
            this.annotations = new ArrayList();
            this.bulletScope = new BulletScope(this);
        }

        public /* synthetic */ Builder(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 16 : i);
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0083\b\u0018\u0000 ,*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001,B+\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\rJ9\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b\"\u0004\b\u0001\u0010\u000e2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\u0010J\u0010\u0010\u0011\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0007HÇ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J>\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0014J\u0010\u0010\u001e\u001a\u00020\u0007H×\u0001¢\u0006\u0004\b\u001e\u0010\u0017R\u001a\u0010\u001f\u001a\u00028\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0012R\u001a\u0010\"\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0014R\"\u0010%\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u0014\"\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0017"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder$MutableRange;", ExifInterface.GPS_DIRECTION_TRUE, "", "p0", "", "p1", "p2", "", "p3", "<init>", "(Ljava/lang/Object;IILjava/lang/String;)V", "Landroidx/compose/ui/text/AnnotatedString$Range;", "toRange", "(I)Landroidx/compose/ui/text/AnnotatedString$Range;", "R", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;I)Landroidx/compose/ui/text/AnnotatedString$Range;", "component1", "()Ljava/lang/Object;", "component2", "()I", "component3", "component4", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;IILjava/lang/String;)Landroidx/compose/ui/text/AnnotatedString$Builder$MutableRange;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "item", "Ljava/lang/Object;", "getItem", "start", "I", "getStart", "end", "getEnd", "setEnd", "(I)V", "tag", "Ljava/lang/String;", "getTag", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
        static final /* data */ class MutableRange<T> {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private int end;
            private final T item;
            private final int start;
            private final String tag;

            public MutableRange(T t, int i, int i2, String str) {
                this.item = t;
                this.start = i;
                this.end = i2;
                this.tag = str;
            }

            public final T getItem() {
                return this.item;
            }

            public final int getStart() {
                return this.start;
            }

            public final int getEnd() {
                return this.end;
            }

            public final void setEnd(int i) {
                this.end = i;
            }

            public /* synthetic */ MutableRange(Object obj, int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                this(obj, i, (i3 & 4) != 0 ? Integer.MIN_VALUE : i2, (i3 & 8) != 0 ? "" : str);
            }

            public final String getTag() {
                return this.tag;
            }

            public static /* synthetic */ Range toRange$default(MutableRange mutableRange, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = Integer.MIN_VALUE;
                }
                return mutableRange.toRange(i);
            }

            public final Range<T> toRange(int p0) {
                int i = this.end;
                if (i != Integer.MIN_VALUE) {
                    p0 = i;
                }
                if (p0 == Integer.MIN_VALUE) {
                    InlineClassHelperKt.throwIllegalStateException("Item.end should be set first");
                }
                return new Range<>(this.item, this.start, p0, this.tag);
            }

            public static /* synthetic */ Range toRange$default(MutableRange mutableRange, Function1 function1, int i, int i2, Object obj) {
                if ((i2 & 2) != 0) {
                    i = Integer.MIN_VALUE;
                }
                return mutableRange.toRange(function1, i);
            }

            public final <R> Range<R> toRange(Function1<? super T, ? extends R> p0, int p1) {
                int i = this.end;
                if (i != Integer.MIN_VALUE) {
                    p1 = i;
                }
                if (p1 == Integer.MIN_VALUE) {
                    InlineClassHelperKt.throwIllegalStateException("Item.end should be set first");
                }
                return new Range<>(p0.invoke(this.item), this.start, p1, this.tag);
            }

            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\"\u0004\b\u0001\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder$MutableRange$Companion;", "", "<init>", "()V", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/ui/text/AnnotatedString$Range;", "p0", "Landroidx/compose/ui/text/AnnotatedString$Builder$MutableRange;", "fromRange", "(Landroidx/compose/ui/text/AnnotatedString$Range;)Landroidx/compose/ui/text/AnnotatedString$Builder$MutableRange;"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public final <T> MutableRange<T> fromRange(Range<T> p0) {
                    return new MutableRange<>(p0.getItem(), p0.getStart(), p0.getEnd(), p0.getTag());
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ MutableRange copy$default(MutableRange mutableRange, Object obj, int i, int i2, String str, int i3, Object obj2) {
                if ((i3 & 1) != 0) {
                    obj = mutableRange.item;
                }
                if ((i3 & 2) != 0) {
                    i = mutableRange.start;
                }
                if ((i3 & 4) != 0) {
                    i2 = mutableRange.end;
                }
                if ((i3 & 8) != 0) {
                    str = mutableRange.tag;
                }
                return mutableRange.copy(obj, i, i2, str);
            }

            public final T component1() {
                return this.item;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final int getStart() {
                return this.start;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final int getEnd() {
                return this.end;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            public final String getTag() {
                return this.tag;
            }

            public final MutableRange<T> copy(T p0, int p1, int p2, String p3) {
                return new MutableRange<>(p0, p1, p2, p3);
            }

            public final boolean equals(Object p0) {
                if (this == p0) {
                    return true;
                }
                if (!(p0 instanceof MutableRange)) {
                    return false;
                }
                MutableRange mutableRange = (MutableRange) p0;
                return Intrinsics.areEqual(this.item, mutableRange.item) && this.start == mutableRange.start && this.end == mutableRange.end && Intrinsics.areEqual(this.tag, mutableRange.tag);
            }

            public final int hashCode() {
                T t = this.item;
                return ((((((t == null ? 0 : t.hashCode()) * 31) + Integer.hashCode(this.start)) * 31) + Integer.hashCode(this.end)) * 31) + this.tag.hashCode();
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("MutableRange(item=");
                sb.append(this.item);
                sb.append(", start=");
                sb.append(this.start);
                sb.append(", end=");
                sb.append(this.end);
                sb.append(", tag=");
                sb.append(this.tag);
                sb.append(')');
                return sb.toString();
            }
        }

        public Builder(String str) {
            this(0, 1, null);
            append(str);
        }

        public Builder(AnnotatedString annotatedString) {
            this(0, 1, null);
            append(annotatedString);
        }

        public final int getLength() {
            return this.text.length();
        }

        public final void append(String p0) {
            this.text.append(p0);
        }

        @Override // java.lang.Appendable
        public final Builder append(CharSequence p0) {
            if (p0 instanceof AnnotatedString) {
                append((AnnotatedString) p0);
                return this;
            }
            this.text.append(p0);
            return this;
        }

        @Override // java.lang.Appendable
        public final Builder append(CharSequence p0, int p1, int p2) {
            if (p0 instanceof AnnotatedString) {
                append((AnnotatedString) p0, p1, p2);
                return this;
            }
            this.text.append(p0, p1, p2);
            return this;
        }

        @Override // java.lang.Appendable
        public final Builder append(char p0) {
            this.text.append(p0);
            return this;
        }

        public final void append(AnnotatedString p0) {
            int length = this.text.length();
            this.text.append(p0.getText());
            List<Range<? extends Annotation>> annotations$ui_text = p0.getAnnotations$ui_text();
            if (annotations$ui_text != null) {
                int size = annotations$ui_text.size();
                for (int i = 0; i < size; i++) {
                    Range<? extends Annotation> range = annotations$ui_text.get(i);
                    this.annotations.add(new MutableRange<>(range.getItem(), range.getStart() + length, range.getEnd() + length, range.getTag()));
                }
            }
        }

        public final void append(AnnotatedString p0, int p1, int p2) {
            int length = this.text.length();
            this.text.append((CharSequence) p0.getText(), p1, p2);
            List localAnnotations$default = AnnotatedStringKt.getLocalAnnotations$default(p0, p1, p2, null, 4, null);
            if (localAnnotations$default != null) {
                int size = localAnnotations$default.size();
                for (int i = 0; i < size; i++) {
                    Range range = (Range) localAnnotations$default.get(i);
                    List<MutableRange<? extends Annotation>> list = this.annotations;
                    Object item = range.getItem();
                    int start = range.getStart();
                    list.add(new MutableRange<>(item, start + length, range.getEnd() + length, range.getTag()));
                }
            }
        }

        public final void addStyle(SpanStyle p0, int p1, int p2) {
            this.annotations.add(new MutableRange<>(p0, p1, p2, null, 8, null));
        }

        public final void addStyle(ParagraphStyle p0, int p1, int p2) {
            this.annotations.add(new MutableRange<>(p0, p1, p2, null, 8, null));
        }

        public final void addStringAnnotation(String p0, String p1, int p2, int p3) {
            this.annotations.add(new MutableRange<>(StringAnnotation.m6345boximpl(StringAnnotation.m6346constructorimpl(p1)), p2, p3, p0));
        }

        public final void addTtsAnnotation(TtsAnnotation p0, int p1, int p2) {
            this.annotations.add(new MutableRange<>(p0, p1, p2, null, 8, null));
        }

        @Deprecated(message = "Use LinkAnnotation API for links instead", replaceWith = @ReplaceWith(expression = "addLink(, start, end)", imports = {}))
        public final void addUrlAnnotation(UrlAnnotation p0, int p1, int p2) {
            this.annotations.add(new MutableRange<>(p0, p1, p2, null, 8, null));
        }

        public final void addLink(LinkAnnotation.Url p0, int p1, int p2) {
            this.annotations.add(new MutableRange<>(p0, p1, p2, null, 8, null));
        }

        public final void addLink(LinkAnnotation.Clickable p0, int p1, int p2) {
            this.annotations.add(new MutableRange<>(p0, p1, p2, null, 8, null));
        }

        public final void addBullet(Bullet p0, int p1, int p2) {
            this.annotations.add(new MutableRange<>(p0, p1, p2, null, 8, null));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: addBullet-r9BaKPg, reason: not valid java name */
        public final void m6211addBulletr9BaKPg(Bullet p0, long p1, int p2, int p3) {
            this.annotations.add(new MutableRange<>(new ParagraphStyle(0, 0, 0L, new TextIndent(p1, p1, null), (PlatformParagraphStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) (0 == true ? 1 : 0), TypedValues.PositionType.TYPE_PERCENT_WIDTH, (DefaultConstructorMarker) null), p2, p3, null, 8, 0 == true ? 1 : 0));
            this.annotations.add(new MutableRange<>(p0, p2, p3, null, 8, null));
        }

        public final int pushStyle(SpanStyle p0) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(p0, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int pushStyle(ParagraphStyle p0) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(p0, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int pushBullet(Bullet p0) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(p0, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR,\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\n8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder$BulletScope;", "", "Landroidx/compose/ui/text/AnnotatedString$Builder;", "p0", "<init>", "(Landroidx/compose/ui/text/AnnotatedString$Builder;)V", "builder", "Landroidx/compose/ui/text/AnnotatedString$Builder;", "getBuilder$ui_text", "()Landroidx/compose/ui/text/AnnotatedString$Builder;", "", "Lkotlin/Pair;", "Landroidx/compose/ui/unit/TextUnit;", "Landroidx/compose/ui/text/Bullet;", "bulletListSettingStack", "Ljava/util/List;", "getBulletListSettingStack$ui_text", "()Ljava/util/List;"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class BulletScope {
            public static final int $stable = 8;
            private final Builder builder;
            private final List<Pair<TextUnit, Bullet>> bulletListSettingStack = new ArrayList();

            public BulletScope(Builder builder) {
                this.builder = builder;
            }

            /* JADX INFO: renamed from: getBuilder$ui_text, reason: from getter */
            public final Builder getBuilder() {
                return this.builder;
            }

            public final List<Pair<TextUnit, Bullet>> getBulletListSettingStack$ui_text() {
                return this.bulletListSettingStack;
            }
        }

        /* JADX INFO: renamed from: withBulletList-o2QH7mI$default, reason: not valid java name */
        public static /* synthetic */ Object m6210withBulletListo2QH7mI$default(Builder builder, long j, Bullet bullet, Function1 function1, int i, Object obj) {
            if ((i & 1) != 0) {
                j = Bullet.INSTANCE.m6221getDefaultIndentationXSAIIZE();
            }
            if ((i & 2) != 0) {
                bullet = Bullet.INSTANCE.getDefault();
            }
            return builder.m6212withBulletListo2QH7mI(j, bullet, function1);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0081  */
        /* JADX INFO: renamed from: withBulletList-o2QH7mI, reason: not valid java name */
        public final <R> R m6212withBulletListo2QH7mI(long p0, Bullet p1, Function1<? super BulletScope, ? extends R> p2) {
            long em;
            Pair pair = (Pair) CollectionsKt.lastOrNull((List) this.bulletScope.getBulletListSettingStack$ui_text());
            if (pair != null) {
                long packedValue = ((TextUnit) pair.getFirst()).getPackedValue();
                if (!TextUnitType.m7157equalsimpl0(TextUnit.m7128getTypeUIouoOA(packedValue), TextUnit.m7128getTypeUIouoOA(p0))) {
                    StringBuilder sb = new StringBuilder("Indentation unit types of nested bullet lists must match. Current ");
                    sb.append((Object) TextUnit.m7136toStringimpl(packedValue));
                    sb.append(" and previous is ");
                    sb.append((Object) TextUnit.m7136toStringimpl(p0));
                    InlineClassHelperKt.throwIllegalStateException(sb.toString());
                }
                long jM7128getTypeUIouoOA = TextUnit.m7128getTypeUIouoOA(p0);
                if (TextUnitType.m7157equalsimpl0(jM7128getTypeUIouoOA, TextUnitType.INSTANCE.m7162getSpUIouoOA())) {
                    em = TextUnitKt.getSp(TextUnit.m7129getValueimpl(p0) + TextUnit.m7129getValueimpl(packedValue));
                } else if (TextUnitType.m7157equalsimpl0(jM7128getTypeUIouoOA, TextUnitType.INSTANCE.m7161getEmUIouoOA())) {
                    em = TextUnitKt.getEm(TextUnit.m7129getValueimpl(p0) + TextUnit.m7129getValueimpl(packedValue));
                } else {
                    em = p0;
                }
            } else {
                em = p0;
            }
            int iPushStyle = pushStyle(new ParagraphStyle(0, 0, 0L, new TextIndent(em, em, null), (PlatformParagraphStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, TypedValues.PositionType.TYPE_PERCENT_WIDTH, (DefaultConstructorMarker) null));
            this.bulletScope.getBulletListSettingStack$ui_text().add(new Pair<>(TextUnit.m7119boximpl(em), p1));
            try {
                return p2.invoke(this.bulletScope);
            } finally {
                if (!this.bulletScope.getBulletListSettingStack$ui_text().isEmpty()) {
                    this.bulletScope.getBulletListSettingStack$ui_text().remove(CollectionsKt.getLastIndex(this.bulletScope.getBulletListSettingStack$ui_text()));
                }
                pop(iPushStyle);
            }
        }

        public static /* synthetic */ Object withBulletListItem$default(Builder builder, BulletScope bulletScope, Bullet bullet, Function1 function1, int i, Object obj) {
            if ((i & 1) != 0) {
                bullet = null;
            }
            return builder.withBulletListItem(bulletScope, bullet, function1);
        }

        public final <R> R withBulletListItem(BulletScope bulletScope, Bullet bullet, Function1<? super Builder, ? extends R> function1) {
            Bullet bullet2;
            Pair pair = (Pair) CollectionsKt.lastOrNull((List) bulletScope.getBulletListSettingStack$ui_text());
            long packedValue = pair != null ? ((TextUnit) pair.getFirst()).getPackedValue() : Bullet.INSTANCE.m6221getDefaultIndentationXSAIIZE();
            if (bullet != null) {
                bullet2 = bullet;
            } else if (pair == null || (bullet2 = (Bullet) pair.getSecond()) == null) {
                bullet2 = Bullet.INSTANCE.getDefault();
            }
            int iPushStyle = bulletScope.getBuilder().pushStyle(new ParagraphStyle(0, 0, 0L, new TextIndent(packedValue, packedValue, null), (PlatformParagraphStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, TypedValues.PositionType.TYPE_PERCENT_WIDTH, (DefaultConstructorMarker) null));
            int iPushBullet = bulletScope.getBuilder().pushBullet(bullet2);
            try {
                return function1.invoke(bulletScope.getBuilder());
            } finally {
                bulletScope.getBuilder().pop(iPushBullet);
                bulletScope.getBuilder().pop(iPushStyle);
            }
        }

        public final int pushStringAnnotation(String p0, String p1) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(StringAnnotation.m6345boximpl(StringAnnotation.m6346constructorimpl(p1)), this.text.length(), 0, p0, 4, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int pushTtsAnnotation(TtsAnnotation p0) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(p0, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        @Deprecated(message = "Use LinkAnnotation API for links instead", replaceWith = @ReplaceWith(expression = "pushLink(, start, end)", imports = {}))
        public final int pushUrlAnnotation(UrlAnnotation p0) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(p0, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int pushLink(LinkAnnotation p0) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(p0, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final void pop() {
            if (this.styleStack.isEmpty()) {
                InlineClassHelperKt.throwIllegalStateException("Nothing to pop.");
            }
            List<MutableRange<? extends Object>> list = this.styleStack;
            list.remove(list.size() - 1).setEnd(this.text.length());
        }

        public final void pop(int p0) {
            if (p0 >= this.styleStack.size()) {
                StringBuilder sb = new StringBuilder();
                sb.append(p0);
                sb.append(" should be less than ");
                sb.append(this.styleStack.size());
                InlineClassHelperKt.throwIllegalStateException(sb.toString());
            }
            while (this.styleStack.size() - 1 >= p0) {
                pop();
            }
        }

        public final AnnotatedString toAnnotatedString() {
            String string = this.text.toString();
            List<MutableRange<? extends Annotation>> list = this.annotations;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(list.get(i).toRange(this.text.length()));
            }
            return new AnnotatedString(string, arrayList);
        }

        public final void mapAnnotations$ui_text(Function1<? super Range<? extends Annotation>, ? extends Range<? extends Annotation>> p0) {
            int size = this.annotations.size();
            for (int i = 0; i < size; i++) {
                this.annotations.set(i, MutableRange.INSTANCE.fromRange(p0.invoke(MutableRange.toRange$default(this.annotations.get(i), 0, 1, null))));
            }
        }

        public final void flatMapAnnotations$ui_text(Function1<? super Range<? extends Annotation>, ? extends List<? extends Range<? extends Annotation>>> p0) {
            List<MutableRange<? extends Annotation>> list = this.annotations;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                List<? extends Range<? extends Annotation>> listInvoke = p0.invoke(MutableRange.toRange$default(list.get(i), 0, 1, null));
                ArrayList arrayList2 = new ArrayList(listInvoke.size());
                int size2 = listInvoke.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    arrayList2.add(MutableRange.INSTANCE.fromRange(listInvoke.get(i2)));
                }
                CollectionsKt.addAll(arrayList, arrayList2);
            }
            this.annotations.clear();
            this.annotations.addAll(arrayList);
        }

        public Builder() {
            this(0, 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/AnnotatedString;", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final Saver<AnnotatedString, ?> getSaver() {
            return AnnotatedString.Saver;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
