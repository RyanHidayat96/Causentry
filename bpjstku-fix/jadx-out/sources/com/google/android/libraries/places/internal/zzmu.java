package com.google.android.libraries.places.internal;

import android.content.Context;
import com.google.android.datatransport.Priority;
import com.google.common.util.concurrent.DirectExecutor;
import defpackage.ProcessingNodeExternalSyntheticLambda0;
import defpackage.ProcessingNodeExternalSyntheticLambda7;
import defpackage.ProcessingNodeInputPacket;
import defpackage.TakePictureManager1;
import defpackage.TakePictureManagerExternalSyntheticLambda2;
import defpackage.decrementRetryCounter;
import defpackage.getCloseFuture;
import defpackage.getStageIds;
import defpackage.retryRequest;

/* JADX INFO: loaded from: classes3.dex */
public final class zzmu implements zzmv {
    private static final Integer zza = 79508299;
    private final getStageIds zzb;
    private final zzeo zzc;

    public static getStageIds zza(Context context) {
        TakePictureManager1.TuitionPaymentFragmentbindingInflater1(context.getApplicationContext());
        decrementRetryCounter decrementretrycounter = TakePictureManager1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (decrementretrycounter == null) {
            throw new IllegalStateException("Not initialized!");
        }
        return new TakePictureManagerExternalSyntheticLambda2(TakePictureManager1.b(null), retryRequest.b().TuitionPaymentFragmentbindingInflater1("cct").TuitionPaymentFragmentspecialinlinedviewModeldefault2(), decrementretrycounter.TuitionPaymentFragmentspecialinlinedviewModeldefault2()).b("LE", zzuk.class, new ProcessingNodeExternalSyntheticLambda7("proto"), zzmt.zza);
    }

    @Override // com.google.android.libraries.places.internal.zzmv
    public final void zzb(zzaks zzaksVar) {
        getCloseFuture.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.zzc.zza(), new zzms(this, zzaksVar), DirectExecutor.INSTANCE);
    }

    final /* synthetic */ void zzc(zzaks zzaksVar) {
        zzakz zzakzVar = (zzakz) zzaksVar.zzG();
        zzui zzuiVarZza = zzuk.zza();
        zzuiVarZza.zzb(1);
        zzuiVarZza.zza(zzakzVar);
        this.zzb.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new ProcessingNodeExternalSyntheticLambda0((zzuk) zzuiVarZza.zzG(), Priority.DEFAULT, new ProcessingNodeInputPacket(zza)));
    }

    public zzmu(getStageIds getstageids, zzeo zzeoVar) {
        this.zzb = getstageids;
        this.zzc = zzeoVar;
    }
}
