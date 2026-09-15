package androidx.compose.material3;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010%\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\n\u0010\n\u001a\u00060\u0002j\u0002`\u0003H'¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\f\b\u0002\u0010\n\u001a\u00060\u0002j\u0002`\u0003H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\f\b\u0002\u0010\n\u001a\u00060\u0002j\u0002`\u0003H\u0007¢\u0006\u0004\b\u000e\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0007H'¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0015\u001a\u00020\u00142\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H'¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\rH&¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\rH'¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\u0017H'¢\u0006\u0004\b\u001a\u0010\u001cJ\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0007H'¢\u0006\u0004\b\u001a\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0017H'¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010 \u001a\u0004\u0018\u00010\r2\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0017H'¢\u0006\u0004\b\"\u0010\u001fR\u0014\u0010%\u001a\u00020\u00178'X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R&\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010&8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001e\u0010+\u001a\u00060\u0002j\u0002`\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\r8'X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R&\u00106\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b03028'X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u00105"}, d2 = {"Landroidx/compose/material3/CalendarModel;", "", "Ljava/util/Locale;", "Landroidx/compose/material3/b;", "p0", "<init>", "(Ljava/util/Locale;)V", "", "", "p1", "p2", "formatWithPattern", "(JLjava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", "Landroidx/compose/material3/CalendarDate;", "formatWithSkeleton", "(Landroidx/compose/material3/CalendarDate;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", "Landroidx/compose/material3/CalendarMonth;", "(Landroidx/compose/material3/CalendarMonth;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", "getCanonicalDate", "(J)Landroidx/compose/material3/CalendarDate;", "Landroidx/compose/material3/DateInputFormat;", "getDateInputFormat", "(Ljava/util/Locale;)Landroidx/compose/material3/DateInputFormat;", "", "getDayOfWeek", "(Landroidx/compose/material3/CalendarDate;)I", "getMonth", "(Landroidx/compose/material3/CalendarDate;)Landroidx/compose/material3/CalendarMonth;", "(II)Landroidx/compose/material3/CalendarMonth;", "(J)Landroidx/compose/material3/CalendarMonth;", "minusMonths", "(Landroidx/compose/material3/CalendarMonth;I)Landroidx/compose/material3/CalendarMonth;", "parse", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/compose/material3/CalendarDate;", "plusMonths", "getFirstDayOfWeek", "()I", "firstDayOfWeek", "", "formatterCache", "Ljava/util/Map;", "getFormatterCache$material3_release", "()Ljava/util/Map;", "locale", "Ljava/util/Locale;", "getLocale", "()Ljava/util/Locale;", "getToday", "()Landroidx/compose/material3/CalendarDate;", "today", "", "Lkotlin/Pair;", "getWeekdayNames", "()Ljava/util/List;", "weekdayNames"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class CalendarModel {
    public static final int $stable = 8;
    private final Map<String, Object> formatterCache = new LinkedHashMap();
    private final Locale locale;

    public abstract String formatWithPattern(long p0, String p1, Locale p2);

    public abstract CalendarDate getCanonicalDate(long p0);

    public abstract DateInputFormat getDateInputFormat(Locale p0);

    public abstract int getDayOfWeek(CalendarDate p0);

    public abstract int getFirstDayOfWeek();

    public abstract CalendarMonth getMonth(int p0, int p1);

    public abstract CalendarMonth getMonth(long p0);

    public abstract CalendarMonth getMonth(CalendarDate p0);

    public abstract CalendarDate getToday();

    public abstract List<Pair<String, String>> getWeekdayNames();

    public abstract CalendarMonth minusMonths(CalendarMonth p0, int p1);

    public abstract CalendarDate parse(String p0, String p1);

    public abstract CalendarMonth plusMonths(CalendarMonth p0, int p1);

    public CalendarModel(Locale locale) {
        this.locale = locale;
    }

    public final Locale getLocale() {
        return this.locale;
    }

    public final Map<String, Object> getFormatterCache$material3_release() {
        return this.formatterCache;
    }

    public static /* synthetic */ DateInputFormat getDateInputFormat$default(CalendarModel calendarModel, Locale locale, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDateInputFormat");
        }
        if ((i & 1) != 0) {
            locale = calendarModel.locale;
        }
        return calendarModel.getDateInputFormat(locale);
    }

    public static /* synthetic */ String formatWithSkeleton$default(CalendarModel calendarModel, CalendarMonth calendarMonth, String str, Locale locale, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatWithSkeleton");
        }
        if ((i & 4) != 0) {
            locale = calendarModel.locale;
        }
        return calendarModel.formatWithSkeleton(calendarMonth, str, locale);
    }

    public final String formatWithSkeleton(CalendarMonth p0, String p1, Locale p2) {
        return CalendarModel_androidKt.formatWithSkeleton(p0.getStartUtcTimeMillis(), p1, p2, this.formatterCache);
    }

    public static /* synthetic */ String formatWithSkeleton$default(CalendarModel calendarModel, CalendarDate calendarDate, String str, Locale locale, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatWithSkeleton");
        }
        if ((i & 4) != 0) {
            locale = calendarModel.locale;
        }
        return calendarModel.formatWithSkeleton(calendarDate, str, locale);
    }

    public final String formatWithSkeleton(CalendarDate p0, String p1, Locale p2) {
        return CalendarModel_androidKt.formatWithSkeleton(p0.getUtcTimeMillis(), p1, p2, this.formatterCache);
    }
}
