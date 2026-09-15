package androidx.camera.video;

import androidx.camera.core.SurfaceRequest;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_StreamInfo extends StreamInfo {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f305id;
    private final SurfaceRequest.TransformationInfo inProgressTransformationInfo;
    private final StreamInfo.StreamState streamState;

    AutoValue_StreamInfo(int i, StreamInfo.StreamState streamState, SurfaceRequest.TransformationInfo transformationInfo) {
        this.f305id = i;
        if (streamState == null) {
            throw new NullPointerException("Null streamState");
        }
        this.streamState = streamState;
        this.inProgressTransformationInfo = transformationInfo;
    }

    @Override // androidx.camera.video.StreamInfo
    public final int getId() {
        return this.f305id;
    }

    @Override // androidx.camera.video.StreamInfo
    public final StreamInfo.StreamState getStreamState() {
        return this.streamState;
    }

    @Override // androidx.camera.video.StreamInfo
    public final SurfaceRequest.TransformationInfo getInProgressTransformationInfo() {
        return this.inProgressTransformationInfo;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamInfo{id=");
        sb.append(this.f305id);
        sb.append(", streamState=");
        sb.append(this.streamState);
        sb.append(", inProgressTransformationInfo=");
        sb.append(this.inProgressTransformationInfo);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StreamInfo)) {
            return false;
        }
        StreamInfo streamInfo = (StreamInfo) obj;
        if (this.f305id != streamInfo.getId() || !this.streamState.equals(streamInfo.getStreamState())) {
            return false;
        }
        SurfaceRequest.TransformationInfo transformationInfo = this.inProgressTransformationInfo;
        if (transformationInfo == null) {
            if (streamInfo.getInProgressTransformationInfo() != null) {
                return false;
            }
        } else if (!transformationInfo.equals(streamInfo.getInProgressTransformationInfo())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f305id;
        int iHashCode = this.streamState.hashCode();
        SurfaceRequest.TransformationInfo transformationInfo = this.inProgressTransformationInfo;
        return ((((i ^ 1000003) * 1000003) ^ iHashCode) * 1000003) ^ (transformationInfo == null ? 0 : transformationInfo.hashCode());
    }
}
