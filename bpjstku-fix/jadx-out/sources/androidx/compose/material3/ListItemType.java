package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0083@\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0000H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\r\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0005J\u0010\u0010\u0013\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0088\u0001\u0014\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/compose/material3/ListItemType;", "", "", "p0", "constructor-impl", "(I)I", "compareTo-yh95HIg", "(II)I", "compareTo", "", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "hashCode-impl", "hashCode", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "lines", "I", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
@JvmInline
final class ListItemType implements Comparable<ListItemType> {
    private final int lines;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int OneLine = m2178constructorimpl(1);
    private static final int TwoLine = m2178constructorimpl(2);
    private static final int ThreeLine = m2178constructorimpl(3);

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static int m2178constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2180equalsimpl0(int i, int i2) {
        return i == i2;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ListItemType listItemType) {
        return m2183compareToyh95HIg(listItemType.getLines());
    }

    private /* synthetic */ ListItemType(int i) {
        this.lines = i;
    }

    /* JADX INFO: renamed from: compareTo-yh95HIg, reason: not valid java name */
    public static int m2177compareToyh95HIg(int i, int i2) {
        return Intrinsics.compare(i, i2);
    }

    /* JADX INFO: renamed from: compareTo-yh95HIg, reason: not valid java name */
    public final int m2183compareToyh95HIg(int i) {
        return m2177compareToyh95HIg(this.lines, i);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\f\u001a\u00020\b8\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0010\u001a\u00020\b8\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001d\u0010\u0012\u001a\u00020\b8\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/compose/material3/ListItemType$Companion;", "", "<init>", "()V", "", "p0", "p1", "p2", "Landroidx/compose/material3/ListItemType;", "getListItemType-Z-LSjz4$material3_release", "(ZZZ)I", "getListItemType", "OneLine", "I", "getOneLine-AlXitO8", "()I", "ThreeLine", "getThreeLine-AlXitO8", "TwoLine", "getTwoLine-AlXitO8"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: renamed from: getOneLine-AlXitO8, reason: not valid java name */
        public final int m2186getOneLineAlXitO8() {
            return ListItemType.OneLine;
        }

        /* JADX INFO: renamed from: getTwoLine-AlXitO8, reason: not valid java name */
        public final int m2188getTwoLineAlXitO8() {
            return ListItemType.TwoLine;
        }

        /* JADX INFO: renamed from: getThreeLine-AlXitO8, reason: not valid java name */
        public final int m2187getThreeLineAlXitO8() {
            return ListItemType.ThreeLine;
        }

        /* JADX INFO: renamed from: getListItemType-Z-LSjz4$material3_release, reason: not valid java name */
        public final int m2185getListItemTypeZLSjz4$material3_release(boolean p0, boolean p1, boolean p2) {
            if ((p0 && p1) || p2) {
                return m2187getThreeLineAlXitO8();
            }
            if (p0 || p1) {
                return m2188getTwoLineAlXitO8();
            }
            return m2186getOneLineAlXitO8();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ListItemType m2176boximpl(int i) {
        return new ListItemType(i);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m2179equalsimpl(int i, Object obj) {
        return (obj instanceof ListItemType) && i == ((ListItemType) obj).getLines();
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m2181hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m2182toStringimpl(int i) {
        StringBuilder sb = new StringBuilder("ListItemType(lines=");
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        return m2179equalsimpl(this.lines, obj);
    }

    public final int hashCode() {
        return m2181hashCodeimpl(this.lines);
    }

    public final String toString() {
        return m2182toStringimpl(this.lines);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getLines() {
        return this.lines;
    }
}
