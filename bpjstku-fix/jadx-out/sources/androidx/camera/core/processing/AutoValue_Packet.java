package androidx.camera.core.processing;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.utils.Exif;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_Packet<T> extends Packet<T> {
    private final CameraCaptureResult cameraCaptureResult;
    private final Rect cropRect;
    private final T data;
    private final Exif exif;
    private final int format;
    private final int rotationDegrees;
    private final Matrix sensorToBufferTransform;
    private final Size size;

    AutoValue_Packet(T t, Exif exif, int i, Size size, Rect rect, int i2, Matrix matrix, CameraCaptureResult cameraCaptureResult) {
        if (t == null) {
            throw new NullPointerException("Null data");
        }
        this.data = t;
        this.exif = exif;
        this.format = i;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.size = size;
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.cropRect = rect;
        this.rotationDegrees = i2;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.sensorToBufferTransform = matrix;
        if (cameraCaptureResult == null) {
            throw new NullPointerException("Null cameraCaptureResult");
        }
        this.cameraCaptureResult = cameraCaptureResult;
    }

    @Override // androidx.camera.core.processing.Packet
    public final T getData() {
        return this.data;
    }

    @Override // androidx.camera.core.processing.Packet
    public final Exif getExif() {
        return this.exif;
    }

    @Override // androidx.camera.core.processing.Packet
    public final int getFormat() {
        return this.format;
    }

    @Override // androidx.camera.core.processing.Packet
    public final Size getSize() {
        return this.size;
    }

    @Override // androidx.camera.core.processing.Packet
    public final Rect getCropRect() {
        return this.cropRect;
    }

    @Override // androidx.camera.core.processing.Packet
    public final int getRotationDegrees() {
        return this.rotationDegrees;
    }

    @Override // androidx.camera.core.processing.Packet
    public final Matrix getSensorToBufferTransform() {
        return this.sensorToBufferTransform;
    }

    @Override // androidx.camera.core.processing.Packet
    public final CameraCaptureResult getCameraCaptureResult() {
        return this.cameraCaptureResult;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Packet{data=");
        sb.append(this.data);
        sb.append(", exif=");
        sb.append(this.exif);
        sb.append(", format=");
        sb.append(this.format);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", cropRect=");
        sb.append(this.cropRect);
        sb.append(", rotationDegrees=");
        sb.append(this.rotationDegrees);
        sb.append(", sensorToBufferTransform=");
        sb.append(this.sensorToBufferTransform);
        sb.append(", cameraCaptureResult=");
        sb.append(this.cameraCaptureResult);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Packet)) {
            return false;
        }
        Packet packet = (Packet) obj;
        if (!this.data.equals(packet.getData())) {
            return false;
        }
        Exif exif = this.exif;
        if (exif == null) {
            if (packet.getExif() != null) {
                return false;
            }
        } else if (!exif.equals(packet.getExif())) {
            return false;
        }
        return this.format == packet.getFormat() && this.size.equals(packet.getSize()) && this.cropRect.equals(packet.getCropRect()) && this.rotationDegrees == packet.getRotationDegrees() && this.sensorToBufferTransform.equals(packet.getSensorToBufferTransform()) && this.cameraCaptureResult.equals(packet.getCameraCaptureResult());
    }

    public final int hashCode() {
        int iHashCode = this.data.hashCode();
        Exif exif = this.exif;
        int iHashCode2 = exif == null ? 0 : exif.hashCode();
        int i = this.format;
        int iHashCode3 = this.size.hashCode();
        return ((((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ i) * 1000003) ^ iHashCode3) * 1000003) ^ this.cropRect.hashCode()) * 1000003) ^ this.rotationDegrees) * 1000003) ^ this.sensorToBufferTransform.hashCode()) * 1000003) ^ this.cameraCaptureResult.hashCode();
    }
}
