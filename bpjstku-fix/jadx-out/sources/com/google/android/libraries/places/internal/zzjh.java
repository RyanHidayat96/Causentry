package com.google.android.libraries.places.internal;

import android.util.Base64;
import defpackage.getContainerClass;
import defpackage.markCameraState;
import defpackage.traceState;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class zzjh implements getContainerClass {
    final /* synthetic */ zzbdd zza;
    final /* synthetic */ zzjm zzb;

    zzjh(zzjm zzjmVar, zzbdd zzbddVar) {
        this.zza = zzbddVar;
        Objects.requireNonNull(zzjmVar);
        this.zzb = zzjmVar;
    }

    @Override // defpackage.getContainerClass
    public final void onFailure(Throwable th) {
        zzjm zzjmVar = this.zzb;
        zzjmVar.zzf(false);
        zzjmVar.zza = null;
        zzjmVar.zzb = null;
        zzjmVar.zzc = this.zza;
    }

    @Override // defpackage.getContainerClass
    public final /* synthetic */ void onSuccess(Object obj) {
        zzjm zzjmVar = this.zzb;
        zzjmVar.zzf(false);
        String strZzc = ((zzbdn) obj).zzc();
        zzbdd zzbddVar = this.zza;
        try {
            zzjmVar.zza = strZzc;
            List<String> listTuitionPaymentFragmentspecialinlinedviewModeldefault1 = new markCameraState(new markCameraState.AnonymousClass3(traceState.TuitionPaymentFragmentspecialinlinedviewModeldefault2('.'))).TuitionPaymentFragmentspecialinlinedviewModeldefault1(strZzc);
            if (listTuitionPaymentFragmentspecialinlinedviewModeldefault1.size() < 2) {
                throw new IllegalStateException("Invalid JWT format");
            }
            zzjmVar.zzb = Long.valueOf(Long.parseLong(new JSONObject(new String(Base64.decode(listTuitionPaymentFragmentspecialinlinedviewModeldefault1.get(1), 8), StandardCharsets.UTF_8)).get("exp").toString()));
            zzjmVar.zzc = zzbddVar;
        } catch (Exception e2) {
            throw new IllegalStateException("Couldn't decode JWT payload", e2);
        }
    }
}
