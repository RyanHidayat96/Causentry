package androidx.camera.video;

import android.net.Uri;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_OutputResults extends OutputResults {
    private final Uri outputUri;

    AutoValue_OutputResults(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null outputUri");
        }
        this.outputUri = uri;
    }

    @Override // androidx.camera.video.OutputResults
    public final Uri getOutputUri() {
        return this.outputUri;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutputResults{outputUri=");
        sb.append(this.outputUri);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OutputResults) {
            return this.outputUri.equals(((OutputResults) obj).getOutputUri());
        }
        return false;
    }

    public final int hashCode() {
        return this.outputUri.hashCode() ^ 1000003;
    }
}
