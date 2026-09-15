package kotlinx.coroutines;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.VideoMimeInfoBuilder;
import defpackage.initSession;
import defpackage.isProblematicEncodeSize;
import defpackage.scaleAndClampBitrate;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\u00060\u0002j\u0002`\u00012\b\u0012\u0004\u0012\u00020\u00000\u0003B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0007H\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\u0000H\u0016J\b\u0010\u000e\u001a\u00020\u0005H\u0016J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0010\u0010\b\u001a\u00020\t8\u0000X\u0081\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/JobCancellationException;", "Lkotlinx/coroutines/CancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CopyableThrowable;", "message", "", "cause", "", "job", "Lkotlinx/coroutines/Job;", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Lkotlinx/coroutines/Job;)V", "fillInStackTrace", "createCopy", "toString", "equals", "", "other", "", "hashCode", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JobCancellationException extends CancellationException implements isProblematicEncodeSize<JobCancellationException> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static short[] f1242a;
    private transient VideoMimeInfoBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {118, 35, -100, -35};
    private static final int $$f = 95;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {6, 51, 46, 31, 14, -57, 76, -5, 4, 10, 25, -3, 21, -9, 27, -66, 67, 13, 14, -7, 21, 4, -5, 19, -54, 73, 9, -3, 21, -9, 27, 3, 11, 9, -61, 73, -5, 25, -6, 21, 12, -13, 9, 18, 1, -47, 41, 27, 25, -6, 21, 12, -13, 9, 18, 1, -6, 26, 13, -2, 19, 16, -45, 53, 14, 1, -2, 5, 25, 15, -77, 56, 41, -4, 19, -3, 14, 7, -22, 25, 32, -4, 0, 17, 14, -38, 52, -9, 14, 14, 0, 17, 14, -10, 15, 13, -2, 13, 13, 1, -22, 45, 0, 14, -3, 27, -7, 21, -57, 41, -4, 19, -3, 14, 7, -22, 25, 32, -4, 0, 17, 14, -38, 52, -9, 14, 14, 0, 17, 14, 7, 5, -3, 6, 14, 0, 19, 5, 13, 6, 5, 13, -1, 7, 26, -5, 4, 26, -34, 42, -3, 9, 15, 0, 9, 9, 3, 28, -1, 16, -57};
    private static final int $$e = 142;
    private static final byte[] $$a = {119, -103, 14, -22, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 50;
    private static int asInterface = 0;
    private static int d = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -2119792764;
    private static int b = -1934795559;
    private static int TuitionPaymentFragmentbindingInflater1 = 1606563186;
    private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {49, -4, 0, -9, -35, 34, -4, 5, -11, 14, -46, -47, 79, -16, -75, 62, 15, 14, 9, -6, 2, -7, 54, -2, 2, -13, 14, 13, -6, 21, -24, -7, -12, 5, 9, -13, 1, Base64.padSymbol, -23, 22, 25, -32, -2, 49, -17, -31, 25, -25, 31, -5, -56, -7, 84, -22, -27, -39, 32, 17, 16, 23, -28, 28, -25, 53, -127, 120, -117, 109, ByteCompanionObject.MIN_VALUE, -124, -125, -126, 126, 81, -77, 120, 119, -115, 126, -125, 108, 55, -15, 8, -8, 3, -33, -36, 62, 0, -12, 12, -57, 52, 18, -20, 14, 55, -67, 73, -112, 103, 73, -82, -91, 115, -71, -73, 73, -70, -75, -67, 71};

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlinx.coroutines.JobCancellationException.$$a
            int r7 = r7 + 4
            int r8 = r8 * 3
            int r8 = 84 - r8
            int r6 = r6 * 15
            int r1 = 53 - r6
            byte[] r1 = new byte[r1]
            int r6 = 52 - r6
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2f
        L17:
            r3 = r2
        L18:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            r3 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r5
        L2f:
            int r7 = r7 + 1
            int r8 = r8 + r3
            int r8 = r8 + (-11)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobCancellationException.c(byte, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(int r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = kotlinx.coroutines.JobCancellationException.$$d
            int r6 = r6 * 53
            int r1 = r6 + 53
            int r5 = r5 + 4
            int r7 = r7 * 21
            int r7 = 105 - r7
            byte[] r1 = new byte[r1]
            int r6 = r6 + 52
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r7
            r3 = r2
            r7 = r6
            goto L2b
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r5 = r5 + 1
            if (r3 != r6) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r5]
        L2b:
            int r7 = r7 + r4
            int r7 = r7 + (-8)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobCancellationException.f(int, int, byte, java.lang.Object[]):void");
    }

    @Override // defpackage.isProblematicEncodeSize
    public final /* synthetic */ Throwable TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = d + 107;
        asInterface = i2 % 128;
        JobCancellationException jobCancellationException = null;
        if (i2 % 2 != 0) {
            scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            throw null;
        }
        if (scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
            String message = getMessage();
            Intrinsics.checkNotNull(message);
            jobCancellationException = new JobCancellationException(message, this, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        JobCancellationException jobCancellationException2 = jobCancellationException;
        int i3 = d + 39;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return jobCancellationException2;
    }

    public JobCancellationException(String str, Throwable th, VideoMimeInfoBuilder videoMimeInfoBuilder) {
        super(str);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = videoMimeInfoBuilder;
        if (th != null) {
            initCause(th);
            int i = d + 89;
            asInterface = i % 128;
            if (i % 2 != 0) {
                int i2 = 3 / 5;
            } else {
                int i3 = 2 % 2;
            }
        }
        int i4 = asInterface + 27;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        int i = 2 % 2;
        int i2 = asInterface + 31;
        d = i2 % 128;
        int i3 = i2 % 2;
        if (!scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
            setStackTrace(new StackTraceElement[0]);
            return this;
        }
        int i4 = asInterface + 31;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            return super.fillInStackTrace();
        }
        super.fillInStackTrace();
        throw null;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        String string = sb.toString();
        int i2 = d + 37;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    private static void e(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5 = 2;
        int i6 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(b)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b3 = (byte) 0;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.lastIndexOf("", '0') + 1), 2268 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 32 - Process.getGidForName(""), 1387473586, false, $$g(b3, (byte) (b3 - 1), (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i7 = $10 + 61;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (i4 != 0) {
                byte[] bArr = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (bArr != null) {
                    int i9 = $10 + 29;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i11 = 0;
                    while (i11 < length) {
                        int i12 = $10 + 65;
                        $11 = i12 % 128;
                        int i13 = i12 % i5;
                        Object[] objArr3 = {Integer.valueOf(bArr[i11])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = (byte) (b4 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getJumpTapTimeout() >> 16), KeyEvent.keyCodeFromString("") + 3358, 18 - Color.alpha(0), -1054011043, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                        }
                        bArr2[i11] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                        i11++;
                        i5 = 2;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + 2268, Color.rgb(0, 0, 0) + 16777249, 1387473586, false, $$g(b6, (byte) (b6 - 1), (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) b) ^ 3046761265686732006L)));
                    int i14 = $10 + 57;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                } else {
                    iIntValue = (short) (((short) (((long) f1242a[i3 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) b) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                int i16 = $10 + 77;
                $11 = i16 % 128;
                int i17 = i16 % 2;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L)) + i4;
                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentbindingInflater1), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = (byte) (b7 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.MeasureSpec.getSize(0) + 55904), 2856 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 13 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -1529949196, false, $$g(b7, b8, (byte) (b8 + 4)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i18 = 0;
                    while (i18 < length2) {
                        bArr5[i18] = (byte) (((long) bArr4[i18]) ^ 3046761265686732006L);
                        i18++;
                        int i19 = $11 + 63;
                        $10 = i19 % 128;
                        int i20 = i19 % 2;
                    }
                    int i21 = $10 + 29;
                    $11 = i21 % 128;
                    int i22 = i21 % 2;
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    int i23 = $10 + 61;
                    $11 = i23 % 128;
                    if (i23 % 2 == 0) {
                        throw null;
                    }
                    if (z) {
                        byte[] bArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i24 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i24 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i24]) ^ 3046761265686732006L)) + s)) ^ b2));
                    } else {
                        short[] sArr = f1242a;
                        int i25 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i25 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i25]) ^ 3046761265686732006L)) + s)) ^ b2));
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

    /* JADX WARN: Code restructure failed: missing block: B:54:0x057e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r0.getCause(), getCause()) != false) goto L60;
     */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobCancellationException.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0046 A[PHI: r1 r3
  0x0046: PHI (r1v12 int) = (r1v5 int), (r1v14 int) binds: [B:8:0x003f, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
  0x0046: PHI (r3v4 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x003f, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0041 A[PHI: r1 r3 r4
  0x0041: PHI (r1v6 int) = (r1v5 int), (r1v14 int) binds: [B:8:0x003f, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
  0x0041: PHI (r3v2 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x003f, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
  0x0041: PHI (r4v1 java.lang.Throwable) = (r4v0 java.lang.Throwable), (r4v5 java.lang.Throwable) binds: [B:8:0x003f, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        Throwable cause;
        int i = 2 % 2;
        int i2 = asInterface + 15;
        d = i2 % 128;
        int iHashCode3 = 0;
        if (i2 % 2 == 0) {
            String message = getMessage();
            Intrinsics.checkNotNull(message);
            iHashCode = message.hashCode();
            iHashCode2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
            cause = getCause();
            int i3 = 28 / 0;
            if (cause != null) {
                iHashCode3 = cause.hashCode();
            } else {
                int i4 = asInterface + 71;
                d = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            String message2 = getMessage();
            Intrinsics.checkNotNull(message2);
            iHashCode = message2.hashCode();
            iHashCode2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
            cause = getCause();
            if (cause != null) {
                iHashCode3 = cause.hashCode();
            } else {
                int i6 = asInterface + 71;
                d = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        return (((iHashCode * 31) + iHashCode2) * 31) + iHashCode3;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r7, int r8, byte r9) {
        /*
            int r7 = r7 * 4
            int r7 = 1 - r7
            byte[] r0 = kotlinx.coroutines.JobCancellationException.$$c
            int r9 = 121 - r9
            int r8 = r8 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r9 = r8
            r4 = r2
            goto L29
        L13:
            r3 = r2
        L14:
            int r8 = r8 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L29:
            int r8 = -r8
            int r8 = r8 + r3
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobCancellationException.$$g(short, int, byte):java.lang.String");
    }
}
