package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import com.google.firebase.components.Lazy;
import com.google.firebase.inject.Provider;
import defpackage.ProcessingNodeExternalSyntheticLambda6;
import defpackage.ProcessingNodeExternalSyntheticLambda7;
import defpackage.ProcessingRequest;
import defpackage.TakePictureManager1;
import defpackage.getCaptureFuture;
import defpackage.getStageIds;
import defpackage.isInMemoryCapture;

/* JADX INFO: loaded from: classes6.dex */
public final class zzmy implements zzmp {
    private Provider zza;
    private final Provider zzb;
    private final zzmj zzc;

    public zzmy(Context context, zzmj zzmjVar) {
        this.zzc = zzmjVar;
        isInMemoryCapture isinmemorycapture = isInMemoryCapture.TuitionPaymentFragmentbindingInflater1;
        TakePictureManager1.TuitionPaymentFragmentbindingInflater1(context);
        final getCaptureFuture getcapturefutureTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TakePictureManager1.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault2(isinmemorycapture);
        if (isinmemorycapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1().contains(ProcessingNodeExternalSyntheticLambda7.TuitionPaymentFragmentspecialinlinedviewModeldefault3("json"))) {
            this.zza = new Lazy(new Provider() { // from class: com.google.android.gms.internal.mlkit_common.zzmv
                @Override // com.google.firebase.inject.Provider
                public final Object get() {
                    return getcapturefutureTuitionPaymentFragmentspecialinlinedviewModeldefault2.b("FIREBASE_ML_SDK", byte[].class, ProcessingNodeExternalSyntheticLambda7.TuitionPaymentFragmentspecialinlinedviewModeldefault3("json"), new ProcessingRequest() { // from class: com.google.android.gms.internal.mlkit_common.zzmx
                        @Override // defpackage.ProcessingRequest
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.zzb = new Lazy(new Provider() { // from class: com.google.android.gms.internal.mlkit_common.zzmw
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return getcapturefutureTuitionPaymentFragmentspecialinlinedviewModeldefault2.b("FIREBASE_ML_SDK", byte[].class, ProcessingNodeExternalSyntheticLambda7.TuitionPaymentFragmentspecialinlinedviewModeldefault3("proto"), new ProcessingRequest() { // from class: com.google.android.gms.internal.mlkit_common.zzmu
                    @Override // defpackage.ProcessingRequest
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    static ProcessingNodeExternalSyntheticLambda6 zzb(zzmj zzmjVar, zzmh zzmhVar) {
        return ProcessingNodeExternalSyntheticLambda6.b(zzmhVar.zze(zzmjVar.zza(), false));
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzmp
    public final void zza(zzmh zzmhVar) {
        if (this.zzc.zza() != 0) {
            ((getStageIds) this.zzb.get()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(zzb(this.zzc, zzmhVar));
            return;
        }
        Provider provider = this.zza;
        if (provider != null) {
            ((getStageIds) provider.get()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(zzb(this.zzc, zzmhVar));
        }
    }
}
