package com.google.android.libraries.places.internal;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.OnTokenCanceledListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfr {
    private final RequestQueue zza;
    private final zzkr zzb;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void zzd(TaskCompletionSource taskCompletionSource, VolleyError volleyError) {
        try {
            taskCompletionSource.trySetException(zzfl.zza(volleyError));
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void zzb(Class cls, TaskCompletionSource taskCompletionSource, JSONObject jSONObject) {
        try {
            try {
                taskCompletionSource.trySetResult((zzga) this.zzb.zza(jSONObject.toString(), cls));
            } catch (zzgb e2) {
                taskCompletionSource.trySetException(new ApiException(new Status(8, e2.getMessage())));
            }
        } catch (Error | RuntimeException e3) {
            zzmr.zzb(e3);
            throw e3;
        }
    }

    public final Task zza(zzfz zzfzVar, final Class cls) {
        String strZzd = zzfzVar.zzd();
        Map mapZzc = zzfzVar.zzc();
        CancellationToken cancellationTokenZzb = zzfzVar.zzb();
        final TaskCompletionSource taskCompletionSource = cancellationTokenZzb != null ? new TaskCompletionSource(cancellationTokenZzb) : new TaskCompletionSource();
        final zzfn zzfnVar = new zzfn(this, 0, strZzd, null, new Response.Listener() { // from class: com.google.android.libraries.places.internal.zzfp
            @Override // com.android.volley.Response.Listener
            public final /* synthetic */ void onResponse(Object obj) {
                this.zza.zzb(cls, taskCompletionSource, (JSONObject) obj);
            }
        }, new Response.ErrorListener() { // from class: com.google.android.libraries.places.internal.zzfo
            @Override // com.android.volley.Response.ErrorListener
            public final /* synthetic */ void onErrorResponse(VolleyError volleyError) {
                zzfr.zzd(taskCompletionSource, volleyError);
            }
        }, mapZzc);
        if (cancellationTokenZzb != null) {
            cancellationTokenZzb.onCanceledRequested(new OnTokenCanceledListener() { // from class: com.google.android.libraries.places.internal.zzfq
                @Override // com.google.android.gms.tasks.OnTokenCanceledListener
                public final /* synthetic */ void onCanceled() {
                    zzfnVar.cancel();
                }
            });
        }
        this.zza.add(zzfnVar);
        return taskCompletionSource.getTask();
    }

    zzfr(RequestQueue requestQueue, zzkr zzkrVar) {
        this.zza = requestQueue;
        this.zzb = zzkrVar;
    }
}
