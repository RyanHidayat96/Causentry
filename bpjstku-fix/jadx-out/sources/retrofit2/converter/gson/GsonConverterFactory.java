package retrofit2.converter.gson;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.Toast;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Random;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes4.dex */
public final class GsonConverterFactory extends Converter.Factory {
    private final Gson gson;
    private static final byte[] $$c = {94, 6, -99, -107};
    private static final int $$f = 37;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {67, -127, -109, 9, 17, 3, -58, 59, 2, 24, -14, 8, 16, -3, -52, 56, 18, -5, 19, 2, -1, 0, -49, 73, 8, -3, -58, 64, 10, 11, -10, 18, 1, -8, 16, -57, 59, 16, 3, -7, 13, 10, -59, 74, -11, 17, 6, -6, -50, 41, 40, -3, -18, 24, 1, 23, -31, 21, 17, 6, -6, -60, 73, -2, 18, -5, 13, -2, -27, 54, -12, 14, 11, -75, 18};
    private static final int $$e = 105;
    private static final byte[] $$a = {111, 40, 23, -13, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 95;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int g = 1;
    private static char b = 55453;
    private static char TuitionPaymentFragmentbindingInflater1 = 57632;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 35861;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1181;

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 15
            int r5 = 53 - r5
            int r6 = r6 * 2
            int r6 = 84 - r6
            byte[] r0 = retrofit2.converter.gson.GsonConverterFactory.$$a
            int r7 = r7 * 52
            int r7 = r7 + 4
            byte[] r1 = new byte[r5]
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r5
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r5) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L26:
            r4 = r0[r7]
        L28:
            int r4 = -r4
            int r7 = r7 + 1
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.converter.gson.GsonConverterFactory.a(int, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 98
            byte[] r0 = retrofit2.converter.gson.GsonConverterFactory.$$d
            int r8 = r8 + 4
            int r6 = r6 * 71
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r6
            r7 = r8
            r3 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r8 = r8 + 1
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r4 = r0[r8]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r5
        L2a:
            int r8 = r8 + r4
            int r8 = r8 + (-5)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.converter.gson.GsonConverterFactory.d(int, short, int, java.lang.Object[]):void");
    }

