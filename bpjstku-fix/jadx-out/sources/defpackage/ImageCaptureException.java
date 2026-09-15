package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import androidx.exifinterface.media.ExifInterface;
import com.datadog.android.api.InternalLogger;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\b\u0010\tJ'\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"LImageCaptureException;", "LgetImageCaptureError;", "Lcom/datadog/android/api/InternalLogger;", "p0", "<init>", "(Lcom/datadog/android/api/InternalLogger;)V", "Ljava/io/File;", "", "TuitionPaymentFragmentbindingInflater1", "(Ljava/io/File;)[B", "p1", "", "p2", "b", "(Ljava/io/File;[BZ)Z", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/datadog/android/api/InternalLogger;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3_"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class ImageCaptureException implements getImageCaptureError {
    private static final byte[] b = new byte[0];

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final InternalLogger TuitionPaymentFragmentbindingInflater1;

    public ImageCaptureException(InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(internalLogger, "");
        this.TuitionPaymentFragmentbindingInflater1 = internalLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // defpackage.ImageCaptureOutputFormat
    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
    public byte[] b(final File p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        try {
            if (p0.exists()) {
                if (!p0.isDirectory()) {
                    return FilesKt.readBytes(p0);
                }
                this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.core.internal.persistence.file.PlainFileReaderWriter$readData$2
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        String str = String.format(Locale.US, "Unable to read data from file: %s", Arrays.copyOf(new Object[]{p0.getPath()}, 1));
                        Intrinsics.checkNotNullExpressionValue(str, "");
                        return str;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                }, null, false, null);
                return b;
            }
            this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.core.internal.persistence.file.PlainFileReaderWriter$readData$1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    String str = String.format(Locale.US, "Unable to read data from file: %s", Arrays.copyOf(new Object[]{p0.getPath()}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    return str;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, null, false, null);
            return b;
        } catch (IOException e2) {
            this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.core.internal.persistence.file.PlainFileReaderWriter$readData$3
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    String str = String.format(Locale.US, "Unable to read data from file: %s", Arrays.copyOf(new Object[]{p0.getPath()}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    return str;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, e2, false, null);
            return b;
        } catch (SecurityException e3) {
            this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.core.internal.persistence.file.PlainFileReaderWriter$readData$4
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    String str = String.format(Locale.US, "Unable to read data from file: %s", Arrays.copyOf(new Object[]{p0.getPath()}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    return str;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, e3, false, null);
            return b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // defpackage.ImageCaptureCapabilities
    public boolean b(final File p0, byte[] p1, boolean p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(p0, p2);
            try {
                FileOutputStream fileOutputStream2 = fileOutputStream;
                FileLock fileLockLock = fileOutputStream2.getChannel().lock();
                Intrinsics.checkNotNullExpressionValue(fileLockLock, "");
                try {
                    fileOutputStream2.write(p1);
                    Unit unit = Unit.INSTANCE;
                    fileLockLock.release();
                    Unit unit2 = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileOutputStream, null);
                    return true;
                } catch (Throwable th) {
                    fileLockLock.release();
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(fileOutputStream, th2);
                    throw th3;
                }
            }
        } catch (IOException e2) {
            this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.core.internal.persistence.file.PlainFileReaderWriter$writeData$1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    String str = String.format(Locale.US, "Unable to write data to file: %s", Arrays.copyOf(new Object[]{p0.getPath()}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    return str;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, e2, false, null);
            return false;
        } catch (SecurityException e3) {
            this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.core.internal.persistence.file.PlainFileReaderWriter$writeData$2
                private static final byte[] $$c = {29, 88, -118, 32};
                private static final int $$f = 109;
                private static int $10 = 0;
                private static int $11 = 1;
                private static final byte[] $$d = {107, 48, 57, 107, -4, -20, -6, 6, -26, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
                private static final int $$e = 20;
                private static final byte[] $$a = {64, 73, -26, 82, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
                private static final int $$b = 133;
                private static int $TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                private static int $a = 1;
                private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {47484, 47471, 47481, 47467, 47470, 47476, 47407, 47466, 47434, 47460, 47465, 47480, 47472, 47450, 47473, 47482, 47474, 47469, 47435, 47452, 47463, 47433, 47477, 47464, 47475, 47478, 47445};
                private static int b = 2047719709;
                private static boolean TuitionPaymentFragmentbindingInflater1 = true;
                private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;

                /* JADX WARN: Code duplicated, block: B:10:0x0025  */
                /* JADX WARN: Code duplicated, block: B:8:0x001d  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static void a(byte r7, int r8, short r9, java.lang.Object[] r10) {
                    /*
                        int r8 = 53 - r8
                        byte[] r0 = com.datadog.android.core.internal.persistence.file.PlainFileReaderWriter$writeData$2.$$a
                        int r7 = r7 * 14
                        int r7 = 98 - r7
                        int r9 = r9 * 52
                        int r9 = 56 - r9
                        byte[] r1 = new byte[r8]
                        r2 = 0
                        if (r0 != 0) goto L15
                        r3 = r8
                        r7 = r9
                        r4 = r2
                        goto L2a
                    L15:
                        r3 = r2
                    L16:
                        int r4 = r3 + 1
                        byte r5 = (byte) r7
                        r1[r3] = r5
                        if (r4 != r8) goto L25
                        java.lang.String r7 = new java.lang.String
                        r7.<init>(r1, r2)
                        r10[r2] = r7
                        return
                    L25:
                        r3 = r0[r9]
                        r6 = r9
                        r9 = r7
                        r7 = r6
                    L2a:
                        int r3 = -r3
                        int r9 = r9 + r3
                        int r9 = r9 + (-10)
                        int r7 = r7 + 1
                        r3 = r4
                        r6 = r9
                        r9 = r7
                        r7 = r6
                        goto L16
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.core.internal.persistence.file.PlainFileReaderWriter$writeData$2.a(byte, int, short, java.lang.Object[]):void");
                }

                /* JADX WARN: Code duplicated, block: B:10:0x0024  */
                /* JADX WARN: Code duplicated, block: B:8:0x001c  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002f). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static void d(int r6, int r7, byte r8, java.lang.Object[] r9) {
                    /*
                        int r8 = r8 * 47
                        int r0 = r8 + 6
                        int r6 = r6 * 33
                        int r6 = 117 - r6
                        int r7 = r7 + 4
                        byte[] r1 = com.datadog.android.core.internal.persistence.file.PlainFileReaderWriter$writeData$2.$$d
                        byte[] r0 = new byte[r0]
                        int r8 = r8 + 5
                        r2 = 0
                        if (r1 != 0) goto L16
                        r3 = r7
                        r4 = r2
                        goto L2f
                    L16:
                        r3 = r2
                    L17:
                        byte r4 = (byte) r6
                        r0[r3] = r4
                        if (r3 != r8) goto L24
                        java.lang.String r6 = new java.lang.String
                        r6.<init>(r0, r2)
                        r9[r2] = r6
                        return
                    L24:
                        int r7 = r7 + 1
                        int r3 = r3 + 1
                        r4 = r1[r7]
                        r5 = r7
                        r7 = r6
                        r6 = r4
                        r4 = r3
                        r3 = r5
                    L2f:
                        int r6 = -r6
                        int r7 = r7 + r6
                        int r6 = r7 + (-11)
                        r7 = r3
                        r3 = r4
                        goto L17
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.core.internal.persistence.file.PlainFileReaderWriter$writeData$2.d(int, int, byte, java.lang.Object[]):void");
                }

                @Override // kotlin.jvm.functions.Function0
                public final /* synthetic */ String invoke() throws Throwable {
                    int i = 2 % 2;
                    int i2 = $TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
                    $a = i2 % 128;
                    int i3 = i2 % 2;
                    String strTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1();
                    int i4 = $TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
                    $a = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 21 / 0;
                    }
                    return strTuitionPaymentFragmentbindingInflater1;
                }

                private static void c(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
                    char[] cArr2;
                    int i2 = 2 % 2;
                    getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
                    char[] cArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    if (cArr3 != null) {
                        int length = cArr3.length;
                        char[] cArr4 = new char[length];
                        for (int i3 = 0; i3 < length; i3++) {
                            try {
                                Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    byte b2 = (byte) 0;
                                    byte b3 = b2;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 31339), 2994 - (ViewConfiguration.getEdgeSlop() >> 16), 17 - Color.blue(0), 1182129903, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                                }
                                cArr4[i3] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            } catch (Throwable th4) {
                                Throwable cause = th4.getCause();
                                if (cause == null) {
                                    throw th4;
                                }
                                throw cause;
                            }
                        }
                        cArr3 = cArr4;
                    }
                    Object[] objArr3 = {Integer.valueOf(b)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
                    long j = 0;
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 43325), 253 - Color.green(0), 22 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    if (TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                        int i4 = $11 + 33;
                        $10 = i4 % 128;
                        if (i4 % 2 != 0) {
                            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                            cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                        } else {
                            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                            cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                        }
                        while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                            int i5 = $10 + 15;
                            $11 = i5 % 128;
                            int i6 = i5 % 2;
                            cArr2[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                            Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char c = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 33603);
                                int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 3085;
                                int pressedStateDuration = 26 - (ViewConfiguration.getPressedStateDuration() >> 16);
                                byte b4 = (byte) ($$f & 3);
                                byte b5 = (byte) (b4 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, fadingEdgeLength, pressedStateDuration, -2146875848, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                            j = 0;
                        }
                        objArr[0] = new String(cArr2);
                        return;
                    }
                    if (!TuitionPaymentFragmentbindingInflater1) {
                        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                        char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                        while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                            int i7 = $11 + 39;
                            $10 = i7 % 128;
                            int i8 = i7 % 2;
                            cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                        }
                        objArr[0] = new String(cArr5);
                        return;
                    }
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                    char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        int i9 = $10 + 123;
                        $11 = i9 % 128;
                        if (i9 % 2 == 0) {
                            cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 >>> 1) >>> getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] >> i] % iIntValue);
                            Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 33602);
                                int i10 = 3086 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                int iIndexOf = 25 - TextUtils.indexOf((CharSequence) "", '0', 0);
                                byte b6 = (byte) ($$f & 3);
                                byte b7 = (byte) (b6 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollBarSize, i10, iIndexOf, -2146875848, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                        } else {
                            cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                            Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 33602);
                                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 3085;
                                int jumpTapTimeout = 26 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                                byte b8 = (byte) ($$f & 3);
                                byte b9 = (byte) (b8 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(threadPriority, maximumDrawingCacheSize, jumpTapTimeout, -2146875848, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                        }
                    }
                    objArr[0] = new String(cArr6);
                }

                public final String TuitionPaymentFragmentbindingInflater1() throws Throwable {
                    Object[] objArr;
                    Object[] objArr2;
                    int i = 2 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 31533);
                        int iAxisFromString = MotionEvent.axisFromString("") + 922;
                        int iIndexOf = 28 - TextUtils.indexOf("", "", 0);
                        byte[] bArr = $$a;
                        byte b2 = bArr[80];
                        Object[] objArr3 = new Object[1];
                        a(b2, (byte) (b2 | 52), bArr[7], objArr3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveSizeAndState, iAxisFromString, iIndexOf, -1048449946, false, (String) objArr3[0], null);
                    }
                    long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                    Object[] objArr4 = new Object[1];
                    c(null, null, 127 - ExpandableListView.getPackedPositionType(0L), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr4);
                    Class<?> cls = Class.forName((String) objArr4[0]);
                    Object[] objArr5 = new Object[1];
                    c(null, null, 127 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr5);
                    long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char c = (char) (31534 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                        int longPressTimeout = 921 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        int iAlpha = Color.alpha(0) + 28;
                        byte[] bArr2 = $$a;
                        byte b3 = bArr2[7];
                        Object[] objArr6 = new Object[1];
                        a(b3, bArr2[80], b3, objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, longPressTimeout, iAlpha, -778300370, false, (String) objArr6[0], null);
                    }
                    if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char cMyPid = (char) (31533 - (Process.myPid() >> 22));
                            int iBlue = 921 - Color.blue(0);
                            int i2 = 29 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                            byte[] bArr3 = $$a;
                            Object[] objArr7 = new Object[1];
                            a(bArr3[7], (byte) (-bArr3[33]), bArr3[80], objArr7);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMyPid, iBlue, i2, -1142834547, false, (String) objArr7[0], null);
                        }
                        Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                        objArr = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
                        int iIdentityHashCode = System.identityHashCode(this);
                        int i3 = ((205917375 + (((~((-1470654485) | iIdentityHashCode)) | (-303425160)) * (-948))) + ((~((~iIdentityHashCode) | (-302014469))) * (-948))) - 1225990326;
                        int i4 = (i3 << 13) ^ i3;
                        int i5 = i4 ^ (i4 >>> 17);
                        ((int[]) objArr[0])[0] = i5 ^ (i5 << 5);
                    } else {
                        Object[] objArr9 = new Object[1];
                        c(null, null, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 127, new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr9);
                        Class<?> cls2 = Class.forName((String) objArr9[0]);
                        Object[] objArr10 = new Object[1];
                        c(null, null, 127 - (ViewConfiguration.getScrollBarSize() >> 8), new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr10);
                        Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
                        if (applicationContext != null) {
                            applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                        }
                        Object[] objArr11 = new Object[1];
                        c(null, null, 127 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), new byte[]{-115, -116, -117, -120, -118, -119, -121, -102, -126, -127, -113, -121, -127, -107, -127, -103}, objArr11);
                        Class<?> cls3 = Class.forName((String) objArr11[0]);
                        Object[] objArr12 = new Object[1];
                        c(null, null, (ViewConfiguration.getScrollBarSize() >> 8) + 127, new byte[]{-116, -125, -123, -114, -105, -120, -127, -101, -118, -117, -122, -117, -126, -116, -125, -122}, objArr12);
                        try {
                            Object[] objArr13 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue()), 0, -1456816578};
                            byte[] bArr4 = $$d;
                            byte b4 = bArr4[12];
                            Object[] objArr14 = new Object[1];
                            d(b4, (byte) (-bArr4[10]), b4, objArr14);
                            Class<?> cls4 = Class.forName((String) objArr14[0]);
                            byte b5 = bArr4[10];
                            Object[] objArr15 = new Object[1];
                            d(b5, (byte) (-bArr4[4]), b5, objArr15);
                            objArr = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 31534);
                                int i6 = 921 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                int mirror = 'L' - AndroidCharacter.getMirror('0');
                                byte[] bArr5 = $$a;
                                Object[] objArr16 = new Object[1];
                                a(bArr5[7], (byte) (-bArr5[33]), bArr5[80], objArr16);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf, i6, mirror, -1142834547, false, (String) objArr16[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                            try {
                                Object[] objArr17 = new Object[1];
                                c(null, null, (ViewConfiguration.getEdgeSlop() >> 16) + 127, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr17);
                                Class<?> cls5 = Class.forName((String) objArr17[0]);
                                Object[] objArr18 = new Object[1];
                                c(null, null, 127 - (ViewConfiguration.getPressedStateDuration() >> 16), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr18);
                                long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf = Long.valueOf(jLongValue2);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char c2 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 31532);
                                    int keyRepeatTimeout = 921 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                    int iGreen = Color.green(0) + 28;
                                    byte[] bArr6 = $$a;
                                    byte b6 = bArr6[7];
                                    Object[] objArr19 = new Object[1];
                                    a(b6, bArr6[80], b6, objArr19);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, keyRepeatTimeout, iGreen, -778300370, false, (String) objArr19[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                    char jumpTapTimeout = (char) (31533 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                                    int iIndexOf2 = 920 - TextUtils.indexOf((CharSequence) "", '0');
                                    int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 28;
                                    byte[] bArr7 = $$a;
                                    byte b7 = bArr7[80];
                                    Object[] objArr20 = new Object[1];
                                    a(b7, (byte) (b7 | 52), bArr7[7], objArr20);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(jumpTapTimeout, iIndexOf2, iKeyCodeFromString, -1048449946, false, (String) objArr20[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                            } catch (Exception unused) {
                                throw new RuntimeException();
                            }
                        } catch (Throwable th4) {
                            Throwable cause = th4.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th4;
                        }
                    }
                    int i7 = ((int[]) objArr[1])[0];
                    int i8 = ((int[]) objArr[3])[0];
                    if (i8 == i7) {
                        int i9 = $TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
                        $a = i9 % 128;
                        int i10 = i9 % 2;
                        int i11 = ((int[]) objArr[0])[0];
                        objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                        int iNextInt = new Random().nextInt();
                        int i12 = i11 + 2106421723 + (((~((-1602025594) | iNextInt)) | 171986976) * 576) + (((~((~iNextInt) | (-1430038618))) | 67074) * 576) + 280250368;
                        int i13 = (i12 << 13) ^ i12;
                        int i14 = i13 ^ (i13 >>> 17);
                        ((int[]) objArr2[0])[0] = i14 ^ (i14 << 5);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = (String[]) objArr[4];
                        if (strArr != null) {
                            for (String str : strArr) {
                                arrayList.add(str);
                            }
                        }
                        Toast.makeText((Context) null, i8 / (((i8 - 1) * i8) % 2), 0).show();
                        int i15 = ((int[]) objArr[0])[0];
                        objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                        int iIdentityHashCode2 = System.identityHashCode(this);
                        int i16 = ~iIdentityHashCode2;
                        int i17 = i15 + 2074462013 + (((~(i16 | 1091551381)) | (-1773129368) | (~((-950277) | iIdentityHashCode2))) * 717) + (((~(iIdentityHashCode2 | 1091551381)) | (~(i16 | (-950277))) | (-1773129368)) * 717);
                        int i18 = (i17 << 13) ^ i17;
                        int i19 = i18 ^ (i18 >>> 17);
                        ((int[]) objArr2[0])[0] = i19 ^ (i19 << 5);
                        int i20 = $TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
                        $a = i20 % 128;
                        if (i20 % 2 == 0) {
                            int i21 = 4 % 5;
                        }
                    }
                    Locale locale = Locale.US;
                    String path = p0.getPath();
                    Object[] objArr21 = new Object[1];
                    int i22 = ((int[]) objArr2[0])[0];
                    int i23 = i22 * i22;
                    int i24 = -(1528920933 * i22);
                    int i25 = (((i23 ^ i24) + ((i23 & i24) << 1)) - (~(-(i22 * 1548201813)))) - 1;
                    int i26 = (i25 ^ 2146264009) + ((2146264009 & i25) << 1);
                    int i27 = i26 >> 18;
                    int i28 = ((i27 ^ (-32767)) + ((i27 & (-32767)) << 1)) / 16384;
                    int i29 = (i28 & 1) + (i28 | 1);
                    int i30 = (i26 & i29) + (i29 | i26);
                    int i31 = i26 >> 20;
                    int i32 = (((i31 | (-8191)) << 1) - (i31 ^ (-8191))) / 4096;
                    int i33 = -((((i32 | 1) << 1) - (i32 ^ 1)) ^ i30);
                    int i34 = (i33 & 5) + (i33 | 5);
                    int i35 = i34 >> 26;
                    int i36 = (((i35 & ComposerKt.defaultsKey) + (i35 | ComposerKt.defaultsKey)) / 64) + 1;
                    objArr21[0 / (((-(((i36 | 1) << 1) - (i36 ^ 1))) & i34) * 489)] = path;
                    String str2 = String.format(locale, "Unable to write data to file: %s", Arrays.copyOf(objArr21, 1));
                    Intrinsics.checkNotNullExpressionValue(str2, "");
                    return str2;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
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
                private static java.lang.String $$g(byte r7, byte r8, int r9) {
                    /*
                        int r8 = r8 * 2
                        int r8 = 1 - r8
                        byte[] r0 = com.datadog.android.core.internal.persistence.file.PlainFileReaderWriter$writeData$2.$$c
                        int r7 = 68 - r7
                        int r9 = r9 * 3
                        int r9 = 3 - r9
                        byte[] r1 = new byte[r8]
                        r2 = 0
                        if (r0 != 0) goto L14
                        r3 = r9
                        r4 = r2
                        goto L2a
                    L14:
                        r3 = r2
                    L15:
                        int r9 = r9 + 1
                        int r4 = r3 + 1
                        byte r5 = (byte) r7
                        r1[r3] = r5
                        if (r4 != r8) goto L24
                        java.lang.String r7 = new java.lang.String
                        r7.<init>(r1, r2)
                        return r7
                    L24:
                        r3 = r0[r9]
                        r6 = r9
                        r9 = r7
                        r7 = r3
                        r3 = r6
                    L2a:
                        int r7 = -r7
                        int r7 = r7 + r9
                        r9 = r3
                        r3 = r4
                        goto L15
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.core.internal.persistence.file.PlainFileReaderWriter$writeData$2.$$g(byte, byte, int):java.lang.String");
                }
            }, e3, false, null);
            return false;
        }
    }
}
