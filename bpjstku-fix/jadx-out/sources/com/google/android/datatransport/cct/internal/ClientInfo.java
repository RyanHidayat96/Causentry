package com.google.android.datatransport.cct.internal;

import defpackage.onProcessFailure;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ClientInfo {

    public static abstract class TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        public abstract TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault1(ClientType clientType);

        public abstract TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault1(onProcessFailure onprocessfailure);

        public abstract ClientInfo TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    public abstract onProcessFailure TuitionPaymentFragmentspecialinlinedviewModeldefault2();

    public abstract ClientType b();

    public enum ClientType {
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN(0),
        ANDROID_FIREBASE(23);

        private final int value;

        ClientType(int i) {
            this.value = i;
        }
    }
}
