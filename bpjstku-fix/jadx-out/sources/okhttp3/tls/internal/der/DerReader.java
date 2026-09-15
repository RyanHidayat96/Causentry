package okhttp3.tls.internal.der;

import androidx.exifinterface.media.ExifInterface;
import defpackage.RotationProvider1;
import defpackage.RotationProviderListenerWrapper;
import defpackage.RotationProviderListenerWrapperExternalSyntheticLambda0;
import defpackage.SurfaceViewImplementation;
import defpackage.tryToComplete;
import java.io.IOException;
import java.math.BigInteger;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okio.ByteString;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 C2\u00020\u0001:\u0002CDB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\u000eH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\bJ\u000f\u0010\u0019\u001a\u00020\tH\u0001¢\u0006\u0004\b\u0019\u0010\u000bJ\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\rH\u0007¢\u0006\u0004\b\"\u0010\u001eJ\u000f\u0010#\u001a\u00020\u001fH\u0007¢\u0006\u0004\b#\u0010!J\u000f\u0010$\u001a\u00020\rH\u0007¢\u0006\u0004\b$\u0010\u001eJ\u000f\u0010%\u001a\u00020\u001aH\u0002¢\u0006\u0004\b%\u0010\u001cJ\u000f\u0010&\u001a\u00020\rH\u0017¢\u0006\u0004\b&\u0010\u001eJ!\u0010(\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000'¢\u0006\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020\u001a8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u001cR\u0014\u0010-\u001a\u00020\u001a8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u001cR\u0016\u0010.\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\r058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00108\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b;\u0010<R(\u0010A\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00018G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001c\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bB\u00107\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lokhttp3/tls/internal/der/DerReader;", "", "LtryToComplete;", "p0", "<init>", "(LtryToComplete;)V", "", "hasNext", "()Z", "Lokhttp3/tls/internal/der/DerHeader;", "peekHeader", "()Lokhttp3/tls/internal/der/DerHeader;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlin/Function1;", "p1", "read$okhttp_tls", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Ljava/math/BigInteger;", "readBigInteger", "()Ljava/math/BigInteger;", "Lokhttp3/tls/internal/der/BitString;", "readBitString", "()Lokhttp3/tls/internal/der/BitString;", "readBoolean", "readHeader$okhttp_tls", "", "readLong", "()J", "readObjectIdentifier", "()Ljava/lang/String;", "Lokio/ByteString;", "readOctetString", "()Lokio/ByteString;", "readRelativeObjectIdentifier", "readUnknown", "readUtf8String", "readVariableLengthLong", "toString", "Lkotlin/Function0;", "withTypeHint", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getByteCount", "byteCount", "getBytesLeft", "bytesLeft", "constructed", "Z", "Lokhttp3/tls/internal/der/DerReader$CountingSource;", "countingSource", "Lokhttp3/tls/internal/der/DerReader$CountingSource;", "limit", "J", "", "path", "Ljava/util/List;", "peekedHeader", "Lokhttp3/tls/internal/der/DerHeader;", "LRotationProvider1;", "source", "LRotationProvider1;", "getTypeHint", "()Ljava/lang/Object;", "setTypeHint", "(Ljava/lang/Object;)V", "typeHint", "typeHintStack", "Companion", "CountingSource"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class DerReader {
    private static final DerHeader END_OF_DATA = new DerHeader(0, 0, false, -1);
    private boolean constructed;
    private final CountingSource countingSource;
    private long limit;
    private final List<String> path;
    private DerHeader peekedHeader;
    private final RotationProvider1 source;
    private final List<Object> typeHintStack;

    public DerReader(tryToComplete trytocomplete) {
        Intrinsics.checkNotNullParameter(trytocomplete, "");
        CountingSource countingSource = new CountingSource(trytocomplete);
        this.countingSource = countingSource;
        this.source = SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(countingSource);
        this.limit = -1L;
        this.typeHintStack = new ArrayList();
        this.path = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getByteCount() {
        return this.countingSource.getBytesRead() - this.source.asInterface().size;
    }

    public final Object getTypeHint() {
        return CollectionsKt.lastOrNull((List) this.typeHintStack);
    }

    public final void setTypeHint(Object obj) {
        List<Object> list = this.typeHintStack;
        list.set(list.size() - 1, obj);
    }

    private final long getBytesLeft() {
        long j = this.limit;
        if (j == -1) {
            return -1L;
        }
        return j - getByteCount();
    }

    public final boolean hasNext() {
        return peekHeader() != null;
    }

    public final DerHeader peekHeader() throws IOException {
        DerHeader header$okhttp_tls = this.peekedHeader;
        if (header$okhttp_tls == null) {
            header$okhttp_tls = readHeader$okhttp_tls();
            this.peekedHeader = header$okhttp_tls;
        }
        if (header$okhttp_tls.isEndOfData()) {
            return null;
        }
        return header$okhttp_tls;
    }

    public final DerHeader readHeader$okhttp_tls() throws IOException {
        long jCancel;
        if (this.peekedHeader != null) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        long byteCount = getByteCount();
        long j = this.limit;
        if (byteCount == j) {
            return END_OF_DATA;
        }
        if (j == -1 && this.source.d()) {
            return END_OF_DATA;
        }
        byte bCancel = this.source.cancel();
        int i = 1;
        boolean z = (bCancel & 32) == 32;
        int i2 = bCancel & 31;
        long variableLengthLong = i2 == 31 ? readVariableLengthLong() : i2;
        byte bCancel2 = this.source.cancel();
        if ((bCancel2 & UByte.MAX_VALUE) == 128) {
            throw new ProtocolException("indefinite length not permitted for DER");
        }
        if ((bCancel2 & ByteCompanionObject.MIN_VALUE) == 128) {
            int i3 = bCancel2 & ByteCompanionObject.MAX_VALUE;
            if (i3 > 8) {
                throw new ProtocolException("length encoded with more than 8 bytes is not supported");
            }
            long jCancel2 = this.source.cancel();
            jCancel = 255 & jCancel2;
            if (jCancel == 0 || (i3 == 1 && (jCancel2 & 128) == 0)) {
                throw new ProtocolException("invalid encoding for length");
            }
            while (i < i3) {
                i++;
                jCancel = (jCancel << 8) + ((long) (this.source.cancel() & UByte.MAX_VALUE));
            }
            if (jCancel < 0) {
                throw new ProtocolException("length > Long.MAX_VALUE");
            }
        } else {
            jCancel = bCancel2 & ByteCompanionObject.MAX_VALUE;
        }
        return new DerHeader(bCancel & 192, variableLengthLong, z, jCancel);
    }

    public final <T> T read$okhttp_tls(String p0, Function1<? super DerHeader, ? extends T> p1) throws ProtocolException {
        Intrinsics.checkNotNullParameter(p1, "");
        if (hasNext()) {
            DerHeader derHeader = this.peekedHeader;
            Intrinsics.checkNotNull(derHeader);
            this.peekedHeader = null;
            long j = this.limit;
            boolean z = this.constructed;
            long byteCount = derHeader.getLength() != -1 ? getByteCount() + derHeader.getLength() : -1L;
            if (j == -1 || byteCount <= j) {
                this.limit = byteCount;
                this.constructed = derHeader.getConstructed();
                if (p0 != null) {
                    this.path.add(p0);
                }
                try {
                    T tInvoke = p1.invoke(derHeader);
                    if (byteCount != -1 && getByteCount() > byteCount) {
                        throw new ProtocolException(Intrinsics.stringPlus("unexpected byte count at ", this));
                    }
                    this.peekedHeader = null;
                    this.limit = j;
                    this.constructed = z;
                    if (p0 != null) {
                        this.path.remove(this.path.size() - 1);
                    }
                    return tInvoke;
                } catch (Throwable th) {
                    this.peekedHeader = null;
                    this.limit = j;
                    this.constructed = z;
                    if (p0 != null) {
                        this.path.remove(this.path.size() - 1);
                    }
                    throw th;
                }
            }
            throw new ProtocolException("enclosed object too large");
        }
        throw new ProtocolException("expected a value");
    }

    public final <T> T withTypeHint(Function0<? extends T> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.typeHintStack.add(null);
        try {
            return p0.invoke();
        } finally {
            this.typeHintStack.remove(this.typeHintStack.size() - 1);
        }
    }

    public final boolean readBoolean() throws ProtocolException {
        if (getBytesLeft() == 1) {
            return this.source.cancel() != 0;
        }
        StringBuilder sb = new StringBuilder("unexpected length: ");
        sb.append(getBytesLeft());
        sb.append(" at ");
        sb.append(this);
        throw new ProtocolException(sb.toString());
    }

    public final BigInteger readBigInteger() throws ProtocolException {
        if (getBytesLeft() == 0) {
            StringBuilder sb = new StringBuilder("unexpected length: ");
            sb.append(getBytesLeft());
            sb.append(" at ");
            sb.append(this);
            throw new ProtocolException(sb.toString());
        }
        return new BigInteger(this.source.b(getBytesLeft()));
    }

    public final long readLong() throws ProtocolException {
        long bytesLeft = getBytesLeft();
        if (1 > bytesLeft || bytesLeft >= 9) {
            StringBuilder sb = new StringBuilder("unexpected length: ");
            sb.append(getBytesLeft());
            sb.append(" at ");
            sb.append(this);
            throw new ProtocolException(sb.toString());
        }
        long jCancel = this.source.cancel();
        while (getByteCount() < this.limit) {
            jCancel = (jCancel << 8) + ((long) (this.source.cancel() & UByte.MAX_VALUE));
        }
        return jCancel;
    }

    public final BitString readBitString() throws IOException {
        if (getBytesLeft() == -1 || this.constructed) {
            throw new ProtocolException("constructed bit strings not supported for DER");
        }
        if (getBytesLeft() < 1) {
            throw new ProtocolException("malformed bit string");
        }
        return new BitString(this.source.TuitionPaymentFragmentbindingInflater1(getBytesLeft()), this.source.cancel() & UByte.MAX_VALUE);
    }

    public final ByteString readOctetString() throws ProtocolException {
        if (getBytesLeft() == -1 || this.constructed) {
            throw new ProtocolException("constructed octet strings not supported for DER");
        }
        return this.source.TuitionPaymentFragmentbindingInflater1(getBytesLeft());
    }

    public final String readUtf8String() throws ProtocolException {
        if (getBytesLeft() == -1 || this.constructed) {
            throw new ProtocolException("constructed strings not supported for DER");
        }
        return this.source.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getBytesLeft());
    }

    public final String readObjectIdentifier() {
        RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
        long variableLengthLong = readVariableLengthLong();
        if (0 <= variableLengthLong && variableLengthLong < 40) {
            rotationProviderListenerWrapper.a(0L);
            rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(46);
            rotationProviderListenerWrapper.a(variableLengthLong);
        } else if (40 <= variableLengthLong && variableLengthLong < 80) {
            rotationProviderListenerWrapper.a(1L);
            rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(46);
            rotationProviderListenerWrapper.a(variableLengthLong - 40);
        } else {
            rotationProviderListenerWrapper.a(2L);
            rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(46);
            rotationProviderListenerWrapper.a(variableLengthLong - 80);
        }
        while (getByteCount() < this.limit) {
            rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(46);
            rotationProviderListenerWrapper.a(readVariableLengthLong());
        }
        return rotationProviderListenerWrapper.b(rotationProviderListenerWrapper.size, Charsets.UTF_8);
    }

    public final String readRelativeObjectIdentifier() {
        RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
        while (getByteCount() < this.limit) {
            if (rotationProviderListenerWrapper.size > 0) {
                rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(46);
            }
            rotationProviderListenerWrapper.a(readVariableLengthLong());
        }
        return rotationProviderListenerWrapper.b(rotationProviderListenerWrapper.size, Charsets.UTF_8);
    }

    private final long readVariableLengthLong() {
        long j = 0;
        while (true) {
            long jCancel = this.source.cancel();
            if ((jCancel & 128) != 128) {
                return j + (jCancel & 255);
            }
            j = (j + (jCancel & 127)) << 7;
        }
    }

    public final ByteString readUnknown() {
        return this.source.TuitionPaymentFragmentbindingInflater1(getBytesLeft());
    }

    public final String toString() {
        return CollectionsKt.joinToString$default(this.path, " / ", null, null, 0, null, null, 62, null);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\u00020\u00078\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010"}, d2 = {"Lokhttp3/tls/internal/der/DerReader$CountingSource;", "LRotationProviderListenerWrapperExternalSyntheticLambda0;", "LtryToComplete;", "p0", "<init>", "(LtryToComplete;)V", "LRotationProviderListenerWrapper;", "", "p1", "read", "(LRotationProviderListenerWrapper;J)J", "bytesRead", "J", "getBytesRead", "()J", "setBytesRead", "(J)V"}, k = 1, mv = {1, 6, 0}, xi = 48)
    static final class CountingSource extends RotationProviderListenerWrapperExternalSyntheticLambda0 {
        private long bytesRead;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CountingSource(tryToComplete trytocomplete) {
            super(trytocomplete);
            Intrinsics.checkNotNullParameter(trytocomplete, "");
        }

        public final long getBytesRead() {
            return this.bytesRead;
        }

        public final void setBytesRead(long j) {
            this.bytesRead = j;
        }

        @Override // defpackage.RotationProviderListenerWrapperExternalSyntheticLambda0, defpackage.tryToComplete
        public final long read(RotationProviderListenerWrapper p0, long p1) throws IOException {
            Intrinsics.checkNotNullParameter(p0, "");
            long j = delegate().read(p0, p1);
            if (j == -1) {
                return -1L;
            }
            this.bytesRead += j;
            return j;
        }
    }
}
