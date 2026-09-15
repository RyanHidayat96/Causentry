package id.vida.liveness.listeners;

import id.vida.liveness.dto.FaceHacknessResponseDTO;

/* JADX INFO: loaded from: classes7.dex */
public interface BackendLivenessListener {
    void onFailure(byte[] bArr, int i, String str, FaceHacknessResponseDTO faceHacknessResponseDTO);

    void onSuccess(byte[] bArr, FaceHacknessResponseDTO faceHacknessResponseDTO);
}