    public static GsonConverterFactory create() {
        int i = 2 % 2;
        GsonConverterFactory gsonConverterFactoryCreate = create(new Gson());
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 97 / 0;
        }
        return gsonConverterFactoryCreate;
    }

    public static GsonConverterFactory create(Gson gson) {
        int i = 2 % 2;
        int i2 = g + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (gson == null) {
            throw new NullPointerException("gson == null");
        }
        GsonConverterFactory gsonConverterFactory = new GsonConverterFactory(gson);
        int i3 = g + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            return gsonConverterFactory;
        }
        obj.hashCode();
        throw null;
    }

    private GsonConverterFactory(Gson gson) {
        this.gson = gson;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        int i3 = $11 + 53;
        $10 = i3 % 128;
        while (true) {
            int i4 = i3 % 2;
            int i5 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i6 = 58224;
            int i7 = 0;
            while (i7 < 16) {
                int i8 = $10 + 109;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i5];
                int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 8611973335120459638L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i5] = Integer.valueOf(c);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cGreen = (char) (Color.green(i5) + 47773);
                        int mirror = 516 - AndroidCharacter.getMirror('0');
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', i5) + 14;
                        Class[] clsArr = new Class[4];
                        clsArr[i5] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cGreen, mirror, iIndexOf, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    int i12 = i7;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i5]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) b) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 47772), (-16776748) - Color.rgb(0, 0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7 = i12 + 1;
                    int i13 = $11 + 109;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
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
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b2 = (byte) (-1);
                byte b3 = (byte) (b2 + 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) Color.alpha(0), (ViewConfiguration.getEdgeSlop() >> 16) + 2323, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 43, -1312321721, false, $$g(b2, b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            i3 = $10 + 17;
            $11 = i3 % 128;
        }
    }

    @Override // retrofit2.Converter.Factory
    public final Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) throws Throwable {
        Object[] objArr;
        char c;
        int i = 2 % 2;
        TypeAdapter adapter = this.gson.getAdapter(TypeToken.get(type));
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
            int iMyTid = 2267 - (Process.myTid() >> 22);
            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 33;
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            a(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(longPressTimeout, iMyTid, maximumDrawingCacheSize, -887667012, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{53790, 62099, 59408, 49750, 22592, 39055, 8725, 24886, 58759, 58159, 15772, 14706, 15474, 57244, 713, 22096, 24516, 11833, 16103, 13347, 6927, 29084, 24524, 20633}, (ViewConfiguration.getLongPressTimeout() >> 16) + 22, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{63567, 65285, 59763, 41925, 51422, 54946, 42879, 9782, 38914, 64828, 38945, 10207, 3237, 58823, 21004, 33532, 59508, 36119}, 15 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c2 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 2268;
            int bitsPerPixel = 32 - ImageFormat.getBitsPerPixel(0);
            byte[] bArr = $$a;
            byte b4 = bArr[7];
            Object[] objArr5 = new Object[1];
            a(b4, b4, bArr[5], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, iLastIndexOf, bitsPerPixel, -874156483, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 57;
            g = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                int trimmedLength = TextUtils.getTrimmedLength("") + 2267;
                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 33;
                byte[] bArr2 = $$a;
                Object[] objArr6 = new Object[1];
                a(bArr2[5], bArr2[7], bArr2[40], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(capsMode, trimmedLength, scrollBarFadeDuration, -654680577, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i4 = ((int[]) objArr7[0])[0];
            int i5 = ((int[]) objArr7[3])[0];
            String[] strArr = (String[]) objArr7[1];
            int iNextInt = new Random().nextInt();
            int i6 = ~iNextInt;
            int i7 = ((((-222306085) + (((~(634977110 | i6)) | 167968777) * 184)) + ((iNextInt | 629209682) * (-184))) + ((~((-173736206) | i6)) * 184)) - 1841442507;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[2])[0] = i9 ^ (i9 << 5);
            c = 3;
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{54126, 54138, 26031, 1390, 18696, 363, 10431, 63707, 60833, 5753, 40589, 60292, 29560, 52275, 12774, 362, 2337, 21235, 23863, 27560, 37638, 64114, 47581, 53417, 3008, 8594, 36097, 25561}, 26 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{49681, 48770, 36779, 53630, 60663, 62186, 62476, 65523, 65094, 53176, 9435, 32936, 42039, 19146, 60624, 30436, 6172, 3261, 50168, 63408}, KeyEvent.normalizeMetaState(0) + 18, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = (!((applicationContext instanceof ContextWrapper) ^ true) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{45600, 7548, 30032, 36890, 14661, 37096, 37996, 64195, 37462, 4596, 23095, 6564, 47218, 61081, 24359, 12675, 41775, 62289}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 16, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{56432, 11325, 36584, 16555, 30310, 10125, 44960, 56802, 32447, 37870, 12837, 17127, 37428, 30015, 16262, 33805, 20073, 16932}, 15 - MotionEvent.axisFromString(""), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
            g = i10 % 128;
            int i11 = i10 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -1841442507};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[32];
                Object[] objArr13 = new Object[1];
                d(b5, b5, bArr3[20], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b6 = bArr3[21];
                byte b7 = b6;
                Object[] objArr14 = new Object[1];
                d(b6, b7, (byte) (b7 | 70), objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                        int i12 = 2268 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 33;
                        byte[] bArr4 = $$a;
                        Object[] objArr16 = new Object[1];
                        a(bArr4[5], bArr4[7], bArr4[40], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, i12, tapTimeout, -654680577, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        c(new char[]{53790, 62099, 59408, 49750, 22592, 39055, 8725, 24886, 58759, 58159, 15772, 14706, 15474, 57244, 713, 22096, 24516, 11833, 16103, 13347, 6927, 29084, 24524, 20633}, 21 - TextUtils.lastIndexOf("", '0'), objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        c(new char[]{63567, 65285, 59763, 41925, 51422, 54946, 42879, 9782, 38914, 64828, 38945, 10207, 3237, 58823, 21004, 33532, 59508, 36119}, Drawable.resolveOpacity(0, 0) + 15, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c3 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            int i13 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2266;
                            int iLastIndexOf2 = 32 - TextUtils.lastIndexOf("", '0', 0);
                            byte[] bArr5 = $$a;
                            byte b8 = bArr5[7];
                            Object[] objArr19 = new Object[1];
                            a(b8, b8, bArr5[5], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c3, i13, iLastIndexOf2, -874156483, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                            int iLastIndexOf3 = 2266 - TextUtils.lastIndexOf("", '0');
                            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 33;
                            byte b9 = $$a[7];
                            byte b10 = b9;
                            Object[] objArr20 = new Object[1];
                            a(b9, b10, b10, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(windowTouchSlop, iLastIndexOf3, maximumFlingVelocity, -887667012, false, (String) objArr20[0], null);
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
        int i14 = ((int[]) objArr[c])[0];
        int i15 = ((int[]) objArr[0])[0];
        if (i15 == i14) {
            Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i16 = ((int[]) objArr[2])[0];
            int i17 = ((int[]) objArr[0])[0];
            int i18 = ((int[]) objArr[3])[0];
            String[] strArr2 = (String[]) objArr[1];
            int i19 = ~Process.myUid();
            int i20 = i16 + 1826779242 + (((~((-730497481) | i19)) | (-78215836)) * (-983)) + (((~(i19 | (-78215836))) | 69302803) * 983);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr21[2])[0] = i22 ^ (i22 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[1];
            if (strArr3 != null) {
                int i23 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
                g = i23 % 128;
                int i24 = i23 % 2;
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i15];
            int i25 = i15 - 1;
            iArr[i25] = 1;
            Toast.makeText((Context) null, iArr[((i15 * i25) % 2) - 1], 1).show();
            Object[] objArr22 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i26 = ((int[]) objArr[2])[0];
            int i27 = ((int[]) objArr[0])[0];
            int i28 = ((int[]) objArr[3])[0];
            String[] strArr4 = (String[]) objArr[1];
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i29 = ~iMaxMemory;
            int i30 = i26 + (-1485455085) + ((~(387231061 | i29)) * (-560)) + ((~(iMaxMemory | (-134955531))) * (-560)) + (((~(421482254 | i29)) | 100704337) * 560);
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr22[2])[0] = i32 ^ (i32 << 5);
        }
        return new GsonResponseBodyConverter(this.gson, adapter);
    }

    @Override // retrofit2.Converter.Factory
    public final Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        int i = 2 % 2;
        GsonRequestBodyConverter gsonRequestBodyConverter = new GsonRequestBodyConverter(this.gson, this.gson.getAdapter(TypeToken.get(type)));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
        g = i2 % 128;
        int i3 = i2 % 2;
        return gsonRequestBodyConverter;
    }

    private static String $$g(short s, int i, byte b2) {
        int i2 = (b2 * 4) + 108;
        int i3 = i * 4;
        byte[] bArr = $$c;
        int i4 = s + 4;
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            i2 = (-i2) + i3;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            i4++;
            bArr2[i6] = (byte) i2;
            if (i6 == i3) {
                return new String(bArr2, 0);
            }
            i2 = (-bArr[i4]) + i2;
            i5 = i6;
        }
    }
}
