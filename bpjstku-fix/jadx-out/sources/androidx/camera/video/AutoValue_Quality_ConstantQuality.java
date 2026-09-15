package androidx.camera.video;

import android.util.Size;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_Quality_ConstantQuality extends Quality.ConstantQuality {
    private final String name;
    private final List<Size> typicalSizes;
    private final int value;

    AutoValue_Quality_ConstantQuality(int i, String str, List<Size> list) {
        this.value = i;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.name = str;
        if (list == null) {
            throw new NullPointerException("Null typicalSizes");
        }
        this.typicalSizes = list;
    }

    @Override // androidx.camera.video.Quality.ConstantQuality
    public final int getValue() {
        return this.value;
    }

    @Override // androidx.camera.video.Quality.ConstantQuality
    public final String getName() {
        return this.name;
    }

    @Override // androidx.camera.video.Quality.ConstantQuality
    public final List<Size> getTypicalSizes() {
        return this.typicalSizes;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConstantQuality{value=");
        sb.append(this.value);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", typicalSizes=");
        sb.append(this.typicalSizes);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Quality.ConstantQuality)) {
            return false;
        }
        Quality.ConstantQuality constantQuality = (Quality.ConstantQuality) obj;
        return this.value == constantQuality.getValue() && this.name.equals(constantQuality.getName()) && this.typicalSizes.equals(constantQuality.getTypicalSizes());
    }

    public final int hashCode() {
        return ((((this.value ^ 1000003) * 1000003) ^ this.name.hashCode()) * 1000003) ^ this.typicalSizes.hashCode();
    }
}
