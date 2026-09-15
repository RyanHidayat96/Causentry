package com.koushikdutta.async.http;

import defpackage.registerOutputSurface;
import defpackage.useAndConfigureProgramWithTexture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class Multimap extends LinkedHashMap<String, List<String>> implements Iterable<useAndConfigureProgramWithTexture> {
    protected List<String> b() {
        return new ArrayList();
    }

    public final String TuitionPaymentFragmentbindingInflater1(String str) {
        List<String> list = get(str);
        if (list == null || list.size() == 0) {
            return null;
        }
        return list.get(0);
    }

    public final List<String> TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
        List<String> list = get(str);
        if (list != null) {
            return list;
        }
        List<String> listB = b();
        put(str, listB);
        return listB;
    }

    public final void TuitionPaymentFragmentbindingInflater1(String str, String str2) {
        List<String> listB = b();
        listB.add(str2);
        put(str, listB);
    }

    static {
        new Object() { // from class: com.koushikdutta.async.http.Multimap.1
        };
        new Object() { // from class: com.koushikdutta.async.http.Multimap.3
        };
    }

    @Override // java.lang.Iterable
    public Iterator<useAndConfigureProgramWithTexture> iterator() {
        ArrayList arrayList = new ArrayList();
        for (String str : keySet()) {
            Iterator it = ((List) get(str)).iterator();
            while (it.hasNext()) {
                arrayList.add(new registerOutputSurface(str, (String) it.next()));
            }
        }
        return arrayList.iterator();
    }
}
