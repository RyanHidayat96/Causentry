package com.koushikdutta.async.http.filter;

import defpackage.AutoValue_Packet;
import defpackage.checkReadyToRelease;
import defpackage.lambdaexecuteSafely11;
import defpackage.lambdainitGlRenderer10androidxcameracoreprocessingDefaultSurfaceProcessor;

/* JADX INFO: loaded from: classes4.dex */
public final class ChunkedInputFilter extends lambdaexecuteSafely11 {
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private int b = 0;
    private State TuitionPaymentFragmentspecialinlinedviewModeldefault3 = State.CHUNK_LEN;
    private AutoValue_Packet TuitionPaymentFragmentbindingInflater1 = new AutoValue_Packet();

    enum State {
        CHUNK_LEN,
        CHUNK_LEN_CR,
        /* JADX INFO: Fake field, exist only in values array */
        CHUNK_LEN_CRLF,
        CHUNK,
        CHUNK_CR,
        CHUNK_CRLF,
        COMPLETE,
        ERROR
    }

    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(char c, char c2) {
        if (c == c2) {
            return true;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = State.ERROR;
        StringBuilder sb = new StringBuilder();
        sb.append(c2);
        sb.append(" was expected, got ");
        sb.append(c);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new ChunkedDataException(sb.toString()));
        return false;
    }

    @Override // defpackage.getSurfaceEdge
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Exception exc) {
        if (exc == null && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != State.COMPLETE) {
            exc = new ChunkedDataException("chunked input ended before final chunk");
        }
        super.TuitionPaymentFragmentspecialinlinedviewModeldefault2(exc);
    }

    @Override // defpackage.lambdaexecuteSafely11, defpackage.lambdasnapshot8androidxcameracoreprocessingDefaultSurfaceProcessor
    public final void TuitionPaymentFragmentbindingInflater1(checkReadyToRelease checkreadytorelease, AutoValue_Packet autoValue_Packet) {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == State.ERROR) {
            while (autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.size() > 0) {
                AutoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3(autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove());
            }
            autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            return;
        }
        while (autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 > 0) {
            try {
                switch (AnonymousClass5.TuitionPaymentFragmentspecialinlinedviewModeldefault3[this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.ordinal()]) {
                    case 1:
                        char c = (char) autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1).get();
                        autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2--;
                        if (c == '\r') {
                            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = State.CHUNK_LEN_CR;
                        } else {
                            int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * 16;
                            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
                            if (c >= 'a' && c <= 'f') {
                                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i + (c - 'W');
                            } else if (c >= '0' && c <= '9') {
                                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i + (c - '0');
                            } else if (c >= 'A' && c <= 'F') {
                                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i + (c - '7');
                            } else {
                                StringBuilder sb = new StringBuilder();
                                sb.append("invalid chunk length: ");
                                sb.append(c);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2(new ChunkedDataException(sb.toString()));
                                return;
                            }
                        }
                        this.b = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        continue;
                    case 2:
                        char c2 = (char) autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1).get();
                        autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2--;
                        if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(c2, '\n')) {
                            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = State.CHUNK;
                            continue;
                        } else {
                            return;
                        }
                        break;
                    case 3:
                        int iMin = Math.min(this.b, autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        int i2 = this.b - iMin;
                        this.b = i2;
                        if (i2 == 0) {
                            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = State.CHUNK_CR;
                        }
                        if (iMin != 0) {
                            autoValue_Packet.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, iMin);
                            lambdainitGlRenderer10androidxcameracoreprocessingDefaultSurfaceProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, this.TuitionPaymentFragmentbindingInflater1);
                        } else {
                            continue;
                        }
                        break;
                    case 4:
                        char c3 = (char) autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1).get();
                        autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2--;
                        if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(c3, '\r')) {
                            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = State.CHUNK_CRLF;
                            continue;
                        } else {
                            return;
                        }
                        break;
                    case 5:
                        char c4 = (char) autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1).get();
                        autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2--;
                        if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(c4, '\n')) {
                            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 > 0) {
                                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = State.CHUNK_LEN;
                            } else {
                                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = State.COMPLETE;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2((Exception) null);
                            }
                            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                            continue;
                        } else {
                            return;
                        }
                        break;
                    case 6:
                        return;
                    default:
                        continue;
                }
            } catch (Exception e2) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2(e2);
                return;
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(e2);
            return;
        }
    }

    /* JADX INFO: renamed from: com.koushikdutta.async.http.filter.ChunkedInputFilter$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        static {
            int[] iArr = new int[State.values().length];
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iArr;
            try {
                iArr[State.CHUNK_LEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3[State.CHUNK_LEN_CR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3[State.CHUNK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3[State.CHUNK_CR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3[State.CHUNK_CRLF.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3[State.COMPLETE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }
}
