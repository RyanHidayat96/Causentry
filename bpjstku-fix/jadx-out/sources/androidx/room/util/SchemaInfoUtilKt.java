package androidx.room.util;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.database.SQLiteConnection;
import androidx.database.SQLiteStatement;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0001\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a+\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a'\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\n2\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0018\u0010\r\u001a)\u0010\u001b\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a%\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u001d\u0010\r\u001a%\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u001e\u0010\r\u001a\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u001f\u0010 \u001a\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\"\u0010#\"\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00000$8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&"}, d2 = {"", "p0", "", "findAffinity", "(Ljava/lang/String;)I", "Landroidx/sqlite/SQLiteConnection;", "p1", "Landroidx/room/util/TableInfo;", "readTableInfo", "(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)Landroidx/room/util/TableInfo;", "", "Landroidx/room/util/TableInfo$ForeignKey;", "readForeignKeys", "(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)Ljava/util/Set;", "Landroidx/sqlite/SQLiteStatement;", "", "Landroidx/room/util/ForeignKeyWithSequence;", "readForeignKeyFieldMappings", "(Landroidx/sqlite/SQLiteStatement;)Ljava/util/List;", "", "Landroidx/room/util/TableInfo$Column;", "readColumns", "(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)Ljava/util/Map;", "Landroidx/room/util/TableInfo$Index;", "readIndices", "", "p2", "readIndex", "(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;Z)Landroidx/room/util/TableInfo$Index;", "readFtsColumns", "readFtsOptions", "parseFtsOptions", "(Ljava/lang/String;)Ljava/util/Set;", "Landroidx/room/util/ViewInfo;", "readViewInfo", "(Landroidx/sqlite/SQLiteConnection;Ljava/lang/String;)Landroidx/room/util/ViewInfo;", "", "FTS_OPTIONS", "[Ljava/lang/String;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SchemaInfoUtilKt {
    private static final String[] FTS_OPTIONS = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};

    public static final int findAffinity(String str) {
        if (str == null) {
            return 5;
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        String str2 = upperCase;
        if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "INT", false, 2, (Object) null)) {
            return 3;
        }
        if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "CHAR", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str2, (CharSequence) "CLOB", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str2, (CharSequence) "TEXT", false, 2, (Object) null)) {
            return 2;
        }
        if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "BLOB", false, 2, (Object) null)) {
            return 5;
        }
        return (StringsKt.contains$default((CharSequence) str2, (CharSequence) "REAL", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str2, (CharSequence) "FLOA", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str2, (CharSequence) "DOUB", false, 2, (Object) null)) ? 4 : 1;
    }

    public static final TableInfo readTableInfo(SQLiteConnection sQLiteConnection, String str) {
        Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new TableInfo(str, readColumns(sQLiteConnection, str), readForeignKeys(sQLiteConnection, str), readIndices(sQLiteConnection, str));
    }

    private static final Set<TableInfo.ForeignKey> readForeignKeys(SQLiteConnection sQLiteConnection, String str) throws Exception {
        StringBuilder sb = new StringBuilder("PRAGMA foreign_key_list(`");
        sb.append(str);
        sb.append("`)");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(sb.toString());
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            int iColumnIndexOf = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "id");
            int iColumnIndexOf2 = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "seq");
            int iColumnIndexOf3 = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "table");
            int iColumnIndexOf4 = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "on_delete");
            int iColumnIndexOf5 = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "on_update");
            List<ForeignKeyWithSequence> foreignKeyFieldMappings = readForeignKeyFieldMappings(sQLiteStatement);
            sQLiteStatement.reset();
            Set setCreateSetBuilder = SetsKt.createSetBuilder();
            while (sQLiteStatement.step()) {
                if (sQLiteStatement.getLong(iColumnIndexOf2) == 0) {
                    int i = (int) sQLiteStatement.getLong(iColumnIndexOf);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<ForeignKeyWithSequence> arrayList3 = new ArrayList();
                    for (Object obj : foreignKeyFieldMappings) {
                        if (((ForeignKeyWithSequence) obj).getId() == i) {
                            arrayList3.add(obj);
                        }
                    }
                    for (ForeignKeyWithSequence foreignKeyWithSequence : arrayList3) {
                        arrayList.add(foreignKeyWithSequence.getFrom());
                        arrayList2.add(foreignKeyWithSequence.getTo());
                    }
                    setCreateSetBuilder.add(new TableInfo.ForeignKey(sQLiteStatement.getText(iColumnIndexOf3), sQLiteStatement.getText(iColumnIndexOf4), sQLiteStatement.getText(iColumnIndexOf5), arrayList, arrayList2));
                }
            }
            Set<TableInfo.ForeignKey> setBuild = SetsKt.build(setCreateSetBuilder);
            AutoCloseableKt.closeFinally(sQLiteStatementPrepare, null);
            return setBuild;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AutoCloseableKt.closeFinally(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }

    private static final List<ForeignKeyWithSequence> readForeignKeyFieldMappings(SQLiteStatement sQLiteStatement) {
        int iColumnIndexOf = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "id");
        int iColumnIndexOf2 = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "seq");
        int iColumnIndexOf3 = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "from");
        int iColumnIndexOf4 = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, TypedValues.TransitionType.S_TO);
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        while (sQLiteStatement.step()) {
            listCreateListBuilder.add(new ForeignKeyWithSequence((int) sQLiteStatement.getLong(iColumnIndexOf), (int) sQLiteStatement.getLong(iColumnIndexOf2), sQLiteStatement.getText(iColumnIndexOf3), sQLiteStatement.getText(iColumnIndexOf4)));
        }
        return CollectionsKt.sorted(CollectionsKt.build(listCreateListBuilder));
    }

    private static final Map<String, TableInfo.Column> readColumns(SQLiteConnection sQLiteConnection, String str) throws Exception {
        StringBuilder sb = new StringBuilder("PRAGMA table_info(`");
        sb.append(str);
        sb.append("`)");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(sb.toString());
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            String str2 = null;
            if (!sQLiteStatement.step()) {
                Map<String, TableInfo.Column> mapEmptyMap = MapsKt.emptyMap();
                AutoCloseableKt.closeFinally(sQLiteStatementPrepare, null);
                return mapEmptyMap;
            }
            int iColumnIndexOf = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "name");
            int iColumnIndexOf2 = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "type");
            int iColumnIndexOf3 = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "notnull");
            int iColumnIndexOf4 = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "pk");
            int iColumnIndexOf5 = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "dflt_value");
            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
            while (true) {
                String text = sQLiteStatement.getText(iColumnIndexOf);
                int i = iColumnIndexOf;
                mapCreateMapBuilder.put(text, new TableInfo.Column(text, sQLiteStatement.getText(iColumnIndexOf2), sQLiteStatement.getLong(iColumnIndexOf3) != 0, (int) sQLiteStatement.getLong(iColumnIndexOf4), sQLiteStatement.isNull(iColumnIndexOf5) ? str2 : sQLiteStatement.getText(iColumnIndexOf5), 2));
                if (!sQLiteStatement.step()) {
                    Map<String, TableInfo.Column> mapBuild = MapsKt.build(mapCreateMapBuilder);
                    AutoCloseableKt.closeFinally(sQLiteStatementPrepare, null);
                    return mapBuild;
                }
                iColumnIndexOf = i;
                str2 = null;
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AutoCloseableKt.closeFinally(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }

    private static final Set<TableInfo.Index> readIndices(SQLiteConnection sQLiteConnection, String str) throws Exception {
        StringBuilder sb = new StringBuilder("PRAGMA index_list(`");
        sb.append(str);
        sb.append("`)");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(sb.toString());
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            int iColumnIndexOf = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "name");
            int iColumnIndexOf2 = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "origin");
            int iColumnIndexOf3 = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "unique");
            if (iColumnIndexOf == -1 || iColumnIndexOf2 == -1 || iColumnIndexOf3 == -1) {
                AutoCloseableKt.closeFinally(sQLiteStatementPrepare, null);
                return null;
            }
            Set setCreateSetBuilder = SetsKt.createSetBuilder();
            while (sQLiteStatement.step()) {
                if (Intrinsics.areEqual("c", sQLiteStatement.getText(iColumnIndexOf2))) {
                    TableInfo.Index index = readIndex(sQLiteConnection, sQLiteStatement.getText(iColumnIndexOf), sQLiteStatement.getLong(iColumnIndexOf3) == 1);
                    if (index == null) {
                        AutoCloseableKt.closeFinally(sQLiteStatementPrepare, null);
                        return null;
                    }
                    setCreateSetBuilder.add(index);
                }
            }
            Set<TableInfo.Index> setBuild = SetsKt.build(setCreateSetBuilder);
            AutoCloseableKt.closeFinally(sQLiteStatementPrepare, null);
            return setBuild;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AutoCloseableKt.closeFinally(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }

    private static final TableInfo.Index readIndex(SQLiteConnection sQLiteConnection, String str, boolean z) throws Exception {
        StringBuilder sb = new StringBuilder("PRAGMA index_xinfo(`");
        sb.append(str);
        sb.append("`)");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(sb.toString());
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            int iColumnIndexOf = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "seqno");
            int iColumnIndexOf2 = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "cid");
            int iColumnIndexOf3 = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "name");
            int iColumnIndexOf4 = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "desc");
            if (iColumnIndexOf == -1 || iColumnIndexOf2 == -1 || iColumnIndexOf3 == -1 || iColumnIndexOf4 == -1) {
                AutoCloseableKt.closeFinally(sQLiteStatementPrepare, null);
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            while (sQLiteStatement.step()) {
                if (((int) sQLiteStatement.getLong(iColumnIndexOf2)) >= 0) {
                    int i = (int) sQLiteStatement.getLong(iColumnIndexOf);
                    String text = sQLiteStatement.getText(iColumnIndexOf3);
                    String str2 = sQLiteStatement.getLong(iColumnIndexOf4) > 0 ? "DESC" : "ASC";
                    linkedHashMap.put(Integer.valueOf(i), text);
                    linkedHashMap2.put(Integer.valueOf(i), str2);
                }
            }
            List listSortedWith = CollectionsKt.sortedWith(linkedHashMap.entrySet(), new Comparator() { // from class: androidx.room.util.SchemaInfoUtilKt$readIndex$lambda$13$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues((Integer) ((Map.Entry) t).getKey(), (Integer) ((Map.Entry) t2).getKey());
                }
            });
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedWith, 10));
            Iterator it = listSortedWith.iterator();
            while (it.hasNext()) {
                arrayList.add((String) ((Map.Entry) it.next()).getValue());
            }
            List list = CollectionsKt.toList(arrayList);
            List listSortedWith2 = CollectionsKt.sortedWith(linkedHashMap2.entrySet(), new Comparator() { // from class: androidx.room.util.SchemaInfoUtilKt$readIndex$lambda$13$$inlined$sortedBy$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues((Integer) ((Map.Entry) t).getKey(), (Integer) ((Map.Entry) t2).getKey());
                }
            });
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedWith2, 10));
            Iterator it2 = listSortedWith2.iterator();
            while (it2.hasNext()) {
                arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
            }
            TableInfo.Index index = new TableInfo.Index(str, z, list, CollectionsKt.toList(arrayList2));
            AutoCloseableKt.closeFinally(sQLiteStatementPrepare, null);
            return index;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AutoCloseableKt.closeFinally(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }

    public static final Set<String> readFtsColumns(SQLiteConnection sQLiteConnection, String str) throws Exception {
        Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        Intrinsics.checkNotNullParameter(str, "");
        Set setCreateSetBuilder = SetsKt.createSetBuilder();
        StringBuilder sb = new StringBuilder("PRAGMA table_info(`");
        sb.append(str);
        sb.append("`)");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(sb.toString());
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            if (sQLiteStatement.step()) {
                int iColumnIndexOf = SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "name");
                do {
                    setCreateSetBuilder.add(sQLiteStatement.getText(iColumnIndexOf));
                } while (sQLiteStatement.step());
            }
            Unit unit = Unit.INSTANCE;
            AutoCloseableKt.closeFinally(sQLiteStatementPrepare, null);
            return SetsKt.build(setCreateSetBuilder);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AutoCloseableKt.closeFinally(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }

    public static final Set<String> readFtsOptions(SQLiteConnection sQLiteConnection, String str) throws Exception {
        Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        Intrinsics.checkNotNullParameter(str, "");
        StringBuilder sb = new StringBuilder("SELECT * FROM sqlite_master WHERE `name` = '");
        sb.append(str);
        sb.append('\'');
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(sb.toString());
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            String text = sQLiteStatement.step() ? sQLiteStatement.getText(SQLiteStatementUtil.columnIndexOf(sQLiteStatement, "sql")) : "";
            AutoCloseableKt.closeFinally(sQLiteStatementPrepare, null);
            return parseFtsOptions(text);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AutoCloseableKt.closeFinally(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00de  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ec  */
    public static final Set<String> parseFtsOptions(String str) {
        Character ch;
        Character ch2;
        Intrinsics.checkNotNullParameter(str, "");
        String str2 = str;
        if (str2.length() == 0) {
            return SetsKt.emptySet();
        }
        String strSubstring = str.substring(StringsKt.indexOf$default((CharSequence) str2, '(', 0, false, 6, (Object) null) + 1, StringsKt.lastIndexOf$default((CharSequence) str2, ')', 0, false, 6, (Object) null));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque();
        String str3 = strSubstring;
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        while (i2 < str3.length()) {
            char cCharAt = str3.charAt(i2);
            if (cCharAt == '\"' || cCharAt == '\'') {
                if (arrayDeque.isEmpty()) {
                    arrayDeque.addFirst(Character.valueOf(cCharAt));
                } else {
                    ch = (Character) arrayDeque.firstOrNull();
                    if (ch != null && ch.charValue() == cCharAt) {
                        CollectionsKt.removeLast(arrayDeque);
                    }
                }
            } else if (cCharAt != ',') {
                if (cCharAt != '[') {
                    if (cCharAt != ']') {
                        if (cCharAt == '`') {
                            if (arrayDeque.isEmpty()) {
                                arrayDeque.addFirst(Character.valueOf(cCharAt));
                            } else {
                                ch = (Character) arrayDeque.firstOrNull();
                                if (ch != null) {
                                    CollectionsKt.removeLast(arrayDeque);
                                }
                            }
                        }
                    } else if (!arrayDeque.isEmpty() && (ch2 = (Character) arrayDeque.firstOrNull()) != null && ch2.charValue() == '[') {
                        CollectionsKt.removeLast(arrayDeque);
                    }
                } else if (arrayDeque.isEmpty()) {
                    arrayDeque.addFirst(Character.valueOf(cCharAt));
                }
            } else if (arrayDeque.isEmpty()) {
                String strSubstring2 = strSubstring.substring(i + 1, i3);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                String str4 = strSubstring2;
                int length = str4.length() - 1;
                int i4 = 0;
                boolean z = false;
                while (i4 <= length) {
                    boolean z2 = Intrinsics.compare((int) str4.charAt(!z ? i4 : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        }
                        length--;
                    } else if (z2) {
                        i4++;
                    } else {
                        z = true;
                    }
                }
                arrayList.add(str4.subSequence(i4, length + 1).toString());
                i = i3;
            }
            i2++;
            i3++;
        }
        String strSubstring3 = strSubstring.substring(i + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
        arrayList.add(StringsKt.trim((CharSequence) strSubstring3).toString());
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            String str5 = (String) obj;
            for (String str6 : FTS_OPTIONS) {
                if (StringsKt.startsWith$default(str5, str6, false, 2, (Object) null)) {
                    arrayList2.add(obj);
                    break;
                }
            }
        }
        return CollectionsKt.toSet(arrayList2);
    }

    public static final ViewInfo readViewInfo(SQLiteConnection sQLiteConnection, String str) throws Exception {
        ViewInfo viewInfo;
        Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        Intrinsics.checkNotNullParameter(str, "");
        StringBuilder sb = new StringBuilder("SELECT name, sql FROM sqlite_master WHERE type = 'view' AND name = '");
        sb.append(str);
        sb.append('\'');
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(sb.toString());
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            if (sQLiteStatement.step()) {
                viewInfo = new ViewInfo(sQLiteStatement.getText(0), sQLiteStatement.getText(1));
            } else {
                viewInfo = new ViewInfo(str, null);
            }
            AutoCloseableKt.closeFinally(sQLiteStatementPrepare, null);
            return viewInfo;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AutoCloseableKt.closeFinally(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }
}
