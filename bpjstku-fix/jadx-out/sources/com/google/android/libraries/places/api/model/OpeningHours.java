package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OpeningHours implements Parcelable {

    public static abstract class Builder {
        public OpeningHours build() {
            OpeningHours openingHoursZzd = zzd();
            Iterator<String> it = openingHoursZzd.getWeekdayText().iterator();
            while (it.hasNext()) {
                if (!(!TextUtils.isEmpty(it.next()))) {
                    throw new IllegalArgumentException("WeekdayText must not contain null or empty values.");
                }
            }
            setPeriods(ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(openingHoursZzd.getPeriods()));
            setWeekdayText(ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(openingHoursZzd.getWeekdayText()));
            setSpecialDays(ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(openingHoursZzd.getSpecialDays()));
            return zzd();
        }

        public abstract HoursType getHoursType();

        public abstract List<Period> getPeriods();

        public abstract List<SpecialDay> getSpecialDays();

        public abstract List<String> getWeekdayText();

        public abstract Builder setHoursType(HoursType hoursType);

        public abstract Builder setPeriods(List<Period> list);

        public abstract Builder setSpecialDays(List<SpecialDay> list);

        public abstract Builder setWeekdayText(List<String> list);

        public abstract Builder zza(Boolean bool);

        public abstract Builder zzb(Instant instant);

        public abstract Builder zzc(Instant instant);

        abstract OpeningHours zzd();
    }

    public enum HoursType implements Parcelable {
        ACCESS,
        BREAKFAST,
        BRUNCH,
        DELIVERY,
        DINNER,
        DRIVE_THROUGH,
        HAPPY_HOUR,
        KITCHEN,
        LUNCH,
        ONLINE_SERVICE_HOURS,
        PICKUP,
        SENIOR_HOURS,
        TAKEOUT;

        public static final Parcelable.Creator<HoursType> CREATOR = new zzeq();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    public static Builder builder() {
        zzag zzagVar = new zzag();
        zzagVar.setPeriods(new ArrayList());
        zzagVar.setSpecialDays(new ArrayList());
        zzagVar.setWeekdayText(new ArrayList());
        return zzagVar;
    }

    public abstract HoursType getHoursType();

    public abstract List<Period> getPeriods();

    public abstract List<SpecialDay> getSpecialDays();

    public abstract List<String> getWeekdayText();

    public abstract Boolean zza();

    public abstract Instant zzb();

    public abstract Instant zzc();
}
