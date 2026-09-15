package com.google.android.libraries.places.internal;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfc {
    private static final long zza = TimeUnit.SECONDS.toMillis(30);
    private final FusedLocationProviderClient zzb;
    private final zzlr zzc;
    private final Context zzd;

    public final Task zza(CancellationToken cancellationToken) {
        CurrentLocationRequest.Builder builder = new CurrentLocationRequest.Builder();
        long j = zza;
        CurrentLocationRequest.Builder durationMillis = builder.setDurationMillis(j);
        if (ContextCompat.checkSelfPermission(this.zzd, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            durationMillis.setPriority(100);
        } else {
            durationMillis.setPriority(102);
        }
        return this.zzc.zza(this.zzb.getCurrentLocation(durationMillis.build(), cancellationToken), cancellationToken, j, "Location timeout.").continueWithTask(new zzfb(this));
    }

    zzfc(Context context, FusedLocationProviderClient fusedLocationProviderClient, zzlr zzlrVar) {
        this.zzd = context;
        this.zzb = fusedLocationProviderClient;
        this.zzc = zzlrVar;
    }
}
