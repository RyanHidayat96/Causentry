package com.google.android.libraries.places.internal;

import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes3.dex */
public final class zzapd {
    static /* synthetic */ void zzb(zzbiu zzbiuVar, Class cls, boolean z) throws zzbjw {
        Class clsZzc;
        boolean z2;
        try {
            clsZzc = ((zzbit) (z ? zzbiuVar.zzf() : zzbiuVar.zzg())).zzc();
            z2 = false;
        } catch (ClassCastException unused) {
            clsZzc = Object.class;
            z2 = true;
        }
        if (cls.isAssignableFrom(clsZzc)) {
            return;
        }
        String str = true != z ? "response" : "request";
        zzbjv zzbjvVar = zzbjv.zzh;
        String strZzb = zzbiuVar.zzb();
        String name = clsZzc.getName();
        String str2 = true != z2 ? "" : ", assumed because method doesn't use ReflectableMarshaller";
        String string = cls.toString();
        StringBuilder sb = new StringBuilder(str.length() + 52 + String.valueOf(strZzb).length() + 2 + String.valueOf(name).length() + str2.length() + 24 + string.length());
        sb.append("AsyncClientInterceptor: The ");
        sb.append(str);
        sb.append(" message type of method ");
        sb.append(strZzb);
        sb.append(" (");
        sb.append(name);
        sb.append(str2);
        sb.append(") must be a subclass of ");
        sb.append(string);
        throw new zzbjw(zzbjvVar.zze(sb.toString()), null);
    }

    public static zzbfj zza(final zzcbd zzcbdVar) {
        return new zzapc(new zzcbd() { // from class: com.google.android.libraries.places.internal.zzapb
            @Override // com.google.android.libraries.places.internal.zzcbd
            public final /* synthetic */ Object zzb() {
                return ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault3(((zzew) zzcbdVar).zzb());
            }
        }, 2, zzbbl.class, zzbbl.class);
    }
}
