package com.karumi.dexter;

/* JADX INFO: loaded from: classes4.dex */
final class PermissionRationaleToken implements PermissionToken {
    private final DexterInstance dexterInstance;
    private boolean isTokenResolved = false;

    PermissionRationaleToken(DexterInstance dexterInstance) {
        this.dexterInstance = dexterInstance;
    }

    @Override // com.karumi.dexter.PermissionToken
    public final void cancelPermissionRequest() {
        if (this.isTokenResolved) {
            return;
        }
        this.dexterInstance.onCancelPermissionRequest();
        this.isTokenResolved = true;
    }

    @Override // com.karumi.dexter.PermissionToken
    public final void continuePermissionRequest() {
        if (this.isTokenResolved) {
            return;
        }
        this.dexterInstance.onContinuePermissionRequest();
        this.isTokenResolved = true;
    }
}
