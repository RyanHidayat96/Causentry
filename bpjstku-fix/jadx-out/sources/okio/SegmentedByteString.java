package okio;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.internal.bind.TypeAdapters;
import defpackage.RotationProviderListenerWrapper;
import defpackage.SessionProcessor;
import defpackage.SurfaceViewImplementationSurfaceRequestCallback;
import defpackage.initSession;
import defpackage.recalculate;
import defpackage.setSurfaceRequest;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\n\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\tH\u0011¢\u0006\u0004\b\n\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\tH\u0017¢\u0006\u0004\b\u0015\u0010\u000bJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\n\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u0011H\u0010¢\u0006\u0004\b\n\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u0016J/\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u001eJ/\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u001fJ\u001f\u0010\n\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\n\u0010 J\u000f\u0010!\u001a\u00020\u0001H\u0017¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0003H\u0017¢\u0006\u0004\b#\u0010\u0018J\u000f\u0010$\u001a\u00020\tH\u0017¢\u0006\u0004\b$\u0010\u000bJ'\u0010\u0015\u001a\u00020&2\u0006\u0010\u0004\u001a\u00020%2\u0006\u0010\u0006\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0011H\u0010¢\u0006\u0004\b\u0015\u0010'J\u000f\u0010(\u001a\u00020\rH\u0002¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0012\u001a\u00020\u00058\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010*R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010+"}, d2 = {"Lokio/SegmentedByteString;", "Lokio/ByteString;", "", "", "p0", "", "p1", "<init>", "([[B[I)V", "", "b", "()Ljava/lang/String;", "(Ljava/lang/String;)Lokio/ByteString;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I", "hashCode", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "([BI)I", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()[B", "", "(I)B", "TuitionPaymentFragmentbindingInflater1", "p2", "p3", "(I[BII)Z", "(ILokio/ByteString;I)Z", "(II)Lokio/ByteString;", "g", "()Lokio/ByteString;", "asBinder", "toString", "LRotationProviderListenerWrapper;", "", "(LRotationProviderListenerWrapper;II)V", "writeReplace", "()Ljava/lang/Object;", "[I", "[[B"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SegmentedByteString extends ByteString {
    public final transient byte[][] TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final transient int[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {22, 102, 43, -6};
    private static final int $$f = 94;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {51, -5, 77, 89, -10, 4, 65, -49, -13, 2, -1, 15, -4, -11, 22, -11, 70, -57, -3, -4, 17, -11, 6, 15, -9, 64, -17, -3, -29, 54, -71, 41, 17, -5, 41, -27, -3, -25, 50, -70, 40, 17, -5, -31, 14, -9, 13, -4, 3, 32, -15, -22, 14, 10, -7, -4, 48, -42, 19, -4, -4, 10, -7, -4, 3, 5, 13, 4, -4, 10, -9, 5, -3, 4, 5, -3, 11, 3, -16, 15, 6, -16, 44, -32, 13, 1, -5, 10, 1, 1, 7, -18, 11, -6, 69};
    private static final int $$e = 109;
    private static final byte[] $$a = {51, -99, -8, -59, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
    private static final int $$b = 226;
    private static int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f1293a = 1;
    private static long b = 2463195618032040892L;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -981105359;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 34097;

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8 = i5 | i;
        int i9 = ~i;
        int i10 = ~i6;
        int i11 = ~(i9 | i10);
        int i12 = ~i5;
        int i13 = i11 | (~(i12 | i6));
        int i14 = ~(i10 | i5);
        int i15 = i13 | i14;
        int i16 = (~(i6 | i12 | i)) | i14;
        int i17 = i5 + i + i4 + (1881146393 * i3) + ((-1035018111) * i2);
        int i18 = i17 * i17;
        int i19 = ((i5 * (-1924067824)) - 304087040) + ((-1924067824) * i) + (i8 * (-674303503)) + ((-674303503) * i15) + (674303503 * i16) + (1696595968 * i4) + (1612709888 * i3) + ((-182452224) * i2) + ((-1611137024) * i18);
        int i20 = (i5 * (-928100048)) + 945860906 + (i * (-928100048)) + (i8 * (-189)) + (i15 * (-189)) + (i16 * 189) + (i4 * (-928100237)) + (i3 * (-1331189957)) + (i2 * 1329932787) + (i18 * 1550319616);
        int i21 = i19 + (i20 * i20 * 1690828800);
        if (i21 == 1) {
            return b(objArr);
        }
        if (i21 != 2) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        int i22 = 0;
        SegmentedByteString segmentedByteString = (SegmentedByteString) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i23 = 2 % 2;
        recalculate.TuitionPaymentFragmentspecialinlinedviewModeldefault2(segmentedByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3[segmentedByteString.TuitionPaymentFragmentbindingInflater1.length - 1], iIntValue, 1L);
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = setSurfaceRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault2(segmentedByteString, iIntValue);
        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 == 0) {
            i7 = d + 13;
        } else {
            i22 = segmentedByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3[iTuitionPaymentFragmentspecialinlinedviewModeldefault2 - 1];
            i7 = d + 49;
        }
        f1293a = i7 % 128;
        int i24 = i7 % 2;
        int[] iArr = segmentedByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        byte[][] bArr = segmentedByteString.TuitionPaymentFragmentbindingInflater1;
        return Byte.valueOf(bArr[iTuitionPaymentFragmentspecialinlinedviewModeldefault2][(iIntValue - i22) + iArr[bArr.length + iTuitionPaymentFragmentspecialinlinedviewModeldefault2]]);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 52
            int r0 = r6 + 1
            int r7 = r7 * 52
            int r7 = 55 - r7
            int r8 = r8 * 14
            int r8 = r8 + 84
            byte[] r1 = okio.SegmentedByteString.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r6
            r4 = r2
            goto L2e
        L16:
            r3 = r2
        L17:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2e:
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-11)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.SegmentedByteString.c(short, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(int r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = okio.SegmentedByteString.$$d
            int r9 = r9 * 13
            int r9 = r9 + 40
            int r8 = r8 * 15
            int r8 = r8 + 84
            int r7 = r7 * 39
            int r7 = 43 - r7
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r7
            r3 = r9
            r5 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2d:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r8 + 1
            int r8 = r3 + 2
            r3 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.SegmentedByteString.f(int, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedByteString(byte[][] bArr, int[] iArr) {
        super(ByteString.EMPTY.getData());
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        this.TuitionPaymentFragmentbindingInflater1 = bArr;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iArr;
    }

    @Override // okio.ByteString
    public final String b() {
        int i = 2 % 2;
        String strB = new ByteString(asBinder()).b();
        int i2 = f1293a + 73;
        d = i2 % 128;
        int i3 = i2 % 2;
        return strB;
    }

    @Override // okio.ByteString
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ByteString(asBinder()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i2 = d + 59;
        f1293a = i2 % 128;
        if (i2 % 2 != 0) {
            return strTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        throw null;
    }

    private static void e(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i4 = $11 + 37;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 8327), 1235 - View.MeasureSpec.getSize(0), View.MeasureSpec.getMode(0) + 35, -653973969, false, $$g(b2, b3, b3), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - TextUtils.lastIndexOf("", '0')), TextUtils.lastIndexOf("", '0', 0, 0) + 2765, 15 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 1504416861, false, $$g(b4, b5, (byte) (b5 + 2)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.indexOf("", "") + 43325), 253 - (Process.myPid() >> 22), TextUtils.indexOf("", "", 0, 0) + 22, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Gravity.getAbsoluteGravity(0, 0) + 65200), TextUtils.lastIndexOf("", '0') + 2892, TextUtils.getOffsetAfter("", 0) + 17, 2012627446, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (b ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                int i6 = $11 + 121;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0277  */
    @Override // okio.ByteString
    public final ByteString g() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = f1293a + 69;
        d = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char bitsPerPixel = (char) (37566 - ImageFormat.getBitsPerPixel(0));
            int i4 = 626 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 14;
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            byte b3 = bArr[5];
            Object[] objArr2 = new Object[1];
            c(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(bitsPerPixel, i4, absoluteGravity, -477065106, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{48781, 62620, 59950, 34129}, new char[]{64969, 33345, 12036, 5171}, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), View.getDefaultSize(0, 0), new char[]{59724, 58504, 55693, 61817, 42325, 37681, 29250, 59669, 29720, 17507, 40892, 39022, 35018, 49966, 48374, 11625, 415, 35811, 34720, 50993, 16267, 29595}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{48781, 62620, 59950, 34129}, new char[]{50581, 27163, 59752, 62588}, (char) (31977 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (Process.myTid() >> 22) + 1751784389, new char[]{38589, 52000, 33853, 22140, 37217, 35398, 31555, 54986, 64140, 25004, 50377, 38834, 46607, 15792, 19843}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 37566);
            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 626;
            int longPressTimeout = 14 - (ViewConfiguration.getLongPressTimeout() >> 16);
            byte[] bArr2 = $$a;
            byte b4 = bArr2[5];
            Object[] objArr5 = new Object[1];
            c(b4, b4, bArr2[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, packedPositionChild, longPressTimeout, -976899241, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cArgb = (char) (Color.argb(0, 0, 0, 0) + 37567);
                int i5 = 625 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 14;
                byte[] bArr3 = $$a;
                byte b5 = bArr3[5];
                byte b6 = bArr3[7];
                Object[] objArr6 = new Object[1];
                c(b5, b6, b6, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cArgb, i5, scrollDefaultDelay, -973632554, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i6 = ((int[]) objArr7[2])[0];
            int i7 = ((int[]) objArr7[0])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i7};
            int iIdentityHashCode = System.identityHashCode(this);
            int i8 = 157239376 + (((~(1583349735 | iIdentityHashCode)) | 240388385) * (-756)) + (((~iIdentityHashCode) | 1583349735) * 756) + 128925148;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[1])[0] = i10 ^ (i10 << 5);
            objArr = new Object[]{iArr, new int[1], new int[]{i6}, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{48781, 62620, 59950, 34129}, new char[]{42902, 19869, 33077, 40423}, (char) (59265 - View.getDefaultSize(0, 0)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, new char[]{47964, 29193, 6863, 46025, 8184, 64442, 26288, 38382, 8753, 17904, 64968, 10635, 46246, 29037, 64516, 41192, 5506, 12254, 9912, 51102, 17653, 55817, 28821, 21176, 1547, 11735}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{48781, 62620, 59950, 34129}, new char[]{47929, 9979, 5116, 28827}, (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 39699), ViewConfiguration.getScrollDefaultDelay() >> 16, new char[]{3303, 36944, 35886, 39017, 47773, 48012, 8123, 625, 14518, 27947, 47847, 26114, 55006, 50445, 51174, 25153, 18125, 63117}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i11 = f1293a + 121;
                    d = i11 % 128;
                    if (i11 % 2 != 0) {
                        ((ContextWrapper) applicationContext).getBaseContext();
                        obj.hashCode();
                        throw null;
                    }
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            e(new char[]{48781, 62620, 59950, 34129}, new char[]{8290, 5978, 34671, 9546}, (char) (TextUtils.indexOf("", "", 0) + 19079), TextUtils.lastIndexOf("", '0') + 1, new char[]{'5', 12382, 15287, 39684, 4789, 9753, 19509, 17098, 49200, 24167, 46238, 20233, 47405, 64779, 39796, 48944}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new char[]{48781, 62620, 59950, 34129}, new char[]{52685, 29485, 59970, 50927}, (char) ((Process.myPid() >> 22) + 61418), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new char[]{29049, 8430, 31732, 10911, 55427, 62578, 9783, 12105, 24788, 6618, 51690, 25905, 19838, 54922, 28475, 41556}, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr12 = new Object[1];
            e(new char[]{48781, 62620, 59950, 34129}, new char[]{12183, 38984, 29039, 41628}, (char) View.getDefaultSize(0, 0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1, new char[]{35020, 25037, 5726, 64083, 11298, 17121, 6784, 20467, 56280, 16530, 26832, 2840, 32054, 63736, 56980, 13785, 28733, 1086, 4390, 32270, 35830, 19623, 44741, 47074, 45420, 54449, 34357, 46735, 48625, 46948, 41386, 17966, 5606, 49567, 19571, 20914, 59899, 56411, 47487, 42496, 27004, 5306, 57600, 27315, 37382, 55201, 60208, 16725, 12484, 13781, 34494, 4914, 13751, 20088, 6581, 34373, 63567, 18025, 15863, 42784, 17248, 299, 16397, 1241}, objArr12);
            String str = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            e(new char[]{48781, 62620, 59950, 34129}, new char[]{43601, 56643, 25191, 33026}, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), ExpandableListView.getPackedPositionGroup(0L), new char[]{50570, 18724, 28896, 11314, 63865, 22540, 6389, 14547, 5061, 47942, 19320, 59511, 5325, 60945, 64139, 43731, 12089, 41706, 35711, 16418, 12629, 23951, 27683, 30940, 44766, 14527, 10930, 30986, 50804, 26952, 7473, 20574, 7904, 41752, 1933, 61434, 38214, 48832, 59697, 58400, 40552, 9794, 17576, 60671, 5883, 37625, 55999, 51841, 9245, 50005, 42342, 29845, 54439, 21164, 6018, 15965, 32834, 50495, 13486, 34966, 61486, 21080, 64778, 46263}, objArr13);
            try {
                Object[] objArr14 = {applicationContext, new String[]{str, (String) objArr13[0]}, Integer.valueOf(iIntValue), 17, 128925148};
                byte[] bArr4 = $$d;
                byte b7 = bArr4[85];
                byte b8 = b7;
                Object[] objArr15 = new Object[1];
                f(b7, b8, (byte) (b8 - 1), objArr15);
                Class<?> cls4 = Class.forName((String) objArr15[0]);
                byte b9 = bArr4[85];
                byte b10 = (byte) (b9 - 1);
                Object[] objArr16 = new Object[1];
                f(b10, b10, b9, objArr16);
                Object[] objArr17 = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                int i12 = ((int[]) objArr17[0])[0];
                int i13 = ((int[]) objArr17[2])[0];
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cAlpha = (char) (37567 - Color.alpha(0));
                        int fadingEdgeLength = 625 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        int i14 = 13 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        byte[] bArr5 = $$a;
                        byte b11 = bArr5[5];
                        byte b12 = bArr5[7];
                        Object[] objArr18 = new Object[1];
                        c(b11, b12, b12, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cAlpha, fadingEdgeLength, i14, -973632554, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr17);
                    try {
                        Object[] objArr19 = new Object[1];
                        e(new char[]{48781, 62620, 59950, 34129}, new char[]{64969, 33345, 12036, 5171}, (char) View.MeasureSpec.getSize(0), ViewConfiguration.getDoubleTapTimeout() >> 16, new char[]{59724, 58504, 55693, 61817, 42325, 37681, 29250, 59669, 29720, 17507, 40892, 39022, 35018, 49966, 48374, 11625, 415, 35811, 34720, 50993, 16267, 29595}, objArr19);
                        Class<?> cls5 = Class.forName((String) objArr19[0]);
                        Object[] objArr20 = new Object[1];
                        e(new char[]{48781, 62620, 59950, 34129}, new char[]{50581, 27163, 59752, 62588}, (char) (31977 - ExpandableListView.getPackedPositionGroup(0L)), 1751784390 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), new char[]{38589, 52000, 33853, 22140, 37217, 35398, 31555, 54986, 64140, 25004, 50377, 38834, 46607, 15792, 19843}, objArr20);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr20[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c2 = (char) (37566 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                            int iGreen = Color.green(0) + 625;
                            int doubleTapTimeout = 14 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            byte[] bArr6 = $$a;
                            byte b13 = bArr6[5];
                            Object[] objArr21 = new Object[1];
                            c(b13, b13, bArr6[7], objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, iGreen, doubleTapTimeout, -976899241, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cIndexOf = (char) (37567 - TextUtils.indexOf("", "", 0, 0));
                            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 625;
                            int windowTouchSlop = 14 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                            byte[] bArr7 = $$a;
                            byte b14 = bArr7[7];
                            byte b15 = bArr7[5];
                            Object[] objArr22 = new Object[1];
                            c(b14, b15, b15, objArr22);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, pressedStateDuration, windowTouchSlop, -477065106, false, (String) objArr22[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr17;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i15 = ((int[]) objArr[0])[0];
        int i16 = ((int[]) objArr[2])[0];
        if (i16 != i15) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[3];
            if (strArr2 != null) {
                for (String str2 : strArr2) {
                    int i17 = d + 39;
                    f1293a = i17 % 128;
                    int i18 = i17 % 2;
                    arrayList.add(str2);
                }
            }
            throw new RuntimeException(String.valueOf(i16));
        }
        int i19 = ((int[]) objArr[1])[0];
        int i20 = ((int[]) objArr[2])[0];
        int i21 = ((int[]) objArr[0])[0];
        String[] strArr3 = (String[]) objArr[3];
        int[] iArr2 = {i20};
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        int i22 = ~startUptimeMillis;
        int i23 = i19 + (-653976540) + ((~((-1279457035) | i22)) * 979) + ((startUptimeMillis | 544281086) * (-979)) + (((~(startUptimeMillis | (-1279457035))) | (~(i22 | 544281086))) * 979);
        int i24 = (i23 << 13) ^ i23;
        int i25 = i24 ^ (i24 >>> 17);
        ((int[]) objArr[1])[0] = i25 ^ (i25 << 5);
        Object[] objArr23 = {new int[]{i21}, new int[1], iArr2, strArr3};
        return new ByteString(asBinder()).g();
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        int length;
        int i;
        int i2 = 0;
        SegmentedByteString segmentedByteString = (SegmentedByteString) objArr[0];
        String str = (String) objArr[1];
        int i3 = 2 % 2;
        int i4 = f1293a + 21;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            messageDigest = MessageDigest.getInstance(str);
            length = segmentedByteString.TuitionPaymentFragmentbindingInflater1.length;
            i2 = 1;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            messageDigest = MessageDigest.getInstance(str);
            length = segmentedByteString.TuitionPaymentFragmentbindingInflater1.length;
        }
        while (i2 < length) {
            int i5 = f1293a + 113;
            d = i5 % 128;
            if (i5 % 2 != 0) {
                int[] iArr = segmentedByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i6 = iArr[length >>> i2];
                i = iArr[i2];
                messageDigest.update(segmentedByteString.TuitionPaymentFragmentbindingInflater1[i2], i6, i % i2);
                i2 += 65;
            } else {
                int[] iArr2 = segmentedByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i7 = iArr2[length + i2];
                i = iArr2[i2];
                messageDigest.update(segmentedByteString.TuitionPaymentFragmentbindingInflater1[i2], i7, i - i2);
                i2++;
            }
            i2 = i;
        }
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.checkNotNull(bArrDigest);
        ByteString byteString = new ByteString(bArrDigest);
        int i8 = f1293a + 1;
        d = i8 % 128;
        int i9 = i8 % 2;
        return byteString;
    }

    @Override // okio.ByteString
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte[] p0, int p1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = new ByteString(asBinder()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0, p1);
        int i2 = d + 9;
        f1293a = i2 % 128;
        if (i2 % 2 != 0) {
            return iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // okio.ByteString
    public final int TuitionPaymentFragmentbindingInflater1(byte[] p0, int p1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        int iTuitionPaymentFragmentbindingInflater1 = new ByteString(asBinder()).TuitionPaymentFragmentbindingInflater1(p0, p1);
        int i2 = d + 67;
        f1293a = i2 % 128;
        int i3 = i2 % 2;
        return iTuitionPaymentFragmentbindingInflater1;
    }

    @Override // okio.ByteString
    public final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        byte[] bArrAsBinder;
        int i = 2 % 2;
        int i2 = d + 13;
        f1293a = i2 % 128;
        if (i2 % 2 == 0) {
            bArrAsBinder = asBinder();
            int i3 = 54 / 0;
        } else {
            bArrAsBinder = asBinder();
        }
        int i4 = f1293a + 27;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            return bArrAsBinder;
        }
        throw null;
    }

    @Override // okio.ByteString
    public final String toString() {
        int i = 2 % 2;
        String string = new ByteString(asBinder()).toString();
        int i2 = f1293a + 75;
        d = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    private final Object writeReplace() {
        int i = 2 % 2;
        ByteString byteString = new ByteString(asBinder());
        Intrinsics.checkNotNull(byteString, "");
        ByteString byteString2 = byteString;
        int i2 = f1293a + 105;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            return byteString2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r14 == TuitionPaymentFragmentspecialinlinedviewModeldefault3()) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        if (r14 == TuitionPaymentFragmentspecialinlinedviewModeldefault3()) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        return r1;
     */
    @Override // okio.ByteString
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okio.ByteString b(int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.SegmentedByteString.b(int, int):okio.ByteString");
    }

    @Override // okio.ByteString
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = f1293a;
        int i3 = i2 + 75;
        d = i3 % 128;
        int i4 = i3 % 2 != 0 ? this.TuitionPaymentFragmentspecialinlinedviewModeldefault3[this.TuitionPaymentFragmentbindingInflater1.length >>> 1] : this.TuitionPaymentFragmentspecialinlinedviewModeldefault3[this.TuitionPaymentFragmentbindingInflater1.length - 1];
        int i5 = i2 + 55;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 38 / 0;
        }
        return i4;
    }

    @Override // okio.ByteString
    public final byte[] asBinder() {
        int i = 2 % 2;
        byte[] bArr = new byte[TuitionPaymentFragmentspecialinlinedviewModeldefault3()];
        int length = this.TuitionPaymentFragmentbindingInflater1.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int i5 = d + 121;
            f1293a = i5 % 128;
            int i6 = i5 % 2;
            int[] iArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i7 = iArr[length + i2];
            int i8 = iArr[i2];
            int i9 = i8 - i4;
            ArraysKt.copyInto(this.TuitionPaymentFragmentbindingInflater1[i2], bArr, i3, i7, i7 + i9);
            i3 += i9;
            i2++;
            int i10 = f1293a + 23;
            d = i10 % 128;
            int i11 = i10 % 2;
            i4 = i8;
        }
        return bArr;
    }

    @Override // okio.ByteString
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(RotationProviderListenerWrapper p0, int p1, int p2) {
        int i;
        int i2 = 2 % 2;
        int i3 = f1293a + 9;
        d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = setSurfaceRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, 0);
        while (p1 < p2) {
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 == 0) {
                int i5 = f1293a + 15;
                d = i5 % 128;
                i = i5 % 2 != 0 ? 1 : 0;
            } else {
                i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3[iTuitionPaymentFragmentspecialinlinedviewModeldefault2 - 1];
                int i6 = d + 125;
                f1293a = i6 % 128;
                int i7 = i6 % 2;
            }
            int[] iArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i8 = iArr[iTuitionPaymentFragmentspecialinlinedviewModeldefault2];
            int i9 = iArr[this.TuitionPaymentFragmentbindingInflater1.length + iTuitionPaymentFragmentspecialinlinedviewModeldefault2];
            int iMin = Math.min(p2, (i8 - i) + i) - p1;
            int i10 = i9 + (p1 - i);
            SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback = new SurfaceViewImplementationSurfaceRequestCallback(this.TuitionPaymentFragmentbindingInflater1[iTuitionPaymentFragmentspecialinlinedviewModeldefault2], i10, i10 + iMin, true, false);
            if (p0.head == null) {
                surfaceViewImplementationSurfaceRequestCallback.prev = surfaceViewImplementationSurfaceRequestCallback;
                surfaceViewImplementationSurfaceRequestCallback.next = surfaceViewImplementationSurfaceRequestCallback.prev;
                p0.head = surfaceViewImplementationSurfaceRequestCallback.next;
            } else {
                SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback2 = p0.head;
                Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback2);
                SurfaceViewImplementationSurfaceRequestCallback surfaceViewImplementationSurfaceRequestCallback3 = surfaceViewImplementationSurfaceRequestCallback2.prev;
                Intrinsics.checkNotNull(surfaceViewImplementationSurfaceRequestCallback3);
                surfaceViewImplementationSurfaceRequestCallback3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceViewImplementationSurfaceRequestCallback);
            }
            p1 += iMin;
            iTuitionPaymentFragmentspecialinlinedviewModeldefault2++;
        }
        p0.size += (long) p2;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        SegmentedByteString segmentedByteString = (SegmentedByteString) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        ByteString byteString = (ByteString) objArr[2];
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = f1293a + 51;
        d = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(byteString, "");
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(byteString, "");
        if (iIntValue < 0 || iIntValue > segmentedByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3() - iIntValue2) {
            return false;
        }
        int i3 = iIntValue2 + iIntValue;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = setSurfaceRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault2(segmentedByteString, iIntValue);
        int i4 = d + 77;
        f1293a = i4 % 128;
        int i5 = i4 % 2;
        int i6 = 0;
        while (iIntValue < i3) {
            int i7 = d + 17;
            f1293a = i7 % 128;
            if (i7 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i8 = iTuitionPaymentFragmentspecialinlinedviewModeldefault2 == 0 ? 0 : segmentedByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3[iTuitionPaymentFragmentspecialinlinedviewModeldefault2 - 1];
            int[] iArr = segmentedByteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i9 = iArr[iTuitionPaymentFragmentspecialinlinedviewModeldefault2];
            int i10 = iArr[segmentedByteString.TuitionPaymentFragmentbindingInflater1.length + iTuitionPaymentFragmentspecialinlinedviewModeldefault2];
            int iMin = Math.min(i3, (i9 - i8) + i8) - iIntValue;
            if (!byteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i6, segmentedByteString.TuitionPaymentFragmentbindingInflater1[iTuitionPaymentFragmentspecialinlinedviewModeldefault2], i10 + (iIntValue - i8), iMin)) {
                int i11 = f1293a + 113;
                d = i11 % 128;
                int i12 = i11 % 2;
                return false;
            }
            i6 += iMin;
            iIntValue += iMin;
            iTuitionPaymentFragmentspecialinlinedviewModeldefault2++;
        }
        return true;
    }

    @Override // okio.ByteString
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(int p0, byte[] p1, int p2, int p3) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p1, "");
        if (p0 >= 0) {
            int i2 = f1293a + 73;
            d = i2 % 128;
            if (i2 % 2 == 0 ? p0 <= TuitionPaymentFragmentspecialinlinedviewModeldefault3() - p3 : p0 <= TuitionPaymentFragmentspecialinlinedviewModeldefault3() / p3) {
                if (p2 >= 0 && p2 <= p1.length - p3) {
                    int i3 = p3 + p0;
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = setSurfaceRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, p0);
                    while (p0 < i3) {
                        int i4 = d + 73;
                        f1293a = i4 % 128;
                        int i5 = i4 % 2;
                        int i6 = iTuitionPaymentFragmentspecialinlinedviewModeldefault2 == 0 ? 0 : this.TuitionPaymentFragmentspecialinlinedviewModeldefault3[iTuitionPaymentFragmentspecialinlinedviewModeldefault2 - 1];
                        int[] iArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i7 = iArr[iTuitionPaymentFragmentspecialinlinedviewModeldefault2];
                        int i8 = iArr[this.TuitionPaymentFragmentbindingInflater1.length + iTuitionPaymentFragmentspecialinlinedviewModeldefault2];
                        int iMin = Math.min(i3, (i7 - i6) + i6) - p0;
                        if (!recalculate.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1[iTuitionPaymentFragmentspecialinlinedviewModeldefault2], i8 + (p0 - i6), p1, p2, iMin)) {
                            int i9 = f1293a + 9;
                            d = i9 % 128;
                            return i9 % 2 != 0;
                        }
                        p2 += iMin;
                        p0 += iMin;
                        iTuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                        int i10 = d + 71;
                        f1293a = i10 % 128;
                        if (i10 % 2 == 0) {
                            int i11 = 3 / 2;
                        }
                    }
                    int i12 = f1293a + 33;
                    d = i12 % 128;
                    int i13 = i12 % 2;
                    return true;
                }
            }
        }
        int i14 = d + 123;
        f1293a = i14 % 128;
        int i15 = i14 % 2;
        return false;
    }

    @Override // okio.ByteString
    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (p0 == this) {
            int i2 = f1293a + 119;
            d = i2 % 128;
            return i2 % 2 == 0;
        }
        if (p0 instanceof ByteString) {
            ByteString byteString = (ByteString) p0;
            if (byteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3() == TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
                int i3 = d + 89;
                f1293a = i3 % 128;
                if (i3 % 2 != 0 ? TuitionPaymentFragmentspecialinlinedviewModeldefault1(0, byteString, TuitionPaymentFragmentspecialinlinedviewModeldefault3()) : TuitionPaymentFragmentspecialinlinedviewModeldefault1(0, byteString, TuitionPaymentFragmentspecialinlinedviewModeldefault3())) {
                    int i4 = d + 119;
                    f1293a = i4 % 128;
                    return i4 % 2 != 0;
                }
            }
        }
        return false;
    }

    @Override // okio.ByteString
    public final int hashCode() {
        int i = 2 % 2;
        int i2 = f1293a + 97;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            getHashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int hashCode = getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int length = this.TuitionPaymentFragmentbindingInflater1.length;
        int i3 = 0;
        int i4 = 1;
        int i5 = 0;
        while (i3 < length) {
            int[] iArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i6 = iArr[length + i3];
            int i7 = iArr[i3];
            byte[] bArr = this.TuitionPaymentFragmentbindingInflater1[i3];
            int i8 = i6;
            while (i8 < (i7 - i5) + i6) {
                i4 = (i4 * 31) + bArr[i8];
                i8++;
                int i9 = f1293a + 5;
                d = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 5 / 3;
                }
            }
            i3++;
            i5 = i7;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(i4);
        return i4;
    }

    @Override // okio.ByteString
    public final ByteString b(String p0) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return (ByteString) TuitionPaymentFragmentbindingInflater1(396540252, new Object[]{this, p0}, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4, -396540252, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // okio.ByteString
    public final byte b(int p0) {
        Object[] objArr = {this, Integer.valueOf(p0)};
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return ((Byte) TuitionPaymentFragmentbindingInflater1(-124957797, objArr, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4, 124957799, iTuitionPaymentFragmentspecialinlinedviewModeldefault3)).byteValue();
    }

    @Override // okio.ByteString
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, ByteString byteString, int i2) {
        Object[] objArr = {this, Integer.valueOf(i), byteString, Integer.valueOf(i2)};
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        return ((Boolean) TuitionPaymentFragmentbindingInflater1(-1149169390, objArr, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4, 1149169391, iTuitionPaymentFragmentspecialinlinedviewModeldefault3)).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r5, int r6, int r7) {
        /*
            int r6 = r6 * 2
            int r0 = r6 + 1
            int r7 = r7 + 102
            int r5 = r5 * 2
            int r5 = 3 - r5
            byte[] r1 = okio.SegmentedByteString.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r7
            r3 = r2
            r7 = r6
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r5 = r5 + 1
            if (r3 != r6) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L23:
            r4 = r1[r5]
            int r3 = r3 + 1
        L27:
            int r7 = r7 + r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.SegmentedByteString.$$g(short, int, int):java.lang.String");
    }
}
