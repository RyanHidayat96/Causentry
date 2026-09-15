package androidx.compose.material3;

import android.os.Build;
import android.text.format.DateFormat;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a?\u0010\r\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\n\u0010\t\u001a\u00060\u0000j\u0002`\u00012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Ljava/util/Locale;", "Landroidx/compose/material3/b;", "p0", "Landroidx/compose/material3/CalendarModel;", "createCalendarModel", "(Ljava/util/Locale;)Landroidx/compose/material3/CalendarModel;", "", "", "p1", "p2", "", "", "p3", "formatWithSkeleton", "(JLjava/lang/String;Ljava/util/Locale;Ljava/util/Map;)Ljava/lang/String;"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CalendarModel_androidKt {
    public static final CalendarModel createCalendarModel(Locale locale) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new CalendarModelImpl(locale);
        }
        return new LegacyCalendarModelImpl(locale);
    }

    public static final String formatWithSkeleton(long j, String str, Locale locale, Map<String, Object> map) {
        StringBuilder sb = new StringBuilder("S:");
        sb.append(str);
        sb.append(locale.toLanguageTag());
        String string = sb.toString();
        Object bestDateTimePattern = map.get(string);
        if (bestDateTimePattern == null) {
            bestDateTimePattern = DateFormat.getBestDateTimePattern(locale, str);
            map.put(string, bestDateTimePattern);
        }
        String string2 = bestDateTimePattern.toString();
        if (Build.VERSION.SDK_INT >= 26) {
            return CalendarModelImpl.INSTANCE.formatWithPattern(j, string2, locale, map);
        }
        return LegacyCalendarModelImpl.INSTANCE.formatWithPattern(j, string2, locale, map);
    }
}
