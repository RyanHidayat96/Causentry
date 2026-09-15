package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.internal.zzcc;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class MapsInitializer {
    private static final String zza = "MapsInitializer";
    private static boolean zzb = false;
    private static Renderer zzc = Renderer.LEGACY;

    public enum Renderer {
        LEGACY,
        LATEST
    }

    public static int initialize(Context context) {
        int iInitialize;
        synchronized (MapsInitializer.class) {
            iInitialize = initialize(context, null, null);
        }
        return iInitialize;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0037  */
    public static int initialize(Context context, Renderer renderer, OnMapsSdkInitializedCallback onMapsSdkInitializedCallback) {
        synchronized (MapsInitializer.class) {
            Preconditions.checkNotNull(context, "Context is null");
            if (!zzb) {
                try {
                    com.google.android.gms.maps.internal.zzf zzfVarZza = zzcc.zza(context, renderer);
                    try {
                        CameraUpdateFactory.zza(zzfVarZza.zze());
                        BitmapDescriptorFactory.zza(zzfVarZza.zzj());
                        int i = 1;
                        zzb = true;
                        if (renderer == null) {
                            i = 0;
                        } else {
                            int iOrdinal = renderer.ordinal();
                            if (iOrdinal != 0) {
                                if (iOrdinal == 1) {
                                    i = 2;
                                } else {
                                    i = 0;
                                }
                            }
                        }
                        try {
                            if (zzfVarZza.zzd() == 2) {
                                zzc = Renderer.LATEST;
                            }
                            zzfVarZza.zzm(ObjectWrapper.wrap(context), i);
                        } catch (RemoteException unused) {
                        }
                        if (onMapsSdkInitializedCallback != null) {
                            onMapsSdkInitializedCallback.onMapsSdkInitialized(zzc);
                        }
                    } catch (RemoteException e2) {
                        throw new RuntimeRemoteException(e2);
                    }
                } catch (GooglePlayServicesNotAvailableException e3) {
                    return e3.errorCode;
                }
            } else if (onMapsSdkInitializedCallback != null) {
                onMapsSdkInitializedCallback.onMapsSdkInitialized(zzc);
            }
        }
        return 0;
    }

    private MapsInitializer() {
    }
}
