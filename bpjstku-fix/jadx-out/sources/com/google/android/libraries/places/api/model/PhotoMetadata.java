package com.google.android.libraries.places.api.model;

import android.net.Uri;
import android.os.Parcelable;
import defpackage.CameraStateRegistryCameraRegistration;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PhotoMetadata implements Parcelable {

    public static abstract class Builder {
        public PhotoMetadata build() {
            PhotoMetadata photoMetadataZzd = zzd();
            int width = photoMetadataZzd.getWidth();
            if (!(width >= 0)) {
                throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("Width must not be < 0, but was: %s.", Integer.valueOf(width)));
            }
            int height = photoMetadataZzd.getHeight();
            if (!(height >= 0)) {
                throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("Height must not be < 0, but was: %s.", Integer.valueOf(height)));
            }
            if (!photoMetadataZzd.zza().isEmpty()) {
                return photoMetadataZzd;
            }
            throw new IllegalArgumentException("PhotoReference must not be empty.");
        }

        public abstract String getAttributions();

        public abstract AuthorAttributions getAuthorAttributions();

        public abstract int getHeight();

        public abstract int getWidth();

        public abstract Builder setAttributions(String str);

        public abstract Builder setAuthorAttributions(AuthorAttributions authorAttributions);

        public abstract Builder setHeight(int i);

        public abstract Builder setWidth(int i);

        public abstract Builder zzb(String str);

        public abstract Builder zzc(Uri uri);

        abstract PhotoMetadata zzd();
    }

    public static Builder builder(String str) {
        zzao zzaoVar = new zzao();
        zzaoVar.zza(str);
        zzaoVar.setWidth(0);
        zzaoVar.setHeight(0);
        zzaoVar.setAttributions("");
        return zzaoVar;
    }

    public abstract String getAttributions();

    public abstract AuthorAttributions getAuthorAttributions();

    public abstract int getHeight();

    public abstract int getWidth();

    public abstract String zza();

    public abstract String zzb();

    public abstract Uri zzc();
}
