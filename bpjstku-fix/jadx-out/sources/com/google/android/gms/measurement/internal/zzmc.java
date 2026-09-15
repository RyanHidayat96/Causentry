package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
final class zzmc implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzr zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcu zze;
    final /* synthetic */ zznl zzf;

    zzmc(zznl zznlVar, String str, String str2, zzr zzrVar, boolean z, com.google.android.gms.internal.measurement.zzcu zzcuVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzrVar;
        this.zzd = z;
        this.zze = zzcuVar;
        Objects.requireNonNull(zznlVar);
        this.zzf = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Throwable th;
        Bundle bundle = new Bundle();
        try {
            zznl zznlVar = this.zzf;
            zzgb zzgbVarZzZ = zznlVar.zzZ();
            if (zzgbVarZzZ == null) {
                zzic zzicVar = zznlVar.zzu;
                zzicVar.zzaV().zzb().zzc("Failed to get user properties; not connected to service", this.zza, this.zzb);
                zzicVar.zzk().zzaq(this.zze, bundle);
                return;
            }
            zzr zzrVar = this.zzc;
            Preconditions.checkNotNull(zzrVar);
            List<zzpl> listZzp = zzgbVarZzZ.zzp(this.zza, this.zzb, this.zzd, zzrVar);
            int i = zzpp.zza;
            Bundle bundle2 = new Bundle();
            if (listZzp != null) {
                for (zzpl zzplVar : listZzp) {
                    String str = zzplVar.zze;
                    if (str != null) {
                        bundle2.putString(zzplVar.zzb, str);
                    } else {
                        Long l = zzplVar.zzd;
                        if (l != null) {
                            bundle2.putLong(zzplVar.zzb, l.longValue());
                        } else {
                            Double d = zzplVar.zzg;
                            if (d != null) {
                                bundle2.putDouble(zzplVar.zzb, d.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                zznlVar.zzV();
                zzic zzicVar2 = zznlVar.zzu;
                zzicVar2.zzk().zzaq(this.zze, bundle2);
            } catch (RemoteException e2) {
                e = e2;
                bundle = bundle2;
                try {
                    this.zzf.zzu.zzaV().zzb().zzc("Failed to get user properties; remote exception", this.zza, e);
                    zznl zznlVar2 = this.zzf;
                    zznlVar2.zzu.zzk().zzaq(this.zze, bundle);
                } catch (Throwable th2) {
                    bundle2 = bundle;
                    th = th2;
                    th = th;
                    bundle = bundle2;
                    zznl zznlVar3 = this.zzf;
                    zznlVar3.zzu.zzk().zzaq(this.zze, bundle);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                bundle = bundle2;
                zznl zznlVar4 = this.zzf;
                zznlVar4.zzu.zzk().zzaq(this.zze, bundle);
                throw th;
            }
        } catch (RemoteException e3) {
            e = e3;
        } catch (Throwable th4) {
            th = th4;
            zznl zznlVar5 = this.zzf;
            zznlVar5.zzu.zzk().zzaq(this.zze, bundle);
            throw th;
        }
    }
}
