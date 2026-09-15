package id.vida.liveness.listeners;

import id.vida.liveness.dto.VidaLivenessResponse;

/* JADX INFO: loaded from: classes4.dex */
public interface VidaLivenessListener {
    void onError(int i, String str, VidaLivenessResponse vidaLivenessResponse);

    void onInitialized();

    void onSuccess(VidaLivenessResponse vidaLivenessResponse);
}
