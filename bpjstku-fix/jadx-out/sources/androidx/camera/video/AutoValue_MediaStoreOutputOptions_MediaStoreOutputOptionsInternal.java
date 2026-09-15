package androidx.camera.video;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.location.Location;
import android.net.Uri;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal extends MediaStoreOutputOptions.MediaStoreOutputOptionsInternal {
    private final Uri collectionUri;
    private final ContentResolver contentResolver;
    private final ContentValues contentValues;
    private final long durationLimitMillis;
    private final long fileSizeLimit;
    private final Location location;

    private AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal(long j, long j2, Location location, ContentResolver contentResolver, Uri uri, ContentValues contentValues) {
        this.fileSizeLimit = j;
        this.durationLimitMillis = j2;
        this.location = location;
        this.contentResolver = contentResolver;
        this.collectionUri = uri;
        this.contentValues = contentValues;
    }

    @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal
    final long getFileSizeLimit() {
        return this.fileSizeLimit;
    }

    @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal
    final long getDurationLimitMillis() {
        return this.durationLimitMillis;
    }

    @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal
    final Location getLocation() {
        return this.location;
    }

    @Override // androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal
    final ContentResolver getContentResolver() {
        return this.contentResolver;
    }

    @Override // androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal
    final Uri getCollectionUri() {
        return this.collectionUri;
    }

    @Override // androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal
    final ContentValues getContentValues() {
        return this.contentValues;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaStoreOutputOptionsInternal{fileSizeLimit=");
        sb.append(this.fileSizeLimit);
        sb.append(", durationLimitMillis=");
        sb.append(this.durationLimitMillis);
        sb.append(", location=");
        sb.append(this.location);
        sb.append(", contentResolver=");
        sb.append(this.contentResolver);
        sb.append(", collectionUri=");
        sb.append(this.collectionUri);
        sb.append(", contentValues=");
        sb.append(this.contentValues);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MediaStoreOutputOptions.MediaStoreOutputOptionsInternal)) {
            return false;
        }
        MediaStoreOutputOptions.MediaStoreOutputOptionsInternal mediaStoreOutputOptionsInternal = (MediaStoreOutputOptions.MediaStoreOutputOptionsInternal) obj;
        if (this.fileSizeLimit != mediaStoreOutputOptionsInternal.getFileSizeLimit() || this.durationLimitMillis != mediaStoreOutputOptionsInternal.getDurationLimitMillis()) {
            return false;
        }
        Location location = this.location;
        if (location == null) {
            if (mediaStoreOutputOptionsInternal.getLocation() != null) {
                return false;
            }
        } else if (!location.equals(mediaStoreOutputOptionsInternal.getLocation())) {
            return false;
        }
        return this.contentResolver.equals(mediaStoreOutputOptionsInternal.getContentResolver()) && this.collectionUri.equals(mediaStoreOutputOptionsInternal.getCollectionUri()) && this.contentValues.equals(mediaStoreOutputOptionsInternal.getContentValues());
    }

    public final int hashCode() {
        long j = this.fileSizeLimit;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.durationLimitMillis;
        int i2 = (int) ((j2 >>> 32) ^ j2);
        Location location = this.location;
        return ((((((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ (location == null ? 0 : location.hashCode())) * 1000003) ^ this.contentResolver.hashCode()) * 1000003) ^ this.collectionUri.hashCode()) * 1000003) ^ this.contentValues.hashCode();
    }

    static final class Builder extends MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder {
        private Uri collectionUri;
        private ContentResolver contentResolver;
        private ContentValues contentValues;
        private Long durationLimitMillis;
        private Long fileSizeLimit;
        private Location location;

        Builder() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        public final MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder setFileSizeLimit(long j) {
            this.fileSizeLimit = Long.valueOf(j);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        public final MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder setDurationLimitMillis(long j) {
            this.durationLimitMillis = Long.valueOf(j);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        public final MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder setLocation(Location location) {
            this.location = location;
            return this;
        }

        @Override // androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder
        final MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder setContentResolver(ContentResolver contentResolver) {
            if (contentResolver == null) {
                throw new NullPointerException("Null contentResolver");
            }
            this.contentResolver = contentResolver;
            return this;
        }

        @Override // androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder
        final MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder setCollectionUri(Uri uri) {
            if (uri == null) {
                throw new NullPointerException("Null collectionUri");
            }
            this.collectionUri = uri;
            return this;
        }

        @Override // androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder
        final MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder setContentValues(ContentValues contentValues) {
            if (contentValues == null) {
                throw new NullPointerException("Null contentValues");
            }
            this.contentValues = contentValues;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder, androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        public final MediaStoreOutputOptions.MediaStoreOutputOptionsInternal build() {
            String string;
            if (this.fileSizeLimit != null) {
                string = "";
            } else {
                string = " fileSizeLimit";
            }
            if (this.durationLimitMillis == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(" durationLimitMillis");
                string = sb.toString();
            }
            if (this.contentResolver == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" contentResolver");
                string = sb2.toString();
            }
            if (this.collectionUri == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(string);
                sb3.append(" collectionUri");
                string = sb3.toString();
            }
            if (this.contentValues == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(string);
                sb4.append(" contentValues");
                string = sb4.toString();
            }
            if (!string.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(String.valueOf(string)));
            }
            return new AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal(this.fileSizeLimit.longValue(), this.durationLimitMillis.longValue(), this.location, this.contentResolver, this.collectionUri, this.contentValues);
        }
    }
}
