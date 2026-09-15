package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Camera2CapturePipelinePipeline {
    private String TuitionPaymentFragmentbindingInflater1;
    private String b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Camera2CapturePipelinePipeline)) {
            return false;
        }
        Camera2CapturePipelinePipeline camera2CapturePipelinePipeline = (Camera2CapturePipelinePipeline) obj;
        return Intrinsics.areEqual(this.b, camera2CapturePipelinePipeline.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, camera2CapturePipelinePipeline.TuitionPaymentFragmentbindingInflater1);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ListTuitionPaymentLastYear(blth=");
        sb.append((String) null);
        sb.append(", tuition=");
        sb.append((String) null);
        sb.append(")");
        return sb.toString();
    }
}
