package com.google.android.libraries.places.api.net;

import com.google.android.gms.tasks.CancellationToken;
import com.google.android.libraries.places.api.model.PhotoMetadata;
import com.google.android.libraries.places.internal.zzmg;
import defpackage.CameraStateRegistryCameraRegistration;
import defpackage.updateAndVerifyState;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FetchResolvedPhotoUriRequest implements zzmg {

    public static abstract class Builder {
        public FetchResolvedPhotoUriRequest build() {
            PhotoMetadata photoMetadataZzb = zzb();
            Integer maxWidth = getMaxWidth();
            Integer maxHeight = getMaxHeight();
            boolean z = true;
            if (!(photoMetadataZzb.zzb() != null)) {
                throw new IllegalArgumentException("To construct the FetchResolvedPhotoUriRequest, the provided PhotoMetadata must be fetched from Places API (New). You must first call initializeWithNewPlacesApiEnabled to initialize the PlaceClient and retrieve the PhotoMetadata. Once you have the PhotoMetadata, you must pass it into the FetchResolvedPhotoUriRequest.");
            }
            if (maxWidth != null) {
                if (!(maxWidth.intValue() > 0)) {
                    throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("Max width must not be < 1, but was: %s.", maxWidth));
                }
                updateAndVerifyState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(maxWidth.intValue() <= 4800, "Max width must not be > %s, but was: %s.", maxWidth);
            }
            if (maxHeight != null) {
                if (!(maxHeight.intValue() > 0)) {
                    throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("Max height must not be < 1, but was: %s.", maxHeight));
                }
                updateAndVerifyState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(maxHeight.intValue() <= 4800, "Max height must not be > %s, but was: %s.", maxHeight);
            }
            if (maxWidth == null && maxHeight == null) {
                int width = photoMetadataZzb.getWidth();
                if (width > 0) {
                    setMaxWidth(Integer.valueOf(Math.min(4800, width)));
                }
                int height = photoMetadataZzb.getHeight();
                if (height > 0) {
                    setMaxHeight(Integer.valueOf(Math.min(4800, height)));
                }
            }
            if (getMaxWidth() == null && getMaxHeight() == null) {
                z = false;
            }
            if (z) {
                return zzc();
            }
            throw new IllegalStateException("Must include max width or max height in the request.");
        }

        public abstract CancellationToken getCancellationToken();

        public abstract Integer getMaxHeight();

        public abstract Integer getMaxWidth();

        public abstract Builder setCancellationToken(CancellationToken cancellationToken);

        public abstract Builder setMaxHeight(Integer num);

        public abstract Builder setMaxWidth(Integer num);

        abstract PhotoMetadata zzb();

        abstract FetchResolvedPhotoUriRequest zzc();
    }

    public static Builder builder(PhotoMetadata photoMetadata) {
        zzg zzgVar = new zzg();
        zzgVar.zza(photoMetadata);
        return zzgVar;
    }

    public static FetchResolvedPhotoUriRequest newInstance(PhotoMetadata photoMetadata) {
        return builder(photoMetadata).build();
    }

    @Override // com.google.android.libraries.places.internal.zzmg
    public abstract CancellationToken getCancellationToken();

    public abstract Integer getMaxHeight();

    public abstract Integer getMaxWidth();

    public abstract PhotoMetadata getPhotoMetadata();
}
