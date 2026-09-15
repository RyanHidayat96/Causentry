package androidx.compose.material3;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 72\u00020\u0001:\u00017B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\r\u001a\u00060\u0002j\u0002`\u0003H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\nH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\u00020\u00132\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u0019\u0010\u001cJ\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\u0019\u0010\u001dJ\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\nH\u0017¢\u0006\u0004\b\u0019\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\u001f\u0010 J!\u0010!\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u0007H\u0017¢\u0006\u0004\b#\u0010 J\u000f\u0010$\u001a\u00020\u000bH\u0017¢\u0006\u0004\b$\u0010%J\u001b\u0010'\u001a\u00020\u001b*\u00020\u00102\u0006\u0010\u0004\u001a\u00020&H\u0002¢\u0006\u0004\b'\u0010(J\u0013\u0010'\u001a\u00020\u001b*\u00020\u0018H\u0002¢\u0006\u0004\b'\u0010)R\u001a\u0010*\u001a\u00020\u00078\u0017X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0014\u00100\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R,\u00103\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b02018\u0017X\u0097\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106"}, d2 = {"Landroidx/compose/material3/LegacyCalendarModelImpl;", "Landroidx/compose/material3/CalendarModel;", "Ljava/util/Locale;", "Landroidx/compose/material3/b;", "p0", "<init>", "(Ljava/util/Locale;)V", "", "dayInISO8601", "(I)I", "", "", "p1", "p2", "formatWithPattern", "(JLjava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", "Landroidx/compose/material3/CalendarDate;", "getCanonicalDate", "(J)Landroidx/compose/material3/CalendarDate;", "Landroidx/compose/material3/DateInputFormat;", "getDateInputFormat", "(Ljava/util/Locale;)Landroidx/compose/material3/DateInputFormat;", "getDayOfWeek", "(Landroidx/compose/material3/CalendarDate;)I", "Landroidx/compose/material3/CalendarMonth;", "getMonth", "(Landroidx/compose/material3/CalendarDate;)Landroidx/compose/material3/CalendarMonth;", "Ljava/util/Calendar;", "(Ljava/util/Calendar;)Landroidx/compose/material3/CalendarMonth;", "(II)Landroidx/compose/material3/CalendarMonth;", "(J)Landroidx/compose/material3/CalendarMonth;", "minusMonths", "(Landroidx/compose/material3/CalendarMonth;I)Landroidx/compose/material3/CalendarMonth;", "parse", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/compose/material3/CalendarDate;", "plusMonths", "toString", "()Ljava/lang/String;", "Ljava/util/TimeZone;", "toCalendar", "(Landroidx/compose/material3/CalendarDate;Ljava/util/TimeZone;)Ljava/util/Calendar;", "(Landroidx/compose/material3/CalendarMonth;)Ljava/util/Calendar;", "firstDayOfWeek", "I", "getFirstDayOfWeek", "()I", "getToday", "()Landroidx/compose/material3/CalendarDate;", "today", "", "Lkotlin/Pair;", "weekdayNames", "Ljava/util/List;", "getWeekdayNames", "()Ljava/util/List;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LegacyCalendarModelImpl extends CalendarModel {
    private final int firstDayOfWeek;
    private final List<Pair<String, String>> weekdayNames;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final TimeZone utcTimeZone = TimeZone.getTimeZone("UTC");

    public LegacyCalendarModelImpl(Locale locale) {
        super(locale);
        this.firstDayOfWeek = dayInISO8601(Calendar.getInstance(locale).getFirstDayOfWeek());
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        String[] weekdays = new DateFormatSymbols(locale).getWeekdays();
        String[] shortWeekdays = new DateFormatSymbols(locale).getShortWeekdays();
        List listDrop = ArraysKt.drop(weekdays, 2);
        int size = listDrop.size();
        for (int i = 0; i < size; i++) {
            listCreateListBuilder.add(new Pair((String) listDrop.get(i), shortWeekdays[i + 2]));
        }
        listCreateListBuilder.add(new Pair(weekdays[1], shortWeekdays[1]));
        this.weekdayNames = CollectionsKt.build(listCreateListBuilder);
    }

    @Override // androidx.compose.material3.CalendarModel
    public final CalendarDate getToday() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        int i = calendar.get(15);
        int i2 = calendar.get(16);
        return new CalendarDate(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis() + ((long) (i + i2)));
    }

    @Override // androidx.compose.material3.CalendarModel
    public final int getFirstDayOfWeek() {
        return this.firstDayOfWeek;
    }

    @Override // androidx.compose.material3.CalendarModel
    public final List<Pair<String, String>> getWeekdayNames() {
        return this.weekdayNames;
    }

    @Override // androidx.compose.material3.CalendarModel
    public final DateInputFormat getDateInputFormat(Locale p0) {
        DateFormat dateInstance = DateFormat.getDateInstance(3, p0);
        Intrinsics.checkNotNull(dateInstance, "");
        return CalendarModelKt.datePatternAsInputFormat(((SimpleDateFormat) dateInstance).toPattern());
    }

    @Override // androidx.compose.material3.CalendarModel
    public final CalendarDate getCanonicalDate(long p0) {
        Calendar calendar = Calendar.getInstance(utcTimeZone);
        calendar.setTimeInMillis(p0);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return new CalendarDate(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis());
    }

    @Override // androidx.compose.material3.CalendarModel
    public final CalendarMonth getMonth(long p0) {
        Calendar calendar = Calendar.getInstance(utcTimeZone);
        calendar.setTimeInMillis(p0);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return getMonth(calendar);
    }

    @Override // androidx.compose.material3.CalendarModel
    public final CalendarMonth getMonth(CalendarDate p0) {
        return getMonth(p0.getYear(), p0.getMonth());
    }

    @Override // androidx.compose.material3.CalendarModel
    public final CalendarMonth getMonth(int p0, int p1) {
        Calendar calendar = Calendar.getInstance(utcTimeZone);
        calendar.clear();
        calendar.set(1, p0);
        calendar.set(2, p1 - 1);
        calendar.set(5, 1);
        return getMonth(calendar);
    }

    @Override // androidx.compose.material3.CalendarModel
    public final int getDayOfWeek(CalendarDate p0) {
        return dayInISO8601(toCalendar(p0, TimeZone.getDefault()).get(7));
    }

    @Override // androidx.compose.material3.CalendarModel
    public final CalendarMonth plusMonths(CalendarMonth p0, int p1) {
        if (p1 <= 0) {
            return p0;
        }
        Calendar calendar = toCalendar(p0);
        calendar.add(2, p1);
        return getMonth(calendar);
    }

    @Override // androidx.compose.material3.CalendarModel
    public final CalendarMonth minusMonths(CalendarMonth p0, int p1) {
        if (p1 <= 0) {
            return p0;
        }
        Calendar calendar = toCalendar(p0);
        calendar.add(2, -p1);
        return getMonth(calendar);
    }

    @Override // androidx.compose.material3.CalendarModel
    public final String formatWithPattern(long p0, String p1, Locale p2) {
        return INSTANCE.formatWithPattern(p0, p1, p2, getFormatterCache$material3_release());
    }

    @Override // androidx.compose.material3.CalendarModel
    public final CalendarDate parse(String p0, String p1) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(p1);
        TimeZone timeZone = utcTimeZone;
        simpleDateFormat.setTimeZone(timeZone);
        simpleDateFormat.setLenient(false);
        try {
            Date date = simpleDateFormat.parse(p0);
            if (date == null) {
                return null;
            }
            Calendar calendar = Calendar.getInstance(timeZone);
            calendar.setTime(date);
            return new CalendarDate(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis());
        } catch (ParseException unused) {
            return null;
        }
    }

    public final String toString() {
        return "LegacyCalendarModel";
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\n\u001a\u00060\bj\u0002`\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\bj\u0002`\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/compose/material3/LegacyCalendarModelImpl$Companion;", "", "<init>", "()V", "", "p0", "", "p1", "Ljava/util/Locale;", "Landroidx/compose/material3/b;", "p2", "", "p3", "formatWithPattern", "(JLjava/lang/String;Ljava/util/Locale;Ljava/util/Map;)Ljava/lang/String;", "Ljava/text/SimpleDateFormat;", "getCachedSimpleDateFormat", "(Ljava/lang/String;Ljava/util/Locale;Ljava/util/Map;)Ljava/text/SimpleDateFormat;", "Ljava/util/TimeZone;", "utcTimeZone", "Ljava/util/TimeZone;", "getUtcTimeZone$material3_release", "()Ljava/util/TimeZone;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final String formatWithPattern(long p0, String p1, Locale p2, Map<String, Object> p3) {
            SimpleDateFormat cachedSimpleDateFormat = getCachedSimpleDateFormat(p1, p2, p3);
            Calendar calendar = Calendar.getInstance(getUtcTimeZone$material3_release());
            calendar.setTimeInMillis(p0);
            return cachedSimpleDateFormat.format(Long.valueOf(calendar.getTimeInMillis()));
        }

        public final TimeZone getUtcTimeZone$material3_release() {
            return LegacyCalendarModelImpl.utcTimeZone;
        }

        private final SimpleDateFormat getCachedSimpleDateFormat(String p0, Locale p1, Map<String, Object> p2) {
            StringBuilder sb = new StringBuilder();
            sb.append(p0);
            sb.append(p1.toLanguageTag());
            String string = sb.toString();
            Object obj = p2.get(string);
            Object obj2 = obj;
            if (obj == null) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(p0, p1);
                simpleDateFormat.setTimeZone(LegacyCalendarModelImpl.INSTANCE.getUtcTimeZone$material3_release());
                p2.put(string, simpleDateFormat);
                obj2 = simpleDateFormat;
            }
            return (SimpleDateFormat) obj2;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final int dayInISO8601(int p0) {
        int i = (p0 + 6) % 7;
        if (i == 0) {
            return 7;
        }
        return i;
    }

    private final CalendarMonth getMonth(Calendar p0) {
        int iDayInISO8601 = dayInISO8601(p0.get(7)) - getFirstDayOfWeek();
        if (iDayInISO8601 < 0) {
            iDayInISO8601 += 7;
        }
        int i = p0.get(1);
        int i2 = p0.get(2);
        return new CalendarMonth(i, i2 + 1, p0.getActualMaximum(5), iDayInISO8601, p0.getTimeInMillis());
    }

    private final Calendar toCalendar(CalendarMonth calendarMonth) {
        Calendar calendar = Calendar.getInstance(utcTimeZone);
        calendar.setTimeInMillis(calendarMonth.getStartUtcTimeMillis());
        return calendar;
    }

    private final Calendar toCalendar(CalendarDate calendarDate, TimeZone timeZone) {
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.clear();
        calendar.set(1, calendarDate.getYear());
        calendar.set(2, calendarDate.getMonth() - 1);
        calendar.set(5, calendarDate.getDayOfMonth());
        return calendar;
    }
}
