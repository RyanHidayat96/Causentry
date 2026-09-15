package androidx.camera.core;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_SurfaceOutput_Event extends SurfaceOutput.Event {
    private final int eventCode;
    private final SurfaceOutput surfaceOutput;

    AutoValue_SurfaceOutput_Event(int i, SurfaceOutput surfaceOutput) {
        this.eventCode = i;
        if (surfaceOutput == null) {
            throw new NullPointerException("Null surfaceOutput");
        }
        this.surfaceOutput = surfaceOutput;
    }

    @Override // androidx.camera.core.SurfaceOutput.Event
    public final int getEventCode() {
        return this.eventCode;
    }

    @Override // androidx.camera.core.SurfaceOutput.Event
    public final SurfaceOutput getSurfaceOutput() {
        return this.surfaceOutput;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Event{eventCode=");
        sb.append(this.eventCode);
        sb.append(", surfaceOutput=");
        sb.append(this.surfaceOutput);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceOutput.Event)) {
            return false;
        }
        SurfaceOutput.Event event = (SurfaceOutput.Event) obj;
        return this.eventCode == event.getEventCode() && this.surfaceOutput.equals(event.getSurfaceOutput());
    }

    public final int hashCode() {
        return ((this.eventCode ^ 1000003) * 1000003) ^ this.surfaceOutput.hashCode();
    }
}
