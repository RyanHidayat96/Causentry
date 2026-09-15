package id.vida.liveness.listeners;

import id.vida.liveness.dto.ValidateResponseDTO;

/* JADX INFO: loaded from: classes7.dex */
public interface TokenListener {
    void onError(int i, String str);

    void onSuccess(ValidateResponseDTO validateResponseDTO);
}
