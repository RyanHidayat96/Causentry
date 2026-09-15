package com.squareup.okhttp.internal.framed;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.ComposerKt;
import defpackage.ProcessCameraProviderWrapper;
import defpackage.RotationProvider1;
import defpackage.RotationProviderListenerWrapper;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.SurfaceViewImplementationApi24Impl;
import defpackage.cancelPreviousRequest;
import defpackage.initSession;
import defpackage.tryToComplete;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes7.dex */
public final class FramedStream {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    long bytesLeftInWriteWindow;
    private final FramedConnection connection;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f869id;
    private final List<Header> requestHeaders;
    private List<Header> responseHeaders;
    final FramedDataSink sink;
    private final FramedDataSource source;
    long unacknowledgedBytesRead = 0;
    private final StreamTimeout readTimeout = new StreamTimeout();
    private final StreamTimeout writeTimeout = new StreamTimeout();
    private ErrorCode errorCode = null;

    FramedStream(int i, FramedConnection framedConnection, boolean z, boolean z2, List<Header> list) {
        if (framedConnection == null) {
            throw new NullPointerException("connection == null");
        }
        if (list == null) {
            throw new NullPointerException("requestHeaders == null");
        }
        this.f869id = i;
        this.connection = framedConnection;
        this.bytesLeftInWriteWindow = framedConnection.peerSettings.getInitialWindowSize(65536);
        FramedDataSource framedDataSource = new FramedDataSource(framedConnection.okHttpSettings.getInitialWindowSize(65536));
        this.source = framedDataSource;
        FramedDataSink framedDataSink = new FramedDataSink();
        this.sink = framedDataSink;
        framedDataSource.finished = z2;
        framedDataSink.finished = z;
        this.requestHeaders = list;
    }

    public final int getId() {
        return this.f869id;
    }

    public final boolean isOpen() {
        synchronized (this) {
            if (this.errorCode != null) {
                return false;
            }
            return !(this.source.finished || this.source.closed) || !(this.sink.finished || this.sink.closed) || this.responseHeaders == null;
        }
    }

    public final boolean isLocallyInitiated() {
        return this.connection.client == ((this.f869id & 1) == 1);
    }

    public final FramedConnection getConnection() {
        return this.connection;
    }

    public final List<Header> getRequestHeaders() {
        return this.requestHeaders;
    }

    public final List<Header> getResponseHeaders() throws IOException {
        List<Header> list;
        synchronized (this) {
            this.readTimeout.enter();
            while (this.responseHeaders == null && this.errorCode == null) {
                try {
                    waitForIo();
                } catch (Throwable th) {
                    this.readTimeout.exitAndThrowIfTimedOut();
                    throw th;
                }
            }
            this.readTimeout.exitAndThrowIfTimedOut();
            list = this.responseHeaders;
            if (list == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("stream was reset: ");
                sb.append(this.errorCode);
                throw new IOException(sb.toString());
            }
        }
        return list;
    }

    public final ErrorCode getErrorCode() {
        ErrorCode errorCode;
        synchronized (this) {
            errorCode = this.errorCode;
        }
        return errorCode;
    }

