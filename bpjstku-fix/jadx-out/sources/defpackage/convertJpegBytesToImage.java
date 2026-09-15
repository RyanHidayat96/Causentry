package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.exifinterface.media.ExifInterface;
import com.datadog.android.api.InternalLogger;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0010\u0018\u0000 \u0018*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0018B;\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\r8\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0015\u001a\u00020\u000b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001dR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"LconvertJpegBytesToImage;", "", ExifInterface.GPS_DIRECTION_TRUE, "LImageCaptureMetadata;", "LImageCaptureOutputFileOptionsBuilder;", "p0", "LImageReaderFormatRecommender;", "p1", "LImageCaptureCapabilities;", "", "p2", "Lcom/datadog/android/api/InternalLogger;", "p3", "LgetSaveCollection;", "p4", "<init>", "(LImageCaptureOutputFileOptionsBuilder;LImageReaderFormatRecommender;LImageCaptureCapabilities;Lcom/datadog/android/api/InternalLogger;LgetSaveCollection;)V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/lang/Object;)V", "", "b", "([B)Z", "LImageCaptureOutputFileOptionsBuilder;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentbindingInflater1", "LgetSaveCollection;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LImageCaptureCapabilities;", "Lcom/datadog/android/api/InternalLogger;", "a", "LImageReaderFormatRecommender;"}, k = 1, mv = {1, 7, 0}, xi = 48)
public class convertJpegBytesToImage<T> implements ImageCaptureMetadata<T> {
    private static char asBinder;
    private static int d;
    private static long g;
    private static int onTransact;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final getSaveCollection TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final ImageCaptureCapabilities<byte[]> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final InternalLogger b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ImageReaderFormatRecommender<T> TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ImageCaptureOutputFileOptionsBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final byte[] $$c = {81, -102, -70, -91};
    private static final int $$f = 30;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {82, Base64.padSymbol, -66, -42, -15, -1, 60, -73, 15, -22, 3, -2, -4, -1, -5, 62, -75, 10, 1, -21, 4, 12, -9, -1, -16, 11, -14, -8, -2, 7, -8, 7, -8, 3, -1, -22, 2, -6, 65, -25, -46, -8, -2, 39, -40, 7, -8, 3, -1, -22, 2, -6, 75, -51, -36, 9, -14, 8, -9, -2, 27, -20, -27, 9, 5, -12, -9, 43, -47, 14, -9, -9, 5, -12, -9, -2, 0, 8, -1, -9, 5, -14, 0, -8, -1, 0, -8, 6, -2, -21, 10, 1, -21, 39, -37, 8, -4, -10, 5, -4, -4, 2, -23, 6, -11, 63, -36, 9, -14, 8, -9, -2, 27, -20, -27, 9, 5, -12, -9, 43, -47, 14, -9, -9, 5, -12, -9, -2, 0, 8, -1, -9, 5, -14, 0, -8, -1, 0, -8, 6, -2, -21, 10, 1, -21, 39, -37, 8, -4, -10, 5, -4, -4, 2, -23, 6, -11, 62, -15, -4, -12, 48, -38, -6, 4, 14, -30, 29, -41, -2, 1, -8, -2, 30, -36, -1, 10, 1, -15};
    private static final int $$e = 144;
    private static final byte[] $$a = {112, 19, -59, 97, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 2;
    private static int cancelAll = 0;
    private static int notify = 1;
    private static int asInterface = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            int r5 = 145 - r5
            byte[] r0 = defpackage.convertJpegBytesToImage.$$a
            int r1 = 53 - r7
            int r6 = r6 * 14
            int r6 = r6 + 84
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r5
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            int r3 = r3 + 1
            r4 = r0[r5]
        L26:
            int r5 = r5 + 1
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.convertJpegBytesToImage.c(short, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(byte r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 15
            int r8 = r8 + 84
            byte[] r0 = defpackage.convertJpegBytesToImage.$$d
            int r7 = r7 * 2
            int r7 = r7 + 4
            int r6 = r6 + 22
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r6
            r8 = r7
            r4 = r2
            goto L27
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r0[r7]
        L27:
            int r7 = r7 + 1
            int r3 = -r3
            int r8 = r8 + r3
            int r8 = r8 + (-3)
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.convertJpegBytesToImage.f(byte, int, int, java.lang.Object[]):void");
    }

    public convertJpegBytesToImage(ImageCaptureOutputFileOptionsBuilder imageCaptureOutputFileOptionsBuilder, ImageReaderFormatRecommender<T> imageReaderFormatRecommender, ImageCaptureCapabilities<byte[]> imageCaptureCapabilities, InternalLogger internalLogger, getSaveCollection getsavecollection) {
        Intrinsics.checkNotNullParameter(imageCaptureOutputFileOptionsBuilder, "");
        Intrinsics.checkNotNullParameter(imageReaderFormatRecommender, "");
        Intrinsics.checkNotNullParameter(imageCaptureCapabilities, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        Intrinsics.checkNotNullParameter(getsavecollection, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = imageCaptureOutputFileOptionsBuilder;
        this.TuitionPaymentFragmentbindingInflater1 = imageReaderFormatRecommender;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = imageCaptureCapabilities;
        this.b = internalLogger;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getsavecollection;
    }

    private static void e(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        char c2;
        int i2 = 2 % 2;
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
            int i3 = $10 + 91;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (8329 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), Color.blue(0) + 1235, 35 - Drawable.resolveOpacity(0, 0), -653973969, false, $$g(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 + 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getEdgeSlop() >> 16), 2764 - ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getWindowTouchSlop() >> 8) + 14, 1504416861, false, $$g(b3, b4, (byte) (b4 - 2)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 43326), 254 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), Color.green(0) + 22, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char keyRepeatTimeout = (char) (65200 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                    int maxKeyCode = 2891 - (KeyEvent.getMaxKeyCode() >> 16);
                    int size = 17 - View.MeasureSpec.getSize(0);
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 + 1);
                    String str$$g = $$g(b5, b6, (byte) (b6 - 1));
                    c2 = 2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(keyRepeatTimeout, maxKeyCode, size, 2012627446, false, str$$g, new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    c2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (g ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) d) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) asBinder) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                int i5 = $11 + 83;
                $10 = i5 % 128;
                int i6 = i5 % 2;
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

    /* JADX WARN: Code duplicated, block: B:22:0x0263  */
    /* JADX WARN: Code duplicated, block: B:63:0x07cd  */
    /* JADX WARN: Type inference failed for: r7v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v4, types: [boolean, int] */
    private final boolean b(byte[] p0) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        int i2 = notify + 59;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
            int minimumFlingVelocity = 876 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 10;
            byte b = $$a[7];
            Object[] objArr3 = new Object[1];
            c((short) 141, b, (byte) (b | 15), objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cNormalizeMetaState, minimumFlingVelocity, keyRepeatDelay, -1650998592, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{12377, 44268, 17142, 22420}, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{56692, 16463, 56885, 44125, 45777, 43431, 8460, 6999, 45166, 8838, 52388, 47346, 4018, 35459, 6809, 40135, 47768, 38584, 52399, 41784, 27980, 569}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{17584, 31528, 13680, 1459}, (char) (45877 - Color.alpha(0)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1887119428, new char[]{12397, 51516, 56789, 10734, 44474, 415, 38000, 6141, 62294, 29949, 47432, 1213, 14906, 59716, 34954}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
            int mirror = 924 - AndroidCharacter.getMirror('0');
            int iMyTid = 10 - (Process.myTid() >> 22);
            byte b2 = $$a[7];
            Object[] objArr6 = new Object[1];
            c((short) 104, b2, b2, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(absoluteGravity, mirror, iMyTid, 2012020043, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = notify + 27;
            cancelAll = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 876;
                int iIndexOf = 9 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                byte b3 = $$a[7];
                Object[] objArr7 = new Object[1];
                c((short) 52, b3, b3, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, iCombineMeasuredStates, iIndexOf, 2012931276, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
            int i6 = ~((int) Process.getStartUptimeMillis());
            int i7 = (((-143718028) + ((518985727 | i6) * 184)) + (((~(i6 | 281876415)) | 514528853) * 184)) - 1808312282;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{23863, 10936, 2506, 35626}, (char) (10761 - (ViewConfiguration.getFadingEdgeLength() >> 16)), ViewConfiguration.getEdgeSlop() >> 16, new char[]{2782, 63844, 44359, 7509, 36174, 56334, 8948, 20745, 48540, 49975, 32272, 41095, 8053, 45864, 4128, 64249, 22850, 4968, 7738, 3215, 32965, 4192, 20828, 59139, 7068, 54691}, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{10143, 51822, 18192, 42484}, (char) (62535 - TextUtils.getTrimmedLength("")), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, new char[]{61988, 54732, 22459, 61572, 21228, 50864, 2999, 60868, 50096, 40008, 46707, 25673, 2394, 27290, 48565, 22126, 18067, 38800}, objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    applicationContext = applicationContext.getApplicationContext();
                } else {
                    int i10 = cancelAll + 51;
                    notify = i10 % 128;
                    int i11 = i10 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                }
            }
            Object[] objArr11 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{26372, 8629, 16703, 3167}, (char) (24385 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), KeyEvent.keyCodeFromString(""), new char[]{25891, 64018, 1529, 7916, 46397, 23517, 56388, 14536, 5482, 5576, 32485, 40800, 43293, 22289, 33413, 47145}, objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{63458, 9651, 12925, 61454}, (char) (3634 - (ViewConfiguration.getFadingEdgeLength() >> 16)), ViewConfiguration.getMaximumDrawingCacheSize() >> 24, new char[]{18858, 22020, 49714, 55431, 31076, 16820, 64966, 10267, 25385, 65339, 38561, 1960, 29611, 52420, 49031, 9481}, objArr12);
            try {
                Object[] objArr13 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue()), 0, -1808312282};
                byte[] bArr = $$d;
                Object[] objArr14 = new Object[1];
                f((byte) (bArr[0] - 1), bArr[76], bArr[18], objArr14);
                Class<?> cls4 = Class.forName((String) objArr14[0]);
                Object[] objArr15 = new Object[1];
                f((byte) (bArr[173] + 1), (byte) (-bArr[53]), bArr[76], objArr15);
                objArr = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c2 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 876;
                        int iLastIndexOf = 9 - TextUtils.lastIndexOf("", '0', 0, 0);
                        byte b4 = $$a[7];
                        Object[] objArr16 = new Object[1];
                        c((short) 52, b4, b4, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, keyRepeatTimeout, iLastIndexOf, 2012931276, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr17 = new Object[1];
                        e(new char[]{0, 0, 0, 0}, new char[]{12377, 44268, 17142, 22420}, (char) Color.green(0), Color.green(0), new char[]{56692, 16463, 56885, 44125, 45777, 43431, 8460, 6999, 45166, 8838, 52388, 47346, 4018, 35459, 6809, 40135, 47768, 38584, 52399, 41784, 27980, 569}, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        e(new char[]{0, 0, 0, 0}, new char[]{17584, 31528, 13680, 1459}, (char) (45876 - Process.getGidForName("")), 1887119428 - TextUtils.getOffsetAfter("", 0), new char[]{12397, 51516, 56789, 10734, 44474, 415, 38000, 6141, 62294, 29949, 47432, 1213, 14906, 59716, 34954}, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c3 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 876;
                            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 10;
                            byte b5 = $$a[7];
                            Object[] objArr19 = new Object[1];
                            c((short) 104, b5, b5, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c3, pressedStateDuration, scrollBarSize, 2012020043, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                            int tapTimeout = 876 - (ViewConfiguration.getTapTimeout() >> 16);
                            int iResolveSize = View.resolveSize(0, 0) + 10;
                            byte b6 = $$a[7];
                            Object[] objArr20 = new Object[1];
                            c((short) 141, b6, (byte) (b6 | 15), objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(offsetAfter, tapTimeout, iResolveSize, -1650998592, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i12 = ((int[]) objArr[2])[0];
        int i13 = ((int[]) objArr[0])[0];
        if (i13 != i12) {
            throw new RuntimeException(String.valueOf(i13));
        }
        int i14 = ((int[]) objArr[1])[0];
        Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i15 = ~iIdentityHashCode;
        int i16 = i14 + (-1737680942) + (((~((-2100147) | i15)) | 386) * (-108)) + (((~(i15 | 42410375)) | (~((-42410376) | iIdentityHashCode)) | (-44510136)) * 54) + ((iIdentityHashCode | (-44510136)) * 54);
        int i17 = (i16 << 13) ^ i16;
        int i18 = i17 ^ (i17 >>> 17);
        ((int[]) objArr21[1])[0] = i18 ^ (i18 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char c4 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 31532);
            int iResolveSizeAndState = 921 - View.resolveSizeAndState(0, 0, 0);
            int keyRepeatDelay2 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 28;
            byte[] bArr2 = $$a;
            Object[] objArr22 = new Object[1];
            c(bArr2[7], bArr2[5], (byte) 52, objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c4, iResolveSizeAndState, keyRepeatDelay2, -1048449946, false, (String) objArr22[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr23 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{12377, 44268, 17142, 22420}, (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), Gravity.getAbsoluteGravity(0, 0), new char[]{56692, 16463, 56885, 44125, 45777, 43431, 8460, 6999, 45166, 8838, 52388, 47346, 4018, 35459, 6809, 40135, 47768, 38584, 52399, 41784, 27980, 569}, objArr23);
        Class<?> cls6 = Class.forName((String) objArr23[0]);
        Object[] objArr24 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{17584, 31528, 13680, 1459}, (char) (45877 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 1887119428 - (ViewConfiguration.getWindowTouchSlop() >> 8), new char[]{12397, 51516, 56789, 10734, 44474, 415, 38000, 6141, 62294, 29949, 47432, 1213, 14906, 59716, 34954}, objArr24);
        long jLongValue3 = ((Long) cls6.getDeclaredMethod((String) objArr24[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char tapTimeout2 = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 31533);
            int iIndexOf2 = TextUtils.indexOf("", "") + 921;
            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 28;
            byte b7 = $$a[7];
            Object[] objArr25 = new Object[1];
            c((short) 104, b7, b7, objArr25);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(tapTimeout2, iIndexOf2, offsetBefore, -778300370, false, (String) objArr25[0], null);
        }
        if (j2 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char cNormalizeMetaState2 = (char) (31533 - KeyEvent.normalizeMetaState(0));
                int iIndexOf3 = TextUtils.indexOf("", "", 0) + 921;
                int iMyPid = (Process.myPid() >> 22) + 28;
                byte b8 = $$a[7];
                Object[] objArr26 = new Object[1];
                c((short) 141, b8, (byte) (b8 | 15), objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cNormalizeMetaState2, iIndexOf3, iMyPid, -1142834547, false, (String) objArr26[0], null);
            }
            Object[] objArr27 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr27[1])[0]}, (Object[]) objArr27[2], new int[]{((int[]) objArr27[3])[0]}, (String[]) objArr27[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i19 = ~iIdentityHashCode2;
            int i20 = (~((-1040140821) | i19)) | 700383236;
            int i21 = ~(iIdentityHashCode2 | 1073696407);
            int i22 = ((((i20 | i21) * (-252)) - 2117971317) + ((i21 | (~(i19 | (-339757585)))) * 252)) - 1155350067;
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr2[0])[0] = i24 ^ (i24 << 5);
        } else {
            Object[] objArr28 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{23863, 10936, 2506, 35626}, (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 10761), ViewConfiguration.getWindowTouchSlop() >> 8, new char[]{2782, 63844, 44359, 7509, 36174, 56334, 8948, 20745, 48540, 49975, 32272, 41095, 8053, 45864, 4128, 64249, 22850, 4968, 7738, 3215, 32965, 4192, 20828, 59139, 7068, 54691}, objArr28);
            Class<?> cls7 = Class.forName((String) objArr28[0]);
            Object[] objArr29 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{10143, 51822, 18192, 42484}, (char) (62535 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), MotionEvent.axisFromString("") + 1, new char[]{61988, 54732, 22459, 61572, 21228, 50864, 2999, 60868, 50096, 40008, 46707, 25673, 2394, 27290, 48565, 22126, 18067, 38800}, objArr29);
            Context applicationContext2 = (Context) cls7.getMethod((String) objArr29[0], new Class[0]).invoke(null, null);
            if (applicationContext2 != null) {
                if (applicationContext2 instanceof ContextWrapper) {
                    int i25 = notify + 61;
                    cancelAll = i25 % 128;
                    int i26 = i25 % 2;
                    if (((ContextWrapper) applicationContext2).getBaseContext() != null) {
                        applicationContext2 = applicationContext2.getApplicationContext();
                    } else {
                        int i27 = notify + 81;
                        cancelAll = i27 % 128;
                        int i28 = i27 % 2;
                        applicationContext2 = null;
                    }
                } else {
                    applicationContext2 = applicationContext2.getApplicationContext();
                }
            }
            Object[] objArr30 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{26372, 8629, 16703, 3167}, (char) (24385 - ((Process.getThreadPriority(0) + 20) >> 6)), (-1) - TextUtils.lastIndexOf("", '0', 0, 0), new char[]{25891, 64018, 1529, 7916, 46397, 23517, 56388, 14536, 5482, 5576, 32485, 40800, 43293, 22289, 33413, 47145}, objArr30);
            Class<?> cls8 = Class.forName((String) objArr30[0]);
            Object[] objArr31 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{63458, 9651, 12925, 61454}, (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 3634), (-1) - ((byte) KeyEvent.getModifierMetaStateMask()), new char[]{18858, 22020, 49714, 55431, 31076, 16820, 64966, 10267, 25385, 65339, 38561, 1960, 29611, 52420, 49031, 9481}, objArr31);
            Object[] objArr32 = {applicationContext2, Integer.valueOf(((Integer) cls8.getMethod((String) objArr31[0], Object.class).invoke(null, this)).intValue()), 0, -1155350067};
            byte[] bArr3 = $$d;
            byte b9 = bArr3[76];
            Object[] objArr33 = new Object[1];
            f(b9, (byte) (b9 | 77), bArr3[18], objArr33);
            Class<?> cls9 = Class.forName((String) objArr33[0]);
            Object[] objArr34 = new Object[1];
            f((byte) (bArr3[173] + 1), (byte) (-bArr3[53]), bArr3[76], objArr34);
            objArr2 = (Object[]) cls9.getMethod((String) objArr34[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr32);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char c5 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 31532);
                int tapTimeout3 = (ViewConfiguration.getTapTimeout() >> 16) + 921;
                int i29 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28;
                byte b10 = $$a[7];
                Object[] objArr35 = new Object[1];
                c((short) 141, b10, (byte) (b10 | 15), objArr35);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c5, tapTimeout3, i29, -1142834547, false, (String) objArr35[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, objArr2);
            try {
                Object[] objArr36 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{12377, 44268, 17142, 22420}, (char) Color.red(0), ViewConfiguration.getFadingEdgeLength() >> 16, new char[]{56692, 16463, 56885, 44125, 45777, 43431, 8460, 6999, 45166, 8838, 52388, 47346, 4018, 35459, 6809, 40135, 47768, 38584, 52399, 41784, 27980, 569}, objArr36);
                Class<?> cls10 = Class.forName((String) objArr36[0]);
                Object[] objArr37 = new Object[1];
                e(new char[]{0, 0, 0, 0}, new char[]{17584, 31528, 13680, 1459}, (char) (View.MeasureSpec.getMode(0) + 45877), 1887119428 - TextUtils.getCapsMode("", 0, 0), new char[]{12397, 51516, 56789, 10734, 44474, 415, 38000, 6141, 62294, 29949, 47432, 1213, 14906, 59716, 34954}, objArr37);
                long jLongValue4 = ((Long) cls10.getDeclaredMethod((String) objArr37[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue4);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                    char c6 = (char) (31534 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                    int trimmedLength = 921 - TextUtils.getTrimmedLength("");
                    int maxKeyCode = 28 - (KeyEvent.getMaxKeyCode() >> 16);
                    byte b11 = $$a[7];
                    Object[] objArr38 = new Object[1];
                    c((short) 104, b11, b11, objArr38);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(c6, trimmedLength, maxKeyCode, -778300370, false, (String) objArr38[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue4 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                    char maximumDrawingCacheSize = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 31533);
                    int size = 921 - View.MeasureSpec.getSize(0);
                    int fadingEdgeLength = 28 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    byte[] bArr4 = $$a;
                    Object[] objArr39 = new Object[1];
                    c(bArr4[7], bArr4[5], (byte) 52, objArr39);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(maximumDrawingCacheSize, size, fadingEdgeLength, -1048449946, false, (String) objArr39[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr2[3])[0] != ((int[]) objArr2[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr2[4];
            if (strArr != null) {
                int i30 = cancelAll + 29;
                notify = i30 % 128;
                int i31 = i30 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            throw null;
        }
        int i32 = ((int[]) objArr2[0])[0];
        Object[] objArr40 = {new int[1], new int[]{((int[]) objArr2[1])[0]}, (Object[]) objArr2[2], new int[]{((int[]) objArr2[3])[0]}, (String[]) objArr2[4]};
        int iIdentityHashCode3 = System.identityHashCode(this);
        int i33 = ~iIdentityHashCode3;
        int i34 = i32 + 1228748158 + (((~((-439849392) | i33)) | (-1334230253)) * (-865)) + ((~(iIdentityHashCode3 | 439849391)) * 865) + (((~((-1334230253) | i33)) | (~(i33 | 439849391))) * 865);
        int i35 = (i34 << 13) ^ i34;
        int i36 = i35 ^ (i35 >>> 17);
        ((int[]) objArr40[0])[0] = i36 ^ (i36 << 5);
        final int length = p0.length;
        if (length > this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.USER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.core.internal.persistence.file.single.SingleItemDataWriter$checkEventSize$1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    String str2 = String.format(Locale.US, "Can't write data with size %d (max item size is %d)", Arrays.copyOf(new Object[]{Integer.valueOf(length), Long.valueOf(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3)}, 2));
                    Intrinsics.checkNotNullExpressionValue(str2, "");
                    return str2;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, null, false, null);
            return false;
        }
        File fileTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(false);
        if (fileTuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            int i37 = ((int[]) objArr21[1])[0];
            int i38 = i37 * i37;
            int i39 = -(265647659 * i37);
            int i40 = (i38 ^ i39) + ((i38 & i39) << 1);
            int i41 = -(i37 * (-1211489441));
            int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
            int i43 = ((i42 | 677416857) << 1) - (677416857 ^ i42);
            int i44 = i43 >> 28;
            int i45 = ((i44 ^ (-31)) + ((i44 & (-31)) << 1)) / 16;
            int i46 = (i43 - (~(((i45 | 1) << 1) - (i45 ^ 1)))) - 1;
            int i47 = ((i43 >> 24) - 511) / 256;
            int i48 = -(i46 ^ ((i47 ^ 1) + ((i47 & 1) << 1)));
            int i49 = (i48 ^ 6) + ((i48 & 6) << 1);
            int i50 = i49 >> 19;
            int i51 = ((i50 ^ (-16383)) + ((i50 & (-16383)) << 1)) / 8192;
            int i52 = ((i51 | 1) << 1) - (i51 ^ 1);
            return 0 / (((-(((i52 | 1) << 1) - (i52 ^ 1))) & i49) * 360);
        }
        ImageCaptureCapabilities<byte[]> imageCaptureCapabilities = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i53 = ((int[]) objArr40[0])[0];
        int i54 = i53 * i53;
        int i55 = -(1139164965 * i53);
        int i56 = ((i54 | i55) << 1) - (i54 ^ i55);
        int i57 = -(i53 * (-778820853));
        int i58 = ((i56 & i57) + (i57 | i56)) - (-1349710400);
        int i59 = i58 >> 17;
        int i60 = (((-65535) ^ i59) + ((i59 & (-65535)) << 1)) / 32768;
        int i61 = ((i60 | 1) << 1) - (i60 ^ 1);
        int i62 = (i58 ^ i61) + ((i61 & i58) << 1);
        int i63 = i58 >> 27;
        int i64 = -(i62 ^ (((((i63 | (-63)) << 1) - (i63 ^ (-63))) / 32) + 1));
        int i65 = (i64 ^ 5) + ((i64 & 5) << 1);
        int i66 = ((i65 >> 17) - 65535) / 32768;
        int i67 = (i66 ^ 1) + ((i66 & 1) << 1);
        return imageCaptureCapabilities.b(fileTuitionPaymentFragmentspecialinlinedviewModeldefault1, p0, 0 / (((-(((i67 | 1) << 1) - (1 ^ i67))) & i65) * 375));
    }

    @Override // defpackage.ImageCaptureMetadata
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(T p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ImmutableImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, p0, this.b);
        if (bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            synchronized (this) {
                b(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        }
    }

    static {
        onTransact = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        INSTANCE = new Companion(null);
        int i = asInterface + 85;
        onTransact = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        g = -6377398940819159759L;
        d = -981105359;
        asBinder = (char) 32485;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, byte r7, short r8) {
        /*
            int r6 = r6 * 4
            int r6 = 3 - r6
            int r8 = r8 * 2
            int r0 = r8 + 1
            int r7 = r7 + 102
            byte[] r1 = defpackage.convertJpegBytesToImage.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r7 = r6
            r4 = r8
            r3 = r2
            goto L2a
        L15:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            int r7 = r7 + 1
            r4 = r1[r7]
            int r3 = r3 + 1
        L2a:
            int r4 = -r4
            int r6 = r6 + r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.convertJpegBytesToImage.$$g(byte, byte, short):java.lang.String");
    }
}
