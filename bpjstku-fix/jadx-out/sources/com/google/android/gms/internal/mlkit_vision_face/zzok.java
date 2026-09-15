package com.google.android.gms.internal.mlkit_vision_face;

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
public final class zzok implements zzob {
    private Provider zza;
    private final Provider zzb;
    private final zznt zzc;

    public zzok(Context context, zznt zzntVar) {
        this.zzc = zzntVar;
        isInMemoryCapture isinmemorycapture = isInMemoryCapture.TuitionPaymentFragmentbindingInflater1;
        TakePictureManager1.TuitionPaymentFragmentbindingInflater1(context);
        final getCaptureFuture getcapturefutureTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TakePictureManager1.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault2(isinmemorycapture);
        if (isinmemorycapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1().contains(ProcessingNodeExternalSyntheticLambda7.TuitionPaymentFragmentspecialinlinedviewModeldefault3("json"))) {
            this.zza = new Lazy(new Provider() { // from class: com.google.android.gms.internal.mlkit_vision_face.zzoh
                @Override // com.google.firebase.inject.Provider
                public final Object get() {
                    return getcapturefutureTuitionPaymentFragmentspecialinlinedviewModeldefault2.b("FIREBASE_ML_SDK", byte[].class, ProcessingNodeExternalSyntheticLambda7.TuitionPaymentFragmentspecialinlinedviewModeldefault3("json"), new ProcessingRequest() { // from class: com.google.android.gms.internal.mlkit_vision_face.zzoj
                        @Override // defpackage.ProcessingRequest
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.zzb = new Lazy(new Provider() { // from class: com.google.android.gms.internal.mlkit_vision_face.zzoi
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return getcapturefutureTuitionPaymentFragmentspecialinlinedviewModeldefault2.b("FIREBASE_ML_SDK", byte[].class, ProcessingNodeExternalSyntheticLambda7.TuitionPaymentFragmentspecialinlinedviewModeldefault3("proto"), new ProcessingRequest() { // from class: com.google.android.gms.internal.mlkit_vision_face.zzog
                    @Override // defpackage.ProcessingRequest
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    static ProcessingNodeExternalSyntheticLambda6 zzb(zznt zzntVar, zznr zznrVar) {
        int iZza = zzntVar.zza();
        return zznrVar.zza() != 0 ? ProcessingNodeExternalSyntheticLambda6.TuitionPaymentFragmentspecialinlinedviewModeldefault3(zznrVar.zze(iZza, false)) : ProcessingNodeExternalSyntheticLambda6.b(zznrVar.zze(iZza, false));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzob
    public final void zza(zznr zznrVar) {
        if (this.zzc.zza() != 0) {
            ((getStageIds) this.zzb.get()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(zzb(this.zzc, zznrVar));
            return;
        }
        Provider provider = this.zza;
        if (provider != null) {
            ((getStageIds) provider.get()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(zzb(this.zzc, zznrVar));
        }
    }
}
