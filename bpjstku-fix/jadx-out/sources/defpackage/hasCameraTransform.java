package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hasCameraTransform {

    interface TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        ImageHeaderParser.ImageType TuitionPaymentFragmentspecialinlinedviewModeldefault2(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    interface TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        int TuitionPaymentFragmentspecialinlinedviewModeldefault2(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    public static ImageHeaderParser.ImageType TuitionPaymentFragmentspecialinlinedviewModeldefault3(List<ImageHeaderParser> list, final InputStream inputStream, CameraUnavailableException cameraUnavailableException) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, cameraUnavailableException);
        }
        inputStream.mark(5242880);
        return TuitionPaymentFragmentbindingInflater1(list, new TuitionPaymentFragmentspecialinlinedviewModeldefault2() { // from class: hasCameraTransform.5
            @Override // hasCameraTransform.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            public final ImageHeaderParser.ImageType TuitionPaymentFragmentspecialinlinedviewModeldefault2(ImageHeaderParser imageHeaderParser) throws IOException {
                try {
                    return imageHeaderParser.b(inputStream);
                } finally {
                    inputStream.reset();
                }
            }
        });
    }

    /* JADX INFO: renamed from: hasCameraTransform$4, reason: invalid class name */
    public class AnonymousClass4 implements TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        private /* synthetic */ ByteBuffer TuitionPaymentFragmentbindingInflater1;

        public AnonymousClass4(ByteBuffer byteBuffer) {
            this.TuitionPaymentFragmentbindingInflater1 = byteBuffer;
        }

        @Override // hasCameraTransform.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        public final ImageHeaderParser.ImageType TuitionPaymentFragmentspecialinlinedviewModeldefault2(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1);
            } finally {
                setOutputImageRotationEnabled.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1);
            }
        }
    }

    /* JADX INFO: renamed from: hasCameraTransform$3, reason: invalid class name */
    public class AnonymousClass3 implements TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private /* synthetic */ CameraUnavailableException TuitionPaymentFragmentbindingInflater1;
        private /* synthetic */ ParcelFileDescriptorRewinder TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public AnonymousClass3(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, CameraUnavailableException cameraUnavailableException) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = parcelFileDescriptorRewinder;
            this.TuitionPaymentFragmentbindingInflater1 = cameraUnavailableException;
        }

        @Override // hasCameraTransform.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        public final ImageHeaderParser.ImageType TuitionPaymentFragmentspecialinlinedviewModeldefault2(ImageHeaderParser imageHeaderParser) throws Throwable {
            RecyclableBufferedInputStream recyclableBufferedInputStream;
            try {
                recyclableBufferedInputStream = new RecyclableBufferedInputStream(new FileInputStream(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.rewind().getFileDescriptor()), this.TuitionPaymentFragmentbindingInflater1);
                try {
                    ImageHeaderParser.ImageType imageTypeB = imageHeaderParser.b(recyclableBufferedInputStream);
                    recyclableBufferedInputStream.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.rewind();
                    return imageTypeB;
                } catch (Throwable th) {
                    th = th;
                    if (recyclableBufferedInputStream != null) {
                        recyclableBufferedInputStream.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    }
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.rewind();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                recyclableBufferedInputStream = null;
            }
        }

        public static int TuitionPaymentFragmentbindingInflater1() {
            int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i2 = i % 6375728;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i + 1;
            if (i2 != 0) {
                return TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            }
            int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenHeightDp;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
            return i3;
        }
    }

    public static ImageHeaderParser.ImageType TuitionPaymentFragmentbindingInflater1(List<ImageHeaderParser> list, TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType imageTypeTuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(list.get(i));
            if (imageTypeTuitionPaymentFragmentspecialinlinedviewModeldefault2 != ImageHeaderParser.ImageType.UNKNOWN) {
                return imageTypeTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    /* JADX INFO: renamed from: hasCameraTransform$1, reason: invalid class name */
    public class AnonymousClass1 implements TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        private /* synthetic */ CameraUnavailableException TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private /* synthetic */ InputStream b;
        private static final byte[] $$c = {68, 104, -93, -37};
        private static final int $$f = 145;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {68, 104, -93, -37, 8, 25, -24, 29, 8, 22, 13, -4, 15, 15, 3, -20, 37, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55};
        private static final int $$e = 8;
        private static final byte[] $$a = {36, -74, -79, -21, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
        private static final int $$b = 140;
        private static int asInterface = 0;
        private static int d = 1;
        private static char TuitionPaymentFragmentbindingInflater1 = 27236;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 62026;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 17848;
        private static char asBinder = 35217;

        /* JADX WARN: Code duplicated, block: B:10:0x0028  */
        /* JADX WARN: Code duplicated, block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(byte r6, byte r7, int r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = defpackage.hasCameraTransform.AnonymousClass1.$$a
                int r6 = r6 * 52
                int r6 = r6 + 4
                int r1 = 53 - r8
                int r7 = r7 * 14
                int r7 = r7 + 84
                byte[] r1 = new byte[r1]
                int r8 = 52 - r8
                r2 = 0
                if (r0 != 0) goto L17
                r7 = r6
                r4 = r8
                r3 = r2
                goto L2c
            L17:
                r3 = r2
                r5 = r7
                r7 = r6
                r6 = r5
            L1b:
                byte r4 = (byte) r6
                r1[r3] = r4
                if (r3 != r8) goto L28
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L28:
                int r3 = r3 + 1
                r4 = r0[r7]
            L2c:
                int r6 = r6 + r4
                int r6 = r6 + (-10)
                int r7 = r7 + 1
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.hasCameraTransform.AnonymousClass1.a(byte, byte, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0029  */
        /* JADX WARN: Code duplicated, block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void e(short r6, byte r7, byte r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 39
                int r0 = 53 - r8
                int r6 = r6 + 4
                int r7 = r7 * 19
                int r7 = 103 - r7
                byte[] r1 = defpackage.hasCameraTransform.AnonymousClass1.$$d
                byte[] r0 = new byte[r0]
                int r8 = 52 - r8
                r2 = 0
                if (r1 != 0) goto L17
                r7 = r6
                r3 = r8
                r4 = r2
                goto L2f
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r7
                r0[r3] = r4
                int r6 = r6 + 1
                int r4 = r3 + 1
                if (r3 != r8) goto L29
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L29:
                r3 = r1[r6]
                r5 = r7
                r7 = r6
                r6 = r3
                r3 = r5
            L2f:
                int r3 = r3 + r6
                int r6 = r3 + (-10)
                r3 = r4
                r5 = r7
                r7 = r6
                r6 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.hasCameraTransform.AnonymousClass1.e(short, byte, byte, java.lang.Object[]):void");
        }

        private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
            char[] cArr2 = new char[cArr.length - 2];
            oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
            char[] cArr3 = new char[2];
            while (true) {
                char c = 0;
                if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                    break;
                }
                int i3 = $10 + 85;
                $11 = i3 % 128;
                int i4 = 58224;
                char c2 = 1;
                if (i3 % 2 == 0) {
                    cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 1];
                } else {
                    cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                }
                int i5 = 0;
                while (i5 < 16) {
                    char c3 = cArr3[c2];
                    char c4 = cArr3[c];
                    int i6 = (c4 + i4) ^ ((c4 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 8611973335120459638L)));
                    int i7 = c4 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(asBinder);
                        objArr2[2] = Integer.valueOf(i7);
                        objArr2[c2] = Integer.valueOf(i6);
                        objArr2[0] = Integer.valueOf(c3);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char c5 = (char) (47774 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                            int iMyPid = (Process.myPid() >> 22) + 468;
                            int iAxisFromString = 12 - MotionEvent.axisFromString("");
                            Class[] clsArr = new Class[4];
                            clsArr[0] = Integer.TYPE;
                            clsArr[c2] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c5, iMyPid, iAxisFromString, -2007001706, false, "o", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        cArr3[c2] = cCharValue;
                        Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 47773), (ViewConfiguration.getLongPressTimeout() >> 16) + 468, Color.red(0) + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        i4 -= 40503;
                        i5++;
                        c = 0;
                        c2 = 1;
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
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2323, Color.green(0) + 44, -1312321721, false, $$g(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr2, 0, i);
            int i8 = $10 + 115;
            $11 = i8 % 128;
            if (i8 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        AnonymousClass1(InputStream inputStream, CameraUnavailableException cameraUnavailableException) {
            this.b = inputStream;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cameraUnavailableException;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x021d  */
        /* JADX WARN: Code duplicated, block: B:27:0x021f  */
        @Override // hasCameraTransform.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final int TuitionPaymentFragmentspecialinlinedviewModeldefault2(ImageHeaderParser imageHeaderParser) throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            int i2 = asInterface + 113;
            d = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char c = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 31533);
                int i4 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 922;
                int iMyPid = 28 - (Process.myPid() >> 22);
                byte[] bArr = $$a;
                Object[] objArr2 = new Object[1];
                a(bArr[80], bArr[37], (byte) 52, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i4, iMyPid, -1048449946, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(new char[]{42161, 29818, 2654, 35282, 25919, 51770, 22909, 33870, 10433, 40485, 12926, 63459, 26196, 58341, 28339, 7191, 57086, 24810, 21496, 17781, 5579, 29315, 657, 57423}, 22 - TextUtils.getOffsetBefore("", 0), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(new char[]{41778, 2302, 57532, 854, 8256, 40458, 11847, 14955, 33000, 28112, 30476, 22729, 41340, 8632, 30058, 16264, 24139, 52249}, TextUtils.indexOf("", "") + 15, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char pressedStateDuration = (char) (31533 - (ViewConfiguration.getPressedStateDuration() >> 16));
                int i5 = 922 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                int iAlpha = Color.alpha(0) + 28;
                byte b = $$a[80];
                byte b2 = b;
                Object[] objArr5 = new Object[1];
                a(b, b2, b2, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(pressedStateDuration, i5, iAlpha, -778300370, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char capsMode = (char) (31533 - TextUtils.getCapsMode("", 0, 0));
                    int maximumFlingVelocity = 921 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int maximumFlingVelocity2 = 28 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    byte[] bArr2 = $$a;
                    Object[] objArr6 = new Object[1];
                    a(bArr2[37], bArr2[80], bArr2[33], objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(capsMode, maximumFlingVelocity, maximumFlingVelocity2, -1142834547, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i6 = ((808541329 + (((~((~iIdentityHashCode) | (-1762477383))) | 65860) * 446)) + (((~(iIdentityHashCode | (-1762411523))) | 11536401) * 446)) - 382213738;
                int i7 = (i6 << 13) ^ i6;
                int i8 = i7 ^ (i7 >>> 17);
                ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                c(new char[]{44770, 12641, 28722, 29812, 17307, 19287, 33451, 21132, 54649, 3578, 56108, 11174, 20468, 29213, 59250, 47861, 38675, 39210, 35522, 52526, 9329, 53265, 61906, 5132, 28602, 41767, 35400, 16468}, 26 - Color.green(0), objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(new char[]{54338, 14506, 55214, 30606, 13550, 6796, 29219, 3100, 59096, 7164, 53265, 3211, 23215, 45309, 36616, 21066, 40564, 34974, 45185, 5776}, 17 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    if (applicationContext instanceof ContextWrapper) {
                        int i9 = asInterface + 97;
                        d = i9 % 128;
                        if (i9 % 2 == 0) {
                            int i10 = 51 / 0;
                            if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                                applicationContext = applicationContext.getApplicationContext();
                                int i11 = d + 29;
                                asInterface = i11 % 128;
                                int i12 = i11 % 2;
                            } else {
                                applicationContext = null;
                            }
                        } else if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = applicationContext.getApplicationContext();
                            int i13 = d + 29;
                            asInterface = i13 % 128;
                            int i14 = i13 % 2;
                        } else {
                            applicationContext = null;
                        }
                    } else {
                        applicationContext = applicationContext.getApplicationContext();
                        int i15 = d + 29;
                        asInterface = i15 % 128;
                        int i16 = i15 % 2;
                    }
                }
                Object[] objArr10 = new Object[1];
                c(new char[]{59179, 35358, 17215, 49743, 37825, 42085, 50177, 50622, 2327, 59303, 56007, 33246, 30122, 40289, 29013, 10930, 22048, 64753}, (ViewConfiguration.getTouchSlop() >> 8) + 16, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                c(new char[]{14523, 15865, 13896, 45294, 64711, 840, 16052, 49575, 14904, 56673, 26214, 16522, 18882, 35197, 2881, 61294, 65369, 13845}, ExpandableListView.getPackedPositionGroup(0L) + 16, objArr11);
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -411587298};
                    byte[] bArr3 = $$d;
                    byte b3 = bArr3[20];
                    Object[] objArr13 = new Object[1];
                    e(b3, (byte) (b3 + 1), bArr3[50], objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b4 = (byte) ($$e + 4);
                    byte b5 = bArr3[50];
                    Object[] objArr14 = new Object[1];
                    e(b4, b5, (byte) (b5 - 1), objArr14);
                    Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 31534);
                        int i17 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 920;
                        int iGreen = Color.green(0) + 28;
                        byte[] bArr4 = $$a;
                        Object[] objArr16 = new Object[1];
                        a(bArr4[37], bArr4[80], bArr4[33], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf, i17, iGreen, -1142834547, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        c(new char[]{42161, 29818, 2654, 35282, 25919, 51770, 22909, 33870, 10433, 40485, 12926, 63459, 26196, 58341, 28339, 7191, 57086, 24810, 21496, 17781, 5579, 29315, 657, 57423}, 22 - View.MeasureSpec.getSize(0), objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        c(new char[]{41778, 2302, 57532, 854, 8256, 40458, 11847, 14955, 33000, 28112, 30476, 22729, 41340, 8632, 30058, 16264, 24139, 52249}, 15 - TextUtils.indexOf("", "", 0), objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cResolveSizeAndState = (char) (31533 - View.resolveSizeAndState(0, 0, 0));
                            int capsMode2 = 921 - TextUtils.getCapsMode("", 0, 0);
                            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 28;
                            byte b6 = $$a[80];
                            byte b7 = b6;
                            Object[] objArr19 = new Object[1];
                            a(b6, b7, b7, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveSizeAndState, capsMode2, iNormalizeMetaState, -778300370, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c2 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 31532);
                            int capsMode3 = TextUtils.getCapsMode("", 0, 0) + 921;
                            int edgeSlop = 28 - (ViewConfiguration.getEdgeSlop() >> 16);
                            byte[] bArr5 = $$a;
                            Object[] objArr20 = new Object[1];
                            a(bArr5[80], bArr5[37], (byte) 52, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, capsMode3, edgeSlop, -1048449946, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        objArr = objArr15;
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            int i18 = ((int[]) objArr[1])[0];
            int i19 = ((int[]) objArr[3])[0];
            if (i19 == i18) {
                int i20 = ((int[]) objArr[0])[0];
                Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                int i21 = (int) Runtime.getRuntime().totalMemory();
                int i22 = i20 + 1292526571 + (((~((-167923393) | (~i21))) | (~(1606156251 | i21))) * (-272)) + (((~((-254541777) | i21)) | 86618384) * (-272)) + (((~(i21 | 254541776)) | 1519537867) * 272);
                int i23 = (i22 << 13) ^ i22;
                int i24 = i23 ^ (i23 >>> 17);
                ((int[]) objArr21[0])[0] = i24 ^ (i24 << 5);
                int i25 = asInterface + 25;
                d = i25 % 128;
                int i26 = i25 % 2;
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[4];
                if (strArr != null) {
                    for (String str : strArr) {
                        arrayList.add(str);
                    }
                }
                Toast.makeText((Context) null, i19 / (((i19 - 1) * i19) % 2), 0).show();
                int i27 = ((int[]) objArr[0])[0];
                Object[] objArr22 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i28 = i27 + (-2085630710) + (((-3769601) | iIdentityHashCode2) * (-381)) + (((~((~iIdentityHashCode2) | 1468164347)) | (-1169788252)) * 381) + 1436217600;
                int i29 = (i28 << 13) ^ i28;
                int i30 = i29 ^ (i29 >>> 17);
                ((int[]) objArr22[0])[0] = i30 ^ (i30 << 5);
            }
            try {
                return imageHeaderParser.TuitionPaymentFragmentbindingInflater1(this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            } finally {
                this.b.reset();
            }
        }

        public static /* synthetic */ void b() {
            int i = 2 % 2;
            int i2 = d + 47;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                HandlerScheduledExecutorServiceHandlerScheduledFuture.b[1] = Class.forName("setMessage").getDeclaredField("TuitionPaymentFragmentbindingInflater1");
            } else {
                HandlerScheduledExecutorServiceHandlerScheduledFuture.b[0] = Class.forName("setMessage").getDeclaredField("TuitionPaymentFragmentbindingInflater1");
            }
            int i3 = d + 33;
            asInterface = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 15 / 0;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(int r6, byte r7, int r8) {
            /*
                int r7 = r7 * 4
                int r7 = r7 + 108
                int r6 = r6 * 3
                int r6 = 1 - r6
                byte[] r0 = defpackage.hasCameraTransform.AnonymousClass1.$$c
                int r8 = r8 * 4
                int r8 = r8 + 4
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r7
                r4 = r2
                r7 = r6
                goto L27
            L17:
                r3 = r2
            L18:
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r1[r3] = r5
                if (r4 != r6) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L25:
                r3 = r0[r8]
            L27:
                int r8 = r8 + 1
                int r7 = r7 + r3
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.hasCameraTransform.AnonymousClass1.$$g(int, byte, int):java.lang.String");
        }
    }

    public static int TuitionPaymentFragmentbindingInflater1(List<ImageHeaderParser> list, InputStream inputStream, CameraUnavailableException cameraUnavailableException) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, cameraUnavailableException);
        }
        inputStream.mark(5242880);
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(list, new AnonymousClass1(inputStream, cameraUnavailableException));
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3(List<ImageHeaderParser> list, TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(list.get(i));
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 != -1) {
                return iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            }
        }
        return -1;
    }
}
