package androidx.room;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u001a\u001b\u001cB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u0007H\u0007¢\u0006\u0004\b\n\u0010\fJQ\u0010\u0012\u001a\u00020\u00102\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072$\u0010\u0011\u001a \u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\u0004\u0012\u00020\u00100\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J]\u0010\u0018\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u00142\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\u0018\u0010\u0017\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00020\u00100\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/room/AmbiguousColumnResolver;", "", "<init>", "()V", "", "", "p0", "", "p1", "", "resolve", "(Ljava/util/List;[[Ljava/lang/String;)[[I", "([Ljava/lang/String;[[Ljava/lang/String;)[[I", "Landroidx/room/AmbiguousColumnResolver$ResultColumn;", "Lkotlin/Function3;", "", "", "p2", "rabinKarpSearch", "(Ljava/util/List;[Ljava/lang/String;Lkotlin/jvm/functions/Function3;)V", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlin/Function1;", "p3", "dfs", "(Ljava/util/List;Ljava/util/List;ILkotlin/jvm/functions/Function1;)V", "ResultColumn", "Match", "Solution"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AmbiguousColumnResolver {
    public static final AmbiguousColumnResolver INSTANCE = new AmbiguousColumnResolver();

    private AmbiguousColumnResolver() {
    }

    @JvmStatic
    public static final int[][] resolve(List<String> p0, String[][] p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        return resolve((String[]) p0.toArray(new String[0]), p1);
    }

    /* JADX WARN: Type inference failed for: r15v9, types: [T, androidx.room.AmbiguousColumnResolver$Solution] */
    @JvmStatic
    public static final int[][] resolve(String[] p0, String[][] p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        int length = p0.length;
        for (int i = 0; i < length; i++) {
            String strSubstring = p0[i];
            if (strSubstring.charAt(0) == '`' && strSubstring.charAt(strSubstring.length() - 1) == '`') {
                strSubstring = strSubstring.substring(1, strSubstring.length() - 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            }
            String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            p0[i] = lowerCase;
        }
        String[][] strArr = p1;
        int length2 = strArr.length;
        for (int i2 = 0; i2 < length2; i2++) {
            int length3 = p1[i2].length;
            for (int i3 = 0; i3 < length3; i3++) {
                String[] strArr2 = p1[i2];
                String lowerCase2 = strArr2[i3].toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                strArr2[i3] = lowerCase2;
            }
        }
        Set setCreateSetBuilder = SetsKt.createSetBuilder();
        for (String[] strArr3 : strArr) {
            CollectionsKt.addAll(setCreateSetBuilder, strArr3);
        }
        Set setBuild = SetsKt.build(setCreateSetBuilder);
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        int length4 = p0.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length4) {
            String str = p0[i4];
            if (setBuild.contains(str)) {
                listCreateListBuilder.add(new ResultColumn(str, i5));
            }
            i4++;
            i5++;
        }
        List<ResultColumn> listBuild = CollectionsKt.build(listCreateListBuilder);
        int length5 = strArr.length;
        ArrayList arrayList = new ArrayList(length5);
        for (int i6 = 0; i6 < length5; i6++) {
            arrayList.add(new ArrayList());
        }
        final ArrayList arrayList2 = arrayList;
        int length6 = strArr.length;
        int i7 = 0;
        final int i8 = 0;
        while (i7 < length6) {
            final String[] strArr4 = strArr[i7];
            INSTANCE.rabinKarpSearch(listBuild, strArr4, new Function3() { // from class: androidx.room.AmbiguousColumnResolver$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AmbiguousColumnResolver.resolve$lambda$16$lambda$7(strArr4, arrayList2, i8, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), (List) obj3);
                }
            });
            if (((List) arrayList2.get(i8)).isEmpty()) {
                ArrayList arrayList3 = new ArrayList(strArr4.length);
                for (String str2 : strArr4) {
                    List listCreateListBuilder2 = CollectionsKt.createListBuilder();
                    for (ResultColumn resultColumn : listBuild) {
                        if (Intrinsics.areEqual(str2, resultColumn.getName())) {
                            listCreateListBuilder2.add(Integer.valueOf(resultColumn.getIndex()));
                        }
                    }
                    List listBuild2 = CollectionsKt.build(listCreateListBuilder2);
                    if (listBuild2.isEmpty()) {
                        StringBuilder sb = new StringBuilder("Column ");
                        sb.append(str2);
                        sb.append(" not found in result");
                        throw new IllegalStateException(sb.toString().toString());
                    }
                    arrayList3.add(listBuild2);
                }
                dfs$default(INSTANCE, arrayList3, null, 0, new Function1() { // from class: androidx.room.AmbiguousColumnResolver$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AmbiguousColumnResolver.resolve$lambda$16$lambda$15(arrayList2, i8, (List) obj);
                    }
                }, 6, null);
            }
            i7++;
            i8++;
        }
        ArrayList arrayList4 = arrayList2;
        if (!arrayList4.isEmpty()) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                if (((List) it.next()).isEmpty()) {
                    throw new IllegalStateException("Failed to find matches for all mappings".toString());
                }
            }
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = Solution.INSTANCE.getNO_SOLUTION();
        dfs$default(INSTANCE, arrayList2, null, 0, new Function1() { // from class: androidx.room.AmbiguousColumnResolver$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AmbiguousColumnResolver.resolve$lambda$19(objectRef, (List) obj);
            }
        }, 6, null);
        List<Match> matches = ((Solution) objectRef.element).getMatches();
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(matches, 10));
        Iterator<T> it2 = matches.iterator();
        while (it2.hasNext()) {
            arrayList5.add(CollectionsKt.toIntArray(((Match) it2.next()).getResultIndices()));
        }
        return (int[][]) arrayList5.toArray(new int[0][]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit resolve$lambda$16$lambda$15(List list, int i, List list2) {
        Intrinsics.checkNotNullParameter(list2, "");
        List list3 = list2;
        Iterator it = list3.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        int iIntValue = ((Number) it.next()).intValue();
        while (it.hasNext()) {
            int iIntValue2 = ((Number) it.next()).intValue();
            if (iIntValue > iIntValue2) {
                iIntValue = iIntValue2;
            }
        }
        Iterator it2 = list3.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        int iIntValue3 = ((Number) it2.next()).intValue();
        while (it2.hasNext()) {
            int iIntValue4 = ((Number) it2.next()).intValue();
            if (iIntValue3 < iIntValue4) {
                iIntValue3 = iIntValue4;
            }
        }
        ((List) list.get(i)).add(new Match(new IntRange(iIntValue, iIntValue3), list2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, androidx.room.AmbiguousColumnResolver$Solution] */
    public static final Unit resolve$lambda$19(Ref.ObjectRef objectRef, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        ?? Build = Solution.INSTANCE.build(list);
        if (Build.compareTo((Solution) objectRef.element) < 0) {
            objectRef.element = Build;
        }
        return Unit.INSTANCE;
    }

    private final void rabinKarpSearch(List<ResultColumn> p0, String[] p1, Function3<? super Integer, ? super Integer, ? super List<ResultColumn>, Unit> p2) {
        int i = 0;
        int iHashCode = 0;
        for (String str : p1) {
            iHashCode += str.hashCode();
        }
        int length = p1.length;
        Iterator<T> it = p0.subList(0, length).iterator();
        int iHashCode2 = 0;
        while (it.hasNext()) {
            iHashCode2 += ((ResultColumn) it.next()).getName().hashCode();
        }
        while (true) {
            if (iHashCode == iHashCode2) {
                p2.invoke(Integer.valueOf(i), Integer.valueOf(length), p0.subList(i, length));
            }
            int i2 = length + 1;
            if (i2 > p0.size()) {
                return;
            }
            iHashCode2 = (iHashCode2 - p0.get(i).getName().hashCode()) + p0.get(length).getName().hashCode();
            i++;
            length = i2;
        }
    }

    static /* synthetic */ void dfs$default(AmbiguousColumnResolver ambiguousColumnResolver, List list, List list2, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            list2 = new ArrayList();
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        ambiguousColumnResolver.dfs(list, list2, i, function1);
    }

    private final <T> void dfs(List<? extends List<? extends T>> p0, List<T> p1, int p2, Function1<? super List<? extends T>, Unit> p3) {
        if (p2 == p0.size()) {
            p3.invoke(CollectionsKt.toList(p1));
            return;
        }
        Iterator<T> it = p0.get(p2).iterator();
        while (it.hasNext()) {
            p1.add(it.next());
            INSTANCE.dfs(p0, p1, p2 + 1, p3);
            p1.remove(CollectionsKt.getLastIndex(p1));
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\tR\u001a\u0010\u0016\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b"}, d2 = {"Landroidx/room/AmbiguousColumnResolver$ResultColumn;", "", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;I)V", "component1", "()Ljava/lang/String;", "component2", "()I", "copy", "(Ljava/lang/String;I)Landroidx/room/AmbiguousColumnResolver$ResultColumn;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "name", "Ljava/lang/String;", "getName", FirebaseAnalytics.Param.INDEX, "I", "getIndex"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final /* data */ class ResultColumn {
        private final int index;
        private final String name;

        public ResultColumn(String str, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            this.name = str;
            this.index = i;
        }

        public final int getIndex() {
            return this.index;
        }

        public final String getName() {
            return this.name;
        }

        public static /* synthetic */ ResultColumn copy$default(ResultColumn resultColumn, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = resultColumn.name;
            }
            if ((i2 & 2) != 0) {
                i = resultColumn.index;
            }
            return resultColumn.copy(str, i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public final ResultColumn copy(String p0, int p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            return new ResultColumn(p0, p1);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof ResultColumn)) {
                return false;
            }
            ResultColumn resultColumn = (ResultColumn) p0;
            return Intrinsics.areEqual(this.name, resultColumn.name) && this.index == resultColumn.index;
        }

        public final int hashCode() {
            return (this.name.hashCode() * 31) + Integer.hashCode(this.index);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ResultColumn(name=");
            sb.append(this.name);
            sb.append(", index=");
            sb.append(this.index);
            sb.append(')');
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/room/AmbiguousColumnResolver$Match;", "", "Lkotlin/ranges/IntRange;", "p0", "", "", "p1", "<init>", "(Lkotlin/ranges/IntRange;Ljava/util/List;)V", "resultRange", "Lkotlin/ranges/IntRange;", "getResultRange", "()Lkotlin/ranges/IntRange;", "resultIndices", "Ljava/util/List;", "getResultIndices", "()Ljava/util/List;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Match {
        private final List<Integer> resultIndices;
        private final IntRange resultRange;

        public Match(IntRange intRange, List<Integer> list) {
            Intrinsics.checkNotNullParameter(intRange, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.resultRange = intRange;
            this.resultIndices = list;
        }

        public final IntRange getResultRange() {
            return this.resultRange;
        }

        public final List<Integer> getResultIndices() {
            return this.resultIndices;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013"}, d2 = {"Landroidx/room/AmbiguousColumnResolver$Solution;", "", "", "Landroidx/room/AmbiguousColumnResolver$Match;", "p0", "", "p1", "p2", "<init>", "(Ljava/util/List;II)V", "compareTo", "(Landroidx/room/AmbiguousColumnResolver$Solution;)I", "matches", "Ljava/util/List;", "getMatches", "()Ljava/util/List;", "coverageOffset", "I", "getCoverageOffset", "()I", "overlaps", "getOverlaps", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Solution implements Comparable<Solution> {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Solution NO_SOLUTION = new Solution(CollectionsKt.emptyList(), Integer.MAX_VALUE, Integer.MAX_VALUE);
        private final int coverageOffset;
        private final List<Match> matches;
        private final int overlaps;

        public Solution(List<Match> list, int i, int i2) {
            Intrinsics.checkNotNullParameter(list, "");
            this.matches = list;
            this.coverageOffset = i;
            this.overlaps = i2;
        }

        public final List<Match> getMatches() {
            return this.matches;
        }

        public final int getCoverageOffset() {
            return this.coverageOffset;
        }

        public final int getOverlaps() {
            return this.overlaps;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Solution p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            int iCompare = Intrinsics.compare(this.overlaps, p0.overlaps);
            return iCompare != 0 ? iCompare : Intrinsics.compare(this.coverageOffset, p0.coverageOffset);
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/room/AmbiguousColumnResolver$Solution$Companion;", "", "<init>", "()V", "", "Landroidx/room/AmbiguousColumnResolver$Match;", "p0", "Landroidx/room/AmbiguousColumnResolver$Solution;", "build", "(Ljava/util/List;)Landroidx/room/AmbiguousColumnResolver$Solution;", "NO_SOLUTION", "Landroidx/room/AmbiguousColumnResolver$Solution;", "getNO_SOLUTION", "()Landroidx/room/AmbiguousColumnResolver$Solution;"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final Solution getNO_SOLUTION() {
                return Solution.NO_SOLUTION;
            }

            public final Solution build(List<Match> p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                List<Match> list = p0;
                int last = 0;
                for (Match match : list) {
                    last += ((match.getResultRange().getLast() - match.getResultRange().getFirst()) + 1) - match.getResultIndices().size();
                }
                Iterator<T> it = list.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                int first = ((Match) it.next()).getResultRange().getFirst();
                while (it.hasNext()) {
                    int first2 = ((Match) it.next()).getResultRange().getFirst();
                    if (first > first2) {
                        first = first2;
                    }
                }
                Iterator<T> it2 = list.iterator();
                if (!it2.hasNext()) {
                    throw new NoSuchElementException();
                }
                int last2 = ((Match) it2.next()).getResultRange().getLast();
                while (it2.hasNext()) {
                    int last3 = ((Match) it2.next()).getResultRange().getLast();
                    if (last2 < last3) {
                        last2 = last3;
                    }
                }
                Iterator<Integer> it3 = new IntRange(first, last2).iterator();
                int i = 0;
                while (it3.hasNext()) {
                    int iNextInt = ((IntIterator) it3).nextInt();
                    Iterator<T> it4 = list.iterator();
                    int i2 = 0;
                    while (it4.hasNext()) {
                        if (((Match) it4.next()).getResultRange().contains(iNextInt)) {
                            i2++;
                        }
                        if (i2 > 1) {
                            i++;
                            if (i >= 0) {
                                break;
                            }
                            CollectionsKt.throwCountOverflow();
                            break;
                        }
                    }
                }
                return new Solution(p0, last, i);
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit resolve$lambda$16$lambda$7(String[] strArr, List list, int i, int i2, int i3, List list2) {
        Object next;
        Intrinsics.checkNotNullParameter(list2, "");
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            Iterator it = list2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(str, ((ResultColumn) next).getName()));
            ResultColumn resultColumn = (ResultColumn) next;
            if (resultColumn == null) {
                return Unit.INSTANCE;
            }
            arrayList.add(Integer.valueOf(resultColumn.getIndex()));
        }
        ((List) list.get(i)).add(new Match(new IntRange(i2, i3 - 1), arrayList));
        return Unit.INSTANCE;
    }
}
