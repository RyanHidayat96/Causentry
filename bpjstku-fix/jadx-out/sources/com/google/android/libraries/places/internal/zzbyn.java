package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbyn {
    private final List zza = new ArrayList(20);

    public final zzbyn zza(String str, String str2) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt <= 31 || cCharAt >= 127) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i2), str));
            }
        }
        if (str2 == null) {
            throw new IllegalArgumentException("value == null");
        }
        for (int i3 = 0; i3 < str2.length(); i3++) {
            char cCharAt2 = str2.charAt(i3);
            if (cCharAt2 <= 31 || cCharAt2 >= 127) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header value: %s", Integer.valueOf(cCharAt2), Integer.valueOf(i3), str2));
            }
        }
        while (true) {
            List list = this.zza;
            if (i >= list.size()) {
                list.add(str);
                list.add(str2.trim());
                return this;
            }
            if (str.equalsIgnoreCase((String) list.get(i))) {
                list.remove(i);
                list.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    public final zzbyo zzb() {
        return new zzbyo(this, null);
    }

    final /* synthetic */ List zzc() {
        return this.zza;
    }
}
