package com.google.android.libraries.places.internal;

import java.util.Objects;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes3.dex */
public class zzcaq {
    final /* synthetic */ zzcas zza;
    private final Object zzb;
    private final zzbia zzc;
    private zzbfy zzd;
    private zzbhy zze;

    public zzcaq(zzcas zzcasVar, Object obj, zzbhp zzbhpVar) {
        Objects.requireNonNull(zzcasVar);
        this.zza = zzcasVar;
        this.zze = new zzbhq(zzbht.zzd());
        this.zzb = obj;
        this.zzc = zzbhpVar.zza(zza());
        this.zzd = zzbfy.CONNECTING;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzb);
        String strValueOf2 = String.valueOf(this.zzd);
        String strValueOf3 = String.valueOf(this.zze.getClass());
        String strValueOf4 = String.valueOf(this.zzc);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 20 + String.valueOf(strValueOf2).length() + 15 + String.valueOf(strValueOf3).length() + 6 + String.valueOf(strValueOf4).length());
        sb.append("Address = ");
        sb.append(strValueOf);
        sb.append(", state = ");
        sb.append(strValueOf2);
        sb.append(", picker type: ");
        sb.append(strValueOf3);
        sb.append(", lb: ");
        sb.append(strValueOf4);
        return sb.toString();
    }

    protected zzcap zza() {
        return new zzcap(this);
    }

    protected final void zzb() {
        this.zzc.zzc();
        this.zzd = zzbfy.SHUTDOWN;
        zzcas.zzi.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer$ChildLbState", "shutdown", "Child balancer {0} deleted", this.zzb);
    }

    public final Object zzc() {
        return this.zzb;
    }

    public final zzbia zzd() {
        return this.zzc;
    }

    public final zzbhy zze() {
        return this.zze;
    }

    public final zzbfy zzf() {
        return this.zzd;
    }

    final /* synthetic */ zzbia zzg() {
        return this.zzc;
    }

    final /* synthetic */ zzbfy zzh() {
        return this.zzd;
    }

    final /* synthetic */ void zzi(zzbfy zzbfyVar) {
        this.zzd = zzbfyVar;
    }

    final /* synthetic */ void zzj(zzbhy zzbhyVar) {
        this.zze = zzbhyVar;
    }
}
