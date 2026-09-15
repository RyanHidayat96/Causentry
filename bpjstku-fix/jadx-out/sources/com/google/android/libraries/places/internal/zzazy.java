package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzazy;
import com.google.android.libraries.places.internal.zzbae;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class zzazy<MessageType extends zzbae<MessageType, BuilderType>, BuilderType extends zzazy<MessageType, BuilderType>> extends zzayl<MessageType, BuilderType> {
    protected zzbae zza;
    private final zzbae zzb;

    protected zzazy(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzbd()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = messagetype.zzbg();
    }

    private static void zza(Object obj, Object obj2) {
        zzbbv.zza().zzb(obj.getClass()).zzd(obj, obj2);
    }

    @Override // com.google.android.libraries.places.internal.zzayl
    /* JADX INFO: renamed from: zzB, reason: merged with bridge method [inline-methods] */
    public final zzazy clone() {
        zzazy zzazyVar = (zzazy) this.zzb.zzb(5, null, null);
        zzazyVar.zza = zzF();
        return zzazyVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbbk
    /* JADX INFO: renamed from: zzC, reason: merged with bridge method [inline-methods] */
    public MessageType zzF() {
        if (!this.zza.zzbd()) {
            return (MessageType) this.zza;
        }
        this.zza.zzbi();
        return (MessageType) this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzbbk
    /* JADX INFO: renamed from: zzD, reason: merged with bridge method [inline-methods] */
    public final MessageType zzG() {
        MessageType messagetype = (MessageType) zzF();
        if (messagetype.zzbA()) {
            return messagetype;
        }
        throw new zzbcl(messagetype);
    }

    public final zzazy zzE(zzbae zzbaeVar) {
        if (!this.zzb.equals(zzbaeVar)) {
            if (!this.zza.zzbd()) {
                zzz();
            }
            zza(this.zza, zzbaeVar);
        }
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzbbm
    public final boolean zzbA() {
        return zzbae.zze(this.zza, false);
    }

    @Override // com.google.android.libraries.places.internal.zzayl
    protected final /* synthetic */ zzayl zzu(zzaym zzaymVar) {
        zzE((zzbae) zzaymVar);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzayl, com.google.android.libraries.places.internal.zzbbk
    public final /* synthetic */ zzbbk zzx(zzazc zzazcVar, zzazp zzazpVar) throws IOException {
        if (!this.zza.zzbd()) {
            zzz();
        }
        try {
            zzbbv.zza().zzb(this.zza.getClass()).zzg(this.zza, zzazd.zza(zzazcVar), zzazpVar);
            return this;
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof IOException) {
                throw ((IOException) e2.getCause());
            }
            throw e2;
        }
    }

    protected final void zzy() {
        if (this.zza.zzbd()) {
            return;
        }
        zzz();
    }

    protected void zzz() {
        zzbae zzbaeVarZzbg = this.zzb.zzbg();
        zza(zzbaeVarZzbg, this.zza);
        this.zza = zzbaeVarZzbg;
    }

    @Override // com.google.android.libraries.places.internal.zzbbm
    public final /* synthetic */ zzbbl zzbB() {
        return this.zzb;
    }
}
