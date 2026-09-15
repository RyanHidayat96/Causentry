package com.google.android.libraries.places.api.model;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzbf extends RoutingSummary {
    private final List zza;

    zzbf(List list) {
        if (list == null) {
            throw new NullPointerException("Null legs");
        }
        this.zza = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RoutingSummary) {
            return this.zza.equals(((RoutingSummary) obj).getLegs());
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final String toString() {
        String string = this.zza.toString();
        StringBuilder sb = new StringBuilder(string.length() + 21);
        sb.append("RoutingSummary{legs=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.RoutingSummary
    public final List<Leg> getLegs() {
        return this.zza;
    }
}
