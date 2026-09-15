package com.google.android.libraries.places.internal;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.google.common.io.BaseEncoding;
import defpackage.getSensorRect;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zzmh {
    public static String zza(PackageManager packageManager, String str) {
        if (getSensorRect.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new ArrayList()) != 0) {
            throw null;
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            if (packageInfo != null && packageInfo.signatures != null && packageInfo.signatures.length != 0 && packageInfo.signatures[0] != null) {
                return zzb(packageInfo.signatures[0]);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    private static String zzb(Signature signature) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA-1").digest(signature.toByteArray());
            return BaseEncoding.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault1(bArrDigest, bArrDigest.length);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
