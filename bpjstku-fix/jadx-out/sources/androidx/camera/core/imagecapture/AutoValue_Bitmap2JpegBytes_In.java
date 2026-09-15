package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import androidx.camera.core.processing.Packet;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_Bitmap2JpegBytes_In extends Bitmap2JpegBytes.In {
    private final int jpegQuality;
    private final Packet<Bitmap> packet;

    AutoValue_Bitmap2JpegBytes_In(Packet<Bitmap> packet, int i) {
        if (packet == null) {
            throw new NullPointerException("Null packet");
        }
        this.packet = packet;
        this.jpegQuality = i;
    }

    @Override // androidx.camera.core.imagecapture.Bitmap2JpegBytes.In
    final Packet<Bitmap> getPacket() {
        return this.packet;
    }

    @Override // androidx.camera.core.imagecapture.Bitmap2JpegBytes.In
    final int getJpegQuality() {
        return this.jpegQuality;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{packet=");
        sb.append(this.packet);
        sb.append(", jpegQuality=");
        sb.append(this.jpegQuality);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Bitmap2JpegBytes.In)) {
            return false;
        }
        Bitmap2JpegBytes.In in = (Bitmap2JpegBytes.In) obj;
        return this.packet.equals(in.getPacket()) && this.jpegQuality == in.getJpegQuality();
    }

    public final int hashCode() {
        return ((this.packet.hashCode() ^ 1000003) * 1000003) ^ this.jpegQuality;
    }
}
