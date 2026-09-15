package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import androidx.core.content.PermissionChecker;
import defpackage.updateAndVerifyState;

/* JADX INFO: loaded from: classes5.dex */
final class zzjy implements zzjv {
    private static zzjy zza;
    private final Context zzb;
    private final ContentObserver zzc;
    private boolean zzd;

    private zzjy(Context context) {
        this.zzd = false;
        this.zzb = context;
        this.zzc = new zzjw(this, null);
    }

    static zzjy zza(Context context) {
        zzjy zzjyVar;
        synchronized (zzjy.class) {
            if (zza == null) {
                zza = PermissionChecker.checkSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new zzjy(context) : new zzjy();
            }
            zzjy zzjyVar2 = zza;
            if (zzjyVar2 == null || zzjyVar2.zzc == null || zzjyVar2.zzd) {
                zzjyVar = (zzjy) updateAndVerifyState.TuitionPaymentFragmentbindingInflater1(zza);
            } else {
                try {
                    context.getContentResolver().registerContentObserver(zzjg.zza, true, zza.zzc);
                    ((zzjy) updateAndVerifyState.TuitionPaymentFragmentbindingInflater1(zza)).zzd = true;
                } catch (SecurityException e2) {
                    Log.e("GservicesLoader", "Unable to register Gservices content observer", e2);
                }
                zzjyVar = (zzjy) updateAndVerifyState.TuitionPaymentFragmentbindingInflater1(zza);
            }
            throw th;
        }
        return zzjyVar;
    }

    static void zzc() {
        Context context;
        synchronized (zzjy.class) {
            zzjy zzjyVar = zza;
            if (zzjyVar != null && (context = zzjyVar.zzb) != null && zzjyVar.zzc != null && zzjyVar.zzd) {
                context.getContentResolver().unregisterContentObserver(zza.zzc);
            }
            zza = null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjv
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final String zze(final String str) {
        Context context = this.zzb;
        if (context == null || zzjm.zzb(context)) {
            return null;
        }
        try {
            return (String) zzjv.zzh(new zzju() { // from class: com.google.android.gms.internal.measurement.zzjx
                @Override // com.google.android.gms.internal.measurement.zzju
                public final /* synthetic */ Object zza() {
                    return this.zza.zzd(str);
                }
            });
        } catch (IllegalStateException | NullPointerException | SecurityException e2) {
            Log.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e2);
            return null;
        }
    }

    final /* synthetic */ String zzd(String str) {
        return zzjf.zza(((Context) updateAndVerifyState.TuitionPaymentFragmentbindingInflater1(this.zzb)).getContentResolver(), str, null);
    }

    private zzjy() {
        this.zzd = false;
        this.zzb = null;
        this.zzc = null;
    }
}
