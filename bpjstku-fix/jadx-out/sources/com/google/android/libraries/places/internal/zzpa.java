package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import com.google.android.libraries.places.widget.model.AutocompleteListDensity;
import com.google.android.libraries.places.widget.model.AutocompleteUiCustomization;

/* JADX INFO: loaded from: classes3.dex */
public final class zzpa implements zzoz {
    private final zzmv zza;
    private final zzmp zzb;

    @Override // com.google.android.libraries.places.internal.zzoz
    public final void zza(zzoa zzoaVar) {
        int i;
        zzaki zzakiVarZza = zzakm.zza();
        zzakiVarZza.zza(zzoaVar.zzf());
        zzakiVarZza.zzb(zzoaVar.zzg());
        zzakiVarZza.zzc(zzoaVar.zzh());
        zzakiVarZza.zzd(zzoaVar.zzi());
        zzakiVarZza.zze(zzoaVar.zzj());
        zzakiVarZza.zzf(zzoaVar.zzk());
        zzakiVarZza.zzn(zzoaVar.zzl());
        zzakiVarZza.zzg(zzoaVar.zzm());
        zzakiVarZza.zzh(zzoaVar.zzn().length());
        zzakiVarZza.zzi(zzoaVar.zzo());
        zzakiVarZza.zzj(zzoaVar.zzp());
        zzakiVarZza.zzk(zzoaVar.zzq());
        zzakiVarZza.zzl(zzoaVar.zzr());
        int iOrdinal = zzoaVar.zza().ordinal();
        if (iOrdinal == 0) {
            i = 2;
        } else if (iOrdinal == 1) {
            i = 3;
        } else {
            if (iOrdinal != 2) {
                throw new RuntimeException(null, null);
            }
            i = 4;
        }
        zzakiVarZza.zzq(i);
        AutocompleteUiCustomization autocompleteUiCustomizationZzb = zzoaVar.zzb();
        if (autocompleteUiCustomizationZzb != null) {
            zzakg zzakgVarZza = zzakh.zza();
            zzakgVarZza.zza(autocompleteUiCustomizationZzb.getZza() == AutocompleteListDensity.MULTI_LINE ? 3 : 2);
            zzakiVarZza.zzm((zzakh) zzakgVarZza.zzG());
        }
        if (zzoaVar.zzc() == zzoc.FRAGMENT) {
            zzakiVarZza.zzo(2);
        } else if (zzoaVar.zzc() == zzoc.INTENT) {
            zzakiVarZza.zzo(3);
        } else {
            zzakiVarZza.zzo(1);
        }
        if (zzoaVar.zzd() == AutocompleteActivityMode.FULLSCREEN) {
            zzakiVarZza.zzp(2);
        } else if (zzoaVar.zzd() == AutocompleteActivityMode.OVERLAY) {
            zzakiVarZza.zzp(1);
        }
        zzakm zzakmVar = (zzakm) zzakiVarZza.zzG();
        zzmp zzmpVar = this.zzb;
        zzaks zzaksVarZza = zzmw.zza(zzmpVar, zzmpVar.zzc());
        zzaksVarZza.zzp(10);
        zzaksVarZza.zze(zzakmVar);
        this.zza.zzb(zzaksVarZza);
    }

    @Override // com.google.android.libraries.places.internal.zzoz
    public final void zzb(zzajc zzajcVar) {
        zzmp zzmpVar = this.zzb;
        zzaks zzaksVarZza = zzmw.zza(zzmpVar, zzmpVar.zzc());
        zzaksVarZza.zzp(19);
        zzaksVarZza.zzn(zzajcVar);
        this.zza.zzb(zzaksVarZza);
    }

    @Override // com.google.android.libraries.places.internal.zzoz
    public final void zzc(zzajx zzajxVar) {
        zzmp zzmpVar = this.zzb;
        zzaks zzaksVarZza = zzmw.zza(zzmpVar, zzmpVar.zzc());
        zzaksVarZza.zzp(20);
        zzaksVarZza.zzo(zzajxVar);
        this.zza.zzb(zzaksVarZza);
    }

    public zzpa(zzmv zzmvVar, zzmp zzmpVar) {
        this.zza = zzmvVar;
        this.zzb = zzmpVar;
    }
}
