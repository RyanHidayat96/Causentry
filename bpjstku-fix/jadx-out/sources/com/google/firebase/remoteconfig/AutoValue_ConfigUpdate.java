package com.google.firebase.remoteconfig;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_ConfigUpdate extends ConfigUpdate {
    private final Set<String> updatedKeys;

    AutoValue_ConfigUpdate(Set<String> set) {
        if (set == null) {
            throw new NullPointerException("Null updatedKeys");
        }
        this.updatedKeys = set;
    }

    @Override // com.google.firebase.remoteconfig.ConfigUpdate
    public final Set<String> getUpdatedKeys() {
        return this.updatedKeys;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfigUpdate{updatedKeys=");
        sb.append(this.updatedKeys);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConfigUpdate) {
            return this.updatedKeys.equals(((ConfigUpdate) obj).getUpdatedKeys());
        }
        return false;
    }

    public final int hashCode() {
        return this.updatedKeys.hashCode() ^ 1000003;
    }
}
