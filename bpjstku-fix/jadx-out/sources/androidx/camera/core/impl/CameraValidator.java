package androidx.camera.core.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.Logger;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes5.dex */
public final class CameraValidator {
    private static final CameraSelector EXTERNAL_LENS_FACING = new CameraSelector.Builder().requireLensFacing(2).build();
    private static final String TAG = "CameraValidator";

    private CameraValidator() {
    }

    public static void validateCameras(Context context, CameraRepository cameraRepository, CameraSelector cameraSelector) throws CameraIdListIncorrectException {
        Integer lensFacing;
        int i = 0;
        IllegalArgumentException illegalArgumentException = null;
        if (Build.VERSION.SDK_INT >= 34 && Api34Impl.getDeviceId(context) != 0) {
            LinkedHashSet<CameraInternal> cameras = cameraRepository.getCameras();
            if (cameras.isEmpty()) {
                throw new CameraIdListIncorrectException("No cameras available", 0, null);
            }
            StringBuilder sb = new StringBuilder("Virtual device with ID: ");
            sb.append(Api34Impl.getDeviceId(context));
            sb.append(" has ");
            sb.append(cameras.size());
            sb.append(" cameras. Skipping validation.");
            Logger.d(TAG, sb.toString());
            return;
        }
        if (cameraSelector != null) {
            try {
                lensFacing = cameraSelector.getLensFacing();
                if (lensFacing == null) {
                    Logger.w(TAG, "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                    return;
                }
            } catch (IllegalStateException e2) {
                Logger.e(TAG, "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e2);
                return;
            }
        } else {
            lensFacing = null;
        }
        StringBuilder sb2 = new StringBuilder("Verifying camera lens facing on ");
        sb2.append(Build.DEVICE);
        sb2.append(", lensFacingInteger: ");
        sb2.append(lensFacing);
        Logger.d(TAG, sb2.toString());
        PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (cameraSelector == null || lensFacing.intValue() == 1)) {
                CameraSelector.DEFAULT_BACK_CAMERA.select(cameraRepository.getCameras());
                i = 1;
            }
        } catch (IllegalArgumentException e3) {
            illegalArgumentException = e3;
            Logger.w(TAG, "Camera LENS_FACING_BACK verification failed", illegalArgumentException);
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera.front") && (cameraSelector == null || lensFacing.intValue() == 0)) {
                CameraSelector.DEFAULT_FRONT_CAMERA.select(cameraRepository.getCameras());
                i++;
            }
        } catch (IllegalArgumentException e4) {
            illegalArgumentException = e4;
            Logger.w(TAG, "Camera LENS_FACING_FRONT verification failed", illegalArgumentException);
        }
        try {
            EXTERNAL_LENS_FACING.select(cameraRepository.getCameras());
            Logger.d(TAG, "Found a LENS_FACING_EXTERNAL camera");
            i++;
        } catch (IllegalArgumentException unused) {
        }
        if (illegalArgumentException == null) {
            return;
        }
        StringBuilder sb3 = new StringBuilder("Camera LensFacing verification failed, existing cameras: ");
        sb3.append(cameraRepository.getCameras());
        Logger.e(TAG, sb3.toString());
        throw new CameraIdListIncorrectException("Expected camera missing from device.", i, illegalArgumentException);
    }

    public static class CameraIdListIncorrectException extends Exception {
        private int mAvailableCameraCount;

        public CameraIdListIncorrectException(String str, int i, Throwable th) {
            super(str, th);
            this.mAvailableCameraCount = i;
        }

        public int getAvailableCameraCount() {
            return this.mAvailableCameraCount;
        }
    }

    static class Api34Impl {
        private Api34Impl() {
        }

        static int getDeviceId(Context context) {
            return context.getDeviceId();
        }
    }
}
