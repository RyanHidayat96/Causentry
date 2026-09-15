package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H'¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH'¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0000H'¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0004\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\tH&¢\u0006\u0004\b\u0004\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH'¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u000e\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u000bH'¢\u0006\u0004\b\u000e\u0010\u001fJ\u000f\u0010 \u001a\u00020\tH'¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH'¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000bH&¢\u0006\u0004\b$\u0010%J\u0017\u0010\f\u001a\u00020&2\u0006\u0010\n\u001a\u00020\u001cH&¢\u0006\u0004\b\f\u0010'J\u001f\u0010\u0004\u001a\u00020&2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u000bH&¢\u0006\u0004\b\u0004\u0010(J\u000f\u0010)\u001a\u00020\u000bH&¢\u0006\u0004\b)\u0010%J\u000f\u0010+\u001a\u00020*H&¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020*H&¢\u0006\u0004\b-\u0010,J\u000f\u0010.\u001a\u00020\u000bH&¢\u0006\u0004\b.\u0010%J\u000f\u0010/\u001a\u00020\u000bH&¢\u0006\u0004\b/\u0010%J\u000f\u00101\u001a\u000200H&¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u000200H&¢\u0006\u0004\b3\u00102J\u0017\u0010\f\u001a\u0002052\u0006\u0010\n\u001a\u000204H'¢\u0006\u0004\b\f\u00106J\u0017\u0010\u0017\u001a\u0002052\u0006\u0010\n\u001a\u00020\u000bH'¢\u0006\u0004\b\u0017\u00107J\u000f\u00108\u001a\u000205H'¢\u0006\u0004\b8\u00109J\u0017\u0010\u0004\u001a\u0002052\u0006\u0010\n\u001a\u00020\u000bH'¢\u0006\u0004\b\u0004\u00107J\u0017\u0010:\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH&¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020&2\u0006\u0010\n\u001a\u00020\u000bH&¢\u0006\u0004\b<\u0010=J\u0017\u0010\"\u001a\u00020*2\u0006\u0010\n\u001a\u00020>H&¢\u0006\u0004\b\"\u0010?J\u0017\u0010\u0012\u001a\u00020&2\u0006\u0010\n\u001a\u00020\u000bH&¢\u0006\u0004\b\u0012\u0010=R\u0014\u0010\u0004\u001a\u00020\u00038'X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u0005\u0082\u0001\u0002\u0003@ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"LRotationProvider1;", "LtryToComplete;", "Ljava/nio/channels/ReadableByteChannel;", "LRotationProviderListenerWrapper;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()LRotationProviderListenerWrapper;", "", "d", "()Z", "Lokio/ByteString;", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lokio/ByteString;)J", "b", "Ljava/io/InputStream;", "a", "()Ljava/io/InputStream;", "g", "()LRotationProvider1;", "p1", "(JLokio/ByteString;)Z", "LSurfaceViewImplementationApi24Impl;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(LSurfaceViewImplementationApi24Impl;)J", "", "cancel", "()B", "", "cancelAll", "()[B", "(J)[B", "onTransact", "()Lokio/ByteString;", "TuitionPaymentFragmentbindingInflater1", "(J)Lokio/ByteString;", "INotificationSideChannel", "()J", "", "([B)V", "(LRotationProviderListenerWrapper;J)V", "getInterfaceDescriptor", "", "INotificationSideChannelStubProxy", "()I", "INotificationSideChannelStub", "INotificationSideChannelDefault", "RemoteActionCompatParcelizer", "", "MediaBrowserCompat", "()S", "write", "Ljava/nio/charset/Charset;", "", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "(J)Ljava/lang/String;", "IconCompatParcelizer", "()Ljava/lang/String;", "asBinder", "(J)Z", "asInterface", "(J)V", "LlambdagetPreviewBitmap1;", "(LlambdagetPreviewBitmap1;)I", "LonPixelCopyFinished;"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface RotationProvider1 extends tryToComplete, ReadableByteChannel {
    long INotificationSideChannel() throws IOException;

    long INotificationSideChannelDefault() throws IOException;

    int INotificationSideChannelStub() throws IOException;

    int INotificationSideChannelStubProxy() throws IOException;

    String IconCompatParcelizer() throws IOException;

    short MediaBrowserCompat() throws IOException;

    long RemoteActionCompatParcelizer() throws IOException;

    int TuitionPaymentFragmentbindingInflater1(lambdagetPreviewBitmap1 p0) throws IOException;

    ByteString TuitionPaymentFragmentbindingInflater1(long p0) throws IOException;

    long TuitionPaymentFragmentspecialinlinedviewModeldefault1(SurfaceViewImplementationApi24Impl p0) throws IOException;

    String TuitionPaymentFragmentspecialinlinedviewModeldefault1(long p0) throws IOException;

    @Deprecated(level = DeprecationLevel.WARNING, message = "moved to val: use getBuffer() instead", replaceWith = @ReplaceWith(expression = "buffer", imports = {}))
    RotationProviderListenerWrapper TuitionPaymentFragmentspecialinlinedviewModeldefault2();

    String TuitionPaymentFragmentspecialinlinedviewModeldefault2(long p0) throws IOException;

    void TuitionPaymentFragmentspecialinlinedviewModeldefault2(RotationProviderListenerWrapper p0, long p1) throws IOException;

    boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(long p0, ByteString p1) throws IOException;

    long TuitionPaymentFragmentspecialinlinedviewModeldefault3(ByteString p0) throws IOException;

    String TuitionPaymentFragmentspecialinlinedviewModeldefault3(Charset p0) throws IOException;

    void TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte[] p0) throws IOException;

    InputStream a();

    boolean asBinder(long p0) throws IOException;

    RotationProviderListenerWrapper asInterface();

    void asInterface(long p0) throws IOException;

    long b(ByteString p0) throws IOException;

    byte[] b(long p0) throws IOException;

    byte cancel() throws IOException;

    byte[] cancelAll() throws IOException;

    boolean d() throws IOException;

    RotationProvider1 g();

    void g(long p0) throws IOException;

    long getInterfaceDescriptor() throws IOException;

    ByteString onTransact() throws IOException;

    short write() throws IOException;
}
