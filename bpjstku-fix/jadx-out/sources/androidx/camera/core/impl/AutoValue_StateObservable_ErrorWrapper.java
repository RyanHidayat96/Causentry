package androidx.camera.core.impl;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_StateObservable_ErrorWrapper extends StateObservable.ErrorWrapper {
    private final Throwable error;

    AutoValue_StateObservable_ErrorWrapper(Throwable th) {
        if (th == null) {
            throw new NullPointerException("Null error");
        }
        this.error = th;
    }

    @Override // androidx.camera.core.impl.StateObservable.ErrorWrapper
    public final Throwable getError() {
        return this.error;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ErrorWrapper{error=");
        sb.append(this.error);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StateObservable.ErrorWrapper) {
            return this.error.equals(((StateObservable.ErrorWrapper) obj).getError());
        }
        return false;
    }

    public final int hashCode() {
        return this.error.hashCode() ^ 1000003;
    }
}
