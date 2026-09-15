package androidx.camera.lifecycle;

import androidx.camera.core.CameraProvider;
import androidx.camera.core.UseCase;

/* JADX INFO: loaded from: classes5.dex */
interface LifecycleCameraProvider extends CameraProvider {
    boolean isBound(UseCase useCase);

    void unbind(UseCase... useCaseArr);

    void unbindAll();
}
