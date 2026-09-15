package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H'¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0000H'¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0000H'¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH'¢\u0006\u0004\b\b\u0010\u0011J'\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H'¢\u0006\u0004\b\u0004\u0010\u0015J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0016H'¢\u0006\u0004\b\u0006\u0010\u0017J\u0017\u0010\u0004\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u0018H&¢\u0006\u0004\b\u0004\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0012H'¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0019H'¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0019H'¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0012H'¢\u0006\u0004\b\u0004\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0012H'¢\u0006\u0004\b\u001d\u0010\u001cJ\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020 H'¢\u0006\u0004\b\u0006\u0010!J'\u0010\b\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020 2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H'¢\u0006\u0004\b\b\u0010\"R\u0014\u0010$\u001a\u00020\u00038'X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0005\u0082\u0001\u0002\u0003%ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"LRotationProviderListener;", "LSurfaceViewImplementationApi24Impl;", "Ljava/nio/channels/WritableByteChannel;", "LRotationProviderListenerWrapper;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()LRotationProviderListenerWrapper;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()LRotationProviderListener;", "b", "", "flush", "()V", "Ljava/io/OutputStream;", "asBinder", "()Ljava/io/OutputStream;", "", "p0", "([B)LRotationProviderListener;", "", "p1", "p2", "([BII)LRotationProviderListener;", "Lokio/ByteString;", "(Lokio/ByteString;)LRotationProviderListener;", "LtryToComplete;", "", "(LtryToComplete;)J", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(I)LRotationProviderListener;", "a", "(J)LRotationProviderListener;", "notify", "", "(Ljava/lang/String;)LRotationProviderListener;", "(Ljava/lang/String;II)LRotationProviderListener;", "asInterface", "TuitionPaymentFragmentbindingInflater1", "LshouldReusePreview;"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface RotationProviderListener extends SurfaceViewImplementationApi24Impl, WritableByteChannel {
    RotationProviderListener TuitionPaymentFragmentspecialinlinedviewModeldefault1() throws IOException;

    RotationProviderListener TuitionPaymentFragmentspecialinlinedviewModeldefault1(String p0) throws IOException;

    RotationProviderListener TuitionPaymentFragmentspecialinlinedviewModeldefault1(ByteString p0) throws IOException;

    long TuitionPaymentFragmentspecialinlinedviewModeldefault2(tryToComplete p0) throws IOException;

    RotationProviderListener TuitionPaymentFragmentspecialinlinedviewModeldefault2(int p0) throws IOException;

    RotationProviderListener TuitionPaymentFragmentspecialinlinedviewModeldefault2(byte[] p0, int p1, int p2) throws IOException;

    @Deprecated(level = DeprecationLevel.WARNING, message = "moved to val: use getBuffer() instead", replaceWith = @ReplaceWith(expression = "buffer", imports = {}))
    RotationProviderListenerWrapper TuitionPaymentFragmentspecialinlinedviewModeldefault2();

    RotationProviderListener TuitionPaymentFragmentspecialinlinedviewModeldefault3(int p0) throws IOException;

    RotationProviderListener a(int p0) throws IOException;

    RotationProviderListener a(long p0) throws IOException;

    OutputStream asBinder();

    RotationProviderListenerWrapper asInterface();

    RotationProviderListener b() throws IOException;

    RotationProviderListener b(String p0, int p1, int p2) throws IOException;

    RotationProviderListener b(byte[] p0) throws IOException;

    @Override // defpackage.SurfaceViewImplementationApi24Impl, java.io.Flushable
    void flush() throws IOException;

    RotationProviderListener notify(long p0) throws IOException;
}
