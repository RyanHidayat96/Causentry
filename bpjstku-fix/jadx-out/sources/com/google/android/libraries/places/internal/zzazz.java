package com.google.android.libraries.places.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzazz extends zzayo {
    private final zzbae zza;

    @Override // com.google.android.libraries.places.internal.zzbbt
    public final /* synthetic */ Object zzb(zzazc zzazcVar, zzazp zzazpVar) throws zzbar {
        zzbae zzbaeVarZzbg = this.zza.zzbg();
        try {
            zzbbz zzbbzVarZzb = zzbbv.zza().zzb(zzbaeVarZzbg.getClass());
            zzbbzVarZzb.zzg(zzbaeVarZzbg, zzazd.zza(zzazcVar), zzazpVar);
            zzbbzVarZzb.zzh(zzbaeVarZzbg);
            return zzbaeVarZzbg;
        } catch (zzbar e2) {
            if (e2.zzb()) {
                throw new zzbar(e2);
            }
            throw e2;
        } catch (zzbcl e3) {
            throw e3.zza();
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzbar) {
                throw ((zzbar) e4.getCause());
            }
            throw new zzbar(e4);
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof zzbar) {
                throw ((zzbar) e5.getCause());
            }
            throw e5;
        }
    }

    public zzazz(zzbae zzbaeVar) {
        this.zza = zzbaeVar;
    }
}
