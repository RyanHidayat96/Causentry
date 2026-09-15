package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes6.dex */
public class zzbaa extends zzazy implements zzbbm {
    protected zzbaa(zzbab zzbabVar) {
        super(zzbabVar);
    }

    @Override // com.google.android.libraries.places.internal.zzazy, com.google.android.libraries.places.internal.zzbbk
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbab zzF() {
        if (!((zzbab) this.zza).zzbd()) {
            return (zzbab) this.zza;
        }
        ((zzbab) this.zza).zzb.zzb();
        return (zzbab) super.zzF();
    }

    @Override // com.google.android.libraries.places.internal.zzazy
    protected final void zzz() {
        super.zzz();
        if (((zzbab) this.zza).zzb != zzazu.zza()) {
            zzbab zzbabVar = (zzbab) this.zza;
            zzbabVar.zzb = zzbabVar.zzb.clone();
        }
    }
}