    public final void reply(List<Header> list, boolean z) throws IOException {
        boolean z2;
        synchronized (this) {
            try {
                if (list == null) {
                    throw new NullPointerException("responseHeaders == null");
                }
                if (this.responseHeaders != null) {
                    throw new IllegalStateException("reply already sent");
                }
                this.responseHeaders = list;
                if (z) {
                    z2 = false;
                } else {
                    z2 = true;
                    this.sink.finished = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.connection.writeSynReply(this.f869id, z2, list);
        if (z2) {
            this.connection.flush();
        }
    }

    public final cancelPreviousRequest readTimeout() {
        return this.readTimeout;
    }

    public final cancelPreviousRequest writeTimeout() {
        return this.writeTimeout;
    }

    public final tryToComplete getSource() {
        return this.source;
    }

    public final SurfaceViewImplementationApi24Impl getSink() {
        synchronized (this) {
            if (this.responseHeaders == null && !isLocallyInitiated()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.sink;
    }

    public final void close(ErrorCode errorCode) throws IOException {
        if (closeInternal(errorCode)) {
            this.connection.writeSynReset(this.f869id, errorCode);
        }
    }

    public final void closeLater(ErrorCode errorCode) {
        if (closeInternal(errorCode)) {
            this.connection.writeSynResetLater(this.f869id, errorCode);
        }
    }

    class StreamTimeout extends ProcessCameraProviderWrapper {
        private static short[] b;
        private static final byte[] $$c = {6, 51, 46, 31};
        private static final int $$f = 133;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {53, -70, 9, -72, 21, 7, -54, Base64.padSymbol, 23, 3, 18, 10, 0, 19, -62, 75, 11, -4, 23, -5, 18, 15, -10, 28, -2, 15, 8, -55, 72, 1, 17, -2, 12, 22, 10, -2, 10, 16, -57, 60, 11, 9, 21, 15, 2, 15, -10, 11, 26, -2, 22, -12, 28, -2, 15, 8, -55, 73, 0, 27, -13, 11, 26, -2, 22, -12, 28, -2, 15, 8, -55, 41, 32, 27, -30, 33, 16, 8, 0, -6, 24, 22, 0, 6, 12, 3, 7, 28, -2, 15, 8, -19, 28, 23, -5, 24, -42, 43, 26, -2, 22, -4, 20, 14, -76, 57, 42, -3, 20, -2, 15, 8, -21, 26, 33, -3, 1, 18, 15, -37, 53, -8, 15, 15, 1, 18, 15, -9, 16, 14, -1, 14, 14, 2, -21, 46, 1, 15, -2, 28, -6, 22, -56, 42, -3, 20, -2, 15, 8, -21, 26, 33, -3, 1, 18, 15, -37, 53, -8, 15, 15, 1, 18, 15, 8, 6, -2, 7, 15, 1, 20, 6, 14, 7, 6, 14, 0, 8, 27, -4, 5, 27, -33, 43, -2, 10, 16, 1, 10, 10, 4, 29, 0, 17, -56};
        private static final int $$e = 121;
        private static final byte[] $$a = {48, -110, 22, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
        private static final int $$b = 52;
        private static int asBinder = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f870a = 1;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 767092451;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1934795632;
        private static int TuitionPaymentFragmentbindingInflater1 = -1048586340;
        private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {-97, 99, -108, -66, 65, -97, 102, -106, 109, -79, -78, 44, -109, -42, 93, 108, 109, 106, -103, 97, -102, 19, -17, 30, -29, -32, 23, -8, 5, 20, 25, -24, -28, 30, -20, 125, -126, -115, 116, 106, -91, 123, 117, -115, 115, -117, 111, 92, 109, -64, 126, 113, 77, -76, -123, -124, -125, 112, -120, 115, 10, -13, 0, -26, 11, 15, 8, 9, -11, -38, 56, -13, -4, 6, -11, 8, -25, -53, 50, -62, 57, -27, -26, 4, 58, -50, 54, -3, 14, 40, -42, 52, 75, -65, 102, -111, -65, 88, 83, -123, 79, 65, -65, 76, 67, 75, -79, -26, -26, -26, -26, -26, -26};

        /* JADX WARN: Code duplicated, block: B:10:0x0029  */
        /* JADX WARN: Code duplicated, block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0030). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 2
                int r6 = r6 + 84
                int r8 = r8 * 15
                int r0 = 53 - r8
                int r7 = r7 * 52
                int r7 = 107 - r7
                byte[] r1 = com.squareup.okhttp.internal.framed.FramedStream.StreamTimeout.$$a
                byte[] r0 = new byte[r0]
                int r8 = 52 - r8
                r2 = 0
                if (r1 != 0) goto L19
                r6 = r7
                r4 = r8
                r3 = r2
                goto L30
            L19:
                r3 = r2
            L1a:
                byte r4 = (byte) r6
                r0[r3] = r4
                int r7 = r7 + 1
                if (r3 != r8) goto L29
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L29:
                r4 = r1[r7]
                int r3 = r3 + 1
                r5 = r7
                r7 = r6
                r6 = r5
            L30:
                int r4 = -r4
                int r7 = r7 + r4
                int r7 = r7 + (-11)
                r5 = r7
                r7 = r6
                r6 = r5
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.framed.FramedStream.StreamTimeout.c(byte, byte, byte, java.lang.Object[]):void");
        }

        private static void e(int i, byte b2, int i2, Object[] objArr) {
            int i3 = b2 * 87;
            int i4 = 99 - (i2 * 15);
            int i5 = i + 4;
            byte[] bArr = $$d;
            byte[] bArr2 = new byte[i3 + 53];
            int i6 = i3 + 52;
            int i7 = -1;
            if (bArr == null) {
                i4 = (i6 + i4) - 9;
            }
            while (true) {
                i7++;
                bArr2[i7] = (byte) i4;
                if (i7 == i6) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                } else {
                    i5++;
                    i4 = (i4 + bArr[i5]) - 9;
                }
            }
        }

        private static void d(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
            int i4;
            int i5 = 2;
            int i6 = 2 % 2;
            SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char c = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2267;
                    int defaultSize = 33 - View.getDefaultSize(0, 0);
                    byte length = (byte) $$c.length;
                    byte b3 = (byte) (length - 4);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, maximumFlingVelocity, defaultSize, 1387473586, false, $$g(length, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                boolean z = iIntValue == -1;
                if (!(!z)) {
                    byte[] bArr = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (bArr != null) {
                        int length2 = bArr.length;
                        byte[] bArr2 = new byte[length2];
                        int i7 = 0;
                        while (i7 < length2) {
                            int i8 = $11 + 55;
                            $10 = i8 % 128;
                            if (i8 % i5 != 0) {
                                Object[] objArr3 = {Integer.valueOf(bArr[i7])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b4 = (byte) 0;
                                    byte b5 = b4;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 3358 - (ViewConfiguration.getTouchSlop() >> 8), Color.red(0) + 18, -1054011043, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                                }
                                bArr2[i7] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                                i7--;
                            } else {
                                Object[] objArr4 = {Integer.valueOf(bArr[i7])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    byte b6 = (byte) 0;
                                    byte b7 = b6;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 3358, Color.green(0) + 18, -1054011043, false, $$g(b6, b7, b7), new Class[]{Integer.TYPE});
                                }
                                bArr2[i7] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).byteValue();
                                i7++;
                            }
                            i5 = 2;
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        byte[] bArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        Object[] objArr5 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                            int iResolveSize = 2267 - View.resolveSize(0, 0);
                            int keyRepeatTimeout = 33 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                            byte length3 = (byte) $$c.length;
                            byte b8 = (byte) (length3 - 4);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(longPressTimeout, iResolveSize, keyRepeatTimeout, 1387473586, false, $$g(length3, b8, b8), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L)));
                    } else {
                        iIntValue = (short) (((short) (((long) b[i3 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L)));
                    }
                }
                if (iIntValue > 0) {
                    int i9 = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L));
                    if (z) {
                        int i10 = $11 + 1;
                        $10 = i10 % 128;
                        int i11 = i10 % 2;
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i9 + i4;
                    Object[] objArr6 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentbindingInflater1), sb};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        byte b9 = (byte) 3;
                        byte b10 = (byte) (b9 - 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (55904 - View.MeasureSpec.getSize(0)), ExpandableListView.getPackedPositionType(0L) + 2855, 12 - TextUtils.indexOf((CharSequence) "", '0'), -1529949196, false, $$g(b9, b10, b10), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (bArr4 != null) {
                        int length4 = bArr4.length;
                        byte[] bArr5 = new byte[length4];
                        for (int i12 = 0; i12 < length4; i12++) {
                            bArr5[i12] = (byte) (((long) bArr4[i12]) ^ 3046761265686732006L);
                        }
                        int i13 = $11 + 115;
                        $10 = i13 % 128;
                        int i14 = i13 % 2;
                        bArr4 = bArr5;
                    }
                    boolean z2 = bArr4 != null;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                    while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                        int i15 = $10 + 51;
                        $11 = i15 % 128;
                        int i16 = i15 % 2;
                        if (z2) {
                            byte[] bArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i17 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i17 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i17]) ^ 3046761265686732006L)) + s)) ^ b2));
                        } else {
                            short[] sArr = b;
                            int i18 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i18 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i18]) ^ 3046761265686732006L)) + s)) ^ b2));
                        }
                        sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        StreamTimeout() {
        }

        @Override // defpackage.ProcessCameraProviderWrapper
        public void timedOut() {
            int i = 2 % 2;
            int i2 = f870a + 47;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                FramedStream.this.closeLater(ErrorCode.CANCEL);
                throw null;
            }
            FramedStream.this.closeLater(ErrorCode.CANCEL);
            int i3 = f870a + 13;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
        }

        @Override // defpackage.ProcessCameraProviderWrapper
        public IOException newTimeoutException(IOException iOException) throws Throwable {
            Object[] objArr;
            char c;
            int i = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cRed = (char) Color.red(0);
                int i2 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2267;
                int scrollDefaultDelay = 33 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                byte[] bArr = $$a;
                byte b2 = bArr[7];
                Object[] objArr2 = new Object[1];
                c(b2, bArr[40], b2, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cRed, i2, scrollDefaultDelay, -887667012, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            d((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1305643802, (-96) - View.MeasureSpec.getSize(0), (short) (Color.rgb(0, 0, 0) + 16777216), (byte) (113 - ExpandableListView.getPackedPositionType(0L)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 1592411643, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((-1305643798) - TextUtils.indexOf((CharSequence) "", '0', 0), TextUtils.indexOf((CharSequence) "", '0') - 102, (short) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), (byte) (13 - (ViewConfiguration.getPressedStateDuration() >> 16)), 1592411664 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                int size = 2267 - View.MeasureSpec.getSize(0);
                int gidForName = 32 - Process.getGidForName("");
                byte[] bArr2 = $$a;
                byte b3 = bArr2[7];
                Object[] objArr5 = new Object[1];
                c(b3, bArr2[5], b3, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(windowTouchSlop, size, gidForName, -874156483, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int touchSlop = 2267 - (ViewConfiguration.getTouchSlop() >> 8);
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 34;
                    byte[] bArr3 = $$a;
                    byte b4 = bArr3[7];
                    Object[] objArr6 = new Object[1];
                    c(b4, b4, bArr3[5], objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(fadingEdgeLength, touchSlop, packedPositionChild, -654680577, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                int i3 = ((int[]) objArr7[0])[0];
                int i4 = ((int[]) objArr7[3])[0];
                String[] strArr = (String[]) objArr7[1];
                int i5 = ~((~System.identityHashCode(this)) | 528868238);
                int i6 = (((251781898 | i5) * (-374)) - 65213401) + ((i5 | 277086340) * 374) + 1106860473;
                int i7 = (i6 << 13) ^ i6;
                int i8 = i7 ^ (i7 >>> 17);
                ((int[]) objArr[2])[0] = i8 ^ (i8 << 5);
                c = 3;
            } else {
                Object[] objArr8 = new Object[1];
                d((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1305643802, (-92) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (short) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), (byte) ((-104) - TextUtils.indexOf("", "", 0, 0)), 1592411677 - TextUtils.lastIndexOf("", '0'), objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                d(Drawable.resolveOpacity(0, 0) - 1305643799, (-100) - Gravity.getAbsoluteGravity(0, 0), (short) (ViewConfiguration.getDoubleTapTimeout() >> 16), (byte) (19 - KeyEvent.keyCodeFromString("")), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1592411702, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                }
                Object[] objArr10 = new Object[1];
                d((-1305643793) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0') - 101, (short) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), (byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 36), 1592411720 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                d((ViewConfiguration.getWindowTouchSlop() >> 8) - 1305643793, TextUtils.getTrimmedLength("") - 102, (short) View.MeasureSpec.makeMeasureSpec(0, 0), (byte) ((-84) - Gravity.getAbsoluteGravity(0, 0)), 1592411735 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr11);
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 1106860473};
                    byte[] bArr4 = $$d;
                    Object[] objArr13 = new Object[1];
                    e(bArr4[130], bArr4[29], bArr4[12], objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    Object[] objArr14 = new Object[1];
                    e((short) 138, bArr4[12], bArr4[29], objArr14);
                    Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    if (applicationContext != null) {
                        int i9 = asBinder + 61;
                        f870a = i9 % 128;
                        int i10 = i9 % 2;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char c2 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                            int iMyPid = (Process.myPid() >> 22) + 2267;
                            int iMyTid = (Process.myTid() >> 22) + 33;
                            byte[] bArr5 = $$a;
                            byte b5 = bArr5[7];
                            Object[] objArr16 = new Object[1];
                            c(b5, b5, bArr5[5], objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, iMyPid, iMyTid, -654680577, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                        try {
                            Object[] objArr17 = new Object[1];
                            d((-1305643800) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), TextUtils.getTrimmedLength("") - 96, (short) (Process.myTid() >> 22), (byte) (Gravity.getAbsoluteGravity(0, 0) + 113), 1592411642 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr17);
                            Class<?> cls5 = Class.forName((String) objArr17[0]);
                            Object[] objArr18 = new Object[1];
                            d((-1305643796) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), KeyEvent.normalizeMetaState(0) - 103, (short) (TextUtils.lastIndexOf("", '0', 0) + 1), (byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 13), View.resolveSizeAndState(0, 0, 0) + 1592411664, objArr18);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char c3 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 2267;
                                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 33;
                                byte[] bArr6 = $$a;
                                byte b6 = bArr6[7];
                                Object[] objArr19 = new Object[1];
                                c(b6, bArr6[5], b6, objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c3, offsetAfter, scrollBarFadeDuration, -874156483, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char c4 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
                                int iKeyCodeFromString = 2267 - KeyEvent.keyCodeFromString("");
                                int iIndexOf = TextUtils.indexOf("", "") + 33;
                                byte[] bArr7 = $$a;
                                byte b7 = bArr7[7];
                                Object[] objArr20 = new Object[1];
                                c(b7, bArr7[40], b7, objArr20);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c4, iKeyCodeFromString, iIndexOf, -887667012, false, (String) objArr20[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                    objArr = objArr15;
                    c = 3;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            int i11 = ((int[]) objArr[c])[0];
            int i12 = ((int[]) objArr[0])[0];
            if (i12 == i11) {
                Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
                int i13 = ((int[]) objArr[2])[0];
                int i14 = ((int[]) objArr[0])[0];
                int i15 = ((int[]) objArr[3])[0];
                String[] strArr2 = (String[]) objArr[1];
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                int i16 = ~iElapsedRealtime;
                int i17 = i13 + (-381578064) + (((~((-520153027) | i16)) | 288560289) * 226) + (((~(i16 | (-234939203))) | (~((-288560290) | iElapsedRealtime)) | 3346465) * (-113)) + ((~(iElapsedRealtime | (-520153027))) * 113);
                int i18 = (i17 << 13) ^ i17;
                int i19 = i18 ^ (i18 >>> 17);
                ((int[]) objArr21[2])[0] = i19 ^ (i19 << 5);
                int i20 = ((int[]) objArr21[2])[0];
                int i21 = i20 * i20;
                int i22 = -(183762238 * i20);
                int i23 = (i21 & i22) + (i21 | i22);
                int i24 = -(i20 * 1259444510);
                int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                int i26 = (i25 ^ 1106902084) + ((1106902084 & i25) << 1);
                int i27 = i26 >> 18;
                int i28 = (((i27 | (-32767)) << 1) - (i27 ^ (-32767))) / 16384;
                int i29 = (i28 & 1) + (i28 | 1);
                int i30 = (i26 & i29) + (i29 | i26);
                int i31 = i26 >> 26;
                int i32 = (((i31 | ComposerKt.defaultsKey) << 1) - (i31 ^ ComposerKt.defaultsKey)) / 64;
                int i33 = (-(((i32 & 1) + (i32 | 1)) ^ i30)) + 4;
                int i34 = i33 >> 23;
                int i35 = (((i34 ^ (-1023)) + ((i34 & (-1023)) << 1)) / 512) + 1;
                SocketTimeoutException socketTimeoutException = new SocketTimeoutException("8\\22\\timeout".substring(520 / ((i33 & (-((i35 & 1) + (i35 | 1)))) * 26)));
                if (iOException != null) {
                    int i36 = asBinder + 103;
                    f870a = i36 % 128;
                    int i37 = i36 % 2;
                    socketTimeoutException.initCause(iOException);
                    if (i37 == 0) {
                        throw null;
                    }
                }
                return socketTimeoutException;
            }
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[1];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i12));
        }

        public void exitAndThrowIfTimedOut() throws IOException {
            int i = 2 % 2;
            int i2 = asBinder + 53;
            f870a = i2 % 128;
            int i3 = i2 % 2;
            if (exit()) {
                throw newTimeoutException(null);
            }
            int i4 = f870a + 101;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
        }

        private static String $$g(int i, short s, int i2) {
            int i3 = 121 - i;
            int i4 = s * 4;
            byte[] bArr = $$c;
            int i5 = 4 - (i2 * 2);
            byte[] bArr2 = new byte[1 - i4];
            int i6 = 0 - i4;
            int i7 = -1;
            if (bArr == null) {
                i3 = (-i3) + i6;
                i5++;
                i7 = -1;
            }
            while (true) {
                int i8 = i7 + 1;
                bArr2[i8] = (byte) i3;
                if (i8 == i6) {
                    return new String(bArr2, 0);
                }
                i3 = (-bArr[i5]) + i3;
                i5++;
                i7 = i8;
            }
        }
    }

    private boolean closeInternal(ErrorCode errorCode) {
        synchronized (this) {
            if (this.errorCode != null) {
                return false;
            }
            if (this.source.finished && this.sink.finished) {
                return false;
            }
            this.errorCode = errorCode;
            notifyAll();
            this.connection.removeStream(this.f869id);
            return true;
        }
    }

    final void receiveHeaders(List<Header> list, HeadersMode headersMode) {
        ErrorCode errorCode;
        boolean zIsOpen;
        synchronized (this) {
            errorCode = null;
            zIsOpen = true;
            if (this.responseHeaders == null) {
                if (headersMode.failIfHeadersAbsent()) {
                    errorCode = ErrorCode.PROTOCOL_ERROR;
                } else {
                    this.responseHeaders = list;
                    zIsOpen = isOpen();
                    notifyAll();
                }
            } else if (headersMode.failIfHeadersPresent()) {
                errorCode = ErrorCode.STREAM_IN_USE;
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.responseHeaders);
                arrayList.addAll(list);
                this.responseHeaders = arrayList;
            }
        }
        if (errorCode != null) {
            closeLater(errorCode);
        } else {
            if (zIsOpen) {
                return;
            }
            this.connection.removeStream(this.f869id);
        }
    }

    final void receiveData(RotationProvider1 rotationProvider1, int i) throws IOException {
        this.source.receive(rotationProvider1, i);
    }

    final void receiveFin() {
        boolean zIsOpen;
        synchronized (this) {
            this.source.finished = true;
            zIsOpen = isOpen();
            notifyAll();
        }
        if (zIsOpen) {
            return;
        }
        this.connection.removeStream(this.f869id);
    }

    final void receiveRstStream(ErrorCode errorCode) {
        synchronized (this) {
            if (this.errorCode == null) {
                this.errorCode = errorCode;
                notifyAll();
            }
        }
    }

    final class FramedDataSource implements tryToComplete {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private boolean closed;
        private boolean finished;
        private final long maxByteCount;
        private final RotationProviderListenerWrapper readBuffer;
        private final RotationProviderListenerWrapper receiveBuffer;

        private FramedDataSource(long j) {
            this.receiveBuffer = new RotationProviderListenerWrapper();
            this.readBuffer = new RotationProviderListenerWrapper();
            this.maxByteCount = j;
        }

        @Override // defpackage.tryToComplete
        public final long read(RotationProviderListenerWrapper rotationProviderListenerWrapper, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
            }
            synchronized (FramedStream.this) {
                waitUntilReadable();
                checkNotClosed();
                if (this.readBuffer.size == 0) {
                    return -1L;
                }
                RotationProviderListenerWrapper rotationProviderListenerWrapper2 = this.readBuffer;
                long j2 = rotationProviderListenerWrapper2.read(rotationProviderListenerWrapper, Math.min(j, rotationProviderListenerWrapper2.size));
                FramedStream.this.unacknowledgedBytesRead += j2;
                if (FramedStream.this.unacknowledgedBytesRead >= FramedStream.this.connection.okHttpSettings.getInitialWindowSize(65536) / 2) {
                    FramedStream.this.connection.writeWindowUpdateLater(FramedStream.this.f869id, FramedStream.this.unacknowledgedBytesRead);
                    FramedStream.this.unacknowledgedBytesRead = 0L;
                }
                synchronized (FramedStream.this.connection) {
                    FramedStream.this.connection.unacknowledgedBytesRead += j2;
                    if (FramedStream.this.connection.unacknowledgedBytesRead >= FramedStream.this.connection.okHttpSettings.getInitialWindowSize(65536) / 2) {
                        FramedStream.this.connection.writeWindowUpdateLater(0, FramedStream.this.connection.unacknowledgedBytesRead);
                        FramedStream.this.connection.unacknowledgedBytesRead = 0L;
                    }
                }
                return j2;
            }
        }

        private void waitUntilReadable() throws IOException {
            FramedStream.this.readTimeout.enter();
            while (this.readBuffer.size == 0 && !this.finished && !this.closed && FramedStream.this.errorCode == null) {
                try {
                    FramedStream.this.waitForIo();
                } catch (Throwable th) {
                    FramedStream.this.readTimeout.exitAndThrowIfTimedOut();
                    throw th;
                }
            }
            FramedStream.this.readTimeout.exitAndThrowIfTimedOut();
        }

        final void receive(RotationProvider1 rotationProvider1, long j) throws IOException {
            boolean z;
            boolean z2;
            boolean z3;
            while (j > 0) {
                synchronized (FramedStream.this) {
                    z = this.finished;
                    z2 = true;
                    z3 = this.readBuffer.size + j > this.maxByteCount;
                }
                if (z3) {
                    rotationProvider1.g(j);
                    FramedStream.this.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z) {
                    rotationProvider1.g(j);
                    return;
                }
                long j2 = rotationProvider1.read(this.receiveBuffer, j);
                if (j2 == -1) {
                    throw new EOFException();
                }
                j -= j2;
                synchronized (FramedStream.this) {
                    if (this.readBuffer.size != 0) {
                        z2 = false;
                    }
                    this.readBuffer.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.receiveBuffer);
                    if (z2) {
                        FramedStream.this.notifyAll();
                    }
                }
            }
        }

        @Override // defpackage.tryToComplete
        public final cancelPreviousRequest timeout() {
            return FramedStream.this.readTimeout;
        }

        @Override // defpackage.tryToComplete, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            synchronized (FramedStream.this) {
                this.closed = true;
                RotationProviderListenerWrapper rotationProviderListenerWrapper = this.readBuffer;
                rotationProviderListenerWrapper.g(rotationProviderListenerWrapper.size);
                FramedStream.this.notifyAll();
            }
            FramedStream.this.cancelStreamIfNecessary();
        }

        private void checkNotClosed() throws IOException {
            if (!this.closed) {
                if (FramedStream.this.errorCode == null) {
                    return;
                }
                StringBuilder sb = new StringBuilder("stream was reset: ");
                sb.append(FramedStream.this.errorCode);
                throw new IOException(sb.toString());
            }
            throw new IOException("stream closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelStreamIfNecessary() throws IOException {
        boolean z;
        boolean zIsOpen;
        synchronized (this) {
            z = !this.source.finished && this.source.closed && (this.sink.finished || this.sink.closed);
            zIsOpen = isOpen();
        }
        if (z) {
            close(ErrorCode.CANCEL);
        } else {
            if (zIsOpen) {
                return;
            }
            this.connection.removeStream(this.f869id);
        }
    }

    final class FramedDataSink implements SurfaceViewImplementationApi24Impl {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private static final long EMIT_BUFFER_SIZE = 16384;
        private boolean closed;
        private boolean finished;
        private final RotationProviderListenerWrapper sendBuffer = new RotationProviderListenerWrapper();

        FramedDataSink() {
        }

        @Override // defpackage.SurfaceViewImplementationApi24Impl
        public final void write(RotationProviderListenerWrapper rotationProviderListenerWrapper, long j) throws IOException {
            this.sendBuffer.write(rotationProviderListenerWrapper, j);
            while (this.sendBuffer.size >= 16384) {
                emitDataFrame(false);
            }
        }

        private void emitDataFrame(boolean z) throws IOException {
            long jMin;
            synchronized (FramedStream.this) {
                FramedStream.this.writeTimeout.enter();
                while (FramedStream.this.bytesLeftInWriteWindow <= 0 && !this.finished && !this.closed && FramedStream.this.errorCode == null) {
                    try {
                        FramedStream.this.waitForIo();
                    } catch (Throwable th) {
                        FramedStream.this.writeTimeout.exitAndThrowIfTimedOut();
                        throw th;
                    }
                }
                FramedStream.this.writeTimeout.exitAndThrowIfTimedOut();
                FramedStream.this.checkOutNotClosed();
                jMin = Math.min(FramedStream.this.bytesLeftInWriteWindow, this.sendBuffer.size);
                FramedStream.this.bytesLeftInWriteWindow -= jMin;
            }
            FramedStream.this.writeTimeout.enter();
            try {
                FramedStream.this.connection.writeData(FramedStream.this.f869id, z && jMin == this.sendBuffer.size, this.sendBuffer, jMin);
            } finally {
                FramedStream.this.writeTimeout.exitAndThrowIfTimedOut();
            }
        }

        @Override // defpackage.SurfaceViewImplementationApi24Impl, java.io.Flushable
        public final void flush() throws IOException {
            synchronized (FramedStream.this) {
                FramedStream.this.checkOutNotClosed();
            }
            while (this.sendBuffer.size > 0) {
                emitDataFrame(false);
                FramedStream.this.connection.flush();
            }
        }

        @Override // defpackage.SurfaceViewImplementationApi24Impl
        public final cancelPreviousRequest timeout() {
            return FramedStream.this.writeTimeout;
        }

        @Override // defpackage.SurfaceViewImplementationApi24Impl, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            synchronized (FramedStream.this) {
                if (this.closed) {
                    return;
                }
                if (!FramedStream.this.sink.finished) {
                    if (this.sendBuffer.size > 0) {
                        while (this.sendBuffer.size > 0) {
                            emitDataFrame(true);
                        }
                    } else {
                        FramedStream.this.connection.writeData(FramedStream.this.f869id, true, null, 0L);
                    }
                }
                synchronized (FramedStream.this) {
                    this.closed = true;
                }
                FramedStream.this.connection.flush();
                FramedStream.this.cancelStreamIfNecessary();
            }
        }
    }

    final void addBytesToWriteWindow(long j) {
        this.bytesLeftInWriteWindow += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkOutNotClosed() throws IOException {
        if (!this.sink.closed) {
            if (this.sink.finished) {
                throw new IOException("stream finished");
            }
            if (this.errorCode == null) {
                return;
            }
            StringBuilder sb = new StringBuilder("stream was reset: ");
            sb.append(this.errorCode);
            throw new IOException(sb.toString());
        }
        throw new IOException("stream closed");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void waitForIo() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            throw new InterruptedIOException();
        }
    }
}
