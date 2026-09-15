package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.collection.SieveCacheKt;
import androidx.compose.animation.core.AnimationKt;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Typography;
import okhttp3.internal.connection.RealConnection;
import okhttp3.tls.internal.der.DerHeader;
import okio.ByteString;
import okio.SegmentedByteString;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\fB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u0006J\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u000e\u0010\bJ'\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u0006J\u0018\u0010\u000e\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0087\u0002¢\u0006\u0004\b\u000e\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0007\u0010 J\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020!H\u0016¢\u0006\u0004\b\u000e\u0010\"J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020!2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010#J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020!H\u0016¢\u0006\u0004\b\u0012\u0010\"J\u001f\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020!2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0007\u0010#J\u000f\u0010%\u001a\u00020$H\u0017¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0015H\u0016¢\u0006\u0004\b'\u0010\u0019J\u000f\u0010)\u001a\u00020(H\u0017¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0001H\u0017¢\u0006\u0004\b+\u0010,J\u001f\u0010\u0007\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020!H\u0016¢\u0006\u0004\b\u0007\u0010-J/\u0010/\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020!2\u0006\u0010\u0011\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020\u001dH\u0016¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103J'\u0010\f\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u0002042\u0006\u0010\u0010\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\f\u00105J\u001f\u00102\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b2\u00106J\u0017\u0010/\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u000207H\u0016¢\u0006\u0004\b/\u00108J\u000f\u00109\u001a\u00020\u001bH\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u000204H\u0017¢\u0006\u0004\b;\u0010<J\u0017\u0010\u0012\u001a\u0002042\u0006\u0010\u000f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0012\u0010=J\u000f\u0010>\u001a\u00020!H\u0017¢\u0006\u0004\b>\u0010?J\u0017\u0010\f\u001a\u00020!2\u0006\u0010\u000f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\f\u0010@J\u000f\u0010A\u001a\u00020\u000bH\u0016¢\u0006\u0004\bA\u0010\rJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u000204H\u0016¢\u0006\u0004\b\u000e\u0010BJ\u001f\u0010\u0007\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0007\u0010CJ\u000f\u0010D\u001a\u00020\u000bH\u0016¢\u0006\u0004\bD\u0010\rJ\u000f\u0010E\u001a\u00020\u001dH\u0016¢\u0006\u0004\bE\u0010\u001fJ\u000f\u0010F\u001a\u00020\u001dH\u0016¢\u0006\u0004\bF\u0010\u001fJ\u000f\u0010G\u001a\u00020\u000bH\u0016¢\u0006\u0004\bG\u0010\rJ\u000f\u0010H\u001a\u00020\u000bH\u0016¢\u0006\u0004\bH\u0010\rJ\u000f\u0010J\u001a\u00020IH\u0016¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020IH\u0016¢\u0006\u0004\bL\u0010KJ\u0017\u0010\u000e\u001a\u00020N2\u0006\u0010\u000f\u001a\u00020MH\u0017¢\u0006\u0004\b\u000e\u0010OJ\u001f\u0010\u0012\u001a\u00020N2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020MH\u0017¢\u0006\u0004\b\u0012\u0010PJ\u0017\u0010/\u001a\u00020N2\u0006\u0010\u000f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b/\u0010QJ\u000f\u0010R\u001a\u00020NH\u0017¢\u0006\u0004\bR\u0010SJ\u0017\u0010\u0007\u001a\u00020N2\u0006\u0010\u000f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0007\u0010QJ\u0017\u0010)\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b)\u0010TJ\u0017\u0010U\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\bU\u0010VJ\u0017\u0010\f\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020WH\u0016¢\u0006\u0004\b\f\u0010XJ\u0017\u0010+\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b+\u0010VJ\u000f\u0010Y\u001a\u00020!H\u0007¢\u0006\u0004\bY\u0010?J\u0017\u0010\u0018\u001a\u00020!2\u0006\u0010\u000f\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u0018\u0010ZJ\u000f\u0010\\\u001a\u00020[H\u0017¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020NH\u0017¢\u0006\u0004\b^\u0010SJ\u0017\u0010/\u001a\u00020_2\u0006\u0010\u000f\u001a\u00020\u001dH\u0001¢\u0006\u0004\b/\u0010`J\u0017\u0010L\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u000201H\u0016¢\u0006\u0004\bL\u00103J'\u0010/\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u0002042\u0006\u0010\u0010\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u001dH\u0017¢\u0006\u0004\b/\u0010aJ\u001f\u0010L\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\bL\u0010CJ\u0017\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020bH\u0016¢\u0006\u0004\b\u0007\u0010cJ\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u001dH\u0017¢\u0006\u0004\b\f\u0010dJ\u0017\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0018\u0010eJ\u0017\u00109\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b9\u0010eJ\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u001dH\u0017¢\u0006\u0004\b\u0012\u0010dJ\u0017\u0010;\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b;\u0010eJ\u0017\u0010+\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u001dH\u0017¢\u0006\u0004\b+\u0010dJ/\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020N2\u0006\u0010\u0010\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020MH\u0017¢\u0006\u0004\b\u0012\u0010fJ'\u0010\f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020N2\u0006\u0010\u0010\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u001dH\u0017¢\u0006\u0004\b\f\u0010gJ\u0017\u0010)\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u001dH\u0017¢\u0006\u0004\b)\u0010dR\u0014\u0010/\u001a\u00020\u00008WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010\bR\u0018\u0010h\u001a\u0004\u0018\u00010_8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010j\u001a\u00020\u000b8G@AX\u0087\f¢\u0006\u0006\n\u0004\bj\u0010k"}, d2 = {"LRotationProviderListenerWrapper;", "LRotationProvider1;", "LRotationProviderListener;", "", "Ljava/nio/channels/ByteChannel;", "<init>", "()V", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()LRotationProviderListenerWrapper;", "", "close", "", "TuitionPaymentFragmentbindingInflater1", "()J", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "p0", "p1", "p2", "b", "(LRotationProviderListenerWrapper;JJ)LRotationProviderListenerWrapper;", "", "", "equals", "(Ljava/lang/Object;)Z", "d", "()Z", "flush", "", "(J)B", "", "hashCode", "()I", "(BJJ)J", "Lokio/ByteString;", "(Lokio/ByteString;)J", "(Lokio/ByteString;J)J", "Ljava/io/InputStream;", "a", "()Ljava/io/InputStream;", "isOpen", "Ljava/io/OutputStream;", "asBinder", "()Ljava/io/OutputStream;", "g", "()LRotationProvider1;", "(JLokio/ByteString;)Z", "p3", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(JLokio/ByteString;I)Z", "Ljava/nio/ByteBuffer;", "read", "(Ljava/nio/ByteBuffer;)I", "", "([BII)I", "(LRotationProviderListenerWrapper;J)J", "LSurfaceViewImplementationApi24Impl;", "(LSurfaceViewImplementationApi24Impl;)J", "cancel", "()B", "cancelAll", "()[B", "(J)[B", "onTransact", "()Lokio/ByteString;", "(J)Lokio/ByteString;", "INotificationSideChannel", "([B)V", "(LRotationProviderListenerWrapper;J)V", "getInterfaceDescriptor", "INotificationSideChannelStubProxy", "INotificationSideChannelStub", "INotificationSideChannelDefault", "RemoteActionCompatParcelizer", "", "MediaBrowserCompat", "()S", "write", "Ljava/nio/charset/Charset;", "", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "(JLjava/nio/charset/Charset;)Ljava/lang/String;", "(J)Ljava/lang/String;", "IconCompatParcelizer", "()Ljava/lang/String;", "(J)Z", "asInterface", "(J)V", "LlambdagetPreviewBitmap1;", "(LlambdagetPreviewBitmap1;)I", "connect", "(I)Lokio/ByteString;", "LcancelPreviousRequest;", "timeout", "()LcancelPreviousRequest;", "toString", "LSurfaceViewImplementationSurfaceRequestCallback;", "(I)LSurfaceViewImplementationSurfaceRequestCallback;", "([BII)LRotationProviderListenerWrapper;", "LtryToComplete;", "(LtryToComplete;)J", "(I)LRotationProviderListenerWrapper;", "(J)LRotationProviderListenerWrapper;", "(Ljava/lang/String;IILjava/nio/charset/Charset;)LRotationProviderListenerWrapper;", "(Ljava/lang/String;II)LRotationProviderListenerWrapper;", "head", "LSurfaceViewImplementationSurfaceRequestCallback;", "size", "J"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RotationProviderListenerWrapper implements RotationProvider1, RotationProviderListener, Cloneable, ByteChannel {
    public SurfaceViewImplementationSurfaceRequestCallback head;
    public long size;

    @Override // defpackage.RotationProvider1, defpackage.RotationProviderListener
    public final RotationProviderListenerWrapper TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this;
    }

    @Override // defpackage.RotationProvider1, defpackage.RotationProviderListener
    public final RotationProviderListenerWrapper asInterface() {
        return this;
    }

    @Override // defpackage.tryToComplete, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.RotationProviderListener, defpackage.SurfaceViewImplementationApi24Impl, java.io.Flushable
    public final void flush() {
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // defpackage.RotationProviderListener
    public final /* synthetic */ RotationProviderListener TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this;
    }

    @Override // defpackage.RotationProviderListener
    public final /* synthetic */ RotationProviderListener TuitionPaymentFragmentspecialinlinedviewModeldefault1(ByteString byteString) throws IllegalAccessException {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46401 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), ExpandableListView.getPackedPositionType(0L) + 40, TextUtils.getCapsMode("", 0, 0) + 19, 1513912262, false, "b", null);
        }
        int i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 37836), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 59, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 18, 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
        }
        int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
        long j = i2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 37835), 59 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 17, 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
        long jIdentityHashCode = System.identityHashCode(this);
        long j2 = (((long) 51) * 3959546785380325711L) + (((long) (-49)) * 1559706711779460528L) + (((long) (-50)) * (jIdentityHashCode | 3959546785380325711L));
        long j3 = 50;
        long j4 = -1;
        long j5 = j4 ^ 1559706711779460528L;
        long j6 = (((j4 ^ 3959546785380325711L) | j5) | jIdentityHashCode) ^ j4;
        long j7 = jIdentityHashCode ^ j4;
        long j8 = j5 | j7;
        long j9 = j2 + ((j6 | ((j8 | 3959546785380325711L) ^ j4)) * j3) + (j3 * ((j8 ^ j4) | ((j5 | 3959546785380325711L) ^ j4) | ((j7 | 3959546785380325711L) ^ j4)));
        long j10 = j;
        int i4 = 0;
        while (true) {
            for (int i5 = 0; i5 != 8; i5++) {
                i3 = (((((int) (j10 >> i5)) & 255) + (i3 << 6)) + (i3 << 16)) - i3;
            }
            if (i4 != 0) {
                break;
            }
            i4++;
            j10 = j9;
        }
        if (i3 != i) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46399 - ExpandableListView.getPackedPositionChild(0L)), 40 - TextUtils.getOffsetAfter("", 0), Gravity.getAbsoluteGravity(0, 0) + 19, -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
            int[] iArr = new int[i2];
            int i6 = i2 - 1;
            iArr[i6] = 1;
            Toast.makeText((Context) null, iArr[((i2 * i6) % 2) - 1], 1).show();
        }
        Intrinsics.checkNotNullParameter(byteString, "");
        byteString.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, 0, byteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        return this;
    }

    @Override // defpackage.RotationProviderListener
    public final /* synthetic */ RotationProviderListener b() {
        return this;
    }

    public static final class b extends OutputStream {
        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() {
        }

        public b() {
        }

        @Override // java.io.OutputStream
        public final void write(int i) {
            RotationProviderListenerWrapper.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) {
            Intrinsics.checkNotNullParameter(bArr, "");
            RotationProviderListenerWrapper.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bArr, i, i2);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(RotationProviderListenerWrapper.this);
            sb.append(".outputStream()");
            return sb.toString();
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 extends InputStream {
        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        public TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        @Override // java.io.InputStream
        public final int read() {
            if (RotationProviderListenerWrapper.this.size > 0) {
                return RotationProviderListenerWrapper.this.cancel() & UByte.MAX_VALUE;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) {
            Intrinsics.checkNotNullParameter(bArr, "");
            return RotationProviderListenerWrapper.this.TuitionPaymentFragmentbindingInflater1(bArr, i, i2);
        }

        @Override // java.io.InputStream
        public final int available() {
            return (int) Math.min(RotationProviderListenerWrapper.this.size, SieveCacheKt.NodeLinkMask);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(RotationProviderListenerWrapper.this);
            sb.append(".inputStream()");
            return sb.toString();
        }
    }

    @Override // defpackage.RotationProviderListener
    public final /* synthetic */ RotationProviderListener TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return b(str, 0, str.length());
    }

    @Override // defpackage.RotationProviderListener
    public final /* synthetic */ RotationProviderListener b(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(bArr, 0, bArr.length);
    }

    @Override // defpackage.RotationProviderListener
    public final OutputStream asBinder() {
        return new b();
    }

    @Override // defpackage.RotationProvider1
    public final boolean d() {
        return this.size == 0;
    }

    @Override // defpackage.RotationProvider1
    public final void asInterface(long p0) throws EOFException {
        if (this.size < p0) {
            throw new EOFException();
        }
    }

    @Override // defpackage.RotationProvider1
    public final boolean asBinder(long p0) {
        return this.size >= p0;
    }

    @Override // defpackage.RotationProvider1
    public final RotationProvider1 g() {
        return SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new lambdaonSurfaceRequested0androidxcameraviewSurfaceViewImplementation(this));
    }

    @Override // defpackage.RotationProvider1
    public final InputStream a() {
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    public static /* synthetic */ TuitionPaymentFragmentbindingInflater1 b(RotationProviderListenerWrapper rotationProviderListenerWrapper) {
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1B = recalculate.b();
        Intrinsics.checkNotNullParameter(tuitionPaymentFragmentbindingInflater1B, "");
        return closeSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(rotationProviderListenerWrapper, tuitionPaymentFragmentbindingInflater1B);
    }

    @Override // defpackage.RotationProvider1
    public final short write() throws EOFException {
        return recalculate.TuitionPaymentFragmentspecialinlinedviewModeldefault1(MediaBrowserCompat());
    }

    @Override // defpackage.RotationProvider1
    public final int INotificationSideChannelStub() throws EOFException {
        return recalculate.TuitionPaymentFragmentspecialinlinedviewModeldefault2(INotificationSideChannelStubProxy());
    }

    @Override // defpackage.RotationProvider1
    public final long RemoteActionCompatParcelizer() throws EOFException {
        return recalculate.TuitionPaymentFragmentbindingInflater1(INotificationSideChannelDefault());
    }

    @Override // defpackage.RotationProvider1
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1(long p0) throws EOFException {
        return b(p0, Charsets.UTF_8);
    }

    @Override // defpackage.RotationProvider1
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3(Charset p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return b(this.size, p0);
    }

    public final String b(long p0, Charset p1) throws EOFException {
        Intrinsics.checkNotNullParameter(p1, "");
        if (p0 < 0 || p0 > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException("byteCount: ".concat(String.valueOf(p0)).toString());
        }
        if (this.size < p0) {
            throw new EOFException();
        }
        if (p0 == 0) {
            return "";
        }
        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback = this.head;
        Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback);
        if (((long) surfaceViewImplementationSurfaceRequestCallback.pos) + p0 > surfaceViewImplementationSurfaceRequestCallback.limit) {
            return new String(b(p0), p1);
        }
        int i = (int) p0;
        String str = new String(surfaceViewImplementationSurfaceRequestCallback.data, surfaceViewImplementationSurfaceRequestCallback.pos, i, p1);
        surfaceViewImplementationSurfaceRequestCallback.pos += i;
        this.size -= p0;
        if (surfaceViewImplementationSurfaceRequestCallback.pos == surfaceViewImplementationSurfaceRequestCallback.limit) {
            this.head = surfaceViewImplementationSurfaceRequestCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            pixelCopyRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceViewImplementationSurfaceRequestCallback);
        }
        return str;
    }

    @Override // defpackage.RotationProvider1
    public final String IconCompatParcelizer() throws EOFException {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(Long.MAX_VALUE);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer p0) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback = this.head;
        if (surfaceViewImplementationSurfaceRequestCallback == null) {
            return -1;
        }
        int iMin = Math.min(p0.remaining(), surfaceViewImplementationSurfaceRequestCallback.limit - surfaceViewImplementationSurfaceRequestCallback.pos);
        p0.put(surfaceViewImplementationSurfaceRequestCallback.data, surfaceViewImplementationSurfaceRequestCallback.pos, iMin);
        surfaceViewImplementationSurfaceRequestCallback.pos += iMin;
        this.size -= (long) iMin;
        if (surfaceViewImplementationSurfaceRequestCallback.pos == surfaceViewImplementationSurfaceRequestCallback.limit) {
            this.head = surfaceViewImplementationSurfaceRequestCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            pixelCopyRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceViewImplementationSurfaceRequestCallback);
        }
        return iMin;
    }

    public final RotationProviderListenerWrapper b(String p0, int p1, int p2, Charset p3) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p3, "");
        if (p1 < 0) {
            throw new IllegalArgumentException("beginIndex < 0: ".concat(String.valueOf(p1)).toString());
        }
        if (p2 < p1) {
            StringBuilder sb = new StringBuilder("endIndex < beginIndex: ");
            sb.append(p2);
            sb.append(" < ");
            sb.append(p1);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (p2 > p0.length()) {
            StringBuilder sb2 = new StringBuilder("endIndex > string.length: ");
            sb2.append(p2);
            sb2.append(" > ");
            sb2.append(p0.length());
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        if (Intrinsics.areEqual(p3, Charsets.UTF_8)) {
            return b(p0, p1, p2);
        }
        String strSubstring = p0.substring(p1, p2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        byte[] bytes = strSubstring.getBytes(p3);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(bytes, 0, bytes.length);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer p0) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        int iRemaining = p0.remaining();
        int i = iRemaining;
        while (i > 0) {
            SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(1);
            int iMin = Math.min(i, 8192 - surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.limit);
            p0.get(surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.data, surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.limit, iMin);
            i -= iMin;
            surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.limit += iMin;
        }
        this.size += (long) iRemaining;
        return iRemaining;
    }

    @Override // defpackage.RotationProvider1
    public final long TuitionPaymentFragmentspecialinlinedviewModeldefault3(ByteString p0) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        return TuitionPaymentFragmentbindingInflater1(p0, 0L);
    }

    @Override // defpackage.RotationProvider1
    public final long b(ByteString p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0, 0L);
    }

    @Override // defpackage.tryToComplete
    public final cancelPreviousRequest timeout() {
        return cancelPreviousRequest.NONE;
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0011\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0013\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0001@\u0001X\u0081\f¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0012"}, d2 = {"LRotationProviderListenerWrapper$TuitionPaymentFragmentbindingInflater1;", "Ljava/io/Closeable;", "<init>", "()V", "", "close", "", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(J)I", "LRotationProviderListenerWrapper;", "TuitionPaymentFragmentbindingInflater1", "LRotationProviderListenerWrapper;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "", "[B", "b", "I", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "J", "", "Z", "LSurfaceViewImplementationSurfaceRequestCallback;", "asInterface", "LSurfaceViewImplementationSurfaceRequestCallback;", "g", "a", "asBinder"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TuitionPaymentFragmentbindingInflater1 implements Closeable {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public RotationProviderListenerWrapper TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        public byte[] TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
        public SurfaceViewImplementationSurfaceRequestCallback g;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        public long b = -1;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public int asBinder = -1;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1;

        public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3(long p0) {
            RotationProviderListenerWrapper rotationProviderListenerWrapper = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (rotationProviderListenerWrapper == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (p0 < -1 || p0 > rotationProviderListenerWrapper.size) {
                StringBuilder sb = new StringBuilder("offset=");
                sb.append(p0);
                sb.append(" > size=");
                sb.append(rotationProviderListenerWrapper.size);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
            if (p0 != -1 && p0 != rotationProviderListenerWrapper.size) {
                long j = rotationProviderListenerWrapper.size;
                SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3 = rotationProviderListenerWrapper.head;
                SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback = rotationProviderListenerWrapper.head;
                SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback2 = this.g;
                long j2 = 0;
                if (surfaceViewImplementationSurfaceRequestCallback2 != null) {
                    long j3 = this.b;
                    int i = this.asBinder;
                    Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback2);
                    long j4 = j3 - ((long) (i - surfaceViewImplementationSurfaceRequestCallback2.pos));
                    if (j4 > p0) {
                        surfaceViewImplementationSurfaceRequestCallback = this.g;
                        j = j4;
                    } else {
                        surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.g;
                        j2 = j4;
                    }
                }
                if (j - p0 > p0 - j2) {
                    while (true) {
                        Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        if (p0 < ((long) (surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3.limit - surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3.pos)) + j2) {
                            break;
                        }
                        j2 += (long) (surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3.limit - surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3.pos);
                        surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3 = surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3.next;
                    }
                } else {
                    while (j > p0) {
                        Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback);
                        surfaceViewImplementationSurfaceRequestCallback = surfaceViewImplementationSurfaceRequestCallback.prev;
                        Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback);
                        j -= (long) (surfaceViewImplementationSurfaceRequestCallback.limit - surfaceViewImplementationSurfaceRequestCallback.pos);
                    }
                    j2 = j;
                    surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3 = surfaceViewImplementationSurfaceRequestCallback;
                }
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                    Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    if (surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3.shared) {
                        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentbindingInflater1 = surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1();
                        if (rotationProviderListenerWrapper.head == surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                            rotationProviderListenerWrapper.head = surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentbindingInflater1;
                        }
                        surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3 = surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentbindingInflater1);
                        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback3 = surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3.prev;
                        Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback3);
                        surfaceViewImplementationSurfaceRequestCallback3.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    }
                }
                this.g = surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                this.b = p0;
                Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                this.TuitionPaymentFragmentbindingInflater1 = surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3.data;
                this.asBinder = surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3.pos + ((int) (p0 - j2));
                int i2 = surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3.limit;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2;
                return i2 - this.asBinder;
            }
            this.g = null;
            this.b = p0;
            this.TuitionPaymentFragmentbindingInflater1 = null;
            this.asBinder = -1;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1;
            return -1;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
            this.g = null;
            this.b = -1L;
            this.TuitionPaymentFragmentbindingInflater1 = null;
            this.asBinder = -1;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1;
        }
    }

    public final String toString() {
        return connect().toString();
    }

    @Override // defpackage.RotationProvider1
    public final int TuitionPaymentFragmentbindingInflater1(lambdagetPreviewBitmap1 p0) throws EOFException {
        Intrinsics.checkNotNullParameter(p0, "");
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = closeSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, p0, false);
        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 == -1) {
            return -1;
        }
        g(p0.b[iTuitionPaymentFragmentspecialinlinedviewModeldefault3].TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        return iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.RotationProvider1
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2(long p0) throws EOFException {
        if (p0 < 0) {
            throw new IllegalArgumentException("limit < 0: ".concat(String.valueOf(p0)).toString());
        }
        long j = p0 != Long.MAX_VALUE ? p0 + 1 : Long.MAX_VALUE;
        long jTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2((byte) 10, 0L, j);
        if (jTuitionPaymentFragmentspecialinlinedviewModeldefault2 != -1) {
            return closeSurface.b(this, jTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
        if (j < this.size && TuitionPaymentFragmentspecialinlinedviewModeldefault3(j - 1) == 13 && TuitionPaymentFragmentspecialinlinedviewModeldefault3(j) == 10) {
            return closeSurface.b(this, j);
        }
        RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
        b(rotationProviderListenerWrapper, 0L, Math.min(32L, this.size));
        StringBuilder sb = new StringBuilder("\\n not found: limit=");
        sb.append(Math.min(this.size, p0));
        sb.append(" content=");
        sb.append(rotationProviderListenerWrapper.TuitionPaymentFragmentbindingInflater1(rotationProviderListenerWrapper.size).TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        sb.append(Typography.ellipsis);
        throw new EOFException(sb.toString());
    }

    @Override // defpackage.RotationProvider1
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte[] p0) throws EOFException {
        Intrinsics.checkNotNullParameter(p0, "");
        int i = 0;
        while (i < p0.length) {
            int iTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(p0, i, p0.length - i);
            if (iTuitionPaymentFragmentbindingInflater1 == -1) {
                throw new EOFException();
            }
            i += iTuitionPaymentFragmentbindingInflater1;
        }
    }

    public final int TuitionPaymentFragmentbindingInflater1(byte[] p0, int p1, int p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        recalculate.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0.length, p1, p2);
        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback = this.head;
        if (surfaceViewImplementationSurfaceRequestCallback == null) {
            return -1;
        }
        int iMin = Math.min(p2, surfaceViewImplementationSurfaceRequestCallback.limit - surfaceViewImplementationSurfaceRequestCallback.pos);
        ArraysKt.copyInto(surfaceViewImplementationSurfaceRequestCallback.data, p0, p1, surfaceViewImplementationSurfaceRequestCallback.pos, surfaceViewImplementationSurfaceRequestCallback.pos + iMin);
        surfaceViewImplementationSurfaceRequestCallback.pos += iMin;
        this.size -= (long) iMin;
        if (surfaceViewImplementationSurfaceRequestCallback.pos == surfaceViewImplementationSurfaceRequestCallback.limit) {
            this.head = surfaceViewImplementationSurfaceRequestCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            pixelCopyRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceViewImplementationSurfaceRequestCallback);
        }
        return iMin;
    }

    @Override // defpackage.RotationProvider1
    public final void g(long p0) throws EOFException {
        while (p0 > 0) {
            SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback = this.head;
            if (surfaceViewImplementationSurfaceRequestCallback == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(p0, surfaceViewImplementationSurfaceRequestCallback.limit - surfaceViewImplementationSurfaceRequestCallback.pos);
            long j = iMin;
            this.size -= j;
            p0 -= j;
            surfaceViewImplementationSurfaceRequestCallback.pos += iMin;
            if (surfaceViewImplementationSurfaceRequestCallback.pos == surfaceViewImplementationSurfaceRequestCallback.limit) {
                this.head = surfaceViewImplementationSurfaceRequestCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                pixelCopyRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceViewImplementationSurfaceRequestCallback);
            }
        }
    }

    @Override // defpackage.RotationProviderListener
    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
    public final RotationProviderListenerWrapper b(String p0, int p1, int p2) {
        char cCharAt;
        Intrinsics.checkNotNullParameter(p0, "");
        if (p1 < 0) {
            throw new IllegalArgumentException("beginIndex < 0: ".concat(String.valueOf(p1)).toString());
        }
        if (p2 < p1) {
            StringBuilder sb = new StringBuilder("endIndex < beginIndex: ");
            sb.append(p2);
            sb.append(" < ");
            sb.append(p1);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (p2 > p0.length()) {
            StringBuilder sb2 = new StringBuilder("endIndex > string.length: ");
            sb2.append(p2);
            sb2.append(" > ");
            sb2.append(p0.length());
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        while (p1 < p2) {
            char cCharAt2 = p0.charAt(p1);
            if (cCharAt2 < 128) {
                SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(1);
                byte[] bArr = surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.data;
                int i = surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.limit - p1;
                int iMin = Math.min(p2, 8192 - i);
                int i2 = p1 + 1;
                bArr[p1 + i] = (byte) cCharAt2;
                while (true) {
                    p1 = i2;
                    if (p1 >= iMin || (cCharAt = p0.charAt(p1)) >= 128) {
                        break;
                    }
                    i2 = p1 + 1;
                    bArr[p1 + i] = (byte) cCharAt;
                }
                int i3 = (i + p1) - surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.limit;
                surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.limit += i3;
                this.size += (long) i3;
            } else {
                if (cCharAt2 < 2048) {
                    SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(2);
                    surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault2.data[surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault2.limit] = (byte) ((cCharAt2 >> 6) | DerHeader.TAG_CLASS_PRIVATE);
                    surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault2.data[surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault2.limit + 1] = (byte) ((cCharAt2 & '?') | 128);
                    surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault2.limit += 2;
                    this.size += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(3);
                    surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3.data[surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3.limit] = (byte) ((cCharAt2 >> '\f') | 224);
                    surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3.data[surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3.limit + 1] = (byte) (((cCharAt2 >> 6) & 63) | 128);
                    surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3.data[surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3.limit + 2] = (byte) ((cCharAt2 & '?') | 128);
                    surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3.limit += 3;
                    this.size += 3;
                } else {
                    int i4 = p1 + 1;
                    char cCharAt3 = i4 < p2 ? p0.charAt(i4) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3(63);
                        p1 = i4;
                    } else {
                        int i5 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(4);
                        surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault4.data[surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault4.limit] = (byte) ((i5 >> 18) | 240);
                        surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault4.data[surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault4.limit + 1] = (byte) (((i5 >> 12) & 63) | 128);
                        surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault4.data[surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault4.limit + 2] = (byte) (((i5 >> 6) & 63) | 128);
                        surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault4.data[surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault4.limit + 3] = (byte) ((i5 & 63) | 128);
                        surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault4.limit += 4;
                        this.size += 4;
                        p1 += 2;
                    }
                }
                p1++;
            }
        }
        return this;
    }

    public final RotationProviderListenerWrapper asBinder(int p0) {
        if (p0 < 128) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
            return this;
        }
        if (p0 < 2048) {
            SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(2);
            surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.data[surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.limit] = (byte) ((p0 >> 6) | DerHeader.TAG_CLASS_PRIVATE);
            surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.data[surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.limit + 1] = (byte) ((p0 & 63) | 128);
            surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.limit += 2;
            this.size += 2;
            return this;
        }
        if (55296 <= p0 && p0 < 57344) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(63);
            return this;
        }
        if (p0 < 65536) {
            SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(3);
            surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault2.data[surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault2.limit] = (byte) ((p0 >> 12) | 224);
            surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault2.data[surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault2.limit + 1] = (byte) (((p0 >> 6) & 63) | 128);
            surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault2.data[surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault2.limit + 2] = (byte) ((p0 & 63) | 128);
            surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault2.limit += 3;
            this.size += 3;
            return this;
        }
        if (p0 <= 1114111) {
            SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(4);
            surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3.data[surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3.limit] = (byte) ((p0 >> 18) | 240);
            surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3.data[surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3.limit + 1] = (byte) (((p0 >> 12) & 63) | 128);
            surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3.data[surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3.limit + 2] = (byte) (((p0 >> 6) & 63) | 128);
            surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3.data[surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3.limit + 3] = (byte) ((p0 & 63) | 128);
            surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3.limit += 4;
            this.size += 4;
            return this;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        sb.append(recalculate.b(p0));
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.RotationProviderListener
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
    public final RotationProviderListenerWrapper TuitionPaymentFragmentspecialinlinedviewModeldefault2(byte[] p0, int p1, int p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        long j = p2;
        recalculate.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0.length, p1, j);
        int i = p2 + p1;
        while (p1 < i) {
            SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(1);
            int iMin = Math.min(i - p1, 8192 - surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.limit);
            int i2 = p1 + iMin;
            ArraysKt.copyInto(p0, surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.data, surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.limit, p1, i2);
            surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.limit += iMin;
            p1 = i2;
        }
        this.size += j;
        return this;
    }

    @Override // defpackage.RotationProviderListener
    public final long TuitionPaymentFragmentspecialinlinedviewModeldefault2(tryToComplete p0) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        long j = 0;
        while (true) {
            long j2 = p0.read(this, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (j2 == -1) {
                return j;
            }
            j += j2;
        }
    }

    @Override // defpackage.RotationProviderListener
    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
    public final RotationProviderListenerWrapper TuitionPaymentFragmentspecialinlinedviewModeldefault3(int p0) {
        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(1);
        byte[] bArr = surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.data;
        int i = surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.limit;
        surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.limit = i + 1;
        bArr[i] = (byte) p0;
        this.size++;
        return this;
    }

    @Override // defpackage.RotationProviderListener
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final RotationProviderListenerWrapper a(int p0) {
        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(2);
        byte[] bArr = surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.data;
        int i = surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.limit;
        bArr[i] = (byte) ((p0 >>> 8) & 255);
        bArr[i + 1] = (byte) (p0 & 255);
        surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.limit = i + 2;
        this.size += 2;
        return this;
    }

    @Override // defpackage.RotationProviderListener
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final RotationProviderListenerWrapper TuitionPaymentFragmentspecialinlinedviewModeldefault2(int p0) {
        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(4);
        byte[] bArr = surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.data;
        int i = surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.limit;
        bArr[i] = (byte) ((p0 >>> 24) & 255);
        bArr[i + 1] = (byte) ((p0 >>> 16) & 255);
        bArr[i + 2] = (byte) ((p0 >>> 8) & 255);
        bArr[i + 3] = (byte) (p0 & 255);
        surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.limit = i + 4;
        this.size += 4;
        return this;
    }

    public final RotationProviderListenerWrapper cancelAll(long p0) {
        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(8);
        byte[] bArr = surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.data;
        int i = surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.limit;
        bArr[i] = (byte) ((p0 >>> 56) & 255);
        bArr[i + 1] = (byte) ((p0 >>> 48) & 255);
        bArr[i + 2] = (byte) ((p0 >>> 40) & 255);
        bArr[i + 3] = (byte) ((p0 >>> 32) & 255);
        bArr[i + 4] = (byte) ((p0 >>> 24) & 255);
        bArr[i + 5] = (byte) ((p0 >>> 16) & 255);
        bArr[i + 6] = (byte) ((p0 >>> 8) & 255);
        bArr[i + 7] = (byte) (p0 & 255);
        surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.limit = i + 8;
        this.size += 8;
        return this;
    }

    @Override // defpackage.RotationProviderListener
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final RotationProviderListenerWrapper a(long p0) {
        int i;
        if (p0 == 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(48);
        }
        boolean z = false;
        if (p0 < 0) {
            p0 = -p0;
            if (p0 < 0) {
                Intrinsics.checkNotNullParameter("-9223372036854775808", "");
                return b("-9223372036854775808", 0, 20);
            }
            z = true;
        }
        if (p0 < 100000000) {
            if (p0 < 10000) {
                if (p0 < 100) {
                    i = p0 >= 10 ? 2 : 1;
                } else {
                    i = p0 < 1000 ? 3 : 4;
                }
            } else if (p0 < AnimationKt.MillisToNanos) {
                i = p0 < 100000 ? 5 : 6;
            } else {
                i = p0 < 10000000 ? 7 : 8;
            }
        } else if (p0 < 1000000000000L) {
            if (p0 < RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
                i = p0 < 1000000000 ? 9 : 10;
            } else {
                i = p0 < 100000000000L ? 11 : 12;
            }
        } else if (p0 < 1000000000000000L) {
            if (p0 < 10000000000000L) {
                i = 13;
            } else {
                i = p0 < 100000000000000L ? 14 : 15;
            }
        } else if (p0 < 100000000000000000L) {
            i = p0 < 10000000000000000L ? 16 : 17;
        } else {
            i = p0 < 1000000000000000000L ? 18 : 19;
        }
        if (z) {
            i++;
        }
        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(i);
        byte[] bArr = surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.data;
        int i2 = surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.limit + i;
        while (p0 != 0) {
            i2--;
            bArr[i2] = closeSurface.b()[(int) (p0 % 10)];
            p0 /= 10;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.limit += i;
        this.size += (long) i;
        return this;
    }

    @Override // defpackage.RotationProviderListener
    /* JADX INFO: renamed from: cancel, reason: merged with bridge method [inline-methods] */
    public final RotationProviderListenerWrapper notify(long p0) {
        if (p0 == 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(48);
        }
        long j = (p0 >>> 1) | p0;
        long j2 = j | (j >>> 2);
        long j3 = j2 | (j2 >>> 4);
        long j4 = j3 | (j3 >>> 8);
        long j5 = j4 | (j4 >>> 16);
        long j6 = j5 | (j5 >>> 32);
        long j7 = j6 - ((j6 >>> 1) & 6148914691236517205L);
        long j8 = ((j7 >>> 2) & 3689348814741910323L) + (j7 & 3689348814741910323L);
        long j9 = ((j8 >>> 4) + j8) & 1085102592571150095L;
        long j10 = j9 + (j9 >>> 8);
        long j11 = j10 + (j10 >>> 16);
        int i = (int) ((((j11 & 63) + ((j11 >>> 32) & 63)) + 3) / 4);
        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(i);
        byte[] bArr = surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.data;
        int i2 = surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.limit;
        for (int i3 = (surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.limit + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = closeSurface.b()[(int) (15 & p0)];
            p0 >>>= 4;
        }
        surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault1.limit += i;
        this.size += (long) i;
        return this;
    }

    public final SurfaceViewImplementationSurfaceRequestCallback TuitionPaymentFragmentspecialinlinedviewModeldefault1(int p0) {
        if (p0 <= 0 || p0 > 8192) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback = this.head;
        if (surfaceViewImplementationSurfaceRequestCallback == null) {
            SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault2 = pixelCopyRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            this.head = surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault2.prev = surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault2.next = surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            return surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback);
        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback2 = surfaceViewImplementationSurfaceRequestCallback.prev;
        Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback2);
        return (surfaceViewImplementationSurfaceRequestCallback2.limit + p0 > 8192 || !surfaceViewImplementationSurfaceRequestCallback2.owner) ? surfaceViewImplementationSurfaceRequestCallback2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(pixelCopyRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) : surfaceViewImplementationSurfaceRequestCallback2;
    }

    public final long TuitionPaymentFragmentspecialinlinedviewModeldefault2(ByteString p0, long p1) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(p0, "");
        long j = 0;
        if (p1 < 0) {
            throw new IllegalArgumentException("fromIndex < 0: ".concat(String.valueOf(p1)).toString());
        }
        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback = this.head;
        if (surfaceViewImplementationSurfaceRequestCallback == null) {
            return -1L;
        }
        long j2 = this.size;
        if (j2 - p1 < p1) {
            while (j2 > p1) {
                surfaceViewImplementationSurfaceRequestCallback = surfaceViewImplementationSurfaceRequestCallback.prev;
                Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback);
                j2 -= (long) (surfaceViewImplementationSurfaceRequestCallback.limit - surfaceViewImplementationSurfaceRequestCallback.pos);
            }
            if (surfaceViewImplementationSurfaceRequestCallback == null) {
                return -1L;
            }
            if (p0.TuitionPaymentFragmentspecialinlinedviewModeldefault3() != 2) {
                byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = p0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                while (j2 < this.size) {
                    byte[] bArr = surfaceViewImplementationSurfaceRequestCallback.data;
                    i = (int) ((((long) surfaceViewImplementationSurfaceRequestCallback.pos) + p1) - j2);
                    int i3 = surfaceViewImplementationSurfaceRequestCallback.limit;
                    while (true) {
                        if (i < i3) {
                            byte b2 = bArr[i];
                            int length = bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1.length;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= length) {
                                    i++;
                                } else if (b2 == bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[i4]) {
                                    i2 = surfaceViewImplementationSurfaceRequestCallback.pos;
                                } else {
                                    i4++;
                                }
                            }
                        } else {
                            j2 += (long) (surfaceViewImplementationSurfaceRequestCallback.limit - surfaceViewImplementationSurfaceRequestCallback.pos);
                            surfaceViewImplementationSurfaceRequestCallback = surfaceViewImplementationSurfaceRequestCallback.next;
                            Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback);
                            p1 = j2;
                        }
                    }
                }
            } else {
                byte b3 = p0.b(0);
                byte b4 = p0.b(1);
                while (j2 < this.size) {
                    byte[] bArr2 = surfaceViewImplementationSurfaceRequestCallback.data;
                    i = (int) ((((long) surfaceViewImplementationSurfaceRequestCallback.pos) + p1) - j2);
                    int i5 = surfaceViewImplementationSurfaceRequestCallback.limit;
                    while (true) {
                        if (i < i5) {
                            byte b5 = bArr2[i];
                            if (b5 == b3 || b5 == b4) {
                                i2 = surfaceViewImplementationSurfaceRequestCallback.pos;
                            } else {
                                i++;
                            }
                        } else {
                            j2 += (long) (surfaceViewImplementationSurfaceRequestCallback.limit - surfaceViewImplementationSurfaceRequestCallback.pos);
                            surfaceViewImplementationSurfaceRequestCallback = surfaceViewImplementationSurfaceRequestCallback.next;
                            Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback);
                            p1 = j2;
                        }
                    }
                }
            }
            return -1L;
        }
        while (true) {
            long j3 = ((long) (surfaceViewImplementationSurfaceRequestCallback.limit - surfaceViewImplementationSurfaceRequestCallback.pos)) + j;
            if (j3 > p1) {
                break;
            }
            surfaceViewImplementationSurfaceRequestCallback = surfaceViewImplementationSurfaceRequestCallback.next;
            Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback);
            j = j3;
        }
        if (surfaceViewImplementationSurfaceRequestCallback == null) {
            return -1L;
        }
        if (p0.TuitionPaymentFragmentspecialinlinedviewModeldefault3() != 2) {
            byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = p0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            j2 = j;
            while (j2 < this.size) {
                byte[] bArr3 = surfaceViewImplementationSurfaceRequestCallback.data;
                i = (int) ((((long) surfaceViewImplementationSurfaceRequestCallback.pos) + p1) - j2);
                int i6 = surfaceViewImplementationSurfaceRequestCallback.limit;
                while (true) {
                    if (i < i6) {
                        byte b6 = bArr3[i];
                        int length2 = bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2.length;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= length2) {
                                i++;
                            } else if (b6 != bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2[i7]) {
                                i7++;
                            } else {
                                i2 = surfaceViewImplementationSurfaceRequestCallback.pos;
                            }
                        }
                    } else {
                        j2 += (long) (surfaceViewImplementationSurfaceRequestCallback.limit - surfaceViewImplementationSurfaceRequestCallback.pos);
                        surfaceViewImplementationSurfaceRequestCallback = surfaceViewImplementationSurfaceRequestCallback.next;
                        Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback);
                        p1 = j2;
                    }
                }
            }
        } else {
            byte b7 = p0.b(0);
            byte b8 = p0.b(1);
            while (j < this.size) {
                byte[] bArr4 = surfaceViewImplementationSurfaceRequestCallback.data;
                i = (int) ((((long) surfaceViewImplementationSurfaceRequestCallback.pos) + p1) - j);
                int i8 = surfaceViewImplementationSurfaceRequestCallback.limit;
                while (true) {
                    if (i < i8) {
                        byte b9 = bArr4[i];
                        if (b9 == b7 || b9 == b8) {
                            j2 = j;
                            i2 = surfaceViewImplementationSurfaceRequestCallback.pos;
                        } else {
                            i++;
                        }
                    } else {
                        j += (long) (surfaceViewImplementationSurfaceRequestCallback.limit - surfaceViewImplementationSurfaceRequestCallback.pos);
                        surfaceViewImplementationSurfaceRequestCallback = surfaceViewImplementationSurfaceRequestCallback.next;
                        Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback);
                        p1 = j;
                    }
                }
            }
        }
        return -1L;
        return ((long) (i - i2)) + j2;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof RotationProviderListenerWrapper)) {
            return false;
        }
        long j = this.size;
        RotationProviderListenerWrapper rotationProviderListenerWrapper = (RotationProviderListenerWrapper) p0;
        if (j != rotationProviderListenerWrapper.size) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback = this.head;
        Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback);
        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback2 = rotationProviderListenerWrapper.head;
        Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback2);
        int i = surfaceViewImplementationSurfaceRequestCallback.pos;
        int i2 = surfaceViewImplementationSurfaceRequestCallback2.pos;
        long j3 = 0;
        while (j3 < this.size) {
            long jMin = Math.min(surfaceViewImplementationSurfaceRequestCallback.limit - i, surfaceViewImplementationSurfaceRequestCallback2.limit - i2);
            long j4 = j2;
            while (j4 < jMin) {
                if (surfaceViewImplementationSurfaceRequestCallback.data[i] != surfaceViewImplementationSurfaceRequestCallback2.data[i2]) {
                    return false;
                }
                j4++;
                i++;
                i2++;
            }
            if (i == surfaceViewImplementationSurfaceRequestCallback.limit) {
                surfaceViewImplementationSurfaceRequestCallback = surfaceViewImplementationSurfaceRequestCallback.next;
                Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback);
                i = surfaceViewImplementationSurfaceRequestCallback.pos;
            }
            if (i2 == surfaceViewImplementationSurfaceRequestCallback2.limit) {
                surfaceViewImplementationSurfaceRequestCallback2 = surfaceViewImplementationSurfaceRequestCallback2.next;
                Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback2);
                i2 = surfaceViewImplementationSurfaceRequestCallback2.pos;
            }
            j3 += jMin;
            j2 = 0;
        }
        return true;
    }

    public final int hashCode() {
        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback = this.head;
        if (surfaceViewImplementationSurfaceRequestCallback == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = surfaceViewImplementationSurfaceRequestCallback.limit;
            for (int i3 = surfaceViewImplementationSurfaceRequestCallback.pos; i3 < i2; i3++) {
                i = (i * 31) + surfaceViewImplementationSurfaceRequestCallback.data[i3];
            }
            surfaceViewImplementationSurfaceRequestCallback = surfaceViewImplementationSurfaceRequestCallback.next;
            Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback);
        } while (surfaceViewImplementationSurfaceRequestCallback != this.head);
        return i;
    }

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
    public final RotationProviderListenerWrapper clone() {
        RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
        if (this.size == 0) {
            return rotationProviderListenerWrapper;
        }
        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback = this.head;
        Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback);
        surfaceViewImplementationSurfaceRequestCallback.shared = true;
        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback2 = new SurfaceViewImplementationSurfaceRequestCallback(surfaceViewImplementationSurfaceRequestCallback.data, surfaceViewImplementationSurfaceRequestCallback.pos, surfaceViewImplementationSurfaceRequestCallback.limit, true, false);
        rotationProviderListenerWrapper.head = surfaceViewImplementationSurfaceRequestCallback2;
        surfaceViewImplementationSurfaceRequestCallback2.prev = surfaceViewImplementationSurfaceRequestCallback2;
        surfaceViewImplementationSurfaceRequestCallback2.next = surfaceViewImplementationSurfaceRequestCallback2.prev;
        for (SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback3 = surfaceViewImplementationSurfaceRequestCallback.next; surfaceViewImplementationSurfaceRequestCallback3 != surfaceViewImplementationSurfaceRequestCallback; surfaceViewImplementationSurfaceRequestCallback3 = surfaceViewImplementationSurfaceRequestCallback3.next) {
            SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback4 = surfaceViewImplementationSurfaceRequestCallback2.prev;
            Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback4);
            Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback3);
            surfaceViewImplementationSurfaceRequestCallback3.shared = true;
            surfaceViewImplementationSurfaceRequestCallback4.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new SurfaceViewImplementationSurfaceRequestCallback(surfaceViewImplementationSurfaceRequestCallback3.data, surfaceViewImplementationSurfaceRequestCallback3.pos, surfaceViewImplementationSurfaceRequestCallback3.limit, true, false));
        }
        rotationProviderListenerWrapper.size = this.size;
        return rotationProviderListenerWrapper;
    }

    private ByteString d(int p0) {
        if (p0 == 0) {
            return ByteString.EMPTY;
        }
        recalculate.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.size, 0L, p0);
        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback = this.head;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < p0) {
            Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback);
            if (surfaceViewImplementationSurfaceRequestCallback.limit == surfaceViewImplementationSurfaceRequestCallback.pos) {
                throw new AssertionError("s.limit == s.pos");
            }
            i2 += surfaceViewImplementationSurfaceRequestCallback.limit - surfaceViewImplementationSurfaceRequestCallback.pos;
            i3++;
            surfaceViewImplementationSurfaceRequestCallback = surfaceViewImplementationSurfaceRequestCallback.next;
        }
        byte[][] bArr = new byte[i3][];
        int[] iArr = new int[i3 * 2];
        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback2 = this.head;
        int i4 = 0;
        while (i < p0) {
            Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback2);
            bArr[i4] = surfaceViewImplementationSurfaceRequestCallback2.data;
            i += surfaceViewImplementationSurfaceRequestCallback2.limit - surfaceViewImplementationSurfaceRequestCallback2.pos;
            iArr[i4] = Math.min(i, p0);
            iArr[bArr.length + i4] = surfaceViewImplementationSurfaceRequestCallback2.pos;
            surfaceViewImplementationSurfaceRequestCallback2.shared = true;
            i4++;
            surfaceViewImplementationSurfaceRequestCallback2 = surfaceViewImplementationSurfaceRequestCallback2.next;
        }
        return new SegmentedByteString(bArr, iArr);
    }

    public final long TuitionPaymentFragmentbindingInflater1() {
        long j = this.size;
        if (j == 0) {
            return 0L;
        }
        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback = this.head;
        Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback);
        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback2 = surfaceViewImplementationSurfaceRequestCallback.prev;
        Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback2);
        return (surfaceViewImplementationSurfaceRequestCallback2.limit >= 8192 || !surfaceViewImplementationSurfaceRequestCallback2.owner) ? j : j - ((long) (surfaceViewImplementationSurfaceRequestCallback2.limit - surfaceViewImplementationSurfaceRequestCallback2.pos));
    }

    public final RotationProviderListenerWrapper b(RotationProviderListenerWrapper p0, long p1, long p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        recalculate.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.size, p1, p2);
        if (p2 != 0) {
            p0.size += p2;
            SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback = this.head;
            while (true) {
                Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback);
                if (p1 < surfaceViewImplementationSurfaceRequestCallback.limit - surfaceViewImplementationSurfaceRequestCallback.pos) {
                    break;
                }
                p1 -= (long) (surfaceViewImplementationSurfaceRequestCallback.limit - surfaceViewImplementationSurfaceRequestCallback.pos);
                surfaceViewImplementationSurfaceRequestCallback = surfaceViewImplementationSurfaceRequestCallback.next;
            }
            while (p2 > 0) {
                Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback);
                surfaceViewImplementationSurfaceRequestCallback.shared = true;
                SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback2 = new SurfaceViewImplementationSurfaceRequestCallback(surfaceViewImplementationSurfaceRequestCallback.data, surfaceViewImplementationSurfaceRequestCallback.pos, surfaceViewImplementationSurfaceRequestCallback.limit, true, false);
                surfaceViewImplementationSurfaceRequestCallback2.pos += (int) p1;
                surfaceViewImplementationSurfaceRequestCallback2.limit = Math.min(surfaceViewImplementationSurfaceRequestCallback2.pos + ((int) p2), surfaceViewImplementationSurfaceRequestCallback2.limit);
                SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback3 = p0.head;
                if (surfaceViewImplementationSurfaceRequestCallback3 == null) {
                    surfaceViewImplementationSurfaceRequestCallback2.prev = surfaceViewImplementationSurfaceRequestCallback2;
                    surfaceViewImplementationSurfaceRequestCallback2.next = surfaceViewImplementationSurfaceRequestCallback2.prev;
                    p0.head = surfaceViewImplementationSurfaceRequestCallback2.next;
                } else {
                    Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback3);
                    SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback4 = surfaceViewImplementationSurfaceRequestCallback3.prev;
                    Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback4);
                    surfaceViewImplementationSurfaceRequestCallback4.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceViewImplementationSurfaceRequestCallback2);
                }
                p2 -= (long) (surfaceViewImplementationSurfaceRequestCallback2.limit - surfaceViewImplementationSurfaceRequestCallback2.pos);
                surfaceViewImplementationSurfaceRequestCallback = surfaceViewImplementationSurfaceRequestCallback.next;
                p1 = 0;
            }
        }
        return this;
    }

    public final byte TuitionPaymentFragmentspecialinlinedviewModeldefault3(long p0) {
        recalculate.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.size, p0, 1L);
        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback = this.head;
        if (surfaceViewImplementationSurfaceRequestCallback == null) {
            SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback2 = null;
            Intrinsics.checkNotNull(null);
            byte[] bArr = surfaceViewImplementationSurfaceRequestCallback2.data;
            throw null;
        }
        long j = this.size;
        if (j - p0 < p0) {
            while (j > p0) {
                surfaceViewImplementationSurfaceRequestCallback = surfaceViewImplementationSurfaceRequestCallback.prev;
                Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback);
                j -= (long) (surfaceViewImplementationSurfaceRequestCallback.limit - surfaceViewImplementationSurfaceRequestCallback.pos);
            }
            Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback);
            return surfaceViewImplementationSurfaceRequestCallback.data[(int) ((((long) surfaceViewImplementationSurfaceRequestCallback.pos) + p0) - j)];
        }
        long j2 = 0;
        while (true) {
            long j3 = ((long) (surfaceViewImplementationSurfaceRequestCallback.limit - surfaceViewImplementationSurfaceRequestCallback.pos)) + j2;
            if (j3 > p0) {
                Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback);
                return surfaceViewImplementationSurfaceRequestCallback.data[(int) ((((long) surfaceViewImplementationSurfaceRequestCallback.pos) + p0) - j2)];
            }
            surfaceViewImplementationSurfaceRequestCallback = surfaceViewImplementationSurfaceRequestCallback.next;
            Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback);
            j2 = j3;
        }
    }

    public final long TuitionPaymentFragmentspecialinlinedviewModeldefault2(byte p0, long p1, long p2) {
        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback;
        int i;
        long j = p1;
        long j2 = p2;
        long j3 = 0;
        if (0 > j || j > j2) {
            StringBuilder sb = new StringBuilder("size=");
            sb.append(this.size);
            sb.append(" fromIndex=");
            sb.append(j);
            sb.append(" toIndex=");
            sb.append(j2);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        long j4 = this.size;
        if (j2 > j4) {
            j2 = j4;
        }
        long j5 = -1;
        if (j == j2 || (surfaceViewImplementationSurfaceRequestCallback = this.head) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                surfaceViewImplementationSurfaceRequestCallback = surfaceViewImplementationSurfaceRequestCallback.prev;
                Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback);
                j4 -= (long) (surfaceViewImplementationSurfaceRequestCallback.limit - surfaceViewImplementationSurfaceRequestCallback.pos);
            }
            if (surfaceViewImplementationSurfaceRequestCallback == null) {
                return -1L;
            }
            while (j4 < j2) {
                byte[] bArr = surfaceViewImplementationSurfaceRequestCallback.data;
                int iMin = (int) Math.min(surfaceViewImplementationSurfaceRequestCallback.limit, (((long) surfaceViewImplementationSurfaceRequestCallback.pos) + j2) - j4);
                i = (int) ((((long) surfaceViewImplementationSurfaceRequestCallback.pos) + j) - j4);
                while (i < iMin) {
                    if (bArr[i] != p0) {
                        i++;
                    }
                }
                j4 += (long) (surfaceViewImplementationSurfaceRequestCallback.limit - surfaceViewImplementationSurfaceRequestCallback.pos);
                surfaceViewImplementationSurfaceRequestCallback = surfaceViewImplementationSurfaceRequestCallback.next;
                Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback);
                j = j4;
                j5 = -1;
            }
            return j5;
        }
        while (true) {
            long j6 = ((long) (surfaceViewImplementationSurfaceRequestCallback.limit - surfaceViewImplementationSurfaceRequestCallback.pos)) + j3;
            if (j6 > j) {
                break;
            }
            surfaceViewImplementationSurfaceRequestCallback = surfaceViewImplementationSurfaceRequestCallback.next;
            Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback);
            j3 = j6;
        }
        if (surfaceViewImplementationSurfaceRequestCallback == null) {
            return -1L;
        }
        j4 = j3;
        while (j4 < j2) {
            byte[] bArr2 = surfaceViewImplementationSurfaceRequestCallback.data;
            int iMin2 = (int) Math.min(surfaceViewImplementationSurfaceRequestCallback.limit, (((long) surfaceViewImplementationSurfaceRequestCallback.pos) + j2) - j4);
            i = (int) ((((long) surfaceViewImplementationSurfaceRequestCallback.pos) + j) - j4);
            while (i < iMin2) {
                if (bArr2[i] != p0) {
                    i++;
                }
            }
            j4 += (long) (surfaceViewImplementationSurfaceRequestCallback.limit - surfaceViewImplementationSurfaceRequestCallback.pos);
            surfaceViewImplementationSurfaceRequestCallback = surfaceViewImplementationSurfaceRequestCallback.next;
            Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback);
            j = j4;
        }
        return -1L;
        return ((long) (i - surfaceViewImplementationSurfaceRequestCallback.pos)) + j4;
    }

    public final long TuitionPaymentFragmentbindingInflater1(ByteString p0, long p1) throws IOException {
        int i;
        int i2;
        byte[] bArr;
        Intrinsics.checkNotNullParameter(p0, "");
        if (p0.TuitionPaymentFragmentspecialinlinedviewModeldefault3() <= 0) {
            throw new IllegalArgumentException("bytes is empty".toString());
        }
        long j = 0;
        if (p1 < 0) {
            throw new IllegalArgumentException("fromIndex < 0: ".concat(String.valueOf(p1)).toString());
        }
        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback = this.head;
        if (surfaceViewImplementationSurfaceRequestCallback == null) {
            return -1L;
        }
        long j2 = this.size;
        if (j2 - p1 >= p1) {
            while (true) {
                long j3 = ((long) (surfaceViewImplementationSurfaceRequestCallback.limit - surfaceViewImplementationSurfaceRequestCallback.pos)) + j;
                if (j3 > p1) {
                    break;
                }
                surfaceViewImplementationSurfaceRequestCallback = surfaceViewImplementationSurfaceRequestCallback.next;
                Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback);
                j = j3;
            }
            if (surfaceViewImplementationSurfaceRequestCallback == null) {
                return -1L;
            }
            byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = p0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            byte b2 = bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[0];
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = p0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            long j4 = (this.size - ((long) iTuitionPaymentFragmentspecialinlinedviewModeldefault3)) + 1;
            long j5 = j;
            long j6 = p1;
            while (j5 < j4) {
                byte[] bArr2 = surfaceViewImplementationSurfaceRequestCallback.data;
                int iMin = (int) Math.min(surfaceViewImplementationSurfaceRequestCallback.limit, (((long) surfaceViewImplementationSurfaceRequestCallback.pos) + j4) - j5);
                i = (int) ((((long) surfaceViewImplementationSurfaceRequestCallback.pos) + j6) - j5);
                while (i < iMin) {
                    if (bArr2[i] == b2 && closeSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceViewImplementationSurfaceRequestCallback, i + 1, bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1, 1, iTuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                        j2 = j5;
                    }
                    i++;
                }
                j5 += (long) (surfaceViewImplementationSurfaceRequestCallback.limit - surfaceViewImplementationSurfaceRequestCallback.pos);
                surfaceViewImplementationSurfaceRequestCallback = surfaceViewImplementationSurfaceRequestCallback.next;
                Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback);
                j6 = j5;
            }
            return -1L;
        }
        while (j2 > p1) {
            surfaceViewImplementationSurfaceRequestCallback = surfaceViewImplementationSurfaceRequestCallback.prev;
            Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback);
            j2 -= (long) (surfaceViewImplementationSurfaceRequestCallback.limit - surfaceViewImplementationSurfaceRequestCallback.pos);
        }
        if (surfaceViewImplementationSurfaceRequestCallback == null) {
            return -1L;
        }
        byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = p0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        byte b3 = bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2[0];
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = p0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        long j7 = (this.size - ((long) iTuitionPaymentFragmentspecialinlinedviewModeldefault4)) + 1;
        long j8 = p1;
        while (j2 < j7) {
            byte[] bArr3 = surfaceViewImplementationSurfaceRequestCallback.data;
            int i3 = iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
            byte[] bArr4 = bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int iMin2 = (int) Math.min(surfaceViewImplementationSurfaceRequestCallback.limit, (((long) surfaceViewImplementationSurfaceRequestCallback.pos) + j7) - j2);
            i = (int) ((((long) surfaceViewImplementationSurfaceRequestCallback.pos) + j8) - j2);
            while (i < iMin2) {
                if (bArr3[i] == b3) {
                    i2 = i3;
                    bArr = bArr4;
                    if (closeSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceViewImplementationSurfaceRequestCallback, i + 1, bArr, 1, i2)) {
                    }
                } else {
                    i2 = i3;
                    bArr = bArr4;
                }
                i++;
                bArr4 = bArr;
                i3 = i2;
            }
            j2 += (long) (surfaceViewImplementationSurfaceRequestCallback.limit - surfaceViewImplementationSurfaceRequestCallback.pos);
            surfaceViewImplementationSurfaceRequestCallback = surfaceViewImplementationSurfaceRequestCallback.next;
            Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback);
            bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = bArr4;
            j8 = j2;
            iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = i3;
        }
        return -1L;
        return ((long) (i - surfaceViewImplementationSurfaceRequestCallback.pos)) + j2;
    }

    @Override // defpackage.RotationProvider1
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(long p0, ByteString p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, p1, p1.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(long j, ByteString byteString, int i) {
        Intrinsics.checkNotNullParameter(byteString, "");
        if (j < 0 || i < 0 || this.size - j < i || byteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3() < i) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(((long) i2) + j) != byteString.b(i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.tryToComplete
    public final long read(RotationProviderListenerWrapper p0, long p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (p1 < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(p1)).toString());
        }
        long j = this.size;
        if (j == 0) {
            return -1L;
        }
        if (p1 > j) {
            p1 = j;
        }
        p0.write(this, p1);
        return p1;
    }

    @Override // defpackage.RotationProvider1
    public final long TuitionPaymentFragmentspecialinlinedviewModeldefault1(SurfaceViewImplementationApi24Impl p0) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        long j = this.size;
        if (j > 0) {
            p0.write(this, j);
        }
        return j;
    }

    @Override // defpackage.RotationProvider1
    public final byte cancel() throws EOFException {
        if (this.size == 0) {
            throw new EOFException();
        }
        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback = this.head;
        Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback);
        int i = surfaceViewImplementationSurfaceRequestCallback.pos;
        int i2 = surfaceViewImplementationSurfaceRequestCallback.limit;
        int i3 = i + 1;
        byte b2 = surfaceViewImplementationSurfaceRequestCallback.data[i];
        this.size--;
        if (i3 == i2) {
            this.head = surfaceViewImplementationSurfaceRequestCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            pixelCopyRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceViewImplementationSurfaceRequestCallback);
            return b2;
        }
        surfaceViewImplementationSurfaceRequestCallback.pos = i3;
        return b2;
    }

    @Override // defpackage.RotationProvider1
    public final byte[] cancelAll() {
        return b(this.size);
    }

    @Override // defpackage.RotationProvider1
    public final byte[] b(long p0) throws EOFException {
        if (p0 < 0 || p0 > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException("byteCount: ".concat(String.valueOf(p0)).toString());
        }
        if (this.size < p0) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) p0];
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(bArr);
        return bArr;
    }

    @Override // defpackage.RotationProvider1
    public final ByteString onTransact() {
        return TuitionPaymentFragmentbindingInflater1(this.size);
    }

    @Override // defpackage.RotationProvider1
    public final ByteString TuitionPaymentFragmentbindingInflater1(long p0) throws EOFException {
        if (p0 < 0 || p0 > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException("byteCount: ".concat(String.valueOf(p0)).toString());
        }
        if (this.size < p0) {
            throw new EOFException();
        }
        if (p0 >= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            ByteString byteStringD = d((int) p0);
            g(p0);
            return byteStringD;
        }
        return new ByteString(b(p0));
    }

    @Override // defpackage.RotationProvider1
    public final long INotificationSideChannel() throws EOFException {
        if (this.size == 0) {
            throw new EOFException();
        }
        boolean z = false;
        int i = 0;
        long j = 0;
        long j2 = -7;
        boolean z2 = false;
        do {
            SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback = this.head;
            Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback);
            byte[] bArr = surfaceViewImplementationSurfaceRequestCallback.data;
            int i2 = surfaceViewImplementationSurfaceRequestCallback.pos;
            int i3 = surfaceViewImplementationSurfaceRequestCallback.limit;
            while (i2 < i3) {
                byte b2 = bArr[i2];
                if (b2 >= 48 && b2 <= 57) {
                    int i4 = 48 - b2;
                    if (j < -922337203685477580L || (j == -922337203685477580L && i4 < j2)) {
                        RotationProviderListenerWrapper rotationProviderListenerWrapperTuitionPaymentFragmentspecialinlinedviewModeldefault3 = new RotationProviderListenerWrapper().a(j).TuitionPaymentFragmentspecialinlinedviewModeldefault3((int) b2);
                        if (!z2) {
                            rotationProviderListenerWrapperTuitionPaymentFragmentspecialinlinedviewModeldefault3.cancel();
                        }
                        StringBuilder sb = new StringBuilder("Number too large: ");
                        sb.append(rotationProviderListenerWrapperTuitionPaymentFragmentspecialinlinedviewModeldefault3.b(rotationProviderListenerWrapperTuitionPaymentFragmentspecialinlinedviewModeldefault3.size, Charsets.UTF_8));
                        throw new NumberFormatException(sb.toString());
                    }
                    j = (j * 10) + ((long) i4);
                } else {
                    if (b2 != 45 || i != 0) {
                        z = true;
                        break;
                    }
                    j2--;
                    z2 = true;
                }
                i2++;
                i++;
            }
            if (i2 == i3) {
                this.head = surfaceViewImplementationSurfaceRequestCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                pixelCopyRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceViewImplementationSurfaceRequestCallback);
            } else {
                surfaceViewImplementationSurfaceRequestCallback.pos = i2;
            }
            if (z) {
                break;
            }
        } while (this.head != null);
        long j3 = this.size - ((long) i);
        this.size = j3;
        if (i >= (z2 ? 2 : 1)) {
            return z2 ? j : -j;
        }
        if (j3 == 0) {
            throw new EOFException();
        }
        String str = z2 ? "Expected a digit" : "Expected a digit or '-'";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" but was 0x");
        sb2.append(recalculate.TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentFragmentspecialinlinedviewModeldefault3(0L)));
        throw new NumberFormatException(sb2.toString());
    }

    @Override // defpackage.RotationProvider1
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(RotationProviderListenerWrapper p0, long p1) throws EOFException {
        Intrinsics.checkNotNullParameter(p0, "");
        long j = this.size;
        if (j < p1) {
            p0.write(this, j);
            throw new EOFException();
        }
        p0.write(this, p1);
    }

    @Override // defpackage.RotationProvider1
    public final long getInterfaceDescriptor() throws EOFException {
        int i;
        if (this.size == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback = this.head;
            Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback);
            byte[] bArr = surfaceViewImplementationSurfaceRequestCallback.data;
            int i3 = surfaceViewImplementationSurfaceRequestCallback.pos;
            int i4 = surfaceViewImplementationSurfaceRequestCallback.limit;
            while (i3 < i4) {
                byte b2 = bArr[i3];
                if (b2 >= 48 && b2 <= 57) {
                    i = b2 - 48;
                } else if (b2 >= 97 && b2 <= 102) {
                    i = b2 - 87;
                } else {
                    if (b2 < 65 || b2 > 70) {
                        if (i2 != 0) {
                            z = true;
                            break;
                        }
                        StringBuilder sb = new StringBuilder("Expected leading [0-9a-fA-F] character but was 0x");
                        sb.append(recalculate.TuitionPaymentFragmentspecialinlinedviewModeldefault3(b2));
                        throw new NumberFormatException(sb.toString());
                    }
                    i = b2 - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    RotationProviderListenerWrapper rotationProviderListenerWrapperTuitionPaymentFragmentspecialinlinedviewModeldefault3 = new RotationProviderListenerWrapper().notify(j).TuitionPaymentFragmentspecialinlinedviewModeldefault3((int) b2);
                    StringBuilder sb2 = new StringBuilder("Number too large: ");
                    sb2.append(rotationProviderListenerWrapperTuitionPaymentFragmentspecialinlinedviewModeldefault3.b(rotationProviderListenerWrapperTuitionPaymentFragmentspecialinlinedviewModeldefault3.size, Charsets.UTF_8));
                    throw new NumberFormatException(sb2.toString());
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 == i4) {
                this.head = surfaceViewImplementationSurfaceRequestCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                pixelCopyRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceViewImplementationSurfaceRequestCallback);
            } else {
                surfaceViewImplementationSurfaceRequestCallback.pos = i3;
            }
            if (z) {
                break;
            }
        } while (this.head != null);
        this.size -= (long) i2;
        return j;
    }

    @Override // defpackage.RotationProvider1
    public final int INotificationSideChannelStubProxy() throws EOFException {
        if (this.size < 4) {
            throw new EOFException();
        }
        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback = this.head;
        Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback);
        int i = surfaceViewImplementationSurfaceRequestCallback.pos;
        int i2 = surfaceViewImplementationSurfaceRequestCallback.limit;
        if (i2 - i < 4) {
            return ((cancel() & UByte.MAX_VALUE) << 24) | ((cancel() & UByte.MAX_VALUE) << 16) | ((cancel() & UByte.MAX_VALUE) << 8) | (cancel() & UByte.MAX_VALUE);
        }
        byte[] bArr = surfaceViewImplementationSurfaceRequestCallback.data;
        int i3 = i + 4;
        int i4 = (bArr[i + 3] & UByte.MAX_VALUE) | ((bArr[i + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i] & UByte.MAX_VALUE) << 24) | ((bArr[i + 2] & UByte.MAX_VALUE) << 8);
        this.size -= 4;
        if (i3 == i2) {
            this.head = surfaceViewImplementationSurfaceRequestCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            pixelCopyRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceViewImplementationSurfaceRequestCallback);
            return i4;
        }
        surfaceViewImplementationSurfaceRequestCallback.pos = i3;
        return i4;
    }

    @Override // defpackage.RotationProvider1
    public final long INotificationSideChannelDefault() throws EOFException {
        if (this.size < 8) {
            throw new EOFException();
        }
        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback = this.head;
        Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback);
        int i = surfaceViewImplementationSurfaceRequestCallback.pos;
        int i2 = surfaceViewImplementationSurfaceRequestCallback.limit;
        if (i2 - i < 8) {
            return ((((long) INotificationSideChannelStubProxy()) & 4294967295L) << 32) | (4294967295L & ((long) INotificationSideChannelStubProxy()));
        }
        byte[] bArr = surfaceViewImplementationSurfaceRequestCallback.data;
        long j = bArr[i];
        long j2 = bArr[i + 1];
        long j3 = bArr[i + 2];
        long j4 = bArr[i + 3];
        long j5 = bArr[i + 4];
        int i3 = i + 8;
        long j6 = (bArr[i + 5] & 255) << 16;
        long j7 = j6 | ((j5 & 255) << 24) | ((j & 255) << 56) | ((j2 & 255) << 48) | ((j3 & 255) << 40) | ((j4 & 255) << 32) | ((((long) bArr[i + 6]) & 255) << 8) | (((long) bArr[i + 7]) & 255);
        this.size -= 8;
        if (i3 == i2) {
            this.head = surfaceViewImplementationSurfaceRequestCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            pixelCopyRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceViewImplementationSurfaceRequestCallback);
            return j7;
        }
        surfaceViewImplementationSurfaceRequestCallback.pos = i3;
        return j7;
    }

    @Override // defpackage.RotationProvider1
    public final short MediaBrowserCompat() throws EOFException {
        int iCancel;
        int iCancel2;
        if (this.size < 2) {
            throw new EOFException();
        }
        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback = this.head;
        Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback);
        int i = surfaceViewImplementationSurfaceRequestCallback.pos;
        int i2 = surfaceViewImplementationSurfaceRequestCallback.limit;
        if (i2 - i < 2) {
            iCancel = (cancel() & UByte.MAX_VALUE) << 8;
            iCancel2 = cancel() & UByte.MAX_VALUE;
        } else {
            byte[] bArr = surfaceViewImplementationSurfaceRequestCallback.data;
            byte b2 = bArr[i];
            int i3 = i + 2;
            byte b3 = bArr[i + 1];
            this.size -= 2;
            if (i3 == i2) {
                this.head = surfaceViewImplementationSurfaceRequestCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                pixelCopyRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceViewImplementationSurfaceRequestCallback);
            } else {
                surfaceViewImplementationSurfaceRequestCallback.pos = i3;
            }
            iCancel = b3 & UByte.MAX_VALUE;
            iCancel2 = (b2 & UByte.MAX_VALUE) << 8;
        }
        return (short) (iCancel | iCancel2);
    }

    public final ByteString connect() {
        long j = this.size;
        if (j > SieveCacheKt.NodeLinkMask) {
            StringBuilder sb = new StringBuilder("size > Int.MAX_VALUE: ");
            sb.append(this.size);
            throw new IllegalStateException(sb.toString().toString());
        }
        return d((int) j);
    }

    @Override // defpackage.SurfaceViewImplementationApi24Impl
    public final void write(RotationProviderListenerWrapper p0, long p1) {
        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback;
        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Intrinsics.checkNotNullParameter(p0, "");
        if (p0 == this) {
            throw new IllegalArgumentException("source == this".toString());
        }
        recalculate.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0.size, 0L, p1);
        while (p1 > 0) {
            SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback2 = p0.head;
            Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback2);
            int i = surfaceViewImplementationSurfaceRequestCallback2.limit;
            SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback3 = p0.head;
            Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback3);
            long j = i - surfaceViewImplementationSurfaceRequestCallback3.pos;
            int i2 = 0;
            if (p1 < j) {
                SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback4 = this.head;
                if (surfaceViewImplementationSurfaceRequestCallback4 != null) {
                    Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback4);
                    surfaceViewImplementationSurfaceRequestCallback = surfaceViewImplementationSurfaceRequestCallback4.prev;
                } else {
                    surfaceViewImplementationSurfaceRequestCallback = null;
                }
                if (surfaceViewImplementationSurfaceRequestCallback != null && surfaceViewImplementationSurfaceRequestCallback.owner) {
                    if ((((long) surfaceViewImplementationSurfaceRequestCallback.limit) + p1) - ((long) (surfaceViewImplementationSurfaceRequestCallback.shared ? 0 : surfaceViewImplementationSurfaceRequestCallback.pos)) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback5 = p0.head;
                        Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback5);
                        surfaceViewImplementationSurfaceRequestCallback5.TuitionPaymentFragmentbindingInflater1(surfaceViewImplementationSurfaceRequestCallback, (int) p1);
                        p0.size -= p1;
                        this.size += p1;
                        return;
                    }
                }
                SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback6 = p0.head;
                Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback6);
                int i3 = (int) p1;
                if (i3 <= 0 || i3 > surfaceViewImplementationSurfaceRequestCallback6.limit - surfaceViewImplementationSurfaceRequestCallback6.pos) {
                    throw new IllegalArgumentException("byteCount out of range".toString());
                }
                if (i3 >= 1024) {
                    surfaceViewImplementationSurfaceRequestCallback6.shared = true;
                    surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault2 = new SurfaceViewImplementationSurfaceRequestCallback(surfaceViewImplementationSurfaceRequestCallback6.data, surfaceViewImplementationSurfaceRequestCallback6.pos, surfaceViewImplementationSurfaceRequestCallback6.limit, true, false);
                } else {
                    surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault2 = pixelCopyRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    byte[] bArr = surfaceViewImplementationSurfaceRequestCallback6.data;
                    byte[] bArr2 = surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault2.data;
                    int i4 = surfaceViewImplementationSurfaceRequestCallback6.pos;
                    ArraysKt.copyInto$default(bArr, bArr2, 0, i4, i4 + i3, 2, (Object) null);
                }
                surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault2.limit = surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault2.pos + i3;
                surfaceViewImplementationSurfaceRequestCallback6.pos += i3;
                SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback7 = surfaceViewImplementationSurfaceRequestCallback6.prev;
                Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback7);
                surfaceViewImplementationSurfaceRequestCallback7.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                p0.head = surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            }
            SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback8 = p0.head;
            Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback8);
            long j2 = surfaceViewImplementationSurfaceRequestCallback8.limit - surfaceViewImplementationSurfaceRequestCallback8.pos;
            p0.head = surfaceViewImplementationSurfaceRequestCallback8.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback9 = this.head;
            if (surfaceViewImplementationSurfaceRequestCallback9 == null) {
                this.head = surfaceViewImplementationSurfaceRequestCallback8;
                surfaceViewImplementationSurfaceRequestCallback8.prev = surfaceViewImplementationSurfaceRequestCallback8;
                surfaceViewImplementationSurfaceRequestCallback8.next = surfaceViewImplementationSurfaceRequestCallback8.prev;
            } else {
                Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback9);
                SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback10 = surfaceViewImplementationSurfaceRequestCallback9.prev;
                Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback10);
                SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3 = surfaceViewImplementationSurfaceRequestCallback10.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceViewImplementationSurfaceRequestCallback8);
                SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback11 = surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3.prev;
                if (surfaceViewImplementationSurfaceRequestCallback11 == surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                    throw new IllegalStateException("cannot compact".toString());
                }
                Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback11);
                if (surfaceViewImplementationSurfaceRequestCallback11.owner) {
                    int i5 = surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3.limit - surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3.pos;
                    SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback12 = surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3.prev;
                    Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback12);
                    int i6 = surfaceViewImplementationSurfaceRequestCallback12.limit;
                    SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback13 = surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3.prev;
                    Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback13);
                    if (!surfaceViewImplementationSurfaceRequestCallback13.shared) {
                        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback14 = surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3.prev;
                        Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback14);
                        i2 = surfaceViewImplementationSurfaceRequestCallback14.pos;
                    }
                    if (i5 <= (8192 - i6) + i2) {
                        SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback15 = surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3.prev;
                        Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback15);
                        surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(surfaceViewImplementationSurfaceRequestCallback15, i5);
                        surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        pixelCopyRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceViewImplementationSurfaceRequestCallbackTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                }
            }
            p0.size -= j2;
            this.size += j2;
            p1 -= j2;
        }
    }
}
