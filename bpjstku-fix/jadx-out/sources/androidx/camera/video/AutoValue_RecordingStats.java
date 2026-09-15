package androidx.camera.video;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_RecordingStats extends RecordingStats {
    private final AudioStats audioStats;
    private final long numBytesRecorded;
    private final long recordedDurationNanos;

    AutoValue_RecordingStats(long j, long j2, AudioStats audioStats) {
        this.recordedDurationNanos = j;
        this.numBytesRecorded = j2;
        if (audioStats == null) {
            throw new NullPointerException("Null audioStats");
        }
        this.audioStats = audioStats;
    }

    @Override // androidx.camera.video.RecordingStats
    public final long getRecordedDurationNanos() {
        return this.recordedDurationNanos;
    }

    @Override // androidx.camera.video.RecordingStats
    public final long getNumBytesRecorded() {
        return this.numBytesRecorded;
    }

    @Override // androidx.camera.video.RecordingStats
    public final AudioStats getAudioStats() {
        return this.audioStats;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecordingStats{recordedDurationNanos=");
        sb.append(this.recordedDurationNanos);
        sb.append(", numBytesRecorded=");
        sb.append(this.numBytesRecorded);
        sb.append(", audioStats=");
        sb.append(this.audioStats);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecordingStats)) {
            return false;
        }
        RecordingStats recordingStats = (RecordingStats) obj;
        return this.recordedDurationNanos == recordingStats.getRecordedDurationNanos() && this.numBytesRecorded == recordingStats.getNumBytesRecorded() && this.audioStats.equals(recordingStats.getAudioStats());
    }

    public final int hashCode() {
        long j = this.recordedDurationNanos;
        long j2 = this.numBytesRecorded;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.audioStats.hashCode();
    }
}
