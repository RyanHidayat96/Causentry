package androidx.camera.core;

import android.view.Surface;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_SurfaceRequest_Result extends SurfaceRequest.Result {
    private final int resultCode;
    private final Surface surface;

    AutoValue_SurfaceRequest_Result(int i, Surface surface) {
        this.resultCode = i;
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.surface = surface;
    }

    @Override // androidx.camera.core.SurfaceRequest.Result
    public final int getResultCode() {
        return this.resultCode;
    }

    @Override // androidx.camera.core.SurfaceRequest.Result
    public final Surface getSurface() {
        return this.surface;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result{resultCode=");
        sb.append(this.resultCode);
        sb.append(", surface=");
        sb.append(this.surface);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceRequest.Result)) {
            return false;
        }
        SurfaceRequest.Result result = (SurfaceRequest.Result) obj;
        return this.resultCode == result.getResultCode() && this.surface.equals(result.getSurface());
    }

    public final int hashCode() {
        return ((this.resultCode ^ 1000003) * 1000003) ^ this.surface.hashCode();
    }
}
