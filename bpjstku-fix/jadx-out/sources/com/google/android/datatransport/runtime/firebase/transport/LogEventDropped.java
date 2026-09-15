package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.ProtoEnum;

/* JADX INFO: loaded from: classes3.dex */
public final class LogEventDropped {
    public final long TuitionPaymentFragmentbindingInflater1;
    public final Reason TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        public long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        public Reason TuitionPaymentFragmentbindingInflater1 = Reason.REASON_UNKNOWN;
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        new LogEventDropped(tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2, tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1);
    }

    public LogEventDropped(long j, Reason reason) {
        this.TuitionPaymentFragmentbindingInflater1 = j;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = reason;
    }

    public enum Reason implements ProtoEnum {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);

        private final int number_;

        Reason(int i) {
            this.number_ = i;
        }

        @Override // com.google.firebase.encoders.proto.ProtoEnum
        public final int getNumber() {
            return this.number_;
        }
    }
}
