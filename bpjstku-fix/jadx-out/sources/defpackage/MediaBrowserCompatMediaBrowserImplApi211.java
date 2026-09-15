package defpackage;

import at.favre.lib.armadillo.AuthenticatedEncryptionException;
import at.favre.lib.armadillo.EncryptionProtocolException;
import at.favre.lib.bytes.Bytes;
import at.favre.lib.bytes.BytesTransformer;
import at.favre.lib.bytes.MutableBytes;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.text.Normalizer;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes5.dex */
public final class MediaBrowserCompatMediaBrowserImplApi211 implements MediaBrowserCompatMediaBrowserImplApi215 {
    private final MediaBrowserCompatMediaBrowserImplApi212 TuitionPaymentFragmentbindingInflater1;
    private MediaBrowserCompatMediaBrowserImplApi23 TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final MediaBrowserCompatMediaBrowserImplApi213 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private List<MediaBrowserCompatMediaBrowserImplApi23> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f167a;
    private final SecureRandom asBinder;
    private final int b;
    private final MediaBrowserCompatMediaBrowserImplBase3 g;

    /* synthetic */ MediaBrowserCompatMediaBrowserImplApi211(MediaBrowserCompatMediaBrowserImplApi23 mediaBrowserCompatMediaBrowserImplApi23, byte[] bArr, MediaBrowserCompatMediaBrowserImplApi213 mediaBrowserCompatMediaBrowserImplApi213, MediaBrowserCompatMediaBrowserImplBase3 mediaBrowserCompatMediaBrowserImplBase3, SecureRandom secureRandom, boolean z, List list, byte b) {
        this(mediaBrowserCompatMediaBrowserImplApi23, bArr, mediaBrowserCompatMediaBrowserImplApi213, mediaBrowserCompatMediaBrowserImplBase3, secureRandom, z, list);
    }

