package at.favre.lib.bytes;

import defpackage.forceCloseConnection;
import java.nio.ByteOrder;
import java.security.SecureRandom;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class MutableBytes extends Bytes implements AutoCloseable {
    @Override // at.favre.lib.bytes.Bytes
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return true;
    }

    public MutableBytes(byte[] bArr, ByteOrder byteOrder) {
        super(bArr, byteOrder, new b((byte) 0));
    }

    public final MutableBytes TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        SecureRandom secureRandom = new SecureRandom();
        if (this.byteArray.length > 0) {
            secureRandom.nextBytes(this.byteArray);
        }
        return this;
    }

    @Override // at.favre.lib.bytes.Bytes
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    static class b implements forceCloseConnection {
        private b() {
        }

        /* synthetic */ b(byte b) {
            this();
        }

        @Override // defpackage.forceCloseConnection
        public final Bytes b(byte[] bArr, ByteOrder byteOrder) {
            return new MutableBytes(bArr, byteOrder);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        SecureRandom secureRandom = new SecureRandom();
        if (this.byteArray.length > 0) {
            secureRandom.nextBytes(this.byteArray);
        }
    }

    @Override // at.favre.lib.bytes.Bytes
    public final int hashCode() {
        byte[] bArr = this.byteArray;
        ByteOrder byteOrder = this.byteOrder;
        return (Arrays.hashCode(bArr) * 31) + (byteOrder != null ? byteOrder.hashCode() : 0);
    }
}
