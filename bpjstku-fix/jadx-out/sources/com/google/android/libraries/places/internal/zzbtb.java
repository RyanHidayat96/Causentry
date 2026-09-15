package com.google.android.libraries.places.internal;

import java.net.Inet4Address;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzbtb {
    private List zza;
    private int zzb = 0;
    private final boolean zzc;

    zzbtb(List list, boolean z) {
        this.zzc = z;
        zzg(list);
    }

    private static final List zzj(List list, List list2) {
        if (list.isEmpty()) {
            return list2;
        }
        if (list2.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        for (int i = 0; i < Math.max(list.size(), list2.size()); i++) {
            if (i < list.size()) {
                arrayList.add((zzbta) list.get(i));
            }
            if (i < list2.size()) {
                arrayList.add((zzbta) list2.get(i));
            }
        }
        return arrayList;
    }

    public final boolean zza() {
        return this.zzb < this.zza.size();
    }

    public final boolean zzb() {
        if (!zza()) {
            return false;
        }
        this.zzb++;
        return zza();
    }

    public final SocketAddress zzd() {
        if (zza()) {
            return ((zzbta) this.zza.get(this.zzb)).zzc();
        }
        throw new IllegalStateException("Index is past the end of the address group list");
    }

    public final zzbez zze() {
        if (zza()) {
            return ((zzbta) this.zza.get(this.zzb)).zzb();
        }
        throw new IllegalStateException("Index is off the end of the address group list");
    }

    public final List zzf() {
        if (zza()) {
            return Collections.singletonList(((zzbta) this.zza.get(this.zzb)).zza());
        }
        throw new IllegalStateException("Index is past the end of the address group list");
    }

    public final void zzg(List list) {
        List listZzj;
        if (list == null) {
            throw new NullPointerException("newGroups");
        }
        if (this.zzc) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Boolean bool = null;
            for (int i = 0; i < list.size(); i++) {
                zzbgl zzbglVar = (zzbgl) list.get(i);
                for (int i2 = 0; i2 < zzbglVar.zza().size(); i2++) {
                    SocketAddress socketAddress = (SocketAddress) zzbglVar.zza().get(i2);
                    if ((socketAddress instanceof InetSocketAddress) && (((InetSocketAddress) socketAddress).getAddress() instanceof Inet4Address)) {
                        if (bool == null) {
                            bool = Boolean.FALSE;
                        }
                        arrayList.add(new zzbta(zzbglVar.zzb(), socketAddress));
                    } else {
                        if (bool == null) {
                            bool = Boolean.TRUE;
                        }
                        arrayList2.add(new zzbta(zzbglVar.zzb(), socketAddress));
                    }
                }
            }
            listZzj = (bool == null || !bool.booleanValue()) ? zzj(arrayList, arrayList2) : zzj(arrayList2, arrayList);
        } else {
            ArrayList arrayList3 = new ArrayList();
            for (int i3 = 0; i3 < list.size(); i3++) {
                zzbgl zzbglVar2 = (zzbgl) list.get(i3);
                for (int i4 = 0; i4 < zzbglVar2.zza().size(); i4++) {
                    arrayList3.add(new zzbta(zzbglVar2.zzb(), (SocketAddress) zzbglVar2.zza().get(i4)));
                }
            }
            listZzj = arrayList3;
        }
        this.zza = listZzj;
        this.zzb = 0;
    }

    public final boolean zzh(SocketAddress socketAddress) {
        if (socketAddress == null) {
            throw new NullPointerException("needle");
        }
        for (int i = 0; i < this.zza.size(); i++) {
            if (((zzbta) this.zza.get(i)).zzc().equals(socketAddress)) {
                this.zzb = i;
                return true;
            }
        }
        return false;
    }

    public final int zzi() {
        return this.zza.size();
    }

    public final void zzc() {
        this.zzb = 0;
    }
}
