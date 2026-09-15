package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0006\u001a\u00020\u00058\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0014\u0010\t\u001a\u00020\b8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"", "p0", "Landroidx/compose/material3/DateInputFormat;", "datePatternAsInputFormat", "(Ljava/lang/String;)Landroidx/compose/material3/DateInputFormat;", "", "DaysInWeek", "I", "", "MillisecondsIn24Hours", "J"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CalendarModelKt {
    public static final int DaysInWeek = 7;
    public static final long MillisecondsIn24Hours = 86400000;

    public static final DateInputFormat datePatternAsInputFormat(String str) {
        String strRemoveSuffix = StringsKt.removeSuffix(StringsKt.replace$default(new Regex("y{1,4}").replace(new Regex("M{1,2}").replace(new Regex("d{1,2}").replace(new Regex("[^dMy/\\-.]").replace(str, ""), "dd"), "MM"), "yyyy"), "My", "M/y", false, 4, (Object) null), (CharSequence) ".");
        MatchResult matchResultFind$default = Regex.find$default(new Regex("[/\\-.]"), strRemoveSuffix, 0, 2, null);
        Intrinsics.checkNotNull(matchResultFind$default);
        MatchGroup matchGroup = matchResultFind$default.getGroups().get(0);
        Intrinsics.checkNotNull(matchGroup);
        int first = matchGroup.getRange().getFirst();
        String strSubstring = strRemoveSuffix.substring(first, first + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return new DateInputFormat(strRemoveSuffix, strSubstring.charAt(0));
    }
}
