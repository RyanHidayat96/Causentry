package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes4.dex */
final class zzb extends com.google.android.gms.internal.common.zzh {
    final /* synthetic */ BaseGmsClient zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzb(BaseGmsClient baseGmsClient, Looper looper) {
        super(looper);
        this.zza = baseGmsClient;
    }

    private static final void zza(Message message) {
        zzc zzcVar = (zzc) message.obj;
        zzcVar.zzc();
        zzcVar.zzg();
    }

    private static final boolean zzb(Message message) {
        return message.what == 2 || message.what == 1 || message.what == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Throwable {
        if (this.zza.zzd.get() != message.arg1) {
            if (zzb(message)) {
                zza(message);
                return;
            }
            return;
        }
        if ((message.what == 1 || message.what == 7 || ((message.what == 4 && !this.zza.enableLocalFallback()) || message.what == 5)) && !this.zza.isConnecting()) {
            zza(message);
            return;
        }
        if (message.what == 4) {
            BaseGmsClient.zzg(this.zza, new ConnectionResult(message.arg2));
            if (BaseGmsClient.zzo(this.zza)) {
                BaseGmsClient baseGmsClient = this.zza;
                if (!BaseGmsClient.zzm(baseGmsClient)) {
                    BaseGmsClient.zzi(baseGmsClient, 3, null);
                    return;
                }
            }
            BaseGmsClient baseGmsClient2 = this.zza;
            ConnectionResult connectionResultZza = BaseGmsClient.zza(baseGmsClient2) != null ? BaseGmsClient.zza(baseGmsClient2) : new ConnectionResult(8);
            this.zza.zzc.onReportServiceBinding(connectionResultZza);
            this.zza.onConnectionFailed(connectionResultZza);
            return;
        }
        if (message.what == 5) {
            BaseGmsClient baseGmsClient3 = this.zza;
            ConnectionResult connectionResultZza2 = BaseGmsClient.zza(baseGmsClient3) != null ? BaseGmsClient.zza(baseGmsClient3) : new ConnectionResult(8);
            this.zza.zzc.onReportServiceBinding(connectionResultZza2);
            this.zza.onConnectionFailed(connectionResultZza2);
            return;
        }
        if (message.what == 3) {
            ConnectionResult connectionResult = new ConnectionResult(message.arg2, message.obj instanceof PendingIntent ? (PendingIntent) message.obj : null);
            this.zza.zzc.onReportServiceBinding(connectionResult);
            this.zza.onConnectionFailed(connectionResult);
            return;
        }
        if (message.what == 6) {
            BaseGmsClient.zzi(this.zza, 5, null);
            BaseGmsClient baseGmsClient4 = this.zza;
            if (BaseGmsClient.zzb(baseGmsClient4) != null) {
                BaseGmsClient.zzb(baseGmsClient4).onConnectionSuspended(message.arg2);
            }
            this.zza.onConnectionSuspended(message.arg2);
            BaseGmsClient.zzn(this.zza, 5, 1, null);
            return;
        }
        if (message.what == 2 && !this.zza.isConnected()) {
            zza(message);
            return;
        }
        if (zzb(message)) {
            ((zzc) message.obj).zze();
            return;
        }
        Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
    }
}
