package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.collection.SieveCacheKt;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.Typography;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class onPixelCopyFinished implements RotationProvider1 {
    public final tryToComplete TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final RotationProviderListenerWrapper b;

    public onPixelCopyFinished(tryToComplete trytocomplete) {
        Intrinsics.checkNotNullParameter(trytocomplete, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = trytocomplete;
        this.b = new RotationProviderListenerWrapper();
    }

    @Override // defpackage.RotationProvider1, defpackage.RotationProviderListener
    public final RotationProviderListenerWrapper asInterface() {
        return this.b;
    }

    @Override // defpackage.RotationProvider1, defpackage.RotationProviderListener
    public final RotationProviderListenerWrapper TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.b;
    }

    @Override // defpackage.RotationProvider1
    public final String IconCompatParcelizer() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(Long.MAX_VALUE);
    }

    @Override // defpackage.RotationProvider1
    public final long TuitionPaymentFragmentspecialinlinedviewModeldefault3(ByteString byteString) throws IOException {
        Intrinsics.checkNotNullParameter(byteString, "");
        Intrinsics.checkNotNullParameter(byteString, "");
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            throw new IllegalStateException("closed".toString());
        }
        long jMax = 0;
        while (true) {
            long jTuitionPaymentFragmentbindingInflater1 = this.b.TuitionPaymentFragmentbindingInflater1(byteString, jMax);
            if (jTuitionPaymentFragmentbindingInflater1 != -1) {
                return jTuitionPaymentFragmentbindingInflater1;
            }
            long j = this.b.size;
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.read(this.b, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, (j - ((long) byteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3())) + 1);
        }
    }

    @Override // defpackage.RotationProvider1
    public final long b(ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "");
        Intrinsics.checkNotNullParameter(byteString, "");
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            throw new IllegalStateException("closed".toString());
        }
        long jMax = 0;
        while (true) {
            long jTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(byteString, jMax);
            if (jTuitionPaymentFragmentspecialinlinedviewModeldefault2 != -1) {
                return jTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            }
            long j = this.b.size;
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.read(this.b, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j);
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 extends InputStream {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            if (onPixelCopyFinished.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                throw new IOException("closed");
            }
            if (onPixelCopyFinished.this.b.size == 0 && onPixelCopyFinished.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.read(onPixelCopyFinished.this.b, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1;
            }
            return onPixelCopyFinished.this.b.cancel() & UByte.MAX_VALUE;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) throws IOException {
            Intrinsics.checkNotNullParameter(bArr, "");
            if (onPixelCopyFinished.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                throw new IOException("closed");
            }
            recalculate.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bArr.length, i, i2);
            if (onPixelCopyFinished.this.b.size == 0 && onPixelCopyFinished.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.read(onPixelCopyFinished.this.b, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1;
            }
            return onPixelCopyFinished.this.b.TuitionPaymentFragmentbindingInflater1(bArr, i, i2);
        }

        @Override // java.io.InputStream
        public final int available() throws IOException {
            if (onPixelCopyFinished.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                throw new IOException("closed");
            }
            return (int) Math.min(onPixelCopyFinished.this.b.size, SieveCacheKt.NodeLinkMask);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            onPixelCopyFinished.this.close();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(onPixelCopyFinished.this);
            sb.append(".inputStream()");
            return sb.toString();
        }
    }

    @Override // defpackage.RotationProvider1
    public final InputStream a() {
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.tryToComplete
    public final long read(RotationProviderListenerWrapper rotationProviderListenerWrapper, long j) {
        Intrinsics.checkNotNullParameter(rotationProviderListenerWrapper, "");
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)).toString());
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.b.size == 0 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.read(this.b, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1L;
        }
        return this.b.read(rotationProviderListenerWrapper, Math.min(j, this.b.size));
    }

    @Override // defpackage.RotationProvider1
    public final boolean d() {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            throw new IllegalStateException("closed".toString());
        }
        return this.b.size == 0 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.read(this.b, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1;
    }

    @Override // defpackage.RotationProvider1
    public final void asInterface(long j) throws IllegalAccessException, EOFException {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 46400), View.MeasureSpec.getSize(0) + 40, View.resolveSizeAndState(0, 0, 0) + 19, 1513912262, false, "b", null);
        }
        int i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37836 - (ViewConfiguration.getTouchSlop() >> 8)), 60 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), Color.rgb(0, 0, 0) + 16777234, 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
        }
        int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
        long j2 = i2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (37836 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), Color.green(0) + 59, 17 - TextUtils.lastIndexOf("", '0', 0, 0), 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
        long j3 = -1;
        long j4 = j3 ^ 1508304294638000097L;
        long startUptimeMillis = (int) Process.getStartUptimeMillis();
        long j5 = startUptimeMillis ^ j3;
        long j6 = (((long) 50) * 4010949202521786142L) + (((long) (-97)) * 1508304294638000097L) + (((long) 98) * (((j4 | j5) ^ j3) | ((j4 | 4010949202521786142L) ^ j3))) + (((long) (-49)) * (j4 | (((j3 ^ 4010949202521786142L) | j5) ^ j3) | ((4010949202521786142L | startUptimeMillis) ^ j3))) + (((long) 49) * ((j3 ^ 4030673081817798655L) | ((j4 | startUptimeMillis) ^ j3)));
        int i4 = i3;
        int i5 = 0;
        while (true) {
            for (int i6 = 0; i6 != 8; i6++) {
                i4 = (((((int) (j2 >> i6)) & 255) + (i4 << 6)) + (i4 << 16)) - i4;
            }
            if (i5 != 0) {
                break;
            }
            i5++;
            j2 = j6;
        }
        if (i4 != i) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46399 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), TextUtils.getOffsetAfter("", 0) + 40, 19 - (ViewConfiguration.getTapTimeout() >> 16), -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
            Toast.makeText((Context) null, i2 / (((i2 - 1) * i2) % 2), 0).show();
        }
        if (!asBinder(j)) {
            throw new EOFException();
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (this.b.size == 0 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.read(this.b, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1;
        }
        return this.b.read(byteBuffer);
    }

    @Override // defpackage.RotationProvider1
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3(Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(charset, "");
        this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        RotationProviderListenerWrapper rotationProviderListenerWrapper = this.b;
        Intrinsics.checkNotNullParameter(charset, "");
        return rotationProviderListenerWrapper.b(rotationProviderListenerWrapper.size, charset);
    }

    @Override // defpackage.RotationProvider1
    public final boolean asBinder(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)).toString());
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            throw new IllegalStateException("closed".toString());
        }
        while (this.b.size < j) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.read(this.b, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.RotationProvider1
    public final byte cancel() throws IllegalAccessException, EOFException {
        asInterface(1L);
        return this.b.cancel();
    }

    @Override // defpackage.RotationProvider1
    public final ByteString onTransact() throws IOException {
        this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        RotationProviderListenerWrapper rotationProviderListenerWrapper = this.b;
        return rotationProviderListenerWrapper.TuitionPaymentFragmentbindingInflater1(rotationProviderListenerWrapper.size);
    }

    @Override // defpackage.RotationProvider1
    public final ByteString TuitionPaymentFragmentbindingInflater1(long j) throws IllegalAccessException, EOFException {
        asInterface(j);
        return this.b.TuitionPaymentFragmentbindingInflater1(j);
    }

    @Override // defpackage.RotationProvider1
    public final int TuitionPaymentFragmentbindingInflater1(lambdagetPreviewBitmap1 lambdagetpreviewbitmap1) throws EOFException {
        Intrinsics.checkNotNullParameter(lambdagetpreviewbitmap1, "");
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            throw new IllegalStateException("closed".toString());
        }
        do {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = closeSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, lambdagetpreviewbitmap1, true);
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != -2) {
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 == -1) {
                    return -1;
                }
                this.b.g(lambdagetpreviewbitmap1.b[iTuitionPaymentFragmentspecialinlinedviewModeldefault3].TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                return iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }
        } while (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.read(this.b, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1);
        return -1;
    }

    @Override // defpackage.RotationProvider1
    public final byte[] cancelAll() throws IOException {
        this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        RotationProviderListenerWrapper rotationProviderListenerWrapper = this.b;
        return rotationProviderListenerWrapper.b(rotationProviderListenerWrapper.size);
    }

    @Override // defpackage.RotationProvider1
    public final byte[] b(long j) throws IllegalAccessException, EOFException {
        asInterface(j);
        return this.b.b(j);
    }

    @Override // defpackage.RotationProvider1
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte[] bArr) throws IllegalAccessException, EOFException {
        Intrinsics.checkNotNullParameter(bArr, "");
        try {
            asInterface(bArr.length);
            this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bArr);
        } catch (EOFException e2) {
            int i = 0;
            while (this.b.size > 0) {
                RotationProviderListenerWrapper rotationProviderListenerWrapper = this.b;
                int iTuitionPaymentFragmentbindingInflater1 = rotationProviderListenerWrapper.TuitionPaymentFragmentbindingInflater1(bArr, i, (int) rotationProviderListenerWrapper.size);
                if (iTuitionPaymentFragmentbindingInflater1 == -1) {
                    throw new AssertionError();
                }
                i += iTuitionPaymentFragmentbindingInflater1;
            }
            throw e2;
        }
    }

    @Override // defpackage.RotationProvider1
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(RotationProviderListenerWrapper rotationProviderListenerWrapper, long j) throws IllegalAccessException, IOException {
        Intrinsics.checkNotNullParameter(rotationProviderListenerWrapper, "");
        try {
            asInterface(j);
            this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(rotationProviderListenerWrapper, j);
        } catch (EOFException e2) {
            rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b);
            throw e2;
        }
    }

    @Override // defpackage.RotationProvider1
    public final long TuitionPaymentFragmentspecialinlinedviewModeldefault1(SurfaceViewImplementationApi24Impl surfaceViewImplementationApi24Impl) throws IOException {
        Intrinsics.checkNotNullParameter(surfaceViewImplementationApi24Impl, "");
        long j = 0;
        while (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.read(this.b, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
            long jTuitionPaymentFragmentbindingInflater1 = this.b.TuitionPaymentFragmentbindingInflater1();
            if (jTuitionPaymentFragmentbindingInflater1 > 0) {
                j += jTuitionPaymentFragmentbindingInflater1;
                surfaceViewImplementationApi24Impl.write(this.b, jTuitionPaymentFragmentbindingInflater1);
            }
        }
        if (this.b.size <= 0) {
            return j;
        }
        long j2 = j + this.b.size;
        RotationProviderListenerWrapper rotationProviderListenerWrapper = this.b;
        surfaceViewImplementationApi24Impl.write(rotationProviderListenerWrapper, rotationProviderListenerWrapper.size);
        return j2;
    }

    @Override // defpackage.RotationProvider1
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1(long j) throws IllegalAccessException, EOFException {
        asInterface(j);
        return this.b.b(j, Charsets.UTF_8);
    }

    @Override // defpackage.RotationProvider1
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException("limit < 0: ".concat(String.valueOf(j)).toString());
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1((byte) 10, 0L, j2);
        if (jTuitionPaymentFragmentspecialinlinedviewModeldefault1 != -1) {
            return closeSurface.b(this.b, jTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        if (j2 < Long.MAX_VALUE && asBinder(j2) && this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(j2 - 1) == 13 && asBinder(1 + j2) && this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(j2) == 10) {
            return closeSurface.b(this.b, j2);
        }
        RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
        RotationProviderListenerWrapper rotationProviderListenerWrapper2 = this.b;
        rotationProviderListenerWrapper2.b(rotationProviderListenerWrapper, 0L, Math.min(32L, rotationProviderListenerWrapper2.size));
        StringBuilder sb = new StringBuilder("\\n not found: limit=");
        sb.append(Math.min(this.b.size, j));
        sb.append(" content=");
        sb.append(rotationProviderListenerWrapper.TuitionPaymentFragmentbindingInflater1(rotationProviderListenerWrapper.size).TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        sb.append(Typography.ellipsis);
        throw new EOFException(sb.toString());
    }

    @Override // defpackage.RotationProvider1
    public final short MediaBrowserCompat() throws IllegalAccessException, EOFException {
        asInterface(2L);
        return this.b.MediaBrowserCompat();
    }

    @Override // defpackage.RotationProvider1
    public final short write() throws IllegalAccessException, EOFException {
        asInterface(2L);
        return recalculate.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b.MediaBrowserCompat());
    }

    @Override // defpackage.RotationProvider1
    public final int INotificationSideChannelStubProxy() throws IllegalAccessException, EOFException {
        asInterface(4L);
        return this.b.INotificationSideChannelStubProxy();
    }

    @Override // defpackage.RotationProvider1
    public final int INotificationSideChannelStub() throws IllegalAccessException, EOFException {
        asInterface(4L);
        return recalculate.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b.INotificationSideChannelStubProxy());
    }

    @Override // defpackage.RotationProvider1
    public final long INotificationSideChannelDefault() throws IllegalAccessException, EOFException {
        asInterface(8L);
        return this.b.INotificationSideChannelDefault();
    }

    @Override // defpackage.RotationProvider1
    public final long RemoteActionCompatParcelizer() throws IllegalAccessException, EOFException {
        asInterface(8L);
        return recalculate.TuitionPaymentFragmentbindingInflater1(this.b.INotificationSideChannelDefault());
    }

    @Override // defpackage.RotationProvider1
    public final long INotificationSideChannel() throws IllegalAccessException, EOFException {
        asInterface(1L);
        long j = 0;
        while (true) {
            long j2 = j + 1;
            if (!asBinder(j2)) {
                break;
            }
            byte bTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(j);
            if ((bTuitionPaymentFragmentspecialinlinedviewModeldefault3 < 48 || bTuitionPaymentFragmentspecialinlinedviewModeldefault3 > 57) && !(j == 0 && bTuitionPaymentFragmentspecialinlinedviewModeldefault3 == 45)) {
                if (j != 0) {
                    break;
                }
                StringBuilder sb = new StringBuilder("Expected a digit or '-' but was 0x");
                String string = Integer.toString(bTuitionPaymentFragmentspecialinlinedviewModeldefault3, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string, "");
                sb.append(string);
                throw new NumberFormatException(sb.toString());
            }
            j = j2;
        }
        return this.b.INotificationSideChannel();
    }

    @Override // defpackage.RotationProvider1
    public final long getInterfaceDescriptor() throws IllegalAccessException, EOFException {
        asInterface(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!asBinder(i2)) {
                break;
            }
            byte bTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i);
            if ((bTuitionPaymentFragmentspecialinlinedviewModeldefault3 < 48 || bTuitionPaymentFragmentspecialinlinedviewModeldefault3 > 57) && ((bTuitionPaymentFragmentspecialinlinedviewModeldefault3 < 97 || bTuitionPaymentFragmentspecialinlinedviewModeldefault3 > 102) && (bTuitionPaymentFragmentspecialinlinedviewModeldefault3 < 65 || bTuitionPaymentFragmentspecialinlinedviewModeldefault3 > 70))) {
                if (i != 0) {
                    break;
                }
                StringBuilder sb = new StringBuilder("Expected leading [0-9a-fA-F] character but was 0x");
                String string = Integer.toString(bTuitionPaymentFragmentspecialinlinedviewModeldefault3, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string, "");
                sb.append(string);
                throw new NumberFormatException(sb.toString());
            }
            i = i2;
        }
        return this.b.getInterfaceDescriptor();
    }

    @Override // defpackage.RotationProvider1
    public final void g(long j) throws EOFException {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            throw new IllegalStateException("closed".toString());
        }
        while (j > 0) {
            if (this.b.size == 0 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.read(this.b, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, this.b.size);
            this.b.g(jMin);
            j -= jMin;
        }
    }

    public final long TuitionPaymentFragmentspecialinlinedviewModeldefault1(byte b, long j, long j2) {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            throw new IllegalStateException("closed".toString());
        }
        if (0 > j2) {
            StringBuilder sb = new StringBuilder("fromIndex=0 toIndex=");
            sb.append(j2);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        while (j < j2) {
            long jTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(b, j, j2);
            if (jTuitionPaymentFragmentspecialinlinedviewModeldefault2 != -1) {
                return jTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            }
            long j3 = this.b.size;
            if (j3 >= j2 || this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.read(this.b, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                break;
            }
            j = Math.max(j, j3);
        }
        return -1L;
    }

    @Override // defpackage.RotationProvider1
    public final RotationProvider1 g() {
        return SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new lambdaonSurfaceRequested0androidxcameraviewSurfaceViewImplementation(this));
    }

    @Override // defpackage.tryToComplete, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            return;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.close();
        RotationProviderListenerWrapper rotationProviderListenerWrapper = this.b;
        rotationProviderListenerWrapper.g(rotationProviderListenerWrapper.size);
    }

    @Override // defpackage.tryToComplete
    public final cancelPreviousRequest timeout() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.timeout();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("buffer(");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append(')');
        return sb.toString();
    }

    @Override // defpackage.RotationProvider1
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(long j, ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "");
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = byteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        Intrinsics.checkNotNullParameter(byteString, "");
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            throw new IllegalStateException("closed".toString());
        }
        if (j < 0 || iTuitionPaymentFragmentspecialinlinedviewModeldefault3 < 0 || byteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3() < iTuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            return false;
        }
        for (int i = 0; i < iTuitionPaymentFragmentspecialinlinedviewModeldefault3; i++) {
            long j2 = ((long) i) + j;
            if (!asBinder(1 + j2) || this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(j2) != byteString.b(i)) {
                return false;
            }
        }
        return true;
    }
}
