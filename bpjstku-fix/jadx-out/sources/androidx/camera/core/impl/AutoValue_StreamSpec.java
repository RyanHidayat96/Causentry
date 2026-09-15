package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.DynamicRange;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_StreamSpec extends StreamSpec {
    private final DynamicRange dynamicRange;
    private final Range<Integer> expectedFrameRateRange;
    private final Config implementationOptions;
    private final Size resolution;
    private final boolean zslDisabled;

    private AutoValue_StreamSpec(Size size, DynamicRange dynamicRange, Range<Integer> range, Config config, boolean z) {
        this.resolution = size;
        this.dynamicRange = dynamicRange;
        this.expectedFrameRateRange = range;
        this.implementationOptions = config;
        this.zslDisabled = z;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public final Size getResolution() {
        return this.resolution;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public final DynamicRange getDynamicRange() {
        return this.dynamicRange;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public final Range<Integer> getExpectedFrameRateRange() {
        return this.expectedFrameRateRange;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public final Config getImplementationOptions() {
        return this.implementationOptions;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public final boolean getZslDisabled() {
        return this.zslDisabled;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamSpec{resolution=");
        sb.append(this.resolution);
        sb.append(", dynamicRange=");
        sb.append(this.dynamicRange);
        sb.append(", expectedFrameRateRange=");
        sb.append(this.expectedFrameRateRange);
        sb.append(", implementationOptions=");
        sb.append(this.implementationOptions);
        sb.append(", zslDisabled=");
        sb.append(this.zslDisabled);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StreamSpec)) {
            return false;
        }
        StreamSpec streamSpec = (StreamSpec) obj;
        if (!this.resolution.equals(streamSpec.getResolution()) || !this.dynamicRange.equals(streamSpec.getDynamicRange()) || !this.expectedFrameRateRange.equals(streamSpec.getExpectedFrameRateRange())) {
            return false;
        }
        Config config = this.implementationOptions;
        if (config == null) {
            if (streamSpec.getImplementationOptions() != null) {
                return false;
            }
        } else if (!config.equals(streamSpec.getImplementationOptions())) {
            return false;
        }
        return this.zslDisabled == streamSpec.getZslDisabled();
    }

    public final int hashCode() {
        int iHashCode = this.resolution.hashCode();
        int iHashCode2 = this.dynamicRange.hashCode();
        int iHashCode3 = this.expectedFrameRateRange.hashCode();
        Config config = this.implementationOptions;
        return ((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ (config == null ? 0 : config.hashCode())) * 1000003) ^ (this.zslDisabled ? 1231 : 1237);
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public final StreamSpec.Builder toBuilder() {
        return new Builder(this);
    }

    static final class Builder extends StreamSpec.Builder {
        private DynamicRange dynamicRange;
        private Range<Integer> expectedFrameRateRange;
        private Config implementationOptions;
        private Size resolution;
        private Boolean zslDisabled;

        Builder() {
        }

        private Builder(StreamSpec streamSpec) {
            this.resolution = streamSpec.getResolution();
            this.dynamicRange = streamSpec.getDynamicRange();
            this.expectedFrameRateRange = streamSpec.getExpectedFrameRateRange();
            this.implementationOptions = streamSpec.getImplementationOptions();
            this.zslDisabled = Boolean.valueOf(streamSpec.getZslDisabled());
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public final StreamSpec.Builder setResolution(Size size) {
            if (size == null) {
                throw new NullPointerException("Null resolution");
            }
            this.resolution = size;
            return this;
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public final StreamSpec.Builder setDynamicRange(DynamicRange dynamicRange) {
            if (dynamicRange == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            this.dynamicRange = dynamicRange;
            return this;
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public final StreamSpec.Builder setExpectedFrameRateRange(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null expectedFrameRateRange");
            }
            this.expectedFrameRateRange = range;
            return this;
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public final StreamSpec.Builder setImplementationOptions(Config config) {
            this.implementationOptions = config;
            return this;
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public final StreamSpec.Builder setZslDisabled(boolean z) {
            this.zslDisabled = Boolean.valueOf(z);
            return this;
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public final StreamSpec build() {
            String string;
            if (this.resolution != null) {
                string = "";
            } else {
                string = " resolution";
            }
            if (this.dynamicRange == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(" dynamicRange");
                string = sb.toString();
            }
            if (this.expectedFrameRateRange == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" expectedFrameRateRange");
                string = sb2.toString();
            }
            if (this.zslDisabled == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(string);
                sb3.append(" zslDisabled");
                string = sb3.toString();
            }
            if (!string.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(String.valueOf(string)));
            }
            return new AutoValue_StreamSpec(this.resolution, this.dynamicRange, this.expectedFrameRateRange, this.implementationOptions, this.zslDisabled.booleanValue());
        }
    }
}
