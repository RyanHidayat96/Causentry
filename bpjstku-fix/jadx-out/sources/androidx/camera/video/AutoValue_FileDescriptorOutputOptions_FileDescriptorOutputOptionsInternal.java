package androidx.camera.video;

import android.location.Location;
import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal extends FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal {
    private final long durationLimitMillis;
    private final long fileSizeLimit;
    private final Location location;
    private final ParcelFileDescriptor parcelFileDescriptor;

    private AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal(long j, long j2, Location location, ParcelFileDescriptor parcelFileDescriptor) {
        this.fileSizeLimit = j;
        this.durationLimitMillis = j2;
        this.location = location;
        this.parcelFileDescriptor = parcelFileDescriptor;
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

    @Override // androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal
    final ParcelFileDescriptor getParcelFileDescriptor() {
        return this.parcelFileDescriptor;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FileDescriptorOutputOptionsInternal{fileSizeLimit=");
        sb.append(this.fileSizeLimit);
        sb.append(", durationLimitMillis=");
        sb.append(this.durationLimitMillis);
        sb.append(", location=");
        sb.append(this.location);
        sb.append(", parcelFileDescriptor=");
        sb.append(this.parcelFileDescriptor);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal)) {
            return false;
        }
        FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal fileDescriptorOutputOptionsInternal = (FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal) obj;
        if (this.fileSizeLimit != fileDescriptorOutputOptionsInternal.getFileSizeLimit() || this.durationLimitMillis != fileDescriptorOutputOptionsInternal.getDurationLimitMillis()) {
            return false;
        }
        Location location = this.location;
        if (location == null) {
            if (fileDescriptorOutputOptionsInternal.getLocation() != null) {
                return false;
            }
        } else if (!location.equals(fileDescriptorOutputOptionsInternal.getLocation())) {
            return false;
        }
        return this.parcelFileDescriptor.equals(fileDescriptorOutputOptionsInternal.getParcelFileDescriptor());
    }

    public final int hashCode() {
        long j = this.fileSizeLimit;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.durationLimitMillis;
        int i2 = (int) ((j2 >>> 32) ^ j2);
        Location location = this.location;
        return ((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ (location == null ? 0 : location.hashCode())) * 1000003) ^ this.parcelFileDescriptor.hashCode();
    }

    static final class Builder extends FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal.Builder {
        private Long durationLimitMillis;
        private Long fileSizeLimit;
        private Location location;
        private ParcelFileDescriptor parcelFileDescriptor;

        Builder() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        public final FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal.Builder setFileSizeLimit(long j) {
            this.fileSizeLimit = Long.valueOf(j);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        public final FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal.Builder setDurationLimitMillis(long j) {
            this.durationLimitMillis = Long.valueOf(j);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        public final FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal.Builder setLocation(Location location) {
            this.location = location;
            return this;
        }

        @Override // androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal.Builder
        final FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal.Builder setParcelFileDescriptor(ParcelFileDescriptor parcelFileDescriptor) {
            if (parcelFileDescriptor == null) {
                throw new NullPointerException("Null parcelFileDescriptor");
            }
            this.parcelFileDescriptor = parcelFileDescriptor;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal.Builder, androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        public final FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal build() {
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
            if (this.parcelFileDescriptor == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" parcelFileDescriptor");
                string = sb2.toString();
            }
            if (!string.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(String.valueOf(string)));
            }
            return new AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal(this.fileSizeLimit.longValue(), this.durationLimitMillis.longValue(), this.location, this.parcelFileDescriptor);
        }
    }
}
