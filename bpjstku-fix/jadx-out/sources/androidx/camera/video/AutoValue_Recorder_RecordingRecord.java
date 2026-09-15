package androidx.camera.video;

import androidx.core.util.Consumer;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_Recorder_RecordingRecord extends Recorder.RecordingRecord {
    private final Executor getCallbackExecutor;
    private final Consumer<VideoRecordEvent> getEventListener;
    private final OutputOptions getOutputOptions;
    private final long getRecordingId;
    private final boolean hasAudioEnabled;
    private final boolean isPersistent;

    AutoValue_Recorder_RecordingRecord(OutputOptions outputOptions, Executor executor, Consumer<VideoRecordEvent> consumer, boolean z, boolean z2, long j) {
        if (outputOptions == null) {
            throw new NullPointerException("Null getOutputOptions");
        }
        this.getOutputOptions = outputOptions;
        this.getCallbackExecutor = executor;
        this.getEventListener = consumer;
        this.hasAudioEnabled = z;
        this.isPersistent = z2;
        this.getRecordingId = j;
    }

    @Override // androidx.camera.video.Recorder.RecordingRecord
    final OutputOptions getOutputOptions() {
        return this.getOutputOptions;
    }

    @Override // androidx.camera.video.Recorder.RecordingRecord
    final Executor getCallbackExecutor() {
        return this.getCallbackExecutor;
    }

    @Override // androidx.camera.video.Recorder.RecordingRecord
    final Consumer<VideoRecordEvent> getEventListener() {
        return this.getEventListener;
    }

    @Override // androidx.camera.video.Recorder.RecordingRecord
    final boolean hasAudioEnabled() {
        return this.hasAudioEnabled;
    }

    @Override // androidx.camera.video.Recorder.RecordingRecord
    final boolean isPersistent() {
        return this.isPersistent;
    }

    @Override // androidx.camera.video.Recorder.RecordingRecord
    final long getRecordingId() {
        return this.getRecordingId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecordingRecord{getOutputOptions=");
        sb.append(this.getOutputOptions);
        sb.append(", getCallbackExecutor=");
        sb.append(this.getCallbackExecutor);
        sb.append(", getEventListener=");
        sb.append(this.getEventListener);
        sb.append(", hasAudioEnabled=");
        sb.append(this.hasAudioEnabled);
        sb.append(", isPersistent=");
        sb.append(this.isPersistent);
        sb.append(", getRecordingId=");
        sb.append(this.getRecordingId);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Recorder.RecordingRecord)) {
            return false;
        }
        Recorder.RecordingRecord recordingRecord = (Recorder.RecordingRecord) obj;
        if (!this.getOutputOptions.equals(recordingRecord.getOutputOptions())) {
            return false;
        }
        Executor executor = this.getCallbackExecutor;
        if (executor == null) {
            if (recordingRecord.getCallbackExecutor() != null) {
                return false;
            }
        } else if (!executor.equals(recordingRecord.getCallbackExecutor())) {
            return false;
        }
        Consumer<VideoRecordEvent> consumer = this.getEventListener;
        if (consumer == null) {
            if (recordingRecord.getEventListener() != null) {
                return false;
            }
        } else if (!consumer.equals(recordingRecord.getEventListener())) {
            return false;
        }
        return this.hasAudioEnabled == recordingRecord.hasAudioEnabled() && this.isPersistent == recordingRecord.isPersistent() && this.getRecordingId == recordingRecord.getRecordingId();
    }

    public final int hashCode() {
        int iHashCode = this.getOutputOptions.hashCode();
        Executor executor = this.getCallbackExecutor;
        int iHashCode2 = executor == null ? 0 : executor.hashCode();
        Consumer<VideoRecordEvent> consumer = this.getEventListener;
        int iHashCode3 = consumer != null ? consumer.hashCode() : 0;
        int i = this.hasAudioEnabled ? 1231 : 1237;
        int i2 = this.isPersistent ? 1231 : 1237;
        long j = this.getRecordingId;
        return ((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }
}
