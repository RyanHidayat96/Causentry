package com.google.android.libraries.places.internal;

import com.google.common.collect.ImmutableList;
import defpackage.setPreviewStabilization;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class zzaqa extends zzbgp {
    private final ImmutableList zza;
    private final LinkedHashMap zzb;
    private final Queue zzc;
    private final LinkedHashMap zzd;
    private final Set zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private zzbip zzi;
    private zzbjv zzj;
    private zzbip zzk;

    zzaqa(zzbfh zzbfhVar, ImmutableList immutableList, Set set, Executor executor) {
        super(zzbfhVar);
        this.zzb = new LinkedHashMap();
        this.zzc = new ArrayDeque();
        this.zzd = new LinkedHashMap();
        this.zza = immutableList;
        this.zzf = immutableList.size();
        this.zze = set;
    }

    private final boolean zzf() {
        return !this.zzb.isEmpty();
    }

    private final void zzg() {
        if (this.zzg) {
            Queue<zzapz> queue = this.zzc;
            for (zzapz zzapzVar : queue) {
                Iterator it = setPreviewStabilization.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.zza.subList(0, zzapzVar.zzd())).iterator();
                while (it.hasNext()) {
                    Iterator it2 = setPreviewStabilization.TuitionPaymentFragmentspecialinlinedviewModeldefault3((List) it.next()).iterator();
                    while (it2.hasNext()) {
                        if (this.zze.contains((zzapa) it2.next()) && zzapzVar.zzc() == null) {
                            throw new NullPointerException("Response message cannot be null");
                        }
                    }
                    if (!zzapzVar.zza()) {
                        return;
                    } else {
                        zzapzVar.zze(zzapzVar.zzd() - 1);
                    }
                }
            }
            while (!queue.isEmpty() && ((zzapz) queue.peek()).zzb()) {
                zze().zzb(((zzapz) queue.poll()).zzc());
            }
            zzh();
        }
    }

    private final void zzh() {
        if (!zzf() && this.zzc.isEmpty() && this.zzh) {
            Iterator it = setPreviewStabilization.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.zza).iterator();
            while (it.hasNext()) {
                for (zzapa zzapaVar : setPreviewStabilization.TuitionPaymentFragmentspecialinlinedviewModeldefault3((List) it.next())) {
                    zzbjv zzbjvVar = this.zzj;
                    zzbip zzbipVar = this.zzk;
                    this.zze.contains(zzapaVar);
                }
            }
            if (this.zzd.isEmpty()) {
                zze().zzc(this.zzj, this.zzk);
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbfh
    public final void zza(zzbip zzbipVar) {
        this.zzi = zzbipVar;
        for (List list : setPreviewStabilization.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.zza.subList(0, this.zzf))) {
            this.zzf--;
            Iterator it = setPreviewStabilization.TuitionPaymentFragmentspecialinlinedviewModeldefault3(list).iterator();
            while (it.hasNext()) {
                this.zze.contains((zzapa) it.next());
            }
            if (zzf()) {
                return;
            }
        }
        zze().zza(this.zzi);
        this.zzg = true;
        zzg();
    }

    @Override // com.google.android.libraries.places.internal.zzbfh
    public final void zzb(Object obj) {
        this.zzc.add(new zzapz(this, obj, this.zza.size()));
        zzg();
    }

    @Override // com.google.android.libraries.places.internal.zzbfh
    public final void zzc(zzbjv zzbjvVar, zzbip zzbipVar) {
        this.zzj = zzbjvVar;
        this.zzk = zzbipVar;
        this.zzh = true;
        zzh();
    }
}
