package com.google.android.libraries.places.api.model;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.libraries.places.internal.zzud;
import com.google.android.libraries.places.internal.zzue;
import com.google.android.libraries.places.internal.zzug;
import com.google.android.libraries.places.internal.zzuh;
import defpackage.CameraStateRegistryCameraRegistration;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Review implements Parcelable {

    public static abstract class Builder {
        public Review build() {
            Double rating = zzd().getRating();
            boolean z = false;
            if (rating.doubleValue() >= 1.0d && rating.doubleValue() <= 5.0d) {
                z = true;
            }
            if (z) {
                return zzd();
            }
            throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("Rating must between 1.0 and 5.0 (inclusive), but was: %s.", rating));
        }

        public abstract String getOriginalText();

        public abstract String getOriginalTextLanguageCode();

        public abstract String getPublishTime();

        public abstract String getRelativePublishTimeDescription();

        public abstract String getText();

        public abstract String getTextLanguageCode();

        public abstract Builder setFlagContentUri(Uri uri);

        public abstract Builder setOriginalText(String str);

        public abstract Builder setOriginalTextLanguageCode(String str);

        public abstract Builder setPublishTime(String str);

        public abstract Builder setRelativePublishTimeDescription(String str);

        public abstract Builder setText(String str);

        public abstract Builder setTextLanguageCode(String str);

        abstract Builder zzb(AuthorAttribution authorAttribution);

        abstract Builder zzc(String str);

        abstract Review zzd();
    }

    public static Builder builder(Double d, AuthorAttribution authorAttribution) {
        String uri = authorAttribution.getUri();
        if (uri == null) {
            uri = "";
        }
        if (uri.startsWith("//")) {
            uri = "https:".concat(String.valueOf(uri));
        }
        zzue zzueVar = new zzue("a");
        zzueVar.zza(zzuh.zza(uri, zzug.zza));
        zzueVar.zzb(authorAttribution.getName());
        zzud zzudVarZzc = zzueVar.zzc();
        zzaz zzazVar = new zzaz();
        zzazVar.zza(d);
        zzazVar.zzb(authorAttribution);
        zzazVar.zzc(zzudVarZzc.zza());
        return zzazVar;
    }

    public abstract String getAttribution();

    public abstract AuthorAttribution getAuthorAttribution();

    public abstract Uri getFlagContentUri();

    public abstract String getOriginalText();

    public abstract String getOriginalTextLanguageCode();

    public abstract String getPublishTime();

    public abstract Double getRating();

    public abstract String getRelativePublishTimeDescription();

    public abstract String getText();

    public abstract String getTextLanguageCode();
}
