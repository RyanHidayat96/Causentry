package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes6.dex */
final class zax implements zabz {
    final /* synthetic */ zaaa zaa;

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zaa(ConnectionResult connectionResult) {
        zaaa.zaj(this.zaa).lock();
        try {
            zaaa.zak(this.zaa, connectionResult);
            zaaa.zap(this.zaa);
        } finally {
            zaaa.zaj(this.zaa).unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zab(Bundle bundle) {
        zaaa.zaj(this.zaa).lock();
        try {
            zaaa.zao(this.zaa, bundle);
            zaaa.zak(this.zaa, ConnectionResult.RESULT_SUCCESS);
            zaaa.zap(this.zaa);
        } finally {
            zaaa.zaj(this.zaa).unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zac(int i, boolean z) {
        zaaa.zaj(this.zaa).lock();
        try {
            zaaa zaaaVar = this.zaa;
            if (zaaa.zav(zaaaVar) || zaaa.zaa(zaaaVar) == null || !zaaa.zaa(zaaaVar).isSuccess()) {
                zaaa.zam(this.zaa, false);
                zaaa.zan(this.zaa, i, z);
            } else {
                zaaa.zam(this.zaa, true);
                zaaa.zai(this.zaa).onConnectionSuspended(i);
            }
        } finally {
            zaaa.zaj(this.zaa).unlock();
        }
    }

    /* synthetic */ zax(zaaa zaaaVar, zaw zawVar) {
        this.zaa = zaaaVar;
    }
}
