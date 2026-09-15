package com.google.android.libraries.places.internal;

import com.google.common.base.VerifyException;
import defpackage.CameraStateRegistryCameraRegistration;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbvz {
    static Set zza(Map map) {
        Set setZzc = zzc(map, "retryableStatusCodes");
        if (!(setZzc != null)) {
            throw new VerifyException(CameraStateRegistryCameraRegistration.b("%s is required in retry policy", "retryableStatusCodes"));
        }
        if (true ^ setZzc.contains(zzbjs.OK)) {
            return setZzc;
        }
        throw new VerifyException(CameraStateRegistryCameraRegistration.b("%s must not contain OK", "retryableStatusCodes"));
    }

    static Set zzb(Map map) {
        Set setZzc = zzc(map, "nonFatalStatusCodes");
        if (setZzc == null) {
            return Collections.unmodifiableSet(EnumSet.noneOf(zzbjs.class));
        }
        if (!setZzc.contains(zzbjs.OK)) {
            return setZzc;
        }
        throw new VerifyException(CameraStateRegistryCameraRegistration.b("%s must not contain OK", "nonFatalStatusCodes"));
    }

    private static Set zzc(Map map, String str) {
        zzbjs zzbjsVarZzg;
        List listZza = zzbqj.zza(map, str);
        if (listZza == null) {
            return null;
        }
        EnumSet enumSetNoneOf = EnumSet.noneOf(zzbjs.class);
        for (Object obj : listZza) {
            if (obj instanceof Double) {
                Double d = (Double) obj;
                int iIntValue = d.intValue();
                if (!(((double) iIntValue) == d.doubleValue())) {
                    throw new VerifyException(CameraStateRegistryCameraRegistration.b("Status code %s is not integral", obj));
                }
                zzbjsVarZzg = zzbjv.zza(iIntValue).zzg();
                if (!(zzbjsVarZzg.zza() == d.intValue())) {
                    throw new VerifyException(CameraStateRegistryCameraRegistration.b("Status code %s is not valid", obj));
                }
            } else {
                if (!(obj instanceof String)) {
                    String strValueOf = String.valueOf(obj);
                    String strValueOf2 = String.valueOf(obj.getClass());
                    StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 65 + String.valueOf(strValueOf2).length());
                    sb.append("Can not convert status code ");
                    sb.append(strValueOf);
                    sb.append(" to Status.Code, because its type is ");
                    sb.append(strValueOf2);
                    throw new VerifyException(sb.toString());
                }
                try {
                    zzbjsVarZzg = (zzbjs) Enum.valueOf(zzbjs.class, (String) obj);
                } catch (IllegalArgumentException e2) {
                    String strValueOf3 = String.valueOf(obj);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf3).length() + 25);
                    sb2.append("Status code ");
                    sb2.append(strValueOf3);
                    sb2.append(" is not valid");
                    throw new VerifyException(sb2.toString(), e2);
                }
            }
            enumSetNoneOf.add(zzbjsVarZzg);
        }
        return Collections.unmodifiableSet(enumSetNoneOf);
    }

    private zzbvz() {
    }
}
