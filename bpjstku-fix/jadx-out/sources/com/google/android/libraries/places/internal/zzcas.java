package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzcas extends zzbia {
    private static final Logger zzi = Logger.getLogger(zzcas.class.getName());
    private static final int zzj = new Random().nextInt();
    protected boolean zzf;
    protected zzbfy zzh;
    private final zzbhr zzl;
    private List zzk = new ArrayList(0);
    protected final zzbic zzg = new zzbtp();

    protected zzcas(zzbhr zzbhrVar) {
        if (zzbhrVar == null) {
            throw new NullPointerException("helper");
        }
        this.zzl = zzbhrVar;
        zzi.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer", "<init>", "Created");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: addImplementationOption.4.<init>(java.lang.Iterable, int):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:309)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:224)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:93)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    @Override // com.google.android.libraries.places.internal.zzbia
    public final com.google.android.libraries.places.internal.zzbjv zza(com.google.android.libraries.places.internal.zzbhw r12) {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzcas.zza(com.google.android.libraries.places.internal.zzbhw):com.google.android.libraries.places.internal.zzbjv");
    }

    @Override // com.google.android.libraries.places.internal.zzbia
    public final void zzb(zzbjv zzbjvVar) {
        if (this.zzh != zzbfy.READY) {
            this.zzl.zzb(zzbfy.TRANSIENT_FAILURE, new zzbhq(zzbht.zzb(zzbjvVar)));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbia
    public final void zzc() {
        zzi.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer", "shutdown", "Shutdown");
        Iterator it = this.zzk.iterator();
        while (it.hasNext()) {
            ((zzcaq) it.next()).zzb();
        }
        this.zzk.clear();
    }

    protected abstract void zze();

    protected final List zzi() {
        ArrayList arrayList = new ArrayList();
        for (zzcaq zzcaqVar : this.zzk) {
            if (zzcaqVar.zzf() == zzbfy.READY) {
                arrayList.add(zzcaqVar);
            }
        }
        return arrayList;
    }

    protected zzcaq zzf(Object obj) {
        throw null;
    }

    protected final zzbhr zzg() {
        return this.zzl;
    }

    public final Collection zzh() {
        return this.zzk;
    }

    final /* synthetic */ zzbhr zzk() {
        return this.zzl;
    }
}
