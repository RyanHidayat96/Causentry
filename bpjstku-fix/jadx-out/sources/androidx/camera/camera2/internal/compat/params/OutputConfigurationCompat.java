package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.ApiCompat;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class OutputConfigurationCompat {
    public static final int STREAM_USE_CASE_NONE = -1;
    public static final int SURFACE_GROUP_ID_NONE = -1;
    private final OutputConfigurationCompatImpl mImpl;

    interface OutputConfigurationCompatImpl {
        void addSurface(Surface surface);

        void enableSurfaceSharing();

        long getDynamicRangeProfile();

        int getMaxSharedSurfaceCount();

        int getMirrorMode();

        Object getOutputConfiguration();

        String getPhysicalCameraId();

        long getStreamUseCase();

        Surface getSurface();

        int getSurfaceGroupId();

        List<Surface> getSurfaces();

        void removeSurface(Surface surface);

        void setDynamicRangeProfile(long j);

        void setMirrorMode(int i);

        void setPhysicalCameraId(String str);

        void setStreamUseCase(long j);
    }

    public OutputConfigurationCompat(Surface surface) {
        this(-1, surface);
    }

    public OutputConfigurationCompat(int i, Surface surface) {
        if (Build.VERSION.SDK_INT >= 33) {
            this.mImpl = new OutputConfigurationCompatApi33Impl(i, surface);
            return;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            this.mImpl = new OutputConfigurationCompatApi28Impl(i, surface);
        } else if (Build.VERSION.SDK_INT >= 26) {
            this.mImpl = new OutputConfigurationCompatApi26Impl(i, surface);
        } else {
            this.mImpl = new OutputConfigurationCompatApi24Impl(i, surface);
        }
    }

    public <T> OutputConfigurationCompat(Size size, Class<T> cls) {
        OutputConfiguration outputConfigurationNewOutputConfiguration = ApiCompat.Api26Impl.newOutputConfiguration(size, cls);
        if (Build.VERSION.SDK_INT >= 33) {
            this.mImpl = OutputConfigurationCompatApi33Impl.wrap(outputConfigurationNewOutputConfiguration);
        } else if (Build.VERSION.SDK_INT >= 28) {
            this.mImpl = OutputConfigurationCompatApi28Impl.wrap(outputConfigurationNewOutputConfiguration);
        } else {
            this.mImpl = OutputConfigurationCompatApi26Impl.wrap(outputConfigurationNewOutputConfiguration);
        }
    }

    public OutputConfigurationCompat(OutputConfiguration outputConfiguration) {
        this.mImpl = OutputConfigurationCompatApi33Impl.wrap(outputConfiguration);
    }

    private OutputConfigurationCompat(OutputConfigurationCompatImpl outputConfigurationCompatImpl) {
        this.mImpl = outputConfigurationCompatImpl;
    }

    public static OutputConfigurationCompat wrap(Object obj) {
        OutputConfigurationCompatImpl outputConfigurationCompatImplWrap;
        if (obj == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            outputConfigurationCompatImplWrap = OutputConfigurationCompatApi33Impl.wrap((OutputConfiguration) obj);
        } else if (Build.VERSION.SDK_INT >= 28) {
            outputConfigurationCompatImplWrap = OutputConfigurationCompatApi28Impl.wrap((OutputConfiguration) obj);
        } else if (Build.VERSION.SDK_INT >= 26) {
            outputConfigurationCompatImplWrap = OutputConfigurationCompatApi26Impl.wrap((OutputConfiguration) obj);
        } else {
            outputConfigurationCompatImplWrap = OutputConfigurationCompatApi24Impl.wrap((OutputConfiguration) obj);
        }
        if (outputConfigurationCompatImplWrap == null) {
            return null;
        }
        return new OutputConfigurationCompat(outputConfigurationCompatImplWrap);
    }

    public final void enableSurfaceSharing() {
        this.mImpl.enableSurfaceSharing();
    }

    public final int getMirrorMode() {
        return this.mImpl.getMirrorMode();
    }

    public final void setMirrorMode(int i) {
        this.mImpl.setMirrorMode(i);
    }

    public final String getPhysicalCameraId() {
        return this.mImpl.getPhysicalCameraId();
    }

    public final void setPhysicalCameraId(String str) {
        this.mImpl.setPhysicalCameraId(str);
    }

    public final void addSurface(Surface surface) {
        this.mImpl.addSurface(surface);
    }

    public final void removeSurface(Surface surface) {
        this.mImpl.removeSurface(surface);
    }

    public final int getMaxSharedSurfaceCount() {
        return this.mImpl.getMaxSharedSurfaceCount();
    }

    public final Surface getSurface() {
        return this.mImpl.getSurface();
    }

    public final List<Surface> getSurfaces() {
        return this.mImpl.getSurfaces();
    }

    public final int getSurfaceGroupId() {
        return this.mImpl.getSurfaceGroupId();
    }

    public final long getDynamicRangeProfile() {
        return this.mImpl.getDynamicRangeProfile();
    }

    public final void setDynamicRangeProfile(long j) {
        this.mImpl.setDynamicRangeProfile(j);
    }

    public final void setStreamUseCase(long j) {
        this.mImpl.setStreamUseCase(j);
    }

    public final long getStreamUseCase() {
        return this.mImpl.getStreamUseCase();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof OutputConfigurationCompat) {
            return this.mImpl.equals(((OutputConfigurationCompat) obj).mImpl);
        }
        return false;
    }

    public final int hashCode() {
        return this.mImpl.hashCode();
    }

    public final Object unwrap() {
        return this.mImpl.getOutputConfiguration();
    }
}
