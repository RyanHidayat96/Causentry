package androidx.camera.video;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_AudioStats extends AudioStats {
    private final double audioAmplitudeInternal;
    private final int audioState;
    private final Throwable errorCause;

    AutoValue_AudioStats(int i, double d, Throwable th) {
        this.audioState = i;
        this.audioAmplitudeInternal = d;
        this.errorCause = th;
    }

    @Override // androidx.camera.video.AudioStats
    public final int getAudioState() {
        return this.audioState;
    }

    @Override // androidx.camera.video.AudioStats
    final double getAudioAmplitudeInternal() {
        return this.audioAmplitudeInternal;
    }

    @Override // androidx.camera.video.AudioStats
    public final Throwable getErrorCause() {
        return this.errorCause;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioStats{audioState=");
        sb.append(this.audioState);
        sb.append(", audioAmplitudeInternal=");
        sb.append(this.audioAmplitudeInternal);
        sb.append(", errorCause=");
        sb.append(this.errorCause);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AudioStats)) {
            return false;
        }
        AudioStats audioStats = (AudioStats) obj;
        if (this.audioState != audioStats.getAudioState() || Double.doubleToLongBits(this.audioAmplitudeInternal) != Double.doubleToLongBits(audioStats.getAudioAmplitudeInternal())) {
            return false;
        }
        Throwable th = this.errorCause;
        if (th == null) {
            if (audioStats.getErrorCause() != null) {
                return false;
            }
        } else if (!th.equals(audioStats.getErrorCause())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.audioState;
        int iDoubleToLongBits = (int) ((Double.doubleToLongBits(this.audioAmplitudeInternal) >>> 32) ^ Double.doubleToLongBits(this.audioAmplitudeInternal));
        Throwable th = this.errorCause;
        return ((((i ^ 1000003) * 1000003) ^ iDoubleToLongBits) * 1000003) ^ (th == null ? 0 : th.hashCode());
    }
}
