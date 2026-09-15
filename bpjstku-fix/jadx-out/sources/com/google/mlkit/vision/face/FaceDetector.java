package com.google.mlkit.vision.face;

import androidx.p002lifecycle.Lifecycle;
import androidx.p002lifecycle.OnLifecycleEvent;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.interfaces.Detector;
import defpackage.CameraControlInternal2;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface FaceDetector extends Detector<List<Face>>, OptionalModuleApi {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    void close();

    Task<List<Face>> process(CameraControlInternal2 cameraControlInternal2);

    Task<List<Face>> process(InputImage inputImage);
}
