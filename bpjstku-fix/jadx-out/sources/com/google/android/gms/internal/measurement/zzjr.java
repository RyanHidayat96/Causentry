package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import androidx.collection.ArrayMap;
import defpackage.updateAndVerifyState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;

/* JADX INFO: loaded from: classes5.dex */
public final class zzjr implements zzjv {
    private final ContentResolver zzc;
    private final Uri zzd;
    private final Runnable zze;
    private volatile Map zzi;
    private static final ConcurrentMap zzb = new ConcurrentHashMap();
    public static final String[] zza = {"key", "value"};
    private ContentObserver zzf = null;
    private volatile boolean zzg = true;
    private final Object zzh = new Object();
    private final List zzj = new ArrayList();

    private zzjr(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        updateAndVerifyState.TuitionPaymentFragmentbindingInflater1(contentResolver);
        updateAndVerifyState.TuitionPaymentFragmentbindingInflater1(uri);
        this.zzc = contentResolver;
        this.zzd = uri;
        this.zze = runnable;
    }

    public static zzjr zza(final ContentResolver contentResolver, final Uri uri, final Runnable runnable) {
        zzjr zzjrVar = (zzjr) zzb.computeIfAbsent(uri, new Function() { // from class: com.google.android.gms.internal.measurement.zzjq
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                return zzjr.zzf(contentResolver, uri, runnable, (Uri) obj);
            }
        });
        try {
            if (!zzjrVar.zzg) {
                return zzjrVar;
            }
            synchronized (zzjrVar) {
                if (zzjrVar.zzg) {
                    zzjo zzjoVar = new zzjo(zzjrVar, null);
                    zzjrVar.zzc.registerContentObserver(zzjrVar.zzd, false, zzjoVar);
                    zzjrVar.zzf = zzjoVar;
                    zzjrVar.zzg = false;
                }
            }
            return zzjrVar;
        } catch (SecurityException unused) {
            return null;
        }
    }

    static void zzd() {
        Iterator it = zzb.values().iterator();
        while (it.hasNext()) {
            zzjr zzjrVar = (zzjr) it.next();
            synchronized (zzjrVar) {
                if (zzjrVar.zzg) {
                    zzjrVar.zzg = false;
                } else {
                    ContentObserver contentObserver = zzjrVar.zzf;
                    if (contentObserver != null) {
                        zzjrVar.zzc.unregisterContentObserver(contentObserver);
                        zzjrVar.zzf = null;
                    }
                }
            }
            it.remove();
        }
    }

    static /* synthetic */ zzjr zzf(ContentResolver contentResolver, Uri uri, Runnable runnable, Uri uri2) {
        return new zzjr(contentResolver, uri, runnable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final Map zzb() {
        ?? r0;
        Map mapEmptyMap;
        Map map = this.zzi;
        ?? r1 = map;
        if (map == null) {
            synchronized (this.zzh) {
                Map map2 = this.zzi;
                r0 = map2;
                if (map2 == null) {
                    ?? AllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            mapEmptyMap = (Map) zzjv.zzh(new zzju() { // from class: com.google.android.gms.internal.measurement.zzjp
                                @Override // com.google.android.gms.internal.measurement.zzju
                                public final /* synthetic */ Object zza() {
                                    return this.zza.zzg();
                                }
                            });
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(AllowThreadDiskReads);
                            throw th;
                        }
                    } catch (SQLiteException | IllegalStateException | SecurityException e2) {
                        Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e2);
                        mapEmptyMap = Collections.emptyMap();
                    }
                    StrictMode.setThreadPolicy(AllowThreadDiskReads);
                    this.zzi = mapEmptyMap;
                    AllowThreadDiskReads = mapEmptyMap;
                    r0 = AllowThreadDiskReads;
                }
            }
            r1 = r0;
        }
        return r1 != 0 ? r1 : Collections.emptyMap();
    }

    public final void zzc() {
        synchronized (this.zzh) {
            this.zzi = null;
            this.zze.run();
        }
        synchronized (this) {
            Iterator it = this.zzj.iterator();
            while (it.hasNext()) {
                ((zzjs) it.next()).zza();
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjv
    public final /* synthetic */ Object zze(String str) {
        return (String) zzb().get(str);
    }

    final /* synthetic */ Map zzg() {
        ContentResolver contentResolver = this.zzc;
        Uri uri = this.zzd;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                return Collections.emptyMap();
            }
            try {
                Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, zza, null, null, null);
                try {
                    if (cursorQuery == null) {
                        Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                        Map mapEmptyMap = Collections.emptyMap();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return mapEmptyMap;
                    }
                    int count = cursorQuery.getCount();
                    if (count == 0) {
                        Map mapEmptyMap2 = Collections.emptyMap();
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return mapEmptyMap2;
                    }
                    Map arrayMap = count <= 256 ? new ArrayMap(count) : new HashMap(count, 1.0f);
                    while (cursorQuery.moveToNext()) {
                        arrayMap.put(cursorQuery.getString(0), cursorQuery.getString(1));
                    }
                    if (cursorQuery.isAfterLast()) {
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return arrayMap;
                    }
                    Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                    Map mapEmptyMap3 = Collections.emptyMap();
                    cursorQuery.close();
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    return mapEmptyMap3;
                } catch (Throwable th) {
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (RemoteException e2) {
                Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e2);
                Map mapEmptyMap4 = Collections.emptyMap();
                contentProviderClientAcquireUnstableContentProviderClient.release();
                return mapEmptyMap4;
            }
        } catch (Throwable th3) {
            contentProviderClientAcquireUnstableContentProviderClient.release();
            throw th3;
        }
    }
}
