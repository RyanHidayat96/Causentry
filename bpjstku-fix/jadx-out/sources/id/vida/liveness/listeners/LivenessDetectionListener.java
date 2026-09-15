package id.vida.liveness.listeners;

import android.graphics.Bitmap;
import id.vida.liveness.constants.FaceStatus;

/* JADX INFO: loaded from: classes7.dex */
public interface LivenessDetectionListener {
    void onFaceStatusChangedListener(FaceStatus faceStatus);

    void onFailureListener(int i, String str, byte[] bArr);

    void onProgressUpdate(int i, boolean z, boolean z2);

    void onSuccessListener(Bitmap bitmap);
}
