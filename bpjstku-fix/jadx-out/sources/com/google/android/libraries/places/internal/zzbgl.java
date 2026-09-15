package com.google.android.libraries.places.internal;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbgl {
    public static final zzbey zza = zzbey.zza("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");
    private final List zzb;
    private final zzbez zzc;
    private final int zzd;

    public zzbgl(List list, zzbez zzbezVar) {
        if (!(!list.isEmpty())) {
            throw new IllegalArgumentException("addrs is empty");
        }
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.zzb = listUnmodifiableList;
        if (zzbezVar == null) {
            throw new NullPointerException("attrs");
        }
        this.zzc = zzbezVar;
        this.zzd = listUnmodifiableList.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbgl)) {
            return false;
        }
        zzbgl zzbglVar = (zzbgl) obj;
        List list = this.zzb;
        int size = list.size();
        List list2 = zzbglVar.zzb;
        if (size != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!((SocketAddress) list.get(i)).equals(list2.get(i))) {
                return false;
            }
        }
        return this.zzc.equals(zzbglVar.zzc);
    }

    public final String toString() {
        zzbez zzbezVar = this.zzc;
        String strValueOf = String.valueOf(this.zzb);
        String strValueOf2 = String.valueOf(zzbezVar);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 2 + String.valueOf(strValueOf2).length() + 1);
        sb.append("[");
        sb.append(strValueOf);
        sb.append("/");
        sb.append(strValueOf2);
        sb.append("]");
        return sb.toString();
    }

    public final int hashCode() {
        return this.zzd;
    }

    public final List zza() {
        return this.zzb;
    }

    public final zzbez zzb() {
        return this.zzc;
    }
}
