package com.google.android.gms.internal.identity;

import android.os.IBinder;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzp extends zza implements zzr {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public static int b;

    zzp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // com.google.android.gms.internal.identity.zzr
    public final void zzd(zzl zzlVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.identity.zzr
    public final void zze() throws RemoteException {
        throw null;
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i2 = i % 7149346;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i + 1;
        if (i2 != 0) {
            return b;
        }
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        b = iFreeMemory;
        return iFreeMemory;
    }
}
