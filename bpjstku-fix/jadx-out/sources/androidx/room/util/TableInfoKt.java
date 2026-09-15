package androidx.room.util;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0000H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\f2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\r\u001a!\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\fH\u0000¢\u0006\u0004\b\u0007\u0010\u0013\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\fH\u0001¢\u0006\u0004\b\n\u0010\u0014\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00152\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0016\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0015H\u0000¢\u0006\u0004\b\u0007\u0010\u0017\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0015H\u0001¢\u0006\u0004\b\n\u0010\u0018\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00192\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u001a\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0019H\u0000¢\u0006\u0004\b\u0007\u0010\u001b\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0019H\u0001¢\u0006\u0004\b\n\u0010\u001c\u001a\u001b\u0010\u001e\u001a\u00020\t2\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0017\u0010!\u001a\u00020 *\u0006\u0012\u0002\b\u00030\u001dH\u0002¢\u0006\u0004\b!\u0010\"\u001a\u0017\u0010#\u001a\u00020 *\u0006\u0012\u0002\b\u00030\u001dH\u0002¢\u0006\u0004\b#\u0010\""}, d2 = {"Landroidx/room/util/TableInfo;", "", "p0", "", "equalsCommon", "(Landroidx/room/util/TableInfo;Ljava/lang/Object;)Z", "", "hashCodeCommon", "(Landroidx/room/util/TableInfo;)I", "", "toStringCommon", "(Landroidx/room/util/TableInfo;)Ljava/lang/String;", "Landroidx/room/util/TableInfo$Column;", "(Landroidx/room/util/TableInfo$Column;Ljava/lang/Object;)Z", "p1", "defaultValueEqualsCommon", "(Ljava/lang/String;Ljava/lang/String;)Z", "containsSurroundingParenthesis", "(Ljava/lang/String;)Z", "(Landroidx/room/util/TableInfo$Column;)I", "(Landroidx/room/util/TableInfo$Column;)Ljava/lang/String;", "Landroidx/room/util/TableInfo$ForeignKey;", "(Landroidx/room/util/TableInfo$ForeignKey;Ljava/lang/Object;)Z", "(Landroidx/room/util/TableInfo$ForeignKey;)I", "(Landroidx/room/util/TableInfo$ForeignKey;)Ljava/lang/String;", "Landroidx/room/util/TableInfo$Index;", "(Landroidx/room/util/TableInfo$Index;Ljava/lang/Object;)Z", "(Landroidx/room/util/TableInfo$Index;)I", "(Landroidx/room/util/TableInfo$Index;)Ljava/lang/String;", "", "formatString", "(Ljava/util/Collection;)Ljava/lang/String;", "", "joinToStringMiddleWithIndent", "(Ljava/util/Collection;)V", "joinToStringEndWithIndent"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TableInfoKt {
    public static final boolean equalsCommon(TableInfo tableInfo, Object obj) {
        Intrinsics.checkNotNullParameter(tableInfo, "");
        if (tableInfo == obj) {
            return true;
        }
        if (!(obj instanceof TableInfo)) {
            return false;
        }
        TableInfo tableInfo2 = (TableInfo) obj;
        if (!Intrinsics.areEqual(tableInfo.name, tableInfo2.name) || !Intrinsics.areEqual(tableInfo.columns, tableInfo2.columns) || !Intrinsics.areEqual(tableInfo.foreignKeys, tableInfo2.foreignKeys)) {
            return false;
        }
        if (tableInfo.indices == null || tableInfo2.indices == null) {
            return true;
        }
        return Intrinsics.areEqual(tableInfo.indices, tableInfo2.indices);
    }

    public static final int hashCodeCommon(TableInfo tableInfo) {
        Intrinsics.checkNotNullParameter(tableInfo, "");
        return (((tableInfo.name.hashCode() * 31) + tableInfo.columns.hashCode()) * 31) + tableInfo.foreignKeys.hashCode();
    }

    public static final String toStringCommon(TableInfo tableInfo) {
        List listEmptyList;
        Intrinsics.checkNotNullParameter(tableInfo, "");
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(tableInfo.name);
        sb.append("',\n            |    columns = {");
        sb.append(formatString(CollectionsKt.sortedWith(tableInfo.columns.values(), new Comparator() { // from class: androidx.room.util.TableInfoKt$toStringCommon$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((TableInfo.Column) t).name, ((TableInfo.Column) t2).name);
            }
        })));
        sb.append("\n            |    foreignKeys = {");
        sb.append(formatString(tableInfo.foreignKeys));
        sb.append("\n            |    indices = {");
        Set<TableInfo.Index> set = tableInfo.indices;
        if (set == null || (listEmptyList = CollectionsKt.sortedWith(set, new Comparator() { // from class: androidx.room.util.TableInfoKt$toStringCommon$$inlined$sortedBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((TableInfo.Index) t).name, ((TableInfo.Index) t2).name);
            }
        })) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        sb.append(formatString(listEmptyList));
        sb.append("\n            |}\n        ");
        return StringsKt.trimMargin$default(sb.toString(), null, 1, null);
    }

    public static final boolean equalsCommon(TableInfo.Column column, Object obj) {
        Intrinsics.checkNotNullParameter(column, "");
        if (column == obj) {
            return true;
        }
        if (!(obj instanceof TableInfo.Column)) {
            return false;
        }
        TableInfo.Column column2 = (TableInfo.Column) obj;
        if (column.isPrimaryKey() != column2.isPrimaryKey() || !Intrinsics.areEqual(column.name, column2.name) || column.notNull != column2.notNull) {
            return false;
        }
        String str = column.defaultValue;
        String str2 = column2.defaultValue;
        if (column.createdFrom == 1 && column2.createdFrom == 2 && str != null && !defaultValueEqualsCommon(str, column2.defaultValue)) {
            return false;
        }
        if (column.createdFrom != 2 || column2.createdFrom != 1 || str2 == null || defaultValueEqualsCommon(str2, str)) {
            return (column.createdFrom == 0 || column.createdFrom != column2.createdFrom || (str == null ? str2 == null : defaultValueEqualsCommon(str, str2))) && column.affinity == column2.affinity;
        }
        return false;
    }

    public static final boolean defaultValueEqualsCommon(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.areEqual(str, str2)) {
            return true;
        }
        if (!containsSurroundingParenthesis(str)) {
            return false;
        }
        String strSubstring = str.substring(1, str.length() - 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return Intrinsics.areEqual(StringsKt.trim((CharSequence) strSubstring).toString(), str2);
    }

    private static final boolean containsSurroundingParenthesis(String str) {
        String str2 = str;
        if (str2.length() == 0) {
            return false;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < str2.length()) {
            char cCharAt = str2.charAt(i);
            if (i3 == 0 && cCharAt != '(') {
                return false;
            }
            if (cCharAt == '(') {
                i2++;
            } else if (cCharAt == ')' && (i2 = i2 - 1) == 0 && i3 != str.length() - 1) {
                return false;
            }
            i++;
            i3++;
        }
        return i2 == 0;
    }

    public static final int hashCodeCommon(TableInfo.Column column) {
        Intrinsics.checkNotNullParameter(column, "");
        int iHashCode = column.name.hashCode();
        return (((((iHashCode * 31) + column.affinity) * 31) + (column.notNull ? 1231 : 1237)) * 31) + column.primaryKeyPosition;
    }

    public static final String toStringCommon(TableInfo.Column column) {
        Intrinsics.checkNotNullParameter(column, "");
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(column.name);
        sb.append("',\n            |   type = '");
        sb.append(column.type);
        sb.append("',\n            |   affinity = '");
        sb.append(column.affinity);
        sb.append("',\n            |   notNull = '");
        sb.append(column.notNull);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(column.primaryKeyPosition);
        sb.append("',\n            |   defaultValue = '");
        String str = column.defaultValue;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return StringsKt.prependIndent$default(StringsKt.trimMargin$default(sb.toString(), null, 1, null), null, 1, null);
    }

    public static final boolean equalsCommon(TableInfo.ForeignKey foreignKey, Object obj) {
        Intrinsics.checkNotNullParameter(foreignKey, "");
        if (foreignKey == obj) {
            return true;
        }
        if (!(obj instanceof TableInfo.ForeignKey)) {
            return false;
        }
        TableInfo.ForeignKey foreignKey2 = (TableInfo.ForeignKey) obj;
        if (Intrinsics.areEqual(foreignKey.referenceTable, foreignKey2.referenceTable) && Intrinsics.areEqual(foreignKey.onDelete, foreignKey2.onDelete) && Intrinsics.areEqual(foreignKey.onUpdate, foreignKey2.onUpdate) && Intrinsics.areEqual(foreignKey.columnNames, foreignKey2.columnNames)) {
            return Intrinsics.areEqual(foreignKey.referenceColumnNames, foreignKey2.referenceColumnNames);
        }
        return false;
    }

    public static final int hashCodeCommon(TableInfo.ForeignKey foreignKey) {
        Intrinsics.checkNotNullParameter(foreignKey, "");
        int iHashCode = foreignKey.referenceTable.hashCode();
        int iHashCode2 = foreignKey.onDelete.hashCode();
        return (((((((iHashCode * 31) + iHashCode2) * 31) + foreignKey.onUpdate.hashCode()) * 31) + foreignKey.columnNames.hashCode()) * 31) + foreignKey.referenceColumnNames.hashCode();
    }

    public static final String toStringCommon(TableInfo.ForeignKey foreignKey) {
        Intrinsics.checkNotNullParameter(foreignKey, "");
        StringBuilder sb = new StringBuilder("\n            |ForeignKey {\n            |   referenceTable = '");
        sb.append(foreignKey.referenceTable);
        sb.append("',\n            |   onDelete = '");
        sb.append(foreignKey.onDelete);
        sb.append("',\n            |   onUpdate = '");
        sb.append(foreignKey.onUpdate);
        sb.append("',\n            |   columnNames = {");
        joinToStringMiddleWithIndent(CollectionsKt.sorted(foreignKey.columnNames));
        sb.append(Unit.INSTANCE);
        sb.append("\n            |   referenceColumnNames = {");
        joinToStringEndWithIndent(CollectionsKt.sorted(foreignKey.referenceColumnNames));
        sb.append(Unit.INSTANCE);
        sb.append("\n            |}\n        ");
        return StringsKt.prependIndent$default(StringsKt.trimMargin$default(sb.toString(), null, 1, null), null, 1, null);
    }

    public static final boolean equalsCommon(TableInfo.Index index, Object obj) {
        Intrinsics.checkNotNullParameter(index, "");
        if (index == obj) {
            return true;
        }
        if (!(obj instanceof TableInfo.Index)) {
            return false;
        }
        TableInfo.Index index2 = (TableInfo.Index) obj;
        if (index.unique != index2.unique || !Intrinsics.areEqual(index.columns, index2.columns) || !Intrinsics.areEqual(index.orders, index2.orders)) {
            return false;
        }
        if (StringsKt.startsWith$default(index.name, TableInfo.Index.DEFAULT_PREFIX, false, 2, (Object) null)) {
            return StringsKt.startsWith$default(index2.name, TableInfo.Index.DEFAULT_PREFIX, false, 2, (Object) null);
        }
        return Intrinsics.areEqual(index.name, index2.name);
    }

    public static final int hashCodeCommon(TableInfo.Index index) {
        int iHashCode;
        Intrinsics.checkNotNullParameter(index, "");
        if (StringsKt.startsWith$default(index.name, TableInfo.Index.DEFAULT_PREFIX, false, 2, (Object) null)) {
            iHashCode = TableInfo.Index.DEFAULT_PREFIX.hashCode();
        } else {
            iHashCode = index.name.hashCode();
        }
        boolean z = index.unique;
        return (((((iHashCode * 31) + (z ? 1 : 0)) * 31) + index.columns.hashCode()) * 31) + index.orders.hashCode();
    }

    public static final String toStringCommon(TableInfo.Index index) {
        Intrinsics.checkNotNullParameter(index, "");
        StringBuilder sb = new StringBuilder("\n            |Index {\n            |   name = '");
        sb.append(index.name);
        sb.append("',\n            |   unique = '");
        sb.append(index.unique);
        sb.append("',\n            |   columns = {");
        joinToStringMiddleWithIndent(index.columns);
        sb.append(Unit.INSTANCE);
        sb.append("\n            |   orders = {");
        joinToStringEndWithIndent(index.orders);
        sb.append(Unit.INSTANCE);
        sb.append("\n            |}\n        ");
        return StringsKt.prependIndent$default(StringsKt.trimMargin$default(sb.toString(), null, 1, null), null, 1, null);
    }

    public static final String formatString(Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        if (!collection.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append(StringsKt.prependIndent$default(CollectionsKt.joinToString$default(collection, ",\n", "\n", "\n", 0, null, null, 56, null), null, 1, null));
            sb.append("},");
            return sb.toString();
        }
        return " }";
    }

    private static final void joinToStringMiddleWithIndent(Collection<?> collection) {
        StringsKt.prependIndent$default(CollectionsKt.joinToString$default(collection, ",", null, null, 0, null, null, 62, null), null, 1, null);
        StringsKt.prependIndent$default("},", null, 1, null);
    }

    private static final void joinToStringEndWithIndent(Collection<?> collection) {
        StringsKt.prependIndent$default(CollectionsKt.joinToString$default(collection, ",", null, null, 0, null, null, 62, null), null, 1, null);
        StringsKt.prependIndent$default(" }", null, 1, null);
    }
}
