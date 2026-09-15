package com.google.android.libraries.places.internal;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* JADX INFO: loaded from: classes3.dex */
final class zzbsd extends WeakReference {
    private static final boolean zza = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));
    private static final RuntimeException zzb;
    private final ReferenceQueue zzc;
    private final ConcurrentMap zzd;
    private final String zze;
    private final Reference zzf;
    private final AtomicBoolean zzg;

    static {
        RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
        runtimeException.setStackTrace(new StackTraceElement[0]);
        zzb = runtimeException;
    }

    zzbsd(zzbse zzbseVar, zzbif zzbifVar, ReferenceQueue referenceQueue, ConcurrentMap concurrentMap) {
        super(zzbseVar, referenceQueue);
        this.zzg = new AtomicBoolean();
        this.zzf = new SoftReference(zza ? new RuntimeException("ManagedChannel allocation site") : zzb);
        this.zze = zzbifVar.toString();
        this.zzc = referenceQueue;
        this.zzd = concurrentMap;
        concurrentMap.put(this, this);
        zza(referenceQueue);
    }

    static int zza(ReferenceQueue referenceQueue) {
        int i = 0;
        while (true) {
            zzbsd zzbsdVar = (zzbsd) referenceQueue.poll();
            if (zzbsdVar == null) {
                return i;
            }
            RuntimeException runtimeException = (RuntimeException) zzbsdVar.zzf.get();
            zzbsdVar.zzc();
            if (!zzbsdVar.zzg.get()) {
                i++;
                Level level = Level.SEVERE;
                if (zzbse.zzc.isLoggable(level)) {
                    String property = System.getProperty("line.separator");
                    StringBuilder sb = new StringBuilder(String.valueOf(property).length() + 127);
                    sb.append("*~*~*~ Previous channel {0} was garbage collected without being shut down! ~*~*~*");
                    sb.append(property);
                    sb.append("    Make sure to call shutdown()/shutdownNow()");
                    LogRecord logRecord = new LogRecord(level, sb.toString());
                    logRecord.setLoggerName(zzbse.zzc.getName());
                    logRecord.setParameters(new Object[]{zzbsdVar.zze});
                    logRecord.setThrown(runtimeException);
                    zzbse.zzc.log(logRecord);
                }
            }
        }
    }

    private final void zzc() {
        super.clear();
        this.zzd.remove(this);
        this.zzf.clear();
    }

    @Override // java.lang.ref.Reference
    public final void clear() {
        zzc();
        zza(this.zzc);
    }

    final /* synthetic */ void zzb() {
        if (this.zzg.getAndSet(true)) {
            return;
        }
        clear();
    }
}
