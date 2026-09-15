package com.google.android.gms.maps.model;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class PlaceFeature extends Feature {
    private final com.google.android.gms.internal.maps.zzr zza;

    public PlaceFeature(com.google.android.gms.internal.maps.zzr zzrVar) {
        super(zzrVar);
        this.zza = zzrVar;
    }

    public final String getPlaceId() {
        try {
            return this.zza.zzg();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }
}
