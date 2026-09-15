package androidx.compose.ui.text;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\n\u001aG\u0010\u0007\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0001\u0018\u00010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00010\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00010\u0000*\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a1\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0001\u0018\u00010\u0000*\u00020\t2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001aK\u0010\u0012\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0001\u0018\u00010\u0000*\u00020\t2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a#\u0010\u0014\u001a\u00020\t*\u00020\t2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001aT\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0000\u0010\u0016*\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00042*\b\u0004\u0010\u0005\u001a$\u0012\t\u0012\u00070\t¢\u0006\u0002\b\u0018\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00040\u0001¢\u0006\u0002\b\u0018\u0012\u0004\u0012\u00028\u00000\u0017H\u0081\b¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001d\u0010\u001c\u001a\u00020\t*\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001d\u0010\u001e\u001a\u00020\t*\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001e\u0010\u001d\u001a\u001d\u0010\u001f\u001a\u00020\t*\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001f\u0010\u001d\u001a\u001d\u0010 \u001a\u00020\t*\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020\u001bH\u0007¢\u0006\u0004\b \u0010\u001d\u001a?\u0010%\u001a\u00028\u0000\"\b\b\u0000\u0010\"*\u00020!*\u00020#2\u0006\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0002\b$H\u0087\b¢\u0006\u0004\b%\u0010&\u001aA\u0010%\u001a\u00028\u0000\"\b\b\u0000\u0010\"*\u00020!*\u00020#2\u0006\u0010\u0003\u001a\u00020\u00042\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0002\b$H\u0087\b¢\u0006\u0004\b%\u0010'\u001aI\u0010)\u001a\u00028\u0000\"\b\b\u0000\u0010\"*\u00020!*\u00020#2\u0006\u0010\u0003\u001a\u00020(2\u0006\u0010\u0005\u001a\u00020(2\u0019\b\u0004\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0002\b$H\u0087\b¢\u0006\u0004\b)\u0010*\u001aA\u0010)\u001a\u00028\u0000\"\b\b\u0000\u0010\"*\u00020!*\u00020#2\u0006\u0010\u0003\u001a\u00020+2\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0002\b$H\u0087\b¢\u0006\u0004\b)\u0010,\u001aA\u0010)\u001a\u00028\u0000\"\b\b\u0000\u0010\"*\u00020!*\u00020#2\u0006\u0010\u0003\u001a\u00020-2\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0002\b$H\u0087\b¢\u0006\u0004\b)\u0010.\u001a?\u00100\u001a\u00028\u0000\"\b\b\u0000\u0010\"*\u00020!*\u00020#2\u0006\u0010\u0003\u001a\u00020/2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0002\b$H\u0087\b¢\u0006\u0004\b0\u00101\u001aK\u00102\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0018\u00010\u0000\"\u0004\b\u0000\u0010\u00162\u0016\u0010\u0003\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b2\u00103\u001a+\u00104\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020(2\u0006\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b4\u00105\u001a\u001f\u00104\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020(2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b4\u00106\u001a)\u00108\u001a\u00020\t2\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u0002070\u000f¢\u0006\u0002\b$H\u0087\b¢\u0006\u0004\b8\u00109\u001a/\u0010;\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010:\u001a\u00020\fH\u0000¢\u0006\u0004\b;\u0010<\u001a/\u0010=\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010:\u001a\u00020\fH\u0000¢\u0006\u0004\b=\u0010<\u001a\u000f\u0010>\u001a\u00020\tH\u0001¢\u0006\u0004\b>\u0010?\"\u0014\u0010@\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b@\u0010A"}, d2 = {"", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "p0", "Landroidx/compose/ui/text/ParagraphStyle;", "p1", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "constructAnnotationsFromSpansAndParagraphs", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "Landroidx/compose/ui/text/AnnotatedString;", "normalizedParagraphStyles", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/ParagraphStyle;)Ljava/util/List;", "", "getLocalParagraphStyles", "(Landroidx/compose/ui/text/AnnotatedString;II)Ljava/util/List;", "Lkotlin/Function1;", "", "p2", "getLocalAnnotations", "(Landroidx/compose/ui/text/AnnotatedString;IILkotlin/jvm/functions/Function1;)Ljava/util/List;", "substringWithoutParagraphStyles", "(Landroidx/compose/ui/text/AnnotatedString;II)Landroidx/compose/ui/text/AnnotatedString;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function2;", "Lkotlin/ParameterName;", "mapEachParagraphStyle", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/ParagraphStyle;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "Landroidx/compose/ui/text/intl/LocaleList;", "toUpperCase", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/intl/LocaleList;)Landroidx/compose/ui/text/AnnotatedString;", "toLowerCase", "capitalize", "decapitalize", "", "R", "Landroidx/compose/ui/text/AnnotatedString$Builder;", "Lkotlin/ExtensionFunctionType;", "withStyle", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/SpanStyle;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/ParagraphStyle;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "", "withAnnotation", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Landroidx/compose/ui/text/TtsAnnotation;", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/TtsAnnotation;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Landroidx/compose/ui/text/UrlAnnotation;", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/UrlAnnotation;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Landroidx/compose/ui/text/LinkAnnotation;", "withLink", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/LinkAnnotation;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "filterRanges", "(Ljava/util/List;II)Ljava/util/List;", "AnnotatedString", "(Ljava/lang/String;Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/ParagraphStyle;)Landroidx/compose/ui/text/AnnotatedString;", "(Ljava/lang/String;Landroidx/compose/ui/text/ParagraphStyle;)Landroidx/compose/ui/text/AnnotatedString;", "", "buildAnnotatedString", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/text/AnnotatedString;", "p3", "contains", "(IIII)Z", "intersect", "emptyAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "EmptyAnnotatedString", "Landroidx/compose/ui/text/AnnotatedString;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AnnotatedStringKt {
    private static final AnnotatedString EmptyAnnotatedString = new AnnotatedString("", null, 2, 0 == true ? 1 : 0);

    public static final boolean contains(int i, int i2, int i3, int i4) {
        if (i <= i3 && i4 <= i2) {
            if (i2 == i4) {
                if ((i3 == i4) == (i == i2)) {
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean intersect(int i, int i2, int i3, int i4) {
        boolean z = i == i2;
        boolean z2 = i3 == i4;
        return ((i < i4) & (i3 < i2)) | ((z | z2) & (i == i3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> constructAnnotationsFromSpansAndParagraphs(List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<ParagraphStyle>> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        if (list2.isEmpty()) {
            return list;
        }
        if (list.isEmpty()) {
            return list2;
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(list.get(i));
        }
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList.add(list2.get(i2));
        }
        return arrayList;
    }

    public static final List<AnnotatedString.Range<ParagraphStyle>> normalizedParagraphStyles(AnnotatedString annotatedString, ParagraphStyle paragraphStyle) {
        List listEmptyList;
        List<AnnotatedString.Range<ParagraphStyle>> paragraphStylesOrNull$ui_text = annotatedString.getParagraphStylesOrNull$ui_text();
        if (paragraphStylesOrNull$ui_text == null || (listEmptyList = CollectionsKt.sortedWith(paragraphStylesOrNull$ui_text, new Comparator() { // from class: androidx.compose.ui.text.AnnotatedStringKt$normalizedParagraphStyles$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Integer.valueOf(((AnnotatedString.Range) t).getStart()), Integer.valueOf(((AnnotatedString.Range) t2).getStart()));
            }
        })) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque();
        int size = listEmptyList.size();
        int end = 0;
        for (int i = 0; i < size; i++) {
            AnnotatedString.Range range = (AnnotatedString.Range) listEmptyList.get(i);
            AnnotatedString.Range rangeCopy$default = AnnotatedString.Range.copy$default(range, paragraphStyle.merge((ParagraphStyle) range.getItem()), 0, 0, null, 14, null);
            while (end < rangeCopy$default.getStart()) {
                ArrayDeque arrayDeque2 = arrayDeque;
                if (arrayDeque2.isEmpty()) {
                    break;
                }
                AnnotatedString.Range range2 = (AnnotatedString.Range) arrayDeque.last();
                if (rangeCopy$default.getStart() < range2.getEnd()) {
                    arrayList.add(new AnnotatedString.Range(range2.getItem(), end, rangeCopy$default.getStart()));
                    end = rangeCopy$default.getStart();
                } else {
                    arrayList.add(new AnnotatedString.Range(range2.getItem(), end, range2.getEnd()));
                    end = range2.getEnd();
                    while (!arrayDeque2.isEmpty() && end == ((AnnotatedString.Range) arrayDeque.last()).getEnd()) {
                        arrayDeque.removeLast();
                    }
                }
            }
            if (end < rangeCopy$default.getStart()) {
                arrayList.add(new AnnotatedString.Range(paragraphStyle, end, rangeCopy$default.getStart()));
                end = rangeCopy$default.getStart();
            }
            AnnotatedString.Range range3 = (AnnotatedString.Range) arrayDeque.lastOrNull();
            if (range3 != null) {
                if (range3.getStart() == rangeCopy$default.getStart() && range3.getEnd() == rangeCopy$default.getEnd()) {
                    arrayDeque.removeLast();
                    arrayDeque.add(new AnnotatedString.Range(((ParagraphStyle) range3.getItem()).merge((ParagraphStyle) rangeCopy$default.getItem()), rangeCopy$default.getStart(), rangeCopy$default.getEnd()));
                } else if (range3.getStart() == range3.getEnd()) {
                    arrayList.add(new AnnotatedString.Range(range3.getItem(), range3.getStart(), range3.getEnd()));
                    arrayDeque.removeLast();
                    arrayDeque.add(new AnnotatedString.Range(rangeCopy$default.getItem(), rangeCopy$default.getStart(), rangeCopy$default.getEnd()));
                } else {
                    if (range3.getEnd() < rangeCopy$default.getEnd()) {
                        throw new IllegalArgumentException();
                    }
                    arrayDeque.add(new AnnotatedString.Range(((ParagraphStyle) range3.getItem()).merge((ParagraphStyle) rangeCopy$default.getItem()), rangeCopy$default.getStart(), rangeCopy$default.getEnd()));
                }
            } else {
                arrayDeque.add(new AnnotatedString.Range(rangeCopy$default.getItem(), rangeCopy$default.getStart(), rangeCopy$default.getEnd()));
            }
        }
        while (end <= annotatedString.getText().length()) {
            ArrayDeque arrayDeque3 = arrayDeque;
            if (arrayDeque3.isEmpty()) {
                break;
            }
            AnnotatedString.Range range4 = (AnnotatedString.Range) arrayDeque.last();
            arrayList.add(new AnnotatedString.Range(range4.getItem(), end, range4.getEnd()));
            end = range4.getEnd();
            while (!arrayDeque3.isEmpty() && end == ((AnnotatedString.Range) arrayDeque.last()).getEnd()) {
                arrayDeque.removeLast();
            }
        }
        if (end < annotatedString.getText().length()) {
            arrayList.add(new AnnotatedString.Range(paragraphStyle, end, annotatedString.getText().length()));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new AnnotatedString.Range(paragraphStyle, 0, 0));
        }
        return arrayList;
    }

    private static final List<AnnotatedString.Range<ParagraphStyle>> getLocalParagraphStyles(AnnotatedString annotatedString, int i, int i2) {
        List<AnnotatedString.Range<ParagraphStyle>> paragraphStylesOrNull$ui_text;
        if (i == i2 || (paragraphStylesOrNull$ui_text = annotatedString.getParagraphStylesOrNull$ui_text()) == null) {
            return null;
        }
        if (i == 0 && i2 >= annotatedString.getText().length()) {
            return paragraphStylesOrNull$ui_text;
        }
        ArrayList arrayList = new ArrayList(paragraphStylesOrNull$ui_text.size());
        int size = paragraphStylesOrNull$ui_text.size();
        for (int i3 = 0; i3 < size; i3++) {
            AnnotatedString.Range<ParagraphStyle> range = paragraphStylesOrNull$ui_text.get(i3);
            if (intersect(i, i2, range.getStart(), range.getEnd())) {
                ArrayList arrayList2 = arrayList;
                ParagraphStyle item = range.getItem();
                int start = range.getStart();
                if (start < i) {
                    start = i;
                }
                if (start > i2) {
                    start = i2;
                }
                int end = range.getEnd();
                if (end < i) {
                    end = i;
                }
                if (end > i2) {
                    end = i2;
                }
                arrayList2.add(new AnnotatedString.Range(item, start - i, end - i));
            }
        }
        return arrayList;
    }

    static /* synthetic */ List getLocalAnnotations$default(AnnotatedString annotatedString, int i, int i2, Function1 function1, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            function1 = null;
        }
        return getLocalAnnotations(annotatedString, i, i2, function1);
    }

    private static final List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> getLocalAnnotations(AnnotatedString annotatedString, int i, int i2, Function1<? super AnnotatedString.Annotation, Boolean> function1) {
        List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> annotations$ui_text;
        if (i == i2 || (annotations$ui_text = annotatedString.getAnnotations$ui_text()) == null) {
            return null;
        }
        int i3 = 0;
        if (i == 0 && i2 >= annotatedString.getText().length()) {
            if (function1 == null) {
                return annotations$ui_text;
            }
            ArrayList arrayList = new ArrayList(annotations$ui_text.size());
            int size = annotations$ui_text.size();
            while (i3 < size) {
                AnnotatedString.Range<? extends AnnotatedString.Annotation> range = annotations$ui_text.get(i3);
                if (function1.invoke(range.getItem()).booleanValue()) {
                    arrayList.add(range);
                }
                i3++;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(annotations$ui_text.size());
        int size2 = annotations$ui_text.size();
        while (i3 < size2) {
            AnnotatedString.Range<? extends AnnotatedString.Annotation> range2 = annotations$ui_text.get(i3);
            if ((function1 == null || function1.invoke(range2.getItem()).booleanValue()) && intersect(i, i2, range2.getStart(), range2.getEnd())) {
                arrayList2.add(new AnnotatedString.Range(range2.getItem(), RangesKt.coerceIn(range2.getStart(), i, i2) - i, RangesKt.coerceIn(range2.getEnd(), i, i2) - i, range2.getTag()));
            }
            i3++;
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnnotatedString substringWithoutParagraphStyles(AnnotatedString annotatedString, int i, int i2) {
        String str = "";
        if (i != i2) {
            String strSubstring = annotatedString.getText().substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            str = strSubstring;
        }
        List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> localAnnotations = getLocalAnnotations(annotatedString, i, i2, new Function1() { // from class: androidx.compose.ui.text.AnnotatedStringKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(AnnotatedStringKt.substringWithoutParagraphStyles$lambda$10((AnnotatedString.Annotation) obj));
            }
        });
        if (localAnnotations == null) {
            localAnnotations = CollectionsKt.emptyList();
        }
        return new AnnotatedString(str, localAnnotations);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean substringWithoutParagraphStyles$lambda$10(AnnotatedString.Annotation annotation) {
        return !(annotation instanceof ParagraphStyle);
    }

    public static final <T> List<T> mapEachParagraphStyle(AnnotatedString annotatedString, ParagraphStyle paragraphStyle, Function2<? super AnnotatedString, ? super AnnotatedString.Range<ParagraphStyle>, ? extends T> function2) {
        List<AnnotatedString.Range<ParagraphStyle>> listNormalizedParagraphStyles = normalizedParagraphStyles(annotatedString, paragraphStyle);
        ArrayList arrayList = new ArrayList(listNormalizedParagraphStyles.size());
        int size = listNormalizedParagraphStyles.size();
        for (int i = 0; i < size; i++) {
            AnnotatedString.Range<ParagraphStyle> range = listNormalizedParagraphStyles.get(i);
            arrayList.add(function2.invoke(substringWithoutParagraphStyles(annotatedString, range.getStart(), range.getEnd()), range));
        }
        return arrayList;
    }

    public static /* synthetic */ AnnotatedString toUpperCase$default(AnnotatedString annotatedString, LocaleList localeList, int i, Object obj) {
        if ((i & 1) != 0) {
            localeList = LocaleList.INSTANCE.getCurrent();
        }
        return toUpperCase(annotatedString, localeList);
    }

    public static final AnnotatedString toUpperCase(AnnotatedString annotatedString, final LocaleList localeList) {
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new Function3() { // from class: androidx.compose.ui.text.AnnotatedStringKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AnnotatedStringKt.toUpperCase$lambda$12(localeList, (String) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toUpperCase$lambda$12(LocaleList localeList, String str, int i, int i2) {
        String strSubstring = str.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return StringKt.toUpperCase(strSubstring, localeList);
    }

    public static /* synthetic */ AnnotatedString toLowerCase$default(AnnotatedString annotatedString, LocaleList localeList, int i, Object obj) {
        if ((i & 1) != 0) {
            localeList = LocaleList.INSTANCE.getCurrent();
        }
        return toLowerCase(annotatedString, localeList);
    }

    public static final AnnotatedString toLowerCase(AnnotatedString annotatedString, final LocaleList localeList) {
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new Function3() { // from class: androidx.compose.ui.text.AnnotatedStringKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AnnotatedStringKt.toLowerCase$lambda$13(localeList, (String) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toLowerCase$lambda$13(LocaleList localeList, String str, int i, int i2) {
        String strSubstring = str.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return StringKt.toLowerCase(strSubstring, localeList);
    }

    public static /* synthetic */ AnnotatedString capitalize$default(AnnotatedString annotatedString, LocaleList localeList, int i, Object obj) {
        if ((i & 1) != 0) {
            localeList = LocaleList.INSTANCE.getCurrent();
        }
        return capitalize(annotatedString, localeList);
    }

    public static final AnnotatedString capitalize(AnnotatedString annotatedString, final LocaleList localeList) {
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new Function3() { // from class: androidx.compose.ui.text.AnnotatedStringKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AnnotatedStringKt.capitalize$lambda$14(localeList, (String) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String capitalize$lambda$14(LocaleList localeList, String str, int i, int i2) {
        if (i == 0) {
            String strSubstring = str.substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            return StringKt.capitalize(strSubstring, localeList);
        }
        String strSubstring2 = str.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
        return strSubstring2;
    }

    public static /* synthetic */ AnnotatedString decapitalize$default(AnnotatedString annotatedString, LocaleList localeList, int i, Object obj) {
        if ((i & 1) != 0) {
            localeList = LocaleList.INSTANCE.getCurrent();
        }
        return decapitalize(annotatedString, localeList);
    }

    public static final AnnotatedString decapitalize(AnnotatedString annotatedString, final LocaleList localeList) {
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new Function3() { // from class: androidx.compose.ui.text.AnnotatedStringKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return AnnotatedStringKt.decapitalize$lambda$15(localeList, (String) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String decapitalize$lambda$15(LocaleList localeList, String str, int i, int i2) {
        if (i == 0) {
            String strSubstring = str.substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            return StringKt.decapitalize(strSubstring, localeList);
        }
        String strSubstring2 = str.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
        return strSubstring2;
    }

    public static final <R> R withStyle(AnnotatedString.Builder builder, SpanStyle spanStyle, Function1<? super AnnotatedString.Builder, ? extends R> function1) {
        int iPushStyle = builder.pushStyle(spanStyle);
        try {
            return function1.invoke(builder);
        } finally {
            builder.pop(iPushStyle);
        }
    }

    public static final <R> R withStyle(AnnotatedString.Builder builder, ParagraphStyle paragraphStyle, Function1<? super AnnotatedString.Builder, ? extends R> function1) {
        int iPushStyle = builder.pushStyle(paragraphStyle);
        try {
            return function1.invoke(builder);
        } finally {
            builder.pop(iPushStyle);
        }
    }

    public static final <R> R withAnnotation(AnnotatedString.Builder builder, String str, String str2, Function1<? super AnnotatedString.Builder, ? extends R> function1) {
        int iPushStringAnnotation = builder.pushStringAnnotation(str, str2);
        try {
            return function1.invoke(builder);
        } finally {
            builder.pop(iPushStringAnnotation);
        }
    }

    public static final <R> R withAnnotation(AnnotatedString.Builder builder, TtsAnnotation ttsAnnotation, Function1<? super AnnotatedString.Builder, ? extends R> function1) {
        int iPushTtsAnnotation = builder.pushTtsAnnotation(ttsAnnotation);
        try {
            return function1.invoke(builder);
        } finally {
            builder.pop(iPushTtsAnnotation);
        }
    }

    @Deprecated(message = "Use LinkAnnotation API for links instead", replaceWith = @ReplaceWith(expression = "withLink(, block)", imports = {}))
    public static final <R> R withAnnotation(AnnotatedString.Builder builder, UrlAnnotation urlAnnotation, Function1<? super AnnotatedString.Builder, ? extends R> function1) {
        int iPushUrlAnnotation = builder.pushUrlAnnotation(urlAnnotation);
        try {
            return function1.invoke(builder);
        } finally {
            builder.pop(iPushUrlAnnotation);
        }
    }

    public static final <R> R withLink(AnnotatedString.Builder builder, LinkAnnotation linkAnnotation, Function1<? super AnnotatedString.Builder, ? extends R> function1) {
        int iPushLink = builder.pushLink(linkAnnotation);
        try {
            return function1.invoke(builder);
        } finally {
            builder.pop(iPushLink);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> List<AnnotatedString.Range<T>> filterRanges(List<? extends AnnotatedString.Range<? extends T>> list, int i, int i2) {
        if (i > i2) {
            StringBuilder sb = new StringBuilder("start (");
            sb.append(i);
            sb.append(") should be less than or equal to end (");
            sb.append(i2);
            sb.append(')');
            InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            AnnotatedString.Range<? extends T> range = list.get(i3);
            if (intersect(i, i2, range.getStart(), range.getEnd())) {
                arrayList.add(new AnnotatedString.Range(range.getItem(), Math.max(i, range.getStart()) - i, Math.min(i2, range.getEnd()) - i, range.getTag()));
            }
        }
        ArrayList arrayList2 = arrayList;
        return arrayList2.isEmpty() ? null : arrayList2;
    }

    public static /* synthetic */ AnnotatedString AnnotatedString$default(String str, SpanStyle spanStyle, ParagraphStyle paragraphStyle, int i, Object obj) {
        if ((i & 4) != 0) {
            paragraphStyle = null;
        }
        return AnnotatedString(str, spanStyle, paragraphStyle);
    }

    public static final AnnotatedString AnnotatedString(String str, SpanStyle spanStyle, ParagraphStyle paragraphStyle) {
        return new AnnotatedString(str, CollectionsKt.listOf(new AnnotatedString.Range(spanStyle, 0, str.length())), paragraphStyle == null ? CollectionsKt.emptyList() : CollectionsKt.listOf(new AnnotatedString.Range(paragraphStyle, 0, str.length())));
    }

    public static final AnnotatedString AnnotatedString(String str, ParagraphStyle paragraphStyle) {
        return new AnnotatedString(str, CollectionsKt.emptyList(), CollectionsKt.listOf(new AnnotatedString.Range(paragraphStyle, 0, str.length())));
    }

    public static final AnnotatedString buildAnnotatedString(Function1<? super AnnotatedString.Builder, Unit> function1) {
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        function1.invoke(builder);
        return builder.toAnnotatedString();
    }

    public static final AnnotatedString emptyAnnotatedString() {
        return EmptyAnnotatedString;
    }
}
