package com.koushikdutta.async.http;

import java.util.Hashtable;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    /* JADX INFO: Fake field, exist only in values array */
    SPDY_3 { // from class: com.koushikdutta.async.http.Protocol.1
    },
    /* JADX INFO: Fake field, exist only in values array */
    HTTP_2 { // from class: com.koushikdutta.async.http.Protocol.2
    };

    private static final Hashtable<String, Protocol> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final String protocol;

    /* synthetic */ Protocol(String str, byte b2) {
        this(str);
    }

    static {
        Protocol protocol = HTTP_1_0;
        Protocol protocol2 = HTTP_1_1;
        Protocol protocol3 = SPDY_3;
        Protocol protocol4 = HTTP_2;
        Hashtable<String, Protocol> hashtable = new Hashtable<>();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = hashtable;
        hashtable.put(protocol.toString(), protocol);
        hashtable.put(protocol2.toString(), protocol2);
        hashtable.put(protocol3.toString(), protocol3);
        hashtable.put(protocol4.toString(), protocol4);
    }

    Protocol(String str) {
        this.protocol = str;
    }

    public static Protocol TuitionPaymentFragmentbindingInflater1(String str) {
        if (str == null) {
            return null;
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(str.toLowerCase(Locale.US));
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }
}
