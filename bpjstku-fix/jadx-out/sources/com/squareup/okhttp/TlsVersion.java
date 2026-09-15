package com.squareup.okhttp;

/* JADX INFO: loaded from: classes6.dex */
public enum TlsVersion {
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");

    final String javaName;

    TlsVersion(String str) {
        this.javaName = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x0036  */
    public static TlsVersion forJavaName(String str) {
        byte b;
        str.hashCode();
        switch (str.hashCode()) {
            case -503070503:
                if (!str.equals("TLSv1.1")) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case -503070502:
                if (!str.equals("TLSv1.2")) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 79201641:
                if (!str.equals("SSLv3")) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case 79923350:
                if (!str.equals("TLSv1")) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            return TLS_1_1;
        }
        if (b == 1) {
            return TLS_1_2;
        }
        if (b == 2) {
            return SSL_3_0;
        }
        if (b == 3) {
            return TLS_1_0;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(String.valueOf(str)));
    }

    public final String javaName() {
        return this.javaName;
    }
}
