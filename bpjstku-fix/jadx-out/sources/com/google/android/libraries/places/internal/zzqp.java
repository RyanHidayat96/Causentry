package com.google.android.libraries.places.internal;

import com.google.common.collect.ImmutableSet;
import java.util.UUID;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
final class zzqp extends zzqc implements zzra {
    static final zzqf zza = new zzqg();
    public static final /* synthetic */ int zzb = 0;

    private zzqp(UUID uuid, String str, Exception exc, boolean z, zzqy zzqyVar) {
        super("<missing root>", "", "", 0, uuid, str, zzqyVar);
    }

    static zzqp zzh(zzqy zzqyVar) {
        final UUID uuidZzc = zzqn.zza().zzc();
        String strZzf = zzqc.zzf(uuidZzc);
        ImmutableSet immutableSetZza = zzqj.zza();
        if (!immutableSetZza.isEmpty()) {
            final Exception exc = null;
            immutableSetZza.forEach(new Consumer(uuidZzc, exc) { // from class: com.google.android.libraries.places.internal.zzqo
                @Override // java.util.function.Consumer
                public final /* synthetic */ void accept(Object obj) {
                    ((zzrc) obj).zza();
                }
            });
        }
        return new zzqp(uuidZzc, strZzf, zza, false, zzqyVar);
    }

    @Override // com.google.android.libraries.places.internal.zzra
    public final zzqt zzg() {
        return zzqs.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzra
    public final long zzi() {
        return -1L;
    }

    @Override // com.google.android.libraries.places.internal.zzra
    public final zzqt zzj() {
        throw null;
    }
}
