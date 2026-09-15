package com.google.android.libraries.places.internal;

import defpackage.recalculateAvailableCameras;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhj {
    public static String zza(List list, List list2) {
        return zzc(list, true, list2);
    }

    public static String zzb(List list) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.add("attributions");
        return zzc(arrayList, false, new ArrayList());
    }

    private static String zzc(List list, boolean z, List list2) {
        if (list.isEmpty()) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String strConcat = (String) it.next();
            if (z) {
                strConcat = "places.".concat(String.valueOf(strConcat));
            }
            arrayList.add(strConcat);
        }
        if (!list.contains("attributions")) {
            arrayList.add(true == z ? "places.attributions" : "attributions");
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(((zzhi) it2.next()).toString());
        }
        return recalculateAvailableCameras.TuitionPaymentFragmentspecialinlinedviewModeldefault3(",").TuitionPaymentFragmentspecialinlinedviewModeldefault2(new StringBuilder(), arrayList.iterator()).toString();
    }
}
