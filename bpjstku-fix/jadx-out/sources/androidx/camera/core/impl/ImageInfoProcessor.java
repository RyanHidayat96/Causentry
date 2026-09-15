package androidx.camera.core.impl;

import androidx.camera.core.ImageInfo;

/* JADX INFO: loaded from: classes5.dex */
public interface ImageInfoProcessor {
    CaptureStage getCaptureStage();

    boolean process(ImageInfo imageInfo);
}
