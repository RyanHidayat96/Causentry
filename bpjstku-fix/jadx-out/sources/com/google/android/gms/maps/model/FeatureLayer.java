package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.maps.zzal;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class FeatureLayer {
    private final com.google.android.gms.internal.maps.zzu zza;
    private StyleFactory zzb;
    private final Map zzc = new HashMap();

    /* JADX INFO: loaded from: classes6.dex */
    public interface OnFeatureClickListener {
        void onFeatureClick(FeatureClickEvent featureClickEvent);
    }

    /* JADX INFO: loaded from: classes6.dex */
    public interface StyleFactory {
        FeatureStyle getStyle(Feature feature);
    }

    public FeatureLayer(com.google.android.gms.internal.maps.zzu zzuVar) {
        this.zza = (com.google.android.gms.internal.maps.zzu) Preconditions.checkNotNull(zzuVar);
    }

    public final String getDatasetId() {
        try {
            return this.zza.zzd();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    @FeatureType
    public final String getFeatureType() {
        try {
            return this.zza.zze();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final boolean isAvailable() {
        try {
            return this.zza.zzi();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void removeOnFeatureClickListener(OnFeatureClickListener onFeatureClickListener) {
        try {
            Map map = this.zzc;
            if (map.containsKey(onFeatureClickListener)) {
                this.zza.zzg((zzal) map.get(onFeatureClickListener));
                map.remove(onFeatureClickListener);
            }
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void setFeatureStyle(StyleFactory styleFactory) {
        this.zzb = styleFactory;
        if (styleFactory == null) {
            try {
                this.zza.zzh(null);
            } catch (RemoteException e2) {
                throw new RuntimeRemoteException(e2);
            }
        } else {
            try {
                this.zza.zzh(new zzd(this, styleFactory));
            } catch (RemoteException e3) {
                throw new RuntimeRemoteException(e3);
            }
        }
    }

    public final void addOnFeatureClickListener(OnFeatureClickListener onFeatureClickListener) {
        try {
            zze zzeVar = new zze(this, onFeatureClickListener);
            this.zzc.put(onFeatureClickListener, zzeVar);
            this.zza.zzf(zzeVar);
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final StyleFactory getFeatureStyle() {
        return this.zzb;
    }
}
