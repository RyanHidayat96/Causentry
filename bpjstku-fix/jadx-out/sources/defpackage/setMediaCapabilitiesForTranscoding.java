package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class setMediaCapabilitiesForTranscoding {
    public float b;

    public setMediaCapabilitiesForTranscoding(float f) {
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setMediaCapabilitiesForTranscoding) && Float.compare(this.b, ((setMediaCapabilitiesForTranscoding) obj).b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b);
    }

    public final String toString() {
        float f = this.b;
        StringBuilder sb = new StringBuilder("AccountSimilarity(score=");
        sb.append(f);
        sb.append(")");
        return sb.toString();
    }
}
