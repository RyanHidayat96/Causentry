package com.google.android.libraries.places.widget.internal.placedetails;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.format.DateFormat;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.LocalTime;
import com.google.android.libraries.places.api.model.OpeningHours;
import com.google.android.libraries.places.api.model.Period;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.TimeOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zzad {
    public static final zzad zza = new zzad();

    public static final int zza(Place place, Context context, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(place, "");
        Intrinsics.checkNotNullParameter(context, "");
        int color = context.getResources().getColor(R.color.places_color_on_surface_variant, context.getTheme());
        int[] iArr = R.styleable.PlacesMaterialThemeAttrs;
        Intrinsics.checkNotNullExpressionValue(iArr, "");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, iArr);
        switch (zzac.zza[zzi(place).ordinal()]) {
            case 1:
            case 3:
                i2 = R.styleable.PlacesMaterialThemeAttrs_placesColorPositive;
                break;
            case 2:
            case 4:
            case 5:
                i2 = R.styleable.PlacesMaterialThemeAttrs_placesColorNegative;
                break;
            case 6:
                i2 = R.styleable.PlacesMaterialThemeAttrs_placesColorOnSurfaceVariant;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        int color2 = typedArrayObtainStyledAttributes.getColor(i2, color);
        typedArrayObtainStyledAttributes.recycle();
        return color2;
    }

    public static final String zzb(Place place, Instant instant, Context context) {
        Intrinsics.checkNotNullParameter(place, "");
        Intrinsics.checkNotNullParameter(context, "");
        OpeningHours currentOpeningHours = place.getCurrentOpeningHours();
        Instant instantZzc = currentOpeningHours != null ? currentOpeningHours.zzc() : null;
        OpeningHours currentOpeningHours2 = place.getCurrentOpeningHours();
        Instant instantZzb = currentOpeningHours2 != null ? currentOpeningHours2.zzb() : null;
        if (place.getUtcOffsetMinutes() == null || instant == null) {
            return null;
        }
        if (zzi(place) == zzab.OPEN_NOW && instantZzc != null) {
            Integer utcOffsetMinutes = place.getUtcOffsetMinutes();
            Intrinsics.checkNotNull(utcOffsetMinutes);
            String strZzg = zzg(instantZzc, utcOffsetMinutes.intValue(), instant, context);
            if (strZzg == null) {
                int i = R.string.place_details_next_close_time;
                Integer utcOffsetMinutes2 = place.getUtcOffsetMinutes();
                Intrinsics.checkNotNull(utcOffsetMinutes2);
                return context.getString(i, zzh(instantZzc, utcOffsetMinutes2.intValue(), context));
            }
            int i2 = R.string.place_details_next_close_time_and_day;
            Integer utcOffsetMinutes3 = place.getUtcOffsetMinutes();
            Intrinsics.checkNotNull(utcOffsetMinutes3);
            return context.getString(i2, zzh(instantZzc, utcOffsetMinutes3.intValue(), context), strZzg);
        }
        if (zzi(place) == zzab.CLOSED && instantZzb != null) {
            Integer utcOffsetMinutes4 = place.getUtcOffsetMinutes();
            Intrinsics.checkNotNull(utcOffsetMinutes4);
            String strZzg2 = zzg(instantZzb, utcOffsetMinutes4.intValue(), instant, context);
            if (strZzg2 == null) {
                int i3 = R.string.place_details_next_open_time;
                Integer utcOffsetMinutes5 = place.getUtcOffsetMinutes();
                Intrinsics.checkNotNull(utcOffsetMinutes5);
                return context.getString(i3, zzh(instantZzb, utcOffsetMinutes5.intValue(), context));
            }
            int i4 = R.string.place_details_next_open_time_and_day;
            Integer utcOffsetMinutes6 = place.getUtcOffsetMinutes();
            Intrinsics.checkNotNull(utcOffsetMinutes6);
            return context.getString(i4, zzh(instantZzb, utcOffsetMinutes6.intValue(), context), strZzg2);
        }
        return null;
    }

    public static final String zzc(Place place, Context context) {
        Intrinsics.checkNotNullParameter(place, "");
        Intrinsics.checkNotNullParameter(context, "");
        int i = zzac.zza[zzi(place).ordinal()];
        if (i == 1) {
            return context.getString(R.string.place_details_opening_status_open);
        }
        if (i == 2) {
            return context.getString(R.string.place_details_opening_status_closed);
        }
        if (i == 3) {
            return context.getString(R.string.place_details_opening_status_open_24_hours);
        }
        if (i == 4) {
            return context.getString(R.string.place_details_opening_status_open_temporarily_closed);
        }
        if (i != 5) {
            return null;
        }
        return context.getString(R.string.place_details_opening_status_open_permanently_closed);
    }

    private static final boolean zzd(Place place) {
        TimeOfWeek close;
        LocalTime time;
        TimeOfWeek close2;
        LocalTime time2;
        TimeOfWeek open;
        LocalTime time3;
        TimeOfWeek open2;
        LocalTime time4;
        OpeningHours currentOpeningHours = place.getCurrentOpeningHours();
        List<Period> periods = currentOpeningHours != null ? currentOpeningHours.getPeriods() : null;
        Period period = periods != null ? (Period) CollectionsKt.singleOrNull((List) periods) : null;
        return (period != null && (open = period.getOpen()) != null && (time3 = open.getTime()) != null && time3.getHours() == 0 && (open2 = period.getOpen()) != null && (time4 = open2.getTime()) != null && time4.getMinutes() == 0) && ((period != null ? period.getClose() : null) == null || ((close = period.getClose()) != null && (time = close.getTime()) != null && time.getHours() == 23 && (close2 = period.getClose()) != null && (time2 = close2.getTime()) != null && time2.getMinutes() == 59));
    }

    private static final boolean zze(OffsetDateTime offsetDateTime) {
        return offsetDateTime.getHour() == 0 && offsetDateTime.getMinute() == 0;
    }

    private static final OffsetDateTime zzf(Instant instant, int i) {
        ZoneOffset zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds(i * 60);
        Intrinsics.checkNotNullExpressionValue(zoneOffsetOfTotalSeconds, "");
        OffsetDateTime offsetDateTimeAtOffset = instant.atOffset(zoneOffsetOfTotalSeconds);
        Intrinsics.checkNotNullExpressionValue(offsetDateTimeAtOffset, "");
        return offsetDateTimeAtOffset;
    }

    private static final String zzg(Instant instant, int i, Instant instant2, Context context) {
        OffsetDateTime offsetDateTimeZzf = zzf(instant, i);
        OffsetDateTime offsetDateTimeZzf2 = zzf(instant2, i);
        long hours = Duration.between(instant, instant2).abs().toHours();
        if (offsetDateTimeZzf.getYear() == offsetDateTimeZzf2.getYear() && offsetDateTimeZzf.getDayOfYear() == offsetDateTimeZzf2.getDayOfYear()) {
            return null;
        }
        if (zze(offsetDateTimeZzf) && hours < 24) {
            return null;
        }
        switch (zzac.zzb[offsetDateTimeZzf.getDayOfWeek().ordinal()]) {
            case 1:
                return context.getString(R.string.place_details_day_of_week_monday);
            case 2:
                return context.getString(R.string.place_details_day_of_week_tuesday);
            case 3:
                return context.getString(R.string.place_details_day_of_week_wednesday);
            case 4:
                return context.getString(R.string.place_details_day_of_week_thursday);
            case 5:
                return context.getString(R.string.place_details_day_of_week_friday);
            case 6:
                return context.getString(R.string.place_details_day_of_week_saturday);
            case 7:
                return context.getString(R.string.place_details_day_of_week_sunday);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final String zzh(Instant instant, int i, Context context) {
        OffsetDateTime offsetDateTimeZzf = zzf(instant, i);
        Locale locale = context.getResources().getConfiguration().locale;
        if (zze(offsetDateTimeZzf)) {
            String string = context.getString(R.string.place_details_time_midnight);
            Intrinsics.checkNotNull(string);
            return string;
        }
        if (offsetDateTimeZzf.getHour() == 12 && offsetDateTimeZzf.getMinute() == 0) {
            String string2 = context.getString(R.string.place_details_time_noon);
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        if (DateFormat.is24HourFormat(context)) {
            String str = offsetDateTimeZzf.format(DateTimeFormatter.ofPattern(DateFormat.getBestDateTimePattern(locale, "H:mm")));
            Intrinsics.checkNotNull(str);
            return str;
        }
        String str2 = offsetDateTimeZzf.format(DateTimeFormatter.ofPattern(offsetDateTimeZzf.getMinute() == 0 ? DateFormat.getBestDateTimePattern(locale, "h a") : DateFormat.getBestDateTimePattern(locale, "h:mm a")));
        Intrinsics.checkNotNull(str2);
        return str2;
    }

    private static final zzab zzi(Place place) {
        if (place.getBusinessStatus() == Place.BusinessStatus.CLOSED_PERMANENTLY) {
            return zzab.PERMANENTLY_CLOSED;
        }
        if (place.getBusinessStatus() == Place.BusinessStatus.CLOSED_TEMPORARILY) {
            return zzab.TEMPORARILY_CLOSED;
        }
        if (zzd(place)) {
            return zzab.OPEN_24_HOURS;
        }
        OpeningHours currentOpeningHours = place.getCurrentOpeningHours();
        if (currentOpeningHours != null && Intrinsics.areEqual(currentOpeningHours.zza(), Boolean.TRUE)) {
            return zzab.OPEN_NOW;
        }
        OpeningHours currentOpeningHours2 = place.getCurrentOpeningHours();
        return (currentOpeningHours2 == null || !Intrinsics.areEqual(currentOpeningHours2.zza(), Boolean.FALSE)) ? zzab.UNKNOWN : zzab.CLOSED;
    }

    private zzad() {
    }
}
