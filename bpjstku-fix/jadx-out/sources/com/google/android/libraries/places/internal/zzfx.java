package com.google.android.libraries.places.internal;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.OnTokenCanceledListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfx {
    private final RequestQueue zza;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x002e A[Catch: Error | RuntimeException -> 0x0036, Error -> 0x0038, TryCatch #2 {Error | RuntimeException -> 0x0036, blocks: (B:2:0x0000, B:4:0x0004, B:8:0x0010, B:11:0x0032, B:9:0x001f, B:10:0x002e), top: B:18:0x0000 }] */
    public static /* synthetic */ void zzd(TaskCompletionSource taskCompletionSource, VolleyError volleyError) {
        ApiException apiExceptionZza;
        try {
            if (volleyError.networkResponse == null) {
                apiExceptionZza = zzfl.zza(volleyError);
            } else {
                int i = volleyError.networkResponse.statusCode;
                if (i == 400) {
                    apiExceptionZza = new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, "The provided parameters are invalid (did you include a max width or height?)."));
                } else if (i == 403) {
                    apiExceptionZza = new ApiException(new Status(PlacesStatusCodes.REQUEST_DENIED, "The provided API key is invalid."));
                } else {
                    apiExceptionZza = zzfl.zza(volleyError);
                }
            }
            taskCompletionSource.trySetException(apiExceptionZza);
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void zze(zzkb zzkbVar, TaskCompletionSource taskCompletionSource, Bitmap bitmap) {
        try {
            zzkbVar.zzb(bitmap);
            taskCompletionSource.trySetResult(zzkbVar.zza());
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    public final Task zzb(zzfz zzfzVar, final zzkb zzkbVar) {
        String strZzd = zzfzVar.zzd();
        Map mapZzc = zzfzVar.zzc();
        CancellationToken cancellationTokenZzb = zzfzVar.zzb();
        final TaskCompletionSource taskCompletionSource = cancellationTokenZzb != null ? new TaskCompletionSource(cancellationTokenZzb) : new TaskCompletionSource();
        final zzft zzftVar = new zzft(this, strZzd, new Response.Listener() { // from class: com.google.android.libraries.places.internal.zzfv
            @Override // com.android.volley.Response.Listener
            public final /* synthetic */ void onResponse(Object obj) {
                zzfx.zze(zzkbVar, taskCompletionSource, (Bitmap) obj);
            }
        }, 0, 0, ImageView.ScaleType.CENTER, Bitmap.Config.ARGB_8888, new Response.ErrorListener() { // from class: com.google.android.libraries.places.internal.zzfu
            @Override // com.android.volley.Response.ErrorListener
            public final /* synthetic */ void onErrorResponse(VolleyError volleyError) {
                zzfx.zzd(taskCompletionSource, volleyError);
            }
        }, mapZzc);
        if (cancellationTokenZzb != null) {
            cancellationTokenZzb.onCanceledRequested(new OnTokenCanceledListener() { // from class: com.google.android.libraries.places.internal.zzfw
                @Override // com.google.android.gms.tasks.OnTokenCanceledListener
                public final /* synthetic */ void onCanceled() {
                    zzftVar.cancel();
                }
            });
        }
        this.zza.add(zzftVar);
        return taskCompletionSource.getTask();
    }

    zzfx(RequestQueue requestQueue) {
        this.zza = requestQueue;
    }
}
