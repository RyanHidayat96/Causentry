package androidx.camera.video;

import android.location.Location;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_FileOutputOptions_FileOutputOptionsInternal extends FileOutputOptions.FileOutputOptionsInternal {
    private final long durationLimitMillis;
    private final File file;
    private final long fileSizeLimit;
    private final Location location;

    private AutoValue_FileOutputOptions_FileOutputOptionsInternal(long j, long j2, Location location, File file) {
        this.fileSizeLimit = j;
        this.durationLimitMillis = j2;
        this.location = location;
        this.file = file;
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

    @Override // androidx.camera.video.FileOutputOptions.FileOutputOptionsInternal
    final File getFile() {
        return this.file;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FileOutputOptionsInternal{fileSizeLimit=");
        sb.append(this.fileSizeLimit);
        sb.append(", durationLimitMillis=");
        sb.append(this.durationLimitMillis);
        sb.append(", location=");
        sb.append(this.location);
        sb.append(", file=");
        sb.append(this.file);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FileOutputOptions.FileOutputOptionsInternal)) {
            return false;
        }
        FileOutputOptions.FileOutputOptionsInternal fileOutputOptionsInternal = (FileOutputOptions.FileOutputOptionsInternal) obj;
        if (this.fileSizeLimit != fileOutputOptionsInternal.getFileSizeLimit() || this.durationLimitMillis != fileOutputOptionsInternal.getDurationLimitMillis()) {
            return false;
        }
        Location location = this.location;
        if (location == null) {
            if (fileOutputOptionsInternal.getLocation() != null) {
                return false;
            }
        } else if (!location.equals(fileOutputOptionsInternal.getLocation())) {
            return false;
        }
        return this.file.equals(fileOutputOptionsInternal.getFile());
    }

    public final int hashCode() {
        long j = this.fileSizeLimit;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.durationLimitMillis;
        int i2 = (int) ((j2 >>> 32) ^ j2);
        Location location = this.location;
        return ((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ (location == null ? 0 : location.hashCode())) * 1000003) ^ this.file.hashCode();
    }

    static final class Builder extends FileOutputOptions.FileOutputOptionsInternal.Builder {
        private Long durationLimitMillis;
        private File file;
        private Long fileSizeLimit;
        private Location location;

        Builder() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        public final FileOutputOptions.FileOutputOptionsInternal.Builder setFileSizeLimit(long j) {
            this.fileSizeLimit = Long.valueOf(j);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        public final FileOutputOptions.FileOutputOptionsInternal.Builder setDurationLimitMillis(long j) {
            this.durationLimitMillis = Long.valueOf(j);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        public final FileOutputOptions.FileOutputOptionsInternal.Builder setLocation(Location location) {
            this.location = location;
            return this;
        }

        @Override // androidx.camera.video.FileOutputOptions.FileOutputOptionsInternal.Builder
        final FileOutputOptions.FileOutputOptionsInternal.Builder setFile(File file) {
            if (file == null) {
                throw new NullPointerException("Null file");
            }
            this.file = file;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.camera.video.FileOutputOptions.FileOutputOptionsInternal.Builder, androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        public final FileOutputOptions.FileOutputOptionsInternal build() {
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
            if (this.file == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" file");
                string = sb2.toString();
            }
            if (!string.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(String.valueOf(string)));
            }
            return new AutoValue_FileOutputOptions_FileOutputOptionsInternal(this.fileSizeLimit.longValue(), this.durationLimitMillis.longValue(), this.location, this.file);
        }
    }
}
