package com.google.android.libraries.places.api.model;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Range;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzes {
    public static final /* synthetic */ int zza = 0;
    private static final ImmutableMap zzb = ImmutableMap.TuitionPaymentFragmentspecialinlinedviewModeldefault1().TuitionPaymentFragmentbindingInflater1(java.time.DayOfWeek.SUNDAY, DayOfWeek.SUNDAY).TuitionPaymentFragmentbindingInflater1(java.time.DayOfWeek.MONDAY, DayOfWeek.MONDAY).TuitionPaymentFragmentbindingInflater1(java.time.DayOfWeek.TUESDAY, DayOfWeek.TUESDAY).TuitionPaymentFragmentbindingInflater1(java.time.DayOfWeek.WEDNESDAY, DayOfWeek.WEDNESDAY).TuitionPaymentFragmentbindingInflater1(java.time.DayOfWeek.THURSDAY, DayOfWeek.THURSDAY).TuitionPaymentFragmentbindingInflater1(java.time.DayOfWeek.FRIDAY, DayOfWeek.FRIDAY).TuitionPaymentFragmentbindingInflater1(java.time.DayOfWeek.SATURDAY, DayOfWeek.SATURDAY).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    private static final LocalTime zzc = LocalTime.newInstance(23, 59);

    /* JADX WARN: Code duplicated, block: B:26:0x009f  */
    public static Boolean zza(Place place, long j) {
        ZoneOffset zoneOffsetZzf;
        Place.BusinessStatus businessStatus = place.getBusinessStatus();
        Integer utcOffsetMinutes = place.getUtcOffsetMinutes();
        Boolean bool = Boolean.FALSE;
        if (businessStatus != null && businessStatus != Place.BusinessStatus.OPERATIONAL) {
            return bool;
        }
        if (utcOffsetMinutes == null || (zoneOffsetZzf = zzf(utcOffsetMinutes.intValue())) == null) {
            return null;
        }
        OpeningHours currentOpeningHours = place.getCurrentOpeningHours();
        if (currentOpeningHours != null) {
            ArrayList arrayList = new ArrayList(currentOpeningHours.getPeriods());
            if (arrayList.isEmpty()) {
                currentOpeningHours = place.getOpeningHours();
            } else {
                try {
                    Collections.sort(arrayList, zzer.zza);
                    TimeOfWeek open = ((Period) arrayList.get(0)).getOpen();
                    TimeOfWeek timeOfWeek = open;
                    LocalDate date = open.getDate();
                    ArrayList arrayList2 = arrayList;
                    if (arrayList2.isEmpty()) {
                        throw new NoSuchElementException();
                    }
                    TimeOfWeek close = ((Period) arrayList2.get(arrayList2.size() - 1)).getClose();
                    TimeOfWeek timeOfWeek2 = close;
                    LocalDate date2 = close.getDate();
                    if (date == null || date2 == null) {
                        currentOpeningHours = place.getOpeningHours();
                    } else {
                        Range rangeTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Range.TuitionPaymentFragmentspecialinlinedviewModeldefault2(Long.valueOf(zzc(zoneOffsetZzf, date, 0, 0)), Long.valueOf(zzc(zoneOffsetZzf, date2, 23, 59)));
                        Long lValueOf = Long.valueOf(j);
                        if (!rangeTuitionPaymentFragmentspecialinlinedviewModeldefault2.lowerBound.b(lValueOf) || rangeTuitionPaymentFragmentspecialinlinedviewModeldefault2.upperBound.b(lValueOf)) {
                            currentOpeningHours = place.getOpeningHours();
                        }
                    }
                } catch (NullPointerException unused) {
                }
            }
        } else {
            currentOpeningHours = place.getOpeningHours();
        }
        if (currentOpeningHours == null) {
            return null;
        }
        List<Period> periods = currentOpeningHours.getPeriods();
        if (periods.isEmpty()) {
            return bool;
        }
        if (zzd(periods)) {
            return Boolean.TRUE;
        }
        for (Period period : periods) {
            if (period.getOpen() == null || period.getClose() == null) {
                return null;
            }
        }
        OffsetDateTime offsetDateTimeAtOffset = Instant.ofEpochMilli(j).atOffset(zoneOffsetZzf);
        DayOfWeek dayOfWeek = (DayOfWeek) zzb.get(offsetDateTimeAtOffset.getDayOfWeek());
        LocalTime localTimeNewInstance = LocalTime.newInstance(offsetDateTimeAtOffset.getHour(), offsetDateTimeAtOffset.getMinute());
        List<Range> list = (List) zze(periods).get(dayOfWeek);
        if (list == null) {
            return bool;
        }
        for (Range range : list) {
            if (range.lowerBound.b(localTimeNewInstance) && !range.upperBound.b(localTimeNewInstance)) {
                return Boolean.TRUE;
            }
        }
        return bool;
    }

    @Deprecated
    static Boolean zzb(Place place, long j) {
        ZoneOffset zoneOffsetZzf;
        Place.BusinessStatus businessStatus = place.getBusinessStatus();
        OpeningHours openingHours = place.getOpeningHours();
        Integer utcOffsetMinutes = place.getUtcOffsetMinutes();
        Boolean bool = Boolean.FALSE;
        if (businessStatus != null && businessStatus != Place.BusinessStatus.OPERATIONAL) {
            return bool;
        }
        if (openingHours == null || utcOffsetMinutes == null || (zoneOffsetZzf = zzf(utcOffsetMinutes.intValue())) == null) {
            return null;
        }
        List<Period> periods = openingHours.getPeriods();
        if (periods.isEmpty()) {
            return bool;
        }
        if (zzd(periods)) {
            return Boolean.TRUE;
        }
        for (Period period : periods) {
            if (period.getOpen() == null || period.getClose() == null) {
                return null;
            }
        }
        OffsetDateTime offsetDateTimeAtOffset = Instant.ofEpochMilli(j).atOffset(zoneOffsetZzf);
        DayOfWeek dayOfWeek = (DayOfWeek) zzb.get(offsetDateTimeAtOffset.getDayOfWeek());
        LocalTime localTimeNewInstance = LocalTime.newInstance(offsetDateTimeAtOffset.getHour(), offsetDateTimeAtOffset.getMinute());
        List<Range> list = (List) zze(periods).get(dayOfWeek);
        if (list == null) {
            return bool;
        }
        for (Range range : list) {
            if (range.lowerBound.b(localTimeNewInstance) && !range.upperBound.b(localTimeNewInstance)) {
                return Boolean.TRUE;
            }
        }
        return bool;
    }

    static long zzc(ZoneOffset zoneOffset, LocalDate localDate, int i, int i2) {
        return OffsetDateTime.of(java.time.LocalDate.of(localDate.getYear(), localDate.getMonth(), localDate.getDay()), java.time.LocalTime.of(i, i2), zoneOffset).toInstant().toEpochMilli();
    }

    private static boolean zzd(List list) {
        if (list.size() != 1) {
            return false;
        }
        Period period = (Period) list.get(0);
        TimeOfWeek open = period.getOpen();
        return period.getClose() == null && open != null && open.getDay() == DayOfWeek.SUNDAY && open.getTime().getHours() == 0 && open.getTime().getMinutes() == 0;
    }

    private static Map zze(List list) {
        EnumMap enumMap = new EnumMap(DayOfWeek.class);
        if (!list.isEmpty()) {
            Period periodBuild = (Period) list.get(0);
            int i = 0;
            while (periodBuild != null) {
                TimeOfWeek open = periodBuild.getOpen();
                TimeOfWeek close = periodBuild.getClose();
                if (open == null || close == null) {
                    i++;
                    periodBuild = i >= list.size() ? null : (Period) list.get(i);
                } else {
                    DayOfWeek day = open.getDay();
                    LocalTime time = open.getTime();
                    if (open.getDay() != close.getDay()) {
                        LocalTime localTime = zzc;
                        List list2 = (List) enumMap.getOrDefault(day, new ArrayList());
                        list2.add(Range.TuitionPaymentFragmentspecialinlinedviewModeldefault2(time, localTime));
                        enumMap.put(day, list2);
                        TimeOfWeek timeOfWeekNewInstance = TimeOfWeek.newInstance(DayOfWeek.values()[(day.ordinal() + 1) % 7], LocalTime.newInstance(0, 0));
                        TimeOfWeek close2 = periodBuild.getClose();
                        Period.Builder builder = Period.builder();
                        builder.setOpen(timeOfWeekNewInstance);
                        builder.setClose(close2);
                        periodBuild = builder.build();
                    } else {
                        i++;
                        LocalTime time2 = close.getTime();
                        List list3 = (List) enumMap.getOrDefault(day, new ArrayList());
                        list3.add(Range.TuitionPaymentFragmentbindingInflater1(time, time2));
                        enumMap.put(day, list3);
                        if (i < list.size()) {
                            periodBuild = (Period) list.get(i);
                        }
                    }
                }
            }
        }
        return enumMap;
    }

    private static ZoneOffset zzf(int i) {
        try {
            return ZoneOffset.ofTotalSeconds(i * 60);
        } catch (DateTimeException unused) {
            new Object[]{Integer.valueOf(i)};
            return null;
        }
    }
}
