package androidx.room.util;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0000H\u0001¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/room/util/FtsTableInfo;", "", "p0", "", "equalsCommon", "(Landroidx/room/util/FtsTableInfo;Ljava/lang/Object;)Z", "", "hashCodeCommon", "(Landroidx/room/util/FtsTableInfo;)I", "", "toStringCommon", "(Landroidx/room/util/FtsTableInfo;)Ljava/lang/String;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FtsTableInfoKt {
    public static final boolean equalsCommon(FtsTableInfo ftsTableInfo, Object obj) {
        Intrinsics.checkNotNullParameter(ftsTableInfo, "");
        if (ftsTableInfo == obj) {
            return true;
        }
        if (!(obj instanceof FtsTableInfo)) {
            return false;
        }
        FtsTableInfo ftsTableInfo2 = (FtsTableInfo) obj;
        if (Intrinsics.areEqual(ftsTableInfo.name, ftsTableInfo2.name) && Intrinsics.areEqual(ftsTableInfo.columns, ftsTableInfo2.columns)) {
            return Intrinsics.areEqual(ftsTableInfo.options, ftsTableInfo2.options);
        }
        return false;
    }

    public static final int hashCodeCommon(FtsTableInfo ftsTableInfo) {
        Intrinsics.checkNotNullParameter(ftsTableInfo, "");
        return (((ftsTableInfo.name.hashCode() * 31) + ftsTableInfo.columns.hashCode()) * 31) + ftsTableInfo.options.hashCode();
    }

    public static final String toStringCommon(FtsTableInfo ftsTableInfo) {
        Intrinsics.checkNotNullParameter(ftsTableInfo, "");
        StringBuilder sb = new StringBuilder("\n            |FtsTableInfo {\n            |   name = '");
        sb.append(ftsTableInfo.name);
        sb.append("',\n            |   columns = {");
        sb.append(TableInfoKt.formatString(CollectionsKt.sorted(ftsTableInfo.columns)));
        sb.append("\n            |   options = {");
        sb.append(TableInfoKt.formatString(CollectionsKt.sorted(ftsTableInfo.options)));
        sb.append("\n            |}\n        ");
        return StringsKt.trimMargin$default(sb.toString(), null, 1, null);
    }
}
