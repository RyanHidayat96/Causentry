package com.squareup.okhttp;

import com.squareup.okhttp.internal.Util;

/* JADX INFO: loaded from: classes5.dex */
public final class Challenge {
    private final String realm;
    private final String scheme;

    public Challenge(String str, String str2) {
        this.scheme = str;
        this.realm = str2;
    }

    public final String getScheme() {
        return this.scheme;
    }

    public final String getRealm() {
        return this.realm;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Challenge)) {
            return false;
        }
        Challenge challenge = (Challenge) obj;
        return Util.equal(this.scheme, challenge.scheme) && Util.equal(this.realm, challenge.realm);
    }

    public final int hashCode() {
        String str = this.realm;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.scheme;
        return ((iHashCode + 899) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.scheme);
        sb.append(" realm=\"");
        sb.append(this.realm);
        sb.append("\"");
        return sb.toString();
    }
}
