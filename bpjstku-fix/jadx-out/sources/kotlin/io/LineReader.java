package kotlin.io;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.ComposerKt;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0003R\u0014\u0010\u0018\u001a\u00020\f8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010-\u001a\u00060+j\u0002`,8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010."}, d2 = {"Lkotlin/io/LineReader;", "", "<init>", "()V", "Ljava/io/InputStream;", "p0", "Ljava/nio/charset/Charset;", "p1", "", "readLine", "(Ljava/io/InputStream;Ljava/nio/charset/Charset;)Ljava/lang/String;", "", "", "decode", "(Z)I", "compactBytes", "()I", "decodeEndOfInput", "(II)I", "", "updateCharset", "(Ljava/nio/charset/Charset;)V", "resetAll", "trimStringBuilder", "BUFFER_SIZE", "I", "Ljava/nio/charset/CharsetDecoder;", "decoder", "Ljava/nio/charset/CharsetDecoder;", "directEOL", "Z", "", "bytes", "[B", "", "chars", "[C", "Ljava/nio/ByteBuffer;", "byteBuf", "Ljava/nio/ByteBuffer;", "Ljava/nio/CharBuffer;", "charBuf", "Ljava/nio/CharBuffer;", "Ljava/lang/StringBuilder;", "Lkotlin/text/TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "sb", "Ljava/lang/StringBuilder;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LineReader {
    private static final int BUFFER_SIZE = 32;
    public static final LineReader INSTANCE;
    private static char TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static char b;
    private static final ByteBuffer byteBuf;
    private static final byte[] bytes;
    private static final CharBuffer charBuf;
    private static final char[] chars;
    private static CharsetDecoder decoder;
    private static boolean directEOL;
    private static final StringBuilder sb;
    private static final byte[] $$c = {81, -102, -70, -91};
    private static final int $$f = 131;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {111, 40, 23, -13, -9, -2, -7, -6, -10, -9, 40, -58, -3, -5, 10, 14, -32, -24, 10, -14, 50, -23, -51, -6, 1, -10, -5, -21, -4, 10, -26, 4, -13, -6, -12, 25, -21, -19, -13, -9, 0, 0, 28, -40, -24, 6, -1, -9, -40, 5, -18, 4, -13, -6, 23, -24, -31, 5, 1, -16, -13, 39, -51, 10, -13, -13, 1, -16, -13, -6, -4, 4, -5, -13, 1, -18, -4, -12, -5, -4, -12, 2, -6, -25, 6, -3, -25, 35, -41, 4, -8, -14, 1, -8, -8, -2, -27, 2, -15, 59};
    private static final int $$e = 70;
    private static final byte[] $$a = {39, 27, 2, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 224;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f1237a = 0;
    private static int asBinder = 1;
    private static int asInterface = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 52
            int r8 = 108 - r8
            byte[] r0 = kotlin.io.LineReader.$$a
            int r6 = r6 * 2
            int r6 = r6 + 84
            int r7 = r7 * 15
            int r1 = r7 + 38
            byte[] r1 = new byte[r1]
            int r7 = r7 + 37
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L32
        L18:
            r3 = r2
        L19:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L32:
            int r8 = r8 + 1
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.LineReader.c(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.io.LineReader.$$d
            int r8 = r8 * 8
            int r8 = 53 - r8
            int r7 = r7 * 31
            int r7 = 115 - r7
            int r6 = r6 * 44
            int r6 = 48 - r6
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r5 = r2
            r7 = r6
            goto L29
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r0[r6]
        L29:
            int r6 = r6 + 1
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-7)
            r3 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.LineReader.e(short, int, short, java.lang.Object[]):void");
    }

    private static void d(char[] cArr, int i, Object[] objArr) throws Throwable {
        CharSequence charSequence;
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        int i3 = $11 + 11;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (true) {
            int i5 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            char c = 1;
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i6 = 58224;
            int i7 = 0;
            while (i7 < 16) {
                int i8 = $10 + 35;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                char c2 = cArr3[c];
                char c3 = cArr3[i5];
                int i10 = (c3 + i6) ^ ((c3 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 8611973335120459638L)));
                int i11 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[c] = Integer.valueOf(i10);
                    objArr2[i5] = Integer.valueOf(c2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c4 = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 47773);
                        charSequence = "";
                        int offsetBefore = 468 - TextUtils.getOffsetBefore(charSequence, i5);
                        int i12 = 14 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        Class[] clsArr = new Class[4];
                        clsArr[i5] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c4, offsetBefore, i12, -2007001706, false, "o", clsArr);
                    } else {
                        charSequence = "";
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[c] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i5]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) b) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.lastIndexOf(charSequence, '0') + 47774), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 468, 13 - TextUtils.getCapsMode(charSequence, 0, 0), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    int i13 = $10 + 3;
                    $11 = i13 % 128;
                    if (i13 % 2 == 0) {
                        int i14 = 3 / 5;
                    }
                    c = 1;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] ^ cArr3[1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b2 = (byte) 0;
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) Color.alpha(0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2323, 43 - TextUtils.lastIndexOf("", '0'), -1312321721, false, $$g(b2, b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    private LineReader() {
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        INSTANCE = new LineReader();
        byte[] bArr = new byte[32];
        bytes = bArr;
        char[] cArr = new char[32];
        chars = cArr;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        Intrinsics.checkNotNullExpressionValue(byteBufferWrap, "");
        byteBuf = byteBufferWrap;
        CharBuffer charBufferWrap = CharBuffer.wrap(cArr);
        Intrinsics.checkNotNullExpressionValue(charBufferWrap, "");
        charBuf = charBufferWrap;
        sb = new StringBuilder();
        int i = asInterface + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
        if (i % 2 != 0) {
            int i2 = 57 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x04c7 A[Catch: all -> 0x0568, TryCatch #1 {, blocks: (B:45:0x0449, B:48:0x04b7, B:49:0x04bd, B:53:0x04cc, B:55:0x04d5, B:61:0x04e5, B:76:0x051c, B:79:0x0526, B:83:0x0530, B:85:0x053b, B:88:0x0544, B:90:0x055a, B:91:0x055d, B:62:0x04ea, B:66:0x04f7, B:70:0x04fe, B:72:0x050e, B:74:0x0516, B:94:0x0562, B:51:0x04c7), top: B:113:0x0449 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x052f  */
    public final String readLine(InputStream p0, Charset p1) throws Throwable {
        Object[] objArr;
        int iDecodeEndOfInput;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cMyTid = (char) (Process.myTid() >> 22);
            int iLastIndexOf = 2266 - TextUtils.lastIndexOf("", '0', 0, 0);
            int mode = View.MeasureSpec.getMode(0) + 33;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c(bArr[7], bArr[5], bArr[2], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyTid, iLastIndexOf, mode, -887667012, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        d(new char[]{49324, 52704, 48559, 64146, 58585, 5184, 48185, 24933, 42799, 4485, 26998, 26800, 30114, 35285, 16646, 6236, 5672, 47710, 59041, 46656, 40193, 20059, 50218, 64973}, (ViewConfiguration.getTapTimeout() >> 16) + 22, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        d(new char[]{21297, 54633, 7048, 38510, 8050, 36107, 11677, 20277, 65204, 4426, 6047, 58418, 30024, 27279, 52760, 53886, 26884, 59406}, 15 - TextUtils.indexOf("", "", 0, 0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
            int i = 2268 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            int iArgb = Color.argb(0, 0, 0, 0) + 33;
            byte[] bArr2 = $$a;
            byte b2 = bArr2[7];
            byte b3 = bArr2[5];
            Object[] objArr5 = new Object[1];
            c(b2, b3, b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, i, iArgb, -874156483, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 2268;
                int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 34;
                byte b4 = $$a[7];
                byte b5 = b4;
                Object[] objArr6 = new Object[1];
                c(b4, b5, b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, iIndexOf, iLastIndexOf2, -654680577, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i2 = ((int[]) objArr7[0])[0];
            int i3 = ((int[]) objArr7[3])[0];
            String[] strArr = (String[]) objArr7[1];
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = (((-1153688157) + (((~(67801563 | iIdentityHashCode)) | 808717860) * 576)) + (((~((~iIdentityHashCode) | 876519423)) | 67797019) * 576)) - 464499159;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[2])[0] = i6 ^ (i6 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            d(new char[]{56235, 31986, 22736, 17778, 64100, 2515, 16872, 50096, 58544, 14615, 31819, 17017, 227, 50906, 23469, 58495, 12860, 44660, 28590, 4283, 6005, 51109, 33502, 4276, 4237, 31902, 32313, 3654}, 25 - MotionEvent.axisFromString(""), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            d(new char[]{23460, 23437, 41093, 25742, 44130, 26584, 40308, 29068, 37635, 30898, 42862, 11659, 61010, 60522, 34869, 28243, 54414, 16356, 36015, 11518}, Color.red(0) + 18, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            d(new char[]{10414, 53294, 39408, 30239, 28191, 21458, 37803, 34821, 42336, 219, 48662, 59350, 42034, 63996, 46678, 3392, 35445, 6289}, 17 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            d(new char[]{19290, 13665, 10841, 59762, 65363, 59749, 30778, 28809, 46037, 27646, 4873, 35901, 43279, 50684, 16491, 15796, 52266, 64792}, 16 - (Process.myPid() >> 22), objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 1865448745};
                byte[] bArr3 = $$d;
                byte b6 = bArr3[24];
                Object[] objArr13 = new Object[1];
                e(b6, bArr3[40], b6, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b7 = bArr3[40];
                Object[] objArr14 = new Object[1];
                e(b7, bArr3[24], b7, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
                        int iLastIndexOf3 = 2266 - TextUtils.lastIndexOf("", '0', 0, 0);
                        int iArgb2 = 33 - Color.argb(0, 0, 0, 0);
                        byte b8 = $$a[7];
                        byte b9 = b8;
                        Object[] objArr16 = new Object[1];
                        c(b8, b9, b9, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf2, iLastIndexOf3, iArgb2, -654680577, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        d(new char[]{49324, 52704, 48559, 64146, 58585, 5184, 48185, 24933, 42799, 4485, 26998, 26800, 30114, 35285, 16646, 6236, 5672, 47710, 59041, 46656, 40193, 20059, 50218, 64973}, TextUtils.getOffsetAfter("", 0) + 22, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        d(new char[]{21297, 54633, 7048, 38510, 8050, 36107, 11677, 20277, 65204, 4426, 6047, 58418, 30024, 27279, 52760, 53886, 26884, 59406}, 15 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cGreen = (char) Color.green(0);
                            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 2267;
                            int offsetBefore = 33 - TextUtils.getOffsetBefore("", 0);
                            byte[] bArr4 = $$a;
                            byte b10 = bArr4[7];
                            byte b11 = bArr4[5];
                            Object[] objArr19 = new Object[1];
                            c(b10, b11, b11, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cGreen, absoluteGravity, offsetBefore, -874156483, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                            int iGreen = Color.green(0) + 2267;
                            int iAlpha = Color.alpha(0) + 33;
                            byte[] bArr5 = $$a;
                            Object[] objArr20 = new Object[1];
                            c(bArr5[7], bArr5[5], bArr5[2], objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(longPressTimeout, iGreen, iAlpha, -887667012, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i7 = ((int[]) objArr[3])[0];
        int i8 = ((int[]) objArr[0])[0];
        if (i8 == i7) {
            Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i9 = ((int[]) objArr[2])[0];
            int i10 = ((int[]) objArr[0])[0];
            int i11 = ((int[]) objArr[3])[0];
            String[] strArr2 = (String[]) objArr[1];
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i12 = ~elapsedCpuTime;
            int i13 = i9 + ((((~((-12607489) | i12)) | (~(805042003 | elapsedCpuTime))) * 988) - 1577289005) + (((~(elapsedCpuTime | (-16278801))) | 3671312 | (~(i12 | 805042003))) * 988);
            int i14 = (i13 << 13) ^ i13;
            int i15 = i14 ^ (i14 >>> 17);
            ((int[]) objArr21[2])[0] = i15 ^ (i15 << 5);
            synchronized (this) {
                Intrinsics.checkNotNullParameter(p0, "");
                int i16 = ((int[]) objArr21[2])[0];
                int i17 = i16 * i16;
                int i18 = -(90887178 * i16);
                int i19 = ((((i17 | i18) << 1) - (i17 ^ i18)) - (~(-(i16 * (-1434938838))))) - 1;
                int i20 = (i19 & 1614896804) + (1614896804 | i19);
                int i21 = i20 >> 29;
                int i22 = ((i21 ^ (-15)) + ((i21 & (-15)) << 1)) / 8;
                int i23 = (i20 - (~((i22 & 1) + (i22 | 1)))) - 1;
                int i24 = ((i20 >> 18) - 32767) / 16384;
                int i25 = -(i23 ^ ((i24 & 1) + (i24 | 1)));
                int i26 = (i25 & 7) + (i25 | 7);
                int i27 = i26 >> 26;
                Intrinsics.checkNotNullParameter(p1, "27,charset".substring(6594 / (((-((((i27 & ComposerKt.defaultsKey) + (i27 | ComposerKt.defaultsKey)) / 64) + 2)) & i26) * 314)));
                CharsetDecoder charsetDecoder = decoder;
                if (charsetDecoder == null) {
                    updateCharset(p1);
                } else {
                    if (charsetDecoder == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        charsetDecoder = null;
                    }
                    if (!Intrinsics.areEqual(charsetDecoder.charset(), p1)) {
                        updateCharset(p1);
                    }
                }
                int iCompactBytes = 0;
                int iDecode = 0;
                while (true) {
                    int i28 = p0.read();
                    if (i28 == -1) {
                        if (sb.length() != 0 || iCompactBytes != 0 || iDecode != 0) {
                            iDecodeEndOfInput = decodeEndOfInput(iCompactBytes, iDecode);
                            break;
                        }
                        return null;
                    }
                    int i29 = iCompactBytes + 1;
                    bytes[iCompactBytes] = (byte) i28;
                    if (i28 == 10 || i29 == 32 || !directEOL) {
                        ByteBuffer byteBuffer = byteBuf;
                        byteBuffer.limit(i29);
                        charBuf.position(iDecode);
                        iDecode = decode(false);
                        if (iDecode > 0 && chars[iDecode - 1] == '\n') {
                            byteBuffer.position(0);
                            iDecodeEndOfInput = iDecode;
                            break;
                        }
                        iCompactBytes = compactBytes();
                    } else {
                        iCompactBytes = i29;
                    }
                }
                if (iDecodeEndOfInput > 0) {
                    char[] cArr = chars;
                    int i30 = iDecodeEndOfInput - 1;
                    if (cArr[i30] == '\n') {
                        if (i30 > 0) {
                            iDecodeEndOfInput -= 2;
                            if (cArr[iDecodeEndOfInput] != '\r') {
                                iDecodeEndOfInput = i30;
                            }
                        } else {
                            iDecodeEndOfInput = i30;
                        }
                    }
                }
                StringBuilder sb2 = sb;
                if (sb2.length() == 0) {
                    return new String(chars, 0, iDecodeEndOfInput);
                }
                sb2.append(chars, 0, iDecodeEndOfInput);
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                if (sb2.length() > 32) {
                    trimStringBuilder();
                }
                sb2.setLength(0);
                return string;
            }
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr3 = (String[]) objArr[1];
        if (strArr3 != null) {
            for (String str : strArr3) {
                arrayList.add(str);
            }
        }
        throw new RuntimeException(String.valueOf(i8));
    }

    private final int decode(boolean p0) throws CharacterCodingException {
        int i = 2 % 2;
        while (true) {
            CharsetDecoder charsetDecoder = decoder;
            if (charsetDecoder == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                charsetDecoder = null;
            }
            ByteBuffer byteBuffer = byteBuf;
            CharBuffer charBuffer = charBuf;
            CoderResult coderResultDecode = charsetDecoder.decode(byteBuffer, charBuffer, p0);
            Intrinsics.checkNotNullExpressionValue(coderResultDecode, "");
            if (coderResultDecode.isError()) {
                int i2 = asBinder + 1;
                f1237a = i2 % 128;
                int i3 = i2 % 2;
                resetAll();
                coderResultDecode.throwException();
            }
            int iPosition = charBuffer.position();
            if (!coderResultDecode.isOverflow()) {
                int i4 = f1237a + 73;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                return iPosition;
            }
            StringBuilder sb2 = sb;
            char[] cArr = chars;
            int i6 = iPosition - 1;
            sb2.append(cArr, 0, i6);
            charBuffer.position(0);
            charBuffer.limit(32);
            charBuffer.put(cArr[i6]);
        }
    }

    private final int compactBytes() {
        int i = 2 % 2;
        int i2 = asBinder + 11;
        f1237a = i2 % 128;
        int i3 = i2 % 2;
        ByteBuffer byteBuffer = byteBuf;
        byteBuffer.compact();
        int iPosition = byteBuffer.position();
        byteBuffer.position(0);
        int i4 = asBinder + 91;
        f1237a = i4 % 128;
        int i5 = i4 % 2;
        return iPosition;
    }

    private final int decodeEndOfInput(int p0, int p1) throws CharacterCodingException {
        int i = 2 % 2;
        int i2 = f1237a + 43;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ByteBuffer byteBuffer = byteBuf;
        byteBuffer.limit(p0);
        charBuf.position(p1);
        int iDecode = decode(true);
        CharsetDecoder charsetDecoder = decoder;
        if (charsetDecoder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = asBinder + 65;
            f1237a = i4 % 128;
            int i5 = i4 % 2;
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        byteBuffer.position(0);
        return iDecode;
    }

    private final void updateCharset(Charset p0) {
        int i = 2 % 2;
        int i2 = asBinder + 77;
        f1237a = i2 % 128;
        int i3 = i2 % 2;
        CharsetDecoder charsetDecoderNewDecoder = p0.newDecoder();
        Intrinsics.checkNotNullExpressionValue(charsetDecoderNewDecoder, "");
        decoder = charsetDecoderNewDecoder;
        ByteBuffer byteBuffer = byteBuf;
        byteBuffer.clear();
        CharBuffer charBuffer = charBuf;
        charBuffer.clear();
        byteBuffer.put((byte) 10);
        byteBuffer.flip();
        CharsetDecoder charsetDecoder = decoder;
        boolean z = false;
        if (charsetDecoder == null) {
            int i4 = asBinder + 21;
            f1237a = i4 % 128;
            if (i4 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i5 = 13 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            charsetDecoder = null;
        }
        charsetDecoder.decode(byteBuffer, charBuffer, false);
        if (charBuffer.position() == 1 && charBuffer.get(0) == '\n') {
            int i6 = asBinder + 125;
            f1237a = i6 % 128;
            if (i6 % 2 == 0) {
                z = true;
            }
        }
        directEOL = z;
        resetAll();
    }

    private final void resetAll() {
        int i = 2 % 2;
        CharsetDecoder charsetDecoder = decoder;
        if (charsetDecoder == null) {
            int i2 = asBinder + 3;
            f1237a = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i3 = 38 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        byteBuf.position(0);
        sb.setLength(0);
        int i4 = asBinder + 95;
        f1237a = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void trimStringBuilder() {
        StringBuilder sb2;
        int i = 2 % 2;
        int i2 = asBinder + 55;
        f1237a = i2 % 128;
        if (i2 % 2 != 0) {
            sb2 = sb;
            sb2.setLength(5);
        } else {
            sb2 = sb;
            sb2.setLength(32);
        }
        sb2.trimToSize();
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        b = (char) 55043;
        TuitionPaymentFragmentbindingInflater1 = (char) 45783;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (char) 959;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (char) 27903;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r5, int r6, int r7) {
        /*
            int r7 = r7 * 3
            int r0 = 1 - r7
            int r5 = r5 * 2
            int r5 = 108 - r5
            int r6 = r6 * 3
            int r6 = r6 + 4
            byte[] r1 = kotlin.io.LineReader.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L18
            r4 = r7
            r3 = r2
            goto L28
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L24:
            int r3 = r3 + 1
            r4 = r1[r6]
        L28:
            int r6 = r6 + 1
            int r5 = r5 + r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.LineReader.$$g(byte, int, int):java.lang.String");
    }
}
