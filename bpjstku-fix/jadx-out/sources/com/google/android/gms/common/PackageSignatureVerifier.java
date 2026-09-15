package com.google.android.gms.common;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public class PackageSignatureVerifier {
    static volatile zzab zza;
    private static zzac zzb;

    private static zzac zza(Context context) {
        zzac zzacVar;
        synchronized (PackageSignatureVerifier.class) {
            if (zzb == null) {
                zzb = new zzac(context);
            }
            zzacVar = zzb;
        }
        return zzacVar;
    }

    public PackageVerificationResult queryPackageSignatureVerified(Context context, String str) {
        boolean zHonorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(context);
        zza(context);
        if (!zzn.zzf()) {
            throw new zzad();
        }
        String strConcat = String.valueOf(str).concat(true != zHonorsDebugCertificates ? "-0" : "-1");
        if (zza != null && zza.zza.equals(strConcat)) {
            return zza.zzb;
        }
        zza(context);
        zzw zzwVarZzc = zzn.zzc(str, zHonorsDebugCertificates, false, false);
        if (!zzwVarZzc.zza) {
            Preconditions.checkNotNull(zzwVarZzc.zzb);
            return PackageVerificationResult.zza(str, zzwVarZzc.zzb, zzwVarZzc.zzc);
        }
        zzab zzabVar = new zzab(strConcat, PackageVerificationResult.zzd(str, zzwVarZzc.zzd));
        zza = zzabVar;
        return zzabVar.zzb;
    }

    public PackageVerificationResult queryPackageSignatureVerifiedWithRetry(Context context, String str) {
        try {
            PackageVerificationResult packageVerificationResultQueryPackageSignatureVerified = queryPackageSignatureVerified(context, str);
            packageVerificationResultQueryPackageSignatureVerified.zzb();
            return packageVerificationResultQueryPackageSignatureVerified;
        } catch (SecurityException unused) {
            PackageVerificationResult packageVerificationResultQueryPackageSignatureVerified2 = queryPackageSignatureVerified(context, str);
            packageVerificationResultQueryPackageSignatureVerified2.zzc();
            return packageVerificationResultQueryPackageSignatureVerified2;
        }
    }
}
