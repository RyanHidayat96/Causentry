package androidx.camera.core;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_CameraState extends CameraState {
    private final CameraState.StateError error;
    private final CameraState.Type type;

    AutoValue_CameraState(CameraState.Type type, CameraState.StateError stateError) {
        if (type == null) {
            throw new NullPointerException("Null type");
        }
        this.type = type;
        this.error = stateError;
    }

    @Override // androidx.camera.core.CameraState
    public final CameraState.Type getType() {
        return this.type;
    }

    @Override // androidx.camera.core.CameraState
    public final CameraState.StateError getError() {
        return this.error;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraState{type=");
        sb.append(this.type);
        sb.append(", error=");
        sb.append(this.error);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CameraState)) {
            return false;
        }
        CameraState cameraState = (CameraState) obj;
        if (!this.type.equals(cameraState.getType())) {
            return false;
        }
        CameraState.StateError stateError = this.error;
        if (stateError == null) {
            if (cameraState.getError() != null) {
                return false;
            }
        } else if (!stateError.equals(cameraState.getError())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.type.hashCode();
        CameraState.StateError stateError = this.error;
        return ((iHashCode ^ 1000003) * 1000003) ^ (stateError == null ? 0 : stateError.hashCode());
    }
}
