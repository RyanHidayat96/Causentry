package androidx.room.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0000H\u0001¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/room/util/ViewInfo;", "", "p0", "", "equalsCommon", "(Landroidx/room/util/ViewInfo;Ljava/lang/Object;)Z", "", "hashCodeCommon", "(Landroidx/room/util/ViewInfo;)I", "", "toStringCommon", "(Landroidx/room/util/ViewInfo;)Ljava/lang/String;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ViewInfoKt {
    public static final boolean equalsCommon(ViewInfo viewInfo, Object obj) {
        Intrinsics.checkNotNullParameter(viewInfo, "");
        if (viewInfo == obj) {
            return true;
        }
        if (!(obj instanceof ViewInfo)) {
            return false;
        }
        ViewInfo viewInfo2 = (ViewInfo) obj;
        return Intrinsics.areEqual(viewInfo.name, viewInfo2.name) && (viewInfo.sql == null ? viewInfo2.sql == null : Intrinsics.areEqual(viewInfo.sql, viewInfo2.sql));
    }

    public static final int hashCodeCommon(ViewInfo viewInfo) {
        Intrinsics.checkNotNullParameter(viewInfo, "");
        int iHashCode = viewInfo.name.hashCode();
        String str = viewInfo.sql;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    public static final String toStringCommon(ViewInfo viewInfo) {
        Intrinsics.checkNotNullParameter(viewInfo, "");
        StringBuilder sb = new StringBuilder("\n            |ViewInfo {\n            |   name = '");
        sb.append(viewInfo.name);
        sb.append("',\n            |   sql = '");
        sb.append(viewInfo.sql);
        sb.append("'\n            |}\n        ");
        return StringsKt.trimMargin$default(sb.toString(), null, 1, null);
    }
}
