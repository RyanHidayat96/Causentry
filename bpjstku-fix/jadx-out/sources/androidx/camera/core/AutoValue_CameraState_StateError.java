package androidx.camera.core;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_CameraState_StateError extends CameraState.StateError {
    private final Throwable cause;
    private final int code;

    AutoValue_CameraState_StateError(int i, Throwable th) {
        this.code = i;
        this.cause = th;
    }

    @Override // androidx.camera.core.CameraState.StateError
    public final int getCode() {
        return this.code;
    }

    @Override // androidx.camera.core.CameraState.StateError
    public final Throwable getCause() {
        return this.cause;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StateError{code=");
        sb.append(this.code);
        sb.append(", cause=");
        sb.append(this.cause);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CameraState.StateError)) {
            return false;
        }
        CameraState.StateError stateError = (CameraState.StateError) obj;
        if (this.code != stateError.getCode()) {
            return false;
        }
        Throwable th = this.cause;
        if (th == null) {
            if (stateError.getCause() != null) {
                return false;
            }
        } else if (!th.equals(stateError.getCause())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.code;
        Throwable th = this.cause;
        return ((i ^ 1000003) * 1000003) ^ (th == null ? 0 : th.hashCode());
    }
}
