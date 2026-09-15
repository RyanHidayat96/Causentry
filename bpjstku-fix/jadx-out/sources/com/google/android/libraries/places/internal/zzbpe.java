package com.google.android.libraries.places.internal;

import androidx.exifinterface.media.ExifInterface;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
final class zzbpe implements zzbik {
    @Override // com.google.android.libraries.places.internal.zzbik
    public final /* synthetic */ Object zza(String str) {
        if (!(str.length() > 0)) {
            throw new IllegalArgumentException("empty timeout");
        }
        if (!(str.length() <= 9)) {
            throw new IllegalArgumentException("bad timeout format");
        }
        long j = Long.parseLong(str.substring(0, str.length() - 1));
        char cCharAt = str.charAt(str.length() - 1);
        if (cCharAt == 'H') {
            return Long.valueOf(TimeUnit.HOURS.toNanos(j));
        }
        if (cCharAt == 'M') {
            return Long.valueOf(TimeUnit.MINUTES.toNanos(j));
        }
        if (cCharAt == 'S') {
            return Long.valueOf(TimeUnit.SECONDS.toNanos(j));
        }
        if (cCharAt == 'u') {
            return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(j));
        }
        if (cCharAt == 'm') {
            return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(j));
        }
        if (cCharAt == 'n') {
            return Long.valueOf(j);
        }
        throw new IllegalArgumentException(String.format("Invalid timeout unit: %s", Character.valueOf(cCharAt)));
    }

    @Override // com.google.android.libraries.places.internal.zzbik
    public final /* synthetic */ String zzb(Object obj) {
        Long l = (Long) obj;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (l.longValue() < 0) {
            throw new IllegalArgumentException("Timeout too small");
        }
        if (l.longValue() < 100000000) {
            new StringBuilder(String.valueOf(l).length() + 1);
            Objects.toString(l);
            return String.valueOf(l).concat("n");
        }
        if (l.longValue() < 100000000000L) {
            long micros = timeUnit.toMicros(l.longValue());
            StringBuilder sb = new StringBuilder(String.valueOf(micros).length() + 1);
            sb.append(micros);
            sb.append("u");
            return sb.toString();
        }
        if (l.longValue() < 100000000000000L) {
            long millis = timeUnit.toMillis(l.longValue());
            StringBuilder sb2 = new StringBuilder(String.valueOf(millis).length() + 1);
            sb2.append(millis);
            sb2.append("m");
            return sb2.toString();
        }
        if (l.longValue() < 100000000000000000L) {
            long seconds = timeUnit.toSeconds(l.longValue());
            StringBuilder sb3 = new StringBuilder(String.valueOf(seconds).length() + 1);
            sb3.append(seconds);
            sb3.append(ExifInterface.LATITUDE_SOUTH);
            return sb3.toString();
        }
        if (l.longValue() < 6000000000000000000L) {
            long minutes = timeUnit.toMinutes(l.longValue());
            StringBuilder sb4 = new StringBuilder(String.valueOf(minutes).length() + 1);
            sb4.append(minutes);
            sb4.append("M");
            return sb4.toString();
        }
        long hours = timeUnit.toHours(l.longValue());
        StringBuilder sb5 = new StringBuilder(String.valueOf(hours).length() + 1);
        sb5.append(hours);
        sb5.append("H");
        return sb5.toString();
    }

    zzbpe() {
    }
}
