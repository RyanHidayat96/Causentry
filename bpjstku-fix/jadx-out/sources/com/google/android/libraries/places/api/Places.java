package com.google.android.libraries.places.api;

import android.content.Context;
import com.google.android.libraries.places.api.auth.PlacesAppCheckTokenProvider;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.android.libraries.places.internal.zzlu;
import com.google.android.libraries.places.internal.zzmc;
import com.google.android.libraries.places.internal.zzmd;
import com.google.android.libraries.places.internal.zzmf;
import com.google.android.libraries.places.internal.zzmp;
import com.google.android.libraries.places.internal.zzmr;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class Places {
    private static final zzmf zza = new zzmf();
    private static volatile zzmd zzb;

    public static PlacesClient createClient(Context context) {
        PlacesClient placesClientZzb;
        synchronized (Places.class) {
            try {
                try {
                    if (context == null) {
                        throw new NullPointerException("Context must not be null.");
                    }
                    placesClientZzb = zzb(context, zzmp.zzd(context).zze());
                } catch (Error | RuntimeException e2) {
                    zzmr.zzb(e2);
                    throw e2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return placesClientZzb;
    }

    public static void deinitialize() {
        synchronized (Places.class) {
            zza.zze();
        }
    }

    public static void initialize(Context context, String str) {
        try {
            zza(context, str, null, false);
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    public static void initializeWithNewPlacesApiEnabled(Context context, String str) {
        try {
            zza(context, str, null, true);
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    public static boolean isInitialized() {
        boolean zZzc;
        synchronized (Places.class) {
            try {
                zZzc = zza.zzc();
            } catch (Error | RuntimeException e2) {
                zzmr.zzb(e2);
                throw e2;
            }
        }
        return zZzc;
    }

    public static void setPlacesAppCheckTokenProvider(PlacesAppCheckTokenProvider placesAppCheckTokenProvider) {
        zza.zzd(placesAppCheckTokenProvider);
    }

    public static void zza(Context context, String str, Locale locale, boolean z) {
        synchronized (Places.class) {
            try {
                try {
                    if (context == null) {
                        throw new NullPointerException("Application context must not be null.");
                    }
                    if (str == null) {
                        throw new NullPointerException("API Key must not be null.");
                    }
                    if (!(!str.isEmpty())) {
                        throw new IllegalArgumentException("API Key must not be empty.");
                    }
                    zzmr.zza(context.getApplicationContext());
                    if (z) {
                        zza.zzb(str, locale);
                    } else {
                        zza.zza(str, locale);
                    }
                } catch (Error | RuntimeException e2) {
                    zzmr.zzb(e2);
                    throw e2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static PlacesClient zzb(Context context, zzmp zzmpVar) {
        PlacesClient placesClientZzc;
        synchronized (Places.class) {
            try {
                try {
                    if (context == null) {
                        throw new NullPointerException("Context must not be null.");
                    }
                    if (zzmpVar == null) {
                        throw new NullPointerException("ClientProfile must not be null.");
                    }
                    if (!isInitialized()) {
                        throw new IllegalStateException("Places must be initialized first.");
                    }
                    zzmc zzmcVarZza = zzlu.zza();
                    zzmcVarZza.zzd(context);
                    zzmcVarZza.zzc(zza);
                    zzmcVarZza.zzb(zzmpVar);
                    placesClientZzc = zzmcVarZza.zza().zzc();
                } catch (Error | RuntimeException e2) {
                    zzmr.zzb(e2);
                    throw e2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return placesClientZzc;
    }

    public static void initialize(Context context, String str, Locale locale) {
        try {
            zza(context, str, locale, false);
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    public static void initializeWithNewPlacesApiEnabled(Context context, String str, Locale locale) {
        try {
            zza(context, str, locale, true);
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    private Places() {
    }

    public static zzmf zzc() {
        zzmf zzmfVar;
        synchronized (Places.class) {
            zzmfVar = zza;
        }
        return zzmfVar;
    }
}
