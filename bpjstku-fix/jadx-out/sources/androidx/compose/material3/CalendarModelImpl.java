package androidx.compose.material3;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.Chronology;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.time.format.DecimalStyle;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 42\u00020\u0001:\u00014B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\n\u0010\n\u001a\u00060\u0002j\u0002`\u0003H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\u00102\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u0017\u0010\u001aJ\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0017\u0010\u001bJ\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\u0017\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u001f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0013H\u0017¢\u0006\u0004\b!\u0010\u001eJ\u000f\u0010\"\u001a\u00020\bH\u0017¢\u0006\u0004\b\"\u0010#J\u0013\u0010$\u001a\u00020\u0019*\u00020\rH\u0002¢\u0006\u0004\b$\u0010%J\u0013\u0010$\u001a\u00020\u0019*\u00020\u0016H\u0002¢\u0006\u0004\b$\u0010&R\u001a\u0010'\u001a\u00020\u00138\u0017X\u0097\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R,\u00100\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0/0.8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103"}, d2 = {"Landroidx/compose/material3/CalendarModelImpl;", "Landroidx/compose/material3/CalendarModel;", "Ljava/util/Locale;", "Landroidx/compose/material3/b;", "p0", "<init>", "(Ljava/util/Locale;)V", "", "", "p1", "p2", "formatWithPattern", "(JLjava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", "Landroidx/compose/material3/CalendarDate;", "getCanonicalDate", "(J)Landroidx/compose/material3/CalendarDate;", "Landroidx/compose/material3/DateInputFormat;", "getDateInputFormat", "(Ljava/util/Locale;)Landroidx/compose/material3/DateInputFormat;", "", "getDayOfWeek", "(Landroidx/compose/material3/CalendarDate;)I", "Landroidx/compose/material3/CalendarMonth;", "getMonth", "(Landroidx/compose/material3/CalendarDate;)Landroidx/compose/material3/CalendarMonth;", "Ljava/time/LocalDate;", "(Ljava/time/LocalDate;)Landroidx/compose/material3/CalendarMonth;", "(II)Landroidx/compose/material3/CalendarMonth;", "(J)Landroidx/compose/material3/CalendarMonth;", "minusMonths", "(Landroidx/compose/material3/CalendarMonth;I)Landroidx/compose/material3/CalendarMonth;", "parse", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/compose/material3/CalendarDate;", "plusMonths", "toString", "()Ljava/lang/String;", "toLocalDate", "(Landroidx/compose/material3/CalendarDate;)Ljava/time/LocalDate;", "(Landroidx/compose/material3/CalendarMonth;)Ljava/time/LocalDate;", "firstDayOfWeek", "I", "getFirstDayOfWeek", "()I", "getToday", "()Landroidx/compose/material3/CalendarDate;", "today", "", "Lkotlin/Pair;", "weekdayNames", "Ljava/util/List;", "getWeekdayNames", "()Ljava/util/List;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CalendarModelImpl extends CalendarModel {
    private final int firstDayOfWeek;
    private final List<Pair<String, String>> weekdayNames;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final ZoneId utcTimeZoneId = ZoneId.of("UTC");

    public CalendarModelImpl(Locale locale) {
        super(locale);
        this.firstDayOfWeek = WeekFields.of(locale).getFirstDayOfWeek().getValue();
        DayOfWeek[] dayOfWeekArrValues = DayOfWeek.values();
        ArrayList arrayList = new ArrayList(dayOfWeekArrValues.length);
        for (DayOfWeek dayOfWeek : dayOfWeekArrValues) {
            arrayList.add(TuplesKt.to(dayOfWeek.getDisplayName(TextStyle.FULL, locale), dayOfWeek.getDisplayName(TextStyle.NARROW, locale)));
        }
        this.weekdayNames = arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.time.ZonedDateTime] */
    @Override // androidx.compose.material3.CalendarModel
    public final CalendarDate getToday() {
        LocalDate localDateNow = LocalDate.now();
        return new CalendarDate(localDateNow.getYear(), localDateNow.getMonthValue(), localDateNow.getDayOfMonth(), localDateNow.atTime(LocalTime.MIDNIGHT).atZone(utcTimeZoneId).toInstant().toEpochMilli());
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
        return CalendarModelKt.datePatternAsInputFormat(DateTimeFormatterBuilder.getLocalizedDateTimePattern(FormatStyle.SHORT, null, Chronology.ofLocale(p0), p0));
    }

    @Override // androidx.compose.material3.CalendarModel
    public final CalendarDate getCanonicalDate(long p0) {
        LocalDate localDate = Instant.ofEpochMilli(p0).atZone(utcTimeZoneId).toLocalDate();
        return new CalendarDate(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth(), 1000 * localDate.atStartOfDay().toEpochSecond(ZoneOffset.UTC));
    }

    @Override // androidx.compose.material3.CalendarModel
    public final CalendarMonth getMonth(long p0) {
        return getMonth(Instant.ofEpochMilli(p0).atZone(utcTimeZoneId).withDayOfMonth(1).toLocalDate());
    }

    @Override // androidx.compose.material3.CalendarModel
    public final CalendarMonth getMonth(CalendarDate p0) {
        return getMonth(LocalDate.of(p0.getYear(), p0.getMonth(), 1));
    }

    @Override // androidx.compose.material3.CalendarModel
    public final CalendarMonth getMonth(int p0, int p1) {
        return getMonth(LocalDate.of(p0, p1, 1));
    }

    @Override // androidx.compose.material3.CalendarModel
    public final int getDayOfWeek(CalendarDate p0) {
        return toLocalDate(p0).getDayOfWeek().getValue();
    }

    @Override // androidx.compose.material3.CalendarModel
    public final CalendarMonth plusMonths(CalendarMonth p0, int p1) {
        return p1 <= 0 ? p0 : getMonth(toLocalDate(p0).plusMonths(p1));
    }

    @Override // androidx.compose.material3.CalendarModel
    public final CalendarMonth minusMonths(CalendarMonth p0, int p1) {
        return p1 <= 0 ? p0 : getMonth(toLocalDate(p0).minusMonths(p1));
    }

    @Override // androidx.compose.material3.CalendarModel
    public final String formatWithPattern(long p0, String p1, Locale p2) {
        return INSTANCE.formatWithPattern(p0, p1, p2, getFormatterCache$material3_release());
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [java.time.ZonedDateTime] */
    @Override // androidx.compose.material3.CalendarModel
    public final CalendarDate parse(String p0, String p1) {
        try {
            LocalDate localDate = LocalDate.parse(p0, DateTimeFormatter.ofPattern(p1));
            return new CalendarDate(localDate.getYear(), localDate.getMonth().getValue(), localDate.getDayOfMonth(), localDate.atTime(LocalTime.MIDNIGHT).atZone(utcTimeZoneId).toInstant().toEpochMilli());
        } catch (DateTimeParseException unused) {
            return null;
        }
    }

    public final String toString() {
        return "CalendarModel";
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\n\u001a\u00060\bj\u0002`\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\bj\u0002`\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/compose/material3/CalendarModelImpl$Companion;", "", "<init>", "()V", "", "p0", "", "p1", "Ljava/util/Locale;", "Landroidx/compose/material3/b;", "p2", "", "p3", "formatWithPattern", "(JLjava/lang/String;Ljava/util/Locale;Ljava/util/Map;)Ljava/lang/String;", "Ljava/time/format/DateTimeFormatter;", "getCachedDateTimeFormatter", "(Ljava/lang/String;Ljava/util/Locale;Ljava/util/Map;)Ljava/time/format/DateTimeFormatter;", "Ljava/time/ZoneId;", "utcTimeZoneId", "Ljava/time/ZoneId;", "getUtcTimeZoneId$material3_release", "()Ljava/time/ZoneId;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final String formatWithPattern(long p0, String p1, Locale p2, Map<String, Object> p3) {
            return Instant.ofEpochMilli(p0).atZone(getUtcTimeZoneId$material3_release()).toLocalDate().format(getCachedDateTimeFormatter(p1, p2, p3));
        }

        public final ZoneId getUtcTimeZoneId$material3_release() {
            return CalendarModelImpl.utcTimeZoneId;
        }

        private final DateTimeFormatter getCachedDateTimeFormatter(String p0, Locale p1, Map<String, Object> p2) {
            StringBuilder sb = new StringBuilder("P:");
            sb.append(p0);
            sb.append(p1.toLanguageTag());
            String string = sb.toString();
            Object objWithDecimalStyle = p2.get(string);
            if (objWithDecimalStyle == null) {
                objWithDecimalStyle = DateTimeFormatter.ofPattern(p0, p1).withDecimalStyle(DecimalStyle.of(p1));
                p2.put(string, objWithDecimalStyle);
            }
            Intrinsics.checkNotNull(objWithDecimalStyle, "");
            return (DateTimeFormatter) objWithDecimalStyle;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.time.ZonedDateTime] */
    private final CalendarMonth getMonth(LocalDate p0) {
        int value = p0.getDayOfWeek().getValue() - getFirstDayOfWeek();
        if (value < 0) {
            value += 7;
        }
        return new CalendarMonth(p0.getYear(), p0.getMonthValue(), p0.lengthOfMonth(), value, p0.atTime(LocalTime.MIDNIGHT).atZone(utcTimeZoneId).toInstant().toEpochMilli());
    }

    private final LocalDate toLocalDate(CalendarMonth calendarMonth) {
        return Instant.ofEpochMilli(calendarMonth.getStartUtcTimeMillis()).atZone(utcTimeZoneId).toLocalDate();
    }

    private final LocalDate toLocalDate(CalendarDate calendarDate) {
        return LocalDate.of(calendarDate.getYear(), calendarDate.getMonth(), calendarDate.getDayOfMonth());
    }
}