    private MediaBrowserCompatMediaBrowserImplApi211(MediaBrowserCompatMediaBrowserImplApi23 mediaBrowserCompatMediaBrowserImplApi23, byte[] bArr, MediaBrowserCompatMediaBrowserImplApi213 mediaBrowserCompatMediaBrowserImplApi213, MediaBrowserCompatMediaBrowserImplBase3 mediaBrowserCompatMediaBrowserImplBase3, SecureRandom secureRandom, boolean z, List<MediaBrowserCompatMediaBrowserImplApi23> list) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = mediaBrowserCompatMediaBrowserImplApi23;
        this.f167a = bArr;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = mediaBrowserCompatMediaBrowserImplApi213;
        this.g = mediaBrowserCompatMediaBrowserImplBase3;
        this.b = mediaBrowserCompatMediaBrowserImplApi23.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(mediaBrowserCompatMediaBrowserImplApi23.TuitionPaymentFragmentbindingInflater1) * 8;
        this.asBinder = secureRandom;
        this.TuitionPaymentFragmentbindingInflater1 = new MediaBrowserCompatMediaBrowserImplApi212.b(z, secureRandom);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = list;
    }

    @Override // defpackage.MediaBrowserCompatMediaBrowserImplApi215
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
        MediaBrowserCompatMediaBrowserImplBase3 mediaBrowserCompatMediaBrowserImplBase3 = this.g;
        Bytes bytesTuitionPaymentFragmentbindingInflater1 = Bytes.TuitionPaymentFragmentbindingInflater1(str);
        return mediaBrowserCompatMediaBrowserImplBase3.b(new String(bytesTuitionPaymentFragmentbindingInflater1.factory.b(new BytesTransformer.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.f167a).b(bytesTuitionPaymentFragmentbindingInflater1.byteArray, bytesTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1()), bytesTuitionPaymentFragmentbindingInflater1.byteOrder).byteArray, (Charset) Objects.requireNonNull(StandardCharsets.UTF_8, "given charset must not be null")), "contentKey");
    }

    @Override // defpackage.MediaBrowserCompatMediaBrowserImplApi215
    public final byte[] b(String str, char[] cArr, byte[] bArr) throws IOException, EncryptionProtocolException {
        MutableBytes mutableBytes;
        MutableBytes mutableBytes2;
        MutableBytes mutableBytes3;
        MutableBytes mutableBytes4;
        long jCurrentTimeMillis = System.currentTimeMillis();
        byte[] bArr2 = new byte[0];
        byte[] bArr3 = new byte[0];
        try {
            try {
                byte[] bArr4 = Bytes.b(16, this.asBinder).byteArray;
                byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                byte[] bArrTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(str, bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1, bArr4, this.f167a, cArr);
                byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bArrTuitionPaymentFragmentbindingInflater1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bArr), Bytes.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.f168a).byteArray);
                MediaBrowserCompatItemCallbackStubApi23.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b;
                Bytes bytesTuitionPaymentFragmentbindingInflater1 = Bytes.TuitionPaymentFragmentbindingInflater1(str);
                MediaBrowserCompatItemCallbackStubApi23 mediaBrowserCompatItemCallbackStubApi23TuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(bytesTuitionPaymentFragmentbindingInflater1.factory.b(new BytesTransformer.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1).b(bytesTuitionPaymentFragmentbindingInflater1.byteArray, bytesTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1()), bytesTuitionPaymentFragmentbindingInflater1.byteOrder).byteArray);
                try {
                    mediaBrowserCompatItemCallbackStubApi23TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    mediaBrowserCompatItemCallbackStubApi23TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr4.length + 9 + bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2.length);
                    byteBufferAllocate.putInt(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.f168a);
                    byteBufferAllocate.put((byte) bArr4.length);
                    byteBufferAllocate.put(bArr4);
                    byteBufferAllocate.putInt(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2.length);
                    byteBufferAllocate.put(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    byte[] bArrArray = byteBufferAllocate.array();
                    Bytes bytesB = Bytes.b(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    if (bytesB instanceof MutableBytes) {
                        mutableBytes3 = (MutableBytes) bytesB;
                    } else {
                        mutableBytes3 = new MutableBytes(bytesB.byteArray, bytesB.byteOrder);
                    }
                    SecureRandom secureRandom = new SecureRandom();
                    if (mutableBytes3.byteArray.length > 0) {
                        secureRandom.nextBytes(mutableBytes3.byteArray);
                    }
                    Bytes bytesB2 = Bytes.b(bArrTuitionPaymentFragmentbindingInflater1);
                    if (bytesB2 instanceof MutableBytes) {
                        mutableBytes4 = (MutableBytes) bytesB2;
                    } else {
                        mutableBytes4 = new MutableBytes(bytesB2.byteArray, bytesB2.byteOrder);
                    }
                    SecureRandom secureRandom2 = new SecureRandom();
                    if (mutableBytes4.byteArray.length > 0) {
                        secureRandom2.nextBytes(mutableBytes4.byteArray);
                    }
                    getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault3("encrypt took %d ms", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                    return bArrArray;
                } catch (Throwable th) {
                    mediaBrowserCompatItemCallbackStubApi23TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    throw th;
                }
            } catch (AuthenticatedEncryptionException e2) {
                throw new EncryptionProtocolException(e2);
            }
        } catch (Throwable th2) {
            Bytes bytesB3 = Bytes.b(bArr2);
            if (bytesB3 instanceof MutableBytes) {
                mutableBytes = (MutableBytes) bytesB3;
            } else {
                mutableBytes = new MutableBytes(bytesB3.byteArray, bytesB3.byteOrder);
            }
            SecureRandom secureRandom3 = new SecureRandom();
            if (mutableBytes.byteArray.length > 0) {
                secureRandom3.nextBytes(mutableBytes.byteArray);
            }
            Bytes bytesB4 = Bytes.b(bArr3);
            if (bytesB4 instanceof MutableBytes) {
                mutableBytes2 = (MutableBytes) bytesB4;
            } else {
                mutableBytes2 = new MutableBytes(bytesB4.byteArray, bytesB4.byteOrder);
            }
            SecureRandom secureRandom4 = new SecureRandom();
            if (mutableBytes2.byteArray.length > 0) {
                secureRandom4.nextBytes(mutableBytes2.byteArray);
            }
            getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault3("encrypt took %d ms", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            throw th2;
        }
    }

    @Override // defpackage.MediaBrowserCompatMediaBrowserImplApi215
    public final byte[] TuitionPaymentFragmentbindingInflater1(String str, char[] cArr, byte[] bArr) throws Throwable {
        byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        MutableBytes mutableBytes;
        MutableBytes mutableBytes2;
        MediaBrowserCompatMediaBrowserImplApi23 next;
        MediaBrowserCompatMediaBrowserImplApi23 mediaBrowserCompatMediaBrowserImplApi23;
        MutableBytes mutableBytes3;
        MutableBytes mutableBytes4;
        long jCurrentTimeMillis = System.currentTimeMillis();
        byte[] bArr2 = new byte[0];
        byte[] bArr3 = new byte[0];
        try {
            try {
                bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                try {
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                    int i = byteBufferWrap.getInt();
                    if (i == this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.f168a) {
                        mediaBrowserCompatMediaBrowserImplApi23 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    } else {
                        Iterator<MediaBrowserCompatMediaBrowserImplApi23> it = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.iterator();
                        do {
                            if (!it.hasNext()) {
                                StringBuilder sb = new StringBuilder("illegal protocol version (");
                                sb.append(i);
                                sb.append(")");
                                throw new EncryptionProtocolException(sb.toString());
                            }
                            next = it.next();
                        } while (i != next.f168a);
                        mediaBrowserCompatMediaBrowserImplApi23 = next;
                    }
                    byte[] bArr4 = new byte[byteBufferWrap.get()];
                    byteBufferWrap.get(bArr4);
                    byte[] bArr5 = new byte[byteBufferWrap.getInt()];
                    byteBufferWrap.get(bArr5);
                    MediaBrowserCompatItemCallbackStubApi23.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = mediaBrowserCompatMediaBrowserImplApi23.b;
                    Bytes bytesTuitionPaymentFragmentbindingInflater1 = Bytes.TuitionPaymentFragmentbindingInflater1(str);
                    MediaBrowserCompatItemCallbackStubApi23 mediaBrowserCompatItemCallbackStubApi23TuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(bytesTuitionPaymentFragmentbindingInflater1.factory.b(new BytesTransformer.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1).b(bytesTuitionPaymentFragmentbindingInflater1.byteArray, bytesTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1()), bytesTuitionPaymentFragmentbindingInflater1.byteOrder).byteArray);
                    try {
                        mediaBrowserCompatItemCallbackStubApi23TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bArr5);
                        mediaBrowserCompatItemCallbackStubApi23TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        byte[] bArrTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(str, bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1, bArr4, this.f167a, cArr);
                        byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault3 = mediaBrowserCompatMediaBrowserImplApi23.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(mediaBrowserCompatMediaBrowserImplApi23.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(bArrTuitionPaymentFragmentbindingInflater1, bArr5, Bytes.b(mediaBrowserCompatMediaBrowserImplApi23.f168a).byteArray));
                        Bytes bytesB = Bytes.b(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        if (bytesB instanceof MutableBytes) {
                            mutableBytes3 = (MutableBytes) bytesB;
                        } else {
                            mutableBytes3 = new MutableBytes(bytesB.byteArray, bytesB.byteOrder);
                        }
                        SecureRandom secureRandom = new SecureRandom();
                        if (mutableBytes3.byteArray.length > 0) {
                            secureRandom.nextBytes(mutableBytes3.byteArray);
                        }
                        Bytes bytesB2 = Bytes.b(bArrTuitionPaymentFragmentbindingInflater1);
                        if (bytesB2 instanceof MutableBytes) {
                            mutableBytes4 = (MutableBytes) bytesB2;
                        } else {
                            mutableBytes4 = new MutableBytes(bytesB2.byteArray, bytesB2.byteOrder);
                        }
                        SecureRandom secureRandom2 = new SecureRandom();
                        if (mutableBytes4.byteArray.length > 0) {
                            secureRandom2.nextBytes(mutableBytes4.byteArray);
                        }
                        getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault3("decrypt took %d ms", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                        return bArrTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    } catch (Throwable th) {
                        mediaBrowserCompatItemCallbackStubApi23TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        throw th;
                    }
                } catch (AuthenticatedEncryptionException e2) {
                    e = e2;
                    bArr2 = bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    throw new EncryptionProtocolException(e);
                } catch (Throwable th2) {
                    th = th2;
                    Bytes bytesB3 = Bytes.b(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    if (bytesB3 instanceof MutableBytes) {
                        mutableBytes = (MutableBytes) bytesB3;
                    } else {
                        mutableBytes = new MutableBytes(bytesB3.byteArray, bytesB3.byteOrder);
                    }
                    SecureRandom secureRandom3 = new SecureRandom();
                    if (mutableBytes.byteArray.length > 0) {
                        secureRandom3.nextBytes(mutableBytes.byteArray);
                    }
                    Bytes bytesB4 = Bytes.b(bArr3);
                    if (bytesB4 instanceof MutableBytes) {
                        mutableBytes2 = (MutableBytes) bytesB4;
                    } else {
                        mutableBytes2 = new MutableBytes(bytesB4.byteArray, bytesB4.byteOrder);
                    }
                    SecureRandom secureRandom4 = new SecureRandom();
                    if (mutableBytes2.byteArray.length > 0) {
                        secureRandom4.nextBytes(mutableBytes2.byteArray);
                    }
                    getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault3("decrypt took %d ms", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                    throw th;
                }
            } catch (AuthenticatedEncryptionException e3) {
                e = e3;
            }
        } catch (Throwable th3) {
            th = th3;
            bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = bArr2;
        }
    }

    @Override // defpackage.MediaBrowserCompatMediaBrowserImplApi215
    public final char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver) {
        if (mediaBrowserCompatItemReceiver == null) {
            return null;
        }
        CharBuffer charBufferDecode = StandardCharsets.UTF_8.decode(ByteBuffer.wrap(mediaBrowserCompatItemReceiver.TuitionPaymentFragmentspecialinlinedviewModeldefault3()));
        if (charBufferDecode.capacity() != charBufferDecode.limit()) {
            char[] cArr = new char[charBufferDecode.remaining()];
            charBufferDecode.get(cArr);
            return cArr;
        }
        return charBufferDecode.array();
    }

    private byte[] TuitionPaymentFragmentbindingInflater1(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, char[] cArr) {
        Bytes bytesB = Bytes.b(bArr, bArr2, Bytes.b(str, Normalizer.Form.NFKD).byteArray);
        if (cArr != null) {
            byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bArr2, cArr);
            if (bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(bArr2, cArr);
                this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(bArr2, cArr, bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
            bytesB = bytesB.factory.b(new BytesTransformer.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1).b(bytesB.byteArray, bytesB.TuitionPaymentFragmentspecialinlinedviewModeldefault1()), bytesB.byteOrder);
        }
        if (MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection.b == null) {
            MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection.b = new MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection(new MediaBrowserCompatMediaBrowserImplBase5.TuitionPaymentFragmentspecialinlinedviewModeldefault1("HmacSHA512"));
        }
        MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection mediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection = MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection.b;
        return mediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection.b(mediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bArr3), bytesB.byteArray, Bytes.TuitionPaymentFragmentbindingInflater1("DefaultEncryptionProtocol").byteArray, this.b / 8);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements MediaBrowserCompatMediaBrowserImplApi215.TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        private final boolean TuitionPaymentFragmentbindingInflater1 = false;
        private final List<MediaBrowserCompatMediaBrowserImplApi23> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private MediaBrowserCompatMediaBrowserImplApi23 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private final SecureRandom TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private final MediaBrowserCompatMediaBrowserImplApi213 b;
        private final MediaBrowserCompatMediaBrowserImplBase3 g;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(MediaBrowserCompatMediaBrowserImplApi23 mediaBrowserCompatMediaBrowserImplApi23, MediaBrowserCompatMediaBrowserImplApi213 mediaBrowserCompatMediaBrowserImplApi213, MediaBrowserCompatMediaBrowserImplBase3 mediaBrowserCompatMediaBrowserImplBase3, SecureRandom secureRandom, boolean z, List<MediaBrowserCompatMediaBrowserImplApi23> list) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = mediaBrowserCompatMediaBrowserImplApi23;
            this.b = mediaBrowserCompatMediaBrowserImplApi213;
            this.g = mediaBrowserCompatMediaBrowserImplBase3;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = secureRandom;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = list;
        }

        @Override // MediaBrowserCompatMediaBrowserImplApi215.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        public final MediaBrowserCompatMediaBrowserImplApi215 TuitionPaymentFragmentbindingInflater1(byte[] bArr) {
            return new MediaBrowserCompatMediaBrowserImplApi211(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, bArr, this.b, this.g, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentbindingInflater1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (byte) 0);
        }

        @Override // MediaBrowserCompatMediaBrowserImplApi215.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        public final MediaBrowserCompatMediaBrowserImplBase3 b() {
            return this.g;
        }

        @Override // MediaBrowserCompatMediaBrowserImplApi215.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        public final MediaBrowserCompatItemCallbackStubApi23 TuitionPaymentFragmentbindingInflater1() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b.TuitionPaymentFragmentbindingInflater1(this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        }

        @Override // MediaBrowserCompatMediaBrowserImplApi215.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        public final SecureRandom TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        @Override // MediaBrowserCompatMediaBrowserImplApi215.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        public final MediaBrowserCompatItemReceiver TuitionPaymentFragmentbindingInflater1(char[] cArr) {
            SecureRandom secureRandom = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (cArr == null) {
                return null;
            }
            return new MediaBrowserCompatItemReceiver.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Bytes.TuitionPaymentFragmentbindingInflater1(cArr).byteArray, secureRandom);
        }
    }
}
