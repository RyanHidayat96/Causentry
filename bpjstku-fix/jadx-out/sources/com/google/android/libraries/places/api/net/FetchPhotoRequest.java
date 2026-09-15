package com.google.android.libraries.places.api.net;

import com.google.android.gms.tasks.CancellationToken;
import com.google.android.libraries.places.api.model.PhotoMetadata;
import com.google.android.libraries.places.internal.zzmg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FetchPhotoRequest implements zzmg {

    public static abstract class Builder {
        public FetchPhotoRequest build() {
            PhotoMetadata photoMetadataZzb = zzb();
            if (getMaxWidth() == null && getMaxHeight() == null) {
                int width = photoMetadataZzb.getWidth();
                if (width > 0) {
                    setMaxWidth(Integer.valueOf(width));
                }
                int height = photoMetadataZzb.getHeight();
                if (height > 0) {
                    setMaxHeight(Integer.valueOf(height));
                }
            }
            return zzc();
        }

        public abstract CancellationToken getCancellationToken();

        public abstract Integer getMaxHeight();

        public abstract Integer getMaxWidth();

        public abstract Builder setCancellationToken(CancellationToken cancellationToken);

        public abstract Builder setMaxHeight(Integer num);

        public abstract Builder setMaxWidth(Integer num);

        abstract PhotoMetadata zzb();

        abstract FetchPhotoRequest zzc();
    }

    public static Builder builder(PhotoMetadata photoMetadata) {
        zza zzaVar = new zza();
        zzaVar.zza(photoMetadata);
        return zzaVar;
    }

    public static FetchPhotoRequest newInstance(PhotoMetadata photoMetadata) {
        return builder(photoMetadata).build();
    }

    @Override // com.google.android.libraries.places.internal.zzmg
    public abstract CancellationToken getCancellationToken();

    public abstract Integer getMaxHeight();

    public abstract Integer getMaxWidth();

    public abstract PhotoMetadata getPhotoMetadata();
}
